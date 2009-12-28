package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.refactoring.RefactoringViewAction;
import jetbrains.mps.refactoring.RefactoringViewItem;
import jetbrains.mps.refactoring.RefactoringView;

public class InlineMethodDialogModel {
  private boolean myForAll;
  private SearchResults<SNode> myResults;
  private SNode myMethod;
  private MethodCallAdapter myCall;
  private boolean myIsContainsSelfCalls;
  private boolean myIsPreview;
  private IOperationContext myOperationCotext;

  public InlineMethodDialogModel(final SNode node, IOperationContext operationContext) {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration")) {
          InlineMethodDialogModel.this.myMethod = SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration");
        } else {
          InlineMethodDialogModel.this.myCall = new MethodCallAdapter(node);
          InlineMethodDialogModel.this.myMethod = InlineMethodDialogModel.this.myCall.getMethodDeclaration();
        }
      }
    });
    this.myOperationCotext = operationContext;
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        InlineMethodDialogModel.this.myIsContainsSelfCalls = InlineMethodRefactoringAnalyzer.isContainsSelfCalls(InlineMethodDialogModel.this.myMethod);
      }
    });
  }

  private void findUssages() {
    if (this.myForAll) {
      ProgressManager.getInstance().run(new Task.Modal(InlineMethodDialogModel.this.myOperationCotext.getProject(), "Searching for ussages", true) {
        public void run(@NotNull final ProgressIndicator indiactor) {
          ModelAccess.instance().runReadAction(new Runnable() {
            public void run() {
              InlineMethodDialogModel.this.myResults = MethodRefactoringUtils.findMethodUsages(InlineMethodDialogModel.this.myMethod, indiactor);
            }
          });
        }
      });
    }
  }

  /*package*/ void onOk() {
    String problems = this.findProblems();
    if (problems.length() > 0) {
      this.myIsPreview = false;
      ProblemsDialog dialog = new ProblemsDialog(this.myOperationCotext.getMainFrame(), problems, this);
      dialog.showDialog();
    } else {
      this.doRefactoring();
    }
  }

  private void doRefactoring() {
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        if (InlineMethodDialogModel.this.myForAll) {
          for (SearchResult<SNode> res : ListSequence.fromList(InlineMethodDialogModel.this.myResults.getSearchResults())) {
            InlineMethodRefactoring ref = new InlineMethodRefactoring(res.getObject());
            ref.doRefactor();
          }
          SNodeOperations.deleteNode(InlineMethodDialogModel.this.myMethod);
        } else {
          InlineMethodRefactoring ref = new InlineMethodRefactoring(InlineMethodDialogModel.this.myCall.getNode());
          ref.doRefactor();
        }
      }
    });
  }

  /*package*/ void preview() {
    String problems = this.findProblems();
    if (problems.length() > 0) {
      this.myIsPreview = true;
      ProblemsDialog dialog = new ProblemsDialog(this.myOperationCotext.getMainFrame(), problems, this);
      dialog.showDialog();
    } else {
      this.doPreview();
    }
  }

  /*package*/ void setForAll(boolean forAll) {
    this.myForAll = forAll;
  }

  /*package*/ boolean isForAll() {
    return this.myForAll;
  }

  /*package*/ boolean isRecusive() {
    return this.myIsContainsSelfCalls;
  }

  private String findProblems() {
    this.findUssages();
    InlineMethodRefactoringAnalyzer analyzer;
    if (this.myCall == null) {
      analyzer = new InlineMethodRefactoringAnalyzer(this.myOperationCotext, null, this.myMethod);
    } else {
      analyzer = new InlineMethodRefactoringAnalyzer(this.myOperationCotext, this.myCall.getNode(), this.myMethod);
    }
    return analyzer.findProblems(this.myForAll, this.myResults);
  }

  /*package*/ void ignore() {
    if (this.myIsPreview) {
      this.doPreview();
    } else {
      this.doRefactoring();
    }
  }

  public SNode getMethodDeclaration() {
    return this.myMethod;
  }

  public MethodCallAdapter getMethodCall() {
    return this.myCall;
  }

  /*package*/ void doPreview() {
    RefactoringViewAction refactoringViewAction = new RefactoringViewAction() {
      public void performAction(RefactoringViewItem p0) {
        p0.close();
        InlineMethodDialogModel.this.doRefactoring();
      }
    };
    this.myOperationCotext.getComponent(RefactoringView.class).showRefactoringView(null, refactoringViewAction, this.myResults, false);
  }
}

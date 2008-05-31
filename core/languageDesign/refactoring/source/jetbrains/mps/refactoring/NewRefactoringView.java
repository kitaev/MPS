package jetbrains.mps.refactoring;

import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.ide.findusages.findalgorithm.finders.specific.ConstantFinder;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.ide.findusages.view.UsagesView;
import jetbrains.mps.ide.findusages.view.UsagesView.ButtonConfiguration;
import jetbrains.mps.ide.findusages.view.treeholder.treeview.ViewOptions;
import jetbrains.mps.ide.projectPane.Icons;
import jetbrains.mps.ide.toolsPane.DefaultTool;
import jetbrains.mps.ide.toolsPane.ToolsPane;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.RefactoringProcessor;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 21.01.2008
 * Time: 17:30:43
 * To change this template use File | Settings | File Templates.
 */
public class NewRefactoringView extends DefaultTool {
  private static Map<MPSProject, NewRefactoringView> ourRefactoringViews = new WeakHashMap<MPSProject, NewRefactoringView>();
  private static final Logger LOG = Logger.getLogger(NewRefactoringView.class);

  private String myName;
  private RefactoringContext myRefactoringContext;
  private ActionContext myActionContext;
  private SearchResults mySearchResults;
  private UsagesView myUsagesView;
  private JPanel myPanel;
  private JPanel myButtonsPanel;
  private MPSProject myProject;
  private JButton myDoRefactorButton;
  private JButton myCancelButton;


  public static void showRefactoringView(@NotNull ActionContext actionContext,
                                         @NotNull RefactoringContext refactoringContext) {
    NewRefactoringView refactoringView = new NewRefactoringView(actionContext, refactoringContext);
    ourRefactoringViews.put(actionContext.get(MPSProject.class), refactoringView);
    actionContext.get(ToolsPane.class).add(refactoringView, false);
    actionContext.get(ToolsPane.class).selectTool(refactoringView);
  }

  private static void closeRefactoringView(MPSProject project) {
    NewRefactoringView refactoringView = ourRefactoringViews.get(project);
    if (refactoringView != null) {
      project.getComponentSafe(ToolsPane.class).removeTool(refactoringView);
      ourRefactoringViews.remove(project);
    }
  }

  public NewRefactoringView(@NotNull ActionContext actionContext,
                            @NotNull RefactoringContext refactoringContext) {
    mySearchResults = refactoringContext.getUsages();
    if (mySearchResults == null) {
      throw new IllegalArgumentException("search result is null");
    }
    myActionContext = actionContext;
    myRefactoringContext = refactoringContext;
    myProject = actionContext.get(MPSProject.class);
    myName = myRefactoringContext.getRefactoring().getUserFriendlyName();

    myPanel = new JPanel(new BorderLayout());
    myUsagesView = new UsagesView(actionContext.get(MPSProject.class), new ViewOptions()) {
      public void close() {
        cancel();
      }

      public String getCaption() {
        return "";
      }

      public Icon getIcon() {
        return null;
      }

      public void read(Element element, MPSProject project) {
      }

      public void write(Element element, MPSProject project) {
      }
    };
    myButtonsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    myDoRefactorButton = new JButton(new AbstractAction("Do Refactor") {
      public void actionPerformed(ActionEvent e) {
        doRefactor();
      }
    });
    myCancelButton = new JButton(new AbstractAction("Cancel") {
      public void actionPerformed(ActionEvent e) {
        cancel();
      }
    });
    myButtonsPanel.add(myDoRefactorButton);
    myButtonsPanel.add(myCancelButton);

    myPanel.add(myUsagesView.getComponent(), BorderLayout.CENTER);
    myPanel.add(myButtonsPanel, BorderLayout.SOUTH);

    initUsagesView();
  }

  private void initUsagesView() {
    Thread thread = new Thread() {
      public void run() {
        ModelAccess.instance().runReadAction(new Runnable() {
          public void run() {
            myUsagesView.setRunOptions(FindUtils.makeProvider(new ConstantFinder(mySearchResults.getSearchResults())),
              null,
              new ButtonConfiguration(false, false, true),
              mySearchResults);
          }
        });
      }
    };
    thread.start();
  }

  public String getName() {
    return myName;
  }

  public Icon getIcon() {
    return Icons.DEFAULT_ICON;
  }

  private void cancel() {
    closeRefactoringView(myProject);
  }

  private void doRefactor() {
    new Thread() {
      public void run() {
        ModelAccess.instance().runWriteActionInCommand(new Runnable() {
              public void run() {
                new RefactoringProcessor().doExecuteInThread(myActionContext, myRefactoringContext);
                closeRefactoringView(myProject);
              }
            });
      }
    }.start();

  }

  public JComponent getComponent() {
    return myPanel;
  }
}

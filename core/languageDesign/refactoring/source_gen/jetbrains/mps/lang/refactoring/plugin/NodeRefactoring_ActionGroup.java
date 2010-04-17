package jetbrains.mps.lang.refactoring.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.refactoring.framework.IRefactoring;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.refactoring.framework.RefactoringUtil;
import jetbrains.mps.refactoring.framework.OldRefactoringAdapter;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.refactoring.framework.IRefactoringTarget;
import jetbrains.mps.ide.actions.NodeActions_ActionGroup;
import jetbrains.mps.ide.actions.EditorPopup_ActionGroup;

public class NodeRefactoring_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(NodeRefactoring_ActionGroup.class);
  public static final String ID = "jetbrains.mps.lang.refactoring.plugin.NodeRefactoring";

  public NodeRefactoring_ActionGroup() {
    super("Refactoring", ID);
    this.setIsInternal(false);
    this.setPopup(true);
    try {
outer:
      for (IRefactoring refactoring : ListSequence.fromList(RefactoringUtil.getAllRefactorings())) {
        // @hack 
        if (refactoring instanceof OldRefactoringAdapter) {
          List<String> old = ListSequence.fromListAndArray(new ArrayList<String>(), "jetbrains.mps.lang.core.scripts.Rename", "jetbrains.mps.lang.structure.scripts.RenameConcept", "jetbrains.mps.lang.structure.scripts.RenameLink", "jetbrains.mps.lang.structure.scripts.RenameProperty", "jetbrains.mps.lang.core.scripts.MoveNodes", "jetbrains.mps.lang.structure.scripts.MoveConcepts", "jetbrains.mps.lang.structure.scripts.MoveLinkUp", "jetbrains.mps.lang.structure.scripts.MovePropertyUp");
          for (String name : ListSequence.fromList(old)) {
            if (((OldRefactoringAdapter) refactoring).getRefactoringClassName().equals(name)) {
              continue outer;
            }
          }
        }
        if (refactoring.getRefactoringTarget().getTarget() == IRefactoringTarget.TargetType.NODE) {
          NodeRefactoring_ActionGroup.this.add(RefactoringHelper.getActionForRefactoring(refactoring));
        }
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    this.insertGroupIntoAnother(NodeActions_ActionGroup.ID, null);
    this.insertGroupIntoAnother(EditorPopup_ActionGroup.ID, null);
  }
}

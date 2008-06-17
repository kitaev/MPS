package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.CurrentProjectGroup;
import jetbrains.mps.logging.Logger;
import com.intellij.openapi.project.Project;
import jetbrains.mps.ide.actions.tools.RemoveTransientModulesAction;
import jetbrains.mps.ide.actions.tools.DumpKeyStrokes;
import jetbrains.mps.ide.actions.tools.InternalRefactoringAction;
import jetbrains.mps.workbench.action.ActionUtils;
import com.intellij.openapi.actionSystem.Constraints;
import com.intellij.openapi.actionSystem.Anchor;

public class ToolsInternal_ActionGroup extends CurrentProjectGroup {
  public static Logger LOG = Logger.getLogger(ToolsInternal_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.Internal";

  public ToolsInternal_ActionGroup(Project project) {
    super("Internal", ID, true, true, null, project);
    this.setPopup(false);
    try {
      this.add(new RemoveTransientModulesAction());
      this.addSeparator();
      this.add(new DumpKeyStrokes());
      this.addSeparator();
      this.add(new InternalRefactoringAction());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    ActionUtils.getGroup(Tools_ActionGroup.ID).add(this, new Constraints(Anchor.AFTER, Tools_ActionGroup.INTERNAL_LABEL_ID_Internal));
  }

}

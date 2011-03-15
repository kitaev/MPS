package jetbrains.mps.vcs.annotation;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;

/*package*/ class ShowAdditionalInfoAction extends BaseAction {
  private AnnotationColumn myAnnotationColumn;

  public ShowAdditionalInfoAction(AnnotationColumn annotationColumn) {
    myAnnotationColumn = annotationColumn;
  }

  protected void doUpdate(AnActionEvent event, Map<String, Object> _params) {
    event.getPresentation().setText(((myAnnotationColumn.isShowAdditionalInfo() ?
      "Hide" :
      "Show"
    )) + " Additional Info");
  }

  protected void doExecute(AnActionEvent event, Map<String, Object> map) {
    myAnnotationColumn.setShowAdditionalInfo(!(myAnnotationColumn.isShowAdditionalInfo()));
  }
}

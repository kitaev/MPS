package jetbrains.mps.baseLanguage.dates.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import jetbrains.mps.smodel.SModel;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class ConvertDateTimeOperations_Action extends GeneratedAction {
  private static final Logger LOG = Logger.getLogger(ConvertDateTimeOperations_Action.class);
  private static final Icon ICON = null;

  private SModel model;

  public ConvertDateTimeOperations_Action() {
    super("Convert Date Time Operations", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ConvertDateTimeOperations", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    if (event.getData(MPSDataKeys.MODEL) == null) {
      return false;
    }
    this.model = event.getData(MPSDataKeys.MODEL).getSModel();
    if (this.model == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      List<SNode> minusPeriodOperations = SModelOperations.getNodes(ConvertDateTimeOperations_Action.this.model, "jetbrains.mps.baseLanguage.dates.structure.DateTimeMinusPeriodOperation");
      for(SNode operation : minusPeriodOperations) {
        SNode minusExpression = SNodeOperations.replaceWithNewChild(operation, "jetbrains.mps.baseLanguage.structure.MinusExpression");
        SLinkOperations.setTarget(minusExpression, "leftExpression", SLinkOperations.getTarget(operation, "leftValue", true), true);
        SLinkOperations.setTarget(minusExpression, "rightExpression", SLinkOperations.getTarget(operation, "rightValue", true), true);
      }
      List<SNode> plusPeriodOperations = SModelOperations.getNodes(ConvertDateTimeOperations_Action.this.model, "jetbrains.mps.baseLanguage.dates.structure.DateTimePlusPeriodOperation");
      for(SNode operation : plusPeriodOperations) {
        SNode plusExpression = SNodeOperations.replaceWithNewChild(operation, "jetbrains.mps.baseLanguage.structure.PlusExpression");
        SLinkOperations.setTarget(plusExpression, "leftExpression", SLinkOperations.getTarget(operation, "leftValue", true), true);
        SLinkOperations.setTarget(plusExpression, "rightExpression", SLinkOperations.getTarget(operation, "rightValue", true), true);
      }
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ConvertDateTimeOperations", t);
    }
  }

}

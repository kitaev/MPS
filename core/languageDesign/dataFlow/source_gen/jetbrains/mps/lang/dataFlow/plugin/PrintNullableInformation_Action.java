package jetbrains.mps.lang.dataFlow.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.lang.dataFlow.framework.Program;
import jetbrains.mps.lang.dataFlow.DataFlowManager;
import jetbrains.mps.lang.dataFlow.framework.AnalysisResult;
import java.util.Map;
import jetbrains.mps.dataFlow.runtime.NullableVariableState;
import jetbrains.mps.dataFlow.runtime.NullableAnalyzer;
import jetbrains.mps.lang.dataFlow.framework.instructions.Instruction;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.MapSequence;

public class PrintNullableInformation_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(PrintNullableInformation_Action.class);

  private SNode node;

  public PrintNullableInformation_Action() {
    super("Print Nullable Alalysis Result", "", ICON);
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
      LOG.error("User's action doUpdate method failed. Action:" + "PrintNullableInformation", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    {
      SNode node = event.getData(MPSDataKeys.SNODE);
      if (node != null) {
      }
      this.node = node;
    }
    if (this.node == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      Program program = DataFlowManager.getInstance().buildProgramFor(PrintNullableInformation_Action.this.node);
      AnalysisResult<Map<SNode, NullableVariableState>> result = program.analyze(new NullableAnalyzer<SNode>());
      for(Instruction instruction : ListSequence.fromList(program.getInstructions())) {
        System.out.println(instruction.toString());
        for(SNode key : Sequence.fromIterable(MapSequence.fromMap(result.get(instruction)).keySet())) {
          System.out.println("\t" + key + " -> " + result.get(instruction).get(key));
        }
      }
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "PrintNullableInformation", t);
    }
  }

}

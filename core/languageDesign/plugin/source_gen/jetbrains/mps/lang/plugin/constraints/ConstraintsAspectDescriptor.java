package jetbrains.mps.lang.plugin.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;

public class ConstraintsAspectDescriptor implements jetbrains.mps.smodel.runtime.ConstraintsAspectDescriptor {
  private static String[] stringSwitchCases_2qnle6_a0a0a = new String[]{"jetbrains.mps.lang.plugin.structure.AbstractCheckConfigBlock", "jetbrains.mps.lang.plugin.structure.ActionConstructionParameterDeclaration", "jetbrains.mps.lang.plugin.structure.ActionDataParameterDeclaration", "jetbrains.mps.lang.plugin.structure.ActionDeclaration", "jetbrains.mps.lang.plugin.structure.ActionGroupDeclaration", "jetbrains.mps.lang.plugin.structure.ActionInstance", "jetbrains.mps.lang.plugin.structure.ActionParameterDeclaration", "jetbrains.mps.lang.plugin.structure.ActionParameterReference", "jetbrains.mps.lang.plugin.structure.AddElementStatement", "jetbrains.mps.lang.plugin.structure.AddStatement", "jetbrains.mps.lang.plugin.structure.AskStatement", "jetbrains.mps.lang.plugin.structure.BaseProjectOperation", "jetbrains.mps.lang.plugin.structure.ComponentReference", "jetbrains.mps.lang.plugin.structure.CreateRunConfigStatement", "jetbrains.mps.lang.plugin.structure.ExecuteParameterQuery", "jetbrains.mps.lang.plugin.structure.ExecuteSpecific", "jetbrains.mps.lang.plugin.structure.GroupAnchor", "jetbrains.mps.lang.plugin.structure.InterfaceExtentionPoint", "jetbrains.mps.lang.plugin.structure.ModificationStatement", "jetbrains.mps.lang.plugin.structure.ProjectOperation", "jetbrains.mps.lang.plugin.structure.PropertyRefExpression", "jetbrains.mps.lang.plugin.structure.ReportErrorStatement", "jetbrains.mps.lang.plugin.structure.RunConfigMainNodeStatement", "jetbrains.mps.lang.plugin.structure.RunConfigParameterReferenceOperation", "jetbrains.mps.lang.plugin.structure.RunConfigPropertyInstance", "jetbrains.mps.lang.plugin.structure.Separator", "jetbrains.mps.lang.plugin.structure.ShortcutChange", "jetbrains.mps.lang.plugin.structure.SmartDisposeClosureParameterDeclaration", "jetbrains.mps.lang.plugin.structure.TabbedToolOperation", "jetbrains.mps.lang.plugin.structure.ToolInstanceExpression", "jetbrains.mps.lang.plugin.structure.UpdateBlock", "jetbrains.mps.lang.plugin.structure.VariableNodeExpression"};

  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0a, fqName)) {
      case 3:
        return new ActionDeclaration_Constraints();
      case 18:
        return new ModificationStatement_Constraints();
      case 8:
        return new AddElementStatement_Constraints();
      case 29:
        return new ToolInstanceExpression_Constraints();
      case 19:
        return new ProjectOperation_Constraints();
      case 16:
        return new GroupAnchor_Constraints();
      case 25:
        return new Separator_Constraints();
      case 4:
        return new ActionGroupDeclaration_Constraints();
      case 17:
        return new InterfaceExtentionPoint_Constraints();
      case 2:
        return new ActionDataParameterDeclaration_Constraints();
      case 6:
        return new ActionParameterDeclaration_Constraints();
      case 9:
        return new AddStatement_Constraints();
      case 26:
        return new ShortcutChange_Constraints();
      case 15:
        return new ExecuteSpecific_Constraints();
      case 21:
        return new ReportErrorStatement_Constraints();
      case 12:
        return new ComponentReference_Constraints();
      case 20:
        return new PropertyRefExpression_Constraints();
      case 24:
        return new RunConfigPropertyInstance_Constraints();
      case 22:
        return new RunConfigMainNodeStatement_Constraints();
      case 13:
        return new CreateRunConfigStatement_Constraints();
      case 30:
        return new UpdateBlock_Constraints();
      case 28:
        return new TabbedToolOperation_Constraints();
      case 27:
        return new SmartDisposeClosureParameterDeclaration_Constraints();
      case 10:
        return new AskStatement_Constraints();
      case 31:
        return new VariableNodeExpression_Constraints();
      case 23:
        return new RunConfigParameterReferenceOperation_Constraints();
      case 14:
        return new ExecuteParameterQuery_Constraints();
      case 11:
        return new BaseProjectOperation_Constraints();
      case 0:
        return new AbstractCheckConfigBlock_Constraints();
      case 7:
        return new ActionParameterReference_Constraints();
      case 5:
        return new ActionInstance_Constraints();
      case 1:
        return new ActionConstructionParameterDeclaration_Constraints();
      default:
        // todo: illegal in some cases? 
        return new BaseConstraintsDescriptor(fqName);
    }
  }
}

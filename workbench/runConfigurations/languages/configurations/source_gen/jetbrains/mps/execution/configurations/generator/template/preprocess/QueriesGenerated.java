package jetbrains.mps.execution.configurations.generator.template.preprocess;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.MappingScriptContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.execution.configurations.behavior.RunConfigurationExecutor_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.execution.commands.behavior.CommandDeclaration_Behavior;
import jetbrains.mps.execution.commands.behavior.ExecuteCommandPart_Behavior;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class QueriesGenerated {
  public static void mappingScript_CodeBlock_5916922432461069146(final IOperationContext operationContext, final MappingScriptContext _context) {
    for (SNode executor : ListSequence.fromList(SModelOperations.getRoots(_context.getModel(), "jetbrains.mps.execution.configurations.structure.RunConfigurationExecutor")).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return RunConfigurationExecutor_Behavior.call_isSimple_6226796386650421097(it) && RunConfigurationExecutor_Behavior.call_isDebuggable_442015021861764808(it);
      }
    })) {
      for (SNode builder : ListSequence.fromList(SNodeOperations.getDescendants(SLinkOperations.getTarget(executor, "execute", true), "jetbrains.mps.execution.commands.structure.CommandBuilderExpression", false, new String[]{})).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode commandBuilder) {
          return (ListSequence.fromList(SLinkOperations.getTargets(commandBuilder, "argument", true)).findFirst(new IWhereFilter<SNode>() {
            public boolean accept(SNode arg) {
              return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(arg, "parameterDeclaration", false), "jetbrains.mps.execution.commands.structure.DebuggerSettingsCommandParameterDeclaration");
            }
          }) == null);
        }
      })) {
        if (CommandDeclaration_Behavior.call_isDebuggable_856705193941282102(ExecuteCommandPart_Behavior.call_getCommandDeclaration_6129022259108621200(SLinkOperations.getTarget(builder, "commandPart", false)))) {
          SNode debuggerSettings = new QueriesGenerated.QuotationClass_x583g4_a0a0a0a0a0a0().createNode();
          SLinkOperations.setNewChild(debuggerSettings, "operand", "jetbrains.mps.execution.configurations.structure.DebuggerSettings_Parameter");
          SNode debuggerAssignment = new QueriesGenerated.QuotationClass_x583g4_a0a2a0a0a0a0().createNode(SLinkOperations.getTarget(ExecuteCommandPart_Behavior.call_getCommandDeclaration_6129022259108621200(SLinkOperations.getTarget(builder, "commandPart", false)), "debuggerParameter", true));
          ListSequence.fromList(SLinkOperations.getTargets(builder, "argument", true)).addElement(debuggerAssignment);
          SLinkOperations.setTarget(debuggerAssignment, "value", debuggerSettings, true);
        }
      }
    }
  }

  public static class QuotationClass_x583g4_a0a0a0a0a0a0 {
    public QuotationClass_x583g4_a0a0a0a0a0a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_5 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterReference", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_6 = quotedNode_2;
          quotedNode1_6.addReference(SReference.create("variableDeclaration", quotedNode1_6, SModelReference.fromString("r:d04ac35e-30ce-449b-aa73-da704c5fe866(jetbrains.mps.execution.configurations.generator.template.preprocess@1_1)"), SNodeId.fromString("")));
          quotedNode_1.addChild("operand", quotedNode1_6);
        }
        {
          quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_7 = quotedNode_3;
          quotedNode1_7.addReference(SReference.create("baseMethodDeclaration", quotedNode1_7, SModelReference.fromString("f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.debug.runtime.settings(MPS.Classpath/jetbrains.mps.debug.runtime.settings@java_stub)"), SNodeId.fromString("~DebugConnectionSettings.getCommandLine(boolean):java.lang.String")));
          {
            quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.BooleanConstant", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_8 = quotedNode_4;
            quotedNode1_8.setProperty("value", "true");
            quotedNode_3.addChild("actualArgument", quotedNode1_8);
          }
          quotedNode_1.addChild("operation", quotedNode1_7);
        }
        result = quotedNode1_5;
      }
      return result;
    }
  }

  public static class QuotationClass_x583g4_a0a2a0a0a0a0 {
    public QuotationClass_x583g4_a0a2a0a0a0a0() {
    }

    public SNode createNode(Object parameter_5) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.execution.commands.structure.CommandParameterAssignment", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        quotedNode1_3.setReferent("parameterDeclaration", (SNode) parameter_5);
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StringLiteral", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_4 = quotedNode_2;
          quotedNode1_4.setProperty("value", "");
          quotedNode_1.addChild("value", quotedNode1_4);
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }
}

package jetbrains.mps.execution.commands.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import org.jetbrains.annotations.NonNls;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import java.util.ArrayList;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CommandDeclaration_Behavior {
  private static Class[] PARAMETERS_856705193941282112 = {SNode.class};
  private static Class[] PARAMETERS_856705193941282121 = {SNode.class};

  public static void init(SNode thisNode) {
    SLinkOperations.setTarget(thisNode, "debuggerParameter", SConceptOperations.createNewNode("jetbrains.mps.execution.commands.structure.DebuggerSettingsCommandParameterDeclaration", null), true);
  }

  public static boolean call_isDebuggable_856705193941282102(SNode thisNode) {
    return (SLinkOperations.getTarget(thisNode, "debuggerConfiguration", true) != null);
  }

  @NonNls
  public static String virtual_getSuffix_946964771156905483(SNode thisNode) {
    return "Command";
  }

  public static SNode virtual_createType_1213877527970(SNode thisNode) {
    return new CommandDeclaration_Behavior.QuotationClass_5aznw1_a0a0d().createNode(thisNode, thisNode);
  }

  public static List<SNode> call_getDistinctFieldParameters_6129022259108623165(SNode thisNode) {
    // we get all parameters generated into fields and select a list with uniquie names 
    final Iterable<SNode> parameterDeclarations = ListSequence.fromList(SLinkOperations.getTargets(thisNode, "executePart", true)).<SNode>translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode it) {
        return ListSequence.fromList(ExecuteCommandPart_Behavior.call_getParameters_6129022259108621180(it)).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return CommandParameterDeclaration_Behavior.call_generateField_8478830098674441876(it);
          }
        });
      }
    });
    Iterable<String> fieldNames = Sequence.fromIterable(parameterDeclarations).<String>select(new ISelector<SNode, String>() {
      public String select(SNode it) {
        return CommandParameterDeclaration_Behavior.call_getFieldName_7327337331549117850(it);
      }
    }).distinct();
    return Sequence.fromIterable(fieldNames).<SNode>translate(new ITranslator2<String, SNode>() {
      public Iterable<SNode> translate(final String it) {
        SNode first = Sequence.fromIterable(parameterDeclarations).findFirst(new IWhereFilter<SNode>() {
          public boolean accept(SNode decl) {
            return eq_5aznw1_a0a0a0a0a0a0a0a0a0a0d0e(CommandParameterDeclaration_Behavior.call_getFieldName_7327337331549117850(decl), it);
          }
        });
        if (first == null) {
          return new ArrayList<SNode>();
        }
        return Sequence.<SNode>singleton(first);
      }
    }).toListSequence();
  }

  public static String call_getSuffix_856705193941282112(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (String) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.commands.structure.CommandDeclaration"), "virtual_getSuffix_946964771156905483", PARAMETERS_856705193941282112);
  }

  public static SNode call_createType_856705193941282121(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.commands.structure.CommandDeclaration"), "virtual_createType_1213877527970", PARAMETERS_856705193941282121);
  }

  public static String callSuper_getSuffix_856705193941282112(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.commands.structure.CommandDeclaration"), callerConceptFqName, "virtual_getSuffix_946964771156905483", PARAMETERS_856705193941282112);
  }

  public static SNode callSuper_createType_856705193941282121(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.execution.commands.structure.CommandDeclaration"), callerConceptFqName, "virtual_createType_1213877527970", PARAMETERS_856705193941282121);
  }

  public static String getCreateProcessMethodName_856705193941282090() {
    return "createProcess";
  }

  public static String getGetDebuggerMethodName_856705193941282096() {
    return "getDebugger";
  }

  public static String getGetDebuggerConfidurationMethodName_6226796386650472924() {
    return "getDebuggerConfiguration";
  }

  private static boolean eq_5aznw1_a0a0a0a0a0a0a0a0a0a0d0e(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }

  public static class QuotationClass_5aznw1_a0a0d {
    public QuotationClass_5aznw1_a0a0d() {
    }

    public SNode createNode(Object parameter_3, Object parameter_4) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.execution.commands.structure.CommandType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("classifier", (SNode) parameter_4);
        quotedNode1_2.setReferent("command", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}

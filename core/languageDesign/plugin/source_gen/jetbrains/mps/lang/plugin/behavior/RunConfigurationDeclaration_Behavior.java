package jetbrains.mps.lang.plugin.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.checkedName.PropertyReference;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class RunConfigurationDeclaration_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String call_getGeneratedName_7840798570674951656(SNode thisNode) {
    return NameUtil.toValidIdentifier(SPropertyOperations.getString(thisNode, "name")) + "_Configuration";
  }

  public static String call_getGeneratedClassFQName_7840798570674951667(SNode thisNode) {
    return SNodeOperations.getModel(thisNode).getLongName() + "." + RunConfigurationDeclaration_Behavior.call_getGeneratedName_7840798570674951656(thisNode);
  }

  public static String call_getGeneratedFactoryName_7840798570674951628(SNode thisNode) {
    return NameUtil.toValidIdentifier(SPropertyOperations.getString(thisNode, "name")) + "_Factory";
  }

  public static String call_getGeneratedFactoryClassFQName_7840798570674951639(SNode thisNode) {
    return SNodeOperations.getModel(thisNode).getLongName() + "." + RunConfigurationDeclaration_Behavior.call_getGeneratedFactoryName_7840798570674951628(thisNode);
  }

  public static PropertyReference virtual_getPropertyToCheck_5003188907305392322(SNode thisNode) {
    return new PropertyReference(thisNode, "caption");
  }

  public static SNode virtual_createType_1213877527970(SNode thisNode) {
    return new RunConfigurationDeclaration_Behavior.QuotationClass_3854_l523emnf07vg().createNode(thisNode);
  }

  public static class QuotationClass_3854_l523emnf07vg {
    public QuotationClass_3854_l523emnf07vg() {
    }

    public SNode createNode(Object parameter_3854_2jr4i0o0a04a) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_3854_1ol1i5henjbjk = null;
      {
        quotedNode_3854_1ol1i5henjbjk = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.RunConfigType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3854_1ol1i5henjbjk = quotedNode_3854_1ol1i5henjbjk;
        quotedNode1_3854_1ol1i5henjbjk.setReferent("runConfig", (SNode) parameter_3854_2jr4i0o0a04a);
        result = quotedNode1_3854_1ol1i5henjbjk;
      }
      return result;
    }
  }
}

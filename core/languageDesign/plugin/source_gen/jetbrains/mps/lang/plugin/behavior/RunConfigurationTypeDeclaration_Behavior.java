package jetbrains.mps.lang.plugin.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.checkedName.PropertyReference;

public class RunConfigurationTypeDeclaration_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String call_getGeneratedName_7840798570674947566(SNode thisNode) {
    return NameUtil.toValidIdentifier(SPropertyOperations.getString(thisNode, "name")) + "_ConfigurationType";
  }

  public static String call_getGeneratedClassFQName_7840798570674947577(SNode thisNode) {
    return SNodeOperations.getModel(thisNode).getLongName() + "." + RunConfigurationTypeDeclaration_Behavior.call_getGeneratedName_7840798570674947566(thisNode);
  }

  public static PropertyReference virtual_getPropertyToCheck_5003188907305392322(SNode thisNode) {
    return new PropertyReference(thisNode, "caption");
  }
}

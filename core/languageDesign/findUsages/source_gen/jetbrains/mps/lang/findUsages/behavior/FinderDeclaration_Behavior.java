package jetbrains.mps.lang.findUsages.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.checkedName.PropertyReference;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class FinderDeclaration_Behavior {

  public static void init(SNode thisNode) {
  }

  public static String call_getGeneratedClassName_1213877240101(SNode thisNode) {
    return NameUtil.toValidIdentifier(SPropertyOperations.getString(thisNode, "name")) + "_Finder";
  }

  public static String call_getConceptName_1213877240111(SNode thisNode) {
    return INamedConcept_Behavior.call_getFqName_1213877404258(SLinkOperations.getTarget(thisNode, "forConcept", false));
  }

  public static String call_getGeneratedClassLongName_1213877240120(SNode thisNode) {
    return ((SModel)SNodeOperations.getModel(thisNode)).getModelDescriptor().getLongName() + "." + FinderDeclaration_Behavior.call_getGeneratedClassName_1213877240101(thisNode);
  }

  public static String virtual_getFixIntentionCaption_1628770029971140579(SNode thisNode) {
    return "Fix Finder Name";
  }

  public static List<PropertyReference> virtual_getPropertiesToCheck_1628770029971140570(SNode thisNode) {
    List<PropertyReference> result = ListSequence.fromList(new ArrayList<PropertyReference>());
    ListSequence.fromList(result).addElement(new PropertyReference(thisNode, "description"));
    return result;
  }

}

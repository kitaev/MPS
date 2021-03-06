package jetbrains.mps.lang.actions.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NodeSetupFunction_NewNode extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.lang.actions.structure.NodeSetupFunction_NewNode";

  public NodeSetupFunction_NewNode(SNode node) {
    super(node);
  }

  public static NodeSetupFunction_NewNode newInstance(SModel sm, boolean init) {
    return (NodeSetupFunction_NewNode) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.actions.structure.NodeSetupFunction_NewNode", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NodeSetupFunction_NewNode newInstance(SModel sm) {
    return NodeSetupFunction_NewNode.newInstance(sm, false);
  }
}

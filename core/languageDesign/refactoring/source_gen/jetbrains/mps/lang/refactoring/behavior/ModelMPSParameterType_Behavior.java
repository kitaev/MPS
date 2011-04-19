package jetbrains.mps.lang.refactoring.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class ModelMPSParameterType_Behavior {
  private static Class[] PARAMETERS_4413749148913760577 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getCreatorMethod_4413749148913760555(SNode thisNode) {
    return new ModelMPSParameterType_Behavior.QuotationClass_le858a_a0a0b().createNode();
  }

  public static SNode call_getCreatorMethod_4413749148913760577(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getConceptDescriptorForInstanceNode(thisNode).behavior();
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.refactoring.structure.ModelMPSParameterType"), "virtual_getCreatorMethod_4413749148913760555", PARAMETERS_4413749148913760577);
  }

  public static SNode callSuper_getCreatorMethod_4413749148913760577(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.refactoring.structure.ModelMPSParameterType"), callerConceptFqName, "virtual_getCreatorMethod_4413749148913760555", PARAMETERS_4413749148913760577);
  }

  public static class QuotationClass_le858a_a0a0b {
    public QuotationClass_le858a_a0a0b() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticMethodCall", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classConcept", quotedNode1_2, SModelReference.fromString("f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.refactoring.framework.paramchooser.mps(MPS.Classpath/jetbrains.mps.refactoring.framework.paramchooser.mps@java_stub)"), SNodeId.fromString("~MPSChooserFactory")));
        quotedNode1_2.addReference(SReference.create("baseMethodDeclaration", quotedNode1_2, SModelReference.fromString("f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.refactoring.framework.paramchooser.mps(MPS.Classpath/jetbrains.mps.refactoring.framework.paramchooser.mps@java_stub)"), SNodeId.fromString("~MPSChooserFactory.createModelChooser(jetbrains.mps.refactoring.framework.RefactoringContext,java.lang.String,jetbrains.mps.refactoring.framework.paramchooser.mps.IChooserSettings):jetbrains.mps.refactoring.framework.paramchooser.IChooser")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}

package jetbrains.mps.lang.structure.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BehaviorDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.interpreted.BehaviorAspectInterpreted;

public class BehaviorAspectDescriptor implements jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor {
  private static String[] stringSwitchCases_846f5o_a0a0a = new String[]{"jetbrains.mps.lang.structure.structure.AggregationConceptLink", "jetbrains.mps.lang.structure.structure.AggregationConceptLinkDeclaration", "jetbrains.mps.lang.structure.structure.AnnotationLinkDeclaration", "jetbrains.mps.lang.structure.structure.BooleanConceptProperty", "jetbrains.mps.lang.structure.structure.BooleanConceptPropertyDeclaration", "jetbrains.mps.lang.structure.structure.ConceptDeclaration", "jetbrains.mps.lang.structure.structure.ConstrainedDataTypeDeclaration", "jetbrains.mps.lang.structure.structure.DataTypeDeclaration", "jetbrains.mps.lang.structure.structure.DeprecatedNodeAnnotation", "jetbrains.mps.lang.structure.structure.EnumerationDataTypeDeclaration", "jetbrains.mps.lang.structure.structure.EnumerationMemberDeclaration", "jetbrains.mps.lang.structure.structure.IntegerConceptProperty", "jetbrains.mps.lang.structure.structure.IntegerConceptPropertyDeclaration", "jetbrains.mps.lang.structure.structure.InterfaceConceptDeclaration", "jetbrains.mps.lang.structure.structure.InterfaceConceptReference", "jetbrains.mps.lang.structure.structure.LinkDeclaration", "jetbrains.mps.lang.structure.structure.PrimitiveDataTypeDeclaration", "jetbrains.mps.lang.structure.structure.PropertyDeclaration", "jetbrains.mps.lang.structure.structure.ReferenceConceptLink", "jetbrains.mps.lang.structure.structure.ReferenceConceptLinkDeclaration", "jetbrains.mps.lang.structure.structure.StringConceptProperty", "jetbrains.mps.lang.structure.structure.StringConceptPropertyDeclaration"};

  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_846f5o_a0a0a, fqName)) {
      case 5:
        return new ConceptDeclaration_BehaviorDescriptor();
      case 15:
        return new LinkDeclaration_BehaviorDescriptor();
      case 17:
        return new PropertyDeclaration_BehaviorDescriptor();
      case 7:
        return new DataTypeDeclaration_BehaviorDescriptor();
      case 9:
        return new EnumerationDataTypeDeclaration_BehaviorDescriptor();
      case 6:
        return new ConstrainedDataTypeDeclaration_BehaviorDescriptor();
      case 10:
        return new EnumerationMemberDeclaration_BehaviorDescriptor();
      case 16:
        return new PrimitiveDataTypeDeclaration_BehaviorDescriptor();
      case 12:
        return new IntegerConceptPropertyDeclaration_BehaviorDescriptor();
      case 4:
        return new BooleanConceptPropertyDeclaration_BehaviorDescriptor();
      case 21:
        return new StringConceptPropertyDeclaration_BehaviorDescriptor();
      case 11:
        return new IntegerConceptProperty_BehaviorDescriptor();
      case 3:
        return new BooleanConceptProperty_BehaviorDescriptor();
      case 20:
        return new StringConceptProperty_BehaviorDescriptor();
      case 18:
        return new ReferenceConceptLink_BehaviorDescriptor();
      case 0:
        return new AggregationConceptLink_BehaviorDescriptor();
      case 1:
        return new AggregationConceptLinkDeclaration_BehaviorDescriptor();
      case 19:
        return new ReferenceConceptLinkDeclaration_BehaviorDescriptor();
      case 2:
        return new AnnotationLinkDeclaration_BehaviorDescriptor();
      case 13:
        return new InterfaceConceptDeclaration_BehaviorDescriptor();
      case 14:
        return new InterfaceConceptReference_BehaviorDescriptor();
      case 8:
        return new DeprecatedNodeAnnotation_BehaviorDescriptor();
      default:
        return BehaviorAspectInterpreted.getInstance().getDescriptor(fqName);
    }
  }
}

package jetbrains.mpslite.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.impl.CompiledConceptDescriptor;
import jetbrains.mps.smodel.runtime.interpreted.StructureAspectInterpreted;

public class StructureAspectDescriptor implements jetbrains.mps.smodel.runtime.StructureAspectDescriptor {
  private static String[] stringSwitchCases_1htk8d_a0a0a = new String[]{"jetbrains.mpslite.structure.AbstractConceptReference", "jetbrains.mpslite.structure.BinaryOperationConcept", "jetbrains.mpslite.structure.BlockBodyPart", "jetbrains.mpslite.structure.BlockConcept", "jetbrains.mpslite.structure.BlockReference", "jetbrains.mpslite.structure.ChildPart", "jetbrains.mpslite.structure.ConceptContainer", "jetbrains.mpslite.structure.ConcreteChildPart", "jetbrains.mpslite.structure.ConcretePropertyPart", "jetbrains.mpslite.structure.ConcreteReferencePart", "jetbrains.mpslite.structure.ConstantLinePart", "jetbrains.mpslite.structure.ExpressionConcept", "jetbrains.mpslite.structure.FeatureAccessConcept", "jetbrains.mpslite.structure.IMPSLiteConcept", "jetbrains.mpslite.structure.IndentLinePart", "jetbrains.mpslite.structure.Line", "jetbrains.mpslite.structure.LineList", "jetbrains.mpslite.structure.LinePart", "jetbrains.mpslite.structure.MPSLiteConceptDeclaration", "jetbrains.mpslite.structure.MPSLiteConceptReference", "jetbrains.mpslite.structure.NamePropertyNamePart", "jetbrains.mpslite.structure.OptionalPart", "jetbrains.mpslite.structure.PropertyPart", "jetbrains.mpslite.structure.ReferencePart", "jetbrains.mpslite.structure.RegularConceptReference", "jetbrains.mpslite.structure.StatementConcept", "jetbrains.mpslite.structure.TypePart", "jetbrains.mpslite.structure.VariableConcept"};

  public StructureAspectDescriptor() {
  }

  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0a, conceptFqName)) {
      case 0:
        return new CompiledConceptDescriptor("jetbrains.mpslite.structure.AbstractConceptReference", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"conceptDeclaration"});
      case 1:
        return new CompiledConceptDescriptor("jetbrains.mpslite.structure.BinaryOperationConcept", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mpslite.structure.IMPSLiteConcept"}, new String[]{"leftTargetRole", "rightTargetRole", "sign"}, new String[]{});
      case 2:
        return new CompiledConceptDescriptor("jetbrains.mpslite.structure.BlockBodyPart", "jetbrains.mpslite.structure.ChildPart", false, new String[]{"jetbrains.mpslite.structure.ChildPart"}, new String[]{}, new String[]{});
      case 3:
        return new CompiledConceptDescriptor("jetbrains.mpslite.structure.BlockConcept", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mpslite.structure.IMPSLiteConcept"}, new String[]{}, new String[]{});
      case 4:
        return new CompiledConceptDescriptor("jetbrains.mpslite.structure.BlockReference", "jetbrains.mpslite.structure.MPSLiteConceptReference", false, new String[]{"jetbrains.mpslite.structure.MPSLiteConceptReference"}, new String[]{}, new String[]{"blockConcept"});
      case 5:
        return new CompiledConceptDescriptor("jetbrains.mpslite.structure.ChildPart", "jetbrains.mpslite.structure.LinePart", false, new String[]{"jetbrains.mpslite.structure.LinePart"}, new String[]{"separator", "multiple", "vertical"}, new String[]{});
      case 6:
        return new CompiledConceptDescriptor("jetbrains.mpslite.structure.ConceptContainer", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{});
      case 7:
        return new CompiledConceptDescriptor("jetbrains.mpslite.structure.ConcreteChildPart", "jetbrains.mpslite.structure.ChildPart", false, new String[]{"jetbrains.mpslite.structure.ChildPart", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{});
      case 8:
        return new CompiledConceptDescriptor("jetbrains.mpslite.structure.ConcretePropertyPart", "jetbrains.mpslite.structure.PropertyPart", false, new String[]{"jetbrains.mpslite.structure.PropertyPart", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{"propertyType"}, new String[]{});
      case 9:
        return new CompiledConceptDescriptor("jetbrains.mpslite.structure.ConcreteReferencePart", "jetbrains.mpslite.structure.ReferencePart", false, new String[]{"jetbrains.mpslite.structure.ReferencePart", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{});
      case 10:
        return new CompiledConceptDescriptor("jetbrains.mpslite.structure.ConstantLinePart", "jetbrains.mpslite.structure.LinePart", false, new String[]{"jetbrains.mpslite.structure.LinePart"}, new String[]{"text"}, new String[]{});
      case 11:
        return new CompiledConceptDescriptor("jetbrains.mpslite.structure.ExpressionConcept", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mpslite.structure.IMPSLiteConcept"}, new String[]{}, new String[]{});
      case 12:
        return new CompiledConceptDescriptor("jetbrains.mpslite.structure.FeatureAccessConcept", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mpslite.structure.IMPSLiteConcept"}, new String[]{}, new String[]{});
      case 13:
        return new CompiledConceptDescriptor("jetbrains.mpslite.structure.IMPSLiteConcept", null, true, new String[]{"jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{"root", "abstract"}, new String[]{});
      case 14:
        return new CompiledConceptDescriptor("jetbrains.mpslite.structure.IndentLinePart", "jetbrains.mpslite.structure.LinePart", false, new String[]{"jetbrains.mpslite.structure.LinePart"}, new String[]{}, new String[]{});
      case 15:
        return new CompiledConceptDescriptor("jetbrains.mpslite.structure.Line", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{});
      case 16:
        return new CompiledConceptDescriptor("jetbrains.mpslite.structure.LineList", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{});
      case 17:
        return new CompiledConceptDescriptor("jetbrains.mpslite.structure.LinePart", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{});
      case 18:
        return new CompiledConceptDescriptor("jetbrains.mpslite.structure.MPSLiteConceptDeclaration", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mpslite.structure.IMPSLiteConcept"}, new String[]{}, new String[]{});
      case 19:
        return new CompiledConceptDescriptor("jetbrains.mpslite.structure.MPSLiteConceptReference", "jetbrains.mpslite.structure.AbstractConceptReference", false, new String[]{"jetbrains.mpslite.structure.AbstractConceptReference"}, new String[]{}, new String[]{"mpsLiteConceptDeclaration"});
      case 20:
        return new CompiledConceptDescriptor("jetbrains.mpslite.structure.NamePropertyNamePart", "jetbrains.mpslite.structure.PropertyPart", false, new String[]{"jetbrains.mpslite.structure.PropertyPart"}, new String[]{}, new String[]{});
      case 21:
        return new CompiledConceptDescriptor("jetbrains.mpslite.structure.OptionalPart", "jetbrains.mpslite.structure.LinePart", false, new String[]{"jetbrains.mpslite.structure.LinePart"}, new String[]{}, new String[]{});
      case 22:
        return new CompiledConceptDescriptor("jetbrains.mpslite.structure.PropertyPart", "jetbrains.mpslite.structure.LinePart", false, new String[]{"jetbrains.mpslite.structure.LinePart"}, new String[]{}, new String[]{});
      case 23:
        return new CompiledConceptDescriptor("jetbrains.mpslite.structure.ReferencePart", "jetbrains.mpslite.structure.LinePart", false, new String[]{"jetbrains.mpslite.structure.LinePart"}, new String[]{"optional"}, new String[]{});
      case 24:
        return new CompiledConceptDescriptor("jetbrains.mpslite.structure.RegularConceptReference", "jetbrains.mpslite.structure.AbstractConceptReference", false, new String[]{"jetbrains.mpslite.structure.AbstractConceptReference"}, new String[]{}, new String[]{"regularConceptDeclaration"});
      case 25:
        return new CompiledConceptDescriptor("jetbrains.mpslite.structure.StatementConcept", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mpslite.structure.IMPSLiteConcept"}, new String[]{}, new String[]{});
      case 26:
        return new CompiledConceptDescriptor("jetbrains.mpslite.structure.TypePart", "jetbrains.mpslite.structure.ChildPart", false, new String[]{"jetbrains.mpslite.structure.ChildPart"}, new String[]{}, new String[]{});
      case 27:
        return new CompiledConceptDescriptor("jetbrains.mpslite.structure.VariableConcept", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mpslite.structure.IMPSLiteConcept"}, new String[]{"namePropertyName", "typeRole"}, new String[]{});
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }
}

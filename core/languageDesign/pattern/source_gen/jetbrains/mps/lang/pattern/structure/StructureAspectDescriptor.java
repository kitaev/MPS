package jetbrains.mps.lang.pattern.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.impl.CompiledConceptDescriptor;
import jetbrains.mps.smodel.runtime.interpreted.StructureAspectInterpreted;

public class StructureAspectDescriptor implements jetbrains.mps.smodel.runtime.StructureAspectDescriptor {
  private static String[] stringSwitchCases_1htk8d_a0a0a = new String[]{"jetbrains.mps.lang.pattern.structure.ActionAsPattern", "jetbrains.mps.lang.pattern.structure.ActionStatement", "jetbrains.mps.lang.pattern.structure.AsPattern", "jetbrains.mps.lang.pattern.structure.InsertAfterPosition", "jetbrains.mps.lang.pattern.structure.InsertBeforePosition", "jetbrains.mps.lang.pattern.structure.InsertPosition", "jetbrains.mps.lang.pattern.structure.LinkPatternVariableDeclaration", "jetbrains.mps.lang.pattern.structure.ListPattern", "jetbrains.mps.lang.pattern.structure.OrPattern", "jetbrains.mps.lang.pattern.structure.OrPatternClause", "jetbrains.mps.lang.pattern.structure.OrPatternVariableReference", "jetbrains.mps.lang.pattern.structure.Pattern", "jetbrains.mps.lang.pattern.structure.PatternExpression", "jetbrains.mps.lang.pattern.structure.PatternVariableDeclaration", "jetbrains.mps.lang.pattern.structure.PatternVariableReference", "jetbrains.mps.lang.pattern.structure.PropertyPatternVariableDeclaration", "jetbrains.mps.lang.pattern.structure.WildcardPattern"};

  public StructureAspectDescriptor() {
  }

  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0a, conceptFqName)) {
      case 0:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.pattern.structure.ActionAsPattern", "jetbrains.mps.lang.pattern.structure.AsPattern", false, new String[]{"jetbrains.mps.lang.pattern.structure.AsPattern"}, new String[]{}, new String[]{});
      case 1:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.pattern.structure.ActionStatement", "jetbrains.mps.baseLanguage.structure.Statement", false, new String[]{"jetbrains.mps.baseLanguage.structure.Statement"}, new String[]{}, new String[]{});
      case 2:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.pattern.structure.AsPattern", "jetbrains.mps.lang.pattern.structure.PatternVariableDeclaration", false, new String[]{"jetbrains.mps.lang.pattern.structure.PatternVariableDeclaration"}, new String[]{}, new String[]{});
      case 3:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.pattern.structure.InsertAfterPosition", "jetbrains.mps.lang.pattern.structure.InsertPosition", false, new String[]{"jetbrains.mps.lang.pattern.structure.InsertPosition"}, new String[]{}, new String[]{});
      case 4:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.pattern.structure.InsertBeforePosition", "jetbrains.mps.lang.pattern.structure.InsertPosition", false, new String[]{"jetbrains.mps.lang.pattern.structure.InsertPosition"}, new String[]{}, new String[]{});
      case 5:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.pattern.structure.InsertPosition", "jetbrains.mps.lang.core.structure.BaseConcept", false, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{});
      case 6:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.pattern.structure.LinkPatternVariableDeclaration", "jetbrains.mps.lang.core.structure.LinkAttribute", false, new String[]{"jetbrains.mps.lang.core.structure.LinkAttribute", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{"varName"}, new String[]{});
      case 7:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.pattern.structure.ListPattern", "jetbrains.mps.lang.pattern.structure.AsPattern", false, new String[]{"jetbrains.mps.lang.pattern.structure.AsPattern"}, new String[]{}, new String[]{});
      case 8:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.pattern.structure.OrPattern", "jetbrains.mps.lang.pattern.structure.Pattern", false, new String[]{"jetbrains.mps.lang.pattern.structure.Pattern"}, new String[]{}, new String[]{});
      case 9:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.pattern.structure.OrPatternClause", "jetbrains.mps.lang.pattern.structure.PatternExpression", false, new String[]{"jetbrains.mps.lang.pattern.structure.PatternExpression"}, new String[]{}, new String[]{});
      case 10:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.pattern.structure.OrPatternVariableReference", "jetbrains.mps.baseLanguage.structure.Expression", false, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"declaration"});
      case 11:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.pattern.structure.Pattern", "jetbrains.mps.lang.core.structure.NodeAttribute", false, new String[]{"jetbrains.mps.lang.core.structure.NodeAttribute"}, new String[]{}, new String[]{});
      case 12:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.pattern.structure.PatternExpression", "jetbrains.mps.baseLanguage.structure.Expression", false, new String[]{"jetbrains.mps.baseLanguage.structure.Expression", "jetbrains.mps.lang.core.structure.IMetaLevelChanger"}, new String[]{}, new String[]{});
      case 13:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.pattern.structure.PatternVariableDeclaration", "jetbrains.mps.lang.pattern.structure.Pattern", false, new String[]{"jetbrains.mps.lang.pattern.structure.Pattern", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{"varName"}, new String[]{});
      case 14:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.pattern.structure.PatternVariableReference", "jetbrains.mps.baseLanguage.structure.Expression", false, new String[]{"jetbrains.mps.baseLanguage.structure.Expression"}, new String[]{}, new String[]{"variable"});
      case 15:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.pattern.structure.PropertyPatternVariableDeclaration", "jetbrains.mps.lang.core.structure.PropertyAttribute", false, new String[]{"jetbrains.mps.lang.core.structure.PropertyAttribute", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{"varName"}, new String[]{});
      case 16:
        return new CompiledConceptDescriptor("jetbrains.mps.lang.pattern.structure.WildcardPattern", "jetbrains.mps.lang.pattern.structure.Pattern", false, new String[]{"jetbrains.mps.lang.pattern.structure.Pattern"}, new String[]{}, new String[]{});
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }
}

package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class long_unboxing_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  /*package*/ GeneratedMatchingPattern myMatchingPattern;

  public long_unboxing_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode longType, TypeCheckingContext typeCheckingContext) {
    return new long_unboxing_SubtypingRule.QuotationClass_6823_0().createNode(typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public boolean isApplicable(SNode argument) {
    this.myMatchingPattern = new _Patterns.Pattern_6();
    return this.myMatchingPattern.match(argument);
  }

  public boolean isWeak() {
    return true;
  }

  public static class QuotationClass_6823_0 {
    public QuotationClass_6823_0() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_77 = null;
      {
        quotedNode_77 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.LongType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_76 = quotedNode_77;
        result = quotedNode1_76;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_77 = null;
      {
        quotedNode_77 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.LongType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_76 = quotedNode_77;
        result = quotedNode1_76;
      }
      return result;
    }
  }
}

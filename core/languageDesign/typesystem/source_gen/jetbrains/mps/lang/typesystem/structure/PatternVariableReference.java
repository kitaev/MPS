package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.pattern.structure.PatternVariableDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PatternVariableReference extends Expression {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.PatternVariableReference";
  public static final String PATTERN_VAR_DECL = "patternVarDecl";

  public PatternVariableReference(SNode node) {
    super(node);
  }

  public PatternVariableDeclaration getPatternVarDecl() {
    return (PatternVariableDeclaration) this.getReferent(PatternVariableDeclaration.class, PatternVariableReference.PATTERN_VAR_DECL);
  }

  public void setPatternVarDecl(PatternVariableDeclaration node) {
    super.setReferent(PatternVariableReference.PATTERN_VAR_DECL, node);
  }

  public static PatternVariableReference newInstance(SModel sm, boolean init) {
    return (PatternVariableReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.PatternVariableReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PatternVariableReference newInstance(SModel sm) {
    return PatternVariableReference.newInstance(sm, false);
  }
}

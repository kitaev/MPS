package jetbrains.mps.lang.pattern.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class OrPatternVariableReference extends Expression {
  public static final String concept = "jetbrains.mps.lang.pattern.structure.OrPatternVariableReference";
  public static final String DECLARATION = "declaration";

  public OrPatternVariableReference(SNode node) {
    super(node);
  }

  public PatternVariableDeclaration getDeclaration() {
    return (PatternVariableDeclaration) this.getReferent(PatternVariableDeclaration.class, OrPatternVariableReference.DECLARATION);
  }

  public void setDeclaration(PatternVariableDeclaration node) {
    super.setReferent(OrPatternVariableReference.DECLARATION, node);
  }

  public static OrPatternVariableReference newInstance(SModel sm, boolean init) {
    return (OrPatternVariableReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.pattern.structure.OrPatternVariableReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static OrPatternVariableReference newInstance(SModel sm) {
    return OrPatternVariableReference.newInstance(sm, false);
  }
}

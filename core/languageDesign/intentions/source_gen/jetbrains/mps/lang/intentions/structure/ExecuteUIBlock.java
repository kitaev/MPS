package jetbrains.mps.lang.intentions.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ExecuteUIBlock extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.intentions.structure.ExecuteUIBlock";

  public ExecuteUIBlock(SNode node) {
    super(node);
  }

  public static ExecuteUIBlock newInstance(SModel sm, boolean init) {
    return (ExecuteUIBlock)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.intentions.structure.ExecuteUIBlock", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ExecuteUIBlock newInstance(SModel sm) {
    return ExecuteUIBlock.newInstance(sm, false);
  }
}

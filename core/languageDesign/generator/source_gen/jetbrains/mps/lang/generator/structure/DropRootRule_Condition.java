package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DropRootRule_Condition extends TemplateQueryBase {
  public static final String concept = "jetbrains.mps.lang.generator.structure.DropRootRule_Condition";

  public DropRootRule_Condition(SNode node) {
    super(node);
  }

  public static DropRootRule_Condition newInstance(SModel sm, boolean init) {
    return (DropRootRule_Condition) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.structure.DropRootRule_Condition", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DropRootRule_Condition newInstance(SModel sm) {
    return DropRootRule_Condition.newInstance(sm, false);
  }
}

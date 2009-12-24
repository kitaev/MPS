package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CheckConfigurationBlock extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.CheckConfigurationBlock";

  public CheckConfigurationBlock(SNode node) {
    super(node);
  }

  public static CheckConfigurationBlock newInstance(SModel sm, boolean init) {
    return (CheckConfigurationBlock) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.CheckConfigurationBlock", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CheckConfigurationBlock newInstance(SModel sm) {
    return CheckConfigurationBlock.newInstance(sm, false);
  }
}

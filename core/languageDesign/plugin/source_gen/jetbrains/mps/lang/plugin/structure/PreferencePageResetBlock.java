package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PreferencePageResetBlock extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.PreferencePageResetBlock";

  public PreferencePageResetBlock(SNode node) {
    super(node);
  }

  public static PreferencePageResetBlock newInstance(SModel sm, boolean init) {
    return (PreferencePageResetBlock) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.PreferencePageResetBlock", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PreferencePageResetBlock newInstance(SModel sm) {
    return PreferencePageResetBlock.newInstance(sm, false);
  }
}

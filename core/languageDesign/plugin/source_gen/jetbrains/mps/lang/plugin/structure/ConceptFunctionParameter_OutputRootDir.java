package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptFunctionParameter_OutputRootDir extends ConceptFunctionParameter {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.ConceptFunctionParameter_OutputRootDir";

  public ConceptFunctionParameter_OutputRootDir(SNode node) {
    super(node);
  }

  public static ConceptFunctionParameter_OutputRootDir newInstance(SModel sm, boolean init) {
    return (ConceptFunctionParameter_OutputRootDir) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ConceptFunctionParameter_OutputRootDir", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptFunctionParameter_OutputRootDir newInstance(SModel sm) {
    return ConceptFunctionParameter_OutputRootDir.newInstance(sm, false);
  }
}

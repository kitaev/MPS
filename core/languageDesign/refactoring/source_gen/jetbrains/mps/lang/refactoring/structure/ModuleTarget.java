package jetbrains.mps.lang.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.ClassifierType;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ModuleTarget extends RefactoringTarget {
  public static final String concept = "jetbrains.mps.lang.refactoring.structure.ModuleTarget";
  public static final String MODULE_TYPE = "moduleType";
  public static final String IS_APPLICABLE_BLOCK = "isApplicableBlock";

  public ModuleTarget(SNode node) {
    super(node);
  }

  public ClassifierType getModuleType() {
    return (ClassifierType)this.getChild(ClassifierType.class, ModuleTarget.MODULE_TYPE);
  }

  public void setModuleType(ClassifierType node) {
    super.setChild(ModuleTarget.MODULE_TYPE, node);
  }

  public IsApplicableToModuleClause getIsApplicableBlock() {
    return (IsApplicableToModuleClause)this.getChild(IsApplicableToModuleClause.class, ModuleTarget.IS_APPLICABLE_BLOCK);
  }

  public void setIsApplicableBlock(IsApplicableToModuleClause node) {
    super.setChild(ModuleTarget.IS_APPLICABLE_BLOCK, node);
  }

  public static ModuleTarget newInstance(SModel sm, boolean init) {
    return (ModuleTarget)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.ModuleTarget", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ModuleTarget newInstance(SModel sm) {
    return ModuleTarget.newInstance(sm, false);
  }
}

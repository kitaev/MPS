package jetbrains.mps.lang.editor.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.TemplateQueryContext;

public class CellModel_RefCell_BehaviorDescriptor extends CellModel_WithRole_BehaviorDescriptor {
  public CellModel_RefCell_BehaviorDescriptor() {
  }

  public boolean virtual_isCellIdInitialized_1229948571177(SNode thisNode) {
    return CellModel_RefCell_Behavior.virtual_isCellIdInitialized_1229948571177(thisNode);
  }

  public String virtual_getOpeningText_1220339714057(SNode thisNode) {
    return CellModel_RefCell_Behavior.virtual_getOpeningText_1220339714057(thisNode);
  }

  public String virtual_createCellId_1216737839993(SNode thisNode, TemplateQueryContext gc) {
    return CellModel_RefCell_Behavior.virtual_createCellId_1216737839993(thisNode, gc);
  }

  public String virtual_getClosingText_1220339738643(SNode thisNode) {
    return CellModel_RefCell_Behavior.virtual_getClosingText_1220339738643(thisNode);
  }

  public String virtual_getRoleForCell_1216377898846(SNode thisNode) {
    return CellModel_RefCell_Behavior.virtual_getRoleForCell_1216377898846(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.lang.editor.structure.CellModel_RefCell";
  }
}

package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ModificationStatement extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.ModificationStatement";
  public static final String MODIFIED_GROUP = "modifiedGroup";
  public static final String POINT = "point";

  public ModificationStatement(SNode node) {
    super(node);
  }

  public ActionGroupDeclaration getModifiedGroup() {
    return (ActionGroupDeclaration) this.getReferent(ActionGroupDeclaration.class, ModificationStatement.MODIFIED_GROUP);
  }

  public void setModifiedGroup(ActionGroupDeclaration node) {
    super.setReferent(ModificationStatement.MODIFIED_GROUP, node);
  }

  public GroupAnchor getPoint() {
    return (GroupAnchor) this.getReferent(GroupAnchor.class, ModificationStatement.POINT);
  }

  public void setPoint(GroupAnchor node) {
    super.setReferent(ModificationStatement.POINT, node);
  }

  public static ModificationStatement newInstance(SModel sm, boolean init) {
    return (ModificationStatement) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ModificationStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ModificationStatement newInstance(SModel sm) {
    return ModificationStatement.newInstance(sm, false);
  }
}

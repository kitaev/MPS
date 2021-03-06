package jetbrains.mps.build.packaging.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class UpdateWebsite extends BaseConcept {
  public static final String concept = "jetbrains.mps.build.packaging.structure.UpdateWebsite";
  public static final String CHECK_URL = "checkUrl";
  public static final String UPDATE_URL = "updateUrl";
  public static final String UPDATE_CHANNEL = "updateChannel";

  public UpdateWebsite(SNode node) {
    super(node);
  }

  public IStringExpression getCheckUrl() {
    return (IStringExpression) this.getChild(IStringExpression.class, UpdateWebsite.CHECK_URL);
  }

  public void setCheckUrl(IStringExpression node) {
    super.setChild(UpdateWebsite.CHECK_URL, node);
  }

  public IStringExpression getUpdateUrl() {
    return (IStringExpression) this.getChild(IStringExpression.class, UpdateWebsite.UPDATE_URL);
  }

  public void setUpdateUrl(IStringExpression node) {
    super.setChild(UpdateWebsite.UPDATE_URL, node);
  }

  public IStringExpression getUpdateChannel() {
    return (IStringExpression) this.getChild(IStringExpression.class, UpdateWebsite.UPDATE_CHANNEL);
  }

  public void setUpdateChannel(IStringExpression node) {
    super.setChild(UpdateWebsite.UPDATE_CHANNEL, node);
  }

  public static UpdateWebsite newInstance(SModel sm, boolean init) {
    return (UpdateWebsite) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.packaging.structure.UpdateWebsite", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static UpdateWebsite newInstance(SModel sm) {
    return UpdateWebsite.newInstance(sm, false);
  }
}

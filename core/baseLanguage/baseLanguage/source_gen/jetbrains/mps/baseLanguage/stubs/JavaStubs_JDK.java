package jetbrains.mps.baseLanguage.stubs;

/*Generated by MPS */

import jetbrains.mps.stubs.StubLocation;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.AttributesRolesUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class JavaStubs_JDK extends JavaStubs {
  public JavaStubs_JDK() {
  }

  protected void updateModel(final StubLocation location, final SModel model) {
    super.updateModel(location, model);
    SNode exp = null;
    exp = SConceptOperations.createNewNode("jetbrains.mps.lang.core.structure.ExportScopePublic", null);
    for (SNode root : model) {
      SLinkOperations.setTarget(root, AttributesRolesUtil.childRoleFromAttributeRole("export"), SNodeOperations.copyNode(exp), true);
    }
  }
}

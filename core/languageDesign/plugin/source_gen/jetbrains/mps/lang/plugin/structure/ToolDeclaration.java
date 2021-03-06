package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ToolDeclaration extends BaseToolDeclaration {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.ToolDeclaration";
  public static final String INIT_BLOCK = "initBlock";
  public static final String DISPOSE_BLOCK = "disposeBlock";
  public static final String GET_COMPONENT_BLOCK = "getComponentBlock";

  public ToolDeclaration(SNode node) {
    super(node);
  }

  public ProjectPluginInitBlock getInitBlock() {
    return (ProjectPluginInitBlock) this.getChild(ProjectPluginInitBlock.class, ToolDeclaration.INIT_BLOCK);
  }

  public void setInitBlock(ProjectPluginInitBlock node) {
    super.setChild(ToolDeclaration.INIT_BLOCK, node);
  }

  public ProjectPluginDisposeBlock getDisposeBlock() {
    return (ProjectPluginDisposeBlock) this.getChild(ProjectPluginDisposeBlock.class, ToolDeclaration.DISPOSE_BLOCK);
  }

  public void setDisposeBlock(ProjectPluginDisposeBlock node) {
    super.setChild(ToolDeclaration.DISPOSE_BLOCK, node);
  }

  public GetComponentBlock getGetComponentBlock() {
    return (GetComponentBlock) this.getChild(GetComponentBlock.class, ToolDeclaration.GET_COMPONENT_BLOCK);
  }

  public void setGetComponentBlock(GetComponentBlock node) {
    super.setChild(ToolDeclaration.GET_COMPONENT_BLOCK, node);
  }

  public static ToolDeclaration newInstance(SModel sm, boolean init) {
    return (ToolDeclaration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ToolDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ToolDeclaration newInstance(SModel sm) {
    return ToolDeclaration.newInstance(sm, false);
  }
}

package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SimpleSideTransformMenuPart extends SideTransformMenuPart {
  public static final String concept = "jetbrains.mps.bootstrap.actionsLanguage.structure.SimpleSideTransformMenuPart";
  public static String MATCHING_TEXT = "matchingText";
  public static String DESCRIPTION_TEXT = "descriptionText";
  public static String ICON = "icon";
  public static String HANDLER = "handler";

  public SimpleSideTransformMenuPart(SNode node) {
    super(node);
  }

  public ISideTransform_String getMatchingText() {
    return (ISideTransform_String)this.getChild(SimpleSideTransformMenuPart.MATCHING_TEXT);
  }

  public void setMatchingText(ISideTransform_String node) {
    super.setChild(SimpleSideTransformMenuPart.MATCHING_TEXT, node);
  }

  public ISideTransform_String getDescriptionText() {
    return (ISideTransform_String)this.getChild(SimpleSideTransformMenuPart.DESCRIPTION_TEXT);
  }

  public void setDescriptionText(ISideTransform_String node) {
    super.setChild(SimpleSideTransformMenuPart.DESCRIPTION_TEXT, node);
  }

  public QueryFunction_SideTransform_Icon getIcon() {
    return (QueryFunction_SideTransform_Icon)this.getChild(SimpleSideTransformMenuPart.ICON);
  }

  public void setIcon(QueryFunction_SideTransform_Icon node) {
    super.setChild(SimpleSideTransformMenuPart.ICON, node);
  }

  public QueryFunction_SideTransform_Handler getHandler() {
    return (QueryFunction_SideTransform_Handler)this.getChild(SimpleSideTransformMenuPart.HANDLER);
  }

  public void setHandler(QueryFunction_SideTransform_Handler node) {
    super.setChild(SimpleSideTransformMenuPart.HANDLER, node);
  }


  public static SimpleSideTransformMenuPart newInstance(SModel sm, boolean init) {
    return (SimpleSideTransformMenuPart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.structure.SimpleSideTransformMenuPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SimpleSideTransformMenuPart newInstance(SModel sm) {
    return SimpleSideTransformMenuPart.newInstance(sm, false);
  }

}

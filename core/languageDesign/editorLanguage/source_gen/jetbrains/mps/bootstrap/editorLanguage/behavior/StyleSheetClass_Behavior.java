package jetbrains.mps.bootstrap.editorLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;

public class StyleSheetClass_Behavior {

  public static void init(SNode thisNode) {
  }

  public static String call_getConstantName_1213877260636(SNode thisNode) {
    return NameUtil.toConstantName(SPropertyOperations.getString(thisNode, "name"));
  }

  public static SNode call_getStyleSheet_1213877260644(SNode thisNode) {
    return SNodeOperations.getParent(thisNode);
  }

  public static SNode call_getItem_1219419377713(SNode thisNode, SNode item) {
    return null;
  }

}

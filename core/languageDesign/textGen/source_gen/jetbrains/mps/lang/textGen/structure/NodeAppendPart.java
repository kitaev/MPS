package jetbrains.mps.lang.textGen.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NodeAppendPart extends jetbrains.mps.lang.textGen.structure.AbstractAppendPart {
  public static final String concept = "jetbrains.mps.lang.textGen.structure.NodeAppendPart";
  public static final String WITH_INDENT = "withIndent";
  public static final String VALUE = "value";

  public NodeAppendPart(SNode node) {
    super(node);
  }

  public boolean getWithIndent() {
    return this.getBooleanProperty(NodeAppendPart.WITH_INDENT);
  }

  public void setWithIndent(boolean value) {
    this.setBooleanProperty(NodeAppendPart.WITH_INDENT, value);
  }

  public jetbrains.mps.baseLanguage.structure.Expression getValue() {
    return (jetbrains.mps.baseLanguage.structure.Expression)this.getChild(Expression.class, NodeAppendPart.VALUE);
  }

  public void setValue(jetbrains.mps.baseLanguage.structure.Expression node) {
    super.setChild(NodeAppendPart.VALUE, node);
  }


  public static NodeAppendPart newInstance(SModel sm, boolean init) {
    return (NodeAppendPart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.textGen.structure.NodeAppendPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NodeAppendPart newInstance(SModel sm) {
    return NodeAppendPart.newInstance(sm, false);
  }

}

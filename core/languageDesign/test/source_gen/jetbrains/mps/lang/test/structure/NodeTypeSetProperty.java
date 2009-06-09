package jetbrains.mps.lang.test.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.structure.Type;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NodeTypeSetProperty extends NodeProperty {
  public static final String concept = "jetbrains.mps.lang.test.structure.NodeTypeSetProperty";
  public static final String TYPE = "type";

  public NodeTypeSetProperty(SNode node) {
    super(node);
  }

  public int getTypesCount() {
    return this.getChildCount(NodeTypeSetProperty.TYPE);
  }

  public Iterator<Type> types() {
    return this.children(Type.class, NodeTypeSetProperty.TYPE);
  }

  public List<Type> getTypes() {
    return this.getChildren(Type.class, NodeTypeSetProperty.TYPE);
  }

  public void addType(Type node) {
    this.addChild(NodeTypeSetProperty.TYPE, node);
  }

  public void insertType(Type prev, Type node) {
    this.insertChild(prev, NodeTypeSetProperty.TYPE, node);
  }


  public static NodeTypeSetProperty newInstance(SModel sm, boolean init) {
    return (NodeTypeSetProperty)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.test.structure.NodeTypeSetProperty", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NodeTypeSetProperty newInstance(SModel sm) {
    return NodeTypeSetProperty.newInstance(sm, false);
  }

}

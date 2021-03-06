package jetbrains.mps.lang.test.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.NodeAttribute;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NodePropertiesContainer extends NodeAttribute {
  public static final String concept = "jetbrains.mps.lang.test.structure.NodePropertiesContainer";
  public static final String PROPERTIES = "properties";

  public NodePropertiesContainer(SNode node) {
    super(node);
  }

  public int getPropertiesesCount() {
    return this.getChildCount(NodePropertiesContainer.PROPERTIES);
  }

  public Iterator<NodeProperty> propertieses() {
    return this.children(NodeProperty.class, NodePropertiesContainer.PROPERTIES);
  }

  public List<NodeProperty> getPropertieses() {
    return this.getChildren(NodeProperty.class, NodePropertiesContainer.PROPERTIES);
  }

  public void addProperties(NodeProperty node) {
    this.addChild(NodePropertiesContainer.PROPERTIES, node);
  }

  public void insertProperties(NodeProperty prev, NodeProperty node) {
    this.insertChild(prev, NodePropertiesContainer.PROPERTIES, node);
  }

  public static NodePropertiesContainer newInstance(SModel sm, boolean init) {
    return (NodePropertiesContainer) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.test.structure.NodePropertiesContainer", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NodePropertiesContainer newInstance(SModel sm) {
    return NodePropertiesContainer.newInstance(sm, false);
  }
}

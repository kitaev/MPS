package jetbrains.mps.build.packaging.plugin;

/*Generated by MPS */

import jetbrains.mps.ide.projectPane.NamespaceTreeBuilder;

public class CheckBoxNamespaceNode extends CheckBoxNode<NamespaceData> implements NamespaceTreeBuilder.NamespaceNode {

  public CheckBoxNamespaceNode(NamespaceData data) {
    super(data, false);
  }

  public String getName() {
    return this.myData.getText();
  }

  public void setName(String name) {
    this.myData.setText(name);
  }

}

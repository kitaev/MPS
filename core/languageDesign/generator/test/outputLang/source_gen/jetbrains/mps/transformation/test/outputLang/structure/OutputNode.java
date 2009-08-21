package jetbrains.mps.transformation.test.outputLang.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class OutputNode extends BaseConcept {
  public static final String concept = "jetbrains.mps.transformation.test.outputLang.structure.OutputNode";
  public static final String TEXT = "text";
  public static final String OUTPUT_CHILD = "outputChild";

  public OutputNode(SNode node) {
    super(node);
  }

  public String getText() {
    return this.getProperty(OutputNode.TEXT);
  }

  public void setText(String value) {
    this.setProperty(OutputNode.TEXT, value);
  }

  public int getOutputChildsCount() {
    return this.getChildCount(OutputNode.OUTPUT_CHILD);
  }

  public Iterator<OutputNode> outputChilds() {
    return this.children(OutputNode.class, OutputNode.OUTPUT_CHILD);
  }

  public List<OutputNode> getOutputChilds() {
    return this.getChildren(OutputNode.class, OutputNode.OUTPUT_CHILD);
  }

  public void addOutputChild(OutputNode node) {
    this.addChild(OutputNode.OUTPUT_CHILD, node);
  }

  public void insertOutputChild(OutputNode prev, OutputNode node) {
    this.insertChild(prev, OutputNode.OUTPUT_CHILD, node);
  }

  public static OutputNode newInstance(SModel sm, boolean init) {
    return (OutputNode)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.transformation.test.outputLang.structure.OutputNode", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static OutputNode newInstance(SModel sm) {
    return OutputNode.newInstance(sm, false);
  }
}

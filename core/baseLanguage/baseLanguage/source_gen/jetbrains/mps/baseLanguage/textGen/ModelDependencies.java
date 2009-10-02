package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.logging.Logger;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.TreeSet;
import jetbrains.mps.smodel.SModel;
import java.util.Collections;
import org.jdom.Element;
import java.util.List;

public class ModelDependencies {
  private static final String DEPENDENCY = "dependency";
  private static final String DEPENDENCIES_ROOT = "dependenciesRoot";
  private static final Logger LOG = Logger.getLogger(ModelDependencies.class);

  private Set<RootDependencies> myDependencies = SetSequence.fromSet(new TreeSet<RootDependencies>());
  private SModel myModel;

  public ModelDependencies() {
  }

  public void addDependencies(RootDependencies newDependency) {
    SetSequence.fromSet(this.myDependencies).addElement(newDependency);
  }

  public Set<RootDependencies> getDependencies() {
    return Collections.unmodifiableSet(this.myDependencies);
  }

  public void setModel(SModel model) {
    this.myModel = model;
  }

  public SModel getModel() {
    return this.myModel;
  }

  public Element toXml() {
    Element root = new Element(DEPENDENCIES_ROOT);
    for (RootDependencies dependency : this.myDependencies) {
      Element e = new Element(DEPENDENCY);
      dependency.saveTo(e);
      root.addContent(e);
    }
    return root;
  }

  public static ModelDependencies fromXml(Element root) {
    ModelDependencies result = new ModelDependencies();
    for (Element e : ((List<Element>)root.getChildren(DEPENDENCY))) {
      result.addDependencies(new RootDependencies(e));
    }
    return result;
  }
}

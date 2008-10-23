package jetbrains.mps.build.packaging.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CompositePathComponent extends BaseConcept {
public    static final String concept = "jetbrains.mps.build.packaging.structure.CompositePathComponent";
public    static final String PATH = "path";

  public CompositePathComponent(SNode node) {
    super(node);
  }

  public int getPathsCount() {
    return this.getChildCount(CompositePathComponent.PATH);
  }

  public Iterator<PathComponent> paths() {
    return this.children(CompositePathComponent.PATH);
  }

  public List<PathComponent> getPaths() {
    return this.getChildren(CompositePathComponent.PATH);
  }

  public void addPath(PathComponent node) {
    this.addChild(CompositePathComponent.PATH, node);
  }

  public void insertPath(PathComponent prev, PathComponent node) {
    this.insertChild(prev, CompositePathComponent.PATH, node);
  }


  public static CompositePathComponent newInstance(SModel sm, boolean init) {
    return (CompositePathComponent)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.packaging.structure.CompositePathComponent", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CompositePathComponent newInstance(SModel sm) {
    return CompositePathComponent.newInstance(sm, false);
  }

}

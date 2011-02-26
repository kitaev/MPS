package jetbrains.mps.debug.customViewers.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.structure.IOperation;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class JavaValueOperation extends BaseConcept implements IOperation {
  public static final String concept = "jetbrains.mps.debug.customViewers.structure.JavaValueOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String _$ATTRIBUTE = "_$attribute";

  public JavaValueOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(JavaValueOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(JavaValueOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(JavaValueOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(JavaValueOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(JavaValueOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(JavaValueOperation.VIRTUAL_PACKAGE, value);
  }

  public int get_$attributesCount() {
    return this.getChildCount(JavaValueOperation._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, JavaValueOperation._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, JavaValueOperation._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(JavaValueOperation._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, JavaValueOperation._$ATTRIBUTE, node);
  }

  public static JavaValueOperation newInstance(SModel sm, boolean init) {
    return (JavaValueOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.debug.customViewers.structure.JavaValueOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static JavaValueOperation newInstance(SModel sm) {
    return JavaValueOperation.newInstance(sm, false);
  }
}

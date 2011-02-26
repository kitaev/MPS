package jetbrains.mps.lang.editor.editorTest.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BracesBlock extends TestBlockList implements IBaseTestBlock {
  public static final String concept = "jetbrains.mps.lang.editor.editorTest.structure.BracesBlock";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String _$ATTRIBUTE = "_$attribute";

  public BracesBlock(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(BracesBlock.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(BracesBlock.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(BracesBlock.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(BracesBlock.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(BracesBlock.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(BracesBlock.VIRTUAL_PACKAGE, value);
  }

  public int get_$attributesCount() {
    return this.getChildCount(BracesBlock._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, BracesBlock._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, BracesBlock._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(BracesBlock._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, BracesBlock._$ATTRIBUTE, node);
  }

  public static BracesBlock newInstance(SModel sm, boolean init) {
    return (BracesBlock) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.editorTest.structure.BracesBlock", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BracesBlock newInstance(SModel sm) {
    return BracesBlock.newInstance(sm, false);
  }
}

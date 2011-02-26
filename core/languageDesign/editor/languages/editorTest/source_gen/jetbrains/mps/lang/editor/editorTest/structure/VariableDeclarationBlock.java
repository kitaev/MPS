package jetbrains.mps.lang.editor.editorTest.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class VariableDeclarationBlock extends BaseConcept implements INamedConcept, IBaseTestBlock {
  public static final String concept = "jetbrains.mps.lang.editor.editorTest.structure.VariableDeclarationBlock";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String _$ATTRIBUTE = "_$attribute";

  public VariableDeclarationBlock(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(VariableDeclarationBlock.NAME);
  }

  public void setName(String value) {
    this.setProperty(VariableDeclarationBlock.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(VariableDeclarationBlock.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(VariableDeclarationBlock.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(VariableDeclarationBlock.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(VariableDeclarationBlock.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(VariableDeclarationBlock.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(VariableDeclarationBlock.VIRTUAL_PACKAGE, value);
  }

  public int get_$attributesCount() {
    return this.getChildCount(VariableDeclarationBlock._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, VariableDeclarationBlock._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, VariableDeclarationBlock._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(VariableDeclarationBlock._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, VariableDeclarationBlock._$ATTRIBUTE, node);
  }

  public static VariableDeclarationBlock newInstance(SModel sm, boolean init) {
    return (VariableDeclarationBlock) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.editorTest.structure.VariableDeclarationBlock", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static VariableDeclarationBlock newInstance(SModel sm) {
    return VariableDeclarationBlock.newInstance(sm, false);
  }
}

package jetbrains.mps.build.packaging.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.lang.core.structure.Attribute;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Block extends BaseConcept implements INamedConcept, IMacroHolder, IVariableHolder {
  public static final String concept = "jetbrains.mps.build.packaging.structure.Block";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String LAYOUT = "layout";
  public static final String ENTRY = "entry";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";
  public static final String MACRO = "macro";

  public Block(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(Block.NAME);
  }

  public void setName(String value) {
    this.setProperty(Block.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(Block.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(Block.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(Block.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(Block.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(Block.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(Block.VIRTUAL_PACKAGE, value);
  }

  public Layout getLayout() {
    return (Layout) this.getReferent(Layout.class, Block.LAYOUT);
  }

  public void setLayout(Layout node) {
    super.setReferent(Block.LAYOUT, node);
  }

  public int getEntriesCount() {
    return this.getChildCount(Block.ENTRY);
  }

  public Iterator<AbstractProjectComponent> entries() {
    return this.children(AbstractProjectComponent.class, Block.ENTRY);
  }

  public List<AbstractProjectComponent> getEntries() {
    return this.getChildren(AbstractProjectComponent.class, Block.ENTRY);
  }

  public void addEntry(AbstractProjectComponent node) {
    this.addChild(Block.ENTRY, node);
  }

  public void insertEntry(AbstractProjectComponent prev, AbstractProjectComponent node) {
    this.insertChild(prev, Block.ENTRY, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(Block.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, Block.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, Block.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(Block.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, Block.SMODEL_ATTRIBUTE, node);
  }

  public int getMacrosCount() {
    return this.getChildCount(Block.MACRO);
  }

  public Iterator<Macro> macros() {
    return this.children(Macro.class, Block.MACRO);
  }

  public List<Macro> getMacros() {
    return this.getChildren(Macro.class, Block.MACRO);
  }

  public void addMacro(Macro node) {
    this.addChild(Block.MACRO, node);
  }

  public void insertMacro(Macro prev, Macro node) {
    this.insertChild(prev, Block.MACRO, node);
  }

  public static Block newInstance(SModel sm, boolean init) {
    return (Block) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.packaging.structure.Block", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Block newInstance(SModel sm) {
    return Block.newInstance(sm, false);
  }
}

package jetbrains.mps.xml.deprecated.structure;

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

public class Document extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.xml.deprecated.structure.Document";
  public static final String EXTENSION = "extension";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String DOCTYPE = "doctype";
  public static final String ROOT_ELEMENT = "rootElement";
  public static final String _$ATTRIBUTE = "_$attribute";

  public Document(SNode node) {
    super(node);
  }

  public String getExtension() {
    return this.getProperty(Document.EXTENSION);
  }

  public void setExtension(String value) {
    this.setProperty(Document.EXTENSION, value);
  }

  public String getName() {
    return this.getProperty(Document.NAME);
  }

  public void setName(String value) {
    this.setProperty(Document.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(Document.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(Document.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(Document.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(Document.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(Document.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(Document.VIRTUAL_PACKAGE, value);
  }

  public DocumentTypeDeclaration getDoctype() {
    return (DocumentTypeDeclaration) this.getChild(DocumentTypeDeclaration.class, Document.DOCTYPE);
  }

  public void setDoctype(DocumentTypeDeclaration node) {
    super.setChild(Document.DOCTYPE, node);
  }

  public Element getRootElement() {
    return (Element) this.getChild(Element.class, Document.ROOT_ELEMENT);
  }

  public void setRootElement(Element node) {
    super.setChild(Document.ROOT_ELEMENT, node);
  }

  public int get_$attributesCount() {
    return this.getChildCount(Document._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, Document._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, Document._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(Document._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, Document._$ATTRIBUTE, node);
  }

  public static Document newInstance(SModel sm, boolean init) {
    return (Document) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.xml.deprecated.structure.Document", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Document newInstance(SModel sm) {
    return Document.newInstance(sm, false);
  }
}

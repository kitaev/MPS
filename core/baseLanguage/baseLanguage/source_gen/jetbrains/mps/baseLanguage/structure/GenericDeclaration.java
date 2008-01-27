package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import java.util.List;

public class GenericDeclaration extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.GenericDeclaration";
  public static String TYPE_VARIABLE_DECLARATION = "typeVariableDeclaration";
  public static String NAME = "name";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";

  public  GenericDeclaration(SNode node) {
    super(node);
  }

  public static GenericDeclaration newInstance(SModel sm, boolean init) {
    return (GenericDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.GenericDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GenericDeclaration newInstance(SModel sm) {
    return GenericDeclaration.newInstance(sm, false);
  }


  public int getTypeVariableDeclarationsCount() {
    return this.getChildCount(GenericDeclaration.TYPE_VARIABLE_DECLARATION);
  }

  public Iterator<TypeVariableDeclaration> typeVariableDeclarations() {
    return this.children(GenericDeclaration.TYPE_VARIABLE_DECLARATION);
  }

  public List<TypeVariableDeclaration> getTypeVariableDeclarations() {
    return this.getChildren(GenericDeclaration.TYPE_VARIABLE_DECLARATION);
  }

  public void addTypeVariableDeclaration(TypeVariableDeclaration node) {
    this.addChild(GenericDeclaration.TYPE_VARIABLE_DECLARATION, node);
  }

  public void insertTypeVariableDeclaration(TypeVariableDeclaration prev, TypeVariableDeclaration node) {
    this.insertChild(prev, GenericDeclaration.TYPE_VARIABLE_DECLARATION, node);
  }

  public String getName() {
    return this.getProperty(GenericDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(GenericDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(GenericDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(GenericDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(GenericDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(GenericDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(GenericDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(GenericDeclaration.VIRTUAL_PACKAGE, value);
  }

}

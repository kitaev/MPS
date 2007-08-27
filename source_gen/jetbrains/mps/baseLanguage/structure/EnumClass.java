package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import java.util.List;

public class EnumClass extends ClassConcept {
  public static String ENUM_CONSTANT = "enumConstant";
  public static String NAME = "name";

  public  EnumClass(SNode node) {
    super(node);
  }

  public static EnumClass newInstance(SModel sm, boolean init) {
    return (EnumClass)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.EnumClass", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static EnumClass newInstance(SModel sm) {
    return EnumClass.newInstance(sm, false);
  }


  public int getEnumConstantsCount() {
    return this.getChildCount(EnumClass.ENUM_CONSTANT);
  }

  public Iterator<EnumConstantDeclaration> enumConstants() {
    return this.children(EnumClass.ENUM_CONSTANT);
  }

  public List<EnumConstantDeclaration> getEnumConstants() {
    return this.getChildren(EnumClass.ENUM_CONSTANT);
  }

  public void addEnumConstant(EnumConstantDeclaration node) {
    this.addChild(EnumClass.ENUM_CONSTANT, node);
  }

  public void insertEnumConstant(EnumConstantDeclaration prev, EnumConstantDeclaration node) {
    this.insertChild(prev, EnumClass.ENUM_CONSTANT, node);
  }

  public String getName() {
    return this.getProperty(EnumClass.NAME);
  }

  public void setName(String value) {
    this.setProperty(EnumClass.NAME, value);
  }

}

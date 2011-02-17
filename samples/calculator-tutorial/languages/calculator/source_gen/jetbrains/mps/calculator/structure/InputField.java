package jetbrains.mps.calculator.structure;

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

public class InputField extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.calculator.structure.InputField";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String _$ATTRIBUTE = "_$attribute";

  public InputField(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(InputField.NAME);
  }

  public void setName(String value) {
    this.setProperty(InputField.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(InputField.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(InputField.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(InputField.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(InputField.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(InputField.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(InputField.VIRTUAL_PACKAGE, value);
  }

  public int get_$attributesCount() {
    return this.getChildCount(InputField._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, InputField._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, InputField._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(InputField._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, InputField._$ATTRIBUTE, node);
  }

  public static InputField newInstance(SModel sm, boolean init) {
    return (InputField) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.calculator.structure.InputField", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InputField newInstance(SModel sm) {
    return InputField.newInstance(sm, false);
  }
}

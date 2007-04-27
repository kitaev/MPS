package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.core.structure.NamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class VariableDeclaration extends NamedConcept {
  public static String TYPE = "type";
  public static String INITIALIZER = "initializer";
  public static String NAME = "name";
  public static String IS_FINAL = "isFinal";

  public  VariableDeclaration(SNode node) {
    super(node);
  }

  public static VariableDeclaration newInstance(SModel sm, boolean init) {
    return (VariableDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.VariableDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static VariableDeclaration newInstance(SModel sm) {
    return VariableDeclaration.newInstance(sm, false);
  }

  public Type getType() {
    return (Type)this.getChild(VariableDeclaration.TYPE);
  }
  public void setType(Type node) {
    super.setChild(VariableDeclaration.TYPE, node);
  }
  public Expression getInitializer() {
    return (Expression)this.getChild(VariableDeclaration.INITIALIZER);
  }
  public void setInitializer(Expression node) {
    super.setChild(VariableDeclaration.INITIALIZER, node);
  }
  public String getName() {
    return this.getProperty(VariableDeclaration.NAME);
  }
  public void setName(String value) {
    this.setProperty(VariableDeclaration.NAME, value);
  }
  public boolean getIsFinal() {
    return this.getBooleanProperty(VariableDeclaration.IS_FINAL);
  }
  public void setIsFinal(boolean value) {
    this.setBooleanProperty(VariableDeclaration.IS_FINAL, value);
  }
}

package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.NamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.structure.Expression;
import java.util.List;

public class EnumConstantDeclaration extends NamedConcept {
  public static String ACTUAL_ARGUMENT = "actualArgument";
  public static String NAME = "name";

  public  EnumConstantDeclaration(SNode node) {
    super(node);
  }

  public static EnumConstantDeclaration newInstance(SModel sm, boolean init) {
    return (EnumConstantDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.EnumConstantDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static EnumConstantDeclaration newInstance(SModel sm) {
    return EnumConstantDeclaration.newInstance(sm, false);
  }

  public int getActualArgumentsCount() {
    return this.getChildCount(EnumConstantDeclaration.ACTUAL_ARGUMENT);
  }
  public Iterator<Expression> actualArguments() {
    return this.children(EnumConstantDeclaration.ACTUAL_ARGUMENT);
  }
  public List<Expression> getActualArguments() {
    return this.getChildren(EnumConstantDeclaration.ACTUAL_ARGUMENT);
  }
  public void addActualArgument(Expression node) {
    this.addChild(EnumConstantDeclaration.ACTUAL_ARGUMENT, node);
  }
  public void insertActualArgument(Expression prev, Expression node) {
    this.insertChild(prev, EnumConstantDeclaration.ACTUAL_ARGUMENT, node);
  }
  public String getName() {
    return this.getProperty(EnumConstantDeclaration.NAME);
  }
  public void setName(String value) {
    this.setProperty(EnumConstantDeclaration.NAME, value);
  }
}

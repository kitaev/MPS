package jetbrains.mps.baseLanguage.closures.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.structure.Expression;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InvokeFunctionOperation extends jetbrains.mps.lang.core.structure.BaseConcept implements jetbrains.mps.baseLanguage.structure.IOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.closures.structure.InvokeFunctionOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String PARAMETER = "parameter";

  public InvokeFunctionOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(InvokeFunctionOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(InvokeFunctionOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(InvokeFunctionOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(InvokeFunctionOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(InvokeFunctionOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(InvokeFunctionOperation.VIRTUAL_PACKAGE, value);
  }

  public int getParametersCount() {
    return this.getChildCount(InvokeFunctionOperation.PARAMETER);
  }

  public Iterator<jetbrains.mps.baseLanguage.structure.Expression> parameters() {
    return this.children(Expression.class, InvokeFunctionOperation.PARAMETER);
  }

  public List<jetbrains.mps.baseLanguage.structure.Expression> getParameters() {
    return this.getChildren(Expression.class, InvokeFunctionOperation.PARAMETER);
  }

  public void addParameter(jetbrains.mps.baseLanguage.structure.Expression node) {
    this.addChild(InvokeFunctionOperation.PARAMETER, node);
  }

  public void insertParameter(jetbrains.mps.baseLanguage.structure.Expression prev, jetbrains.mps.baseLanguage.structure.Expression node) {
    this.insertChild(prev, InvokeFunctionOperation.PARAMETER, node);
  }


  public static InvokeFunctionOperation newInstance(SModel sm, boolean init) {
    return (InvokeFunctionOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.InvokeFunctionOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InvokeFunctionOperation newInstance(SModel sm) {
    return InvokeFunctionOperation.newInstance(sm, false);
  }

}

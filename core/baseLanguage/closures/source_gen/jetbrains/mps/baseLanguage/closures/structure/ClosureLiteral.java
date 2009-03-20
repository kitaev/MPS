package jetbrains.mps.baseLanguage.closures.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.baseLanguage.structure.IStatementListContainer;
import jetbrains.mps.baseLanguage.structure.IContainsStatementList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.StatementList;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.structure.ParameterDeclaration;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ClosureLiteral extends Expression implements IStatementListContainer, IContainsStatementList {
  public static final String concept = "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String BODY = "body";
  public static final String PARAMETER = "parameter";

  public ClosureLiteral(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ClosureLiteral.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ClosureLiteral.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ClosureLiteral.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ClosureLiteral.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ClosureLiteral.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ClosureLiteral.VIRTUAL_PACKAGE, value);
  }

  public StatementList getBody() {
    return (StatementList)this.getChild(StatementList.class, ClosureLiteral.BODY);
  }

  public void setBody(StatementList node) {
    super.setChild(ClosureLiteral.BODY, node);
  }

  public int getParametersCount() {
    return this.getChildCount(ClosureLiteral.PARAMETER);
  }

  public Iterator<ParameterDeclaration> parameters() {
    return this.children(ParameterDeclaration.class, ClosureLiteral.PARAMETER);
  }

  public List<ParameterDeclaration> getParameters() {
    return this.getChildren(ParameterDeclaration.class, ClosureLiteral.PARAMETER);
  }

  public void addParameter(ParameterDeclaration node) {
    this.addChild(ClosureLiteral.PARAMETER, node);
  }

  public void insertParameter(ParameterDeclaration prev, ParameterDeclaration node) {
    this.insertChild(prev, ClosureLiteral.PARAMETER, node);
  }


  public static ClosureLiteral newInstance(SModel sm, boolean init) {
    return (ClosureLiteral)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ClosureLiteral newInstance(SModel sm) {
    return ClosureLiteral.newInstance(sm, false);
  }

}

package jetbrains.mps.baseLanguage.dates.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConditionalFormatToken extends FormatToken implements INamedConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.dates.structure.ConditionalFormatToken";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String CONDITION_PAIR = "conditionPair";

  public ConditionalFormatToken(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(ConditionalFormatToken.NAME);
  }

  public void setName(String value) {
    this.setProperty(ConditionalFormatToken.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(ConditionalFormatToken.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ConditionalFormatToken.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ConditionalFormatToken.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ConditionalFormatToken.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ConditionalFormatToken.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ConditionalFormatToken.VIRTUAL_PACKAGE, value);
  }

  public int getConditionPairsCount() {
    return this.getChildCount(ConditionalFormatToken.CONDITION_PAIR);
  }

  public Iterator<TokenConditionalPair> conditionPairs() {
    return this.children(TokenConditionalPair.class, ConditionalFormatToken.CONDITION_PAIR);
  }

  public List<TokenConditionalPair> getConditionPairs() {
    return this.getChildren(TokenConditionalPair.class, ConditionalFormatToken.CONDITION_PAIR);
  }

  public void addConditionPair(TokenConditionalPair node) {
    this.addChild(ConditionalFormatToken.CONDITION_PAIR, node);
  }

  public void insertConditionPair(TokenConditionalPair prev, TokenConditionalPair node) {
    this.insertChild(prev, ConditionalFormatToken.CONDITION_PAIR, node);
  }

  public static ConditionalFormatToken newInstance(SModel sm, boolean init) {
    return (ConditionalFormatToken)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.ConditionalFormatToken", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConditionalFormatToken newInstance(SModel sm) {
    return ConditionalFormatToken.newInstance(sm, false);
  }
}

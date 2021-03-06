package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class HereStringRedirection extends Redirection implements IToWordRedirection {
  public static final String concept = "jetbrains.mps.bash.structure.HereStringRedirection";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String WORD = "word";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public HereStringRedirection(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(HereStringRedirection.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(HereStringRedirection.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(HereStringRedirection.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(HereStringRedirection.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(HereStringRedirection.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(HereStringRedirection.VIRTUAL_PACKAGE, value);
  }

  public GeneralizedWord getWord() {
    return (GeneralizedWord) this.getChild(GeneralizedWord.class, HereStringRedirection.WORD);
  }

  public void setWord(GeneralizedWord node) {
    super.setChild(HereStringRedirection.WORD, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(HereStringRedirection.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, HereStringRedirection.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, HereStringRedirection.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(HereStringRedirection.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, HereStringRedirection.SMODEL_ATTRIBUTE, node);
  }

  public static HereStringRedirection newInstance(SModel sm, boolean init) {
    return (HereStringRedirection) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.HereStringRedirection", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static HereStringRedirection newInstance(SModel sm) {
    return HereStringRedirection.newInstance(sm, false);
  }
}

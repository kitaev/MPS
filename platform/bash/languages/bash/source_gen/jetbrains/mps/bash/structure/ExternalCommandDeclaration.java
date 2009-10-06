package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ExternalCommandDeclaration extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.bash.structure.ExternalCommandDeclaration";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String OPTION_DECLARATION = "optionDeclaration";

  public ExternalCommandDeclaration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(ExternalCommandDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(ExternalCommandDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(ExternalCommandDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ExternalCommandDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ExternalCommandDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ExternalCommandDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ExternalCommandDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ExternalCommandDeclaration.VIRTUAL_PACKAGE, value);
  }

  public int getOptionDeclarationsCount() {
    return this.getChildCount(ExternalCommandDeclaration.OPTION_DECLARATION);
  }

  public Iterator<ExternalOptionDeclaration> optionDeclarations() {
    return this.children(ExternalOptionDeclaration.class, ExternalCommandDeclaration.OPTION_DECLARATION);
  }

  public List<ExternalOptionDeclaration> getOptionDeclarations() {
    return this.getChildren(ExternalOptionDeclaration.class, ExternalCommandDeclaration.OPTION_DECLARATION);
  }

  public void addOptionDeclaration(ExternalOptionDeclaration node) {
    this.addChild(ExternalCommandDeclaration.OPTION_DECLARATION, node);
  }

  public void insertOptionDeclaration(ExternalOptionDeclaration prev, ExternalOptionDeclaration node) {
    this.insertChild(prev, ExternalCommandDeclaration.OPTION_DECLARATION, node);
  }

  public static ExternalCommandDeclaration newInstance(SModel sm, boolean init) {
    return (ExternalCommandDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.ExternalCommandDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ExternalCommandDeclaration newInstance(SModel sm) {
    return ExternalCommandDeclaration.newInstance(sm, false);
  }
}

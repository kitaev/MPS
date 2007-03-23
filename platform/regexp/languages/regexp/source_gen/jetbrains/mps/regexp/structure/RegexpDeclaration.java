package jetbrains.mps.regexp.structure;

/*Generated by MPS  */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RegexpDeclaration extends BaseConcept implements INamedConcept {
  public static String DESCRIPTION = "description";
  public static String NAME = "name";
  public static String REGEXP = "regexp";

  public  RegexpDeclaration(SNode node) {
    super(node);
  }

  public static RegexpDeclaration newInstance(SModel sm, boolean init) {
    return (RegexpDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.regexp.RegexpDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static RegexpDeclaration newInstance(SModel sm) {
    return RegexpDeclaration.newInstance(sm, false);
  }

  public String getDescription() {
    return this.getProperty(RegexpDeclaration.DESCRIPTION);
  }
  public void setDescription(String value) {
    this.setProperty(RegexpDeclaration.DESCRIPTION, value);
  }
  public String getName() {
    return this.getProperty(RegexpDeclaration.NAME);
  }
  public void setName(String value) {
    this.setProperty(RegexpDeclaration.NAME, value);
  }
  public Regexp getRegexp() {
    return (Regexp)this.getChild(RegexpDeclaration.REGEXP);
  }
  public void setRegexp(Regexp node) {
    super.setChild(RegexpDeclaration.REGEXP, node);
  }
}

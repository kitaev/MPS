package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AppendingOutputErrorRedirection extends Redirection implements IToWordRedirection {
  public static final String concept = "jetbrains.mps.bash.structure.AppendingOutputErrorRedirection";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String WORD = "word";

  public AppendingOutputErrorRedirection(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(AppendingOutputErrorRedirection.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(AppendingOutputErrorRedirection.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(AppendingOutputErrorRedirection.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(AppendingOutputErrorRedirection.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(AppendingOutputErrorRedirection.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(AppendingOutputErrorRedirection.VIRTUAL_PACKAGE, value);
  }

  public GeneralizedWord getWord() {
    return (GeneralizedWord)this.getChild(GeneralizedWord.class, AppendingOutputErrorRedirection.WORD);
  }

  public void setWord(GeneralizedWord node) {
    super.setChild(AppendingOutputErrorRedirection.WORD, node);
  }

  public static AppendingOutputErrorRedirection newInstance(SModel sm, boolean init) {
    return (AppendingOutputErrorRedirection)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.AppendingOutputErrorRedirection", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AppendingOutputErrorRedirection newInstance(SModel sm) {
    return AppendingOutputErrorRedirection.newInstance(sm, false);
  }
}

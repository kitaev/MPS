package jetbrains.mps.uiLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class StandardDialogButton extends BaseConcept {
  public static final String concept = "jetbrains.mps.uiLanguage.structure.StandardDialogButton";
  public static final String TEXT = "text";
  public static final String IS_DEFAULT = "isDefault";
  public static final String HANDLER = "handler";

  public StandardDialogButton(SNode node) {
    super(node);
  }

  public String getText() {
    return this.getProperty(StandardDialogButton.TEXT);
  }

  public void setText(String value) {
    this.setProperty(StandardDialogButton.TEXT, value);
  }

  public boolean getIsDefault() {
    return this.getBooleanProperty(StandardDialogButton.IS_DEFAULT);
  }

  public void setIsDefault(boolean value) {
    this.setBooleanProperty(StandardDialogButton.IS_DEFAULT, value);
  }

  public Expression getHandler() {
    return (Expression)this.getChild(Expression.class, StandardDialogButton.HANDLER);
  }

  public void setHandler(Expression node) {
    super.setChild(StandardDialogButton.HANDLER, node);
  }

  public static StandardDialogButton newInstance(SModel sm, boolean init) {
    return (StandardDialogButton)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.uiLanguage.structure.StandardDialogButton", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static StandardDialogButton newInstance(SModel sm) {
    return StandardDialogButton.newInstance(sm, false);
  }
}

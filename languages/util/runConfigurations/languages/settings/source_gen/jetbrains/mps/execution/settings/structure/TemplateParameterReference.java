package jetbrains.mps.execution.settings.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.VariableReference;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TemplateParameterReference extends VariableReference {
  public static final String concept = "jetbrains.mps.execution.settings.structure.TemplateParameterReference";

  public TemplateParameterReference(SNode node) {
    super(node);
  }

  public TemplateParameter getConstructorParameterDeclaration() {
    return this.ensureAdapter(TemplateParameter.class, "variableDeclaration", this.getVariableDeclaration());
  }

  public void setConstructorParameterDeclaration(TemplateParameter node) {
    this.setVariableDeclaration(node);
  }

  public static TemplateParameterReference newInstance(SModel sm, boolean init) {
    return (TemplateParameterReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.execution.settings.structure.TemplateParameterReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TemplateParameterReference newInstance(SModel sm) {
    return TemplateParameterReference.newInstance(sm, false);
  }
}

package jetbrains.mps.baseLanguageInternal.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Type;

public class InternalVariableReference extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguageInternal.structure.InternalVariableReference";
  public static String NAME = "name";
  public static String TYPE = "type";

  public InternalVariableReference(SNode node) {
    super(node);
  }

  public static InternalVariableReference newInstance(SModel sm, boolean init) {
    return (InternalVariableReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguageInternal.structure.InternalVariableReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InternalVariableReference newInstance(SModel sm) {
    return InternalVariableReference.newInstance(sm, false);
  }


  public String getName() {
    return this.getProperty(InternalVariableReference.NAME);
  }

  public void setName(String value) {
    this.setProperty(InternalVariableReference.NAME, value);
  }

  public Type getType() {
    return (Type) this.getChild(InternalVariableReference.TYPE);
  }

  public void setType(Type node) {
    super.setChild(InternalVariableReference.TYPE, node);
  }

}

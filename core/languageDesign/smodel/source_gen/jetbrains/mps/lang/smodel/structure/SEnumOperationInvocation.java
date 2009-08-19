package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.EnumerationDataTypeDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SEnumOperationInvocation extends Expression {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.SEnumOperationInvocation";
  public static final String ENUM_DECLARATION = "enumDeclaration";
  public static final String OPERATION = "operation";

  public SEnumOperationInvocation(SNode node) {
    super(node);
  }

  public EnumerationDataTypeDeclaration getEnumDeclaration() {
    return (EnumerationDataTypeDeclaration)this.getReferent(EnumerationDataTypeDeclaration.class, SEnumOperationInvocation.ENUM_DECLARATION);
  }

  public void setEnumDeclaration(EnumerationDataTypeDeclaration node) {
    super.setReferent(SEnumOperationInvocation.ENUM_DECLARATION, node);
  }

  public SEnumOperation getOperation() {
    return (SEnumOperation)this.getChild(SEnumOperation.class, SEnumOperationInvocation.OPERATION);
  }

  public void setOperation(SEnumOperation node) {
    super.setChild(SEnumOperationInvocation.OPERATION, node);
  }

  public static SEnumOperationInvocation newInstance(SModel sm, boolean init) {
    return (SEnumOperationInvocation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SEnumOperationInvocation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SEnumOperationInvocation newInstance(SModel sm) {
    return SEnumOperationInvocation.newInstance(sm, false);
  }
}

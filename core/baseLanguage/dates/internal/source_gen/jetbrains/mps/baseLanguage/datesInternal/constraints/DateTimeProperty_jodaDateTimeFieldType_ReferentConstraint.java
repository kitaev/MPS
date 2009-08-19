package jetbrains.mps.baseLanguage.datesInternal.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.baseLanguage.search.ClassifierVisibleStaticMembersScope;
import jetbrains.mps.generator.JavaModelUtil_new;
import org.joda.time.DateTimeFieldType;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;

public class DateTimeProperty_jodaDateTimeFieldType_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public DateTimeProperty_jodaDateTimeFieldType_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.datesInternal.structure.DateTimeProperty", "jodaDateTimeFieldType", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.datesInternal.structure.DateTimeProperty", "jodaDateTimeFieldType");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return new ClassifierVisibleStaticMembersScope(JavaModelUtil_new.findClassifier(DateTimeFieldType.class), _context.getEnclosingNode(), IClassifiersSearchScope.STATIC_METHOD);
  }
}

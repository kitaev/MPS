package jetbrains.mps.baseLanguage.dates.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSetEventHandler;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class DateTimePropertyFormatToken_dateTimePropertyFormatConfiguration_ReferentConstraint implements IModelConstraints, INodeReferentSetEventHandler {

  public DateTimePropertyFormatToken_dateTimePropertyFormatConfiguration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSetEventHandler("jetbrains.mps.baseLanguage.dates.structure.DateTimePropertyFormatToken", "dateTimePropertyFormatConfiguration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSetEventHandler("jetbrains.mps.baseLanguage.dates.structure.DateTimePropertyFormatToken", "dateTimePropertyFormatConfiguration");
  }

  public void processReferentSetEvent(SNode referenceNode, SNode oldReferentNode, SNode newReferentNode, IScope scope) {
    if (newReferentNode != oldReferentNode) {
      SLinkOperations.setTarget(referenceNode, "dateTimePropertyFormatType", DateTimePropertFormatTokenUtil.getDefaultFormatType(referenceNode), false);
    }
  }

}

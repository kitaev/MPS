package jetbrains.mps.ide.uiLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;

public class BehaviorAspectDescriptor extends DescriptorProvider<BehaviorDescriptor> {
  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch ((fqName).hashCode()) {
      case 151769839:
        return new IDEDialog_BehaviorDescriptor();
      case -1952532735:
        return new IDEDialogButton_BehaviorDescriptor();
      case -1972415012:
        return new DisposeDialogExpression_BehaviorDescriptor();
      case 1305871817:
        return new ReportErrorExpression_BehaviorDescriptor();
      case -1756921597:
        return new DialogExpression_BehaviorDescriptor();
      case 452865592:
        return new DialogDimensions_BehaviorDescriptor();
      case 924388382:
        return new ReportErrorStatement_BehaviorDescriptor();
      case 1927015851:
        return new DisposeDialogStatement_BehaviorDescriptor();
      default:
        return null;
    }
  }
}

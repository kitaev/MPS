package jetbrains.mps.samples.agreementLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.ConstraintsDescriptor;
import jetbrains.mps.smodel.structure.DataHolderConstraintsDescriptor;
import jetbrains.mps.smodel.structure.EmptyConstraintsDataHolder;

public class ConstraintsAspectDescriptor extends DescriptorProvider<ConstraintsDescriptor> {
  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch ((fqName).hashCode()) {
      case -1715758101:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.agreementLanguage.structure.Plan"));
      case -1643669265:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.agreementLanguage.structure.Value"));
      case -1658750440:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.agreementLanguage.structure.Event"));
      case 496321613:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.agreementLanguage.structure.Quantity"));
      case 777938137:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.agreementLanguage.structure.TemporalProperty"));
      case -1716125584:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.agreementLanguage.structure.Date"));
      case 990754180:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.agreementLanguage.structure.QuantityTemporalProperty"));
      case -582045326:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.agreementLanguage.structure.EventType"));
      case 684791988:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.agreementLanguage.structure.EventVariable"));
      case -405423725:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.agreementLanguage.structure.PostingRuleTemporalProperty"));
      case -324188580:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.agreementLanguage.structure.PostingRule"));
      case -273965051:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.agreementLanguage.structure.AccountType"));
      case 416993527:
        return new DataHolderConstraintsDescriptor(new EventVariableReference_Constraints());
      case 635527964:
        return new DataHolderConstraintsDescriptor(new ValueReference_Constraints());
      case -846762783:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.agreementLanguage.structure.AgreementDeclarations"));
      case -863414623:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.agreementLanguage.structure.Date_Past"));
      case -1080551278:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.agreementLanguage.structure.Date_Future"));
      default:
        return null;
    }
  }
}

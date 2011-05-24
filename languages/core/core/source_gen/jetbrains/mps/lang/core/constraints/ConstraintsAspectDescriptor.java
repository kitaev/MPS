package jetbrains.mps.lang.core.constraints;

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
      case 965148823:
        return new DataHolderConstraintsDescriptor(new BaseConcept_Constraints());
      case 2115426872:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.core.structure.INamedConcept"));
      case 2101294673:
        return new DataHolderConstraintsDescriptor(new IResolveInfo_Constraints());
      case 491166122:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.core.structure.IWrapper"));
      case -702055753:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.core.structure.IDeprecatable"));
      case -826443816:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.core.structure.IContainer"));
      case -1037801085:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.core.structure.IType"));
      case -1774624244:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.core.structure.IMetaLevelChanger"));
      case -98730688:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.core.structure.ExportScope"));
      case 1677536201:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.core.structure.ExportScopePublic"));
      case -953098245:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.core.structure.ExportScopeNamespace"));
      case 1586175948:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.core.structure.ExportScopeModule"));
      case 877743324:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.core.structure.Attribute"));
      case -1983711742:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.core.structure.LinkAttribute"));
      case 172703994:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.core.structure.NodeAttribute"));
      case 1806896775:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.core.structure.PropertyAttribute"));
      default:
        return null;
    }
  }
}

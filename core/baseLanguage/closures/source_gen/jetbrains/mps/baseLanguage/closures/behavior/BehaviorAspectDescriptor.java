package jetbrains.mps.baseLanguage.closures.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;

public class BehaviorAspectDescriptor extends DescriptorProvider<BehaviorDescriptor> {
  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch ((fqName).hashCode()) {
      case 131995956:
        return new FunctionType_BehaviorDescriptor();
      case 1285562922:
        return new InvokeFunctionExpression_BehaviorDescriptor();
      case 258022262:
        return new ClosureLiteral_BehaviorDescriptor();
      case -1356334542:
        return new InvokeExpression_BehaviorDescriptor();
      case -1617564188:
        return new YieldStatement_BehaviorDescriptor();
      case 1427710889:
        // interface or abstract concept behavior jetbrains.mps.baseLanguage.closures.structure.UnboundClosureParameterDeclaration 
        return null;
      case -28029225:
        return new PairOfInts_BehaviorDescriptor();
      case -1786475948:
        return new StringPropertyHolder_BehaviorDescriptor();
      case 1069353877:
        return new InvokeFunctionOperation_BehaviorDescriptor();
      case 228589625:
        return new YieldAllStatement_BehaviorDescriptor();
      case 1139512650:
        return new UnrestrictedClosureLiteral_BehaviorDescriptor();
      case 28365227:
        return new ClosureControlStatement_BehaviorDescriptor();
      case 1681761519:
        return new ControlClosureLiteral_BehaviorDescriptor();
      case 738468150:
        return new ControlAbstractionContainer_BehaviorDescriptor();
      case -1237847825:
        return new ControlAbstractionDeclaration_BehaviorDescriptor();
      case -760940536:
        return new UnrestrictedFunctionType_BehaviorDescriptor();
      case 1385843753:
        return new CompactInvokeFunctionExpression_BehaviorDescriptor();
      case 1246863903:
        return new FunctionMethodDeclaration_BehaviorDescriptor();
      case -1521674122:
        return new AbstractFunctionType_BehaviorDescriptor();
      default:
        return null;
    }
  }
}

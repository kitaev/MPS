package jetbrains.mps.baseLanguageInternal.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;

public class BehaviorAspectDescriptor extends DescriptorProvider<BehaviorDescriptor> {
  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch ((fqName).hashCode()) {
      case -1776008649:
        return new InternalStaticMethodCall_BehaviorDescriptor();
      case -748575031:
        return new InternalStaticFieldReference_BehaviorDescriptor();
      case -1202134450:
        return new InternalNewExpression_BehaviorDescriptor();
      case -181962325:
        return new InternalPartialInstanceMethodCall_BehaviorDescriptor();
      case -332116314:
        return new InternalClassExpression_BehaviorDescriptor();
      case 1164317125:
        return new InternalClassifierType_BehaviorDescriptor();
      case 1895497509:
        return new InternalVariableReference_BehaviorDescriptor();
      case -1419340984:
        return new InternalPartialFieldReference_BehaviorDescriptor();
      case -569834106:
        return new TypeHintExpression_BehaviorDescriptor();
      case 2121366688:
        return new InternalThisExpression_BehaviorDescriptor();
      case 1991186635:
        return new ExtractToConstantExpression_BehaviorDescriptor();
      case -1043226863:
        return new ExtractStatementListExpression_BehaviorDescriptor();
      case 2027888821:
        return new ExtractStatementListInnerExpression_BehaviorDescriptor();
      case -338199173:
        return new ExtractStaticMethodExpression_BehaviorDescriptor();
      case -1222117134:
        return new ExtractStaticMethod_CallExpression_BehaviorDescriptor();
      case -971598052:
        return new ExtractStaticInnerClassExpression_BehaviorDescriptor();
      case 525429288:
        return new ExtractStaticInnerClassCreator_BehaviorDescriptor();
      case 447898724:
        return new ExtractStaticInnerClassConcept_BehaviorDescriptor();
      case -1194740616:
        return new ExtractToConstantRefExpression_BehaviorDescriptor();
      case 484023672:
        return new WeakClassReference_BehaviorDescriptor();
      default:
        return null;
    }
  }
}

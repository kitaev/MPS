package jetbrains.mps.testbench.suite.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.BaseConcept_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;

public class TestCaseRef_BehaviorDescriptor extends BaseConcept_BehaviorDescriptor implements ITestRef_BehaviorDescriptor {
  public TestCaseRef_BehaviorDescriptor() {
  }

  public String virtual_fqClassName_2956932267233324537(SNode thisNode) {
    return TestCaseRef_Behavior.virtual_fqClassName_2956932267233324537(thisNode);
  }

  public Iterable<String> virtual_testNames_4089647634160960707(SNode thisNode) {
    return TestCaseRef_Behavior.virtual_testNames_4089647634160960707(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.testbench.suite.structure.TestCaseRef";
  }
}

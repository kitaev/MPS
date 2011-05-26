package jetbrains.mps.baseLanguage.unitTest.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;

public class BehaviorAspectDescriptor extends DescriptorProvider<BehaviorDescriptor> {
  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch ((fqName).hashCode()) {
      case -941576521:
        return new TestMethod_BehaviorDescriptor();
      case -537086400:
        return new BTestCase_BehaviorDescriptor();
      case 1980801013:
        return new TestMethodList_BehaviorDescriptor();
      case 35036233:
        return new AssertEquals_BehaviorDescriptor();
      case -392811368:
        return new AssertTrue_BehaviorDescriptor();
      case 694305625:
        return new AssertFalse_BehaviorDescriptor();
      case -392857744:
        return new AssertSame_BehaviorDescriptor();
      case 865895618:
        return new Fail_BehaviorDescriptor();
      case 150257243:
        return new AssertIsNull_BehaviorDescriptor();
      case 456086231:
        return new AssertThrows_BehaviorDescriptor();
      case -1930575901:
        return new Message_BehaviorDescriptor();
      case -1766538385:
        // interface or abstract concept behavior jetbrains.mps.baseLanguage.unitTest.structure.MessageHolder 
        return null;
      case -303471279:
        // interface or abstract concept behavior jetbrains.mps.baseLanguage.unitTest.structure.ITestable 
        return null;
      case -304365753:
        // interface or abstract concept behavior jetbrains.mps.baseLanguage.unitTest.structure.ITestCase 
        return null;
      case -147690696:
        // interface or abstract concept behavior jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod 
        return null;
      case 668322123:
        return new AssertInNotNull_BehaviorDescriptor();
      case 606040139:
        // interface or abstract concept behavior jetbrains.mps.baseLanguage.unitTest.structure.BinaryAssert 
        return null;
      default:
        return null;
    }
  }
}

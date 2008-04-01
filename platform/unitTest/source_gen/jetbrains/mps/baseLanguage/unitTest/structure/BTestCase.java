package jetbrains.mps.baseLanguage.unitTest.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ClassConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BTestCase extends ClassConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.unitTest.structure.BTestCase";
  public static String TEST_METHOD_LIST = "testMethodList";
  public static String TEST_CASE_NAME = "testCaseName";

  public  BTestCase(SNode node) {
    super(node);
  }

  public static BTestCase newInstance(SModel sm, boolean init) {
    return (BTestCase)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.unitTest.structure.BTestCase", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BTestCase newInstance(SModel sm) {
    return BTestCase.newInstance(sm, false);
  }


  public TestMethodList getTestMethodList() {
    return (TestMethodList)this.getChild(BTestCase.TEST_METHOD_LIST);
  }

  public void setTestMethodList(TestMethodList node) {
    super.setChild(BTestCase.TEST_METHOD_LIST, node);
  }

  public String getTestCaseName() {
    return this.getProperty(BTestCase.TEST_CASE_NAME);
  }

  public void setTestCaseName(String value) {
    this.setProperty(BTestCase.TEST_CASE_NAME, value);
  }

}

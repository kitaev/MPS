package jetbrains.mps.editorTest;

/*Generated by MPS */

import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.ide.IEditor;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class DeleteOverridenMethodInBehavior_Test extends BaseTransformationTest {

  @Test()
  public void test_DeleteOverridenMethodInBehavior() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:914ee49a-537d-44b2-a5fb-bac87a54743d(jetbrains.mps.editorTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "testMethod", false);
  }

  public static class TestBody extends BaseEditorTestBody {

    public void testMethod() throws Exception {
      IEditor editor = this.initEditor("1232554649248", "1232555746044");
      BaseEditorTestBody.pressKeys(editor, ListSequence.<String>fromArray(" RIGHT"));
      for(int i = 0 ; i < 5 ; i++ ) {
        BaseEditorTestBody.pressKeys(editor, ListSequence.<String>fromArray(" DELETE"));
      }
      this.finishTest();
    }

}

}

package jetbrains.mps.lang.editor.table.genericTable.test;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.util.plugin.run.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.ide.IEditor;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

@MPSLaunch
public class TabNavigation_Test extends BaseTransformationTest {
  @Test
  public void test_TabNavigation() throws Throwable {
    this.initTest("${mps_home}/MPS.mpr", "r:e02ee75b-0624-4ff2-b4d9-d2277a157ff4(jetbrains.mps.lang.editor.table.genericTable.test)");
    this.runTest("jetbrains.mps.lang.editor.table.genericTable.test.TabNavigation_Test$TestBody", "testMethod", false);
  }

  @MPSLaunch
  public static class TestBody extends BaseEditorTestBody {
    @Override
    public void testMethodImpl() throws Exception {
      final IEditor editor = TestBody.this.initEditor("1626657127781621492", "1626657127781621515");
      EditorComponent editorComponent = editor.getCurrentEditorComponent();
      BaseEditorTestBody.pressKeys(editorComponent, ListSequence.fromListAndArray(new ArrayList<String>(), " TAB"));
    }
  }
}

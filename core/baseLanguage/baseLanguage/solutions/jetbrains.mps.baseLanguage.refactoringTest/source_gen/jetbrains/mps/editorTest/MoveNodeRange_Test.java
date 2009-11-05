package jetbrains.mps.editorTest;

/*Generated by MPS */

import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.baseLanguage.plugin.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.ide.IEditor;
import javax.swing.SwingUtilities;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import javax.swing.KeyStroke;

public class MoveNodeRange_Test extends BaseTransformationTest {
  @Test
  @MPSLaunch
  public void test_MoveNodeRange() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:914ee49a-537d-44b2-a5fb-bac87a54743d(jetbrains.mps.editorTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "testMethod", false);
  }

  public static class TestBody extends BaseEditorTestBody {
    public void testMethod() throws Exception {
      final IEditor[] editorWrap = new IEditor[1];
      SwingUtilities.invokeAndWait(new Runnable() {
        public void run() {
          try {
            editorWrap[0] = TestBody.this.initEditor("7247887419163198992", "7247887419163198996");
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
      });
      final IEditor editor = editorWrap[0];
      EditorComponent editorComponent = editor.getCurrentEditorComponent();
      BaseEditorTestBody.pressKeys(editorComponent, ListSequence.fromListAndArray(new ArrayList<String>(), "shift DOWN"));
      BaseEditorTestBody.pressKeys(editorComponent, ListSequence.fromListAndArray(new ArrayList<String>(), "shift DOWN"));
      SwingUtilities.invokeAndWait(new Runnable() {
        public void run() {
          ActionListener actionListener = editor.getCurrentEditorComponent().getActionForKeyStroke(KeyStroke.getKeyStroke("alt UP"));
          actionListener.actionPerformed(null);
        }
      });
      TestBody.this.finishTest();
    }
  }
}

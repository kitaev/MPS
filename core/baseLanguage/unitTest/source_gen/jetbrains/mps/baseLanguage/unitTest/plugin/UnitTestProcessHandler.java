package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import com.intellij.execution.process.DefaultJavaProcessHandler;
import jetbrains.mps.baseLanguage.unitTest.runtime.TestEvent;
import java.nio.charset.Charset;
import com.intellij.execution.process.ProcessAdapter;
import com.intellij.execution.process.ProcessTerminatedListener;
import com.intellij.execution.process.ProcessEvent;
import com.intellij.openapi.util.Key;
import com.intellij.execution.process.ProcessOutputTypes;
import org.apache.commons.lang.StringUtils;

public class UnitTestProcessHandler extends DefaultJavaProcessHandler {
  private final TestEventsDispatcher myDispatcher;
  private TestEvent myLastEvent;

  public UnitTestProcessHandler(TestEventsDispatcher dispartcher, Process process, String params) {
    super(process, params, Charset.defaultCharset());
    this.myDispatcher = dispartcher;

    this.addProcessListener(new ProcessAdapter() {
      private final StringBuffer buffer = new StringBuffer();

      private String getLine(String text) {
        text = text.replaceAll("\r\n", "\n");
        buffer.append(text);

        int index = buffer.lastIndexOf("\n");
        if (index > 0) {
          String lineToAppend = buffer.substring(0, index);
          buffer.replace(0, index, "");
          return lineToAppend;
        } else {
          return null;
        }
      }

      private boolean isTerminatedEvent() {
        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
          if (element.getClassName().equals(ProcessTerminatedListener.class.getName())) {
            return true;
          }
        }
        return false;
      }

      public void onTextAvailable(ProcessEvent event, Key k) {
        if (this.isTerminatedEvent()) {
          UnitTestProcessHandler.this.myDispatcher.onProcessTerminated(event.getText());
        }
        boolean error = ProcessOutputTypes.STDERR.equals(k);
        boolean system = ProcessOutputTypes.SYSTEM.equals(k);
        String text = (error || system ?
          event.getText() :
          this.getLine(event.getText())
        );
        if (text == null) {
          return;
        }
        String textTrimmed = StringUtils.trim(text);
        TestEvent testEvent = TestEvent.parse(textTrimmed);
        if (testEvent != null) {
          myLastEvent = testEvent;
          UnitTestProcessHandler.this.myDispatcher.onTestEvent(testEvent);
        } else {
          if (myLastEvent != null && (TestEvent.FAILURE_TEST_PREFIX.equals(myLastEvent.getToken()) || TestEvent.ERROR_TEST_PREFIX.equals(myLastEvent.getToken()))) {
            k = ProcessOutputTypes.STDERR;
          }
          UnitTestProcessHandler.this.myDispatcher.onSimpleTextAvailable(text, k);
        }
      }
    });
    ProcessTerminatedListener.attach(this);
  }
}

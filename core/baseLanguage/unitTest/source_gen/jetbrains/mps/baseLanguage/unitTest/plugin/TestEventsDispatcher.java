package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import java.util.List;
import com.intellij.openapi.util.Key;
import jetbrains.mps.baseLanguage.unitTest.runtime.TestEvent;

public class TestEventsDispatcher {
  private final TestRunState myState;

  public TestEventsDispatcher(TestRunState testState) {
    this.myState = testState;
  }

  public void onProcessTerminated(String message) {
    if (message.contains("0")) {
      List<String> lostTests = this.myState.getUnusedMethods();
      for (String lostTest : lostTests) {
        String lostMethodName = lostTest.substring(lostTest.lastIndexOf(".") + 1);
        String lostClassName = lostTest.substring(0, lostTest.lastIndexOf("."));
        this.myState.looseTest(lostClassName, lostMethodName);
      }
    } else if (message.contains("1")) {
      this.myState.terminate();
    }
  }

  public void onSimpleTextAvailable(String text, Key key) {
    this.myState.outputText(text, key);
  }

  public void onTestEvent(TestEvent event) {
    this.myState.setToken(event.getToken());
    if (TestEvent.START_TEST_PREFIX.equals(event.getToken())) {
      this.myState.startTest(event);
    } else if (TestEvent.END_TEST_PREFIX.equals(event.getToken())) {
      this.myState.endTest(event);
    } else if (TestEvent.FAILURE_TEST_PREFIX.equals(event.getToken())) {
      this.myState.testFailure(event);
    } else if (TestEvent.ERROR_TEST_PREFIX.equals(event.getToken())) {
      this.myState.testError(event);
    }
    this.myState.completeTestEvent(event);
  }
}

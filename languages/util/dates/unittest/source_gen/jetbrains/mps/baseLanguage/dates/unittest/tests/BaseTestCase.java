package jetbrains.mps.baseLanguage.dates.unittest.tests;

/*Generated by MPS */

import junit.framework.TestCase;
import org.apache.log4j.BasicConfigurator;

public abstract class BaseTestCase extends TestCase {
  private static boolean LOGGING_INITIALIZED = false;

  public BaseTestCase() {
  }

  public void setUp() {
    if (!(LOGGING_INITIALIZED)) {
      BasicConfigurator.configure();
      LOGGING_INITIALIZED = true;
    }
  }
}

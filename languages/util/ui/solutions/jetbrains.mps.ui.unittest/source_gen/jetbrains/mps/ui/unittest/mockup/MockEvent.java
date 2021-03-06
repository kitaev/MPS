package jetbrains.mps.ui.unittest.mockup;

/*Generated by MPS */

import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;

public class MockEvent {
  private Map<String, String> props = MapSequence.fromMap(new HashMap<String, String>());

  public MockEvent() {
  }

  public void setProp(String propKey, String value) {
    MapSequence.fromMap(this.props).put(propKey, value);
  }

  public String getProp(String propKey) {
    return MapSequence.fromMap(this.props).get(propKey);
  }
}

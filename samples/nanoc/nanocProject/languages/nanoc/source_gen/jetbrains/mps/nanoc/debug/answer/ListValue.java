package jetbrains.mps.nanoc.debug.answer;

/*Generated by MPS */

import java.util.List;
import java.util.ArrayList;

public class ListValue extends GDBValue {
  private List<GDBValue> myValues = new ArrayList<GDBValue>();

  public ListValue() {
  }

  public void add(GDBValue value) {
    myValues.add(value);
  }

  public List<GDBValue> getValues() {
    return new ArrayList<GDBValue>(myValues);
  }
}

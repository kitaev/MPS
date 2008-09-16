package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.PropertySupport;

public class _CharConstant_String_PropertySupport extends PropertySupport {

  public boolean canSetValue(String value) {
    String testValue = null;
    if (value == null) {
      testValue = "";
    } else
    {
      testValue = value;
    }
    return testValue.matches("[^\\\\]|(\\\\([btnfr\"'\\\\]|([0-3]?[0-7]{1,2})|(u[0-9a-fA-F]{4})))");
  }

}

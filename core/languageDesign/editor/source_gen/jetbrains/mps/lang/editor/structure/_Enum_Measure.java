package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.LinkedList;

public enum _Enum_Measure {
  pixels("pixels", "PIXELS"),
  spaces("spaces", "SPACES");

  private String myName;
  private String myValue;

  _Enum_Measure(String name, String value) {
    this.myName = name;
    this.myValue = value;
  }

  public String getName() {
    return this.myName;
  }

  public String getValueAsString() {
    return this.myValue;
  }

  public String getValue() {
    return this.myValue;
  }


  public static List<_Enum_Measure> getConstants() {
    List<_Enum_Measure> list = ListSequence.fromList(new LinkedList<_Enum_Measure>());
    ListSequence.fromList(list).addElement(_Enum_Measure.pixels);
    ListSequence.fromList(list).addElement(_Enum_Measure.spaces);
    return list;
  }

  public static _Enum_Measure getDefault() {
    return _Enum_Measure.spaces;
  }

  public static _Enum_Measure parseValue(String value) {
    if (value == null) {
      return _Enum_Measure.getDefault();
    }
    if (value.equals(_Enum_Measure.pixels.getValueAsString())) {
      return _Enum_Measure.pixels;
    }
    if (value.equals(_Enum_Measure.spaces.getValueAsString())) {
      return _Enum_Measure.spaces;
    }
    return _Enum_Measure.getDefault();
  }

}

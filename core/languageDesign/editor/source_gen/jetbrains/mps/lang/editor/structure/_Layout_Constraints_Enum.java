package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.LinkedList;

public enum _Layout_Constraints_Enum {
  punctuation("punctuation", "punctuation"),
  noflow("noflow", "noflow"),
  none("none", null);

  private String myName;
  private String myValue;

  _Layout_Constraints_Enum(String name, String value) {
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


  public static List<_Layout_Constraints_Enum> getConstants() {
    List<_Layout_Constraints_Enum> list = ListSequence.fromList(new LinkedList<_Layout_Constraints_Enum>());
    ListSequence.fromList(list).addElement(_Layout_Constraints_Enum.punctuation);
    ListSequence.fromList(list).addElement(_Layout_Constraints_Enum.noflow);
    ListSequence.fromList(list).addElement(_Layout_Constraints_Enum.none);
    return list;
  }

  public static _Layout_Constraints_Enum getDefault() {
    return _Layout_Constraints_Enum.none;
  }

  public static _Layout_Constraints_Enum parseValue(String value) {
    if (value == null) {
      return _Layout_Constraints_Enum.getDefault();
    }
    if (value.equals(_Layout_Constraints_Enum.punctuation.getValueAsString())) {
      return _Layout_Constraints_Enum.punctuation;
    }
    if (value.equals(_Layout_Constraints_Enum.noflow.getValueAsString())) {
      return _Layout_Constraints_Enum.noflow;
    }
    if (value.equals(_Layout_Constraints_Enum.none.getValueAsString())) {
      return _Layout_Constraints_Enum.none;
    }
    return _Layout_Constraints_Enum.getDefault();
  }

}

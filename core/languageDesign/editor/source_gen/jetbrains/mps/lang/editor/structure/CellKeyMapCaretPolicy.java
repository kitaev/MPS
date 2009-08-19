package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;

public enum CellKeyMapCaretPolicy {
  ANY_POSITION("ANY_POSITION", null),
  FIRST_POSITION("FIRST_POSITION", "caret_at_first_position"),
  LAST_POSITION("LAST_POSITION", "caret_at_last_position"),
  INTERMEDIATE_POSITION("INTERMEDIATE_POSITION", "caret_at_intermediate_position");

  private String myName;
  private String myValue;

  CellKeyMapCaretPolicy(String name, String value) {
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


  public static List<CellKeyMapCaretPolicy> getConstants() {
    List<CellKeyMapCaretPolicy> list = ListSequence.fromList(new LinkedList<CellKeyMapCaretPolicy>());
    ListSequence.fromList(list).addElement(CellKeyMapCaretPolicy.ANY_POSITION);
    ListSequence.fromList(list).addElement(CellKeyMapCaretPolicy.FIRST_POSITION);
    ListSequence.fromList(list).addElement(CellKeyMapCaretPolicy.LAST_POSITION);
    ListSequence.fromList(list).addElement(CellKeyMapCaretPolicy.INTERMEDIATE_POSITION);
    return list;
  }

  public static CellKeyMapCaretPolicy getDefault() {
    return CellKeyMapCaretPolicy.ANY_POSITION;
  }

  public static CellKeyMapCaretPolicy parseValue(String value) {
    if (value == null) {
      return CellKeyMapCaretPolicy.getDefault();
    }
    if (value.equals(CellKeyMapCaretPolicy.ANY_POSITION.getValueAsString())) {
      return CellKeyMapCaretPolicy.ANY_POSITION;
    }
    if (value.equals(CellKeyMapCaretPolicy.FIRST_POSITION.getValueAsString())) {
      return CellKeyMapCaretPolicy.FIRST_POSITION;
    }
    if (value.equals(CellKeyMapCaretPolicy.LAST_POSITION.getValueAsString())) {
      return CellKeyMapCaretPolicy.LAST_POSITION;
    }
    if (value.equals(CellKeyMapCaretPolicy.INTERMEDIATE_POSITION.getValueAsString())) {
      return CellKeyMapCaretPolicy.INTERMEDIATE_POSITION;
    }
    return CellKeyMapCaretPolicy.getDefault();
  }
}

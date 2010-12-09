package jetbrains.mps.make.script.structure;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;

public enum Feedback {
  info("info", "INFO"),
  warning("warning", "WARNING"),
  error("error", "ERROR");

  private String myName;
  private String myValue;

  Feedback(String name, String value) {
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

  public static List<Feedback> getConstants() {
    List<Feedback> list = ListSequence.fromList(new LinkedList<Feedback>());
    ListSequence.fromList(list).addElement(Feedback.info);
    ListSequence.fromList(list).addElement(Feedback.warning);
    ListSequence.fromList(list).addElement(Feedback.error);
    return list;
  }

  public static Feedback getDefault() {
    return Feedback.info;
  }

  public static Feedback parseValue(String value) {
    if (value == null) {
      return Feedback.getDefault();
    }
    if (value.equals(Feedback.info.getValueAsString())) {
      return Feedback.info;
    }
    if (value.equals(Feedback.warning.getValueAsString())) {
      return Feedback.warning;
    }
    if (value.equals(Feedback.error.getValueAsString())) {
      return Feedback.error;
    }
    return Feedback.getDefault();
  }
}

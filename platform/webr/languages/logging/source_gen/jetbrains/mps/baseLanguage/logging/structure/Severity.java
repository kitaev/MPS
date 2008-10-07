package jetbrains.mps.baseLanguage.logging.structure;

/*Generated by MPS */

import java.util.List;
import java.util.LinkedList;

public enum Severity {
  fatal("fatal", "fatal"),
  error("error", "error"),
  warn("warn", "warn"),
  debug("debug", "debug"),
  info("info", "info"),
  trace("trace", "trace");

  private String myName;
  private String myValue;

Severity(String name, String value) {
    this.myName = name;
    this.myValue = value;
  }

  public static List<Severity> getConstants() {
    List<Severity> list = new LinkedList<Severity>();
    list.add(Severity.fatal);
    list.add(Severity.error);
    list.add(Severity.warn);
    list.add(Severity.debug);
    list.add(Severity.info);
    list.add(Severity.trace);
    return list;
  }

  public static Severity getDefault() {
    return Severity.debug;
  }

  public static Severity parseValue(String value) {
    if (value == null) {
      return Severity.getDefault();
    }
    if (value.equals(Severity.fatal.getValueAsString())) {
      return Severity.fatal;
    }
    if (value.equals(Severity.error.getValueAsString())) {
      return Severity.error;
    }
    if (value.equals(Severity.warn.getValueAsString())) {
      return Severity.warn;
    }
    if (value.equals(Severity.debug.getValueAsString())) {
      return Severity.debug;
    }
    if (value.equals(Severity.info.getValueAsString())) {
      return Severity.info;
    }
    if (value.equals(Severity.trace.getValueAsString())) {
      return Severity.trace;
    }
    return Severity.getDefault();
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

}

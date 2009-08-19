package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;

public enum _Colors_Enum {
  none("none", null),
  red("red", "red"),
  pink("pink", "pink"),
  orange("orange", "orange"),
  yellow("yellow", "yellow"),
  green("green", "green"),
  darkGreen("darkGreen", "DARK_GREEN"),
  magenta("magenta", "magenta"),
  darkMagenta("darkMagenta", "DARK_MAGENTA"),
  cyan("cyan", "cyan"),
  blue("blue", "blue"),
  lightBlue("lightBlue", "LIGHT_BLUE"),
  darkBlue("darkBlue", "DARK_BLUE"),
  gray("gray", "gray"),
  lightGray("lightGray", "lightGray"),
  darkGray("darkGray", "darkGray"),
  white("white", "WHITE");

  private String myName;
  private String myValue;

  _Colors_Enum(String name, String value) {
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


  public static List<_Colors_Enum> getConstants() {
    List<_Colors_Enum> list = ListSequence.fromList(new LinkedList<_Colors_Enum>());
    ListSequence.fromList(list).addElement(_Colors_Enum.none);
    ListSequence.fromList(list).addElement(_Colors_Enum.red);
    ListSequence.fromList(list).addElement(_Colors_Enum.pink);
    ListSequence.fromList(list).addElement(_Colors_Enum.orange);
    ListSequence.fromList(list).addElement(_Colors_Enum.yellow);
    ListSequence.fromList(list).addElement(_Colors_Enum.green);
    ListSequence.fromList(list).addElement(_Colors_Enum.darkGreen);
    ListSequence.fromList(list).addElement(_Colors_Enum.magenta);
    ListSequence.fromList(list).addElement(_Colors_Enum.darkMagenta);
    ListSequence.fromList(list).addElement(_Colors_Enum.cyan);
    ListSequence.fromList(list).addElement(_Colors_Enum.blue);
    ListSequence.fromList(list).addElement(_Colors_Enum.lightBlue);
    ListSequence.fromList(list).addElement(_Colors_Enum.darkBlue);
    ListSequence.fromList(list).addElement(_Colors_Enum.gray);
    ListSequence.fromList(list).addElement(_Colors_Enum.lightGray);
    ListSequence.fromList(list).addElement(_Colors_Enum.darkGray);
    ListSequence.fromList(list).addElement(_Colors_Enum.white);
    return list;
  }

  public static _Colors_Enum getDefault() {
    return _Colors_Enum.none;
  }

  public static _Colors_Enum parseValue(String value) {
    if (value == null) {
      return _Colors_Enum.getDefault();
    }
    if (value.equals(_Colors_Enum.none.getValueAsString())) {
      return _Colors_Enum.none;
    }
    if (value.equals(_Colors_Enum.red.getValueAsString())) {
      return _Colors_Enum.red;
    }
    if (value.equals(_Colors_Enum.pink.getValueAsString())) {
      return _Colors_Enum.pink;
    }
    if (value.equals(_Colors_Enum.orange.getValueAsString())) {
      return _Colors_Enum.orange;
    }
    if (value.equals(_Colors_Enum.yellow.getValueAsString())) {
      return _Colors_Enum.yellow;
    }
    if (value.equals(_Colors_Enum.green.getValueAsString())) {
      return _Colors_Enum.green;
    }
    if (value.equals(_Colors_Enum.darkGreen.getValueAsString())) {
      return _Colors_Enum.darkGreen;
    }
    if (value.equals(_Colors_Enum.magenta.getValueAsString())) {
      return _Colors_Enum.magenta;
    }
    if (value.equals(_Colors_Enum.darkMagenta.getValueAsString())) {
      return _Colors_Enum.darkMagenta;
    }
    if (value.equals(_Colors_Enum.cyan.getValueAsString())) {
      return _Colors_Enum.cyan;
    }
    if (value.equals(_Colors_Enum.blue.getValueAsString())) {
      return _Colors_Enum.blue;
    }
    if (value.equals(_Colors_Enum.lightBlue.getValueAsString())) {
      return _Colors_Enum.lightBlue;
    }
    if (value.equals(_Colors_Enum.darkBlue.getValueAsString())) {
      return _Colors_Enum.darkBlue;
    }
    if (value.equals(_Colors_Enum.gray.getValueAsString())) {
      return _Colors_Enum.gray;
    }
    if (value.equals(_Colors_Enum.lightGray.getValueAsString())) {
      return _Colors_Enum.lightGray;
    }
    if (value.equals(_Colors_Enum.darkGray.getValueAsString())) {
      return _Colors_Enum.darkGray;
    }
    if (value.equals(_Colors_Enum.white.getValueAsString())) {
      return _Colors_Enum.white;
    }
    return _Colors_Enum.getDefault();
  }
}

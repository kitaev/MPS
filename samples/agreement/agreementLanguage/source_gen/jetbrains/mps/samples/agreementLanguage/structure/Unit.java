package jetbrains.mps.samples.agreementLanguage.structure;

/*Generated by MPS */

import java.util.List;
import java.util.LinkedList;

public enum Unit {
  USD_KWH("USD_KWH", "USD_KWH"),
  USD("USD", "USD"),
  KWH("KWH", "KWH");

  private String myName;
  private String myValue;

Unit(String name, String value) {
    this.myName = name;
    this.myValue = value;
  }

  public static List<Unit> getConstants() {
    List<Unit> list = new LinkedList<Unit>();
    list.add(Unit.USD_KWH);
    list.add(Unit.USD);
    list.add(Unit.KWH);
    return list;
  }

  public static Unit getDefault() {
    return Unit.USD_KWH;
  }

  public static Unit parseValue(String value) {
    if (value == null) {
      return Unit.getDefault();
    }
    if (value.equals(Unit.USD_KWH.getValueAsString())) {
      return Unit.USD_KWH;
    }
    if (value.equals(Unit.USD.getValueAsString())) {
      return Unit.USD;
    }
    if (value.equals(Unit.KWH.getValueAsString())) {
      return Unit.KWH;
    }
    return Unit.getDefault();
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

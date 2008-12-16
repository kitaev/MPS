package smodelLanguage.samples;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class Properties {

  public void stringProperty(SNode clazz) {
    boolean hasName = SPropertyOperations.getString(clazz, "name") != null;
    String name = SPropertyOperations.getString(clazz, "name");
    String text = "Name is " + SPropertyOperations.getString(clazz, "name");
    SPropertyOperations.set(clazz, "name", "Sample");
    boolean ok_not_safely = SPropertyOperations.getString(clazz, "name").equals("Sample");
    boolean ok_safely = SPropertyOperations.hasValue(clazz, "name", "Sample");
    boolean ok_in_java = SPropertyOperations.getString(clazz, "name") == "Sample";
  }

  public void stringProperty2(SNode clazz1, SNode clazz2) {
    SPropertyOperations.set(clazz1, "name", "Sample");
    SPropertyOperations.set(clazz2, "name", SPropertyOperations.getString(clazz1, "name"));
    boolean ok = SPropertyOperations.getString(clazz1, "name") == SPropertyOperations.getString(clazz2, "name");
  }

  public void stringProperty3(SNode node) {
    SPropertyOperations.set(node, "name", "Class1");
    SPropertyOperations.set(node, "name", null);
    SPropertyOperations.set(node, "name", null);
    SPropertyOperations.set(node, "name", null);
  }

  public void booleanProperty(SNode boolConst) {
    boolean isTrue = false;
    if (SPropertyOperations.getBoolean(boolConst, "value")) {
      isTrue = true;
    }
    boolean isTrue2 = SPropertyOperations.getBoolean(boolConst, "value");
    boolean isTrue3 = SPropertyOperations.getBoolean(boolConst, "value") && true;
    SPropertyOperations.set(boolConst, "value", "" + (!(SPropertyOperations.getBoolean(boolConst, "value"))));
  }

  public void booleanProperty2(SNode node) {
    SPropertyOperations.set(node, "value", "" + true);
    SPropertyOperations.set(node, "value", null);
  }

  public void integerProperty(SNode intConst) {
    int i = SPropertyOperations.getInteger(intConst, "value");
    int i2 = SPropertyOperations.getInteger(intConst, "value") + 10;
    if (SPropertyOperations.getInteger(intConst, "value") > 100) {
      SPropertyOperations.set(intConst, "value", "" + (SPropertyOperations.getInteger(intConst, "value") - 100));
    }
  }

  public void integerProperty2(SNode node) {
    SPropertyOperations.set(node, "value", "" + 10);
    SPropertyOperations.set(node, "value", null);
    SPropertyOperations.set(node, "value", "" + (SPropertyOperations.getInteger(node, "value") + 10));
    SPropertyOperations.set(node, "value", "" + (SPropertyOperations.getInteger(node, "value") - 10));
  }

  public void enumProperty_string(SNode link) {
    String s = SPropertyOperations.getString_def(link, "sourceCardinality", "0..1");
    boolean ok1 = SPropertyOperations.getString_def(link, "sourceCardinality", "0..1") == s;
    SPropertyOperations.set(link, "sourceCardinality", "0..n");
    boolean ok2 = SPropertyOperations.hasValue(link, "sourceCardinality", "0..n", "0..1");
  }

  public void enumProperty_string2(SNode link1, SNode link2) {
    if (SPropertyOperations.getString_def(link1, "metaClass", "reference") != SPropertyOperations.getString_def(link2, "metaClass", "reference")) {
      SPropertyOperations.set(link1, "metaClass", SPropertyOperations.getString_def(link2, "metaClass", "reference"));
    }
    boolean ok1 = SPropertyOperations.getString_def(link1, "metaClass", "reference") == SPropertyOperations.getString_def(link2, "metaClass", "reference");
    if (SPropertyOperations.hasValue(link1, "metaClass", "aggregation", "reference")) {
      boolean ok2 = SPropertyOperations.hasValue(link2, "metaClass", "aggregation", "reference");
    }
  }

  public void enumProperty_string3(SNode link1, SNode link2) {
    SPropertyOperations.set(link1, "metaClass", "aggregation");
    SPropertyOperations.set(link1, "metaClass", SPropertyOperations.getString_def(link2, "metaClass", "reference"));
    SPropertyOperations.set(link1, "metaClass", SPropertyOperations.getString_def(link2, "metaClass", "reference"));
  }

  public void enumProperty_integer(SNode cellModel) {
    int i = SPropertyOperations.getInteger_def(cellModel, "attractsFocus", "0");
    if (SPropertyOperations.hasValue(cellModel, "attractsFocus", "0", "0")) {
      SPropertyOperations.set(cellModel, "attractsFocus", "2");
    }
  }

  public void enumProperty_integer2(SNode cellModel) {
    SPropertyOperations.set(cellModel, "attractsFocus", "" + 1);
    SPropertyOperations.set(cellModel, "attractsFocus", "" + SPropertyOperations.getInteger_def(cellModel, "attractsFocus", "0"));
    SPropertyOperations.set(cellModel, "attractsFocus", "" + (SPropertyOperations.getInteger_def(cellModel, "attractsFocus", "0")));
    SPropertyOperations.set(cellModel, "attractsFocus", "" + (10));
  }

}

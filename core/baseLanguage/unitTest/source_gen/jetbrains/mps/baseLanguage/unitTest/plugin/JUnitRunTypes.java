package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */


public enum JUnitRunTypes {
  METHOD(),
  TESTCLASS(),
  MODEL(),
  MODULE();

  JUnitRunTypes() {
  }

  public static JUnitRunTypes getType(boolean isModule, boolean isModel, boolean isTest, boolean isMethod) {
    if (isModule) {
      return JUnitRunTypes.MODULE;
    } else if (isModel) {
      return JUnitRunTypes.MODEL;
    } else if (isTest) {
      return JUnitRunTypes.TESTCLASS;
    } else if (isMethod) {
      return JUnitRunTypes.METHOD;
    }
    return null;
  }
}

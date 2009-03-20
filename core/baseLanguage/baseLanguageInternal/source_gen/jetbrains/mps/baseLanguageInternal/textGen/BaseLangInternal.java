package jetbrains.mps.baseLanguageInternal.textGen;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.textGen.BaseLanguageTextGen;
import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.generator.JavaNameUtil;

public abstract class BaseLangInternal extends BaseLanguageTextGen {

  public static void className(String fqClassName, final SNodeTextGen textGen) {
    if (fqClassName.contains("@")) {
      textGen.foundError("fq name can not contain '@'");
    }
    String packageName;
    String className;
    String[] packageAndClassName = fqClassName.split("!");
    if (packageAndClassName.length == 2) {
      packageName = packageAndClassName[0];
      className = packageAndClassName[1];
    } else
    {
      packageName = JavaNameUtil.packageName(fqClassName);
      className = JavaNameUtil.shortName(fqClassName);
    }
    BaseLanguageTextGen.appendClsName(packageName, className, new Object(), textGen);
  }

}

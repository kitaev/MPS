package jetbrains.mps.debug.evaluation.ui;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.stubs.JavaStubs;
import jetbrains.mps.stubs.StubLocation;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.stubs.StubSource;
import jetbrains.mps.reloading.IClassPathItem;
import jetbrains.mps.reloading.ClassPathFactory;
import jetbrains.mps.baseLanguage.javastub.ASMModelLoader;

public class AllMembersJavaStubs extends JavaStubs {
  public static final String DEBUG_JAVA_ID = "debugger_java";

  public AllMembersJavaStubs() {
  }

  protected String getLanguageId() {
    return DEBUG_JAVA_ID;
  }

  protected void updateModel(final StubLocation location, final SModel model, final StubSource source) {
    IClassPathItem cpItem = ClassPathFactory.getInstance().createFromPath(location.getPath());
    if (cpItem == null) {
      return;
    }
    new ASMModelLoader(location, cpItem, model, getLanguageId(), false).updateModel();
  }
}

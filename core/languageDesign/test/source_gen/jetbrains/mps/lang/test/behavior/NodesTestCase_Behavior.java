package jetbrains.mps.lang.test.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.unitTest.runtime.TestRunParameters;
import com.intellij.util.lang.UrlClassLoader;
import java.net.URL;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.project.StubPath;
import jetbrains.mps.project.structure.modules.Dependency;
import jetbrains.mps.project.AbstractModule;
import jetbrains.mps.smodel.MPSModuleRepository;
import com.intellij.openapi.application.PathManager;
import java.io.File;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import com.intellij.openapi.application.PathMacros;

public class NodesTestCase_Behavior {
  public static void init(SNode thisNode) {
  }

  public static List<SNode> virtual_getTestSet_1216130724401(SNode thisNode) {
    List<SNode> result = new ArrayList<SNode>();
    for (SNode method : ListSequence.fromList(SLinkOperations.getTargets(thisNode, "testMethods", true))) {
      ListSequence.fromList(result).addElement(method);
    }
    for (SNode operation : ListSequence.fromList(SNodeOperations.getDescendants(thisNode, "jetbrains.mps.lang.test.structure.NodeOperation", false, new String[]{}))) {
      ListSequence.fromList(result).addElement(operation);
    }
    return result;
  }

  public static TestRunParameters virtual_getTestRunParameters_1216045139515(SNode thisNode) {
    return NodesTestCase_Behavior.getTestRunParameters_1217424543047();
  }

  public static List<SNode> virtual_getTestMethods_2148145109766218395(SNode thisNode) {
    return SLinkOperations.getTargets(thisNode, "testMethods", true);
  }

  public static boolean isIntentionApplicable_1217250498008(SNode node) {
    SNode test = SNodeOperations.getAncestorWhereConceptInList(node, new String[]{"jetbrains.mps.lang.test.structure.TestNode", "jetbrains.mps.lang.test.structure.EditorTestCase"}, true, false);
    return test != null;
  }

  public static List<String> getIdeaClassPath_1217424542979() {
    final List<String> result = ListSequence.fromList(new ArrayList<String>());
    ClassLoader classLoader = UrlClassLoader.class.getClassLoader();
    Class cls = classLoader.getClass();
    try {
      List<URL> urls = ((List<URL>) cls.getMethod("getUrls", new Class[0]).invoke(classLoader, new Object[0]));
      for (URL url : urls) {
        ListSequence.fromList(result).addElement(url.getFile());
      }
    } catch (Throwable e) {
    }
    Language testsLanguage = (Language) SNodeOperations.getModel(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.test.structure.NodesTestCase")).getModelDescriptor().getModule();
    for (StubPath path : ListSequence.fromList(testsLanguage.getRuntimeStubPaths())) {
      ListSequence.fromList(result).addElement(path.getPath());
    }
    for (Dependency dep : ListSequence.fromList(testsLanguage.getRuntimeDependencies())) {
      AbstractModule module = (AbstractModule) MPSModuleRepository.getInstance().getModule(dep.getModuleRef());
      for (StubPath path : ListSequence.fromList(module.getStubPaths())) {
        ListSequence.fromList(result).addElement(path.getPath());
      }
    }
    ListSequence.fromList(result).addSequence(ListSequence.fromList(NodesTestCase_Behavior.getPluginsClassPath_2937573621172202149()));
    return result;
  }

  public static List<String> getPluginsClassPath_2937573621172202149() {
    List<String> path = ListSequence.fromList(new ArrayList<String>());
    String pluginsPath = PathManager.getPreinstalledPluginsPath();
    File pluginsDir = new File(pluginsPath);
    for (File pluginDir : pluginsDir.listFiles()) {
      if (pluginDir.isDirectory()) {
        ListSequence.fromList(path).addElement(new File(pluginDir, "classes").getAbsolutePath());
      } else {
        ListSequence.fromList(path).addElement(pluginDir.getAbsolutePath());
      }
    }
    return path;
  }

  public static TestRunParameters getTestRunParameters_1217424543047() {
    TestRunParameters result = new TestRunParameters();
    result.setClassPath(NodesTestCase_Behavior.getIdeaClassPath_1217424542979());
    List<String> vmParams = ListSequence.fromList(new ArrayList<String>());
    ListSequence.fromList(vmParams).addElement("-Xmx1024m");
    for (String key : SetSequence.fromSet(PathMacros.getInstance().getUserMacroNames())) {
      String value = PathMacros.getInstance().getValue(key);
      ListSequence.fromList(vmParams).addElement("-D" + "path.macro." + key + "=" + value);
    }
    result.setVmParameters(vmParams);
    // wtf, could not run tests because of typo 
    result.setTestRunner("jetbrains.mps.lang.test.runtime.TransformationTestRunner");
    return result;
  }

  public static String getTestBodyName_1224602741295() {
    return "TestBody";
  }
}

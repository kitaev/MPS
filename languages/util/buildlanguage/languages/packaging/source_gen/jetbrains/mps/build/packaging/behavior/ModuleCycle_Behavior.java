package jetbrains.mps.build.packaging.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import java.util.Set;
import jetbrains.mps.project.IModule;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.reloading.IClassPathItem;
import jetbrains.mps.project.AbstractModule;
import jetbrains.mps.internal.collections.runtime.ISelector;
import java.io.File;
import jetbrains.mps.build.packaging.generator.buildlanguage.template.util.Util;
import jetbrains.mps.reloading.CommonPaths;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ModuleCycle_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String call_getBasedir_1218647622991(SNode thisNode) {
    return IMacroHolder_Behavior.call_getPath_1234976932856(SNodeOperations.getAncestor(thisNode, "jetbrains.mps.build.packaging.structure.Layout", true, true));
  }

  public static List<SNode> call_getClassPath_1218646038565(SNode thisNode) {
    // collecting modules 
    Set<IModule> modules = SetSequence.fromSet(new HashSet<IModule>());
    for (SNode moduleRef : ListSequence.fromList(SLinkOperations.getTargets(thisNode, "moduleReference", true))) {
      IModule module = Module_Behavior.call_getModule_1213877515148(SLinkOperations.getTarget(moduleRef, "module", false));
      SetSequence.fromSet(modules).addElement(module);
    }
    // getting classpath 
    IClassPathItem classpath = AbstractModule.getDependenciesClasspath(modules, false);
    List<String> stringClasspath = ListSequence.fromList(ModuleUtil.retrieveClassPath(classpath)).<String>select(new ISelector<String, String>() {
      public String select(String it) {
        return it.replace(File.separator, Util.SEPARATOR);
      }
    }).distinct().toListSequence();
    // creating path holders to use in generator 
    return ModuleCycle_Behavior.createPathHolders_1218716903754(stringClasspath, ModuleCycle_Behavior.call_getBasedir_1218647622991(thisNode), SLinkOperations.getTargets(SNodeOperations.getAncestor(thisNode, "jetbrains.mps.build.packaging.structure.Layout", true, true), "macro", true));
  }

  public static List<SNode> getMPSClassPath_1218716245482(String homePath, List<SNode> macro) {
    return ModuleCycle_Behavior.createPathHolders_1218716903754(ListSequence.fromList(ModuleUtil.retrieveClassPath(CommonPaths.getMPSClassPath())).<String>select(new ISelector<String, String>() {
      public String select(String it) {
        return it.replace(File.separator, Util.SEPARATOR);
      }
    }), homePath, macro);
  }

  public static List<SNode> createPathHolders_1218716903754(Iterable<String> stringClasspath, String homePath, List<SNode> macro) {
    homePath = homePath.replace(File.separator, Util.SEPARATOR);
    List<SNode> pathHolders = new ArrayList<SNode>();
    for (String string : Sequence.fromIterable(stringClasspath)) {
      SNode holder = SConceptOperations.createNewNode("jetbrains.mps.build.packaging.structure.PathHolder", null);
      String relativePath = ModuleUtil.getRelativePath(string, homePath);
      SPropertyOperations.set(holder, "fullPath", relativePath);
      if (string.equals(relativePath)) {
        ModuleUtil.findMacro(holder, macro);
      }
      ListSequence.fromList(pathHolders).addElement(holder);
    }
    return pathHolders;
  }
}

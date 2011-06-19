package jetbrains.mps.build.packaging.mps.generator.template.util;

/*Generated by MPS */

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.build.custommps.behavior.MPSBuild_Behavior;
import jetbrains.mps.util.PathManager;
import java.io.File;
import java.util.List;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.build.packaging.behavior.Module_Behavior;
import jetbrains.mps.project.Solution;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.project.dependency.LanguageDepsManager;
import jetbrains.mps.internal.collections.runtime.Sequence;

public class CheckUtil {
  protected static Log log = LogFactory.getLog(CheckUtil.class);

  public CheckUtil() {
  }

  public static boolean isInMpsAutobuild(SModel smodel) {
    // todo how to reference the model directly (fqname may change)?? 
    return SModelOperations.getModelName(smodel).equals("jetbrains.mps.build.mpsautobuild");
  }

  public static void checkSamples() {
    if (MPSBuild_Behavior.isInMPSBuild_1239995424995()) {
      return;
    }

    String samplesPath = PathManager.getHomePath() + File.separator + "samples";
    List<IModule> sampleModules = MPSModuleRepository.getInstance().getAllModulesInDirectory(FileSystem.getInstance().getFileByPath(samplesPath));
    for (IModule module : ListSequence.fromList(sampleModules)) {
      if (!(module.isCompileInMPS())) {
        String msg = "Module " + module.getModuleFqName() + " is a sample, but is not compiled in MPS";
        if (log.isErrorEnabled()) {
          log.error(msg);
        }
      }
    }
  }

  public static void checkCoreRuntimeDeps() {
    List<SNode> coreBlocks = new ArrayList<SNode>();
    ListSequence.fromList(coreBlocks).addElement(SNodeOperations.getNode("r:972ae1d5-2beb-44b3-a739-a548d8eb423d(jetbrains.mps.build.mpsautobuild)", "8431776905956472858"));
    ListSequence.fromList(coreBlocks).addElement(SNodeOperations.getNode("r:972ae1d5-2beb-44b3-a739-a548d8eb423d(jetbrains.mps.build.mpsautobuild)", "8431776905956472940"));
    ListSequence.fromList(coreBlocks).addElement(SNodeOperations.getNode("r:972ae1d5-2beb-44b3-a739-a548d8eb423d(jetbrains.mps.build.mpsautobuild)", "8431776905956472865"));
    ListSequence.fromList(coreBlocks).addElement(SNodeOperations.getNode("r:972ae1d5-2beb-44b3-a739-a548d8eb423d(jetbrains.mps.build.mpsautobuild)", "8431776905956472896"));
    ListSequence.fromList(coreBlocks).addElement(SNodeOperations.getNode("r:972ae1d5-2beb-44b3-a739-a548d8eb423d(jetbrains.mps.build.mpsautobuild)", "8431776905956472902"));
    ListSequence.fromList(coreBlocks).addElement(SNodeOperations.getNode("r:972ae1d5-2beb-44b3-a739-a548d8eb423d(jetbrains.mps.build.mpsautobuild)", "8431776905956472907"));

    Iterable<IModule> coreModules = ListSequence.fromList(coreBlocks).<SNode>translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode it) {
        return SNodeOperations.getDescendants(it, "jetbrains.mps.build.packaging.structure.Module", false, new String[]{});
      }
    }).<IModule>select(new ISelector<SNode, IModule>() {
      public IModule select(SNode it) {
        return Module_Behavior.call_getModule_1213877515148(it);
      }
    });

    for (Solution solution : ListSequence.fromList(MPSModuleRepository.getInstance().getAllSolutions())) {
      if (solution.isStub()) {
        continue;
      }
      if (!(solution.getModuleDescriptor().isDontLoadClasses())) {
        continue;
      }

      // if we are here, this means this solution is a part of MPS core 
      for (Language language : SetSequence.fromSet(solution.getDependenciesManager().getAllUsedLanguages())) {
        for (IModule module : ListSequence.fromList(((LanguageDepsManager) language.getDependenciesManager()).getRuntimeDependOnModules())) {
          if (module.getDescriptorFile() == null) {
            // for filtering out modules like MPS.Classpath 
            continue;
          }
          // check that this module is in classpath on build startup 
          if (!(Sequence.fromIterable(coreModules).contains(module))) {
            String msg = "Module " + module.getModuleFqName() + " should be in core because it's a runtime of language " + language.getModuleFqName() + ", which is used by core solution " + solution.getModuleFqName();
            if (log.isErrorEnabled()) {
              log.error(msg);
            }
          }
        }
      }
    }
  }

  public static void checkIncludedLanguage() {
    List<Language> langs = MPSModuleRepository.getInstance().getAllLanguages();
    for (SNode moduleNode : ListSequence.fromList(SModelOperations.getNodes(SNodeOperations.getModel(SNodeOperations.getNode("r:972ae1d5-2beb-44b3-a739-a548d8eb423d(jetbrains.mps.build.mpsautobuild)", "8431776905956472858")), "jetbrains.mps.build.packaging.structure.Module"))) {
      IModule module = Module_Behavior.call_getModule_1213877515148(moduleNode);
      if (!(module instanceof Language)) {
        continue;
      }

      langs.remove(module);
    }

    if (log.isInfoEnabled()) {
      log.info("Check finished");
    }
    for (Language l : ListSequence.fromList(langs)) {
      if (log.isWarnEnabled()) {
        log.warn(l.getModuleFqName());
      }
    }
  }
}

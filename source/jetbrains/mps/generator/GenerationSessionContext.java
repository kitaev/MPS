package jetbrains.mps.generator;

import jetbrains.mps.project.*;
import jetbrains.mps.projectLanguage.structure.ModelRoot;
import jetbrains.mps.projectLanguage.structure.ModuleDescriptor;
import jetbrains.mps.smodel.*;
import jetbrains.mps.transformation.TLBase.structure.MappingConfiguration;
import jetbrains.mps.transformation.TemplateLanguageUtil;
import jetbrains.mps.util.CollectionUtil;
import jetbrains.mps.ide.BootstrapLanguages;
import jetbrains.mps.generator.plan.GenerationStepController;
import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * Igor Alshannikov
 * Sep 19, 2005
 */
public class GenerationSessionContext extends StandaloneMPSContext {

  private static final Object COPYED_ROOTS = new Object();

  private List<Generator> myGeneratorModules;
  private List<SModelDescriptor> myTemplateModels;
  private IOperationContext myInvocationContext;
  private TransientModule myTransientModule;
  private Language myTargetLanguage;
  private GenerationStepController myGenerationStepController;

  private Map<Object, Object> myTransientObjects = new HashMap<Object, Object>();
  // object survive between transient models but not between generation steps 
  private Map<Object, Object> mySessionObjects = new HashMap<Object, Object>();

  private LinkedHashSet<MappingConfiguration> myCustomMappingConfigurations;
  private LinkedHashSet<MappingConfiguration> myMappingConfigurations;

  // these objects survive through all steps of generation
  private TraceMap myTraceMap = new TraceMap();
  private Set<String> myUsedNames = new HashSet<String>();


  public GenerationSessionContext(Language targetLanguage,
                                  SModel inputModel,
                                  IOperationContext invocationContext,
                                  Set<MappingConfiguration> configs,
                                  GenerationStepController generationStepController,
                                  GenerationSessionContext prevContext) {


    myTargetLanguage = targetLanguage;
    myInvocationContext = invocationContext;
    myCustomMappingConfigurations = null;

    if (targetLanguage == null) {
      // auto-plan
      myGenerationStepController = generationStepController;
      myGeneratorModules = myGenerationStepController.getGenerators();
      myTemplateModels = myGenerationStepController.getTemplateModels();
      myMappingConfigurations = new LinkedHashSet<MappingConfiguration>(myGenerationStepController.getCurrentMappings());
    } else {
      // old
      myGeneratorModules = getUsedGenerators(inputModel);
      if (configs != null) {
        myCustomMappingConfigurations = new LinkedHashSet<MappingConfiguration>(configs);
      }
      initTemplateModels();
    }

    myTransientModule = new TransientModule(invocationContext.getModule(), myGeneratorModules);
    if (prevContext != null) {
      myTransientModule.addDependency(prevContext.getModule());
      myUsedNames = prevContext.myUsedNames;
    }
  }

  public void replaceInputModel(SModelDescriptor inputModel) {
    myTransientObjects.clear();
    if (myGenerationStepController != null) {
      // auto-plan - nothing
    } else {
      // old
      myGeneratorModules = getUsedGenerators(inputModel.getSModel());
      initTemplateModels();
      myTransientModule.addGeneratorModules(myGeneratorModules);
    }
  }

//  public void updateGenerationStepData(GenerationStepController generationStepController) {
//    myGenerationStepController = generationStepController;
//    myGeneratorModules = myGenerationStepController.getGenerators();
//    myTemplateModels = myGenerationStepController.getTemplateModels();
//    myMappingConfigurations = new LinkedHashSet<MappingConfiguration>(myGenerationStepController.getCurrentMappings());
//    myTransientModule.addGeneratorModules(myGeneratorModules);
//  }

  private void initTemplateModels() {
    assert myGenerationStepController == null : "method can't be used with 'auto-plan' generation";

    myTemplateModels = new ArrayList<SModelDescriptor>();
    for (Generator generatorModule : myGeneratorModules) {
      List<SModelDescriptor> templateModels = generatorModule.getOwnTemplateModels();
      CollectionUtil.addAllNotPresent(templateModels, myTemplateModels);
    }

    if (myCustomMappingConfigurations != null) {
      myMappingConfigurations = new LinkedHashSet<MappingConfiguration>(myCustomMappingConfigurations);
    } else {
      myMappingConfigurations = new LinkedHashSet<MappingConfiguration>();
      for (SModelDescriptor templateModel : myTemplateModels) {
        myMappingConfigurations.addAll(templateModel.getSModel().allAdapters(MappingConfiguration.class));
      }
    }
  }

  public Set<MappingConfiguration> getMappingConfigurations() {
    return myMappingConfigurations;
  }

  public <T> T getComponent(@NotNull Class<T> clazz) {
    return myInvocationContext.getComponent(clazz);
  }

  @NotNull
  public IModule getModule() {
    return myTransientModule;
  }

  @NotNull
  public MPSProject getProject() {
    return myInvocationContext.getProject();
  }

  @NotNull
  public IScope getScope() {
//    return myTransientModule.getScope();
    return GlobalScope.getInstance();
  }

  public List<Generator> getGeneratorModules() {
    return myGeneratorModules;
  }

  public List<SModelDescriptor> getTemplateModels() {
    return myTemplateModels;
  }

  public IOperationContext getInvocationContext() {
    return myInvocationContext;
  }

//  public Language getTargetLanguage() {
//    return myTargetLanguage;
//  }

  public TraceMap getTraceMap() {
    return myTraceMap;
  }

  public String toString() {
    if (myTargetLanguage == null) {
      // generation with auto-plan
      return getClass().getName() + "-> " + "<auto-plan>" + "\ninvoked from: " + myInvocationContext;
    }
    return getClass().getName() + "-> " + myTargetLanguage.getNamespace() + "\ninvoked from: " + myInvocationContext;
  }

  private List<Generator> getUsedGenerators(SModel sourceModel) {
    assert myGenerationStepController == null : "method can't be used with 'auto-plan' generation";

    List<Generator> generators = new ArrayList<Generator>();

    // from all languages used in source model ..
    // we need our scope, because invocation scope might not contain languages
    // that we reduced nodes to  
    List<Language> sourceLanguages = sourceModel.getLanguages(getScope());
    for (Language sourceLanguage : sourceLanguages) {
      // don't try to apply templateLang generator to normal models
      if (sourceLanguage == BootstrapLanguages.getInstance().getTLBase()) {
        if (!(TemplateLanguageUtil.isTemplatesModel(sourceModel))) {
          continue;
        }
      }
      List<Generator> sourceLanguageGenerators = sourceLanguage.getGenerators();
      for (Generator sourceLanguageGenerator : sourceLanguageGenerators) {
        // .. get generator to 'target language'
        if (myTargetLanguage.getNamespace().equals(sourceLanguageGenerator.getTargetLanguageName())) {
          if (!generators.contains(sourceLanguageGenerator)) {
            generators.add(sourceLanguageGenerator);
          }
        }
        // .. get 'rewriting' generator (to self)
        if (sourceLanguage.getNamespace().equals(sourceLanguageGenerator.getTargetLanguageName())) {
          if (!generators.contains(sourceLanguageGenerator)) {
            generators.add(sourceLanguageGenerator);
          }
        }
      }
    }

    // found any generators? add another one
    if (!generators.isEmpty()) {
      // the target language may have "reduction" generator
      List<Generator> reductionGenerators = myTargetLanguage.getGenerators();
      for (Generator generator : reductionGenerators) {
        if (myTargetLanguage.getNamespace().equals(generator.getTargetLanguageName())) {
          if (!generators.contains(generator)) {
            generators.add(generator);
          }
        }
      }
    }

    return generators;
  }

  public void putTransientObject(Object key, Object o) {
    myTransientObjects.put(key, o);
  }

  public Object getTransientObject(Object key) {
    return myTransientObjects.get(key);
  }

  public void putSessionObject(Object key, Object o) {
    mySessionObjects.put(key, o);
  }

  public Object getSessionObject(Object key) {
    return mySessionObjects.get(key);
  }

  public String createUniqueName(String roughName) {
    int count = 1;
    String name = roughName;
    while (myUsedNames.contains(name)) {
      name = roughName + (count++);
    }
    myUsedNames.add(name);
    return name;
  }


  public GenerationStepController getGenerationStepController() {
    return myGenerationStepController;
  }

  public void clearCopiedRootsSet() {
    Set<SNode> set = (Set<SNode>) getSessionObject(COPYED_ROOTS);
    if (set != null) {
      set.clear();
    }
  }

  public void registerCopiedRoot(SNode inputNode) {
    Set<SNode> set = (Set<SNode>) getSessionObject(COPYED_ROOTS);
    if (set == null) {
      set = new HashSet<SNode>();
      putSessionObject(COPYED_ROOTS, set);
    }
    set.add(inputNode);
  }

  public boolean isCopiedRoot(SNode inputNode) {
    Set<SNode> set = (Set<SNode>) getSessionObject(COPYED_ROOTS);
    if (set == null) return false;
    return set.contains(inputNode);
  }

  public class TransientModule extends AbstractModule {
    private List<IModule> myDependOnModules = new ArrayList<IModule>();
    private IModule myInvocationModule;
    private SModelDescriptor myProjectModelDescriptor = ProjectModels.createDescriptorFor(this);
    private ModuleDescriptor myModuleDescriptor = ModuleDescriptor.newInstance(myProjectModelDescriptor.getSModel());

    private MPSModuleOwner myOwnOnwer = new MPSModuleOwner() {
    };

    TransientModule(IModule invocationModule, List<Generator> generatorModules) {
      myInvocationModule = invocationModule;
      myDependOnModules.addAll(generatorModules);
      myDependOnModules.add(invocationModule);

      MPSModuleRepository.getInstance().addModule(this, myOwnOnwer);
    }

    public void addGeneratorModules(List<Generator> generatorModules) {
      for (IModule module : generatorModules) {
        if (!myDependOnModules.contains(module)) {
          myDependOnModules.add(module);
        }
      }
    }

    public void addDependency(IModule m) {
      if (!myDependOnModules.contains(m)) {
        myDependOnModules.add(m);
      }
    }

    @NotNull
    public List<ModelRoot> getNonDefaultModelRoots() {
      return Collections.emptyList();
    }

    @NotNull
    public ModuleDescriptor getModuleDescriptor() {
      return myModuleDescriptor;
    }

    public void dispose() {
      MPSModuleRepository.getInstance().unRegisterModules(this);
      MPSModuleRepository.getInstance().unRegisterModules(myOwnOnwer);

      // force removing transient models from repository
      List<SModelDescriptor> ownModelDescriptors = getOwnModelDescriptors();
      for (SModelDescriptor descriptor : ownModelDescriptors) {
        SModelRepository.getInstance().unRegisterModelDescriptor(descriptor, this);
        if (descriptor.isTransient()) {
          SModelRepository.getInstance().removeModelDescriptor(descriptor);
        }
      }

      if (MPSModuleRepository.getInstance().getOwners(this).size() != 0) {
        MPSModuleRepository.getInstance().unRegisterModules(myOwnOnwer);
      }
    }

    public String toString() {
      String generatorsString = "/";
      for (Generator generator : GenerationSessionContext.this.getGeneratorModules()) {
        generatorsString += generator.getModuleUID();
        generatorsString += "/";
      }

      return "TransientModule:[" + myInvocationModule + "]->[" + generatorsString + "] ";
    }


    @NotNull
    public String getModuleUID() {
      return "";
    }

    public String getGeneratorOutputPath() {
      return myInvocationModule.getGeneratorOutputPath();
    }

    @NotNull
    public List<IModule> getExplicitlyDependOnModules() {
      return new ArrayList<IModule>(myDependOnModules);
    }


    public void setModuleDescriptor(@NotNull ModuleDescriptor moduleDescriptor) {
      throw new UnsupportedOperationException();
    }

    public void save() {
      throw new UnsupportedOperationException();
    }
  } // private class TransientModule
}

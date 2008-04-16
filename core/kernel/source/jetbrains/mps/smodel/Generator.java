package jetbrains.mps.smodel;

import jetbrains.mps.ide.BootstrapLanguagesManager;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.AbstractModule;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.Dependency;
import jetbrains.mps.projectLanguage.structure.*;
import jetbrains.mps.transformation.TLBase.structure.MappingConfiguration;
import jetbrains.mps.util.PathManager;
import jetbrains.mps.vfs.IFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;

/**
 * @author Kostik
 */
public class Generator extends AbstractModule {
  public static final Logger LOG = Logger.getLogger(Generator.class);

  private Language mySourceLanguage;
  private GeneratorDescriptor myGeneratorDescriptor;

  Generator(Language sourceLanguage, GeneratorDescriptor generatorDescriptor) {
    mySourceLanguage = sourceLanguage;
    myGeneratorDescriptor = generatorDescriptor;
    reload();
  }

  public boolean isPackaged() {
    return getSourceLanguage().isPackaged();
  }

  protected void readModels() {
    if (!isInitialized()) {
      super.readModels();
      if (isInitialized()) {
        fireModuleInitialized();
      }
    }
  }

  public SModelDescriptor createModel(SModelUID uid, ModelRoot root) {
    SModelDescriptor result = super.createModel(uid, root);

    LanguageDescriptor oldDescriptor = getSourceLanguage().getLanguageDescriptor();
    getSourceLanguage().setLanguageDescriptor(oldDescriptor);

    return result;
  }

  public void dispose() {
    SModelRepository.getInstance().unRegisterModelDescriptors(Generator.this);
    MPSModuleRepository.getInstance().unRegisterModules(Generator.this);
    MPSModuleRepository.getInstance().removeModule(this);
  }

  public List<SModelDescriptor> getOwnTemplateModels() {
    List<SModelDescriptor> templateModels = new ArrayList<SModelDescriptor>();
    for (SModelDescriptor modelDescriptor : getOwnModelDescriptors()) {
      if (SModelStereotype.TEMPLATES.equals(modelDescriptor.getStereotype())) {
        templateModels.add(modelDescriptor);
      }
    }
    return templateModels;
  }

  public List<MappingConfiguration> getOwnMappings() {
    List<SModelDescriptor> list = getOwnTemplateModels();
    List<MappingConfiguration> mappings = new ArrayList<MappingConfiguration>();
    for (SModelDescriptor templateModel : list) {
      mappings.addAll(templateModel.getSModel().allAdapters(MappingConfiguration.class));
    }
    return mappings;
  }

  public ModuleDescriptor getModuleDescriptor() {
    return myGeneratorDescriptor;
  }


  public void setModuleDescriptor(ModuleDescriptor moduleDescriptor) {
    LOG.error(new UnsupportedOperationException());
  }

  public String getName() {
    return myGeneratorDescriptor.getName();
  }

  public String getAlias() {
    String name = myGeneratorDescriptor.getName();
    return getSourceLanguage().getNamespace() + "/" + (name == null ? "<no name>" : name);
  }

  public String getModuleUID() {
    String uid = myGeneratorDescriptor.getGeneratorUID();
    if (uid == null) {
      myGeneratorDescriptor.setGeneratorUID(generateGeneratorUID(mySourceLanguage));
      mySourceLanguage.save();
    }
    return myGeneratorDescriptor.getGeneratorUID();
  }

  public static String generateGeneratorUID(Language sourceLanguage) {
    return sourceLanguage.getModuleUID() + "#" + SNode.generateUniqueId();
  }

  public Language getSourceLanguage() {
    return mySourceLanguage;
  }

  public Language getTargetLanguage() {
    String targetLanguageName = getTargetLanguageName();
    if (targetLanguageName != null) {
      Language language = MPSModuleRepository.getInstance().getLanguage(targetLanguageName, this);

      if (language == null) {
        language = MPSModuleRepository.getInstance().getLanguage(targetLanguageName, BootstrapLanguagesManager.getInstance());
      }

      if (language != null) {
        return language;
      }
    }

    LOG.error("Can't find target language for generator " + this + " : " + targetLanguageName);

    return null;
  }

  /**
   * @deprecated
   */
  public String getTargetLanguageName() {
    jetbrains.mps.projectLanguage.structure.Language targetLanguage = myGeneratorDescriptor.getTargetLanguage();
    if (targetLanguage != null) {
      return targetLanguage.getName();
    }
    return null;
  }

  public String toString() {
    return getAlias();
  }

  public GeneratorDescriptor getGeneratorDescriptor() {
    return myGeneratorDescriptor;
  }


  public void save() {
    mySourceLanguage.save();
  }

  public List<Dependency> getDependencies() {
    List<Dependency> result = super.getDependencies();
    result.add(new Dependency(mySourceLanguage.getNamespace(), false));

    for (String refGenerator : getReferencedGeneratorUIDs()) {
      result.add(new Dependency(refGenerator, false));
    }

    return result;
  }

  public List<String> getReferencedGeneratorUIDs() {
    List<String> result = new ArrayList<String>();
    for (GeneratorReference generatorReference : myGeneratorDescriptor.getGeneratorReferences()) {
      result.add(generatorReference.getGeneratorUID());
    }
    return result;

  }

  public List<Generator> getReferencedGenerators() {
    List<Generator> result = new ArrayList<Generator>();
    for (String guid : getReferencedGeneratorUIDs()) {
      IModule module = MPSModuleRepository.getInstance().getModuleByUID(guid);
      if (module instanceof Generator) {
        result.add((Generator) module);
      }
    }
    return result;
  }

  public boolean isCompileInMPS() {
    return mySourceLanguage.isCompileInMPS();
  }

  public File getBundleHome() {
    //eclipse's OSGi implementation doesn't allow directories with #. Probably #s are
    //forbidden inside urls
    File home = new File(PathManager.getTmpPath() + "generators", getModuleUID().replace('#', '.'));
    if (!home.exists()) {
      home.mkdirs();
    }

    return home.getAbsoluteFile();
  }

  public void convert() {
  }

  public String getGeneratorOutputPath() {
    return mySourceLanguage.getGeneratorOutputPath();
  }

  public IFile getClassesGen() {
    return mySourceLanguage.getClassesGen();
  }

  public Set<SModelDescriptor> getImplicitlyImportedModelsFor(SModelDescriptor sm) {
    Set<SModelDescriptor> result = new LinkedHashSet<SModelDescriptor>();
    result.add(getSourceLanguage().getStructureModelDescriptor());
    if (getSourceLanguage().getConstraintsModelDescriptor() != null) {
      result.add(getSourceLanguage().getConstraintsModelDescriptor());
    }

    for (Language langauge : getSourceLanguage().getExtendedLanguages()) {
      result.add(langauge.getStructureModelDescriptor());
      if (langauge.getConstraintsModelDescriptor() != null) {
        result.add(langauge.getConstraintsModelDescriptor());
      }
    }

    return result;
  }

  public Set<Language> getImplicitlyImportedLanguages(SModelDescriptor sm) {
    Set<Language> result = new LinkedHashSet<Language>();
    if (SModelStereotype.TEMPLATES.equals(sm.getStereotype())) {
      result.add(getSourceLanguage());
      result.addAll(getSourceLanguage().getExtendedLanguages());
    }
    return result;
  }
}

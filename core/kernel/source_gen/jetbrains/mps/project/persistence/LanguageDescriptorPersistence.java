package jetbrains.mps.project.persistence;

/*Generated by MPS */

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.project.structure.modules.LanguageDescriptor;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.util.Macros;
import org.jdom.Document;
import jetbrains.mps.util.JDOMUtil;
import org.jdom.Element;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.xmlQuery.runtime.AttributeUtils;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.project.structure.modules.ClassPathEntry;
import jetbrains.mps.project.structure.modules.StubModelsEntry;
import jetbrains.mps.project.structure.model.ModelRootManager;
import java.io.File;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.project.structure.modules.GeneratorDescriptor;
import java.io.OutputStream;

public class LanguageDescriptorPersistence {
  protected static Log log = LogFactory.getLog(LanguageDescriptorPersistence.class);

  public static LanguageDescriptor loadLanguageDescriptor(final IFile file) {
    final Macros macros = Macros.languageDescriptor();
    LanguageDescriptor descriptor;

    try {
      Document document = JDOMUtil.loadDocument(file);
      final Element languageElement = ((Element) document.getRootElement());

      descriptor = new _FunctionTypes._return_P0_E0<LanguageDescriptor>() {
        public LanguageDescriptor invoke() {
          LanguageDescriptor result_v3r4p8_a0a0d0d0a = new LanguageDescriptor();
          String result_v3r4p8_a0a0a0d0d0a = languageElement.getAttributeValue("namespace");
          result_v3r4p8_a0a0d0d0a.setNamespace(result_v3r4p8_a0a0a0d0d0a);
          if (languageElement.getAttributeValue("uuid") != null) {
            String result_v3r4p8_a0a1a0a0d0d0a = languageElement.getAttributeValue("uuid");
            result_v3r4p8_a0a0d0d0a.setUUID(result_v3r4p8_a0a1a0a0d0d0a);
          }
          boolean result_v3r4p8_a2a0a0d0d0a = AttributeUtils.booleanWithDefault(languageElement.getAttributeValue("java-stubs-enabled"), false);
          result_v3r4p8_a0a0d0d0a.setEnableJavaStubs(result_v3r4p8_a2a0a0d0d0a);

          if (languageElement.getAttributeValue("generatorOutputPath") != null) {
            String result_v3r4p8_a0a4a0a0d0d0a = macros.expandPath(languageElement.getAttributeValue("generatorOutputPath"), file);
            result_v3r4p8_a0a0d0d0a.setGenPath(result_v3r4p8_a0a4a0a0d0d0a);
          }

          if (ListSequence.fromList(AttributeUtils.elementChildren(languageElement, "models")).isNotEmpty()) {
            result_v3r4p8_a0a0d0d0a.getModelRoots().addAll(ModuleDescriptorPersistence.loadModelRoots(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(languageElement, "models")).first(), "modelRoot"), file, macros));
          } else {
            // old - for backwards compatibility 
            result_v3r4p8_a0a0d0d0a.getModelRoots().addAll(ModuleDescriptorPersistence.loadModelRoots(AttributeUtils.elementChildren(languageElement, "modelRoot"), file, macros));
          }

          ModuleDescriptorPersistence.loadDependencies(result_v3r4p8_a0a0d0d0a, languageElement);

          for (Element extendedLanguage : ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(languageElement, "extendedLanguages")).first(), "extendedLanguage"))) {
            result_v3r4p8_a0a0d0d0a.getExtendedLanguages().add(ModuleReference.fromString(extendedLanguage.getText()));
          }

          Element autoImports = ListSequence.fromList(AttributeUtils.elementChildren(languageElement, "accessoryModels")).first();
          if (autoImports == null) {
            // deprecated name 
            autoImports = ListSequence.fromList(AttributeUtils.elementChildren(languageElement, "library")).first();
          }
          for (Element modelElement : ListSequence.fromList(AttributeUtils.elementChildren(autoImports, "model"))) {
            result_v3r4p8_a0a0d0d0a.getAccessoryModels().add(SModelReference.fromString(modelElement.getAttributeValue("modelUID")));
          }

          for (Element generatorElement : ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(languageElement, "generators")).first(), "generator"))) {
            result_v3r4p8_a0a0d0d0a.getGenerators().add(GeneratorDescriptorPersistence.loadGeneratorDescriptor(generatorElement, file, macros));
          }

          for (Element entryElement : ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(languageElement, "classPath")).first(), "entry")).concat(ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(languageElement, "runtimeClassPath")).first(), "entry")))) {
            // runtimeClassPath was left for compatibility 
            ClassPathEntry result_v3r4p8_a1a81a0a0d0d0a = new ClassPathEntry();
            String result_v3r4p8_a0a1a81a0a0d0d0a = macros.expandPath(entryElement.getAttributeValue("path"), file);
            result_v3r4p8_a1a81a0a0d0d0a.setPath(result_v3r4p8_a0a1a81a0a0d0d0a);
            boolean result_v3r4p8_a1a1a81a0a0d0d0a = AttributeUtils.booleanWithDefault(entryElement.getAttributeValue("include"), false);
            result_v3r4p8_a1a81a0a0d0d0a.setIncludedInVCS(result_v3r4p8_a1a1a81a0a0d0d0a);
            result_v3r4p8_a0a0d0d0a.getClassPaths().add(result_v3r4p8_a1a81a0a0d0d0a);
          }

          if (ListSequence.fromList(AttributeUtils.elementChildren(languageElement, "stubModelEntries")).isNotEmpty()) {
            result_v3r4p8_a0a0d0d0a.getStubModelEntries().addAll(ModuleDescriptorPersistence.loadStubModelEntries(AttributeUtils.elementChildren(languageElement, "stubModelEntries"), file, macros));
          }

          for (Element entryElement : ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(languageElement, "languageRuntimeClassPath")).first(), "entry"))) {
            ClassPathEntry result_v3r4p8_a0a22a0a0d0d0a = new ClassPathEntry();
            String result_v3r4p8_a0a0a22a0a0d0d0a = macros.expandPath(entryElement.getAttributeValue("path"), file);
            result_v3r4p8_a0a22a0a0d0d0a.setPath(result_v3r4p8_a0a0a22a0a0d0d0a);
            boolean result_v3r4p8_a1a0a22a0a0d0d0a = AttributeUtils.booleanWithDefault(entryElement.getAttributeValue("include"), false);
            result_v3r4p8_a0a22a0a0d0d0a.setIncludedInVCS(result_v3r4p8_a1a0a22a0a0d0d0a);
            result_v3r4p8_a0a0d0d0a.getRuntimeClassPaths().add(result_v3r4p8_a0a22a0a0d0d0a);
          }

          if (ListSequence.fromList(AttributeUtils.elementChildren(languageElement, "runtimeStubModels")).isNotEmpty()) {
            for (Element entryElement : ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(languageElement, "runtimeStubModels")).first(), "stubModelEntry"))) {
              StubModelsEntry result_v3r4p8_a0a0a42a0a0d0d0a = new StubModelsEntry();
              String result_v3r4p8_a0a0a0a42a0a0d0d0a = macros.expandPath(entryElement.getAttributeValue("path"), file);
              result_v3r4p8_a0a0a42a0a0d0d0a.setPath(result_v3r4p8_a0a0a0a42a0a0d0d0a);
              ModelRootManager result_v3r4p8_a1a0a0a42a0a0d0d0a = new ModelRootManager();
              String result_v3r4p8_a0a1a0a0a42a0a0d0d0a = AttributeUtils.stringWithDefault(ListSequence.fromList(AttributeUtils.elementChildren(entryElement, "manager")).first().getAttributeValue("moduleId"), "");
              result_v3r4p8_a1a0a0a42a0a0d0d0a.setModuleId(result_v3r4p8_a0a1a0a0a42a0a0d0d0a);
              String result_v3r4p8_a1a1a0a0a42a0a0d0d0a = AttributeUtils.stringWithDefault(ListSequence.fromList(AttributeUtils.elementChildren(entryElement, "manager")).first().getAttributeValue("className"), "");
              result_v3r4p8_a1a0a0a42a0a0d0d0a.setClassName(result_v3r4p8_a1a1a0a0a42a0a0d0d0a);
              result_v3r4p8_a0a0a42a0a0d0d0a.setManager(result_v3r4p8_a1a0a0a42a0a0d0d0a);
              boolean result_v3r4p8_a2a0a0a42a0a0d0d0a = AttributeUtils.booleanWithDefault(entryElement.getAttributeValue("include"), false);
              result_v3r4p8_a0a0a42a0a0d0d0a.setIncludedInVCS(result_v3r4p8_a2a0a0a42a0a0d0d0a);
              result_v3r4p8_a0a0d0d0a.getRuntimeStubModels().add(result_v3r4p8_a0a0a42a0a0d0d0a);
            }
          }

          for (Element entryElement : ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(languageElement, "sourcePath")).first(), "source"))) {
            result_v3r4p8_a0a0d0d0a.getSourcePaths().add(macros.expandPath(entryElement.getAttributeValue("path"), file));
          }

          boolean result_v3r4p8_a82a0a0d0d0a = AttributeUtils.booleanWithDefault(languageElement.getAttributeValue("compileInMPS"), false);
          result_v3r4p8_a0a0d0d0a.setCompileInMPS(result_v3r4p8_a82a0a0d0d0a);
          boolean result_v3r4p8_a92a0a0d0d0a = AttributeUtils.booleanWithDefault(languageElement.getAttributeValue("doNotGenerateAdapters"), false);
          result_v3r4p8_a0a0d0d0a.setDoNotGenerateAdapters(result_v3r4p8_a92a0a0d0d0a);
          return result_v3r4p8_a0a0d0d0a;
        }
      }.invoke();
    } catch (Exception e) {
      throw new ModuleReadException(e);
    }

    ModuleDescriptorPersistence.setTimestamp(descriptor, file, false);
    return descriptor;
  }

  public static void saveLanguageDescriptor(File file, LanguageDescriptor descriptor) {
    saveLanguageDescriptor(FileSystem.getFile(file), descriptor);
  }

  public static void saveLanguageDescriptor(final IFile file, final LanguageDescriptor descriptor) {
    if (file.isReadOnly()) {
      if (log.isErrorEnabled()) {
        log.error("Cant't save " + file.getPath());
      }
      return;
    }

    final Macros macros = Macros.languageDescriptor();
    Element languageElement = new _FunctionTypes._return_P0_E0<Element>() {
      public Element invoke() {
        Element result_v3r4p8_a0a0d0c = new Element("language");
        String result_v3r4p8_a0a0a0d0c = descriptor.getNamespace();
        result_v3r4p8_a0a0d0c.setAttribute("namespace", "" + result_v3r4p8_a0a0a0d0c);
        if (descriptor.getUUID() != null) {
          String result_v3r4p8_a0a1a0a0d0c = descriptor.getUUID();
          result_v3r4p8_a0a0d0c.setAttribute("uuid", "" + result_v3r4p8_a0a1a0a0d0c);
        }
        if (descriptor.getGenPath() != null) {
          String result_v3r4p8_a0a2a0a0d0c = macros.shrinkPath(descriptor.getGenPath(), file);
          result_v3r4p8_a0a0d0c.setAttribute("generatorOutputPath", "" + result_v3r4p8_a0a2a0a0d0c);
        }
        boolean result_v3r4p8_a3a0a0d0c = descriptor.getEnableJavaStubs();
        result_v3r4p8_a0a0d0c.setAttribute("java-stubs-enabled", "" + result_v3r4p8_a3a0a0d0c);

        Element result_v3r4p8_a5a0a0d0c = new Element("models");
        ModuleDescriptorPersistence.saveModelRoots(result_v3r4p8_a5a0a0d0c, descriptor.getModelRoots(), file, macros);
        result_v3r4p8_a0a0d0c.addContent(result_v3r4p8_a5a0a0d0c);

        Element result_v3r4p8_a7a0a0d0c = new Element("accessoryModels");
        for (SModelReference model : ListSequence.fromList(descriptor.getAccessoryModels())) {
          Element result_v3r4p8_a0a0a7a0a0d0c = new Element("model");
          String result_v3r4p8_a0a0a0a7a0a0d0c = model.toString();
          result_v3r4p8_a0a0a7a0a0d0c.setAttribute("modelUID", "" + result_v3r4p8_a0a0a0a7a0a0d0c);
          result_v3r4p8_a7a0a0d0c.addContent(result_v3r4p8_a0a0a7a0a0d0c);
        }
        result_v3r4p8_a0a0d0c.addContent(result_v3r4p8_a7a0a0d0c);

        Element result_v3r4p8_a9a0a0d0c = new Element("generators");
        for (GeneratorDescriptor generatorDescriptor : ListSequence.fromList(descriptor.getGenerators())) {
          GeneratorDescriptorPersistence.saveGeneratorDescriptor(result_v3r4p8_a9a0a0d0c, generatorDescriptor, file, macros);
        }
        result_v3r4p8_a0a0d0c.addContent(result_v3r4p8_a9a0a0d0c);

        Element result_v3r4p8_a11a0a0d0c = new Element("classPath");
        for (ClassPathEntry entry : ListSequence.fromList(descriptor.getClassPaths())) {
          Element result_v3r4p8_a0a0a11a0a0d0c = new Element("entry");
          String result_v3r4p8_a0a0a0a11a0a0d0c = macros.shrinkPath(entry.getPath(), file);
          result_v3r4p8_a0a0a11a0a0d0c.setAttribute("path", "" + result_v3r4p8_a0a0a0a11a0a0d0c);
          boolean result_v3r4p8_a1a0a0a11a0a0d0c = entry.isIncludedInVCS();
          result_v3r4p8_a0a0a11a0a0d0c.setAttribute("include", "" + result_v3r4p8_a1a0a0a11a0a0d0c);
          result_v3r4p8_a11a0a0d0c.addContent(result_v3r4p8_a0a0a11a0a0d0c);
        }
        result_v3r4p8_a0a0d0c.addContent(result_v3r4p8_a11a0a0d0c);

        if (!(descriptor.getStubModelEntries().isEmpty())) {
          Element result_v3r4p8_a0a31a0a0d0c = new Element("stubModelEntries");
          ModuleDescriptorPersistence.saveStubModelEntries(result_v3r4p8_a0a31a0a0d0c, descriptor.getStubModelEntries(), file, macros);
          result_v3r4p8_a0a0d0c.addContent(result_v3r4p8_a0a31a0a0d0c);
        }

        Element result_v3r4p8_a51a0a0d0c = new Element("languageRuntimeClassPath");
        for (ClassPathEntry entry : ListSequence.fromList(descriptor.getRuntimeClassPaths())) {
          Element result_v3r4p8_a0a0a51a0a0d0c = new Element("entry");
          String result_v3r4p8_a0a0a0a51a0a0d0c = macros.shrinkPath(entry.getPath(), file);
          result_v3r4p8_a0a0a51a0a0d0c.setAttribute("path", "" + result_v3r4p8_a0a0a0a51a0a0d0c);
          result_v3r4p8_a51a0a0d0c.addContent(result_v3r4p8_a0a0a51a0a0d0c);
        }
        result_v3r4p8_a0a0d0c.addContent(result_v3r4p8_a51a0a0d0c);

        if (!(descriptor.getRuntimeStubModels().isEmpty())) {
          Element result_v3r4p8_a0a71a0a0d0c = new Element("runtimeStubModels");
          for (StubModelsEntry entry : ListSequence.fromList(descriptor.getRuntimeStubModels())) {
            Element result_v3r4p8_a0a0a0a71a0a0d0c = new Element("stubModelEntry");
            String result_v3r4p8_a0a0a0a0a71a0a0d0c = macros.shrinkPath(entry.getPath(), file);
            result_v3r4p8_a0a0a0a71a0a0d0c.setAttribute("path", "" + result_v3r4p8_a0a0a0a0a71a0a0d0c);
            boolean result_v3r4p8_a1a0a0a0a71a0a0d0c = entry.isIncludedInVCS();
            result_v3r4p8_a0a0a0a71a0a0d0c.setAttribute("include", "" + result_v3r4p8_a1a0a0a0a71a0a0d0c);
            Element result_v3r4p8_a2a0a0a0a71a0a0d0c = new Element("manager");
            String result_v3r4p8_a0a2a0a0a0a71a0a0d0c = entry.getManager().getModuleId();
            result_v3r4p8_a2a0a0a0a71a0a0d0c.setAttribute("moduleId", "" + result_v3r4p8_a0a2a0a0a0a71a0a0d0c);
            String result_v3r4p8_a1a2a0a0a0a71a0a0d0c = entry.getManager().getClassName();
            result_v3r4p8_a2a0a0a0a71a0a0d0c.setAttribute("className", "" + result_v3r4p8_a1a2a0a0a0a71a0a0d0c);
            result_v3r4p8_a0a0a0a71a0a0d0c.addContent(result_v3r4p8_a2a0a0a0a71a0a0d0c);
            result_v3r4p8_a0a71a0a0d0c.addContent(result_v3r4p8_a0a0a0a71a0a0d0c);
          }
          result_v3r4p8_a0a0d0c.addContent(result_v3r4p8_a0a71a0a0d0c);
        }

        Element result_v3r4p8_a91a0a0d0c = new Element("sourcePath");
        for (String p : ListSequence.fromList(descriptor.getSourcePaths())) {
          Element result_v3r4p8_a0a0a91a0a0d0c = new Element("source");
          String result_v3r4p8_a0a0a0a91a0a0d0c = macros.shrinkPath(p, file);
          result_v3r4p8_a0a0a91a0a0d0c.setAttribute("path", "" + result_v3r4p8_a0a0a0a91a0a0d0c);
          result_v3r4p8_a91a0a0d0c.addContent(result_v3r4p8_a0a0a91a0a0d0c);
        }
        result_v3r4p8_a0a0d0c.addContent(result_v3r4p8_a91a0a0d0c);

        boolean result_v3r4p8_a12a0a0d0c = descriptor.getCompileInMPS();
        result_v3r4p8_a0a0d0c.setAttribute("compileInMPS", "" + result_v3r4p8_a12a0a0d0c);
        boolean result_v3r4p8_a22a0a0d0c = descriptor.isDoNotGenerateAdapters();
        result_v3r4p8_a0a0d0c.setAttribute("doNotGenerateAdapters", "" + result_v3r4p8_a22a0a0d0c);

        ModuleDescriptorPersistence.saveDependencies(result_v3r4p8_a0a0d0c, descriptor);

        Element result_v3r4p8_a62a0a0d0c = new Element("extendedLanguages");
        for (ModuleReference ref : ListSequence.fromList(descriptor.getExtendedLanguages())) {
          Element result_v3r4p8_a0a0a62a0a0d0c = new Element("extendedLanguage");
          String result_v3r4p8_a0a0a0a62a0a0d0c = ref.toString();
          result_v3r4p8_a0a0a62a0a0d0c.setText(result_v3r4p8_a0a0a0a62a0a0d0c);
          result_v3r4p8_a62a0a0d0c.addContent(result_v3r4p8_a0a0a62a0a0d0c);
        }
        result_v3r4p8_a0a0d0c.addContent(result_v3r4p8_a62a0a0d0c);
        return result_v3r4p8_a0a0d0c;
      }
    }.invoke();

    try {
      OutputStream os = file.openOutputStream();
      JDOMUtil.writeDocument(new Document(languageElement), os);
    } catch (Exception e) {
      if (log.isErrorEnabled()) {
        log.error("", e);
      }
    }
    ModuleDescriptorPersistence.setTimestamp(descriptor, file, true);
  }
}

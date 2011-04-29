package jetbrains.mps.project.persistence;

/*Generated by MPS */

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.project.structure.modules.SolutionDescriptor;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.util.Macros;
import jetbrains.mps.util.MacrosFactory;
import org.jdom.Document;
import jetbrains.mps.util.JDOMUtil;
import org.jdom.Element;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.xmlQuery.runtime.AttributeUtils;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.project.structure.modules.StubModelsEntry;
import jetbrains.mps.smodel.LanguageID;
import java.io.OutputStream;

public class SolutionDescriptorPersistence {
  protected static Log log = LogFactory.getLog(SolutionDescriptorPersistence.class);

  private SolutionDescriptorPersistence() {
  }

  public static SolutionDescriptor loadSolutionDescriptor(final IFile file) {
    final Macros macros = MacrosFactory.solutionDescriptor();
    SolutionDescriptor descriptor;
    try {
      Document document = JDOMUtil.loadDocument(file);
      Element rootElement = document.getRootElement();
      final Element solutionElement = (Element) rootElement;

      assert solutionElement != null;

      descriptor = new _FunctionTypes._return_P0_E0<SolutionDescriptor>() {
        public SolutionDescriptor invoke() {
          final SolutionDescriptor result_8ckma3_a0a0g0c0a = new SolutionDescriptor();
          final String result_8ckma3_a0a0a0g0c0a = solutionElement.getAttributeValue("name");
          result_8ckma3_a0a0g0c0a.setNamespace(result_8ckma3_a0a0a0g0c0a);

          if (solutionElement.getAttributeValue("uuid") != null) {
            final String result_8ckma3_a0a2a0a0g0c0a = solutionElement.getAttributeValue("uuid");
            result_8ckma3_a0a0g0c0a.setUUID(result_8ckma3_a0a2a0a0g0c0a);
          }

          final boolean result_8ckma3_a4a0a0g0c0a = AttributeUtils.booleanWithDefault(solutionElement.getAttributeValue("dontLoadClasses"), false);
          result_8ckma3_a0a0g0c0a.setDontLoadClasses(result_8ckma3_a4a0a0g0c0a);
          final boolean result_8ckma3_a5a0a0g0c0a = AttributeUtils.booleanWithDefault(solutionElement.getAttributeValue("compileInMPS"), false);
          result_8ckma3_a0a0g0c0a.setCompileInMPS(result_8ckma3_a5a0a0g0c0a);

          if (StringUtils.isNotEmpty(solutionElement.getAttributeValue("generatorOutputPath"))) {
            final String result_8ckma3_a0a7a0a0g0c0a = macros.expandPath(solutionElement.getAttributeValue("generatorOutputPath"), file);
            result_8ckma3_a0a0g0c0a.setOutputPath(result_8ckma3_a0a7a0a0g0c0a);
          }

          result_8ckma3_a0a0g0c0a.getModelRoots().addAll(ModuleDescriptorPersistence.loadModelRoots(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(solutionElement, "models")).first(), "modelRoot"), file, macros));

          if (ListSequence.fromList(AttributeUtils.elementChildren(solutionElement, "stubModelEntries")).isNotEmpty()) {
            result_8ckma3_a0a0g0c0a.getStubModelEntries().addAll(ModuleDescriptorPersistence.loadStubModelEntries(AttributeUtils.elementChildren(solutionElement, "stubModelEntries"), file, macros));
          }

          ModuleDescriptorPersistence.loadDependencies(result_8ckma3_a0a0g0c0a, solutionElement);
          for (Element entryElement : ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(solutionElement, "classPath")).first(), "entry")).concat(ListSequence.fromList(AttributeUtils.elementChildren(ListSequence.fromList(AttributeUtils.elementChildren(solutionElement, "runtimeClassPath")).first(), "entry")))) {
            // runtime classpath left for compatibility 
            StubModelsEntry entry = new StubModelsEntry();
            entry.setIncludedInVCS(AttributeUtils.booleanWithDefault(entryElement.getAttributeValue("include"), false));
            entry.setPath(macros.expandPath(entryElement.getAttributeValue("path"), file));
            entry.setManager(LanguageID.JAVA_MANAGER);
            result_8ckma3_a0a0g0c0a.getStubModelEntries().add(entry);
          }
          return result_8ckma3_a0a0g0c0a;
        }
      }.invoke();
    } catch (Exception e) {
      throw new ModuleReadException(e);
    }
    ModuleDescriptorPersistence.setTimestamp(descriptor, file);
    return descriptor;
  }

  public static void saveSolutionDescriptor(final IFile file, final SolutionDescriptor descriptor) {
    if (file.isReadOnly()) {
      if (log.isErrorEnabled()) {
        log.error("Can't save " + file.getPath());
      }
      return;
    }

    final Macros macros = MacrosFactory.solutionDescriptor();
    Element solElem = new _FunctionTypes._return_P0_E0<Element>() {
      public Element invoke() {
        final Element result_8ckma3_a0a0d0b = new Element("solution");
        if (descriptor.getNamespace() != null) {
          final String result_8ckma3_a0a0a0a0d0b = descriptor.getNamespace();
          result_8ckma3_a0a0d0b.setAttribute("name", "" + result_8ckma3_a0a0a0a0d0b);
        }
        if (descriptor.getUUID() != null) {
          final String result_8ckma3_a0a1a0a0d0b = descriptor.getUUID();
          result_8ckma3_a0a0d0b.setAttribute("uuid", "" + result_8ckma3_a0a1a0a0d0b);
        }
        if (descriptor.isDontLoadClasses()) {
          final boolean result_8ckma3_a0a2a0a0d0b = true;
          result_8ckma3_a0a0d0b.setAttribute("dontLoadClasses", "" + result_8ckma3_a0a2a0a0d0b);
        }
        final boolean result_8ckma3_a3a0a0d0b = descriptor.getCompileInMPS();
        result_8ckma3_a0a0d0b.setAttribute("compileInMPS", "" + result_8ckma3_a3a0a0d0b);
        if (descriptor.getOutputPath() != null) {
          final String result_8ckma3_a0a4a0a0d0b = macros.shrinkPath(descriptor.getOutputPath(), file);
          result_8ckma3_a0a0d0b.setAttribute("generatorOutputPath", "" + result_8ckma3_a0a4a0a0d0b);
        }

        final Element result_8ckma3_a6a0a0d0b = new Element("models");
        ModuleDescriptorPersistence.saveModelRoots(result_8ckma3_a6a0a0d0b, descriptor.getModelRoots(), file, macros);
        result_8ckma3_a0a0d0b.addContent(result_8ckma3_a6a0a0d0b);

        if (!(descriptor.getStubModelEntries().isEmpty())) {
          final Element result_8ckma3_a0a8a0a0d0b = new Element("stubModelEntries");
          ModuleDescriptorPersistence.saveStubModelEntries(result_8ckma3_a0a8a0a0d0b, descriptor.getStubModelEntries(), file, macros);
          result_8ckma3_a0a0d0b.addContent(result_8ckma3_a0a8a0a0d0b);
        }

        ModuleDescriptorPersistence.saveDependencies(result_8ckma3_a0a0d0b, descriptor);
        return result_8ckma3_a0a0d0b;
      }
    }.invoke();

    try {
      OutputStream os = file.openOutputStream();
      JDOMUtil.writeDocument(new Document(solElem), os);
    } catch (Exception e) {
      if (log.isErrorEnabled()) {
        log.error("", e);
      }
    }

    ModuleDescriptorPersistence.setTimestamp(descriptor, file);
  }
}

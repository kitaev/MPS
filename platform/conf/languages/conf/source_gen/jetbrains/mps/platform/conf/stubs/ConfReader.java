package jetbrains.mps.platform.conf.stubs;

/*Generated by MPS */

import org.jdom.Namespace;
import java.util.regex.Pattern;
import jetbrains.mps.smodel.SNode;
import org.jdom.Document;
import org.jdom.Element;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SEnumOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.regex.Matcher;
import jetbrains.mps.platform.conf.behavior.Service_Behavior;
import org.jdom.Attribute;
import java.util.List;
import org.jdom.filter.AbstractFilter;
import org.jdom.filter.ElementFilter;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.StaticReference;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SNodeId;

public class ConfReader {
  private static final Namespace XI = Namespace.getNamespace("xi", "http://www.w3.org/2001/XInclude");
  private static final String IDEA_PLUGIN = "idea-plugin";
  private static final String COMPONENT = "component";
  private static final String ROOT = "root";
  private static final String COMPONENTS = "components";
  private static final String EXTENSION_POINTS = "extensionPoints";
  private static final String EXTENSIONS = "extensions";
  private static final String APPLICATION_COMPONENTS = "application-components";
  private static final String MODULE_COMPONENTS = "module-components";
  private static final String PROJECT_COMPONENTS = "project-components";
  private static final String EXTENSION_POINT = "extensionPoint";
  private static final String NAME = "name";
  private static final String BEAN_CLASS = "beanClass";
  private static final String INTERFACE = "interface";
  private static final String INTERFACE_CLASS = "interface-class";
  private static final String IMPLEMENTATION_CLASS = "implementation-class";
  private static final String APPLICATION_SERVICE = "applicationService";
  private static final String MODULE_SERVICE = "moduleService";
  private static final String PROJECT_SERVICE = "projectService";
  private static final String SERVICE_INTERFACE = "serviceInterface";
  private static final String SERVICE_IMPLEMENTATION = "serviceImplementation";
  private static final String IMPLEMENTATION = "implementation";
  private static final String META_INF = "META-INF";
  private static final String INCLUDE = "include";
  private static final String HREF = "href";
  private static final String XPOINTER = "xpointer";
  private static final Pattern XPOINTER_PTN = Pattern.compile("xpointer\\((.*)\\)");
  private static final Pattern INCLUDE_PTN = Pattern.compile("\\/(.*)\\/\\*");
  private static final String ID = "id";
  private static final String VERSION = "version";
  private static final String DESCRIPTION = "description";
  private static final String CHANGE_NOTES = "change-notes";
  private static final String RESOURCE_BUNDLE = "resource-bundle";
  private static final String VENDOR = "vendor";
  private static final String DEPENDS = "depends";
  private static final String HELPSET = "helpset";
  private static final String IDEA_VERSION = "idea-version";
  private static final String URL = "url";
  private static final String EMAIL = "email";
  private static final String LOGO = "logo";
  private static final String CONFIG = "config";
  private static final String OPTIONAL = "optional";
  private static final String PLUGIN = "plugin";
  private static final String FILE = "file";
  private static final String PATH = "path";
  private static final String SINCE_BUILD = "since-build";
  private static final String UNTIL_BUILD = "until-build";
  private static final String CATEGORY = "category";

  private ConfReader.Resolver confstubResolver;
  private ConfReader.Resolver javastubResolver;

  public ConfReader(ConfReader.Resolver javaResolver, ConfReader.Resolver confResolver) {
    this.javastubResolver = javaResolver;
    this.confstubResolver = confResolver;
  }

  public void read(SNode confDoc, Document doc) {
    Element root = doc.getRootElement();
    String rootName = root.getName();
    if (IDEA_PLUGIN.equals(rootName)) {
      SNode ip = SLinkOperations.setNewChild(confDoc, "root", "jetbrains.mps.platform.conf.structure.IdeaPlugin");
      readPlugin(ip, root);
      readContainers(ip, root);
    } else if (COMPONENT.equals(rootName)) {
      readContainers(SLinkOperations.setNewChild(confDoc, "root", "jetbrains.mps.platform.conf.structure.ComponentRoot"), root);
    } else if (ROOT.equals(rootName)) {
      readContainers(SLinkOperations.setNewChild(confDoc, "root", "jetbrains.mps.platform.conf.structure.RootRoot"), root);
    } else if (COMPONENTS.equals(rootName)) {
      readContainers(SLinkOperations.setNewChild(confDoc, "root", "jetbrains.mps.platform.conf.structure.ComponentsRoot"), root);
    } else if (EXTENSION_POINTS.equals(rootName)) {
      readExtensionPoints(SLinkOperations.setNewChild(confDoc, "root", "jetbrains.mps.platform.conf.structure.ExtensionPoints"), root);
    } else if (EXTENSIONS.equals(rootName)) {
      readExtensions(SLinkOperations.setNewChild(confDoc, "root", "jetbrains.mps.platform.conf.structure.Extensions"), root);
    } else if (APPLICATION_COMPONENTS.equals(rootName)) {
      readComponents(SLinkOperations.setNewChild(confDoc, "root", "jetbrains.mps.platform.conf.structure.Components"), SEnumOperations.getEnumMember(SEnumOperations.getEnum("r:d3304d29-cd93-4341-982d-9f0d1a8b40bf(jetbrains.mps.platform.conf.structure)", "Level"), "application"), root);
    } else if (MODULE_COMPONENTS.equals(rootName)) {
      readComponents(SLinkOperations.setNewChild(confDoc, "root", "jetbrains.mps.platform.conf.structure.Components"), SEnumOperations.getEnumMember(SEnumOperations.getEnum("r:d3304d29-cd93-4341-982d-9f0d1a8b40bf(jetbrains.mps.platform.conf.structure)", "Level"), "module"), root);
    } else if (PROJECT_COMPONENTS.equals(rootName)) {
      readComponents(SLinkOperations.setNewChild(confDoc, "root", "jetbrains.mps.platform.conf.structure.Components"), SEnumOperations.getEnumMember(SEnumOperations.getEnum("r:d3304d29-cd93-4341-982d-9f0d1a8b40bf(jetbrains.mps.platform.conf.structure)", "Level"), "project"), root);
    }
  }

  private void readPlugin(SNode node, Element root) {
    SNode plugin = SLinkOperations.setNewChild(node, "plugin", "jetbrains.mps.platform.conf.structure.Plugin");
    for (Element prp : elements(root, NAME, ID, VERSION)) {
      if (Namespace.NO_NAMESPACE.equals(prp.getNamespace())) {
        plugin.setProperty(prp.getName(), prp.getTextTrim());
      }
    }
    for (Element dtl : elements(root, DESCRIPTION, CHANGE_NOTES, RESOURCE_BUNDLE, CATEGORY)) {
      if (Namespace.NO_NAMESPACE.equals(dtl.getNamespace())) {
        SNode pd = SLinkOperations.addNewChild(plugin, "details", "jetbrains.mps.platform.conf.structure.PluginDetails");
        SPropertyOperations.set(pd, "kind", dtl.getName());
        SPropertyOperations.set(pd, "value", dtl.getTextTrim());
      }
    }
    for (Element elm : elements(root, VENDOR, DEPENDS, HELPSET, IDEA_VERSION)) {
      if (Namespace.NO_NAMESPACE.equals(elm.getNamespace())) {
        if (VENDOR.equals(elm.getName())) {
          SNode pv = SLinkOperations.setNewChild(plugin, "vendor", "jetbrains.mps.platform.conf.structure.PluginVendor");
          SPropertyOperations.set(pv, "name", elm.getTextTrim());
          SPropertyOperations.set(pv, "url", elm.getAttributeValue(URL));
          SPropertyOperations.set(pv, "email", elm.getAttributeValue(EMAIL));
          SPropertyOperations.set(pv, "logo", elm.getAttributeValue(LOGO));
        } else if (DEPENDS.equals(elm.getName())) {
          SNode pd = SLinkOperations.addNewChild(plugin, "depends", "jetbrains.mps.platform.conf.structure.PluginDependency");
          SPropertyOperations.set(pd, "config", elm.getAttributeValue(CONFIG));
          SPropertyOperations.set(pd, "optional", "" + Boolean.valueOf(elm.getAttributeValue(OPTIONAL)));
          addConfXmlNodeReference(SLinkOperations.findLinkDeclaration("jetbrains.mps.platform.conf.structure.PluginDependency", "plugin"), pd, fqName(META_INF, PLUGIN, elm.getTextTrim()));
        } else if (HELPSET.equals(elm.getName())) {
          SNode ph = SLinkOperations.setNewChild(plugin, "helpset", "jetbrains.mps.platform.conf.structure.PluginHelpset");
          SPropertyOperations.set(ph, "file", elm.getAttributeValue(FILE));
          SPropertyOperations.set(ph, "path", elm.getAttributeValue(PATH));
        } else if (IDEA_VERSION.equals(elm.getName())) {
          SNode iv = SLinkOperations.setNewChild(plugin, "ideaVersion", "jetbrains.mps.platform.conf.structure.IdeaVersion");
          SPropertyOperations.set(iv, "sinceBuild", elm.getAttributeValue(SINCE_BUILD));
          SPropertyOperations.set(iv, "untilBuild", elm.getAttributeValue(UNTIL_BUILD));
        }
      }
    }
  }

  private void readContainers(SNode node, Element root) {
    for (Element container : elements(root, EXTENSION_POINTS, EXTENSIONS, APPLICATION_COMPONENTS, MODULE_COMPONENTS, PROJECT_COMPONENTS)) {
      if (Namespace.NO_NAMESPACE.equals(container.getNamespace())) {
        if (EXTENSION_POINTS.equals(container.getName())) {
          readExtensionPoints(SLinkOperations.addNewChild(node, "fragment", "jetbrains.mps.platform.conf.structure.ExtensionPoints"), container);
        } else if (EXTENSIONS.equals(container.getName())) {
          readExtensions(SLinkOperations.addNewChild(node, "fragment", "jetbrains.mps.platform.conf.structure.Extensions"), container);
        } else if (APPLICATION_COMPONENTS.equals(container.getName())) {
          readComponents(SLinkOperations.addNewChild(node, "fragment", "jetbrains.mps.platform.conf.structure.Components"), SEnumOperations.getEnumMember(SEnumOperations.getEnum("r:d3304d29-cd93-4341-982d-9f0d1a8b40bf(jetbrains.mps.platform.conf.structure)", "Level"), "application"), container);
        } else if (MODULE_COMPONENTS.equals(container.getName())) {
          readComponents(SLinkOperations.addNewChild(node, "fragment", "jetbrains.mps.platform.conf.structure.Components"), SEnumOperations.getEnumMember(SEnumOperations.getEnum("r:d3304d29-cd93-4341-982d-9f0d1a8b40bf(jetbrains.mps.platform.conf.structure)", "Level"), "module"), container);
        } else if (PROJECT_COMPONENTS.equals(container.getName())) {
          readComponents(SLinkOperations.addNewChild(node, "fragment", "jetbrains.mps.platform.conf.structure.Components"), SEnumOperations.getEnumMember(SEnumOperations.getEnum("r:d3304d29-cd93-4341-982d-9f0d1a8b40bf(jetbrains.mps.platform.conf.structure)", "Level"), "project"), container);
        }
      } else if (XI.equals(container.getNamespace())) {
        if (INCLUDE.equals(container.getName())) {
          readInclude(node, container);
        }
      }
    }
  }

  private void readExtensionPoints(SNode node, Element eps) {
    for (Element ep : elements(eps, EXTENSION_POINT)) {
      if (Namespace.NO_NAMESPACE.equals(ep.getNamespace())) {
        String bc = ep.getAttributeValue(BEAN_CLASS);
        String ifc = ep.getAttributeValue(INTERFACE);
        if (bc != null) {
          SNode bep = SConceptOperations.createNewNode("jetbrains.mps.platform.conf.structure.BeanExtensionPoint", null);
          bep.setId(createForeignId(resolveInfo(EXTENSION_POINT, ep.getAttributeValue(NAME))));
          ListSequence.fromList(SLinkOperations.getTargets(node, "fragment", true)).addElement(bep);
          SPropertyOperations.set(bep, "name", ep.getAttributeValue(NAME));
          addClassifierReference(SLinkOperations.findLinkDeclaration("jetbrains.mps.platform.conf.structure.BeanExtensionPoint", "beanClass"), bep, bc);
        } else if (ifc != null) {
          SNode iep = SConceptOperations.createNewNode("jetbrains.mps.platform.conf.structure.IntefaceExtensionPoint", null);
          iep.setId(createForeignId(resolveInfo(EXTENSION_POINT, ep.getAttributeValue(NAME))));
          ListSequence.fromList(SLinkOperations.getTargets(node, "fragment", true)).addElement(iep);
          SPropertyOperations.set(iep, "name", ep.getAttributeValue(NAME));
          addClassifierReference(SLinkOperations.findLinkDeclaration("jetbrains.mps.platform.conf.structure.IntefaceExtensionPoint", "iface"), iep, ifc);
        } else {
          throw new IllegalStateException();
        }
      } else if (XI.equals(ep.getNamespace())) {
        readInclude(node, ep);
      }
    }
  }

  private void readExtensions(SNode node, Element es) {
    for (Element ext : elements(es)) {
      if (Namespace.NO_NAMESPACE.equals(ext.getNamespace())) {
        if (APPLICATION_SERVICE.equals(ext.getName())) {
          readService(node, SEnumOperations.getEnumMember(SEnumOperations.getEnum("r:d3304d29-cd93-4341-982d-9f0d1a8b40bf(jetbrains.mps.platform.conf.structure)", "Level"), "application"), ext);
        } else if (MODULE_SERVICE.equals(ext.getName())) {
          readService(node, SEnumOperations.getEnumMember(SEnumOperations.getEnum("r:d3304d29-cd93-4341-982d-9f0d1a8b40bf(jetbrains.mps.platform.conf.structure)", "Level"), "module"), ext);
        } else if (PROJECT_SERVICE.equals(ext.getName())) {
          readService(node, SEnumOperations.getEnumMember(SEnumOperations.getEnum("r:d3304d29-cd93-4341-982d-9f0d1a8b40bf(jetbrains.mps.platform.conf.structure)", "Level"), "project"), ext);
        } else {
          readExtension(node, ext);
        }
      } else if (XI.equals(ext.getNamespace())) {
        readInclude(node, ext);
      }
    }
  }

  public void readInclude(SNode node, Element include) {
    SNode xi = SLinkOperations.addNewChild(node, "fragment", "jetbrains.mps.platform.conf.structure.XInclude");
    String href = include.getAttributeValue(HREF);
    if (href != null) {
      // this is basically a package + doc file name 
      while (href.startsWith("/")) {
        href = href.substring(1);
      }
      if (href.endsWith(".xml") || href.endsWith(".XML")) {
        href = href.substring(0, href.length() - 4);
      }
      String pkg = SNodeOperations.getModel(node).getSModelReference().getLongName();
      String name = href;
      int lastSlash = href.lastIndexOf("/");
      if (lastSlash > 0) {
        pkg = href.substring(0, lastSlash).replace('/', '.');
        name = href.substring(lastSlash + 1);
      }
      addConfXmlDocumentReference(SLinkOperations.findLinkDeclaration("jetbrains.mps.platform.conf.structure.XInclude", "document"), xi, pkg + "." + name);
    }
    String xpointer = include.getAttributeValue(XPOINTER);
    if (xpointer == null) {
      xpointer = "xpointer(/components/*)";
    }
    Matcher m = XPOINTER_PTN.matcher(xpointer);
    if (m.matches()) {
      Matcher mm = INCLUDE_PTN.matcher(m.group(1));
      if (mm.matches()) {
        SPropertyOperations.set(xi, "includeRoot", mm.group(1));
      }
    }
  }

  private void readComponents(SNode node, SNode level, Element cs) {
    SPropertyOperations.set(node, "level", SEnumOperations.getEnumMemberValue(level));
    for (Element cmp : elements(cs, COMPONENT)) {
      String ifc = cmp.getChildTextTrim(INTERFACE_CLASS);
      String impl = cmp.getChildTextTrim(IMPLEMENTATION_CLASS);
      SNode subNode = SLinkOperations.addNewChild(node, "fragment", "jetbrains.mps.platform.conf.structure.Component");
      if (ifc != null) {
        addClassifierReference(SLinkOperations.findLinkDeclaration("jetbrains.mps.platform.conf.structure.Component", "ifaceClass"), subNode, ifc);
      }
      if (impl != null) {
        addClassifierReference(SLinkOperations.findLinkDeclaration("jetbrains.mps.platform.conf.structure.Component", "implClass"), subNode, impl);
      }
    }
  }

  private void readService(SNode node, SNode level, Element srv) {
    SNode subNode = SLinkOperations.addNewChild(node, "fragment", "jetbrains.mps.platform.conf.structure.Service");
    SPropertyOperations.set(subNode, "level", SEnumOperations.getEnumMemberValue(level));
    String ifc = srv.getAttributeValue(SERVICE_INTERFACE);
    if (ifc != null) {
      addClassifierReference(SLinkOperations.findLinkDeclaration("jetbrains.mps.platform.conf.structure.Service", "serviceIface"), subNode, ifc);
    }
    String impl = srv.getAttributeValue(SERVICE_IMPLEMENTATION);
    if (impl != null) {
      addClassifierReference(SLinkOperations.findLinkDeclaration("jetbrains.mps.platform.conf.structure.Service", "serviceImpl"), subNode, impl);
    }
    addConfXmlNodeReference(SLinkOperations.findLinkDeclaration("jetbrains.mps.platform.conf.structure.Extension", "extensionPoint"), subNode, fqName(META_INF, EXTENSION_POINT, Service_Behavior.call_canonicName_6121364846593753707(subNode)));
  }

  private void readExtension(SNode node, Element ext) {
    String impl = ext.getAttributeValue(IMPLEMENTATION);
    if (impl != null) {
      SNode subNode = SLinkOperations.addNewChild(node, "fragment", "jetbrains.mps.platform.conf.structure.InterfaceExtension");
      addClassifierReference(SLinkOperations.findLinkDeclaration("jetbrains.mps.platform.conf.structure.InterfaceExtension", "impl"), subNode, impl);
      addConfXmlNodeReference(SLinkOperations.findLinkDeclaration("jetbrains.mps.platform.conf.structure.Extension", "extensionPoint"), subNode, fqName(META_INF, EXTENSION_POINT, ext.getName()));
    } else {
      SNode subNode = SLinkOperations.addNewChild(node, "fragment", "jetbrains.mps.platform.conf.structure.BeanExtension");
      addConfXmlNodeReference(SLinkOperations.findLinkDeclaration("jetbrains.mps.platform.conf.structure.Extension", "extensionPoint"), subNode, fqName(META_INF, EXTENSION_POINT, ext.getName()));
      for (Attribute attr : (List<Attribute>) ext.getAttributes()) {
        SNode bea = SLinkOperations.addNewChild(subNode, "attribute", "jetbrains.mps.platform.conf.structure.BeanExtensionAttribute");
        SPropertyOperations.set(bea, "name", attr.getName());
        SPropertyOperations.set(bea, "value", attr.getValue());
      }
    }
  }

  private Iterable<Element> elements(Element parent, String name, String... orName) {
    AbstractFilter flt = new ElementFilter(name, Namespace.NO_NAMESPACE);
    if (orName != null) {
      for (String or : orName) {
        flt = (AbstractFilter) flt.or(new ElementFilter(or, Namespace.NO_NAMESPACE));
      }
    }
    return (List<Element>) parent.getContent(flt.or(new ElementFilter("include", XI)));
  }

  private Iterable<Element> elements(Element parent) {
    AbstractFilter flt = new ElementFilter(Namespace.NO_NAMESPACE);
    return (List<Element>) parent.getContent(flt.or(new ElementFilter("include", XI)));
  }

  private void addConfXmlDocumentReference(SNode link, SNode src, String fqName) {
    SModelReference trgsmref = this.confstubResolver.stubModelReference(namespace(fqName));
    if (SNodeOperations.getModel(src).getSModelReference().equals(trgsmref)) {
      src.addReference(new StaticReference(SPropertyOperations.getString(link, "role"), src, trgsmref, createForeignId(fqName), null));
    } else {
      SNodeOperations.getModel(src).addModelImport(trgsmref, false);
      src.addReference(SReference.create(SPropertyOperations.getString(link, "role"), src, trgsmref, createForeignId(fqName)));
    }
  }

  private void addConfXmlNodeReference(SNode link, SNode src, String fqName) {
    SModelReference trgsmref = this.confstubResolver.stubModelReference(namespace(fqName));
    if (SNodeOperations.getModel(src).getSModelReference().equals(trgsmref)) {
      String shortName = shortName(fqName);
      int dlr = shortName.indexOf("$");
      if (dlr >= 0) {
        String elmName = shortName.substring(0, dlr);
        if (EXTENSION_POINT.equals(elmName) || ConfReader.PLUGIN.equals(elmName)) {
          src.addReference(new StaticReference(SPropertyOperations.getString(link, "role"), src, trgsmref, createForeignId(fqName), null));
        }
      }
    } else {
      SNodeOperations.getModel(src).addModelImport(trgsmref, false);
      src.addReference(SReference.create(SPropertyOperations.getString(link, "role"), src, trgsmref, createForeignId(fqName)));
    }
  }

  private void addClassifierReference(SNode link, SNode src, String fqClassName) {
    SModelReference trgsmref = this.javastubResolver.stubModelReference(namespace(fqClassName));
    SNodeOperations.getModel(src).addModelImport(trgsmref, false);
    src.addReference(SReference.create(SPropertyOperations.getString(link, "role"), src, trgsmref, createForeignId(fqClassName)));
  }

  private static String namespace(String fqName) {
    if (fqName == null) {
      return null;
    }
    int idx = fqName.lastIndexOf(".");
    if (idx < 0) {
      return "";
    }
    return fqName.substring(0, idx);
  }

  private static String shortName(String fqName) {
    if (fqName == null) {
      return null;
    }
    int idx = fqName.lastIndexOf(".");
    if (idx < 0) {
      return fqName;
    }
    return fqName.substring(idx + 1);
  }

  private static String fqName(String modelId, String prefix, String shortName) {
    return modelId + "." + prefix + "$" + shortName.replace('.', '-');
  }

  private static String resolveInfo(String prefix, String shortName) {
    return prefix + "$" + shortName.replace('.', '-');
  }

  public static SNodeId createForeignId(String fqName) {
    return new SNodeId.Foreign(SNodeId.Foreign.ID_PREFIX + shortName(fqName));
  }

  public static boolean canRead(Document doc) {
    if (doc == null) {
      return false;
    }
    Element root = doc.getRootElement();
    if (root == null) {
      return false;
    }
    String rootName = root.getName();
    return IDEA_PLUGIN.equals(rootName) || COMPONENT.equals(rootName) || COMPONENTS.equals(rootName) || EXTENSION_POINTS.equals(rootName) || EXTENSIONS.equals(rootName) || APPLICATION_COMPONENTS.equals(rootName) || MODULE_COMPONENTS.equals(rootName) || PROJECT_COMPONENTS.equals(rootName);
  }

  public static interface Resolver {
    public SModelReference stubModelReference(String pkg);
  }
}

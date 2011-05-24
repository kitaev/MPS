package jetbrains.mps.platform.conf.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.StructureDescriptor;
import com.google.common.collect.ImmutableList;
import java.util.Set;
import java.util.List;
import java.util.HashSet;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import java.util.Collections;

public class StructureAspectDescriptor extends DescriptorProvider<StructureDescriptor> {
  public StructureAspectDescriptor() {
  }

  public StructureDescriptor getDescriptor(String conceptFqName) {
    switch ((conceptFqName).hashCode()) {
      case 971103837:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.Component", new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfigurationElement"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfigurationElement", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1758453151:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.Extension", new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfigurationElement"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfigurationElement", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1977845617:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.IConfigurationElement", new String[]{"jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{});
      case -209702095:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.ExtensionPoint", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.lang.core.structure.IResolveInfo", "jetbrains.mps.platform.conf.structure.IConfigurationElement"}, new String[]{"jetbrains.mps.platform.conf.structure.IConfigurationElement", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.lang.core.structure.IResolveInfo"});
      case 1469365021:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.IConfigurationFragment", new String[]{}, new String[]{}, new String[]{});
      case 936997293:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.IConfiguration", new String[]{"jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{});
      case -336597476:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.ConfigurationXmlDocument", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case -1164321518:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.IExternalConfigurationFragment", new String[]{"jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{});
      case -819034192:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.XInclude", new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IExternalConfigurationFragment"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfigurationFragment", "jetbrains.mps.platform.conf.structure.IExternalConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 51868547:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 2089169762:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.ExtensionPoints", new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfiguration"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfiguration", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 39447990:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.Components", new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfiguration", "jetbrains.mps.platform.conf.structure.HasLevel"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.HasLevel", "jetbrains.mps.platform.conf.structure.IConfiguration", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 920817409:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.BeanExtensionPoint", new String[]{"jetbrains.mps.platform.conf.structure.ExtensionPoint"}, new String[]{"jetbrains.mps.platform.conf.structure.ExtensionPoint", "jetbrains.mps.platform.conf.structure.IConfigurationElement", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.lang.core.structure.IResolveInfo"});
      case 409603012:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.IntefaceExtensionPoint", new String[]{"jetbrains.mps.platform.conf.structure.ExtensionPoint"}, new String[]{"jetbrains.mps.platform.conf.structure.ExtensionPoint", "jetbrains.mps.platform.conf.structure.IConfigurationElement", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.lang.core.structure.IResolveInfo"});
      case -1441308651:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.Service", new String[]{"jetbrains.mps.platform.conf.structure.Extension", "jetbrains.mps.platform.conf.structure.HasLevel"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.Extension", "jetbrains.mps.platform.conf.structure.HasLevel", "jetbrains.mps.platform.conf.structure.IConfigurationElement", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1307720618:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.HasLevel", new String[]{}, new String[]{}, new String[]{});
      case -1322527052:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.Extensions", new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfiguration"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfiguration", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1817002068:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.IdeaPluginRoot", new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlRootNode", "jetbrains.mps.platform.conf.structure.IConfiguration"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.ConfigurationXmlRootNode", "jetbrains.mps.platform.conf.structure.IConfiguration", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1169645519:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.BeanExtension", new String[]{"jetbrains.mps.platform.conf.structure.Extension"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.Extension", "jetbrains.mps.platform.conf.structure.IConfigurationElement", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 182413734:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.InterfaceExtension", new String[]{"jetbrains.mps.platform.conf.structure.Extension"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.Extension", "jetbrains.mps.platform.conf.structure.IConfigurationElement", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 2025833357:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.BeanExtensionAttribute", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 903593983:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.IConfigurationElementFragment", new String[]{}, new String[]{}, new String[]{});
      case 1137121208:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.ComponentsRoot", new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlRootNode", "jetbrains.mps.platform.conf.structure.IConfiguration"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.ConfigurationXmlRootNode", "jetbrains.mps.platform.conf.structure.IConfiguration", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1626841889:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.ComponentRoot", new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlRootNode", "jetbrains.mps.platform.conf.structure.IConfiguration"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.ConfigurationXmlRootNode", "jetbrains.mps.platform.conf.structure.IConfiguration", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1017956228:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.RootRoot", new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlRootNode", "jetbrains.mps.platform.conf.structure.IConfiguration"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.ConfigurationXmlRootNode", "jetbrains.mps.platform.conf.structure.IConfiguration", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 2023670890:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.IPluginConfigurationFragment", new String[]{}, new String[]{}, new String[]{});
      case -1511314989:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.Plugin", new String[]{"jetbrains.mps.platform.conf.structure.IdeaPluginRoot", "jetbrains.mps.platform.conf.structure.IConfigurationFragment", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.lang.core.structure.IResolveInfo"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.ConfigurationXmlRootNode", "jetbrains.mps.platform.conf.structure.IConfiguration", "jetbrains.mps.platform.conf.structure.IConfigurationFragment", "jetbrains.mps.platform.conf.structure.IdeaPluginRoot"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.lang.core.structure.IResolveInfo"});
      case 1250684286:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.PluginDependency", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1533989115:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.PluginVendor", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 1519271151:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.PluginDetails", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1436871489:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.IdeaVersion", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 767386670:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.PluginHelpset", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -292298147:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.Actions", new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfiguration"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfiguration", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1347244952:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.AbstractAction", new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfigurationElement", "jetbrains.mps.lang.core.structure.IResolveInfo"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfigurationElement", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.IResolveInfo"});
      case 842362598:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.Shortcut", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 1427577195:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.MouseShortcut", new String[]{"jetbrains.mps.platform.conf.structure.Shortcut"}, new String[]{"jetbrains.mps.platform.conf.structure.Shortcut"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 415682541:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.KeyboardShortcut", new String[]{"jetbrains.mps.platform.conf.structure.Shortcut"}, new String[]{"jetbrains.mps.platform.conf.structure.Shortcut"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1165269025:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.Group", new String[]{"jetbrains.mps.platform.conf.structure.AbstractAction"}, new String[]{"jetbrains.mps.platform.conf.structure.AbstractAction", "jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfigurationElement", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.IResolveInfo"});
      case -1969266132:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.GroupReference", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1744980203:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.ActionReference", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.platform.conf.structure.IActionItem"}, new String[]{"jetbrains.mps.platform.conf.structure.IActionItem"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1949091626:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.Action", new String[]{"jetbrains.mps.platform.conf.structure.AbstractAction", "jetbrains.mps.platform.conf.structure.IActionItem"}, new String[]{"jetbrains.mps.platform.conf.structure.AbstractAction", "jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IActionItem", "jetbrains.mps.platform.conf.structure.IConfigurationElement", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.IResolveInfo"});
      case 2057533714:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.IActionItem", new String[]{}, new String[]{}, new String[]{});
      case -191126459:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.Separator", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.platform.conf.structure.IActionItem"}, new String[]{"jetbrains.mps.platform.conf.structure.IActionItem"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case -1365344507:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.ConfigurationXmlRootNode", new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfiguration"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfiguration", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      default:
        return null;
    }
  }

  public static class DataBasedStructureDescriptor extends StructureDescriptor {
    private ImmutableList<String> parents;
    private Set<String> ancestors;

    public DataBasedStructureDescriptor(String fqName, String[] parents, String[] ancestorsInLanguage, String[] ancestorsNotInLanguage) {
      this.parents = ImmutableList.copyOf(parents);
      this.ancestors = getAncestors(fqName, ancestorsInLanguage, ancestorsNotInLanguage);
    }

    public Set<String> getAncestorsNames() {
      return ancestors;
    }

    public boolean isAssignableTo(String toConceptFqName) {
      return ancestors.contains(toConceptFqName);
    }

    public List<String> getParentsNames() {
      return parents;
    }

    private static Set<String> getAncestors(String conceptFqName, String[] ancestorsInLanguage, String[] ancestorsNotInLanguage) {
      Set<String> result = new HashSet(ancestorsInLanguage.length + 1);

      result.add(conceptFqName);
      for (String ancestor : ancestorsInLanguage) {
        result.add(ancestor);
      }

      ConceptRegistry registry = ConceptRegistry.getInstance();
      for (String parent : ancestorsNotInLanguage) {
        if (!(result.contains(parent))) {
          result.addAll(registry.getStructureDescriptor(parent).getAncestorsNames());
        }
      }

      return Collections.unmodifiableSet(result);
    }
  }
}

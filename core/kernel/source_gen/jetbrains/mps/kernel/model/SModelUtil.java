package jetbrains.mps.kernel.model;

/*Generated by MPS */

import java.util.Map;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.smodel.Language;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.reloading.ClassLoaderManager;
import jetbrains.mps.smodel.GlobalSModelEventsManager;
import jetbrains.mps.reloading.ReloadAdapter;
import jetbrains.mps.smodel.SModelAdapter;
import jetbrains.mps.smodel.event.SModelListener;
import jetbrains.mps.smodel.event.SModelRootEvent;
import jetbrains.mps.smodel.LanguageAspect;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.event.SModelPropertyEvent;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.nodeEditor.NodeReadAccessCasterInEditor;
import com.intellij.openapi.util.Computable;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.LinkedHashSet;
import jetbrains.mps.smodel.search.ConceptAndSuperConceptsScope;
import java.util.ArrayList;
import jetbrains.mps.smodel.LanguageHierarchyCache;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SEnumOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.AttributesRolesUtil;

public class SModelUtil {
  private static Map<String, SNode> myFQNameToConcepDecl = MapSequence.fromMap(new HashMap<String, SNode>());
  private static Map<SNode, Language> myConceptToLanguage = MapSequence.fromMap(new HashMap<SNode, Language>());
  protected static Log log = LogFactory.getLog(SModelUtil.class);

  public static void startListeningOnce(ClassLoaderManager clManager, GlobalSModelEventsManager meManager) {
    clManager.addReloadHandler(new ReloadAdapter() {
      public void clearCaches() {
        MapSequence.fromMap(SModelUtil.myFQNameToConcepDecl).clear();
        MapSequence.fromMap(SModelUtil.myConceptToLanguage).clear();
      }
    });
    meManager.addGlobalModelListener(new SModelAdapter(SModelListener.SModelListenerPriority.PLATFORM) {
      public void rootRemoved(SModelRootEvent p0) {
        if (Language.getModelAspect(p0.getModelDescriptor()) == LanguageAspect.STRUCTURE) {
          if (SNodeOperations.isInstanceOf(((SNode) p0.getRoot()), "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration")) {
            MapSequence.fromMap(SModelUtil.myFQNameToConcepDecl).clear();
            MapSequence.fromMap(SModelUtil.myConceptToLanguage).clear();
          }
        }
      }

      public void modelReplaced(SModelDescriptor descriptor) {
        if (Language.getModelAspect(descriptor) != LanguageAspect.STRUCTURE) {
          return;
        }
        MapSequence.fromMap(SModelUtil.myFQNameToConcepDecl).clear();
        MapSequence.fromMap(SModelUtil.myConceptToLanguage).clear();
      }

      public void propertyChanged(SModelPropertyEvent p0) {
        if (Language.getModelAspect(p0.getModelDescriptor()) == LanguageAspect.STRUCTURE) {
          if (SNodeOperations.isInstanceOf(((SNode) p0.getNode()), "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration")) {
            if (p0.getPropertyName().equals("name")) {
              String modelName = p0.getNode().getModel().getLongName();
              String newName = modelName + "." + p0.getNewPropertyValue();
              String oldName = modelName + "." + p0.getOldPropertyValue();
              MapSequence.fromMap(SModelUtil.myFQNameToConcepDecl).put(newName, MapSequence.fromMap(SModelUtil.myFQNameToConcepDecl).get(oldName));
              MapSequence.fromMap(SModelUtil.myFQNameToConcepDecl).removeKey(oldName);
            }
          }
        }
      }
    });
  }

  public static void clearCaches() {
    MapSequence.fromMap(myFQNameToConcepDecl).clear();
    MapSequence.fromMap(myConceptToLanguage).clear();
  }

  public static SNode findNodeByFQName(String nodeFQName, SNode concept, IScope scope) {
    String modelName = NameUtil.namespaceFromLongName(nodeFQName);
    String name = NameUtil.shortNameFromLongName(nodeFQName);
    for (SModelDescriptor descriptor : ListSequence.fromList(scope.getModelDescriptors())) {
      if (!(modelName.equals(descriptor.getLongName()))) {
        continue;
      }
      SModel model = descriptor.getSModel();
      for (SNode root : ListSequence.fromList(SModelOperations.getRoots(model, null))) {
        if (name.equals(root.getName()) && SNodeOperations.isInstanceOf(root, NameUtil.nodeFQName(concept))) {
          return root;
        }
      }
    }
    if (log.isWarnEnabled()) {
      log.warn("couldn't find node by fqname: " + nodeFQName);
    }
    return null;
  }

  public static SNode findConceptDeclaration(final String conceptFQName, final IScope scope) {
    SNode cd = MapSequence.fromMap(myFQNameToConcepDecl).get(conceptFQName);
    if (cd != null) {
      return cd;
    }
    if (conceptFQName.equals("jetbrains.mps.smodel.structure.ModelPersistence$UnknownSNode")) {
      return null;
    }
    return NodeReadAccessCasterInEditor.runReadTransparentAction(new Computable<SNode>() {
      public SNode compute() {
        String languageNamespace = NameUtil.namespaceFromConceptFQName(conceptFQName);
        Language language = scope.getLanguage(languageNamespace);
        if (language == null) {
          return null;
        }
        String conceptName = NameUtil.shortNameFromLongName(conceptFQName);
        AbstractConceptDeclaration resultAdapter = language.findConceptDeclaration(conceptName);
        SNode result = ((SNode) BaseAdapter.fromAdapter(resultAdapter));
        MapSequence.fromMap(SModelUtil.myFQNameToConcepDecl).put(conceptFQName, result);
        return result;
      }
    });
  }

  public static SNode getConceptLinkTarget(SNode link) {
    if (SNodeOperations.isInstanceOf(link, "jetbrains.mps.lang.structure.structure.ReferenceConceptLink")) {
      return SLinkOperations.getTarget(SNodeOperations.cast(link, "jetbrains.mps.lang.structure.structure.ReferenceConceptLink"), "target", false);
    }
    return SLinkOperations.getTarget(SNodeOperations.cast(link, "jetbrains.mps.lang.structure.structure.AggregationConceptLink"), "target", true);
  }

  public static SNode getBaseConcept() {
    return SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.BaseConcept");
  }

  public static Language getDeclaringLanguage(SNode concept, @NotNull IScope scope) {
    Language l = MapSequence.fromMap(myConceptToLanguage).get(concept);
    if (l != null) {
      return l;
    }
    String languageNamespace = NameUtil.namespaceFromConcept(((AbstractConceptDeclaration) SNodeOperations.getAdapter(concept)));
    if (languageNamespace == null) {
      return null;
    }
    l = scope.getLanguage(languageNamespace);
    if (l != null) {
      MapSequence.fromMap(myConceptToLanguage).put(concept, l);
    }
    return l;
  }

  public static SNode getGenuineLinkDeclaration(SNode linkDeclaration) {
    while (linkDeclaration != null && SLinkOperations.getTarget(linkDeclaration, "specializedLink", false) != null) {
      linkDeclaration = SLinkOperations.getTarget(linkDeclaration, "specializedLink", false);
    }
    return linkDeclaration;
  }

  public static String getGenuineLinkRole(SNode linkDecl) {
    SNode genLinkDecl = getGenuineLinkDeclaration(linkDecl);
    if (genLinkDecl == null) {
      return null;
    }
    return SPropertyOperations.getString(genLinkDecl, "role");
  }

  public static List<SNode> getDirectSuperInterfacesAndTheirSupers(SNode concept) {
    Set<SNode> result = SetSequence.fromSet(new LinkedHashSet<SNode>());
    for (SNode superConcept : ListSequence.fromList(getDirectSuperConcepts(concept))) {
      if (SNodeOperations.isInstanceOf(superConcept, "jetbrains.mps.lang.structure.structure.InterfaceConceptDeclaration") && !(SetSequence.fromSet(result).contains(superConcept))) {
        for (AbstractConceptDeclaration adapter : ListSequence.fromList(new ConceptAndSuperConceptsScope(((AbstractConceptDeclaration) SNodeOperations.getAdapter(superConcept))).getConcepts())) {
          SetSequence.fromSet(result).addElement((SNode) adapter.getNode());
        }
      }
    }
    return ListSequence.fromListWithValues(new ArrayList<SNode>(), result);
  }

  public static List<SNode> getDirectSuperConcepts(SNode concept) {
    List<SNode> result = ListSequence.fromList(new ArrayList<SNode>());
    if (SNodeOperations.isInstanceOf(concept, "jetbrains.mps.lang.structure.structure.ConceptDeclaration")) {
      SNode conceptDecl = (SNode) concept;
      SNode extended = SLinkOperations.getTarget(conceptDecl, "extends", false);
      if (extended != null) {
        ListSequence.fromList(result).addElement(extended);
      }
      for (SNode ref : ListSequence.fromList(SLinkOperations.getTargets(conceptDecl, "implements", true))) {
        if (SLinkOperations.getTarget(ref, "intfc", false) != null) {
          ListSequence.fromList(result).addElement(SLinkOperations.getTarget(ref, "intfc", false));
        }
      }
    } else {
      SNode intConceptDecl = (SNode) concept;
      for (SNode ref : ListSequence.fromList(SLinkOperations.getTargets(intConceptDecl, "extends", true))) {
        if (SLinkOperations.getTarget(ref, "intfc", false) != null) {
          ListSequence.fromList(result).addElement(SLinkOperations.getTarget(ref, "intfc", false));
        }
      }
    }
    return result;
  }

  public static boolean isAssignableConcept(SNode from, SNode to) {
    if (from == to) {
      return true;
    }
    if (from == null || to == null) {
      return false;
    }
    if (to == SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.BaseConcept")) {
      return true;
    }
    String fromFqName = NameUtil.nodeFQName(from);
    String toFqName = NameUtil.nodeFQName(to);
    return LanguageHierarchyCache.getInstance().getAncestorsNames(fromFqName).contains(toFqName);
  }

  public static SNode getGenuineLinkSourceCardinality(SNode linkDecl) {
    return SEnumOperations.enumMemberForValue(SEnumOperations.getEnum("r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)", "Cardinality"), SPropertyOperations.getString_def(getGenuineLinkDeclaration(linkDecl), "sourceCardinality", "0..1"));
  }

  public static SNode findAnnotationLinkDeclaration(final String childRole, IScope scope) {
    List<SNode> annotationLinks = SConceptOperations.findConceptInstances(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.structure.structure.AnnotationLinkDeclaration"), scope);
    if (childRole == null) {
      return null;
    }
    SNode annotationLinkDeclaration = ListSequence.fromList(annotationLinks).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode ald) {
        return SPropertyOperations.hasValue(ald, "stereotype", "node", "node") && childRole.equals(AttributesRolesUtil.childRoleFromAttributeRole(SPropertyOperations.getString(ald, "role")));
      }
    });
    return annotationLinkDeclaration;
  }
}

package jetbrains.mps.lang.smodel.generator.smodelAdapter;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.project.GlobalScope;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.IScope;
import java.util.Set;
import jetbrains.mps.smodel.LanguageHierarchyCache;
import jetbrains.mps.smodel.Language;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelOperations;
import jetbrains.mps.findUsages.FindUsagesManager;
import jetbrains.mps.project.AuxilaryRuntimeModel;

public final class SConceptOperations {
  private SConceptOperations() {
  }

  public static boolean isExactly(SNode conceptDeclarationNode, String conceptFqName) {
    if (conceptDeclarationNode == null) {
      return false;
    }
    return NameUtil.nodeFQName(conceptDeclarationNode).equals(conceptFqName);
  }

  @Deprecated
  public static boolean isAssignableFrom(SNode conceptDeclarationNode, SNode fromConceptDeclarationNode) {
    if (conceptDeclarationNode == null || fromConceptDeclarationNode == null) {
      return false;
    }
    return SModelUtil_new.isAssignableConcept(NameUtil.nodeFQName(fromConceptDeclarationNode), NameUtil.nodeFQName(conceptDeclarationNode));
  }

  public static boolean isSuperConceptOf(SNode superConcept, String subConceptFQName) {
    if (superConcept == null) {
      return false;
    }
    String superConceptFQName = NameUtil.nodeFQName(superConcept);
    return SModelUtil_new.isAssignableConcept(subConceptFQName, superConceptFQName);
  }

  public static boolean isSubConceptOf(SNode subConcept, String superConceptFQName) {
    if (subConcept == null) {
      return false;
    }
    String subConceptFQName = NameUtil.nodeFQName(subConcept);
    return SModelUtil_new.isAssignableConcept(subConceptFQName, superConceptFQName);
  }

  public static SNode findConceptDeclaration(@NotNull String conceptFqName) {
    return SModelUtil.findConceptDeclaration(conceptFqName, GlobalScope.getInstance());
  }

  @Deprecated
  public static List<SNode> getDirectSuperConcepts(SNode conceptDeclarationNode) {
    return getDirectSuperConcepts(conceptDeclarationNode, false);
  }

  public static List<SNode> getDirectSuperConcepts(SNode conceptDeclarationNode, boolean inclusion) {
    if (conceptDeclarationNode == null) {
      return new ArrayList<SNode>();
    }
    BaseAdapter adapter = conceptDeclarationNode.getAdapter();
    if (!((adapter instanceof AbstractConceptDeclaration))) {
      return new ArrayList<SNode>();
    }
    List<AbstractConceptDeclaration> list = SModelUtil_new.getDirectSuperConcepts((AbstractConceptDeclaration) adapter);
    List<SNode> result = BaseAdapter.toNodes(list);
    if (inclusion) {
      result.add(0, conceptDeclarationNode);
    }
    return result;
  }

  @Deprecated
  public static List<SNode> getAllSuperConcepts(SNode conceptDeclarationNode) {
    return getAllSuperConcepts(conceptDeclarationNode, false);
  }

  public static List<SNode> getAllSuperConcepts(SNode conceptDeclarationNode, boolean inclusion) {
    if (conceptDeclarationNode == null) {
      return new ArrayList<SNode>();
    }
    List<SNode> result = SModelUtil_new.getConceptAndSuperConcepts(conceptDeclarationNode);
    if (!(inclusion)) {
      result.remove(conceptDeclarationNode);
    }
    return result;
  }

  public static List<SNode> getConceptHierarchy(SNode conceptDeclarationNode) {
    if (conceptDeclarationNode == null) {
      return new ArrayList<SNode>();
    }
    return SModelUtil_new.getConceptAndSuperConcepts(conceptDeclarationNode);
  }

  public static List<SNode> getAllSubConcepts(SNode conceptDeclarationNode, SModel model, IScope scope) {
    if (conceptDeclarationNode == null) {
      return new ArrayList<SNode>();
    }
    Set<String> descendants = LanguageHierarchyCache.getInstance().getAllDescendantsOfConcept(NameUtil.nodeFQName(conceptDeclarationNode));
    Set<Language> availableLanguages = new HashSet<Language>(SModelOperations.getLanguages(model, scope));
    List<SNode> result = new ArrayList<SNode>();
    for (String descendant : descendants) {
      SNode declaration = SModelUtil.findConceptDeclaration(descendant, GlobalScope.getInstance());
      Language lang = SModelUtil.getDeclaringLanguage(declaration);
      if (availableLanguages.contains(lang)) {
        result.add(lang.findConceptDeclaration(NameUtil.shortNameFromLongName(descendant)).getNode());
      }
    }
    return result;
  }

  public static List<SNode> findConceptInstances(SNode conceptDeclarationNode, IScope scope) {
    if (conceptDeclarationNode == null) {
      return new ArrayList<SNode>();
    }
    if (scope == null) {
      scope = GlobalScope.getInstance();
    }
    return FindUsagesManager.getInstance().findInstances(conceptDeclarationNode, scope);
  }

  public static SNode createNewNode(String conceptFqName) {
    return jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations.createNewNode(AuxilaryRuntimeModel.getDescriptor().getSModel(), conceptFqName);
  }

  @Deprecated
  public static SNode createNewNode(String conceptFqName, SNode prototypeNode) {
    return jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations.createNewNode(AuxilaryRuntimeModel.getDescriptor().getSModel(), conceptFqName);
  }
}

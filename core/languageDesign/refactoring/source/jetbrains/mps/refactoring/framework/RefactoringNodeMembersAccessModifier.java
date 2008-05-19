package jetbrains.mps.refactoring.framework;

import jetbrains.mps.util.Pair;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.refactoring.framework.RefactoringContext.ConceptFeatureKind;
import jetbrains.mps.smodel.INodeMemberAccessModifier;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.MPSModuleRepository;

import java.util.*;

import org.jetbrains.annotations.NotNull;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 29.02.2008
 * Time: 18:14:51
 * To change this template use File | Settings | File Templates.
 */
public class RefactoringNodeMembersAccessModifier implements INodeMemberAccessModifier {
  private static Logger LOG = Logger.getLogger(RefactoringNodeMembersAccessModifier.class);

  private Map<Pair<String, String>, String> myChildrenRolesMap = new HashMap<Pair<String, String>, String>();
  private Map<Pair<String, String>, String> myReferencesRolesMap = new HashMap<Pair<String, String>, String>();
  private Map<Pair<String, String>, String> myPropertiesNamesMap = new HashMap<Pair<String, String>, String>();

  private Set<Pair<String, String>> myAbsentChildrenRoles = new HashSet<Pair<String, String>>();
  private Set<Pair<String, String>> myAbsentReferentRoles = new HashSet<Pair<String, String>>();
  private Set<Pair<String, String>> myAbsentPropertyNames = new HashSet<Pair<String, String>>();

  private Set<SModel> myModifiableModels = new HashSet<SModel>();

  public void addModelsToModify(Collection<SModel> models) {
    LOG.assertInCommand();
    myModifiableModels.addAll(models);
  }

  public void addChildRoleChange(String conceptFQName, String oldRole, String newRole) {
    LOG.assertInCommand();
    myChildrenRolesMap.put(new Pair<String, String>(conceptFQName, oldRole), newRole);
  }

  public void addReferentRoleChange(String conceptFQName, String oldRole, String newRole) {
    LOG.assertInCommand();
    myReferencesRolesMap.put(new Pair<String, String>(conceptFQName, oldRole), newRole);
  }

  public void addPropertyNameChange(String conceptFQName, String oldName, String newName) {
    LOG.assertInCommand();
    myPropertiesNamesMap.put(new Pair<String, String>(conceptFQName, oldName), newName);
  }

  private String getNewFeatureRole_internal(@NotNull String conceptFQName, @NotNull String oldRole, ConceptFeatureKind conceptFeatureKind) {
    Map<Pair<String, String>, String> featuresMap;
    Set<Pair<String, String>> absentFeatureSet;
    switch (conceptFeatureKind) {
      case CHILD: {
        featuresMap = myChildrenRolesMap;
        absentFeatureSet = myAbsentChildrenRoles;
        break;
      }
      case REFERENCE: {
        featuresMap = myReferencesRolesMap;
        absentFeatureSet = myAbsentReferentRoles;
        break;
      }
      case PROPERTY: {
        featuresMap = myPropertiesNamesMap;
        absentFeatureSet = myAbsentPropertyNames;
        break;
      }
      default: {
        return null;
      }
    }

    Pair<String, String> stringPair = new Pair<String, String>(conceptFQName, oldRole);
    if (myAbsentChildrenRoles.contains(stringPair)) {
      return null;
    }
    String role = featuresMap.get(stringPair);
    if (role != null) {
      return role;
    }
    //search
    Language language = MPSModuleRepository.getInstance().getLanguage(NameUtil.namespaceFromConceptFQName(conceptFQName));
    if (language == null) {
      return null;
    }
    Set<String> parentsNames = language.getParentsNames(conceptFQName);
    for (String parentFQName : parentsNames) {
      String newChildRole = getNewFeatureRole_internal(parentFQName, oldRole, conceptFeatureKind);
      if (newChildRole != null) {
        featuresMap.put(stringPair, newChildRole);
        return newChildRole;
      }
    }
    absentFeatureSet.add(stringPair);
    return null;
  }

  private boolean isModificationMode(SModel model) {
    return myModifiableModels.contains(model);
  }

  public String getNewChildRole(SModel model, String conceptFQName, String role) {
    if (isModificationMode(model)) {
      String newRole = getNewFeatureRole_internal(conceptFQName, role, ConceptFeatureKind.CHILD);
      if (newRole == null) {
        return role;
      } else {
        return newRole;
      }
    } else {
      return role;
    }
  }

  public String getNewReferentRole(SModel model, String conceptFQName, String role) {
    if (isModificationMode(model)) {
      String newRole = getNewFeatureRole_internal(conceptFQName, role, ConceptFeatureKind.REFERENCE);
      if (newRole == null) {
        return role;
      } else {
        return newRole;
      }
    } else {
      return role;
    }
  }

  public String getNewPropertyName(SModel model, String conceptFQName, String propertyName) {
    if (isModificationMode(model)) {
      String newRole = getNewFeatureRole_internal(conceptFQName, propertyName, ConceptFeatureKind.PROPERTY);
      if (newRole == null) {
        return propertyName;
      } else {
        return newRole;
      }
    } else {
      return propertyName;
    }
  }
}

package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.MessageStatus;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.lang.structure.structure.LinkDeclaration;
import jetbrains.mps.smodel.search.SModelSearchUtil;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.structure.structure.LinkMetaclass;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.structure.structure.PropertyDeclaration;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.SearchScopeStatus;
import jetbrains.mps.smodel.constraints.ModelConstraintsUtil;
import java.util.List;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.lang.structure.structure.Cardinality;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.smodel.search.ConceptAndSuperConceptsScope;
import jetbrains.mps.smodel.PropertySupport;
import jetbrains.mps.ide.ui.smodel.SModelTreeNode;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.typesystem.inference.NodeTypesComponentsRepository;
import jetbrains.mps.typesystem.inference.NodeTypesComponent;
import jetbrains.mps.util.Pair;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.project.MPSProject;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.util.TimePresentationUtil;
import jetbrains.mps.ide.progress.TaskProgressSettings;
import jetbrains.mps.internal.collections.runtime.Sequence;

public class ModelCheckerUtils {
  private static void addIssue(SearchResults<ModelCheckerIssue> results, SNode node, String message, MessageStatus status) {
    ModelCheckerIssue issue = new ModelCheckerIssue(node, message);
    results.getSearchResults().add(new SearchResult(issue, node, status.toString()));
  }

  private static void addIssue(SearchResults<ModelCheckerIssue> results, SNode node, String message) {
    addIssue(results, node, message, MessageStatus.ERROR);
  }

  private static boolean isDeclaredLink(SNode concept, String role, boolean child) {
    LinkDeclaration link = SModelSearchUtil.findLinkDeclaration(((AbstractConceptDeclaration)SNodeOperations.getAdapter(concept)), role);
    if (link == null) {
      return false;
    }
    return link.getMetaClass() == LinkMetaclass.aggregation || !(child);
  }

  private static String getMostSpecializedLinkRoleInt(SNode conceptDeclaration, String role) {
    for (SNode linkDeclaration : ListSequence.fromList(SLinkOperations.getTargets(conceptDeclaration, "linkDeclaration", true))) {
      if (SPropertyOperations.getString(linkDeclaration, "role").equals(role)) {
        return role;
      }
      if (SLinkOperations.getTarget(linkDeclaration, "specializedLink", false) != null) {
        SNode superConcept = SNodeOperations.getAncestor(SLinkOperations.getTarget(linkDeclaration, "specializedLink", false), "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration", true, false);
        if (getMostSpecializedLinkRoleInt(superConcept, role) != null) {
          return SPropertyOperations.getString(linkDeclaration, "role");
        }
      }
    }
    return null;
  }

  private static String getMostSpecializedLinkRole(SNode concept, String role) {
    String result = getMostSpecializedLinkRoleInt(concept, role);
    return ((result == null) ?
      role :
      result
    );
  }

  private static boolean isDeclaredProperty(SNode concept, String name) {
    PropertyDeclaration propertyDeclaration = SModelSearchUtil.findPropertyDeclaration(((AbstractConceptDeclaration)SNodeOperations.getAdapter(concept)), name);
    return propertyDeclaration != null;
  }

  private static boolean checkScope(SNode concept, SNode node, SNode targetNode, String refRole, IOperationContext operationContext) {
    SearchScopeStatus status = ModelConstraintsUtil.getSearchScope(null, node, ((AbstractConceptDeclaration)SNodeOperations.getAdapter(concept)), refRole, operationContext);
    if (status.isOk() && !(status.isDefault())) {
      List<SNode> nodes = status.getSearchScope().getNodes();
      if (!(ListSequence.fromList(nodes).contains(targetNode))) {
        return false;
      }
    }
    return true;
  }

  public static boolean checkModel(final SearchResults<ModelCheckerIssue> results, final SModelDescriptor modelDescriptor, final IOperationContext operationContext, final ProgressContext progressContext) {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        ModelCheckerSettings settings = ModelCheckerSettings.getInstance();
        SModel model = modelDescriptor.getSModel();

        // Check for unavailable concepts 
        for (SNode node : ListSequence.fromList(SModelOperations.getNodes(model, null))) {
          if (!(checkAndUpdateIndicator(progressContext, "Checking " + SModelOperations.getModelName(model) + " for instances of unavailable concepts..."))) {
            return;
          }
          SNode concept = SNodeOperations.getConceptDeclaration(node);
          if (concept == null) {
            addIssue(results, node, "Cannot find concept \"" + INamedConcept_Behavior.call_getFqName_1213877404258(concept) + "\"");
          }
        }

        // Check for unresolved references 
        if (settings.isCheckUnresolvedReferences()) {
          for (SNode node : ListSequence.fromList(SModelOperations.getNodes(model, null))) {
            if (!(checkAndUpdateIndicator(progressContext, "Checking " + SModelOperations.getModelName(model) + " for unresolved references..."))) {
              return;
            }
            // Check for unresolved references 
            for (SReference ref : ListSequence.fromList(node.getReferences())) {
              if (ref.getTargetNode() == null) {
                addIssue(results, node, "Unresolved reference: " + ref.getResolveInfo());
              }
            }
          }
        }

        // Check for constraints 
        if (settings.isCheckConstraints()) {
          for (SNode node : ListSequence.fromList(SModelOperations.getNodes(model, null))) {
            if (!(checkAndUpdateIndicator(progressContext, "Checking " + SModelOperations.getModelName(model) + " for cardinalities and properties constraints..."))) {
              return;
            }
            SNode concept = SNodeOperations.getConceptDeclaration(node);

            // Check links 
            for (LinkDeclaration linkDeclaration : ListSequence.fromList(SModelSearchUtil.getLinkDeclarations(((AbstractConceptDeclaration)SNodeOperations.getAdapter(concept))))) {
              LinkDeclaration link = SModelUtil_new.getGenuineLinkDeclaration(linkDeclaration);
              if (link.getSourceCardinality() == Cardinality._1 || link.getSourceCardinality() == Cardinality._1__n) {
                if (link.getMetaClass() == LinkMetaclass.aggregation) {
                  if (node.getChildren(link.getRole()).isEmpty()) {
                    addIssue(results, node, "Cardinality constraint violation in role \"" + link.getRole() + "\"");
                  }
                } else {
                  if (node.getReference(link.getRole()) == null) {
                    addIssue(results, node, "Cardinality constraint violation in role \"" + link.getRole() + "\"");
                  }
                }
              }
            }

            for (String role : SetSequence.fromSet(node.getChildRoles())) {
              if (!(isDeclaredLink(concept, role, true))) {
                addIssue(results, node, "Usage of undeclared child role \"" + role + "\"", MessageStatus.WARNING);
              }
            }

            for (String role : SetSequence.fromSet(node.getReferenceRoles())) {
              if (!(isDeclaredLink(concept, role, false))) {
                addIssue(results, node, "Usage of undeclared reference role \"" + role + "\"", MessageStatus.WARNING);
              }
            }

            // Check properties 
            ConceptAndSuperConceptsScope chs = new ConceptAndSuperConceptsScope(((AbstractConceptDeclaration)SNodeOperations.getAdapter(concept)));
            List<PropertyDeclaration> props = chs.getAdapters(PropertyDeclaration.class);
            for (PropertyDeclaration p : ListSequence.fromList(props)) {
              PropertySupport ps = PropertySupport.getPropertySupport(p);
              String value = ps.fromInternalValue(node.getProperty(p.getName()));
              if (!(ps.canSetValue(node, p.getName(), value, operationContext.getScope()))) {
                addIssue(results, node, "Property constraint violation for property \"" + p.getName() + "\"", MessageStatus.WARNING);
              }
            }

            for (String name : SetSequence.fromSet(node.getPropertyNames())) {
              if (node.isRoot() && SModelTreeNode.PACK.equals(name)) {
                continue;
              }
              if (!(isDeclaredProperty(concept, name))) {
                addIssue(results, node, "Usage of undeclared property \"" + name + "\"", MessageStatus.WARNING);
              }
            }
          }
        }

        // Check for scopes 
        if (settings.isCheckScopes()) {
          for (SNode node : ListSequence.fromList(SModelOperations.getNodes(model, null))) {
            if (!(checkAndUpdateIndicator(progressContext, "Checking " + SModelOperations.getModelName(model) + " for valid scopes in references..."))) {
              return;
            }
            SNode concept = SNodeOperations.getConceptDeclaration(node);

            for (SReference ref : ListSequence.fromList(node.getReferences())) {
              if (!(isDeclaredLink(concept, ref.getRole(), false))) {
                continue;
              }
              SNode targetNode = ref.getTargetNode();
              if (targetNode == null) {
                continue;
              }
              try {
                String specializedLinkRole = getMostSpecializedLinkRole(SNodeOperations.getConceptDeclaration(node), ref.getRole());

                IModule thisModelModule = model.getModelDescriptor().getModule();
                if (checkScope(concept, node, targetNode, specializedLinkRole, operationContext)) {
                } else if (checkScope(concept, node, targetNode, specializedLinkRole, new ModuleContext(thisModelModule, operationContext.getMPSProject()))) {
                } else {
                  addIssue(results, node, "Reference in role \"" + specializedLinkRole + "\" is out of scope", MessageStatus.WARNING);
                }
              } catch (Exception e) {
                e.printStackTrace();
                addIssue(results, node, "Exception \"" + e.getMessage() + "\" during scope checking");
              }
            }
          }
        }

        // Check for typesystem rules 
        if (settings.isCheckTypesystem()) {
          TypeChecker tc = TypeChecker.getInstance();
          for (SNode rootNode : ListSequence.fromList(SModelOperations.getRoots(model, null))) {
            if (!(checkAndUpdateIndicator(progressContext, "Checking " + SModelOperations.getModelName(model) + " for typesystem rules..."))) {
              return;
            }
            tc.checkRoot(rootNode);
            TypeCheckingContext typeCheckingContext = NodeTypesComponentsRepository.getInstance().getTypeCheckingContext(rootNode);
            NodeTypesComponent nodeTypesComponent = typeCheckingContext.getBaseNodeTypesComponent();
            for (Pair<SNode, List<IErrorReporter>> nodeErrorReporters : SetSequence.fromSet(nodeTypesComponent.getNodesWithErrors())) {
              SNode node = nodeErrorReporters.o1;
              for (IErrorReporter errorReporter : ListSequence.fromList(nodeErrorReporters.o2)) {
                addIssue(results, node, errorReporter.reportError(), errorReporter.getMessageStatus());
              }
            }
          }
        }
      }
    });
    return !(progressContext.getProgressIndicator().isCanceled());
  }

  public static boolean checkModule(SearchResults<ModelCheckerIssue> results, IModule module, IOperationContext operationContext, ProgressContext progressContext) {
    for (SModelDescriptor modelDescriptor : ListSequence.fromList(module.getOwnModelDescriptors())) {
      if (!(SModelStereotype.isUserModel(modelDescriptor))) {
        continue;
      }
      if (!(checkModel(results, modelDescriptor, operationContext, progressContext))) {
        return false;
      }
    }
    if (module instanceof Language) {
      Language language = (Language)module;
      for (Generator generator : ListSequence.fromList(language.getGenerators())) {
        if (!(checkModule(results, generator, operationContext, progressContext))) {
          return false;
        }
      }
    }
    return true;
  }

  public static boolean checkProject(SearchResults<ModelCheckerIssue> results, MPSProject mpsProject, IOperationContext operationContext, ProgressContext progressContext) {
    for (IModule module : ListSequence.fromList(mpsProject.getModules())) {
      if (!(checkModule(results, module, operationContext, progressContext))) {
        return false;
      }
    }
    return true;
  }

  public static boolean checkAndUpdateIndicator(ProgressContext progressContext, String text) {
    ProgressIndicator indicator = progressContext.getProgressIndicator();
    long estimatedTime = progressContext.getEstimatedTime();
    // Return false if operation was cancelled 
    if (indicator.isCanceled()) {
      return false;
    }

    long elapsedTime = System.currentTimeMillis() - progressContext.getStartTime();
    String estimatedTimeString = TimePresentationUtil.timeIntervalStringPresentation(estimatedTime);
    String elapsedTimeString = TimePresentationUtil.timeIntervalStringPresentation(elapsedTime);
    indicator.setText(text);
    indicator.setText2("Estimated time: " + estimatedTimeString + ", elapsed time: " + elapsedTimeString);
    if (elapsedTime < estimatedTime) {
      indicator.setIndeterminate(false);
      indicator.setFraction(elapsedTime * 1.0 / estimatedTime);
    } else {
      indicator.setIndeterminate(true);
    }
    return true;
  }

  public static String getTaskName(MPSProject mpsProject) {
    return mpsProject.getProjectDescriptor().getName() + "_projectcheck";
  }

  public static String getTaskName(IModule module) {
    return module.getModuleFqName() + "_modulecheck";
  }

  public static String getTaskName(SModelDescriptor modelDescriptor) {
    return modelDescriptor.getName() + "_modelcheck";
  }

  public static void addEstimatedTimeMillis(String taskName, long startTime) {
    TaskProgressSettings.getInstance().addEstimatedTimeMillis(taskName, System.currentTimeMillis() - startTime);
  }

  public static long getEstimatedTimeMillis(String taskName) {
    return TaskProgressSettings.getInstance().getEstimatedTimeMillis(taskName);
  }

  public static long getEstimatedTimeMillis(Iterable<String> taskNames) {
    long result = 0;
    for (String taskName : Sequence.fromIterable(taskNames)) {
      result += getEstimatedTimeMillis(taskName);
    }
    return result;
  }
}

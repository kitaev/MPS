package jetbrains.mps.lang.core.scripts;

/*Generated by MPS */

import jetbrains.mps.refactoring.framework.AbstractLoggableRefactoring;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.search.ConceptAndSuperConceptsScope;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import java.util.List;
import jetbrains.mps.lang.structure.structure.LinkDeclaration;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.refactoring.framework.RefactoringTarget;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.workbench.action.ActionEventData;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.project.ModuleContext;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.refactoring.framework.IChooseComponent;
import jetbrains.mps.refactoring.framework.ChooseNodeOrModelComponent;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.refactoring.framework.ChooseRefactoringInputDataDialog;

public class MoveNodes extends AbstractLoggableRefactoring {
  public static final String target = "target";
  public static final String role = "role";
  public static final String nodeToOpen = "nodeToOpen";

  private Set<String> myTransientParameters = SetSequence.<String>fromArray();

  public MoveNodes() {
    SetSequence.fromSet(this.myTransientParameters).addElement("target");
    SetSequence.fromSet(this.myTransientParameters).addElement("role");
    SetSequence.fromSet(this.myTransientParameters).addElement("nodeToOpen");
  }

  public String getUserFriendlyName() {
    return "Move Nodes";
  }

  public Set<String> getTransientParameters() {
    return SetSequence.fromSet(SetSequence.<String>fromArray()).addSequence(SetSequence.fromSet(this.myTransientParameters));
  }

  public String getKeyStroke() {
    return getKeyStroke_static();
  }

  public boolean isApplicableWRTConcept(SNode node) {
    return isApplicableWRTConcept_static(node);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.core.structure.BaseConcept";
  }

  public Class getOverridenRefactoringClass() {
    return null;
  }

  public boolean isApplicable(RefactoringContext refactoringContext) {
    if (ListSequence.fromList(refactoringContext.getSelectedNodes()).isEmpty()) {
      return false;
    }
    if (((Object)refactoringContext.getParameter("target")) instanceof SNode) {
      SNode targetNode = ((SNode)((Object)refactoringContext.getParameter("target")));
      SNode concept = SNodeOperations.getConceptDeclaration(targetNode);
      ConceptAndSuperConceptsScope superConceptsScope = new ConceptAndSuperConceptsScope(((AbstractConceptDeclaration)SNodeOperations.getAdapter(concept)));
      List<LinkDeclaration> linkDeclarations = superConceptsScope.getLinkDeclarationsExcludingOverridden();
      Iterable<SNode> childLinkDeclarations = ListSequence.fromList(linkDeclarations).where(new IWhereFilter <LinkDeclaration>() {

        public boolean accept(LinkDeclaration it) {
          return SPropertyOperations.hasValue(((SNode)it.getNode()), "metaClass", "aggregation", "reference");
        }
      }).select(new ISelector <LinkDeclaration, SNode>() {

        public SNode select(LinkDeclaration it) {
          return (SNode)it.getNode();
        }
      });
      Iterable<String> childLinksRoles = Sequence.fromIterable(childLinkDeclarations).select(new ISelector <SNode, String>() {

        public String select(SNode it) {
          return SModelUtil.getGenuineLinkRole(it);
        }
      });
      for(SNode node : refactoringContext.getSelectedNodes()) {
        String childRole = node.getRole_();
        if (!(Sequence.fromIterable(childLinksRoles).contains(childRole))) {
          return false;
        }
        for(SNode linkDeclaration : childLinkDeclarations) {
          if (SPropertyOperations.getString(linkDeclaration, "role").equals(childRole)) {
            if (!(SConceptOperations.isSuperConceptOf(SLinkOperations.getTarget(linkDeclaration, "target", false), NameUtil.nodeFQName(SNodeOperations.getConceptDeclaration(node))))) {
              return false;
            }
          }
        }
      }
      return true;
    }
    if (((Object)refactoringContext.getParameter("target")) instanceof SModelDescriptor) {
      for(SNode node : refactoringContext.getSelectedNodes()) {
        if (!(SPropertyOperations.getBoolean(SNodeOperations.getConceptDeclaration(node), "rootable"))) {
          return false;
        }
      }                         
      return true;
    }
    return false;
  }

  public boolean isApplicableToModel(SModelDescriptor modelDescriptor) {
    return true;
  }

  public boolean refactorImmediatelyIfNoUsages() {
    return false;
  }

  public RefactoringTarget getRefactoringTarget() {
    return RefactoringTarget.NODE;
  }

  public boolean showsAffectedNodes() {
    return true;
  }

  public SearchResults getAffectedNodes(final RefactoringContext refactoringContext) {
    return FindUtils.getSearchResults(ActionEventData.createProgressIndicator(), refactoringContext.getSelectedNode(), GlobalScope.getInstance(), "jetbrains.mps.lang.structure.findUsages.NodeAndDescendantsUsages_Finder");
  }

  public void doRefactor(final RefactoringContext refactoringContext) {
    {
      List<SNode> nodes = refactoringContext.getSelectedNodes();
      SModel targetModel = null;
      List<SNode> movedNodes = null;
      if (((Object)refactoringContext.getParameter("target")) instanceof SModelDescriptor) {
        targetModel = ((SModelDescriptor)((Object)refactoringContext.getParameter("target"))).getSModel();
        movedNodes = refactoringContext.moveNodesToModel(nodes, targetModel);
      }
      if (((Object)refactoringContext.getParameter("target")) instanceof SNode) {
        SNode targetNode = (SNode)((Object)refactoringContext.getParameter("target"));
        movedNodes = refactoringContext.moveNodesToNode(nodes, ListSequence.fromList(nodes).getElement(0).getRole_(), targetNode);
        targetModel = targetNode.getModel();
      }
      if (targetModel != null) {
        IModule module = targetModel.getModelDescriptor().getModule();
        MPSProject project = refactoringContext.getSelectedMPSProject();
        if (project != null) {
          final IOperationContext operationContext = new ModuleContext(module, project);
          if (operationContext != null) {
            refactoringContext.setParameter("nodeToOpen", ListSequence.fromList(movedNodes).first());
          }
        }
      }
    }
  }

  public Map<IModule, List<SModel>> getModelsToGenerate(final RefactoringContext refactoringContext) {
    return MapSequence.fromMap(new HashMap<IModule, List<SModel>>());
  }

  public List<SModel> getModelsToUpdate(final RefactoringContext refactoringContext) {
    return ListSequence.<SModel>fromArray();
  }

  public void updateModel(SModel model, final RefactoringContext refactoringContext) {
    refactoringContext.updateModelWithMaps(model);
  }

  public List<SNode> getNodesToOpen(final RefactoringContext refactoringContext) {
    {
      List<SNode> result = ListSequence.<SNode>fromArray();
      ListSequence.fromList(result).addElement(((SNode)refactoringContext.getParameter("nodeToOpen")));
      return result;
    }
  }

  public boolean doesUpdateModel() {
    return true;
  }

  public IChooseComponent<Object> target_componentCreator(final RefactoringContext refactoringContext) {
    return new ChooseNodeOrModelComponent(refactoringContext.getCurrentOperationContext(), null, true, true);
  }

  public boolean askForInfo(final RefactoringContext refactoringContext) {
    {
      boolean result = false;
      final List<IChooseComponent> components = ListSequence.<IChooseComponent>fromArray();
      ModelAccess.instance().runReadAction(new Runnable() {

        public void run() {
          {
            IChooseComponent<Object> chooseComponent;
            chooseComponent = MoveNodes.this.target_componentCreator(refactoringContext);
            chooseComponent.setPropertyName("target");
            chooseComponent.setCaption("choose target");
            chooseComponent.initComponent();
            ListSequence.fromList(components).addElement(chooseComponent);
          }
        }
      });
      ChooseRefactoringInputDataDialog dialog = new ChooseRefactoringInputDataDialog(this, refactoringContext, components);
      dialog.showDialog();
      result = dialog.getResult();
      return result;
    }
  }


  public static String getKeyStroke_static() {
    return " F6";
  }

  public static Class getClass_static() {
    return MoveNodes.class;
  }

  public static boolean isApplicableWRTConcept_static(SNode node) {
    if (SModelUtil.isAssignableConcept(SNodeOperations.getConceptDeclaration(node), SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.BaseConcept"))) {
      return true;
    } else
    {
      return false;
    }
  }

}

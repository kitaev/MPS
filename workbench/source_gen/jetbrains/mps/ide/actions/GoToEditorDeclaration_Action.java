package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.plugins.MacrosUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.kernel.model.SModelUtil;
import javax.swing.JOptionPane;
import java.awt.Frame;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.lang.structure.structure.ConceptDeclaration;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.workbench.actions.nodes.GoToEditorDeclarationHelper;
import jetbrains.mps.smodel.IScope;
import javax.swing.SwingUtilities;
import jetbrains.mps.project.ModuleContext;
import com.intellij.openapi.project.Project;
import jetbrains.mps.ide.IEditor;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.workbench.editors.MPSEditorOpener;
import jetbrains.mps.ide.projectPane.ProjectPane;

public class GoToEditorDeclaration_Action extends GeneratedAction {
  private static final Icon ICON = IconManager.loadIcon(MacrosUtil.expandPath("${solution_descriptor}/icons/editor.png", "jetbrains.mps.ide"), true);
  protected static Log log = LogFactory.getLog(GoToEditorDeclaration_Action.class);

  public GoToEditorDeclaration_Action() {
    super("Go to Editor Declaration", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getConceptDeclaration(((SNode) MapSequence.fromMap(_params).get("node"))), "jetbrains.mps.lang.structure.structure.ConceptDeclaration");
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "GoToEditorDeclaration", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    {
      SNode node = event.getData(MPSDataKeys.NODE);
      if (node != null) {
      }
      MapSequence.fromMap(_params).put("node", node);
    }
    if (MapSequence.fromMap(_params).get("node") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("ideaProject", event.getData(MPSDataKeys.PROJECT));
    if (MapSequence.fromMap(_params).get("ideaProject") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("project", event.getData(MPSDataKeys.PROJECT));
    if (MapSequence.fromMap(_params).get("project") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("frame", event.getData(MPSDataKeys.FRAME));
    if (MapSequence.fromMap(_params).get("frame") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("editor", event.getData(MPSDataKeys.MPS_EDITOR));
    if (MapSequence.fromMap(_params).get("editor") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("context", event.getData(MPSDataKeys.OPERATION_CONTEXT));
    if (MapSequence.fromMap(_params).get("context") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("scope", event.getData(MPSDataKeys.SCOPE));
    if (MapSequence.fromMap(_params).get("scope") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("module", event.getData(MPSDataKeys.MODULE));
    if (MapSequence.fromMap(_params).get("module") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      final Wrappers._T<Language> l = new Wrappers._T<Language>();
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          l.value = SModelUtil.getDeclaringLanguage(SNodeOperations.getConceptDeclaration(((SNode) MapSequence.fromMap(_params).get("node"))));
        }
      });
      if (l.value == null) {
        JOptionPane.showMessageDialog(((Frame) MapSequence.fromMap(_params).get("frame")), "Couldn't find declaring language for concept " + INamedConcept_Behavior.call_getFqName_1213877404258(SNodeOperations.getConceptDeclaration(((SNode) MapSequence.fromMap(_params).get("node")))), "Error", JOptionPane.ERROR_MESSAGE);
        return;
      }
      final Wrappers._T<ConceptDeclaration> conceptDeclaration = new Wrappers._T<ConceptDeclaration>();
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          conceptDeclaration.value = ((ConceptDeclaration) BaseAdapter.fromNode(((SNode) MapSequence.fromMap(_params).get("node")).getConceptDeclarationNode()));
        }
      });
      SModelDescriptor editorModel = GoToEditorDeclarationHelper.getOrCreateEditorAspect(l.value, conceptDeclaration.value, ((IScope) MapSequence.fromMap(_params).get("scope")));
      if (editorModel == null) {
        return;
      }
      final SNode editorNode = GoToEditorDeclarationHelper.getOrCreateEditorForConcept(editorModel, conceptDeclaration.value, ((SNode) MapSequence.fromMap(_params).get("node")), ((IScope) MapSequence.fromMap(_params).get("scope")));
      if (editorNode == null) {
        return;
      }
      SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          GoToEditorDeclaration_Action.this.navigateToEditorDeclaration(editorNode, new ModuleContext(l.value, ((Project) MapSequence.fromMap(_params).get("project"))), ((IEditor) MapSequence.fromMap(_params).get("editor")), _params);
        }
      });
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "GoToEditorDeclaration", t);
      }
    }
  }

  /*package*/ void navigateToEditorDeclaration(SNode editorNode, IOperationContext oContext, IEditor editor, final Map<String, Object> _params) {
    oContext.getComponent(MPSEditorOpener.class).editNode(editorNode, oContext);
    ProjectPane.getInstance(((Project) MapSequence.fromMap(_params).get("ideaProject"))).selectNode(editorNode, false);
  }
}

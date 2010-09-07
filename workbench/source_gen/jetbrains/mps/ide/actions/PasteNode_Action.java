package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.plugins.MacrosUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.project.Project;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.datatransfer.PasteNodeData;
import jetbrains.mps.datatransfer.CopyPasteUtil;
import java.util.List;
import java.util.Set;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.nodeEditor.datatransfer.NodePaster;
import jetbrains.mps.datatransfer.PasteEnv;
import jetbrains.mps.resolve.Resolver;
import jetbrains.mps.workbench.editors.MPSEditorOpener;
import javax.swing.SwingUtilities;
import jetbrains.mps.ide.projectPane.ProjectPane;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;

public class PasteNode_Action extends GeneratedAction {
  private static final Icon ICON = IconManager.loadIcon(MacrosUtil.expandPath("${solution_descriptor}/icons/menu-paste.png", "jetbrains.mps.ide"), true);
  protected static Log log = LogFactory.getLog(PasteNode_Action.class);

  private Project project;
  private String pack;
  private IOperationContext context;
  private SModelDescriptor contextModel;
  private SNode node;

  public PasteNode_Action() {
    super("Paste", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull
  public String getKeyStroke() {
    return "ctrl V";
  }

  public boolean isApplicable(AnActionEvent event) {
    return PasteNode_Action.this.contextModel instanceof EditableSModelDescriptor && PasteNode_Action.this.getPasteData() != null;
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "PasteNode", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.PROJECT);
    if (this.project == null) {
      return false;
    }
    this.pack = event.getData(MPSDataKeys.VIRTUAL_PACKAGE);
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.contextModel = event.getData(MPSDataKeys.CONTEXT_MODEL);
    if (this.contextModel == null) {
      return false;
    }
    this.node = event.getData(MPSDataKeys.NODE);
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.project = null;
    this.pack = null;
    this.context = null;
    this.contextModel = null;
    this.node = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      PasteNodeData pasteNodeData = PasteNode_Action.this.getPasteData();
      boolean successfull = CopyPasteUtil.addImportsWithDialog(pasteNodeData.getSourceModule(), PasteNode_Action.this.contextModel.getSModel(), pasteNodeData.getNecessaryLanguages(), pasteNodeData.getNecessaryModels(), PasteNode_Action.this.context);
      if (!(successfull)) {
        return;
      }
      final List<SNode> pasteNodes = pasteNodeData.getNodes();
      final Set<SReference> refsToResolve = pasteNodeData.getRequireResolveReferences();
      if (pasteNodes == null || pasteNodes.size() == 0) {
        return;
      }
      ModelAccess.instance().runWriteActionInCommand(new Runnable() {
        public void run() {
          if (PasteNode_Action.this.node == null) {
            NodePaster paster = new NodePaster(pasteNodes);
            if (!(paster.canPasteAsRoots())) {
              return;
            }
            paster.pasteAsRoots(PasteNode_Action.this.contextModel.getSModel(), PasteNode_Action.this.pack);
          } else {
            NodePaster paster = new NodePaster(pasteNodes);
            if (!(paster.canPaste(PasteNode_Action.this.node, PasteEnv.PROJECT_TREE))) {
              return;
            }
            paster.paste(PasteNode_Action.this.node, PasteEnv.PROJECT_TREE);
          }
          Resolver.resolveReferences(refsToResolve, PasteNode_Action.this.context);
          // make sure editor will be open 
          SNode root = pasteNodes.get(0).getContainingRoot();
          assert root != null;
          PasteNode_Action.this.context.getComponent(MPSEditorOpener.class).editNode(root, PasteNode_Action.this.context);
          SwingUtilities.invokeLater(new Runnable() {
            public void run() {
              ProjectPane.getInstance(PasteNode_Action.this.project).selectNode(pasteNodes.get(0));
            }
          });
        }
      });
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "PasteNode", t);
      }
    }
  }

  private PasteNodeData getPasteData() {
    final Wrappers._T<PasteNodeData> result = new Wrappers._T<PasteNodeData>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        result.value = CopyPasteUtil.getPasteNodeDataFromClipboard(PasteNode_Action.this.contextModel.getSModel());
      }
    });
    return result.value;
  }
}

package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.tool.GeneratedTabbedTool;
import jetbrains.mps.project.MPSProject;
import com.intellij.openapi.project.Project;
import jetbrains.mps.ide.findusages.INavigateableTool;
import com.intellij.openapi.wm.ToolWindow;
import jetbrains.mps.ide.findusages.INavigator;
import javax.swing.JComponent;
import com.intellij.openapi.vcs.checkin.CheckinHandlerFactory;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.plugins.MacrosUtil;
import com.intellij.openapi.wm.ToolWindowAnchor;
import jetbrains.mps.MPSProjectHolder;
import com.intellij.openapi.vcs.ProjectLevelVcsManager;
import jetbrains.mps.ide.findusages.UsagesViewTracker;
import java.util.List;
import jetbrains.mps.smodel.SModelDescriptor;
import javax.swing.Icon;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.ide.projectPane.Icons;
import jetbrains.mps.project.IModule;
import com.intellij.openapi.application.ApplicationManager;
import jetbrains.mps.generator.GenerationSettings;
import jetbrains.mps.ide.findusages.model.SearchResults;
import com.intellij.openapi.ui.DialogWrapper;
import javax.swing.SwingUtilities;
import org.jetbrains.annotations.Nullable;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JLabel;
import javax.swing.Action;
import com.intellij.openapi.vcs.checkin.CheckinHandler;
import com.intellij.openapi.ui.Messages;
import jetbrains.mps.lang.plugin.structure.IComponentDisposer;

public class ModelCheckerTool_Tool extends GeneratedTabbedTool {
  private MPSProject myMPSProject;
  private Project myProject;
  private INavigateableTool myNavigateableTool = new INavigateableTool() {
    public int getPriority() {
      return 3;
    }

    public ToolWindow getToolWindow() {
      ModelCheckerTool_Tool.this.register();
      return ModelCheckerTool_Tool.this.getToolWindow();
    }

    public INavigator getCurrentNavigateableView() {
      JComponent component = ModelCheckerTool_Tool.this.getSelectedTab();
      assert component instanceof ModelCheckerViewer;
      return (ModelCheckerViewer)component;
    }
  };
  private CheckinHandlerFactory myCheckinHandlerFactory = new ModelCheckerCheckinHandler.MyHandlerFactory();

  public ModelCheckerTool_Tool(Project project) {
    super(project, "Model Checker", -1, IconManager.loadIcon(MacrosUtil.expandPath("${solution_descriptor}/icons/modelChecker.png", "jetbrains.mps.ide"), true), ToolWindowAnchor.BOTTOM, true);
  }

  public void init(Project project) {
    super.init(project);
    ModelCheckerTool_Tool.this.myMPSProject = project.getComponent(MPSProjectHolder.class).getMPSProject();
    ModelCheckerTool_Tool.this.myProject = project;
  }

  public void dispose() {
    super.dispose();
  }

  protected void doRegister() {
    ProjectLevelVcsManager.getInstance(ModelCheckerTool_Tool.this.myProject).registerCheckinHandlerFactory(ModelCheckerTool_Tool.this.myCheckinHandlerFactory);
    UsagesViewTracker.register(ModelCheckerTool_Tool.this.myNavigateableTool);
  }

  protected void doUnregister() {
    ProjectLevelVcsManager.getInstance(ModelCheckerTool_Tool.this.myProject).unregisterCheckinHandlerFactory(ModelCheckerTool_Tool.this.myCheckinHandlerFactory);
    UsagesViewTracker.unregister(ModelCheckerTool_Tool.this.myNavigateableTool);
  }

  private ModelCheckerViewer checkSomething(final List<SModelDescriptor> modelDescriptors, final String taskTargetTitle, final Icon taskIcon, IOperationContext operationContext, boolean showTab) {
    ModelCheckerViewer newViewer = ModelCheckerTool_Tool.this.createViewer(operationContext);
    newViewer.checkModelsCore(modelDescriptors, taskTargetTitle, taskIcon);
    if (showTab) {
      ModelCheckerTool_Tool.this.showTabWithResults(newViewer);
    }
    return newViewer;
  }

  public ModelCheckerViewer checkModel(SModelDescriptor modelDescriptor, IOperationContext operationContext, boolean showTab) {
    return ModelCheckerTool_Tool.this.checkSomething(ModelCheckerUtils.getModelDescriptors(modelDescriptor), modelDescriptor.getName(), IconManager.getIconFor(modelDescriptor), operationContext, showTab);
  }

  public ModelCheckerViewer checkModels(List<SModelDescriptor> modelDescriptors, IOperationContext operationContext, boolean showTab) {
    return ModelCheckerTool_Tool.this.checkSomething(modelDescriptors, NameUtil.formatNumericalString(ListSequence.fromList(modelDescriptors).count(), "model"), Icons.MODEL_ICON, operationContext, showTab);
  }

  public ModelCheckerViewer checkModule(IModule module, IOperationContext operationContext, boolean showTab) {
    return ModelCheckerTool_Tool.this.checkSomething(ModelCheckerUtils.getModelDescriptors(module), module.getModuleFqName(), IconManager.getIconFor(module), operationContext, showTab);
  }

  public ModelCheckerViewer checkModules(List<IModule> modules, IOperationContext operationContext, boolean showTab) {
    return ModelCheckerTool_Tool.this.checkSomething(ModelCheckerUtils.getModelDescriptors(modules), NameUtil.formatNumericalString(ListSequence.fromList(modules).count(), "module"), Icons.MODULE_GROUP_CLOSED, operationContext, showTab);
  }

  public ModelCheckerViewer checkProject(MPSProject mpsProject, IOperationContext operationContext, boolean showTab) {
    return ModelCheckerTool_Tool.this.checkSomething(ModelCheckerUtils.getModelDescriptors(mpsProject), mpsProject.getProjectDescriptor().getName(), Icons.PROJECT_ICON, operationContext, showTab);
  }

  public boolean checkModelsBeforeGenerationIfNeeded(IOperationContext operationContext, List<SModelDescriptor> modelDescriptors, Runnable regenerationRunnable) {
    boolean checkModels = ApplicationManager.getApplication().getComponent(GenerationSettings.class).isCheckModelsBeforeGeneration();
    if (!(checkModels)) {
      return true;
    }

    ModelCheckerViewer viewer = ModelCheckerTool_Tool.this.checkModels(modelDescriptors, operationContext, false);
    SearchResults<ModelCheckerIssue> issues = viewer.getSearchResults();

    int warnings = ModelCheckerUtils.getIssueCountForCategory(issues, ModelCheckerUtils.CATEGORY_WARNING);
    int errors = ModelCheckerUtils.getIssueCountForCategory(issues, ModelCheckerUtils.CATEGORY_ERROR);

    if (errors != 0) {
      final String dialogMessage = "Model checker found " + errors + " errors and " + warnings + " warnings. Review them and don't generate models or ignore them?";

      DialogWrapper dialog = new DialogWrapper(ModelCheckerTool_Tool.this.myProject, true) {
        {
          this.setTitle("Check Before Generation");
          this.setButtonsAlignment(SwingUtilities.CENTER);
          this.init();
        }

        @Nullable
        protected JComponent createCenterPanel() {
          JPanel panel = new JPanel(new BorderLayout());

          JCheckBox checkBox = new JCheckBox("Don't check models before generation");
          checkBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ev) {
              boolean selected = ev.getStateChange() == ItemEvent.SELECTED;
              GenerationSettings.getInstance().setCheckModelsBeforeGeneration(!(selected));
            }
          });

          panel.add(new JLabel(dialogMessage), BorderLayout.CENTER);
          panel.add(checkBox, BorderLayout.SOUTH);
          return panel;
        }

        @Override
        protected Action getCancelAction() {
          Action cancelAction = super.getCancelAction();
          cancelAction.putValue(Action.NAME, "Ignore Errors");
          return cancelAction;
        }

        @Override
        protected Action getOKAction() {
          Action okAction = super.getOKAction();
          okAction.putValue(Action.NAME, "Review Errors");
          return okAction;
        }
      };
      dialog.show();

      if (dialog.isOK()) {
        // review errors and warnings, don't generate 
        ModelCheckerTool_Tool.this.showTabWithResults(viewer);
        viewer.saveGenerationRunnable(regenerationRunnable);
        return false;
      } else {
        // ignore errors and warnings 
        return true;
      }
    }
    return true;
  }

  public CheckinHandler.ReturnResult checkModelsBeforeCommit(IOperationContext operationContext, List<SModelDescriptor> modelDescriptors) {
    ModelCheckerViewer viewer = ModelCheckerTool_Tool.this.checkModels(modelDescriptors, operationContext, false);
    SearchResults<ModelCheckerIssue> issues = viewer.getSearchResults();

    int warnings = ModelCheckerUtils.getIssueCountForCategory(issues, ModelCheckerUtils.CATEGORY_WARNING);
    int errors = ModelCheckerUtils.getIssueCountForCategory(issues, ModelCheckerUtils.CATEGORY_ERROR);

    if (errors != 0) {
      String dialogMessage = "Model checker found " + errors + " errors and " + warnings + " warnings. Would you like to review them?";
      int dialogAnswer = Messages.showDialog(operationContext.getProject(), dialogMessage, "Model Checking", new String[]{"Review","Commit","Cancel"}, 0, null);
      if (dialogAnswer == 0) {
        // review errors and warnings, don't commit 
        ModelCheckerTool_Tool.this.showTabWithResults(viewer);
        return CheckinHandler.ReturnResult.CLOSE_WINDOW;
      } else if (dialogAnswer == 1) {
        // ignore errors and warnings 
        return CheckinHandler.ReturnResult.COMMIT;
      } else if (dialogAnswer == 2 || dialogAnswer == -1) {
        // Cancel 
        return CheckinHandler.ReturnResult.CANCEL;
      }
    }
    return CheckinHandler.ReturnResult.COMMIT;
  }

  private ModelCheckerViewer createViewer(IOperationContext operationContext) {
    return new ModelCheckerViewer(ModelCheckerTool_Tool.this.myMPSProject, operationContext) {
      protected void close() {
        ModelCheckerTool_Tool.this.closeTab(this);
      }
    };
  }

  private void showTabWithResults(ModelCheckerViewer viewer) {
    ModelCheckerTool_Tool.this.addTab(viewer, viewer.getTabTitle(), viewer.getTabIcon(), new IComponentDisposer<ModelCheckerViewer>() {
      public void disposeComponent(ModelCheckerViewer component) {
        component.dispose();
      }
    });
  }
}

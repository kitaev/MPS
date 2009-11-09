package jetbrains.mps.ide.actions;

/*Generated by MPS */

import javax.swing.JPanel;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.ide.findusages.view.UsagesView;
import javax.swing.Icon;
import java.awt.BorderLayout;
import jetbrains.mps.ide.findusages.view.treeholder.treeview.ViewOptions;
import jetbrains.mps.ide.findusages.findalgorithm.finders.IFinder;
import jetbrains.mps.ide.findusages.model.IResultProvider;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.ide.icons.IconManager;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.ide.projectPane.Icons;
import jetbrains.mps.project.IModule;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.view.treeholder.treeview.INodeRepresentator;
import jetbrains.mps.nodeEditor.MessageStatus;
import jetbrains.mps.ide.findusages.view.treeholder.tree.TextOptions;
import org.apache.commons.lang.StringEscapeUtils;
import org.jdom.Element;
import jetbrains.mps.ide.findusages.CantSaveSomethingException;
import jetbrains.mps.ide.findusages.CantLoadSomethingException;

public class ModelCheckerViewer extends JPanel {
  private MPSProject myProject;
  private IOperationContext myOperationContext;
  private UsagesView myUsagesView;
  private ModelCheckerTool_Tool myTool;
  private String myTabTitle;
  private Icon myTabIcon;

  public ModelCheckerViewer(MPSProject mpsProject, IOperationContext operationContext, final ModelCheckerTool_Tool tool) {
    this.myProject = mpsProject;
    this.myOperationContext = operationContext;
    this.myTool = tool;

    this.setLayout(new BorderLayout());
    ViewOptions viewOptions = new ViewOptions(true, false, false, false, false);
    viewOptions.myCategory = true;
    viewOptions.myShowPopupMenu = false;

    final ModelCheckerViewer theViewer = this;
    this.myUsagesView = new UsagesView(mpsProject, viewOptions) {
      public void close() {
        tool.closeTab(theViewer);
        this.dispose();
      }
    };
    this.myUsagesView.setCustomNodeRepresentator(new ModelCheckerViewer.MyNodeRepresentator());
    this.add(this.myUsagesView.getComponent());
  }

  private void checkSomething(final IFinder finder, String taskTitle) {
    IResultProvider resultProvider = FindUtils.makeProvider(finder);
    SearchQuery searchQuery = new SearchQuery(ModelCheckerViewer.this.myProject.getScope());
    ModelCheckerViewer.this.myUsagesView.setRunOptions(resultProvider, searchQuery, new UsagesView.ButtonConfiguration(false, false, true));

    ProgressManager.getInstance().run(new Task.Modal(this.myProject.getComponent(Project.class), taskTitle, true) {
      public void run(@NotNull ProgressIndicator indicator) {
        ModelCheckerViewer.this.myUsagesView.run(indicator);
      }
    });
  }

  private void setTabProperties(String title, Icon icon) {
    this.myTabTitle = title;
    this.myTabIcon = icon;
  }

  public void checkModel(SModelDescriptor modelDescriptor) {
    this.checkSomething(new ModelIssueFinder(this.myOperationContext, modelDescriptor), "Checking " + modelDescriptor.getLongName());
    this.setTabProperties(modelDescriptor.getName(), IconManager.getIconFor(modelDescriptor));
  }

  public void checkModels(List<SModelDescriptor> modelDescriptors) {
    this.checkSomething(new ModelsIssueFinder(this.myOperationContext, modelDescriptors), "Checking " + ListSequence.fromList(modelDescriptors).count() + " models");
    this.setTabProperties(ListSequence.fromList(modelDescriptors).count() + " models", Icons.MODEL_ICON);
  }

  public void checkModule(IModule module) {
    this.checkSomething(new ModuleIssueFinder(this.myOperationContext, module), "Checking " + module.getModuleFqName());
    this.setTabProperties(module.getModuleFqName(), IconManager.getIconFor(module));
  }

  public void checkModules(List<IModule> modules) {
    this.checkSomething(new ModulesIssueFinder(this.myOperationContext, modules), "Checking " + ListSequence.fromList(modules).count() + " modules");
    this.setTabProperties(ListSequence.fromList(modules).count() + " modules", Icons.MODULE_GROUP_CLOSED);
  }

  public void checkProject(MPSProject project) {
    this.checkSomething(new ProjectIssueFinder(this.myOperationContext, project), "Checking " + project.getProjectDescriptor().getName());
    this.setTabProperties(project.getProjectDescriptor().getName(), Icons.PROJECT_ICON);
  }

  public String getTabTitle() {
    return this.myTabTitle;
  }

  public Icon getTabIcon() {
    return this.myTabIcon;
  }

  public SearchResults getSearchResults() {
    return this.myUsagesView.getSearchResults();
  }

  public void showTabWithResults() {
    this.myTool.showTabWithResults(this);
  }

  public static class MyNodeRepresentator implements INodeRepresentator<ModelCheckerIssue> {
    public static final String CATEGORY_ERROR = MessageStatus.ERROR.toString();
    public static final String CATEGORY_WARNING = MessageStatus.WARNING.toString();
    public static final String CATEGORY_OK = MessageStatus.OK.toString();

    public MyNodeRepresentator() {
    }

    public String getResultsText(TextOptions options) {
      int size = options.mySubresultsCount;
      String sizeRepr = size + " issue" + ((size == 1 ?
        "" :
        "s"
      ));
      return "<strong>" + sizeRepr + " found</strong>";
    }

    public Icon getResultsIcon() {
      return Icons.CLOSED_FOLDER;
    }

    public String getCategoryText(TextOptions options, String category, boolean isResultsSection) {
      String counter = "";
      if (options.myCounters && isResultsSection) {
        int size = options.mySubresultsCount;
        counter = " (" + size + " issue" + ((size == 0 ?
          "" :
          "s"
        )) + ")";
      }
      String categoryRepr = "";
      if (CATEGORY_ERROR.equals(category)) {
        categoryRepr = "Errors";
      } else if (CATEGORY_WARNING.equals(category)) {
        categoryRepr = "Warnings";
      } else if (CATEGORY_OK.equals(category)) {
        categoryRepr = "Infos";
      }
      return "<strong>" + categoryRepr + counter + "</strong>";
    }

    public Icon getCategoryIcon(String category) {
      if (CATEGORY_ERROR.equals(category)) {
        return jetbrains.mps.ide.messages.Icons.ERROR_ICON;
      } else if (CATEGORY_WARNING.equals(category)) {
        return jetbrains.mps.ide.messages.Icons.WARNING_ICON;
      } else if (CATEGORY_OK.equals(category)) {
        return jetbrains.mps.ide.messages.Icons.INFORMATION_ICON;
      }
      return jetbrains.mps.ide.messages.Icons.ERROR_ICON;
    }

    public String getPresentation(ModelCheckerIssue issue) {
      return StringEscapeUtils.escapeHtml(issue.getMessage());
    }

    public void write(Element element, MPSProject project) throws CantSaveSomethingException {
    }

    public void read(Element element, MPSProject project) throws CantLoadSomethingException {
    }
  }
}

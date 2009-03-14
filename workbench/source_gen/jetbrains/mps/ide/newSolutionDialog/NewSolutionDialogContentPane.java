package jetbrains.mps.ide.newSolutionDialog;

/*Generated by MPS */

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.application.ModalityState;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import jetbrains.mps.ide.common.PathField;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.project.Solution;
import jetbrains.mps.project.persistence.SolutionDescriptorPersistence;
import jetbrains.mps.project.structure.model.ModelRoot;
import jetbrains.mps.project.structure.modules.SolutionDescriptor;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.uiLanguage.runtime.events.Events;
import jetbrains.mps.util.FileUtil;
import jetbrains.mps.vcs.ApplicationLevelVcsManager;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.MPSExtentions;
import jetbrains.mps.vfs.VFileSystem;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.Property;
import org.jetbrains.annotations.NotNull;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class NewSolutionDialogContentPane extends JPanel {

  public NewSolutionDialogContentPane myThis;
  private JLabel myComponent0;
  private JTextField myName0;
  private JLabel myComponent1;
  private PathField myPath0;
  private String mySolutionName;
  private String mySolutionPath;
  private boolean myCompileInMPS = true;
  private MPSProject myProject;
  private Solution myResult;
  private NewSolutionDialog myDialog;
  public List<AutoBinding> myBindings = new ArrayList<AutoBinding>();
  private Events myEvents = new Events(null) {
    {
    }


    public void initialize() {
    }

  };

  public NewSolutionDialogContentPane() {
    this.myThis = this;
    NewSolutionDialogContentPane component = this;
    component.setLayout(new GridLayout(4, 1));
    component.add(this.createComponent0());
    component.add(this.createComponent1());
    component.add(this.createComponent2());
    component.add(this.createComponent3());
    this.myEvents.initialize();
    myThis.setSolutionPath("");
    myThis.setSolutionName("NewSolution");
    myThis.myName0.setName("Name");
    myThis.myPath0.setName("Path");
  }

  public Events getEvents() {
    return this.myEvents;
  }

  public void addNotify() {
    super.addNotify();
    this.bind();
  }

  public void removeNotify() {
    this.unbind();
    super.removeNotify();
  }

  private void bind() {
    {
      Object sourceObject = myThis;
      Property sourceProperty = BeanProperty.create("solutionName");
      Object targetObject = this.myName0;
      Property targetProperty = BeanProperty.create("text");
      AutoBinding binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, sourceObject, sourceProperty, targetObject, targetProperty);
      binding.bind();
      this.myBindings.add(binding);
    }
    {
      Object sourceObject = myThis;
      Property sourceProperty = BeanProperty.create("solutionPath");
      Object targetObject = this.myPath0;
      Property targetProperty = BeanProperty.create("path");
      AutoBinding binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, sourceObject, sourceProperty, targetObject, targetProperty);
      binding.bind();
      this.myBindings.add(binding);
    }
  }

  private void unbind() {
    for(AutoBinding binding : this.myBindings) {
      if (binding.isBound()) {
        binding.unbind();
      }
    }
  }

  private JLabel createComponent0() {
    JLabel component = new JLabel();
    this.myComponent0 = component;
    component.setText("Name:");
    return component;
  }

  private JTextField createComponent1() {
    JTextField component = new JTextField();
    this.myName0 = component;
    return component;
  }

  private JLabel createComponent2() {
    JLabel component = new JLabel();
    this.myComponent1 = component;
    component.setText("Solution Path:");
    return component;
  }

  private PathField createComponent3() {
    PathField component = new PathField();
    this.myPath0 = component;
    return component;
  }

  public String getSolutionName() {
    return this.mySolutionName;
  }

  public String getSolutionPath() {
    return this.mySolutionPath;
  }

  public boolean getCompileInMPS() {
    return this.myCompileInMPS;
  }

  public MPSProject getProject() {
    return this.myProject;
  }

  public Solution getResult() {
    return this.myResult;
  }

  public NewSolutionDialog getDialog() {
    return this.myDialog;
  }

  public void setSolutionName(String newValue) {
    String oldValue = this.mySolutionName;
    this.mySolutionName = newValue;
    this.firePropertyChange("solutionName", oldValue, newValue);
    myThis.updateSolutionPath();
  }

  public void setSolutionPath(String newValue) {
    String oldValue = this.mySolutionPath;
    this.mySolutionPath = newValue;
    this.firePropertyChange("solutionPath", oldValue, newValue);
  }

  public void setCompileInMPS(boolean newValue) {
    boolean oldValue = this.myCompileInMPS;
    this.myCompileInMPS = newValue;
    this.firePropertyChange("compileInMPS", oldValue, newValue);
  }

  public void setProject(MPSProject newValue) {
    MPSProject oldValue = this.myProject;
    this.myProject = newValue;
    this.firePropertyChange("project", oldValue, newValue);
    myThis.updateSolutionPath();
  }

  public void setResult(Solution newValue) {
    Solution oldValue = this.myResult;
    this.myResult = newValue;
    this.firePropertyChange("result", oldValue, newValue);
  }

  public void setDialog(NewSolutionDialog newValue) {
    NewSolutionDialog oldValue = this.myDialog;
    this.myDialog = newValue;
    this.firePropertyChange("dialog", oldValue, newValue);
  }

  /* package */void onOk() {
    if (myThis.getSolutionPath().length() == 0) {
      myThis.getDialog().setErrorText("Enter solution directory");
      return;
    }
    if (myThis.getSolutionName().length() == 0) {
      myThis.getDialog().setErrorText("Enter solution name");
      return;
    }
    if (MPSModuleRepository.getInstance().getModuleByUID(myThis.getSolutionName()) != null) {
      myThis.getDialog().setErrorText("Duplicate solution name");
      return;
    }
    String descriptorPath = myThis.getSolutionPath() + File.separator + myThis.getSolutionName() + MPSExtentions.DOT_SOLUTION;
    File file = new File(descriptorPath);
    if (file.exists()) {
      myThis.getDialog().setErrorText("Solution file already exists");
      return;
    }
    File dir = file.getParentFile();
    if (!(dir.isAbsolute())) {
      myThis.getDialog().setErrorText("Path should be absolute");
      return;
    }
    if (!(dir.exists())) {
      dir.mkdirs();
    }
    final File descriptorFile = myThis.prepareToCreateNewSolutionDescriptorFile(descriptorPath);
    if (descriptorFile == null) {
      myThis.getDialog().setErrorText("Can't create " + descriptorPath);
      return;
    }
    myThis.getDialog().dispose();
    ProgressManager.getInstance().run(new Task.Modal(myThis.getProject().getComponent(Project.class), "Creating", false) {

      public void run(@NotNull() ProgressIndicator indicator) {
        indicator.setIndeterminate(true);
        ModelAccess.instance().runWriteAction(new Runnable() {

          public void run() {
            myThis.setResult(myThis.createNewSolution(myThis.getSolutionName(), FileSystem.getFile(descriptorFile)));
          }

        });
      }

    });
  }

  /* package */void onCancel() {
    myThis.getDialog().dispose();
  }

  /* package */File prepareToCreateNewSolutionDescriptorFile(String path) {
    File solutionDescriptorFile = new File(path);
    File dir = solutionDescriptorFile.getParentFile();
    if (!(dir.exists())) {
      dir.mkdirs();
    }
    return solutionDescriptorFile;
  }

  /* package */Solution createNewSolution(String solutionName, final IFile solutionDescriptorFile) {
    SolutionDescriptor solutionDescriptor = new SolutionDescriptor();
    solutionDescriptor.setExternallyVisible(true);
    solutionDescriptor.setCompileInMPS(myThis.getCompileInMPS());
    String fileName = solutionDescriptorFile.getName();
    solutionDescriptor.setNamespace(fileName.substring(0, fileName.length() - 4));
    ModelRoot modelRoot = new ModelRoot();
    modelRoot.setPrefix("");
    modelRoot.setPath(solutionDescriptorFile.getParent().getAbsolutePath());
    solutionDescriptor.getModelRoots().add(modelRoot);
    SolutionDescriptorPersistence.saveSolutionDescriptor(solutionDescriptorFile, solutionDescriptor);
    ApplicationManager.getApplication().invokeLater(new Runnable() {

      public void run() {
        ApplicationLevelVcsManager.instance().addFileToVcs(VFileSystem.refreshAndGetFile(solutionDescriptorFile), false);
      }

    }, ModalityState.NON_MODAL);
    return myThis.getProject().addProjectSolution(solutionDescriptorFile.toFile());
  }

  /* package */void updateSolutionPath() {
    if (myThis.getProject() == null) {
      return;
    }
    String path = FileUtil.getCanonicalPath(myThis.getProject().getProjectFile().getParentFile());
    String prefix = path + File.separator + "solutions" + File.separator;
    if (myThis.getSolutionPath().length() == 0 || myThis.getSolutionPath().startsWith(prefix)) {
      myThis.setSolutionPath(prefix + myThis.getSolutionName());
    }
  }

}

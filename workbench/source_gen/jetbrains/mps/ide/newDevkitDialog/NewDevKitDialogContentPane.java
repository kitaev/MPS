package jetbrains.mps.ide.newDevkitDialog;

/*Generated by MPS */

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import jetbrains.mps.ide.common.PathField;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.project.DevKit;
import java.util.List;
import org.jdesktop.beansbinding.AutoBinding;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.uiLanguage.runtime.events.Events;
import java.awt.GridLayout;
import org.jdesktop.beansbinding.Property;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Bindings;
import java.io.File;
import jetbrains.mps.project.MPSExtentions;
import jetbrains.mps.ide.NewModuleCheckUtil;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.util.FileUtil;
import jetbrains.mps.project.structure.modules.DevkitDescriptor;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.project.persistence.DevkitDescriptorPersistence;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.vfs.VirtualFile;
import jetbrains.mps.vfs.VFileSystem;
import jetbrains.mps.vcs.VcsMigrationUtil;
import java.util.Collections;
import com.intellij.openapi.application.ModalityState;

public class NewDevKitDialogContentPane extends JPanel {
  public NewDevKitDialogContentPane myThis;
  private JLabel myComponent_b0;
  private JTextField myName_c0;
  private JLabel myComponent_d0;
  private PathField myPath_e0;
  private String myDevkitName;
  private String myDevkitDir;
  private MPSProject myProject;
  private DevKit myResult;
  private NewDevKitDialog myDialog;
  public List<AutoBinding> myBindings = ListSequence.fromList(new ArrayList<AutoBinding>());
  private Events myEvents = new Events(null) {
    {
    }

    public void initialize() {
    }
  };

  public NewDevKitDialogContentPane() {
    this.myThis = this;
    NewDevKitDialogContentPane component = this;
    component.setLayout(new GridLayout(4, 1));
    component.add(this.createComponent_b0());
    component.add(this.createComponent_c0());
    component.add(this.createComponent_d0());
    component.add(this.createComponent_e0());
    this.myEvents.initialize();
    myThis.setDevkitName("");
    myThis.setDevkitDir("");
    myThis.myName_c0.setName("Name");
    myThis.myPath_e0.setName("Path");
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
      Property sourceProperty = BeanProperty.create("devkitName");
      Object targetObject = this.myName_c0;
      Property targetProperty = BeanProperty.create("text");
      AutoBinding binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, sourceObject, sourceProperty, targetObject, targetProperty);
      binding.bind();
      ListSequence.fromList(this.myBindings).addElement(binding);
    }
    {
      Object sourceObject = myThis;
      Property sourceProperty = BeanProperty.create("devkitDir");
      Object targetObject = this.myPath_e0;
      Property targetProperty = BeanProperty.create("path");
      AutoBinding binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, sourceObject, sourceProperty, targetObject, targetProperty);
      binding.bind();
      ListSequence.fromList(this.myBindings).addElement(binding);
    }
  }

  private void unbind() {
    for (AutoBinding binding : this.myBindings) {
      if (binding.isBound()) {
        binding.unbind();
      }
    }
  }

  private JLabel createComponent_b0() {
    JLabel component = new JLabel();
    this.myComponent_b0 = component;
    component.setText("Devkit Name:");
    return component;
  }

  private JTextField createComponent_c0() {
    JTextField component = new JTextField();
    this.myName_c0 = component;
    return component;
  }

  private JLabel createComponent_d0() {
    JLabel component = new JLabel();
    this.myComponent_d0 = component;
    component.setText("Devkit Path:");
    return component;
  }

  private PathField createComponent_e0() {
    PathField component = new PathField();
    this.myPath_e0 = component;
    return component;
  }

  public String getDevkitName() {
    return this.myDevkitName;
  }

  public String getDevkitDir() {
    return this.myDevkitDir;
  }

  public MPSProject getProject() {
    return this.myProject;
  }

  public DevKit getResult() {
    return this.myResult;
  }

  public NewDevKitDialog getDialog() {
    return this.myDialog;
  }

  public void setDevkitName(String newValue) {
    String oldValue = this.myDevkitName;
    this.myDevkitName = newValue;
    this.firePropertyChange("devkitName", oldValue, newValue);
    myThis.updateSolutionPath();
  }

  public void setDevkitDir(String newValue) {
    String oldValue = this.myDevkitDir;
    this.myDevkitDir = newValue;
    this.firePropertyChange("devkitDir", oldValue, newValue);
  }

  public void setProject(MPSProject newValue) {
    MPSProject oldValue = this.myProject;
    this.myProject = newValue;
    this.firePropertyChange("project", oldValue, newValue);
    myThis.updateSolutionPath();
  }

  public void setResult(DevKit newValue) {
    DevKit oldValue = this.myResult;
    this.myResult = newValue;
    this.firePropertyChange("result", oldValue, newValue);
  }

  public void setDialog(NewDevKitDialog newValue) {
    NewDevKitDialog oldValue = this.myDialog;
    this.myDialog = newValue;
    this.firePropertyChange("dialog", oldValue, newValue);
  }

  /*package*/ void onOk() {
    if (myThis.getDevkitDir().length() == 0) {
      myThis.getDialog().setErrorText("Enter DevKit Directory");
      return;
    }
    if (myThis.getDevkitName().length() == 0) {
      myThis.getDialog().setErrorText("Enter DevKit Name");
      return;
    }
    final String devkitPath = myThis.getDevkitDir() + File.separator + myThis.getDevkitName() + MPSExtentions.DOT_DEVKIT;
    if (new File(devkitPath).exists()) {
      myThis.getDialog().setErrorText("File " + devkitPath + " already exists");
      return;
    }
    File dir = new File(devkitPath);
    String message = NewModuleCheckUtil.checkModuleDirectory(dir, MPSExtentions.DOT_DEVKIT, "DevKit");
    if (message != null) {
      myThis.getDialog().setErrorText(message);
      return;
    }
    myThis.getDialog().dispose();
    Project ideaProject = myThis.getProject().getProject();
    final DevKit[] localResult = new DevKit[1];
    ProgressManager.getInstance().run(new Task.Modal(ideaProject, "Creating", false) {
      public void run(@NotNull ProgressIndicator indicator) {
        indicator.setIndeterminate(true);
        ModelAccess.instance().runWriteAction(new Runnable() {
          public void run() {
            localResult[0] = myThis.createNewDevKit(new File(devkitPath));
          }
        });
      }
    });
    myThis.setResult(localResult[0]);
  }

  /*package*/ void onCancel() {
    myThis.getDialog().dispose();
  }

  /*package*/ void updateSolutionPath() {
    if (myThis.getProject() == null) {
      return;
    }
    String path = FileUtil.getCanonicalPath(myThis.getProject().getProjectFile().getParentFile());
    String prefix = path + File.separator + "devkits" + File.separator;
    if (myThis.getDevkitDir().length() == 0 || myThis.getDevkitDir().startsWith(prefix)) {
      myThis.setDevkitDir(prefix + myThis.getDevkitName());
    }
  }

  /*package*/ DevKit createNewDevKit(final File devkitPath) {
    File dir = new File(myThis.getDevkitDir());
    if (!(dir.exists())) {
      dir.mkdirs();
    }
    DevkitDescriptor descriptor = new DevkitDescriptor();
    descriptor.setNamespace(myThis.getDevkitName());
    IFile devkitFile = FileSystem.getInstance().getFileByPath(devkitPath.getAbsolutePath());
    DevkitDescriptorPersistence.saveDevKitDescriptor(descriptor, devkitFile);
    DevKit devkit = myThis.getProject().addProjectDevKit(devkitFile);
    ApplicationManager.getApplication().invokeLater(new Runnable() {
      public void run() {
        VirtualFile file = VFileSystem.refreshAndGetFile(devkitPath);
        VcsMigrationUtil.getHandler().addFilesToVcs(Collections.singletonList(file), false, true);
      }
    }, ModalityState.NON_MODAL);
    return devkit;
  }
}

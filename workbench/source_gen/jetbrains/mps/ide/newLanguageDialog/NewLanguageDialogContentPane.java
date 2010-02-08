package jetbrains.mps.ide.newLanguageDialog;

/*Generated by MPS */

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import jetbrains.mps.ide.common.PathField;
import javax.swing.JCheckBox;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.Language;
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
import jetbrains.mps.ide.NewModuleCheckUtil;
import jetbrains.mps.vfs.MPSExtentions;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.LanguageAspect;
import jetbrains.mps.project.Solution;
import jetbrains.mps.smodel.SModelFqName;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.vfs.FileSystemFile;
import jetbrains.mps.project.structure.modules.LanguageDescriptor;
import jetbrains.mps.library.LanguageDesign_DevKit;
import com.intellij.openapi.application.ApplicationManager;
import jetbrains.mps.vcs.ApplicationLevelVcsManager;
import jetbrains.mps.vfs.VFileSystem;
import com.intellij.openapi.application.ModalityState;
import jetbrains.mps.ide.newSolutionDialog.NewModuleUtil;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.util.FileUtil;

public class NewLanguageDialogContentPane extends JPanel {
  public NewLanguageDialogContentPane myThis;
  private JLabel myComponent0;
  private JTextField myName0;
  private JLabel myComponent1;
  private PathField myPath0;
  private JCheckBox myNeedRuntime0;
  private JCheckBox myNeedSandbox0;
  private String myLanguageNamespace;
  private String myLanguagePath;
  private MPSProject myProject;
  private boolean myCompileInMPS = true;
  private Language myResult;
  private NewLanguageDialog myDialog;
  public List<AutoBinding> myBindings = ListSequence.fromList(new ArrayList<AutoBinding>());
  private Events myEvents = new Events(null) {
    {
    }

    public void initialize() {
    }
  };

  public NewLanguageDialogContentPane() {
    this.myThis = this;
    NewLanguageDialogContentPane component = this;
    component.setLayout(new GridLayout(6, 1));
    component.add(this.createComponent0());
    component.add(this.createComponent1());
    component.add(this.createComponent2());
    component.add(this.createComponent3());
    component.add(this.createComponent4());
    component.add(this.createComponent5());
    this.myEvents.initialize();
    myThis.setLanguageNamespace("");
    myThis.setLanguagePath("");
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
      Property sourceProperty = BeanProperty.create("languageNamespace");
      Object targetObject = this.myName0;
      Property targetProperty = BeanProperty.create("text");
      AutoBinding binding = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, sourceObject, sourceProperty, targetObject, targetProperty);
      binding.bind();
      ListSequence.fromList(this.myBindings).addElement(binding);
    }
    {
      Object sourceObject = myThis;
      Property sourceProperty = BeanProperty.create("languagePath");
      Object targetObject = this.myPath0;
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

  private JLabel createComponent0() {
    JLabel component = new JLabel();
    this.myComponent0 = component;
    component.setText("Language Namespace:");
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
    component.setText("Language Path:");
    return component;
  }

  private PathField createComponent3() {
    PathField component = new PathField();
    this.myPath0 = component;
    return component;
  }

  private JCheckBox createComponent4() {
    JCheckBox component = new JCheckBox();
    this.myNeedRuntime0 = component;
    component.setText("Create Runtime Solution");
    return component;
  }

  private JCheckBox createComponent5() {
    JCheckBox component = new JCheckBox();
    this.myNeedSandbox0 = component;
    component.setText("Create Sandbox Solution");
    return component;
  }

  public String getLanguageNamespace() {
    return this.myLanguageNamespace;
  }

  public String getLanguagePath() {
    return this.myLanguagePath;
  }

  public MPSProject getProject() {
    return this.myProject;
  }

  public boolean getCompileInMPS() {
    return this.myCompileInMPS;
  }

  public Language getResult() {
    return this.myResult;
  }

  public NewLanguageDialog getDialog() {
    return this.myDialog;
  }

  public void setLanguageNamespace(String newValue) {
    String oldValue = this.myLanguageNamespace;
    this.myLanguageNamespace = newValue;
    this.firePropertyChange("languageNamespace", oldValue, newValue);
    myThis.updateLanguagePath();
  }

  public void setLanguagePath(String newValue) {
    String oldValue = this.myLanguagePath;
    this.myLanguagePath = newValue;
    this.firePropertyChange("languagePath", oldValue, newValue);
  }

  public void setProject(MPSProject newValue) {
    MPSProject oldValue = this.myProject;
    this.myProject = newValue;
    this.firePropertyChange("project", oldValue, newValue);
    myThis.updateLanguagePath();
  }

  public void setCompileInMPS(boolean newValue) {
    boolean oldValue = this.myCompileInMPS;
    this.myCompileInMPS = newValue;
    this.firePropertyChange("compileInMPS", oldValue, newValue);
  }

  public void setResult(Language newValue) {
    Language oldValue = this.myResult;
    this.myResult = newValue;
    this.firePropertyChange("result", oldValue, newValue);
  }

  public void setDialog(NewLanguageDialog newValue) {
    NewLanguageDialog oldValue = this.myDialog;
    this.myDialog = newValue;
    this.firePropertyChange("dialog", oldValue, newValue);
  }

  /*package*/ void onOk() {
    File dir = new File(myThis.getLanguagePath());
    String message = NewModuleCheckUtil.checkModuleDirectory(dir, MPSExtentions.DOT_LANGUAGE, "Language");
    if (message != null) {
      myThis.getDialog().setErrorText(message);
      return;
    }
    if (myThis.getLanguageNamespace().length() == 0) {
      myThis.getDialog().setErrorText("Enter namespace");
      return;
    }
    if (MPSModuleRepository.getInstance().getModuleByUID(myThis.getLanguageNamespace()) != null) {
      myThis.getDialog().setErrorText("Language namespace already exists");
      return;
    }
    if (NameUtil.shortNameFromLongName(myThis.getLanguageNamespace()).length() == 0) {
      myThis.getDialog().setErrorText("Enter valid namespace");
      return;
    }
    myThis.getDialog().dispose();
    final Wrappers._T<Language> language = new Wrappers._T<Language>(null);
    Project project = myThis.getProject().getComponent(Project.class);
    ProgressManager.getInstance().run(new Task.Modal(project, "Creating", false) {
      public void run(@NotNull ProgressIndicator indicator) {
        indicator.setIndeterminate(true);
        ModelAccess.instance().runWriteAction(new Runnable() {
          public void run() {
            language.value = myThis.createNewLanguage();
          }
        });
      }
    });
    ModelAccess.instance().runWriteActionInCommandAsync(new Runnable() {
      public void run() {
        if (!(language.value.getSModelRoots().isEmpty())) {
          LanguageAspect.STRUCTURE.createNew(language.value, false);
          LanguageAspect.EDITOR.createNew(language.value, false);
          LanguageAspect.CONSTRAINTS.createNew(language.value, false);
          LanguageAspect.TYPESYSTEM.createNew(language.value, false);
        }
        if (myThis.myNeedRuntime0.isSelected()) {
          Solution runtime = myThis.createRuntimeSolution();
          runtime.createModel(SModelFqName.fromString(myThis.getLanguageNamespace() + ".runtime"), runtime.getSModelRoots().get(0));
        }
        if (myThis.myNeedSandbox0.isSelected()) {
          Solution sandbox = myThis.createSandboxSolution();
          SModel createdModel = sandbox.createModel(SModelFqName.fromString(myThis.getLanguageNamespace() + ".sandbox"), sandbox.getSModelRoots().get(0)).getSModel();
          createdModel.addLanguage(myThis.getResult());
          for (Language extendedLanguage : myThis.getResult().getExtendedLanguages()) {
            createdModel.addLanguage(extendedLanguage);
          }
          for (ModuleReference addedLanguage : createdModel.getExplicitlyImportedLanguages()) {
            if (sandbox.getScope().getLanguage(addedLanguage) == null) {
              sandbox.addUsedLanguage(addedLanguage);
            }
          }
        }
      }
    });
  }

  /*package*/ void onCancel() {
    myThis.getDialog().dispose();
  }

  /*package*/ String getLanguageName() {
    return NameUtil.shortNameFromLongName(myThis.getLanguageNamespace());
  }

  /*package*/ Language createNewLanguage() {
    String descriptorFileName = myThis.getLanguageName();
    final File descriptorFile = new File(myThis.getLanguagePath(), descriptorFileName + MPSExtentions.DOT_LANGUAGE);
    File dir = descriptorFile.getParentFile();
    if (!(dir.exists())) {
      dir.mkdirs();
    }
    final Language language = Language.createLanguage(myThis.getLanguageNamespace(), new FileSystemFile(descriptorFile), myThis.getProject());
    LanguageDescriptor languageDescriptor = (LanguageDescriptor) language.getLanguageDescriptor();
    ModuleReference devkitRef = LanguageDesign_DevKit.MODULE_REFERENCE;
    languageDescriptor.getUsedDevkits().add(devkitRef);
    languageDescriptor.setCompileInMPS(myThis.getCompileInMPS());
    language.setLanguageDescriptor(languageDescriptor);
    language.save();
    myThis.getProject().addProjectLanguage(language);
    myThis.setResult(language);
    // add to vcs 
    ApplicationManager.getApplication().invokeLater(new Runnable() {
      public void run() {
        ApplicationLevelVcsManager.instance().addFileToVcs(VFileSystem.refreshAndGetFile(descriptorFile.getParentFile()), true);
      }
    }, ModalityState.NON_MODAL);
    return language;
  }

  /*package*/ Solution createRuntimeSolution() {
    String descriptorPath = myThis.getLanguagePath() + File.separator + "runtime" + File.separator + myThis.getLanguageNamespace() + ".runtime" + MPSExtentions.DOT_SOLUTION;
    final File file = new File(descriptorPath);
    Solution solution = NewModuleUtil.createNewSolution(FileSystem.getFile(file), myThis.getProject());
    solution.getSolutionDescriptor().setCompileInMPS(myThis.getCompileInMPS());
    return solution;
  }

  /*package*/ Solution createSandboxSolution() {
    String descriptorPath = myThis.getLanguagePath() + File.separator + "sandbox" + File.separator + myThis.getLanguageNamespace() + ".sandbox" + MPSExtentions.DOT_SOLUTION;
    final File file = new File(descriptorPath);
    Solution solution = NewModuleUtil.createNewSolution(FileSystem.getFile(file), myThis.getProject());
    solution.getSolutionDescriptor().setCompileInMPS(myThis.getCompileInMPS());
    return solution;
  }

  /*package*/ void updateLanguagePath() {
    if (myThis.getProject() == null) {
      return;
    }
    String path = FileUtil.getCanonicalPath(myThis.getProject().getProjectFile().getParentFile());
    String prefix = path + File.separator + "languages" + File.separator;
    if (myThis.getLanguagePath().length() == 0 || myThis.getLanguagePath().startsWith(prefix)) {
      myThis.setLanguagePath(prefix + NameUtil.shortNameFromLongName(myThis.getLanguageNamespace()));
    }
  }
}

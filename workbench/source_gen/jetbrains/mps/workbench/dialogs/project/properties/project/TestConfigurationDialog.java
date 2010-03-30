package jetbrains.mps.workbench.dialogs.project.properties.project;

/*Generated by MPS */

import jetbrains.mps.ide.dialogs.BaseDialog;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.project.structure.project.testconfigurations.BaseTestConfiguration;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JRadioButton;
import org.jetbrains.annotations.Nullable;
import java.awt.HeadlessException;
import javax.swing.JComponent;
import jetbrains.mps.ide.dialogs.DialogDimensionsSettings;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ButtonGroup;
import jetbrains.mps.project.structure.project.testconfigurations.ModuleTestConfiguration;
import jetbrains.mps.project.structure.project.testconfigurations.ModelsTestConfiguration;
import javax.swing.BoxLayout;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.border.CompoundBorder;
import javax.swing.JFrame;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.WindowManager;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.util.List;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.ModelAccess;
import com.intellij.openapi.util.Computable;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.workbench.dialogs.choosers.CommonChoosers;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.SModelReference;
import org.jdesktop.observablecollections.ObservableCollections;
import java.util.ArrayList;
import javax.swing.JList;
import javax.swing.DefaultListCellRenderer;
import jetbrains.mps.smodel.SModelDescriptor;
import java.awt.Color;
import jetbrains.mps.smodel.SModelRepository;
import javax.swing.JScrollPane;
import jetbrains.mps.workbench.dialogs.project.components.parts.actions.ListAddAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.dialogs.project.components.parts.actions.ListRemoveAction;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import com.intellij.openapi.actionSystem.ActionToolbar;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionPlaces;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.swingbinding.SwingBindings;
import org.jdesktop.beansbinding.Property;
import org.jdesktop.beansbinding.BeanProperty;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class TestConfigurationDialog extends BaseDialog {
  private static final Logger LOG = Logger.getLogger(TestConfigurationDialog.class);
  private static final String MODEL = "model";
  private static final String MODULE = "module";

  private MPSProject myProject;
  private BaseTestConfiguration myConfig;
  private BaseTestConfiguration myResult = null;
  private JPanel myMainComponent;
  private CardLayout myCards;
  private JPanel myConfigPanel;
  private TestConfigurationDialog.ModulePanel myModulePanel;
  private TestConfigurationDialog.ModelsPanel myModelsPanel;
  private JRadioButton myRadioModels;
  private JRadioButton myRadioModule;
  private TestConfigurationDialog.NamePanel myNamePanel;

  public TestConfigurationDialog(MPSProject mpsProject, @Nullable BaseTestConfiguration config) throws HeadlessException {
    super(getFrame(mpsProject), "Edit Test Configuration");
    this.myProject = mpsProject;
    this.myConfig = config;
    this.initUI();
  }

  protected JComponent getMainComponent() {
    return this.myMainComponent;
  }

  @Override
  public DialogDimensionsSettings.DialogDimensions getDefaultDimensionSettings() {
    return new DialogDimensionsSettings.DialogDimensions(200, 200, 400, 300);
  }

  private void initUI() {
    this.myMainComponent = new JPanel();
    GridBagLayout bagLayout = new GridBagLayout();
    this.myMainComponent.setLayout(bagLayout);
    GridBagConstraints cName = new GridBagConstraints(0, 0, 1, 1, 1, 0, GridBagConstraints.NORTHWEST, GridBagConstraints.BOTH, new Insets(5, 5, 0, 5), 0, 0);
    this.myNamePanel = new TestConfigurationDialog.NamePanel();
    this.myMainComponent.add(this.myNamePanel, cName);
    GridBagConstraints cCheck = new GridBagConstraints(0, 1, 1, 1, 1, 0, GridBagConstraints.NORTHWEST, GridBagConstraints.BOTH, new Insets(5, 5, 0, 5), 0, 0);
    this.myMainComponent.add(this.createCheckboxPanel(), cCheck);
    GridBagConstraints cRadio = new GridBagConstraints(0, 2, 1, 1, 1, 0, GridBagConstraints.NORTHWEST, GridBagConstraints.BOTH, new Insets(5, 5, 0, 5), 0, 0);
    this.myMainComponent.add(this.createRadioPanel(), cRadio);
    GridBagConstraints cConfig = new GridBagConstraints(0, 3, 1, 1, 1, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.BOTH, new Insets(10, 0, 0, 0), 0, 0);
    this.myCards = new CardLayout();
    this.myConfigPanel = new JPanel(this.myCards);
    this.myModulePanel = new TestConfigurationDialog.ModulePanel(this.myProject);
    this.myModelsPanel = new TestConfigurationDialog.ModelsPanel(this.myProject);
    this.myConfigPanel.add(this.createPanel("Module", this.myModulePanel), MODULE);
    this.myConfigPanel.add(this.createPanel("Models", this.myModelsPanel), MODEL);
    this.myMainComponent.add(this.myConfigPanel, cConfig);
    ButtonGroup group = new ButtonGroup();
    group.add(this.myRadioModule);
    group.add(this.myRadioModels);
    if (this.myConfig != null) {
      this.myNamePanel.init(this.myConfig);
      if (this.myConfig instanceof ModuleTestConfiguration) {
        this.myModulePanel.init((ModuleTestConfiguration) this.myConfig);
        this.myRadioModule.doClick();
      } else
      if (this.myConfig instanceof ModelsTestConfiguration) {
        this.myModelsPanel.init((ModelsTestConfiguration) this.myConfig);
        this.myRadioModels.doClick();
      } else {
        LOG.error("Unknown configuration " + this.myConfig.getClass().getSimpleName());
      }
    } else {
      this.myRadioModule.doClick();
    }
  }

  private JPanel createCheckboxPanel() {
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
    return panel;
  }

  private JPanel createRadioPanel() {
    this.myRadioModule = new JRadioButton(new AbstractAction("Module configuration") {
      public void actionPerformed(ActionEvent e) {
        TestConfigurationDialog.this.myModulePanel.setState(true);
        TestConfigurationDialog.this.myModelsPanel.setState(false);
        TestConfigurationDialog.this.myCards.show(TestConfigurationDialog.this.myConfigPanel, TestConfigurationDialog.MODULE);
      }
    });
    this.myRadioModels = new JRadioButton(new AbstractAction("Models configuration") {
      public void actionPerformed(ActionEvent e) {
        TestConfigurationDialog.this.myModulePanel.setState(false);
        TestConfigurationDialog.this.myModelsPanel.setState(true);
        TestConfigurationDialog.this.myCards.show(TestConfigurationDialog.this.myConfigPanel, TestConfigurationDialog.MODEL);
      }
    });
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
    panel.add(this.myRadioModule);
    panel.add(this.myRadioModels);
    return panel;
  }

  private JPanel createPanel(String caption, final TestConfigurationDialog.BasePanel panel) {
    JPanel outer = new JPanel(new BorderLayout());
    Border innerBorder = BorderFactory.createEmptyBorder(0, 5, 5, 5);
    Border outerBorder = BorderFactory.createTitledBorder(caption);
    CompoundBorder border = BorderFactory.createCompoundBorder(outerBorder, innerBorder);
    outer.setBorder(border);
    outer.add(panel, BorderLayout.CENTER);
    return outer;
  }

  public BaseTestConfiguration getResult() {
    return this.myResult;
  }

  @BaseDialog.Button(name = "OK", mnemonic = 'O', position = 0, defaultButton = true)
  public void buttonOK() {
    if (!(this.myNamePanel.isConfigNameSet())) {
      this.setErrorText("Name must be specified");
      return;
    }
    if (this.myRadioModels.isSelected()) {
      this.myResult = this.myModelsPanel.create();
      this.myResult.setName(this.myNamePanel.getConfigName());
      this.dispose();
    } else
    if (this.myRadioModule.isSelected()) {
      this.myResult = this.myModulePanel.create();
      this.myResult.setName(this.myNamePanel.getConfigName());
      this.dispose();
    } else {
      LOG.error("Unknown radiobutton state");
    }
  }

  @BaseDialog.Button(name = "Cancel", mnemonic = 'C', position = 1, defaultButton = false)
  public void buttonCancel() {
    this.myResult = null;
    this.dispose();
  }

  private static JFrame getFrame(MPSProject mpsProject) {
    Project project = mpsProject.getComponent(Project.class);
    return WindowManager.getInstance().getFrame(project);
  }

  private abstract class BasePanel extends JPanel {
    private BasePanel() {
    }

    public void setState(boolean isEnabled) {
      for (Component c : this.getComponents()) {
        c.setEnabled(isEnabled);
      }
    }

    public abstract BaseTestConfiguration create();
  }

  private class ModulePanel extends TestConfigurationDialog.BasePanel {
    private JTextField myModuleUID;
    private MPSProject myProject;

    public ModulePanel(MPSProject project) {
      this.myProject = project;
      this.setLayout(new BorderLayout());
      this.myModuleUID = new JTextField();
      JButton button = new JButton(new AbstractAction("Select") {
        public void actionPerformed(ActionEvent e) {
          List<IModule> modules = ModelAccess.instance().runReadAction(new Computable<List<IModule>>() {
            public List<IModule> compute() {
              return MPSModuleRepository.getInstance().getAllModules();
            }
          });
          IModule module = CommonChoosers.showDialogModuleChooser(ModulePanel.this, TestConfigurationDialog.MODULE, ModulePanel.this.myProject.getModules(), modules);
          if (module == null) {
            return;
          }
          String moduleName = module.getModuleFqName();
          ModulePanel.this.myModuleUID.setText(moduleName);
          if (!(TestConfigurationDialog.this.myNamePanel.isConfigNameSet())) {
            TestConfigurationDialog.this.myNamePanel.setConfigName(NameUtil.shortNameFromLongName(moduleName));
          }
        }
      });
      JPanel panel = new JPanel(new BorderLayout());
      panel.add(this.myModuleUID, BorderLayout.CENTER);
      panel.add(button, BorderLayout.EAST);
      this.add(panel, BorderLayout.NORTH);
    }

    public void init(ModuleTestConfiguration mtc) {
      this.myModuleUID.setText(mtc.getModuleRef().getModuleFqName());
    }

    public BaseTestConfiguration create() {
      ModuleTestConfiguration result = new ModuleTestConfiguration();
      result.setModuleRef(new ModuleReference(this.myModuleUID.getText()));
      return result;
    }
  }

  public class ModelsPanel extends TestConfigurationDialog.BasePanel {
    public static final String MODELS_PROPERTY = "models";

    private List<SModelReference> myModels = ObservableCollections.observableList(new ArrayList<SModelReference>());
    private JList myModelsList;
    private MPSProject myProject;

    public ModelsPanel(MPSProject project) {
      this.myProject = project;
      this.setLayout(new BorderLayout());
      this.myModelsList = new JList();
      this.myModelsList.setCellRenderer(new DefaultListCellRenderer() {
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
          final SModelReference model = (SModelReference) value;
          final DefaultListCellRenderer ren = this;
          String modelName = model.getLongName();
          if (modelName == null) {
            modelName = "<no name>";
          }
          Component result = super.getListCellRendererComponent(list, modelName, index, isSelected, cellHasFocus);
          if (isSelected) {
            return result;
          }
          ModelAccess.instance().runReadAction(new Runnable() {
            public void run() {
              boolean inProject = false;
              for (SModelDescriptor projectModel : ModelsPanel.this.myProject.getProjectModels()) {
                if (model.equals(projectModel.getSModelReference())) {
                  inProject = true;
                  break;
                }
              }
              if (inProject) {
                ren.setForeground(Color.BLACK);
              } else
              if (SModelRepository.getInstance().getModelDescriptor(model) != null) {
                ren.setForeground(new Color(128, 0, 128));
              } else {
                ren.setForeground(Color.RED);
              }
            }
          });
          return result;
        }
      });
      JScrollPane scroller = new JScrollPane(this.myModelsList);
      this.add(scroller, BorderLayout.CENTER);
      ListAddAction addAction = new ListAddAction(this.myModelsList) {
        @Override
        protected int doAdd(AnActionEvent e) {
          List<SModelDescriptor> models = ModelsPanel.this.myProject.getProjectModels();
          SModelDescriptor sModelDescriptor = CommonChoosers.showDialogModelChooser(ModelsPanel.this, models, SModelRepository.getInstance().getModelDescriptors());
          if (sModelDescriptor == null) {
            return -1;
          }
          SModelReference modelRef = sModelDescriptor.getSModelReference();
          ModelsPanel.this.myModels.add(modelRef);
          if (!(TestConfigurationDialog.this.myNamePanel.isConfigNameSet())) {
            TestConfigurationDialog.this.myNamePanel.setConfigName(sModelDescriptor.getName());
          }
          return ModelsPanel.this.myModels.indexOf(modelRef);
        }
      };
      ListRemoveAction removeAction = new ListRemoveAction(this.myModelsList) {
        @Override
        protected void doRemove(AnActionEvent e) {
          for (Object o : ModelsPanel.this.myModelsList.getSelectedValues()) {
            SModelReference model = (SModelReference) o;
            ModelsPanel.this.myModels.remove(model);
          }
        }
      };
      this.add(this.createToolbar(new AnAction[]{addAction,removeAction}), BorderLayout.EAST);
      this.bind();
    }

    private JComponent createToolbar(AnAction[] actions) {
      DefaultActionGroup group = ActionUtils.groupFromActions(actions);
      ActionToolbar toolbar = ActionManager.getInstance().createActionToolbar(ActionPlaces.UNKNOWN, group, false);
      return toolbar.getComponent();
    }

    private void setButtonsState(JButton bRemove) {
      bRemove.setEnabled(this.myModelsList.getSelectedIndices().length != 0);
    }

    private void bind() {
      List<AutoBinding> bindings = new ArrayList<AutoBinding>();
      bindings.add(SwingBindings.createJListBinding(AutoBinding.UpdateStrategy.READ_WRITE, this, (Property) BeanProperty.create(MODELS_PROPERTY), this.myModelsList));
      for (AutoBinding b : bindings) {
        b.bind();
      }
    }

    private JButton createButton(final AbstractAction action) {
      JButton button = new JButton(action);
      button.setHorizontalAlignment(SwingConstants.LEFT);
      button.setHorizontalTextPosition(SwingConstants.RIGHT);
      return button;
    }

    public void init(ModelsTestConfiguration mtc) {
      this.myModels.clear();
      this.myModels.addAll(mtc.getModels());
    }

    public BaseTestConfiguration create() {
      return new ModelsTestConfiguration(this.myModels);
    }

    @Override
    public void setState(boolean isEnabled) {
      super.setState(isEnabled);
      this.myModelsList.setEnabled(isEnabled);
    }

    public List<SModelReference> getModels() {
      return this.myModels;
    }
  }

  private class NamePanel extends JPanel {
    private JTextField myName;

    public NamePanel() {
      super(new BorderLayout());
      this.add(new JLabel("Name:"), BorderLayout.WEST);
      this.myName = new JTextField();
      this.add(this.myName, BorderLayout.CENTER);
    }

    public boolean isConfigNameSet() {
      return !(this.getConfigName().trim().equals(""));
    }

    public String getConfigName() {
      return this.myName.getText();
    }

    public void setConfigName(String name) {
      this.myName.setText(name);
      TestConfigurationDialog.this.setErrorText("");
    }

    public void init(BaseTestConfiguration config) {
      this.myName.setText(config.getName());
    }
  }
}

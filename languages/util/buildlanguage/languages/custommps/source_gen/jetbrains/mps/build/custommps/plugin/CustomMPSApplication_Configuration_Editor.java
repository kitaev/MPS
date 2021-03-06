package jetbrains.mps.build.custommps.plugin;

/*Generated by MPS */

import jetbrains.mps.execution.api.settings.SettingsEditorEx;
import jetbrains.mps.build.packaging.plugin.ConfigurationChoosePanel;
import jetbrains.mps.baseLanguage.runConfigurations.runtime.MainNodeChooser;
import javax.swing.JCheckBox;
import jetbrains.mps.baseLanguage.runConfigurations.runtime.FieldWithPathChooseDialog;
import jetbrains.mps.execution.configurations.lib.Node_Configuration_Editor;
import jetbrains.mps.buildlanguage.plugin.AntSettings_Configuration_Editor;
import com.intellij.openapi.util.Disposer;
import org.jetbrains.annotations.NotNull;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import jetbrains.mps.ide.common.LayoutUtil;
import jetbrains.mps.baseLanguage.runConfigurations.runtime.IJavaNodeChangeListener;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import com.intellij.openapi.options.ConfigurationException;

public class CustomMPSApplication_Configuration_Editor extends SettingsEditorEx<CustomMPSApplication_Configuration> {
  private ConfigurationChoosePanel myConfigurationChoosePanel = new ConfigurationChoosePanel();
  private MainNodeChooser myChooser;
  private JCheckBox myUseAlternativeAnt;
  private FieldWithPathChooseDialog myAlternativeAnt;
  private Node_Configuration_Editor myNode;
  private AntSettings_Configuration_Editor mySettings;

  public CustomMPSApplication_Configuration_Editor(Node_Configuration_Editor node, AntSettings_Configuration_Editor settings) {
    myNode = node;
    mySettings = settings;
  }

  public void disposeEditor() {
    myChooser.dispose();
    Disposer.dispose(myNode);
    Disposer.dispose(mySettings);
  }

  @NotNull
  public JPanel createEditor() {
    JPanel panel = new JPanel(new GridBagLayout());

    panel.add(new JLabel("Custom MPS build script:"), LayoutUtil.createLabelConstraints(0));
    myChooser = myNode.createEditor();
    panel.add(myChooser, LayoutUtil.createPanelConstraints(1));

    panel.add(myConfigurationChoosePanel, LayoutUtil.createPanelConstraints(2));

    panel.add(mySettings.createEditor(), LayoutUtil.createPanelConstraints(3));

    myChooser.addNodeChangeListener(new IJavaNodeChangeListener() {
      public void nodeChanged(SNode node) {
        myConfigurationChoosePanel.nodeChanged(SNodeOperations.cast(node, "jetbrains.mps.build.packaging.structure.Layout"));
      }
    });

    return panel;
  }

  public void applyEditorTo(final CustomMPSApplication_Configuration configuration) throws ConfigurationException {
    myNode.applyEditorTo(configuration.getNode());
    mySettings.applyEditorTo(configuration.getSettings());
    configuration.setConfigurationId(myConfigurationChoosePanel.getChildId());
  }

  public void resetEditorFrom(final CustomMPSApplication_Configuration configuration) {
    myNode.resetEditorFrom(configuration.getNode());
    mySettings.resetEditorFrom(configuration.getSettings());
    myConfigurationChoosePanel.reset(SNodeOperations.cast(configuration.getNode().getNode(), "jetbrains.mps.build.packaging.structure.Layout"), configuration.getConfigurationId());
  }
}

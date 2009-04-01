package jetbrains.mps.lang.generator.intentions;

/*Generated by MPS */

import jetbrains.mps.ide.dialogs.BaseDialog;
import jetbrains.mps.nodeEditor.EditorContext;
import javax.swing.JPanel;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComponent;
import jetbrains.mps.ide.dialogs.DialogDimensionsSettings;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.generator.intentions.MappingLabelUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.AttributesRolesUtil;
import java.awt.Insets;

public class AttachMappingLabelDialog extends BaseDialog {

  protected EditorContext myEditorContext;
  protected JPanel myPanel;
  private SNode myTemplateNode;
  private List<String> myExistingLabels;
  private String myResultLabelName = "";

  public AttachMappingLabelDialog(SNode templateNode, List<String> existingLabels, Frame frame, EditorContext editorContext) {
    super(frame, "Attach Mapping Label");
    this.myExistingLabels = existingLabels;
    this.myEditorContext = editorContext;
    this.myTemplateNode = templateNode;
    this.initPanel();
  }

  private JPanel createNamePanel() {
    JPanel namePanel = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    c.fill = GridBagConstraints.HORIZONTAL;
    namePanel.add(new JLabel("Mapping label: "), c);
    c = new GridBagConstraints();
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 1;
    c.gridx = 1;
    final JComboBox nameCombo = new JComboBox(ListSequence.fromList(this.myExistingLabels).toGenericArray(String.class));
    nameCombo.setEditable(true);
    namePanel.add(nameCombo, c);
    nameCombo.addActionListener(new ActionListener() {

      public void actionPerformed(ActionEvent p0) {
        AttachMappingLabelDialog.this.myResultLabelName = (String)nameCombo.getSelectedItem();
      }
    });
    if (ListSequence.fromList(this.myExistingLabels).isNotEmpty()) {
      nameCombo.setSelectedItem(ListSequence.fromList(this.myExistingLabels).first());
      JTextField textField = ((JTextField)nameCombo.getEditor().getEditorComponent());
      textField.setSelectionStart(0);
      textField.setSelectionEnd(ListSequence.fromList(this.myExistingLabels).first().length());
    }
    return namePanel;
  }

  protected JComponent getMainComponent() {
    return this.myPanel;
  }

  @BaseDialog.Button(name = "Cancel", position = 1, defaultButton = false)
  public void onCancel() {
    this.dispose();
  }

  @BaseDialog.Button(name = "Attach label", position = 0, defaultButton = true)
  public void onOk() {
    this.dispose();
    this.doAttachMappingLabel();
  }

  public DialogDimensionsSettings.DialogDimensions getDefaultDimensionSettings() {
    return new DialogDimensionsSettings.DialogDimensions(100, 200, 400, 200);
  }

  protected void doAttachMappingLabel() {
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {

      public void run() {
        SNode mappingLabel = MappingLabelUtil.findOrCreateMappingLabelForName(AttachMappingLabelDialog.this.myTemplateNode, AttachMappingLabelDialog.this.myResultLabelName);
        SNode existingMacro = ListSequence.fromList(SLinkOperations.getTargets(AttachMappingLabelDialog.this.myTemplateNode, AttributesRolesUtil.childRoleFromAttributeRole("nodeMacro"), true)).last();
        if (existingMacro != null) {
          SLinkOperations.setTarget(existingMacro, "mappingLabel", mappingLabel, false);
          return;
        }
        SNode templateFragment = SLinkOperations.getTarget(AttachMappingLabelDialog.this.myTemplateNode, AttributesRolesUtil.childRoleFromAttributeRole("templateFragment"), true);
        if (templateFragment != null) {
          SLinkOperations.setTarget(templateFragment, "labelDeclaration", mappingLabel, false);
          return;
        }
        //         create new MAP_SRC macro
        SNode newMacro = SLinkOperations.addNewChild(AttachMappingLabelDialog.this.myTemplateNode, AttributesRolesUtil.childRoleFromAttributeRole("nodeMacro"), "jetbrains.mps.lang.generator.structure.MapSrcNodeMacro");
        SLinkOperations.setTarget(newMacro, "mappingLabel", mappingLabel, false);
      }
    });
  }

  protected void initPanel() {
    this.myPanel = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    c.fill = GridBagConstraints.HORIZONTAL;
    c.insets = new Insets(3, 3, 3, 3);
    c.gridx = 0;
    c.gridy = 0;
    c.weightx = 1;
    c.weighty = 0;
    this.myPanel.add(this.createNamePanel(), c);
  }

}

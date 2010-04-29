package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import jetbrains.mps.ide.dialogs.BaseDialog;
import jetbrains.mps.nodeEditor.EditorContext;
import javax.swing.JPanel;
import jetbrains.mps.smodel.SNode;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import jetbrains.mps.smodel.ModelAccess;
import javax.swing.JComponent;
import jetbrains.mps.ide.dialogs.DialogDimensionsSettings;
import java.awt.Insets;

public abstract class IntroduceVariableDialog extends BaseDialog {
  protected EditorContext myEditorContext;
  protected JPanel myPanel;
  protected SNode myResult;
  protected JCheckBox myReplaceAll = null;
  protected VisibilityPanel myVisibilityPanel = null;
  private JComboBox myName;

  public IntroduceVariableDialog(String name, Frame frame, EditorContext editorContext) {
    super(frame, name);
    this.myEditorContext = editorContext;
  }

  private JPanel createNamePanel() {
    JPanel result = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    c.fill = GridBagConstraints.HORIZONTAL;
    result.add(new JLabel("Name: "), c);
    c = new GridBagConstraints();
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 1;
    c.gridx = 1;
    List<String> expectedNames = this.getRefactoring().getExpectedNames();
    this.myName = new JComboBox(ListSequence.fromList(expectedNames).toGenericArray(String.class));
    this.myName.setEditable(true);
    result.add(this.myName, c);
    this.myName.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent p0) {
        IntroduceVariableDialog.this.getRefactoring().setName(((String) IntroduceVariableDialog.this.myName.getSelectedItem()));
      }
    });
    this.myName.setSelectedItem(ListSequence.fromList(expectedNames).first());
    JTextField textField = ((JTextField) this.myName.getEditor().getEditorComponent());
    textField.setSelectionStart(0);
    textField.setSelectionEnd(ListSequence.fromList(expectedNames).first().length());
    textField.addKeyListener(new KeyAdapter() {
      public void keyPressed(KeyEvent p0) {
        if (p0.getKeyCode() == KeyEvent.VK_ENTER && !(IntroduceVariableDialog.this.myName.isPopupVisible())) {
          IntroduceVariableDialog.this.onOk();
        }
      }
    });
    return result;
  }

  public void addReplacingAll(int gridy) {
    GridBagConstraints c = new GridBagConstraints();
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 0;
    c.gridy = gridy;
    this.myReplaceAll = new JCheckBox("replace duplicates (" + ListSequence.fromList(getRefactoring().getDuplicates()).count() + " found)");
    this.myPanel.add(this.myReplaceAll, c);
  }

  public void addVisibilityPanel(final GridBagConstraints c) {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        IntroduceVariableDialog.this.myVisibilityPanel = new VisibilityPanel();
        IntroduceVariableDialog.this.myPanel.add(IntroduceVariableDialog.this.myVisibilityPanel, c);
      }
    });
  }

  protected JComponent getMainComponent() {
    return this.myPanel;
  }

  @BaseDialog.Button(name = "Cancel", mnemonic = 'C', position = 1, defaultButton = false)
  public void onCancel() {
    this.dispose();
  }

  @BaseDialog.Button(name = "Refactor", mnemonic = 'R', position = 0, defaultButton = true)
  public void onOk() {
    String name = (String) this.myName.getEditor().getItem();
    IntroduceVariableDialog.this.getRefactoring().setName(name);
    if (myVisibilityPanel != null) {
      getRefactoring().setVisibilityLevel(this.myVisibilityPanel.getResult());
    }
    if (myReplaceAll != null) {
      getRefactoring().setReplacingAll(this.myReplaceAll != null && this.myReplaceAll.isSelected());
    }
    this.doRefactoring();
  }

  public DialogDimensionsSettings.DialogDimensions getDefaultDimensionSettings() {
    return new DialogDimensionsSettings.DialogDimensions(100, 200, 200, 200);
  }

  public abstract IntroduceVariableRefactoring getRefactoring();

  protected void doRefactoring() {
    this.dispose();
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        IntroduceVariableDialog.this.myResult = IntroduceVariableDialog.this.getRefactoring().doRefactoring();
        MoveRefactoringUtils.fixImportsFromNode(IntroduceVariableDialog.this.myResult);
      }
    });
    this.myEditorContext.select(this.myResult);
  }

  public SNode getResult() {
    return this.myResult;
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

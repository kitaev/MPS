package jetbrains.mps.debugger.api.ui.actions;

/*Generated by MPS */

import jetbrains.mps.ide.dialogs.BaseDialog;
import javax.swing.JComponent;
import jetbrains.mps.smodel.IOperationContext;
import javax.swing.JTextArea;
import com.intellij.ui.ScrollPaneFactory;
import jetbrains.mps.ide.datatransfer.CopyPasteUtil;
import jetbrains.mps.ide.dialogs.DialogDimensionsSettings;

public class ExportThreadsDialog extends BaseDialog {
  private final StringBuffer myThreads;
  private final JComponent myMainComponent;

  public ExportThreadsDialog(IOperationContext context, StringBuffer threads) {
    super(context.getMainFrame(), "Export Threads");
    setModal(false);

    myThreads = threads;

    JTextArea textArea = new JTextArea();
    textArea.setEditable(false);
    textArea.setText(myThreads.toString());
    myMainComponent = ScrollPaneFactory.createScrollPane(textArea);
    pack();
  }

  public JComponent getMainComponent() {
    return myMainComponent;
  }

  @BaseDialog.Button(position = 0, name = "Copy", mnemonic = 'O', defaultButton = true)
  public void buttonCopyToClipboard() {
    CopyPasteUtil.copyTextToClipboard(myThreads.toString());
  }

  @BaseDialog.Button(position = 1, name = "Close", mnemonic = 'C', defaultButton = false)
  public void buttonClose() {
    dispose();
  }

  @Override
  public DialogDimensionsSettings.DialogDimensions getDefaultDimensionSettings() {
    return new DialogDimensionsSettings.DialogDimensions(200, 200, 600, 600);
  }
}

package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import javax.swing.JButton;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorSettings;
import javax.swing.plaf.metal.MetalBorders;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.util.Macros;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.io.File;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.SwingUtilities;
import java.awt.Frame;
import jetbrains.mps.ide.ui.filechoosers.treefilechooser.TreeFileChooser;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.util.FileUtil;
import jetbrains.mps.smodel.ModelAccess;

public class SelectImageFileButton extends JButton {
  private SNode myNode;

  public SelectImageFileButton(SNode node) {
    this.myNode = node;
    this.setFont(EditorSettings.getInstance().getDefaultEditorFont());
    this.setBorder(new MetalBorders.ButtonBorder());
    final Language language = Language.getLanguageFor(SNodeOperations.getModel(this.myNode).getModelDescriptor());
    String filename = Macros.languageDescriptor().expandPath(SPropertyOperations.getString(node, "imageFile"), language.getDescriptorFile());
    final File baseFile = (filename == null ?
      null :
      new File(filename)
    );
    this.setAction(new AbstractAction(" ... ") {
      public void actionPerformed(ActionEvent e) {
        Component root = SwingUtilities.getRoot(SelectImageFileButton.this);
        if (root instanceof Frame) {
          Frame frame = (Frame) root;
          TreeFileChooser chooser = new TreeFileChooser();
          if (baseFile != null && baseFile.exists()) {
            chooser.setInitialFile(FileSystem.getInstance().getFileByPath(baseFile.getAbsolutePath()));
          }
          IFile result = chooser.showDialog(frame);
          if (result == null) {
            return;
          }
          String selectedPath = FileUtil.getCanonicalPath(result.toFile());
          final String pathToShow = Macros.languageDescriptor().shrinkPath(selectedPath, language.getDescriptorFile());
          ModelAccess.instance().runWriteActionInCommand(new Runnable() {
            public void run() {
              SPropertyOperations.set(SelectImageFileButton.this.myNode, "imageFile", pathToShow);
            }
          });
        }
      }
    });
  }
}

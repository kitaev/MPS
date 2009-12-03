package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.project.IModule;
import java.awt.Frame;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.ide.ui.filechoosers.treefilechooser.TreeFileChooser;
import jetbrains.mps.ide.ui.filechoosers.treefilechooser.IFileFilter;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.javaParser.JavaCompiler;

public class GetModuleContentsFromSource_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(GetModuleContentsFromSource_Action.class);

  private IModule module;
  private Frame frame;

  public GetModuleContentsFromSource_Action() {
    super("Get Module Contents from Source", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "GetModuleContentsFromSource", t);
      }
      this.disable(event.getPresentation());
    }
  }

  @Override
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.module = event.getData(MPSDataKeys.MODULE);
    if (this.module == null) {
      return false;
    }
    this.frame = event.getData(MPSDataKeys.FRAME);
    if (this.frame == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      TreeFileChooser treeFileChooser = new TreeFileChooser();
      treeFileChooser.setDirectoriesAreAlwaysVisible(true);
      treeFileChooser.setMode(TreeFileChooser.MODE_DIRECTORIES);
      treeFileChooser.setFileFilter(new IFileFilter() {
        public boolean accept(IFile file) {
          return file.isDirectory();
        }
      });
      IFile result = treeFileChooser.showDialog(GetModuleContentsFromSource_Action.this.frame);
      if (result != null) {
        JavaCompiler javaCompiler = new JavaCompiler(GetModuleContentsFromSource_Action.this.module, result.toFile(), true);
        javaCompiler.compile();
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "GetModuleContentsFromSource", t);
      }
    }
  }
}

package jetbrains.mps.lang.editor.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.custom.BaseCustomProjectPlugin;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.resolve.AutoResolver;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.nodeEditor.Highlighter;

public class EditorLangPlugin_CustomProjectPlugin extends BaseCustomProjectPlugin {
  private static Logger LOG = Logger.getLogger(EditorLangPlugin_CustomProjectPlugin.class);

  private AutoResolver myAutoResolver;

  public EditorLangPlugin_CustomProjectPlugin() {
  }

  public void doInit(MPSProject project) {
    EditorLangPlugin_CustomProjectPlugin.this.myAutoResolver = new AutoResolver();
    Highlighter highlighter = project.getComponent(Highlighter.class);
    if (highlighter != null) {
      highlighter.addChecker(EditorLangPlugin_CustomProjectPlugin.this.myAutoResolver);
    }
  }

  public void doDispose(MPSProject project) {
    Highlighter highlighter = project.getComponent(Highlighter.class);
    if (highlighter != null) {
      highlighter.removeChecker(EditorLangPlugin_CustomProjectPlugin.this.myAutoResolver);
    }
  }
}

package jetbrains.mps.lang.core.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.custom.BaseCustomProjectPlugin;
import jetbrains.mps.nodeEditor.Highlighter;
import jetbrains.mps.project.MPSProject;
import com.intellij.openapi.extensions.Extensions;
import jetbrains.mps.ide.INodeChecker;

public class LanguageChecksPlugin_CustomProjectPlugin extends BaseCustomProjectPlugin {
  private LanguageChecker myChecker;
  private Highlighter myHighlighter;

  public LanguageChecksPlugin_CustomProjectPlugin() {
  }

  public void doInit(MPSProject project) {
    LanguageChecksPlugin_CustomProjectPlugin.this.myHighlighter = project.getProject().getComponent(Highlighter.class);
    LanguageChecksPlugin_CustomProjectPlugin.this.myChecker = new LanguageChecker();
    if (LanguageChecksPlugin_CustomProjectPlugin.this.myHighlighter != null) {
      LanguageChecksPlugin_CustomProjectPlugin.this.myHighlighter.addChecker(LanguageChecksPlugin_CustomProjectPlugin.this.myChecker);
    }
    Extensions.getArea(null).getExtensionPoint(INodeChecker.CHECKERS).registerExtension(LanguageChecksPlugin_CustomProjectPlugin.this.myChecker);
  }

  public void doDispose(MPSProject project) {
    if (LanguageChecksPlugin_CustomProjectPlugin.this.myHighlighter != null) {
      LanguageChecksPlugin_CustomProjectPlugin.this.myHighlighter.removeChecker(LanguageChecksPlugin_CustomProjectPlugin.this.myChecker);
    }
    LanguageChecksPlugin_CustomProjectPlugin.this.myChecker.dispose();
    Extensions.getArea(null).getExtensionPoint(INodeChecker.CHECKERS).unregisterExtension(LanguageChecksPlugin_CustomProjectPlugin.this.myChecker);
  }
}

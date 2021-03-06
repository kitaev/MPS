package jetbrains.mps.ui.internal.testdata.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.custom.BaseCustomApplicationPlugin;
import jetbrains.mps.ui.modeling.plugin.EditorExtensionHelper;

public class EditorExtension_CustomApplicationPlugin extends BaseCustomApplicationPlugin {
  private EditorExtensionHelper helper;

  public EditorExtension_CustomApplicationPlugin() {
  }

  public void doInit() {
    EditorExtension_CustomApplicationPlugin.this.helper = new EditorExtensionHelper("jetbrains.mps.ui.internal.testdata") {
      @Override
      public String getEventHandlerTemplatesModel(String base) {
        return base + ".events";
      }

      @Override
      public String getWidgetTemplatesModel(String base) {
        return base + ".templates";
      }
    };
    EditorExtension_CustomApplicationPlugin.this.helper.init();
  }

  public void doDispose() {
    EditorExtension_CustomApplicationPlugin.this.helper.dispose();
    EditorExtension_CustomApplicationPlugin.this.helper = null;
  }
}

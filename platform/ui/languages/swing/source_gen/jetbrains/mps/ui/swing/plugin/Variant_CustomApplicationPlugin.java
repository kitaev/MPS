package jetbrains.mps.ui.swing.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.custom.BaseCustomApplicationPlugin;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.ui.plugin.Variants;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SNode;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class Variant_CustomApplicationPlugin extends BaseCustomApplicationPlugin {
  private static Logger LOG = Logger.getLogger(Variant_CustomApplicationPlugin.class);

  public Variant_CustomApplicationPlugin() {
  }

  public void doInit() {
    Variants.register(new _FunctionTypes._void_P1_E0<Variants>() {
      public void invoke(Variants vars) {
        vars.addVariant("Swing", ((Language) SNodeOperations.getModel(SLinkOperations.getTarget(new Variant_CustomApplicationPlugin.QuotationClass_ks96zg_a0a0a0a0b0a0a0a0a0().createNode(), "plugin", false)).getModelDescriptor().getModule()));
      }
    });
  }

  public static class QuotationClass_ks96zg_a0a0a0a0b0a0a0a0a0 {
    public QuotationClass_ks96zg_a0a0a0a0b0a0a0a0a0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ApplicationPluginType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("plugin", quotedNode1_2, SModelReference.fromString("r:6473b625-3a7a-4043-9760-94a8b507467f(jetbrains.mps.ui.swing.plugin)"), SNodeId.fromString("2441084687258581572")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}

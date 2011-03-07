package jetbrains.mps.platform.conf.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class BeanUtil {
  public BeanUtil() {
  }

  public static boolean isBean(final SNode _this) {
    final SNode attrAnn = SLinkOperations.getTarget(new BeanUtil.QuotationClass_bgndvd_a0a0a0a().createNode(), "annotation", false);
    return ListSequence.fromList(SLinkOperations.getTargets(_this, "field", true)).<SNode>translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode it) {
        return SLinkOperations.getTargets(it, "annotation", true);
      }
    }).<SNode>select(new ISelector<SNode, SNode>() {
      public SNode select(SNode ai) {
        return SLinkOperations.getTarget(ai, "annotation", false);
      }
    }).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode ann) {
        return attrAnn == ann;
      }
    });
  }

  public static Iterable<BeanProperty> properties(final SNode _this) {
    final SNode attrAnn = SLinkOperations.getTarget(new BeanUtil.QuotationClass_bgndvd_a0a0a0b().createNode(), "annotation", false);
    return ListSequence.fromList(SLinkOperations.getTargets(_this, "field", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode fd) {
        return ListSequence.fromList(SLinkOperations.getTargets(fd, "annotation", true)).<SNode>select(new ISelector<SNode, SNode>() {
          public SNode select(SNode ai) {
            return SLinkOperations.getTarget(ai, "annotation", false);
          }
        }).any(new IWhereFilter<SNode>() {
          public boolean accept(SNode ann) {
            return attrAnn == ann;
          }
        });
      }
    }).<BeanProperty>select(new ISelector<SNode, BeanProperty>() {
      public BeanProperty select(SNode fd) {
        return new BeanProperty(SPropertyOperations.getString(fd, "name"), null);
      }
    });
  }

  public static class QuotationClass_bgndvd_a0a0a0a {
    public QuotationClass_bgndvd_a0a0a0a() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AnnotationInstance", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("annotation", quotedNode1_2, SModelReference.fromString("f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#com.intellij.util.xmlb.annotations(com.intellij.util.xmlb.annotations@java_stub)"), SNodeId.fromString("~Attribute")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_bgndvd_a0a0a0b {
    public QuotationClass_bgndvd_a0a0a0b() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AnnotationInstance", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("annotation", quotedNode1_2, SModelReference.fromString("f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#com.intellij.util.xmlb.annotations(com.intellij.util.xmlb.annotations@java_stub)"), SNodeId.fromString("~Attribute")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}

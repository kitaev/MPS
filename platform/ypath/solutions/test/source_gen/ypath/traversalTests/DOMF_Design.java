package ypath.traversalTests;

/*Generated by MPS */

import jetbrains.mps.ypath.design.IFeatureDesign;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.ext.collections.internal.SequenceWithSupplier;

public class DOMF_Design {
  public static class Design_Feature_child implements IFeatureDesign<String> {

    public Iterable<String> getParameters(SNode nodeType) {
      return new SequenceWithSupplier<String>(new zValueSupplier2(null, null));
    }

    public SNode getTargetType(String param, SNode nodeType) {
      return new QuotationClass_().createNode();
    }

    public String parameterToString(String param) {
      return param;
    }

}

}

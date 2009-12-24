package jetbrains.mps.lang.quotation.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;

public class Antiquotation_AnnotationLink {
  public static final String ANTIQUOTATION = "antiquotation";

  public static void setAntiquotation(BaseConcept source, Antiquotation target) {
    source.setAttribute(Antiquotation_AnnotationLink.ANTIQUOTATION, target);
  }

  public static Antiquotation getAntiquotation(BaseConcept source) {
    return (Antiquotation) source.getAttribute(Antiquotation_AnnotationLink.ANTIQUOTATION);
  }
}

package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;

public class ReferenceMacro_AnnotationLink {
  public static final String REFERENCE_MACRO = "referenceMacro";

  public static void setReferenceMacro(BaseConcept source, String propertyName, ReferenceMacro target) {
    source.setLinkAttribute(ReferenceMacro_AnnotationLink.REFERENCE_MACRO, propertyName, target);
  }

  public static ReferenceMacro getReferenceMacro(BaseConcept source, String linkRole) {
    return (ReferenceMacro) source.getLinkAttribute(ReferenceMacro_AnnotationLink.REFERENCE_MACRO, linkRole);
  }
}

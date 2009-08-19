package jetbrains.mps.lang.structure.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.PropertySupport;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class AnnotationLinkCardinality_PropertySupport extends PropertySupport {
  public boolean canSetValue(String value) {
    if (value == null) {
      return true;
    }
    Iterator<AnnotationLinkCardinality> constants = ListSequence.fromList(AnnotationLinkCardinality.getConstants()).iterator();
    while (constants.hasNext()) {
      AnnotationLinkCardinality constant = constants.next();
      if (value.equals(constant.getName())) {
        return true;
      }
    }
    return false;
  }

  public String toInternalValue(String value) {
    if (value == null) {
      return null;
    }
    Iterator<AnnotationLinkCardinality> constants = ListSequence.fromList(AnnotationLinkCardinality.getConstants()).iterator();
    while (constants.hasNext()) {
      AnnotationLinkCardinality constant = constants.next();
      if (value.equals(constant.getName())) {
        return constant.getValueAsString();
      }
    }
    return null;
  }

  public String fromInternalValue(String value) {
    AnnotationLinkCardinality constant = AnnotationLinkCardinality.parseValue(value);
    if (constant != null) {
      return constant.getName();
    }
    return "";
  }
}

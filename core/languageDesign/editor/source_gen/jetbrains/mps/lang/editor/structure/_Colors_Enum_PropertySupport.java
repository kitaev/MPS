package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.PropertySupport;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class _Colors_Enum_PropertySupport extends PropertySupport {
  public boolean canSetValue(String value) {
    if (value == null) {
      return true;
    }
    Iterator<_Colors_Enum> constants = ListSequence.fromList(_Colors_Enum.getConstants()).iterator();
    while (constants.hasNext()) {
      _Colors_Enum constant = constants.next();
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
    Iterator<_Colors_Enum> constants = ListSequence.fromList(_Colors_Enum.getConstants()).iterator();
    while (constants.hasNext()) {
      _Colors_Enum constant = constants.next();
      if (value.equals(constant.getName())) {
        return constant.getValueAsString();
      }
    }
    return null;
  }

  public String fromInternalValue(String value) {
    _Colors_Enum constant = _Colors_Enum.parseValue(value);
    if (constant != null) {
      return constant.getName();
    }
    return "";
  }
}

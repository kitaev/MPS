package jetbrains.mps.bootstrap.helgins.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.PropertySupport;
import java.util.Iterator;

public class EquationDirection_Enum_PropertySupport extends PropertySupport {

  public boolean canSetValue(String value) {
    if(value == null) {
      return true;
    }
    Iterator<EquationDirection_Enum> constants = EquationDirection_Enum.getConstants().iterator();
    while(constants.hasNext()) {
      EquationDirection_Enum constant = constants.next();
      if(value.equals(constant.getName())) {
        return true;
      }
    }
    return false;
  }

  public String toInternalValue(String value) {
    if(value == null) {
      return null;
    }
    Iterator<EquationDirection_Enum> constants = EquationDirection_Enum.getConstants().iterator();
    while(constants.hasNext()) {
      EquationDirection_Enum constant = constants.next();
      if(value.equals(constant.getName())) {
        return constant.getValueAsString();
      }
    }
    return null;
  }

  public String fromInternalValue(String value) {
    EquationDirection_Enum constant = EquationDirection_Enum.parseValue(value);
    if(constant != null) {
      return constant.getName();
    }
    return null;
  }

}

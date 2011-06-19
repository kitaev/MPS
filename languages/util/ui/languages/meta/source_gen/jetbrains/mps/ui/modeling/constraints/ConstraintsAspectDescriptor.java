package jetbrains.mps.ui.modeling.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;

public class ConstraintsAspectDescriptor implements jetbrains.mps.smodel.runtime.ConstraintsAspectDescriptor {
  private static String[] stringSwitchCases_2qnle6_a0a0a = new String[]{"jetbrains.mps.ui.modeling.structure.AspectParameterDecl", "jetbrains.mps.ui.modeling.structure.AspectParameterRef", "jetbrains.mps.ui.modeling.structure.AuxObjectAccessOp", "jetbrains.mps.ui.modeling.structure.Container", "jetbrains.mps.ui.modeling.structure.ContainerTemplate", "jetbrains.mps.ui.modeling.structure.Context", "jetbrains.mps.ui.modeling.structure.ContextUIObjectParam", "jetbrains.mps.ui.modeling.structure.EditableUIPropertyAccessCode", "jetbrains.mps.ui.modeling.structure.EventHandlerTemplate", "jetbrains.mps.ui.modeling.structure.EventPropertyGetter", "jetbrains.mps.ui.modeling.structure.LayoutConstraintType", "jetbrains.mps.ui.modeling.structure.UIObject", "jetbrains.mps.ui.modeling.structure.UIPropertyAccessCode"};

  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0a, fqName)) {
      case 12:
        return new UIPropertyAccessCode_Constraints();
      case 8:
        return new EventHandlerTemplate_Constraints();
      case 9:
        return new EventPropertyGetter_Constraints();
      case 7:
        return new EditableUIPropertyAccessCode_Constraints();
      case 4:
        return new ContainerTemplate_Constraints();
      case 6:
        return new ContextUIObjectParam_Constraints();
      case 5:
        return new Context_Constraints();
      case 2:
        return new AuxObjectAccessOp_Constraints();
      case 3:
        return new Container_Constraints();
      case 11:
        return new UIObject_Constraints();
      case 1:
        return new AspectParameterRef_Constraints();
      case 0:
        return new AspectParameterDecl_Constraints();
      case 10:
        return new LayoutConstraintType_Constraints();
      default:
        // todo: illegal in some cases? 
        return new BaseConstraintsDescriptor(fqName);
    }
  }
}

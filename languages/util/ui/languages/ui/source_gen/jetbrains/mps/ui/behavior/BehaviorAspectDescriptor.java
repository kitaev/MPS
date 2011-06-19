package jetbrains.mps.ui.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BehaviorDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.interpreted.BehaviorAspectInterpreted;

public class BehaviorAspectDescriptor implements jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor {
  private static String[] stringSwitchCases_846f5o_a0a0a = new String[]{"jetbrains.mps.ui.structure.AccessUIPropertyOperation", "jetbrains.mps.ui.structure.AppendUIObjectStatement", "jetbrains.mps.ui.structure.BeanPropertyView", "jetbrains.mps.ui.structure.CallUIActionOperation", "jetbrains.mps.ui.structure.ChildAspect", "jetbrains.mps.ui.structure.ClearCompartmentStatement", "jetbrains.mps.ui.structure.CompartmentProviderStatement", "jetbrains.mps.ui.structure.CompartmentReferenceExpression", "jetbrains.mps.ui.structure.ContainerCompartment", "jetbrains.mps.ui.structure.ContainerType", "jetbrains.mps.ui.structure.ControllerBinding", "jetbrains.mps.ui.structure.CreateUIObjectStatement", "jetbrains.mps.ui.structure.EnclosingContextCompartmentExpression", "jetbrains.mps.ui.structure.EventHandingBlock", "jetbrains.mps.ui.structure.EventPropertyAccessOp", "jetbrains.mps.ui.structure.EventType", "jetbrains.mps.ui.structure.ExpressionView", "jetbrains.mps.ui.structure.ForceLayoutStatement", "jetbrains.mps.ui.structure.FunctionParameterDeclaration", "jetbrains.mps.ui.structure.InlineController", "jetbrains.mps.ui.structure.InsertUIObjectStatement", "jetbrains.mps.ui.structure.IterateContentsStatement", "jetbrains.mps.ui.structure.IterateContentsVariable", "jetbrains.mps.ui.structure.IterateContentsVariableReference", "jetbrains.mps.ui.structure.RemoveUIObjectStatement", "jetbrains.mps.ui.structure.UIObjectProviderStatement", "jetbrains.mps.ui.structure.UIObjectReference", "jetbrains.mps.ui.structure.UIObjectType", "jetbrains.mps.ui.structure.ValidateBlock", "jetbrains.mps.ui.structure.ValidatingView", "jetbrains.mps.ui.structure.Validator", "jetbrains.mps.ui.structure.ViewBinding"};

  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_846f5o_a0a0a, fqName)) {
      case 30:
        return new Validator_BehaviorDescriptor();
      case 2:
        return new BeanPropertyView_BehaviorDescriptor();
      case 28:
        return new ValidateBlock_BehaviorDescriptor();
      case 29:
        return new ValidatingView_BehaviorDescriptor();
      case 31:
        return new ViewBinding_BehaviorDescriptor();
      case 16:
        return new ExpressionView_BehaviorDescriptor();
      case 10:
        return new ControllerBinding_BehaviorDescriptor();
      case 19:
        return new InlineController_BehaviorDescriptor();
      case 13:
        return new EventHandingBlock_BehaviorDescriptor();
      case 18:
        return new FunctionParameterDeclaration_BehaviorDescriptor();
      case 15:
        return new EventType_BehaviorDescriptor();
      case 14:
        return new EventPropertyAccessOp_BehaviorDescriptor();
      case 8:
        return new ContainerCompartment_BehaviorDescriptor();
      case 27:
        return new UIObjectType_BehaviorDescriptor();
      case 4:
        return new ChildAspect_BehaviorDescriptor();
      case 9:
        return new ContainerType_BehaviorDescriptor();
      case 12:
        return new EnclosingContextCompartmentExpression_BehaviorDescriptor();
      case 7:
        return new CompartmentReferenceExpression_BehaviorDescriptor();
      case 6:
        return new CompartmentProviderStatement_BehaviorDescriptor();
      case 21:
        return new IterateContentsStatement_BehaviorDescriptor();
      case 22:
        return new IterateContentsVariable_BehaviorDescriptor();
      case 24:
        return new RemoveUIObjectStatement_BehaviorDescriptor();
      case 23:
        return new IterateContentsVariableReference_BehaviorDescriptor();
      case 5:
        return new ClearCompartmentStatement_BehaviorDescriptor();
      case 1:
        return new AppendUIObjectStatement_BehaviorDescriptor();
      case 20:
        return new InsertUIObjectStatement_BehaviorDescriptor();
      case 17:
        return new ForceLayoutStatement_BehaviorDescriptor();
      case 25:
        return new UIObjectProviderStatement_BehaviorDescriptor();
      case 11:
        return new CreateUIObjectStatement_BehaviorDescriptor();
      case 3:
        return new CallUIActionOperation_BehaviorDescriptor();
      case 0:
        return new AccessUIPropertyOperation_BehaviorDescriptor();
      case 26:
        return new UIObjectReference_BehaviorDescriptor();
      default:
        return BehaviorAspectInterpreted.getInstance().getDescriptor(fqName);
    }
  }
}

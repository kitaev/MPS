package jetbrains.mps.bash.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;

public class ConstraintsAspectDescriptor implements jetbrains.mps.smodel.runtime.ConstraintsAspectDescriptor {
  private static String[] stringSwitchCases_2qnle6_a0a0a = new String[]{"jetbrains.mps.bash.structure.AbstractFollowingCommandList", "jetbrains.mps.bash.structure.ArgumentList", "jetbrains.mps.bash.structure.ArgumentReference", "jetbrains.mps.bash.structure.BasedIntegerLiteral", "jetbrains.mps.bash.structure.BasicParameterExpansion", "jetbrains.mps.bash.structure.Command", "jetbrains.mps.bash.structure.ExternalCommandCall", "jetbrains.mps.bash.structure.ExternalCommandDeclaration", "jetbrains.mps.bash.structure.ExternalOptionDeclaration", "jetbrains.mps.bash.structure.HexIntegerLiteral", "jetbrains.mps.bash.structure.InputLine", "jetbrains.mps.bash.structure.OptionReference", "jetbrains.mps.bash.structure.OptionSetReference", "jetbrains.mps.bash.structure.OptionWithParamReference", "jetbrains.mps.bash.structure.SimpleCommand", "jetbrains.mps.bash.structure.SimpleWord", "jetbrains.mps.bash.structure.VariableNameDeclaration", "jetbrains.mps.bash.structure.VariableReference"};

  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0a, fqName)) {
      case 3:
        return new BasedIntegerLiteral_Constraints();
      case 11:
        return new OptionReference_Constraints();
      case 6:
        return new ExternalCommandCall_Constraints();
      case 13:
        return new OptionWithParamReference_Constraints();
      case 2:
        return new ArgumentReference_Constraints();
      case 12:
        return new OptionSetReference_Constraints();
      case 1:
        return new ArgumentList_Constraints();
      case 8:
        return new ExternalOptionDeclaration_Constraints();
      case 7:
        return new ExternalCommandDeclaration_Constraints();
      case 15:
        return new SimpleWord_Constraints();
      case 9:
        return new HexIntegerLiteral_Constraints();
      case 10:
        return new InputLine_Constraints();
      case 0:
        return new AbstractFollowingCommandList_Constraints();
      case 5:
        return new Command_Constraints();
      case 14:
        return new SimpleCommand_Constraints();
      case 16:
        return new VariableNameDeclaration_Constraints();
      case 17:
        return new VariableReference_Constraints();
      case 4:
        return new BasicParameterExpansion_Constraints();
      default:
        // todo: illegal in some cases? 
        return new BaseConstraintsDescriptor(fqName);
    }
  }
}

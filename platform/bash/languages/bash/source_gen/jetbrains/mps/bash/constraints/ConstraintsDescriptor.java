package jetbrains.mps.bash.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;

public class ConstraintsDescriptor implements IModelConstraints {
  private List<IModelConstraints> myConstraints = ListSequence.fromList(new ArrayList<IModelConstraints>());

  public ConstraintsDescriptor() {
    ListSequence.fromList(this.myConstraints).addElement(new SimpleWord_word_PropertyConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new HexIntegerLiteral_value_PropertyConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new BasedIntegerLiteral_base_PropertyConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new SimpleCommand_name_PropertyConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new VariableNameDeclaration_name_PropertyConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new ArgumentReference_arg_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new OptionWithParamReference_optionWithParam_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new OptionReference_option_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new VariableReference_variable_ReferentConstraint());
    ListSequence.fromList(this.myConstraints).addElement(new BasicParameterExpansion_variable_ReferentConstraint());
  }

  public void unRegisterSelf(ModelConstraintsManager p0) {
    for (IModelConstraints c : this.myConstraints) {
      c.unRegisterSelf(p0);
    }
  }

  public void registerSelf(ModelConstraintsManager p0) {
    for (IModelConstraints c : this.myConstraints) {
      c.registerSelf(p0);
    }
  }
}

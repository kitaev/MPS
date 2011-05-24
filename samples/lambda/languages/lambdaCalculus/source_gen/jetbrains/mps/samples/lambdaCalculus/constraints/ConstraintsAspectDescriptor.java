package jetbrains.mps.samples.lambdaCalculus.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.ConstraintsDescriptor;
import jetbrains.mps.smodel.structure.DataHolderConstraintsDescriptor;
import jetbrains.mps.smodel.structure.EmptyConstraintsDataHolder;

public class ConstraintsAspectDescriptor extends DescriptorProvider<ConstraintsDescriptor> {
  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch ((fqName).hashCode()) {
      case 1687922204:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.lambdaCalculus.structure.LambdaExpression"));
      case -106727006:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.lambdaCalculus.structure.LambdaAbstraction"));
      case 598926277:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.lambdaCalculus.structure.AbstractionVariable"));
      case -1527043470:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.lambdaCalculus.structure.StringConstant"));
      case 1778472404:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.lambdaCalculus.structure.NumericConstant"));
      case -2130288052:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.lambdaCalculus.structure.LambdaApplication"));
      case -1182719609:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.lambdaCalculus.structure.Program"));
      case -1496603787:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.lambdaCalculus.structure.AbstractionVarRef"));
      case 1404709481:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.lambdaCalculus.structure.BinaryOperation"));
      case 1507395747:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.lambdaCalculus.structure.AddOperation"));
      case 1987793638:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.lambdaCalculus.structure.MultiplyOperation"));
      case -979538954:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.lambdaCalculus.structure.SubtractOperation"));
      case 2128068849:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.lambdaCalculus.structure.DivideOperation"));
      case -1069771330:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.lambdaCalculus.structure.LambdaType"));
      case 1087147072:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.lambdaCalculus.structure.NumberType"));
      case -93754104:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.lambdaCalculus.structure.StringType"));
      case -228576753:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.lambdaCalculus.structure.FunctionType"));
      case -1091927727:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.lambdaCalculus.structure.ParenthesisExpression"));
      case 1271713253:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.lambdaCalculus.structure.MultipleExpression"));
      case -1759814248:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.lambdaCalculus.structure.BinaryNumericOperation"));
      case -881056808:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.lambdaCalculus.structure.BinaryStringOperation"));
      case -1156557809:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.lambdaCalculus.structure.ConcatenateOperation"));
      case 195157974:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.lambdaCalculus.structure.LetExpression"));
      case -1272924907:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.lambdaCalculus.structure.LetRef"));
      case -952543430:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.lambdaCalculus.structure.LetVariable"));
      case 783209050:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.lambdaCalculus.structure.VariableOwner"));
      case -2082475150:
        return new DataHolderConstraintsDescriptor(new VariableReference_Constraints());
      case 1741893593:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.samples.lambdaCalculus.structure.Variable"));
      default:
        return null;
    }
  }
}

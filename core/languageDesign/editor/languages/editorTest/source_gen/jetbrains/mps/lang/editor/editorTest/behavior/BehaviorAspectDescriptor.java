package jetbrains.mps.lang.editor.editorTest.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import java.util.Arrays;

public class BehaviorAspectDescriptor extends DescriptorProvider<BehaviorDescriptor> {
  private static String[] stringSwitchCases_846f5o_a0a0a = new String[]{"jetbrains.mps.lang.editor.editorTest.structure.AttractsFocusBlock", "jetbrains.mps.lang.editor.editorTest.structure.BinaryExpression", "jetbrains.mps.lang.editor.editorTest.structure.BracesBlock", "jetbrains.mps.lang.editor.editorTest.structure.BracesStubBlock", "jetbrains.mps.lang.editor.editorTest.structure.IBaseTestBlock", "jetbrains.mps.lang.editor.editorTest.structure.InspectorBlock", "jetbrains.mps.lang.editor.editorTest.structure.IntegerLiteral", "jetbrains.mps.lang.editor.editorTest.structure.NonEmptyProperty", "jetbrains.mps.lang.editor.editorTest.structure.NotEditableVaraileReference", "jetbrains.mps.lang.editor.editorTest.structure.PlusExpression", "jetbrains.mps.lang.editor.editorTest.structure.ReferenceAnnotataion", "jetbrains.mps.lang.editor.editorTest.structure.SideTranformWrapper", "jetbrains.mps.lang.editor.editorTest.structure.StubBlock", "jetbrains.mps.lang.editor.editorTest.structure.TestBlockList", "jetbrains.mps.lang.editor.editorTest.structure.VariableDeclarationBlock", "jetbrains.mps.lang.editor.editorTest.structure.VariableDeclarationReference", "jetbrains.mps.lang.editor.editorTest.structure.VerticalLayoutBlockList"};

  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_846f5o_a0a0a, fqName)) {
      case 13:
        return new TestBlockList_BehaviorDescriptor();
      case 2:
        return new BracesBlock_BehaviorDescriptor();
      case 4:
        // interface or abstract concept behavior jetbrains.mps.lang.editor.editorTest.structure.IBaseTestBlock 
        return null;
      case 12:
        return new StubBlock_BehaviorDescriptor();
      case 16:
        return new VerticalLayoutBlockList_BehaviorDescriptor();
      case 3:
        return new BracesStubBlock_BehaviorDescriptor();
      case 5:
        return new InspectorBlock_BehaviorDescriptor();
      case 10:
        return new ReferenceAnnotataion_BehaviorDescriptor();
      case 11:
        return new SideTranformWrapper_BehaviorDescriptor();
      case 6:
        return new IntegerLiteral_BehaviorDescriptor();
      case 1:
        // interface or abstract concept behavior jetbrains.mps.lang.editor.editorTest.structure.BinaryExpression 
        return null;
      case 9:
        return new PlusExpression_BehaviorDescriptor();
      case 0:
        return new AttractsFocusBlock_BehaviorDescriptor();
      case 14:
        return new VariableDeclarationBlock_BehaviorDescriptor();
      case 15:
        return new VariableDeclarationReference_BehaviorDescriptor();
      case 7:
        return new NonEmptyProperty_BehaviorDescriptor();
      case 8:
        return new NotEditableVaraileReference_BehaviorDescriptor();
      default:
        return null;
    }
  }
}

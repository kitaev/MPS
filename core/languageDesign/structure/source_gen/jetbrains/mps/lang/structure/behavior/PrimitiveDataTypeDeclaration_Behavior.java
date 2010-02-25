package jetbrains.mps.lang.structure.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.Primitives;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class PrimitiveDataTypeDeclaration_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_toBaseLanguageType_1213877229718(SNode thisNode) {
    if (Primitives.INTEGER_TYPE.equals(SPropertyOperations.getString(thisNode, "name"))) {
      return new PrimitiveDataTypeDeclaration_Behavior.QuotationClass_0334_0().createNode();
    }
    if (Primitives.BOOLEAN_TYPE.equals(SPropertyOperations.getString(thisNode, "name"))) {
      return new PrimitiveDataTypeDeclaration_Behavior.QuotationClass_0334_1().createNode();
    }
    return new PrimitiveDataTypeDeclaration_Behavior.QuotationClass_0334_2().createNode();
  }

  public static boolean call_isString_1220268752134(SNode thisNode) {
    return Primitives.STRING_TYPE.equals(SPropertyOperations.getString(thisNode, "name"));
  }

  public static boolean call_isInteger_1220268780075(SNode thisNode) {
    return Primitives.INTEGER_TYPE.equals(SPropertyOperations.getString(thisNode, "name"));
  }

  public static boolean call_isBoolean_1220268791641(SNode thisNode) {
    return Primitives.BOOLEAN_TYPE.equals(SPropertyOperations.getString(thisNode, "name"));
  }

  public static class QuotationClass_0334_0 {
    public QuotationClass_0334_0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_0334_0 = null;
      {
        quotedNode_0334_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_0334_0 = quotedNode_0334_0;
        result = quotedNode1_0334_0;
      }
      return result;
    }
  }

  public static class QuotationClass_0334_1 {
    public QuotationClass_0334_1() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_0334_1 = null;
      {
        quotedNode_0334_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.BooleanType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_0334_1 = quotedNode_0334_1;
        result = quotedNode1_0334_1;
      }
      return result;
    }
  }

  public static class QuotationClass_0334_2 {
    public QuotationClass_0334_2() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_0334_2 = null;
      {
        quotedNode_0334_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StringType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_0334_2 = quotedNode_0334_2;
        result = quotedNode1_0334_2;
      }
      return result;
    }
  }
}

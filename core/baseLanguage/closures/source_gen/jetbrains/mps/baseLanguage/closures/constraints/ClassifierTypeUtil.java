package jetbrains.mps.baseLanguage.closures.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.logging.Logger;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.closures.generator.baseLanguage.template.helper.FunctionTypeUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class ClassifierTypeUtil {
  public static SNode getTypeCoercedToClassifierType(SNode type) {
    // cast is such to avoid exception if MeetType 
    SNode purified = (SNode) removeCopiedProviders(type);
    if (SNodeOperations.isInstanceOf(purified, "jetbrains.mps.baseLanguage.structure.TypeVariableReference") || SNodeOperations.isInstanceOf(purified, "jetbrains.mps.baseLanguage.structure.WildCardType")) {
      return purified;
    }
    if (SNodeOperations.isInstanceOf(purified, "jetbrains.mps.baseLanguage.structure.UpperBoundType")) {
      SNode res = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.UpperBoundType", null);
      SLinkOperations.setTarget(res, "bound", SNodeOperations.copyNode(getTypeCoercedToClassifierType(SLinkOperations.getTarget(SNodeOperations.cast(purified, "jetbrains.mps.baseLanguage.structure.UpperBoundType"), "bound", true))), true);
    }
    if (SNodeOperations.isInstanceOf(purified, "jetbrains.mps.baseLanguage.structure.ArrayType")) {
      SNode at = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ArrayType", null);
      SLinkOperations.setTarget(at, "componentType", coerceToClassifierTypeOrPrimitive(SNodeOperations.copyNode(SLinkOperations.getTarget(SNodeOperations.cast(purified, "jetbrains.mps.baseLanguage.structure.ArrayType"), "componentType", true))), true);
      return at;
    }
    if (SNodeOperations.isInstanceOf(purified, "jetbrains.mps.lang.typesystem.structure.MeetType")) {
      SNode res = SConceptOperations.createNewNode("jetbrains.mps.lang.typesystem.structure.MeetType", null);
      for (SNode arg : SLinkOperations.getTargets(SNodeOperations.cast(purified, "jetbrains.mps.lang.typesystem.structure.MeetType"), "argument", true)) {
        if (SNodeOperations.isInstanceOf(arg, "jetbrains.mps.baseLanguage.structure.Type")) {
          SLinkOperations.addChild(res, "argument", getTypeCoercedToClassifierType(SNodeOperations.cast(arg, "jetbrains.mps.baseLanguage.structure.Type")));
        } else {
          Logger.getLogger(ClassifierTypeUtil.class).warning("Argument of an instance of MEET type is not a subconcept of Type");
        }
      }
      return res;
    }
    return coerceToClassifierType(purified);
  }

  private static SNode removeCopiedProviders(SNode type) {
    SNode result = SNodeOperations.copyNode(type);
    if (SNodeOperations.isInstanceOf(result, "jetbrains.mps.lang.typesystem.structure.CopiedTypeProvider")) {
      return SNodeOperations.copyNode(SLinkOperations.getTarget(SNodeOperations.cast(result, "jetbrains.mps.lang.typesystem.structure.CopiedTypeProvider"), "copiedTypeSource", false));
    } else {
      for (SNode descendant : SNodeOperations.getDescendants(result, "jetbrains.mps.lang.typesystem.structure.CopiedTypeProvider", false, new String[]{})) {
        SNodeOperations.replaceWithAnother(descendant, SNodeOperations.copyNode(SLinkOperations.getTarget(descendant, "copiedTypeSource", false)));
      }
      return result;
    }
  }

  private static SNode coerceToClassifierType(SNode type) {
    SNode cType = ClassifierTypeUtil.coerceToClassifierTypeIgnoreParameters(type);
    if ((cType != null)) {
      List<SNode> params = SLinkOperations.getTargets(cType, "parameter", true);
      if (params != null && ListSequence.fromList(params).count() > 0) {
        SNode res = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassifierType", null);
        SLinkOperations.setTarget(res, "classifier", SLinkOperations.getTarget(cType, "classifier", false), false);
        for (SNode p : params) {
          SLinkOperations.addChild(res, "parameter", SNodeOperations.copyNode(getTypeCoercedToClassifierType(p)));
        }
        return res;
      }
      return cType;
    }
    return type;
  }

  private static SNode coerceToClassifierTypeOrPrimitive(SNode type) {
    if (SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.structure.PrimitiveType")) {
      return type;
    }
    SNode cType = ClassifierTypeUtil.coerceToClassifierTypeIgnoreParameters(type);
    if ((cType != null)) {
      List<SNode> params = SLinkOperations.getTargets(cType, "parameter", true);
      if (params != null && ListSequence.fromList(params).count() > 0) {
        SNode res = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassifierType", null);
        SLinkOperations.setTarget(res, "classifier", SLinkOperations.getTarget(cType, "classifier", false), false);
        for (SNode p : params) {
          SLinkOperations.addChild(res, "parameter", SNodeOperations.copyNode(coerceToClassifierTypeOrPrimitive(p)));
        }
        return res;
      }
      return cType;
    }
    return type;
  }

  public static SNode getDeclarationClassifierType(SNode ft) {
    String rtSig = "_FunctionTypes." + FunctionTypeUtil.getRuntimeSignature(ft);
    for (SNode ice : SModelOperations.getNodes(SNodeOperations.getModel(SLinkOperations.getTarget(new _Quotations.QuotationClass_1().createNode(), "classifier", false)), "jetbrains.mps.baseLanguage.structure.Interface")) {
      if (rtSig.equals(SPropertyOperations.getString(SNodeOperations.cast(ice, "jetbrains.mps.baseLanguage.structure.Interface"), "name"))) {
        SNode ct = new _Quotations.QuotationClass_0().createNode(ice);
        if ((SLinkOperations.getTarget(ft, "resultType", true) != null) && !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(ft, "resultType", true), "jetbrains.mps.baseLanguage.structure.VoidType"))) {
          SLinkOperations.addChild(ct, "parameter", ClassifierTypeUtil.copyTypeRecursively(ClassifierTypeUtil.getTypeCoercedToClassifierType(SLinkOperations.getTarget(ft, "resultType", true)), true));
        }
        for (SNode pt : SLinkOperations.getTargets(ft, "parameterType", true)) {
          SLinkOperations.addChild(ct, "parameter", ClassifierTypeUtil.copyTypeRecursively(ClassifierTypeUtil.getTypeCoercedToClassifierType(pt), false));
        }
        for (SNode tt : SLinkOperations.getTargets(ft, "throwsType", true)) {
          SLinkOperations.addChild(ct, "parameter", ClassifierTypeUtil.copyTypeRecursively(tt, true));
        }
        return ct;
      }
    }
    return null;
  }

  public static SNode getClassifierType(SNode ft) {
    String rtSig = "_FunctionTypes." + FunctionTypeUtil.getRuntimeSignature(ft);
    for (SNode ice : SModelOperations.getNodes(SNodeOperations.getModel(SLinkOperations.getTarget(new _Quotations.QuotationClass_9().createNode(), "classifier", false)), "jetbrains.mps.baseLanguage.structure.Interface")) {
      if (rtSig.equals(SPropertyOperations.getString(SNodeOperations.cast(ice, "jetbrains.mps.baseLanguage.structure.Interface"), "name"))) {
        SNode ct = new _Quotations.QuotationClass_8().createNode(ice);
        if ((SLinkOperations.getTarget(ft, "resultType", true) != null) && !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(ft, "resultType", true), "jetbrains.mps.baseLanguage.structure.VoidType"))) {
          SLinkOperations.addChild(ct, "parameter", ClassifierTypeUtil.copyTypeRecursively(ClassifierTypeUtil.getTypeCoercedToClassifierType(SLinkOperations.getTarget(ft, "resultType", true))));
        }
        for (SNode pt : SLinkOperations.getTargets(ft, "parameterType", true)) {
          SLinkOperations.addChild(ct, "parameter", ClassifierTypeUtil.copyTypeRecursively(ClassifierTypeUtil.getTypeCoercedToClassifierType(pt)));
        }
        for (SNode tt : SLinkOperations.getTargets(ft, "throwsType", true)) {
          SLinkOperations.addChild(ct, "parameter", ClassifierTypeUtil.copyTypeRecursively(tt));
        }
        return ct;
      }
    }
    return null;
  }

  public static SNode getClassifierType(SNode ft, List<SNode> parameterType) {
    String rtSig = "_FunctionTypes." + FunctionTypeUtil.getRuntimeSignature(ft);
    for (SNode ice : SModelOperations.getNodes(SNodeOperations.getModel(SLinkOperations.getTarget(new _Quotations.QuotationClass_11().createNode(), "classifier", false)), "jetbrains.mps.baseLanguage.structure.Interface")) {
      if (rtSig.equals(SPropertyOperations.getString(SNodeOperations.cast(ice, "jetbrains.mps.baseLanguage.structure.Interface"), "name"))) {
        SNode ct = new _Quotations.QuotationClass_10().createNode(ice);
        if ((SLinkOperations.getTarget(ft, "resultType", true) != null) && !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(ft, "resultType", true), "jetbrains.mps.baseLanguage.structure.VoidType"))) {
          SLinkOperations.addChild(ct, "parameter", copyTypeRecursively(getTypeCoercedToClassifierType(SLinkOperations.getTarget(ft, "resultType", true))));
        }
        for (SNode pt : parameterType) {
          SLinkOperations.addChild(ct, "parameter", copyTypeRecursively(getTypeCoercedToClassifierType(pt)));
        }
        for (SNode tt : SLinkOperations.getTargets(ft, "throwsType", true)) {
          SLinkOperations.addChild(ct, "parameter", copyTypeRecursively(tt));
        }
        return ct;
      }
    }
    return null;
  }

  public static boolean isFunctionTypeClassifier(SNode classifier) {
    for (SNode ice : SModelOperations.getNodes(SNodeOperations.getModel(SLinkOperations.getTarget(new _Quotations.QuotationClass_6().createNode(), "classifier", false)), "jetbrains.mps.baseLanguage.structure.Interface")) {
      if (ice == classifier) {
        return true;
      }
    }
    return false;
  }

  public static boolean isFunctionTypeClassifierReturningValue(SNode classifier) {
    for (SNode ice : SModelOperations.getNodes(SNodeOperations.getModel(SLinkOperations.getTarget(new _Quotations.QuotationClass_7().createNode(), "classifier", false)), "jetbrains.mps.baseLanguage.structure.Interface")) {
      if (ice == classifier) {
        String cname = SPropertyOperations.getString(classifier, "name");
        int ldi = cname.lastIndexOf(".");
        cname = (ldi >= 0 ?
          cname.substring(ldi + 1) :
          cname
        );
        return !(cname.startsWith("_void"));
      }
    }
    return false;
  }

  public static SNode resolveTypeUsingSupertypes(SNode type, SNode concrete) {
    List<SNode> visitedClassifiers = ListSequence.fromList(new ArrayList<SNode>());
    List<SNode> concretes = ListSequence.fromList(new LinkedList<SNode>());
    ListSequence.fromList(concretes).addElement(concrete);
    SNode resType = type;
    while (!(ListSequence.fromList(concretes).isEmpty())) {
      SNode ct = SNodeOperations.as(ListSequence.fromList(concretes).removeElementAt(0), "jetbrains.mps.baseLanguage.structure.ClassifierType");
      if (ListSequence.fromList(visitedClassifiers).contains(SLinkOperations.getTarget(ct, "classifier", false)) || SLinkOperations.getCount(ct, "parameter") == 0) {
        continue;
      }
      ListSequence.fromList(visitedClassifiers).addElement(SLinkOperations.getTarget(ct, "classifier", false));
      for (SNode sup : TypeChecker.getInstance().getSubtypingManager().collectImmediateSupertypes(ct)) {
        {
          IMatchingPattern pattern_0 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType");
          SNode coercedNode_0 = TypeChecker.getInstance().getRuntimeSupport().coerce_(sup, pattern_0);
          if (coercedNode_0 != null) {
            ListSequence.fromList(concretes).addElement(coercedNode_0);
          } else {
          }
        }
      }
      resType = resolveType(resType, ct);
      if (ListSequence.fromList(SNodeOperations.getDescendants(resType, "jetbrains.mps.baseLanguage.structure.TypeVariableReference", false, new String[]{})).isEmpty()) {
        break;
      }
    }
    return resType;
  }

  public static SNode resolveType(SNode type, SNode concrete) {
    List<SNode> ptypes = SLinkOperations.getTargets(concrete, "parameter", true);
    List<SNode> vars = SLinkOperations.getTargets(SLinkOperations.getTarget(concrete, "classifier", false), "typeVariableDeclaration", true);
    return resolveType(SNodeOperations.copyNode(type), ptypes, vars);
  }

  public static SNode resolveType(SNode type, List<SNode> actTypes, List<SNode> vars) {
    if (SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.structure.TypeVariableReference") && ListSequence.fromList(actTypes).count() > 0) {
      int idx = 0;
      for (SNode tvd : vars) {
        if (tvd == SLinkOperations.getTarget(SNodeOperations.cast(type, "jetbrains.mps.baseLanguage.structure.TypeVariableReference"), "typeVariableDeclaration", false) && idx < ListSequence.fromList(actTypes).count()) {
          return SNodeOperations.copyNode(getTypeCoercedToClassifierType(ListSequence.fromList(actTypes).getElement(idx)));
        }
        idx++;
      }
    } else
    if (SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.structure.ClassifierType")) {
      for (SNode pt : SLinkOperations.getTargets(SNodeOperations.cast(type, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "parameter", true)) {
        SNode rt = resolveType(pt, actTypes, vars);
        if (pt != rt) {
          SNodeOperations.replaceWithAnother(pt, rt);
        }
      }
    }
    return type;
  }

  public static SNode copyTypeRecursively(SNode type, boolean covariant) {
    if (SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.structure.ClassifierType")) {
      SNode copy = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassifierType", null);
      SLinkOperations.setTarget(copy, "classifier", SLinkOperations.getTarget(SNodeOperations.cast(type, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false), false);
      boolean covariantParam = isFunctionTypeClassifierReturningValue(SLinkOperations.getTarget(SNodeOperations.cast(type, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false));
      for (SNode pt : SLinkOperations.getTargets(SNodeOperations.cast(type, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "parameter", true)) {
        SLinkOperations.addChild(copy, "parameter", (isFunctionTypeClassifier(SLinkOperations.getTarget(SNodeOperations.cast(type, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false)) ?
          copyTypeRecursively(pt, covariantParam) :
          copyTypeRecursively(pt)
        ));
        covariantParam = false;
      }
      return (covariant || isFunctionTypeClassifier(SLinkOperations.getTarget(SNodeOperations.cast(type, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false)) ?
        new _Quotations.QuotationClass_2().createNode(copy) :
        new _Quotations.QuotationClass_3().createNode(copy)
      );
    } else {
      return (covariant ?
        new _Quotations.QuotationClass_4().createNode(SNodeOperations.copyNode(type)) :
        new _Quotations.QuotationClass_5().createNode(SNodeOperations.copyNode(type))
      );
    }
  }

  public static SNode copyTypeRecursively(SNode type) {
    type = (SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.structure.UpperBoundType") ?
      SLinkOperations.getTarget(SNodeOperations.cast(type, "jetbrains.mps.baseLanguage.structure.UpperBoundType"), "bound", true) :
      type
    );
    type = (SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.structure.LowerBoundType") ?
      SLinkOperations.getTarget(SNodeOperations.cast(type, "jetbrains.mps.baseLanguage.structure.LowerBoundType"), "bound", true) :
      type
    );
    if (SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.structure.ClassifierType")) {
      SNode copy = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassifierType", null);
      SLinkOperations.setTarget(copy, "classifier", SLinkOperations.getTarget(SNodeOperations.cast(type, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false), false);
      for (SNode pt : SLinkOperations.getTargets(SNodeOperations.cast(type, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "parameter", true)) {
        SLinkOperations.addChild(copy, "parameter", copyTypeRecursively(pt));
      }
      return copy;
    } else if (SNodeOperations.isInstanceOf(type, "jetbrains.mps.lang.typesystem.structure.MeetType")) {
      SNode copy = SConceptOperations.createNewNode("jetbrains.mps.lang.typesystem.structure.MeetType", null);
      for (SNode arg : SLinkOperations.getTargets(SNodeOperations.cast(type, "jetbrains.mps.lang.typesystem.structure.MeetType"), "argument", true)) {
        SLinkOperations.addChild(copy, "argument", copyTypeRecursively(SNodeOperations.cast(arg, "jetbrains.mps.baseLanguage.structure.Type")));
      }
      return copy;
    } else {
      return SNodeOperations.copyNode(type);
    }
  }

  private static SNode coerceToClassifierTypeIgnoreParameters(SNode type) {
    SNode cType = (SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.structure.ClassifierType") ?
      SNodeOperations.cast(type, "jetbrains.mps.baseLanguage.structure.ClassifierType") :
      null
    );
    if ((cType == null)) {
      SNode cts = TypeChecker.getInstance().getRuntimeSupport().coerce_(type, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), false);
      if ((cts != null)) {
        cType = cts;
      } else {
        cType = TypeChecker.getInstance().getRuntimeSupport().coerce_(type, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), true);
      }
    }
    return cType;
  }
}

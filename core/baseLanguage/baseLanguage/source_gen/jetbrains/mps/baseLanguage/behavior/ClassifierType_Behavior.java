package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import java.util.Iterator;
import jetbrains.mps.lang.pattern.util.MatchingUtil;

public class ClassifierType_Behavior {

  public static void init(SNode thisNode) {
  }

  public static String virtual_getPresentation_1213877396640(SNode thisNode) {
    SNode classifier = SLinkOperations.getTarget(thisNode, "classifier", false);
    if (classifier == null) {
      return "?no classifier?";
    }
    String result = SPropertyOperations.getString(classifier, "name");
    List<SNode> parms = SLinkOperations.getTargets(thisNode, "parameter", true);
    if (ListSequence.fromList(parms).isNotEmpty()) {
      String parmsText = "";
      for(SNode parm : ListSequence.fromList(parms)) {
        if (parmsText.length() > 0) {
          parmsText = parmsText + ",";
        }
        parmsText = parmsText + BaseConcept_Behavior.call_getPresentation_1213877396640(parm);
      }
      result = result + "<" + parmsText + ">";
    }
    return result;
  }

  public static String virtual_getErasureSignature_1213877337313(SNode thisNode) {
    SNode classifier = SLinkOperations.getTarget(thisNode, "classifier", false);
    if (classifier == null) {
      return "?no classifier?";
    }
    return INamedConcept_Behavior.call_getFqName_1213877404258(classifier);
  }

  public static List<String> virtual_getVariableSuffixes_1213877337304(SNode thisNode) {
    String classifierName = SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "classifier", false), "name");
    String shortName = NameUtil.shortNameFromLongName(classifierName);
    return NameUtil.splitByCamels(NameUtil.decapitalize(shortName));
  }

  public static SNode virtual_getClassExpression_1213877337357(SNode thisNode) {
    return new _Quotations.QuotationClass_7().createNode(SLinkOperations.getTarget(thisNode, "classifier", false));
  }

  public static SNode virtual_getAbstractCreator_1213877337340(SNode thisNode) {
    SNode classifier = SLinkOperations.getTarget(thisNode, "classifier", false);
    if (SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
      if (!(SPropertyOperations.getBoolean(classifier, "abstractClass")) && ListSequence.fromList(SLinkOperations.getTargets(classifier, "constructor", true)).isNotEmpty()) {
        SNode creator = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassCreator", null);
        SLinkOperations.setTarget(creator, "baseMethodDeclaration", ListSequence.fromList(SLinkOperations.getTargets(classifier, "constructor", true)).first(), false);
        for(SNode typeParm : ListSequence.fromList(SLinkOperations.getTargets(thisNode, "parameter", true))) {
          SLinkOperations.addChild(creator, "typeParameter", SNodeOperations.copyNode(typeParm));
        }
        return creator;
      }
    }
    return null;
  }

  public static boolean virtual_isSupersetOf_1220438914705(SNode thisNode, SNode t) {
    if (SNodeOperations.isInstanceOf(t, "jetbrains.mps.baseLanguage.structure.WildCardType")) {
      do {
        SNode matchedNode_0 = thisNode;
        {
          boolean matches_0 = false;
          _Patterns.Pattern_0 matchingPattern = new _Patterns.Pattern_0();
          matches_0 = matchingPattern.match(matchedNode_0);
          if (matches_0) {
            return true;
          }
        }
        return false;
      } while(false);
    }
    {
      _Patterns.Pattern_1 pattern_0 = new _Patterns.Pattern_1();
      SNode coercedNode_0 = TypeChecker.getInstance().getRuntimeSupport().coerce_(t, pattern_0);
      if (coercedNode_0 != null) {
        {
          SNode typeParam;
          SNode myParam;
          Iterator<SNode> typeParam_iterator = pattern_0.PatternVar0.iterator();
          Iterator<SNode> myParam_iterator = SLinkOperations.getTargets(thisNode, "parameter", true).iterator();
          while (true) {
            if (!(typeParam_iterator.hasNext())) {
              break;
            }
            if (!(myParam_iterator.hasNext())) {
              break;
            }
            typeParam = typeParam_iterator.next();
            myParam = myParam_iterator.next();
            if (SNodeOperations.isInstanceOf(myParam, "jetbrains.mps.baseLanguage.structure.WildCardType") || SNodeOperations.isInstanceOf(myParam, "jetbrains.mps.baseLanguage.structure.UpperBoundType")) {
              if (!(Type_Behavior.call_isSupersetOf_1220438914705(myParam, typeParam))) {
                return false;
              }
            } else
            {
              if (!(MatchingUtil.matchNodes(myParam, typeParam))) {
                return false;
              }
            }
          }
        }
        return true;
      } else
      {
      }
    }
    return Type_Behavior.callSuper_isSupersetOf_1220438914705(thisNode, "jetbrains.mps.baseLanguage.structure.ClassifierType", t);
  }

}

package jetbrains.mps.xmlQuery.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.xmlQuery.constraints.SchemaUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class ElementBuilder_Behavior {
  private static Class[] PARAMETERS_1384720974900260447 = {SNode.class};
  private static Class[] PARAMETERS_1384720974900260456 = {SNode.class ,SNode.class};
  private static Class[] PARAMETERS_1384720974900260473 = {SNode.class ,SNode.class ,SNode.class ,SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getResultType_7057666463730718251(SNode thisNode) {
    return SchemaUtil.constructXMLElementTypeForElement(SLinkOperations.getTarget(thisNode, "elementDeclaration", false));
  }

  public static SNode virtual_getCreatorExpression_7057666463730727863(SNode thisNode, SNode parentRef) {
    return new ElementBuilder_Behavior.QuotationClass_1550_0().createNode(SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "elementDeclaration", false), "elementName"));
  }

  public static SNode virtual_getAttachStatementChild_4797501453850305563(SNode thisNode, SNode parentBuilder, SNode parentRef, SNode childRef) {
    return new ElementBuilder_Behavior.QuotationClass_1550_1().createNode(parentRef, childRef);
  }

  public static SNode call_getComplexType_1384720974900281910(SNode thisNode) {
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(thisNode, "elementDeclaration", false), "jetbrains.mps.xmlSchema.structure.ElementWithType")) {
      return SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(thisNode, "elementDeclaration", false), "jetbrains.mps.xmlSchema.structure.ElementWithType"), "complexTypeReference", true), "complexType", false);
    } else if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(thisNode, "elementDeclaration", false), "jetbrains.mps.xmlSchema.structure.ElementWithContent")) {
      return SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(thisNode, "elementDeclaration", false), "jetbrains.mps.xmlSchema.structure.ElementWithContent"), "complexType", true);
    } else {
      assert false;
      return null;
    }
  }

  public static SNode call_getResultType_1384720974900260447(SNode thisNode) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.xmlQuery.structure.ElementBuilder"), "virtual_getResultType_7057666463730718251", PARAMETERS_1384720974900260447);
  }

  public static SNode call_getCreatorExpression_1384720974900260456(SNode thisNode, SNode parentRef) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.xmlQuery.structure.ElementBuilder"), "virtual_getCreatorExpression_7057666463730727863", PARAMETERS_1384720974900260456, parentRef);
  }

  public static SNode call_getAttachStatementChild_1384720974900260473(SNode thisNode, SNode parentBuilder, SNode parentRef, SNode childRef) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.xmlQuery.structure.ElementBuilder"), "virtual_getAttachStatementChild_4797501453850305563", PARAMETERS_1384720974900260473, parentBuilder, parentRef, childRef);
  }

  public static SNode callSuper_getResultType_1384720974900260447(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.xmlQuery.structure.ElementBuilder"), callerConceptFqName, "virtual_getResultType_7057666463730718251", PARAMETERS_1384720974900260447);
  }

  public static SNode callSuper_getCreatorExpression_1384720974900260456(SNode thisNode, String callerConceptFqName, SNode parentRef) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.xmlQuery.structure.ElementBuilder"), callerConceptFqName, "virtual_getCreatorExpression_7057666463730727863", PARAMETERS_1384720974900260456, parentRef);
  }

  public static SNode callSuper_getAttachStatementChild_1384720974900260473(SNode thisNode, String callerConceptFqName, SNode parentBuilder, SNode parentRef, SNode childRef) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.xmlQuery.structure.ElementBuilder"), callerConceptFqName, "virtual_getAttachStatementChild_4797501453850305563", PARAMETERS_1384720974900260473, parentBuilder, parentRef, childRef);
  }

  public static class QuotationClass_1550_0 {
    public QuotationClass_1550_0() {
    }

    public SNode createNode(Object parameter_1550_0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1550_0 = null;
      SNode quotedNode_1550_1 = null;
      SNode quotedNode_1550_2 = null;
      {
        quotedNode_1550_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.GenericNewExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_1550_0 = quotedNode_1550_0;
        {
          quotedNode_1550_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassCreator", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_1550_1 = quotedNode_1550_1;
          quotedNode1_1550_1.addReference(SReference.create("baseMethodDeclaration", quotedNode1_1550_1, SModelReference.fromString("f:java_stub#org.jdom(org.jdom@java_stub)"), SNodeId.fromString("~Element.<init>(java.lang.String)")));
          {
            quotedNode_1550_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StringLiteral", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
            SNode quotedNode1_1550_2 = quotedNode_1550_2;
            quotedNode1_1550_2.setProperty("value", (String) parameter_1550_0);
            quotedNode_1550_1.addChild("actualArgument", quotedNode1_1550_2);
          }
          quotedNode_1550_0.addChild("creator", quotedNode1_1550_1);
        }
        result = quotedNode1_1550_0;
      }
      return result;
    }
  }

  public static class QuotationClass_1550_1 {
    public QuotationClass_1550_1() {
    }

    public SNode createNode(Object parameter_1550_1, Object parameter_1550_2) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1550_3 = null;
      SNode quotedNode_1550_4 = null;
      SNode quotedNode_1550_5 = null;
      SNode quotedNode_1550_6 = null;
      SNode quotedNode_1550_7 = null;
      SNode quotedNode_1550_8 = null;
      SNode quotedNode_1550_9 = null;
      {
        quotedNode_1550_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_1550_3 = quotedNode_1550_3;
        {
          quotedNode_1550_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_1550_4 = quotedNode_1550_4;
          {
            quotedNode_1550_5 = (SNode) parameter_1550_1;
            SNode quotedNode1_1550_5;
            if (_parameterValues_129834374.contains(quotedNode_1550_5)) {
              quotedNode1_1550_5 = CopyUtil.copy(quotedNode_1550_5);
            } else {
              _parameterValues_129834374.add(quotedNode_1550_5);
              quotedNode1_1550_5 = quotedNode_1550_5;
            }
            if (quotedNode1_1550_5 != null) {
              quotedNode_1550_4.addChild("operand", HUtil.copyIfNecessary(quotedNode1_1550_5));
            }
          }
          {
            quotedNode_1550_6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
            SNode quotedNode1_1550_6 = quotedNode_1550_6;
            quotedNode1_1550_6.addReference(SReference.create("baseMethodDeclaration", quotedNode1_1550_6, SModelReference.fromString("f:java_stub#org.jdom(org.jdom@java_stub)"), SNodeId.fromString("~Element.addContent(org.jdom.Element):org.jdom.Element")));
            {
              quotedNode_1550_8 = (SNode) parameter_1550_2;
              SNode quotedNode1_1550_7;
              if (_parameterValues_129834374.contains(quotedNode_1550_8)) {
                quotedNode1_1550_7 = CopyUtil.copy(quotedNode_1550_8);
              } else {
                _parameterValues_129834374.add(quotedNode_1550_8);
                quotedNode1_1550_7 = quotedNode_1550_8;
              }
              if (quotedNode1_1550_7 != null) {
                quotedNode_1550_6.addChild("actualArgument", HUtil.copyIfNecessary(quotedNode1_1550_7));
              }
            }
            quotedNode_1550_4.addChild("operation", quotedNode1_1550_6);
          }
          quotedNode_1550_3.addChild("expression", quotedNode1_1550_4);
        }
        result = quotedNode1_1550_3;
      }
      return result;
    }
  }
}

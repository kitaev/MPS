package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorCellKeyMap;
import jetbrains.mps.nodeEditor.EditorCellKeyMapAction;
import java.awt.event.KeyEvent;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.behavior.FieldDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class FieldDeclaration_keyMap extends EditorCellKeyMap {
  public FieldDeclaration_keyMap() {
    this.setApplicableToEveryModel(false);
    EditorCellKeyMapAction action;
    action = new FieldDeclaration_keyMap.FieldDeclaration_keyMap_Action0();
    this.putAction("alt", "VK_INSERT", action);
    this.putAction("alt", "VK_HELP", action);
    action = new FieldDeclaration_keyMap.FieldDeclaration_keyMap_Action1();
    this.putAction("alt", "VK_INSERT", action);
    this.putAction("alt", "VK_HELP", action);
  }

  public static class FieldDeclaration_keyMap_Action0 extends EditorCellKeyMapAction {
    public FieldDeclaration_keyMap_Action0() {
      this.setShownInPopupMenu(true);
    }

    public String getDescriptionText() {
      return "Generate getter";
    }

    public boolean isMenuAlwaysShown() {
      return false;
    }

    public boolean canExecute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      if ((contextCell == null)) {
        return false;
      }
      SNode contextNode = contextCell.getSNode();
      if (contextNode == null) {
        return false;
      }
      if (contextNode.isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.FieldDeclaration")) {
        return this.canExecute_internal(keyEvent, editorContext, contextNode, this.getSelectedNodes(editorContext));
      }
      return false;
    }

    public void execute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private boolean canExecute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SNode classConcept = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
      return (classConcept != null) && !(FieldDeclaration_Behavior.call_hasGetter_1213877243808(node, classConcept));
    }

    private void execute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SNode g;
      g = new FieldDeclaration_keyMap.FieldDeclaration_keyMap_Action0.QuotationClass_6732_0().createNode(SNodeOperations.copyNode(SLinkOperations.getTarget(node, "type", true)), node, FieldDeclaration_Behavior.call_getGetterName_1213877243782(node));
      ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false), "method", true)).addElement(g);
    }

    public String getKeyStroke() {
      return "alt INSERT";
    }

    public static class QuotationClass_6732_0 {
      public QuotationClass_6732_0() {
      }

      public SNode createNode(Object parameter_6732_0, Object parameter_6732_1, Object parameter_6732_2) {
        SNode result = null;
        Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
        SNode quotedNode_6732_0 = null;
        SNode quotedNode_6732_1 = null;
        SNode quotedNode_6732_2 = null;
        SNode quotedNode_6732_3 = null;
        SNode quotedNode_6732_4 = null;
        SNode quotedNode_6732_5 = null;
        SNode quotedNode_6732_6 = null;
        SNode quotedNode_6732_7 = null;
        {
          quotedNode_6732_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_6732_0 = quotedNode_6732_0;
          quotedNode1_6732_0.setProperty("name", (String) parameter_6732_2);
          {
            quotedNode_6732_1 = (SNode) parameter_6732_0;
            SNode quotedNode1_6732_1;
            if (_parameterValues_129834374.contains(quotedNode_6732_1)) {
              quotedNode1_6732_1 = CopyUtil.copy(quotedNode_6732_1);
            } else {
              _parameterValues_129834374.add(quotedNode_6732_1);
              quotedNode1_6732_1 = quotedNode_6732_1;
            }
            if (quotedNode1_6732_1 != null) {
              quotedNode_6732_0.addChild("returnType", HUtil.copyIfNecessary(quotedNode1_6732_1));
            }
          }
          {
            quotedNode_6732_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PublicVisibility", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
            SNode quotedNode1_6732_2 = quotedNode_6732_2;
            quotedNode_6732_0.addChild("visibility", quotedNode1_6732_2);
          }
          {
            quotedNode_6732_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StatementList", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
            SNode quotedNode1_6732_3 = quotedNode_6732_3;
            {
              quotedNode_6732_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ReturnStatement", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
              SNode quotedNode1_6732_4 = quotedNode_6732_4;
              {
                quotedNode_6732_5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
                SNode quotedNode1_6732_5 = quotedNode_6732_5;
                {
                  quotedNode_6732_6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ThisExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
                  SNode quotedNode1_6732_6 = quotedNode_6732_6;
                  quotedNode_6732_5.addChild("operand", quotedNode1_6732_6);
                }
                {
                  quotedNode_6732_7 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.FieldReferenceOperation", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
                  SNode quotedNode1_6732_7 = quotedNode_6732_7;
                  quotedNode1_6732_7.setReferent("fieldDeclaration", (SNode) parameter_6732_1);
                  quotedNode_6732_5.addChild("operation", quotedNode1_6732_7);
                }
                quotedNode_6732_4.addChild("expression", quotedNode1_6732_5);
              }
              quotedNode_6732_3.addChild("statement", quotedNode1_6732_4);
            }
            quotedNode_6732_0.addChild("body", quotedNode1_6732_3);
          }
          result = quotedNode1_6732_0;
        }
        return result;
      }
    }
  }

  public static class FieldDeclaration_keyMap_Action1 extends EditorCellKeyMapAction {
    public FieldDeclaration_keyMap_Action1() {
      this.setShownInPopupMenu(true);
    }

    public String getDescriptionText() {
      return "Generate setter";
    }

    public boolean isMenuAlwaysShown() {
      return false;
    }

    public boolean canExecute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      if ((contextCell == null)) {
        return false;
      }
      SNode contextNode = contextCell.getSNode();
      if (contextNode == null) {
        return false;
      }
      if (contextNode.isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.FieldDeclaration")) {
        return this.canExecute_internal(keyEvent, editorContext, contextNode, this.getSelectedNodes(editorContext));
      }
      return false;
    }

    public void execute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private boolean canExecute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SNode classConcept = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
      return (classConcept != null) && !(FieldDeclaration_Behavior.call_hasSetter_1213877243871(node, classConcept));
    }

    private void execute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SNode s;
      s = new FieldDeclaration_keyMap.FieldDeclaration_keyMap_Action1.QuotationClass_6732_1().createNode(node, FieldDeclaration_Behavior.call_getSetterName_1213877243861(node), SNodeOperations.copyNode(SLinkOperations.getTarget(node, "type", true)), SPropertyOperations.getString(node, "name"));
      ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false), "method", true)).addElement(s);
    }

    public String getKeyStroke() {
      return "alt INSERT";
    }

    public static class QuotationClass_6732_1 {
      public QuotationClass_6732_1() {
      }

      public SNode createNode(Object parameter_6732_3, Object parameter_6732_4, Object parameter_6732_5, Object parameter_6732_6) {
        SNode result = null;
        Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
        SNode quotedNode_6732_8 = null;
        SNode quotedNode_6732_9 = null;
        SNode quotedNode_6732_10 = null;
        SNode quotedNode_6732_11 = null;
        SNode quotedNode_6732_12 = null;
        SNode quotedNode_6732_13 = null;
        SNode quotedNode_6732_14 = null;
        SNode quotedNode_6732_15 = null;
        SNode quotedNode_6732_16 = null;
        SNode quotedNode_6732_17 = null;
        SNode quotedNode_6732_18 = null;
        SNode quotedNode_6732_19 = null;
        {
          quotedNode_6732_8 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_6732_8 = quotedNode_6732_8;
          quotedNode1_6732_8.setProperty("name", (String) parameter_6732_4);
          {
            quotedNode_6732_9 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VoidType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
            SNode quotedNode1_6732_9 = quotedNode_6732_9;
            quotedNode_6732_8.addChild("returnType", quotedNode1_6732_9);
          }
          {
            quotedNode_6732_10 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PublicVisibility", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
            SNode quotedNode1_6732_10 = quotedNode_6732_10;
            quotedNode_6732_8.addChild("visibility", quotedNode1_6732_10);
          }
          {
            quotedNode_6732_11 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StatementList", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
            SNode quotedNode1_6732_11 = quotedNode_6732_11;
            {
              quotedNode_6732_13 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
              SNode quotedNode1_6732_12 = quotedNode_6732_13;
              {
                quotedNode_6732_15 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AssignmentExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
                SNode quotedNode1_6732_13 = quotedNode_6732_15;
                {
                  quotedNode_6732_16 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterReference", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
                  SNode quotedNode1_6732_14 = quotedNode_6732_16;
                  quotedNode_6732_15.addChild("rValue", quotedNode1_6732_14);
                }
                {
                  quotedNode_6732_17 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
                  SNode quotedNode1_6732_15 = quotedNode_6732_17;
                  {
                    quotedNode_6732_18 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ThisExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
                    SNode quotedNode1_6732_16 = quotedNode_6732_18;
                    quotedNode_6732_17.addChild("operand", quotedNode1_6732_16);
                  }
                  {
                    quotedNode_6732_19 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.FieldReferenceOperation", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
                    SNode quotedNode1_6732_17 = quotedNode_6732_19;
                    quotedNode1_6732_17.setReferent("fieldDeclaration", (SNode) parameter_6732_3);
                    quotedNode_6732_17.addChild("operation", quotedNode1_6732_17);
                  }
                  quotedNode_6732_15.addChild("lValue", quotedNode1_6732_15);
                }
                quotedNode_6732_13.addChild("expression", quotedNode1_6732_13);
              }
              quotedNode_6732_11.addChild("statement", quotedNode1_6732_12);
            }
            quotedNode_6732_8.addChild("body", quotedNode1_6732_11);
          }
          {
            quotedNode_6732_12 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterDeclaration", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
            SNode quotedNode1_6732_18 = quotedNode_6732_12;
            quotedNode1_6732_18.setProperty("name", (String) parameter_6732_6);
            {
              quotedNode_6732_14 = (SNode) parameter_6732_5;
              SNode quotedNode1_6732_19;
              if (_parameterValues_129834374.contains(quotedNode_6732_14)) {
                quotedNode1_6732_19 = CopyUtil.copy(quotedNode_6732_14);
              } else {
                _parameterValues_129834374.add(quotedNode_6732_14);
                quotedNode1_6732_19 = quotedNode_6732_14;
              }
              if (quotedNode1_6732_19 != null) {
                quotedNode_6732_12.addChild("type", HUtil.copyIfNecessary(quotedNode1_6732_19));
              }
            }
            quotedNode_6732_8.addChild("parameter", quotedNode1_6732_18);
          }
          result = quotedNode1_6732_8;
        }
        quotedNode_6732_16.setReferent("variableDeclaration", quotedNode_6732_12);
        return result;
      }
    }
  }
}

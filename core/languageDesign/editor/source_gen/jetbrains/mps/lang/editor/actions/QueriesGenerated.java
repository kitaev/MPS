package jetbrains.mps.lang.editor.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.NodeSubstitutePreconditionContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.editor.behavior.CellMenuUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.action.NodeSetupContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;
import java.util.ArrayList;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.smodel.action.DefaultSimpleSubstituteAction;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.util.Calculable;
import jetbrains.mps.lang.editor.behavior.BaseEditorComponent_Behavior;
import jetbrains.mps.smodel.action.DefaultChildNodeSubstituteAction;
import javax.swing.Icon;
import jetbrains.mps.smodel.action.ChildSubstituteActionsHelper;

public class QueriesGenerated {

  public static boolean nodeSubstituteActionsBuilder_Precondition_CellMenuPart_Abstract_1199894693230(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    SNode editedFeature = CellMenuUtil.getEditedFeature(_context.getParentNode());
    return SNodeOperations.isInstanceOf(editedFeature, "jetbrains.mps.lang.structure.structure.PropertyDeclaration");
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_CellMenuPart_Abstract_1199894948366(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    SNode editedFeature = CellMenuUtil.getEditedFeature(_context.getParentNode());
    return SNodeOperations.isInstanceOf(editedFeature, "jetbrains.mps.lang.structure.structure.LinkDeclaration") && SPropertyOperations.hasValue(SNodeOperations.cast(editedFeature, "jetbrains.mps.lang.structure.structure.LinkDeclaration"), "metaClass", "reference", "reference");
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_CellMenuPart_Abstract_1199895015796(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    SNode editedFeature = CellMenuUtil.getEditedFeature(_context.getParentNode());
    return SNodeOperations.isInstanceOf(editedFeature, "jetbrains.mps.lang.structure.structure.LinkDeclaration") && SPropertyOperations.hasValue(SNodeOperations.cast(editedFeature, "jetbrains.mps.lang.structure.structure.LinkDeclaration"), "metaClass", "aggregation", "reference");
  }

  public static void nodeFactory_NodeSetup_CellModel_Property_1158947460473(final IOperationContext operationContext, final NodeSetupContext _context) {
    SNode parentRefCell = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.lang.editor.structure.CellModel_RefCell", true, false);
    if (parentRefCell != null) {
      SPropertyOperations.set(_context.getNewNode(), "readOnly", "" + (true));
    }
  }

  public static void nodeFactory_NodeSetup_CellModel_Collection_1159287296419(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getEnclosingNode(), "jetbrains.mps.lang.editor.structure.CellModel_Collection")) {
      SNode item = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem", null);
      SPropertyOperations.set(item, "flag", "" + (false));
      SLinkOperations.addChild(_context.getNewNode(), "styleItem", item);
    }
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.lang.editor.structure.EditorCellModel")) {
      SNode innerNode = SNodeOperations.copyNode(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.lang.editor.structure.EditorCellModel"));
      SLinkOperations.addChild(_context.getNewNode(), "childCellModel", innerNode);
      if (SNodeOperations.isInstanceOf(innerNode, "jetbrains.mps.lang.editor.structure.CellModel_Collection")) {
        SNode item = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem", null);
        SPropertyOperations.set(item, "flag", "" + (false));
        SLinkOperations.addChild(innerNode, "styleItem", item);
      }
    }
  }

  public static void nodeFactory_NodeSetup_CellModel_Alternation_1165441265076(final IOperationContext operationContext, final NodeSetupContext _context) {
    SPropertyOperations.set(_context.getNewNode(), "vertical", "" + (true));
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.lang.editor.structure.EditorCellModel")) {
      SLinkOperations.setTarget(_context.getNewNode(), "ifTrueCellModel", SNodeOperations.copyNode(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.lang.editor.structure.EditorCellModel")), true);
    }
  }

  public static void nodeFactory_NodeSetup_ColorStyleClassItem_1222177342205(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.lang.editor.structure.ColorStyleClassItem")) {
      SPropertyOperations.set(_context.getNewNode(), "color", SPropertyOperations.getString_def(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.lang.editor.structure.ColorStyleClassItem"), "color", null));
      SLinkOperations.setTarget(_context.getNewNode(), "query", SLinkOperations.getTarget(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.lang.editor.structure.ColorStyleClassItem"), "query", true), true);
    }
  }

  public static void nodeFactory_NodeSetup_BooleanStyleSheetItem_1222178769289(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.lang.editor.structure.BooleanStyleSheetItem")) {
      SPropertyOperations.set(_context.getNewNode(), "flag", "" + SPropertyOperations.getBoolean(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.lang.editor.structure.BooleanStyleSheetItem"), "flag"));
    }
  }

  public static void nodeFactory_NodeSetup_FloatStyleClassItem_1222178992988(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.lang.editor.structure.FloatStyleClassItem")) {
      SPropertyOperations.set(_context.getNewNode(), "value", SPropertyOperations.getString(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.lang.editor.structure.FloatStyleClassItem"), "value"));
    }
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_EditorCellModel_1177585776510(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.EditorCellModel");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        result.add(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode result = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.CellModel_Collection", _context.getCurrentTargetNode());
            SPropertyOperations.set(result, "vertical", "" + (true));
            return result;
          }

          public String getMatchingText(String pattern) {
            return "collection (vertical)";
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.EditorCellModel");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        result.add(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.lang.editor.structure.CellModel_Collection", _context.getCurrentTargetNode());
            SPropertyOperations.set(result, "vertical", "" + (true));
            if ((SNodeOperations.getAncestor(_context.getParentNode(), "jetbrains.mps.lang.editor.structure.CellModel_Collection", true, false) != null)) {
              SNode item = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem", null);
              SPropertyOperations.set(item, "flag", "" + (false));
              SLinkOperations.addChild(result, "styleItem", item);
            }
            return result;
          }

          public String getDescriptionText(String pattern) {
            return "collection (vertical)";
          }

          public String getMatchingText(String pattern) {
            return "[/";
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.EditorCellModel");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        result.add(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.lang.editor.structure.CellModel_Collection", _context.getCurrentTargetNode());
            SPropertyOperations.set(result, "vertical", "" + (false));
            return result;
          }

          public String getMatchingText(String pattern) {
            return "collection (horizontal)";
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.EditorCellModel");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        result.add(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.lang.editor.structure.CellModel_Collection", _context.getCurrentTargetNode());
            SPropertyOperations.set(result, "vertical", "" + (false));
            if ((SNodeOperations.getAncestor(_context.getParentNode(), "jetbrains.mps.lang.editor.structure.CellModel_Collection", true, false) != null)) {
              SNode item = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem", null);
              SPropertyOperations.set(item, "flag", "" + (false));
              SLinkOperations.addChild(result, "styleItem", item);
            }
            return result;
          }

          public String getDescriptionText(String pattern) {
            return "collection (horizontal)";
          }

          public String getMatchingText(String pattern) {
            return "[>";
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.EditorCellModel");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        result.add(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.lang.editor.structure.CellModel_Collection", _context.getCurrentTargetNode());
            SLinkOperations.setNewChild(result, "cellLayout", "jetbrains.mps.lang.editor.structure.CellLayout_Indent");
            return result;
          }

          public String getMatchingText(String pattern) {
            return "collection (indent)";
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.EditorCellModel");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        result.add(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.lang.editor.structure.CellModel_Collection", _context.getCurrentTargetNode());
            SLinkOperations.setNewChild(result, "cellLayout", "jetbrains.mps.lang.editor.structure.CellLayout_Indent");
            if ((SNodeOperations.getAncestor(_context.getParentNode(), "jetbrains.mps.lang.editor.structure.CellModel_Collection", true, false) != null)) {
              SNode item = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem", null);
              SPropertyOperations.set(item, "flag", "" + (false));
              SLinkOperations.addChild(result, "styleItem", item);
            }
            return result;
          }

          public String getDescriptionText(String pattern) {
            return "collection (indent)";
          }

          public String getMatchingText(String pattern) {
            return "[-";
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.EditorCellModel");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        result.add(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.lang.editor.structure.CellModel_Collection", _context.getCurrentTargetNode());
            SPropertyOperations.set(result, "vertical", "" + (false));
            SNode indent = SModelOperations.createNewNode(model, "jetbrains.mps.lang.editor.structure.CellModel_Indent", null);
            SNode item = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem", null);
            SPropertyOperations.set(item, "flag", "" + (false));
            SLinkOperations.addChild(indent, "styleItem", item);
            SLinkOperations.insertChildFirst(result, "childCellModel", indent);
            if ((SNodeOperations.getAncestor(_context.getParentNode(), "jetbrains.mps.lang.editor.structure.CellModel_Collection", true, false) != null)) {
              SNode styleItem = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem", null);
              SPropertyOperations.set(styleItem, "flag", "" + (false));
              SLinkOperations.addChild(result, "styleItem", styleItem);
            }
            return result;
          }

          public String getDescriptionText(String pattern) {
            return "collection (with indent)";
          }

          public String getMatchingText(String pattern) {
            return "[_";
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.EditorCellModel");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        result.add(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.lang.editor.structure.CellModel_RefNodeList", _context.getCurrentTargetNode());
            SPropertyOperations.set(result, "vertical", "" + (true));
            return result;
          }

          public String getMatchingText(String pattern) {
            return "child node cell list (vertical)";
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.EditorCellModel");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        result.add(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.lang.editor.structure.CellModel_RefNodeList", _context.getCurrentTargetNode());
            SPropertyOperations.set(result, "vertical", "" + (true));
            if (SNodeOperations.isInstanceOf(_context.getParentNode(), "jetbrains.mps.lang.editor.structure.CellModel_Collection")) {
              SNode item = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem", null);
              SPropertyOperations.set(item, "flag", "" + (false));
              SLinkOperations.addChild(result, "styleItem", item);
            }
            return result;
          }

          public String getDescriptionText(String pattern) {
            return "child node cell list (vertical)";
          }

          public String getMatchingText(String pattern) {
            return "(/";
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.EditorCellModel");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        result.add(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.lang.editor.structure.CellModel_RefNodeList", _context.getCurrentTargetNode());
            SPropertyOperations.set(result, "vertical", "" + (false));
            return result;
          }

          public String getMatchingText(String pattern) {
            return "child node cell list (horizontal)";
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.EditorCellModel");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        result.add(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.lang.editor.structure.CellModel_RefNodeList", _context.getCurrentTargetNode());
            SPropertyOperations.set(result, "vertical", "" + (false));
            if (SNodeOperations.isInstanceOf(_context.getParentNode(), "jetbrains.mps.lang.editor.structure.CellModel_Collection")) {
              SNode item = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem", null);
              SPropertyOperations.set(item, "flag", "" + (false));
              SLinkOperations.addChild(result, "styleItem", item);
            }
            return result;
          }

          public String getDescriptionText(String pattern) {
            return "child node cell list (horizontal)";
          }

          public String getMatchingText(String pattern) {
            return "(>";
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.EditorCellModel");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        result.add(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            return SModelOperations.createNewNode(model, "jetbrains.mps.lang.editor.structure.CellModel_RefCell", _context.getCurrentTargetNode());
          }

          public String getMatchingText(String pattern) {
            return "referent node cell";
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.EditorCellModel");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        result.add(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            return SModelOperations.createNewNode(model, "jetbrains.mps.lang.editor.structure.CellModel_RefNode", _context.getCurrentTargetNode());
          }

          public String getMatchingText(String pattern) {
            return "child node cell";
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.EditorCellModel");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        result.add(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            return SModelOperations.createNewNode(model, "jetbrains.mps.lang.editor.structure.CellModel_Property", _context.getCurrentTargetNode());
          }

          public String getMatchingText(String pattern) {
            return "property";
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.EditorCellModel");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        result.add(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.lang.editor.structure.CellModel_ConceptProperty", _context.getCurrentTargetNode());
            return result;
          }

          public String getMatchingText(String pattern) {
            return "concept property";
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.EditorCellModel");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        result.add(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.lang.editor.structure.CellModel_Alternation", _context.getCurrentTargetNode());
            return result;
          }

          public String getDescriptionText(String pattern) {
            return "alternation";
          }

          public String getMatchingText(String pattern) {
            return "if";
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.EditorCellModel");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        result.add(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.lang.editor.structure.CellModel_Constant", _context.getCurrentTargetNode());
            SPropertyOperations.set(result, "text", NameUtil.stripQuotes(pattern, "\"", "\""));
            return result;
          }

          public boolean hasSubstitute() {
            return true;
          }

          public boolean canSubstitute_internal(String pattern, boolean strictly) {
            return pattern.startsWith("\"");
          }

          public String getDescriptionText(String pattern) {
            return "constant";
          }

          public String getMatchingText(String pattern) {
            return pattern;
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.EditorCellModel");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        result.add(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode result = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.CellModel_Error", _context.getCurrentTargetNode());
            SPropertyOperations.set(result, "text", NameUtil.stripQuotes(pattern, "!", "!"));
            return result;
          }

          public boolean hasSubstitute() {
            return true;
          }

          public boolean canSubstitute_internal(String pattern, boolean strictly) {
            return pattern.startsWith("!");
          }

          public String getDescriptionText(String pattern) {
            return "Error label";
          }

          public String getMatchingText(String pattern) {
            return pattern;
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.EditorCellModel");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {

          public Object calculate() {
            SNode container = SNodeOperations.getAncestor(_context.getParentNode(), "jetbrains.mps.lang.editor.structure.BaseEditorComponent", true, false);
            return BaseEditorComponent_Behavior.call_getApplicableComponents_1213877372457(container, operationContext.getScope());
          }
        };
        Iterable<SNode> queryResult = (Iterable)calc.calculate();
        if (queryResult != null) {
          for(final SNode item : queryResult) {
            result.add(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode component = SModelOperations.createNewNode(model, "jetbrains.mps.lang.editor.structure.CellModel_Component", null);
                SLinkOperations.setTarget(component, "editorComponent", (item), false);
                return component;
              }

              public String getMatchingText(String pattern) {
                return "#" + SPropertyOperations.getString((item), "name") + "#";
              }

              public String getVisibleMatchingText(String pattern) {
                return this.getMatchingText(pattern);
              }
            });
          }
        }
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_CellActionMapItem_1185874474095(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.CellActionMapItem");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {

          public Object calculate() {
            return SLinkOperations.getTargets(SNodeOperations.getNode("r:00000000-0000-4000-0000-011c8959029e(jetbrains.mps.lang.editor.structure)", "1139535328871"), "member", true);
          }
        };
        Iterable<SNode> queryResult = (Iterable)calc.calculate();
        if (queryResult != null) {
          for(final SNode item : queryResult) {
            result.add(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode newNode = SModelOperations.createNewNode(model, "jetbrains.mps.lang.editor.structure.CellActionMapItem", _context.getCurrentTargetNode());
                SPropertyOperations.set(newNode, "actionId", SPropertyOperations.getString((item), "internalValue"));
                return newNode;
              }

              public String getMatchingText(String pattern) {
                return SPropertyOperations.getString((item), "externalValue");
              }

              public String getVisibleMatchingText(String pattern) {
                return this.getMatchingText(pattern);
              }

              public String getDescriptionText(String pattern) {
                return "";
              }

              public Icon getIconFor(String pattern) {
                return null;
              }
            });
          }
        }
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_CellMenuPart_Abstract_1199894656684(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      SNode conceptToAdd = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.CellMenuPart_PropertyValues");
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext);
      result.addAll(defaultActions);
    }
    {
      SNode conceptToAdd = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.CellMenuPart_PropertyPostfixHints");
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext);
      result.addAll(defaultActions);
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_CellMenuPart_Abstract_1199894924671(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      SNode conceptToAdd = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.CellMenuPart_ReferentPrimary");
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext);
      result.addAll(defaultActions);
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_CellMenuPart_Abstract_1199895015795(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      SNode conceptToAdd = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.CellMenuPart_ReplaceChild_Group");
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext);
      result.addAll(defaultActions);
    }
    {
      SNode conceptToAdd = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.CellMenuPart_ReplaceChild_Item");
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext);
      result.addAll(defaultActions);
    }
    {
      SNode conceptToAdd = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.CellMenuPart_ReplaceChild_CustomChildConcept");
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext);
      result.addAll(defaultActions);
    }
    {
      SNode conceptToAdd = SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.editor.structure.CellMenuPart_ReplaceChildPrimary");
      List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions(conceptToAdd, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext);
      result.addAll(defaultActions);
    }
    return result;
  }

}

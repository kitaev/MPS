package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_DeleteNode;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeListHandlerElementKeyMap;
import jetbrains.mps.nodeEditor.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.DefaultChildSubstituteInfo;

public class AnonymousClass_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myParameterListHandler_parameterList_;
  /* package */AbstractCellListHandler myFieldListHandler_fieldsList_;
  /* package */AbstractCellListHandler myMethodListHandler_methodsList_;
  /* package */AbstractCellListHandler myStaticMethodListHandler_staticMethodList_;

  private static void setupBasic_ClassifierReferenceCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1170346086721");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1170346096289");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ParameterList(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1170346136560");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1170346142297");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1170345922029");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_HeaderRow(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1170345921994");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_FieldsIndentCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1170345922035");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_FieldsList(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1170345922036");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_FieldsArea(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1170345922034");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1170345922038");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_MethodsIndentCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1170345922045");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_MethodsList(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1170345922046");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_MethodsArea(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1170345922044");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell6(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1170345922048");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_MethodsIndentCell1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1170345922050");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_StaticMethodList(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1170345922051");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_RowCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1170345922049");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell8(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1170345922053");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ClassBox(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1170345921993");
    editorCell.setDrawBorder(false);
  }
  private static void setupLabel_ClassifierReferenceCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ParameterList(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell2(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_FieldsIndentCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_FieldsList(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell4(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_MethodsIndentCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_MethodsList(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell6(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_MethodsIndentCell1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_StaticMethodList(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell8(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createClassBox(context, node);
  }
  public EditorCell createHeaderRow(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    AnonymousClass_Editor.setupBasic_HeaderRow(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createClassifierReferenceCell(context, node));
    editorCell.addEditorCell(this.createConstantCell(context, node, "("));
    editorCell.addEditorCell(this.createParameterList(context, node));
    editorCell.addEditorCell(this.createConstantCell1(context, node, ")"));
    editorCell.addEditorCell(this.createConstantCell2(context, node, "{"));
    return editorCell;
  }
  public EditorCell createFieldsArea(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    AnonymousClass_Editor.setupBasic_FieldsArea(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createFieldsIndentCell(context, node, "    "));
    editorCell.addEditorCell(this.createFieldsList(context, node));
    return editorCell;
  }
  public EditorCell createMethodsArea(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    AnonymousClass_Editor.setupBasic_MethodsArea(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createMethodsIndentCell(context, node, "    "));
    editorCell.addEditorCell(this.createMethodsList(context, node));
    return editorCell;
  }
  public EditorCell createRowCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    AnonymousClass_Editor.setupBasic_RowCell(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createMethodsIndentCell1(context, node, "    "));
    editorCell.addEditorCell(this.createStaticMethodList(context, node));
    return editorCell;
  }
  public EditorCell createClassBox(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    AnonymousClass_Editor.setupBasic_ClassBox(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createHeaderRow(context, node));
    editorCell.addEditorCell(this.createFieldsArea(context, node));
    editorCell.addEditorCell(this.createConstantCell4(context, node, ""));
    editorCell.addEditorCell(this.createMethodsArea(context, node));
    editorCell.addEditorCell(this.createConstantCell6(context, node, ""));
    editorCell.addEditorCell(this.createRowCell(context, node));
    editorCell.addEditorCell(this.createConstantCell8(context, node, "}"));
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    AnonymousClass_Editor.setupBasic_ConstantCell(editorCell, node, context);
    AnonymousClass_Editor.setupLabel_ConstantCell(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    AnonymousClass_Editor.setupBasic_ConstantCell1(editorCell, node, context);
    AnonymousClass_Editor.setupLabel_ConstantCell1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    AnonymousClass_Editor.setupBasic_ConstantCell2(editorCell, node, context);
    AnonymousClass_Editor.setupLabel_ConstantCell2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createFieldsIndentCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    AnonymousClass_Editor.setupBasic_FieldsIndentCell(editorCell, node, context);
    AnonymousClass_Editor.setupLabel_FieldsIndentCell(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    AnonymousClass_Editor.setupBasic_ConstantCell4(editorCell, node, context);
    AnonymousClass_Editor.setupLabel_ConstantCell4(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createMethodsIndentCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    AnonymousClass_Editor.setupBasic_MethodsIndentCell(editorCell, node, context);
    AnonymousClass_Editor.setupLabel_MethodsIndentCell(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    AnonymousClass_Editor.setupBasic_ConstantCell6(editorCell, node, context);
    AnonymousClass_Editor.setupLabel_ConstantCell6(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createMethodsIndentCell1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    AnonymousClass_Editor.setupBasic_MethodsIndentCell1(editorCell, node, context);
    AnonymousClass_Editor.setupLabel_MethodsIndentCell1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell8(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    AnonymousClass_Editor.setupBasic_ConstantCell8(editorCell, node, context);
    AnonymousClass_Editor.setupLabel_ConstantCell8(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createParameterList(EditorContext context, SNode node) {
    if(this.myParameterListHandler_parameterList_ == null) {
      this.myParameterListHandler_parameterList_ = new AnonymousClass_Editor._RefNodeListHandler36(node, "parameter", context);
    }
    EditorCell_Collection editorCell = this.myParameterListHandler_parameterList_.createCells(context, new CellLayout_Horizontal(), false);
    AnonymousClass_Editor.setupBasic_ParameterList(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myParameterListHandler_parameterList_.getElementRole());
    return editorCell;
  }
  public EditorCell createFieldsList(EditorContext context, SNode node) {
    if(this.myFieldListHandler_fieldsList_ == null) {
      this.myFieldListHandler_fieldsList_ = new AnonymousClass_Editor._RefNodeListHandler37(node, "field", context);
    }
    EditorCell_Collection editorCell = this.myFieldListHandler_fieldsList_.createCells(context, new CellLayout_Vertical(), false);
    AnonymousClass_Editor.setupBasic_FieldsList(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myFieldListHandler_fieldsList_.getElementRole());
    return editorCell;
  }
  public EditorCell createMethodsList(EditorContext context, SNode node) {
    if(this.myMethodListHandler_methodsList_ == null) {
      this.myMethodListHandler_methodsList_ = new AnonymousClass_Editor._RefNodeListHandler38(node, "method", context);
    }
    EditorCell_Collection editorCell = this.myMethodListHandler_methodsList_.createCells(context, new CellLayout_Vertical(), false);
    AnonymousClass_Editor.setupBasic_MethodsList(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myMethodListHandler_methodsList_.getElementRole());
    return editorCell;
  }
  public EditorCell createStaticMethodList(EditorContext context, SNode node) {
    if(this.myStaticMethodListHandler_staticMethodList_ == null) {
      this.myStaticMethodListHandler_staticMethodList_ = new AnonymousClass_Editor._RefNodeListHandler39(node, "staticMethod", context);
    }
    EditorCell_Collection editorCell = this.myStaticMethodListHandler_staticMethodList_.createCells(context, new CellLayout_Vertical(), false);
    AnonymousClass_Editor.setupBasic_StaticMethodList(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myStaticMethodListHandler_staticMethodList_.getElementRole());
    return editorCell;
  }
  public EditorCell createClassifierReferenceCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new AnonymousClass_Editor._Inline19());
    EditorCell editorCell = provider.createEditorCell(context);
    AnonymousClass_Editor.setupBasic_ClassifierReferenceCell(editorCell, node, context);
    if(editorCell instanceof EditorCell_Label) {
      AnonymousClass_Editor.setupLabel_ClassifierReferenceCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }
  public EditorCell createClassifierReferenceCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("classifier");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createClassifierReferenceCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }
  public static class _Inline19 extends AbstractCellProvider {

    public  _Inline19() {
      super();
    }

    private static void setupBasic_NameCell(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1170346092162");
      editorCell.setDrawBorder(false);
    }
    private static void setupLabel_NameCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }
    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createNameCell(context, node);
    }
    public EditorCell createNameCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      AnonymousClass_Editor._Inline19.setupBasic_NameCell(editorCell, node, context);
      if(editorCell instanceof EditorCell_Label) {
        AnonymousClass_Editor._Inline19.setupLabel_NameCell((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }
    public EditorCell createNameCell(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createNameCellinternal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if(attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }
}
  public static class _RefNodeListHandler36 extends RefNodeListHandler {

    public  _RefNodeListHandler36(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    public SNode createNodeToInsert(EditorContext context) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, context, super.getElementRole());
    }
    public EditorCell createNodeCell(EditorContext context, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(context, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, context);
      return elementCell;
    }
    public EditorCell createEmptyCell(EditorContext context) {
      EditorCell emptyCell = null;
      emptyCell = super.createEmptyCell(context);
      this.installElementCellActions(super.getOwner(), null, emptyCell, context);
      return emptyCell;
    }
    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if(elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if(elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteNode(elementNode));
          elementCell.addKeyMap(new RefNodeListHandlerElementKeyMap(this, ","));
        }
        if(elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }
    public EditorCell createSeparatorCell(EditorContext context) {
      {
        EditorCell_Constant editorCell = new EditorCell_Constant(context, this.getOwner(), ",");
        editorCell.setSelectable(false);
        editorCell.setDrawBorder(false);
        editorCell.setLayoutConstraint("");
        return editorCell;
      }
    }
}
  public static class _RefNodeListHandler37 extends RefNodeListHandler {

    public  _RefNodeListHandler37(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    private static void setupBasic_ConstantCell3(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1170345922037");
      editorCell.setSelectable(true);
      editorCell.setDrawBorder(false);
    }
    private static void setupLabel_ConstantCell3(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

    public SNode createNodeToInsert(EditorContext context) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, context, super.getElementRole());
    }
    public EditorCell createNodeCell(EditorContext context, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(context, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, context);
      return elementCell;
    }
    public EditorCell createEmptyCell(EditorContext context) {
      EditorCell emptyCell = null;
      emptyCell = this.createEmptyCell_internal(context, this.getOwner());
      this.installElementCellActions(super.getOwner(), null, emptyCell, context);
      return emptyCell;
    }
    public EditorCell createEmptyCell_internal(EditorContext context, SNode node) {
      return this.createConstantCell3(context, node, " << fields >>");
    }
    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if(elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if(elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteNode(elementNode));
        }
        if(elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }
    public EditorCell createSeparatorCell(EditorContext context) {
      return super.createSeparatorCell(context);
    }
    public EditorCell createConstantCell3(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      AnonymousClass_Editor._RefNodeListHandler37.setupBasic_ConstantCell3(editorCell, node, context);
      AnonymousClass_Editor._RefNodeListHandler37.setupLabel_ConstantCell3(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }
}
  public static class _RefNodeListHandler38 extends RefNodeListHandler {

    public  _RefNodeListHandler38(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    private static void setupBasic_ConstantCell5(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1170345922047");
      editorCell.setSelectable(true);
      editorCell.setDrawBorder(false);
    }
    private static void setupLabel_ConstantCell5(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

    public SNode createNodeToInsert(EditorContext context) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, context, super.getElementRole());
    }
    public EditorCell createNodeCell(EditorContext context, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(context, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, context);
      return elementCell;
    }
    public EditorCell createEmptyCell(EditorContext context) {
      EditorCell emptyCell = null;
      emptyCell = this.createEmptyCell_internal(context, this.getOwner());
      this.installElementCellActions(super.getOwner(), null, emptyCell, context);
      return emptyCell;
    }
    public EditorCell createEmptyCell_internal(EditorContext context, SNode node) {
      return this.createConstantCell5(context, node, " << methods >>");
    }
    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if(elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if(elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteNode(elementNode));
        }
        if(elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }
    public EditorCell createSeparatorCell(EditorContext context) {
      return super.createSeparatorCell(context);
    }
    public EditorCell createConstantCell5(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      AnonymousClass_Editor._RefNodeListHandler38.setupBasic_ConstantCell5(editorCell, node, context);
      AnonymousClass_Editor._RefNodeListHandler38.setupLabel_ConstantCell5(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }
}
  public static class _RefNodeListHandler39 extends RefNodeListHandler {

    public  _RefNodeListHandler39(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    private static void setupBasic_ConstantCell7(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1170345922052");
      editorCell.setSelectable(true);
      editorCell.setDrawBorder(false);
    }
    private static void setupLabel_ConstantCell7(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

    public SNode createNodeToInsert(EditorContext context) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, context, super.getElementRole());
    }
    public EditorCell createNodeCell(EditorContext context, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(context, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, context);
      return elementCell;
    }
    public EditorCell createEmptyCell(EditorContext context) {
      EditorCell emptyCell = null;
      emptyCell = this.createEmptyCell_internal(context, this.getOwner());
      this.installElementCellActions(super.getOwner(), null, emptyCell, context);
      return emptyCell;
    }
    public EditorCell createEmptyCell_internal(EditorContext context, SNode node) {
      return this.createConstantCell7(context, node, " << static methods >>");
    }
    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if(elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if(elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteNode(elementNode));
        }
        if(elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }
    public EditorCell createSeparatorCell(EditorContext context) {
      return super.createSeparatorCell(context);
    }
    public EditorCell createConstantCell7(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      AnonymousClass_Editor._RefNodeListHandler39.setupBasic_ConstantCell7(editorCell, node, context);
      AnonymousClass_Editor._RefNodeListHandler39.setupLabel_ConstantCell7(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }
}

}

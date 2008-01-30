package jetbrains.mps.buildlanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.DefaultChildSubstituteInfo;

public class TargetDeclaration_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myTargetDeclaration_EditorComponent;
  /* package */AbstractCellProvider myTargetDeclaration_EditorComponent1;
  /* package */AbstractCellListHandler myPropertyListListHandler_propertyListList_;
  /* package */AbstractCellListHandler myTaskCallListHandler_taskCallList_;

  private static void setupBasic_ConstantCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1201260045442");
    BuildLanguageStyle_StyleSheet.COMMENT.apply(editorCell);
  }

  private static void setupBasic_ShortDescriptionCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1201260045443");
    BuildLanguageStyle_StyleSheet.COMMENT.apply(editorCell);
  }

  private static void setupBasic_RowCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1201260045441");
    editorCell.setSelectable(false);
  }

  private static void setupBasic_CellModel_ConceptProperty(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1196853844458");
    BuildLanguageStyle_StyleSheet.KEYWORD.apply(editorCell);
  }

  private static void setupBasic_NameCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1196855783095");
    BuildLanguageStyle_StyleSheet.TARGET.apply(editorCell);
  }

  private static void setupBasic_ConstantCell1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1197035769617");
  }

  private static void setupBasic_TargetDeclaration_EditorComponentCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1197035775478");
  }

  private static void setupBasic_ConstantCell2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1197035781262");
  }

  private static void setupBasic_RowCell2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1197034690973");
    editorCell.setSelectable(false);
  }

  private static void setupBasic_RowCell1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1196853835441");
    editorCell.setSelectable(false);
  }

  private static void setupBasic_CellModel_Indent(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1200510295644");
  }

  private static void setupBasic_PropertyListList(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1197050077047");
    editorCell.setSelectable(false);
  }

  private static void setupBasic_RowCell3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1197050066417");
    editorCell.setSelectable(false);
  }

  private static void setupBasic_CellModel_Indent1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1200510289877");
  }

  private static void setupBasic_TaskCallList(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1196858314628");
    editorCell.setSelectable(false);
  }

  private static void setupBasic_RowCell4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1196858302875");
    editorCell.setSelectable(false);
  }

  private static void setupBasic_ConstantCell5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1200510301099");
    editorCell.setSelectable(false);
  }

  private static void setupBasic_ColumnCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1196853810253");
  }

  private static void setupBasic_TargetDeclaration_EditorComponentCell1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1197034276174");
  }

  private static void setupLabel_ConstantCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ShortDescriptionCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_CellModel_ConceptProperty(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.setEditable(false);
  }

  private static void setupLabel_NameCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell2(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_PropertyListList(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_TaskCallList(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell5(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.setEditable(false);
  }

  public static boolean _QueryFunction_NodeCondition_1201260045444(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getString(node, "shortDescription") != null;
  }

  public static boolean _QueryFunction_NodeCondition_1197035916697(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getCount(node, "depends") != 0 || editorContext.isInspector();
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createColumnCell(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createTargetDeclaration_EditorComponentCell1(context, node);
  }

  public EditorCell createRowCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    TargetDeclaration_Editor.setupBasic_RowCell(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell(context, node, "//"));
    editorCell.addEditorCell(this.createShortDescriptionCell(context, node));
    return editorCell;
  }

  public EditorCell createRowCell2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    TargetDeclaration_Editor.setupBasic_RowCell2(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell1(context, node, "["));
    editorCell.addEditorCell(this.createTargetDeclaration_EditorComponentCell(context, node));
    editorCell.addEditorCell(this.createConstantCell2(context, node, "]"));
    return editorCell;
  }

  public EditorCell createRowCell1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    TargetDeclaration_Editor.setupBasic_RowCell1(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCellModel_ConceptProperty(context, node));
    editorCell.addEditorCell(this.createNameCell(context, node));
    if(TargetDeclaration_Editor._QueryFunction_NodeCondition_1197035916697(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createRowCell2(context, node));
    }
    return editorCell;
  }

  public EditorCell createRowCell3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    TargetDeclaration_Editor.setupBasic_RowCell3(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell1(context, node));
    editorCell.addEditorCell(this.createPropertyListList(context, node));
    return editorCell;
  }

  public EditorCell createRowCell4(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    TargetDeclaration_Editor.setupBasic_RowCell4(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell2(context, node));
    editorCell.addEditorCell(this.createTaskCallList(context, node));
    return editorCell;
  }

  public EditorCell createColumnCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    TargetDeclaration_Editor.setupBasic_ColumnCell(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    if(TargetDeclaration_Editor._QueryFunction_NodeCondition_1201260045444(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createRowCell(context, node));
    }
    editorCell.addEditorCell(this.createRowCell1(context, node));
    editorCell.addEditorCell(this.createRowCell3(context, node));
    editorCell.addEditorCell(this.createRowCell4(context, node));
    editorCell.addEditorCell(this.createConstantCell5(context, node, ""));
    return editorCell;
  }

  public EditorCell createTargetDeclaration_EditorComponentCell(EditorContext context, SNode node) {
    if(this.myTargetDeclaration_EditorComponent == null) {
      this.myTargetDeclaration_EditorComponent = new TargetDeclaration_EditorComponent(node);
    }
    EditorCell componentCell = this.myTargetDeclaration_EditorComponent.createEditorCell(context);
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.addEditorCell(componentCell);
    TargetDeclaration_Editor.setupBasic_TargetDeclaration_EditorComponentCell(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createTargetDeclaration_EditorComponentCell1(EditorContext context, SNode node) {
    if(this.myTargetDeclaration_EditorComponent1 == null) {
      this.myTargetDeclaration_EditorComponent1 = new TargetDeclaration_EditorComponent(node);
    }
    EditorCell componentCell = this.myTargetDeclaration_EditorComponent1.createEditorCell(context);
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.addEditorCell(componentCell);
    TargetDeclaration_Editor.setupBasic_TargetDeclaration_EditorComponentCell1(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstantCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    TargetDeclaration_Editor.setupBasic_ConstantCell(editorCell, node, context);
    TargetDeclaration_Editor.setupLabel_ConstantCell(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstantCell1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    TargetDeclaration_Editor.setupBasic_ConstantCell1(editorCell, node, context);
    TargetDeclaration_Editor.setupLabel_ConstantCell1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstantCell2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    TargetDeclaration_Editor.setupBasic_ConstantCell2(editorCell, node, context);
    TargetDeclaration_Editor.setupLabel_ConstantCell2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstantCell5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    TargetDeclaration_Editor.setupBasic_ConstantCell5(editorCell, node, context);
    TargetDeclaration_Editor.setupLabel_ConstantCell5(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createPropertyListList(EditorContext context, SNode node) {
    if(this.myPropertyListListHandler_propertyListList_ == null) {
      this.myPropertyListListHandler_propertyListList_ = new TargetDeclaration_Editor._RefNodeListHandler4(node, "propertyList", context);
    }
    EditorCell_Collection editorCell = this.myPropertyListListHandler_propertyListList_.createCells(context, new CellLayout_Vertical(), false);
    TargetDeclaration_Editor.setupBasic_PropertyListList(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myPropertyListListHandler_propertyListList_.getElementRole());
    return editorCell;
  }

  public EditorCell createTaskCallList(EditorContext context, SNode node) {
    if(this.myTaskCallListHandler_taskCallList_ == null) {
      this.myTaskCallListHandler_taskCallList_ = new TargetDeclaration_Editor._RefNodeListHandler5(node, "taskCall", context);
    }
    EditorCell_Collection editorCell = this.myTaskCallListHandler_taskCallList_.createCells(context, new CellLayout_Vertical(), false);
    TargetDeclaration_Editor.setupBasic_TaskCallList(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myTaskCallListHandler_taskCallList_.getElementRole());
    return editorCell;
  }

  public EditorCell createIndentCell1(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createIndentCell2(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createShortDescriptionCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    TargetDeclaration_Editor.setupBasic_ShortDescriptionCell(editorCell, node, context);
    if(editorCell instanceof EditorCell_Label) {
      TargetDeclaration_Editor.setupLabel_ShortDescriptionCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createShortDescriptionCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("shortDescription");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createShortDescriptionCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createCellModel_ConceptPropertyinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    TargetDeclaration_Editor.setupBasic_CellModel_ConceptProperty(editorCell, node, context);
    if(editorCell instanceof EditorCell_Label) {
      TargetDeclaration_Editor.setupLabel_CellModel_ConceptProperty((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createCellModel_ConceptProperty(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("alias");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createCellModel_ConceptPropertyinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createNameCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    TargetDeclaration_Editor.setupBasic_NameCell(editorCell, node, context);
    if(editorCell instanceof EditorCell_Label) {
      TargetDeclaration_Editor.setupLabel_NameCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createNameCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
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

  public static class _RefNodeListHandler4 extends RefNodeListHandler {

    public  _RefNodeListHandler4(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    private static void setupBasic_ConstantCell3(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1200419175278");
      BuildLanguageStyle_StyleSheet.PROMPTING.apply(editorCell);
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
      return this.createConstantCell3(context, node, "<property declarations>");
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
      TargetDeclaration_Editor._RefNodeListHandler4.setupBasic_ConstantCell3(editorCell, node, context);
      TargetDeclaration_Editor._RefNodeListHandler4.setupLabel_ConstantCell3(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }

}
  public static class _RefNodeListHandler5 extends RefNodeListHandler {

    public  _RefNodeListHandler5(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    private static void setupBasic_ConstantCell4(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1200419207103");
      BuildLanguageStyle_StyleSheet.PROMPTING.apply(editorCell);
    }

    private static void setupLabel_ConstantCell4(EditorCell_Label editorCell, SNode node, EditorContext context) {
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
      return this.createConstantCell4(context, node, "<task calls>");
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

    public EditorCell createConstantCell4(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      TargetDeclaration_Editor._RefNodeListHandler5.setupBasic_ConstantCell4(editorCell, node, context);
      TargetDeclaration_Editor._RefNodeListHandler5.setupLabel_ConstantCell4(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }

}

}

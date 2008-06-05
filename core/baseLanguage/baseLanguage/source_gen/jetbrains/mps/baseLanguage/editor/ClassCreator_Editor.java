package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_DeleteNode;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeListHandlerElementKeyMap;
import jetbrains.mps.nodeEditor.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.DefaultChildSubstituteInfo;

public class ClassCreator_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myIMethodCall_actualArguments2;
  /* package */AbstractCellListHandler myListHandler_6179_0;

  private static void setupBasic_CollectionCell6179_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell6179_0");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_constructorDeclarationRefCell6179_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_constructorDeclarationRefCell6179_0");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_CollectionCell6179_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell6179_01");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell6179_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell6179_0");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_typeParameterRefNodeListCell6179_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_typeParameterRefNodeListCell6179_0");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell6179_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell6179_01");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_IMethodCall_actualArgumentsComponentCell6179_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_IMethodCall_actualArgumentsComponentCell6179_0");
    editorCell.setDrawBorder(false);
  }

  private static void setupLabel_constructorDeclarationRefCell6179_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell6179_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_typeParameterRefNodeListCell6179_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell6179_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition6179_0(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getCount(node, "typeParameter") > 0;
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_CollectionCell6179_0(context, node);
  }

  public EditorCell create_CollectionCell6179_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell6179_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_constructorDeclarationRefCell6179_0(context, node));
    if (renderingCondition6179_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.create_CollectionCell6179_01(context, node));
    }
    editorCell.addEditorCell(this.create_IMethodCall_actualArgumentsComponentCell6179_0(context, node));
    return editorCell;
  }

  public EditorCell create_CollectionCell6179_01(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell6179_01(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell6179_0(context, node, "<"));
    editorCell.addEditorCell(this.create_typeParameterRefNodeListCell6179_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell6179_01(context, node, ">"));
    return editorCell;
  }

  public EditorCell create_IMethodCall_actualArgumentsComponentCell6179_0(EditorContext context, SNode node) {
    if (this.myIMethodCall_actualArguments2 == null) {
      this.myIMethodCall_actualArguments2 = new IMethodCall_actualArguments(node);
    }
    EditorCell editorCell = this.myIMethodCall_actualArguments2.createEditorCell(context);
    setupBasic_IMethodCall_actualArgumentsComponentCell6179_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell create_ConstantCell6179_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell6179_0(editorCell, node, context);
    setupLabel_ConstantCell6179_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell6179_01(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell6179_01(editorCell, node, context);
    setupLabel_ConstantCell6179_01(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_typeParameterRefNodeListCell6179_0(EditorContext context, SNode node) {
    if (this.myListHandler_6179_0 == null) {
      this.myListHandler_6179_0 = new ClassCreator_Editor.typeParameterListHandler_6179_0(node, "typeParameter", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_6179_0.createCells(context, new CellLayout_Horizontal(), false);
    setupBasic_typeParameterRefNodeListCell6179_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myListHandler_6179_0.getElementRole());
    return editorCell;
  }

  public EditorCell create_constructorDeclarationRefCell6179_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new ClassCreator_Editor._Inline24());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_constructorDeclarationRefCell6179_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_constructorDeclarationRefCell6179_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_constructorDeclarationRefCell6179_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("constructorDeclaration");
    provider.setNoTargetText("<no constructor declaration>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_constructorDeclarationRefCell6179_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public static class _Inline24 extends AbstractCellProvider {

    public _Inline24() {
      super();
    }

    private static void setupBasic_resolveInfoPropertyCell6179_0(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_resolveInfoPropertyCell6179_0");
      editorCell.setRightTransformAnchorTag("ext_1_RTransform");
    }

    private static void setupLabel_resolveInfoPropertyCell6179_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }


    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.create_resolveInfoPropertyCell6179_0(context, node);
    }

    public EditorCell create_resolveInfoPropertyCell6179_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_resolveInfoPropertyCell6179_0(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_resolveInfoPropertyCell6179_0((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell create_resolveInfoPropertyCell6179_0(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("resolveInfo");
      provider.setNoTargetText("");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.create_resolveInfoPropertyCell6179_0_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }

}
  public static class typeParameterListHandler_6179_0 extends RefNodeListHandler {

    public typeParameterListHandler_6179_0(SNode ownerNode, String childRole, EditorContext context) {
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
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteNode(elementNode));
          elementCell.addKeyMap(new RefNodeListHandlerElementKeyMap(this, ","));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      {
        EditorCell_Constant editorCell = new EditorCell_Constant(context, this.getOwner(), ",");
        editorCell.setSelectable(false);
        editorCell.setLayoutConstraint("");
        return editorCell;
      }
    }

}

}

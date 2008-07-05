package jetbrains.mps.bootstrap.smodelLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_DeleteNode;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeListHandlerElementKeyMap;
import jetbrains.mps.nodeEditor.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.DefaultChildSubstituteInfo;

public class StaticConceptMethodCall_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_18917_0;

  private static void setupBasic_CollectionCell18917_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell18917_0");
  }

  private static void setupBasic_conceptRefCell18917_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_conceptRefCell18917_0");
  }

  private static void setupBasic_ConstantCell18917_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell18917_01");
    BaseLanguageStyle_StyleSheet.DOT.apply(editorCell);
  }

  private static void setupBasic_methodDeclarationRefCell18917_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_methodDeclarationRefCell18917_0");
  }

  private static void setupBasic_ConstantCell18917_02(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell18917_02");
    BaseLanguageStyle_StyleSheet.LEFT_PAREN.apply(editorCell);
  }

  private static void setupBasic_actualArgumentRefNodeListCell18917_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_actualArgumentRefNodeListCell18917_0");
  }

  private static void setupBasic_ConstantCell18917_03(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell18917_03");
    BaseLanguageStyle_StyleSheet.RIGHT_PAREN.apply(editorCell);
  }

  private static void setupLabel_conceptRefCell18917_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell18917_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_methodDeclarationRefCell18917_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell18917_02(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_actualArgumentRefNodeListCell18917_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell18917_03(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_CollectionCell18917_0(context, node);
  }

  public EditorCell create_CollectionCell18917_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell18917_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_conceptRefCell18917_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell18917_01(context, node, "."));
    editorCell.addEditorCell(this.create_methodDeclarationRefCell18917_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell18917_02(context, node, "("));
    editorCell.addEditorCell(this.create_actualArgumentRefNodeListCell18917_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell18917_03(context, node, ")"));
    return editorCell;
  }

  public EditorCell create_ConstantCell18917_01(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell18917_01(editorCell, node, context);
    setupLabel_ConstantCell18917_01(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell18917_02(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell18917_02(editorCell, node, context);
    setupLabel_ConstantCell18917_02(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell18917_03(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell18917_03(editorCell, node, context);
    setupLabel_ConstantCell18917_03(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_actualArgumentRefNodeListCell18917_0(EditorContext context, SNode node) {
    if (this.myListHandler_18917_0 == null) {
      this.myListHandler_18917_0 = new StaticConceptMethodCall_Editor.actualArgumentListHandler_18917_0(node, "actualArgument", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_18917_0.createCells(context, new CellLayout_Horizontal(), false);
    setupBasic_actualArgumentRefNodeListCell18917_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myListHandler_18917_0.getElementRole());
    return editorCell;
  }

  public EditorCell create_conceptRefCell18917_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new StaticConceptMethodCall_Editor._Inline36());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_conceptRefCell18917_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_conceptRefCell18917_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_conceptRefCell18917_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("concept");
    provider.setNoTargetText("<no concept>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_conceptRefCell18917_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_methodDeclarationRefCell18917_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new StaticConceptMethodCall_Editor._Inline37());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_methodDeclarationRefCell18917_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_methodDeclarationRefCell18917_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_methodDeclarationRefCell18917_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("methodDeclaration");
    provider.setNoTargetText("<no methodDeclaration>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_methodDeclarationRefCell18917_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public static class _Inline36 extends AbstractCellProvider {

    public _Inline36() {
      super();
    }

    private static void setupBasic_namePropertyCell18917_0(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_namePropertyCell18917_0");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.PADDING_LEFT, 0.0);
            this.set(StyleAttributes.PADDING_RIGHT, 0.0);
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_namePropertyCell18917_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }


    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.create_namePropertyCell18917_0(context, node);
    }

    public EditorCell create_namePropertyCell18917_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_namePropertyCell18917_0(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_namePropertyCell18917_0((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell create_namePropertyCell18917_0(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.create_namePropertyCell18917_0_internal(context, node, provider);
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
  public static class _Inline37 extends AbstractCellProvider {

    public _Inline37() {
      super();
    }

    private static void setupBasic_namePropertyCell18917_01(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_namePropertyCell18917_01");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.PADDING_LEFT, 0.0);
            this.set(StyleAttributes.PADDING_RIGHT, 0.0);
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_namePropertyCell18917_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }


    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.create_namePropertyCell18917_01(context, node);
    }

    public EditorCell create_namePropertyCell18917_01_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_namePropertyCell18917_01(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_namePropertyCell18917_01((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell create_namePropertyCell18917_01(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.create_namePropertyCell18917_01_internal(context, node, provider);
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
  public static class actualArgumentListHandler_18917_0 extends RefNodeListHandler {

    public actualArgumentListHandler_18917_0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    private static void setupBasic_ConstantCell18917_0(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell18917_0");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.EDITABLE, true);
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_ConstantCell18917_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
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
      return this.create_ConstantCell18917_0(context, node, "");
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

    public EditorCell create_ConstantCell18917_0(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_ConstantCell18917_0(editorCell, node, context);
      setupLabel_ConstantCell18917_0(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }

}

}

package jetbrains.mps.build.packaging.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class Folder_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myConfigurationReferencesEditorComponent5234_0;
  /* package */AbstractCellProvider myConfigurationReferencesEditorComponent5234_1;
  /* package */AbstractCellProvider myICompositeComponentEditorComponenmt5234_0;
  /* package */AbstractCellProvider myIncludeExcludeEditorComponent5234_0;
  /* package */AbstractCellListHandler myListHandler_1203598761160;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1203598726332(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection1204116805241(context, node);
  }

  public EditorCell createCollection1203598726332(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12035987263321203598726332(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1203598730256(context, node));
    editorCell.addEditorCell(this.createCollection1203598754734(context, node));
    return editorCell;
  }

  public EditorCell createCollection1203598730256(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12035987302561203598730256(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConceptProperty1203599137432(context, node));
    editorCell.addEditorCell(this.createRefNode1205344608911(context, node));
    editorCell.addEditorCell(this.createConstant1203598738479(context, node, "from"));
    editorCell.addEditorCell(this.createRefNode1220982084139(context, node));
    editorCell.addEditorCell(this.createComponent1224596501354(context, node));
    editorCell.addEditorCell(this.createComponent1204128147077(context, node));
    return editorCell;
  }

  public EditorCell createCollection1203598754734(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12035987547341203598754734(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell5234_0(context, node));
    editorCell.addEditorCell(this.createRefNodeList1203598761160(context, node));
    return editorCell;
  }

  public EditorCell createCollection1204116805241(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12041168052411204116805241(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createComponent1206440350344(context, node));
    editorCell.addEditorCell(this.createComponent1204116811825(context, node));
    return editorCell;
  }

  public EditorCell createComponent1204116811825(EditorContext context, SNode node) {
    if (this.myConfigurationReferencesEditorComponent5234_0 == null) {
      this.myConfigurationReferencesEditorComponent5234_0 = new ConfigurationReferencesEditorComponent(node);
    }
    EditorCell editorCell = this.myConfigurationReferencesEditorComponent5234_0.createEditorCell(context);
    setupBasic_component_ConfigurationReferencesEditorComponent1204116811825(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent1204128147077(EditorContext context, SNode node) {
    if (this.myConfigurationReferencesEditorComponent5234_1 == null) {
      this.myConfigurationReferencesEditorComponent5234_1 = new ConfigurationReferencesEditorComponent(node);
    }
    EditorCell editorCell = this.myConfigurationReferencesEditorComponent5234_1.createEditorCell(context);
    setupBasic_component_ConfigurationReferencesEditorComponent1204128147077(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent1206440350344(EditorContext context, SNode node) {
    if (this.myICompositeComponentEditorComponenmt5234_0 == null) {
      this.myICompositeComponentEditorComponenmt5234_0 = new ICompositeComponentEditorComponenmt(node);
    }
    EditorCell editorCell = this.myICompositeComponentEditorComponenmt5234_0.createEditorCell(context);
    setupBasic_component_ICompositeComponentEditorComponenmt1206440350344(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent1224596501354(EditorContext context, SNode node) {
    if (this.myIncludeExcludeEditorComponent5234_0 == null) {
      this.myIncludeExcludeEditorComponent5234_0 = new IncludeExcludeEditorComponent(node);
    }
    EditorCell editorCell = this.myIncludeExcludeEditorComponent5234_0.createEditorCell(context);
    setupBasic_component_IncludeExcludeEditorComponent1224596501354(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant1203598738479(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12035987384791203598738479(editorCell, node, context);
    setupLabel_Constant_1203598738479_1203598738479(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList1203598761160(EditorContext context, SNode node) {
    if (this.myListHandler_1203598761160 == null) {
      this.myListHandler_1203598761160 = new Folder_Editor.entryListHandler_5234_0(node, "entry", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1203598761160.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_refNodeList_entry1203598761160(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(true);
    editorCell.setRole(this.myListHandler_1203598761160.getElementRole());
    return editorCell;
  }

  public EditorCell createIndentCell5234_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createConceptProperty1203599137432_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_conceptProperty_alias1203599137432(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_conceptProperty_alias_1203599137432((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createConceptProperty1203599137432(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createConceptProperty1203599137432_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1205344608911_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_title1205344608911(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_title_1205344608911((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1205344608911(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("title");
    provider.setNoTargetText("<no title>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1205344608911_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1220982084139_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_sourcePath1220982084139(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_sourcePath_1220982084139((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1220982084139(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("sourcePath");
    provider.setNoTargetText("<no sourcePath>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1220982084139_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_12035987263321203598726332(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1203598726332");
  }

  private static void setupBasic_Collection_12035987302561203598730256(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1203598730256");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12035987384791203598738479(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1203598738479");
    MPSLayoutStyles_StyleSheet.getKeyword(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_LEFT, new Padding(1.0, "spaces"));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12035987547341203598754734(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1203598754734");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Indent_12035987572361203598757236(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_1203598757236");
  }

  private static void setupBasic_refNodeList_entry1203598761160(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_entry");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_conceptProperty_alias1203599137432(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("conceptProperty_alias");
    MPSLayoutStyles_StyleSheet.getProjectComponent(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_12041168052411204116805241(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1204116805241");
  }

  private static void setupBasic_component_ConfigurationReferencesEditorComponent1204116811825(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("component_ConfigurationReferencesEditorComponent");
  }

  private static void setupBasic_component_ConfigurationReferencesEditorComponent1204128147077(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("component_ConfigurationReferencesEditorComponent");
  }

  private static void setupBasic_refNode_title1205344608911(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_component_ICompositeComponentEditorComponenmt1206440350344(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("component_ICompositeComponentEditorComponenmt");
  }

  private static void setupBasic_refNode_sourcePath1220982084139(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_component_IncludeExcludeEditorComponent1224596501354(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("component_IncludeExcludeEditorComponent");
  }

  private static void setupLabel_Constant_1203598738479_1203598738479(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_entry_1203598761160(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_conceptProperty_alias_1203599137432(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_title_1205344608911(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_sourcePath_1220982084139(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static class entryListHandler_5234_0 extends RefNodeListHandler {

    public entryListHandler_5234_0(SNode ownerNode, String childRole, EditorContext context) {
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
      emptyCell = this.createEmptyCell_internal(context, this.getOwner());
      this.installElementCellActions(super.getOwner(), null, emptyCell, context);
      return emptyCell;
    }

    public EditorCell createEmptyCell_internal(EditorContext context, SNode node) {
      return this.createConstant1203599044452(context, node, "<entries>");
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      return super.createSeparatorCell(context);
    }

    public EditorCell createConstant1203599044452(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_12035990444521203599044452(editorCell, node, context);
      setupLabel_Constant_1203599044452_1203599044452(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_12035990444521203599044452(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_1203599044452");
      MPSLayoutStyles_StyleSheet.getHint(editorCell).apply(editorCell);
    }

    private static void setupLabel_Constant_1203599044452_1203599044452(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}

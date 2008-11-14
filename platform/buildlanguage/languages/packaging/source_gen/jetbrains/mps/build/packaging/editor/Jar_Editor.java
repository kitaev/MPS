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
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class Jar_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myConfigurationReferencesEditorComponent1697_0;
  /* package */AbstractCellProvider myConfigurationReferencesEditorComponent1697_1;
  /* package */AbstractCellProvider myICompositeComponentEditorComponenmt1697_0;
  /* package */AbstractCellProvider myIncludeExcludeEditorComponent1697_0;
  /* package */AbstractCellListHandler myListHandler_1203598588660;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1203598537540(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection1204116827310(context, node);
  }

  public EditorCell createCollection1203598537540(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12035985375401203598537540(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1203599089957(context, node));
    editorCell.addEditorCell(this.createCollection1203598578375(context, node));
    return editorCell;
  }

  public EditorCell createCollection1203598578375(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12035985783751203598578375(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell1697_0(context, node));
    editorCell.addEditorCell(this.createRefNodeList1203598588660(context, node));
    return editorCell;
  }

  public EditorCell createCollection1203599089957(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12035990899571203599089957(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConceptProperty1203599093069(context, node));
    editorCell.addEditorCell(this.createRefNode1205344621976(context, node));
    editorCell.addEditorCell(this.createComponent1224596511516(context, node));
    editorCell.addEditorCell(this.createComponent1204128139480(context, node));
    return editorCell;
  }

  public EditorCell createCollection1204116827310(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12041168273101204116827310(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createComponent1206440342373(context, node));
    editorCell.addEditorCell(this.createComponent1204116832456(context, node));
    editorCell.addEditorCell(this.createCollection1209915715829(context, node));
    editorCell.addEditorCell(this.createCollection1209915741916(context, node));
    return editorCell;
  }

  public EditorCell createCollection1209915715829(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12099157158291209915715829(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1209915719081(context, node, "filemode"));
    editorCell.addEditorCell(this.createProperty1209915736914(context, node));
    return editorCell;
  }

  public EditorCell createCollection1209915741916(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12099157419161209915741916(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1209915749653(context, node, "dirmode"));
    editorCell.addEditorCell(this.createProperty1209915766282(context, node));
    return editorCell;
  }

  public EditorCell createComponent1204116832456(EditorContext context, SNode node) {
    if (this.myConfigurationReferencesEditorComponent1697_0 == null) {
      this.myConfigurationReferencesEditorComponent1697_0 = new ConfigurationReferencesEditorComponent(node);
    }
    EditorCell editorCell = this.myConfigurationReferencesEditorComponent1697_0.createEditorCell(context);
    setupBasic_component_ConfigurationReferencesEditorComponent1204116832456(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent1204128139480(EditorContext context, SNode node) {
    if (this.myConfigurationReferencesEditorComponent1697_1 == null) {
      this.myConfigurationReferencesEditorComponent1697_1 = new ConfigurationReferencesEditorComponent(node);
    }
    EditorCell editorCell = this.myConfigurationReferencesEditorComponent1697_1.createEditorCell(context);
    setupBasic_component_ConfigurationReferencesEditorComponent1204128139480(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent1206440342373(EditorContext context, SNode node) {
    if (this.myICompositeComponentEditorComponenmt1697_0 == null) {
      this.myICompositeComponentEditorComponenmt1697_0 = new ICompositeComponentEditorComponenmt(node);
    }
    EditorCell editorCell = this.myICompositeComponentEditorComponenmt1697_0.createEditorCell(context);
    setupBasic_component_ICompositeComponentEditorComponenmt1206440342373(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent1224596511516(EditorContext context, SNode node) {
    if (this.myIncludeExcludeEditorComponent1697_0 == null) {
      this.myIncludeExcludeEditorComponent1697_0 = new IncludeExcludeEditorComponent(node);
    }
    EditorCell editorCell = this.myIncludeExcludeEditorComponent1697_0.createEditorCell(context);
    setupBasic_component_IncludeExcludeEditorComponent1224596511516(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant1209915719081(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12099157190811209915719081(editorCell, node, context);
    setupLabel_Constant_1209915719081_1209915719081(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1209915749653(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12099157496531209915749653(editorCell, node, context);
    setupLabel_Constant_1209915749653_1209915749653(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList1203598588660(EditorContext context, SNode node) {
    if (this.myListHandler_1203598588660 == null) {
      this.myListHandler_1203598588660 = new Jar_Editor.entryListHandler_1697_0(node, "entry", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1203598588660.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_refNodeList_entry1203598588660(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(true);
    editorCell.setRole(this.myListHandler_1203598588660.getElementRole());
    return editorCell;
  }

  public EditorCell createIndentCell1697_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createConceptProperty1203599093069_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_conceptProperty_alias1203599093069(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_conceptProperty_alias_1203599093069((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createConceptProperty1203599093069(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createConceptProperty1203599093069_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1205344621976_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_title1205344621976(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_title_1205344621976((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1205344621976(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("title");
    provider.setNoTargetText("<no title>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1205344621976_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty1209915736914_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_filemode1209915736914(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_filemode_1209915736914((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1209915736914(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("filemode");
    provider.setNoTargetText("<no filemode>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty1209915736914_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty1209915766282_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_dirmode1209915766282(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_dirmode_1209915766282((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1209915766282(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("dirmode");
    provider.setNoTargetText("<no dirmode>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty1209915766282_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_12035985375401203598537540(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1203598537540");
  }

  private static void setupBasic_Collection_12035985783751203598578375(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1203598578375");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Indent_12035985808771203598580877(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_1203598580877");
  }

  private static void setupBasic_refNodeList_entry1203598588660(EditorCell editorCell, SNode node, EditorContext context) {
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

  private static void setupBasic_Collection_12035990899571203599089957(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1203599089957");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_conceptProperty_alias1203599093069(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("conceptProperty_alias");
    MPSLayoutStyles_StyleSheet.getProjectComponent(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_12041168273101204116827310(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1204116827310");
  }

  private static void setupBasic_component_ConfigurationReferencesEditorComponent1204116832456(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("component_ConfigurationReferencesEditorComponent");
  }

  private static void setupBasic_component_ConfigurationReferencesEditorComponent1204128139480(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("component_ConfigurationReferencesEditorComponent");
  }

  private static void setupBasic_refNode_title1205344621976(EditorCell editorCell, SNode node, EditorContext context) {
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_RIGHT, new Padding(1.0, "spaces"));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_component_ICompositeComponentEditorComponenmt1206440342373(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("component_ICompositeComponentEditorComponenmt");
  }

  private static void setupBasic_Collection_12099157158291209915715829(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1209915715829");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12099157190811209915719081(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1209915719081");
    MPSLayoutStyles_StyleSheet.getKeyword(editorCell).apply(editorCell);
  }

  private static void setupBasic_property_filemode1209915736914(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_filemode");
  }

  private static void setupBasic_Collection_12099157419161209915741916(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1209915741916");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12099157496531209915749653(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1209915749653");
    MPSLayoutStyles_StyleSheet.getKeyword(editorCell).apply(editorCell);
  }

  private static void setupBasic_property_dirmode1209915766282(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_dirmode");
  }

  private static void setupBasic_component_IncludeExcludeEditorComponent1224596511516(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("component_IncludeExcludeEditorComponent");
  }

  private static void setupLabel_refNodeList_entry_1203598588660(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_conceptProperty_alias_1203599093069(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_title_1205344621976(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1209915719081_1209915719081(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_filemode_1209915736914(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1209915749653_1209915749653(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_dirmode_1209915766282(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static class entryListHandler_1697_0 extends RefNodeListHandler {

    public entryListHandler_1697_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant1203599011357(context, node, "<entries>");
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

    public EditorCell createConstant1203599011357(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_12035990113571203599011357(editorCell, node, context);
      setupLabel_Constant_1203599011357_1203599011357(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_12035990113571203599011357(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_1203599011357");
      MPSLayoutStyles_StyleSheet.getHint(editorCell).apply(editorCell);
    }

    private static void setupLabel_Constant_1203599011357_1203599011357(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}

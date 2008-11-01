package jetbrains.mps.xmlSchema.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Component;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import javax.swing.JComponent;
import jetbrains.mps.ide.browser.HyperlinkUtil;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class EntitySet_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_1172952127148;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1172950299890(context, node);
  }

  public EditorCell createAlternation1172963331693(EditorContext context, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = EntitySet_Editor.renderingCondition3021_0(node, context, context.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createProperty1172963383860(context, node);
    } else
    {
      editorCell = EditorCell_Component.createComponentCell(context, node, EntitySet_Editor._QueryFunction_JComponent_1176495136463(node, context), "_1172963395100");
    }
    setupBasic_Alternation_11729633316931172963331693(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createCollection1172950299890(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11729502998901172950299890(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1172950419508(context, node));
    editorCell.addEditorCell(this.createConstant1172952324264(context, node, ""));
    editorCell.addEditorCell(this.createRefNodeList1172952127148(context, node));
    return editorCell;
  }

  public EditorCell createCollection1172950419508(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11729504195081172950419508(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1172950423045(context, node, "entity set"));
    editorCell.addEditorCell(this.createProperty1172950429516(context, node));
    editorCell.addEditorCell(this.createConstant1172955293279(context, node, ":"));
    editorCell.addEditorCell(this.createAlternation1172963331693(context, node));
    return editorCell;
  }

  public EditorCell createConstant1172950423045(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11729504230451172950423045(editorCell, node, context);
    setupLabel_Constant_1172950423045_1172950423045(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1172952324264(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11729523242641172952324264(editorCell, node, context);
    setupLabel_Constant_1172952324264_1172952324264(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1172955293279(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11729552932791172955293279(editorCell, node, context);
    setupLabel_Constant_1172955293279_1172955293279(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList1172952127148(EditorContext context, SNode node) {
    if (this.myListHandler_1172952127148 == null) {
      this.myListHandler_1172952127148 = new EntitySet_Editor.entityBlockListHandler_3021_0(node, "entityBlock", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1172952127148.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_refNodeList_entityBlock1172952127148(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myListHandler_1172952127148.getElementRole());
    return editorCell;
  }

  public EditorCell createProperty1172950429516_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_entitySetName1172950429516(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_entitySetName_1172950429516((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1172950429516(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("entitySetName");
    provider.setNoTargetText("<no entitySetName>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1172950429516_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty1172963383860_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_url1172963383860(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_url_1172963383860((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1172963383860(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("url");
    provider.setNoTargetText("<no url>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1172963383860_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11729502998901172950299890(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1172950299890");
  }

  private static void setupBasic_Collection_11729504195081172950419508(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1172950419508");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11729504230451172950423045(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1172950423045");
  }

  private static void setupBasic_property_entitySetName1172950429516(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_entitySetName");
  }

  private static void setupBasic_refNodeList_entityBlock1172952127148(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_entityBlock");
  }

  private static void setupBasic_Constant_11729523242641172952324264(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1172952324264");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11729552932791172955293279(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1172955293279");
  }

  private static void setupBasic_Alternation_11729633316931172963331693(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Alternation_1172963331693");
  }

  private static void setupBasic_property_url1172963383860(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_url");
  }

  private static void setupBasic_JComponent_11729633951001172963395100(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("JComponent_1172963395100");
  }

  private static void setupLabel_Constant_1172950423045_1172950423045(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_entitySetName_1172950429516(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_entityBlock_1172952127148(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1172952324264_1172952324264(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1172955293279_1172955293279(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_url_1172963383860(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition3021_0(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getString(node, "url") == null;
  }

  public static JComponent _QueryFunction_JComponent_1176495136463(SNode node, EditorContext editorContext) {
    return HyperlinkUtil.getHyperlinkComponent(SPropertyOperations.getString(node, "url"));
  }

  public static class entityBlockListHandler_3021_0 extends RefNodeListHandler {

    public entityBlockListHandler_3021_0(SNode ownerNode, String childRole, EditorContext context) {
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

}

}

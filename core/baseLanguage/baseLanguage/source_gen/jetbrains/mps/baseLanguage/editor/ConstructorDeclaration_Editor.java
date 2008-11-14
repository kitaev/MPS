package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.FocusPolicy;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandlerElementKeyMap;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;
import jetbrains.mps.nodeEditor.style.Padding;

public class ConstructorDeclaration_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider my_Component_Visibility5292_0;
  /* package */AbstractCellProvider my_GenericDeclaration_TypeVariables_Component5292_0;
  /* package */AbstractCellProvider my_DeprecatedPart5292_0;
  /* package */AbstractCellListHandler myListHandler_1138337100850;
  /* package */AbstractCellListHandler myListHandler_1165410808126;
  /* package */AbstractCellListHandler myListHandler_1188210475918;
  /* package */AbstractCellListHandler myListHandler_1188210485994;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1075139052657(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection1188210485491(context, node);
  }

  public EditorCell createAlternation1165410808112(EditorContext context, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = ConstructorDeclaration_Editor.renderingCondition5292_0(node, context, context.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createCollection1165410808124(context, node);
    } else
    {
      editorCell = this.createConstant1165410808123(context, node, "{");
    }
    setupBasic_Alternation_11654108081121165410808112(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createCollection1075139052657(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_10751390526571075139052657(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createComponent1223638558798(context, node));
    if (renderingCondition5292_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection1188210475917(context, node));
    }
    editorCell.addEditorCell(this.createCollection1075139052658(context, node));
    editorCell.addEditorCell(this.createCollection1075139937803(context, node));
    editorCell.addEditorCell(this.createConstant1075139395584(context, node, "}"));
    if (renderingCondition5292_3(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1208702945942(context, node, ""));
    }
    return editorCell;
  }

  public EditorCell createCollection1075139052658(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_10751390526581075139052658(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createComponent1178547839561(context, node));
    if (renderingCondition5292_2(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createComponent1203413371733(context, node));
    }
    editorCell.addEditorCell(this.createProperty1107467684674(context, node));
    editorCell.addEditorCell(this.createConstant1075140096042(context, node, "("));
    editorCell.addEditorCell(this.createRefNodeList1138337100850(context, node));
    editorCell.addEditorCell(this.createConstant1075140096043(context, node, ")"));
    editorCell.addEditorCell(this.createAlternation1165410808112(context, node));
    return editorCell;
  }

  public EditorCell createCollection1075139937803(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_10751399378031075139937803(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell5292_0(context, node));
    editorCell.addEditorCell(this.createRefNode1075139937805(context, node));
    return editorCell;
  }

  public EditorCell createCollection1165410808124(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11654108081241165410808124(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1165410808125(context, node, "throws"));
    editorCell.addEditorCell(this.createRefNodeList1165410808126(context, node));
    editorCell.addEditorCell(this.createConstant1165410808127(context, node, "{"));
    return editorCell;
  }

  public EditorCell createCollection1188210475917(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11882104759171188210475917(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createRefNodeList1188210475918(context, node));
    return editorCell;
  }

  public EditorCell createCollection1188210485491(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11882104854911188210485491(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1188210485992(context, node));
    editorCell.addEditorCell(this.createRefNodeList1188210485994(context, node));
    return editorCell;
  }

  public EditorCell createCollection1188210485992(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11882104859921188210485992(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1188210485993(context, node, "annotations:"));
    return editorCell;
  }

  public EditorCell createComponent1178547839561(EditorContext context, SNode node) {
    if (this.my_Component_Visibility5292_0 == null) {
      this.my_Component_Visibility5292_0 = new _Component_Visibility(node);
    }
    EditorCell editorCell = this.my_Component_Visibility5292_0.createEditorCell(context);
    setupBasic_component__Component_Visibility1178547839561(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent1203413371733(EditorContext context, SNode node) {
    if (this.my_GenericDeclaration_TypeVariables_Component5292_0 == null) {
      this.my_GenericDeclaration_TypeVariables_Component5292_0 = new _GenericDeclaration_TypeVariables_Component(node);
    }
    EditorCell editorCell = this.my_GenericDeclaration_TypeVariables_Component5292_0.createEditorCell(context);
    setupBasic_component__GenericDeclaration_TypeVariables_Component1203413371733(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent1223638558798(EditorContext context, SNode node) {
    if (this.my_DeprecatedPart5292_0 == null) {
      this.my_DeprecatedPart5292_0 = new _DeprecatedPart(node);
    }
    EditorCell editorCell = this.my_DeprecatedPart5292_0.createEditorCell(context);
    setupBasic_component__DeprecatedPart1223638558798(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant1075139395584(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_10751393955841075139395584(editorCell, node, context);
    setupLabel_Constant_1075139395584_1075139395584(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1075140096042(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_10751400960421075140096042(editorCell, node, context);
    setupLabel_Constant_1075140096042_1075140096042(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1075140096043(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_10751400960431075140096043(editorCell, node, context);
    setupLabel_Constant_1075140096043_1075140096043(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1165410808123(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11654108081231165410808123(editorCell, node, context);
    setupLabel_Constant_1165410808123_1165410808123(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1165410808125(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11654108081251165410808125(editorCell, node, context);
    setupLabel_Constant_1165410808125_1165410808125(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1165410808127(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11654108081271165410808127(editorCell, node, context);
    setupLabel_Constant_1165410808127_1165410808127(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1188210485993(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11882104859931188210485993(editorCell, node, context);
    setupLabel_Constant_1188210485993_1188210485993(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1208702945942(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12087029459421208702945942(editorCell, node, context);
    setupLabel_Constant_1208702945942_1208702945942(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList1138337100850(EditorContext context, SNode node) {
    if (this.myListHandler_1138337100850 == null) {
      this.myListHandler_1138337100850 = new ConstructorDeclaration_Editor.parameterListHandler_5292_0(node, "parameter", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1138337100850.createCells(context, new CellLayout_Horizontal(), false);
    setupBasic_refNodeList_parameter1138337100850(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_1138337100850.getElementRole());
    return editorCell;
  }

  public EditorCell createRefNodeList1165410808126(EditorContext context, SNode node) {
    if (this.myListHandler_1165410808126 == null) {
      this.myListHandler_1165410808126 = new ConstructorDeclaration_Editor.throwsItemListHandler_5292_0(node, "throwsItem", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1165410808126.createCells(context, new CellLayout_Horizontal(), false);
    setupBasic_refNodeList_throwsItem1165410808126(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_1165410808126.getElementRole());
    return editorCell;
  }

  public EditorCell createRefNodeList1188210475918(EditorContext context, SNode node) {
    if (this.myListHandler_1188210475918 == null) {
      this.myListHandler_1188210475918 = new ConstructorDeclaration_Editor.annotationListHandler_5292_0(node, "annotation", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1188210475918.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_refNodeList_annotation1188210475918(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_1188210475918.getElementRole());
    return editorCell;
  }

  public EditorCell createRefNodeList1188210485994(EditorContext context, SNode node) {
    if (this.myListHandler_1188210485994 == null) {
      this.myListHandler_1188210485994 = new ConstructorDeclaration_Editor.annotationListHandler_5292_1(node, "annotation", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1188210485994.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_refNodeList_annotation1188210485994(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_1188210485994.getElementRole());
    return editorCell;
  }

  public EditorCell createIndentCell5292_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createRefNode1075139937805_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_body1075139937805(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_body_1075139937805((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1075139937805(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("body");
    provider.setNoTargetText("<no body>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1075139937805_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty1107467684674_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_name1107467684674(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_name_1107467684674((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1107467684674(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<constructor>");
    provider.setReadOnly(true);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1107467684674_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_10751390526571075139052657(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1075139052657");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_10751390526581075139052658(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1075139052658");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_10751393955841075139395584(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1075139395584");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, true);
          this.set(StyleAttributes.EDITABLE, true);
          this.set(StyleAttributes.POSITION, "next-line");
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_10751399378031075139937803(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1075139937803");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
          this.set(StyleAttributes.POSITION, "indented");
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_body1075139937805(EditorCell editorCell, SNode node, EditorContext context) {
    if (true) {
      editorCell.setFocusPolicy(FocusPolicy.FIRST_EDITABLE_CELL);
    }
  }

  private static void setupBasic_Constant_10751400960421075140096042(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1075140096042");
    BaseLanguageStyle_StyleSheet.getLeftParen(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_10751400960431075140096043(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1075140096043");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
    _BaseMethodDeclaration_Actions.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_property_name1107467684674(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_name");
    BaseLanguageStyle_StyleSheet.getMethodName(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.EDITABLE, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNodeList_parameter1138337100850(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_parameter");
  }

  private static void setupBasic_Alternation_11654108081121165410808112(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Alternation_1165410808112");
  }

  private static void setupBasic_Constant_11654108081231165410808123(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1165410808123");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
    editorCell.addKeyMap(new InsertFirstStatement_KeyMap());
  }

  private static void setupBasic_Collection_11654108081241165410808124(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1165410808124");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11654108081251165410808125(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1165410808125");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_refNodeList_throwsItem1165410808126(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_throwsItem");
  }

  private static void setupBasic_Constant_11654108081271165410808127(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1165410808127");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
    editorCell.addKeyMap(new InsertFirstStatement_KeyMap());
  }

  private static void setupBasic_component__Component_Visibility1178547839561(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("component__Component_Visibility");
  }

  private static void setupBasic_Collection_11882104759171188210475917(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1188210475917");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNodeList_annotation1188210475918(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_annotation");
  }

  private static void setupBasic_Collection_11882104854911188210485491(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1188210485491");
  }

  private static void setupBasic_Collection_11882104859921188210485992(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1188210485992");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11882104859931188210485993(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1188210485993");
  }

  private static void setupBasic_refNodeList_annotation1188210485994(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_annotation");
  }

  private static void setupBasic_component__GenericDeclaration_TypeVariables_Component1203413371733(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("component__GenericDeclaration_TypeVariables_Component");
  }

  private static void setupBasic_Constant_12087029459421208702945942(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1208702945942");
  }

  private static void setupBasic_Indent_12150118544911215011854491(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_1215011854491");
  }

  private static void setupBasic_component__DeprecatedPart1223638558798(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("component__DeprecatedPart");
  }

  private static void setupLabel_Constant_1075139395584_1075139395584(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_body_1075139937805(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1075140096042_1075140096042(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1075140096043_1075140096043(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_name_1107467684674(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_parameter_1138337100850(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1165410808123_1165410808123(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1165410808125_1165410808125(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_throwsItem_1165410808126(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1165410808127_1165410808127(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_annotation_1188210475918(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1188210485993_1188210485993(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_annotation_1188210485994(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1208702945942_1208702945942(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition5292_0(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getCount(node, "throwsItem") > 0;
  }

  public static boolean renderingCondition5292_1(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getCount(node, "annotation") > 0;
  }

  public static boolean renderingCondition5292_2(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getCount(node, "typeVariableDeclaration") > 0;
  }

  public static boolean renderingCondition5292_3(SNode node, EditorContext editorContext, IScope scope) {
    return SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.AnonymousClass", false, false) == null;
  }

  public static class parameterListHandler_5292_0 extends RefNodeListHandler {

    public parameterListHandler_5292_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant1138337100851(context, node, "");
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
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
        return editorCell;
      }
    }

    public EditorCell createConstant1138337100851(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_11383371008511138337100851(editorCell, node, context);
      setupLabel_Constant_1138337100851_1138337100851(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_11383371008511138337100851(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_1138337100851");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.SELECTABLE, true);
            this.set(StyleAttributes.EDITABLE, true);
            this.set(StyleAttributes.PADDING_LEFT, new Padding(0.0, "spaces"));
            this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, "spaces"));
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_Constant_1138337100851_1138337100851(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}
  public static class throwsItemListHandler_5292_0 extends RefNodeListHandler {

    public throwsItemListHandler_5292_0(SNode ownerNode, String childRole, EditorContext context) {
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
        return editorCell;
      }
    }

}
  public static class annotationListHandler_5292_0 extends RefNodeListHandler {

    public annotationListHandler_5292_0(SNode ownerNode, String childRole, EditorContext context) {
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
  public static class annotationListHandler_5292_1 extends RefNodeListHandler {

    public annotationListHandler_5292_1(SNode ownerNode, String childRole, EditorContext context) {
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

package jetbrains.mps.lang.plugin.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_Empty;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.lang.plugin.behavior.ActionDataParameterDeclaration_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.nodeEditor.AbstractCellProvider;

public class ActionDataParameterDeclaration_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1217252791143(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection1225192548672(context, node);
  }

  public EditorCell createCollection1217252791143(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12172527911431217252791143(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    if (renderingCondition6715_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createModelAccess1217254889877(context, node));
    }
    editorCell.addEditorCell(this.createProperty1217252785750(context, node));
    editorCell.addEditorCell(this.createConstant1217252809571(context, node, "key:"));
    editorCell.addEditorCell(this.createRefCell1217252906272(context, node));
    return editorCell;
  }

  public EditorCell createCollection1225192548265(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12251925482651225192548265(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1225192548267(context, node));
    editorCell.addEditorCell(this.createConstant1225192548273(context, node, ""));
    editorCell.addEditorCell(this.createModelAccess1225192548277(context, node));
    editorCell.addEditorCell(this.createConstant1225192548473(context, node, ""));
    editorCell.addEditorCell(this.createModelAccess1225192548477(context, node));
    return editorCell;
  }

  public EditorCell createCollection1225192548267(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12251925482671225192548267(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1225192548269(context, node, "is optional:"));
    editorCell.addEditorCell(this.createProperty1225192548271(context, node));
    return editorCell;
  }

  public EditorCell createCollection1225192548672(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12251925486721225192548672(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    if (renderingCondition6715_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection1225192548265(context, node));
    }
    return editorCell;
  }

  public EditorCell createConstant1217252809571(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12172528095711217252809571(editorCell, node, context);
    setupLabel_Constant_1217252809571_1217252809571(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1225192548269(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12251925482691225192548269(editorCell, node, context);
    setupLabel_Constant_1225192548269_1225192548269(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1225192548273(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12251925482731225192548273(editorCell, node, context);
    setupLabel_Constant_1225192548273_1225192548273(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1225192548473(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12251925484731225192548473(editorCell, node, context);
    setupLabel_Constant_1225192548473_1225192548473(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createModelAccess1217254889877(EditorContext context, SNode node) {
    ModelAccessor modelAccessor = this._modelAcessorFactory_1217254889877(context, node);
    EditorCell_Property editorCell = EditorCell_Property.create(context, modelAccessor, node);
    editorCell.setAction(CellActionType.DELETE, new CellAction_Empty());
    setupBasic_ModelAccess_12172548898771217254889877(editorCell, node, context);
    setupLabel_ModelAccess_1217254889877_1217254889877(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public ModelAccessor _modelAcessorFactory_1217254889877(final EditorContext editorContext, final SNode node) {
    return new ModelAccessor() {

      public String getText() {
        return BaseConcept_Behavior.call_getPresentation_1213877396640(ActionDataParameterDeclaration_Behavior.call_getType_1217257091542(node));
      }

      public void setText(String text) {
      }

      public boolean isValidText(String text) {
        return true;
      }

    };
  }

  public EditorCell createModelAccess1225192548277(EditorContext context, SNode node) {
    ModelAccessor modelAccessor = this._modelAcessorFactory_1225192548277(context, node);
    EditorCell_Property editorCell = EditorCell_Property.create(context, modelAccessor, node);
    editorCell.setAction(CellActionType.DELETE, new CellAction_Empty());
    setupBasic_ModelAccess_12251925482771225192548277(editorCell, node, context);
    setupLabel_ModelAccess_1225192548277_1225192548277(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public ModelAccessor _modelAcessorFactory_1225192548277(final EditorContext editorContext, final SNode node) {
    return new ModelAccessor() {

      public String getText() {
        SNode annotation = ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(node, "key", false), "annotation", true)).where(new IWhereFilter <SNode>() {

          public boolean accept(SNode it) {
            return SPropertyOperations.getString(SLinkOperations.getTarget(it, "annotation", false), "name").equals(SPropertyOperations.getString(SLinkOperations.getTarget(new _Quotations.QuotationClass_0().createNode(), "classifier", false), "name"));
          }

        }).first();
        if (annotation == null) {
          return "";
        }
        SNode description = ListSequence.fromList(SLinkOperations.getTargets(annotation, "value", true)).where(new IWhereFilter <SNode>() {

          public boolean accept(SNode it) {
            return SPropertyOperations.getString(SLinkOperations.getTarget(it, "key", false), "name").equals("description");
          }

        }).first();
        if (description == null) {
          return "";
        }
        String descriptionString = SPropertyOperations.getString(SLinkOperations.getTarget(description, "value", true), "value");
        return descriptionString;
      }

      public void setText(String text) {
      }

      public boolean isValidText(String text) {
        return true;
      }

    };
  }

  public EditorCell createModelAccess1225192548477(EditorContext context, SNode node) {
    ModelAccessor modelAccessor = this._modelAcessorFactory_1225192548477(context, node);
    EditorCell_Property editorCell = EditorCell_Property.create(context, modelAccessor, node);
    editorCell.setAction(CellActionType.DELETE, new CellAction_Empty());
    setupBasic_ModelAccess_12251925484771225192548477(editorCell, node, context);
    setupLabel_ModelAccess_1225192548477_1225192548477(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public ModelAccessor _modelAcessorFactory_1225192548477(final EditorContext editorContext, final SNode node) {
    return new ModelAccessor() {

      public String getText() {
        SNode annotation = ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(node, "key", false), "annotation", true)).where(new IWhereFilter <SNode>() {

          public boolean accept(SNode it) {
            return SPropertyOperations.getString(SLinkOperations.getTarget(it, "annotation", false), "name").equals(SPropertyOperations.getString(SLinkOperations.getTarget(new _Quotations.QuotationClass_1().createNode(), "classifier", false), "name"));
          }

        }).first();
        if (annotation == null) {
          return "";
        }
        SNode longDescription = ListSequence.fromList(SLinkOperations.getTargets(annotation, "value", true)).where(new IWhereFilter <SNode>() {

          public boolean accept(SNode it) {
            return SPropertyOperations.getString(SLinkOperations.getTarget(it, "key", false), "name").equals("longDescription");
          }

        }).last();
        if (longDescription == null) {
          return "";
        }
        String longDescriptionString = SPropertyOperations.getString(SLinkOperations.getTarget(longDescription, "value", true), "value");
        return longDescriptionString;
      }

      public void setText(String text) {
      }

      public boolean isValidText(String text) {
        return true;
      }

    };
  }

  public EditorCell createProperty1217252785750_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_name1217252785750(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_name_1217252785750((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1217252785750(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1217252785750_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefCell1217252906272_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new ActionDataParameterDeclaration_Editor._Inline6715_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refCell_key1217252906272(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refCell_key_1217252906272((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell1217252906272(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("key");
    provider.setNoTargetText("<no key>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefCell1217252906272_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty1225192548271_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_isOptional1225192548271(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_isOptional_1225192548271((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1225192548271(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("isOptional");
    provider.setNoTargetText("<no isOptional>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1225192548271_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_property_name1217252785750(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "property_name");
  }

  private static void setupBasic_Collection_12172527911431217252791143(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1217252791143");
  }

  private static void setupBasic_Constant_12172528095711217252809571(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1217252809571");
  }

  private static void setupBasic_refCell_key1217252906272(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "refCell_key");
  }

  private static void setupBasic_ModelAccess_12172548898771217254889877(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "ModelAccess_1217254889877");
  }

  private static void setupBasic_Collection_12251925482651225192548265(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1225192548265");
  }

  private static void setupBasic_Collection_12251925482671225192548267(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1225192548267");
  }

  private static void setupBasic_Constant_12251925482691225192548269(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1225192548269");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_property_isOptional1225192548271(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "property_isOptional");
  }

  private static void setupBasic_Constant_12251925482731225192548273(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1225192548273");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_ModelAccess_12251925482771225192548277(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "ModelAccess_1225192548277");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12251925484731225192548473(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1225192548473");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_ModelAccess_12251925484771225192548477(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "ModelAccess_1225192548477");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12251925486721225192548672(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1225192548672");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_property_name_1217252785750(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1217252809571_1217252809571(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refCell_key_1217252906272(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ModelAccess_1217254889877_1217254889877(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1225192548269_1225192548269(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_isOptional_1225192548271(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1225192548273_1225192548273(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ModelAccess_1225192548277_1225192548277(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1225192548473_1225192548473(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ModelAccess_1225192548477_1225192548477(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition6715_0(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getTarget(node, "key", false) != null;
  }

  public static boolean renderingCondition6715_1(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getTarget(node, "key", false) != null;
  }

  public static class _Inline6715_0 extends AbstractCellProvider {

    public _Inline6715_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty1217252908210(context, node);
    }

    public EditorCell createProperty1217252908210_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_property_name1217252908210(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_property_name_1217252908210((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty1217252908210(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createProperty1217252908210_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_property_name1217252908210(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, "property_name");
    }

    private static void setupLabel_property_name_1217252908210(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}

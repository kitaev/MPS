package jetbrains.mps.bootstrap.smodelLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;

public class SConceptLinkAccess_Editor extends DefaultNodeEditor {

  private static void setupBasic_CollectionCell19306_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell19306_0");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_conceptLinkDeclarationRefCell19306_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_conceptLinkDeclarationRefCell19306_0");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell19306_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell19306_0");
    editorCell.setDrawBorder(false);
    editorCell.setFontType(MPSFonts.ITALIC);
    editorCell.setLayoutConstraint("punctuation");
  }

  private static void setupLabel_conceptLinkDeclarationRefCell19306_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell19306_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.setTextColor(Color.darkGray);
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_CollectionCell19306_0(context, node);
  }

  public EditorCell create_CollectionCell19306_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell19306_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_conceptLinkDeclarationRefCell19306_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell19306_0(context, node, "/list"));
    return editorCell;
  }

  public EditorCell create_ConstantCell19306_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell19306_0(editorCell, node, context);
    setupLabel_ConstantCell19306_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_conceptLinkDeclarationRefCell19306_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new SConceptLinkAccess_Editor._Inline23());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_conceptLinkDeclarationRefCell19306_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_conceptLinkDeclarationRefCell19306_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_conceptLinkDeclarationRefCell19306_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("conceptLinkDeclaration");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_conceptLinkDeclarationRefCell19306_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public static class _Inline23 extends AbstractCellProvider {

    public _Inline23() {
      super();
    }

    private static void setupBasic_namePropertyCell19306_0(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_namePropertyCell19306_0");
      editorCell.setDrawBorder(false);
      editorCell.setFontType(MPSFonts.ITALIC);
    }

    private static void setupLabel_namePropertyCell19306_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
      editorCell.setTextColor(MPSColors.DARK_MAGENTA);
    }


    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.create_namePropertyCell19306_0(context, node);
    }

    public EditorCell create_namePropertyCell19306_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_namePropertyCell19306_0(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_namePropertyCell19306_0((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell create_namePropertyCell19306_0(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.create_namePropertyCell19306_0_internal(context, node, provider);
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

}

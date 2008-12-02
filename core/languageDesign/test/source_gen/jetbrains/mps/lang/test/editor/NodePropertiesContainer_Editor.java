/*
 * Copyright 2003-2008 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.lang.test.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandlerElementKeyMap;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class NodePropertiesContainer_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_1215518214434;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1215507934349(context, node);
  }

  public EditorCell createCollection1215507934349(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12155079343491215507934349(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1215507938748(context, node, "<node"));
    editorCell.addEditorCell(this.createAttributedNodeCell1215507949478(context, node));
    editorCell.addEditorCell(this.createConstant1217426780941(context, node, ""));
    editorCell.addEditorCell(this.createRefNodeList1215518214434(context, node));
    editorCell.addEditorCell(this.createConstant1215507972762(context, node, ">"));
    return editorCell;
  }

  public EditorCell createConstant1215507938748(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12155079387481215507938748(editorCell, node, context);
    setupLabel_Constant_1215507938748_1215507938748(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1215507972762(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12155079727621215507972762(editorCell, node, context);
    setupLabel_Constant_1215507972762_1215507972762(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1217426780941(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12174267809411217426780941(editorCell, node, context);
    setupLabel_Constant_1217426780941_1217426780941(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createAttributedNodeCell1215507949478(EditorContext context, SNode node) {
    IOperationContext opContext = context.getOperationContext();
    EditorManager manager = EditorManager.getInstanceFromContext(opContext);
    EditorCell editorCell = manager.getCurrentAttributedNodeCell();
    setupBasic_AttributedNodeCell_12155079494781215507949478(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createRefNodeList1215518214434(EditorContext context, SNode node) {
    if (this.myListHandler_1215518214434 == null) {
      this.myListHandler_1215518214434 = new NodePropertiesContainer_Editor.propertiesListHandler_5968_0(node, "properties", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1215518214434.createCells(context, new CellLayout_Horizontal(), false);
    setupBasic_refNodeList_properties1215518214434(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_1215518214434.getElementRole());
    return editorCell;
  }


  private static void setupBasic_Collection_12155079343491215507934349(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1215507934349");
    Annotation_Actions.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_Constant_12155079387481215507938748(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1215507938748");
    BaseLanguageStyle_StyleSheet.getAnnotation(editorCell).apply(editorCell);
    Annotation_Actions.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_AttributedNodeCell_12155079494781215507949478(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("AttributedNodeCell_1215507949478");
  }

  private static void setupBasic_Constant_12155079727621215507972762(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1215507972762");
    BaseLanguageStyle_StyleSheet.getAnnotation(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FIRST_POSITION_ALLOWED, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
    Annotation_Actions.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_refNodeList_properties1215518214434(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_properties");
  }

  private static void setupBasic_Constant_12174267809411217426780941(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1217426780941");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FIRST_POSITION_ALLOWED, false);
          this.set(StyleAttributes.LAST_POSITION_ALLOWED, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_Constant_1215507938748_1215507938748(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1215507972762_1215507972762(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_properties_1215518214434(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1217426780941_1217426780941(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static class propertiesListHandler_5968_0 extends RefNodeListHandler {

    public propertiesListHandler_5968_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant1215518225140(context, node, "...");
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

    public EditorCell createConstant1215518225140(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_12155182251401215518225140(editorCell, node, context);
      setupLabel_Constant_1215518225140_1215518225140(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_12155182251401215518225140(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_1215518225140");
      BaseLanguageStyle_StyleSheet.getAnnotation(editorCell).apply(editorCell);
    }

    private static void setupLabel_Constant_1215518225140_1215518225140(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}

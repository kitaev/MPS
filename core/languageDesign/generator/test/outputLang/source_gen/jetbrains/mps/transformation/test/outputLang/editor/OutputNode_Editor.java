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
package jetbrains.mps.transformation.test.outputLang.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandlerElementKeyMap;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class OutputNode_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_1202327137431;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1195170824388(context, node);
  }

  public EditorCell createCollection1195170824388(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11951708243881195170824388(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1195170839891(context, node, "output node:"));
    editorCell.addEditorCell(this.createCollection1195170861190(context, node));
    editorCell.addEditorCell(this.createCollection1202327125208(context, node));
    return editorCell;
  }

  public EditorCell createCollection1195170861190(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11951708611901195170861190(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1195170866770(context, node, "text"));
    editorCell.addEditorCell(this.createConstant1195170875944(context, node, ":"));
    editorCell.addEditorCell(this.createProperty1195170883727(context, node));
    return editorCell;
  }

  public EditorCell createCollection1202327125208(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12023271252081202327125208(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1202327125209(context, node, "children"));
    editorCell.addEditorCell(this.createConstant1202327125210(context, node, ":"));
    editorCell.addEditorCell(this.createRefNodeList1202327137431(context, node));
    return editorCell;
  }

  public EditorCell createConstant1195170839891(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11951708398911195170839891(editorCell, node, context);
    setupLabel_Constant_1195170839891_1195170839891(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1195170866770(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11951708667701195170866770(editorCell, node, context);
    setupLabel_Constant_1195170866770_1195170866770(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1195170875944(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11951708759441195170875944(editorCell, node, context);
    setupLabel_Constant_1195170875944_1195170875944(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1202327125209(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12023271252091202327125209(editorCell, node, context);
    setupLabel_Constant_1202327125209_1202327125209(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1202327125210(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12023271252101202327125210(editorCell, node, context);
    setupLabel_Constant_1202327125210_1202327125210(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList1202327137431(EditorContext context, SNode node) {
    if (this.myListHandler_1202327137431 == null) {
      this.myListHandler_1202327137431 = new OutputNode_Editor.outputChildListHandler_4121_0(node, "outputChild", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1202327137431.createCells(context, new CellLayout_Horizontal(), false);
    setupBasic_refNodeList_outputChild1202327137431(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_1202327137431.getElementRole());
    return editorCell;
  }

  public EditorCell createProperty1195170883727_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_text1195170883727(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_text_1195170883727((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1195170883727(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("text");
    provider.setNoTargetText("<no text>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty1195170883727_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11951708243881195170824388(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1195170824388");
  }

  private static void setupBasic_Constant_11951708398911195170839891(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1195170839891");
  }

  private static void setupBasic_Collection_11951708611901195170861190(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1195170861190");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11951708667701195170866770(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1195170866770");
  }

  private static void setupBasic_Constant_11951708759441195170875944(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1195170875944");
  }

  private static void setupBasic_property_text1195170883727(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_text");
  }

  private static void setupBasic_Collection_12023271252081202327125208(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1202327125208");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12023271252091202327125209(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1202327125209");
  }

  private static void setupBasic_Constant_12023271252101202327125210(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1202327125210");
  }

  private static void setupBasic_refNodeList_outputChild1202327137431(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_outputChild");
  }

  private static void setupLabel_Constant_1195170839891_1195170839891(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1195170866770_1195170866770(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1195170875944_1195170875944(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_text_1195170883727(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1202327125209_1202327125209(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1202327125210_1202327125210(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_outputChild_1202327137431(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static class outputChildListHandler_4121_0 extends RefNodeListHandler {

    public outputChildListHandler_4121_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant1202327144823(context, node, "..");
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

    public EditorCell createConstant1202327144823(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_12023271448231202327144823(editorCell, node, context);
      setupLabel_Constant_1202327144823_1202327144823(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_12023271448231202327144823(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_1202327144823");
    }

    private static void setupLabel_Constant_1202327144823_1202327144823(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}

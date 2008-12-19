package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import jetbrains.mps.lang.editor.behavior.EditorCellModel_Behavior;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_Empty;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;

public class _OpenTag extends AbstractCellProvider {

  public _OpenTag(SNode node) {
    super(node);
  }

  public EditorCell createEditorCell(EditorContext context) {
    return this.createEditorCell(context, this.getSNode());
  }

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createReadOnlyModelAccessor_4575_0(context, node);
  }

  public EditorCell createReadOnlyModelAccessor_4575_0(final EditorContext context, final SNode node) {
    EditorCell_Property editorCell = EditorCell_Property.create(context, new ModelAccessor() {

      public String getText() {
        return EditorCellModel_Behavior.call_getOpeningTag_1220340471382(node);
      }

      public void setText(String s) {
      }

      public boolean isValidText(String s) {
        return EqualUtil.equals(s, this.getText());
      }

    }, node);
    editorCell.setAction(CellActionType.DELETE, new CellAction_Empty());
    setupBasic_ReadOnlyModelAccessor_4575_0(editorCell, node, context);
    setupLabel_ReadOnlyModelAccessor_4575_0(editorCell, node, context);
    return editorCell;
  }


  private static void setupBasic_ReadOnlyModelAccessor_4575_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("ReadOnlyModelAccessor_4575_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.BACKGROUND_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return _OpenTag._StyleParameter_QueryFunction_1226320982079((cell == null ?
                null :
                cell.getSNode()
              ), (cell == null ?
                null :
                cell.getEditorContext()
              ));
            }

          });
          this.set(StyleAttributes.EDITABLE, false);
          this.set(StyleAttributes.DRAW_BORDER, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_ReadOnlyModelAccessor_4575_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static Color _StyleParameter_QueryFunction_1226320982079(SNode node, EditorContext editorContext) {
    return _EditorUtil.grayIfNotSelectable(node);
  }

}

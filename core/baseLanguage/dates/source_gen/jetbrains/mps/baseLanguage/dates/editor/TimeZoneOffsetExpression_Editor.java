package jetbrains.mps.baseLanguage.dates.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_Empty;
import org.joda.time.DateTimeZone;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.DateTime;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;

public class TimeZoneOffsetExpression_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_5208_0(context, node);
  }

  public EditorCell createCollection_5208_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_5208_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createModelAccess_5208_0(context, node));
    return editorCell;
  }

  public EditorCell createModelAccess_5208_0(EditorContext context, SNode node) {
    ModelAccessor modelAccessor = this._modelAccessorFactory_5473692278135635842(context, node);
    EditorCell_Property editorCell = EditorCell_Property.create(context, modelAccessor, node);
    editorCell.setAction(CellActionType.DELETE, new CellAction_Empty());
    setupBasic_ModelAccess_5208_0(editorCell, node, context);
    setupLabel_ModelAccess_5208_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public ModelAccessor _modelAccessorFactory_5473692278135635842(final EditorContext editorContext, final SNode node) {
    return new ModelAccessor() {

      public String getText() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(SPropertyOperations.getInteger(node, "offsetmillis"));
        return DateTimeFormat.forPattern("ZZ").print(new DateTime(zone));
      }

      public void setText(String text) {
        try {
          DateTime dt = DateTimeFormat.forPattern("Z").withOffsetParsed().parseDateTime(text);
          if (dt.withZoneRetainFields(DateTimeZone.UTC).getMillis() == 0L) {
            SPropertyOperations.set(node, "offsetmillis", "" + (dt.getZone().getStandardOffset(0L)));
          }
        } catch (RuntimeException ignored) {
        }
      }

      public boolean isValidText(String text) {
        try {
          DateTime dt = DateTimeFormat.forPattern("Z").withOffsetParsed().parseDateTime(text);
          if (dt.withZoneRetainFields(DateTimeZone.UTC).getMillis() == 0L) {
            return true;
          }
        } catch (RuntimeException ignored) {
        }
        return false;
      }
    };
  }


  private static void setupBasic_Collection_5208_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_5208_0");
  }

  private static void setupBasic_ModelAccess_5208_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("ModelAccess_5208_0");
  }

  private static void setupLabel_ModelAccess_5208_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}

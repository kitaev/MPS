package jetbrains.mps.baseLanguage.dates.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import org.joda.time.DateTimeZone;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.DateTime;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_Empty;

public class TimeZoneOffsetExpression_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_5208_15l45z2enek8j(editorContext, node);
  }

  private EditorCell createCollection_5208_15l45z2enek8j(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_5208_15l45z2enek8j");
    editorCell.addEditorCell(this.createModelAccess_5208_15l45z2enenwi(editorContext, node));
    return editorCell;
  }

  private EditorCell createModelAccess_5208_15l45z2enenwi(final EditorContext editorContext, final SNode node) {
    ModelAccessor modelAccessor = new ModelAccessor() {
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
    EditorCell_Property editorCell = EditorCell_Property.create(editorContext, modelAccessor, node);
    editorCell.setAction(CellActionType.DELETE, new CellAction_Empty());
    editorCell.setCellId("ModelAccess_5208_15l45z2enenwi");
    editorCell.setDefaultText("");
    return editorCell;
  }
}

package jetbrains.mps.nodeEditor.cells;

import org.jetbrains.annotations.NotNull;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorSettings;

public class EditorCell_Indent extends EditorCell_Label {
  public EditorCell_Indent(@NotNull EditorContext editorContext, SNode node) {
    super(editorContext, node, getIndentText());
    setSelectable(false);
    setEditable(false);

    getStyle().set(StyleAttributes.PADDING_LEFT_WITH_MEASURE, new Padding(0.0, "spaces"));
    getStyle().set(StyleAttributes.PADDING_RIGHT_WITH_MEASURE, new Padding(0.0, "spaces"));
  }

  private static String getIndentText() {
    String result = "";
    for (int i = 0; i < EditorSettings.getInstance().getIndentSize(); i++) {
      result += " ";
    }
    return result;
  }
}

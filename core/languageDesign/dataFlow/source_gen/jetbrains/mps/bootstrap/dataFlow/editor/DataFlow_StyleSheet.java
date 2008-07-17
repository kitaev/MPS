package jetbrains.mps.bootstrap.dataFlow.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.MPSColors;

public class DataFlow_StyleSheet {
  public static final Style INSTRUCTION = new Style() {
    {
      this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return DataFlow_StyleSheet.calculateColor(cell);
        }

      });
    }

  };
  public static final Style POSITION = new Style() {
    {
      this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return DataFlow_StyleSheet.calculateColor1(cell);
        }

      });
    }

  };
  public static final Style MAY_BE_UNREACHABLE = new Style() {
    {
      this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return DataFlow_StyleSheet.calculateColor2(cell);
        }

      });
    }

  };
  public static final Style LABEL = new Style() {
    {
      this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return DataFlow_StyleSheet.calculateColor3(cell);
        }

      });
    }

  };

  private static Color calculateColor(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_MAGENTA;
    return result;
  }

  private static Color calculateColor1(EditorCell cell) {
    Color result;
    result = Color.blue;
    return result;
  }

  private static Color calculateColor2(EditorCell cell) {
    Color result;
    result = Color.lightGray;
    return result;
  }

  private static Color calculateColor3(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_GREEN;
    return result;
  }

}

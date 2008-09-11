package jetbrains.mps.bootstrap.sharedConcepts.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.MPSColors;

public class SharedStyles_StyleSheet {
  public static final Style REFERENCE_DECORATED = new Style() {
    {
      this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return SharedStyles_StyleSheet.calculateColor6601_0(cell);
        }

      });
      this.set(StyleAttributes.FONT_STYLE, MPSFonts.ITALIC);
    }

  };
  public static final Style REFERENCE_ON_CONCEPT = new Style() {
    {
      this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return SharedStyles_StyleSheet.calculateColor6601_1(cell);
        }

      });
    }

  };
  public static final Style REFERENCE_ON_CONCEPTUAL_FEATURE = new Style() {
    {
      this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return SharedStyles_StyleSheet.calculateColor6601_2(cell);
        }

      });
      this.set(StyleAttributes.FONT_STYLE, MPSFonts.ITALIC);
    }

  };

  private static Color calculateColor6601_0(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_BLUE;
    return result;
  }

  private static Color calculateColor6601_1(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_MAGENTA;
    return result;
  }

  private static Color calculateColor6601_2(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_MAGENTA;
    return result;
  }

}

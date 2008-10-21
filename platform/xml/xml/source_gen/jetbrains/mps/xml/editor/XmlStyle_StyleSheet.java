package jetbrains.mps.xml.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;

public class XmlStyle_StyleSheet {

  public static Style getXmlElement(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

          public Color calculate(EditorCell cell) {
            return XmlStyle_StyleSheet._StyleParameter_QueryFunction_1216813809296((cell == null ?
              null :
              cell.getSNode()
            ), (cell == null ?
              null :
              cell.getEditorContext()
            ));
          }

        });
        this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
        this.set(StyleAttributes.PADDING_RIGHT, 0.0);
      }

    };
  }

  public static Style getXmlAttribute(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
        this.set(StyleAttributes.PADDING_RIGHT, 0.0);
        this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

          public Color calculate(EditorCell cell) {
            return XmlStyle_StyleSheet._StyleParameter_QueryFunction_1216811988465((cell == null ?
              null :
              cell.getSNode()
            ), (cell == null ?
              null :
              cell.getEditorContext()
            ));
          }

        });
      }

    };
  }

  public static Style getXmlEntity(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

          public Color calculate(EditorCell cell) {
            return XmlStyle_StyleSheet._StyleParameter_QueryFunction_1216813895290((cell == null ?
              null :
              cell.getSNode()
            ), (cell == null ?
              null :
              cell.getEditorContext()
            ));
          }

        });
        this.set(StyleAttributes.PADDING_RIGHT, 0.0);
      }

    };
  }

  public static Style getXmlText(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
        this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_GREEN);
        this.set(StyleAttributes.PADDING_RIGHT, 0.0);
      }

    };
  }

  public static Style getXmlComplexText(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.PADDING_RIGHT, 0.0);
        this.set(StyleAttributes.LAST_POSITION_ALLOWED, false);
        this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

          public Color calculate(EditorCell cell) {
            return XmlStyle_StyleSheet._StyleParameter_QueryFunction_1216817284631((cell == null ?
              null :
              cell.getSNode()
            ), (cell == null ?
              null :
              cell.getEditorContext()
            ));
          }

        });
      }

    };
  }

  public static Style getXmlEmptyCell(final EditorCell cell) {
    return new Style(cell) {
      {
        this.putAll(BaseLanguageStyle_StyleSheet.getEmptyCell(null));
        this.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
        this.set(StyleAttributes.PADDING_RIGHT, 0.0);
      }

    };
  }

  public static Style getXmlOperator(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
        this.set(StyleAttributes.PADDING_LEFT, 0.3);
        this.set(StyleAttributes.PADDING_RIGHT, 0.3);
        this.set(StyleAttributes.SELECTABLE, false);
      }

    };
  }

  public static Style getXmlOpenQuote(final EditorCell cell) {
    return new Style(cell) {
      {
        this.putAll(BaseLanguageStyle_StyleSheet.getLeftParen(null));
      }

    };
  }

  public static Style getXmlCloseQuote(final EditorCell cell) {
    return new Style(cell) {
      {
        this.putAll(BaseLanguageStyle_StyleSheet.getRightParen(null));
      }

    };
  }

  public static Style getXmlOpenParen(final EditorCell cell) {
    return new Style(cell) {
      {
        this.putAll(BaseLanguageStyle_StyleSheet.getLeftParen(null));
      }

    };
  }

  public static Style getXmlCloseParen(final EditorCell cell) {
    return new Style(cell) {
      {
        this.putAll(BaseLanguageStyle_StyleSheet.getRightParen(null));
      }

    };
  }

  public static Style getXmlCLOpenParen(final EditorCell cell) {
    return new Style(cell) {
      {
        this.putAll(XmlStyle_StyleSheet.getXmlOpenParen(null));
        this.set(StyleAttributes.TEXT_COLOR, MPSColors.lightGray);
      }

    };
  }

  public static Style getXmlCLCloseParen(final EditorCell cell) {
    return new Style(cell) {
      {
        this.putAll(XmlStyle_StyleSheet.getXmlCloseParen(null));
        this.set(StyleAttributes.TEXT_COLOR, MPSColors.lightGray);
      }

    };
  }

  public static Style getXmlOpenBrace(final EditorCell cell) {
    return new Style(cell) {
      {
        this.putAll(BaseLanguageStyle_StyleSheet.getLeftBrace(null));
      }

    };
  }

  public static Style getXmlCloseBrace(final EditorCell cell) {
    return new Style(cell) {
      {
        this.putAll(BaseLanguageStyle_StyleSheet.getRightBrace(null));
      }

    };
  }

  public static Color _StyleParameter_QueryFunction_1216811988465(SNode node, EditorContext editorContext) {
    return new Color(134, 114, 93);
  }

  public static Color _StyleParameter_QueryFunction_1216813809296(SNode node, EditorContext editorContext) {
    return new Color(134, 114, 93);
  }

  public static Color _StyleParameter_QueryFunction_1216813895290(SNode node, EditorContext editorContext) {
    return new Color(134, 114, 93);
  }

  public static Color _StyleParameter_QueryFunction_1216817284631(SNode node, EditorContext editorContext) {
    return new Color(134, 114, 93);
  }

}

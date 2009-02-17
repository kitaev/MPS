package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.MPSFonts;

public class BaseLanguageStyle_StyleSheet {

  public static Style getKeyWord(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
        this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
      }

    };
  }

  public static Style getCompactKeyWord(final EditorCell cell) {
    return new Style(cell) {
      {
        this.putAll(BaseLanguageStyle_StyleSheet.getKeyWord(null));
      }

    };
  }

  public static Style getComment(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.TEXT_COLOR, MPSColors.gray);
        this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
      }

    };
  }

  public static Style getJavaDoc(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.TEXT_COLOR, MPSColors.gray);
        this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD_ITALIC);
        this.set(StyleAttributes.UNDERLINED, true);
      }

    };
  }

  public static Style getField(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_MAGENTA);
        this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
      }

    };
  }

  public static Style getLocalVariable(final EditorCell cell) {
    return new Style(cell) {
      {
      }

    };
  }

  public static Style getParameter(final EditorCell cell) {
    return new Style(cell) {
      {
      }

    };
  }

  public static Style getStaticField(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_MAGENTA);
        this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD_ITALIC);
      }

    };
  }

  public static Style getStringLiteral(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_GREEN);
        this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
      }

    };
  }

  public static Style getNumericLiteral(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.TEXT_COLOR, MPSColors.blue);
      }

    };
  }

  public static Style getEmptyCell(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.TEXT_COLOR, MPSColors.lightGray);
      }

    };
  }

  public static Style getInstanceMethod(final EditorCell cell) {
    return new Style(cell) {
      {
      }

    };
  }

  public static Style getStaticMethod(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.FONT_STYLE, MPSFonts.ITALIC);
      }

    };
  }

  public static Style getAnnotation(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_GREEN);
      }

    };
  }

  public static Style getOperator(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
      }

    };
  }

  public static Style getParenthesis(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
      }

    };
  }

  public static Style getLeftParen(final EditorCell cell) {
    return new Style(cell) {
      {
        this.putAll(BaseLanguageStyle_StyleSheet.getParenthesis(null));
        this.set(StyleAttributes.PUNCTUATION_LEFT, true);
        this.set(StyleAttributes.PUNCTUATION_RIGTH, true);
      }

    };
  }

  public static Style getRightParen(final EditorCell cell) {
    return new Style(cell) {
      {
        this.putAll(BaseLanguageStyle_StyleSheet.getParenthesis(null));
        this.set(StyleAttributes.PUNCTUATION_LEFT, true);
        this.set(StyleAttributes.FIRST_POSITION_ALLOWED, false);
      }

    };
  }

  public static Style getBrace(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
      }

    };
  }

  public static Style getLeftBrace(final EditorCell cell) {
    return new Style(cell) {
      {
        this.putAll(BaseLanguageStyle_StyleSheet.getBrace(null));
      }

    };
  }

  public static Style getRightBrace(final EditorCell cell) {
    return new Style(cell) {
      {
        this.putAll(BaseLanguageStyle_StyleSheet.getBrace(null));
      }

    };
  }

  public static Style getBracket(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
      }

    };
  }

  public static Style getLeftBracket(final EditorCell cell) {
    return new Style(cell) {
      {
        this.putAll(BaseLanguageStyle_StyleSheet.getBracket(null));
        this.set(StyleAttributes.PUNCTUATION_LEFT, true);
        this.set(StyleAttributes.PUNCTUATION_RIGTH, true);
      }

    };
  }

  public static Style getRightBracket(final EditorCell cell) {
    return new Style(cell) {
      {
        this.putAll(BaseLanguageStyle_StyleSheet.getBracket(null));
        this.set(StyleAttributes.PUNCTUATION_LEFT, true);
      }

    };
  }

  public static Style getMethodName(final EditorCell cell) {
    return new Style(cell) {
      {
      }

    };
  }

  public static Style getVariableName(final EditorCell cell) {
    return new Style(cell) {
      {
      }

    };
  }

  public static Style getClassName(final EditorCell cell) {
    return new Style(cell) {
      {
      }

    };
  }

  public static Style getSemicolon(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.PUNCTUATION_LEFT, true);
        this.set(StyleAttributes.FIRST_POSITION_ALLOWED, false);
      }

    };
  }

  public static Style getDot(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.PUNCTUATION_LEFT, true);
        this.set(StyleAttributes.PUNCTUATION_RIGTH, true);
        this.set(StyleAttributes.SELECTABLE, false);
      }

    };
  }

}

package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.IStyle;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import java.awt.Color;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.MPSColors;

public class BaseLanguageStyle_StyleSheet {
  public static final IStyle KEY_WORD = new IStyle() {

    public void apply(EditorCell cell) {
      this.apply(cell, true);
    }

    public void apply(EditorCell cell, boolean recurive) {
      if(cell instanceof EditorCell_Label) {
        EditorCell_Label labelCell = (EditorCell_Label)cell;
        Color color = BaseLanguageStyle_StyleSheet.calculateColor(cell);
        labelCell.getTextLine().setTextColor(color);
      }
      cell.setFontType(MPSFonts.BOLD);
      if(recurive) {
        if(cell instanceof EditorCell_Collection) {
          EditorCell_Collection collection = (EditorCell_Collection)cell;
          for(EditorCell child : collection) {
            this.apply(child, true);
          }
        }
      }
    }

  };
  public static final IStyle COMMENT = new IStyle() {

    public void apply(EditorCell cell) {
      this.apply(cell, true);
    }

    public void apply(EditorCell cell, boolean recurive) {
      if(cell instanceof EditorCell_Label) {
        EditorCell_Label labelCell = (EditorCell_Label)cell;
        Color color = BaseLanguageStyle_StyleSheet.calculateColor1(cell);
        labelCell.getTextLine().setTextColor(color);
      }
      cell.setFontType(MPSFonts.BOLD);
      if(recurive) {
        if(cell instanceof EditorCell_Collection) {
          EditorCell_Collection collection = (EditorCell_Collection)cell;
          for(EditorCell child : collection) {
            this.apply(child, true);
          }
        }
      }
    }

  };
  public static final IStyle FIELD = new IStyle() {

    public void apply(EditorCell cell) {
      this.apply(cell, true);
    }

    public void apply(EditorCell cell, boolean recurive) {
      if(cell instanceof EditorCell_Label) {
        EditorCell_Label labelCell = (EditorCell_Label)cell;
        Color color = BaseLanguageStyle_StyleSheet.calculateColor2(cell);
        labelCell.getTextLine().setTextColor(color);
      }
      cell.setFontType(MPSFonts.BOLD);
      if(recurive) {
        if(cell instanceof EditorCell_Collection) {
          EditorCell_Collection collection = (EditorCell_Collection)cell;
          for(EditorCell child : collection) {
            this.apply(child, true);
          }
        }
      }
    }

  };
  public static final IStyle LOCAL_VARIABLE = new IStyle() {

    public void apply(EditorCell cell) {
      this.apply(cell, true);
    }

    public void apply(EditorCell cell, boolean recurive) {
      if(recurive) {
        if(cell instanceof EditorCell_Collection) {
          EditorCell_Collection collection = (EditorCell_Collection)cell;
          for(EditorCell child : collection) {
            this.apply(child, true);
          }
        }
      }
    }

  };
  public static final IStyle PARAMETER = new IStyle() {

    public void apply(EditorCell cell) {
      this.apply(cell, true);
    }

    public void apply(EditorCell cell, boolean recurive) {
      if(recurive) {
        if(cell instanceof EditorCell_Collection) {
          EditorCell_Collection collection = (EditorCell_Collection)cell;
          for(EditorCell child : collection) {
            this.apply(child, true);
          }
        }
      }
    }

  };
  public static final IStyle STATIC_FIELD = new IStyle() {

    public void apply(EditorCell cell) {
      this.apply(cell, true);
    }

    public void apply(EditorCell cell, boolean recurive) {
      if(cell instanceof EditorCell_Label) {
        EditorCell_Label labelCell = (EditorCell_Label)cell;
        Color color = BaseLanguageStyle_StyleSheet.calculateColor3(cell);
        labelCell.getTextLine().setTextColor(color);
      }
      cell.setFontType(MPSFonts.BOLD_ITALIC);
      if(recurive) {
        if(cell instanceof EditorCell_Collection) {
          EditorCell_Collection collection = (EditorCell_Collection)cell;
          for(EditorCell child : collection) {
            this.apply(child, true);
          }
        }
      }
    }

  };
  public static final IStyle STRING_LITERAL = new IStyle() {

    public void apply(EditorCell cell) {
      this.apply(cell, true);
    }

    public void apply(EditorCell cell, boolean recurive) {
      if(cell instanceof EditorCell_Label) {
        EditorCell_Label labelCell = (EditorCell_Label)cell;
        Color color = BaseLanguageStyle_StyleSheet.calculateColor4(cell);
        labelCell.getTextLine().setTextColor(color);
      }
      cell.setFontType(MPSFonts.BOLD);
      if(recurive) {
        if(cell instanceof EditorCell_Collection) {
          EditorCell_Collection collection = (EditorCell_Collection)cell;
          for(EditorCell child : collection) {
            this.apply(child, true);
          }
        }
      }
    }

  };
  public static final IStyle NUMERIC_LITERAL = new IStyle() {

    public void apply(EditorCell cell) {
      this.apply(cell, true);
    }

    public void apply(EditorCell cell, boolean recurive) {
      if(cell instanceof EditorCell_Label) {
        EditorCell_Label labelCell = (EditorCell_Label)cell;
        Color color = BaseLanguageStyle_StyleSheet.calculateColor5(cell);
        labelCell.getTextLine().setTextColor(color);
      }
      if(recurive) {
        if(cell instanceof EditorCell_Collection) {
          EditorCell_Collection collection = (EditorCell_Collection)cell;
          for(EditorCell child : collection) {
            this.apply(child, true);
          }
        }
      }
    }

  };
  public static final IStyle EMPTY_CELL = new IStyle() {

    public void apply(EditorCell cell) {
      this.apply(cell, true);
    }

    public void apply(EditorCell cell, boolean recurive) {
      if(cell instanceof EditorCell_Label) {
        EditorCell_Label labelCell = (EditorCell_Label)cell;
        Color color = BaseLanguageStyle_StyleSheet.calculateColor6(cell);
        labelCell.getTextLine().setTextColor(color);
      }
      if(recurive) {
        if(cell instanceof EditorCell_Collection) {
          EditorCell_Collection collection = (EditorCell_Collection)cell;
          for(EditorCell child : collection) {
            this.apply(child, true);
          }
        }
      }
    }

  };
  public static final IStyle INSTANCE_METHOD = new IStyle() {

    public void apply(EditorCell cell) {
      this.apply(cell, true);
    }

    public void apply(EditorCell cell, boolean recurive) {
      if(recurive) {
        if(cell instanceof EditorCell_Collection) {
          EditorCell_Collection collection = (EditorCell_Collection)cell;
          for(EditorCell child : collection) {
            this.apply(child, true);
          }
        }
      }
    }

  };
  public static final IStyle STATIC_METHOD = new IStyle() {

    public void apply(EditorCell cell) {
      this.apply(cell, true);
    }

    public void apply(EditorCell cell, boolean recurive) {
      cell.setFontType(MPSFonts.ITALIC);
      if(recurive) {
        if(cell instanceof EditorCell_Collection) {
          EditorCell_Collection collection = (EditorCell_Collection)cell;
          for(EditorCell child : collection) {
            this.apply(child, true);
          }
        }
      }
    }

  };
  public static final IStyle ANNOTATION = new IStyle() {

    public void apply(EditorCell cell) {
      this.apply(cell, true);
    }

    public void apply(EditorCell cell, boolean recurive) {
      if(cell instanceof EditorCell_Label) {
        EditorCell_Label labelCell = (EditorCell_Label)cell;
        Color color = BaseLanguageStyle_StyleSheet.calculateColor7(cell);
        labelCell.getTextLine().setTextColor(color);
      }
      if(recurive) {
        if(cell instanceof EditorCell_Collection) {
          EditorCell_Collection collection = (EditorCell_Collection)cell;
          for(EditorCell child : collection) {
            this.apply(child, true);
          }
        }
      }
    }

  };

  private static Color calculateColor(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_BLUE;
    return result;
  }

  private static Color calculateColor1(EditorCell cell) {
    Color result;
    result = Color.darkGray;
    return result;
  }

  private static Color calculateColor2(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_MAGENTA;
    return result;
  }

  private static Color calculateColor3(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_MAGENTA;
    return result;
  }

  private static Color calculateColor4(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_GREEN;
    return result;
  }

  private static Color calculateColor5(EditorCell cell) {
    Color result;
    result = Color.blue;
    return result;
  }

  private static Color calculateColor6(EditorCell cell) {
    Color result;
    result = Color.lightGray;
    return result;
  }

  private static Color calculateColor7(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_GREEN;
    return result;
  }

}

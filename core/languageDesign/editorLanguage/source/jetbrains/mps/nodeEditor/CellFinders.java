package jetbrains.mps.nodeEditor;

import jetbrains.mps.util.Condition;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.nodeEditor.cells.EditorCell_Error;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;

import java.util.Iterator;

public class CellFinders {
  public static final CellFinder<EditorCell_Label> FIRST_EDITABLE = new EditableCellCellFinder(true);
  public static final CellFinder<EditorCell_Label> LAST_EDITABLE = new EditableCellCellFinder(false);

  public static final CellFinder<EditorCell_Error> FIRST_ERROR = byClass(EditorCell_Error.class, true);
  public static final CellFinder<EditorCell_Error> LAST_ERROR = byClass(EditorCell_Error.class, true);

  public static final CellFinder<EditorCell> FIRST_SELECTABLE_LEAF = new SelectableLeafCellFinder(true);
  public static final CellFinder<EditorCell> LAST_SELECTABLE_LEAF = new SelectableLeafCellFinder(false);


  public static<C extends EditorCell> CellFinder<C> byClass(final Class<C> cls, final boolean first) {
    return new ByClassCellCellFinder<C>(cls, first);
  }

  public static CellFinder<EditorCell> byCondition(final Condition<EditorCell> condition, final boolean first) {
    return new ByConditionCellCellFinder(condition, first);
  }

  public static CellFinder<EditorCell> or(CellFinder<? extends EditorCell>... finders) {
    return new OrConditionFinder(finders);
  }

  private static abstract class BaseCellFinder<C extends EditorCell> implements CellFinder<C> {
    abstract boolean isSuitable(C cell);
    abstract Class<C> getCellClass();
    abstract boolean isFirstChild();

    public C find(EditorCell cell, boolean includeThis) {
      if (includeThis && getCellClass().isInstance(cell) && isSuitable((C) cell)) {
        return (C) cell;
      }

      if (cell instanceof EditorCell_Collection) {
        EditorCell_Collection collection = (EditorCell_Collection) cell;
        if (collection.isUnfoldedCollection()) {
          Iterator<EditorCell> iterator = isFirstChild() ? collection.iterator() : collection.reverseCellIterator();

          while (iterator.hasNext()) {
            EditorCell child = iterator.next();
            if (getCellClass().isInstance(child) && isSuitable((C) child)) {
              return (C) child;
            }

            C result = find(child, false);
            if (result != null) {
              return result;
            }
          }
        }
      }

      return null;
    }
  }

  private static class EditableCellCellFinder extends BaseCellFinder<EditorCell_Label> {
    private boolean myFirst;

    EditableCellCellFinder(boolean first) {
      myFirst = first;
    }

    public Class<EditorCell_Label> getCellClass() {
      return EditorCell_Label.class;
    }

    public boolean isSuitable(EditorCell_Label cell) {
      return cell.isEditable() && cell.isSelectable();
    }

    public boolean isFirstChild() {
      return myFirst;
    }
  }

  private static class SelectableLeafCellFinder extends BaseCellFinder<EditorCell> {
    private boolean myFirst;

    SelectableLeafCellFinder(boolean first) {
      myFirst = first;
    }

    public boolean isSuitable(EditorCell cell) {
      return cell.isSelectable() && !(cell instanceof EditorCell_Collection);
    }

    public Class<EditorCell> getCellClass() {
      return EditorCell.class;
    }

    public boolean isFirstChild() {
      return myFirst;
    }
  }

  private static class ByClassCellCellFinder<C extends EditorCell> extends BaseCellFinder<C> {
    private final Class<C> myCls;
    private final boolean myFirst;

    public ByClassCellCellFinder(Class<C> cls, boolean first) {
      myCls = cls;
      myFirst = first;
    }

    public boolean isSuitable(C cell) {
      return true;
    }

    public Class<C> getCellClass() {
      return myCls;
    }

    public boolean isFirstChild() {
      return myFirst;
    }
  }

  private static class ByConditionCellCellFinder extends BaseCellFinder<EditorCell> {
    private final Condition<EditorCell> myCondition;
    private final boolean myFirst;

    public ByConditionCellCellFinder(Condition<EditorCell> condition, boolean first) {
      myCondition = condition;
      myFirst = first;
    }

    public boolean isSuitable(EditorCell cell) {
      return myCondition.met(cell);
    }

    public Class<EditorCell> getCellClass() {
      return EditorCell.class;
    }

    public boolean isFirstChild() {
      return myFirst;
    }
  }

  private static class OrConditionFinder implements CellFinder<EditorCell> {
    private CellFinder<? extends EditorCell>[] myFinders;

    private OrConditionFinder(CellFinder<? extends EditorCell>[] finders) {
      myFinders = finders;
    }

    public EditorCell find(EditorCell cell, boolean includeThis) {
      for (CellFinder<? extends EditorCell> finder : myFinders) {
        EditorCell result = finder.find(cell, includeThis);
        if (result != null) return result;
      }
      return null;
    }
  }
}

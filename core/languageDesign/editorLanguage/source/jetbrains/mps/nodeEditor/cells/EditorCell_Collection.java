package jetbrains.mps.nodeEditor.cells;

import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.text.TextBuilder;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Flow;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.*;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.annotation.ForDebug;
import jetbrains.mps.util.NameUtil;

import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;

/**
 * Author: Sergey Dmitriev
 * Created Sep 14, 2003
 */
public class EditorCell_Collection extends EditorCell_Basic implements Iterable<EditorCell> {
  public static final String FOLDED_TEXT = "...";

  private ArrayList<EditorCell> myEditorCells = new ArrayList<EditorCell>();

  protected CellLayout myCellLayout;
  private AbstractCellListHandler myCellListHandler;

  private EditorCell_Brace myOpeningBrace;
  private EditorCell_Brace myClosingBrace;

  private MyLastCellSelectionListener myLastCellSelectionListener = new MyLastCellSelectionListener();
  private boolean myUsesBraces = false;
  private boolean myBracesEnabled = false;

  private int myArtificialBracesIndent = 0;

  private boolean myFolded = false;
  private boolean myCanBeFolded = false;

  private int myAscent = -1;
  private int myDescent = -1;

  @SuppressWarnings({"UnusedDeclaration"})
  public static EditorCell_Collection createVertical(EditorContext editorContext, SNode node, EditorCellListHandler handler) {
    return new EditorCell_Collection(editorContext, node, new CellLayout_Vertical(), handler);
  }

  @SuppressWarnings({"UnusedDeclaration"})
  public static EditorCell_Collection createHorizontal(EditorContext editorContext, SNode node, EditorCellListHandler handler) {
    return new EditorCell_Collection(editorContext, node, new CellLayout_Horizontal(), handler);
  }

  public static EditorCell_Collection createVertical(EditorContext editorContext, SNode node) {
    return new EditorCell_Collection(editorContext, node, new CellLayout_Vertical(), null);
  }

  public static EditorCell_Collection createHorizontal(EditorContext editorContext, SNode node) {
    return new EditorCell_Collection(editorContext, node, new CellLayout_Horizontal(), null);
  }

  @SuppressWarnings({"UnusedDeclaration"})
  public static EditorCell_Collection createFlow(EditorContext editorContext, SNode node, EditorCellListHandler handler) {
    return new EditorCell_Collection(editorContext, node, new CellLayout_Flow(), handler);
  }

  public static EditorCell_Collection createFlow(EditorContext editorContext, SNode node) {
    return new EditorCell_Collection(editorContext, node, new CellLayout_Flow(), null);
  }

  public static EditorCell_Collection create(EditorContext editorContext, SNode node, CellLayout cellLayout, AbstractCellListHandler handler) {
    return new EditorCell_Collection(editorContext, node, cellLayout, handler);
  }

  public boolean isFolded() {
    return myFolded;
  }

  public int getChildCount() {
    return myEditorCells.size();
  }

  public EditorCell getChildAt(int i) {
    return myEditorCells.get(i);
  }

  public CellLayout getCellLayout() {
    return myCellLayout;
  }

  @SuppressWarnings({"UnusedDeclaration"})
  public void setCellLayout(CellLayout cellLayout) {
    myCellLayout = cellLayout;
  }

  @SuppressWarnings({"UnusedDeclaration"})
  public AbstractCellListHandler getCellListHandler() {
    return myCellListHandler;
  }

  public boolean hasCellListHandler() {
    return myCellListHandler != null;
  }

  public String getCellNodesRole() {
    if (myCellListHandler == null) return null;
    return myCellListHandler.getElementRole();
  }

  public int getCellNumber(EditorCell cell) {
    if (usesBraces()) {
      return myEditorCells.indexOf(cell) - 1;
    } else {
      return myEditorCells.indexOf(cell);
    }
  }

  public EditorCell getCellAt(int number) {
    try {
      if (usesBraces()) {
        return myEditorCells.get(number + 1);
      } else {
        return myEditorCells.get(number);
      }
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }

  public void setGridLayout(boolean gridLayout) {
    if (myCellLayout instanceof CellLayout_Vertical) {
      ((CellLayout_Vertical) myCellLayout).setGridLayout(gridLayout);
    }
  }

  public void setArtificialBracesIndent(int indent) {
    myArtificialBracesIndent = indent;
  }

  public int getBracesIndent() {
    int naturalIndent = usesBraces() ? myOpeningBrace.getWidth() : 0;
    return Math.max(myArtificialBracesIndent, naturalIndent);
  }

  protected EditorCell_Collection(EditorContext editorContext, SNode node, CellLayout cellLayout, AbstractCellListHandler handler) {
    super(editorContext, node);
    myCellLayout = cellLayout;
    myCellListHandler = handler;
    this.setAction(EditorCellAction.LEFT_SPECIAL, new SelectFirstChild());
    this.setAction(EditorCellAction.RIGHT_SPECIAL, new SelectLastChild());
    myOpeningBrace = new EditorCell_Brace(editorContext, node, true);
    myClosingBrace = new EditorCell_Brace(editorContext, node, false);
  //  addAdditionalKeyboardHandler(new MyKeyboardHandler());
  }

  private void setBraces() {
    addCellAt(0, myOpeningBrace, true);
    addCellAt(myEditorCells.size(), myClosingBrace, true);
    getEditor().addCellSelectionListener(myLastCellSelectionListener);
  }

  private void removeBraces() {
    removeCell(myOpeningBrace);
    removeCell(myClosingBrace);
    getEditor().removeCellSelectionListener(myLastCellSelectionListener);
  }

  private void notifyBraceSelected() {
    if (!isSelectable()) return;
    EditorContext context = getEditorContext();
    EditorCell selection = context.getNodeEditorComponent().getSelectedCell();
    int caretX = selection.getCaretX();
    context.getNodeEditorComponent().pushSelection(selection);
    EditorCell target = this;
    target.setCaretX(caretX);
    context.getNodeEditorComponent().setSelectionDontClearStack(target, true);
  }

  private void setBracesEnabled(boolean enabled) {
    myBracesEnabled = enabled;
    getEditor().setBracesEnabled(this, enabled);
  }

  public void enableBraces() {
    setBracesEnabled(true);
    myOpeningBrace.setEnabled(true);
    myClosingBrace.setEnabled(true);
    getEditor().leftHighlightCell(this, new Color(80, 0, 120));
  }

  public void disableBraces() {
    setBracesEnabled(false);
    myOpeningBrace.setEnabled(false);
    myClosingBrace.setEnabled(false);
    getEditor().leftUnhighlightCell(this);
  }

  public boolean areBracesEnabled() {
    return myBracesEnabled;
  }

  public EditorCell getOpeningBrace() {
    return myOpeningBrace;
  }

  public EditorCell getClosingBrace() {
    return myClosingBrace;
  }

  public int getAscent() {
    return myAscent;
  }

  public int getDescent() {
    return myDescent;
  }
  
  public Iterable<EditorCell> contentCells() {
    if (usesBraces()) {
      return new Iterable<EditorCell>() {
        public Iterator<EditorCell> iterator() {
          return new Iterator<EditorCell>() {//iterates from second to before last
            private Iterator<EditorCell> myIterator = myEditorCells.iterator();
            private EditorCell myNext;

            {
              myIterator.next();
              myNext = myIterator.next();
            }

            public boolean hasNext() {
              return myIterator.hasNext();
            }

            public EditorCell next() {
              if (!hasNext()) throw new NoSuchElementException();
              EditorCell result = myNext;
              myNext = myIterator.next();
              return result;
            }

            public void remove() {
              throw new UnsupportedOperationException();
            }
          };
        }
      };
    } else return this;
  }

  public Iterator<EditorCell> iterator() {
    return cells();
  }

  public Iterator<EditorCell> cells() {
    return new Iterator<EditorCell>() {
      private Iterator<EditorCell> myIterator = myEditorCells.iterator();

      public boolean hasNext() {
        return myIterator.hasNext();
      }

      public EditorCell next() {
        return myIterator.next();
      }

      public void remove() {
        throw new UnsupportedOperationException();
      }
    };
  }

  public EditorCell[] getCells() {
    return myEditorCells.toArray(new EditorCell[myEditorCells.size()]);
  }

  public List<EditorCell> dfsCells() {
    List<EditorCell> result = new ArrayList<EditorCell>();
    for (EditorCell cell : myEditorCells) {
      if (cell instanceof EditorCell_Collection) {
        result.add(cell);
        result.addAll(((EditorCell_Collection)cell).dfsCells());
      } else {
        result.add(cell);
      }
    }
    return result;
  }

  public Iterator<EditorCell> reverseCellIterator() {
    return new Iterator<EditorCell>() {

      private int mySize = myEditorCells.size();

      public boolean hasNext() {
        return mySize > 0;
      }

      public EditorCell next() {
        return myEditorCells.get(--mySize);
      }

      public void remove() {
        throw new UnsupportedOperationException();
      }
    };
  }

  public void addEditorCell(EditorCell editorCell) {
    if (editorCell == null) return;
    addCell(editorCell);
    ((EditorCell_Basic) editorCell).setParent(this);
  }

  public boolean containsCell(EditorCell editorCell) {
    return myEditorCells.contains(editorCell);
  }

  public int getCellsCount() {
    return myEditorCells.size();
  }

  public int getContentCellsCount() {
    int count = getCellsCount();
    if (usesBraces()) {
      return count - 2;
    } else {
      return count;
    }
  }

  protected void relayoutImpl() {
    myCellLayout.doLayout(this);
    myAscent = myCellLayout.getAscent(this);
    myDescent = myCellLayout.getDescent(this);
  }

  public void fold() {
    fold(false);
  }

  public void unfold() {
    unfold(false);
  }

  private void setFolded(boolean folded) {
    myFolded = folded;
    getEditor().setFolded(this, folded);
  }

  public void fold(boolean programmaticaly) {
    if (!canBeFolded()) return;
    setFolded(true);
    final AbstractEditorComponent editorComponent = getEditor();
    editorComponent.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        if (getBounds().contains(e.getPoint())) {
          editorComponent.removeMouseListener(this);
          unfold();
        }
      }
    });
    if (!programmaticaly) {
      getEditorContext().flushEvents();

      getEditor().relayout();
    }
  }

  private boolean canBeFolded() {
    return !isFolded() && canBePossiblyFolded();
  }

  public boolean canBePossiblyFolded() {
    return myCanBeFolded && myCellLayout.canBeFolded();
  }

  public void setCanBeFolded(boolean canBeFolded) {
    myCanBeFolded = canBeFolded;
  }

  public void unfold(boolean programmaticaly) {
    if (!isFolded()) return;
    setFolded(false);
    if (!programmaticaly) {
      getEditorContext().flushEvents();

      AbstractEditorComponent editor = getEditor();
      editor.relayout();
      EditorCell deepestSelected = EditorCell_Collection.this.findFirstSelectableLeaf();
      editor.pushSelection(deepestSelected);
      editor.setSelectionDontClearStack(EditorCell_Collection.this, true);
    }
  }

  public boolean isUnfoldedCollection() {
    return !isFolded();
  }

  public void paint(Graphics g) {
    if (!g.getClipBounds().intersects(getBounds())) {
      return;
    }
    if (isFolded()) {
      String s = FOLDED_TEXT;
      Font editorFont = EditorSettings.getInstance().getDefaultEditorFont().deriveFont(Font.BOLD);
      FontMetrics metrics = getEditor().getFontMetrics(editorFont);
      g.setFont(editorFont);
      int x = myX;
      g.setColor(Color.lightGray);
      g.fillRect(x, myY, (int) metrics.stringWidth(s), myHeight);
      g.setColor(Color.DARK_GRAY);
      g.drawString(s, x, myY + myHeight - metrics.getDescent());
    } else {
      if (!isSelectionPaintedOnAncestor()) {
        paintBackground(g);
      }
      paintSelectionIfRequired(g);
      paintContent(g);

      for (EditorCell child : this) {
        child.paint(g);
      }
      paintDecorations(g);
    }
  }

  public void updateMessages() {
    super.updateMessages();
    for (EditorCell child : myEditorCells) {
      child.updateMessages();
    }
  }

  public void moveTo(int x, int y) {
    if (x == myX && y == myY) {
      return;
    }

    int xOld = myX;
    int yOld = myY;
    super.moveTo(x, y);
    for (EditorCell myEditorCell : getCells()) {
      myEditorCell.moveTo(myEditorCell.getX() + x - xOld, myEditorCell.getY() + y - yOld);
    }
  }

  public void paintContent(Graphics g) {
  }

  public void paintSelection(Graphics g, Color c) {
    myCellLayout.paintSelection(g, this, c);
  }

  public void paintSelectionAsIfNotCollection(Graphics g, Color c) {
    super.paintSelection(g, c);
  }

  public TextBuilder renderText() {
    return myCellLayout.doLayoutText(this);
  }

  public EditorCell findNearestCell(int x, int y, boolean isPrevious) {
    return myCellLayout.findNearestCell(this, x, y, isPrevious);
  }

  public EditorCell findNearestRow(int y) {
    return myCellLayout.findNearestRow(this, y);
  }

  public void synchronizeViewWithModel() {
    for (EditorCell myEditorCell : myEditorCells) {
      myEditorCell.synchronizeViewWithModel();
    }
  }

  public EditorCell findCell(int x, int y) {
    return myCellLayout.findCell(this, x, y);
  }

  public int indexOf(EditorCell cell) {
    return myEditorCells.indexOf(cell);
  }

  public void addCellAt(int i, EditorCell cellToAdd, boolean ignoreBraces) {
    int j = i;
    if (usesBraces() && !ignoreBraces) {
      j = i - 1;
    }
    ((EditorCell_Basic) cellToAdd).setParent(this);
    myEditorCells.add(j, cellToAdd);
    getStyle().add(cellToAdd.getStyle());

    if (isInTree()) {
      ((EditorCell_Basic) cellToAdd).onAdd();
    }
  }

  public void removeCell(EditorCell cellToRemove) {
    ((EditorCell_Basic) cellToRemove).setParent(null);
    myEditorCells.remove(cellToRemove);
    getStyle().remove(cellToRemove.getStyle());

    if (isInTree()) {
      ((EditorCell_Basic) cellToRemove).onRemove();
    }
  }

  public void removeAllCells() {
    for (EditorCell cell : myEditorCells.toArray(new EditorCell[myEditorCells.size()])) {
      removeCell(cell);
    }
  }

  private void addCell(EditorCell cellToAdd) {
    addCellAt(myEditorCells.size(), cellToAdd, false);
  }

  public boolean usesBraces() {
    return myUsesBraces;
  }

  public void setUsesBraces(boolean b) {
    if (myUsesBraces != b) {
      myUsesBraces = b;
      if (myUsesBraces) {
        setBraces();
      } else {
        removeBraces();
      }
    }
  }


  public EditorCell findNextToDown(final int x, final int y) {
    EditorCell_Collection rootCell = this;
    while (rootCell.getParent() != null) {
      rootCell = rootCell.getParent();
    }

    class NextToUpCondition extends EditorCellCondition {

      public void checkLeafCell(EditorCell cell) {
        if (y > cell.getY() || !cell.isSelectable()) {
          return;
        }
        if (getFoundCell() == null) {
          setFoundCell(cell);
          return;
        }
        EditorCell foundCell = getFoundCell();
        if (y - cell.getY() < y - foundCell.getY()) {
          return;
        }
        if (y - cell.getY() > y - foundCell.getY()) {
          setFoundCell(cell);
          return;
        }
        if (x >= cell.getX() && x < cell.getX() + cell.getWidth()) {
          setFoundCell(cell);
          return;
        }
        if (x < foundCell.getX() && x > cell.getX()) {
          setFoundCell(cell);
          return;
        }
        if (x < cell.getX() && x > foundCell.getX()) {
          return;
        }
        if (Math.abs(x - foundCell.getX()) > Math.abs(x - cell.getX())) {
          setFoundCell(cell);
        }
      }
    }

    NextToUpCondition nextToUpCondition = new NextToUpCondition();
    rootCell.iterateTreeUntilCondition(nextToUpCondition);
    return nextToUpCondition.getFoundCell();
  }


  public EditorCell findNextToUp(final int x, final int y) {
    EditorCell_Collection rootCell = this;
    while (rootCell.getParent() != null) {
      rootCell = rootCell.getParent();
    }

    class NextToUpCondition extends EditorCellCondition {

      public void checkLeafCell(EditorCell cell) {
        if (y < cell.getY() || !cell.isSelectable()) {
          return;
        }
        EditorCell foundCell = getFoundCell();
        if (foundCell == null) {
          setFoundCell(cell);
          return;
        }
        if (y - cell.getY() > y - foundCell.getY()) {
          return;
        }
        if (y - cell.getY() < y - foundCell.getY()) {
          setFoundCell(cell);
          return;
        }
        if (x >= cell.getX() && x < cell.getX() + cell.getWidth()) {
          setFoundCell(cell);
          return;
        }
        if (x < foundCell.getX() && x > cell.getX()) {
          setFoundCell(cell);
          return;
        }
        if (x < cell.getX() && x > foundCell.getX()) {
          return;
        }
        if (Math.abs(x - foundCell.getX()) > Math.abs(x - cell.getX())) {
          setFoundCell(cell);
        }
      }
    }

    NextToUpCondition nextToUpCondition = new NextToUpCondition();
    rootCell.iterateTreeUntilCondition(nextToUpCondition);
    return nextToUpCondition.getFoundCell();
  }


  public EditorCell findNextToLeft(EditorCell editorCell) {
    EditorCell_Collection rootCell = this;
    while (rootCell.getParent() != null && (!(rootCell.getParent().getCellLayout() instanceof CellLayout_Vertical) || rootCell.getParent().firstCell() == rootCell))
    {
      rootCell = rootCell.getParent();
    }

    class NextToLeftCondition extends EditorCellCondition {
      private EditorCell myCellToCompare;
      private boolean myCollection;

      public NextToLeftCondition(EditorCell cellToCompare) {
        this.myCellToCompare = cellToCompare;
        myCollection = cellToCompare instanceof EditorCell_Collection;
      }

      public void checkLeafCell(EditorCell cell) {
        if (cell == myCellToCompare) {
          setToStop(true);
          return;
        }
        if (!cell.isSelectable()) {
        } else {
          setFoundCell(cell);
        }
      }

      public boolean checkNotLeafCell(EditorCell editorCell) {
        if (!myCollection) return true;
        if (editorCell == myCellToCompare) {
          setToStop(true);
        }
        return true;
      }
    }

    NextToLeftCondition nextToLeftCondition = new NextToLeftCondition(editorCell);
    rootCell.iterateTreeUntilCondition(nextToLeftCondition);
    return nextToLeftCondition.getFoundCell();
  }

  @SuppressWarnings({"UnusedDeclaration"})
  public EditorCell findFirstErrorCell() {
    class FirstErrorCellCondition extends EditorCellCondition {
      public void checkLeafCell(EditorCell cell) {
        if (cell instanceof EditorCell_Label) {
          if (cell.isErrorState()) {
            setToStop(true);
            setFoundCell(cell);
          }
        }
      }
    }

    FirstErrorCellCondition condition = new FirstErrorCellCondition();
    this.iterateTreeUntilCondition(condition);
    return condition.getFoundCell();
  }

  public EditorCell findFirstSelectableLeaf() {
    EditorCellCondition condition = new EditorCellCondition() {
      public void checkLeafCell(EditorCell cell) {
        if (cell.isSelectable() && !(cell instanceof EditorCell_Brace)) {
          setToStop(true);
          setFoundCell(cell);
        }
      }
    };
    this.iterateTreeUntilCondition(condition);
    return condition.getFoundCell();
  }

  public EditorCell findLastSelectableLeaf() {
    EditorCellCondition condition = new EditorCellCondition() {

      public void checkLeafCell(EditorCell cell) {
        if (cell.isSelectable() && !(cell instanceof EditorCell_Brace)) {
          //setToStop(true);
          setFoundCell(cell);
        }
      }
    };
    this.iterateTreeUntilCondition(condition);
    return condition.getFoundCell();
  }

  public EditorCell firstCell() {
    if (myEditorCells.size() > 0) {
      return myEditorCells.get(0);
    }
    return null;
  }

  public EditorCell lastCell() {
    if (myEditorCells.size() > 0) {
      return myEditorCells.get(myEditorCells.size() - 1);
    }
    return null;
  }

  @SuppressWarnings({"UnusedDeclaration"})
  public EditorCell firstContentCell() {
    int shift = 0;
    int size = 0;
    if (usesBraces()) {
      shift = 1;
      size = 2;
    }
    if (myEditorCells.size() > size) {
      return myEditorCells.get(shift);
    }
    return null;
  }

  public EditorCell lastContentCell() {
    int shift = 0;
    int size = 0;
    if (usesBraces()) {
      shift = 1;
      size = 2;
    }
    if (myEditorCells.size() > size) {
      return myEditorCells.get(myEditorCells.size() - (1 + shift));
    }
    return null;
  }

  public EditorCell findNextToRight(EditorCell editorCell) {
    EditorCell_Collection rootCell = this;
    while (rootCell.getParent() != null &&
            (!(rootCell.getParent().getCellLayout() instanceof CellLayout_Vertical) || rootCell.getParent().lastCell() == rootCell))
    {
      rootCell = rootCell.getParent();
    }

    class NextToRightCondition extends EditorCellCondition {
      private EditorCell myCellToCompare;
      private boolean myToStart = false;
      private boolean myCollection;


      public NextToRightCondition(EditorCell cellToCompare) {
        this.myCellToCompare = cellToCompare;
        myCollection = cellToCompare instanceof EditorCell_Collection;
      }

      public void checkLeafCell(EditorCell cell) {
        if (cell == myCellToCompare) {
          myToStart = true;
          return;
        }
        if (myToStart && !cell.isSelectable()) {
        } else if (myToStart) {
          setFoundCell(cell);
          setToStop(true);
        }
      }

      public boolean checkNotLeafCell(EditorCell editorCell) {
        if (!myCollection) return true;
        if (editorCell == myCellToCompare) {
          myToStart = true;
          return false;
        }
        if (myToStart) {
          setFoundCell(editorCell);
          setToStop(true);
        }
        return true;
      }
    }

    NextToRightCondition nextToRightCondition = new NextToRightCondition(editorCell);
    rootCell.iterateTreeUntilCondition(nextToRightCondition);
    return nextToRightCondition.getFoundCell();
  }

  public void iterateTreeUntilCondition(EditorCellCondition condition) {
    iterateTreeUntilCondition(condition, false);
  }

  public void iterateTreeUntilCondition(EditorCellCondition condition, boolean mayBeFolded) {
    if (!mayBeFolded && isFolded()) {
      condition.checkLeafCell(this);
    } else {
      for (EditorCell myEditorCell : myEditorCells) {
        if (myEditorCell instanceof EditorCell_Collection && (mayBeFolded || !((EditorCell_Collection) myEditorCell).isFolded())) {
          if (condition.checkNotLeafCell(myEditorCell) && !condition.toStop()) {
            ((EditorCell_Collection) myEditorCell).iterateTreeUntilCondition(condition, mayBeFolded);
          }
        } else {
          condition.checkLeafCell(myEditorCell);
        }

        if (condition.toStop()) {
          return;
        }
      }
    }
  }

  public EditorCell getFirstLeaf() {
    if (myEditorCells.isEmpty()) return this;
    return getFirstChild().getFirstLeaf();
  }

  public EditorCell getLastLeaf() {
    if (myEditorCells.isEmpty()) return this;
    return getLastChild().getLastLeaf();
  }

  public EditorCell getLastChild() {
    if (myEditorCells.isEmpty()) return null;
    return myEditorCells.get(myEditorCells.size() - 1);
  }

  public EditorCell getFirstChild() {
    if (myEditorCells.isEmpty()) return null;
    return myEditorCells.get(0);
  }

  public Set<JComponent> getSwingComponents() {
    Set<JComponent> result = new HashSet<JComponent>();
    for (EditorCell cell : myEditorCells) {
      result.addAll(cell.getSwingComponents());
    }
    return result;
  }

  public String toString() {
    return NameUtil.shortNameFromLongName(getClass().getName());
  }

  public void onAdd() {
    super.onAdd();
    for (EditorCell child : myEditorCells) {
      ((EditorCell_Basic) child).onAdd();
    }
    if (myUsesBraces) {
      getEditor().addCellSelectionListener(myLastCellSelectionListener);
    }
  }

  public void onRemove() {
    for (EditorCell child : myEditorCells) {
      ((EditorCell_Basic) child).onRemove();
    }
    super.onRemove();
    getEditor().removeCellSelectionListener(myLastCellSelectionListener);
  }

  // --- actions ----

  private class SelectFirstChild extends EditorCellAction {
    public boolean canExecute(EditorContext context) {
      return EditorCell_Collection.this.isSelected() && findChild(CellFinders.FIRST_SELECTABLE_LEAF) != null;
    }

    public void execute(EditorContext context) {
      context.getNodeEditorComponent().clearSelectionStack();
      context.getNodeEditorComponent().changeSelection(findChild(CellFinders.FIRST_SELECTABLE_LEAF));
    }

  } // private class SelectFirstChild

  private class SelectLastChild extends EditorCellAction {
    public boolean canExecute(EditorContext context) {
      return EditorCell_Collection.this.isSelected() && findChild(CellFinders.LAST_SELECTABLE_LEAF) != null;
    }

    public void execute(EditorContext context) {
      context.getNodeEditorComponent().clearSelectionStack();
      context.getNodeEditorComponent().changeSelection(findChild(CellFinders.LAST_SELECTABLE_LEAF));
    }

  } // private class SelectLastChild


  private class EditorCell_Brace extends EditorCell_Constant {
    public static final String OPENING_TEXT = "(";
    public static final String CLOSING_TEXT = ")";
    private boolean myIsOpening = false;
    private boolean myIsEnabled = false;
    private TextLine myBraceTextLine;

    protected EditorCell_Brace(EditorContext editorContext, SNode node, boolean isOpening) {
      super(editorContext, node, "");
      myIsOpening = isOpening;
      String text = getBraceText();

      Style style = new Style();
      style.set(StyleAttributes.TEXT_COLOR, Color.BLUE);
      style.set(StyleAttributes.FONT_STYLE, Font.BOLD);
      style.set(StyleAttributes.PADDING_LEFT, 0.0);
      style.set(StyleAttributes.PADDING_RIGHT, 0.0);

      myBraceTextLine = new TextLine(text, style, false);
      myBraceTextLine.setCaretEnabled(false);
      setEditable(false);
      setEnabled(false);
    }

    public CellInfo getCellInfo() {
      return new BraceCellInfo(EditorCell_Brace.this);
    }

    private String getBraceText() {
      return myIsOpening ? OPENING_TEXT : CLOSING_TEXT;
    }

    public void setEnabled(boolean enabled) {
      myIsEnabled = enabled;
      setSelectable(enabled);
    }

    public void paintContent(Graphics g) {
      if (!myIsEnabled) return;
      TextLine textLine = getRenderedTextLine();
      boolean toShowCaret = toShowCaret();
      int overlapping = getOverlapping();
      if (myIsOpening) {
        myBraceTextLine.paint(g, myX + textLine.getWidth() - overlapping, myY, false, false);
        textLine.paint(g, myX, myY, myWidth, myHeight, isSelected(), toShowCaret);
      } else {
        myBraceTextLine.paint(g, myX, myY, false, false);
        textLine.paint(g, myX + myBraceTextLine.getWidth() - overlapping, myY, isSelected(), toShowCaret);
      }
    }

    public void relayoutImpl() {
      super.relayoutImpl();
      myBraceTextLine.relayout();
      myWidth += myBraceTextLine.getWidth() - getOverlapping();
    }

    private int getOverlapping() {
      if (myIsOpening) {
        return myBraceTextLine.getLeftInternalInset() + myTextLine.getRightInternalInset();
      } else {
        return myBraceTextLine.getRightInternalInset() + myTextLine.getLeftInternalInset();
      }
    }

  }

  private static class BraceCellInfo extends DefaultCellInfo {
    private CellInfo myCollectionCellInfo;
    private boolean myOpeningBrace;

    public BraceCellInfo(EditorCell_Brace cell) {
      super(cell);
      myOpeningBrace = cell.myIsOpening;
      myCollectionCellInfo = cell.getParent().getCellInfo();
    }

    public EditorCell findCell(AbstractEditorComponent editorComponent) {
      EditorCell cell = myCollectionCellInfo.findCell(editorComponent);
      if (!(cell instanceof EditorCell_Collection)) return null;
      EditorCell_Collection parent = (EditorCell_Collection) cell;
      if (myOpeningBrace) {
        return parent.myOpeningBrace;
      } else {
        return parent.myClosingBrace;
      }
    }

    public int hashCode() {
      return myCollectionCellInfo.hashCode() + (myOpeningBrace ? 50 : -50);
    }

    public boolean equals(Object o) {
      if (!(o instanceof BraceCellInfo)) return false;
      BraceCellInfo cellInfo = ((BraceCellInfo) o);
      return myCollectionCellInfo.equals(cellInfo.myCollectionCellInfo) && myOpeningBrace == cellInfo.myOpeningBrace;
    }
  }


  private class MyLastCellSelectionListener implements ICellSelectionListener {
    public void selectionChanged(AbstractEditorComponent editor, EditorCell oldSelection, EditorCell newSelection) {
      if (myClosingBrace.isSelected() || myOpeningBrace.isSelected()) {
        notifyBraceSelected();
        return;
      }
      EditorCell deepestSelection = editor.getDeepestSelectedCell();
      EditorCell lastSelectableLeaf = findLastSelectableLeaf();
      EditorCell firstSelectableLeaf = findFirstSelectableLeaf();
      if (deepestSelection instanceof EditorCell_Brace) {
        EditorCell_Collection braceOwner = deepestSelection.getParent();
        if (braceOwner.myClosingBrace == deepestSelection && braceOwner.findLastSelectableLeaf() == lastSelectableLeaf)
        {
          enableBraces();
          return;
        }
        if (braceOwner.myOpeningBrace == deepestSelection && braceOwner.findFirstSelectableLeaf() == firstSelectableLeaf)
        {
          enableBraces();
          return;
        }
      }
      if (lastSelectableLeaf == deepestSelection || firstSelectableLeaf == deepestSelection) {
        enableBraces();
      } else {
        disableBraces();
      }
    }
  }


  @SuppressWarnings({"UnusedDeclaration"})
  private @ForDebug class MyKeyboardHandler implements IKeyboardHandler {

    public boolean processKeyPressed(EditorContext editorContext, KeyEvent keyEvent) {
      if (!isSelected()) return false;
      if (keyEvent.isAltDown() && keyEvent.isControlDown() &&
              keyEvent.isShiftDown() && (keyEvent.getKeyCode() == KeyEvent.VK_F)) {
        fold();
        return true;
      }
      return false;
    }

    public boolean processKeyReleased(EditorContext editorContext, KeyEvent keyEvent) {
      return false;
    }
  }

}

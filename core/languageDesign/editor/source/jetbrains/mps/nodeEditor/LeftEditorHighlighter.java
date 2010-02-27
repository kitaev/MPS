/*
 * Copyright 2003-2010 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.nodeEditor;

import com.intellij.util.containers.SortedList;
import com.intellij.util.ui.UIUtil;
import gnu.trove.TIntObjectHashMap;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.nodeEditor.EditorComponent.RebuildListener;
import jetbrains.mps.nodeEditor.EditorMessageIconRenderer.IconRendererType;
import jetbrains.mps.nodeEditor.bookmark.BookmarkManager;
import jetbrains.mps.nodeEditor.bookmark.BookmarkManager.BookmarkListener;
import jetbrains.mps.nodeEditor.cells.CellInfo;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.Pair;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.*;
import java.util.List;
import java.util.Map.Entry;

/**
 * This class should be called in UI (EventDispatch) thread only
 */
public class LeftEditorHighlighter extends JComponent {

  private static final Logger LOG = Logger.getLogger(LeftEditorHighlighter.class);

  private static final int RIGHT_GAP = 5;
  private static final int BRACKETS_WIDTH = 2;
  private static final int MIN_SEAPEATOR_LINE_X = 30;
  private static final int GAP_BETWEEN_ICONS = 3;
  private static final int LEFT_GAP = 1;

  private EditorComponent myEditorComponent;
  private int mySeparatorLineX = MIN_SEAPEATOR_LINE_X;

  private HashMap<CellInfo, HighlighterBracket> myBrackets = new HashMap<CellInfo, HighlighterBracket>();

  private List<BracketEdge> myBracketEdges = new ArrayList<BracketEdge>();
  private Stack<HighlighterBracket> myBracketsLayoutStack = new Stack<HighlighterBracket>();
  private int myCurrentBracketsWidth = BRACKETS_WIDTH;
  private Set<HighlighterBracket> myUnresolvedBrackets = new HashSet<HighlighterBracket>();

  private Map<CellInfo, FoldingButton> myFoldingButtons = new HashMap<CellInfo, FoldingButton>();

  private BookmarkListener myListener;
  private BookmarkManager myBookmarkManager = null;

  private Set<EditorMessageIconRenderer> myIconRenderers = new HashSet();
  private TIntObjectHashMap<List<EditorMessageIconRenderer>> myLineToRenderersMap = new TIntObjectHashMap();
  private int myIconRenderersWidth = 0;
  private int myBracketsAndFoldingButtonsWidth = 0;

  public LeftEditorHighlighter(EditorComponent editorComponent) {
    setBackground(Color.white);
    myEditorComponent = editorComponent;
    addMouseListener(new MyMouseListener());
    addMouseMotionListener(new MyMouseEnterListener());
    editorComponent.addRebuildListener(new RebuildListener() {
      public void editorRebuilt(EditorComponent editor) {
        assert SwingUtilities.isEventDispatchThread() : "LeftEditorHighlighter$RebuildListener should be called in eventDispatchThread";
        removeAllIconRenderers(IconRendererType.BOOKMARK);
        BookmarkManager bookmarkManager = getBookmarkManager();
        if (bookmarkManager != null) {
          bookmarkManager.removeBookmarkListener(myListener);
          SNode editedNode = myEditorComponent.getEditedNode();
          if (editedNode != null) {
            for (Pair<SNode, Integer> bookmark : bookmarkManager.getBookmarks(editedNode.getContainingRoot())) {
              addBookmark(bookmark.o1, bookmark.o2);
            }
          }
          myListener = new BookmarkListener() {
            public void bookmarkAdded(int number, SNode node) {
              assert SwingUtilities.isEventDispatchThread() : "LeftEditorHighlighter$BookmarkListener should be called in eventDispatchThread";
              addBookmark(node, number);
            }

            public void bookmarkRemoved(int number, SNode node) {
              assert SwingUtilities.isEventDispatchThread() : "LeftEditorHighlighter$BookmarkListener should be called in eventDispatchThread";
              if (number == -1) {
                removeUnnumberedBookmark(node);
              } else {
                removeBookmark(number);
              }
            }
          };
          bookmarkManager.addBookmarkListener(myListener);
        }

        doUpdateCellInfos();
      }
    });
  }

  public void dispose() {
    BookmarkManager bookmarkManager = getBookmarkManager();
    if (bookmarkManager != null) {
      bookmarkManager.removeBookmarkListener(myListener);
    }
  }

  private void doUpdateCellInfos() {
    myFoldingButtons.clear();
    for (EditorCell_Collection folded : myEditorComponent.getCellTracker().getFoldableCells()) {
      markFoldable(folded);
    }
    relayout(true, false);
  }

  @Override
  public void paint(Graphics g) {
    paintBackgroundAndFoldingLine(g);
    paintIconRenderers(g);

    for (HighlighterBracket bracket : myBrackets.values()) {
      bracket.paint(g);
    }
    // Painting mouse over feedback "below" all other folding buttons 
    for (FoldingButton button : myFoldingButtons.values()) {
      button.paintFeedback(g, mySeparatorLineX);
    }
    for (FoldingButton button : myFoldingButtons.values()) {
      button.paint(g, mySeparatorLineX);
    }
  }

  private void paintBackgroundAndFoldingLine(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    Rectangle bounds = g.getClipBounds();
    g.setColor(getBackground());
    g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);

    // same as in EditorComponent.paint() method
    EditorCell deepestCell = myEditorComponent.getDeepestSelectedCell();
    if (deepestCell instanceof EditorCell_Label) {
      g.setColor(EditorComponent.CARET_ROW_COLOR);
      int selectedCellY = deepestCell.getY();
      int selectedCellHeight = deepestCell.getHeight() - deepestCell.getTopInset() - deepestCell.getBottomInset();
      g.fillRect(bounds.x, selectedCellY, bounds.width, selectedCellHeight);
      // Drawing folding line
      UIUtil.drawVDottedLine(g2d, mySeparatorLineX,  bounds.y, selectedCellY, getBackground(), Color.gray);
      UIUtil.drawVDottedLine(g2d, mySeparatorLineX, selectedCellY, selectedCellY + selectedCellHeight, EditorComponent.CARET_ROW_COLOR, Color.gray);
      UIUtil.drawVDottedLine(g2d, mySeparatorLineX, selectedCellY + selectedCellHeight, bounds.y + bounds.height, getBackground(), Color.gray);
    } else {
      // Drawing folding line
      UIUtil.drawVDottedLine(g2d, mySeparatorLineX, bounds.y, bounds.y + bounds.height, getBackground(), Color.gray);
    }
  }

  private void paintIconRenderers(final Graphics g) {
    Rectangle clipBounds = g.getClipBounds();
    final int startY = clipBounds.y;
    final int endY = clipBounds.y + clipBounds.height;
    new IconsBeltAllocator(myLineToRenderersMap) {
      @Override
      protected boolean allocateRow(List<EditorMessageIconRenderer> row, int y) {
        if (y < startY) {
          return true;
        }
        if (y > endY) {
          return false;
        }
        return super.allocateRow(row, y);
      }

      @Override
      protected void allocateIcon(EditorMessageIconRenderer renderer, int x, int y) {
        renderer.getIcon().paintIcon(LeftEditorHighlighter.this, g, x, y);
      }
    }.run();
  }

  void repaint(FoldingButton button) {
    repaint(mySeparatorLineX - FoldingButton.HALF_WIDTH, button.getY(), FoldingButton.HALF_WIDTH * 2 + 1, button.getHeight() + 1);
  }

  public void unHighlight(EditorCell cell) {
    assert SwingUtilities.isEventDispatchThread() : "LeftEditorHighlighter.unHighlight() should be called in eventDispatchThread";
    myBrackets.remove(cell.getCellInfo());
  }

  public void highlight(EditorCell cell, EditorCell cell2, Color c) {
    assert SwingUtilities.isEventDispatchThread() : "LeftEditorHighlighter.unHighlight() should be called in eventDispatchThread";
    if (cell.getEditor() != myEditorComponent) throw new IllegalArgumentException("cell must be from my editor");
    myBrackets.put(cell.getCellInfo(), new HighlighterBracket(cell, cell2, c, myEditorComponent));
  }

  private void markFoldable(EditorCell_Collection cell) {
    if (cell.getEditor() != myEditorComponent) throw new IllegalArgumentException("cell must be from my editor");
    myFoldingButtons.put(cell.getCellInfo(), new FoldingButton(cell, getBackground()));
  }

  private void addBookmark(SNode node, int number) {
    // TODO: Do we need all these checks?..
    if (node == null) return;
    SNode editedNode = myEditorComponent.getEditedNode();
    if (editedNode == null) return;
    if (node.getContainingRoot() != editedNode.getContainingRoot()) {
      return;
    }
    EditorCell nodeCell = myEditorComponent.findNodeCell(node);
    if (nodeCell == null) {
      //   LOG.error("can't find a cell for node " + node);
      return;
    }
    addIconRenderer(new BookmarkIconRenderer(node, number));
  }

  private void removeBookmark(int number) {
    for (EditorMessageIconRenderer renderer: myIconRenderers) {
      if (renderer instanceof BookmarkIconRenderer && ((BookmarkIconRenderer) renderer).getNumber() == number) {
        removeIconRenderer(renderer);
        return;
      }
    }
  }

  private void removeUnnumberedBookmark(SNode node) {
    EditorCell nodeCell = myEditorComponent.findNodeCell(node);
    if (nodeCell == null) {
      //   LOG.error("can't find a cell for node " + node);
      return;
    }
    for (EditorMessageIconRenderer renderer: myIconRenderers) {
      if (renderer instanceof BookmarkIconRenderer) {
        BookmarkIconRenderer bookmarkIconRenderer = (BookmarkIconRenderer) renderer;
        if (bookmarkIconRenderer.getNumber() == -1 && bookmarkIconRenderer.getNode() == node) {
          removeIconRenderer(bookmarkIconRenderer);
          break;
        }
      }
    }
  }

  public void relayout(boolean updateFolding) {
    assert SwingUtilities.isEventDispatchThread() : "LeftEditorHighlighter.relayout() should be executed in eventDispatchThread";
    relayout(updateFolding, true);
  }

  private void relayout(boolean updateFolding, boolean updateBraces) {
    recalculateIconRenderersWidth();

    if (updateBraces) {
      for (HighlighterBracket bracket : myBrackets.values()) {
        bracket.relayout();
        bracket.setX(mySeparatorLineX);
      }
    }
    deleteUnresolvedBrackets();

    if (updateFolding) {
      for (Iterator<Entry<CellInfo, FoldingButton>> it = myFoldingButtons.entrySet().iterator(); it.hasNext();) {
        Entry<CellInfo, FoldingButton> nextEntry = it.next();
        if (!nextEntry.getValue().relayout()) {
          it.remove();
        }
      }
    }

    myBracketsAndFoldingButtonsWidth = myFoldingButtons.isEmpty() ? 0 : FoldingButton.HALF_WIDTH;
    myBracketEdges.clear();
    myBracketsLayoutStack.clear();
    // from top to bottom
    for (HighlighterBracket bracket : myBrackets.values()) {
      myBracketEdges.add(bracket.getBeginningEdge());
      myBracketEdges.add(bracket.getEndingEdge());
    }
    Collections.sort(myBracketEdges);

    // from top to bottom
    try {
      int maxDepth = 0;

      //main layout loop
      for (int i = 0; i < myBracketEdges.size(); i++) {
        BracketEdge edge = myBracketEdges.get(i);
        HighlighterBracket bracket = edge.myHighlighterBracket;
        if (edge.myBeginning) {
          myBracketsLayoutStack.push(bracket);
        } else {
          HighlighterBracket poppedBracket = myBracketsLayoutStack.pop();
          while (poppedBracket != bracket) { // i.e. error
            myBracketEdges.remove(poppedBracket.getEndingEdge());
            myBrackets.remove(poppedBracket.myEditorCellInfo1);
            poppedBracket = myBracketsLayoutStack.pop();
          }
          int wasDepth = myBracketsLayoutStack.size() + 1;
          maxDepth = Math.max(wasDepth, maxDepth);
          bracket.myDepth = wasDepth;
        }
      }

      myCurrentBracketsWidth = (mySeparatorLineX - maxDepth) / (2 + maxDepth);
      for (HighlighterBracket bracket : myBrackets.values()) {
        int inverseDepth = maxDepth - bracket.myDepth;
        bracket.myCurrentWidth = getCurrentBracketsWidth() * 2 + inverseDepth * (getCurrentBracketsWidth() + 1);
        myBracketsAndFoldingButtonsWidth = Math.max(myBracketsAndFoldingButtonsWidth, bracket.myCurrentWidth);
      }
    } catch (EmptyStackException ex) {
      LOG.error("brackets error");
    }

    myBracketsLayoutStack.clear();
    myBracketEdges.clear();
    updateSeparatorLinePosition();
  }

  private int getCurrentBracketsWidth() {
    return Math.min(BRACKETS_WIDTH, myCurrentBracketsWidth);
  }

  private void deleteUnresolvedBrackets() {
    for (HighlighterBracket bracket : myUnresolvedBrackets) {
      myBrackets.remove(bracket.myEditorCellInfo1);
    }
    myUnresolvedBrackets.clear();
  }

  private BookmarkManager getBookmarkManager() {
    if (myBookmarkManager != null) {
      return myBookmarkManager;
    }
    IOperationContext context = myEditorComponent.getOperationContext();
    if (context == null) {
      return null;
    }
    BookmarkManager bookmarkManager = context.getComponent(BookmarkManager.class);
    myBookmarkManager = bookmarkManager;
    return bookmarkManager;
  }

  public void addIconRenderer(EditorMessageIconRenderer renderer) {
    assert SwingUtilities.isEventDispatchThread() : "LeftEditorHighlighter.addIconRenderer() should be called in eventDispatchThread";
    myIconRenderers.add(renderer);
    recalculateIconRenderersWidth();
    updateSeparatorLinePosition();
  }

  public void addAllIconRenderers(Collection<EditorMessageIconRenderer> renderers) {
    assert SwingUtilities.isEventDispatchThread() : "LeftEditorHighlighter.addAllIconRenderers() should be called in eventDispatchThread";
    myIconRenderers.addAll(renderers);
    recalculateIconRenderersWidth();
    updateSeparatorLinePosition();
  }

  public void removeIconRenderer(EditorMessageIconRenderer renderer) {
    assert SwingUtilities.isEventDispatchThread() : "LeftEditorHighlighter.removeIconRenderer() should be called in eventDispatchThread";
    if (myIconRenderers.remove(renderer)) {
      recalculateIconRenderersWidth();
      updateSeparatorLinePosition();
    }
  }

  public void removeIconRenderer(SNode snode, IconRendererType type) {
    assert SwingUtilities.isEventDispatchThread() : "LeftEditorHighlighter.removeIconRenderer() should be called in eventDispatchThread";
    boolean wasModified = false;
    for (Iterator<EditorMessageIconRenderer> it = myIconRenderers.iterator(); it.hasNext();) {
      EditorMessageIconRenderer renderer = it.next();
      if (renderer.getNode() == snode && (type == null || renderer.getType() == type)) {
        it.remove();
        wasModified = true;
      }
    }
    if (wasModified) {
      recalculateIconRenderersWidth();
      updateSeparatorLinePosition();
    }
  }

  public void removeAllIconRenderers(Collection<EditorMessageIconRenderer> renderers) {
    assert SwingUtilities.isEventDispatchThread() : "LeftEditorHighlighter.removeAllIconRenderers() should be called in eventDispatchThread";
    if (myIconRenderers.removeAll(renderers)) {
      recalculateIconRenderersWidth();
      updateSeparatorLinePosition();
    }
  }

  public void removeAllIconRenderers(IconRendererType type) {
    assert SwingUtilities.isEventDispatchThread() : "LeftEditorHighlighter.removeAllIconRenderers() should be called in eventDispatchThread";
    boolean wasModified = false;
    for (Iterator<EditorMessageIconRenderer> it = myIconRenderers.iterator(); it.hasNext();) {
      EditorMessageIconRenderer renderer = it.next();
      if (renderer.getType() == type) {
        it.remove();
        wasModified = true;
      }
    }
    if (wasModified) {
      recalculateIconRenderersWidth();
      updateSeparatorLinePosition();
    }
  }

  private void recalculateIconRenderersWidth() {
    myLineToRenderersMap.clear();
    for (EditorMessageIconRenderer renderer : myIconRenderers) {
      int yCoordinate = getIconCoordinate(renderer);
      if (yCoordinate < 0) {
        continue;
      }
      List<EditorMessageIconRenderer> renderersForLine = myLineToRenderersMap.get(yCoordinate);
      if (renderersForLine == null) {
        renderersForLine = new SortedList(new Comparator<EditorMessageIconRenderer>() {
          @Override
          public int compare(EditorMessageIconRenderer message1, EditorMessageIconRenderer message2) {
            return message1.getType().getWeight() - message2.getType().getWeight();
          }
        });
        myLineToRenderersMap.put(yCoordinate, renderersForLine);
      }
      renderersForLine.add(renderer);
    }

    myIconRenderersWidth = 0;
    new IconsBeltAllocator(myLineToRenderersMap) {
      @Override
      public boolean allocateRow(List<EditorMessageIconRenderer> row, int y) {
        boolean result = super.allocateRow(row, y);
        myIconRenderersWidth = Math.max(myIconRenderersWidth, getLastRowWidth());
        return result;
      }
    }.run();
  }

  private void updateSeparatorLinePosition() {
    int newSeparatorLineX = Math.max(MIN_SEAPEATOR_LINE_X, myIconRenderersWidth + myBracketsAndFoldingButtonsWidth);
    if (newSeparatorLineX != mySeparatorLineX) {
      mySeparatorLineX = newSeparatorLineX;
      // TODO: remove relayout call from here
//      relayout(true, true);
      for (HighlighterBracket bracket : myBrackets.values()) {
        bracket.setX(mySeparatorLineX);
      }
      firePreferredSizeChanged();
    }
  }

  private void firePreferredSizeChanged() {
    processComponentEvent(new ComponentEvent(this, ComponentEvent.COMPONENT_RESIZED));
  }

  @Override
  public Dimension getPreferredSize() {
    return new Dimension(mySeparatorLineX + RIGHT_GAP, myEditorComponent.getPreferredSize().height);
  }

  private int getIconCoordinate(EditorMessageIconRenderer renderer) {
    SNode rendererNode = renderer.getNode();
    EditorCell nodeCell = myEditorComponent.findNodeCell(rendererNode);
    if (nodeCell == null) {
      // no cell for node?..
      return -1;
    }
    nodeCell = renderer.getAnchorCell(nodeCell);
    if (nodeCell == null) {
      // no anchorCell 
      return -1;
    }
    return nodeCell.getY() + nodeCell.getHeight() / 2 - renderer.getIcon().getIconHeight() / 2;
  }


  @Override
  protected void processMouseEvent(MouseEvent e) {
/*
TODO: handle mouse events for LeftHighlighter elements here and return from this method in case event
is consumed by corresponding element.
*/
    switch (e.getID()) {
      case MouseEvent.MOUSE_ENTERED:
      case MouseEvent.MOUSE_EXITED:
      case MouseEvent.MOUSE_PRESSED:
//      case MouseEvent.MOUSE_CLICKED:
//      case MouseEvent.MOUSE_RELEASED:
    }
    super.processMouseEvent(e);
  }

  @Override
  protected void processMouseMotionEvent(MouseEvent e) {
    switch (e.getID()) {
      case MouseEvent.MOUSE_MOVED:
    }
    super.processMouseMotionEvent(e);
  }

  private boolean isInFoldingButtons(MouseEvent e) {
    return Math.abs(mySeparatorLineX - e.getX()) <= FoldingButton.HALF_WIDTH;
  }

  private class HighlighterBracket {

    private BracketEdge myEdge1 = new BracketEdge(0, true, this);
    private BracketEdge myEdge2 = new BracketEdge(0, false, this);
    private int myX;//right edge
    private Color myColor;
    private int myCurrentWidth = getCurrentBracketsWidth() * 2;
    private CellInfo myEditorCellInfo1;
    private EditorComponent myEditor;
    private int myDepth;
    private CellInfo myEditorCellInfo2;

    public HighlighterBracket(EditorCell cell1, EditorCell cell2, Color c, EditorComponent editorComponent) {
      this(cell1.getCellInfo(), cell2.getCellInfo(), c, editorComponent);
    }

    public HighlighterBracket(CellInfo cellInfo1, CellInfo cellInfo2, Color c, EditorComponent editorComponent) {
      myColor = c;
      myEditor = editorComponent;
      myEditorCellInfo1 = cellInfo1;
      myEditorCellInfo2 = cellInfo2;
      relayout();
    }

    public void relayout() {
      if (myEditorCellInfo1 == null) return;
      EditorCell cell1 = myEditorCellInfo1.findCell(myEditor);
      EditorCell cell2 = myEditorCellInfo2.findCell(myEditor);
      if (cell1 != null && cell2 != null) {
        if (cell1.getY() <= cell2.getY()) {
          setY1(cell1.getY());
          setY2(cell2.getY() + cell2.getHeight());
        } else {
          setY1(cell2.getY());
          setY2(cell1.getY() + cell1.getHeight());
        }
      } else {
        LeftEditorHighlighter.this.myUnresolvedBrackets.add(this);
      }
    }

    public BracketEdge getBeginningEdge() {
      return myEdge1;
    }

    public BracketEdge getEndingEdge() {
      return myEdge2;
    }

    public void setX(int x) {
      myX = x;
    }

    @SuppressWarnings({"UnusedDeclaration"})
    public int getCurrentWidth() {
      return myCurrentWidth;
    }

    public void paint(Graphics g) {
      int currentWidth = myCurrentWidth;
      g.setColor(myColor);
      g.fillRect(myX - currentWidth + getCurrentBracketsWidth(), getY1(), currentWidth - getCurrentBracketsWidth(), getCurrentBracketsWidth());
      g.fillRect(myX - currentWidth, getY1(), getCurrentBracketsWidth(), getY2() - getY1());
      g.fillRect(myX - currentWidth + getCurrentBracketsWidth(), getY2() - getCurrentBracketsWidth(), currentWidth - getCurrentBracketsWidth(), getCurrentBracketsWidth());
    }

    private int getY1() {
      return myEdge1.myY;
    }

    private void setY1(int y1) {
      myEdge1.myY = y1;
    }

    private int getY2() {
      return myEdge2.myY;
    }

    private void setY2(int y2) {
      myEdge2.myY = y2;
    }

  }


  private static class BracketEdge implements Comparable<BracketEdge> {
    public int myY;
    public boolean myBeginning;
    public HighlighterBracket myHighlighterBracket;

    public BracketEdge(int y, boolean beginning, HighlighterBracket bracket) {
      myY = y;
      myBeginning = beginning;
      myHighlighterBracket = bracket;
    }


    public int compareTo(BracketEdge o) {
      if (myY == o.myY) {
        if (myBeginning && !o.myBeginning) {
          return 1;
        } else if (myBeginning && o.myBeginning) {
          return o.myHighlighterBracket.getY2() - myHighlighterBracket.getY2();
        } else if (!myBeginning && o.myBeginning) {
          return -1;
        } else if (!myBeginning && !o.myBeginning) {
          return o.myHighlighterBracket.getY1() - myHighlighterBracket.getY1();
        }
      }
      return myY - o.myY;
    }
  }

  private static class FoldingButton {
    public static final int HALF_WIDTH = 4;

    private static final int HEIGHT = HALF_WIDTH * 5 / 2;
    private static final int CANT_HEIGHT = HALF_WIDTH * 3 / 2;

    private CellInfo myCellInfo;
    private EditorComponent myEditor;
    private int myY1;
    private int myY2;
    private boolean myIsHidden = false;
    private boolean myIsFolded = false;
    private boolean myMouseOver = false;
    private Color myBackgroundColor;

    public FoldingButton(@NotNull EditorCell_Collection cell, @NotNull Color background) {
      //TODO: Can we hold cell directly instad of CellInfo here?
      myCellInfo = cell.getCellInfo();
      assert myCellInfo != null : "CellInfo unavailable for: " + cell;
      myEditor = cell.getEditor();
      myBackgroundColor = background;
    }

    public boolean relayout() {
      EditorCell cell = getCell();
      if (cell instanceof EditorCell_Collection) {
        myIsHidden = cell.isUnderFolded();
        if (!myIsHidden) {
          myIsFolded = ((EditorCell_Collection) cell).isFolded();
          myY1 = cell.getY();
          myY2 = cell.getY() + cell.getHeight() - cell.getTopInset() - cell.getBottomInset() - 1;
        }
        return true;
      }
      return false;
    }

    private Color getBorderColor() {
      return myMouseOver ? Color.blue : Color.gray;
    }

    public void paintFeedback(Graphics g, int x) {
      if (myMouseOver && !myIsFolded) {
        g.setColor(getBorderColor());
        g.drawLine(x, myY1 + HEIGHT, x, myY2 - HEIGHT);
      }
    }

    public void paint(Graphics g, int x) {
      if (myIsHidden) return;
      Color borderColor = getBorderColor();
      if (!myIsFolded) {
        int xs[] = {x - HALF_WIDTH, x - HALF_WIDTH, x, x + HALF_WIDTH, x + HALF_WIDTH};
        int ys[] = {myY1, myY1 + CANT_HEIGHT, myY1 + HEIGHT, myY1 + CANT_HEIGHT, myY1};

        g.setColor(myBackgroundColor);
        g.fillPolygon(xs, ys, xs.length);
        g.setColor(borderColor);
        g.drawPolygon(xs, ys, xs.length);

        for (int i = 0; i < xs.length; i++) {
          ys[i] = myY2 - (ys[i] - myY1);
        }

        g.setColor(myBackgroundColor);
        g.fillPolygon(xs, ys, xs.length);
        g.setColor(borderColor);
        g.drawPolygon(xs, ys, xs.length);

        g.setColor(borderColor);
        g.drawLine(x - HALF_WIDTH / 2, myY1 + HALF_WIDTH, x + HALF_WIDTH / 2, myY1 + HALF_WIDTH);
        g.drawLine(x - HALF_WIDTH / 2, myY2 - HALF_WIDTH, x + HALF_WIDTH / 2, myY2 - HALF_WIDTH);

      } else {
        g.setColor(myBackgroundColor);
        g.fillRect(x - HALF_WIDTH, (myY1 + myY2) / 2 - HALF_WIDTH, HALF_WIDTH * 2, HALF_WIDTH * 2);
        g.setColor(borderColor);
        g.drawRect(x - HALF_WIDTH, (myY1 + myY2) / 2 - HALF_WIDTH, HALF_WIDTH * 2, HALF_WIDTH * 2);

        g.setColor(Color.black);
        g.drawLine(x - HALF_WIDTH / 2, (myY1 + myY2) / 2, x + HALF_WIDTH / 2, (myY1 + myY2) / 2);
        g.drawLine(x, (myY1 + myY2) / 2 + HALF_WIDTH / 2, x, (myY1 + myY2) / 2 - HALF_WIDTH / 2);
      }
    }

    private EditorCell getCell() {
      return myCellInfo.findCell(myEditor);
    }

    public void activate() {
      EditorCell cell = getCell();
      if (cell instanceof EditorCell_Collection) {
        EditorCell_Collection collection = (EditorCell_Collection) cell;
        if (collection.isUnderFolded()) return;
        if (collection.isFolded()) {
          collection.unfold();
        } else {
          collection.fold();
        }
      }
    }

    public void mouseEntered() {
      myMouseOver = true;
    }

    public void mouseExited() {
      myMouseOver = false;
    }

    public boolean isInside(int y) {
      return myIsFolded ?
        Math.abs(y - (myY1 + myY2) / 2) <= HALF_WIDTH :
        (myY1 <= y && y <= myY1 + HEIGHT) || (myY2 - HEIGHT <= y && y <= myY2);
    }

    public int getY() {
      return myY1;
    }

    public int getHeight() {
      return myY2 - myY1;
    }
  }

  private class BookmarkIconRenderer implements EditorMessageIconRenderer {
    private SNode myNode;
    private int myNumber;

    private BookmarkIconRenderer(SNode node, int number) {
      myNode = node;
      myNumber = number;
    }

    @Override
    public Icon getIcon() {
      return BookmarkManager.getIcon(myNumber);
    }

    @Override
    public String getTooltipText() {
      return null;
    }

    @Override
    public SNode getNode() {
      return myNode;
    }

    public int getNumber() {
      return myNumber;
    }

    @Override
    public IconRendererType getType() {
      return IconRendererType.BOOKMARK;
    }

    @Override
    public EditorCell getAnchorCell(EditorCell bigCell) {
      return bigCell;
    }
  }

  private class MyMouseListener extends MouseAdapter {

    public void mouseClicked(MouseEvent e) {
      if (!isInFoldingButtons(e)) {
        return;
      }
      for (FoldingButton button : myFoldingButtons.values()) {
        if (button.isInside(e.getY())) {
          button.activate();
          break;
        }
      }
    }

    @Override
    public void mouseExited(MouseEvent e) {
      for (FoldingButton button : myFoldingButtons.values()) {
        if (button.myMouseOver) {
          button.mouseExited();
          repaint(button);
          break;
        }
      }
    }
  }

  private class MyMouseEnterListener extends MouseMotionAdapter {

    public void mouseMoved(MouseEvent e) {
      if (isInFoldingButtons(e)) {
        for (FoldingButton button : myFoldingButtons.values()) {
          if (button.isInside(e.getY())) {
            if (!button.myMouseOver) {
              button.mouseEntered();
              repaint(button);
            }
          } else {
            if (button.myMouseOver) {
              button.mouseExited();
              repaint(button);
            }
          }
        }
      } else {
        for (FoldingButton button : myFoldingButtons.values()) {
          if (button.myMouseOver) {
            button.mouseExited();
            repaint(button);
            break;
          }
        }
      }
    }
  }

  private static class IconsBeltAllocator {
    private TIntObjectHashMap<List<EditorMessageIconRenderer>> myLineToRenderers;
    private int[] mySortedYs;
    private int myLastRowLowerBound;
    private int myLastRowWidth;

    public IconsBeltAllocator(TIntObjectHashMap<List<EditorMessageIconRenderer>> lineToRenderersMap) {
      myLineToRenderers = lineToRenderersMap;
      mySortedYs = myLineToRenderers.keys();
      Arrays.sort(mySortedYs);
    }

    public void run() {
      myLastRowLowerBound = -1;
      myLastRowWidth = -1;
      for (int y : mySortedYs) {
        List<EditorMessageIconRenderer> row = myLineToRenderers.get(y);
        if (row.size() == 0) {
          continue;
        }
        if (!allocateRow(row, y)) {
          break;
        }
      }
    }

    protected boolean allocateRow(List<EditorMessageIconRenderer> row, int y) {
      int maxIconHeight = 0;
      for (EditorMessageIconRenderer renderer : row) {
        maxIconHeight = Math.max(maxIconHeight, renderer.getIcon().getIconHeight());
      }
      int rowUpperBoundY = y - maxIconHeight / 2;
      int offset;
      if (myLastRowLowerBound > 0 && myLastRowLowerBound >= rowUpperBoundY) {
        offset = myLastRowWidth;
      } else {
        offset = LEFT_GAP;
      }
      for (EditorMessageIconRenderer renderer : row) {
        allocateIcon(renderer, offset, y);
        offset += renderer.getIcon().getIconWidth() + GAP_BETWEEN_ICONS;
      }
      myLastRowLowerBound = rowUpperBoundY + maxIconHeight;
      myLastRowWidth = offset;
      return true;
    }

    /**
     * Empty allocateIcon method should be overriden if you need to paint an icon
     */
    protected void allocateIcon(EditorMessageIconRenderer renderer, int x, int y) {
    }

    protected int getLastRowWidth() {
      return myLastRowWidth;
    }
  }

}

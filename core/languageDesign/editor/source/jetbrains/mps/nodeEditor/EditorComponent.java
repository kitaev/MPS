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

import com.intellij.ide.CopyProvider;
import com.intellij.ide.CutProvider;
import com.intellij.ide.DataManager;
import com.intellij.ide.PasteProvider;
import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Computable;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.wm.IdeFrame;
import com.intellij.openapi.wm.WindowManager;
import com.intellij.openapi.wm.ex.StatusBarEx;
import jetbrains.mps.ide.IdeMain;
import jetbrains.mps.ide.IdeMain.TestMode;
import jetbrains.mps.ide.SystemInfo;
import jetbrains.mps.ide.ThreadUtils;
import jetbrains.mps.ide.actions.EditorInternal_ActionGroup;
import jetbrains.mps.ide.actions.EditorPopup_ActionGroup;
import jetbrains.mps.ide.actions.GoByCurrentReference_Action;
import jetbrains.mps.ide.tooltips.MPSToolTipManager;
import jetbrains.mps.ide.ui.MPSErrorDialog;
import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.intentions.IntentionsManager;
import jetbrains.mps.intentions.IntentionsManager.QueryDescriptor;
import jetbrains.mps.lang.typesystem.plugin.GoToTypeErrorRuleUtil;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.nodeEditor.EditorManager.EditorCell_STHint;
import jetbrains.mps.nodeEditor.NodeEditorActions.CompleteSmart;
import jetbrains.mps.nodeEditor.NodeEditorActions.ShowMessage;
import jetbrains.mps.nodeEditor.cellActions.*;
import jetbrains.mps.nodeEditor.cellMenu.NodeSubstituteChooser;
import jetbrains.mps.nodeEditor.cellMenu.NodeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.NodeSubstitutePatternEditor;
import jetbrains.mps.nodeEditor.cells.*;
import jetbrains.mps.nodeEditor.folding.CellAction_FoldAll;
import jetbrains.mps.nodeEditor.folding.CellAction_FoldCell;
import jetbrains.mps.nodeEditor.folding.CellAction_UnfoldAll;
import jetbrains.mps.nodeEditor.folding.CellAction_UnfoldCell;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.reloading.ClassLoaderManager;
import jetbrains.mps.reloading.ReloadAdapter;
import jetbrains.mps.reloading.ReloadListener;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.event.*;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.util.CollectionUtil;
import jetbrains.mps.util.NodesParetoFrontier;
import jetbrains.mps.util.Pair;
import jetbrains.mps.util.WeakSet;
import jetbrains.mps.util.annotation.UseCarefully;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.VFileSystem;
import jetbrains.mps.workbench.ActionPlace;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.workbench.action.ActionFactory;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.workbench.action.BaseAction;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.workbench.highlighter.EditorComponentCreateListener;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.ScrollBarUI;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.*;
import java.util.List;

public abstract class EditorComponent extends JComponent implements Scrollable, DataProvider {
  private static final Logger LOG = Logger.getLogger(EditorComponent.class);
  public static final String EDITOR_POPUP_MENU_ACTIONS = EditorPopup_ActionGroup.ID;
  public static final String EDITOR_POPUP_MENU_ACTIONS_INTERNAL = EditorInternal_ActionGroup.ID;
  public static final Color CARET_ROW_COLOR = new Color(255, 255, 215);

  private static final int SCROLL_GAP = 15;

  private final Object myAdditionalPaintersLock = new Object();

  public static void turnOnAliasingIfPossible(Graphics2D g) {
    if (EditorSettings.getInstance().isUseAntialiasing()) {
      Toolkit tk = Toolkit.getDefaultToolkit();
      //noinspection HardCodedStringLiteral
      Map map = (Map)tk.getDesktopProperty("awt.font.desktophints");
      if (map != null) {
        g.addRenderingHints(map);
      } else {
        g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
      }
    }
  }

  private WeakHashMap<EditorCell, Set<SNode>> myCellsToNodesToDependOnMap = new WeakHashMap<EditorCell, Set<SNode>>();

  private WeakHashMap<SNode, WeakReference<EditorCell>> myNodesToBigCellsMap = new WeakHashMap<SNode, WeakReference<EditorCell>>();
  private WeakHashMap<ReferencedNodeContext, WeakReference<EditorCell>> myRefNodeContextsToBigCellsMap = new WeakHashMap<ReferencedNodeContext, WeakReference<EditorCell>>();

  private WeakHashMap<EditorCell, Set<SNodePointer>> myCellsToRefTargetsToDependOnMap = new WeakHashMap<EditorCell, Set<SNodePointer>>();
  private HashMap<Pair<SNodePointer, String>, WeakSet<EditorCell_Property>> myNodePropertiesAccessedCleanlyToDependentCellsMap = new HashMap<Pair<SNodePointer, String>, WeakSet<EditorCell_Property>>();
  private HashMap<Pair<SNodePointer, String>, WeakSet<EditorCell>> myNodePropertiesAccessedDirtilyToDependentCellsMap = new HashMap<Pair<SNodePointer, String>, WeakSet<EditorCell>>();
  private HashMap<Pair<SNodePointer, String>, WeakSet<EditorCell>> myNodePropertiesWhichExistenceWasCheckedToDependentCellsMap = new HashMap<Pair<SNodePointer, String>, WeakSet<EditorCell>>();

  private Set<EditorCell> myFoldedCells = new HashSet<EditorCell>();
  private Set<EditorCell> myBracesEnabledCells = new HashSet<EditorCell>();

  private CellTracker myCellTracker = new CellTracker();

  private boolean myRelayoutRequested = false;
  private boolean myIsEditable = true;

  private boolean myDisposed = false;

  private Set<AdditionalPainter> myAdditionalPainters = new TreeSet<AdditionalPainter>(new Comparator<AdditionalPainter>() {
    @Override
    public int compare(AdditionalPainter o1, AdditionalPainter o2) {
      if (o1.isAbove(o2, EditorComponent.this)) {
        return 1;
      }
      if (o2.isAbove(o1, EditorComponent.this)) {
        return -1;
      }
      return o1.equals(o2) ? 0 : Integer.signum(System.identityHashCode(o1) - System.identityHashCode(o2));
    }
  });
  private Map<Object, AdditionalPainter> myItemsToAdditionalPainters = new HashMap<Object, AdditionalPainter>();

  private List<LeftMarginMouseListener> myLeftMarginPressListeners = new ArrayList<LeftMarginMouseListener>(0);

  private EditorSettingsListener mySettingsListener = new EditorSettingsListener() {
    public void settingsChanged() {
      rebuildEditorContent();
    }
  };
  private ReloadListener myReloadListener = new ReloadAdapter() {
    public void onAfterReload() {
      ThreadUtils.runInUIThreadNoWait(new Runnable() {
        public void run() {
          ModelAccess.instance().runWriteActionInCommand(new Runnable() {
            public void run() {
              if (isProjectDisposed()) return;
              rebuildEditorContent();
              myNodeSubstituteChooser.clearContent();
            }
          });
        }
      });
    }
  };

  private boolean myHasLastCaretX = false;
  private int myLastCaretX;
  private boolean myReadOnly = false;
  private String myLastWrittenStatus = "";

  @NotNull
  private JScrollPane myScrollPane;
  @NotNull
  private MyScrollBar myVerticalScrollBar;
  @NotNull
  private JComponent myContainer;
  protected EditorCell myRootCell;
  @Nullable
  protected EditorCell mySelectedCell;
  private boolean myCellSwapInProgress;
  private int myShiftX = 15;
  private int myShiftY = 10;

  @NotNull
  private NodeRangeSelection myNodeRangeSelection;

  private Stack<EditorCell> mySelectedStack = new Stack<EditorCell>();
  private Stack<KeyboardHandler> myKbdHandlersStack;
  private MouseListener myMouseEventHandler;
  private HashMap<CellActionType, EditorCellAction> myActionMap;

  private NodeSubstituteChooser myNodeSubstituteChooser;
  private HashMap myUserDataMap = new HashMap();

  private MyEventsCollector myEventsCollector = new MyEventsCollector();
  private MySimpleModelListener mySimpleModelListener = new MySimpleModelListener();
  private Set<SModelDescriptor> myModelDescriptorsWithListener = new HashSet<SModelDescriptor>();

  private List<CellSelectionListener> mySelectionListeners = new LinkedList<CellSelectionListener>();
  private List<RebuildListener> myRebuildListeners = new ArrayList<RebuildListener>();
  private PropertyChangeListener myFocusListener;
  private NodeHighlightManager myHighlightManager = new NodeHighlightManager(this);

  private IOperationContext myOperationContext;

  private MessagesGutter myMessagesGutter = new MessagesGutter(this);
  private LeftEditorHighlighter myLeftHighlighter;
  @Nullable
  protected SNode myNode;
  private EditorContext myEditorContext;
  private List<CellSynchronizationWithModelListener> myCellSynchronizationListeners = new ArrayList<CellSynchronizationWithModelListener>();
  private CellInfo myRecentlySelectedCellInfo = null;
  private final EditorMessageOwner myOwner = new EditorMessageOwner() {
  };

  private boolean myInsideOfCommand = false;

  private Map<KeyStroke, MPSActionProxy> myActionProxies = new HashMap<KeyStroke, MPSActionProxy>();
  private IntentionsSupport myIntentionsSupport;
  @SuppressWarnings({"UnusedDeclaration"})
  private AutoValidator myAutoValidator;
  private SearchPanel mySearchPanel = new SearchPanel(this);
  @SuppressWarnings({"UnusedDeclaration"})
  private ReferenceUnderliner myReferenceUnderliner = new ReferenceUnderliner();
  private BracesHighlighter myBracesHighlighter = new BracesHighlighter(this);


  public EditorComponent(IOperationContext operationContext) {
    this(operationContext, false);
  }

  public EditorComponent(final IOperationContext operationContext, boolean showErrorsGutter) {
    assert operationContext == null || operationContext.getModule() != null : "No module for operation context: " + operationContext;
    myOperationContext = operationContext;

    setBackground(Color.white);

    setFocusTraversalPolicyProvider(true);
    setFocusCycleRoot(true);
    setFocusTraversalPolicy(new FocusTraversalPolicy() {
      public Component getComponentAfter(Container aContainer, Component aComponent) {
        executeComponentAction(CellActionType.NEXT);
        return aContainer;
      }

      public Component getComponentBefore(Container aContainer, Component aComponent) {
        executeComponentAction(CellActionType.PREV);
        return aContainer;
      }

      public Component getFirstComponent(Container aContainer) {
        return aContainer;
      }

      public Component getLastComponent(Container aContainer) {
        return aContainer;
      }

      public Component getDefaultComponent(Container aContainer) {
        return aContainer;
      }
    });
    setFocusTraversalKeysEnabled(false);

    setDoubleBuffered(true);
    myScrollPane = new JScrollPane();
    myScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    myScrollPane.setVerticalScrollBar(myVerticalScrollBar = new MyScrollBar(Adjustable.VERTICAL));
    myScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    myScrollPane.setHorizontalScrollBar(new MyScrollBar(Adjustable.HORIZONTAL));
    myScrollPane.setViewportView(this);
    myScrollPane.getViewport().addChangeListener(new ChangeListener() {

      public void stateChanged(ChangeEvent e) {
        myNodeSubstituteChooser.setVisible(false);
      }
    });

    myContainer = new JPanel();
    myContainer.setMinimumSize(new Dimension(0, 0));
    myContainer.setLayout(new BorderLayout());
    myContainer.add(myScrollPane, BorderLayout.CENTER);
    myContainer.add(mySearchPanel, BorderLayout.NORTH);

    myScrollPane.setBorder(new LineBorder(Color.LIGHT_GRAY));

    if (showErrorsGutter) {
      myContainer.add(myMessagesGutter, BorderLayout.EAST);
    }

    myNodeSubstituteChooser = new NodeSubstituteChooser(this);
    myNodeRangeSelection = new NodeRangeSelection(this);

    // --- keyboard handling ---
    myKbdHandlersStack = new Stack<KeyboardHandler>();
    myKbdHandlersStack.push(new EditorComponentKeyboardHandler());

    // --- init action map --   
    myActionMap = new HashMap<CellActionType, EditorCellAction>();
    // -- navigation
    myActionMap.put(CellActionType.LEFT, new NodeEditorActions.MoveLeft());
    myActionMap.put(CellActionType.RIGHT, new NodeEditorActions.MoveRight());
    myActionMap.put(CellActionType.UP, new NodeEditorActions.MoveUp());
    myActionMap.put(CellActionType.DOWN, new NodeEditorActions.MoveDown());
    myActionMap.put(CellActionType.NEXT, new NodeEditorActions.MoveNext());
    myActionMap.put(CellActionType.PREV, new NodeEditorActions.MovePrev());
    myActionMap.put(CellActionType.LOCAL_HOME, new NodeEditorActions.MoveLeft(true));
    myActionMap.put(CellActionType.LOCAL_END, new NodeEditorActions.MoveRight());

    myActionMap.put(CellActionType.ROOT_HOME, new NodeEditorActions.MoveToRootHome());
    myActionMap.put(CellActionType.ROOT_END, new NodeEditorActions.MoveToRootEnd());
    myActionMap.put(CellActionType.HOME, new NodeEditorActions.MoveHome());
    myActionMap.put(CellActionType.END, new NodeEditorActions.MoveEnd());
    myActionMap.put(CellActionType.PAGE_DOWN, new NodeEditorActions.MovePageUp());
    myActionMap.put(CellActionType.PAGE_UP, new NodeEditorActions.MovePageDown());

    myActionMap.put(CellActionType.SELECT_UP, new NodeEditorActions.SelectUp());
    myActionMap.put(CellActionType.SELECT_DOWN, new NodeEditorActions.SelectDown());
    myActionMap.put(CellActionType.SELECT_RIGHT, new NodeEditorActions.SideSelect(CellSide.RIGHT));
    myActionMap.put(CellActionType.SELECT_LEFT, new NodeEditorActions.SideSelect(CellSide.LEFT));

    myActionMap.put(CellActionType.COPY, new CellAction_CopyNode());
    myActionMap.put(CellActionType.CUT, new CellAction_CutNode());
    myActionMap.put(CellActionType.PASTE, new CellAction_PasteNode());
    myActionMap.put(CellActionType.PASTE_BEFORE, new CellAction_PasteNodeRelative(true));
    myActionMap.put(CellActionType.PASTE_AFTER, new CellAction_PasteNodeRelative(false));

    myActionMap.put(CellActionType.FOLD, new CellAction_FoldCell());
    myActionMap.put(CellActionType.UNFOLD, new CellAction_UnfoldCell());
    myActionMap.put(CellActionType.FOLD_ALL, new CellAction_FoldAll());
    myActionMap.put(CellActionType.UNFOLD_ALL, new CellAction_UnfoldAll());

    myActionMap.put(CellActionType.RIGHT_TRANSFORM, new CellAction_SideTransform(CellSide.RIGHT));
    myActionMap.put(CellActionType.LEFT_TRANSFORM, new CellAction_SideTransform(CellSide.LEFT));

    myActionMap.put(CellActionType.COMPLETE, new NodeEditorActions.Complete());
    myActionMap.put(CellActionType.COMPLETE_SMART, new CompleteSmart());

    myActionMap.put(CellActionType.SHOW_MESSAGE, new ShowMessage());

    addKeyListener(new KeyAdapter() {
      public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
          mySearchPanel.deactivate();
          if (getHighlightManager().clearForOwner(myOwner) || onEscape()) {
            e.consume();
          }
        }
      }
    });

    registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        moveCurrentUp();
      }
    }, KeyStroke.getKeyStroke("alt UP"), WHEN_FOCUSED);

    registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        moveCurrentDown();
      }
    }, KeyStroke.getKeyStroke("alt DOWN"), WHEN_FOCUSED);

    registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        goToNextErrorCell(false);
      }
    }, KeyStroke.getKeyStroke("F2"), WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

    registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        goToNextErrorCell(true);
      }
    }, KeyStroke.getKeyStroke("shift F2"), WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

    registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        goToNextHighlightedCell(false);
      }
    }, KeyStroke.getKeyStroke("F3"), WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

    registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        goToNextHighlightedCell(true);
      }
    }, KeyStroke.getKeyStroke("shift F3"), WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

    registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        final EditorCell cell = getSelectedCell();
        if (cell == null) return;
        ModelAccess.instance().runReadAction(new Runnable() {
          public void run() {
            showPopupMenu(cell.getX(), cell.getY());
          }
        });
      }
    }, KeyStroke.getKeyStroke("CONTEXT_MENU"), WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

    registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        mySearchPanel.activate();
      }
    }, KeyStroke.getKeyStroke("ctrl F"), WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

    addMouseListener(new MouseAdapter() {
      public void mousePressed(final MouseEvent e) {
        if (areMouseEventsBlocked()) {
          return;
        }
        if (e.isPopupTrigger()) {
          processPopupMenu(e);
        } else {
          processMousePressed(e);
        }
      }

      public void mouseClicked(MouseEvent e) {
        if (areMouseEventsBlocked()) {
          return;
        }
        EditorCell selectedCell = getSelectedCell();
        if (e.getClickCount() == 2 && myRootCell.findLeaf(e.getX(), e.getY()) == selectedCell &&
          selectedCell instanceof EditorCell_Label) {
          ((EditorCell_Label) selectedCell).selectAll();
          repaint();
        }
      }

      public void mouseReleased(MouseEvent e) {
        if (areMouseEventsBlocked()) {
          return;
        }
        if (e.isPopupTrigger()) {
          processPopupMenu(e);
        }
        super.mouseReleased(e);
      }
    });

    addKeyListener(new KeyAdapter() {
      public void keyPressed(final KeyEvent e) {
        processKeyPressed(e);
      }

      public void keyTyped(KeyEvent e) {
        processKeyTyped(e);
      }

      public void keyReleased(final KeyEvent e) {
        processKeyReleased(e);
      }
    });

    myLeftHighlighter = new LeftEditorHighlighter(this);
    myLeftHighlighter.addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(MouseEvent e) {
        for (LeftMarginMouseListener listener : new ArrayList<LeftMarginMouseListener>(myLeftMarginPressListeners)) {
          listener.mousePressed(e, EditorComponent.this);
        }
      }

      @Override
      public void mouseReleased(MouseEvent e) {
        for (LeftMarginMouseListener listener : new ArrayList<LeftMarginMouseListener>(myLeftMarginPressListeners)) {
          listener.mouseReleased(e, EditorComponent.this);
        }
      }

      @Override
      public void mouseClicked(MouseEvent e) {
        for (LeftMarginMouseListener listener : new ArrayList<LeftMarginMouseListener>(myLeftMarginPressListeners)) {
          listener.mouseClicked(e, EditorComponent.this);
        }
      }
    });
    myScrollPane.setRowHeaderView(myLeftHighlighter);

    addFocusListener(new FocusListener() {
      public void focusGained(FocusEvent e) {
        EditorCell selectedCell = getSelectedCell();
        if (selectedCell == null) {
          EditorCell rootCell = getRootCell();
          if (rootCell instanceof EditorCell_Collection) {
            EditorCell focusPolicyCell = FocusPolicyUtil.findCellToSelectDueToFocusPolicy(rootCell);
            EditorCell toSelect;
            if (focusPolicyCell == null || (focusPolicyCell == rootCell && !focusPolicyCell.hasFocusPolicy())) {
              toSelect = rootCell.findChild(CellFinders.or(CellFinders.FIRST_EDITABLE, CellFinders.FIRST_SELECTABLE_LEAF));
            } else {
              toSelect = focusPolicyCell;
            }
            if (toSelect == null) toSelect = rootCell;
            changeSelection(toSelect);
            repaint();
            return;
          }
          if (rootCell != null && rootCell.isSelectable()) {
            changeSelection(rootCell);
          }
        }
        repaint();
      }

      public void focusLost(FocusEvent e) {
        repaint();
        if (myNodeSubstituteChooser.getWindow() != null &&
          (myNodeSubstituteChooser.getWindow().isAncestorOf(e.getOppositeComponent()) || myNodeSubstituteChooser.getWindow() == e.getOppositeComponent()))
          return;
        myNodeSubstituteChooser.setVisible(false);
      }
    });

    myIntentionsSupport = new IntentionsSupport(this);
    myAutoValidator = new AutoValidator(this);

    MPSToolTipManager.getInstance().registerComponent(this);

    CaretBlinker.getInstance().registerEditor(this);

    KeyboardFocusManager.getCurrentKeyboardFocusManager().addPropertyChangeListener("focusOwner", myFocusListener = new PropertyChangeListener() {
      public void propertyChange(PropertyChangeEvent evt) {
        Component focusOwner = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
        if (EditorComponent.this.isAncestorOf(focusOwner)) {
          Component current = focusOwner;
          while (current.getParent() != EditorComponent.this) {
            current = current.getParent();
          }
          selectComponentCell(current);
        }
      }
    });
    EditorSettings.getInstance().addEditorSettingsListener(mySettingsListener);
    ClassLoaderManager.getInstance().addReloadHandler(myReloadListener);

    addFocusListener(new FocusAdapter() {
      public void focusLost(FocusEvent e) {
        commitAll();
      }
    });

    addCellSelectionListener(new CellSelectionListener() {
      public void selectionChanged(EditorComponent editor, EditorCell oldSelection, EditorCell newSelection) {
        updateStatusBarMessage();
      }
    });
  }

  protected void notifyCreation() {
    assert myOperationContext != null;
    EditorComponentCreateListener listener = myOperationContext.getProject().getMessageBus().syncPublisher(EditorComponentCreateListener.EDITOR_COMPONENT_CREATION);
    listener.editorComponentCreated(this);
  }

  protected void notifyDisposal() {
    if (myOperationContext == null) {
      LOG.error("Notify disposal with empty operation context");
      return;
    }
    EditorComponentCreateListener listener = myOperationContext.getProject().getMessageBus().syncPublisher(EditorComponentCreateListener.EDITOR_COMPONENT_CREATION);
    listener.editorComponentDisposed(this);
  }

  protected boolean onEscape() {
    return false;
  }

  public int getShiftX() {
    return myShiftX;
  }

  public JViewport getViewport() {
    return myScrollPane.getViewport();
  }

  @NotNull
  MyScrollBar getVerticalScrollBar() {
    return myVerticalScrollBar;
  }

  public SNode getSelectedNode() {
    EditorCell selectedCell = getSelectedCell();
    if (selectedCell == null) {
      return null;
    }
    return selectedCell.getSNode();
  }

  public List<SNode> getSelectedNodes() {
    return ModelAccess.instance().runReadAction(new Computable<List<SNode>>() {
      public List<SNode> compute() {
        if (getNodeRangeSelection().isActive()) {
          return getNodeRangeSelection().getNodes();
        } else {
          List<SNode> result = new ArrayList<SNode>();
          if (getSelectedNode() != null) {
            result.add(getSelectedNode());
          }
          return result;
        }
      }
    });
  }

  public EditorMessageOwner getHighlightMessagesOwner() {
    return myOwner;
  }

  private void moveCurrentUp() {
    new IntelligentNodeMover(getEditorContext(), getSelectedNodes(), false).move();
  }

  private void moveCurrentDown() {
    new IntelligentNodeMover(getEditorContext(), getSelectedNodes(), true).move();
  }

  private void goToNextErrorCell(boolean backwards) {
    if (getSelectedCell() == null) {
      return;
    }
    new CellNavigator(this) {
      boolean isSuitableCell(EditorCell cell) {
        if (cell.hasErrorMessages()) {
          return true;
        }
        return false;

      }
    }.goToNextCell(backwards);
  }

  private void goToNextHighlightedCell(boolean backwards) {
    if (getSelectedCell() == null) {
      return;
    }
    new CellNavigator(this) {
      boolean isSuitableCell(EditorCell cell) {
        for (EditorMessage m : getHighlightManager().getMessagesFor(cell.getSNode())) {
          if (m.getOwner() == getHighlightMessagesOwner()) {
            return true;
          }
        }
        return false;
      }
    }.goToNextCell(backwards);
  }

  public SNode getEditedNode() {
    return myNode;
  }

  public SNodePointer getEditedNodePointer() {
    return new SNodePointer(myNode);
  }

  public String getToolTipText(final MouseEvent event) {
    return ModelAccess.instance().tryRead(new Computable<String>() {
      public String compute() {
        if (myRootCell == null) {
          return null;
        }

        EditorCell cell = myRootCell.findLeaf(event.getX(), event.getY());
        if (cell == null) {
          return null;
        }
        return getMessageTextFor(cell);
      }
    });
  }

  @Override
  public Point getToolTipLocation(final MouseEvent event) {
    return ModelAccess.instance().tryRead(new Computable<Point>() {
      public Point compute() {
        if (myRootCell == null) {
          return null;
        }

        EditorCell cell = myRootCell.findLeaf(event.getX(), event.getY());
        if (cell == null) {
          return null;
        }
        if (getMessageTextFor(cell) != null) {
          return new Point(cell.getX(), cell.getY() + cell.getHeight());
        } else {
          return null;
        }
      }
    });
  }

  public void updateStatusBarMessage() {
    ModelAccess.instance().runReadInEDT(new Runnable() {
      public void run() {
        if (!isFocusOwner()) return;
        if (getOperationContext() == null || getOperationContext().getProject() == null) return;
        if (isProjectDisposed()) return;

        EditorCell selection = getSelectedCell();
        String info = "";
        if (selection != null) {
          String message = getMessageTextFor(selection);
          if (message != null) {
            info = message;
          }
        }

        Project project = getOperationContext().getProject();
        IdeFrame ideFrame = WindowManager.getInstance().getIdeFrame(project);
        StatusBarEx statusBar = (StatusBarEx) ideFrame.getStatusBar();

        //current info is significant or the editor removes its own message
        if (!info.equals("") || myLastWrittenStatus.equals(statusBar.getInfo())) {
          statusBar.setInfo(info);
          if (!info.equals("")) {
            myLastWrittenStatus = info;
          }
        }
      }
    });
  }

  private String getMessageTextFor(EditorCell cell) {
    EditorMessage message = getHighlighterMessageFor(cell);
    if (message != null) {
      return message.getMessage();
    }
    return null;
  }

  private HighlighterMessage getHighlighterMessageFor(EditorCell cell) {
    EditorCell parent = cell;
    while (parent != null) {
      if (cell.getBounds().getMaxY() < parent.getBounds().getMaxY() && parent.getSNode() != cell.getSNode()) {
        return null;
      }
      List<HighlighterMessage> messages = parent.getMessages(HighlighterMessage.class);
      if (!messages.isEmpty()) {
        return messages.get(0);
      }
      parent = parent.getParent();
    }

    return null;
  }

  public void showMessageTooltip() {
    EditorCell cell = getSelectedCell();
    if (cell == null) {
      return;
    }
    String text = getMessageTextFor(cell);
    Point point = new Point(cell.getX(), cell.getY() + cell.getHeight());
    MPSToolTipManager.getInstance().showToolTip(text, this, point);
  }

  public void hideMessageToolTip() {
    MPSToolTipManager.getInstance().hideToolTip();
  }

  public void editNode(SNode node, IOperationContext operationContext) {
    if (operationContext == null) {
      LOG.errorWithTrace("Opening editor with null context");
    }
    setOperationContext(operationContext);
    editNode(node);
    setReadOnly(node == null || node.isDeleted() || node.getModel().isNotEditable());
  }

  protected void editNode(final SNode node) {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        IOperationContext operationContext = getOperationContext();
        myNode = node;
        SModel model = node == null ? null : node.getModel();
        setEditorContext(new EditorContext(EditorComponent.this, model, operationContext));
        rebuildEditorContent();
      }
    });
  }

  public void addAdditionalPainter(AdditionalPainter additionalPainter) {
    synchronized (myAdditionalPaintersLock) {
      if (!myAdditionalPainters.contains(additionalPainter)) {
        myAdditionalPainters.add(additionalPainter);
        myItemsToAdditionalPainters.put(additionalPainter.getItem(), additionalPainter);
        additionalPainter.afterAdding(this);
      }
    }
  }

  public void removeAdditionalPainter(AdditionalPainter additionalPainter) {
    synchronized (myAdditionalPaintersLock) {
      if (myAdditionalPainters.contains(additionalPainter)) {
        additionalPainter.beforeRemoval(this);
        myAdditionalPainters.remove(additionalPainter);
        myItemsToAdditionalPainters.remove(additionalPainter.getItem());
      }
    }
  }

  public void removeAdditionalPainterByItem(Object item) {
    synchronized (myAdditionalPaintersLock) {
      AdditionalPainter additionalPainter = myItemsToAdditionalPainters.get(item);
      if (additionalPainter != null) {
        additionalPainter.beforeRemoval(this);
        myItemsToAdditionalPainters.remove(item);
        myAdditionalPainters.remove(additionalPainter);
      }
    }
  }

  public Color getAdditionalCellFontColor(@NotNull EditorCell_Label cell) {
    synchronized (myAdditionalPaintersLock) {
      for (AdditionalPainter additionalPainter : myAdditionalPainters) {
        Rectangle coverageArea = additionalPainter.getCoverageArea(this);
        if (coverageArea != null) {
          if (coverageArea.contains(cell.getBounds())) {
            Color color = additionalPainter.getCellsFontColor(cell);
            if (color != null) return color;
          }
        }
      }
      return null;
    }
  }

  public AdditionalPainter getAdditionalPainterByItem(Object item) {
    synchronized (myAdditionalPaintersLock) {
      AdditionalPainter additionalPainter = myItemsToAdditionalPainters.get(item);
      return additionalPainter;
    }
  }

  public List<AdditionalPainter> getAdditionalPainters() {
    List<AdditionalPainter> result;
    synchronized (myAdditionalPaintersLock) {
      result = new ArrayList<AdditionalPainter>(myAdditionalPainters);
    }
    return result;
  }

  @NotNull
  public MessagesGutter getMessagesGutter() {
    return myMessagesGutter;
  }

  @NotNull
  public LeftEditorHighlighter getLeftEditorHighlighter() {
    return myLeftHighlighter;
  }

  public void updateMessages() {

    //todo remove
    getExternalComponent().repaint();
  }

  protected Set<EditorMessage> getMessages() {
    return new LinkedHashSet<EditorMessage>(myHighlightManager.getMessages());
  }

  public IOperationContext getOperationContext() {
    return myOperationContext;
  }

  public void setOperationContext(IOperationContext operationContext) {
    assert operationContext == null || operationContext.getModule() != null;
    myOperationContext = operationContext;
  }

  private EditorCell_Component findCellForComponent(Component component, EditorCell root) {
    if (root instanceof EditorCell_Component && ((EditorCell_Component) root).getComponent() == component) {
      return (EditorCell_Component) root;
    }

    if (root instanceof EditorCell_Collection) {
      EditorCell_Collection collection = (EditorCell_Collection) root;
      for (EditorCell cell : collection) {
        EditorCell_Component result = findCellForComponent(component, cell);
        if (result != null) return result;
      }
    }

    return null;
  }

  private void processPopupMenu(final MouseEvent e) {
    EditorCell selectedCell = getSelectedCell();
    if (selectedCell != null) {
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          showPopupMenu(e);
        }
      });
    }
  }

  private void showPopupMenu(MouseEvent e) {
    showPopupMenu(e.getX(), e.getY());
  }

  private void showPopupMenu(int x, int y) {
    BaseGroup baseGroup = ActionUtils.getGroup(EDITOR_POPUP_MENU_ACTIONS);
    baseGroup.setPopup(false);

    DefaultActionGroup group = ActionUtils.groupFromActions(
      baseGroup,
      new Separator(),
      getCellActionsGroup(),
      getIntentionsGroup()
    );

    JPopupMenu popupMenu = ActionManager.getInstance().createActionPopupMenu(ActionPlaces.EDITOR_POPUP, group).getComponent();
    popupMenu.show(EditorComponent.this, x, y);
  }

  private DefaultActionGroup getIntentionsGroup() {
    DefaultActionGroup result = new DefaultActionGroup("Intentions", true);
    final EditorContext context = getEditorContext();
    for (final com.intellij.openapi.util.Pair<Intention, SNode> pair : getAvailableIntentions()) {
      String description = pair.first.getDescription(pair.second, context);
      Icon icon = pair.first.getType().getIcon();
      BaseAction mpsAction = new BaseAction(description, "Execute intention", icon) {
        protected void doExecute(AnActionEvent e) {
          executeIntention(pair.first, pair.second, context);
        }
      };
      mpsAction.addPlace(ActionPlace.EDITOR);
      result.add(mpsAction);
    }
    return result;
  }

  public void executeIntention(final Intention intention, final SNode node, final EditorContext context) {
    context.executeCommand(new Runnable() {
      public void run() {
        try {
          intention.execute(node, context);
        } catch (Throwable t) {
          LOG.error("Intention execution failed: " + t.getMessage(), t);
        }
      }
    });
  }

  private Set<com.intellij.openapi.util.Pair<Intention, SNode>> getAvailableIntentions() {
    final Set<com.intellij.openapi.util.Pair<Intention, SNode>> result = new LinkedHashSet<com.intellij.openapi.util.Pair<Intention, SNode>>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        SNode node = getSelectedNode();
        EditorContext editorContext = getEditorContext();
        if (node != null && editorContext != null) {
          QueryDescriptor query = new QueryDescriptor();
          query.setIntentionClass(BaseIntention.class);
          query.setInstantiate(true);
          result.addAll(IntentionsManager.getInstance().getAvailableIntentions(query, node, editorContext));
        }
      }
    });
    return result;
  }

  private DefaultActionGroup getCellActionsGroup() {
    DefaultActionGroup result = new DefaultActionGroup("Editor cell actions", true);
    EditorCell cell = getSelectedCell();

    final EditorContext editorContext = createEditorContextForActions();
    for (final EditorCellKeyMapAction action : KeyMapUtil.getRegisteredActions(cell, editorContext)) {
      try {
        if (action.isShownInPopupMenu() && action.canExecute(null, editorContext)) {
          BaseAction mpsAction = new BaseAction("" + action.getDescriptionText()) {
            private EditorCellKeyMapAction myAction = action;

            @NotNull
            public String getKeyStroke() {
              return action.getKeyStroke();
            }

            protected void doExecute(AnActionEvent e) {
              try {
                myAction.execute(null, editorContext);
              } catch (Throwable t) {
                LOG.error(t);
              }
            }
          };
          mpsAction.addPlace(ActionPlace.EDITOR);
          result.add(mpsAction);
        }
      } catch (Throwable t) {
        LOG.error(t);
      }
    }

    return result;
  }

  private EditorContext createEditorContextForActions() {
    return new EditorContext(this, null, getOperationContext());
  }

  private void selectComponentCell(Component component) {
    EditorCell_Component cell = findCellForComponent(component, myRootCell);
    if (cell == null) return;
    changeSelection(cell);
  }

  @NotNull
  public JComponent getExternalComponent() {
    return myContainer;
  }

  public EditorContext getEditorContext() {
    return myEditorContext;
  }

  public abstract EditorCell createRootCell();

  protected abstract EditorCell createRootCell(List<SModelEvent> events);

  public void setFolded(EditorCell cell, boolean folded) {
    if (folded) {
      myFoldedCells.add(cell);
    } else {
      myFoldedCells.remove(cell);
    }
  }

  public Set<EditorCell> getFoldedCells() {
    return new HashSet<EditorCell>(myFoldedCells);
  }

  public void setBracesEnabled(EditorCell cell, boolean enabled) {
    if (enabled) {
      myBracesEnabledCells.add(cell);
    } else {
      myBracesEnabledCells.remove(cell);
    }
  }

  public Set<EditorCell> getBracesEnabledCells() {
    return new HashSet<EditorCell>(myBracesEnabledCells);
  }

  public void flushEvents() {
    myEventsCollector.flush();
  }

  public void dispose() {
    if (myDisposed) throw new IllegalStateException();
    myDisposed = true;

    if (IdeMain.getTestMode() != TestMode.CORE_TEST) {
      hideMessageToolTip();
    }

    myHighlightManager.dispose();

    removeOurListeners();

    EditorSettings.getInstance().removeEditorSettingsListener(mySettingsListener);
    ClassLoaderManager.getInstance().removeReloadHandler(myReloadListener);
    KeyboardFocusManager.getCurrentKeyboardFocusManager().removePropertyChangeListener("focusOwner", myFocusListener);

    clearCaches();

    myEventsCollector.dispose();
    myLeftHighlighter.dispose();
    myMessagesGutter.dispose();

    setEditorContext(null);

    if (myNodeSubstituteChooser != null) {
      myNodeSubstituteChooser.dispose();
    }
    if (myRootCell != null) {
      ((EditorCell_Basic) myRootCell).onRemove();
      myRootCell = null;
    }
  }

  public boolean hasValidSelectedNode() {
    SNode selectedNode = getSelectedNode();
    return selectedNode != null && selectedNode.getModel() != null;
  }

  public boolean isDisposed() {
    return myDisposed;
  }

  private void addOurListeners(@NotNull SModelDescriptor sm) {
    myEventsCollector.add(sm);
    sm.addModelListener(mySimpleModelListener);
    myModelDescriptorsWithListener.add(sm);
  }

  private void removeOurListeners(@NotNull SModelDescriptor sm) {
    myEventsCollector.remove(sm);
    sm.removeModelListener(mySimpleModelListener);
    myModelDescriptorsWithListener.remove(sm);
  }

  private void removeOurListeners() {
    for (SModelDescriptor sm : myModelDescriptorsWithListener.toArray(new SModelDescriptor[myModelDescriptorsWithListener.size()])) {
      removeOurListeners(sm);
    }
  }

  private void clearCaches() {
    myCellsToNodesToDependOnMap.clear();
    removeOurListeners();
    myCellsToRefTargetsToDependOnMap.clear();
    myNodesToBigCellsMap.clear();
    myRefNodeContextsToBigCellsMap.clear();
    myNodePropertiesAccessedCleanlyToDependentCellsMap.clear();
    myNodePropertiesAccessedDirtilyToDependentCellsMap.clear();
    myNodePropertiesWhichExistenceWasCheckedToDependentCellsMap.clear();
  }

  private void setRootCell(EditorCell rootCell) {
    Set<SNode> nodesWhichEditorDependedOn = myCellsToNodesToDependOnMap.get(myRootCell);
    if (nodesWhichEditorDependedOn == null) {
      nodesWhichEditorDependedOn = new HashSet<SNode>();
    }

    if (myRootCell != null) {
      ((EditorCell_Basic) myRootCell).onRemove();
    }

    myRootCell = rootCell;

    if (myRootCell != null) {
      ((EditorCell_Basic) myRootCell).onAdd();
    }

    requestRelayout();

    Set<SNode> nodesWhichEditorDependsOn = myCellsToNodesToDependOnMap.get(myRootCell);
    if (nodesWhichEditorDependsOn == null) {
      nodesWhichEditorDependsOn = new HashSet<SNode>();
    }

    Set<SModelReference> oldsDeps = getModels(nodesWhichEditorDependedOn);
    Set<SModelReference> newDeps = getModels(nodesWhichEditorDependsOn);

    IScope scope = GlobalScope.getInstance();

    for (SModelReference newDep : newDeps) {
      if (!oldsDeps.contains(newDep)) {
        SModelDescriptor sm = scope.getModelDescriptor(newDep);
        if (sm != null) {
          addOurListeners(sm);
        }
      }
    }
    for (SModelReference oldDep : oldsDeps) {
      if (!newDeps.contains(oldDep)) {
        SModelDescriptor sm = scope.getModelDescriptor(oldDep);
        if (sm != null) {
          removeOurListeners(sm);
        }
      }
    }


    Set<SNodePointer> refTargetsWhichEditorDependsOn = myCellsToRefTargetsToDependOnMap.get(myRootCell);
    if (refTargetsWhichEditorDependsOn != null) {
      Set<SNodePointer> nodeProxiesToDelete = new HashSet<SNodePointer>();
      for (SNodePointer nodeProxy : refTargetsWhichEditorDependsOn) {
        SModelDescriptor model = nodeProxy.getModel();
        if (model == null) {
          nodeProxiesToDelete.add(nodeProxy);
          continue;
        }
        addOurListeners(model);
      }
      refTargetsWhichEditorDependsOn.removeAll(nodeProxiesToDelete);
    }


    revalidate();
    repaint();
  }

  private Set<SModelReference> getModels(Set<SNode> nodes) {
    Set<SModelReference> result = new HashSet<SModelReference>();
    for (SNode node : nodes) {
      result.add(node.getModel().getSModelReference());
    }
    return result;
  }

  public EditorCell getRootCell() {
    return myRootCell;
  }

  @NotNull
  public NodeHighlightManager getHighlightManager() {
    return myHighlightManager;
  }

  public CellActionType getActionType(KeyEvent keyEvent, EditorContext editorContext) {
    if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT && noKeysDown(keyEvent)) {
      return CellActionType.LEFT;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT && noKeysDown(keyEvent)) {
      return CellActionType.RIGHT;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_UP && noKeysDown(keyEvent)) {
      return CellActionType.UP;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_DOWN && noKeysDown(keyEvent)) {
      return CellActionType.DOWN;
    }
    if (!SystemInfo.isMac && keyEvent.getKeyCode() == KeyEvent.VK_INSERT && noKeysDown(keyEvent)) {
      return CellActionType.INSERT_BEFORE;
    }
    if (SystemInfo.isMac && keyEvent.getKeyCode() == KeyEvent.VK_ENTER && shiftDown(keyEvent)) {
      return CellActionType.INSERT_BEFORE;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_ENTER && noKeysDown(keyEvent)) {
      EditorCell contextCell = editorContext.getContextCell();
      if (contextCell != null && contextCell.isFirstCaretPosition()) {
        if (!contextCell.isLastCaretPosition() || (contextCell instanceof EditorCell_Label && !((EditorCell_Label) contextCell).isLastPositionAllowed())) {
          return CellActionType.INSERT_BEFORE;
        }
      }
      return CellActionType.INSERT;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT && shiftDown(keyEvent)) {
      return CellActionType.SELECT_LEFT;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT && shiftDown(keyEvent)) {
      return CellActionType.SELECT_RIGHT;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT && ctrlDown(keyEvent)) {
      return CellActionType.LOCAL_HOME;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT && ctrlDown(keyEvent)) {
      return CellActionType.LOCAL_END;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT && ctrlShiftDown(keyEvent)) {
      return CellActionType.SELECT_LOCAL_HOME;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT && ctrlShiftDown(keyEvent)) {
      return CellActionType.SELECT_LOCAL_END;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_UP && ctrlDown(keyEvent)) {
      return CellActionType.SELECT_UP;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_W && ctrlDown(keyEvent)) {
      return CellActionType.SELECT_UP;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_DOWN && ctrlDown(keyEvent)) {
      return CellActionType.SELECT_DOWN;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_W && ctrlShiftDown(keyEvent)) {
      return CellActionType.SELECT_DOWN;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_HOME && ctrlDown(keyEvent)) {
      return CellActionType.ROOT_HOME;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_END && ctrlDown(keyEvent)) {
      return CellActionType.ROOT_END;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_HOME && noKeysDown(keyEvent)) {
      return CellActionType.HOME;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_END && noKeysDown(keyEvent)) {
      return CellActionType.END;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_HOME && shiftDown(keyEvent)) {
      return CellActionType.SELECT_HOME;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_END && shiftDown(keyEvent)) {
      return CellActionType.SELECT_END;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_PAGE_DOWN && noKeysDown(keyEvent)) {
      return CellActionType.PAGE_DOWN;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_PAGE_UP && noKeysDown(keyEvent)) {
      return CellActionType.PAGE_UP;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_TAB && noKeysDown(keyEvent)) {
      return CellActionType.NEXT;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_TAB && shiftDown(keyEvent)) {
      return CellActionType.PREV;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_SPACE && ctrlDown(keyEvent)) {
      return CellActionType.COMPLETE;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_SPACE && ctrlShiftDown(keyEvent)) {
      return CellActionType.COMPLETE_SMART;
    }
    if (keyEvent.getModifiers() == KeyEvent.CTRL_MASK && keyEvent.getKeyCode() == KeyEvent.VK_F1) {
      return CellActionType.SHOW_MESSAGE;
    }

    // ---
    if (keyTyped(keyEvent) && keyEvent.getKeyChar() == ' ' && noKeysDown(keyEvent)) {
      EditorCell selectedCell = editorContext.getNodeEditorComponent().getSelectedCell();

      if (!(selectedCell instanceof EditorCell_STHint)) {
        if (!(selectedCell instanceof EditorCell_Label)) {
          return CellActionType.RIGHT_TRANSFORM;
        }
        EditorCell_Label labelCell = (EditorCell_Label) selectedCell;

        // caret at the end of text ?
        String text = labelCell.getText();
        int caretPosition = labelCell.getCaretPosition();
        //System.out.println("text:" + text + " len:" + text.length() + "caret at:" + caretPosition);
        if (caretPosition == text.length()) {
          return CellActionType.RIGHT_TRANSFORM;
        }

        if (caretPosition == 0) {
          return CellActionType.LEFT_TRANSFORM;
        }
      }
    }


    if (keyEvent.getKeyCode() == KeyEvent.VK_DELETE && ctrlDown(keyEvent)) {
      return CellActionType.DELETE;
    }

    if ((keyEvent.getKeyCode() == KeyEvent.VK_DELETE || keyEvent.getKeyCode() == KeyEvent.VK_BACK_SPACE)
      && noKeysDown(keyEvent)) {

      EditorCell selectedCell = editorContext.getNodeEditorComponent().getSelectedCell();
      if (selectedCell != null && selectedCell.isBigCell()) {
        return CellActionType.DELETE;
      }

      if (selectedCell instanceof EditorCell_Label) {
        EditorCell_Label label = (EditorCell_Label) selectedCell;
        if (label.getText().length() == 0 || ((label instanceof EditorCell_Constant || label instanceof EditorCell_Property) && !label.isEditable() &&
          (label.getAction(CellActionType.DELETE) != null || label.getContainingBigCell().getLastLeaf(CellConditions.SELECTABLE) == label))) {
          return CellActionType.DELETE;
        }
      }
    }

    if (keyEvent.getKeyCode() == KeyEvent.VK_ADD) {
      if (ctrlShiftDown(keyEvent)) {
        return CellActionType.UNFOLD_ALL;
      } else if (ctrlDown(keyEvent)) {
        return CellActionType.UNFOLD;
      }
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_SUBTRACT) {
      if (ctrlShiftDown(keyEvent)) {
        return CellActionType.FOLD_ALL;
      } else if (ctrlDown(keyEvent)) {
        return CellActionType.FOLD;
      }
    }

    // ---
    if (keyEvent.getKeyCode() == KeyEvent.VK_C && ctrlDown(keyEvent)) {
      return CellActionType.COPY;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_X && ctrlDown(keyEvent)) {
      return CellActionType.CUT;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_V) {
      if (ctrlDown(keyEvent)) {
        return CellActionType.PASTE;
      }
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_INSERT && ctrlDown(keyEvent)) {
      return CellActionType.COPY;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_INSERT && shiftDown(keyEvent)) {
      return CellActionType.PASTE;
    }

    return null;
  }

  private boolean ctrlShiftDown(KeyEvent keyEvent) {
    return keyEvent.getModifiers() == (KeyEvent.CTRL_MASK + KeyEvent.SHIFT_MASK);
  }

  private boolean shiftDown(KeyEvent keyEvent) {
    return keyEvent.getModifiers() == KeyEvent.SHIFT_MASK;
  }

  private boolean noKeysDown(KeyEvent keyEvent) {
    return keyEvent.getModifiers() == 0;
  }

  private boolean keyTyped(KeyEvent keyEvent) {
    return keyEvent.getID() == KeyEvent.KEY_TYPED;
  }

  private boolean ctrlDown(KeyEvent keyEvent) {
    return keyEvent.getModifiers() == KeyEvent.CTRL_MASK;
  }

  boolean executeComponentAction(CellActionType type) {
    final EditorCellAction action = getComponentAction(type);
    if (action != null && action.executeInCommand()) {
      executeCommand(new Runnable() {
        public void run() {
          action.execute(getEditorContext());
        }
      });

      return true;
    }
    return false;
  }

  public EditorCellAction getComponentAction(final CellActionType type) {
    return ModelAccess.instance().runReadAction(new Computable<EditorCellAction>() {
      public EditorCellAction compute() {
        EditorCellAction action = myActionMap.get(type);
        if (action != null && action.canExecute(getEditorContext())) {
          return action;
        }
        return null;
      }
    });
  }

  public void relayout() {
    doRelayout();
    revalidate();
    repaint();
    myMessagesGutter.repaint();
  }

  public void requestRelayout() {
    myRelayoutRequested = true;
  }

  public void relayoutIfNeeded() {
    if (myRelayoutRequested) {
      relayout();
      myRelayoutRequested = false;
    }
  }

  public void revalidateAndRepaint() {
    myLeftHighlighter.relayout(false);
    repaint();
  }

  private void doRelayout() {
    if (myRootCell == null) return;

    myRootCell.setX(myShiftX);
    myRootCell.setY(myShiftY);
    myRootCell.relayout();
    myLeftHighlighter.relayout(true);
    if (mySearchPanel.isVisible()) {
      mySearchPanel.search(false);
    }
  }

  public void leftHighlightCell(EditorCell cell, Color c) {
    myLeftHighlighter.highlight(cell, cell, c);
  }

  public void leftHighlightCells(EditorCell cell, EditorCell cell2, Color c) {
    myLeftHighlighter.highlight(cell, cell2, c);
  }

  public void leftUnhighlightCell(EditorCell cell) {
    myLeftHighlighter.unHighlight(cell);
  }

  public void selectNode(final SNode node) {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        EditorCell nodeCell = findNodeCell(node);
        if (nodeCell != null) {
          changeSelection(nodeCell);
        }
      }
    });
  }

  public void selectNode(final SNode node, final String cellId) {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        EditorCell nodeCell = findCellWithId(node, cellId);
        if (nodeCell != null) {
          changeSelection(nodeCell);
        }
      }
    });
  }

  public void selectRefCell(SReference reference) {
    SNode sourceNode = reference.getSourceNode();
    String role = reference.getRole();
    EditorCell cell;
    if (role == null) {
      cell = findNodeCell(sourceNode);
    } else {
      cell = findNodeCellWithRole(sourceNode, role);
      if (cell == null) cell = findNodeCell(sourceNode);
    }
    if (cell == null) {
      return;
    }
    changeSelection(cell.getLastLeaf(CellConditions.SELECTABLE));
  }

  public EditorCell findNodeCell(final SNode node) {
    WeakReference<EditorCell> weakReference = myNodesToBigCellsMap.get(node);
    if (weakReference == null) return null;
    EditorCell result = weakReference.get();
    if (result != null && result.getRootParent() != getRootCell()) {
      return null;
    }
    return result;
  }

  public EditorCell findNodeCellWithRole(SNode node, String role) {
    EditorCell rootCell = findNodeCell(node);
    if (rootCell == null) return null;
    return findNodeCellWithRole(rootCell, role, node);
  }

  private EditorCell findNodeCellWithRole(EditorCell rootCell, String role, SNode node) {
    if (role == null) return null;
    if (role.equals(rootCell.getCellRole()) && node == rootCell.getSNode()) {
      return rootCell;
    }
    if (rootCell instanceof EditorCell_Collection) {
      EditorCell_Collection collection = (EditorCell_Collection) rootCell;
      for (EditorCell child : collection) {
        EditorCell result = findNodeCellWithRole(child, role, node);
        if (result != null) return result;
      }
    }
    return null;
  }

  public EditorCell findCellWithId(SNode node, @NotNull String id) {
    EditorCell bigCell = findNodeCell(node);

    if (bigCell == null) {
      return null;
    }

    return findCellWithIdWithingBigCell(bigCell, id, node);
  }

  private EditorCell findCellWithIdWithingBigCell(EditorCell root, String id, SNode node) {
    if (id == null) {
      return null;
    }

    if (id.equals(root.getCellId()) && root.getSNode() == node) {
      return root;
    }

    if (root instanceof EditorCell_Collection) {
      for (EditorCell child : ((EditorCell_Collection) root)) {
        SNode childNode = child.getSNode();
        if (childNode == node || (childNode != null && childNode.isAttribute() && childNode.getParent() == node)) {
          EditorCell result = findCellWithIdWithingBigCell(child, id, node);
          if (result != null) {
            return result;
          }
        }
      }
    }

    return null;
  }

  public void rebuildEditorContent() {
    LOG.assertInEDT();

    clearCaches();
    clearUserData();
    rebuildEditorContent(null);

    relayoutIfNeeded();
  }

  public void rebuildEditorContent(final List<SModelEvent> events) {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        //i.e. we are disposed. it's too late to rebuild
        if (getEditorContext() == null) {
          return;
        }

        if (getComponents().length > 0) {
          removeAll();
        }

        if (events != null) {
          revertErrorCells(events);
        }

        runSwapCellsActions(new Runnable() {
          public void run() {
            setRootCell(createRootCell(events));
          }
        });

        for (EditorCell_Component component : getCellTracker().getComponentCells()) {
          EditorComponent.this.add(component.getComponent());
        }

        for (RebuildListener listener : myRebuildListeners) {
          listener.editorRebuilt(EditorComponent.this);
        }

        updateMessages();
      }
    });
  }


  public void addRebuildListener(RebuildListener listener) {
    myRebuildListeners.add(listener);
  }

  public void removeRebuildListener(RebuildListener listener) {
    myRebuildListeners.remove(listener);
  }

  public void addSynchronizationListener(CellSynchronizationWithModelListener listener) {
    myCellSynchronizationListeners.add(listener);
  }

  public void removeSynchronizationListener(CellSynchronizationWithModelListener listener) {
    myCellSynchronizationListeners.remove(listener);
  }

  private void fireCellSynchronized(EditorCell cell) {
    for (CellSynchronizationWithModelListener listener : myCellSynchronizationListeners) {
      listener.cellSynchronizedWithModel(cell);
    }
  }

  public EditorCell findCellWeak(int x, int y) {
    EditorCell cell = myRootCell.findLeaf(x, y);
    if (cell == null) {
      cell = myRootCell.findCellWeak(x, y);
    }
    return cell;
  }

  private void processMousePressed(MouseEvent mouseEvent) {
    requestFocus();
    processCoordSelection(mouseEvent);

    if (mouseEvent.getButton() == MouseEvent.BUTTON2) {
      goByCurrentReference();
    }

    boolean ctrlDown = SystemInfo.isMac ? mouseEvent.isMetaDown() : mouseEvent.isControlDown();
    if (ctrlDown) {
      if (mouseEvent.isAltDown()) {
        showCellError();
      } else {
        goByCurrentReference();
      }
    }
  }

  private void goByCurrentReference() {
    final DataContext dataContext = DataManager.getInstance().getDataContext(this);
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        AnAction action = ActionFactory.getInstance().acquireRegisteredAction(GoByCurrentReference_Action.class.getName(), "jetbrains.mps.ide");
        AnActionEvent event = ActionUtils.createEvent(ActionPlaces.EDITOR_POPUP, dataContext);
        ActionUtils.updateAndPerformAction(action, event);
      }
    });
  }

  private void showCellError() {
    final EditorCell selectedCell = getSelectedCell();
    if (selectedCell != null) {
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          final HighlighterMessage message = getHighlighterMessageFor(selectedCell);
          if (message == null) return;
          final IErrorReporter herror = message.getErrorReporter();
          SwingUtilities.invokeLater(new Runnable() {
            public void run() {
              String s = message.getMessage();
              final MPSErrorDialog dialog = new MPSErrorDialog(myOperationContext.getMainFrame(), s, message.getStatus().getPresentation(), false);
              if (herror.getRuleModel() != null && herror.getRuleId() != null) {
                final boolean hasAdditionalRuleIds = !herror.getAdditionalRulesIds().isEmpty();
                final JButton button = new JButton();
                AbstractAction action = new AbstractAction("Go To Rule") {
                  public void actionPerformed(ActionEvent e) {
                    if (hasAdditionalRuleIds) {
                      JPopupMenu popupMenu = new JPopupMenu();
                      popupMenu.add(new AbstractAction("Go To Immediate Rule") {
                        public void actionPerformed(ActionEvent e) {
                          ModelAccess.instance().runReadAction(new Runnable() {
                            public void run() {
                              GoToTypeErrorRuleUtil.goToRuleById(myOperationContext, new Pair<String, String>(herror.getRuleModel(),
                                herror.getRuleId()));
                              dialog.dispose();
                            }
                          });
                        }
                      });
                      for (final Pair<String, String> id : herror.getAdditionalRulesIdsInReverseOrder()) {
                        popupMenu.add(new AbstractAction("Go To Rule " + id.o2) {
                          public void actionPerformed(ActionEvent e) {
                            ModelAccess.instance().runReadAction(new Runnable() {
                              public void run() {
                                GoToTypeErrorRuleUtil.goToRuleById(myOperationContext, id);
                                dialog.dispose();
                              }
                            });
                          }
                        });
                      }
                      popupMenu.show(dialog, button.getX(), button.getY() + button.getHeight());
                    } else {
                      ModelAccess.instance().runReadAction(new Runnable() {
                        public void run() {
                          GoToTypeErrorRuleUtil.goToRuleById(myOperationContext, new Pair<String, String>(herror.getRuleModel(),
                            herror.getRuleId()));
                          dialog.dispose();
                        }
                      });
                    }
                  }
                };
                button.setAction(action);
                dialog.addButton(button);
              }
              dialog.initializeUI();
              dialog.setVisible(true);
            }
          });
          return;
        }
      });
    }
  }

  public void addLeftMarginPressListener(LeftMarginMouseListener listener) {
    myLeftMarginPressListeners.add(listener);
  }

  public void removeLeftMarginPressListener(LeftMarginMouseListener listener) {
    myLeftMarginPressListeners.remove(listener);
  }

  private void processCoordSelection(MouseEvent mouseEvent) {
    EditorCell newSelectedCell = myRootCell.findLeaf(mouseEvent.getX(), mouseEvent.getY(), CellConditions.SELECTABLE);
    if (newSelectedCell == null || !newSelectedCell.isSelectable()) {
      newSelectedCell = myRootCell.findCellWeak(mouseEvent.getX(), mouseEvent.getY(), CellConditions.SELECTABLE);
    }

    EditorCell selectedCell = getSelectedCell();
    if (newSelectedCell != null && (mouseEvent.getButton() != MouseEvent.BUTTON3 || selectedCell == null || !selectedCell.isAncestorOf(newSelectedCell))) {
      changeSelection(newSelectedCell, true, false);
      assert mySelectedCell != null;
      mySelectedCell.processMousePressed(mouseEvent);
      revalidateAndRepaint();
    }
  }

  public void clearSelectionStack() {
    if (getDeepestSelectedCell() instanceof EditorCell_Label) {
      ((EditorCell_Label) getDeepestSelectedCell()).deselectAll();
    }

    mySelectedStack.clear();
  }

  public void pushSelection(EditorCell cell) {
    mySelectedStack.push(cell);
  }

  public EditorCell popSelection() {
    if (!mySelectedStack.isEmpty()) {
      return mySelectedStack.pop();
    }
    return null;
  }

  public EditorCell peekSelection() {
    if (!mySelectedStack.isEmpty()) {
      return mySelectedStack.peek();
    }
    return null;
  }

  public boolean selectionStackContains(EditorCell cell) {
    return mySelectedStack.contains(cell);
  }

  public void changeSelection(EditorCell newSelectedCell) {
    changeSelection(newSelectedCell, true);
  }

  void changeSelection(EditorCell newSelectedCell, boolean resetLastCaretX) {
    changeSelection(newSelectedCell, resetLastCaretX, true);
  }

  void changeSelection(EditorCell newSelectedCell, boolean resetLastCaretX, boolean scroll) {
    clearSelectionStack();
    if (myNodeRangeSelection.isActive()) {
      myNodeRangeSelection.deactivate();
    }
    Stack<EditorCell_Collection> foldedParents = new Stack<EditorCell_Collection>();
    if (newSelectedCell != null) {
      for (EditorCell_Collection collection : CollectionUtil.asIterable(newSelectedCell.parents())) {
        if (collection.isFolded()) {
          foldedParents.push(collection);
        }
      }
      boolean toRelayout = !foldedParents.isEmpty();
      while (!foldedParents.isEmpty()) {
        EditorCell_Collection collection = foldedParents.pop();
        collection.unfold(true);
      }
      if (toRelayout) relayout();
    }
    setSelectionDontClearStack(newSelectedCell, resetLastCaretX, scroll);
  }

  @UseCarefully
  public void setSelectionDontClearStack(EditorCell newSelectedCell, boolean resetLastCaretX) {
    setSelectionDontClearStack(newSelectedCell, resetLastCaretX, true);
  }

  @UseCarefully
  public void setSelectionDontClearStack(EditorCell newSelectedCell, boolean resetLastCaretX, boolean scrollToCell) {
    if (resetLastCaretX) {
      resetLastCaretX();
    }


    if (newSelectedCell != mySelectedCell) {
      myNodeSubstituteChooser.setVisible(false);
      myNodeRangeSelection.deactivate();

      final EditorCell oldSelection = mySelectedCell;
      if (mySelectedCell != null) {
        mySelectedCell.setSelected(false);
      }
      mySelectedCell = newSelectedCell;
      if (mySelectedCell != null && isEditable()) {
        mySelectedCell.setSelected(true);
      }

      boolean eq = false;
      if (newSelectedCell != null && mySelectedCell != null) {
        String id1 = newSelectedCell.getCellId();
        String id2 = mySelectedCell.getCellId();

        if (id1 != null)
          eq = id1.equals(id2);
      }

      //if (!eq)
      fireCellSelectionChanged(oldSelection, newSelectedCell);
    }

    if (mySelectedCell != null) {
      if (scrollToCell) {
        scrollToCell(newSelectedCell);
      }
    }
    repaint();
  }

  public void scrollToNode(SNode node) {
    EditorCell cell = findNodeCell(node);
    if (cell != null) {
      scrollToCell(cell);
    }
  }

  public void ensureSelectionVisible() {
    if (getSelectedCell() == null) {
      return;
    }
    scrollToCell(getSelectedCell());
  }

  public void scrollToCell(EditorCell cell) {
    if (getVisibleRect().isEmpty()) {
      return;
    }

    EditorCell largestVerticalBigCell = cell;

    int viewportWidth = getViewport().getWidth();

    int x0;
    int width;

    if (cell instanceof EditorCell_Label) {
      EditorCell_Label cellLabel = (EditorCell_Label) cell;
      int caretX = cellLabel.getCaretX();
      int charWidth = cellLabel.getCharWidth();
      width = 4 * charWidth;
      x0 = caretX - 2 * charWidth;
    } else if (getDeepestSelectedCell() instanceof EditorCell_Label && cell.getWidth() > viewportWidth) {
      EditorCell_Label cellLabel = (EditorCell_Label) getDeepestSelectedCell();
      int caretX = cellLabel.getCaretX();
      int charWidth = cellLabel.getCharWidth();
      x0 = Math.max(cell.getX(), caretX + 2 * charWidth - viewportWidth);
      width = viewportWidth;
    } else {
      x0 = cell.getX();
      width = cell.getWidth();
    }

    Rectangle visibleRect = getVisibleRect();
    Rectangle rectangle = new Rectangle(x0, visibleRect.y, width, visibleRect.height);
    if (!rectangle.isEmpty()) {
      boolean adjustHorizontally = !visibleRect.contains(rectangle);
      if (adjustHorizontally) {
        if (width <= viewportWidth) {
          int x1 = Math.max(0, x0 + width - viewportWidth);
          scrollToRectIfNotVisible(
            expandRectangleOneLine(
              new Rectangle(
                x1, largestVerticalBigCell.getY(),
                x0 - x1 + width, largestVerticalBigCell.getHeight()
              )));
        } else {
          scrollToRectIfNotVisible(
            expandRectangleOneLine(
              new Rectangle(
                x0 - SCROLL_GAP, largestVerticalBigCell.getY(),
                viewportWidth + SCROLL_GAP, largestVerticalBigCell.getHeight()
              )));
        }
      } else {
        scrollToRectIfNotVisible(
          expandRectangleOneLine(
            new Rectangle(
              x0, largestVerticalBigCell.getY(),
              width, largestVerticalBigCell.getHeight()
            )));
      }
    }
  }

  private void scrollToRectIfNotVisible(Rectangle rect) {
    if (getVisibleRect().contains(rect)) return;

    scrollRectToVisible(rect);
  }

  private Rectangle expandRectangleOneLine(Rectangle r) {
    Font defaultFont = EditorSettings.getInstance().getDefaultEditorFont();
    FontMetrics fontMetrics = getFontMetrics(defaultFont);
    int height = fontMetrics.getHeight();
    Rectangle rectangle = new Rectangle(r.x, r.y - height, r.width, r.height + 2 * height);
    return rectangle;
  }

  public void addCellSelectionListener(CellSelectionListener l) {
    assert l != null;
    assert !mySelectionListeners.contains(l);
    mySelectionListeners.add(l);
  }

  public void removeCellSelectionListener(CellSelectionListener l) {
    mySelectionListeners.remove(l);
  }

  protected void fireCellSelectionChanged(EditorCell oldSelection, EditorCell newSelection) {
    for (CellSelectionListener cellSelectionListener : mySelectionListeners) {
      try {
        cellSelectionListener.selectionChanged(this, oldSelection, newSelection);
      } catch (Exception e) {
        LOG.error(e);
      }
    }
  }

  protected void paintComponent(Graphics gg) {
    Graphics2D g = (Graphics2D) gg;

    turnOnAliasingIfPossible(g);

    g.setColor(getBackground());
    Rectangle bounds = g.getClipBounds();

    g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);

    EditorCell deepestCell = getDeepestSelectedCell();
    if (deepestCell instanceof EditorCell_Label) {
      EditorCell_Label label = (EditorCell_Label) deepestCell;

      g.setColor(CARET_ROW_COLOR);
      g.fillRect(0, deepestCell.getY(), getWidth(),
        deepestCell.getHeight() - deepestCell.getTopInset() - deepestCell.getBottomInset());

      g.setColor(new Color(230, 230, 190));
      g.fillRect(deepestCell.getX() + label.getLeftInset(),
        deepestCell.getY(),
        deepestCell.getWidth() - label.getLeftInset() - label.getRightInset(),
        deepestCell.getHeight() - deepestCell.getTopInset() - deepestCell.getBottomInset());
    }

    List<AdditionalPainter> additionalPainters = getAdditionalPainters();
    for (AdditionalPainter additionalPainter : additionalPainters) {
      if (additionalPainter.paintsBackground()) {
        additionalPainter.paintBackground(g, this);
      }
    }

    if (myRootCell != null) {
      EditorSettings setting = EditorSettings.getInstance();
      g.setColor(Color.LIGHT_GRAY);
      int boundPosition = myRootCell.getX() + setting.getVerticalBoundWidth();
      g.drawLine(boundPosition, 0, boundPosition, getHeight());

      myRootCell.paint(g);
    }

    for (AdditionalPainter additionalPainter : additionalPainters) {
      if (additionalPainter.paintsAbove()) {
        additionalPainter.paint(g, this);
      }
    }

  }

  public Dimension getPreferredSize() {
    if (myRootCell == null) {
      JViewport viewport = myScrollPane.getViewport();
      Rectangle viewRect = viewport.getViewRect();
      return new Dimension(viewRect.width, viewRect.height);
    }
    return new Dimension(myRootCell.getWidth() + myShiftX + 10, myRootCell.getHeight() + myShiftY + 10);
  }

  public Dimension getPreferredScrollableViewportSize() {
    return getPreferredSize();
  }

  public int getScrollableUnitIncrement(Rectangle visibleRect, int orientation, int direction) {
    if (orientation == SwingConstants.VERTICAL) {
      return 20;
    } else { // if orientation == SwingConstants.HORIZONTAL
      return 20;
    }
  }

  public int getScrollableBlockIncrement(Rectangle visibleRect, int orientation, int direction) {
    return visibleRect.height;
  }

  public boolean getScrollableTracksViewportWidth() {
    return myScrollPane.getViewport().getWidth() > getPreferredSize().width;
  }

  public boolean getScrollableTracksViewportHeight() {
    return myScrollPane.getViewport().getHeight() > getPreferredSize().height;
  }

  public EditorCell getDeepestSelectedCell() {
    if (mySelectedStack.isEmpty()) return mySelectedCell;
    return mySelectedStack.get(0);
  }

  @Nullable
  public EditorCell getSelectedCell() {
    return mySelectedCell;
  }

  public KeyboardHandler peekKeyboardHandler() {
    return myKbdHandlersStack.peek();
  }

  public KeyboardHandler popKeyboardHandler() {
    return myKbdHandlersStack.pop();
  }

  public void pushKeyboardHandler(KeyboardHandler kbdHandler) {
    myKbdHandlersStack.push(kbdHandler);
  }

  public void setMouseEventHandler(MouseListener l) {
    assert myMouseEventHandler == null : "Mouse event handler was already specified";
    addMouseListener(myMouseEventHandler = l);
  }

  public void removeMouseEventHandler() {
    assert myMouseEventHandler != null : "Mouse event handler was was not specified";
    removeMouseListener(myMouseEventHandler);
    myMouseEventHandler = null;
  }

  private boolean areMouseEventsBlocked() {
    return myMouseEventHandler != null;
  }

  public Object getUserData(Object key) {
    return myUserDataMap.get(key);
  }

  public void putUserData(Object key, Object data) {
    myUserDataMap.put(key, data);
  }

  public void clearUserData() {
    myUserDataMap.clear();
  }

  public void sendKeyEvent(KeyEvent keyEvent) {
    if (keyEvent.getID() == KeyEvent.KEY_PRESSED) {
      processKeyPressed(keyEvent);
    } else if (keyEvent.getID() == KeyEvent.KEY_RELEASED) {
      processKeyReleased(keyEvent);
    }
  }

  public void processKeyPressed(final KeyEvent keyEvent) {
    if (keyEvent.isConsumed()) return;

    // hardcoded "update" action
    if (keyEvent.getKeyCode() == KeyEvent.VK_F5 && noKeysDown(keyEvent)) {
      //this lock should be obtained before the following read action to avoid deadlock
      Highlighter.runUpdateMessagesAction(new Runnable() {
        public void run() {
          ModelAccess.instance().runReadAction(new Runnable() {
            public void run() {
              SNode sNode = getRootCell().getSNode();
              if (sNode == null) {
                return;
              }
              Highlighter highlighter = getOperationContext().getComponent(Highlighter.class);
              if (highlighter != null) {
                highlighter.resetCheckedState(EditorComponent.this);
              }
              TypeChecker.getInstance().checkRoot(sNode.getContainingRoot(), true);
              rebuildEditorContent();
            }
          });
        }
      });
      keyEvent.consume();
      return;
    }

    if (keyEvent.getKeyCode() == KeyEvent.VK_F11 && noKeysDown(keyEvent)) {
      relayout();
      keyEvent.consume();
      return;
    }

    // all other processing should be performed inside command
    EditorContext editorContext = getEditorContext();
    if (editorContext == null) {
      return; //i.e. editor is disposed
    }

    if (isKeyboardHandlerProcessingEnabled(keyEvent) && peekKeyboardHandler().processKeyPressed(editorContext, keyEvent)) {
      keyEvent.consume();
    }
    revalidateAndRepaint();
  }

  public void processKeyReleased(final KeyEvent keyEvent) {
    if (keyEvent.isConsumed()) return;

    if (isKeyboardHandlerProcessingEnabled(keyEvent) && peekKeyboardHandler().processKeyReleased(getEditorContext(), keyEvent)) {
      keyEvent.consume();
    }

    revalidateAndRepaint();
  }

  public void processKeyTyped(final KeyEvent keyEvent) {
    if (keyEvent.isConsumed()) return;

    if (isKeyboardHandlerProcessingEnabled(keyEvent) && peekKeyboardHandler().processKeyTyped(getEditorContext(), keyEvent)) {
      keyEvent.consume();
    }

    revalidateAndRepaint();
  }

  private boolean isKeyboardHandlerProcessingEnabled(KeyEvent keyEvent) {
    if (!isReadOnly()) {
      return true;
    }
    CellActionType actionType = getActionType(keyEvent, getEditorContext());
    if (actionType != null) {
      switch (actionType) {
        case LEFT:
        case RIGHT:
        case UP:
        case DOWN:
        case SELECT_LEFT:
        case SELECT_RIGHT:
        case SELECT_UP:
        case SELECT_DOWN:
        case SELECT_HOME:
        case SELECT_END:
        case SELECT_LOCAL_HOME:
        case SELECT_LOCAL_END:
        case LOCAL_HOME:
        case LOCAL_END:
        case HOME:
        case END:
        case ROOT_HOME:
        case ROOT_END:
        case PAGE_UP:
        case PAGE_DOWN:
        case NEXT:
        case PREV:
        case COPY:
          return true;
      }
    }
    return false;
  }

  void executeCommand(final Runnable r) {
    myInsideOfCommand = true;
    try {
      ModelAccess.instance().runWriteActionInCommand(new Runnable() {
        public void run() {
          r.run();
        }
      });
    } finally {
      myInsideOfCommand = false;
    }

    relayoutIfNeeded();
  }

  <T> T executeCommand(final Computable<T> c) {
    myInsideOfCommand = true;
    try {
      return ModelAccess.instance().runWriteActionInCommand(c);
    } finally {
      myInsideOfCommand = false;
    }
  }

  boolean isForcedFocusChangeEnabled() {
    return myInsideOfCommand;
  }

  public boolean activateNodeSubstituteChooser(EditorCell editorCell, boolean resetPattern) {
    return activateNodeSubstituteChooser(editorCell, resetPattern, false);
  }

  public boolean activateNodeSubstituteChooser(EditorCell editorCell, boolean resetPattern, boolean isSmart) {
    if (myNodeSubstituteChooser.isVisible()) {
      return true;
      //todo: rebuild menu if smartness changed
    }

    // try to obtain substitute info
    NodeSubstituteInfo substituteInfo = null;
    if (editorCell != null) {
      substituteInfo = editorCell.getSubstituteInfo();
    }

    return activateNodeSubstituteChooser(editorCell, substituteInfo, resetPattern, isSmart);
  }

  public boolean activateNodeSubstituteChooser(EditorCell editorCell, NodeSubstituteInfo substituteInfo, boolean resetPattern) {
    return activateNodeSubstituteChooser(editorCell, substituteInfo, resetPattern, false);
  }

  public boolean activateNodeSubstituteChooser(EditorCell editorCell, NodeSubstituteInfo substituteInfo, boolean resetPattern, boolean isSmart) {
    if (substituteInfo == null) {
      return false;
    }

    // do substitute...
    LOG.debug("substitute info : " + substituteInfo);
    NodeSubstitutePatternEditor patternEditor = editorCell.createSubstitutePatternEditor();
    if (resetPattern) {
      patternEditor.setCaretPosition(0);
    }
    String pattern = patternEditor.getPattern();
    boolean trySubstituteNow =
      !patternEditor.getText().equals(substituteInfo.getOriginalText()) || // user changed text or cell has no text
        pattern.equals(patternEditor.getText()); // caret at the end


    // 1st - try to do substitution with current pattern (if cursor at the end of text)
    if (trySubstituteNow) {
      List<INodeSubstituteAction> matchingActions = isSmart ? substituteInfo.getSmartMatchingActions(pattern, false, editorCell) :
        substituteInfo.getMatchingActions(pattern, false);
      if (matchingActions.size() == 1 && pattern.length() > 0) {
        matchingActions.get(0).substitute(this.getEditorContext(), pattern);
        return true;
      }
    }

    myNodeSubstituteChooser.setNodeSubstituteInfo(substituteInfo);
    myNodeSubstituteChooser.setPatternEditor(patternEditor);
    myNodeSubstituteChooser.setLocationRelative(editorCell);
    myNodeSubstituteChooser.setIsSmart(isSmart);
    myNodeSubstituteChooser.setContextCell(editorCell);
    myNodeSubstituteChooser.setVisible(true);
    return true;
  }

  public NodeSubstituteChooser getNodeSubstituteChooser() {
    return myNodeSubstituteChooser;
  }


  public void paint(Graphics g) {
    super.paint(g);
    if (myNodeRangeSelection.isActive()) {
      myNodeRangeSelection.paint(g);
    }
  }

  @NotNull
  public NodeRangeSelection getNodeRangeSelection() {
    return myNodeRangeSelection;
  }

  // last caret X

  boolean hasLastCaretX() {
    return myHasLastCaretX;
  }

  int getLastCaretX() {
    return myLastCaretX;
  }

  public void resetLastCaretX() {
    myHasLastCaretX = false;
  }

  void saveLastCaretX(int lastCaretX) {
    myLastCaretX = lastCaretX;
    myHasLastCaretX = true;
  }

  public void addCellDependentOnNodeProperty(EditorCell_Property cell, Pair<SNodePointer, String> pair) {
    WeakSet<EditorCell_Property> dependentCells = myNodePropertiesAccessedCleanlyToDependentCellsMap.get(pair);
    if (dependentCells == null) {
      dependentCells = new WeakSet<EditorCell_Property>();
      myNodePropertiesAccessedCleanlyToDependentCellsMap.put(pair, dependentCells);
    }
    dependentCells.add(cell);
  }

  public void addCellDependentOnNodePropertyWhichWasAccessedDirtily(EditorCell cell, Pair<SNodePointer, String> pair) {
    WeakSet<EditorCell> dependentCells = myNodePropertiesAccessedDirtilyToDependentCellsMap.get(pair);
    if (dependentCells == null) {
      dependentCells = new WeakSet<EditorCell>();
      myNodePropertiesAccessedDirtilyToDependentCellsMap.put(pair, dependentCells);
    }
  }

  public void addCellDependentOnNodePropertyWhichExistenceWasChecked(EditorCell cell, Pair<SNodePointer, String> pair) {
    WeakSet<EditorCell> dependentCells = myNodePropertiesWhichExistenceWasCheckedToDependentCellsMap.get(pair);
    if (dependentCells == null) {
      dependentCells = new WeakSet<EditorCell>();
      myNodePropertiesWhichExistenceWasCheckedToDependentCellsMap.put(pair, dependentCells);
    }
    dependentCells.add(cell);
  }

  public void putCellAndNodesToDependOn(EditorCell cell, Set<SNode> nodes, Set<SNodePointer> refTargets) {
    myCellsToNodesToDependOnMap.put(cell, nodes);
    myCellsToRefTargetsToDependOnMap.put(cell, refTargets);
  }

  public Set<SNode> getNodesCellDependOn(EditorCell cell) {
    Set<SNode> nodes = myCellsToNodesToDependOnMap.get(cell);
    if (nodes == null) return null;
    return Collections.unmodifiableSet(nodes);
  }

  public Set<SNodePointer> getCopyOfRefTargetsCellDependsOn(EditorCell cell) {
    Set<SNodePointer> nodeProxies = myCellsToRefTargetsToDependOnMap.get(cell);
    if (nodeProxies == null) return null;
    return new HashSet<SNodePointer>(nodeProxies);
  }

  public boolean doesCellDependOnNode(EditorCell cell, SNode node) {
    if ((cell == null) && node != null) return true;
    Set<SNode> sNodes = myCellsToNodesToDependOnMap.get(cell);
    Set<SNodePointer> nodeProxies = myCellsToRefTargetsToDependOnMap.get(cell);
    return ((sNodes != null) && (sNodes.contains(node))) || ((nodeProxies != null && nodeProxies.contains(new SNodePointer(node))));
  }

  public void clearNodesCellDependsOn(EditorCell cell, EditorManager editorManager) {
    if (editorManager == EditorManager.getInstanceFromContext(myOperationContext)) {
      myCellsToNodesToDependOnMap.remove(cell);
      myCellsToRefTargetsToDependOnMap.remove(cell);
      if (myRootCell == cell) {
        removeOurListeners();
      }
    }
  }

  void registerAsBigCell(EditorCell cell, ReferencedNodeContext refContext, EditorManager manager) {
    if (manager == EditorManager.getInstanceFromContext(myOperationContext)) {
      myRefNodeContextsToBigCellsMap.put(refContext, new WeakReference<EditorCell>(cell));
      myNodesToBigCellsMap.put(cell.getSNode(), new WeakReference<EditorCell>(cell));
    }
  }

  EditorCell getBigCellForRefContext(ReferencedNodeContext refContext) {
    WeakReference<EditorCell> weakReference = myRefNodeContextsToBigCellsMap.get(refContext);
    if (weakReference == null) return null;
    return weakReference.get();
  }

  public EditorCell getBigValidCellForNode(SNode node) {
    EditorCell result = findNodeCell(node);
    if (isValid(result)) return result;
    return null;
  }

  public boolean isValid(EditorCell cell) {
    if (cell == null) return false;
    return ((EditorCell_Basic) cell).isInTree() && cell.getEditor() == this;
  }

  public void setSelectedStackFromMemento(Stack<CellInfo> mementoSelectedStack) {
    mySelectedStack.clear();
    Stack<EditorCell> temp = new Stack<EditorCell>();

    for (int i = mementoSelectedStack.size() - 1; i >= 0; i--) {
      CellInfo cellInfo = mementoSelectedStack.get(i);
      EditorCell cell = cellInfo.findCell(this);
      if (cell == null) break;
      temp.push(cell);
    }
    while (temp.size() > 0) {
      mySelectedStack.push(temp.pop());
    }
  }

  /*package*/

  Stack<CellInfo> getSelectedStackForMemento() {
    Stack<CellInfo> result = new Stack<CellInfo>();
    for (EditorCell cell : mySelectedStack) {
      if (cell != null) result.push(cell.getCellInfo());
    }
    return result;
  }

  public EditorCell changeSelectionWRTFocusPolicy(@NotNull EditorCell cell) {
    EditorCell focusPolicyCell = FocusPolicyUtil.findCellToSelectDueToFocusPolicy(cell);
    EditorCell toSelect;
    if (focusPolicyCell == null || (focusPolicyCell == cell && !focusPolicyCell.hasFocusPolicy())) {
      toSelect = cell.findChild(CellFinders.or(CellFinders.FIRST_ERROR, CellFinders.FIRST_EDITABLE));
      if (toSelect == null) {
        toSelect = cell.findChild(CellFinders.FIRST_SELECTABLE_LEAF);
      }
    } else {
      toSelect = focusPolicyCell;
    }
    if (toSelect == null) toSelect = cell;
    changeSelection(toSelect);

    if (toSelect instanceof EditorCell_Label) {
      EditorCell_Label label = (EditorCell_Label) toSelect;
      if (label.getDefaultCaretPosition() != null) {
        if (label.getDefaultCaretPosition() == CaretPosition.FIRST) {
          label.home();
        }
        if (label.getDefaultCaretPosition() == CaretPosition.LAST) {
          label.end();
        }
      } else if (!toSelect.isErrorState()) {
        label.end();
      }
    }

    return toSelect;
  }

  protected void setEditorContext(EditorContext editorContext) {
    assert editorContext == null || editorContext.getOperationContext() == null || editorContext.getOperationContext().getModule() != null;
    myEditorContext = editorContext;
  }

  private void runSwapCellsActions(Runnable action) {
    try {
      myCellSwapInProgress = true;
      if (mySelectedCell != null) myRecentlySelectedCellInfo = mySelectedCell.getCellInfo();
      Object memento = null;
      if (getEditorContext() != null) {
        memento = getEditorContext().createMemento();
      }
      myFoldedCells.clear();
      myBracesEnabledCells.clear();
      action.run();
      if (getEditorContext() != null) {
        getEditorContext().setMemento(memento);
      }
      myRecentlySelectedCellInfo = null;
    } finally {
      myCellSwapInProgress = false;
    }
  }

  boolean isCellSwapInProgress() {
    return myCellSwapInProgress;
  }

  /*package*/

  CellInfo getRecentlySelectedCellInfo() {
    return myRecentlySelectedCellInfo;
  }

  public boolean isReadOnly() {
    return myReadOnly;
  }

  public void setReadOnly(boolean readOnly) {
    myReadOnly = readOnly;
  }

  @Nullable
  public Object getData(@NonNls String dataId) {
    //MPSDK
    if (dataId.equals(MPSDataKeys.NODE.getName())) {
      EditorCell selectedCell = getSelectedCell();
      if (selectedCell != null) {
        return selectedCell.getSNode();
      } else {
        return getRootCell().getSNode();
      }
    }
    if (dataId.equals(MPSDataKeys.NODES.getName())) return getSelectedNodes();
    if (dataId.equals(MPSDataKeys.CONTEXT_MODEL.getName())) {
      return ModelAccess.instance().runReadAction(new Computable() {
        public Object compute() {
          SNode node = getRootCell().getSNode();
          if (node == null) return null;
          SModel model = node.getModel();
          if (model == null) return null; //removed model
          return model.getModelDescriptor();
        }
      });
    }
    if (dataId.equals(MPSDataKeys.CONTEXT_MODULE.getName())) {
      EditorCell rootCell = getRootCell();
      if (rootCell == null) return null;
      SNode node = rootCell.getSNode();
      if (node == null) return null;
      SModelDescriptor modelDescriptor = node.getModel().getModelDescriptor();
      if (modelDescriptor == null) return null;
      return modelDescriptor.getModule();
    }
    if (dataId.equals(MPSDataKeys.OPERATION_CONTEXT.getName())) return getOperationContext();
    if (dataId.equals(MPSDataKeys.EDITOR_CONTEXT.getName())) return createEditorContextForActions();
    if (dataId.equals(MPSDataKeys.EDITOR_CELL.getName())) return getSelectedCell();
    if (dataId.equals(MPSDataKeys.EDITOR_COMPONENT.getName())) return this;
    if (dataId.equals(MPSDataKeys.PLACE.getName())) return ActionPlace.EDITOR;

    //PDK
    if (dataId.equals(PlatformDataKeys.CUT_PROVIDER.getName())) return new MyCutProvider();
    if (dataId.equals(PlatformDataKeys.COPY_PROVIDER.getName())) return new MyCopyProvider();
    if (dataId.equals(PlatformDataKeys.PASTE_PROVIDER.getName()))  return new MyPasteProvider();
    if (dataId.equals(PlatformDataKeys.VIRTUAL_FILE_ARRAY.getName())) {
      return ModelAccess.instance().runReadAction(new Computable<Object>() {
        public Object compute() {
          if (myNode == null) return null;
          SModelDescriptor sModelDescriptor = myNode.getModel().getModelDescriptor();
          if (sModelDescriptor == null) {
            return null;
          }
          IFile ifile = sModelDescriptor.getModelFile();
          if (ifile == null || !ifile.exists()) return null;
          VirtualFile vfile = VFileSystem.getFile(ifile);
          if (vfile == null) return null;
          return new VirtualFile[]{vfile};
        }
      });
    }

    //not found
    return null;
  }

  private void handleEvents(List<SModelEvent> events) {
    if (EventUtil.isDetachedOnlyChange(events)) {
      return;
    }

    SNode lastSelectedNode = getSelectedNode();

    if (!EventUtil.isDramaticalChange(events)) {
      if (EventUtil.isPropertyChange(events)) {
        String propertyName = ((SModelPropertyEvent) events.get(0)).getPropertyName();
        SNodePointer nodeProxy = new SNodePointer(((SModelPropertyEvent) events.get(0)).getNode());
        Pair<SNodePointer, String> pair = new Pair<SNodePointer, String>(nodeProxy, propertyName);
        Set<EditorCell_Property> editorCell_properties = myNodePropertiesAccessedCleanlyToDependentCellsMap.get(pair);
        Set<EditorCell> editorCells = myNodePropertiesAccessedDirtilyToDependentCellsMap.get(pair);
        Set<EditorCell> editorCellsDependentOnExistence = myNodePropertiesWhichExistenceWasCheckedToDependentCellsMap.get(pair);
        if (editorCellsDependentOnExistence != null) {
          if (EventUtil.isPropertyAddedOrRemoved(events.get(0))) {
            rebuildEditorContent(events);
          } else {
            for (EditorCell cell : editorCellsDependentOnExistence) {
              cell.synchronizeViewWithModel();
              fireCellSynchronized(cell);
            }
            if (editorCell_properties != null) {
              for (EditorCell cell : editorCell_properties) {
                cell.synchronizeViewWithModel();
                fireCellSynchronized(cell);
              }
            }
            requestRelayout();
          }
          relayoutIfNeeded();
          return;
        }
        if (editorCells != null) {
          rebuildEditorContent(events);
          relayoutIfNeeded();
          updateSelection(events, lastSelectedNode);
        } else if (editorCell_properties != null) {
          for (EditorCell_Property cell : editorCell_properties) {
            cell.synchronizeViewWithModel();
            fireCellSynchronized(cell);
          }
          requestRelayout();
          revertErrorCells(events);
        }
      } else {
        rebuildEditorContent(events);
      }
    } else {// "dramatical" change
      rebuildEditorContent(events);

      if (!hasFocus() && !myIntentionsSupport.isLightBulbVisible()) {
        return;
      }

      revertErrorCells(events);
      relayoutIfNeeded();
      updateSelection(events, lastSelectedNode);
    }

    if (!myInsideOfCommand) {
      relayoutIfNeeded();
    }
  }

  private void updateSelection(List<SModelEvent> events, SNode lastSelectedNode) {
    SModelEvent lastAdd = null;
    SModelEvent lastRemove = null;

    List<SNode> childAddedEventNodes = new ArrayList<SNode>();

    for (SModelEvent e : events) {
      if (e instanceof SModelChildEvent) {
        SModelChildEvent ce = (SModelChildEvent) e;
        if (ce.getParent().getAncestors(true).contains(getEditedNode())) {
          if (ce.isAdded()) {
            lastAdd = ce;
            childAddedEventNodes.add(ce.getChild());
          }
          if (ce.isRemoved()) {
            lastRemove = ce;
          }
        }
      }

      if (e instanceof SModelReferenceEvent) {
        SModelReferenceEvent re = (SModelReferenceEvent) e;
        if (re.isAdded()) lastAdd = re;
        if (re.isRemoved()) lastRemove = re;
      }
    }

    if (lastAdd != null && isForcedFocusChangeEnabled()) {
      if (lastAdd instanceof SModelChildEvent) {
        List<NodesParetoFrontier.NodeBox> frontier = NodesParetoFrontier.findParetoFrontier(childAddedEventNodes);
        SNode addedChild = frontier.get(frontier.size() - 1).getNode();
        EditorCell cell = findNodeCell(addedChild);
        if (cell != null) {
          changeSelectionWRTFocusPolicy(cell);
        }
        return;
      } else {
        //noinspection ConstantConditions
        if (lastAdd instanceof SModelReferenceEvent) {
          SModelReferenceEvent re = (SModelReferenceEvent) lastAdd;
          selectRefCell(re.getReference());
          return;
        } else {
          //
        }
      }
    }

    if (lastRemove != null) {
      if (lastRemove instanceof SModelChildEvent && (lastSelectedNode == null || lastSelectedNode.isDeleted())) {
        SModelChildEvent ce = (SModelChildEvent) lastRemove;
        int childIndex = ce.getChildIndex();
        String role = ce.getChildRole();
        SNode parent = ce.getParent();

        List<SNode> siblings = parent.getChildren(role);
        if (siblings.isEmpty()) {
          EditorCell nullCell = findNodeCellWithRole(parent, role);
          if (nullCell == null) {
            EditorCell cell = findNodeCell(parent);
            if (cell != null) {
              EditorCell lastLeaf = cell.getLastLeaf(CellConditions.SELECTABLE);
              if (lastLeaf == null) {
                return;
              }
              changeSelection(lastLeaf);
              lastLeaf.end();
              return;
            }
          } else {
            changeSelectionWRTFocusPolicy(nullCell);
          }
        } else {
          SNode target = null;
          for (SNode sibling : siblings) {
            int index = parent.getChildren().indexOf(sibling);
            if (index < childIndex) {
              target = sibling;
            }
          }

          if (target != null) {
            EditorCell cell = findNodeCell(target);
            if (cell != null) {
              EditorCell lastLeaf = cell.getLastLeaf(CellConditions.SELECTABLE);
              changeSelection(lastLeaf);
              lastLeaf.end();
              return;
            }
          } else {
            EditorCell cell = findNodeCell(siblings.get(0));
            if (cell != null) {
              EditorCell lastLeaf = cell.getFirstLeaf(CellConditions.SELECTABLE);
              changeSelection(lastLeaf);
              lastLeaf.home();
              return;
            }
          }
        }
      }

      //noinspection ConstantConditions
      if (lastRemove instanceof SModelReferenceEvent && isForcedFocusChangeEnabled()) {
        SModelReferenceEvent re = (SModelReferenceEvent) lastRemove;
        SReference ref = re.getReference();
        SNode sourceNode = ref.getSourceNode();
        String role = ref.getRole();
        EditorCell nullCell = findNodeCellWithRole(sourceNode, role);
        if (nullCell == null) {
          EditorCell cell = findNodeCell(sourceNode);
          if (cell != null) {
            changeSelectionWRTFocusPolicy(cell);
          }
        } else {
          changeSelectionWRTFocusPolicy(nullCell);
        }
      }
    }

    if (getSelectedNode() == null) {
      EditorCell lastSelectedNodeCell = findNodeCell(lastSelectedNode);
      if (lastSelectedNodeCell != null) {
        changeSelection(lastSelectedNodeCell.findChild(CellFinders.FIRST_SELECTABLE_LEAF));
      }
    }
  }

  private void revertErrorCells(List<SModelEvent> events) {
    final boolean[] wereReverted = new boolean[1];
    for (SModelEvent e : events) {
      e.accept(new SModelEventVisitorAdapter() {
        public void visitPropertyEvent(SModelPropertyEvent event) {
          EditorCell cell = findNodeCell(event.getNode());
          if (cell != null && isErrorWithinBigCell(cell)) {
            synchronizeWithModelWithinBigCell(cell);
            wereReverted[0] = true;
          }
        }

        public void visitReferenceEvent(SModelReferenceEvent event) {
          EditorCell cell = findNodeCell(event.getReference().getSourceNode());
          if (cell != null && isErrorWithinBigCell(cell)) {
            synchronizeWithModelWithinBigCell(cell);
            wereReverted[0] = true;
          }
        }

        private boolean isErrorWithinBigCell(EditorCell cell) {
          if (cell.isErrorState()) return true;

          if (cell instanceof EditorCell_Collection) {
            EditorCell_Collection collection = (EditorCell_Collection) cell;

            for (EditorCell child : collection) {
              if (child.isBigCell()) continue;
              if (isErrorWithinBigCell(child)) return true;
            }
          }

          return false;
        }
      });
    }
    if (wereReverted[0]) {
      requestRelayout();
    }
  }

  private void synchronizeWithModelWithinBigCell(EditorCell cell) {
    if (cell instanceof EditorCell_Collection) {
      EditorCell_Collection collection = (EditorCell_Collection) cell;
      for (EditorCell child : collection) {
        if (child.getSNode() == cell.getSNode()) {
          synchronizeWithModelWithinBigCell(child);
        }
      }
    } else {
      cell.synchronizeViewWithModel();
    }
  }


  private void commitAll() {
    ModelAccess.instance().runCommandInEDT(new Runnable() {
      public void run() {
        doCommitAll(getRootCell());
      }
    });
  }

  private void doCommitAll(EditorCell current) {
    if (current instanceof EditorCell_Property) {
      ((EditorCell_Property) current).commit();
    }
    if (current instanceof EditorCell_Collection) {
      EditorCell_Collection collection = (EditorCell_Collection) current;
      for (EditorCell cell : collection) {
        doCommitAll(cell);
      }
    }
  }

  private boolean isProjectDisposed() {
    return getOperationContext() != null && getOperationContext().getProject() != null && getOperationContext().getProject().isDisposed();
  }

  public boolean isEditable() {
    return myIsEditable;
  }

  public void setEditable(boolean isEditable) {
    myIsEditable = isEditable;
    if (!isEditable) {
      setFocusable(false);
    }
  }

  public CellTracker getCellTracker() {
    return myCellTracker;
  }

  public BracesHighlighter getBracesHighlighter() {
    return myBracesHighlighter;
  }

  private class MySimpleModelListener extends SModelAdapter {
    public void modelReplaced(final SModelDescriptor sm) {
      assert SwingUtilities.isEventDispatchThread() : "Model reloaded notification expected in EventDispatchThread";
      if (myNode != null) {
        if (myNode.getModel().getSModelReference().equals(sm.getSModelReference())) {
          SNodeId oldId = myNode.getSNodeId();
          myNode = sm.getSModel().getNodeById(oldId);
        }
      }
      rebuildEditorContent();
    }
  }

  private class MyEventsCollector extends EventsCollector {
    protected void eventsHappened(List<SModelEvent> events) {
      handleEvents(events);
    }
  }

  public static interface RebuildListener {
    public void editorRebuilt(EditorComponent editor);
  }

  public static interface CellSynchronizationWithModelListener {
    public void cellSynchronizedWithModel(EditorCell cell);
  }

  public void repaint() {
    super.repaint();
    if (myLeftHighlighter != null) {
      myLeftHighlighter.repaint();
    }
  }

  private class MPSActionProxy extends AbstractAction {
    private List<BaseAction> myActions = new ArrayList<BaseAction>();
    private String myPlace = ActionPlaces.UNKNOWN;

    public void add(String place, BaseAction a) {
      myPlace = place;
      myActions.add(a);
    }

    public List<String> getActionNames() {
      List<String> result = new ArrayList<String>();
      for (BaseAction baseAction : myActions) {
        result.add(baseAction.getClass().getSimpleName());
      }
      return result;
    }

    public List<BaseAction> getActiveActions() {
      List<BaseAction> result = new ArrayList<BaseAction>();
      for (final BaseAction action : myActions) {
        if (isActionActive(action)) {
          result.add(action);
        }
      }
      return result;
    }

    public boolean isActionActive(BaseAction action) {
      if (mySelectedCell == null || mySelectedCell.getSNode() == null) {
        return false;
      }
      DataContext context = DataManager.getInstance().getDataContext(EditorComponent.this);
      AnActionEvent event = ActionUtils.createEvent(myPlace, context);

      action.update(event);
      return event.getPresentation().isEnabled();
    }

    public void actionPerformed(ActionEvent e) {
      for (final BaseAction action : myActions) {
        if (isActionActive(action)) {
          DataContext context = DataManager.getInstance().getDataContext(EditorComponent.this);
          AnActionEvent event = ActionUtils.createEvent(myPlace, context);
          action.actionPerformed(event);
        }
      }
    }
  }

  private class ReferenceUnderliner {
    private EditorCell myLastReferenceCell;

    private ReferenceUnderliner() {
      addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent e) {
          if (e.getKeyCode() == getKeyCode()) {
            setControlOver();
          }
        }

        public void keyReleased(KeyEvent e) {
          if (e.getKeyCode() == getKeyCode()) {
            clearControlOver();
          }
        }

        private int getKeyCode() {
          return SystemInfo.isMac ? KeyEvent.VK_META : KeyEvent.VK_CONTROL;
        }
      });
      addMouseMotionListener(new MouseMotionListener() {
        public void mouseDragged(MouseEvent e) {
        }

        public void mouseMoved(MouseEvent e) {
          if (!myEditorContext.getNodeEditorComponent().isFocusOwner()) return;

          clearControlOver();
          if (!(SystemInfo.isMac ? e.isMetaDown() : e.isControlDown())) {
            myLastReferenceCell = null;
            return;
          }

          if (myRootCell == null) {
            myLastReferenceCell = null;
            return;
          }
          final EditorCell editorCell = myRootCell.findLeaf(e.getX(), e.getY());
          if (editorCell == null) {
            myLastReferenceCell = null;
            return;
          }
          SNode snodeWRTReference = ModelAccess.instance().runReadAction(new Computable<SNode>() {
            public SNode compute() {
              return editorCell.getSNodeWRTReference();
            }
          });
          if (editorCell.getSNode() == snodeWRTReference) {
            myLastReferenceCell = null;
            return;
          }
          myLastReferenceCell = editorCell;

          setControlOver();
        }
      });
      addFocusListener(new FocusListener() {
        public void focusGained(FocusEvent e) {
        }

        public void focusLost(FocusEvent e) {
          clearControlOver();
          myLastReferenceCell = null;
        }
      });
    }

    private void clearControlOver() {
      if (myLastReferenceCell != null) {
        ModelAccess.instance().runReadAction(new Runnable() {
          public void run() {
            myLastReferenceCell.getStyle().set(StyleAttributes.CONTROL_OVERED_REFERENCE, false);
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            repaint();
          }
        });
      }
    }

    private void setControlOver() {
      if (myLastReferenceCell != null) {
        ModelAccess.instance().runReadAction(new Runnable() {
          public void run() {
            myLastReferenceCell.getStyle().set(StyleAttributes.CONTROL_OVERED_REFERENCE, true);
            setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            repaint();
          }
        });
      }
    }
  }


  private class MyCutProvider implements CutProvider {
    public void performCut(DataContext dataContext) {
      ModelAccess.instance().runWriteActionInCommand(new Runnable() {
        public void run() {
          EditorCell selectedCell = getSelectedCell();
          assert selectedCell != null;
          selectedCell.executeAction(CellActionType.CUT);
        }
      });
    }

    public boolean isCutEnabled(DataContext dataContext) {
      return ModelAccess.instance().runReadAction(new Computable<Boolean>() {
        public Boolean compute() {
          if (getEditorContext() == null) return false;
          if (getSelectedCell() == null) return false;
          return getSelectedCell().canExecuteAction(CellActionType.CUT);
        }
      });
    }

    public boolean isCutVisible(DataContext dataContext) {
      return true;
    }
  }

  private class MyCopyProvider implements CopyProvider {
    public void performCopy(DataContext dataContext) {
      ModelAccess.instance().runWriteActionInCommand(new Runnable() {
        public void run() {
          EditorCell selectedCell = getSelectedCell();
          assert selectedCell != null;
          selectedCell.executeAction(CellActionType.COPY);
        }
      });
    }

    public boolean isCopyEnabled(DataContext dataContext) {
      return ModelAccess.instance().runReadAction(new Computable<Boolean>() {
        public Boolean compute() {
          if (getEditorContext() == null) return false;
          if (getSelectedCell() == null) return false;
          return getSelectedCell().canExecuteAction(CellActionType.COPY);
        }
      });
    }

    public boolean isCopyVisible(DataContext dataContext) {
      return true;
    }
  }

  private class MyPasteProvider implements PasteProvider {
    public void performPaste(DataContext dataContext) {
      ModelAccess.instance().runWriteActionInCommand(new Runnable() {
        public void run() {
          EditorCell selectedCell = getSelectedCell();
          assert selectedCell != null;
          selectedCell.executeAction(CellActionType.PASTE);
        }
      });
    }

    public boolean isPastePossible(DataContext dataContext) {
      return ModelAccess.instance().runReadAction(new Computable<Boolean>() {
        public Boolean compute() {
          if (isDisposed() || getEditedNode() == null || getEditorContext() == null) return false;
          if (getSelectedCell() == null) return false;
          if (getEditorContext().getModel().isNotEditable()) {
            return false;
          }
          return getSelectedCell().canExecuteAction(CellActionType.PASTE);
        }
      });
    }

    public boolean isPasteEnabled(DataContext dataContext) {
      return true;
    }
  }

  /**
   * This is a copy of com.intellij.openapi.editor.impl.EditorImpl.MyScrollBar class
   */
  class MyScrollBar extends JScrollBar {
    @NonNls
    private static final String DECR_BUTTON_FIELD = "decrButton";
    @NonNls
    private static final String INCR_BUTTON_FIELD = "incrButton";
    @NonNls
    private static final String APPLE_LAF_AQUA_SCROLL_BAR_UI_CLASS = "apple.laf.AquaScrollBarUI";

    MyScrollBar(int orientation) {
      super(orientation);
      setFocusable(false);
      putClientProperty("JScrollBar.fastWheelScrolling", Boolean.TRUE); // fast scrolling for JDK 6
    }

    /**
     * This is helper method. It returns height of the top (descrease) scrollbar
     * button. Please note, that it's possible to return real height only if scrollbar
     * is instance of BasicScrollBarUI. Otherwise it returns fake (but good enough :) )
     * value.
     */
    int getDecScrollButtonHeight() {
      ScrollBarUI barUI = getUI();
      Insets insets = getInsets();
      if (barUI instanceof BasicScrollBarUI) {
        try {
          Field decrButtonField = BasicScrollBarUI.class.getDeclaredField(DECR_BUTTON_FIELD);
          decrButtonField.setAccessible(true);
          JButton decrButtonValue = (JButton) decrButtonField.get(barUI);
          assert decrButtonValue != null;
          return insets.top + decrButtonValue.getHeight();
        }
        catch (Exception exc) {
          throw new IllegalStateException(exc.getMessage());
        }
      } else {
        return insets.top + 15;
      }
    }

    /**
     * This is helper method. It returns height of the bottom (increase) scrollbar
     * button. Please note, that it's possible to return real height only if scrollbar
     * is instance of BasicScrollBarUI. Otherwise it returns fake (but good enough :) )
     * value.
     */
    int getIncScrollButtonHeight() {
      ScrollBarUI barUI = getUI();
      Insets insets = getInsets();
      if (barUI instanceof BasicScrollBarUI) {
        try {
          Field incrButtonField = BasicScrollBarUI.class.getDeclaredField(INCR_BUTTON_FIELD);
          incrButtonField.setAccessible(true);
          JButton incrButtonValue = (JButton) incrButtonField.get(barUI);
          assert incrButtonValue != null;
          return insets.bottom + incrButtonValue.getHeight();
        }
        catch (Exception exc) {
          throw new IllegalStateException(exc.getMessage());
        }
      } else if (APPLE_LAF_AQUA_SCROLL_BAR_UI_CLASS.equals(barUI.getClass().getName())) {
        return insets.bottom + 30;
      } else {
        return insets.bottom + 15;
      }
    }

    public int getUnitIncrement(int direction) {
      Rectangle vr = myScrollPane.getViewport().getViewRect();
      return getScrollableUnitIncrement(vr, getOrientation(), direction);
    }

    public int getBlockIncrement(int direction) {
      Rectangle vr = myScrollPane.getViewport().getViewRect();
      return getScrollableBlockIncrement(vr, getOrientation(), direction);
    }
  }
}

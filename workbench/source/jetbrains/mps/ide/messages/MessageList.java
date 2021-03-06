/*
 * Copyright 2003-2011 JetBrains s.r.o.
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
package jetbrains.mps.ide.messages;

import com.intellij.ide.BrowserUtil;
import com.intellij.ide.CopyPasteManagerEx;
import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowId;
import com.intellij.openapi.wm.ToolWindowManager;
import com.intellij.openapi.wm.WindowManager;
import com.intellij.ui.ScrollPaneFactory;
import com.intellij.ui.components.JBList;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.MessageView;
import com.intellij.ui.content.MessageView.SERVICE;
// TODO import jetbrains.mps.baseLanguage.plugin.AnalyzeStacktraceDialog;
import jetbrains.mps.ide.IdeMain;
import jetbrains.mps.ide.IdeMain.TestMode;
import jetbrains.mps.ide.blame.dialog.BlameDialog;
import jetbrains.mps.ide.blame.dialog.BlameDialogComponent;
import jetbrains.mps.ide.blame.perform.Response;
import jetbrains.mps.ide.dialogs.BaseDialog;
import jetbrains.mps.ide.findusages.INavigator;
import jetbrains.mps.ide.messages.MessagesViewTool.MyState;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.messages.IMessage;
import jetbrains.mps.messages.IMessageList;
import jetbrains.mps.messages.Message;
import jetbrains.mps.messages.MessageKind;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.workbench.action.BaseAction;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.*;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


import static jetbrains.mps.ide.messages.MessagesViewTool.LOG;

/**
* Created by IntelliJ IDEA.
* User: fyodor
* Date: 4/21/11
* Time: 12:33 PM
* To change this template use File | Settings | File Templates.
*/
abstract class MessageList implements IMessageList {
  static final int MAX_SIZE = 10000;

  private static Logger LOG = Logger.getLogger(MessageList.class);

  private MyToggleAction myWarningsAction = new MyToggleAction("Show Warnings Messages", Icons.WARNING_ICON) {
    protected boolean isEnabled() {
      return hasWarnings();
    }
  };
  private MyToggleAction myInfoAction = new MyToggleAction("Show Information Messages", Icons.INFORMATION_ICON) {
    protected boolean isEnabled() {
      return hasInfo();
    }
  };
  private MyToggleAction myAutoscrollToSourceAction = new MyToggleAction("Autoscroll To Source", Icons.AUTOSCROLLS_ICON) {
    protected boolean isEnabled() {
      return hasHintObjects();
    }
  };

  private Queue<IMessage> myMessages = new LinkedList<IMessage>();
  private int myInfos;
  private int myWarnings;
  private int myErrors;
  private int myHintObjects;

  private FastListModel myModel = new FastListModel(MAX_SIZE);
  private JPanel myComponent = new JPanel();
  private JList myList = new JBList(myModel);
  private ActionToolbar myToolbar;
  private AtomicInteger myMessagesInProgress = new AtomicInteger();
  private MessageToolSearchPanel mySearchPanel = null;
  private Project myProject;

  public MessageList(Project project) {
    this.myProject = project;
  }

  public abstract void createContent();

  protected abstract boolean isDisposed();

  public void show(boolean setActive) {
    if (IdeMain.getTestMode() == TestMode.CORE_TEST) return;

    ToolWindow window = getToolWindow();
    if (window == null) return;

    if (!window.isAvailable()) window.setAvailable(true, null);
    if (!window.isVisible()) window.show(null);
    if (setActive) window.activate(null);

    Content content = getMessagesService().getContentManager().getContent(myComponent);
    getMessagesService().getContentManager().setSelectedContent(content);
  }

  public void clear() {
    if (IdeMain.getTestMode() == TestMode.CORE_TEST) return;

    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        if (isDisposed()) {
          return;
        }
        myModel.clear();
        myMessages.clear();
        myErrors = 0;
        myWarnings = 0;
        myInfos = 0;
        myHintObjects = 0;
        myList.setFixedCellWidth(myList.getWidth());
        updateHeader();
        updateActions();
      }
    });
  }

  public void add(final IMessage message) {
    if (IdeMain.getTestMode() == TestMode.CORE_TEST) return;

    myMessagesInProgress.incrementAndGet();

    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        if (isDisposed()) {
          return;
        }
        int messages = myMessagesInProgress.decrementAndGet();

        if (myMessages.size() >= MAX_SIZE) {
          IMessage toRemove = myMessages.remove();
          updateMessageCounters(message, -1);
          if (isVisible(toRemove)) {
            myModel.removeFirst();
          }
        }

        if (isVisible(message)) {
          myModel.add(message);
          int index = myModel.getSize() - 1;
          if (myList.getAutoscrolls()) {
            myList.getSelectionModel().setSelectionInterval(index, index);
          }
          if (messages == 0) {
            myList.ensureIndexIsVisible(index);
          }
        }

        myMessages.add(message);
        updateMessageCounters(message, 1);

        int width = getMessageWidth(message);
        if (width > myList.getFixedCellWidth()) {
          myList.setFixedCellWidth(width);
        }

        updateHeader();
        updateActions();
      }

      private void updateMessageCounters(IMessage m, int delta) {
        if (m.getKind() == MessageKind.ERROR) {
          myErrors += delta;
        }
        if (m.getKind() == MessageKind.WARNING) {
          myWarnings += delta;
        }
        if (m.getKind() == MessageKind.INFORMATION) {
          myInfos += delta;
        }
        if (m.getHintObject() != null) {
          myHintObjects += delta;
        }
      }
    });
  }

  public void resetAutoscrollOption() {
    myList.setAutoscrolls(true);
  }

  public JComponent getComponent () {
    return myComponent;
  }

  public INavigator createNavigator() {
    return new INavigator() {
      public void goToNext() {
        int i = Math.max(0, myList.getSelectedIndex() + 1);

        for (; i < myModel.getSize(); i++) {
          if (tryNavigate(i)) return;
        }
      }

      public void goToPrevious() {
        int i = Math.min(myModel.getSize() - 1, myList.getSelectedIndex() - 1);

        for (; i >= 0; i--) {
          if (tryNavigate(i)) return;
        }
      }

      public boolean tryNavigate(int index) {
        Message msg = ((Message) myModel.getElementAt(index));
        if (msg.getHintObject() == null) return false;
        myList.setSelectedIndex(index);
        myList.ensureIndexIsVisible(index);
        openCurrentMessageNodeIfPossible();
        return true;
      }
    };
  }

  public MessageView getMessagesService() {
    return SERVICE.getInstance(myProject);
  }

  protected void initUI() {
    myList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    myList.setCellRenderer(new MessagesListCellRenderer());
    myComponent.setLayout(new BorderLayout());

    final JPanel panel = new JPanel(new BorderLayout());
    panel.add(new JPanel(), BorderLayout.CENTER);

    final DefaultActionGroup group = ActionUtils.groupFromActions(
      myWarningsAction,
      myInfoAction,
      myAutoscrollToSourceAction
    );

    myToolbar = ActionManager.getInstance().createActionToolbar(ActionPlaces.UNKNOWN, group, false);
    panel.add(myToolbar.getComponent(), BorderLayout.NORTH);

    myComponent.add(panel, BorderLayout.WEST);
    final JScrollPane scrollPane = ScrollPaneFactory.createScrollPane(myList);
    myComponent.add(scrollPane, BorderLayout.CENTER);

    myComponent.registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        if (mySearchPanel == null) {
          mySearchPanel = new MessageToolSearchPanel(myList, getProject());
          myComponent.add(mySearchPanel, BorderLayout.NORTH);
        }
        mySearchPanel.activate();
      }
    }, KeyStroke.getKeyStroke("ctrl F"), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);


    myList.setFixedCellHeight(Toolkit.getDefaultToolkit().getFontMetrics(myList.getFont()).getHeight() + 5);

    myList.registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        openCurrentMessageNodeIfPossible();
      }
    }, KeyStroke.getKeyStroke("F4"), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

    myList.registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        openCurrentMessageNodeIfPossible();
      }
    }, KeyStroke.getKeyStroke("ENTER"), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

    myList.registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        showHelpForCurrentMessage();
      }
    }, KeyStroke.getKeyStroke("F1"), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

    myList.addMouseWheelListener(new MouseWheelListener() {
      public void mouseWheelMoved(MouseWheelEvent e) {
        myList.setAutoscrolls(false);
        scrollPane.dispatchEvent(e);
      }
    });

    myList.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        boolean oneClickOpen = e.getClickCount() == 1 && e.getButton() == MouseEvent.BUTTON1 && myAutoscrollToSourceAction.isSelected(null);
        boolean twoClickOpen = e.getClickCount() == 2 && e.getButton() == MouseEvent.BUTTON1;
        if (oneClickOpen || twoClickOpen) {
          openCurrentMessageNodeIfPossible();
        }
      }

      public void mousePressed(MouseEvent e) {
        //todo select element under mouse
        if (e.isPopupTrigger()) {
          showPopupMenu(e);
        }
      }

      public void mouseReleased(MouseEvent e) {
        if (e.isPopupTrigger()) {
          showPopupMenu(e);
        }
      }
    });

    myList.addMouseMotionListener(new MouseMotionListener() {
      public void mouseDragged(MouseEvent e) {
      }

      public void mouseMoved(MouseEvent e) {
        int index = myList.locationToIndex(e.getPoint());

        Message item = null;
        if (index != -1) {
          item = (Message) myModel.getElementAt(index);
        }

        if (item != null && item.getHintObject() != null && myAutoscrollToSourceAction.isSelected(null)) {
          myList.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        } else {
          myList.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
      }
    });
  }

  protected abstract void setDisplayInfo(String name);

  private ToolWindow getToolWindow() {
    return ToolWindowManager.getInstance(myProject).getToolWindow(ToolWindowId.MESSAGES_WINDOW);
  }
  
  private void showPopupMenu(MouseEvent evt) {
    if (myList.getSelectedValue() == null) return;

    DefaultActionGroup group = createActionGroup();

    JPopupMenu menu = ActionManager.getInstance().createActionPopupMenu(ActionPlaces.UNKNOWN, group).getComponent();
    menu.show(myList, evt.getX(), evt.getY());
  }

  private DefaultActionGroup createActionGroup() {
    DefaultActionGroup group = new DefaultActionGroup();

    if (myList.getSelectedIndices().length != 0) {
      group.add(new BaseAction("Copy Text") {
        {
          setExecuteOutsideCommand(true);
        }

        protected void doExecute(AnActionEvent e, Map<String, Object> _params) {
          StringBuilder sb = new StringBuilder();
          for (Object o : myList.getSelectedValues()) {
            sb.append(((Message) o).getText());
            sb.append("\n");
          }
          CopyPasteManagerEx.getInstance().setContents(new StringSelection(sb.toString()));
        }
      });
    }

    group.addSeparator();

    group.add(new BaseAction("Show Help for This Message") {
      @Override
      protected void doUpdate(AnActionEvent e, Map<String, Object> _params) {
        boolean enabled = getHelpUrlForCurrentMessage() != null;
        setEnabledState(e.getPresentation(), enabled);
      }

      @Override
      protected void doExecute(AnActionEvent e, Map<String, Object> _params) {
        showHelpForCurrentMessage();
      }
    });

    group.addSeparator();

    if (myList.getSelectedIndices().length >= 1) {
      final Object[] messages = myList.getSelectedValues();
      boolean containsError = false;
      for (Object message : messages) {
        if (((Message) message).getKind() == MessageKind.ERROR) {
          containsError = true;
          break;
        }
      }
      if (containsError) {
        group.addSeparator();
        group.add(new BaseAction(messages.length > 1 ? "Submit as One Issue" : "Submit to Issue Tracker") {
          {
            setExecuteOutsideCommand(true);
          }

          protected void doExecute(AnActionEvent e, Map<String, Object> _params) {
            submitToTracker(messages);
          }
        });
      }
    }
    if (myList.getSelectedIndices().length == 1) {
      Throwable exc = null;
      for (Object message : myList.getSelectedValues()) {
        exc = ((Message) message).getException();
      }
      if (exc != null) {
        final Throwable toShow = exc;
        group.add(new BaseAction("Show Exception") {
          {
            setExecuteOutsideCommand(true);
          }

          protected void doExecute(AnActionEvent e, Map<String, Object> params) {
            showException(toShow);
          }
        });
      }
    }
    group.addSeparator();

    group.add(new BaseAction("Clear") {
      {
        setExecuteOutsideCommand(true);
      }

      protected void doExecute(AnActionEvent e, Map<String, Object> _params) {
        clear();
      }
    });

    return group;
  }

  private void submitToTracker(Object[] msgs) {
    JFrame frame = WindowManager.getInstance().getFrame(getProject());
    BlameDialog dialog = BlameDialogComponent.getInstance().createDialog(getProject(), frame);
    StringBuilder description = new StringBuilder();
    boolean first = true;
    for (Object msg : msgs) {
      if (!(msg instanceof Message)) continue;
      Message message = (Message) msg;
      if (first) {
        dialog.setIssueTitle(message.getText());
        first = false;
      } else {
        description.append(message.getText()).append('\n');
      }
      dialog.addEx(message.getException());
    }
    dialog.setDescription(description.toString());
    dialog.showDialog();

    if (!dialog.isCancelled()) {
      Response response = dialog.getResult();
      String message = response.getMessage();
      if (response.isSuccess()) {
        JOptionPane.showMessageDialog(null, message, "Submit OK", JOptionPane.INFORMATION_MESSAGE);
      } else {
        JOptionPane.showMessageDialog(null, message, "Submit Failed", JOptionPane.ERROR_MESSAGE);
        LOG.error("Submit failed: " + response.getMessage(), response.getThrowable());
      }
    }
  }

  private void showException(Throwable toShow) {
    JFrame frame = WindowManager.getInstance().getFrame(getProject());
    StringWriter writer = new StringWriter();
    toShow.printStackTrace(new PrintWriter(writer));
    StringSelection contents = new StringSelection(writer.toString());
    CopyPasteManagerEx.getInstanceEx().setContents(contents);
    try {
      Class<?> cls = Class.forName("jetbrains.mps.ide.actions.AnalyzeStacktraceDialog");
      Constructor<?> ctor = cls.getConstructor(Frame.class, IOperationContext.class, Project.class);
      BaseDialog dlg = (BaseDialog) ctor.newInstance(frame, null, getProject());
      dlg.showDialog();
    } catch (Exception e) {
      LOG.error(e);
    }
  }

  private Project getProject() {
    return myProject;
  }

  private void showHelpForCurrentMessage() {
    String helpURL = getHelpUrlForCurrentMessage();
    if (helpURL == null) return;
    BrowserUtil.launchBrowser(helpURL);
  }

  private String getHelpUrlForCurrentMessage() {
    if (myList.getSelectedValues().length != 1) return null;

    Message message = (Message) (myList.getSelectedValue());
    return message.getHelpUrl();
  }

  private void openCurrentMessageNodeIfPossible() {
    final Message selectedMessage = (Message) myList.getSelectedValue();
    if (selectedMessage == null || selectedMessage.getHintObject() == null) return;

    /* temp hack: write action instead of read, TODO remove lock*/
    final Project project = getProject();
    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        NavigationManager.getInstance().navigateTo(project, selectedMessage.getHintObject(), true, true);
      }
    });
  }

  private void rebuildModel() {
    myModel.clear();
    myList.setFixedCellWidth(myList.getWidth());
    List<IMessage> messagesToAdd = new ArrayList<IMessage>();
    int width = 0;
    for (IMessage m : myMessages) {
      if (isVisible(m)) {
        width = Math.max(width, getMessageWidth(m));
        messagesToAdd.add(m);
      }
    }
    myList.setFixedCellWidth(width);

    for (IMessage m : messagesToAdd) {
      myModel.add(m);
    }
  }

  private int getMessageWidth(IMessage message) {
    Component renderer = myList.getCellRenderer().getListCellRendererComponent(myList, message, 0, false, false);
    return renderer.getPreferredSize().width;
  }

  private boolean isVisible(IMessage m) {
    switch (m.getKind()) {
      case ERROR:
        return true;
      case WARNING:
        return myWarningsAction.isSelected(null);
      case INFORMATION:
        return myInfoAction.isSelected(null);
    }
    return true;
  }

  private void updateHeader() {
    if (hasErrors() || hasWarnings() || hasInfo()) {
      setDisplayInfo(NameUtil.formatNumericalString(myErrors, "error") + "/"
        + NameUtil.formatNumericalString(myWarnings, "warning") + "/"
        + NameUtil.formatNumericalString(myInfos, "info"));
    } else {
      setDisplayInfo("");
    }
  }

  private void updateActions() {
    if (myToolbar == null) return;
    myToolbar.updateActionsImmediately();
  }

  private boolean hasErrors() {
    return myErrors > 0;
  }

  private boolean hasWarnings() {
    return myWarnings > 0;
  }

  private boolean hasInfo() {
    return myInfos > 0;
  }

  private boolean hasHintObjects() {
    return myHintObjects > 0;
  }

  private class MyToggleAction extends ToggleAction {
    private boolean mySelected;
    private Icon myIcon;

    public MyToggleAction(String tooltip, Icon icon) {
      super("", tooltip, icon);
      myIcon = icon;
      mySelected = true;
    }

    public boolean isSelected(AnActionEvent e) {
      return mySelected;
    }

    public void setSelected(AnActionEvent e, boolean state) {
      mySelected = state;
      rebuildModel();
    }

    public void update(AnActionEvent e) {
      super.update(e);

      boolean enabled = isEnabled();
      Icon icon = enabled ? myIcon : UIManager.getLookAndFeel().getDisabledIcon(null, myIcon);
      if (icon == null) {
        icon = myIcon;
      }
      e.getPresentation().setIcon(icon);
    }

    protected boolean isEnabled() {
      return true;
    }
  }

  /*package*/ MyState getState() {
    return new MyState(myWarningsAction.isSelected(null), myInfoAction.isSelected(null), myAutoscrollToSourceAction.isSelected(null));
  }

  /*package*/ void loadState(MyState state) {
    myWarningsAction.setSelected(null, state.isWarnings());
    myInfoAction.setSelected(null, state.isInfo());
    myAutoscrollToSourceAction.setSelected(null, state.isAutoscrollToSource());
  }

  public /*for tests*/ static class FastListModel extends AbstractListModel {
    private int myStart;
    private int myEnd;
    private int mySize;
    private Object[] myItems;

    FastListModel(int size) {
      myItems = new Object[size];
      myStart = 0;
      myEnd = 0;
    }

    public int getSize() {
      return mySize;
    }

    public Object getElementAt(int index) {
      return myItems[(myStart + index) % myItems.length];
    }

    public void add(Object item) {
      if (mySize == myItems.length) throw new RuntimeException("Buffer overflow");
      myItems[myEnd] = item;
      myEnd = (myEnd + 1) % myItems.length;
      mySize++;
      fireIntervalAdded(this, mySize - 1, mySize - 1);
    }

    public void removeFirst() {
      if (mySize == 0) {
        throw new RuntimeException("Buffer underflow");
      }
      myItems[myStart] = null;
      myStart = (myStart + 1) % myItems.length;
      mySize--;
      fireIntervalRemoved(this, 0, 0);
    }

    public void clear() {
      myStart = 0;
      myEnd = 0;
      int oldSize = mySize;
      mySize = 0;
      Arrays.fill(myItems, null);
      if (oldSize > 0) {
        fireIntervalRemoved(this, 0, oldSize - 1);
      }
    }
  }
}

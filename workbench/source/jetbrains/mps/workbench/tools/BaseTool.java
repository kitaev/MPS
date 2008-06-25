package jetbrains.mps.workbench.tools;

import com.intellij.ide.actions.ActivateToolWindowAction;
import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.keymap.KeymapManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowAnchor;
import com.intellij.openapi.wm.ToolWindowManager;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactoryImpl;
import com.intellij.ui.content.ContentManager;
import jetbrains.mps.MPSProjectHolder;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.workbench.action.DefaultGroup;
import jetbrains.mps.workbench.action.BaseAction;
import jetbrains.mps.ide.findusages.view.icons.Icons;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.BorderLayout;

public abstract class BaseTool{
  private static Logger LOG = Logger.getLogger(BaseTool.class);

  private Project myProject;
  private String myId;
  private int myNumber;
  private Icon myIcon;
  private ToolWindowAnchor myAnchor;
  private boolean myCanCloseContent;
  private boolean myIsRegistered;
  private ToolWindowManager myWindowManager;

  public BaseTool(Project project, String id, int number, Icon icon, ToolWindowAnchor anchor, boolean canCloseContent) {
    myAnchor = anchor;
    myNumber = number;
    myId = id;
    myIcon = icon;
    myCanCloseContent = canCloseContent;
    myProject = project;
    myIsRegistered = false;
  }

  public String getId() {
    return myId;
  }

  public int getNumber() {
    return myNumber;
  }

  public Icon getIcon() {
    return myIcon;
  }

  synchronized private boolean isRegistered() {
    return myIsRegistered;
  }

  synchronized private void setIsRegistered(boolean isRegistered) {
    myIsRegistered = isRegistered;
  }

  public boolean toolIsOpened() {
    LOG.checkEDT();
    return getToolWindow().isVisible();
  }

  /**
   * Opens the tool's window, shows tool if invisible at the moment
   */
  public void openToolLater(final boolean setActive) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        openTool(setActive);
      }
    });
  }

  public void openTool(boolean setActive) {
    ToolWindow window = getToolWindow();
    if (!isAvailable()) makeAvailableLater();
    if (!toolIsOpened()) window.show(null);
    if (setActive) window.activate(null);
  }

  /**
   * Minimizes the window, doesn't remove tool from panel
   */
  public void closeLater() {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        close();
      }
    });
  }

  public void close() {
    if (isAvailable() && toolIsOpened()) getToolWindow().hide(null);
  }

  /**
   * @return whether the tool is visible by user (in the panel)
   */
  public boolean isAvailable() {
    LOG.checkEDT();
    return getToolWindow().isAvailable();
  }

  public void setAvailable(boolean state) {
    if (state) makeAvailableLater();
    else makeUnavailableLater();
  }

  /**
   * If the tool is visible, does nothing, else show the tool in panel in minimized state
   */
  public void makeAvailableLater() {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        makeAvailable();
      }
    });
  }

  public void makeAvailable() {
    if (!isAvailable()) getToolWindow().setAvailable(true, null);
  }

  /**
   * Removes the tool from the panel
   */
  public void makeUnavailableLater() {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        makeUnavailable();
      }
    });
  }

  public void makeUnavailable() {
    if (isAvailable()) getToolWindow().setAvailable(false, null);
  }

  @NotNull
  public ToolWindow getToolWindow() {
    LOG.checkEDT();

    if (!isRegistered()) register();
    return myWindowManager.getToolWindow(myId);
  }

  @NonNls
  @NotNull
  public String getComponentName() {
    return getClass().getName();
  }

  public void registerLater() {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        register();
      }
    });
  }

  public void register() {
    if (myProject.isDisposed()) return;
    if (isRegistered()) return;
    setIsRegistered(true);

    myWindowManager = ToolWindowManager.getInstance(myProject);

    if (myNumber != -1) {
      KeymapManager.getInstance().getActiveKeymap().addShortcut(
        ActivateToolWindowAction.getActionIdForToolWindow(myId),
        new KeyboardShortcut(KeyStroke.getKeyStroke("alt " + myNumber), null)
      );
    }

    ToolWindow toolWindow = myWindowManager.registerToolWindow(myId, myCanCloseContent, myAnchor);

    JComponent component = getComponent();
    if (component != null) {
      if (!hasCloseButton()) {
        addContent(component, null, false);
      } else {
        DefaultGroup group = new DefaultGroup();
        group.add(new BaseAction("", "Close", Icons.CLOSE_ICON) {
          public void doExecute(AnActionEvent e) {
            getContentManager().removeAllContents(true);
          }
        });

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(component, BorderLayout.CENTER);
        panel.add(ActionManager.getInstance().createActionToolbar(ActionPlaces.UNKNOWN, group, false).getComponent(), BorderLayout.WEST);
        addContent(panel, null, false);
      }
    }

    toolWindow.setIcon(myIcon);
    toolWindow.setToHideOnEmptyContent(true);
    toolWindow.installWatcher(toolWindow.getContentManager());
    if (!isInitiallyAvailable()) {
      setAvailable(false);
    }
  }

  protected boolean hasCloseButton() {
    return true;
  }

  protected boolean isInitiallyAvailable() {
    return false;
  }

  public void unregisterLater() {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        unregister();
      }
    });
  }

  public void unregister() {
    if (!isRegistered()) return;

    if (myNumber != -1) {
      KeymapManager.getInstance().getActiveKeymap().removeAllActionShortcuts(ActivateToolWindowAction.getActionIdForToolWindow(myId));
    }

    ToolWindow toolWindow = getToolWindow();
    ContentManager contentManager = toolWindow.getContentManager();
    if (contentManager != null && !contentManager.isDisposed()) {
      contentManager.removeAllContents(true);
    }

    myWindowManager.unregisterToolWindow(myId);
  }

  public JComponent getComponent() {
    return null;
  }

  protected Content addContent(JComponent component, String name, boolean isLockable) {
    Content content = new ContentFactoryImpl().createContent(component, name, isLockable);
    ContentManager contentManager = getContentManager();
    contentManager.addContent(content);
    return content;
  }

  protected ContentManager getContentManager() {
    if (!isRegistered()) register();
    return getToolWindow().getContentManager();
  }

  protected Project getProject() {
    return myProject;
  }

  @Deprecated
  protected MPSProject getMPSProject() {
    return myProject.getComponent(MPSProjectHolder.class).getMPSProject();
  }
}

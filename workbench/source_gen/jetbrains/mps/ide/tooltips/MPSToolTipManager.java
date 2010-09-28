package jetbrains.mps.ide.tooltips;

/*Generated by MPS */

import com.intellij.openapi.components.ApplicationComponent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import java.awt.Component;
import javax.swing.JComponent;
import java.awt.Point;
import java.awt.Frame;
import javax.swing.SwingUtilities;
import com.intellij.openapi.application.ApplicationManager;

public class MPSToolTipManager implements ApplicationComponent {
  private MouseAdapter myMouseListener = new MouseAdapter() {
    @Override
    public void mouseMoved(MouseEvent p0) {
      MPSToolTipManager.this.mouseMoved(p0, false);
    }
  };
  private MouseAdapter myRightAlignedMouseListener;
  private ToolTip myToolTip;

  public MPSToolTipManager() {
  }

  @NonNls
  @NotNull
  public String getComponentName() {
    return "MPSTooltipManager";
  }

  public void disposeComponent() {
  }

  public void initComponent() {
  }

  public void registerComponent(Component component) {
    component.addMouseListener(myMouseListener);
    component.addMouseMotionListener(myMouseListener);
  }

  public void unregisterComponent(Component component) {
    component.removeMouseListener(myMouseListener);
    component.removeMouseMotionListener(myMouseListener);
  }

  public void registerComponentRightAligned(Component component) {
    component.addMouseListener(getRightAlignedMouseListener());
    component.addMouseMotionListener(getRightAlignedMouseListener());
  }

  public void unregisterComponentRightAligned(Component component) {
    component.removeMouseListener(getRightAlignedMouseListener());
    component.removeMouseMotionListener(getRightAlignedMouseListener());
  }

  private MouseAdapter getRightAlignedMouseListener() {
    if (myRightAlignedMouseListener == null) {
      myRightAlignedMouseListener = new MouseAdapter() {
        @Override
        public void mouseMoved(MouseEvent event) {
          MPSToolTipManager.this.mouseMoved(event, true);
        }
      };
    }
    return myRightAlignedMouseListener;
  }

  private void mouseMoved(MouseEvent event, boolean rightAlined) {
    Component c = event.getComponent();
    if (!(c instanceof JComponent && c instanceof TooltipComponent)) {
      return;
    }
    JComponent component = (JComponent) c;
    Point point = component.getToolTipLocation(event);
    if (point == null) {
      point = event.getPoint();
    }
    String text = ((TooltipComponent) component).getMPSTooltipText(event);
    if (text != null && text.length() > 0) {
      showToolTip(text, component, point, rightAlined);
    } else {
      hideToolTip();
    }
  }

  private Frame getContainingFrame(Component component) {
    while (component.getParent() != null) {
      component = component.getParent();
    }
    return (Frame) component;
  }

  public void showToolTip(ToolTipData data, JComponent component, Point point) {
    showToolTip(data, component, point, false);
  }

  private void showToolTip(ToolTipData data, JComponent component, Point point, boolean rightAligned) {
    if (myToolTip != null) {
      if (eq_k25xh9_a0a0a0l(myToolTip.getText(), data.getText())) {
        return;
      }
      hideToolTip();
    }
    myToolTip = new ToolTip(rightAligned);
    Frame frame = getContainingFrame(component);
    SwingUtilities.convertPointToScreen(point, component);
    myToolTip.show(frame, point, data);
  }

  public void showToolTip(String text, JComponent component, Point point) {
    showToolTip(text, component, point, false);
  }

  private void showToolTip(String text, JComponent component, Point point, boolean rightAligned) {
    if (myToolTip != null) {
      if (eq_k25xh9_a0a0a0n(myToolTip.getText(), text)) {
        return;
      }
      hideToolTip();
    }
    if (text == null) {
      return;
    }
    myToolTip = new ToolTip(rightAligned);
    Frame frame = getContainingFrame(component);
    SwingUtilities.convertPointToScreen(point, component);
    myToolTip.show(frame, point, new ToolTipData(text));
  }

  public void hideToolTip() {
    if (myToolTip != null) {
      myToolTip.hide();
      myToolTip = null;
    }
  }

  public static MPSToolTipManager getInstance() {
    return ApplicationManager.getApplication().getComponent(MPSToolTipManager.class);
  }

  private static boolean eq_k25xh9_a0a0a0l(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }

  private static boolean eq_k25xh9_a0a0a0n(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }
}

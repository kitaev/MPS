package jetbrains.mps.project;

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.ide.IdeMain;
import jetbrains.mps.ide.toolsPane.ToolsPane;
import jetbrains.mps.ide.toolsPane.ITool;

import java.awt.*;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.project.Project;

public abstract class StandaloneMPSContext implements IOperationContext {
  public Frame getMainFrame() {
    //todo IDEA platform hack
    if (getComponent(Frame.class) != null) {
      return getComponent(Frame.class);
    }

    return null;
  }

  public Project getProject() {
    return getComponent(Project.class);
  }

  public boolean isTestMode() {
    return IdeMain.isTestMode();
  }

  public <T> T getComponent(Class<T> clazz) {
    T component = ApplicationManager.getApplication().getComponent(clazz);
    if (component != null) return component;
    if (clazz != ToolsPane.class) {
      ToolsPane toolsPane = getComponent(ToolsPane.class);
      if (toolsPane != null) {
        return (T) toolsPane.getTool((Class<? extends ITool>) clazz);
      }
    }
    return null;
  }
}

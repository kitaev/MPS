package jetbrains.mps.buildlanguage.plugin;

/*Generated by MPS */

import javax.swing.JPanel;
import com.intellij.execution.ui.ConsoleView;
import com.intellij.openapi.project.Project;
import java.awt.BorderLayout;
import com.intellij.execution.impl.ConsoleViewImpl;
import com.intellij.execution.ui.ConsoleViewContentType;
import com.intellij.openapi.util.Disposer;

public class BuildScriptRunnerComponent extends JPanel {

  private ConsoleView myConsoleView;

  public BuildScriptRunnerComponent(Project project) {
    super(new BorderLayout());
    this.setLayout(new BorderLayout());
    this.myConsoleView = new ConsoleViewImpl(project, false);
    this.add(this.myConsoleView.getComponent(), BorderLayout.CENTER);
  }

  public void addError(String text) {
    this.myConsoleView.print(text + "\n", ConsoleViewContentType.ERROR_OUTPUT);
  }

  public void addMessage(String text) {
    this.myConsoleView.print(text + "\n", ConsoleViewContentType.NORMAL_OUTPUT);
  }

  public void clean() {
    this.myConsoleView.clear();
  }

  public void dispose() {
    Disposer.dispose(this.myConsoleView);
  }

}

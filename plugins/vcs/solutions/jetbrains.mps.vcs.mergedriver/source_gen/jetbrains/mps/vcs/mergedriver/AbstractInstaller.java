package jetbrains.mps.vcs.mergedriver;

/*Generated by MPS */

import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

/*package*/ abstract class AbstractInstaller {
  protected Project myProject;

  protected AbstractInstaller(@NotNull Project project) {
    myProject = project;
  }

  @NotNull
  public AbstractInstaller.State getCurrentState() {
    return install(true);
  }

  @NotNull
  public AbstractInstaller.State install() {
    return install(false);
  }

  @NotNull
  protected abstract AbstractInstaller.State install(boolean dryRun);

  public abstract String getActionTitle();

  public String getActionTooltip() {
    return null;
  }

  public abstract String getAffectedVcsName();

  public static   enum State {
    NOT_INSTALLED(),
    OUTDATED(),
    INSTALLED();

    State() {
    }
  }
}

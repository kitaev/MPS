package jetbrains.mps.make;

/*Generated by MPS */

import com.intellij.openapi.components.ApplicationComponent;
import java.util.concurrent.Future;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.make.script.IScript;
import jetbrains.mps.make.script.IScriptController;
import com.intellij.openapi.application.ApplicationManager;

public interface IMakeService extends ApplicationComponent {
  public boolean startNewSession(MakeSession session);
  public void endSession(MakeSession session);
  public boolean isSessionActive();
  public Future<IResult> make(MakeSession session, Iterable<? extends IResource> resources);
  public Future<IResult> make(MakeSession session, Iterable<? extends IResource> resources, IScript script);
  public Future<IResult> make(MakeSession session, Iterable<? extends IResource> resources, IScript script, IScriptController controller);
  @Deprecated
  public Future<IResult> make(Iterable<? extends IResource> resources);
  @Deprecated
  public Future<IResult> make(Iterable<? extends IResource> resources, IScript script);
  @Deprecated
  public Future<IResult> make(Iterable<? extends IResource> resources, IScript script, IScriptController controller);
  public static class INSTANCE {
    private INSTANCE() {
    }

    public static IMakeService get() {
      return ApplicationManager.getApplication().getComponent(IMakeService.class);
    }
  }

}

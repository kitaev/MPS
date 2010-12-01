package jetbrains.mps.debug.runtime;

import com.intellij.execution.process.ProcessOutputTypes;
import com.intellij.openapi.project.Project;
import jetbrains.mps.debug.api.AbstractDebugSession;
import jetbrains.mps.debug.api.DebugSessionManagerComponent;
import jetbrains.mps.debug.api.breakpoints.IBreakpoint;
import jetbrains.mps.debug.api.runtime.execution.DebuggerCommand;
import jetbrains.mps.debug.breakpoints.JavaBreakpoint;
import jetbrains.mps.debug.evaluation.ui.EvaluationAuxModule;
import jetbrains.mps.debug.evaluation.ui.EvaluationDialog;
import jetbrains.mps.debug.runtime.DebugVMEventsProcessor.StepType;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.ModelAccess;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class DebugSession extends AbstractDebugSession<JavaUiState> {
  //todo extract abstract superclass to allow suspend/resume/etc. any process if developer implements it
  private final DebugVMEventsProcessor myEventsProcessor;
  private EvaluationAuxModule myAuxModule;
  private volatile boolean myIsMute = false;

  public DebugSession(DebugVMEventsProcessor eventsProcessor, Project p) {
    super(p);
    myEventsProcessor = eventsProcessor;
    myEventsProcessor.setDebuggableFramesSelector(getDebuggableFramesSelector());
    eventsProcessor.getMulticaster().addListener(new MyDebugProcessAdapter());
  }

  public EvaluationAuxModule getAuxModule() {
    return myAuxModule;
  }

  protected JavaUiState createUiState() {
    return new JavaUiState(null, this);
  }

  public void resume() {
    SuspendContext context = getUiState().getContext();
    if (context == null) return; // context is null => already resumed
    myEventsProcessor.resume(context);
  }

  public void pause() {
    myEventsProcessor.pause();
  }

  public void stop(boolean terminateTargetVM) {
    myEventsProcessor.stop(terminateTargetVM);
  }

  public void stepOver() {
    step(StepType.Over);
  }

  public void stepInto() {
    step(StepType.Into);
  }

  public void stepOut() {
    step(StepType.Out);
  }

  public boolean canShowEvaluationDialog() {
    return true;
  }

  public void showEvaluationDialog(IOperationContext operationContext) {
    JavaUiState state = getUiState();
    if (state.isPausedOnBreakpoint()) {
      EvaluationDialog evaluationDialog = new EvaluationDialog(operationContext, state, this);
      evaluationDialog.showDialog();
    }
  }

  private void step(StepType type) {
    JavaUiState state = getUiState();
    SuspendContext context = state.getContext();
    assert context != null : "Context is null while debug session state is " + myExecutionState;
    assert state.isPausedOnBreakpoint() : "State is not paused on breakpoint.";
    myEventsProcessor.step(type, context);
  }

  public DebugVMEventsProcessor getEventsProcessor() {
    return myEventsProcessor;
  }

  private void pause(SuspendContext suspendContext) {
    JavaUiState state = getUiState();
    setState(state, state.paused(suspendContext), false);
  }

  public JavaUiState refresh() {
    JavaUiState state = getUiState();
    JavaUiState newState = state.paused(state.getContext());
    setState(state, newState);
    return newState;
  }

  private void resume(SuspendContext suspendContext) {
    JavaUiState state = getUiState();
    setState(state, state.resumed(suspendContext), false);
  }

  @Override
  public void sessionRegistered(DebugSessionManagerComponent manager) {
    VMEventsProcessorManagerComponent vmManager
      = manager.getProject().getComponent(VMEventsProcessorManagerComponent.class);
    vmManager.addDebugSession(this);
    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        myAuxModule = new EvaluationAuxModule(myProject);
      }
    });
  }

  @Override
  public void sessionUnregistered(DebugSessionManagerComponent manager) {
    myAuxModule.dispose();
    myAuxModule = null;
  }

  @Override
  public boolean isMute() {
    return myIsMute;
  }

  @Override
  public void muteBreakpoints(final boolean mute) {
    if (myEventsProcessor.isAttached()) {
      myEventsProcessor.getManagerThread().schedule(new DebuggerCommand(){
        @Override
        protected void action() throws Exception {
          if (myIsMute != mute) {
            Set<IBreakpoint> breakpoints = myEventsProcessor.getBreakpointManager().getAllIBreakpoints();
            RequestManager requestManager = myEventsProcessor.getRequestManager();
            for (IBreakpoint bp : breakpoints) {
              if (bp instanceof JavaBreakpoint) {
                JavaBreakpoint breakpoint = (JavaBreakpoint) bp;
                if (mute) {
                  requestManager.deleteRequests(breakpoint); // todo enabling and disabling breakpoints should be symmetrical
                } else {
                  breakpoint.createOrWaitPrepare(getEventsProcessor());
                }
              }
            }
            myIsMute = mute;
            fireSessionMuted(DebugSession.this);
          }
        }
      });
    } else {
      myIsMute = mute;
      fireSessionMuted(DebugSession.this);
    }
  }

  private class MyDebugProcessAdapter extends DebugProcessAdapter {

    @Override
    public void paused(@NotNull SuspendContext suspendContext) {
      myExecutionState = ExecutionState.Paused;
      pause(suspendContext);
      fireSessionPaused(DebugSession.this);
    }

    @Override
    public void resumed(@NotNull SuspendContext suspendContext) {
      myExecutionState = ExecutionState.Running;
      resume(suspendContext);
      fireSessionResumed(DebugSession.this);
    }

    @Override
    public void processAttached(@NotNull DebugVMEventsProcessor process) {
      myExecutionState = ExecutionState.Running;
      myProcessHandler.notifyTextAvailable("Connected to the target VM, " + process.getConnectionString() + "\n", ProcessOutputTypes.SYSTEM);
    }

    @Override
    public void processDetached(@NotNull DebugVMEventsProcessor process, boolean closedByUser) {
      myExecutionState = ExecutionState.Stopped;
      setState(getUiState(), new JavaUiState(null, DebugSession.this), false);
      fireSessionResumed(DebugSession.this); // TODO hack
      myProcessHandler.notifyTextAvailable("Disconnected from the target VM, " + process.getConnectionString() + "\n", ProcessOutputTypes.SYSTEM);
    }
  }

}

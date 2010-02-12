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
package jetbrains.mps.debug.runtime;

import com.intellij.util.containers.HashMap;
import com.sun.jdi.*;
import com.sun.jdi.event.ClassPrepareEvent;
import com.sun.jdi.request.*;
import jetbrains.mps.debug.runtime.DebugManagerComponent.AllDebugProcessesAction;
import jetbrains.mps.debug.runtime.execution.DebuggerCommand;
import jetbrains.mps.debug.runtime.execution.DebuggerManagerThread;
import jetbrains.mps.logging.Logger;
import org.jetbrains.annotations.Nullable;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 17.12.2009
 * Time: 16:44:31
 * To change this template use File | Settings | File Templates.
 */
public class RequestManager implements DebugProcessListener {
  private static final Logger LOG = Logger.getLogger(RequestManager.class);

  private static final Object REQUESTOR = new Object();
  private static final Object CLASS_NAME = new Object();

  private final Map<Requestor, Set<EventRequest>> myRequestorToBelongedRequests = new HashMap<Requestor, Set<EventRequest>>();
  private EventRequestManager myEventRequestManager;

  private DebugVMEventsProcessor myDebugEventsProcessor;
  private final Map<Requestor, String> myInvalidRequestsAndWarnings = new HashMap<Requestor, String>();

  public RequestManager(DebugVMEventsProcessor processor) {
    myDebugEventsProcessor = processor;
    myDebugEventsProcessor.addDebugProcessListener(this);
  }

  public EventRequestManager getVMRequestManager() {
    return myEventRequestManager;
  }

  public Requestor findRequestor(EventRequest request) {
    DebuggerManagerThread.assertIsManagerThread();
    return request != null ? (Requestor) request.getProperty(REQUESTOR) : null;
  }

  public Set<EventRequest> findRequests(Requestor requestor) {
    DebuggerManagerThread.assertIsManagerThread();
    if (!myRequestorToBelongedRequests.containsKey(requestor)) {
      return Collections.emptySet();
    }
    return new HashSet<EventRequest>(myRequestorToBelongedRequests.get(requestor));
  }

  private void registerRequestInternal(final Requestor requestor, final EventRequest request) {
    registerRequest(requestor, request);
    request.putProperty(REQUESTOR, requestor);
  }

  private void registerRequest(Requestor requestor, EventRequest request) {
    Set<EventRequest> reqSet = myRequestorToBelongedRequests.get(requestor);
    if (reqSet == null) {
      reqSet = new HashSet<EventRequest>();
      myRequestorToBelongedRequests.put(requestor, reqSet);
    }
    reqSet.add(request);
  }

  public void deleteRequest(Requestor requestor) {
    DebuggerManagerThread.assertIsManagerThread();

    if (!myDebugEventsProcessor.isAttached()) {
      return;
    }
    final Set<EventRequest> requests = myRequestorToBelongedRequests.remove(requestor);
    if (requests == null) {
      return;
    }
    for (final EventRequest request : requests) {
      try {
        final Requestor targetRequestor = (Requestor) request.getProperty(REQUESTOR);
        if (targetRequestor != requestor) {
          // the same request may be assigned to more than one requestor, but
          // there is only one 'targetRequestor' for each request, so if target requestor and requestor being processed are different,
          // should clear also the mapping targetRequestor->request
          final Set<EventRequest> allTargetRequestorRequests = myRequestorToBelongedRequests.get(targetRequestor);
          if (allTargetRequestorRequests != null) {
            allTargetRequestorRequests.remove(request);
            if (allTargetRequestorRequests.size() == 0) {
              myRequestorToBelongedRequests.remove(targetRequestor);
            }
          }
        }
        myEventRequestManager.deleteEventRequest(request);
      }
      catch (InvalidRequestStateException ignored) {
        // request is already deleted
      }
      catch (InternalException e) {
        LOG.error(e);
      }
    }
  }


  //------------------- requests creation

  public BreakpointRequest createBreakpointRequest(MPSBreakpoint requestor, Location location) {
    DebuggerManagerThread.assertIsManagerThread();
    BreakpointRequest req = myEventRequestManager.createBreakpointRequest(location);
    req.setSuspendPolicy(EventRequest.SUSPEND_ALL);
    registerRequestInternal(requestor, req);
    return req;
  }

  void deleteStepRequests() {
    List<StepRequest> stepRequests = myEventRequestManager.stepRequests();
    if (stepRequests.size() > 0) {
      List<StepRequest> toDelete = new ArrayList<StepRequest>(stepRequests.size());
      for (StepRequest request : stepRequests) {
        ThreadReference threadReference = request.thread();
        // on attempt to delete a request assigned to a thread with unknown status, a JDWP error occures
        if (threadReference.status() != ThreadReference.THREAD_STATUS_UNKNOWN) {
          toDelete.add(request);
        }
      }
      myEventRequestManager.deleteEventRequests(toDelete);
    }
  }

  public StepRequest createStepRequest(StepRequestor requestor, int stepType, ThreadReference stepThread, int suspendPolicy) {
    deleteStepRequests();
    StepRequest stepRequest = myEventRequestManager.createStepRequest(stepThread, StepRequest.STEP_LINE, stepType);
    stepRequest.setSuspendPolicy(suspendPolicy);
    registerRequestInternal(requestor, stepRequest);
    return stepRequest;
  }
  //todo: some other types of requests; later
  //------------------- ~requests creation


  //by classname

  public void callbackOnPrepareClasses(ClassPrepareRequestor requestor, String classOrPatternToBeLoaded) {
    DebuggerManagerThread.assertIsManagerThread();
    ClassPrepareRequest classPrepareRequest = createClassPrepareRequest(requestor, classOrPatternToBeLoaded);
    classPrepareRequest.enable();
  }

  private ClassPrepareRequest createClassPrepareRequest(ClassPrepareRequestor requestor, String className) {
    ClassPrepareRequest classPrepareRequest = myEventRequestManager.createClassPrepareRequest();
    classPrepareRequest.setSuspendPolicy(EventRequest.SUSPEND_EVENT_THREAD);
    classPrepareRequest.addClassFilter(className);
    classPrepareRequest.putProperty(CLASS_NAME, className);
    registerRequestInternal(requestor, classPrepareRequest);
    return classPrepareRequest;
  }

  //currently does no much more than request.enable()

  public void enableRequest(EventRequest request) {
    DebuggerManagerThread.assertIsManagerThread();
    LOG.assertLog(findRequestor(request) != null);
    request.enable();
  }


  public void setInvalid(Requestor requestor, String message) {
    DebuggerManagerThread.assertIsManagerThread();
    myInvalidRequestsAndWarnings.put(requestor, message);
  }

  @Nullable
  public String getWarning(Requestor requestor) {
    DebuggerManagerThread.assertIsManagerThread();
    return myInvalidRequestsAndWarnings.get(requestor);
  }

  //todo impl

  @Override
  public void connectorIsReady() {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public void paused(SuspendContext suspendContext) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public void resumed(SuspendContext suspendContext) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public void processDetached(DebugVMEventsProcessor process, boolean closedByUser) {
    myEventRequestManager = null;
    myRequestorToBelongedRequests.clear();
  }

  @Override
  public void processAttached(DebugVMEventsProcessor process) {
    myEventRequestManager = myDebugEventsProcessor.getVirtualMachine().eventRequestManager();
    // invoke later, so that requests are for sure created only _after_ 'processAttached()' methods of other listeneres are executed
    process.getManagerThread().schedule(new DebuggerCommand() {
      @Override
      protected void action() throws Exception {
        BreakpointManagerComponent breakpointManager = myDebugEventsProcessor.getBreakpointManager();
        breakpointManager.createAllClassPrepareRequests(myDebugEventsProcessor);
      }
    });
  }

  public void processClassPrepared(final ClassPrepareEvent event) {
    if (!myDebugEventsProcessor.isAttached()) {
      return;
    }
    final ReferenceType refType = event.referenceType();

    if (refType instanceof ClassType || refType instanceof InterfaceType) {
      ClassPrepareRequestor requestor = (ClassPrepareRequestor) event.request().getProperty(REQUESTOR);
      if (requestor != null) {
        requestor.processClassPrepare(myDebugEventsProcessor, refType);
      }
    }
  }

  //todo the code below should be called on EVERY debug session in a project

  public static void createClassPrepareRequests(final MPSBreakpoint breakpoint) {
    DebugManagerComponent.getInstance(breakpoint.getProject()).performAllDebugProcessesAction(new AllDebugProcessesAction() {
      @Override
      public void run(DebugVMEventsProcessor processor) {
        if (processor.isAttached()) {
          breakpoint.createClassPrepareRequest(processor);
        }
      }
    });
  }

  public static void removeClassPrepareRequests(final MPSBreakpoint breakpoint) {
    DebugManagerComponent.getInstance(breakpoint.getProject()).performAllDebugProcessesAction(new AllDebugProcessesAction() {
      @Override
      public void run(DebugVMEventsProcessor processor) {
        if (processor.isAttached()) {
          processor.getRequestManager().deleteRequest(breakpoint);
        }
      }
    });
  }
}

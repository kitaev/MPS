package jetbrains.mps.samples.secretCompartmentLanguage.runtime.test;

import jetbrains.mps.samples.secretCompartmentLanguage.runtime.State;
import jetbrains.mps.samples.secretCompartmentLanguage.runtime.Event;
import jetbrains.mps.samples.secretCompartmentLanguage.runtime.StateMachine;
import jetbrains.mps.samples.secretCompartmentLanguage.runtime.StateMachineFactory;

public final class HStateMachineFactory extends StateMachineFactory {

  public StateMachine getStateMachine() {
    Event doorClosed = new Event("doorClosed", "D1CL");
    Event drawOpened = new Event("drawOpened", "D2OP");
    Event lightOn = new Event("lightOn", "L1ON");
    Event doorOpened = new Event("doorOpened", "D1OP");
    Event panelClosed = new Event("panelClosed", "PNCL");

    State idle = new State("idle");
    State activeState = new State("active");
    State waitingForLightState = new State("waitingForLight");
    State waitingForDrawState = new State("waitingForDraw");
    State unlockedPanelState = new State("unlockedPanel");

    StateMachine machine = new StateMachine(idle);

    idle.addTransition(doorClosed, activeState);

    activeState.addTransition(drawOpened, waitingForLightState);
    activeState.addTransition(lightOn, waitingForDrawState);

    waitingForLightState.addTransition(lightOn, unlockedPanelState);

    waitingForDrawState.addTransition(drawOpened, unlockedPanelState);

    unlockedPanelState.addTransition(panelClosed, idle);

    machine.addResetEvents(doorOpened);
    return machine;
  }

}

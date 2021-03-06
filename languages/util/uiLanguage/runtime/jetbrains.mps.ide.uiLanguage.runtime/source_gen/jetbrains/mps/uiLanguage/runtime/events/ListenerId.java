package jetbrains.mps.uiLanguage.runtime.events;

/*Generated by MPS */


public class ListenerId {
  private Object myInstance;
  private String myMethod;

  public ListenerId(Object instance, String method) {
    myInstance = instance;
    myMethod = method;
  }

  public int hashCode() {
    return myInstance.hashCode() * 239 + myMethod.hashCode();
  }

  public boolean equals(Object o) {
    if (!((o instanceof ListenerId))) {
      return false;
    }
    ListenerId id = (ListenerId) o;
    if (myInstance != id.myInstance || myMethod.equals(id.myMethod)) {
      return false;
    }
    return true;
  }
}

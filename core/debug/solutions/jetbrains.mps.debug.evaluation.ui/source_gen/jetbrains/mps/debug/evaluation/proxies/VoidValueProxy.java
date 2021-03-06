package jetbrains.mps.debug.evaluation.proxies;

/*Generated by MPS */

import org.jetbrains.annotations.NotNull;
import com.sun.jdi.Value;
import com.sun.jdi.ThreadReference;

public class VoidValueProxy extends ValueProxy implements IValueProxy {
  public VoidValueProxy(@NotNull Value v, @NotNull ThreadReference threadReference) {
    super(v, threadReference);
  }

  @Override
  public boolean javaEquals(IValueProxy proxy) {
    return false;
  }
}

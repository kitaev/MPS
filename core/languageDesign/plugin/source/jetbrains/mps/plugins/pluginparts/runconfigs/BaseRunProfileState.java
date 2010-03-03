package jetbrains.mps.plugins.pluginparts.runconfigs;

import com.intellij.execution.configurations.RunProfileState;
import com.intellij.openapi.util.Key;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

public abstract class BaseRunProfileState implements RunProfileState {
  private final Map<Key, Object> myUserData = new HashMap<Key, Object>();

  public <T> void putUserData(@NotNull Key<T> key, T value) {
    myUserData.put(key, value);
  }

  @Nullable
  public <T> T getUserData(Key<T> key) {
    return (T) myUserData.get(key);
  }
}

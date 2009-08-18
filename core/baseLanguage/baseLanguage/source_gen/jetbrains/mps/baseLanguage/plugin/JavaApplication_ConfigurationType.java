package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import com.intellij.execution.configurations.ConfigurationType;
import javax.swing.Icon;
import com.intellij.execution.configurations.ConfigurationFactory;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class JavaApplication_ConfigurationType implements ConfigurationType {
  private static final Icon ICON = null;

  public ConfigurationFactory[] getConfigurationFactories() {
    List<ConfigurationFactory> result = ListSequence.fromList(new ArrayList<ConfigurationFactory>());
    ListSequence.fromList(result).addElement(new DefaultJavaApplication_Factory(this));
    return ListSequence.fromList(result).toGenericArray(ConfigurationFactory.class);
  }

  public String getConfigurationTypeDescription() {
    return "Base Language Application";
  }

  public String getDisplayName() {
    return "Application";
  }

  public Icon getIcon() {
    return ICON;
  }

  @NonNls
  @NotNull
  public String getId() {
    return "JavaApplication";
  }
}

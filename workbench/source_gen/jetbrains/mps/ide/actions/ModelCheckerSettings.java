package jetbrains.mps.ide.actions;

/*Generated by MPS */

import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.options.SearchableConfigurable;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;
import javax.swing.Icon;
import javax.swing.JComponent;
import com.intellij.openapi.options.ConfigurationException;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import com.intellij.openapi.application.ApplicationManager;

@State(name = "ModelCheckerSettings", storages = {@Storage(id = "other", file = "$APP_CONFIG$/modelCheckerSettings.xml")
})
public class ModelCheckerSettings implements PersistentStateComponent<ModelCheckerSettings.MyState>, ApplicationComponent, SearchableConfigurable {
  private ModelCheckerSettings.MyState myState = new ModelCheckerSettings.MyState();
  private ModelCheckerSettingsPreferencesPage myPreferences;

  public ModelCheckerSettings() {
  }

  @NonNls
  @NotNull
  public String getComponentName() {
    return "Model Checker Settings";
  }

  public void initComponent() {
  }

  public void disposeComponent() {
  }

  public ModelCheckerSettings.MyState getState() {
    return this.myState;
  }

  public void loadState(ModelCheckerSettings.MyState state) {
    this.myState = state;
  }

  @Nls
  public String getDisplayName() {
    return "Model Checker";
  }

  @Nullable
  public Icon getIcon() {
    return null;
  }

  @Nullable
  @NonNls
  public String getHelpTopic() {
    return null;
  }

  public JComponent createComponent() {
    return this.getPreferences().getComponent();
  }

  public boolean isModified() {
    return this.getPreferences().isModified();
  }

  public void apply() throws ConfigurationException {
    this.getPreferences().commit();
  }

  public void reset() {
  }

  public void disposeUIResources() {
  }

  public String getId() {
    return "model.checker";
  }

  public Runnable enableSearch(String option) {
    return null;
  }

  private ModelCheckerSettingsPreferencesPage getPreferences() {
    if (this.myPreferences == null) {
      this.myPreferences = new ModelCheckerSettingsPreferencesPage(this);
    }
    return this.myPreferences;
  }

  public List<SpecificChecker> getSpecificCheckers(ModelChecker modelChecker) {
    List<SpecificChecker> specificCheckers = ListSequence.fromList(new ArrayList<SpecificChecker>());

    ListSequence.fromList(specificCheckers).addElement(new UnavailableConceptsChecker(modelChecker));
    if (this.isCheckUnresolvedReferences()) {
      ListSequence.fromList(specificCheckers).addElement(new UnresolvedReferencesChecker(modelChecker));
    }
    if (this.isCheckConstraints()) {
      ListSequence.fromList(specificCheckers).addElement(new ConstraintsChecker(modelChecker));
    }
    if (this.isCheckScopes()) {
      ListSequence.fromList(specificCheckers).addElement(new ScopesChecker(modelChecker));
    }
    if (this.isCheckTypesystem()) {
      ListSequence.fromList(specificCheckers).addElement(new TypesystemChecker(modelChecker));
    }
    return specificCheckers;
  }

  public boolean isCheckUnresolvedReferences() {
    return this.myState.myCheckUnresolvedReferences;
  }

  public void setCheckUnresolvedReferences(boolean checkUnresolvedReferences) {
    this.myState.myCheckUnresolvedReferences = checkUnresolvedReferences;
  }

  public boolean isCheckConstraints() {
    return this.myState.myCheckConstraints;
  }

  public void setCheckConstraints(boolean checkConstraints) {
    this.myState.myCheckConstraints = checkConstraints;
  }

  public boolean isCheckScopes() {
    return this.myState.myCheckScopes;
  }

  public void setCheckScopes(boolean checkScopes) {
    this.myState.myCheckScopes = checkScopes;
  }

  public boolean isCheckTypesystem() {
    return this.myState.myCheckTypesystem;
  }

  public void setCheckTypesystem(boolean checkTypesystem) {
    this.myState.myCheckTypesystem = checkTypesystem;
  }

  public boolean isCheckBeforeCommit() {
    return this.myState.myCheckBeforeCommit;
  }

  public void setCheckBeforeCommit(boolean checkBeforeCommit) {
    this.myState.myCheckBeforeCommit = checkBeforeCommit;
  }

  public static ModelCheckerSettings getInstance() {
    return ApplicationManager.getApplication().getComponent(ModelCheckerSettings.class);
  }

  public static class MyState {
    private boolean myCheckUnresolvedReferences = true;
    private boolean myCheckConstraints = true;
    private boolean myCheckScopes = true;
    private boolean myCheckTypesystem = true;
    private boolean myCheckBeforeCommit = true;

    public MyState() {
    }

    public boolean isCheckUnresolvedReferences() {
      return this.myCheckUnresolvedReferences;
    }

    public void setCheckUnresolvedReferences(boolean checkUnresolvedReferences) {
      this.myCheckUnresolvedReferences = checkUnresolvedReferences;
    }

    public boolean isCheckConstraints() {
      return this.myCheckConstraints;
    }

    public void setCheckConstraints(boolean checkConstraints) {
      this.myCheckConstraints = checkConstraints;
    }

    public boolean isCheckScopes() {
      return this.myCheckScopes;
    }

    public void setCheckScopes(boolean checkScopes) {
      this.myCheckScopes = checkScopes;
    }

    public boolean isCheckTypesystem() {
      return this.myCheckTypesystem;
    }

    public void setCheckTypesystem(boolean checkTypesystem) {
      this.myCheckTypesystem = checkTypesystem;
    }

    public boolean isCheckBeforeCommit() {
      return this.myCheckBeforeCommit;
    }

    public void setCheckBeforeCommit(boolean checkBeforeCommit) {
      this.myCheckBeforeCommit = checkBeforeCommit;
    }
  }
}

package jetbrains.mps.buildlanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.execution.api.settings.IPersistentConfiguration;
import jetbrains.mps.execution.api.settings.ITemplatePersistentConfiguration;
import jetbrains.mps.logging.Logger;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.execution.api.settings.SettingsEditorEx;
import com.intellij.execution.configurations.RuntimeConfigurationException;
import org.jdom.Element;
import com.intellij.openapi.util.WriteExternalException;
import com.intellij.util.xmlb.XmlSerializer;
import com.intellij.openapi.util.InvalidDataException;

public class AntSettings_Configuration implements IPersistentConfiguration, ITemplatePersistentConfiguration {
  private static final Logger LOG = Logger.getLogger(AntSettings_Configuration.class);

  @NotNull
  private AntSettings_Configuration.MyState myState = new AntSettings_Configuration.MyState();
  private SettingsEditorEx<AntSettings_Configuration> myEditorEx;

  public AntSettings_Configuration() {
  }

  public void checkConfiguration() throws RuntimeConfigurationException {
  }

  @Override
  public void writeExternal(Element element) throws WriteExternalException {
    element.addContent(XmlSerializer.serialize(myState));
  }

  @Override
  public void readExternal(Element element) throws InvalidDataException {
    XmlSerializer.deserializeInto(myState, (Element) element.getChildren().get(0));
  }

  public boolean getUseOtherAntLocation() {
    return myState.myUseOtherAntLocation;
  }

  public String getOtherAntLocation() {
    return myState.myOtherAntLocation;
  }

  public String getAntOptions() {
    return myState.myAntOptions;
  }

  public void setUseOtherAntLocation(boolean value) {
    myState.myUseOtherAntLocation = value;
  }

  public void setOtherAntLocation(String value) {
    myState.myOtherAntLocation = value;
  }

  public void setAntOptions(String value) {
    myState.myAntOptions = value;
  }

  @Override
  public AntSettings_Configuration clone() {
    AntSettings_Configuration clone = null;
    try {
      clone = createCloneTemplate();
      clone.myState = (AntSettings_Configuration.MyState) myState.clone();
      return clone;
    } catch (CloneNotSupportedException ex) {
      AntSettings_Configuration.LOG.error(ex);
    }
    return clone;
  }

  public AntSettings_Configuration createCloneTemplate() {
    return new AntSettings_Configuration();
  }

  public AntSettings_Configuration_Editor getEditor() {
    return new AntSettings_Configuration_Editor();
  }

  public SettingsEditorEx<AntSettings_Configuration> getEditorEx() {
    if (myEditorEx == null) {
      myEditorEx = getEditor();
    }
    return myEditorEx;
  }

  public class MyState {
    public boolean myUseOtherAntLocation;
    public String myOtherAntLocation;
    public String myAntOptions;

    public MyState() {
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
      AntSettings_Configuration.MyState state = new AntSettings_Configuration.MyState();
      state.myUseOtherAntLocation = myUseOtherAntLocation;
      state.myOtherAntLocation = myOtherAntLocation;
      state.myAntOptions = myAntOptions;
      return state;
    }
  }
}

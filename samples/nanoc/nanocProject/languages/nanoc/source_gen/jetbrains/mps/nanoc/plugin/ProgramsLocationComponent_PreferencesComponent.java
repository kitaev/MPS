package jetbrains.mps.nanoc.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.prefs.BaseProjectPrefsComponent;
import com.intellij.util.xmlb.annotations.Tag;
import com.intellij.openapi.project.Project;
import org.jdom.Element;
import com.intellij.util.xmlb.XmlSerializer;
import jetbrains.mps.plugins.pluginparts.prefs.BasePrefsPage;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import com.intellij.openapi.options.ConfigurationException;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.nanoc.debug.ProgramsLocationUtil;
import java.util.List;
import java.util.ArrayList;

public class ProgramsLocationComponent_PreferencesComponent extends BaseProjectPrefsComponent {
  @Tag(value = "state")
  private ProgramsLocationComponent_PreferencesComponent.MyState myState = new ProgramsLocationComponent_PreferencesComponent.MyState();

  public ProgramsLocationComponent_PreferencesComponent(Project project) {
    super(project);
  }

  public void loadState(Element state) {
    XmlSerializer.deserializeInto(this.myState, state);
    this.afterRead(this.getMPSProject());
    for (BasePrefsPage page : ListSequence.fromList(this.getPages())) {
      page.reset();
    }
  }

  public Element getState() {
    for (BasePrefsPage page : ListSequence.fromList(this.getPages())) {
      try {
        page.apply();
      } catch (ConfigurationException e) {
      }
    }
    return XmlSerializer.serialize(this.myState);
  }

  public void afterRead(MPSProject project) {
    ProgramsLocationUtil.setGdbLocation(ProgramsLocationComponent_PreferencesComponent.this.getStateObject().myGDBLocation);
    ProgramsLocationUtil.setGccLocation(ProgramsLocationComponent_PreferencesComponent.this.getStateObject().myGCCLocation);
  }

  public ProgramsLocationComponent_PreferencesComponent.MyState getStateObject() {
    return this.myState;
  }

  public List<BasePrefsPage> createPages() {
    List<BasePrefsPage> result = ListSequence.fromList(new ArrayList<BasePrefsPage>());
    ListSequence.fromList(result).addElement(new ProgramsLocationComponent_GDBLocation_PreferencesPage(this.getProject(), this));
    return result;
  }

  public static class MyState {
    public String myGDBLocation;
    public String myGCCLocation;

    public MyState() {
    }
  }
}

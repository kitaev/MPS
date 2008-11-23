package jetbrains.mps.plugins.applicationplugins;

import com.intellij.openapi.actionSystem.ActionGroup;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import com.intellij.openapi.actionSystem.IdeActions;
import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import jetbrains.mps.MPSProjectHolder;
import jetbrains.mps.plugins.PluginSorter;
import jetbrains.mps.ide.actions.Ide_ApplicationPlugin;
import jetbrains.mps.ide.projectPane.ProjectPane;
import jetbrains.mps.library.LibraryManager;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.project.*;
import jetbrains.mps.reloading.ClassLoaderManager;
import jetbrains.mps.reloading.ReloadListener;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.util.Condition;
import jetbrains.mps.workbench.ActionPlace;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.workbench.action.BaseAction;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.workbench.action.ActionFactory;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class ApplicationPluginManager implements ApplicationComponent {
  private static final Logger LOG = Logger.getLogger(ApplicationPluginManager.class);
  private static final String IDE_MODULE_ID = "jetbrains.mps.ide";

  private List<BaseApplicationPlugin> mySortedPlugins = new ArrayList<BaseApplicationPlugin>();
  private BaseApplicationPlugin myIDEPlugin;

  private ReloadListener myReloadListener = new ReloadListener() {
    public void onBeforeReload() {
      disposePlugins();
    }

    public void onReload() {
      loadPlugins();
    }

    public void onAfterReload() {
    }
  };

  //----------------RELOAD STUFF---------------------

  private void loadPlugins() {
    mySortedPlugins = createPlugins();

    for (BaseApplicationPlugin plugin : mySortedPlugins) {
      try {
        plugin.preInit();
      } catch (Throwable t1) {
        LOG.error("Plugin " + plugin + " threw an exception during initialization ", t1);
      }
    }

    for (BaseApplicationPlugin plugin : mySortedPlugins) {
      try {
        plugin.init();
      } catch (Throwable t1) {
        LOG.error("Plugin " + plugin + " threw an exception during initialization ", t1);
      }
    }

    adjustTopLevelGroups();
  }

  private ArrayList<BaseApplicationPlugin> createPlugins() {
    Map<IModule, BaseApplicationPlugin> plugins = new HashMap<IModule, BaseApplicationPlugin>(100);

    for (Language language : collectLanguages()) {
      if (language.getPluginModelDescriptor() == null) continue;
      String pluginClassName = language.getGeneratedApplicationPluginClassLongName();
      Class pluginClass = language.getClass(pluginClassName);
      if (pluginClass == null) continue;

      try {
        BaseApplicationPlugin plugin = (BaseApplicationPlugin) pluginClass.newInstance();
        plugins.put(language, plugin);
      } catch (Throwable t) {
        LOG.error(t);
      }
    }

    myIDEPlugin = new Ide_ApplicationPlugin();
    plugins.put(MPSModuleRepository.getInstance().getModuleByUID(IDE_MODULE_ID),myIDEPlugin);

    return PluginSorter.sortByDependencies(plugins);
  }

  private void disposePlugins() {
    Collections.reverse(mySortedPlugins);
    for (BaseApplicationPlugin plugin : mySortedPlugins) {
      try {
        plugin.dispose();
      } catch (Throwable t) {
        LOG.error("Plugin " + plugin + " threw an exception during disposing ", t);
      }
    }
    ActionFactory.getInstance().unregisterActions();
    mySortedPlugins.clear();
  }

  private Set<Language> collectLanguages() {
    Set<Language> languages = new HashSet<Language>(LibraryManager.getInstance().getGlobalModules(Language.class));

    for (Project p : ProjectManager.getInstance().getOpenProjects()) {
      MPSProject mpsProject = p.getComponent(MPSProjectHolder.class).getMPSProject();

      for (Solution s : mpsProject.getProjectSolutions()) {
        languages.addAll(s.getScope().getVisibleLanguages());
      }

      for (Language l : mpsProject.getProjectLanguages()) {
        languages.add(l);
      }
    }

    return languages;
  }

  private void adjustTopLevelGroups() {
    ActionUtils.getGroup(ProjectPane.PROJECT_PANE_NODE_ACTIONS).addPlace(ActionPlace.PROJECT_PANE_SNODE, null);
    ActionUtils.getGroup(ProjectPane.PROJECT_PANE_MODEL_ACTIONS).addPlace(ActionPlace.PROJECT_PANE_SMODEL, null);
    ActionUtils.getGroup(ProjectPane.PROJECT_PANE_LANGUAGE_ACTIONS).addPlace(ActionPlace.PROJECT_PANE_LANGUAGE, null);
    ActionUtils.getGroup(ProjectPane.PROJECT_PANE_DEVKIT_ACTIONS).addPlace(ActionPlace.PROJECT_PANE_DEVKIT, null);
    ActionUtils.getGroup(ProjectPane.PROJECT_PANE_PROJECT_ACTIONS).addPlace(ActionPlace.PROJECT_PANE_PROJECT, null);
    ActionUtils.getGroup(ProjectPane.PROJECT_PANE_SOLUTION_ACTIONS).addPlace(ActionPlace.PROJECT_PANE_SOLUTION, null);
    ActionUtils.getGroup(ProjectPane.PROJECT_PANE_GENERATOR_ACTIONS).addPlace(ActionPlace.PROJECT_PANE_GENERATOR, null);
    ActionUtils.getGroup(ProjectPane.PROJECT_PANE_TRANSIENT_MODULES_ACTIONS).addPlace(ActionPlace.PROJECT_PANE_TRANSIENT_MODULES, null);
    ActionUtils.getGroup(ProjectPane.PROJECT_PANE_PACKAGE_ACTIONS).addPlace(ActionPlace.PROJECT_PANE_PACKAGE, null);
    ActionUtils.getGroup(ProjectPane.PROJECT_PANE_NAMESPACE_ACTIONS).addPlace(ActionPlace.PROJECT_PANE_NAMESPACE, null);
    ActionUtils.getGroup(ProjectPane.PROJECT_NEW_ACTIONS).addPlace(ActionPlace.PROJECT_PANE_PROJECT, null);
    ActionUtils.getGroup(ProjectPane.SOLUTION_NEW_ACTIONS).addPlace(ActionPlace.PROJECT_PANE_SOLUTION, null);
    ActionUtils.getGroup(ProjectPane.LANGUAGE_NEW_ACTIONS).addPlace(ActionPlace.PROJECT_PANE_LANGUAGE, null);
    ActionUtils.getGroup(ProjectPane.GENERATOR_NEW_ACTIONS).addPlace(ActionPlace.PROJECT_PANE_GENERATOR, null);

    List<BaseGroup> editorGroups = new ArrayList<BaseGroup>();
    editorGroups.add(ActionUtils.getGroup(EditorComponent.EDITOR_POPUP_MENU_ACTIONS));
    for (BaseGroup group : editorGroups) {
      group.addPlace(ActionPlace.EDITOR, null);
    }

    List<BaseGroup> mainMenuGroups = new ArrayList<BaseGroup>();
    DefaultActionGroup mainMenuGroup = ActionUtils.getDefaultGroup(IdeActions.GROUP_MAIN_MENU);
    for (BaseGroup group : ((BaseApplicationPlugin)myIDEPlugin).getGroups()) {
      if (contains(mainMenuGroup, group)) {
        mainMenuGroups.add(group);
      }
    }

    for (BaseGroup group : mainMenuGroups) {
      for (ActionPlace place : ActionPlace.values()) {
        group.addPlace(place, new Condition<BaseAction>() {
          public boolean met(BaseAction action) {
            return action.getPlaces().isEmpty();
          }
        });
      }
    }
  }

  private boolean contains(ActionGroup container, ActionGroup what) {
    if (container == what) return true;
    for (AnAction child : container.getChildren(null)) {
      if (child instanceof ActionGroup) {
        if (contains((ActionGroup) child, what)) return true;
      }
    }
    return false;
  }

  //----------------COMPONENT STUFF---------------------

  @NonNls
  @NotNull
  public String getComponentName() {
    return "ApplicationPluginManager";
  }

  public void initComponent() {
    ClassLoaderManager.getInstance().addReloadHandler(myReloadListener);
  }

  public void disposeComponent() {
    disposePlugins();
    ClassLoaderManager.getInstance().removeReloadHandler(myReloadListener);
  }
}

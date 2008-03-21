package jetbrains.mps.ide.scriptLanguage.plugin;

import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.ide.action.ActionGroup;
import jetbrains.mps.ide.scriptLanguage.structure.MigrationScript;
import jetbrains.mps.ide.scriptLanguage.structure.Script;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.SModelDescriptor;

import java.util.*;


/**
 * Igor Alshannikov
 * Date: Apr 24, 2007
 */
public class ScriptsActionGroup extends ActionGroup {
  private static Logger LOG = Logger.getLogger(ScriptsActionGroup.class);

  public ScriptsActionGroup() {
    super("Scripts");
  }

  public void doUpdate(ActionContext context) {
    clear();
    setVisible(true);
    if (context.get(MPSProject.class) == null) {
      setEnabled(false);
      return;
    }

    setEnabled(true);
    List<Language> languages = new ArrayList(GlobalScope.getInstance().getVisibleLanguages());
    Collections.sort(
      languages,
      new Comparator<Language>() {
        public int compare(Language o1, Language o2) {
          return o1.getNamespace().compareTo(o2.getNamespace());
        }
      });

    // -- by category --
    ActionGroup byCategoryGroup = new ActionGroup("By Category");
    add(byCategoryGroup);
    populateByCategoryGroup(languages, byCategoryGroup);

    // -- by 'migrate from' build --
    ActionGroup byBuildGroup = new ActionGroup("By Build");
    add(byBuildGroup);
    populateByBuildGroup(languages, byBuildGroup);

    // -- by language --
    ActionGroup byLanguageGroup = new ActionGroup("By Language");
    add(byLanguageGroup);
    for (Language language : languages) {
      populateByLanguageGroup(language, byLanguageGroup);
    }
  }

  private static void populateByCategoryGroup(List<Language> languages, ActionGroup ownerGroup) {
    List<MigrationScript> migrationScripts = new ArrayList<MigrationScript>();
    for (Language language : languages) {
      SModelDescriptor scriptsModel = language.getScriptsModelDescriptor();
      if (scriptsModel == null) continue;
      migrationScripts.addAll(scriptsModel.getSModel().getRootsAdapters(MigrationScript.class));
    }
    Map<String, List<MigrationScript>> byCategory = new HashMap<String, List<MigrationScript>>();
    for (MigrationScript migrationScript : migrationScripts) {
      String cat = migrationScript.getCategory();
      if (cat == null) {
        cat = "<uncategorized>";
      }
      if (!byCategory.containsKey(cat)) {
        byCategory.put(cat, new ArrayList<MigrationScript>());
      }
      byCategory.get(cat).add(migrationScript);
    }

    Set<String> sorted = new TreeSet<String>(new Comparator<String>() {
      public int compare(String o1, String o2) {
        if ("<uncategorized>".equals(o1)) return 1;
        if ("<uncategorized>".equals(o2)) return -1;
        return o1.compareTo(o2);
      }
    });
    sorted.addAll(byCategory.keySet());
    for (String cat : sorted) {
      ActionGroup categoryGroup = new ActionGroup(cat);
      for (MigrationScript script : byCategory.get(cat)) {
        categoryGroup.add(new RunMigrationScriptAction(script,
          makeScriptActionName(null, script.getTitle(), script.getMigrationFromBuild())));
      }
      ownerGroup.add(categoryGroup);
    }
  }

  private static void populateByBuildGroup(List<Language> languages, ActionGroup ownerGroup) {
    List<MigrationScript> migrationScripts = new ArrayList<MigrationScript>();
    for (Language language : languages) {
      SModelDescriptor scriptsModel = language.getScriptsModelDescriptor();
      if (scriptsModel == null) continue;
      migrationScripts.addAll(scriptsModel.getSModel().getRootsAdapters(MigrationScript.class));
    }
    Map<String, List<MigrationScript>> byBuild = new HashMap<String, List<MigrationScript>>();
    for (MigrationScript migrationScript : migrationScripts) {
      String build = migrationScript.getMigrationFromBuild();
      if (build == null) {
        build = "<unspecified>";
      }
      if (!byBuild.containsKey(build)) {
        byBuild.put(build, new ArrayList<MigrationScript>());
      }
      byBuild.get(build).add(migrationScript);
    }

    Set<String> sorted = new TreeSet<String>(byBuild.keySet());
    for (String build : sorted) {
      ActionGroup categoryGroup = new ActionGroup("migrate from b." + build);
      for (MigrationScript script : byBuild.get(build)) {
        categoryGroup.add(new RunMigrationScriptAction(script,
          makeScriptActionName(script.getCategory(), script.getTitle(), null)));
      }
      ownerGroup.add(categoryGroup);
    }
  }

  private static void populateByLanguageGroup(Language language, ActionGroup ownerGroup) {
    SModelDescriptor scriptsModel = language.getScriptsModelDescriptor();
    if (scriptsModel == null) return;
    List<MigrationScript> migrationScripts = scriptsModel.getSModel().getRootsAdapters(MigrationScript.class);
    List<Script> genericScripts = scriptsModel.getSModel().getRootsAdapters(Script.class);
    if (migrationScripts.isEmpty() && genericScripts.isEmpty()) return;
    ActionGroup languageScriptsGroup = new ActionGroup(language.getNamespace());
    for (MigrationScript script : migrationScripts) {
      languageScriptsGroup.add(new RunMigrationScriptAction(script,
        makeScriptActionName(script.getCategory(), script.getTitle(), script.getMigrationFromBuild())));
    }
    if (!(migrationScripts.isEmpty() || genericScripts.isEmpty())) {
      languageScriptsGroup.addSeparator();
    }
    for (Script script : genericScripts) {
      languageScriptsGroup.add(new RunGenericScriptAction(script.getNode()));
    }

    ownerGroup.add(languageScriptsGroup);
  }

  private static String makeScriptActionName(String category, String title, String build) {
    StringBuilder sb = new StringBuilder();
    if (category != null) {
      sb.append(category).append(": ");
    }
    sb.append(title);
    if (build != null) {
      sb.append(" [migrate from b.").append(build).append("]");
    }
    return sb.toString();
  }
}

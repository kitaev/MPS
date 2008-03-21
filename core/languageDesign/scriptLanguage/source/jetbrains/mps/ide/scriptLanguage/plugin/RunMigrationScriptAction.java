package jetbrains.mps.ide.scriptLanguage.plugin;

import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.ide.scriptLanguage.runtime.BaseMigrationScript;
import jetbrains.mps.ide.scriptLanguage.structure.MigrationScript;
import jetbrains.mps.ide.scriptLanguage.util.ScriptNameUtil;
import jetbrains.mps.refactoring.CompositeRefactoring;
import jetbrains.mps.refactoring.IRefactoring;
import jetbrains.mps.refactoring.ObsoleteRefactoringContext;
import jetbrains.mps.refactoring.common.RefactoringAction;
import jetbrains.mps.smodel.*;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.logging.Logger;

import org.jetbrains.annotations.NotNull;

import javax.swing.JOptionPane;
import java.util.List;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Igor Alshannikov
 * Date: Apr 24, 2007
 */
public class RunMigrationScriptAction extends RefactoringAction {
  public static final Logger LOG = Logger.getLogger(RunMigrationScriptAction.class);

  private static final String SMODEL_UID = "SMODEL_UID";
  private MigrationScript myScript;
  private BaseMigrationScript myScriptInstance;

  public RunMigrationScriptAction(MigrationScript script) {
    super(script.getLongCaption());
    myScript = script;
  }


  public void doExecute(@NotNull ActionContext actionContext) {
    String fqClassName = ScriptNameUtil.getMigrationScriptFqClassName(myScript.getNode());
    Class<BaseMigrationScript> aClass;
    String languageNamespace = NameUtil.namespaceFromLongName(fqClassName);
    languageNamespace = languageNamespace.substring(0, languageNamespace.length() - ".scripts".length());
    Language l = MPSModuleRepository.getInstance().getLanguage(languageNamespace);

    if (l == null) {
      LOG.error("Can't find a language " + languageNamespace);
      return;
    }

    aClass = l.getClass(fqClassName);

    if (aClass == null) {
      JOptionPane.showMessageDialog(actionContext.get(IOperationContext.class).getMainFrame(), "class " + fqClassName + " not found", "", JOptionPane.ERROR_MESSAGE);
      return;
    }

    try {
      Constructor<BaseMigrationScript> constructor = aClass.getConstructor(IOperationContext.class);
      myScriptInstance = constructor.newInstance(actionContext.getOperationContext());
    } catch (InstantiationException e) {
      throw new RuntimeException(e);
    } catch (IllegalAccessException e) {
      throw new RuntimeException(e);
    } catch (NoSuchMethodException e) {
      throw new RuntimeException(e);
    } catch (InvocationTargetException e) {
      throw new RuntimeException(e);
    }

    super.doExecute(actionContext);
  }
  
  protected IRefactoring createRefactoring(ActionContext context) {
    ObsoleteRefactoringContext refactoringContext = new ObsoleteRefactoringContext(context.getOperationContext());

    List selection = context.get(List.class);
    if (selection != null && !selection.isEmpty()) {
        StringBuilder sb = new StringBuilder ();
        String sep = "";
        for (Object o : selection) {
            if (o instanceof SModelDescriptor) {
                SModelUID uid = ((SModelDescriptor) o).getModelUID();
                sb.append (sep).append(uid.toString());
                sep = "\n";
            }
        }
        refactoringContext.put(SMODEL_UID, sb.toString());
    }

    CompositeRefactoring compositeRefactoring = new CompositeRefactoring(refactoringContext);
    List<IRefactoring> list = myScriptInstance.getRefactorings();
    for (IRefactoring refactoring : list) {
      compositeRefactoring.add(refactoring);
    }
    return compositeRefactoring;
  }
}

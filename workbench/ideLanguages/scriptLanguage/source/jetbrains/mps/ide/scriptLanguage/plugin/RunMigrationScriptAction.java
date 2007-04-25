package jetbrains.mps.ide.scriptLanguage.plugin;

import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.ide.scriptLanguage.runtime.BaseMigrationScript;
import jetbrains.mps.ide.scriptLanguage.structure.MigrationScript;
import jetbrains.mps.ide.scriptLanguage.util.ScriptNameUtil;
import jetbrains.mps.refactoring.CompositeRefactoring;
import jetbrains.mps.refactoring.IRefactoring;
import jetbrains.mps.refactoring.RefactoringContext;
import jetbrains.mps.refactoring.common.RefactoringAction;
import jetbrains.mps.smodel.IOperationContext;
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
  private MigrationScript myScript;
  private BaseMigrationScript myScriptInstance;

  public RunMigrationScriptAction(MigrationScript script) {
    super(script.getTitle());
    myScript = script;
  }


  public void execute(@NotNull ActionContext actionContext) {
    String fqClassName = ScriptNameUtil.getMigrationScriptFqClassName(myScript.getNode());
    Class<BaseMigrationScript> aClass;
    try {
      aClass = (Class<BaseMigrationScript>) Class.forName(fqClassName);
    } catch (ClassNotFoundException e) {
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

    super.execute(actionContext);
  }

  protected IRefactoring createRefactoring(ActionContext context) {
    RefactoringContext refactoringContext = new RefactoringContext(context.getOperationContext());
    CompositeRefactoring compositeRefactoring = new CompositeRefactoring(refactoringContext);
    List<IRefactoring> list = myScriptInstance.getRefactorings();
    for (IRefactoring refactoring : list) {
      compositeRefactoring.add(refactoring);
    }
    return compositeRefactoring;
  }
}

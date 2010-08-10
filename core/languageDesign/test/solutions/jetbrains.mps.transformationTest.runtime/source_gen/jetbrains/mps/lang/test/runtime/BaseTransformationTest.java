package jetbrains.mps.lang.test.runtime;

/*Generated by MPS */

import junit.framework.TestCase;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.project.MPSProject;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.idea.LoggerFactory;
import jetbrains.mps.ide.IdeMain;
import jetbrains.mps.TestMain;
import jetbrains.mps.util.Macros;
import jetbrains.mps.vfs.IFile;
import javax.swing.SwingUtilities;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelReference;
import com.intellij.openapi.project.Project;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.generator.TransientModelsModule;
import jetbrains.mps.generator.impl.CloneUtil;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import java.lang.reflect.InvocationTargetException;

public class BaseTransformationTest extends TestCase {
  private static ProjectContainer myContainer = new ProjectContainer();

  private SModelDescriptor myModel;
  private SModelDescriptor myTransidentModel;
  private MPSProject myProject;

  public BaseTransformationTest() {
    Logger.setFactory(LoggerFactory.getInstance());
  }

  public void initTest(String projectName, final String model) throws Exception {
    IdeMain.setTestMode(IdeMain.TestMode.CORE_TEST);
    TestMain.configureMPS();
    this.myProject = myContainer.getProject(Macros.mpsHomeMacros().expandPath(projectName, ((IFile) null)));
    SwingUtilities.invokeAndWait(new Runnable() {
      public void run() {
        ModelAccess.instance().runWriteActionInCommand(new Runnable() {
          public void run() {
            SModelDescriptor modelDescriptor = SModelRepository.getInstance().getModelDescriptor(SModelReference.fromString(model));
            BaseTransformationTest.this.setModelDescriptor(modelDescriptor);
          }
        });
      }
    });
  }

  public void setProject(Project project) {
    this.myProject = project.getComponent(MPSProject.class);
  }

  public void setModelDescriptor(SModelDescriptor modelDescriptor) {
    this.myModel = modelDescriptor;
    ModuleContext context = ModuleContext.create(this.myModel, this.myProject.getProject(), false);
    TransientModelsModule module = context.getComponent(TransientModelsModule.class);
    this.myTransidentModel = module.createTestModel("testTransidentModel", "testTransidentModel");
    CloneUtil.cloneModel(this.myModel.getSModel(), this.myTransidentModel.getSModel(), false);
    this.myTransidentModel.getSModel().validateLanguagesAndImports();
  }

  public void runTest(final String className, final String methodName, final boolean runInCommand) throws Throwable {
    final Wrappers._T<Class> clazz = new Wrappers._T<Class>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        clazz.value = BaseTransformationTest.this.myModel.getModule().getClass(className);
        String classloader = clazz.value.getClassLoader().toString();
        String module = BaseTransformationTest.this.myModel.getModule().getModuleFqName();
        assert classloader.contains(module) : "class: " + clazz.value + "; classloader: " + classloader + "; module: " + module;
      }
    });
    final Object obj = clazz.value.newInstance();
    clazz.value.getField("myModel").set(obj, this.myTransidentModel);
    clazz.value.getField("myProject").set(obj, this.myProject);
    final Throwable[] exception = new Throwable[1];
    if (runInCommand) {
      SwingUtilities.invokeAndWait(new Runnable() {
        public void run() {
          ModelAccess.instance().runWriteActionInCommand(new Runnable() {
            public void run() {
              exception[0] = BaseTransformationTest.this.tryToRunTest(clazz.value, methodName, obj);
            }
          });
        }
      });
    } else {
      exception[0] = BaseTransformationTest.this.tryToRunTest(clazz.value, methodName, obj);
    }
    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        SModelRepository.getInstance().removeModelDescriptor(BaseTransformationTest.this.myTransidentModel);
      }
    });
    if (exception[0] != null) {
      throw exception[0];
    }
  }

  private Throwable tryToRunTest(Class clazz, String methodName, Object obj) {
    Throwable exception = null;
    try {
      clazz.getMethod(methodName).invoke(obj);
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      exception = e.getCause();
    }
    return exception;
  }

  public static ProjectContainer getProjectContainer() {
    return myContainer;
  }
}

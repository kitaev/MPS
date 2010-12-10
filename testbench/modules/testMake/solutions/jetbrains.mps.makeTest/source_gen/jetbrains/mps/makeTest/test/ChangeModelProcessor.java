package jetbrains.mps.makeTest.test;

/*Generated by MPS */

import com.intellij.openapi.project.Project;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.generator.generationTypes.IGenerationHandler;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.make.MPSCompilationResult;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.make.ModuleMaker;
import java.util.Collections;
import com.intellij.openapi.progress.EmptyProgressIndicator;
import java.util.List;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.generator.GeneratorManager;
import jetbrains.mps.messages.IMessageHandler;
import jetbrains.mps.messages.Message;
import jetbrains.mps.messages.MessageKind;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.smodel.SModelRepository;

public class ChangeModelProcessor {
  private static final String TEST_RESOURCES_PATH = "core/kernel/testMake/solutions/jetbrains.mps.testModels/jetbrains/mps/testModels/";
  private static final String STEP_TYPE_CHANGE = "changed";
  private static final String STEP_TYPE_REVERT = "reverted";

  private Project myProject;
  private EditableSModelDescriptor myTestModel;
  private EditableSModelDescriptor myModelToChange;
  private ChangeModel myChangeModel;

  public ChangeModelProcessor(Project project, String baseModelName, ChangeModel changeModel) {
    this.myProject = project;
    this.myTestModel = ((EditableSModelDescriptor) this.getModelDescriptorByName(baseModelName + '1'));
    this.myModelToChange = ((EditableSModelDescriptor) this.getModelDescriptorByName(baseModelName + '2'));
    this.myChangeModel = changeModel;
  }

  public boolean changeStep(IGenerationHandler generationHandler) {
    final SModel modelToChange = this.getModelToChange();
    return this.step(new Runnable() {
      public void run() {
        modelToChange.runLoadingAction(new Runnable() {
          public void run() {
            ChangeModelProcessor.this.myChangeModel.change(modelToChange);
          }
        });
      }
    }, STEP_TYPE_CHANGE, generationHandler);
  }

  public boolean revertStep(IGenerationHandler generationHandler) {
    final SModel modelToChange = this.getModelToChange();
    return this.step(new Runnable() {
      public void run() {
        modelToChange.runLoadingAction(new Runnable() {
          public void run() {
            ChangeModelProcessor.this.myChangeModel.rollback(modelToChange);
          }
        });
      }
    }, STEP_TYPE_REVERT, generationHandler);
  }

  private boolean step(final Runnable runnable, String type, IGenerationHandler generationHandler) {
    this.generateModelToChange(generationHandler);
    final MPSCompilationResult[] cr = new MPSCompilationResult[]{null};
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        cr[0] = new ModuleMaker().make(Collections.singleton(ChangeModelProcessor.this.myTestModel.getModule()), new EmptyProgressIndicator());
      }
    });
    if (cr[0].isOk()) {
      System.out.println("No compilation problem");
    } else {
      System.out.println("Compilation failed");
    }
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        runnable.run();
      }
    });
    System.out.println("Model " + this.myModelToChange.getLongName() + " " + type);
    return cr[0].isOk();
  }

  public List<String> generateTestModel(IGenerationHandler generationHandler) {
    return this.generate(this.myTestModel, generationHandler);
  }

  public List<String> generateModelToChange(IGenerationHandler generationHandler) {
    return this.generate(this.myModelToChange, generationHandler);
  }

  private List<String> generate(SModelDescriptor model, IGenerationHandler generationHandler) {
    final List<String> results = ListSequence.fromList(new ArrayList<String>());
    List<SModelDescriptor> models = Collections.singletonList(model);
    GeneratorManager gm = this.myProject.getComponent(GeneratorManager.class);
    IMessageHandler handler = new IMessageHandler() {
      public void handle(Message msg) {
        if (msg.getKind() == MessageKind.ERROR) {
          ListSequence.fromList(results).addElement(msg.getText());
        }
      }

      public void clear() {
      }
    };
    model.getModule().getModuleDescriptor().setCompileInMPS(false);
    gm.generateModels(models, new ModuleContext(model.getModule(), this.myProject), generationHandler, new EmptyProgressIndicator(), handler);
    model.getModule().getModuleDescriptor().setCompileInMPS(true);
    return results;
  }

  public SModelDescriptor getModelDescriptorByName(String name) {
    String path = TEST_RESOURCES_PATH + name + ".mps";
    IFile file = FileSystem.getInstance().getFileByPath(path);
    return SModelRepository.getInstance().findModel(file);
  }

  public SModel getTestModel() {
    return this.getModel(this.myTestModel);
  }

  public SModel getModelToChange() {
    return this.getModel(this.myModelToChange);
  }

  private SModel getModel(final SModelDescriptor modelDescriptor) {
    final SModel[] model = new SModel[]{null};
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        model[0] = modelDescriptor.getSModel();
      }
    });
    return model[0];
  }
}

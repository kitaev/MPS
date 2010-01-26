package jetbrains.mps.build.packaging.plugin;

/*Generated by MPS */

import jetbrains.mps.logging.Logger;
import java.io.File;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.ModelAccess;
import com.intellij.openapi.util.Computable;
import jetbrains.mps.build.packaging.behavior.MPSLayout_Behavior;
import jetbrains.mps.build.packaging.behavior.Configuration_Behavior;
import jetbrains.mps.generator.GeneratorManager;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import com.intellij.openapi.progress.EmptyProgressIndicator;
import jetbrains.mps.ide.messages.IMessageHandler;
import jetbrains.mps.ide.messages.Message;
import java.util.List;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class GenerateTextFromBuild {
  private static Logger LOG = Logger.getLogger(GenerateTextFromBuild.class);

  public GenerateTextFromBuild() {
  }

  public static File generate(final SNode configuration, SModelDescriptor descriptor, IOperationContext context, MPSProject project, boolean showWindow) {
    String basedir = ModelAccess.instance().runReadAction(new Computable<String>() {
      public String compute() {
        return MPSLayout_Behavior.call_getFolderToGenerate_1229522949966(Configuration_Behavior.call_getLayout_1213877261819(configuration));
      }
    });
    // generate files 
    final GeneratorManager generatorManager = project.getComponentSafe(GeneratorManager.class);
    GenerateTextFromBuildGenerationHandler generationHandler = new GenerateTextFromBuildGenerationHandler(basedir, configuration);
    if (showWindow) {
      generatorManager.generateModelsWithProgressWindow(ListSequence.fromListAndArray(new ArrayList<SModelDescriptor>(), descriptor), context, generationHandler, true);
    } else {
      generatorManager.generateModels(ListSequence.fromListAndArray(new ArrayList<SModelDescriptor>(), descriptor), context, generationHandler, new EmptyProgressIndicator(), new IMessageHandler() {
        public void handle(Message message) {
          switch (message.getKind()) {
            case ERROR:
              System.err.println("error: " + message.getText());
            case WARNING:
              System.out.println("warning: " + message.getText());
            case INFORMATION:
              System.out.println("info: " + message.getText());
            default:
          }
        }
      });
    }
    return generationHandler.getFileToRun();
  }

  public static SNode getLayout(SModelDescriptor descriptor) {
    final List<SNode> roots = descriptor.getSModel().getRoots();
    final Wrappers._T<SNode> layout = new Wrappers._T<SNode>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        for (SNode root : ListSequence.fromList(roots)) {
          if (SNodeOperations.isInstanceOf(root, "jetbrains.mps.build.packaging.structure.MPSLayout")) {
            layout.value = SNodeOperations.cast(root, "jetbrains.mps.build.packaging.structure.MPSLayout");
            return;
          }
        }
      }
    });
    return layout.value;
  }
}

package jetbrains.mps.smodel;

import jetbrains.mps.generator.*;
import jetbrains.mps.ide.ThreadUtils;
import jetbrains.mps.ide.AbstractProjectFrame;
import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.ide.command.CommandProcessor;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.messages.DefaultMessageHandler;
import jetbrains.mps.ide.progress.IAdaptiveProgressMonitor;
import jetbrains.mps.ide.progress.NullAdaptiveProgressMonitor;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.project.ProjectOperationContext;
import jetbrains.mps.refactoring.NewRefactoringView;
import jetbrains.mps.refactoring.framework.ILoggableRefactoring;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.refactoring.framework.RefactoringHistory;
import jetbrains.mps.refactoring.framework.RefactoringNodeMembersAccessModifier;
import jetbrains.mps.util.Calculable;
import org.jetbrains.annotations.NotNull;

import javax.swing.JOptionPane;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 28.09.2007
 * Time: 17:55:17
 * To change this template use File | Settings | File Templates.
 */
public class RefactoringProcessor {

  private static final Logger LOG = Logger.getLogger(RefactoringProcessor.class);

  public void execute(final @NotNull ActionContext context, final ILoggableRefactoring refactoring) {
    final RefactoringContext refactoringContext = new RefactoringContext(refactoring);
    boolean success = refactoring.askForInfo(context, refactoringContext);
    if (!success) return;
    if (refactoring.showsAffectedNodes()) {
      Thread thread = new Thread() {
        public void run() {
          final boolean toReturn[] = new boolean[]{false};
          CommandProcessor.instance().executeLightweightCommand(new Runnable() {
            public void run() {
              try {
                ActionContext newContext = new ActionContext(context);
                newContext.put(IOperationContext.class, new ProjectOperationContext(context.getOperationContext().getProject()));
                refactoringContext.setUsages(refactoring.getAffectedNodes(newContext, refactoringContext));
              } catch (Throwable t) {
                LOG.error(t);
                ThreadUtils.runInUIThreadAndWait(new Runnable() {
                  public void run() {
                    int promptResult = JOptionPane.showConfirmDialog(context.getFrame(),
                      "An exception occurred during searching affected nodes. Do you want to continue anyway?", "Exception", JOptionPane.YES_NO_OPTION);
                    toReturn[0] = promptResult == JOptionPane.NO_OPTION;
                  }
                });
              }
            }
          });
          if (toReturn[0]) return;
          SearchResults usages = refactoringContext.getUsages();
          if (usages == null || (refactoring.refactorImmediatelyIfNoUsages() && usages.getSearchResults().isEmpty())) {
            doExecuteInThread(context, refactoringContext);
          } else {
            ThreadUtils.runInUIThreadNoWait(new Runnable() {
              public void run() {
                CommandProcessor.instance().executeLightweightCommand(new Runnable() {
                  public void run() {
                    NewRefactoringView.showRefactoringView(context, refactoringContext);
                  }
                });
              }
            });
          }
        }
      };
      thread.start();
    } else {
      doExecuteInThread(context, refactoringContext);
    }
  }

  public Thread doExecuteInThread(final @NotNull ActionContext context, final @NotNull RefactoringContext refactoringContext) {
    Thread result = new Thread() {
      public void run() {
        doExecute(context, refactoringContext);
      }
    };
    result.start();
    return result;
  }

  public void doExecuteInTest(ActionContext context, RefactoringContext refactoringContext) {
    doExecute(context, refactoringContext);
  }

  private void doExecute(final @NotNull ActionContext context, final @NotNull RefactoringContext refactoringContext) {
    CommandProcessor.instance().executeLightweightCommand(new Runnable() {
      public void run() {
        SModelRepository.getInstance().saveAll();
      }
    });

    AbstractProjectFrame projectFrame = context.get(AbstractProjectFrame.class);
    IAdaptiveProgressMonitor monitor_ = new NullAdaptiveProgressMonitor();
    boolean hasMonitor = projectFrame != null;
    if (hasMonitor) {
      monitor_ = projectFrame.createAdaptiveProgressMonitor();
    }
    final IAdaptiveProgressMonitor monitor = monitor_;
    final ILoggableRefactoring refactoring = refactoringContext.getRefactoring();
    final String refactoringTaskName = "refactoring_" + refactoring.getClass().getName();
    final long estimatedTime = monitor.getEstimatedTime(refactoringTaskName);
    try {
      monitor.start("refactoring", estimatedTime);
      monitor.startLeafTask(refactoringTaskName, "refactoring", estimatedTime);

      Map<IModule, List<SModel>> moduleToModelsMap = CommandProcessor.instance().executeCommand(new Calculable<Map<IModule, List<SModel>>>() {
        public Map<IModule, List<SModel>> calculate() {
          SModelDescriptor modelDescriptor = context.getModel();
          SModelUID initialModelUID = modelDescriptor.getModelUID();
          refactoring.doRefactor(context, refactoringContext);

          SModel model = modelDescriptor.getSModel();

          refactoringContext.computeCaches();
          SearchResults usages = refactoringContext.getUsages();
          Map<IModule, List<SModel>> moduleToModelsMap = refactoring.getModelsToGenerate(context, refactoringContext);
          List<SModel> modelsToUpdate = refactoring.getModelsToUpdate(context, refactoringContext);
          if (!refactoringContext.isLocal()) {
            if (refactoring.doesUpdateModel()) {
              writeIntoLog(model, refactoringContext);
              for (SModelDescriptor anotherDescriptor : SModelRepository.getInstance().getAllModelDescriptors()) {
                String stereotype = anotherDescriptor.getStereotype();
                if (!stereotype.equals(SModelStereotype.NONE) && !stereotype.equals(SModelStereotype.TEMPLATES)) {
                  continue;
                }
                if (!anotherDescriptor.isInitialized()) continue;
                SModel anotherModel = anotherDescriptor.getSModel();

                Set<SModelUID> dependenciesModels = anotherModel.getDependenciesModelUIDs();
                if (model != anotherModel
                  && !dependenciesModels.contains(initialModelUID)) continue;
                processModel(anotherModel, model, refactoringContext);
              }
            }
          } else {
            if (refactoring.doesUpdateModel()) {
              Set<SModel> modelsToProcess = new LinkedHashSet<SModel>();
              if (usages != null) {
                modelsToProcess.addAll(usages.getModelsWithResults());
              }
              modelsToProcess.addAll(modelsToUpdate);

            /*  //todo remove hack
              for (List<SModel> sModels : moduleToModelsMap.values()) {
                modelsToProcess.addAll(sModels);
              }*/

              for (SModel anotherModel : modelsToProcess) {
                processModel(anotherModel, model, refactoringContext);
              }
            }
          }
          return moduleToModelsMap;
        }
      });

      if (moduleToModelsMap != null && !moduleToModelsMap.isEmpty()) {
        generateModels(context, moduleToModelsMap, refactoringContext);
      }
    } finally {
      monitor.finishTask();
      monitor.finish();
    }


  }

  private void generateModels(final ActionContext context, final Map<IModule, List<SModel>> sourceModels, RefactoringContext refactoringContext) {
    final RefactoringNodeMembersAccessModifier modifier = new RefactoringNodeMembersAccessModifier();
    refactoringContext.setUpMembersAccessModifier(modifier);
    for (final IModule sourceModule : sourceModels.keySet()) {
      CommandProcessor.instance().executeGenerationCommand(new Runnable() {
        public void run() {
          try {
            IOperationContext operationContext = new ModuleContext(sourceModule, context.getOperationContext().getProject());
            final List<SModel> models = sourceModels.get(sourceModule);
            modifier.addModelsToModify(models);
            SNode.setNodeMemeberAccessModifier(modifier);

            List<SModelDescriptor> descriptors = new ArrayList<SModelDescriptor>();
            for (SModel model : models) {
              descriptors.add(model.getModelDescriptor());
            }

            new GeneratorManager(operationContext.getProject()).generateModels(descriptors,
              operationContext,
              IGenerationType.FILES,
              IAdaptiveProgressMonitor.NULL_PROGRESS_MONITOR,
              new DefaultMessageHandler(operationContext.getProject())
            );
          } finally {
            SNode.setNodeMemeberAccessModifier(null);
          }
        }
      });
    }
  }

  private void processModel(SModel model, SModel usedModel, RefactoringContext refactoringContext) {
    refactoringContext.getRefactoring().updateModel(model, refactoringContext);
    model.updateImportedModelUsedVersion(usedModel.getUID(), usedModel.getVersion());
   // SModelRepository.getInstance().markChanged(model);
  }

  private void writeIntoLog(SModel model, RefactoringContext refactoringContext) {
    if (refactoringContext.isLocal()) return;
    RefactoringHistory refactoringHistory = model.getRefactoringHistory();
    refactoringHistory.addRefactoringContext(refactoringContext);
    model.increaseVersion();
    refactoringContext.setModelVersion(model.getVersion());
  }
}

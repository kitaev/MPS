package jetbrains.mps.make.facet.plugin;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.workbench.make.WorkbenchMakeService;
import jetbrains.mps.make.IMakeService;
import jetbrains.mps.ide.generator.GenerationCheckHelper;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.smodel.resources.MResource;

public class MakeActionImpl {
  private IOperationContext context;
  private MakeActionParameters params;
  private boolean cleanMake;

  public MakeActionImpl(IOperationContext context, MakeActionParameters params, boolean cleanMake) {
    this.context = context;
    this.params = params;
    this.cleanMake = cleanMake;
  }

  public void executeAction() {
    final Iterable<? extends IResource> inputRes = params.collectInput(!(this.cleanMake));

    new WorkbenchMakeService(context, cleanMake).make(inputRes, new IMakeService.Executor() {
      public void doExecute(Runnable runnable) {
        dodoExecute(inputRes, runnable);
      }
    });
  }

  private void dodoExecute(Iterable<? extends IResource> inputRes, Runnable exec) {
    GenerationCheckHelper.getInstance().checkModelsAndRun(this.context.getProject(), this.context, Sequence.fromIterable(this.selectModels(inputRes)).toListSequence(), exec);
  }

  private Iterable<SModelDescriptor> selectModels(Iterable<? extends IResource> inputRes) {
    return Sequence.fromIterable(inputRes).<SModelDescriptor>translate(new ITranslator2<IResource, SModelDescriptor>() {
      public Iterable<SModelDescriptor> translate(IResource it) {
        return ((MResource) it).models();
      }
    });
  }
}

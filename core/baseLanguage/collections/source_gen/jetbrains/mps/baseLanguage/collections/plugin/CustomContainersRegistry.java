package jetbrains.mps.baseLanguage.collections.plugin;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.project.IModule;
import java.util.Set;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.smodel.SModelDescriptor;

public class CustomContainersRegistry {
  /*package*/ static CustomContainersRegistry INSTANCE = new CustomContainersRegistry();

  private List<_FunctionTypes._return_P0_E0<? extends List<SNode>>> providers = ListSequence.fromList(new ArrayList<_FunctionTypes._return_P0_E0<? extends List<SNode>>>());

  private CustomContainersRegistry() {
  }

  public List<SNode> allCustomContainerDeclarations() {
    Iterable<SNode> allCustomContainers = this.primAllCustomContainers();
    List<SNode> res = new ArrayList<SNode>();
    ListSequence.fromList(res).addSequence(Sequence.fromIterable(allCustomContainers).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode cc) {
        return SLinkOperations.getTargets(cc, "containerDeclaration", true);
      }
    }));
    return res;
  }

  public List<SNode> accessibleCustomContainerDeclarations(SModel fromModel) {
    List<SNode> res = new ArrayList<SNode>();
    IModule om = this.getOwningModule(fromModel);
    if (om != null) {
      final Set<IModule> allDependOnModules = om.getDependenciesManager().getAllDependOnModules();
      final List<Language> allUsedLanguages = om.getDependenciesManager().getAllUsedLanguages();
      Iterable<SNode> allCustomContainers = this.primAllCustomContainers();
      ListSequence.fromList(res).addSequence(Sequence.fromIterable(allCustomContainers).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode cc) {
          IModule owner = CustomContainersRegistry.this.getOwningModule(SNodeOperations.getModel(cc));
          return SetSequence.fromSet(allDependOnModules).contains(owner) || ListSequence.fromList(allUsedLanguages).contains(owner);
        }
      }).translate(new ITranslator2<SNode, SNode>() {
        public Iterable<SNode> translate(SNode cc) {
          return SLinkOperations.getTargets(cc, "containerDeclaration", true);
        }
      }));
    }
    return res;
  }

  public void registerProvider(_FunctionTypes._return_P0_E0<? extends List<SNode>> prov) {
    synchronized (this) {
      ListSequence.fromList(this.providers).addElement(prov);
    }
  }

  public void unRegisterProvider(_FunctionTypes._return_P0_E0<? extends List<SNode>> prov) {
    synchronized (this) {
      ListSequence.fromList(this.providers).removeElement(prov);
    }
  }

  public IModule getOwningModule(SModel model) {
    SModelDescriptor fmdesc = model.getModelDescriptor();
    return (fmdesc != null ?
      fmdesc.getModule() :
      null
    );
  }

  private Iterable<SNode> primAllCustomContainers() {
    List<_FunctionTypes._return_P0_E0<? extends List<SNode>>> providersCopy;
    synchronized (this) {
      providersCopy = ListSequence.fromListWithValues(new ArrayList<_FunctionTypes._return_P0_E0<? extends List<SNode>>>(), this.providers);
    }
    return ListSequence.fromList(providersCopy).translate(new ITranslator2<_FunctionTypes._return_P0_E0<? extends List<SNode>>, SNode>() {
      public Iterable<SNode> translate(_FunctionTypes._return_P0_E0<? extends List<SNode>> prov) {
        return prov.invoke();
      }
    });
  }
}

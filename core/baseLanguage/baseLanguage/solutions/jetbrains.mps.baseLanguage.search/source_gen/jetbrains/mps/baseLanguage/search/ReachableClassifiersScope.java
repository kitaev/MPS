package jetbrains.mps.baseLanguage.search;

/*Generated by MPS */

import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.SModel;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.search.ModelAndImportedModelsScope;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.search.IReferenceInfoResolver;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.SModelReference;

public class ReachableClassifiersScope extends AbstractClassifiersScope {
  private IScope myScope;
  private SModel myModel;

  public ReachableClassifiersScope(SModel model, int constraint, IScope scope) {
    super(constraint);
    this.myModel = model;
    this.myScope = scope;
  }

  public SModel getModel() {
    return this.myModel;
  }

  public IScope getScope() {
    return this.myScope;
  }

  @NotNull
  public List<SNode> getClassifiers() {
    List<SModelDescriptor> models = new ModelAndImportedModelsScope(this.myModel, false, this.myScope).getModels();
    List<SNode> result = new ArrayList<SNode>();
    for (SModelDescriptor model : models) {
      List<SNode> classifiers = ClassifiersCache.getInstance(model).getClassifiers();
      ListSequence.fromList(result).addSequence(ListSequence.fromList(classifiers));
    }
    return result;
  }

  @Override
  public IReferenceInfoResolver getReferenceInfoResolver(SNode referenceNode, SNode targetConcept) {
    if (SModelUtil.isAssignableConcept(targetConcept, SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.Classifier"))) {
      return new ReachableClassifiersScope.ClassifierReferenceInfoResolver(this.myModel, this.myScope);
    }
    return super.getReferenceInfoResolver(referenceNode, targetConcept);
  }

  protected static class ClassifierReferenceInfoResolver implements IReferenceInfoResolver {
    private SModel myModel;
    private IScope myScope;

    public ClassifierReferenceInfoResolver(SModel model, IScope scope) {
      this.myModel = model;
      this.myScope = scope;
    }

    public SNode resolve(String referenceInfo, SModelReference targetModelReference) {
      SModelDescriptor targetModel = this.myScope.getModelDescriptor(targetModelReference);
      if (targetModel == null) {
        return null;
      }
      List<SNode> classifiers = ClassifiersCache.getInstance(targetModel).getClassifiersByRefName(referenceInfo);
      if (ListSequence.fromList(classifiers).isNotEmpty()) {
        return ListSequence.fromList(classifiers).first();
      }
      return null;
    }
  }
}

package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.quickfix.QuickFix_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.search.ClassifierAndSuperClassifiersScope;
import jetbrains.mps.baseLanguage.structure.Classifier;
import jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.INodeAdapter;

public class ChooseAppropriateMethodDeclaration_QuickFix extends QuickFix_Runtime {

  public ChooseAppropriateMethodDeclaration_QuickFix() {
  }

  public String getDescription() {
    return "choose appropriate method declaration";
  }

  public void execute(SNode node) {
    if (SNodeOperations.isInstanceOf(((SNode)this.getField("methodCall")[0]), "jetbrains.mps.baseLanguage.structure.ClassCreator") && SNodeOperations.isInstanceOf(((SNode)this.getField("classifier")[0]), "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
      SNode constructorCall = ((SNode)this.getField("methodCall")[0]);
      SNode classConcept = ((SNode)this.getField("classifier")[0]);
      List<SNode> list = SLinkOperations.getTargets(classConcept, "constructor", true);
      for(SNode constructorDeclaration : list) {
        if (SLinkOperations.getCount(constructorDeclaration, "parameter") == SLinkOperations.getCount(constructorCall, "actualArgument")) {
          boolean good = true;
          List<SNode> parameterTypes = ResolveUtil.parameterTypes(SLinkOperations.getTarget(constructorCall, "baseMethodDeclaration", false), TypeChecker.getInstance().getTypeOf(constructorCall), ((SNode)this.getField("classifier")[0]));
          {
            SNode parameter;
            SNode argument;
            Iterator<SNode> parameter_iterator = parameterTypes.iterator();
            Iterator<SNode> argument_iterator = SLinkOperations.getTargets(constructorCall, "actualArgument", true).iterator();
            while (true) {
              if (!(parameter_iterator.hasNext())) {
                break;
              }
              if (!(argument_iterator.hasNext())) {
                break;
              }
              parameter = parameter_iterator.next();
              argument = argument_iterator.next();
              if (!(TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(argument), SLinkOperations.getTarget(parameter, "type", true)))) {
                good = false;
                break;
              }
            }
          }
          if (good) {
            SLinkOperations.setTarget(constructorCall, "baseMethodDeclaration", constructorDeclaration, false);
            return;
          }
        }
      }
    } else
    {
      SNode instanceType = TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(SNodeOperations.getParent(((SNode)this.getField("methodCall")[0])), "operand", true));
      ClassifierAndSuperClassifiersScope scope = new ClassifierAndSuperClassifiersScope((Classifier)((Classifier)SNodeOperations.getAdapter(SLinkOperations.getTarget(instanceType, "classifier", false))));
      List<BaseMethodDeclaration> list = scope.getMethodsByName(SPropertyOperations.getString(SLinkOperations.getTarget(((SNode)this.getField("methodCall")[0]), "baseMethodDeclaration", false), "name"));
      for(BaseMethodDeclaration object : list) {
        INodeAdapter adapter = (INodeAdapter)object;
        SNode baseMethodDeclaration = ((SNode)adapter.getNode());
        if (SLinkOperations.getCount(baseMethodDeclaration, "parameter") == SLinkOperations.getCount(((SNode)this.getField("methodCall")[0]), "actualArgument")) {
          boolean good = true;
          List<SNode> parameterTypes = ResolveUtil.parameterTypes(baseMethodDeclaration, instanceType, ((SNode)this.getField("classifier")[0]));
          {
            SNode parameterType;
            SNode argument;
            Iterator<SNode> parameterType_iterator = parameterTypes.iterator();
            Iterator<SNode> argument_iterator = SLinkOperations.getTargets(((SNode)this.getField("methodCall")[0]), "actualArgument", true).iterator();
            while (true) {
              if (!(parameterType_iterator.hasNext())) {
                break;
              }
              if (!(argument_iterator.hasNext())) {
                break;
              }
              parameterType = parameterType_iterator.next();
              argument = argument_iterator.next();
              if (!(TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(argument), parameterType))) {
                good = false;
                break;
              }
            }
          }
          if (good) {
            SLinkOperations.setTarget(((SNode)this.getField("methodCall")[0]), "baseMethodDeclaration", baseMethodDeclaration, false);
            return;
          }
        }
      }
    }
  }

}

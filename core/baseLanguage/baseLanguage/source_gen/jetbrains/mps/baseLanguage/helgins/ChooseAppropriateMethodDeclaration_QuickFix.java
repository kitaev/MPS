package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.quickfix.QuickFix_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.search.ClassifierAndSuperClassifiersScope;
import jetbrains.mps.baseLanguage.structure.Classifier;
import jetbrains.mps.smodel.INodeAdapter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.Iterator;
import jetbrains.mps.helgins.inference.TypeChecker;

public class ChooseAppropriateMethodDeclaration_QuickFix extends QuickFix_Runtime {

  public ChooseAppropriateMethodDeclaration_QuickFix() {
  }

  public String getDescription() {
    return "choose appropriate method declaration";
  }

  public void execute(SNode node) {
    ClassifierAndSuperClassifiersScope scope = new ClassifierAndSuperClassifiersScope((Classifier)((INodeAdapter)SNodeOperations.getAdapter(((SNode)this.getField("classifier")[0]))));
    List list = scope.getMethodsByName(SPropertyOperations.getString(SLinkOperations.getTarget(((SNode)this.getField("methodCall")[0]), "baseMethodDeclaration", false), "name"));
    for(Object object : list) {
      INodeAdapter adapter = (INodeAdapter)object;
      SNode baseMethodDeclaration = ((SNode)adapter.getNode());
      if (SLinkOperations.getCount(baseMethodDeclaration, "parameter") == SLinkOperations.getCount(((SNode)this.getField("methodCall")[0]), "actualArgument")) {
        boolean good = true;
        {
          SNode parameter;
          SNode argument;
          Iterator<SNode> parameter_iterator = SLinkOperations.getTargets(baseMethodDeclaration, "parameter", true).iterator();
          Iterator<SNode> argument_iterator = SLinkOperations.getTargets(((SNode)this.getField("methodCall")[0]), "actualArgument", true).iterator();
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
          SLinkOperations.setTarget(((SNode)this.getField("methodCall")[0]), "baseMethodDeclaration", baseMethodDeclaration, false);
          return;
        }
      }
    }
  }

}

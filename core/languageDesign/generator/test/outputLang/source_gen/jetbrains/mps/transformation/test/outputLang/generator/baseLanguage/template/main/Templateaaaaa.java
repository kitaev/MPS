package jetbrains.mps.transformation.test.outputLang.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateDeclaration;
import jetbrains.mps.smodel.SNode;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.runtime.TemplateUtil;

public class Templateaaaaa implements TemplateDeclaration {
  private SNode myNnnn;

  public Templateaaaaa(SNode nnnn) {
    this.myNnnn = nnnn;
  }

  public Collection<SNode> apply(@NotNull final TemplateExecutionEnvironment environment, @NotNull TemplateContext context, String mappingName) throws GenerationException {
    TemplateContext contextWithParameters = context;
    final SNode tnode1 = new SNode(null, "jetbrains.mps.baseLanguage.structure.BlockStatement", false);
    // TODO notify environment 
    {
      final SNode tnode2 = new SNode(null, "jetbrains.mps.baseLanguage.structure.StatementList", false);
      // TODO notify environment 
      tnode1.addChild("statements", tnode2);
    }
    return TemplateUtil.singletonList(tnode1);
  }
}

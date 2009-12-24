package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class IncludeMacro extends SourceSubstituteMacro {
  public static final String concept = "jetbrains.mps.lang.generator.structure.IncludeMacro";
  public static final String INCLUDE_TEMPLATE = "includeTemplate";
  public static final String SOURCE_NODE_QUERY = "sourceNodeQuery";

  public IncludeMacro(SNode node) {
    super(node);
  }

  public TemplateDeclaration getIncludeTemplate() {
    return (TemplateDeclaration) this.getReferent(TemplateDeclaration.class, IncludeMacro.INCLUDE_TEMPLATE);
  }

  public void setIncludeTemplate(TemplateDeclaration node) {
    super.setReferent(IncludeMacro.INCLUDE_TEMPLATE, node);
  }

  public SourceSubstituteMacro_SourceNodeQuery getSourceNodeQuery() {
    return (SourceSubstituteMacro_SourceNodeQuery) this.getChild(SourceSubstituteMacro_SourceNodeQuery.class, IncludeMacro.SOURCE_NODE_QUERY);
  }

  public void setSourceNodeQuery(SourceSubstituteMacro_SourceNodeQuery node) {
    super.setChild(IncludeMacro.SOURCE_NODE_QUERY, node);
  }

  public static IncludeMacro newInstance(SModel sm, boolean init) {
    return (IncludeMacro) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.structure.IncludeMacro", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static IncludeMacro newInstance(SModel sm) {
    return IncludeMacro.newInstance(sm, false);
  }
}

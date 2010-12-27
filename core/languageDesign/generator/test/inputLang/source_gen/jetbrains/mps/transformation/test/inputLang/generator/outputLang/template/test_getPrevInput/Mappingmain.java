package jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateMappingConfiguration;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateRootMappingRule;
import jetbrains.mps.generator.runtime.TemplateModel;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.generator.runtime.TemplateReductionRule;
import java.util.Collections;
import jetbrains.mps.generator.runtime.TemplateCreateRootRule;
import jetbrains.mps.generator.runtime.TemplateWeavingRule;
import jetbrains.mps.generator.runtime.TemplateDropRootRule;
import jetbrains.mps.generator.runtime.TemplateMappingScript;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.smodel.SNode;

public class Mappingmain implements TemplateMappingConfiguration {
  private static SNodePointer rootMappingRule_417xrn_a0a0a = new SNodePointer("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)", "1202255161953");
  private static SNodePointer rootMappingRule_417xrn_b0b0a0a4a = new SNodePointer("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)", "1202255161953");
  private static SNodePointer rootMappingRule_417xrn_a0a0b = new SNodePointer("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)", "1202338801828");
  private static SNodePointer rootMappingRule_417xrn_b0b0a0a4b = new SNodePointer("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)", "1202338801828");

  private final Collection<TemplateRootMappingRule> rootRules;
  private final TemplateModel myModel;

  public Mappingmain(TemplateModel model) {
    this.myModel = model;
    rootRules = TemplateUtil.<TemplateRootMappingRule>asCollection(new Mappingmain.RootMappingRule0(), new Mappingmain.RootMappingRule1());
  }

  public String getName() {
    return "main";
  }

  public TemplateModel getModel() {
    return this.myModel;
  }

  public SNodePointer getMappingNode() {
    return new SNodePointer("r:00000000-0000-4000-0000-011c895905f7(jetbrains.mps.transformation.test.inputLang.generator.outputLang.template.test_getPrevInput@generator)", "1202255161944");
  }

  public Collection<TemplateReductionRule> getReductionRules() {
    return Collections.emptySet();
  }

  public Collection<TemplateCreateRootRule> getCreateRules() {
    return Collections.emptySet();
  }

  public Collection<TemplateRootMappingRule> getRootRules() {
    return rootRules;
  }

  public Collection<TemplateWeavingRule> getWeavingRules() {
    return Collections.emptySet();
  }

  public Collection<TemplateDropRootRule> getDropRules() {
    return Collections.emptySet();
  }

  public Collection<TemplateMappingScript> getPostScripts() {
    return Collections.emptySet();
  }

  public Collection<TemplateMappingScript> getPreScripts() {
    return Collections.emptySet();
  }

  public class RootMappingRule0 implements TemplateRootMappingRule {
    public RootMappingRule0() {
    }

    public SNodePointer getRuleNode() {
      return rootMappingRule_417xrn_a0a0a;
    }

    public boolean applyToInheritors() {
      return false;
    }

    public String getApplicableConcept() {
      return "jetbrains.mps.transformation.test.inputLang.structure.InputRoot";
    }

    public boolean keepSourceRoot() {
      return false;
    }

    public boolean isApplicable(TemplateExecutionEnvironment environment, TemplateContext context) throws GenerationException {
      if (!(QueriesGenerated.baseMappingRule_Condition_1202255161954(environment.getOperationContext(), new BaseMappingRuleContext(context.getInput(), rootMappingRule_417xrn_b0b0a0a4a, environment.getGenerator())))) {
        return false;
      }
      return true;
    }

    public Collection<SNode> apply(final TemplateExecutionEnvironment environment, final TemplateContext context) throws GenerationException {
      Collection<SNode> result = new TemplateOutputRoot__1().apply(environment, context);
      environment.registerLabel(context.getInput(), result, "ROOT INPUT");
      return result;
    }
  }

  public class RootMappingRule1 implements TemplateRootMappingRule {
    public RootMappingRule1() {
    }

    public SNodePointer getRuleNode() {
      return rootMappingRule_417xrn_a0a0b;
    }

    public boolean applyToInheritors() {
      return false;
    }

    public String getApplicableConcept() {
      return "jetbrains.mps.transformation.test.inputLang.structure.InputRoot";
    }

    public boolean keepSourceRoot() {
      return false;
    }

    public boolean isApplicable(TemplateExecutionEnvironment environment, TemplateContext context) throws GenerationException {
      if (!(QueriesGenerated.baseMappingRule_Condition_1202338801829(environment.getOperationContext(), new BaseMappingRuleContext(context.getInput(), rootMappingRule_417xrn_b0b0a0a4b, environment.getGenerator())))) {
        return false;
      }
      return true;
    }

    public Collection<SNode> apply(final TemplateExecutionEnvironment environment, final TemplateContext context) throws GenerationException {
      Collection<SNode> result = new TemplateOutputRoot__2().apply(environment, context);
      environment.registerLabel(context.getInput(), result, "ROOT INPUT");
      return result;
    }
  }
}

package jetbrains.mps.lang.generator.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.ConstraintsDescriptor;
import jetbrains.mps.smodel.structure.DataHolderConstraintsDescriptor;
import jetbrains.mps.smodel.structure.EmptyConstraintsDataHolder;

public class ConstraintsAspectDescriptor extends DescriptorProvider<ConstraintsDescriptor> {
  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch ((fqName).hashCode()) {
      case 240434391:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.PropertyMacro"));
      case -517017398:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.NodeMacro"));
      case -984683167:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.ReferenceMacro"));
      case -19379584:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.TemplateDeclaration"));
      case 880434408:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.MappingConfiguration"));
      case 1323014922:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.TemplateFragment"));
      case -694200722:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.TemplateSwitch"));
      case 1845354200:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.SwitchMacro"));
      case 270361725:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.TemplateSwitchReference"));
      case 983256987:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.CopySrcNodeMacro"));
      case -706638209:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.CopySrcListMacro"));
      case 865059471:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.IfMacro"));
      case 290450792:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.LoopMacro"));
      case -1026581822:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.MapSrcNodeMacro"));
      case 1578490278:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.MapSrcListMacro"));
      case 1688157754:
        return new DataHolderConstraintsDescriptor(new CreateRootRule_Constraints());
      case 1951843638:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.CreateRootRule_Condition"));
      case 1708728181:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.BaseMappingRule_Condition"));
      case 788616901:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_sourceNode"));
      case 16943929:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.BaseMappingRule"));
      case 1001561066:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.Weaving_MappingRule"));
      case 809657054:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.Reduction_MappingRule"));
      case 145224461:
        return new DataHolderConstraintsDescriptor(new Root_MappingRule_Constraints());
      case 1503866734:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.PropertyMacro_GetPropertyValue"));
      case 1260041018:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_templatePropertyValue"));
      case 2081911779:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.ReferenceMacro_GetReferent"));
      case 2051280653:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_templateReferent"));
      case -1285446837:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.IfMacro_Condition"));
      case 1225539479:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.SourceSubstituteMacro"));
      case 1828840154:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.SourceSubstituteMacro_SourceNodesQuery"));
      case -802631357:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.SourceSubstituteMacro_SourceNodeQuery"));
      case -1963258745:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.RuleConsequence"));
      case -740236117:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.TemplateDeclarationReference"));
      case 717173599:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.DismissTopMappingRule"));
      case 136762859:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.RootTemplateAnnotation"));
      case 1460916875:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.WeaveEach_RuleConsequence"));
      case -1301128236:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.GeneratorMessage"));
      case -2142679212:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.MapSrcMacro_MapperFunction"));
      case 450186907:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.InlineTemplate_RuleConsequence"));
      case 187173804:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.TemplateFragment_ContextNodeQuery"));
      case 846503888:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_mainContextNode"));
      case -2032736564:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.Weaving_MappingRule_ContextNodeQuery"));
      case 626205867:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_outputNode"));
      case -193915147:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_parentOutputNode"));
      case 251441700:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.IncludeMacro"));
      case 117647253:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.InlineSwitch_RuleConsequence"));
      case -205156606:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.InlineSwitch_Case"));
      case 388371737:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.MappingScript"));
      case 110048986:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.MappingScript_CodeBlock"));
      case -1252329934:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.MappingScriptReference"));
      case -903726924:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.MappingLabelDeclaration"));
      case 897581757:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.AbandonInput_RuleConsequence"));
      case 170085951:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.TemplateQueryBase"));
      case 635777325:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.DropRootRule"));
      case -1452546967:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.DropRootRule_Condition"));
      case -1817930092:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.MapSrcMacro_PostMapperFunction"));
      case -738651478:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.AbstractMacro"));
      case -1153292341:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.TemplateParameterDeclaration"));
      case -1484299922:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.PatternReduction_MappingRule"));
      case -277709087:
        return new DataHolderConstraintsDescriptor(new ITemplateCall_Constraints());
      case -4058871:
        return new DataHolderConstraintsDescriptor(new TemplateArgumentQueryExpression_Constraints());
      case -2017778799:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.TemplateArgumentQuery"));
      case 234268125:
        return new DataHolderConstraintsDescriptor(new TemplateArgumentPatternVarRefExpression_Constraints());
      case 956292591:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.ReductionRule"));
      case -1595525702:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.TemplateArgumentPatternRef"));
      case 1715606119:
        return new DataHolderConstraintsDescriptor(new TemplateArgumentPropertyPatternRefExpression_Constraints());
      case 1355318156:
        return new DataHolderConstraintsDescriptor(new TemplateArgumentLinkPatternRefExpression_Constraints());
      case 914250388:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.TemplateCallMacro"));
      case 1296111614:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.InlineTemplateWithContext_RuleConsequence"));
      case 2058499135:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.IGeneratorParameter"));
      case 1111017602:
        return new DataHolderConstraintsDescriptor(new GeneratorDescriptor_Constraints());
      case 54979509:
        return new DataHolderConstraintsDescriptor(new GeneratorParameterReference_Constraints());
      case 444291626:
        return new DataHolderConstraintsDescriptor(new TemplateArgumentParameterExpression_Constraints());
      case 1859510884:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.MappingConfiguration_Condition"));
      case -1536745640:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.LabelMacro"));
      case -387170701:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.InsertMacro"));
      case 777899102:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.InsertMacro_CreateNodeQuery"));
      case -2078831158:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.generator.structure.WeaveMacro"));
      default:
        return null;
    }
  }
}

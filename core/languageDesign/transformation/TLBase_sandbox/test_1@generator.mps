<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:00000000-0000-4000-0000-011c89590609(test_1@generator)">
  <persistence version="3" />
  <refactoringHistory />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="b401a680-8325-4110-8fd3-84331ff25bef(jetbrains.mps.transformation.TLBase)" />
  <language namespace="c72da2b9-7cce-4447-8389-f407dc1158b7(jetbrains.mps.lang.structure)" />
  <language namespace="ceab5195-25ea-4f22-9b92-103b95ca8c0c(jetbrains.mps.lang.core)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <language namespace="d7706f63-9be2-479c-a3da-ae92af1e64d5(jetbrains.mps.transformation.generationContext)" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902e2(jetbrains.mps.transformation.TLBase.constraints)" version="16" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902e8(jetbrains.mps.transformation.TLBase.structure)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959028c(jetbrains.mps.lang.structure.constraints)" version="11" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590283(jetbrains.mps.lang.core.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902fb(jetbrains.mps.lang.smodel.constraints)" version="21" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.ext.collections.lang.structure)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959030d(jetbrains.mps.lang.constraints.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.closures.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ba(jetbrains.mps.lang.sharedConcepts.constraints)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590334(jetbrains.mps.closures.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902db(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902bc(jetbrains.mps.lang.sharedConcepts.structure)" version="0" />
  <maxImportIndex value="3" />
  <import index="1" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="0" />
  <import index="2" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" />
  <import index="3" modelUID="f:java_stub#jetbrains.mps.generator.template(jetbrains.mps.generator.template@java_stub)" version="-1" />
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1200521311211">
    <property name="name" value="Test_rootTemplate" />
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1200697038141">
      <property name="name" value="aaa" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1200697038142" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1200697038143" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200697038144">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205873223569">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205873223570">
            <property name="name" value="i" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1205873223571">
              <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.SwitchMacro" id="1205883065954" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205873249347">
              <property name="value" value="10" />
              <node role="propertyMacro$property_attribute$value" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro" id="1205873297210">
                <node role="propertyValueFunction" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro_GetPropertyValue" id="1205873297211">
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205873297212" />
                </node>
              </node>
              <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.IfMacro" id="1205944989981">
                <node role="conditionFunction" type="jetbrains.mps.transformation.TLBase.structure.IfMacro_Condition" id="1205944989982">
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205944989983" />
                </node>
              </node>
              <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.SwitchMacro" id="1205873707483" />
            </node>
            <node role="propertyMacro$property_attribute$name" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro" id="1205883057669">
              <node role="propertyValueFunction" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro_GetPropertyValue" id="1205883057670">
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205883057671" />
              </node>
            </node>
            <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.IfMacro" id="1205883120226">
              <node role="conditionFunction" type="jetbrains.mps.transformation.TLBase.structure.IfMacro_Condition" id="1205883120227">
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205883120228" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205883076699">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205883077826">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1205883076700">
              <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.SwitchMacro" id="1205883088114" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205883079687">
              <link role="baseMethodDeclaration" targetNodeId="1200697038141" resolveInfo="aaa" />
              <node role="referenceMacro$link_attribute$baseMethodDeclaration" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro" id="1205883082516">
                <node role="referentFunction" type="jetbrains.mps.transformation.TLBase.structure.ReferenceMacro_GetReferent" id="1205883082517">
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205883082518" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="propertyMacro$property_attribute$name" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro" id="1205943119450">
        <node role="propertyValueFunction" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro_GetPropertyValue" id="1205943119451">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205943119452" />
        </node>
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1200521311212" />
    <node role="rootTemplateAnnotation$attribute" type="jetbrains.mps.transformation.TLBase.structure.RootTemplateAnnotation" id="1205883743384" />
  </node>
  <node type="jetbrains.mps.transformation.TLBase.structure.TemplateDeclaration" id="1205790024450">
    <property name="name" value="test_template" />
    <node role="contentNode" type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1205790573693">
      <property name="name" value="aaa" />
      <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1205859165985">
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1205859165986" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1205859165987" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205859165988">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205877746862">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205877746863">
              <property name="name" value="aaa" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1205877746864" />
            </node>
          </node>
        </node>
      </node>
      <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1205790729523">
        <property name="name" value="aaa" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1205790729524" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1205790729525" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205790729526">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205790742513">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205790742514">
              <property name="name" value="i" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1205790742515" />
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205790746658">
                <property name="value" value="10" />
                <node role="propertyMacro$property_attribute$value" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro" id="1205877672538">
                  <node role="propertyValueFunction" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro_GetPropertyValue" id="1205877672539">
                    <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205877672540" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205865802868">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205865802869">
              <property name="name" value="l" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1205865802870" />
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205865806669">
                <property name="value" value="100" />
                <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.SwitchMacro" id="1205877727028">
                  <link role="mappingLabel" targetNodeId="1207694002149" resolveInfo="aaa" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="templateFragment$attribute" type="jetbrains.mps.transformation.TLBase.structure.TemplateFragment" id="1205871351341" />
      </node>
      <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1205859331168">
        <property name="name" value="bbb" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1205859331169" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1205859331170" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205859331171">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205869891191">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205869891192">
              <property name="name" value="i" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1205869891193" />
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205869901301">
                <property name="value" value="0" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205879491246">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205879491247">
              <property name="name" value="c" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205879491248">
                <link role="classifier" targetNodeId="3.~BaseMappingRuleContext" resolveInfo="BaseMappingRuleContext" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205879496860">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205879497924">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205879496861">
                <link role="variableDeclaration" targetNodeId="1205879491247" resolveInfo="c" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205879500270">
                <link role="baseMethodDeclaration" targetNodeId="2.~Object.clone():java.lang.Object" resolveInfo="clone" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1205790573694" />
    </node>
  </node>
  <node type="jetbrains.mps.transformation.TLBase.structure.MappingConfiguration" id="1205943037834">
    <property name="name" value="test_MappingConfig" />
    <node role="createRootRule" type="jetbrains.mps.transformation.TLBase.structure.CreateRootRule" id="1207695260344">
      <link role="templateNode" targetNodeId="1200521311211" resolveInfo="Test_rootTemplate" />
      <link role="label" targetNodeId="1207694400016" resolveInfo="bbb" />
    </node>
    <node role="createRootRule" type="jetbrains.mps.transformation.TLBase.structure.CreateRootRule" id="1216337408929" />
    <node role="weavingMappingRule" type="jetbrains.mps.transformation.TLBase.structure.Weaving_MappingRule" id="1207695225743">
      <link role="applicableConcept" targetNodeId="1.1080120340718" resolveInfo="AndExpression" />
      <node role="ruleConsequence" type="jetbrains.mps.transformation.TLBase.structure.WeaveEach_RuleConsequence" id="1217890246503">
        <node role="sourceNodesQuery" type="jetbrains.mps.transformation.TLBase.structure.SourceSubstituteMacro_SourceNodesQuery" id="1217890246504">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1217890246505">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1217890252678">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217890253633">
                <node role="operand" type="jetbrains.mps.transformation.generationContext.structure.TemplateFunctionParameter_generationContext" id="1217890252679" />
                <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_CreateUniqueName" id="1218574644070">
                  <node role="baseName" type="jetbrains.mps.baseLanguage.structure.Expression" id="1218574644071" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="contextNodeQuery" type="jetbrains.mps.transformation.TLBase.structure.Weaving_MappingRule_ContextNodeQuery" id="1207695225745">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207695225746">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207695237606">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216849634927">
              <node role="operand" type="jetbrains.mps.transformation.generationContext.structure.TemplateFunctionParameter_generationContext" id="1216863958698" />
              <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetOutputByLabel" id="1216863958617">
                <link role="label" targetNodeId="1207695310518" resolveInfo="ccc" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1216405764130">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216849634861">
              <node role="operand" type="jetbrains.mps.transformation.generationContext.structure.TemplateFunctionParameter_generationContext" id="1216863958732" />
              <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetOutputByLabel" id="1216863958650">
                <link role="label" targetNodeId="1207695310518" resolveInfo="ccc" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1216754209878">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216757666719">
              <node role="operand" type="jetbrains.mps.transformation.generationContext.structure.TemplateFunctionParameter_generationContext" id="1216863958715" />
              <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetOutputByLabel" id="1216863958634">
                <link role="label" targetNodeId="1207695310518" resolveInfo="ccc" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1216753715946" />
        </node>
      </node>
    </node>
    <node role="mappingLabel" type="jetbrains.mps.transformation.TLBase.structure.MappingLabelDeclaration" id="1207694002149">
      <property name="name" value="aaa" />
    </node>
    <node role="mappingLabel" type="jetbrains.mps.transformation.TLBase.structure.MappingLabelDeclaration" id="1207694400016">
      <property name="name" value="bbb" />
    </node>
    <node role="mappingLabel" type="jetbrains.mps.transformation.TLBase.structure.MappingLabelDeclaration" id="1207695310518">
      <property name="name" value="ccc" />
      <link role="targetConcept" targetNodeId="1.1080120340718" resolveInfo="AndExpression" />
    </node>
    <node role="reductionMappingRule" type="jetbrains.mps.transformation.TLBase.structure.Reduction_MappingRule" id="1205943042570">
      <link role="applicableConcept" targetNodeId="1.1145552809883" resolveInfo="AbstractCreator" />
      <node role="ruleConsequence" type="jetbrains.mps.transformation.TLBase.structure.InlineTemplate_RuleConsequence" id="1205943050596">
        <node role="templateNode" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1205943065254">
          <property name="name" value="aaa" />
          <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1205943065255" />
          <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1205943065256" />
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205943065257">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1216149698939">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1216149698940">
                <property name="name" value="i" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1216149698941" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1216149700521">
                  <property name="value" value="23" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1216149702179">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1216149702180">
                <property name="name" value="i" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1216149702181" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1216149702182">
                  <property name="value" value="23" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1216149702604">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1216149702605">
                <property name="name" value="i" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1216149702606" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1216149702607">
                  <property name="value" value="23" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1216149702827">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1216149702828">
                <property name="name" value="i" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1216149702829" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1216149702830">
                  <property name="value" value="23" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1216149703034">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1216149703035">
                <property name="name" value="i" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1216149703036" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1216149703037">
                  <property name="value" value="23" />
                </node>
              </node>
            </node>
          </node>
          <node role="propertyMacro$property_attribute$name" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro" id="1205943069367">
            <node role="propertyValueFunction" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro_GetPropertyValue" id="1205943069368">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205943069369" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="reductionMappingRule" type="jetbrains.mps.transformation.TLBase.structure.Reduction_MappingRule" id="1216145521322">
      <link role="applicableConcept" targetNodeId="1.1145552809883" resolveInfo="AbstractCreator" />
      <node role="ruleConsequence" type="jetbrains.mps.transformation.TLBase.structure.InlineTemplate_RuleConsequence" id="1216145531606">
        <node role="templateNode" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1216145546951">
          <property name="name" value="name" />
          <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1216145546952" />
          <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1216145546953" />
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216145546954" />
        </node>
      </node>
    </node>
    <node role="reductionMappingRule" type="jetbrains.mps.transformation.TLBase.structure.Reduction_MappingRule" id="1216147939815">
      <link role="applicableConcept" targetNodeId="1.1145552809883" resolveInfo="AbstractCreator" />
      <node role="ruleConsequence" type="jetbrains.mps.transformation.TLBase.structure.InlineSwitch_RuleConsequence" id="1216147947739">
        <node role="defaultConsequence" type="jetbrains.mps.transformation.TLBase.structure.RuleConsequence" id="1216147947740" />
        <node role="case" type="jetbrains.mps.transformation.TLBase.structure.InlineSwitch_Case" id="1216147949803">
          <node role="conditionFunction" type="jetbrains.mps.transformation.TLBase.structure.BaseMappingRule_Condition" id="1216147949804">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216147949805">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1216147957604">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1216147996300">
                  <property name="value" value="true" />
                </node>
              </node>
            </node>
          </node>
          <node role="caseConsequence" type="jetbrains.mps.transformation.TLBase.structure.InlineTemplate_RuleConsequence" id="1216147965934">
            <node role="templateNode" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1216147977358">
              <property name="name" value="aaa" />
              <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1216147977359" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1216147981424" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="rootMappingRule" type="jetbrains.mps.transformation.TLBase.structure.Root_MappingRule" id="1216320479146">
      <link role="applicableConcept" targetNodeId="1.1145552809883" resolveInfo="AbstractCreator" />
      <link role="template" targetNodeId="1216405459907" resolveInfo="map_AbstractCreator" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1211366813561">
    <property name="name" value="ABC" />
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1211368737954">
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1211368776911">
        <property name="name" value="j" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1211368777725" />
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1211368744183">
        <link role="classifier" targetNodeId="1211366813561" resolveInfo="ABC" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1211368737956" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1211368737957">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1211368765293">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1211368765294">
            <property name="name" value="i" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1211368765295" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1211368774283">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1211368780570">
                <link role="variableDeclaration" targetNodeId="1211368776911" resolveInfo="j" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1211368766688">
                <property name="value" value="abc" />
                <node role="propertyMacro$property_attribute$value" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro" id="1216145632741">
                  <node role="propertyValueFunction" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro_GetPropertyValue" id="1216145632742">
                    <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216145632743">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1216146039456">
                        <node role="expression" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1216146039457" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1216150466731">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1216150466732">
            <property name="name" value="i" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1216150466733" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1216150466734">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1216150466735">
                <link role="variableDeclaration" targetNodeId="1211368776911" resolveInfo="j" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1216150466736">
                <property name="value" value="abc" />
                <node role="propertyMacro$property_attribute$value" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro" id="1216150466737">
                  <node role="propertyValueFunction" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro_GetPropertyValue" id="1216150466738">
                    <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216150466739">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1216150529003">
                        <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1216150529004">
                          <property name="name" value="i" />
                          <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1216150529005" />
                          <node role="initializer" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1216150529006">
                            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1216150529007">
                              <link role="variableDeclaration" targetNodeId="1211368776911" resolveInfo="j" />
                            </node>
                            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1216150529008">
                              <property name="value" value="abc" />
                              <node role="propertyMacro$property_attribute$value" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro" id="1216150529009">
                                <node role="propertyValueFunction" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro_GetPropertyValue" id="1216150529010">
                                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216150529011">
                                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1216150529012">
                                      <node role="expression" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1216150529013" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1216150466740">
                        <node role="expression" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1216150466741" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1216150474692">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1216150474693">
            <property name="name" value="ij" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1216150474694" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1216150636515">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1216150636516">
            <link role="variableDeclaration" targetNodeId="1216150474693" resolveInfo="ij" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1216150475820">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1216150475821">
            <property name="name" value="i" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1216150475822" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1216150475823">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1216150475824">
                <link role="variableDeclaration" targetNodeId="1211368776911" resolveInfo="j" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1216150475825">
                <property name="value" value="abc" />
                <node role="propertyMacro$property_attribute$value" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro" id="1216150475826">
                  <node role="propertyValueFunction" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro_GetPropertyValue" id="1216150475827">
                    <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216150475828">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1216150475829">
                        <node role="expression" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1216150475830" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1211368737872">
      <property name="name" value="aaa" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1211368737873" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1211368737874" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1211368737875">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1216147146312">
          <property name="value" value="lingengen" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1216147151673">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216147151674">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1216147156631" />
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1216147153927">
            <property name="value" value="true" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1216147159524">
          <property name="value" value="-----" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1218574550027">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1218574552607">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1218574550028" />
          </node>
        </node>
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1211366813562" />
    <node role="rootTemplateAnnotation$attribute" type="jetbrains.mps.transformation.TLBase.structure.RootTemplateAnnotation" id="1211366813579" />
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1216147812749">
    <property name="name" value="NotATemplate" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1216147812750" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1216147812751">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1216147812752" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1216147812753" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216147812754">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1216147851225">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1216147851226">
            <property name="name" value="i" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1216147851227" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1216147865308">
              <property name="value" value="0" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.transformation.TLBase.structure.TemplateDeclaration" id="1216321215741">
    <property name="name" value="reduce_AbstractCreator" />
    <link role="applicableConcept" targetNodeId="1.1145552809883" resolveInfo="AbstractCreator" />
    <node role="contentNode" type="jetbrains.mps.lang.core.structure.BaseConcept" id="1216321215742" />
  </node>
  <node type="jetbrains.mps.transformation.TLBase.structure.TemplateSwitch" id="1216323660196">
    <property name="name" value="switch_aaa" />
    <node role="defaultConsequence" type="jetbrains.mps.transformation.TLBase.structure.TemplateDeclarationReference" id="1216371087637">
      <link role="template" targetNodeId="1216371087635" resolveInfo="default_switch_aaa" />
    </node>
  </node>
  <node type="jetbrains.mps.transformation.TLBase.structure.TemplateDeclaration" id="1216371087635">
    <property name="name" value="default_switch_aaa" />
    <node role="contentNode" type="jetbrains.mps.lang.core.structure.BaseConcept" id="1216371087636" />
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1216405459907">
    <property name="name" value="map_AbstractCreator" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1216405459908" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1216405459909">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1216405459910" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1216405459911" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216405459912" />
    </node>
    <node role="rootTemplateAnnotation$attribute" type="jetbrains.mps.transformation.TLBase.structure.RootTemplateAnnotation" id="1216405459913">
      <link role="applicableConcept" targetNodeId="1.1145552809883" resolveInfo="AbstractCreator" />
    </node>
  </node>
</model>


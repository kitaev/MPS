<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:d91dc8be-68f3-42d9-b558-87a2756c080a(jetbrains.mps.runConfigurations.generator.template.main@generator)">
  <persistence version="7" />
  <language namespace="b401a680-8325-4110-8fd3-84331ff25bef(jetbrains.mps.lang.generator)" />
  <language namespace="d7706f63-9be2-479c-a3da-ae92af1e64d5(jetbrains.mps.lang.generator.generationContext)" />
  <language namespace="7a5dda62-9140-4668-ab76-d5ed1746f2b2(jetbrains.mps.lang.typesystem)" />
  <language namespace="28f9e497-3b42-4291-aeba-0a1039153ab1(jetbrains.mps.lang.plugin)" />
  <language namespace="ceab5195-25ea-4f22-9b92-103b95ca8c0c(jetbrains.mps.lang.core)" />
  <language namespace="df345b11-b8c7-4213-ac66-48d2a9b75d88(jetbrains.mps.baseLanguageInternal)" />
  <language namespace="22e72e4c-0f69-46ce-8403-6750153aa615(jetbrains.mps.runConfigurations)" />
  <language namespace="13744753-c81f-424a-9c1b-cf8943bf4e86(jetbrains.mps.lang.sharedConcepts)" />
  <language namespace="d4615e3b-d671-4ba9-af01-2b78369b0ba7(jetbrains.mps.lang.pattern)" />
  <language namespace="443f4c36-fcf5-4eb6-9500-8d06ed259e3e(jetbrains.mps.baseLanguage.classifiers)" />
  <devkit namespace="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  <import index="uhxm" modelUID="r:f3383ae6-205a-4e7c-8dd9-c29966e29e49(jetbrains.mps.runConfigurations.structure)" version="-1" />
  <import index="ojho" modelUID="r:36b91d42-5119-45a8-b801-6a4d645ce20b(jetbrains.mps.runConfigurations.behavior)" version="-1" />
  <import index="mvo7" modelUID="r:37b431b5-5df4-4ede-90b5-64de64810162(jetbrains.mps.runConfigurations.runtime)" version="-1" />
  <import index="tpee" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <import index="tpcu" modelUID="r:00000000-0000-4000-0000-011c89590282(jetbrains.mps.lang.core.behavior)" version="-1" />
  <import index="tp48" modelUID="r:00000000-0000-4000-0000-011c89590374(jetbrains.mps.baseLanguage.classifiers.generator.baseLanguage.template.main@generator)" version="-1" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <import index="e2lb" modelUID="f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(java.lang@java_stub)" version="-1" />
  <import index="vfxe" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#com.intellij.execution.configurations(com.intellij.execution.configurations@java_stub)" version="-1" />
  <import index="xuot" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#org.jdom(org.jdom@java_stub)" version="-1" />
  <import index="8a0f" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#com.intellij.openapi.util(com.intellij.openapi.util@java_stub)" version="-1" />
  <import index="klpk" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#com.intellij.util.xmlb(com.intellij.util.xmlb@java_stub)" version="-1" />
  <import index="k7g3" modelUID="f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.util(java.util@java_stub)" version="-1" />
  <import index="r27b" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#org.jetbrains.annotations(org.jetbrains.annotations@java_stub)" version="-1" />
  <import index="8bce" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.logging(jetbrains.mps.logging@java_stub)" version="-1" />
  <import index="bswf" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#com.intellij.util.containers(com.intellij.util.containers@java_stub)" version="-1" />
  <import index="g1dt" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#com.intellij.openapi.extensions(com.intellij.openapi.extensions@java_stub)" version="-1" />
  <import index="dbrf" modelUID="f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#javax.swing(javax.swing@java_stub)" version="-1" />
  <import index="juez" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#com.intellij.execution.executors(com.intellij.execution.executors@java_stub)" version="-1" />
  <import index="7jsa" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#com.intellij.execution.process(com.intellij.execution.process@java_stub)" version="-1" />
  <import index="l649" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#com.intellij.execution.ui(com.intellij.execution.ui@java_stub)" version="-1" />
  <import index="1hm1" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#com.intellij.execution(com.intellij.execution@java_stub)" version="-1" />
  <import index="4zw2" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#com.intellij.openapi.actionSystem(com.intellij.openapi.actionSystem@java_stub)" version="-1" />
  <import index="s7ni" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#com.intellij.execution.runners(com.intellij.execution.runners@java_stub)" version="-1" />
  <import index="27v0" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#com.intellij.openapi.project(com.intellij.openapi.project@java_stub)" version="-1" />
  <import index="u5xh" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#com.intellij.execution.impl(com.intellij.execution.impl@java_stub)" version="-1" />
  <import index="x4jy" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.debug.api(jetbrains.mps.debug.api@java_stub)" version="-1" />
  <import index="mmln" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.debug.api.run(jetbrains.mps.debug.api.run@java_stub)" version="-1" />
  <import index="fahd" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#com.intellij.openapi.options(com.intellij.openapi.options@java_stub)" version="-1" />
  <import index="30pf" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.util(jetbrains.mps.util@java_stub)" version="-1" />
  <import index="205" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.ide.icons(jetbrains.mps.ide.icons@java_stub)" version="-1" />
  <import index="ws6q" modelUID="f:java_stub#1d6e05d7-9de9-40a7-9dad-7b8444280942#jetbrains.mps.plugins(jetbrains.mps.plugins@java_stub)" version="-1" />
  <import index="afxk" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.project(jetbrains.mps.project@java_stub)" version="-1" />
  <import index="98m" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.generator.template(jetbrains.mps.generator.template@java_stub)" version="-1" />
  <import index="h5ia" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.generator(jetbrains.mps.generator@java_stub)" version="-1" />
  <import index="lkfb" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)" version="-1" />
  <import index="fxg7" modelUID="f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.io(java.io@java_stub)" version="-1" />
  <import index="a8em" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.workbench(jetbrains.mps.workbench@java_stub)" version="-1" />
  <import index="tp4f" modelUID="r:00000000-0000-4000-0000-011c89590373(jetbrains.mps.baseLanguage.classifiers.structure)" version="0" />
  <import index="tpek" modelUID="r:00000000-0000-4000-0000-011c895902c0(jetbrains.mps.baseLanguage.behavior)" version="-1" />
  <import index="mdoc" modelUID="r:7757a4ec-c551-4194-a1b0-7ea4e576ea60(jetbrains.mps.run.commands.behavior)" version="-1" />
  <import index="rzqf" modelUID="r:d78df0bb-be4f-4e0d-8142-c0b2df70a5a3(jetbrains.mps.run.commands.structure)" version="-1" />
  <import index="fb9u" modelUID="r:0194e190-08ef-44f6-ab95-d9cffdb7e27b(jetbrains.mps.run.settings.structure)" version="-1" />
  <import index="hilv" modelUID="r:afd0247c-5ce3-4424-8951-51083e421123(jetbrains.mps.run.settings.behavior)" version="-1" />
  <import index="id7i" modelUID="r:29a26f36-0627-4505-9c3e-faf17694979c(jetbrains.mps.run.common.structure)" version="-1" />
  <import index="kv8t" modelUID="r:03a139dc-3ebb-4127-956e-d3aaa9b6277c(jetbrains.mps.run.settings.generator.template.main@generator)" version="-1" />
  <import index="tpf8" modelUID="r:00000000-0000-4000-0000-011c895902e8(jetbrains.mps.lang.generator.structure)" version="2" implicit="yes" />
  <import index="tp25" modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" implicit="yes" />
  <import index="8d73" modelUID="r:d91dc8be-68f3-42d9-b558-87a2756c080a(jetbrains.mps.runConfigurations.generator.template.main@generator)" version="-1" implicit="yes" />
  <import index="tpf3" modelUID="r:00000000-0000-4000-0000-011c895902f3(jetbrains.mps.lang.generator.generationContext.structure)" version="0" implicit="yes" />
  <import index="tp2q" modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" implicit="yes" />
  <import index="tp2c" modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" implicit="yes" />
  <import index="tp4k" modelUID="r:00000000-0000-4000-0000-011c89590368(jetbrains.mps.lang.plugin.structure)" version="23" implicit="yes" />
  <import index="tp68" modelUID="r:00000000-0000-4000-0000-011c895903ac(jetbrains.mps.baseLanguageInternal.structure)" version="1" implicit="yes" />
  <import index="i1mc" modelUID="r:59b8a6cf-a3a9-4109-98b7-d13bb426ef49(jetbrains.mps.run.common.behavior)" version="-1" implicit="yes" />
  <import index="tpd4" modelUID="r:00000000-0000-4000-0000-011c895902b4(jetbrains.mps.lang.typesystem.structure)" version="3" implicit="yes" />
  <roots>
    <node type="tpf8.MappingConfiguration" typeId="tpf8.1095416546421" id="3754890006475631526">
      <property name="name" nameId="tpck.1169194664001" value="main" />
    </node>
    <node type="tpee.ClassConcept" typeId="tpee.1068390468198" id="3754890006475632887">
      <property name="name" nameId="tpck.1169194664001" value="RunConfigurationKind_Template" />
    </node>
    <node type="tpee.ClassConcept" typeId="tpee.1068390468198" id="3754890006475702959">
      <property name="name" nameId="tpck.1169194664001" value="ExecutorRunProfileState_Template" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="execution.complex" />
    </node>
    <node type="tpee.ClassConcept" typeId="tpee.1068390468198" id="7460665385311861254">
      <property name="name" nameId="tpck.1169194664001" value="RunConfigurationFactory_Template" />
    </node>
    <node type="tpf8.TemplateDeclaration" typeId="tpf8.1092059087312" id="666608846720191836">
      <property name="name" nameId="tpck.1169194664001" value="weave_RunConfigurationConstructor" />
      <link role="applicableConcept" roleId="tpf8.1168285871518" targetNodeId="uhxm.2401501559171345993" resolveInfo="RunConfiguration" />
    </node>
    <node type="tpf8.TemplateDeclaration" typeId="tpf8.1092059087312" id="666608846720191922">
      <property name="name" nameId="tpck.1169194664001" value="weave_RunConfigurationMethods" />
      <link role="applicableConcept" roleId="tpf8.1168285871518" targetNodeId="uhxm.2401501559171345993" resolveInfo="RunConfiguration" />
    </node>
    <node type="tpf8.TemplateDeclaration" typeId="tpf8.1092059087312" id="666608846720246036">
      <property name="name" nameId="tpck.1169194664001" value="weave_RunConfigurationExtendsRunConfigurationBase" />
      <link role="applicableConcept" roleId="tpf8.1168285871518" targetNodeId="uhxm.2401501559171345993" resolveInfo="RunConfiguration" />
    </node>
    <node type="tpf8.TemplateDeclaration" typeId="tpf8.1092059087312" id="143080135592811024">
      <property name="name" nameId="tpck.1169194664001" value="weave_RunConfigurationFields" />
      <link role="applicableConcept" roleId="tpf8.1168285871518" targetNodeId="uhxm.2401501559171345993" resolveInfo="RunConfiguration" />
    </node>
    <node type="tpf8.TemplateDeclaration" typeId="tpf8.1092059087312" id="7684700299064368218">
      <property name="name" nameId="tpck.1169194664001" value="weave_RunConfigurationEditorConstructor" />
      <link role="applicableConcept" roleId="tpf8.1168285871518" targetNodeId="uhxm.2401501559171345993" resolveInfo="RunConfiguration" />
    </node>
    <node type="tpf8.TemplateDeclaration" typeId="tpf8.1092059087312" id="5812151570929690835">
      <property name="name" nameId="tpck.1169194664001" value="reduce_ConfigurationParameterInsideExecute" />
      <link role="applicableConcept" roleId="tpf8.1168285871518" targetNodeId="fb9u.946964771156067216" resolveInfo="Configuration_Parameter" />
    </node>
    <node type="tpf8.TemplateDeclaration" typeId="tpf8.1092059087312" id="7806358006983771916">
      <property name="name" nameId="tpck.1169194664001" value="reduce_ConfigurationFromExecutorReference" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="execution.complex" />
      <link role="applicableConcept" roleId="tpf8.1168285871518" targetNodeId="uhxm.7806358006983738927" resolveInfo="ConfigurationFromExecutorReference" />
    </node>
    <node type="tpf8.TemplateDeclaration" typeId="tpf8.1092059087312" id="8018778075741045465">
      <property name="name" nameId="tpck.1169194664001" value="reduce_DebuggerSettings_Parameter" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="execution.complex.settings" />
      <link role="applicableConcept" roleId="tpf8.1168285871518" targetNodeId="uhxm.4816403309550879744" resolveInfo="DebuggerSettings_Parameter" />
    </node>
    <node type="tpf8.TemplateDeclaration" typeId="tpf8.1092059087312" id="4762811064051417753">
      <property name="name" nameId="tpck.1169194664001" value="reduce_StartProcessHandlerStatement" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="execution.command" />
      <link role="applicableConcept" roleId="tpf8.1168285871518" targetNodeId="uhxm.946964771156870353" resolveInfo="StartProcessHandlerStatement" />
    </node>
    <node type="tp4k.ApplicationPluginDeclaration" typeId="tp4k.1215279937187" id="693139443247210143">
      <property name="name" nameId="tpck.1169194664001" value="RunConfigurationsInitializer" />
    </node>
    <node type="tpf8.TemplateDeclaration" typeId="tpf8.1092059087312" id="1529002684853883835">
      <property name="name" nameId="tpck.1169194664001" value="reduce_Configuration_Parameter" />
      <link role="applicableConcept" roleId="tpf8.1168285871518" targetNodeId="fb9u.946964771156067216" resolveInfo="Configuration_Parameter" />
    </node>
    <node type="tpf8.TemplateDeclaration" typeId="tpf8.1092059087312" id="4806795137173735553">
      <property name="name" nameId="tpck.1169194664001" value="reduce_IconPath" />
      <link role="applicableConcept" roleId="tpf8.1168285871518" targetNodeId="uhxm.4806795137173575894" resolveInfo="IconPath" />
    </node>
  </roots>
  <root id="3754890006475631526">
    <node role="weavingMappingRule" roleId="tpf8.1167172143858" type="tpf8.Weaving_MappingRule" typeId="tpf8.1167171569011" id="666608846720189929">
      <link role="applicableConcept" roleId="tpf8.1167169349424" targetNodeId="uhxm.2401501559171345993" resolveInfo="RunConfiguration" />
      <node role="contextNodeQuery" roleId="tpf8.1184616230853" type="tpf8.Weaving_MappingRule_ContextNodeQuery" typeId="tpf8.1184616041890" id="666608846720189931">
        <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="666608846720189932">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="666608846720191839">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="666608846720191841">
              <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="666608846720191840" />
              <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="666608846720191845">
                <link role="label" roleId="tpf3.1216860049628" targetNodeId="kv8t.5041115067675922953" resolveInfo="ConfigurationToClass" />
                <node role="inputNode" roleId="tpf3.1216860049632" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="666608846720191847" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="ruleConsequence" roleId="tpf8.1169570368028" type="tpf8.TemplateDeclarationReference" typeId="tpf8.1168559333462" id="666608846720191838">
        <link role="template" roleId="tpf8.1722980698497626483" targetNodeId="666608846720191836" resolveInfo="weave_RunConfiguration" />
      </node>
    </node>
    <node role="weavingMappingRule" roleId="tpf8.1167172143858" type="tpf8.Weaving_MappingRule" typeId="tpf8.1167171569011" id="666608846720191913">
      <link role="applicableConcept" roleId="tpf8.1167169349424" targetNodeId="uhxm.2401501559171345993" resolveInfo="RunConfiguration" />
      <node role="contextNodeQuery" roleId="tpf8.1184616230853" type="tpf8.Weaving_MappingRule_ContextNodeQuery" typeId="tpf8.1184616041890" id="666608846720191914">
        <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="666608846720191915">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="666608846720191916">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="666608846720191917">
              <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="666608846720191918" />
              <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="666608846720191919">
                <link role="label" roleId="tpf3.1216860049628" targetNodeId="kv8t.5041115067675922953" resolveInfo="ConfigurationToClass" />
                <node role="inputNode" roleId="tpf3.1216860049632" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="666608846720191920" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="ruleConsequence" roleId="tpf8.1169570368028" type="tpf8.TemplateDeclarationReference" typeId="tpf8.1168559333462" id="666608846720191930">
        <link role="template" roleId="tpf8.1722980698497626483" targetNodeId="666608846720191922" resolveInfo="weave_RunConfiguration" />
      </node>
    </node>
    <node role="weavingMappingRule" roleId="tpf8.1167172143858" type="tpf8.Weaving_MappingRule" typeId="tpf8.1167171569011" id="666608846720246032">
      <link role="applicableConcept" roleId="tpf8.1167169349424" targetNodeId="uhxm.2401501559171345993" resolveInfo="RunConfiguration" />
      <node role="contextNodeQuery" roleId="tpf8.1184616230853" type="tpf8.Weaving_MappingRule_ContextNodeQuery" typeId="tpf8.1184616041890" id="666608846720246034">
        <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="666608846720246035">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="666608846720246039">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="666608846720246040">
              <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="666608846720246041" />
              <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="666608846720246042">
                <link role="label" roleId="tpf3.1216860049628" targetNodeId="kv8t.5041115067675922953" resolveInfo="ConfigurationToClass" />
                <node role="inputNode" roleId="tpf3.1216860049632" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="666608846720246043" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="ruleConsequence" roleId="tpf8.1169570368028" type="tpf8.TemplateDeclarationReference" typeId="tpf8.1168559333462" id="666608846720246038">
        <link role="template" roleId="tpf8.1722980698497626483" targetNodeId="666608846720246036" resolveInfo="weave_RunConfiguration" />
      </node>
    </node>
    <node role="weavingMappingRule" roleId="tpf8.1167172143858" type="tpf8.Weaving_MappingRule" typeId="tpf8.1167171569011" id="1754312393816976183">
      <link role="applicableConcept" roleId="tpf8.1167169349424" targetNodeId="uhxm.2401501559171345993" resolveInfo="RunConfiguration" />
      <node role="ruleConsequence" roleId="tpf8.1169570368028" type="tpf8.TemplateDeclarationReference" typeId="tpf8.1168559333462" id="1754312393816976187">
        <link role="template" roleId="tpf8.1722980698497626483" targetNodeId="143080135592811024" resolveInfo="weave_RunConfigurationFields" />
      </node>
      <node role="contextNodeQuery" roleId="tpf8.1184616230853" type="tpf8.Weaving_MappingRule_ContextNodeQuery" typeId="tpf8.1184616041890" id="1754312393816976185">
        <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1754312393816976186">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1754312393816976188">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1754312393816976190">
              <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="1754312393816976189" />
              <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="1754312393816976194">
                <link role="label" roleId="tpf3.1216860049628" targetNodeId="kv8t.5041115067675922953" resolveInfo="ConfigurationToClass" />
                <node role="inputNode" roleId="tpf3.1216860049632" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1754312393816976196" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="weavingMappingRule" roleId="tpf8.1167172143858" type="tpf8.Weaving_MappingRule" typeId="tpf8.1167171569011" id="7684700299064340034">
      <link role="applicableConcept" roleId="tpf8.1167169349424" targetNodeId="uhxm.2401501559171345993" resolveInfo="RunConfiguration" />
      <node role="contextNodeQuery" roleId="tpf8.1184616230853" type="tpf8.Weaving_MappingRule_ContextNodeQuery" typeId="tpf8.1184616041890" id="7684700299064340036">
        <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="7684700299064340037">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7684700299064368208">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7684700299064380399">
              <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="7684700299064380398" />
              <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="7684700299064380403">
                <link role="label" roleId="tpf3.1216860049628" targetNodeId="kv8t.5041115067675922958" resolveInfo="ConfigurationToEditorClass" />
                <node role="inputNode" roleId="tpf3.1216860049632" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="7684700299064380405" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="ruleConsequence" roleId="tpf8.1169570368028" type="tpf8.TemplateDeclarationReference" typeId="tpf8.1168559333462" id="7684700299064368220">
        <link role="template" roleId="tpf8.1722980698497626483" targetNodeId="7684700299064368218" resolveInfo="weave_RunConfiguration" />
      </node>
    </node>
    <node role="createRootRule" roleId="tpf8.1167088157977" type="tpf8.CreateRootRule" typeId="tpf8.1167087469898" id="7525857397534029037">
      <link role="templateNode" roleId="tpf8.1167087469901" targetNodeId="693139443247210143" resolveInfo="RunConfigurationsInitializer" />
      <node role="conditionFunction" roleId="tpf8.1167087469900" type="tpf8.CreateRootRule_Condition" typeId="tpf8.1167087518662" id="7525857397534029038">
        <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="7525857397534029039">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7525857397534029043">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7525857397534029055">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7525857397534029050">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7525857397534029045">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="7525857397534029044" />
                  <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetInputModel" typeId="tpf3.1217004708011" id="7525857397534029049" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tp25.Model_RootsOperation" typeId="tp25.1171315804604" id="7525857397534029054">
                  <link role="concept" roleId="tp25.1171315804605" targetNodeId="uhxm.2401501559171345994" resolveInfo="RunConfigurationType" />
                </node>
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp2q.IsNotEmptyOperation" typeId="tp2q.1176501494711" id="7525857397534029060" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="rootMappingRule" roleId="tpf8.1167514678247" type="tpf8.Root_MappingRule" typeId="tpf8.1167514355419" id="3754890006475702333">
      <link role="applicableConcept" roleId="tpf8.1167169349424" targetNodeId="uhxm.2401501559171345994" resolveInfo="RunConfigurationType" />
      <link role="template" roleId="tpf8.1167514355421" targetNodeId="3754890006475632887" resolveInfo="RunConfigurationTypeTemplate" />
      <link role="labelDeclaration" roleId="tpf8.1200917515464" targetNodeId="3754890006475707294" resolveInfo="RunConfigurationTypeToClass" />
    </node>
    <node role="rootMappingRule" roleId="tpf8.1167514678247" type="tpf8.Root_MappingRule" typeId="tpf8.1167514355419" id="3754890006475702966">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="execution.complex" />
      <link role="template" roleId="tpf8.1167514355421" targetNodeId="3754890006475702959" resolveInfo="ExecutorRunProfileStateTemplate" />
      <link role="labelDeclaration" roleId="tpf8.1200917515464" targetNodeId="3754890006475707296" resolveInfo="ExecutorToClass" />
      <link role="applicableConcept" roleId="tpf8.1167169349424" targetNodeId="uhxm.7806358006983614956" resolveInfo="ComplexRunConfigurationExecutor" />
    </node>
    <node role="rootMappingRule" roleId="tpf8.1167514678247" type="tpf8.Root_MappingRule" typeId="tpf8.1167514355419" id="7460665385311866805">
      <link role="applicableConcept" roleId="tpf8.1167169349424" targetNodeId="uhxm.2401501559171345993" resolveInfo="RunConfiguration" />
      <link role="template" roleId="tpf8.1167514355421" targetNodeId="7460665385311861254" resolveInfo="RunConfigurationFactoryTemplate" />
      <link role="labelDeclaration" roleId="tpf8.1200917515464" targetNodeId="7460665385311866804" resolveInfo="ConfigurationToFactory" />
    </node>
    <node role="mappingLabel" roleId="tpf8.1200911492601" type="tpf8.MappingLabelDeclaration" typeId="tpf8.1200911316486" id="3754890006475707294">
      <property name="name" nameId="tpck.1169194664001" value="KindToClass" />
      <link role="sourceConcept" roleId="tpf8.1200911342686" targetNodeId="uhxm.2401501559171345994" resolveInfo="RunConfigurationType" />
      <link role="targetConcept" roleId="tpf8.1200913004646" targetNodeId="tpee.1068390468198" resolveInfo="ClassConcept" />
    </node>
    <node role="mappingLabel" roleId="tpf8.1200911492601" type="tpf8.MappingLabelDeclaration" typeId="tpf8.1200911316486" id="3754890006475707296">
      <property name="name" nameId="tpck.1169194664001" value="ExecutorToClass" />
      <link role="sourceConcept" roleId="tpf8.1200911342686" targetNodeId="uhxm.2401501559171392633" resolveInfo="RunConfigurationExecutor" />
      <link role="targetConcept" roleId="tpf8.1200913004646" targetNodeId="tpee.1068390468198" resolveInfo="ClassConcept" />
    </node>
    <node role="mappingLabel" roleId="tpf8.1200911492601" type="tpf8.MappingLabelDeclaration" typeId="tpf8.1200911316486" id="7460665385311866804">
      <property name="name" nameId="tpck.1169194664001" value="ConfigurationToFactoryClass" />
      <link role="sourceConcept" roleId="tpf8.1200911342686" targetNodeId="uhxm.2401501559171345993" resolveInfo="RunConfiguration" />
      <link role="targetConcept" roleId="tpf8.1200913004646" targetNodeId="tpee.1068390468198" resolveInfo="ClassConcept" />
    </node>
    <node role="mappingLabel" roleId="tpf8.1200911492601" type="tpf8.MappingLabelDeclaration" typeId="tpf8.1200911316486" id="1754312393816973333">
      <property name="name" nameId="tpck.1169194664001" value="RunConfigurationToIconPathField" />
      <link role="sourceConcept" roleId="tpf8.1200911342686" targetNodeId="uhxm.2401501559171345993" resolveInfo="RunConfiguration" />
      <link role="targetConcept" roleId="tpf8.1200913004646" targetNodeId="tpee.1070462154015" resolveInfo="StaticFieldDeclaration" />
    </node>
    <node role="mappingLabel" roleId="tpf8.1200911492601" type="tpf8.MappingLabelDeclaration" typeId="tpf8.1200911316486" id="5812151570929690873">
      <property name="name" nameId="tpck.1169194664001" value="ExecutorToConfigurationField" />
      <link role="sourceConcept" roleId="tpf8.1200911342686" targetNodeId="uhxm.2401501559171392633" resolveInfo="RunConfigurationExecutor" />
      <link role="targetConcept" roleId="tpf8.1200913004646" targetNodeId="tpee.1068390468200" resolveInfo="FieldDeclaration" />
    </node>
    <node role="reductionMappingRule" roleId="tpf8.1167328349397" type="tpf8.Reduction_MappingRule" typeId="tpf8.1167327847730" id="1529002684853883833">
      <link role="applicableConcept" roleId="tpf8.1167169349424" targetNodeId="fb9u.946964771156067216" resolveInfo="Configuration_Parameter" />
      <node role="ruleConsequence" roleId="tpf8.1169672767469" type="tpf8.TemplateDeclarationReference" typeId="tpf8.1168559333462" id="1529002684853883837">
        <link role="template" roleId="tpf8.1722980698497626483" targetNodeId="1529002684853883835" resolveInfo="reduce_Configuration_Parameter" />
      </node>
      <node role="conditionFunction" roleId="tpf8.1167169362365" type="tpf8.BaseMappingRule_Condition" typeId="tpf8.1167168920554" id="5812151570929690797">
        <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="5812151570929690798">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5812151570929690799">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5812151570929690810">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5812151570929690801">
                <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="5812151570929690800" />
                <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_GetAncestorOperation" typeId="tp25.1171407110247" id="5812151570929690805">
                  <node role="parameter" roleId="tp25.1144104376918" type="tp25.OperationParm_Concept" typeId="tp25.1144101972840" id="5812151570929690806">
                    <node role="conceptArgument" roleId="tp25.1207343664468" type="tp25.RefConcept_Reference" typeId="tp25.1177026924588" id="5812151570929690809">
                      <link role="conceptDeclaration" roleId="tp25.1177026940964" targetNodeId="uhxm.2401501559171345993" resolveInfo="RunConfiguration" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsNotNullOperation" typeId="tp25.1172008320231" id="5812151570929690814" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="reductionMappingRule" roleId="tpf8.1167328349397" type="tpf8.Reduction_MappingRule" typeId="tpf8.1167327847730" id="5812151570929690815">
      <link role="applicableConcept" roleId="tpf8.1167169349424" targetNodeId="fb9u.946964771156067216" resolveInfo="Configuration_Parameter" />
      <node role="conditionFunction" roleId="tpf8.1167169362365" type="tpf8.BaseMappingRule_Condition" typeId="tpf8.1167168920554" id="5812151570929690817">
        <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="5812151570929690818">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5812151570929690819">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5812151570929690830">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5812151570929690821">
                <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="5812151570929690820" />
                <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_GetAncestorOperation" typeId="tp25.1171407110247" id="5812151570929690825">
                  <node role="parameter" roleId="tp25.1144104376918" type="tp25.OperationParm_Concept" typeId="tp25.1144101972840" id="5812151570929690826">
                    <node role="conceptArgument" roleId="tp25.1207343664468" type="tp25.RefConcept_Reference" typeId="tp25.1177026924588" id="5812151570929690829">
                      <link role="conceptDeclaration" roleId="tp25.1177026940964" targetNodeId="uhxm.6139196002333163564" resolveInfo="Execute_Function" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsNotNullOperation" typeId="tp25.1172008320231" id="5812151570929690834" />
            </node>
          </node>
        </node>
      </node>
      <node role="ruleConsequence" roleId="tpf8.1169672767469" type="tpf8.TemplateDeclarationReference" typeId="tpf8.1168559333462" id="5812151570929690837">
        <link role="template" roleId="tpf8.1722980698497626483" targetNodeId="5812151570929690835" resolveInfo="reduce_Configuration_Parameter" />
      </node>
    </node>
    <node role="reductionMappingRule" roleId="tpf8.1167328349397" type="tpf8.Reduction_MappingRule" typeId="tpf8.1167327847730" id="4806795137173735551">
      <link role="applicableConcept" roleId="tpf8.1167169349424" targetNodeId="uhxm.4806795137173575894" resolveInfo="IconPath" />
      <node role="ruleConsequence" roleId="tpf8.1169672767469" type="tpf8.TemplateDeclarationReference" typeId="tpf8.1168559333462" id="4806795137173735555">
        <link role="template" roleId="tpf8.1722980698497626483" targetNodeId="4806795137173735553" resolveInfo="reduce_IconPath" />
      </node>
    </node>
    <node role="reductionMappingRule" roleId="tpf8.1167328349397" type="tpf8.Reduction_MappingRule" typeId="tpf8.1167327847730" id="7806358006983771918">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="execution.complex" />
      <link role="applicableConcept" roleId="tpf8.1167169349424" targetNodeId="uhxm.7806358006983738927" resolveInfo="ConfigurationFromExecutorReference" />
      <node role="ruleConsequence" roleId="tpf8.1169672767469" type="tpf8.TemplateDeclarationReference" typeId="tpf8.1168559333462" id="7806358006983771919">
        <link role="template" roleId="tpf8.1722980698497626483" targetNodeId="7806358006983771916" resolveInfo="reduce_ConfigurationFromExecutorReference" />
      </node>
    </node>
    <node role="reductionMappingRule" roleId="tpf8.1167328349397" type="tpf8.Reduction_MappingRule" typeId="tpf8.1167327847730" id="8018778075741045467">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="execution.complex.settings" />
      <link role="applicableConcept" roleId="tpf8.1167169349424" targetNodeId="uhxm.4816403309550879744" resolveInfo="DebuggerSettings_Parameter" />
      <node role="ruleConsequence" roleId="tpf8.1169672767469" type="tpf8.TemplateDeclarationReference" typeId="tpf8.1168559333462" id="8018778075741045468">
        <link role="template" roleId="tpf8.1722980698497626483" targetNodeId="8018778075741045465" resolveInfo="reduce_DebuggerSettings_Parameter" />
      </node>
    </node>
    <node role="reductionMappingRule" roleId="tpf8.1167328349397" type="tpf8.Reduction_MappingRule" typeId="tpf8.1167327847730" id="856705193942040360">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="execution.command" />
      <link role="applicableConcept" roleId="tpf8.1167169349424" targetNodeId="uhxm.946964771156870353" resolveInfo="StartProcessHandlerStatement" />
      <node role="ruleConsequence" roleId="tpf8.1169672767469" type="tpf8.TemplateDeclarationReference" typeId="tpf8.1168559333462" id="856705193942040361">
        <link role="template" roleId="tpf8.1722980698497626483" targetNodeId="4762811064051417753" resolveInfo="reduce_StartProcessHandlerStatement" />
      </node>
    </node>
  </root>
  <root id="3754890006475632887">
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="7525857397533844449">
      <property name="name" nameId="tpck.1169194664001" value="getInstance" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7525857397533956115">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="3754890006475632887" resolveInfo="RunConfigurationTypeTemplate" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7525857397533844451" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7525857397533844452">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7525857397533844453">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7525857397533969122">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="bswf.~ContainerUtil%dfindInstance(java%dlang%dObject[],java%dlang%dClass)%cjava%dlang%dObject" resolveInfo="findInstance" />
            <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="bswf.~ContainerUtil" resolveInfo="ContainerUtil" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7525857397533969123">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="g1dt.~Extensions%dgetExtensions(com%dintellij%dopenapi%dextensions%dExtensionPointName)%cjava%dlang%dObject[]" resolveInfo="getExtensions" />
              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="g1dt.~Extensions" resolveInfo="Extensions" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalStaticFieldReference" typeId="tpee.1172008963197" id="7525857397533969124">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="vfxe.~ConfigurationType%dCONFIGURATION_TYPE_EP" resolveInfo="CONFIGURATION_TYPE_EP" />
              </node>
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ClassifierClassExpression" typeId="tpee.1116615150612" id="7525857397533969125">
              <link role="classifier" roleId="tpee.1116615189566" targetNodeId="3754890006475632887" resolveInfo="RunConfigurationTypeTemplate" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3754890006475632888" />
    <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="3754890006475632889">
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="3754890006475632890" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3754890006475632891" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3754890006475632892" />
    </node>
    <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.RootTemplateAnnotation" typeId="tpf8.1168619357332" id="3754890006475632893">
      <link role="applicableConcept" roleId="tpf8.1168619429071" targetNodeId="uhxm.2401501559171345994" resolveInfo="RunConfigurationType" />
    </node>
    <node role="implementedInterface" roleId="tpee.1095933932569" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3754890006475685198">
      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vfxe.~ConfigurationType" resolveInfo="ConfigurationType" />
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="3754890006475685199">
      <property name="name" nameId="tpck.1169194664001" value="getConfigurationFactories" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3754890006475685200" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ArrayType" typeId="tpee.1070534760951" id="3754890006475685201">
        <node role="componentType" roleId="tpee.1070534760952" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3754890006475685202">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vfxe.~ConfigurationFactory" resolveInfo="ConfigurationFactory" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3754890006475685203">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7024026323278198255">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7024026323278198256">
            <property name="name" nameId="tpck.1169194664001" value="result" />
            <node role="type" roleId="tpee.5680397130376446158" type="tp2q.ListType" typeId="tp2q.1151688443754" id="7024026323278198257">
              <node role="elementType" roleId="tp2q.1151688676805" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7024026323278198258">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vfxe.~ConfigurationFactory" resolveInfo="ConfigurationFactory" />
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7024026323278198259">
              <node role="creator" roleId="tpee.1145553007750" type="tp2q.ListCreatorWithInit" typeId="tp2q.1160600644654" id="7024026323278198260">
                <node role="elementType" roleId="tp2q.1237721435807" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7024026323278198261">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vfxe.~ConfigurationFactory" resolveInfo="ConfigurationFactory" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7024026323278198275">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7024026323278198277">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7024026323278198276">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7024026323278198256" resolveInfo="result" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp2q.AddElementOperation" typeId="tp2q.1160612413312" id="7024026323278198281">
              <node role="argument" roleId="tp2q.1160612519549" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7024026323278198283">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7024026323278238790">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7460665385311861256" resolveInfo="RunConfigurationFactoryTemplate" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="7024026323278238791" />
                  <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="7024026323278238792">
                    <property name="linkRole" nameId="tpck.1757699476691236116" value="baseMethodDeclaration" />
                    <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="7024026323278238793">
                      <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="7024026323278238794">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7024026323278238795">
                          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7024026323278238853">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7024026323278238843">
                              <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7024026323278238797">
                                <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="7024026323278238796" />
                                <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="7024026323278238837">
                                  <link role="label" roleId="tpf3.1216860049628" targetNodeId="7460665385311866804" resolveInfo="ConfigurationToFactoryClass" />
                                  <node role="inputNode" roleId="tpf3.1216860049632" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="7024026323278238839" />
                                </node>
                              </node>
                              <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="7024026323278238850">
                                <link role="link" roleId="tp25.1138056546658" targetNodeId="tpee.1068390468201" />
                              </node>
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tp2q.GetFirstOperation" typeId="tp2q.1165525191778" id="7024026323278238858" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.LoopMacro" typeId="tpf8.1118786554307" id="7024026323278238802">
            <node role="sourceNodesQuery" roleId="tpf8.1167952069335" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="7024026323278238803">
              <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="7024026323278238804">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7024026323278238805">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7024026323278238817">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7024026323278238812">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7024026323278238807">
                        <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="7024026323278238806" />
                        <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_GetModelOperation" typeId="tp25.1143234257716" id="7024026323278238811" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tp25.Model_RootsOperation" typeId="tp25.1171315804604" id="7024026323278238816">
                        <link role="concept" roleId="tp25.1171315804605" targetNodeId="uhxm.2401501559171345993" resolveInfo="RunConfiguration" />
                      </node>
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tp2q.WhereOperation" typeId="tp2q.1202120902084" id="7024026323278238821">
                      <node role="closure" roleId="tp2q.1204796294226" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="7024026323278238822">
                        <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="7024026323278238823">
                          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7024026323278238826">
                            <node role="expression" roleId="tpee.1068580123156" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="7024026323278238833">
                              <node role="rightExpression" roleId="tpee.1081773367579" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="7024026323278238836" />
                              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7024026323278238828">
                                <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7024026323278238827">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7024026323278238824" resolveInfo="it" />
                                </node>
                                <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="7024026323278244815">
                                  <link role="link" roleId="tp25.1138056516764" targetNodeId="uhxm.2401501559171353314" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="parameter" roleId="tp2c.1199569906740" type="tp2q.SmartClosureParameterDeclaration" typeId="tp2q.1203518072036" id="7024026323278238824">
                          <property name="name" nameId="tpck.1169194664001" value="it" />
                          <node role="type" roleId="tpee.5680397130376446158" type="tpee.UndefinedType" typeId="tpee.4836112446988635817" id="7024026323278238825" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.SingleLineComment" typeId="tpee.6329021646629104954" id="3826020585481208171">
          <node role="commentPart" roleId="tpee.6329021646629175155" type="tpee.TextCommentPart" typeId="tpee.6329021646629104957" id="3826020585481208172">
            <property name="text" nameId="tpee.6329021646629104958" value="todo foreign configurations" />
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7024026323278198263">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7024026323278198266">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7024026323278198265">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7024026323278198256" resolveInfo="result" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp2q.ToArrayOperation" typeId="tp2q.1184963466173" id="7024026323278198270" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="3754890006475685204">
      <property name="name" nameId="tpck.1169194664001" value="getId" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3754890006475685205" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.StringType" typeId="tpee.1225271177708" id="3754890006475685232" />
      <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="3754890006475685207">
        <link role="annotation" roleId="tpee.1188208074048" targetNodeId="r27b.~NonNls" resolveInfo="NonNls" />
      </node>
      <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="3754890006475685208">
        <link role="annotation" roleId="tpee.1188208074048" targetNodeId="r27b.~NotNull" resolveInfo="NotNull" />
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3754890006475685209">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3754890006475685222">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7024026323278183382">
            <property name="value" nameId="tpee.1070475926801" value="id" />
            <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="7024026323278183384">
              <property name="propertyName" nameId="tpck.1757699476691236117" value="value" />
              <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="7024026323278183387">
                <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="7024026323278183388">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7024026323278183389">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7024026323278183390">
                      <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="7024026323278183391">
                        <link role="property" roleId="tp25.1138056395725" targetNodeId="tpck.1169194664001" resolveInfo="name" />
                      </node>
                      <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="7024026323278183392" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="3754890006475685210">
      <property name="name" nameId="tpck.1169194664001" value="getIcon" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3754890006475685211" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3754890006475685212">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="dbrf.~Icon" resolveInfo="Icon" />
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3754890006475685213">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3754890006475685224">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalStaticFieldReference" typeId="tpee.1172008963197" id="5440527547151494609">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5440527547151482545" resolveInfo="ICON" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="3754890006475685214">
      <property name="name" nameId="tpck.1169194664001" value="getConfigurationTypeDescription" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3754890006475685215" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.StringType" typeId="tpee.1225271177708" id="3754890006475685231" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3754890006475685217">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3754890006475685226">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="3754890006475685227" />
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="3754890006475685218">
      <property name="name" nameId="tpck.1169194664001" value="getDisplayName" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3754890006475685219" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.StringType" typeId="tpee.1225271177708" id="3754890006475685230" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3754890006475685221">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7024026323278183393">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7024026323278183394">
            <property name="value" nameId="tpee.1070475926801" value="id" />
            <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="7024026323278183395">
              <property name="propertyName" nameId="tpck.1757699476691236117" value="value" />
              <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="7024026323278183396">
                <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="7024026323278183397">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7024026323278183398">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7024026323278183399">
                      <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="7024026323278183400">
                        <link role="property" roleId="tp25.1138056395725" targetNodeId="tpck.1169194664001" resolveInfo="name" />
                      </node>
                      <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="7024026323278183401" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="3754890006475720274">
      <property name="propertyName" nameId="tpck.1757699476691236117" value="name" />
      <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="3754890006475720275">
        <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="3754890006475720276">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3754890006475720306">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3754890006475720308">
              <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="3754890006475720307" />
              <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="946964771156934252">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i1mc.946964771156905488" resolveInfo="getGeneratedClassName" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticField" roleId="tpee.1128555889557" type="tpee.StaticFieldDeclaration" typeId="tpee.1070462154015" id="5440527547151482545">
      <property name="name" nameId="tpck.1169194664001" value="ICON" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="5440527547151482546" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5440527547151494076">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="dbrf.~Icon" resolveInfo="Icon" />
      </node>
      <node role="initializer" roleId="tpee.1068431790190" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="4806795137173746007">
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.CopySrcNodeMacro" typeId="tpf8.1114706874351" id="4806795137173746009">
          <node role="sourceNodeQuery" roleId="tpf8.1168024447342" type="tpf8.SourceSubstituteMacro_SourceNodeQuery" typeId="tpf8.1168024337012" id="4806795137173746010">
            <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="4806795137173746011">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4806795137173746012">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4806795137173746014">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="4806795137173746013" />
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="4806795137173746018">
                    <link role="link" roleId="tp25.1138056516764" targetNodeId="uhxm.4806795137173723123" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="3754890006475702959">
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="7806358006983617836">
      <property name="name" nameId="tpck.1169194664001" value="canExecute" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.BooleanType" typeId="tpee.1070534644030" id="7806358006983618070" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7806358006983617838" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983617839">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7806358006983617840">
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983617841">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7806358006983617842">
              <node role="expression" roleId="tpee.1068581517676" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7806358006983617843">
                <property name="value" nameId="tpee.1068580123138" value="true" />
              </node>
            </node>
          </node>
          <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983617844">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7806358006983617845">
              <link role="classifier" roleId="tpee.1144433057691" targetNodeId="juez.~DefaultRunExecutor" resolveInfo="DefaultRunExecutor" />
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="juez.~DefaultRunExecutor%dEXECUTOR_ID" resolveInfo="EXECUTOR_ID" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7806358006983617846">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dequals(java%dlang%dObject)%cboolean" resolveInfo="equals" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7806358006983618073">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983618071" resolveInfo="executorId" />
              </node>
            </node>
          </node>
          <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.IfMacro" typeId="tpf8.1118773211870" id="7806358006983617848">
            <node role="conditionFunction" roleId="tpf8.1167945861827" type="tpf8.IfMacro_Condition" typeId="tpf8.1167945743726" id="7806358006983617849">
              <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983617850">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983617851">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983617852">
                    <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="7806358006983617856">
                      <link role="property" roleId="tp25.1138056395725" targetNodeId="uhxm.5925077313451868299" resolveInfo="canRun" />
                    </node>
                    <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="7806358006983618084" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7806358006983617857">
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983617858">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7806358006983617859">
              <node role="expression" roleId="tpee.1068581517676" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7806358006983617860">
                <property name="value" nameId="tpee.1068580123138" value="true" />
              </node>
            </node>
          </node>
          <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983617861">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7806358006983617862">
              <link role="classifier" roleId="tpee.1144433057691" targetNodeId="juez.~DefaultDebugExecutor" resolveInfo="DefaultDebugExecutor" />
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="juez.~DefaultDebugExecutor%dEXECUTOR_ID" resolveInfo="EXECUTOR_ID" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7806358006983617863">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dequals(java%dlang%dObject)%cboolean" resolveInfo="equals" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7806358006983617864">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983618071" resolveInfo="executorId" />
              </node>
            </node>
          </node>
          <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.IfMacro" typeId="tpf8.1118773211870" id="7806358006983617865">
            <node role="conditionFunction" roleId="tpf8.1167945861827" type="tpf8.IfMacro_Condition" typeId="tpf8.1167945743726" id="7806358006983617866">
              <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983617867">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983617868">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983617869">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983617870">
                      <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="7806358006983617872" />
                      <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="7806358006983617874">
                        <link role="link" roleId="tp25.1138056516764" targetNodeId="uhxm.4371737370139995047" />
                      </node>
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsNotNullOperation" typeId="tp25.1172008320231" id="7806358006983617875" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983617876">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7806358006983617877">
            <property name="value" nameId="tpee.1068580123138" value="false" />
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7806358006983618071">
        <property name="name" nameId="tpck.1169194664001" value="executorId" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="7806358006983618072" />
      </node>
      <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="7806358006983618074">
        <property name="propertyName" nameId="tpck.1757699476691236117" value="name" />
        <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="7806358006983618075">
          <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983618076">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983618077">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983618079">
                <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="7806358006983618078" />
                <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="7806358006983618083">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ojho.7806358006983616236" resolveInfo="getCanExecuteMethodName" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="3754890006475707308">
      <property name="name" nameId="tpck.1169194664001" value="myRunConfiguration" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="3754890006475707309" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3754890006475713381">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="143080135592811026" resolveInfo="RunConfigurationTemplate" />
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="3754890006475713382">
          <property name="linkRole" nameId="tpck.1757699476691236116" value="classifier" />
          <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="3754890006475713383">
            <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="3754890006475713384">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3754890006475713385">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3754890006475713387">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="3754890006475713386" />
                  <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="3754890006475713391">
                    <link role="label" roleId="tpf3.1216860049628" targetNodeId="kv8t.5041115067675922953" resolveInfo="ConfigurationToClass" />
                    <node role="inputNode" roleId="tpf3.1216860049632" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3754890006475713394">
                      <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="3754890006475713393" />
                      <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="3754890006475713398">
                        <link role="link" roleId="tp25.1138056516764" targetNodeId="uhxm.1048802521465114237" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="5812151570929324902">
        <link role="annotation" roleId="tpee.1188208074048" targetNodeId="r27b.~NotNull" resolveInfo="NotNull" />
      </node>
      <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.MapSrcNodeMacro" typeId="tpf8.1131073187192" id="5812151570929690872">
        <link role="mappingLabel" roleId="tpf8.1200912223215" targetNodeId="5812151570929690873" resolveInfo="ExecutorToConfigurationField" />
      </node>
      <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="7806358006983709819">
        <property name="propertyName" nameId="tpck.1757699476691236117" value="name" />
        <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="7806358006983709820">
          <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983709821">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983709829">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983709831">
                <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="7806358006983709830" />
                <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="7806358006983709835">
                  <link role="property" roleId="tp25.1138056395725" targetNodeId="uhxm.7806358006983709801" resolveInfo="configurationName" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="5812151570929323626">
      <property name="name" nameId="tpck.1169194664001" value="myEnvironment" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="5812151570929323627" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5812151570929324893">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="s7ni.~ExecutionEnvironment" resolveInfo="ExecutionEnvironment" />
      </node>
      <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="5812151570929324894">
        <link role="annotation" roleId="tpee.1188208074048" targetNodeId="r27b.~NotNull" resolveInfo="NotNull" />
      </node>
    </node>
    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3754890006475702960" />
    <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="3754890006475702961">
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3754890006475707297">
        <property name="name" nameId="tpck.1169194664001" value="configuration" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3754890006475707299">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="143080135592811026" resolveInfo="RunConfigurationTemplate" />
          <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="3754890006475713405">
            <property name="linkRole" nameId="tpck.1757699476691236116" value="classifier" />
            <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="3754890006475713406">
              <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="3754890006475713407">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3754890006475713408">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3754890006475713409">
                    <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="3754890006475713410" />
                    <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="3754890006475713411">
                      <link role="label" roleId="tpf3.1216860049628" targetNodeId="kv8t.5041115067675922953" resolveInfo="ConfigurationToClass" />
                      <node role="inputNode" roleId="tpf3.1216860049632" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3754890006475713412">
                        <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="3754890006475713413" />
                        <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="3754890006475713414">
                          <link role="link" roleId="tp25.1138056516764" targetNodeId="uhxm.1048802521465114237" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="3754890006475713426">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="r27b.~NotNull" resolveInfo="NotNull" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3754890006475707302">
        <property name="name" nameId="tpck.1169194664001" value="executor" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3754890006475707303">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="1hm1.~Executor" resolveInfo="Executor" />
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="3754890006475707304">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="r27b.~NotNull" resolveInfo="NotNull" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3754890006475707305">
        <property name="name" nameId="tpck.1169194664001" value="environment" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3754890006475707306">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="s7ni.~ExecutionEnvironment" resolveInfo="ExecutionEnvironment" />
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="3754890006475707307">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="r27b.~NotNull" resolveInfo="NotNull" />
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="3754890006475702962" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3754890006475702963" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3754890006475702964">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3754890006475713399">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="3754890006475713401">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3754890006475713404">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3754890006475707297" resolveInfo="configuration" />
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="3754890006475713400">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3754890006475707308" resolveInfo="myRunConfiguration" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5812151570929324896">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="5812151570929324898">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5812151570929324901">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3754890006475707305" resolveInfo="environment" />
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="5812151570929324897">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5812151570929323626" resolveInfo="myEnvironment" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.RootTemplateAnnotation" typeId="tpf8.1168619357332" id="3754890006475702965">
      <link role="applicableConcept" roleId="tpf8.1168619429071" targetNodeId="uhxm.7806358006983614956" resolveInfo="ComplexRunConfigurationExecutor" />
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="3754890006475707249">
      <property name="name" nameId="tpck.1169194664001" value="getConfigurationSettings" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3754890006475707250" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3754890006475707251">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vfxe.~ConfigurationPerRunnerSettings" resolveInfo="ConfigurationPerRunnerSettings" />
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3754890006475707252">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3754890006475707268">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="3754890006475707269" />
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="3754890006475707253">
      <property name="name" nameId="tpck.1169194664001" value="getRunnerSettings" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3754890006475707254" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3754890006475707255">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vfxe.~RunnerSettings" resolveInfo="RunnerSettings" />
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3754890006475707256">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3754890006475707270">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="3754890006475707271" />
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="3754890006475707257">
      <property name="name" nameId="tpck.1169194664001" value="execute" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3754890006475707258" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3754890006475707259">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="1hm1.~ExecutionResult" resolveInfo="ExecutionResult" />
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3754890006475707260">
        <property name="name" nameId="tpck.1169194664001" value="executor" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3754890006475707261">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="1hm1.~Executor" resolveInfo="Executor" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3754890006475707262">
        <property name="name" nameId="tpck.1169194664001" value="runner" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3754890006475707263">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="s7ni.~ProgramRunner" resolveInfo="ProgramRunner" />
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="3754890006475707264">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="r27b.~NotNull" resolveInfo="NotNull" />
        </node>
      </node>
      <node role="throwsItem" roleId="tpee.1164879685961" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3754890006475707265">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="1hm1.~ExecutionException" resolveInfo="ExecutionException" />
      </node>
      <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="3754890006475707266">
        <link role="annotation" roleId="tpee.1188208074048" targetNodeId="r27b.~Nullable" resolveInfo="Nullable" />
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3754890006475707267">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="5812151570929329703">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="5812151570929329704">
            <property name="name" nameId="tpck.1169194664001" value="project" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5812151570929329705">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="27v0.~Project" resolveInfo="Project" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5812151570929329707">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="5812151570929329708">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5812151570929323626" resolveInfo="myEnvironment" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="5812151570929329709">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="s7ni.~ExecutionEnvironment%dgetProject()%ccom%dintellij%dopenapi%dproject%dProject" resolveInfo="getProject" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="5812151570929671908">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="5812151570929671909">
            <property name="name" nameId="tpck.1169194664001" value="processHandler" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5812151570929671910">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="7jsa.~ProcessHandler" resolveInfo="ProcessHandler" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="5812151570929671913" />
          </node>
          <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.CopySrcListMacro" typeId="tpf8.1114729360583" id="5812151570929671915">
            <node role="sourceNodesQuery" roleId="tpf8.1168278589236" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="5812151570929671916">
              <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="5812151570929671917">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5812151570929671918">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5812151570929671930">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5812151570929671925">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5812151570929671920">
                        <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="5812151570929671919" />
                        <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="5812151570929671924">
                          <link role="link" roleId="tp25.1138056516764" targetNodeId="uhxm.7945003362267213473" />
                        </node>
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="5812151570929671929">
                        <link role="link" roleId="tp25.1138056516764" targetNodeId="tpee.1137022507850" />
                      </node>
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="5812151570929671934">
                      <link role="link" roleId="tp25.1138056546658" targetNodeId="tpee.1068581517665" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="3754890006475707275">
      <property name="propertyName" nameId="tpck.1757699476691236117" value="name" />
      <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="3754890006475707276">
        <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="3754890006475707277">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="8265043642382454465">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8265043642382454467">
              <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="8265043642382454466" />
              <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="946964771156934248">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i1mc.946964771156905488" resolveInfo="getGeneratedClassName" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="4371737370140155817">
      <property name="name" nameId="tpck.1169194664001" value="getDebugger" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="4371737370140155818" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4371737370140155819">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="x4jy.~IDebugger" resolveInfo="IDebugger" />
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="4371737370140155820">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4371737370140155843">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="4371737370140155845">
            <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.CopySrcNodeMacro" typeId="tpf8.1114706874351" id="4371737370140155847">
              <node role="sourceNodeQuery" roleId="tpf8.1168024447342" type="tpf8.SourceSubstituteMacro_SourceNodeQuery" typeId="tpf8.1168024337012" id="4371737370140155848">
                <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="4371737370140155849">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4371737370140155850">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4371737370140155852">
                      <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="4371737370140155851" />
                      <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="4371737370140155856">
                        <link role="link" roleId="tp25.1138056516764" targetNodeId="uhxm.4371737370139995047" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.IfMacro" typeId="tpf8.1118773211870" id="4371737370140155824">
        <node role="conditionFunction" roleId="tpf8.1167945861827" type="tpf8.IfMacro_Condition" typeId="tpf8.1167945743726" id="4371737370140155825">
          <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="4371737370140155826">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="442015021861811767">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="442015021861811769">
                <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="442015021861811768" />
                <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="442015021861811773">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ojho.442015021861764808" resolveInfo="isDebuggable" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="442015021861739550">
      <property name="name" nameId="tpck.1169194664001" value="createDebuggerSettings" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.ProtectedVisibility" typeId="tpee.1146644641414" id="442015021861887203" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="442015021861739552">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="x4jy.~IDebuggerSettings" resolveInfo="IDebuggerSettings" />
      </node>
      <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="442015021861739553">
        <link role="annotation" roleId="tpee.1188208074048" targetNodeId="r27b.~Nullable" resolveInfo="Nullable" />
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="442015021861739554">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="442015021861739555">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="442015021861739556" />
          <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.CopySrcListMacro" typeId="tpf8.1114729360583" id="442015021861881551">
            <node role="sourceNodesQuery" roleId="tpf8.1168278589236" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="442015021861881552">
              <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="442015021861881553">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="442015021861881554">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="442015021861881567">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="442015021861881561">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="442015021861881556">
                        <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="442015021861881555" />
                        <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="442015021861881565">
                          <link role="link" roleId="tp25.1138056516764" targetNodeId="uhxm.7806358006983776828" />
                        </node>
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="442015021861881566">
                        <link role="link" roleId="tp25.1138056516764" targetNodeId="tpee.1137022507850" />
                      </node>
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="442015021861881571">
                      <link role="link" roleId="tp25.1138056546658" targetNodeId="tpee.1068581517665" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.IfMacro" typeId="tpf8.1118773211870" id="442015021861739558">
        <node role="conditionFunction" roleId="tpf8.1167945861827" type="tpf8.IfMacro_Condition" typeId="tpf8.1167945743726" id="442015021861739559">
          <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="442015021861739560">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="442015021861811760">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="442015021861811762">
                <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="442015021861811761" />
                <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="442015021861811766">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ojho.442015021861764808" resolveInfo="isDebuggable" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="superclass" roleId="tpee.1165602531693" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4371737370140155775">
      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="mmln.~DebuggerRunProfileState" resolveInfo="DebuggerRunProfileState" />
      <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.IfMacro" typeId="tpf8.1118773211870" id="4371737370140155777">
        <node role="conditionFunction" roleId="tpf8.1167945861827" type="tpf8.IfMacro_Condition" typeId="tpf8.1167945743726" id="4371737370140155778">
          <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="4371737370140155779">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="442015021861811774">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="442015021861811776">
                <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="442015021861811775" />
                <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="442015021861811780">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ojho.442015021861764808" resolveInfo="isDebuggable" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="implementedInterface" roleId="tpee.1095933932569" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="801101525254534762">
      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vfxe.~RunProfileState" resolveInfo="RunProfileState" />
    </node>
  </root>
  <root id="7460665385311861254">
    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7460665385311861255" />
    <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="7460665385311861256">
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7460665385311866851">
        <property name="name" nameId="tpck.1169194664001" value="type" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7460665385311866853">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="3754890006475632887" resolveInfo="RunConfigurationTypeTemplate" />
          <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="7460665385311866858">
            <property name="linkRole" nameId="tpck.1757699476691236116" value="classifier" />
            <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="7460665385311866859">
              <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="7460665385311866860">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7460665385311866867">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7460665385311866869">
                    <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="7460665385311866868" />
                    <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="7460665385311866875">
                      <link role="label" roleId="tpf3.1216860049628" targetNodeId="3754890006475707294" resolveInfo="TypeToClass" />
                      <node role="inputNode" roleId="tpf3.1216860049632" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7460665385311866878">
                        <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="7460665385311866877" />
                        <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="7460665385311866882">
                          <link role="link" roleId="tp25.1138056516764" targetNodeId="uhxm.2401501559171353314" />
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
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7460665385311861257" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7460665385311861258" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7460665385311861259">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.SuperConstructorInvocation" typeId="tpee.1070475587102" id="7460665385311866856">
          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="vfxe.~ConfigurationFactory%d&lt;init&gt;(com%dintellij%dexecution%dconfigurations%dConfigurationType)" resolveInfo="ConfigurationFactory" />
          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7460665385311866857">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7460665385311866851" resolveInfo="type" />
          </node>
        </node>
      </node>
    </node>
    <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.RootTemplateAnnotation" typeId="tpf8.1168619357332" id="7460665385311861260">
      <link role="applicableConcept" roleId="tpf8.1168619429071" targetNodeId="uhxm.2401501559171345993" resolveInfo="RunConfiguration" />
    </node>
    <node role="superclass" roleId="tpee.1165602531693" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7460665385311866777">
      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vfxe.~ConfigurationFactory" resolveInfo="ConfigurationFactory" />
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7460665385311866778">
      <property name="name" nameId="tpck.1169194664001" value="createTemplateConfiguration" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7460665385311866779" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7460665385311866780">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vfxe.~RunConfiguration" resolveInfo="RunConfiguration" />
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7460665385311866781">
        <property name="name" nameId="tpck.1169194664001" value="project" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7460665385311866782">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="27v0.~Project" resolveInfo="Project" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7460665385311866783">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7460665385311866786">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7460665385311866788">
            <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7460665385311866790">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7460665385311861256" resolveInfo="RunConfigurationFactoryTemplate" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7460665385311866796">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7460665385311866781" resolveInfo="project" />
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="7460665385311866798" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7460665385311866800">
                <property name="value" nameId="tpee.1070475926801" value="Template Configuration" />
              </node>
              <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="7460665385311866815">
                <property name="linkRole" nameId="tpck.1757699476691236116" value="baseMethodDeclaration" />
                <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="7460665385311866816">
                  <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="7460665385311866817">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7460665385311866818">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7460665385311866832">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7460665385311866827">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7460665385311866820">
                            <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="7460665385311866819" />
                            <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="7460665385311866824">
                              <link role="label" roleId="tpf3.1216860049628" targetNodeId="kv8t.5041115067675922953" resolveInfo="ConfigurationToClass" />
                              <node role="inputNode" roleId="tpf3.1216860049632" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="7460665385311866826" />
                            </node>
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="7460665385311866831">
                            <link role="link" roleId="tp25.1138056546658" targetNodeId="tpee.1068390468201" />
                          </node>
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tp2q.GetFirstOperation" typeId="tp2q.1165525191778" id="7460665385311866836" />
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
    <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="7460665385311866837">
      <property name="propertyName" nameId="tpck.1757699476691236117" value="name" />
      <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="7460665385311866838">
        <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="7460665385311866839">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7460665385311866840">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7460665385311866847">
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7460665385311866850">
                <property name="value" nameId="tpee.1070475926801" value="_Factory" />
              </node>
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7460665385311866842">
                <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="7460665385311866841" />
                <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="946964771156934249">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i1mc.946964771156905488" resolveInfo="getGeneratedClassName" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="4064954644153043544">
      <property name="name" nameId="tpck.1169194664001" value="getName" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="4064954644153043545" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.StringType" typeId="tpee.1225271177708" id="4064954644153047824" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="4064954644153043547">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4064954644153047825">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="4064954644153047826">
            <property name="value" nameId="tpee.1070475926801" value="name" />
            <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="4064954644153047828">
              <property name="propertyName" nameId="tpck.1757699476691236117" value="value" />
              <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="4064954644153047831">
                <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="4064954644153047832">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4064954644153047833">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4064954644153047834">
                      <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="4064954644153047835">
                        <link role="property" roleId="tp25.1138056395725" targetNodeId="tpck.1169194664001" resolveInfo="name" />
                      </node>
                      <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="4064954644153047836" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="4064954644153043548">
        <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" />
      </node>
    </node>
  </root>
  <root id="666608846720191836">
    <node role="contentNode" roleId="tpf8.1092060348987" type="tpee.ClassConcept" typeId="tpee.1068390468198" id="666608846720191848">
      <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
      <property name="name" nameId="tpck.1169194664001" value="RunConfigurationTemplateWeave" />
      <property name="abstractClass" nameId="tpee.1075300953594" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="666608846720191849" />
      <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="666608846720191876">
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="666608846720191877">
          <property name="name" nameId="tpck.1169194664001" value="project" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="666608846720191878">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="27v0.~Project" resolveInfo="Project" />
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="666608846720191879">
          <property name="name" nameId="tpck.1169194664001" value="factory" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="666608846720191880">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vfxe.~ConfigurationFactory" resolveInfo="ConfigurationFactory" />
            <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="666608846720191881">
              <property name="linkRole" nameId="tpck.1757699476691236116" value="classifier" />
              <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="666608846720191882">
                <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="666608846720191883">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="666608846720191884">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="666608846720191885">
                      <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="666608846720191886" />
                      <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="666608846720191887">
                        <link role="label" roleId="tpf3.1216860049628" targetNodeId="7460665385311866804" resolveInfo="ConfigurationToFactoryClass" />
                        <node role="inputNode" roleId="tpf3.1216860049632" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="666608846720191888" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="666608846720191889">
          <property name="name" nameId="tpck.1169194664001" value="name" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="666608846720191890" />
        </node>
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="666608846720191891" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="666608846720191892" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="666608846720191893">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.SuperConstructorInvocation" typeId="tpee.1070475587102" id="666608846720191894">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="vfxe.~RunConfigurationBase%d&lt;init&gt;(com%dintellij%dopenapi%dproject%dProject,com%dintellij%dexecution%dconfigurations%dConfigurationFactory,java%dlang%dString)" resolveInfo="RunConfigurationBase" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="666608846720191895">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="666608846720191877" resolveInfo="project" />
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="666608846720191896">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="666608846720191879" resolveInfo="factory" />
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="666608846720191897">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="666608846720191889" resolveInfo="name" />
            </node>
          </node>
        </node>
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.TemplateFragment" typeId="tpf8.1095672379244" id="666608846720191960" />
      </node>
      <node role="superclass" roleId="tpee.1165602531693" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="666608846720191860">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vfxe.~RunConfigurationBase" resolveInfo="RunConfigurationBase" />
      </node>
      <node role="implementedInterface" roleId="tpee.1095933932569" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="666608846720191904">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="mvo7.1252300412034470124" resolveInfo="IPersistentConfiguration" />
      </node>
    </node>
  </root>
  <root id="666608846720191922">
    <node role="contentNode" roleId="tpf8.1092060348987" type="tpee.ClassConcept" typeId="tpee.1068390468198" id="666608846720191934">
      <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
      <property name="name" nameId="tpck.1169194664001" value="RunConfigurationTemplateWeave" />
      <property name="abstractClass" nameId="tpee.1075300953594" value="true" />
      <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="6139196002333142788">
        <property name="name" nameId="tpck.1169194664001" value="myConfiguration" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="6139196002333142789" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6139196002333142791">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="mvo7.1252300412034470124" resolveInfo="IPersistentConfiguration" />
        </node>
      </node>
      <node role="staticField" roleId="tpee.1128555889557" type="tpee.StaticFieldDeclaration" typeId="tpee.1070462154015" id="1754312393816976161">
        <property name="name" nameId="tpck.1169194664001" value="ICON" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="1754312393816976162" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1754312393816976164">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="dbrf.~Icon" resolveInfo="Icon" />
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="666608846720191971">
        <property name="name" nameId="tpck.1169194664001" value="getState" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="666608846720191972" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="666608846720191973">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vfxe.~RunProfileState" resolveInfo="RunProfileState" />
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="666608846720191974">
          <property name="name" nameId="tpck.1169194664001" value="executor" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="666608846720191975">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="1hm1.~Executor" resolveInfo="Executor" />
          </node>
          <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="666608846720191976">
            <link role="annotation" roleId="tpee.1188208074048" targetNodeId="r27b.~NotNull" resolveInfo="NotNull" />
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="666608846720191977">
          <property name="name" nameId="tpck.1169194664001" value="environment" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="666608846720191978">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="s7ni.~ExecutionEnvironment" resolveInfo="ExecutionEnvironment" />
          </node>
          <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="666608846720191979">
            <link role="annotation" roleId="tpee.1188208074048" targetNodeId="r27b.~NotNull" resolveInfo="NotNull" />
          </node>
        </node>
        <node role="throwsItem" roleId="tpee.1164879685961" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="666608846720191980">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="1hm1.~ExecutionException" resolveInfo="ExecutionException" />
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="666608846720191981">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="r27b.~Nullable" resolveInfo="Nullable" />
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="666608846720191982">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="666608846720191983">
            <node role="expression" roleId="tpee.1068581517676" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="666608846720191984">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="666608846720191985">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="3754890006475702961" resolveInfo="ExecutorRunProfileStateTemplate" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="666608846720192004" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="666608846720191987">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="666608846720191974" resolveInfo="executor" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="666608846720191988">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="666608846720191977" resolveInfo="environment" />
                </node>
                <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="666608846720191989">
                  <property name="linkRole" nameId="tpck.1757699476691236116" value="baseMethodDeclaration" />
                  <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="666608846720191990">
                    <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="666608846720191991">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="666608846720191992">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="666608846720191993">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="666608846720191994">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="666608846720191995">
                              <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="666608846720191996" />
                              <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="666608846720191997">
                                <link role="label" roleId="tpf3.1216860049628" targetNodeId="3754890006475707296" resolveInfo="ExecutorToClass" />
                                <node role="inputNode" roleId="tpf3.1216860049632" type="tpee.DotExpression" typeId="tpee.1197027756228" id="666608846720191998">
                                  <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="666608846720191999" />
                                  <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="666608846720192000">
                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ojho.3754890006475713427" resolveInfo="getExecutor" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="666608846720192001">
                              <link role="link" roleId="tp25.1138056546658" targetNodeId="tpee.1068390468201" />
                            </node>
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tp2q.GetFirstOperation" typeId="tp2q.1165525191778" id="666608846720192002" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.TemplateFragment" typeId="tpf8.1095672379244" id="666608846720192003" />
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="666608846720245928">
        <property name="name" nameId="tpck.1169194664001" value="getRunnerSettingsEditor" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="666608846720245929" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="666608846720245930">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fahd.~SettingsEditor" resolveInfo="SettingsEditor" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="666608846720245931">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="8a0f.~JDOMExternalizable" resolveInfo="JDOMExternalizable" />
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="666608846720245932">
          <property name="name" nameId="tpck.1169194664001" value="runner" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="666608846720245933">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="s7ni.~ProgramRunner" resolveInfo="ProgramRunner" />
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="666608846720245934">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="r27b.~Nullable" resolveInfo="Nullable" />
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="666608846720245935">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="666608846720245936">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="666608846720245937" />
          </node>
        </node>
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.TemplateFragment" typeId="tpf8.1095672379244" id="666608846720245938" />
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="666608846720245950">
        <property name="name" nameId="tpck.1169194664001" value="createRunnerSettings" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="666608846720245951" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="666608846720245952">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="8a0f.~JDOMExternalizable" resolveInfo="JDOMExternalizable" />
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="666608846720245953">
          <property name="name" nameId="tpck.1169194664001" value="provider" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="666608846720245954">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vfxe.~ConfigurationInfoProvider" resolveInfo="ConfigurationInfoProvider" />
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="666608846720245955">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="666608846720245956">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="666608846720245957" />
          </node>
        </node>
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.TemplateFragment" typeId="tpf8.1095672379244" id="666608846720245958" />
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="666608846720245970">
        <property name="name" nameId="tpck.1169194664001" value="getConfigurationEditor" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="666608846720245971" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="666608846720245972">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fahd.~SettingsEditor" resolveInfo="SettingsEditor" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="666608846720245973">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="666608846720191848" resolveInfo="RunConfigurationTemplate" />
            <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="1735048880741920084">
              <property name="linkRole" nameId="tpck.1757699476691236116" value="classifier" />
              <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="1735048880741920085">
                <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1735048880741920086">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1735048880741931616">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1735048880741931618">
                      <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="1735048880741931617" />
                      <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="1735048880741931622">
                        <link role="label" roleId="tpf3.1216860049628" targetNodeId="kv8t.5041115067675922953" resolveInfo="ConfigurationToClass" />
                        <node role="inputNode" roleId="tpf3.1216860049632" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1735048880741931624" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="666608846720245974">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="666608846720245975">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.CastExpression" typeId="tpee.1070534934090" id="666608846720245976">
              <node role="type" roleId="tpee.1070534934091" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="666608846720245977">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fahd.~SettingsEditor" resolveInfo="SettingsEditor" />
                <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="666608846720245978">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="666608846720191848" resolveInfo="RunConfigurationTemplate" />
                  <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="1735048880741931625">
                    <property name="linkRole" nameId="tpck.1757699476691236116" value="classifier" />
                    <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="1735048880741931626">
                      <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1735048880741931627">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1735048880741931628">
                          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1735048880741931629">
                            <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="1735048880741931630" />
                            <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="1735048880741931631">
                              <link role="label" roleId="tpf3.1216860049628" targetNodeId="kv8t.5041115067675922953" resolveInfo="ConfigurationToClass" />
                              <node role="inputNode" roleId="tpf3.1216860049632" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1735048880741931632" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="expression" roleId="tpee.1070534934092" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="666608846720246028">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="mvo7.1252300412034523368" resolveInfo="getEditor" />
              </node>
            </node>
          </node>
        </node>
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.TemplateFragment" typeId="tpf8.1095672379244" id="666608846720245991" />
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="143080135592811037">
        <property name="name" nameId="tpck.1169194664001" value="createCloneTemplate" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="143080135592811040" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="143080135592811041">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="143080135592811042">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.CastExpression" typeId="tpee.1070534934090" id="143080135592837968">
              <node role="expression" roleId="tpee.1070534934092" type="tpee.SuperMethodCall" typeId="tpee.1073063089578" id="143080135592811043">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="vfxe.~RunConfigurationBase%dclone()%ccom%dintellij%dexecution%dconfigurations%dRunConfiguration" resolveInfo="clone" />
              </node>
              <node role="type" roleId="tpee.1070534934091" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="143080135592837971">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="666608846720246044" resolveInfo="RunConfigurationTemplateWeave" />
                <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="143080135592837972">
                  <property name="linkRole" nameId="tpck.1757699476691236116" value="classifier" />
                  <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="143080135592837973">
                    <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="143080135592837974">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="143080135592837975">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="143080135592837976">
                          <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="143080135592837977" />
                          <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="143080135592837978">
                            <link role="label" roleId="tpf3.1216860049628" targetNodeId="kv8t.5041115067675922953" resolveInfo="ConfigurationToClass" />
                            <node role="inputNode" roleId="tpf3.1216860049632" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="143080135592837979" />
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
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.TemplateFragment" typeId="tpf8.1095672379244" id="143080135592820137" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="143080135592820138">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="666608846720246044" resolveInfo="RunConfigurationTemplateWeave" />
          <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="143080135592820139">
            <property name="linkRole" nameId="tpck.1757699476691236116" value="classifier" />
            <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="143080135592820140">
              <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="143080135592820141">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="143080135592820142">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="143080135592820143">
                    <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="143080135592820144" />
                    <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="143080135592820145">
                      <link role="label" roleId="tpf3.1216860049628" targetNodeId="kv8t.5041115067675922953" resolveInfo="ConfigurationToClass" />
                      <node role="inputNode" roleId="tpf3.1216860049632" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="143080135592820146" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="143080135592858645">
        <property name="name" nameId="tpck.1169194664001" value="getEditor" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="143080135592858646">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fahd.~SettingsEditor" resolveInfo="SettingsEditor" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.UpperBoundType" typeId="tpee.1171903916106" id="143080135592858647">
            <node role="bound" roleId="tpee.1171903916107" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="143080135592858648">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="mvo7.1252300412034470124" resolveInfo="IPersistentConfiguration" />
            </node>
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="143080135592858649">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="143080135592858650">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="143080135592858651">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="143080135592858652">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7684700299064368316" resolveInfo="PersistentEditorTmp" />
                <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="143080135592858653">
                  <property name="linkRole" nameId="tpck.1757699476691236116" value="baseMethodDeclaration" />
                  <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="143080135592858654">
                    <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="143080135592858655">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="143080135592858656">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="143080135592858657">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="143080135592858658">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="143080135592858659">
                              <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="143080135592858660" />
                              <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="143080135592858661">
                                <link role="label" roleId="tpf3.1216860049628" targetNodeId="kv8t.5041115067675922958" resolveInfo="ConfigurationToEditorClass" />
                                <node role="inputNode" roleId="tpf3.1216860049632" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="143080135592858662" />
                              </node>
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="143080135592858663">
                              <link role="link" roleId="tp25.1138056546658" targetNodeId="tpee.1068390468201" />
                            </node>
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tp2q.GetFirstOperation" typeId="tp2q.1165525191778" id="143080135592858664" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6139196002333142794">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6139196002333142792">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6139196002333142788" resolveInfo="myConfiguration" />
                    <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="6139196002333142830">
                      <property name="linkRole" nameId="tpck.1757699476691236116" value="variableDeclaration" />
                      <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="6139196002333142831">
                        <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="6139196002333142832">
                          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6139196002333142834">
                            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6139196002333142836">
                              <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="6139196002333142835" />
                              <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="6139196002333142840">
                                <link role="label" roleId="tpf3.1216860049628" targetNodeId="kv8t.5210472748501856559" resolveInfo="PersistentPropertyToField" />
                                <node role="inputNode" roleId="tpf3.1216860049632" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="6139196002333142842" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6139196002333142799">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="mvo7.1252300412034523368" resolveInfo="getEditor" />
                  </node>
                  <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.LoopMacro" typeId="tpf8.1118786554307" id="6139196002333142803">
                    <node role="sourceNodesQuery" roleId="tpf8.1167952069335" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="6139196002333142804">
                      <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="6139196002333142805">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6139196002333142807">
                          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6139196002333142814">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6139196002333142809">
                              <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="6139196002333142808" />
                              <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="946964771156711520">
                                <link role="link" roleId="tp25.1138056546658" targetNodeId="fb9u.946964771156066595" />
                              </node>
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tp2q.WhereOperation" typeId="tp2q.1202120902084" id="6139196002333142818">
                              <node role="closure" roleId="tp2q.1204796294226" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="6139196002333142819">
                                <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="6139196002333142820">
                                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6139196002333142823">
                                    <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6139196002333142825">
                                      <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6139196002333142824">
                                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6139196002333142821" resolveInfo="it" />
                                      </node>
                                      <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="946964771156711522">
                                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="hilv.946964771156066860" resolveInfo="isTemplate" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node role="parameter" roleId="tp2c.1199569906740" type="tp2q.SmartClosureParameterDeclaration" typeId="tp2q.1203518072036" id="6139196002333142821">
                                  <property name="name" nameId="tpck.1169194664001" value="it" />
                                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.UndefinedType" typeId="tpee.4836112446988635817" id="6139196002333142822" />
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
            </node>
          </node>
        </node>
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="143080135592858710" />
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.TemplateFragment" typeId="tpf8.1095672379244" id="143080135592858712" />
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="1754312393816976120">
        <property name="name" nameId="tpck.1169194664001" value="getIcon" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1754312393816976160">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="dbrf.~Icon" resolveInfo="Icon" />
        </node>
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1754312393816976122" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1754312393816976123">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1754312393816976165">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalStaticFieldReference" typeId="tpee.1172008963197" id="1754312393816976166">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1754312393816976161" resolveInfo="ICON" />
              <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="1754312393816976167">
                <property name="linkRole" nameId="tpck.1757699476691236116" value="variableDeclaration" />
                <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="1754312393816976168">
                  <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1754312393816976169">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1754312393816976170">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1754312393816976172">
                        <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="1754312393816976171" />
                        <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="1754312393816976176">
                          <link role="label" roleId="tpf3.1216860049628" targetNodeId="1754312393816973333" resolveInfo="IconPathToExpression" />
                          <node role="inputNode" roleId="tpf3.1216860049632" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1754312393816976178" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.TemplateFragment" typeId="tpf8.1095672379244" id="1754312393816976124" />
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.IfMacro" typeId="tpf8.1118773211870" id="1754312393816976126">
          <node role="conditionFunction" roleId="tpf8.1167945861827" type="tpf8.IfMacro_Condition" typeId="tpf8.1167945743726" id="1754312393816976127">
            <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1754312393816976128">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1754312393816976129">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.AndExpression" typeId="tpee.1080120340718" id="1754312393816976141">
                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1754312393816976155">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1754312393816976150">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1754312393816976145">
                        <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1754312393816976144" />
                        <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="1754312393816976149">
                          <link role="link" roleId="tp25.1138056516764" targetNodeId="uhxm.4806795137173723122" />
                        </node>
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="1754312393816976154">
                        <link role="property" roleId="tp25.1138056395725" targetNodeId="uhxm.4806795137173575895" resolveInfo="path" />
                      </node>
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.IsNotEmptyOperation" typeId="tpee.1225271408483" id="1754312393816976159" />
                  </node>
                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1754312393816976136">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1754312393816976131">
                      <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1754312393816976130" />
                      <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="1754312393816976135">
                        <link role="link" roleId="tp25.1138056516764" targetNodeId="uhxm.4806795137173723122" />
                      </node>
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsNotNullOperation" typeId="tp25.1172008320231" id="1754312393816976140" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="3503961503302369298">
        <property name="name" nameId="tpck.1169194664001" value="canExecute" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6458563986493949357">
          <property name="name" nameId="tpck.1169194664001" value="executorId" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="6458563986493984863" />
        </node>
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.BooleanType" typeId="tpee.1070534644030" id="3503961503302369299" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3503961503302369300" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3503961503302369301">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983619347">
            <node role="expression" roleId="tpee.1068580123156" type="tp68.InternalStaticMethodCall" typeId="tp68.1173990517731" id="7806358006983619348">
              <property name="fqClassName" nameId="tp68.1173992483054" value="ExecutorRunProfileState" />
              <property name="methodName" nameId="tp68.1173992444083" value="canExecute" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7806358006983619388">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6458563986493949357" resolveInfo="executorId" />
              </node>
              <node role="returnType" roleId="tp68.1175794062018" type="tpee.BooleanType" typeId="tpee.1070534644030" id="7806358006983619350" />
              <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="7806358006983619351">
                <property name="propertyName" nameId="tpck.1757699476691236117" value="fqClassName" />
                <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="7806358006983619352">
                  <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983619353">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983619354">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7806358006983619373">
                        <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983619382">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983619377">
                            <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="7806358006983619376" />
                            <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="7806358006983619381">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ojho.3754890006475713427" resolveInfo="getExecutor" />
                            </node>
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="946964771156934269">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i1mc.946964771156905488" resolveInfo="getGeneratedClassName" />
                          </node>
                        </node>
                        <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7806358006983619369">
                          <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7806358006983619356">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="30pf.~NodeNameUtil%dgetNamespace(java%dlang%dString)%cjava%dlang%dString" resolveInfo="getNamespace" />
                            <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="30pf.~NodeNameUtil" resolveInfo="NodeNameUtil" />
                            <node role="&lt;no role&gt;" type="tpck.ExportScopeNamespace" typeId="tpck.2565736246230036151" id="7806358006983619357">
                              <property name="namespace" nameId="tpck.2565736246230036153" value="jetbrains.mps" />
                            </node>
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983619364">
                              <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983619359">
                                <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="7806358006983619358" />
                                <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="7806358006983619363">
                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ojho.3754890006475713427" resolveInfo="getExecutor" />
                                </node>
                              </node>
                              <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="7806358006983619368">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="tpcu.1213877404258" resolveInfo="getFqName" />
                              </node>
                            </node>
                          </node>
                          <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7806358006983619372">
                            <property name="value" nameId="tpee.1070475926801" value="." />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="7806358006983619389">
                <property name="propertyName" nameId="tpck.1757699476691236117" value="methodName" />
                <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="7806358006983619390">
                  <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983619391">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983619392">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983619399">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983619394">
                          <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="7806358006983619393" />
                          <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="7806358006983619398">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ojho.3754890006475713427" resolveInfo="getExecutor" />
                          </node>
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="7806358006983619403">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ojho.7806358006983616236" resolveInfo="getCanExecuteMethodName" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="3503961503302369302">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" />
        </node>
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.TemplateFragment" typeId="tpf8.1095672379244" id="3503961503302369306" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="666608846720191935" />
      <node role="superclass" roleId="tpee.1165602531693" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3503961503302369288">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="mvo7.3503961503302359248" resolveInfo="BaseMpsRunConfiguration" />
      </node>
      <node role="implementedInterface" roleId="tpee.1095933932569" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="666608846720191959">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="mvo7.1252300412034470124" resolveInfo="IPersistentConfiguration" />
      </node>
    </node>
  </root>
  <root id="666608846720246036">
    <node role="contentNode" roleId="tpf8.1092060348987" type="tpee.ClassConcept" typeId="tpee.1068390468198" id="666608846720246044">
      <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
      <property name="name" nameId="tpck.1169194664001" value="RunConfigurationTemplateWeave" />
      <property name="abstractClass" nameId="tpee.1075300953594" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="666608846720246045" />
      <node role="superclass" roleId="tpee.1165602531693" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="666608846720246050">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="mvo7.3503961503302359248" resolveInfo="BaseMpsRunConfiguration" />
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.TemplateFragment" typeId="tpf8.1095672379244" id="666608846720246051" />
      </node>
    </node>
  </root>
  <root id="143080135592811024">
    <node role="contentNode" roleId="tpf8.1092060348987" type="tpee.ClassConcept" typeId="tpee.1068390468198" id="143080135592811026">
      <property name="name" nameId="tpck.1169194664001" value="RunConfigurationTemplate" />
      <node role="staticField" roleId="tpee.1128555889557" type="tpee.StaticFieldDeclaration" typeId="tpee.1070462154015" id="1754312393816949346">
        <property name="name" nameId="tpck.1169194664001" value="ICON" />
        <property name="isFinal" nameId="tpee.1176718929932" value="true" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="1754312393816949347" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1754312393816949348">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="dbrf.~Icon" resolveInfo="Icon" />
        </node>
        <node role="initializer" roleId="tpee.1068431790190" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="1754312393816949349">
          <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.CopySrcNodeMacro" typeId="tpf8.1114706874351" id="1754312393816949350">
            <node role="sourceNodeQuery" roleId="tpf8.1168024447342" type="tpf8.SourceSubstituteMacro_SourceNodeQuery" typeId="tpf8.1168024337012" id="1754312393816949351">
              <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1754312393816949352">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1754312393816949353">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1754312393816949354">
                    <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1754312393816949355" />
                    <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="1754312393816973331">
                      <link role="link" roleId="tp25.1138056516764" targetNodeId="uhxm.4806795137173723122" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.TemplateFragment" typeId="tpf8.1095672379244" id="1754312393816973332" />
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.IfMacro" typeId="tpf8.1118773211870" id="1754312393816976198">
          <link role="mappingLabel" roleId="tpf8.1200912223215" targetNodeId="1754312393816973333" resolveInfo="RunConfigurationToIconPathField" />
          <node role="conditionFunction" roleId="tpf8.1167945861827" type="tpf8.IfMacro_Condition" typeId="tpf8.1167945743726" id="1754312393816976199">
            <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1754312393816976200">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1754312393816976201">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.AndExpression" typeId="tpee.1080120340718" id="1754312393816976213">
                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1754312393816976227">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1754312393816976222">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1754312393816976217">
                        <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1754312393816976216" />
                        <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="1754312393816976221">
                          <link role="link" roleId="tp25.1138056516764" targetNodeId="uhxm.4806795137173723122" />
                        </node>
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="1754312393816976226">
                        <link role="property" roleId="tp25.1138056395725" targetNodeId="uhxm.4806795137173575895" resolveInfo="path" />
                      </node>
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.IsNotEmptyOperation" typeId="tpee.1225271408483" id="1754312393816976231" />
                  </node>
                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1754312393816976208">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1754312393816976203">
                      <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1754312393816976202" />
                      <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="1754312393816976207">
                        <link role="link" roleId="tp25.1138056516764" targetNodeId="uhxm.4806795137173723122" />
                      </node>
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsNotNullOperation" typeId="tp25.1172008320231" id="1754312393816976212" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="143080135592811027" />
      <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="143080135592811028">
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="143080135592811029" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="143080135592811030" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="143080135592811031" />
      </node>
    </node>
  </root>
  <root id="7684700299064368218">
    <node role="contentNode" roleId="tpf8.1092060348987" type="tpee.ClassConcept" typeId="tpee.1068390468198" id="7684700299064368221">
      <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
      <property name="name" nameId="tpck.1169194664001" value="PersistentEditorTmp" />
      <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7684700299064368248">
        <property name="name" nameId="tpck.1169194664001" value="myEditor" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7684700299064368249" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7684700299064368307">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fahd.~SettingsEditor" resolveInfo="SettingsEditor" />
        </node>
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7684700299064368222" />
      <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="7684700299064368316">
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7684700299064368317" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7684700299064368318" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7684700299064368357">
          <property name="name" nameId="tpck.1169194664001" value="editor" />
          <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.LoopMacro" typeId="tpf8.1118786554307" id="7684700299064368358">
            <link role="mappingLabel" roleId="tpf8.1200912223215" targetNodeId="kv8t.5041115067675922970" resolveInfo="PersitentTemplatePropertyToEditorParameter" />
            <node role="sourceNodesQuery" roleId="tpf8.1167952069335" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="7684700299064368359">
              <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="7684700299064368360">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3257967158569773529">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3257967158569773531">
                    <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="3257967158569773530" />
                    <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="946964771156711498">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="hilv.946964771156066510" resolveInfo="getTemplateProperties" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="type" roleId="tpee.5680397130376446158" type="tp68.InternalClassifierType" typeId="tp68.1174914042989" id="7684700299064368375">
            <property name="fqClassName" nameId="tp68.1174914081067" value="SettingsEditor" />
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fahd.~SettingsEditor" resolveInfo="SettingsEditor" />
            <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="7684700299064368376">
              <property name="propertyName" nameId="tpck.1757699476691236117" value="fqClassName" />
              <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="7684700299064368377">
                <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="7684700299064368378">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3257967158569773495">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3257967158569773499">
                      <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="3257967158569773496" />
                      <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="946964771156711505">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="hilv.946964771156066917" resolveInfo="getTypeEditorFqName" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="7684700299064368402">
            <property name="propertyName" nameId="tpck.1757699476691236117" value="name" />
            <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="7684700299064368403">
              <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="7684700299064368404">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7684700299064368405">
                  <node role="expression" roleId="tpee.1068580123156" type="tp25.StaticConceptMethodCall" typeId="tp25.1206019730951" id="946964771156711510">
                    <link role="concept" roleId="tp25.1206019820684" targetNodeId="fb9u.946964771156066585" resolveInfo="PersistentPropertyDeclaration" />
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="hilv.946964771156066836" resolveInfo="removeMyPrefix" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="946964771156711511">
                      <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="946964771156711512" />
                      <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="946964771156711513">
                        <link role="property" roleId="tp25.1138056395725" targetNodeId="tpck.1169194664001" resolveInfo="name" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.TemplateFragment" typeId="tpf8.1095672379244" id="7684700299064368417" />
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="7684700299064368419">
          <property name="propertyName" nameId="tpck.1757699476691236117" value="name" />
          <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="7684700299064368420">
            <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="7684700299064368421">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7684700299064368436">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7684700299064368438">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="7684700299064368437" />
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="946964771156711485">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="hilv.946964771156066479" resolveInfo="getGeneratedEditorName" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3257967158569773507">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3257967158569773509">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="3257967158569773511">
              <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3257967158569773514">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7684700299064368357" resolveInfo="editor" />
                <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="3257967158569773572">
                  <property name="linkRole" nameId="tpck.1757699476691236116" value="variableDeclaration" />
                  <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="3257967158569773573">
                    <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="3257967158569773574">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3257967158569773576">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3257967158569773578">
                          <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="3257967158569773577" />
                          <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="3257967158569773582">
                            <link role="label" roleId="tpf3.1216860049628" targetNodeId="kv8t.5041115067675922970" resolveInfo="PersitentTemplatePropertyToEditorParameter" />
                            <node role="inputNode" roleId="tpf3.1216860049632" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="3257967158569773584" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="3257967158569773510">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7684700299064368248" resolveInfo="myEditor" />
                <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="3257967158569773542">
                  <property name="linkRole" nameId="tpck.1757699476691236116" value="variableDeclaration" />
                  <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="3257967158569773543">
                    <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="3257967158569773544">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3257967158569773545">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3257967158569773547">
                          <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="3257967158569773546" />
                          <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="3257967158569773551">
                            <link role="label" roleId="tpf3.1216860049628" targetNodeId="kv8t.5041115067675922960" resolveInfo="PersitentTemplatePropertyToEditorFieldDeclaration" />
                            <node role="inputNode" roleId="tpf3.1216860049632" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="3257967158569773570" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.LoopMacro" typeId="tpf8.1118786554307" id="3257967158569773516">
              <node role="sourceNodesQuery" roleId="tpf8.1167952069335" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="3257967158569773517">
                <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="3257967158569773518">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3257967158569773519">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3257967158569773521">
                      <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="3257967158569773520" />
                      <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="946964771156711515">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="hilv.946964771156066510" resolveInfo="getTemplateProperties" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="superclass" roleId="tpee.1165602531693" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5812151570929538523">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fahd.~SettingsEditor" resolveInfo="SettingsEditor" />
      </node>
    </node>
  </root>
  <root id="5812151570929690835">
    <node role="contentNode" roleId="tpf8.1092060348987" type="tpee.ClassConcept" typeId="tpee.1068390468198" id="5812151570929690838">
      <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
      <property name="name" nameId="tpck.1169194664001" value="TmpConcept" />
      <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="5812151570929690845">
        <property name="name" nameId="tpck.1169194664001" value="myConfiguration" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="5812151570929690846" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5812151570929690848">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="mvo7.1252300412034470124" resolveInfo="IPersistentConfiguration" />
        </node>
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="5812151570929690844" />
      <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="5812151570929690840">
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="5812151570929690841" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="5812151570929690842" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="5812151570929690843">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5812151570929690849">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="5812151570929690850">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5812151570929690845" resolveInfo="myConfiguration" />
              <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.TemplateFragment" typeId="tpf8.1095672379244" id="5812151570929690851" />
              <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="5812151570929690852">
                <property name="linkRole" nameId="tpck.1757699476691236116" value="variableDeclaration" />
                <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="5812151570929690853">
                  <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="5812151570929690854">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5812151570929690855">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5812151570929690857">
                        <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="5812151570929690856" />
                        <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="5812151570929690861">
                          <link role="label" roleId="tpf3.1216860049628" targetNodeId="5812151570929690873" resolveInfo="ExecutorToConfigurationField" />
                          <node role="inputNode" roleId="tpf3.1216860049632" type="tp25.SNodeTypeCastExpression" typeId="tp25.1140137987495" id="5812151570929690869">
                            <link role="concept" roleId="tp25.1140138128738" targetNodeId="uhxm.2401501559171392633" resolveInfo="RunConfigurationExecutor" />
                            <node role="leftExpression" roleId="tp25.1140138123956" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5812151570929690864">
                              <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="5812151570929690863" />
                              <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_GetContainingRootOperation" typeId="tp25.1171310072040" id="5812151570929690868" />
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
        </node>
      </node>
    </node>
  </root>
  <root id="7806358006983771916">
    <node role="contentNode" roleId="tpf8.1092060348987" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983771920">
      <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.TemplateFragment" typeId="tpf8.1095672379244" id="7806358006983771921" />
      <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="7806358006983771922">
        <property name="linkRole" nameId="tpck.1757699476691236116" value="variableDeclaration" />
        <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="7806358006983771923">
          <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983771924">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983771925">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983771927">
                <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="7806358006983771926" />
                <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="7806358006983771931">
                  <link role="label" roleId="tpf3.1216860049628" targetNodeId="5812151570929690873" resolveInfo="ExecutorToConfigurationField" />
                  <node role="inputNode" roleId="tpf3.1216860049632" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983771934">
                    <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="7806358006983771933" />
                    <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="7806358006983771938">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ojho.7806358006983757897" resolveInfo="getExecutor" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="8018778075741045465">
    <node role="contentNode" roleId="tpf8.1092060348987" type="tp68.InternalPartialFieldReference" typeId="tp68.1177590007607" id="442015021861843842">
      <property name="fieldName" nameId="tp68.1177590059093" value="myDebuggerSettings" />
      <node role="fieldType" roleId="tp68.1177590063781" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="442015021861845477">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="x4jy.~IDebuggerSettings" resolveInfo="IDebuggerSettings" />
      </node>
      <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.TemplateFragment" typeId="tpf8.1095672379244" id="442015021861843844" />
    </node>
  </root>
  <root id="4762811064051417753">
    <node role="contentNode" roleId="tpf8.1092060348987" type="tpee.BlockStatement" typeId="tpee.1082485599095" id="4762811064051420015">
      <node role="statements" roleId="tpee.1082485599096" type="tpee.StatementList" typeId="tpee.1068580123136" id="4762811064051420016">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="4762811064051426896">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="4762811064051426897">
            <property name="name" nameId="tpck.1169194664001" value="_processHandler" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4762811064051426898">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="7jsa.~ProcessHandler" resolveInfo="ProcessHandler" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="4762811064051426911">
              <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.CopySrcNodeMacro" typeId="tpf8.1114706874351" id="4762811064051426912">
                <node role="sourceNodeQuery" roleId="tpf8.1168024447342" type="tpf8.SourceSubstituteMacro_SourceNodeQuery" typeId="tpf8.1168024337012" id="4762811064051426913">
                  <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="4762811064051426914">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4762811064051426915">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4762811064051426916">
                        <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="4762811064051426917" />
                        <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="856705193942038964">
                          <link role="link" roleId="tp25.1138056516764" targetNodeId="uhxm.946964771156870354" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="4762811064051420037">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="4762811064051420038">
            <property name="name" nameId="tpck.1169194664001" value="_consoleView" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4762811064051420039">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="u5xh.~ConsoleViewImpl" resolveInfo="ConsoleViewImpl" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="4762811064051420040">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="4762811064051420041">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="u5xh.~ConsoleViewImpl%d&lt;init&gt;(com%dintellij%dopenapi%dproject%dProject,boolean)" resolveInfo="ConsoleViewImpl" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tp68.InternalVariableReference" typeId="tp68.1176743162354" id="4762811064051420044">
                  <property name="name" nameId="tp68.1176743296073" value="project" />
                  <node role="type" roleId="tp68.1176743202636" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4762811064051420046">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="27v0.~Project" resolveInfo="Project" />
                  </node>
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="4762811064051420043">
                  <property name="value" nameId="tpee.1068580123138" value="false" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4762811064051426886">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4762811064051426887">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4762811064051426888">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4762811064051426897" resolveInfo="_processHandler" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4762811064051426889">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7jsa.~ProcessHandler%daddProcessListener(com%dintellij%dexecution%dprocess%dProcessListener)%cvoid" resolveInfo="addProcessListener" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="4762811064051426890">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="4762811064051426891">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="mvo7.8265043642382453576" resolveInfo="ConsoleProcessListener" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4762811064051426892">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4762811064051420038" resolveInfo="consoleView" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="4762811064051420017">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="4762811064051420018">
            <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="4762811064051420019">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="mvo7.4762811064051417894" resolveInfo="DefaultExecutionResult" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4762811064051426920">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4762811064051426897" resolveInfo="_processHandler" />
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="4762811064051420028">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="4762811064051420029">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="mvo7.4762811064051417839" resolveInfo="DefaultExecutionConsole" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4762811064051420049">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4762811064051420048">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4762811064051420038" resolveInfo="consoleView" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4762811064051426873">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="u5xh.~ConsoleViewImpl%dgetComponent()%cjavax%dswing%dJComponent" resolveInfo="getComponent" />
                    </node>
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="4762811064051426875">
                    <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="4762811064051426876">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4762811064051426877">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4762811064051426879">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4762811064051426878">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4762811064051420038" resolveInfo="consoleView" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4762811064051426883">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="u5xh.~ConsoleViewImpl%ddispose()%cvoid" resolveInfo="dispose" />
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
      </node>
      <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.TemplateFragment" typeId="tpf8.1095672379244" id="4762811064051420032" />
    </node>
  </root>
  <root id="693139443247210143">
    <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.RootTemplateAnnotation" typeId="tpf8.1168619357332" id="693139443247210144" />
    <node role="initBlock" roleId="tp4k.1215279937189" type="tp4k.ApplicationPluginInitBlock" typeId="tp4k.1215278261851" id="693139443247252455">
      <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="693139443247252456">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="693139443247269136">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="693139443247269137">
            <property name="name" nameId="tpck.1169194664001" value="extensionPoint" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="693139443247269138">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="g1dt.~ExtensionPoint" resolveInfo="ExtensionPoint" />
              <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="693139443247269139">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vfxe.~ConfigurationType" resolveInfo="ConfigurationType" />
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="693139443247269140">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="693139443247269141">
                <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="g1dt.~Extensions" resolveInfo="Extensions" />
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="g1dt.~Extensions%dgetArea(com%dintellij%dopenapi%dextensions%dAreaInstance)%ccom%dintellij%dopenapi%dextensions%dExtensionsArea" resolveInfo="getArea" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="693139443247269142" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="693139443247269143">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="g1dt.~ExtensionsArea%dgetExtensionPoint(com%dintellij%dopenapi%dextensions%dExtensionPointName)%ccom%dintellij%dopenapi%dextensions%dExtensionPoint" resolveInfo="getExtensionPoint" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="693139443247269144">
                  <link role="classifier" roleId="tpee.1144433057691" targetNodeId="vfxe.~ConfigurationType" resolveInfo="ConfigurationType" />
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="vfxe.~ConfigurationType%dCONFIGURATION_TYPE_EP" resolveInfo="CONFIGURATION_TYPE_EP" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="693139443247269145">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="693139443247269146">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="693139443247269147">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="693139443247269137" resolveInfo="extensionPoint" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="693139443247269148">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="g1dt.~ExtensionPoint%dregisterExtension(java%dlang%dObject)%cvoid" resolveInfo="registerExtension" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="693139443247269149">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="693139443247269150">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="3754890006475632889" resolveInfo="RunConfigurationKind_Template" />
                  <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="693139443247269151">
                    <property name="linkRole" nameId="tpck.1757699476691236116" value="baseMethodDeclaration" />
                    <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="693139443247269152">
                      <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="693139443247269153">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="693139443247269154">
                          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="693139443247269155">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="693139443247269156">
                              <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="693139443247269157">
                                <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="693139443247269158" />
                                <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="693139443247269159">
                                  <link role="label" roleId="tpf3.1216860049628" targetNodeId="3754890006475707294" resolveInfo="KindToClass" />
                                  <node role="inputNode" roleId="tpf3.1216860049632" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="693139443247269160" />
                                </node>
                              </node>
                              <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="693139443247269161">
                                <link role="link" roleId="tp25.1138056546658" targetNodeId="tpee.1068390468201" />
                              </node>
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tp2q.GetFirstOperation" typeId="tp2q.1165525191778" id="693139443247269162" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.LoopMacro" typeId="tpf8.1118786554307" id="693139443247269163">
            <node role="sourceNodesQuery" roleId="tpf8.1167952069335" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="693139443247269164">
              <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="693139443247269165">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="693139443247269166">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="693139443247269167">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="693139443247269168">
                      <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="693139443247269169" />
                      <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetInputModel" typeId="tpf3.1217004708011" id="693139443247269170" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tp25.Model_RootsOperation" typeId="tp25.1171315804604" id="693139443247269171">
                      <link role="concept" roleId="tp25.1171315804605" targetNodeId="uhxm.2401501559171345994" resolveInfo="RunConfigurationKind" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="disposeBlock" roleId="tp4k.1215279937190" type="tp4k.ApplicationPluginDisposeBlock" typeId="tp4k.1215278396618" id="693139443247252457">
      <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="693139443247252458">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="693139443247299294">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="693139443247299295">
            <property name="name" nameId="tpck.1169194664001" value="extensionPoint" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="693139443247299296">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="g1dt.~ExtensionPoint" resolveInfo="ExtensionPoint" />
              <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="693139443247299297">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vfxe.~ConfigurationType" resolveInfo="ConfigurationType" />
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="693139443247299298">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="693139443247299299">
                <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="g1dt.~Extensions" resolveInfo="Extensions" />
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="g1dt.~Extensions%dgetArea(com%dintellij%dopenapi%dextensions%dAreaInstance)%ccom%dintellij%dopenapi%dextensions%dExtensionsArea" resolveInfo="getArea" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="693139443247299300" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="693139443247299301">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="g1dt.~ExtensionsArea%dgetExtensionPoint(com%dintellij%dopenapi%dextensions%dExtensionPointName)%ccom%dintellij%dopenapi%dextensions%dExtensionPoint" resolveInfo="getExtensionPoint" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="693139443247299302">
                  <link role="classifier" roleId="tpee.1144433057691" targetNodeId="vfxe.~ConfigurationType" resolveInfo="ConfigurationType" />
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="vfxe.~ConfigurationType%dCONFIGURATION_TYPE_EP" resolveInfo="CONFIGURATION_TYPE_EP" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="693139443247299303">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="693139443247299304">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="693139443247299305">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="693139443247299295" resolveInfo="extensionPoint" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="693139443247299306">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="g1dt.~ExtensionPoint%dregisterExtension(java%dlang%dObject)%cvoid" resolveInfo="registerExtension" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="693139443247299307">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="693139443247299308">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="3754890006475632889" resolveInfo="RunConfigurationKind_Template" />
                  <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="693139443247299309">
                    <property name="linkRole" nameId="tpck.1757699476691236116" value="baseMethodDeclaration" />
                    <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="693139443247299310">
                      <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="693139443247299311">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="693139443247299312">
                          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="693139443247299313">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="693139443247299314">
                              <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="693139443247299315">
                                <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="693139443247299316" />
                                <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="693139443247299317">
                                  <link role="label" roleId="tpf3.1216860049628" targetNodeId="3754890006475707294" resolveInfo="KindToClass" />
                                  <node role="inputNode" roleId="tpf3.1216860049632" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="693139443247299318" />
                                </node>
                              </node>
                              <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="693139443247299319">
                                <link role="link" roleId="tp25.1138056546658" targetNodeId="tpee.1068390468201" />
                              </node>
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tp2q.GetFirstOperation" typeId="tp2q.1165525191778" id="693139443247299320" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.LoopMacro" typeId="tpf8.1118786554307" id="693139443247299321">
            <node role="sourceNodesQuery" roleId="tpf8.1167952069335" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="693139443247299322">
              <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="693139443247299323">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="693139443247299324">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="693139443247299325">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="693139443247299326">
                      <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="693139443247299327" />
                      <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetInputModel" typeId="tpf3.1217004708011" id="693139443247299328" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tp25.Model_RootsOperation" typeId="tp25.1171315804604" id="693139443247299329">
                      <link role="concept" roleId="tp25.1171315804605" targetNodeId="uhxm.2401501559171345994" resolveInfo="RunConfigurationKind" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="1529002684853883835">
    <node role="contentNode" roleId="tpf8.1092060348987" type="tp68.InternalVariableReference" typeId="tp68.1176743162354" id="666608846720107709">
      <property name="name" nameId="tp68.1176743296073" value="configuration" />
      <node role="type" roleId="tp68.1176743202636" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="666608846720139639">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="mvo7.1252300412034470124" resolveInfo="IPersistentConfiguration" />
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="8147019390234496483">
          <property name="linkRole" nameId="tpck.1757699476691236116" value="classifier" />
          <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="8147019390234496484">
            <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="8147019390234496485">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="8147019390234548187">
                <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="8147019390234548188">
                  <property name="name" nameId="tpck.1169194664001" value="configurationType" />
                  <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="8147019390234548189">
                    <link role="concept" roleId="tp25.1138405853777" targetNodeId="fb9u.946964771156066332" resolveInfo="PersistentConfigurationType" />
                  </node>
                  <node role="initializer" roleId="tpee.1068431790190" type="tpd4.CoerceExpression" typeId="tpd4.1178870617262" id="8147019390234548190">
                    <node role="pattern" roleId="tpd4.1178870894644" type="tpd4.ConceptReference" typeId="tpd4.1174642788531" id="8147019390234548191">
                      <property name="name" nameId="tpck.1169194664001" value="persistentConfigurationType" />
                      <link role="concept" roleId="tpd4.1174642800329" targetNodeId="fb9u.946964771156066332" resolveInfo="PersistentConfigurationType" />
                    </node>
                    <node role="nodeToCoerce" roleId="tpd4.1178870894645" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8147019390234548192">
                      <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="8147019390234548193" />
                      <node role="operation" roleId="tpee.1197027833540" type="tpd4.Node_TypeOperation" typeId="tpd4.1176544042499" id="8147019390234548194" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="8147019390234548196">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8147019390234548198">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="8147019390234548197" />
                  <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="8147019390234548202">
                    <link role="label" roleId="tpf3.1216860049628" targetNodeId="kv8t.5041115067675922953" resolveInfo="ConfigurationToClass" />
                    <node role="inputNode" roleId="tpf3.1216860049632" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8147019390234548206">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="8147019390234548204">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8147019390234548188" resolveInfo="configurationType" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="946964771156711460">
                        <link role="link" roleId="tp25.1138056516764" targetNodeId="fb9u.946964771156066333" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.TemplateFragment" typeId="tpf8.1095672379244" id="666608846720139640" />
    </node>
  </root>
  <root id="4806795137173735553">
    <node role="contentNode" roleId="tpf8.1092060348987" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="4806795137173735560">
      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="205.~IconManager%dloadIcon(java%dlang%dString,boolean)%cjavax%dswing%dIcon" resolveInfo="loadIcon" />
      <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="205.~IconManager" resolveInfo="IconManager" />
      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="4806795137173735561">
        <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="ws6q.~MacrosUtil" resolveInfo="MacrosUtil" />
        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ws6q.~MacrosUtil%dexpandPath(java%dlang%dString,java%dlang%dString)%cjava%dlang%dString" resolveInfo="expandPath" />
        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="4806795137173735562">
          <property name="value" nameId="tpee.1070475926801" value="${language_descriptor}/icons/runApp.png" />
        </node>
        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="4806795137173735563">
          <property name="value" nameId="tpee.1070475926801" value="jetbrains.mps.lang.plugin" />
        </node>
      </node>
      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="4806795137173735564">
        <property name="value" nameId="tpee.1068580123138" value="true" />
      </node>
      <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.TemplateFragment" typeId="tpf8.1095672379244" id="4806795137173746001" />
      <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.IfMacro" typeId="tpf8.1118773211870" id="4806795137173735565">
        <node role="conditionFunction" roleId="tpf8.1167945861827" type="tpf8.IfMacro_Condition" typeId="tpf8.1167945743726" id="4806795137173735566">
          <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="4806795137173735567">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4806795137173735568">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="4806795137173735569">
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="4806795137173735570" />
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4806795137173735571">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="4806795137173735572" />
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="4806795137173746002">
                    <link role="property" roleId="tp25.1138056395725" targetNodeId="uhxm.4806795137173575895" resolveInfo="path" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="alternativeConsequence" roleId="tpf8.1194989344771" type="tpf8.InlineTemplate_RuleConsequence" typeId="tpf8.1177093525992" id="4806795137173735574">
          <node role="templateNode" roleId="tpf8.1177093586806" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="4806795137173735575">
            <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="205.~IconManager" resolveInfo="IconManager" />
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="205.~IconManager%dloadIcon(java%dlang%dString,boolean)%cjavax%dswing%dIcon" resolveInfo="loadIcon" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="4806795137173735576">
              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="ws6q.~MacrosUtil" resolveInfo="MacrosUtil" />
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ws6q.~MacrosUtil%dexpandPath(java%dlang%dString,java%dlang%dString)%cjava%dlang%dString" resolveInfo="expandPath" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="4806795137173735577">
                <property name="value" nameId="tpee.1070475926801" value="" />
                <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="4806795137173735578">
                  <property name="propertyName" nameId="tpck.1757699476691236117" value="value" />
                  <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="4806795137173735579">
                    <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="4806795137173735580">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="4806795137173735581">
                        <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="4806795137173735582">
                          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4806795137173735583">
                            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4806795137173735584">
                              <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="4806795137173735585" />
                              <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_ShowWarningMessage" typeId="tpf3.1217969995796" id="4806795137173735586">
                                <node role="messageText" roleId="tpf3.1217960314448" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="4806795137173735587">
                                  <property name="value" nameId="tpee.1070475926801" value="Icon path is stored relative to project home. This may not work in builds (packaged)." />
                                </node>
                                <node role="referenceNode" roleId="tpf3.1217960407512" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="4806795137173735588" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4806795137173735589">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4806795137173735590">
                            <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="4806795137173735591" />
                            <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="4806795137173746003">
                              <link role="property" roleId="tp25.1138056395725" targetNodeId="uhxm.4806795137173575895" resolveInfo="path" />
                            </node>
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4806795137173735593">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dstartsWith(java%dlang%dString)%cboolean" resolveInfo="startsWith" />
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="4806795137173735594">
                              <link role="classifier" roleId="tpee.1144433057691" targetNodeId="30pf.~Macros" resolveInfo="Macros" />
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="30pf.~Macros%dMPS_HOME" resolveInfo="MPS_HOME" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4806795137173735595">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4806795137173735596">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4806795137173735597">
                            <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="4806795137173735598" />
                            <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="4806795137173746004">
                              <link role="property" roleId="tp25.1138056395725" targetNodeId="uhxm.4806795137173575895" resolveInfo="path" />
                            </node>
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4806795137173735600">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dreplaceAll(java%dlang%dString,java%dlang%dString)%cjava%dlang%dString" resolveInfo="replaceAll" />
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="4806795137173735601">
                              <property name="value" nameId="tpee.1070475926801" value="\\\\" />
                            </node>
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="4806795137173735602">
                              <property name="value" nameId="tpee.1070475926801" value="\\\\\\\\" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="4806795137173735603">
                <property name="value" nameId="tpee.1070475926801" value="" />
                <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="4806795137173735604">
                  <property name="propertyName" nameId="tpck.1757699476691236117" value="value" />
                  <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="4806795137173735605">
                    <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="4806795137173735606">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="4806795137173735607">
                        <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="4806795137173735608">
                          <property name="name" nameId="tpck.1169194664001" value="module" />
                          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4806795137173735609">
                            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~IModule" resolveInfo="IModule" />
                          </node>
                          <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3931156975943057559">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3931156975943057554">
                              <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="3931156975943057553" />
                              <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetInvocationContext" typeId="tpf3.1224102704684" id="3931156975943057558" />
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3931156975943057563">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkfb.~IOperationContext%dgetModule()%cjetbrains%dmps%dproject%dIModule" resolveInfo="getModule" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="4806795137173735622">
                        <node role="expression" roleId="tpee.1068581517676" type="tpee.TernaryOperatorExpression" typeId="tpee.1163668896201" id="4806795137173735623">
                          <node role="ifTrue" roleId="tpee.1163668922816" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="4806795137173735624" />
                          <node role="ifFalse" roleId="tpee.1163668934364" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4806795137173735625">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4806795137173735626">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4806795137173735608" resolveInfo="module" />
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4806795137173735627">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="afxk.~IModule%dgetModuleFqName()%cjava%dlang%dString" resolveInfo="getModuleFqName" />
                            </node>
                          </node>
                          <node role="condition" roleId="tpee.1163668914799" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="4806795137173735628">
                            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="4806795137173735629" />
                            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4806795137173735630">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4806795137173735608" resolveInfo="module" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="4806795137173735631">
              <property name="value" nameId="tpee.1068580123138" value="true" />
            </node>
            <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.IfMacro" typeId="tpf8.1118773211870" id="3931156975943044416">
              <node role="conditionFunction" roleId="tpf8.1167945861827" type="tpf8.IfMacro_Condition" typeId="tpf8.1167945743726" id="3931156975943044417">
                <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="3931156975943044418">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3931156975943057545">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.NotExpression" typeId="tpee.1081516740877" id="3931156975943057569">
                      <node role="expression" roleId="tpee.1081516765348" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3931156975943057547">
                        <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="3931156975943057546" />
                        <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="3931156975943057551">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ojho.1035654111815830674" resolveInfo="isResoureIcon" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3931156975943057564">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3931156975943057565">
                              <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="3931156975943057566" />
                              <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetInvocationContext" typeId="tpf3.1224102704684" id="3931156975943057567" />
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3931156975943057568">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkfb.~IOperationContext%dgetModule()%cjetbrains%dmps%dproject%dIModule" resolveInfo="getModule" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="alternativeConsequence" roleId="tpf8.1194989344771" type="tpf8.InlineTemplate_RuleConsequence" typeId="tpf8.1177093525992" id="3931156975943075213">
                <node role="templateNode" roleId="tpf8.1177093586806" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="3931156975943075215">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="3931156975943075216">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="dbrf.~ImageIcon%d&lt;init&gt;(java%dnet%dURL)" resolveInfo="ImageIcon" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3931156975943075217">
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3931156975943075219">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Class%dgetResource(java%dlang%dString)%cjava%dnet%dURL" resolveInfo="getResource" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="3931156975943075220">
                          <property name="value" nameId="tpee.1070475926801" value="pathToIcon" />
                          <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="3931156975943075221">
                            <property name="propertyName" nameId="tpck.1757699476691236117" value="value" />
                            <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="3931156975943075222">
                              <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="3931156975943075223">
                                <node role="statement" roleId="tpee.1068581517665" type="tpee.SingleLineComment" typeId="tpee.6329021646629104954" id="3931156975943075224">
                                  <node role="commentPart" roleId="tpee.6329021646629175155" type="tpee.TextCommentPart" typeId="tpee.6329021646629104957" id="3931156975943075225">
                                    <property name="text" nameId="tpee.6329021646629104958" value="todo this is a hack to support icons in plugins" />
                                  </node>
                                </node>
                                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3931156975943075226">
                                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3931156975943075227">
                                    <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="3931156975943075228" />
                                    <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="3931156975943075244">
                                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ojho.1035654111815830578" resolveInfo="getIconResourcePath" />
                                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3931156975943075251">
                                        <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3931156975943075246">
                                          <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="3931156975943075245" />
                                          <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetInvocationContext" typeId="tpf3.1224102704684" id="3931156975943075250" />
                                        </node>
                                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3931156975943075255">
                                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkfb.~IOperationContext%dgetModule()%cjetbrains%dmps%dproject%dIModule" resolveInfo="getModule" />
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
                      <node role="operand" roleId="tpee.1197027771414" type="tp68.InternalClassExpression" typeId="tp68.1174478619261" id="4762811064051191931">
                        <node role="type" roleId="tp68.1174478663778" type="tp68.InternalClassifierType" typeId="tp68.1174914042989" id="4762811064051191933">
                          <property name="fqClassName" nameId="tp68.1174914081067" value="Configuration" />
                          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~Object" resolveInfo="Object" />
                          <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="4762811064051191934">
                            <property name="propertyName" nameId="tpck.1757699476691236117" value="fqClassName" />
                            <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="4762811064051191935">
                              <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="4762811064051191936">
                                <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="4762811064051191938">
                                  <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="4762811064051191939">
                                    <property name="name" nameId="tpck.1169194664001" value="root" />
                                    <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="4762811064051191940" />
                                    <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4762811064051191941">
                                      <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="4762811064051191942" />
                                      <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_GetContainingRootOperation" typeId="tp25.1171310072040" id="4762811064051191943" />
                                    </node>
                                  </node>
                                </node>
                                <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="4762811064051191944">
                                  <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="4762811064051191945">
                                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="4762811064051191946">
                                      <node role="expression" roleId="tpee.1068581517676" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2309921853483551021">
                                        <node role="operand" roleId="tpee.1197027771414" type="tp25.SNodeTypeCastExpression" typeId="tp25.1140137987495" id="2309921853483551019">
                                          <link role="concept" roleId="tp25.1140138128738" targetNodeId="id7i.946964771156905387" resolveInfo="IGeneratedToClass" />
                                          <node role="leftExpression" roleId="tp25.1140138123956" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="2309921853483551020">
                                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4762811064051191939" resolveInfo="root" />
                                          </node>
                                        </node>
                                        <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="946964771156934254">
                                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i1mc.946964771156905503" resolveInfo="getFullName" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4762811064051191960">
                                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4762811064051191961">
                                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4762811064051191939" resolveInfo="root" />
                                    </node>
                                    <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsInstanceOfOperation" typeId="tp25.1139621453865" id="4762811064051191962">
                                      <node role="conceptArgument" roleId="tp25.1177027386292" type="tp25.RefConcept_Reference" typeId="tp25.1177026924588" id="946964771156934253">
                                        <link role="conceptDeclaration" roleId="tp25.1177026940964" targetNodeId="id7i.946964771156905387" resolveInfo="IGeneratedToClass" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="4762811064051191984">
                                  <node role="expression" roleId="tpee.1068581517676" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4762811064051191985">
                                    <node role="operand" roleId="tpee.1197027771414" type="tp25.SNodeTypeCastExpression" typeId="tp25.1140137987495" id="4762811064051191986">
                                      <link role="concept" roleId="tp25.1140138128738" targetNodeId="tpck.1169194658468" resolveInfo="INamedConcept" />
                                      <node role="leftExpression" roleId="tp25.1140138123956" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4762811064051191987">
                                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4762811064051191939" resolveInfo="root" />
                                      </node>
                                    </node>
                                    <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="4762811064051191988">
                                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="tpcu.1213877404258" resolveInfo="getFqName" />
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
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
</model>


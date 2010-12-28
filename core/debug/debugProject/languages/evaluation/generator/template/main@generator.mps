<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:2511ce90-005c-4fc7-b4ac-484077b841e4(jetbrains.mps.debug.evaluation.generator.template.main@generator)">
  <persistence version="7" />
  <language namespace="b401a680-8325-4110-8fd3-84331ff25bef(jetbrains.mps.lang.generator)" />
  <language namespace="d7706f63-9be2-479c-a3da-ae92af1e64d5(jetbrains.mps.lang.generator.generationContext)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="ceab5195-25ea-4f22-9b92-103b95ca8c0c(jetbrains.mps.lang.core)" />
  <language namespace="13744753-c81f-424a-9c1b-cf8943bf4e86(jetbrains.mps.lang.sharedConcepts)" />
  <language namespace="fd392034-7849-419d-9071-12563d152375(jetbrains.mps.baseLanguage.closures)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <language namespace="df345b11-b8c7-4213-ac66-48d2a9b75d88(jetbrains.mps.baseLanguageInternal)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <import index="8sls" modelUID="r:3a27a6eb-dfce-419d-9e4c-ca44cc01a2e2(jetbrains.mps.debug.evaluation.structure)" version="-1" />
  <import index="mzqd" modelUID="f:java_stub#jetbrains.mps.debug.evaluation(jetbrains.mps.debug.evaluation@java_stub)" version="-1" />
  <import index="mtzj" modelUID="f:java_stub#jetbrains.mps.debug.runtime(jetbrains.mps.debug.runtime@java_stub)" version="-1" />
  <import index="7hmr" modelUID="f:java_stub#jetbrains.mps.debug.evaluation.proxies(jetbrains.mps.debug.evaluation.proxies@java_stub)" version="-1" />
  <import index="tpee" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <import index="tp25" modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" implicit="yes" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="tpf8" modelUID="r:00000000-0000-4000-0000-011c895902e8(jetbrains.mps.lang.generator.structure)" version="2" implicit="yes" />
  <import index="sbn7" modelUID="r:2511ce90-005c-4fc7-b4ac-484077b841e4(jetbrains.mps.debug.evaluation.generator.template.main@generator)" version="-1" implicit="yes" />
  <roots>
    <node type="tpf8.MappingConfiguration" typeId="tpf8.1095416546421" id="1620955434532218412">
      <property name="name" nameId="tpck.1169194664001" value="main" />
    </node>
    <node type="tpee.ClassConcept" typeId="tpee.1068390468198" id="1620955434532219968">
      <property name="name" nameId="tpck.1169194664001" value="EvaluatorInstance" />
    </node>
  </roots>
  <root id="1620955434532218412">
    <node role="mappingLabel" roleId="tpf8.1200911492601" type="tpf8.MappingLabelDeclaration" typeId="tpf8.1200911316486" id="3580153239052993233">
      <property name="name" nameId="tpck.1169194664001" value="map_EvaluatorConceptToClassConcept" />
      <link role="sourceConcept" roleId="tpf8.1200911342686" targetNodeId="8sls.6036237525966182693" resolveInfo="EvaluatorConcept" />
      <link role="targetConcept" roleId="tpf8.1200913004646" targetNodeId="tpee.1068390468198" resolveInfo="ClassConcept" />
    </node>
    <node role="rootMappingRule" roleId="tpf8.1167514678247" type="tpf8.Root_MappingRule" typeId="tpf8.1167514355419" id="1620955434532218413">
      <link role="applicableConcept" roleId="tpf8.1167169349424" targetNodeId="8sls.6036237525966182693" resolveInfo="EvaluatorConcept" />
      <link role="template" roleId="tpf8.1167514355421" targetNodeId="1620955434532219968" resolveInfo="EvaluatorInstance" />
      <link role="labelDeclaration" roleId="tpf8.1200917515464" targetNodeId="3580153239052993233" resolveInfo="map_EvaluatorConceptToClassConcept" />
    </node>
  </root>
  <root id="1620955434532219968">
    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1620955434532219969" />
    <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="1620955434532219970">
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="1620955434532219971" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1620955434532219972" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1620955434532219973">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.SuperConstructorInvocation" typeId="tpee.1070475587102" id="1620955434532226505">
          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="mzqd.~Evaluator%d&lt;init&gt;(jetbrains%dmps%ddebug%druntime%dJavaUiState)" resolveInfo="Evaluator" />
          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1620955434532226506">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1620955434532226501" resolveInfo="uiState" />
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1620955434532226501">
        <property name="name" nameId="tpck.1169194664001" value="uiState" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2414959769603892310">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="mtzj.~JavaUiState" resolveInfo="JavaUiState" />
        </node>
      </node>
    </node>
    <node role="rootTemplateAnnotation$attribute" type="tpf8.RootTemplateAnnotation" typeId="tpf8.1168619357332" id="1620955434532219974">
      <link role="applicableConcept" roleId="tpf8.1168619429071" targetNodeId="8sls.6036237525966182693" resolveInfo="EvaluatorConcept" />
    </node>
    <node role="superclass" roleId="tpee.1165602531693" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1620955434532220119">
      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="mzqd.~Evaluator" resolveInfo="Evaluator" />
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="1620955434532226507">
      <property name="name" nameId="tpck.1169194664001" value="evaluate" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1620955434532226508" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8569898505350922739">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="7hmr.~IValueProxy" resolveInfo="IValueProxy" />
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1620955434532226510">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="1496492112286760823">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="1496492112286760824">
            <property name="name" nameId="tpck.1169194664001" value="lowLevelVar" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.IntegerType" typeId="tpee.1070534370425" id="1496492112286760825" />
          </node>
          <node role="nodeMacro$attribute" type="tpf8.CopySrcListMacro" typeId="tpf8.1114729360583" id="1496492112286760827">
            <node role="sourceNodesQuery" roleId="tpf8.1168278589236" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="1496492112286760828">
              <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1496492112286760829">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1496492112286760830">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1496492112286760832">
                    <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1496492112286760831" />
                    <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="1496492112286760836">
                      <link role="link" roleId="tp25.1138056546658" targetNodeId="8sls.6036237525966243735" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.Statement" typeId="tpee.1068580123157" id="3256629802151523251">
          <node role="nodeMacro$attribute" type="tpf8.CopySrcNodeMacro" typeId="tpf8.1114706874351" id="5885457541676789229">
            <node role="sourceNodeQuery" roleId="tpf8.1168024447342" type="tpf8.SourceSubstituteMacro_SourceNodeQuery" typeId="tpf8.1168024337012" id="5885457541676789230">
              <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="5885457541676789231">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5885457541676789232">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5885457541676789234">
                    <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="5885457541676789233" />
                    <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="5885457541676789238">
                      <link role="link" roleId="tp25.1138056516764" targetNodeId="8sls.6851930645646735510" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="throwsItem" roleId="tpee.1164879685961" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4142860792081542519">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="mzqd.~EvaluationException" resolveInfo="EvaluationException" />
      </node>
    </node>
  </root>
</model>


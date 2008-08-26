<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.quickQueryLanguage.generator.template.main">
  <persistence version="1" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.transformation.TLBase">
    <languageAspect modelUID="jetbrains.mps.transformation.TLBase.constraints" version="16" />
    <languageAspect modelUID="jetbrains.mps.transformation.TLBase.structure" version="1" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.constraints" version="83" />
    <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.constraints" version="21" />
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="1" />
  </language>
  <languageAspect modelUID="jetbrains.mps.bootstrap.structureLanguage.constraints" version="11" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.core.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.closures.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.sharedConcepts.constraints" version="0" />
  <maxImportIndex value="7" />
  <import index="1" modelUID="jetbrains.mps.quickQueryLanguage.structure" version="-1" />
  <import index="2" modelUID="java.lang@java_stub" version="-1" />
  <import index="3" modelUID="jetbrains.mps.smodel@java_stub" version="-1" />
  <import index="4" modelUID="jetbrains.mps.util@java_stub" version="-1" />
  <import index="5" modelUID="jetbrains.mps.quickQueryLanguage.runtime@java_stub" version="-1" />
  <import index="6" modelUID="java.io@java_stub" version="-1" />
  <import index="7" modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1218800262437">
    <property name="name" value="Query" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1218800262438" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1218800262439">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1218800262440" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1218800262441" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1218800262442" />
    </node>
    <node role="rootTemplateAnnotation$attribute" type="jetbrains.mps.transformation.TLBase.structure.RootTemplateAnnotation" id="1218800262443">
      <link role="applicableConcept" targetNodeId="1.1219752983955" resolveInfo="BaseQuery" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1219751334125">
      <property name="name" value="doReplace" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1219751334126" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219751334127" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1219751344082">
        <property name="name" value="node" />
        <property name="isFinal" value="false" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219751344083">
          <link role="classifier" targetNodeId="3.~SNode" resolveInfo="SNode" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219760682961">
        <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.CopySrcNodeMacro" id="1219760682962">
          <node role="sourceNodeQuery" type="jetbrains.mps.transformation.TLBase.structure.SourceSubstituteMacro_SourceNodeQuery" id="1219760682963">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219760682964">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1219760682965">
                <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219760682966">
                  <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1219760682967" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1219760682968">
                    <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1219760682969">
                      <link role="conceptDeclaration" targetNodeId="1.1219745756351" resolveInfo="ReplaceModelQuery" />
                    </node>
                  </node>
                </node>
                <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219760682970">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1219760682971">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219760682972">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219760682973">
                        <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1219760682974">
                          <link role="concept" targetNodeId="1.1219745756351" resolveInfo="ReplaceModelQuery" />
                          <node role="leftExpression" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1219760682975" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1219760682976">
                          <link role="link" targetNodeId="1.1219746108290" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1219760682977">
                        <link role="link" targetNodeId="7.1137022507850" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1219760682978">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1219760682979">
                  <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1219760682980">
                    <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1219760682981">
                      <link role="concept" targetNodeId="7.1068580123136" resolveInfo="StatementList" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1218800408514">
      <property name="name" value="getConcept" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1218800418768">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1218800408516">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1218800459697">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1218801178375">
            <property name="value" value="concept.fq.name" />
            <node role="propertyMacro$property_attribute$value" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro" id="1218801182939">
              <node role="propertyValueFunction" type="jetbrains.mps.transformation.TLBase.structure.PropertyMacro_GetPropertyValue" id="1218801182940">
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1218801182941">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1218801213466">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1218801216736">
                      <link role="baseMethodDeclaration" targetNodeId="4.~NameUtil.nodeFQName(jetbrains.mps.smodel.SNode):java.lang.String" resolveInfo="nodeFQName" />
                      <link role="classConcept" targetNodeId="4.~NameUtil" resolveInfo="NameUtil" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1218801218629">
                        <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1218801218128" />
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1219755671416">
                          <link role="link" targetNodeId="1.1219753034317" />
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
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1218800408517" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1218800425035">
      <property name="name" value="isSatisfies" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1218800439774" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1218800425037" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1218800425038">
        <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.structure.CopySrcNodeMacro" id="1218801162581">
          <node role="sourceNodeQuery" type="jetbrains.mps.transformation.TLBase.structure.SourceSubstituteMacro_SourceNodeQuery" id="1218801162582">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1218801162583">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1218801164912">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1218801167746">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1218801165336">
                    <node role="operand" type="jetbrains.mps.transformation.TLBase.structure.TemplateFunctionParameter_sourceNode" id="1218801164913" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1219755688542">
                      <link role="link" targetNodeId="1.1219753024878" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1218801168812">
                    <link role="link" targetNodeId="7.1137022507850" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1218800629478">
        <property name="name" value="node" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1218800629479">
          <link role="classifier" targetNodeId="3.~SNode" resolveInfo="SNode" />
        </node>
      </node>
    </node>
    <node role="implementedInterface" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1218802969852">
      <link role="classifier" targetNodeId="5.~Query" resolveInfo="Query" />
    </node>
  </node>
  <node type="jetbrains.mps.transformation.TLBase.structure.MappingConfiguration" id="1218801404183">
    <property name="name" value="main" />
    <node role="rootMappingRule" type="jetbrains.mps.transformation.TLBase.structure.Root_MappingRule" id="1218801423684">
      <property name="applyToConceptInheritors" value="true" />
      <link role="template" targetNodeId="1218800262437" resolveInfo="BaseQuery" />
      <link role="applicableConcept" targetNodeId="1.1219752983955" resolveInfo="BaseQuery" />
    </node>
  </node>
</model>


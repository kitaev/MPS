<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:00000000-0000-4000-0000-011c895902e2(jetbrains.mps.transformation.TLBase.constraints)">
  <persistence version="3" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.bootstrap.constraintsLanguage" />
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.bootstrap.sharedConcepts" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590307(jetbrains.mps.bootstrap.constraintsLanguage.constraints)" version="9" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959030d(jetbrains.mps.bootstrap.constraintsLanguage.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ba(jetbrains.mps.bootstrap.sharedConcepts.constraints)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902fb(jetbrains.mps.bootstrap.smodelLanguage.constraints)" version="21" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.bootstrap.smodelLanguage.structure)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ae(jetbrains.mps.bootstrap.helgins.constraints)" version="17" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590328(jetbrains.mps.baseLanguage.ext.collections.lang.constraints)" version="6" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.ext.collections.lang.structure)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590340(jetbrains.mps.patterns.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590283(jetbrains.mps.core.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902e8(jetbrains.mps.transformation.TLBase.structure)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.closures.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902e2(jetbrains.mps.transformation.TLBase.constraints)" version="16" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959028c(jetbrains.mps.bootstrap.structureLanguage.constraints)" version="11" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590334(jetbrains.mps.closures.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895903e4(jetbrains.mps.internal.collections.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902db(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <maxImportIndex value="19" />
  <import index="1" modelUID="r:00000000-0000-4000-0000-011c895902e8(jetbrains.mps.transformation.TLBase.structure)" version="1" />
  <import index="2" modelUID="f:java_stub#jetbrains.mps.transformation.TLBase.constraints(jetbrains.mps.transformation.TLBase.constraints@java_stub)" version="-1" />
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstraints" id="1213104837507">
    <link role="concept" targetNodeId="1.1167514355419" resolveInfo="Root_MappingRule" />
    <node role="referent" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1213104837919">
      <link role="applicableLink" targetNodeId="1.1167514355421" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1213104837920">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213104837921">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213104837922">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1214866672668">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1214866672670">
                <link role="baseMethodDeclaration" targetNodeId="2.~MappingRuleTemplateNodeSearchScope.&lt;init&gt;(jetbrains.mps.smodel.SModel,jetbrains.mps.smodel.IScope)" resolveInfo="MappingRuleTemplateNodeSearchScope" />
                <node role="actualArgument" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_model" id="1213104837924" />
                <node role="actualArgument" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_scope" id="1213104837925" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstraints" id="1213104840277">
    <link role="concept" targetNodeId="1.1167087469898" resolveInfo="CreateRootRule" />
    <node role="referent" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint" id="1213104840278">
      <link role="applicableLink" targetNodeId="1.1167087469901" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1213104840279">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213104840280">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213104840281">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1214866672584">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1214866672586">
                <link role="baseMethodDeclaration" targetNodeId="2.~MappingRuleTemplateNodeSearchScope.&lt;init&gt;(jetbrains.mps.smodel.SModel,jetbrains.mps.smodel.IScope)" resolveInfo="MappingRuleTemplateNodeSearchScope" />
                <node role="actualArgument" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_model" id="1213104840283" />
                <node role="actualArgument" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_scope" id="1213104840284" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>


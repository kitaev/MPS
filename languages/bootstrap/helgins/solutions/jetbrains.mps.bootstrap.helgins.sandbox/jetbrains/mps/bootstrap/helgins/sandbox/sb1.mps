<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.bootstrap.helgins.sandbox.sb1">
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <language namespace="jetbrains.mps.bootstrap.helgins" />
  <language namespace="jetbrains.mps.bootstrap.helgins.test" />
  <language namespace="jetbrains.mps.patterns" />
  <language namespace="jetbrains.mps.helgins" />
  <language namespace="jetbrains.mpswiki.queryLanguage" />
  <maxImportIndex value="5" />
  <import index="1" modelUID="java.lang@java_stub" />
  <import index="2" modelUID="jetbrains.mps.smodel@java_stub" />
  <import index="3" modelUID="java.util@java_stub" />
  <import index="4" modelUID="jetbrains.mps.baseLanguage.structure" />
  <import index="5" modelUID="java.io@java_stub" />
  <node type="jetbrains.mps.helgins.Rule" id="1177681456834">
    <property name="name" value="rrr" />
    <node role="statements" type="jetbrains.mps.helgins.StatementList" id="1177681456835">
      <node role="statement" type="jetbrains.mps.helgins.NewVarStatement" id="1177760450593">
        <node role="var" type="jetbrains.mps.helgins.NewTypeVarDeclaration" id="1177760450594">
          <property name="name" value="DDD" />
        </node>
      </node>
      <node role="statement" type="jetbrains.mps.helgins.GiveTypeStatement" id="1177760460580">
        <node role="type" type="jetbrains.mps.helgins.AdaptTypeExpression" id="1177760945970">
          <node role="typeExpr" type="jetbrains.mps.helgins.TypeVarReference" id="1177760949099">
            <link role="typeVar" targetNodeId="1177760450594" resolveInfo="DDD" />
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode" type="jetbrains.mps.helgins.AnalyzedTermDeclaration" id="1177681456836">
      <property name="name" value="sss" />
      <node role="condition" type="jetbrains.mpswiki.queryLanguage.QueryPattern" id="1177681564196">
        <node role="pattern" type="jetbrains.mps.patterns.PatternExpression" id="1177681564197">
          <node role="patternNode" type="jetbrains.mps.baseLanguage.ClassifierType" id="1177681575411">
            <link role="classifier" extResolveInfo="1.[Classifier]String" />
          </node>
        </node>
      </node>
    </node>
  </node>
</model>


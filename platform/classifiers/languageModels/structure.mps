<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.baseLanguage.classifiers.structure">
  <persistence version="1" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.bootstrap.structureLanguage" />
  <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="0" />
  <maxImportIndex value="1" />
  <visible index="2" modelUID="jetbrains.mps.core.structure" />
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.InterfaceConceptDeclaration" id="1205751982837">
    <property name="name" value="IClassifier" />
    <node role="extends" type="jetbrains.mps.bootstrap.structureLanguage.structure.InterfaceConceptReference" id="1205752941102">
      <link role="intfc" targetNodeId="2v.1169194658468" resolveInfo="INamedConcept" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.InterfaceConceptDeclaration" id="1205752032448">
    <property name="name" value="IMember" />
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.InterfaceConceptDeclaration" id="1205752174734">
    <property name="name" value="IClassifierPart" />
  </node>
  <visible index="3" modelUID="jetbrains.mps.baseLanguage.structure" />
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1205752633985">
    <property name="name" value="ThisClassifierExpresson" />
    <link role="extends" targetNodeId="3v.1068431790191" resolveInfo="Expression" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1205752647346">
      <property name="value" value="this" />
      <link role="conceptPropertyDeclaration" targetNodeId="2v.1137473891462" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1205752650551">
      <property name="value" value="this classifier" />
      <link role="conceptPropertyDeclaration" targetNodeId="2v.1137473914776" resolveInfo="short_description" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1205752813637">
    <property name="name" value="BaseClassifierType" />
    <link role="extends" targetNodeId="3v.1068431790189" resolveInfo="Type" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1205752977278">
      <link role="conceptPropertyDeclaration" targetNodeId="2v.1137473854053" resolveInfo="abstract" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1205752906494">
    <property name="name" value="DefaultClassifierType" />
    <link role="extends" targetNodeId="1205752813637" resolveInfo="BaseClassifierType" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1205752917136">
      <property name="role" value="classifier" />
      <property name="sourceCardinality" value="1" />
      <link role="target" targetNodeId="1205751982837" resolveInfo="IClassifier" />
    </node>
  </node>
</model>


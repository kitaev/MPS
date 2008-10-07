<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:00000000-0000-4000-0000-011c8959029e(jetbrains.mps.bootstrap.editorLanguage.structure)">
  <persistence version="3" />
  <refactoringHistory />
  <language namespace="c72da2b9-7cce-4447-8389-f407dc1158b7(jetbrains.mps.bootstrap.structureLanguage)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.ext.collections.lang)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.bootstrap.smodelLanguage)" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959028c(jetbrains.mps.bootstrap.structureLanguage.constraints)" version="11" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902fb(jetbrains.mps.bootstrap.smodelLanguage.constraints)" version="21" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.bootstrap.smodelLanguage.structure)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590328(jetbrains.mps.baseLanguage.ext.collections.lang.constraints)" version="6" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.ext.collections.lang.structure)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590283(jetbrains.mps.core.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959030d(jetbrains.mps.bootstrap.constraintsLanguage.structure)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.closures.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590298(jetbrains.mps.bootstrap.editorLanguage.constraints)" version="21" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ba(jetbrains.mps.bootstrap.sharedConcepts.constraints)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590334(jetbrains.mps.closures.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895903e4(jetbrains.mps.internal.collections.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959029e(jetbrains.mps.bootstrap.editorLanguage.structure)" version="26" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902db(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <maxImportIndex value="41" />
  <import index="1" modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.bootstrap.structureLanguage.structure)" version="-1" />
  <import index="3" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.core.structure)" version="-1" />
  <import index="4" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="0" />
  <import index="27" modelUID="r:00000000-0000-4000-0000-011c8959029e(jetbrains.mps.bootstrap.editorLanguage.structure)" version="26" />
  <import index="28" modelUID="f:java_stub#java.awt.event(java.awt.event@java_stub)" version="-1" />
  <import index="29" modelUID="f:java_stub#jetbrains.mps.nodeEditor(jetbrains.mps.nodeEditor@java_stub)" version="-1" />
  <import index="33" modelUID="f:java_stub#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)" version="-1" />
  <import index="34" modelUID="r:00000000-0000-4000-0000-011c8959033d(jetbrains.mps.annotations.structure)" version="-1" />
  <import index="35" modelUID="f:java_stub#java.util(java.util@java_stub)" version="-1" />
  <import index="36" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" />
  <import index="37" modelUID="r:00000000-0000-4000-0000-011c895902bc(jetbrains.mps.bootstrap.sharedConcepts.structure)" version="-1" />
  <import index="38" modelUID="f:java_stub#javax.swing(javax.swing@java_stub)" version="-1" />
  <import index="39" modelUID="f:java_stub#java.awt(java.awt@java_stub)" version="-1" />
  <import index="40" modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.bootstrap.smodelLanguage.structure)" version="2" />
  <import index="41" modelUID="f:java_stub#jetbrains.mps.nodeEditor.style(jetbrains.mps.nodeEditor.style@java_stub)" version="-1" />
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1071666914219">
    <property name="name" value="ConceptEditorDeclaration" />
    <property name="iconPath" value="${language_descriptor}\icons\editor.png" />
    <property name="rootable" value="true" />
    <link role="extends" targetNodeId="1080736578640" resolveInfo="BaseEditorComponent" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1078153129734">
      <property name="sourceCardinality" value="0..1" />
      <property name="role" value="inspectedCellModel" />
      <property name="metaClass" value="aggregation" />
      <link role="target" targetNodeId="1073389214265" resolveInfo="EditorCellModel" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1158938128496">
      <property name="value" value="concept editor" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="implements" type="jetbrains.mps.bootstrap.structureLanguage.structure.InterfaceConceptReference" id="1210369064378">
      <link role="intfc" targetNodeId="3.1169194658468" resolveInfo="INamedConcept" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1073389214265">
    <property name="name" value="EditorCellModel" />
    <property name="package" value="CellModel" />
    <link role="extends" targetNodeId="3.1133920641626" resolveInfo="BaseConcept" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1119645550923">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473854053" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1142887637401">
      <property name="metaClass" value="aggregation" />
      <property name="sourceCardinality" value="0..1" />
      <property name="role" value="renderingCondition" />
      <link role="target" targetNodeId="1142886221719" resolveInfo="QueryFunction_NodeCondition" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1139959269582">
      <property name="role" value="actionMap" />
      <link role="target" targetNodeId="1139535219966" resolveInfo="CellActionMapDeclaration" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1081339532145">
      <property name="sourceCardinality" value="0..1" />
      <property name="role" value="keyMap" />
      <link role="target" targetNodeId="1081293058843" resolveInfo="CellKeyMapDeclaration" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1186406756722">
      <property name="role" value="styleClass" />
      <link role="target" targetNodeId="1186402373407" resolveInfo="StyleSheetClass" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1164826688380">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="menuDescriptor" />
      <link role="target" targetNodeId="1164824717996" resolveInfo="CellMenuDescriptor" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1176810465151">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="cellBackgroundFunction" />
      <link role="target" targetNodeId="1176809959526" resolveInfo="QueryFunction_Color" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1198512004906">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="focusPolicyApplicable" />
      <link role="target" targetNodeId="1142886221719" resolveInfo="QueryFunction_NodeCondition" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1130859485024">
      <property name="name" value="attractsFocus" />
      <link role="dataType" targetNodeId="1130926557197" resolveInfo="FocusPolicy" />
    </node>
    <node role="implements" type="jetbrains.mps.bootstrap.structureLanguage.structure.InterfaceConceptReference" id="1219418770234">
      <link role="intfc" targetNodeId="1219418625346" resolveInfo="IStyleContainer" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1073389446423">
    <property name="name" value="CellModel_Collection" />
    <property name="package" value="CellModel" />
    <link role="extends" targetNodeId="1073389214265" resolveInfo="EditorCellModel" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1073389446424">
      <property name="sourceCardinality" value="0..n" />
      <property name="role" value="childCellModel" />
      <property name="metaClass" value="aggregation" />
      <link role="target" targetNodeId="1073389214265" resolveInfo="EditorCellModel" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1106270802874">
      <property name="sourceCardinality" value="0..1" />
      <property name="role" value="cellLayout" />
      <property name="metaClass" value="aggregation" />
      <link role="target" targetNodeId="1106270491082" resolveInfo="CellLayout" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1073389446425">
      <property name="name" value="vertical" />
      <property name="propertyType" value="boolean" />
      <link role="dataType" targetNodeId="3.1082983657063" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1073389446426">
      <property name="name" value="gridLayout" />
      <property name="propertyType" value="boolean" />
      <link role="dataType" targetNodeId="3.1082983657063" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1139416841293">
      <property name="name" value="usesBraces" />
      <link role="dataType" targetNodeId="3.1082983657063" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1160590353935">
      <property name="name" value="usesFolding" />
      <link role="dataType" targetNodeId="3.1082983657063" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1107223377702">
      <property name="value" value="collection" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1107223377703">
      <property name="value" value="collection of cells" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1073389577006">
    <property name="name" value="CellModel_Constant" />
    <property name="package" value="CellModel" />
    <link role="extends" targetNodeId="1079353555532" resolveInfo="CellModel_AbstractLabel" />
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1073389577007">
      <property name="name" value="text" />
      <property name="propertyType" value="string" />
      <link role="dataType" targetNodeId="3.1082983041843" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1082639509531">
      <property name="name" value="nullText" />
      <property name="propertyType" value="string" />
      <link role="dataType" targetNodeId="3.1082983041843" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1107223377704">
      <property name="value" value="constant" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1107223377705">
      <property name="value" value="text label" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1073389658414">
    <property name="name" value="CellModel_Property" />
    <property name="package" value="CellModel" />
    <link role="extends" targetNodeId="1139848536355" resolveInfo="CellModel_WithRole" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1073389964684">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="propertyDeclaration" />
      <link role="target" targetNodeId="1.1071489288299" />
      <link role="specializedLink" targetNodeId="1140103550593" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1107223377706">
      <property name="value" value="{&lt;{propertyDeclaration}&gt;}" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1180268756546">
      <property name="value" value="property" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1073389882823">
    <property name="name" value="CellModel_RefNode" />
    <property name="package" value="CellModel" />
    <link role="extends" targetNodeId="1139848536355" resolveInfo="CellModel_WithRole" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1073389882824">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="linkDeclaration" />
      <link role="target" targetNodeId="1.1071489288298" />
      <link role="specializedLink" targetNodeId="1140103550593" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1180297564460">
      <property name="value" value="%&lt;{linkDeclaration}&gt;%" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1180298340765">
      <property name="value" value="single aggregation" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1073390211982">
    <property name="name" value="CellModel_RefNodeList" />
    <property name="package" value="CellModel" />
    <link role="extends" targetNodeId="1140524381322" resolveInfo="CellModel_ListWithRole" />
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1145360728033">
      <property name="name" value="reverse" />
      <link role="dataType" targetNodeId="3.1082983657063" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1073390211987">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="linkDeclaration" />
      <link role="target" targetNodeId="1.1071489288298" />
      <link role="specializedLink" targetNodeId="1140103550593" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1165347032372">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="elementMenuDescriptor" />
      <link role="target" targetNodeId="1164824717996" resolveInfo="CellMenuDescriptor" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1173177718857">
      <property name="role" value="elementActionMap" />
      <link role="target" targetNodeId="1139535219966" resolveInfo="CellActionMapDeclaration" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1182233390675">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="filter" />
      <link role="target" targetNodeId="1182191800432" resolveInfo="QueryFunction_NodeListFilter" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1107223377710">
      <property name="value" value="%&lt;{linkDeclaration}&gt;%" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1180298374005">
      <property name="value" value="multiple aggregation" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1074767920765">
    <property name="name" value="CellModel_ModelAccess" />
    <property name="package" value="CellModel" />
    <link role="extends" targetNodeId="1079353555532" resolveInfo="CellModel_AbstractLabel" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1176718152741">
      <property name="metaClass" value="aggregation" />
      <property name="sourceCardinality" value="1" />
      <property name="role" value="modelAcessor" />
      <link role="target" targetNodeId="1176717996748" resolveInfo="ModelAccessor" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1082638248796">
      <property name="name" value="nullText" />
      <property name="propertyType" value="string" />
      <link role="dataType" targetNodeId="3.1082983041843" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1107223377711">
      <property name="value" value="model access" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1107223377712">
      <property name="value" value="reference to accessor" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1075375595203">
    <property name="name" value="CellModel_Error" />
    <property name="package" value="CellModel" />
    <link role="extends" targetNodeId="1079353555532" resolveInfo="CellModel_AbstractLabel" />
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1075375595204">
      <property name="name" value="text" />
      <property name="propertyType" value="string" />
      <link role="dataType" targetNodeId="3.1082983041843" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1107223377713">
      <property name="value" value="error" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1107223377714">
      <property name="value" value="red text label" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1078308402140">
    <property name="name" value="CellModel_Custom" />
    <property name="package" value="CellModel" />
    <link role="extends" targetNodeId="1073389214265" resolveInfo="EditorCellModel" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1176795024817">
      <property name="metaClass" value="aggregation" />
      <property name="sourceCardinality" value="1" />
      <property name="role" value="cellProvider" />
      <link role="target" targetNodeId="1176749715029" resolveInfo="QueryFunction_CellProvider" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1107223377720">
      <property name="value" value="custom" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1107223377721">
      <property name="value" value="reference to cell provider" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1078938745671">
    <property name="name" value="EditorComponentDeclaration" />
    <property name="iconPath" value="${language_descriptor}\icons\editorComponent.png" />
    <property name="rootable" value="true" />
    <link role="extends" targetNodeId="1080736578640" resolveInfo="BaseEditorComponent" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1158938178950">
      <property name="value" value="editor component" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="implements" type="jetbrains.mps.bootstrap.structureLanguage.structure.InterfaceConceptReference" id="1210369055138">
      <link role="intfc" targetNodeId="3.1169194658468" resolveInfo="INamedConcept" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1078939183254">
    <property name="name" value="CellModel_Component" />
    <property name="package" value="CellModel" />
    <link role="extends" targetNodeId="1073389214265" resolveInfo="EditorCellModel" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1078939183255">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="editorComponent" />
      <link role="target" targetNodeId="1078938745671" resolveInfo="EditorComponentDeclaration" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1107223377722">
      <property name="value" value="component" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1107223377723">
      <property name="value" value="reference to editor component" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1079353555532">
    <property name="name" value="CellModel_AbstractLabel" />
    <property name="package" value="CellModel" />
    <link role="extends" targetNodeId="1073389214265" resolveInfo="EditorCellModel" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1176889772388">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="cellForegroundFunction" />
      <link role="target" targetNodeId="1176809959526" resolveInfo="QueryFunction_Color" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1185888338931">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="textForegroundEmptyFunction" />
      <link role="target" targetNodeId="1176809959526" resolveInfo="QueryFunction_Color" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1185888173839">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="textBackgroundFunction" />
      <link role="target" targetNodeId="1176809959526" resolveInfo="QueryFunction_Color" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1185888320335">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="textBgColorSelectedFunction" />
      <link role="target" targetNodeId="1176809959526" resolveInfo="QueryFunction_Color" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1119646130993">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473854053" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1197893615481">
      <property name="name" value="defaultCaretPosition" />
      <link role="dataType" targetNodeId="1197893505573" resolveInfo="_DefaultCaretPosition_Enum" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1080736578640">
    <property name="name" value="BaseEditorComponent" />
    <link role="extends" targetNodeId="1166049232041" resolveInfo="AbstractComponent" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1080736633877">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="cellModel" />
      <property name="metaClass" value="aggregation" />
      <link role="target" targetNodeId="1073389214265" resolveInfo="EditorCellModel" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1081293058843">
    <property name="iconPath" value="${language_descriptor}\icons\keyMap.png" />
    <property name="rootable" value="true" />
    <property name="name" value="CellKeyMapDeclaration" />
    <property name="package" value="CellKeyMap" />
    <node role="implements" type="jetbrains.mps.bootstrap.structureLanguage.structure.InterfaceConceptReference" id="1173470710781">
      <link role="intfc" targetNodeId="3.1169194658468" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1149937560128">
      <property name="name" value="everyModel" />
      <link role="dataType" targetNodeId="3.1082983657063" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1139445935125">
      <property name="role" value="applicableConcept" />
      <link role="target" targetNodeId="1.1169125787135" resolveInfo="AbstractConceptDeclaration" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1136930944870">
      <property name="sourceCardinality" value="0..n" />
      <property name="role" value="item" />
      <property name="metaClass" value="aggregation" />
      <link role="target" targetNodeId="1136916919141" resolveInfo="CellKeyMapItem" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1158938229201">
      <property name="value" value="cell keymap" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationDataTypeDeclaration" id="1083928804390">
    <property name="name" value="_YesNoDefault_Enum" />
    <link role="defaultMember" targetNodeId="1083928804393" resolveInfo="none" />
    <link role="memberDataType" targetNodeId="3.1082983041843" />
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1083928804391">
      <property name="name" value="yes" />
      <property name="externalValue" value="yes" />
      <property name="internalValue" value="true" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1083928804392">
      <property name="name" value="no" />
      <property name="externalValue" value="no" />
      <property name="internalValue" value="false" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1083928804393">
      <property name="externalValue" value="none" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationDataTypeDeclaration" id="1083952545109">
    <property name="name" value="_Colors_Enum" />
    <link role="defaultMember" targetNodeId="1083952545110" resolveInfo="none" />
    <link role="memberDataType" targetNodeId="3.1082983041843" />
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1083952545110">
      <property name="externalValue" value="none" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1083952545111">
      <property name="name" value="red" />
      <property name="externalValue" value="red" />
      <property name="internalValue" value="red" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1083952545112">
      <property name="name" value="pink" />
      <property name="externalValue" value="pink" />
      <property name="internalValue" value="pink" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1083952545113">
      <property name="name" value="orange" />
      <property name="externalValue" value="orange" />
      <property name="internalValue" value="orange" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1083952545114">
      <property name="name" value="yellow" />
      <property name="externalValue" value="yellow" />
      <property name="internalValue" value="yellow" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1083952545115">
      <property name="name" value="green" />
      <property name="externalValue" value="green" />
      <property name="internalValue" value="green" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1101213169706">
      <property name="externalValue" value="darkGreen" />
      <property name="internalValue" value="DARK_GREEN" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1083952545116">
      <property name="name" value="magenta" />
      <property name="externalValue" value="magenta" />
      <property name="internalValue" value="magenta" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1101213185757">
      <property name="externalValue" value="darkMagenta" />
      <property name="internalValue" value="DARK_MAGENTA" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1083952545117">
      <property name="name" value="cyan" />
      <property name="externalValue" value="cyan" />
      <property name="internalValue" value="cyan" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1083952545118">
      <property name="name" value="blue" />
      <property name="externalValue" value="blue" />
      <property name="internalValue" value="blue" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1216404713420">
      <property name="externalValue" value="lightBlue" />
      <property name="internalValue" value="LIGHT_BLUE" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1101209985304">
      <property name="externalValue" value="darkBlue" />
      <property name="internalValue" value="DARK_BLUE" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1084208529765">
      <property name="name" value="gray" />
      <property name="externalValue" value="gray" />
      <property name="internalValue" value="gray" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1084208529766">
      <property name="externalValue" value="lightGray" />
      <property name="internalValue" value="lightGray" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1084208529767">
      <property name="externalValue" value="darkGray" />
      <property name="internalValue" value="darkGray" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1214395400259">
      <property name="externalValue" value="white" />
      <property name="internalValue" value="WHITE" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1139246571096">
      <property name="externalValue" value="query" />
      <property name="internalValue" value="query" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1088013125922">
    <property name="name" value="CellModel_RefCell" />
    <property name="package" value="CellModel" />
    <link role="extends" targetNodeId="1139848536355" resolveInfo="CellModel_WithRole" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1088013239202">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="linkDeclaration" />
      <link role="target" targetNodeId="1.1071489288298" />
      <link role="specializedLink" targetNodeId="1140103550593" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1088186146602">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="editorComponent" />
      <property name="metaClass" value="aggregation" />
      <link role="target" targetNodeId="1088185857835" resolveInfo="InlineEditorComponent" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1180296391450">
      <property name="value" value="%&lt;{linkDeclaration}&gt;%-&gt;" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1180298302748">
      <property name="value" value="reference" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1088185857835">
    <property name="name" value="InlineEditorComponent" />
    <link role="extends" targetNodeId="1080736578640" resolveInfo="BaseEditorComponent" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1107223377726">
      <property name="value" value="in-line editor component" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1088612959204">
    <property name="name" value="CellModel_Alternation" />
    <property name="package" value="CellModel" />
    <link role="extends" targetNodeId="1073389214265" resolveInfo="EditorCellModel" />
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1088613081987">
      <property name="name" value="vertical" />
      <property name="propertyType" value="boolean" />
      <link role="dataType" targetNodeId="3.1082983657063" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1145918517974">
      <property name="metaClass" value="aggregation" />
      <property name="sourceCardinality" value="1" />
      <property name="role" value="alternationCondition" />
      <link role="target" targetNodeId="1142886221719" resolveInfo="QueryFunction_NodeCondition" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1088612958265">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="ifTrueCellModel" />
      <property name="metaClass" value="aggregation" />
      <link role="target" targetNodeId="1073389214265" resolveInfo="EditorCellModel" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1088612973955">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="ifFalseCellModel" />
      <property name="metaClass" value="aggregation" />
      <link role="target" targetNodeId="1073389214265" resolveInfo="EditorCellModel" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1107223377727">
      <property name="value" value="alternation" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1107223377728">
      <property name="value" value="cell alternation" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationDataTypeDeclaration" id="1101211480448">
    <property name="name" value="_FontStyle_Enum" />
    <link role="memberDataType" targetNodeId="3.1082983041843" />
    <link role="defaultMember" targetNodeId="1101211506174" resolveInfo="none" />
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1101211506174">
      <property name="externalValue" value="none" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1101211523070">
      <property name="name" value="bold" />
      <property name="externalValue" value="bold" />
      <property name="internalValue" value="BOLD" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1101211542532">
      <property name="name" value="italic" />
      <property name="externalValue" value="italic" />
      <property name="internalValue" value="ITALIC" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1101213960346">
      <property name="externalValue" value="boldItalic" />
      <property name="internalValue" value="BOLD_ITALIC" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1134577855137">
      <property name="name" value="plain" />
      <property name="externalValue" value="plain" />
      <property name="internalValue" value="PLAIN" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1220973684614">
      <property name="internalValue" value="QUERY" />
      <property name="externalValue" value="query" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1103016434866">
    <property name="name" value="CellModel_JComponent" />
    <property name="package" value="CellModel" />
    <link role="extends" targetNodeId="1073389214265" resolveInfo="EditorCellModel" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1176475119347">
      <property name="metaClass" value="aggregation" />
      <property name="sourceCardinality" value="1" />
      <property name="role" value="componentProvider" />
      <link role="target" targetNodeId="1176474535556" resolveInfo="QueryFunction_JComponent" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1137941825015">
      <property name="value" value="swing component" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1106270491082">
    <property name="name" value="CellLayout" />
    <property name="package" value="CellLayout" />
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1106270549637">
    <property name="name" value="CellLayout_Horizontal" />
    <property name="package" value="CellLayout" />
    <link role="extends" targetNodeId="1106270491082" resolveInfo="CellLayout" />
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1106270571710">
    <property name="name" value="CellLayout_Vertical" />
    <property name="package" value="CellLayout" />
    <link role="extends" targetNodeId="1106270491082" resolveInfo="CellLayout" />
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1106270637846">
    <property name="name" value="CellLayout_Flow" />
    <property name="package" value="CellLayout" />
    <link role="extends" targetNodeId="1106270491082" resolveInfo="CellLayout" />
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationDataTypeDeclaration" id="1130847686886">
    <property name="name" value="UnderlineStyle" />
    <link role="memberDataType" targetNodeId="3.1082983657062" />
    <link role="defaultMember" targetNodeId="1130847686918" resolveInfo="as_is" />
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1130847686918">
      <property name="externalValue" value="as_is" />
      <property name="internalValue" value="0" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1130847816499">
      <property name="externalValue" value="not_underlined" />
      <property name="internalValue" value="1" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1130847833453">
      <property name="name" value="underlined" />
      <property name="externalValue" value="underlined" />
      <property name="internalValue" value="2" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationDataTypeDeclaration" id="1130926557197">
    <property name="name" value="FocusPolicy" />
    <link role="memberDataType" targetNodeId="3.1082983657062" />
    <link role="defaultMember" targetNodeId="1130926557292" resolveInfo="noAttraction" />
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1130926557292">
      <property name="externalValue" value="noAttraction" />
      <property name="internalValue" value="0" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1130926591919">
      <property name="externalValue" value="attractsFocus" />
      <property name="internalValue" value="1" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1130926603060">
      <property name="externalValue" value="firstEditableCell" />
      <property name="internalValue" value="2" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1134379236839">
    <property name="name" value="CellModel_AttributedPropertyCell" />
    <property name="package" value="CellModel" />
    <link role="extends" targetNodeId="1073389214265" resolveInfo="EditorCellModel" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1134380148394">
      <property name="value" value="attributed property" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1134380159646">
      <property name="value" value="cell for attributed property" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1136564507907">
    <property name="name" value="CellModel_AttributedLinkCell" />
    <property name="package" value="CellModel" />
    <link role="extends" targetNodeId="1073389214265" resolveInfo="EditorCellModel" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1136564532725">
      <property name="value" value="attributed link" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1136564532726">
      <property name="value" value="cell for attributed link" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1136916919141">
    <property name="name" value="CellKeyMapItem" />
    <property name="package" value="CellKeyMap" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1136916998332">
      <property name="sourceCardinality" value="1..n" />
      <property name="role" value="keystroke" />
      <property name="metaClass" value="aggregation" />
      <link role="target" targetNodeId="1136916976737" resolveInfo="CellKeyMapKeystroke" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1136917325338">
      <property name="sourceCardinality" value="0..1" />
      <property name="role" value="isApplicableFunction" />
      <property name="metaClass" value="aggregation" />
      <link role="target" targetNodeId="1136917249679" resolveInfo="CellKeyMap_IsApplicableFunction" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1136920925604">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="executeFunction" />
      <property name="metaClass" value="aggregation" />
      <link role="target" targetNodeId="1136917288805" resolveInfo="CellKeyMap_ExecuteFunction" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1136916941877">
      <property name="name" value="description" />
      <link role="dataType" targetNodeId="3.1082983041843" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1141091278922">
      <property name="name" value="caretPolicy" />
      <link role="dataType" targetNodeId="1141091053936" resolveInfo="CellKeyMapCaretPolicy" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1163507208434">
      <property name="name" value="showInPopup" />
      <link role="dataType" targetNodeId="3.1082983657063" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1184322083615">
      <property name="name" value="menuAlwaysShown" />
      <link role="dataType" targetNodeId="3.1082983657063" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1136916976737">
    <property name="name" value="CellKeyMapKeystroke" />
    <property name="package" value="CellKeyMap" />
    <link role="extends" targetNodeId="3.1133920641626" />
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1136923970223">
      <property name="name" value="modifiers" />
      <property name="propertyType" value="string" />
      <link role="dataType" targetNodeId="3.1082983041843" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1136923970224">
      <property name="name" value="keycode" />
      <property name="propertyType" value="string" />
      <link role="dataType" targetNodeId="3.1082983041843" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1136917155755">
    <property name="name" value="CellKeyMap_AbstractFunction" />
    <property name="package" value="CellKeyMap" />
    <link role="extends" targetNodeId="4.1137021947720" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1161630184985">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1161622981231" resolveInfo="ConceptFunctionParameter_editorContext" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1137189922872">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137546998352" />
      <node role="target" type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1137189922873">
        <property name="name" value="CellKeyMap_FunctionParm_selectedNode" />
        <link role="extends" targetNodeId="4.1107135704075" />
        <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1137189922876">
          <property name="value" value="node" />
          <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
        </node>
        <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1137189922877">
          <property name="value" value="keymap function parameter" />
          <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
        </node>
      </node>
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1189582551383">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137546998352" />
      <node role="target" type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1189582551384">
        <property name="name" value="CellKeyMap_FunctionParm_selectedNodes" />
        <link role="extends" targetNodeId="4.1107135704075" />
        <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1189582551385">
          <property name="value" value="selectedNodes" />
          <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
        </node>
        <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1189582551386">
          <property name="value" value="keymap function parameter" />
          <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
        </node>
      </node>
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1143487952335">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137546998352" />
      <node role="target" type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1143487955383">
        <property name="name" value="CellKeyMap_FunctionParm_keyEvent" />
        <link role="extends" targetNodeId="4.1107135704075" />
        <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1143490306697">
          <link role="conceptLinkDeclaration" targetNodeId="4.1137545963098" />
          <node role="target" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1143490313729">
            <link role="classifier" targetNodeId="28.~KeyEvent" resolveInfo="KeyEvent" />
          </node>
        </node>
        <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1143488564542">
          <property name="value" value="keyEvent" />
          <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
        </node>
        <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1143488601967">
          <property name="value" value="keymap function parameter" />
          <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
        </node>
      </node>
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1136917182663">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473854053" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1136917249679">
    <property name="name" value="CellKeyMap_IsApplicableFunction" />
    <property name="package" value="CellKeyMap" />
    <link role="extends" targetNodeId="1136917155755" resolveInfo="CellKeyMap_AbstractFunction" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1137545690489">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545148427" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1141871296431" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1158958783311">
      <property name="value" value="is applicable block" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1136917288805">
    <property name="name" value="CellKeyMap_ExecuteFunction" />
    <property name="package" value="CellKeyMap" />
    <link role="extends" targetNodeId="1136917155755" resolveInfo="CellKeyMap_AbstractFunction" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1158958837093">
      <property name="value" value="execute block" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1137553248617">
    <property name="name" value="CellModel_ConceptProperty" />
    <property name="package" value="CellModel" />
    <link role="extends" targetNodeId="1139848536355" resolveInfo="CellModel_WithRole" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1137553248621">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="propertyDeclaration" />
      <link role="target" targetNodeId="1.1105725006687" />
      <link role="specializedLink" targetNodeId="1140103550593" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1137553248622">
      <property name="value" value="{{&lt;{propertyDeclaration}&gt;}}" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1180269136114">
      <property name="value" value="concept property" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationDataTypeDeclaration" id="1138197387103">
    <property name="name" value="_Layout_Constraints_Enum" />
    <link role="memberDataType" targetNodeId="3.1082983041843" />
    <link role="defaultMember" targetNodeId="1138197631095" resolveInfo="none" />
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1138197387339">
      <property name="name" value="punctuation" />
      <property name="externalValue" value="punctuation" />
      <property name="internalValue" value="punctuation" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1138197619454">
      <property name="name" value="noflow" />
      <property name="externalValue" value="noflow" />
      <property name="internalValue" value="noflow" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1138197631095">
      <property name="externalValue" value="none" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1139535219966">
    <property name="name" value="CellActionMapDeclaration" />
    <property name="iconPath" value="${language_descriptor}\icons\actionMap.png" />
    <property name="rootable" value="true" />
    <node role="implements" type="jetbrains.mps.bootstrap.structureLanguage.structure.InterfaceConceptReference" id="1173470751204">
      <link role="intfc" targetNodeId="3.1169194658468" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1139535219968">
      <property name="role" value="applicableConcept" />
      <link role="target" targetNodeId="1.1169125787135" resolveInfo="AbstractConceptDeclaration" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1139535219969">
      <property name="sourceCardinality" value="0..n" />
      <property name="role" value="item" />
      <property name="metaClass" value="aggregation" />
      <link role="target" targetNodeId="1139535280617" resolveInfo="CellActionMapItem" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1158938242046">
      <property name="value" value="cell action map" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1139535280617">
    <property name="name" value="CellActionMapItem" />
    <link role="extends" targetNodeId="3.1133920641626" />
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1139537298254">
      <property name="name" value="description" />
      <link role="dataType" targetNodeId="3.1082983041843" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1139535298778">
      <property name="name" value="actionId" />
      <link role="dataType" targetNodeId="1139535328871" resolveInfo="CellActionId" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1139535280620">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="executeFunction" />
      <property name="metaClass" value="aggregation" />
      <link role="target" targetNodeId="1139535439104" resolveInfo="CellActionMap_ExecuteFunction" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1185875612566">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473994950" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationDataTypeDeclaration" id="1139535328871">
    <property name="name" value="CellActionId" />
    <link role="memberDataType" targetNodeId="3.1082983041843" />
    <link role="defaultMember" targetNodeId="1139535329028" resolveInfo="right_transform" />
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1139535329028">
      <property name="externalValue" value="RIGHT_TRANSFORM" />
      <property name="internalValue" value="right_transform_action_id" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1139535387060">
      <property name="externalValue" value="DELETE" />
      <property name="internalValue" value="delete_action_id" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1139535439104">
    <property name="name" value="CellActionMap_ExecuteFunction" />
    <link role="extends" targetNodeId="4.1137021947720" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1161630496596">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1161622981231" resolveInfo="ConceptFunctionParameter_editorContext" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1139535439111">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137546998352" />
      <node role="target" type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1139535439112">
        <property name="name" value="CellActionMap_FunctionParm_selectedNode" />
        <link role="extends" targetNodeId="4.1107135704075" />
        <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1139535439113">
          <property name="value" value="node" />
          <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
        </node>
        <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1139535439114">
          <property name="value" value="selected node (action map function parameter)" />
          <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
        </node>
      </node>
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1158959403408">
      <property name="value" value="execute block" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationDataTypeDeclaration" id="1139744471051">
    <property name="name" value="_ImageAlignment_Enum" />
    <link role="memberDataType" targetNodeId="3.1082983041843" />
    <link role="defaultMember" targetNodeId="1139744471411" resolveInfo="alignmentJustify" />
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1139744471411">
      <property name="externalValue" value="alignmentJustify" />
      <property name="internalValue" value="justify" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1139744531598">
      <property name="externalValue" value="alignmentCenter" />
      <property name="internalValue" value="center" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1139744545740">
      <property name="externalValue" value="alignmentTile" />
      <property name="internalValue" value="tile" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1139744628335">
    <property name="name" value="CellModel_Image" />
    <property name="package" value="CellModel" />
    <link role="extends" targetNodeId="1073389214265" resolveInfo="EditorCellModel" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1176899909521">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="imagePathProvider" />
      <link role="target" targetNodeId="1176899348742" resolveInfo="QueryFunction_ImagePath" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1139746504291">
      <property name="name" value="imageFile" />
      <link role="dataType" targetNodeId="3.1082983041843" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1139858284555">
      <property name="name" value="descent" />
      <link role="dataType" targetNodeId="3.1082983657062" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1139746404569">
      <property name="value" value="image" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1139746422633">
      <property name="value" value="cell for an image" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1139848536355">
    <property name="name" value="CellModel_WithRole" />
    <property name="package" value="CellModel" />
    <link role="extends" targetNodeId="1079353555532" resolveInfo="CellModel_AbstractLabel" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1139849308084">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473854053" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1139852716018">
      <property name="name" value="noTargetText" />
      <link role="dataType" targetNodeId="3.1082983041843" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1214560368769">
      <property name="name" value="emptyNoTargetText" />
      <link role="dataType" targetNodeId="3.1082983657063" resolveInfo="boolean" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1140017977771">
      <property name="name" value="readOnly" />
      <property name="propertyType" value="boolean" />
      <link role="dataType" targetNodeId="3.1082983657063" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1140114345053">
      <property name="name" value="allowEmptyText" />
      <property name="propertyType" value="boolean" />
      <link role="dataType" targetNodeId="3.1082983657063" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1140103550593">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="relationDeclaration" />
      <link role="target" targetNodeId="3.1133920641626" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1140524381322">
    <property name="name" value="CellModel_ListWithRole" />
    <property name="package" value="CellModel" />
    <link role="extends" targetNodeId="1139848536355" resolveInfo="CellModel_WithRole" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1140524467909">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473854053" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1176897874615">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="nodeFactory" />
      <link role="target" targetNodeId="1176897764478" resolveInfo="QueryFunction_NodeFactory" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1140524464359">
      <property name="sourceCardinality" value="0..1" />
      <property name="role" value="emptyCellModel" />
      <property name="metaClass" value="aggregation" />
      <link role="target" targetNodeId="1073389214265" resolveInfo="EditorCellModel" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1140524464360">
      <property name="sourceCardinality" value="0..1" />
      <property name="role" value="cellLayout" />
      <property name="metaClass" value="aggregation" />
      <link role="target" targetNodeId="1106270491082" resolveInfo="CellLayout" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1140524450554">
      <property name="name" value="vertical" />
      <property name="propertyType" value="boolean" />
      <link role="dataType" targetNodeId="3.1082983657063" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1140524450555">
      <property name="name" value="gridLayout" />
      <property name="propertyType" value="boolean" />
      <link role="dataType" targetNodeId="3.1082983657063" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1140524450556">
      <property name="name" value="usesBraces" />
      <link role="dataType" targetNodeId="3.1082983657063" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1160590307797">
      <property name="name" value="usesFolding" />
      <link role="dataType" targetNodeId="3.1082983657063" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1140524450557">
      <property name="name" value="separatorText" />
      <property name="propertyType" value="string" />
      <link role="dataType" targetNodeId="3.1082983041843" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1156252885376">
      <property name="name" value="separatorLayoutConstraint" />
      <link role="dataType" targetNodeId="1138197387103" resolveInfo="_Layout_Constraints_Enum" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationDataTypeDeclaration" id="1140813780565">
    <property name="name" value="RightTransformAnchorTag" />
    <link role="memberDataType" targetNodeId="3.1082983041843" />
    <link role="defaultMember" targetNodeId="1140813780644" resolveInfo="none" />
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1140813780644">
      <property name="externalValue" value="none" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1140813835051">
      <property name="externalValue" value="default_" />
      <property name="internalValue" value="default_RTransform" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1140813898505">
      <property name="externalValue" value="ext_1" />
      <property name="internalValue" value="ext_1_RTransform" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1140813939727">
      <property name="externalValue" value="ext_2" />
      <property name="internalValue" value="ext_2_RTransform" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1140813947731">
      <property name="externalValue" value="ext_3" />
      <property name="internalValue" value="ext_3_RTransform" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1140813957048">
      <property name="externalValue" value="ext_4" />
      <property name="internalValue" value="ext_4_RTransform" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1140813967505">
      <property name="externalValue" value="ext_5" />
      <property name="internalValue" value="ext_5_RTransform" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationDataTypeDeclaration" id="1141091053936">
    <property name="name" value="CellKeyMapCaretPolicy" />
    <property name="package" value="CellKeyMap" />
    <link role="memberDataType" targetNodeId="3.1082983041843" />
    <link role="defaultMember" targetNodeId="1141091054266" resolveInfo="ANY_POSITION" />
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1141091054266">
      <property name="name" value="ANY_POSITION" />
      <property name="externalValue" value="ANY_POSITION" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1141091172402">
      <property name="name" value="FIRST_POSITION" />
      <property name="externalValue" value="FIRST_POSITION" />
      <property name="internalValue" value="caret_at_first_position" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1141091209420">
      <property name="name" value="LAST_POSITION" />
      <property name="externalValue" value="LAST_POSITION" />
      <property name="internalValue" value="caret_at_last_position" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1143573566373">
      <property name="name" value="INTERMEDIATE_POSITION" />
      <property name="externalValue" value="INTERMEDIATE_POSITION" />
      <property name="internalValue" value="caret_at_intermediate_position" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1142886221719">
    <property name="name" value="QueryFunction_NodeCondition" />
    <property name="package" value="QueryFunction" />
    <link role="extends" targetNodeId="4.1137021947720" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1145652669910">
      <property name="value" value="condition" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1145665848571">
      <property name="value" value="embedded block of code" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1142886758850">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545148427" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1142886762757" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1161627665731">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="37.1161622878565" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1183571201975">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1161622981231" resolveInfo="ConceptFunctionParameter_editorContext" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1176473889746">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1142886811589" resolveInfo="ConceptFunctionParameter_node" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1142886811589">
    <property name="name" value="ConceptFunctionParameter_node" />
    <link role="extends" targetNodeId="4.1107135704075" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1142886811590">
      <property name="value" value="node" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1142886811591">
      <property name="value" value="function parameter" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1176492724289">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473994950" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationDataTypeDeclaration" id="1143891911797">
    <property name="name" value="_LeftRight_Enum" />
    <link role="memberDataType" targetNodeId="3.1082983657063" />
    <link role="defaultMember" targetNodeId="1143891911798" resolveInfo="left" />
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1143891911798">
      <property name="name" value="left" />
      <property name="externalValue" value="left" />
      <property name="internalValue" value="true" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1143891954220">
      <property name="name" value="right" />
      <property name="externalValue" value="right" />
      <property name="internalValue" value="false" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1149850725784">
    <property name="name" value="CellModel_AttributedNodeCell" />
    <property name="package" value="CellModel" />
    <link role="extends" targetNodeId="1073389214265" resolveInfo="EditorCellModel" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1149850757778">
      <property name="value" value="attributed node" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1149850757779">
      <property name="value" value="cell for attributed node" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1160493135005">
    <property name="name" value="CellMenuPart_PropertyValues_GetValues" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="4.1137021947720" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1160500373903">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545148427" />
      <node role="target" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1160674633356">
        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1160674637514">
          <link role="classifier" targetNodeId="36.~String" resolveInfo="String" />
        </node>
      </node>
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1161629196402">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="37.1161622878565" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1161629292561">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="37.1161622753914" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1164848564365">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1163613822479" resolveInfo="CellMenuPart_Abstract_editedNode" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1160493189132">
      <property name="value" value="property values" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1161622981231">
    <property name="name" value="ConceptFunctionParameter_editorContext" />
    <link role="extends" targetNodeId="4.1107135704075" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1161622981232">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545963098" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1161622981233">
        <link role="classifier" targetNodeId="29.~EditorContext" resolveInfo="EditorContext" />
      </node>
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1161622981234">
      <property name="value" value="editorContext" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1161622981235">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473994950" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1162497113192">
    <property name="name" value="CellMenuPart_ReplaceChild_currentChild" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="4.1107135704075" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1162497113193">
      <property name="value" value="currentChild" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1162497113194">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473994950" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1162498275506">
    <property name="name" value="CellMenuPart_ReplaceChild_defaultConceptOfChild" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="4.1107135704075" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1162498325651">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545963098" />
      <node role="target" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1162498330044">
        <link role="concept" targetNodeId="1.1071489090640" />
      </node>
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1162498275507">
      <property name="value" value="defaultConceptOfChild" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1162498275508">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473994950" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1163613035599">
    <property name="name" value="CellMenuPart_AbstractGroup_Query" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="4.1137021947720" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1163613035600">
      <property name="value" value="get objects" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1178647877855">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545148427" />
      <node role="target" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1178647881515">
        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1178647886236" />
      </node>
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1163613035601">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1163613822479" resolveInfo="CellMenuPart_Abstract_editedNode" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1163613035604">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="37.1161622878565" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1163613035605">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="37.1161622753914" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1163613131943">
    <property name="name" value="CellMenuPart_ReplaceNode_Group_Create" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="4.1137021947720" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1163711457917">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545148427" />
      <node role="target" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1163711460075" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1163613131944">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1163613549566" resolveInfo="CellMenuPart_AbstractGroup_parameterObject" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1163613915977">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1163613822479" resolveInfo="CellMenuPart_Abstract_editedNode" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1163613131948">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="37.1161622665029" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1163613131949">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="37.1161622878565" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1163613131950">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="37.1161622753914" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1163613131951">
      <property name="value" value="create replacement node" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1163613549566">
    <property name="name" value="CellMenuPart_AbstractGroup_parameterObject" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="4.1107135704075" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1163613549567">
      <property name="value" value="parameterObject" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1163613549568">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473994950" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1163613822479">
    <property name="name" value="CellMenuPart_Abstract_editedNode" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="4.1107135704075" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1163613822480">
      <property name="value" value="node" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1163613822481">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473994950" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1164052439493">
    <property name="name" value="CellMenuPart_AbstractGroup_MatchingText" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="4.1137021947720" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1164052439494">
      <property name="value" value="matching text" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1164052439495">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545148427" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1164052439496">
        <link role="classifier" targetNodeId="36.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1164052439497">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1163613549566" resolveInfo="CellMenuPart_AbstractGroup_parameterObject" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1164052588708">
    <property name="name" value="CellMenuPart_AbstractGroup_DescriptionText" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="4.1137021947720" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1164052588709">
      <property name="value" value="description text" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1164052588710">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545148427" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1164052588711">
        <link role="classifier" targetNodeId="36.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1164052588712">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1163613549566" resolveInfo="CellMenuPart_AbstractGroup_parameterObject" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1164824717996">
    <property name="name" value="CellMenuDescriptor" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="3.1133920641626" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1164824815888">
      <property name="metaClass" value="aggregation" />
      <property name="sourceCardinality" value="0..n" />
      <property name="role" value="cellMenuPart" />
      <link role="target" targetNodeId="1164824854750" resolveInfo="CellMenuPart_Abstract" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1164826227425">
      <property name="value" value="cell menu" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1164824854750">
    <property name="name" value="CellMenuPart_Abstract" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="3.1133920641626" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1164824871502">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473854053" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1164833692343">
    <property name="name" value="CellMenuPart_PropertyValues" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="1164824854750" resolveInfo="CellMenuPart_Abstract" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1164833692344">
      <property name="metaClass" value="aggregation" />
      <property name="sourceCardinality" value="1" />
      <property name="role" value="valuesFunction" />
      <link role="target" targetNodeId="1160493135005" resolveInfo="CellMenuPart_PropertyValues_GetValues" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1199894803096">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473994950" resolveInfo="dontSubstituteByDefault" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1164833692345">
      <property name="value" value="property values" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1164914519156">
    <property name="name" value="CellMenuPart_ReplaceNode_CustomNodeConcept" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="1164824854750" resolveInfo="CellMenuPart_Abstract" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1164914727930">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="replacementConcept" />
      <link role="target" targetNodeId="1.1071489090640" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1164914519158">
      <property name="value" value="replace node (custom node concept)" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1164996492011">
    <property name="name" value="CellMenuPart_ReferentPrimary" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="1164824854750" resolveInfo="CellMenuPart_Abstract" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1199894998166">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473994950" resolveInfo="dontSubstituteByDefault" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1164996492013">
      <property name="value" value="primary choose referent menu" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1165004207520">
    <property name="name" value="CellMenuPart_ReplaceNode_Group" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="1165253627126" resolveInfo="CellMenuPart_AbstractGroup" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1165004529292">
      <property name="metaClass" value="aggregation" />
      <property name="sourceCardinality" value="1" />
      <property name="role" value="parametersFunction" />
      <link role="target" targetNodeId="1163613035599" resolveInfo="CellMenuPart_AbstractGroup_Query" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1165004529293">
      <property name="metaClass" value="aggregation" />
      <property name="sourceCardinality" value="1" />
      <property name="role" value="createFunction" />
      <link role="target" targetNodeId="1163613131943" resolveInfo="CellMenuPart_ReplaceNode_Group_Create" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1165004207522">
      <property name="value" value="replace node (group of custom actions)" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1165253627126">
    <property name="name" value="CellMenuPart_AbstractGroup" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="1164824854750" resolveInfo="CellMenuPart_Abstract" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1165253627127">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473854053" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1165253890469">
      <property name="metaClass" value="aggregation" />
      <property name="sourceCardinality" value="1" />
      <property name="role" value="parameterObjectType" />
      <link role="target" targetNodeId="4.1068431790189" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1165254125954">
      <property name="name" value="presentation" />
      <link role="dataType" targetNodeId="37.1165007009656" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1165254159533">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="matchingTextFunction" />
      <link role="target" targetNodeId="1164052439493" resolveInfo="CellMenuPart_AbstractGroup_MatchingText" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1165254180581">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="descriptionTextFunction" />
      <link role="target" targetNodeId="1164052588708" resolveInfo="CellMenuPart_AbstractGroup_DescriptionText" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1165270418989">
    <property name="name" value="CellMenuPart_ReplaceChild_Group" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="1165253627126" resolveInfo="CellMenuPart_AbstractGroup" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1165270418991">
      <property name="metaClass" value="aggregation" />
      <property name="sourceCardinality" value="1" />
      <property name="role" value="parametersFunction" />
      <link role="target" targetNodeId="1165270662927" resolveInfo="CellMenuPart_ReplaceChild_Group_Query" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1165270418992">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="createFunction" />
      <link role="target" targetNodeId="1165270999881" resolveInfo="CellMenuPart_ReplaceChild_Group_Create" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1199895090639">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473994950" resolveInfo="dontSubstituteByDefault" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1165270418995">
      <property name="value" value="replace child (group of custom actions)" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1165270662927">
    <property name="name" value="CellMenuPart_ReplaceChild_Group_Query" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="4.1137021947720" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1165270662928">
      <property name="value" value="get objects" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165270662929">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1163613822479" resolveInfo="CellMenuPart_Abstract_editedNode" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165270662930">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1162497113192" resolveInfo="CellMenuPart_ReplaceChild_currentChild" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165270662931">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1162498275506" resolveInfo="CellMenuPart_ReplaceChild_defaultConceptOfChild" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165270662932">
      <link role="target" targetNodeId="37.1161622878565" />
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165270662933">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="37.1161622753914" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1165270999881">
    <property name="name" value="CellMenuPart_ReplaceChild_Group_Create" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="4.1137021947720" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165270999882">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1163613549566" resolveInfo="CellMenuPart_AbstractGroup_parameterObject" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165270999883">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1163613822479" resolveInfo="CellMenuPart_Abstract_editedNode" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165270999884">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1162497113192" resolveInfo="CellMenuPart_ReplaceChild_currentChild" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165270999885">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1162498275506" resolveInfo="CellMenuPart_ReplaceChild_defaultConceptOfChild" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165270999886">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="37.1161622665029" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165270999887">
      <link role="target" targetNodeId="37.1161622878565" />
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165270999888">
      <link role="target" targetNodeId="37.1161622753914" />
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1165270999889">
      <property name="value" value="create new child" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1165280503630">
    <property name="name" value="CellMenuPart_ReplaceChild_CustomChildConcept" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="1164824854750" resolveInfo="CellMenuPart_Abstract" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1165280503631">
      <property name="metaClass" value="aggregation" />
      <property name="sourceCardinality" value="1" />
      <property name="role" value="childConceptFunction" />
      <link role="target" targetNodeId="1165280856333" resolveInfo="CellMenuPart_ReplaceChild_CustomChildConcept_Query" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1199895114478">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473994950" resolveInfo="dontSubstituteByDefault" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1165280503632">
      <property name="value" value="replace child (custom child's concept)" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1165280856333">
    <property name="name" value="CellMenuPart_ReplaceChild_CustomChildConcept_Query" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="4.1137021947720" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1165280856334">
      <property name="value" value="get child concept" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1165280856335">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545148427" />
      <node role="target" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1165280856336">
        <link role="concept" targetNodeId="1.1071489090640" />
      </node>
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165280856337">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1163613822479" resolveInfo="CellMenuPart_Abstract_editedNode" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165280856338">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1162497113192" resolveInfo="CellMenuPart_ReplaceChild_currentChild" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165280856339">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1162498275506" resolveInfo="CellMenuPart_ReplaceChild_defaultConceptOfChild" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165280856340">
      <link role="target" targetNodeId="37.1161622878565" />
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165280856341">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="37.1161622753914" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1165339175678">
    <property name="name" value="CellMenuPart_ReplaceChild_Item" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="1164824854750" resolveInfo="CellMenuPart_Abstract" />
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1165339639991">
      <property name="name" value="matchingText" />
      <link role="dataType" targetNodeId="3.1082983041843" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1175117579502">
      <property name="name" value="descriptionText" />
      <link role="dataType" targetNodeId="3.1082983041843" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1165339175680">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="createFunction" />
      <link role="target" targetNodeId="1165339307433" resolveInfo="CellMenuPart_ReplaceChild_Item_Create" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1199895109786">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473994950" resolveInfo="dontSubstituteByDefault" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1165339175681">
      <property name="value" value="replace child (custom action)" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1165339307433">
    <property name="name" value="CellMenuPart_ReplaceChild_Item_Create" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="4.1137021947720" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165339307434">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1163613822479" resolveInfo="CellMenuPart_Abstract_editedNode" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165339437299">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1162497113192" resolveInfo="CellMenuPart_ReplaceChild_currentChild" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165339437300">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1162498275506" resolveInfo="CellMenuPart_ReplaceChild_defaultConceptOfChild" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165339307435">
      <link role="target" targetNodeId="37.1161622665029" />
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165339307436">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="37.1161622878565" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165339307437">
      <link role="target" targetNodeId="37.1161622753914" />
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1165420413719">
    <property name="name" value="CellMenuPart_Generic_Group" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="1165253627126" resolveInfo="CellMenuPart_AbstractGroup" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1165420413720">
      <property name="metaClass" value="aggregation" />
      <property name="sourceCardinality" value="1" />
      <property name="role" value="parametersFunction" />
      <link role="target" targetNodeId="1163613035599" resolveInfo="CellMenuPart_AbstractGroup_Query" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1165420413721">
      <property name="metaClass" value="aggregation" />
      <property name="sourceCardinality" value="1" />
      <property name="role" value="handlerFunction" />
      <link role="target" targetNodeId="1165420626554" resolveInfo="CellMenuPart_Generic_Group_Handler" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1165420413722">
      <property name="value" value="generic group" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1165420626554">
    <property name="name" value="CellMenuPart_Generic_Group_Handler" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="4.1137021947720" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165420626557">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1163613549566" resolveInfo="CellMenuPart_AbstractGroup_parameterObject" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165420626558">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1163613822479" resolveInfo="CellMenuPart_Abstract_editedNode" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165420626559">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="37.1161622665029" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165420626560">
      <link role="target" targetNodeId="37.1161622878565" />
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165420626561">
      <link role="target" targetNodeId="37.1161622753914" />
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1165420626562">
      <property name="value" value="generic handler" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1165424453110">
    <property name="name" value="CellMenuPart_Generic_Item" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="1164824854750" resolveInfo="CellMenuPart_Abstract" />
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1165424453111">
      <property name="name" value="matchingText" />
      <link role="dataType" targetNodeId="3.1082983041843" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1165424453112">
      <property name="metaClass" value="aggregation" />
      <property name="sourceCardinality" value="1" />
      <property name="role" value="handlerFunction" />
      <link role="target" targetNodeId="1165424657443" resolveInfo="CellMenuPart_Generic_Item_Handler" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1165424453113">
      <property name="value" value="generic item" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1165424657443">
    <property name="name" value="CellMenuPart_Generic_Item_Handler" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="4.1137021947720" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165424657444">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1163613822479" resolveInfo="CellMenuPart_Abstract_editedNode" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165424657447">
      <link role="target" targetNodeId="37.1161622665029" />
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165424657448">
      <link role="target" targetNodeId="37.1161622878565" />
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1165424657449">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="37.1161622753914" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1166040637528">
    <property name="iconPath" value="${language_descriptor}\icons\menuComponent.png" />
    <property name="rootable" value="true" />
    <property name="name" value="CellMenuComponent" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="1166049232041" resolveInfo="AbstractComponent" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1166040865497">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="applicableFeature" />
      <link role="target" targetNodeId="1166041033436" resolveInfo="CellMenuComponentFeature" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1166041505377">
      <property name="metaClass" value="aggregation" />
      <property name="sourceCardinality" value="1" />
      <property name="role" value="menuDescriptor" />
      <link role="target" targetNodeId="1164824717996" resolveInfo="CellMenuDescriptor" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1166047295586">
      <property name="value" value="cell menu component" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="implements" type="jetbrains.mps.bootstrap.structureLanguage.structure.InterfaceConceptReference" id="1210369041997">
      <link role="intfc" targetNodeId="3.1169194658468" resolveInfo="INamedConcept" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1166041033436">
    <property name="name" value="CellMenuComponentFeature" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="3.1133920641626" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1166054297096">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="relationDeclaration" />
      <link role="target" targetNodeId="3.1133920641626" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1166041079437">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473854053" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1166041748520">
    <property name="name" value="CellMenuComponentFeature_Property" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="1166041033436" resolveInfo="CellMenuComponentFeature" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1166041884271">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="propertyDeclaration" />
      <link role="target" targetNodeId="1.1071489288299" />
      <link role="specializedLink" targetNodeId="1166054297096" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1166042131867">
    <property name="name" value="CellMenuComponentFeature_Link" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="1166041033436" resolveInfo="CellMenuComponentFeature" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1166042131869">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="linkDeclaration" />
      <link role="target" targetNodeId="1.1071489288298" />
      <link role="specializedLink" targetNodeId="1166054297096" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1166049232041">
    <property name="name" value="AbstractComponent" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1166049251808">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473854053" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1166049300910">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="conceptDeclaration" />
      <link role="target" targetNodeId="1.1169125787135" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1166059625718">
    <property name="name" value="CellMenuPart_CellMenuComponent" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="1164824854750" resolveInfo="CellMenuPart_Abstract" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1166059677893">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="cellMenuComponent" />
      <link role="target" targetNodeId="1166040637528" resolveInfo="CellMenuComponent" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1166059625736">
      <property name="value" value="menu component" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1174088067129">
    <property name="name" value="CellMenuPart_ReplaceChildPrimary" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="1164824854750" resolveInfo="CellMenuPart_Abstract" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1199895105514">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473994950" resolveInfo="dontSubstituteByDefault" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1174088067130">
      <property name="value" value="primary replace child menu" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1176474535556">
    <property name="name" value="QueryFunction_JComponent" />
    <property name="package" value="QueryFunction" />
    <link role="extends" targetNodeId="4.1137021947720" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1176474588488">
      <property name="value" value="component" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1176474596599">
      <property name="value" value="embedded block of code" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1176474617542">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545148427" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1176474640436">
        <link role="classifier" targetNodeId="38.~JComponent" resolveInfo="JComponent" />
      </node>
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1176474644923">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1161622981231" resolveInfo="ConceptFunctionParameter_editorContext" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1176474658345">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1142886811589" resolveInfo="ConceptFunctionParameter_node" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1176717779940">
    <property name="name" value="ConceptFunctionParameter_text" />
    <link role="extends" targetNodeId="4.1107135704075" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1176717792086">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545963098" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1176717823441">
        <link role="classifier" targetNodeId="36.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1176717779941">
      <property name="value" value="text" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1176717779942">
      <property name="value" value="function parameter" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1176717779943">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473994950" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1176717841777">
    <property name="name" value="QueryFunction_ModelAccess_Getter" />
    <property name="package" value="QueryFunction" />
    <link role="extends" targetNodeId="4.1137021947720" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1176717841778">
      <property name="value" value="condition" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1176717841779">
      <property name="value" value="embedded block of code" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1176717841780">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545148427" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1176717853426">
        <link role="classifier" targetNodeId="36.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1176717841782">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1161622981231" resolveInfo="ConceptFunctionParameter_editorContext" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1176717841783">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1142886811589" resolveInfo="ConceptFunctionParameter_node" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1176717871254">
    <property name="name" value="QueryFunction_ModelAccess_Setter" />
    <property name="package" value="QueryFunction" />
    <link role="extends" targetNodeId="4.1137021947720" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1176717871255">
      <property name="value" value="condition" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1176717871256">
      <property name="value" value="embedded block of code" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1176717871257">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545148427" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1176717878779" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1176717871259">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1161622981231" resolveInfo="ConceptFunctionParameter_editorContext" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1176717871260">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1142886811589" resolveInfo="ConceptFunctionParameter_node" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1176725584265">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1176717779940" resolveInfo="ConceptFunctionParameter_text" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1176717888428">
    <property name="name" value="QueryFunction_ModelAccess_Validator" />
    <property name="package" value="QueryFunction" />
    <link role="extends" targetNodeId="4.1137021947720" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1176717888429">
      <property name="value" value="condition" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1176717888430">
      <property name="value" value="embedded block of code" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1176717888431">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545148427" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1176717902389" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1176717888433">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1161622981231" resolveInfo="ConceptFunctionParameter_editorContext" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1176717888434">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1142886811589" resolveInfo="ConceptFunctionParameter_node" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1176725860484">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1176717779940" resolveInfo="ConceptFunctionParameter_text" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1176732129892">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1176731909317" resolveInfo="ConceptFunctionParameter_oldText" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1176717996748">
    <property name="name" value="ModelAccessor" />
    <link role="extends" targetNodeId="3.1133920641626" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1176718001874">
      <property name="metaClass" value="aggregation" />
      <property name="sourceCardinality" value="1" />
      <property name="role" value="getter" />
      <link role="target" targetNodeId="1176717841777" resolveInfo="QueryFunction_ModelAccess_Getter" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1176718007938">
      <property name="metaClass" value="aggregation" />
      <property name="sourceCardinality" value="1" />
      <property name="role" value="setter" />
      <link role="target" targetNodeId="1176717871254" resolveInfo="QueryFunction_ModelAccess_Setter" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1176718014393">
      <property name="metaClass" value="aggregation" />
      <property name="sourceCardinality" value="1" />
      <property name="role" value="validator" />
      <link role="target" targetNodeId="1176717888428" resolveInfo="QueryFunction_ModelAccess_Validator" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1176731909317">
    <property name="name" value="ConceptFunctionParameter_oldText" />
    <link role="extends" targetNodeId="4.1107135704075" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1176731909318">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545963098" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1176731909319">
        <link role="classifier" targetNodeId="36.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1176731909320">
      <property name="value" value="oldText" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1176731909321">
      <property name="value" value="function parameter" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1176731909322">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473994950" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1176749715029">
    <property name="name" value="QueryFunction_CellProvider" />
    <property name="package" value="QueryFunction" />
    <link role="extends" targetNodeId="4.1137021947720" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1176749779885">
      <property name="value" value="cell provider" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1176749779886">
      <property name="value" value="embedded block of code" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1176749854668">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545148427" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1176794890268">
        <link role="classifier" targetNodeId="29.~AbstractCellProvider" resolveInfo="AbstractCellProvider" />
      </node>
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1176749862944">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1142886811589" resolveInfo="ConceptFunctionParameter_node" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1176749872102">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1161622981231" resolveInfo="ConceptFunctionParameter_editorContext" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1176750487975">
    <property name="name" value="QueryMethodIdEditorProviderExpression" />
    <link role="extends" targetNodeId="4.1068431790191" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1176795885088">
      <property name="value" value="query method cell provider" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1176750736379">
      <property name="name" value="notSetString" />
      <link role="dataType" targetNodeId="3.1082983041843" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1176750922515">
      <property name="name" value="prefix" />
      <link role="dataType" targetNodeId="3.1082983041843" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1176750512039">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="queryIdProperty" />
      <link role="target" targetNodeId="1.1071489288299" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1176750789991">
      <property name="metaClass" value="aggregation" />
      <property name="sourceCardinality" value="1" />
      <property name="role" value="returnType" />
      <link role="target" targetNodeId="4.1068431790189" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1176750796710">
      <property name="metaClass" value="aggregation" />
      <property name="sourceCardinality" value="0..n" />
      <property name="role" value="parameter" />
      <link role="target" targetNodeId="4.1068498886292" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1176750816680">
      <property name="metaClass" value="aggregation" />
      <property name="sourceCardinality" value="0..n" />
      <property name="role" value="additionalImport" />
      <link role="target" targetNodeId="4.1068431790189" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1176809959526">
    <property name="name" value="QueryFunction_Color" />
    <property name="package" value="QueryFunction.Style" />
    <link role="extends" targetNodeId="1221059528506" resolveInfo="QueryFunction_StyleParameter" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1176809959527">
      <property name="value" value="color function" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1176809959529">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545148427" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1176810139102">
        <link role="classifier" targetNodeId="39.~Color" resolveInfo="Color" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1176897764478">
    <property name="name" value="QueryFunction_NodeFactory" />
    <property name="package" value="QueryFunction" />
    <link role="extends" targetNodeId="4.1137021947720" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1176897764479">
      <property name="value" value="node factory" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1176897764480">
      <property name="value" value="embedded block of code" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1176897764481">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545148427" />
      <node role="target" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1176897813346" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1176897764483">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="37.1161622878565" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1176897764484">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1142886811589" resolveInfo="ConceptFunctionParameter_node" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1176899348742">
    <property name="name" value="QueryFunction_ImagePath" />
    <property name="package" value="QueryFunction" />
    <link role="extends" targetNodeId="4.1137021947720" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1176899348743">
      <property name="value" value="string" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1176899348744">
      <property name="value" value="embedded block of code" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1176899348745">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545148427" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1176899540232">
        <link role="classifier" targetNodeId="36.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1176899348747">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1142886811589" resolveInfo="ConceptFunctionParameter_node" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1176899348748">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1161622981231" resolveInfo="ConceptFunctionParameter_editorContext" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1180615838666">
    <property name="name" value="CellMenuPart_PropertyPostfixHints" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="1164824854750" resolveInfo="CellMenuPart_Abstract" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1180615838667">
      <property name="metaClass" value="aggregation" />
      <property name="sourceCardinality" value="1" />
      <property name="role" value="postfixesFunction" />
      <link role="target" targetNodeId="1180616057533" resolveInfo="CellMenuPart_PropertyPostfixHints_GetPostfixes" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1180615838668">
      <property name="value" value="property postfix hints" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1205367019469">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473994950" resolveInfo="dontSubstituteByDefault" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1180616057533">
    <property name="name" value="CellMenuPart_PropertyPostfixHints_GetPostfixes" />
    <property name="package" value="CellMenu" />
    <link role="extends" targetNodeId="4.1137021947720" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1180616057534">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545148427" />
      <node role="target" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1180616057535">
        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1180616057536">
          <link role="classifier" targetNodeId="36.~String" resolveInfo="String" />
        </node>
      </node>
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1180616057537">
      <link role="target" targetNodeId="37.1161622878565" />
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1180616057538">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="37.1161622753914" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1180616057539">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1163613822479" resolveInfo="CellMenuPart_Abstract_editedNode" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1180616057540">
      <property name="value" value="postfixes" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1182191800432">
    <property name="name" value="QueryFunction_NodeListFilter" />
    <property name="package" value="QueryFunction" />
    <link role="extends" targetNodeId="4.1137021947720" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1182191800433">
      <property name="value" value="node list provider" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1182191800434">
      <property name="value" value="embedded block of code" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1182191800435">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545148427" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1182234187657" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1182191800437">
      <link role="target" targetNodeId="37.1161622878565" />
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1182191800438">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" />
      <link role="target" targetNodeId="1182233249301" resolveInfo="ConceptFunctionParameter_childNode" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1182233249301">
    <property name="name" value="ConceptFunctionParameter_childNode" />
    <link role="extends" targetNodeId="4.1107135704075" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1182233331889">
      <property name="value" value="childNode" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1182233336391">
      <property name="value" value="function parameter" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1182233342737">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473994950" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1184319644772">
    <property name="name" value="CellModel_NonEmptyProperty" />
    <property name="package" value="CellModel" />
    <link role="extends" targetNodeId="1073389658414" resolveInfo="CellModel_Property" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1184319817911">
      <property name="value" value="{+&lt;{propertyDeclaration}&gt;+}" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1184319817912">
      <property name="value" value="not empty property" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1186402211651">
    <property name="name" value="StyleSheet" />
    <property name="rootable" value="true" />
    <property name="package" value="Stylesheet" />
    <property name="iconPath" value="${language_descriptor}\icons\editorStylesheet.png" />
    <link role="extends" targetNodeId="3.1133920641626" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1186402402630">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="styleClass" />
      <property name="sourceCardinality" value="0..n" />
      <link role="target" targetNodeId="1186402373407" resolveInfo="StyleSheetClass" />
    </node>
    <node role="implements" type="jetbrains.mps.bootstrap.structureLanguage.structure.InterfaceConceptReference" id="1186402303894">
      <link role="intfc" targetNodeId="3.1169194658468" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1194566715035">
      <property name="value" value="stylesheet" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" resolveInfo="alias" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1186402373407">
    <property name="package" value="Stylesheet" />
    <property name="name" value="StyleSheetClass" />
    <link role="extends" targetNodeId="3.1133920641626" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1198252369256">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="extendedClass" />
      <link role="target" targetNodeId="1198252130653" resolveInfo="StyleSheetClassReference" />
    </node>
    <node role="implements" type="jetbrains.mps.bootstrap.structureLanguage.structure.InterfaceConceptReference" id="1186402391299">
      <link role="intfc" targetNodeId="3.1169194658468" />
    </node>
    <node role="implements" type="jetbrains.mps.bootstrap.structureLanguage.structure.InterfaceConceptReference" id="1215087816795">
      <link role="intfc" targetNodeId="4.1212170275853" resolveInfo="IValidIdentifier" />
    </node>
    <node role="implements" type="jetbrains.mps.bootstrap.structureLanguage.structure.InterfaceConceptReference" id="1219418689782">
      <link role="intfc" targetNodeId="1219418625346" resolveInfo="StyleContainer" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1186402475462">
    <property name="package" value="Stylesheet" />
    <property name="name" value="StyleClassItem" />
    <link role="extends" targetNodeId="3.1133920641626" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1186402481854">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473854053" />
    </node>
    <node role="conceptLinkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLinkDeclaration" id="1215701938122">
      <property name="name" value="attributeConstant" />
      <link role="targetType" targetNodeId="4.1068431790191" resolveInfo="Expression" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1186403694788">
    <property name="package" value="Stylesheet" />
    <property name="name" value="ColorStyleClassItem" />
    <link role="extends" targetNodeId="1186402475462" resolveInfo="StyleClassItem" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1186403803051">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="query" />
      <link role="target" targetNodeId="1176809959526" resolveInfo="QueryFunction_Color" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1186403713874">
      <property name="name" value="color" />
      <link role="dataType" targetNodeId="1083952545109" resolveInfo="_Colors_Enum" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1186403787518">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473854053" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1186403751766">
    <property name="package" value="Stylesheet" />
    <property name="name" value="FontStyleStyleClassItem" />
    <link role="extends" targetNodeId="1186402475462" resolveInfo="StyleClassItem" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1220975211821">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="query" />
      <link role="target" targetNodeId="1220974635399" resolveInfo="QueryFunction_FontStyle" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1186403918499">
      <property name="value" value="font-style" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1186403771423">
      <property name="name" value="style" />
      <link role="dataType" targetNodeId="1101211480448" resolveInfo="_FontStyle_Enum" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1221051468077">
      <link role="conceptLinkDeclaration" targetNodeId="1215701938122" resolveInfo="attributeConstant" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1221051476610">
        <link role="classifier" targetNodeId="41.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" targetNodeId="41.~StyleAttributes.FONT_STYLE" resolveInfo="FONT_STYLE" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1186404549998">
    <property name="package" value="Stylesheet" />
    <property name="name" value="ForegroundColorStyleClassItem" />
    <link role="extends" targetNodeId="1186403694788" resolveInfo="ColorStyleClassItem" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1215703469851">
      <link role="conceptLinkDeclaration" targetNodeId="1215701938122" resolveInfo="attributeConstant" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1215703469852">
        <link role="classifier" targetNodeId="41.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" targetNodeId="41.~StyleAttributes.TEXT_COLOR" resolveInfo="TEXT_COLOR" />
      </node>
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1186404568646">
      <property name="value" value="text-foreground-color" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1186404574412">
    <property name="package" value="Stylesheet" />
    <property name="name" value="BackgroundColorStyleClassItem" />
    <link role="extends" targetNodeId="1186403694788" resolveInfo="ColorStyleClassItem" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1186404589776">
      <property name="value" value="background-color" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1215703443814">
      <link role="conceptLinkDeclaration" targetNodeId="1215701938122" resolveInfo="attributeConstant" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1215703448660">
        <link role="classifier" targetNodeId="41.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" targetNodeId="41.~StyleAttributes.BACKGROUND_COLOR" resolveInfo="BACKGROUND_COLOR" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1186413799158">
    <property name="package" value="Stylesheet" />
    <property name="name" value="BracketColorStyleClassItem" />
    <link role="extends" targetNodeId="1186403694788" resolveInfo="ColorStyleClassItem" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1215703461771">
      <link role="conceptLinkDeclaration" targetNodeId="1215701938122" resolveInfo="attributeConstant" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1215703461772">
        <link role="classifier" targetNodeId="41.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" targetNodeId="41.~StyleAttributes.BRACKETS_COLOR" resolveInfo="BRACKETS_COLOR" />
      </node>
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1186413814629">
      <property name="value" value="bracket-color" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1186414536763">
    <property name="package" value="Stylesheet" />
    <property name="name" value="BooleanStyleSheetItem" />
    <link role="extends" targetNodeId="1186402475462" resolveInfo="StyleClassItem" />
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1186414551515">
      <property name="name" value="flag" />
      <link role="dataType" targetNodeId="3.1082983657063" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1186414559000">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473854053" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1186414928363">
    <property name="package" value="Stylesheet" />
    <property name="name" value="SelectableStyleSheetItem" />
    <link role="extends" targetNodeId="1186414536763" resolveInfo="BooleanStyleSheetItem" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1215702083875">
      <link role="conceptLinkDeclaration" targetNodeId="1215701938122" resolveInfo="attributeConstant" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1215702083876">
        <link role="classifier" targetNodeId="41.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" targetNodeId="41.~StyleAttributes.SELECTABLE" resolveInfo="SELECTABLE" />
      </node>
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1186414942927">
      <property name="value" value="selectable" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1186414949600">
    <property name="package" value="Stylesheet" />
    <property name="name" value="AutoDeletableStyleClassItem" />
    <link role="extends" targetNodeId="1186414536763" resolveInfo="BooleanStyleSheetItem" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1215702053365">
      <link role="conceptLinkDeclaration" targetNodeId="1215701938122" resolveInfo="attributeConstant" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1215702053366">
        <link role="classifier" targetNodeId="41.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" targetNodeId="41.~StyleAttributes.AUTO_DELETABLE" resolveInfo="AUTO_DELETABLE" />
      </node>
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1186414964929">
      <property name="value" value="auto-deletable" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1186414976055">
    <property name="package" value="Stylesheet" />
    <property name="name" value="DrawBorderStyleClassItem" />
    <link role="extends" targetNodeId="1186414536763" resolveInfo="BooleanStyleSheetItem" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1186414988603">
      <property name="value" value="draw-border" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1215702014501">
      <link role="conceptLinkDeclaration" targetNodeId="1215701938122" resolveInfo="attributeConstant" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1215702044051">
        <link role="classifier" targetNodeId="41.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" targetNodeId="41.~StyleAttributes.DRAW_BORDER" resolveInfo="DRAW_BORDER" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1186414999511">
    <property name="package" value="Stylesheet" />
    <property name="name" value="UnderlinedStyleClassItem" />
    <link role="extends" targetNodeId="1186402475462" resolveInfo="StyleClassItem" />
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1214316229833">
      <property name="name" value="underlined" />
      <link role="dataType" targetNodeId="1130847686886" resolveInfo="UnderlineStyle" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1186415029919">
      <property name="value" value="underlined" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1221219051630">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="query" />
      <link role="target" targetNodeId="1221062700015" resolveInfo="QueryFunction_Underlined" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1186415722038">
    <property name="package" value="Stylesheet" />
    <property name="name" value="FontSizeStyleClassItem" />
    <link role="extends" targetNodeId="1186402475462" resolveInfo="StyleClassItem" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1221064706952">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="query" />
      <property name="sourceCardinality" value="0..1" />
      <link role="target" targetNodeId="1221057094638" resolveInfo="QueryFunction_FontSize" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1186415796023">
      <property name="value" value="font-size" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1221209241505">
      <property name="name" value="value" />
      <link role="dataType" targetNodeId="3.1082983657062" resolveInfo="integer" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1186414860679">
    <property name="package" value="Stylesheet" />
    <property name="name" value="EditableStyleClassItem" />
    <link role="extends" targetNodeId="1186414536763" resolveInfo="BooleanStyleSheetItem" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1215702059789">
      <link role="conceptLinkDeclaration" targetNodeId="1215701938122" resolveInfo="attributeConstant" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1215702059790">
        <link role="classifier" targetNodeId="41.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" targetNodeId="41.~StyleAttributes.EDITABLE" resolveInfo="EDITABLE" />
      </node>
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1186414958479">
      <property name="value" value="editable" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1187258617779">
    <property name="package" value="Stylesheet" />
    <property name="name" value="ForegroundNullColorStyleClassItem" />
    <link role="extends" targetNodeId="1186403694788" resolveInfo="ColorStyleClassItem" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1215703479915">
      <link role="conceptLinkDeclaration" targetNodeId="1215701938122" resolveInfo="attributeConstant" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1215703479916">
        <link role="classifier" targetNodeId="41.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" targetNodeId="41.~StyleAttributes.NULL_TEXT_COLOR" resolveInfo="NULL_TEXT_COLOR" />
      </node>
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1187258725566">
      <property name="value" value="text-foreground-null-color" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationDataTypeDeclaration" id="1197893505573">
    <property name="name" value="_CaretPosition_Enum" />
    <link role="memberDataType" targetNodeId="3.1082983041843" resolveInfo="string" />
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1197893505574">
      <property name="internalValue" value="NONE" />
      <property name="externalValue" value="none" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1197893580900">
      <property name="internalValue" value="FIRST" />
      <property name="externalValue" value="first" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1197893584870">
      <property name="internalValue" value="LAST" />
      <property name="externalValue" value="last" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1198252130653">
    <property name="package" value="Stylesheet" />
    <property name="name" value="StyleSheetClassReference" />
    <link role="extends" targetNodeId="3.1133920641626" resolveInfo="BaseConcept" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1198252276894">
      <property name="sourceCardinality" value="1" />
      <property name="role" value="styleSheetClass" />
      <link role="target" targetNodeId="1186402373407" resolveInfo="StyleSheetClass" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1198256887712">
    <property name="package" value="CellModel" />
    <property name="name" value="CellModel_Indent" />
    <link role="extends" targetNodeId="1073389214265" resolveInfo="EditorCellModel" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1198256955554">
      <property name="value" value="---&gt;" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1198509278511">
      <property name="value" value="indent" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" resolveInfo="short_description" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1198257632966">
    <property name="package" value="CellModel" />
    <property name="name" value="CellModel_BlockStart" />
    <link role="extends" targetNodeId="1073389214265" resolveInfo="EditorCellModel" />
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1198504797640">
      <property name="name" value="openBrace" />
      <link role="dataType" targetNodeId="3.1082983041843" resolveInfo="string" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1198257692449">
      <property name="value" value="block start" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" resolveInfo="alias" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1198257747917">
    <property name="package" value="CellModel" />
    <property name="name" value="CellModel_BlockEnd" />
    <link role="extends" targetNodeId="1073389214265" resolveInfo="EditorCellModel" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1198257819370">
      <property name="value" value="block end" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" resolveInfo="alias" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1198506631483">
      <property name="name" value="closeBrace" />
      <link role="dataType" targetNodeId="3.1082983041843" resolveInfo="string" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1198489924438">
    <property name="package" value="CellModel" />
    <property name="name" value="CellModel_Block" />
    <link role="extends" targetNodeId="1073389214265" resolveInfo="EditorCellModel" />
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1198508727334">
      <property name="name" value="openBrace" />
      <link role="dataType" targetNodeId="3.1082983041843" resolveInfo="string" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1198508733600">
      <property name="name" value="closeBrace" />
      <link role="dataType" targetNodeId="3.1082983041843" resolveInfo="string" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1198490012674">
      <property name="value" value="block" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" resolveInfo="alias" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1198489985045">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="header" />
      <property name="sourceCardinality" value="0..1" />
      <link role="target" targetNodeId="1073389214265" resolveInfo="EditorCellModel" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1198489993734">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="body" />
      <property name="sourceCardinality" value="1" />
      <link role="target" targetNodeId="1073389214265" resolveInfo="EditorCellModel" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1201265905111">
    <property name="name" value="SelectLaterOperation" />
    <property name="package" value="SNode" />
    <link role="extends" targetNodeId="40.1138411891628" resolveInfo="SNodeOperation" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1201266028598">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="editorContext" />
      <property name="sourceCardinality" value="1" />
      <link role="target" targetNodeId="4.1068431790191" resolveInfo="Expression" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1201266036224">
      <property name="metaClass" value="aggregation" />
      <property name="sourceCardinality" value="0..n" />
      <property name="role" value="selectLaterParameter" />
      <link role="target" targetNodeId="1201266127262" resolveInfo="SelectLaterParameter" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1201269239863">
      <property name="value" value="select" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1201269290000">
      <link role="conceptPropertyDeclaration" targetNodeId="40.1138763241883" resolveInfo="applicable_to_node" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1201606885224">
      <link role="conceptPropertyDeclaration" targetNodeId="40.1138763325919" resolveInfo="applicable_to_link" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1201266127262">
    <property name="package" value="SNode" />
    <property name="name" value="SelectLaterParameter" />
    <link role="extends" targetNodeId="3.1133920641626" resolveInfo="BaseConcept" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1201266139935">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473854053" resolveInfo="abstract" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1201268783309">
    <property name="package" value="SNode" />
    <property name="name" value="SelectPositionParameter" />
    <link role="extends" targetNodeId="1201266127262" resolveInfo="SelectLaterParameter" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1201268911190">
      <property name="value" value="position=" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" resolveInfo="alias" />
    </node>
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1201268881975">
      <property name="name" value="position" />
      <link role="dataType" targetNodeId="1201268793545" resolveInfo="SelectPoisition" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationDataTypeDeclaration" id="1201268793545">
    <property name="package" value="SNode" />
    <property name="name" value="SelectPosition" />
    <link role="memberDataType" targetNodeId="3.1082983041843" resolveInfo="string" />
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1201268793546">
      <property name="internalValue" value="before" />
      <property name="externalValue" value="before" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1201268803781">
      <property name="internalValue" value="after" />
      <property name="externalValue" value="after" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1201270864927">
    <property name="package" value="SNode" />
    <property name="name" value="CaretPositionParameter" />
    <link role="extends" targetNodeId="1201266127262" resolveInfo="SelectLaterParameter" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1201270907764">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="position" />
      <property name="sourceCardinality" value="1" />
      <link role="target" targetNodeId="4.1068431790191" resolveInfo="Expression" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1201270898074">
      <property name="value" value="caret position=" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" resolveInfo="alias" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1214317859050">
    <property name="package" value="Stylesheet" />
    <property name="name" value="LayoutConstraintStyleClassItem" />
    <link role="extends" targetNodeId="1186402475462" resolveInfo="StyleClassItem" />
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1214317859051">
      <property name="name" value="layoutConstraint" />
      <link role="dataType" targetNodeId="1138197387103" resolveInfo="_Layout_Constraints_Enum" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1214317859052">
      <property name="value" value="layout constraint" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" resolveInfo="alias" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1214320119173">
    <property name="package" value="Stylesheet" />
    <property name="name" value="SideTransformAnchorTagStyleClassItem" />
    <link role="extends" targetNodeId="1186402475462" resolveInfo="StyleClassItem" />
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1214320119174">
      <property name="name" value="tag" />
      <link role="dataType" targetNodeId="1140813780565" resolveInfo="RightTransformAnchorTag" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1214320119175">
      <property name="value" value="side transform anchor tag" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" resolveInfo="alias" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1214406454886">
    <property name="package" value="Stylesheet" />
    <property name="name" value="TextBackgroundColorStyleClassItem" />
    <link role="extends" targetNodeId="1186403694788" resolveInfo="ColorStyleClassItem" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1215703515607">
      <link role="conceptLinkDeclaration" targetNodeId="1215701938122" resolveInfo="attributeConstant" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1215703515608">
        <link role="classifier" targetNodeId="41.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" targetNodeId="41.~StyleAttributes.TEXT_BACKGROUND_COLOR" resolveInfo="TEXT_BACKGROUND_COLOR" />
      </node>
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1214406454887">
      <property name="value" value="text-background-color" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" resolveInfo="alias" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1214406466686">
    <property name="package" value="Stylesheet" />
    <property name="name" value="TextBackgroundColorSelectedStyleClassItem" />
    <link role="extends" targetNodeId="1186403694788" resolveInfo="ColorStyleClassItem" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1215703491746">
      <link role="conceptLinkDeclaration" targetNodeId="1215701938122" resolveInfo="attributeConstant" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1215703491747">
        <link role="classifier" targetNodeId="41.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" targetNodeId="41.~StyleAttributes.SELECTED_TEXT_BACKGROUND_COLOR" resolveInfo="SELECTED_TEXT_BACKGROUND_COLOR" />
      </node>
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1214406466687">
      <property name="value" value="text-background-color-selected" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" resolveInfo="alias" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1214472762472">
    <property name="package" value="Stylesheet" />
    <property name="name" value="DefaultCaretPositionStyleClassItem" />
    <link role="extends" targetNodeId="1186402475462" resolveInfo="StyleClassItem" />
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1214472762473">
      <property name="name" value="position" />
      <link role="dataType" targetNodeId="1197893505573" resolveInfo="_CaretPosition_Enum" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1214472762474">
      <property name="value" value="default-caret-position" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" resolveInfo="alias" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1215007762405">
    <property name="package" value="Stylesheet" />
    <property name="name" value="FloatStyleClassItem" />
    <link role="extends" targetNodeId="1186402475462" resolveInfo="StyleClassItem" />
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1215007802031">
      <property name="name" value="value" />
      <link role="dataType" targetNodeId="4.1113006251687" resolveInfo="_FPNumber_String" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1215007873046">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473854053" resolveInfo="abstract" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1215007883204">
    <property name="package" value="Stylesheet" />
    <property name="name" value="PaddingLeftStyleClassItem" />
    <link role="extends" targetNodeId="1215007762405" resolveInfo="FloatStyleSheetItem" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1215007893986">
      <property name="value" value="padding-left" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" resolveInfo="alias" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1215007897487">
    <property name="package" value="Stylesheet" />
    <property name="name" value="PaddingRightStyleClassItem" />
    <link role="extends" targetNodeId="1215007762405" resolveInfo="FloatStyleSheetItem" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1215007897488">
      <property name="value" value="padding-right" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" resolveInfo="alias" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1215085112640">
    <property name="package" value="Stylesheet" />
    <property name="name" value="FirstPositionAllowedStyleClassItem" />
    <link role="extends" targetNodeId="1186414536763" resolveInfo="BooleanStyleSheetItem" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1215702064900">
      <link role="conceptLinkDeclaration" targetNodeId="1215701938122" resolveInfo="attributeConstant" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1215702064901">
        <link role="classifier" targetNodeId="41.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" targetNodeId="41.~StyleAttributes.FIRST_POSITION_ALLOWED" resolveInfo="FIRST_POSITION_ALLOWED" />
      </node>
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1215085187379">
      <property name="value" value="first-position-allowed" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" resolveInfo="alias" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1215085197271">
    <property name="package" value="Stylesheet" />
    <property name="name" value="LastPositionAllowedStyleClassItem" />
    <link role="extends" targetNodeId="1186414536763" resolveInfo="BooleanStyleSheetItem" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1215702077186">
      <link role="conceptLinkDeclaration" targetNodeId="1215701938122" resolveInfo="attributeConstant" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1215702077187">
        <link role="classifier" targetNodeId="41.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" targetNodeId="41.~StyleAttributes.LAST_POSITION_ALLOWED" resolveInfo="LAST_POSITION_ALLOWED" />
      </node>
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1215085197272">
      <property name="value" value="last-position-allowed" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" resolveInfo="alias" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationDataTypeDeclaration" id="1216308376568">
    <property name="name" value="_NextLine_Enum" />
    <link role="memberDataType" targetNodeId="3.1082983041843" resolveInfo="string" />
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1216308507057">
      <property name="externalValue" value="right" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1216308502931">
      <property name="externalValue" value="next-line" />
      <property name="internalValue" value="next-line" />
    </node>
    <node role="member" type="jetbrains.mps.bootstrap.structureLanguage.structure.EnumerationMemberDeclaration" id="1216308376569">
      <property name="externalValue" value="indented" />
      <property name="internalValue" value="indented" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1216308599511">
    <property name="package" value="Stylesheet" />
    <property name="name" value="PositionStyleClassItem" />
    <property name="rootable" value="false" />
    <link role="extends" targetNodeId="1186402475462" resolveInfo="StyleClassItem" />
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1216308761668">
      <property name="name" value="position" />
      <link role="dataType" targetNodeId="1216308376568" resolveInfo="_NextLine_Enum" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1216308818747">
      <property name="value" value="position" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" resolveInfo="alias" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1216380990741">
    <property name="package" value="CellModel" />
    <property name="name" value="CellModel_TransactionalProperty" />
    <link role="extends" targetNodeId="1079353555532" resolveInfo="CellModel_AbstractLabel" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1216385453572">
      <property name="value" value="{T &lt;{property}&gt; T}" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" resolveInfo="alias" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1216381211800">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="handlerBlock" />
      <property name="sourceCardinality" value="1" />
      <link role="target" targetNodeId="1216381054717" resolveInfo="TransactionalPropertyHandler" />
    </node>
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1216381219207">
      <property name="metaClass" value="reference" />
      <property name="role" value="property" />
      <property name="sourceCardinality" value="1" />
      <link role="target" targetNodeId="1.1071489288299" resolveInfo="PropertyDeclaration" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1216381054717">
    <property name="package" value="QueryFunction" />
    <property name="name" value="TransactionalPropertyHandler" />
    <link role="extends" targetNodeId="4.1137021947720" resolveInfo="ConceptFunction" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1216381097005">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" targetNodeId="1216381148013" resolveInfo="TransactionPropertyHandler_newValue" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1216381170362">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" targetNodeId="1216381117100" resolveInfo="TransactionPropertyHandler_oldValue" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1216384575593">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" targetNodeId="1161622981231" resolveInfo="ConceptFunctionParameter_editorContext" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1216384575594">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" targetNodeId="1142886811589" resolveInfo="ConceptFunctionParameter_node" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1216381091954">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545148427" resolveInfo="conceptFunctionReturnType" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1216381093987" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1216381117100">
    <property name="package" value="QueryFunction" />
    <property name="name" value="TransactionPropertyHandler_oldValue" />
    <link role="extends" targetNodeId="4.1107135704075" resolveInfo="ConceptFunctionParameter" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1216381136570">
      <property name="value" value="oldValue" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" resolveInfo="alias" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1216381142494">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545963098" resolveInfo="conceptFunctionParameterType" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1216381143949">
        <link role="classifier" targetNodeId="36.~String" resolveInfo="String" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1216381148013">
    <property name="package" value="QueryFunction" />
    <property name="name" value="TransactionPropertyHandler_newValue" />
    <link role="extends" targetNodeId="4.1107135704075" resolveInfo="ConceptFunctionParameter" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1216381148014">
      <property name="value" value="newValue" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" resolveInfo="alias" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1216383773966">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473994950" resolveInfo="dontSubstituteByDefault" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1216381148015">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545963098" resolveInfo="conceptFunctionParameterType" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1216381148016">
        <link role="classifier" targetNodeId="36.~String" resolveInfo="String" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1216560327200">
    <property name="package" value="Stylesheet" />
    <property name="name" value="PositionChildrenStyleClassItem" />
    <link role="extends" targetNodeId="1186402475462" resolveInfo="StyleClassItem" />
    <node role="propertyDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration" id="1216560518566">
      <property name="name" value="position" />
      <link role="dataType" targetNodeId="1216308376568" resolveInfo="_NextLine_Enum" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1216560546489">
      <property name="value" value="position-children" />
      <property name="name" value="position-children" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" resolveInfo="alias" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1216672142186">
    <property name="package" value="CellLayout" />
    <property name="name" value="CellLayout_Indent" />
    <link role="extends" targetNodeId="1106270491082" resolveInfo="CellLayout" />
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1219226236603">
    <property name="package" value="Stylesheet" />
    <property name="name" value="DrawBracketsStyleClassItem" />
    <link role="extends" targetNodeId="1186414536763" resolveInfo="BooleanStyleSheetItem" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1219226236604">
      <link role="conceptLinkDeclaration" targetNodeId="1215701938122" resolveInfo="attributeConstant" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1219226236605">
        <link role="classifier" targetNodeId="41.~StyleAttributes" resolveInfo="StyleAttributes" />
        <link role="variableDeclaration" targetNodeId="41.~StyleAttributes.DRAW_BRACKETS" resolveInfo="DRAW_BRACKETS" />
      </node>
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1219226236606">
      <property name="value" value="draw-brackets" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" resolveInfo="alias" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.InterfaceConceptDeclaration" id="1219418625346">
    <property name="package" value="Stylesheet" />
    <property name="name" value="IStyleContainer" />
    <node role="linkDeclaration" type="jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration" id="1219418656006">
      <property name="metaClass" value="aggregation" />
      <property name="role" value="styleItem" />
      <property name="sourceCardinality" value="0..n" />
      <link role="target" targetNodeId="1186402475462" resolveInfo="StyleClassItem" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1220974635399">
    <property name="package" value="QueryFunction.Style" />
    <property name="name" value="QueryFunction_FontStyle" />
    <link role="extends" targetNodeId="1221059528506" resolveInfo="QueryFunction_StyleParameter" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1220974841934">
      <property name="value" value="font style function" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" resolveInfo="alias" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1220974915063">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545148427" resolveInfo="conceptFunctionReturnType" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1221052118278" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1221057094638">
    <property name="package" value="QueryFunction.Style" />
    <property name="name" value="QueryFunction_Integer" />
    <link role="extends" targetNodeId="1221059528506" resolveInfo="QueryFunction_StyleParameter" />
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1221057195672">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545148427" resolveInfo="conceptFunctionReturnType" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1221057195673" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1221057173654">
      <property name="value" value="font size function" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" resolveInfo="alias" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1221059528506">
    <property name="package" value="QueryFunction.Style" />
    <property name="name" value="QueryFunction_StyleParameter" />
    <link role="extends" targetNodeId="4.1137021947720" resolveInfo="ConceptFunction" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.BooleanConceptProperty" id="1221211298019">
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473854053" resolveInfo="abstract" />
    </node>
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1221059797722">
      <property name="value" value="embedded block of code" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473914776" resolveInfo="short_description" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1221059701511">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" targetNodeId="1142886811589" resolveInfo="ConceptFunctionParameter_node" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.ReferenceConceptLink" id="1221059701512">
      <link role="conceptLinkDeclaration" targetNodeId="4.1161119487665" resolveInfo="applicableConceptFunctionParameter" />
      <link role="target" targetNodeId="1161622981231" resolveInfo="ConceptFunctionParameter_editorContext" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1221060393848">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545148427" resolveInfo="conceptFunctionReturnType" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1221060400056">
        <link role="classifier" targetNodeId="36.~Object" resolveInfo="Object" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration" id="1221062700015">
    <property name="package" value="QueryFunction.Style" />
    <property name="name" value="QueryFunction_Underlined" />
    <link role="extends" targetNodeId="1221059528506" resolveInfo="QueryFunction_StyleParameter" />
    <node role="conceptProperty" type="jetbrains.mps.bootstrap.structureLanguage.structure.StringConceptProperty" id="1221062795610">
      <property name="value" value="underlined function" />
      <link role="conceptPropertyDeclaration" targetNodeId="3.1137473891462" resolveInfo="alias" />
    </node>
    <node role="conceptLink" type="jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLink" id="1221062811502">
      <link role="conceptLinkDeclaration" targetNodeId="4.1137545148427" resolveInfo="conceptFunctionReturnType" />
      <node role="target" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1221062816176" />
    </node>
  </node>
</model>


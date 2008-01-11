<?xml version="1.0" encoding="UTF-8"?>
<language namespace="jetbrains.mps.bootstrap.helgins" pluginClass="jetbrains.mps.helgins.integration.HelginsLangPlugin" generatorOutputPath="${mps_home}\languages\bootstrap\helgins\source_gen" compileInMPS="false">
  <structure>
    <model modelUID="jetbrains.mps.bootstrap.helgins.structure" />
  </structure>
  <helginsTypeSystem>
    <model modelUID="jetbrains.mps.bootstrap.helgins.helgins" />
  </helginsTypeSystem>
  <actions>
    <model modelUID="jetbrains.mps.bootstrap.helgins.actions" />
  </actions>
  <constraints>
    <model modelUID="jetbrains.mps.bootstrap.helgins.constraints" />
  </constraints>
  <editor>
    <model modelUID="jetbrains.mps.bootstrap.helgins.editor" />
  </editor>
  <models>
    <modelRoot path="${language_descriptor}\languageModels" namespacePrefix="jetbrains.mps.bootstrap.helgins" />
    <modelRoot path="${language_descriptor}\languageAccessories" namespacePrefix="jetbrains.mps.bootstrap.helgins" />
  </models>
  <module />
  <accessoryModels>
    <model modelUID="jetbrains.mps.bootstrap.helgins.dependencies" />
  </accessoryModels>
  <intentions>
    <model modelUID="jetbrains.mps.bootstrap.helgins.intentions" />
  </intentions>
  <generators>
    <generator generatorUID="jetbrains.mps.bootstrap.helgins#1174411220599" targetLanguage="jetbrains.mps.baseLanguage">
      <models>
        <modelRoot path="${language_descriptor}\generator\baseLanguage\template" namespacePrefix="jetbrains.mps.bootstrap.helgins.generator.baseLanguage.template" />
      </models>
      <module />
      <external-templates />
      <dependencies>
        <dependency>jetbrains.mps.baseLanguage</dependency>
      </dependencies>
      <mapping-priorities />
    </generator>
    <generator generatorUID="jetbrains.mps.bootstrap.helgins#1196355955034" targetLanguage="jetbrains.mps.quotation">
      <models>
        <modelRoot path="${language_descriptor}\generator\quotation\template" namespacePrefix="jetbrains.mps.bootstrap.helgins.generator.quotation.template" />
      </models>
      <module />
      <external-templates />
      <dependencies>
        <dependency>jetbrains.mps.quotation</dependency>
      </dependencies>
      <mapping-priorities />
    </generator>
  </generators>
  <classPath>
    <entry path="${mps_home}\languages\bootstrap\helgins\classes" />
  </classPath>
  <runtimeClassPath>
    <entry path="${mps_home}\languages\bootstrap\helgins\classes" />
  </runtimeClassPath>
  <sourcePath />
  <osgiOptions>
    <requiredBundles />
    <exportedPackage />
  </osgiOptions>
  <dependencies>
    <dependency>jetbrains.mps.baseLanguage</dependency>
    <dependency>jetbrains.mps.patterns</dependency>
    <dependency>jetbrains.mps.bootstrap.smodelLanguage</dependency>
  </dependencies>
</language>


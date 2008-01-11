<?xml version="1.0" encoding="UTF-8"?>
<language namespace="jetbrains.mps.bootstrap.structureLanguage" generatorOutputPath="${language_descriptor}\source_gen" compileInMPS="false">
  <structure>
    <model modelUID="jetbrains.mps.bootstrap.structureLanguage.structure" />
  </structure>
  <actions>
    <model modelUID="jetbrains.mps.bootstrap.structureLanguage.actions" />
  </actions>
  <constraints>
    <model modelUID="jetbrains.mps.bootstrap.structureLanguage.constraints" />
  </constraints>
  <scripts>
    <model modelUID="jetbrains.mps.bootstrap.structureLanguage.scripts" />
  </scripts>
  <editor>
    <model modelUID="jetbrains.mps.bootstrap.structureLanguage.editor" />
  </editor>
  <models>
    <modelRoot path="${language_descriptor}\languageModels" namespacePrefix="jetbrains.mps.bootstrap.structureLanguage" />
    <modelRoot path="${language_descriptor}\languageAccessories" namespacePrefix="jetbrains.mps.bootstrap.structureLanguage" />
  </models>
  <module />
  <accessoryModels>
    <model modelUID="jetbrains.mps.core.structure" />
  </accessoryModels>
  <find_usages>
    <model modelUID="jetbrains.mps.bootstrap.structureLanguage.findUsages" />
  </find_usages>
  <generators>
    <generator generatorUID="jetbrains.mps.bootstrap.structureLanguage#1170324972255" targetLanguage="jetbrains.mps.baseLanguage">
      <models>
        <modelRoot path="${language_descriptor}\generator_new" namespacePrefix="jetbrains.mps.bootstrap.structureLanguage.generator_new" />
      </models>
      <module />
      <external-templates />
      <mapping-priorities />
    </generator>
  </generators>
  <classPath />
  <runtimeClassPath>
    <entry path="${language_descriptor}\classes" />
  </runtimeClassPath>
  <sourcePath />
  <osgiOptions>
    <requiredBundles />
    <exportedPackage />
  </osgiOptions>
</language>


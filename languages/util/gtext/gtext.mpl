<?xml version="1.0" encoding="UTF-8"?>
<language namespace="jetbrains.mps.gtext" uuid="a83c3bd0-2f7e-4ba1-8373-12d49e99f57e" compileInMPS="true" doNotGenerateAdapters="false">
  <models>
    <modelRoot path="${language_descriptor}/languageModels" namespacePrefix="jetbrains.mps.gtext" />
  </models>
  <accessoryModels />
  <generators>
    <generator generatorUID="jetbrains.mps.gtext#1164413905312" uuid="bfcadeff-430f-4472-9641-06156a02be37">
      <models>
        <modelRoot path="${language_descriptor}/generators/baseLanguage/templates" namespacePrefix="jetbrains.mps.gtext.generator.baseLanguage.template" />
      </models>
      <external-templates />
      <usedLanguages>
        <usedLanguage>df345b11-b8c7-4213-ac66-48d2a9b75d88(jetbrains.mps.baseLanguageInternal)</usedLanguage>
      </usedLanguages>
      <mapping-priorities>
        <mapping-priority-rule kind="strictly_before">
          <greater-priority-mapping>
            <generator generatorUID="bfcadeff-430f-4472-9641-06156a02be37(jetbrains.mps.gtext#1164413905312)" />
            <external-mapping>
              <mapping-node modelUID="r:00000000-0000-4000-0000-011c89590576(jetbrains.mps.gtext.generator.baseLanguage.template.main@generator)" nodeID="4246810654489660286" />
            </external-mapping>
          </greater-priority-mapping>
          <lesser-priority-mapping>
            <generator generatorUID="bfcadeff-430f-4472-9641-06156a02be37(jetbrains.mps.gtext#1164413905312)" />
            <external-mapping>
              <mapping-node modelUID="r:00000000-0000-4000-0000-011c89590576(jetbrains.mps.gtext.generator.baseLanguage.template.main@generator)" nodeID="1164413908130" />
            </external-mapping>
          </lesser-priority-mapping>
        </mapping-priority-rule>
      </mapping-priorities>
    </generator>
  </generators>
  <dependencies>
    <dependency reexport="true">34f23130-e35c-4795-a45a-85d828b16016(jetbrains.mps.gtext.runtime)</dependency>
  </dependencies>
  <usedDevKits>
    <usedDevKit>2677cb18-f558-4e33-bc38-a5139cee06dc(jetbrains.mps.devkit.language-design)</usedDevKit>
  </usedDevKits>
  <runtime>
    <dependency reexport="true">34f23130-e35c-4795-a45a-85d828b16016(jetbrains.mps.gtext.runtime)</dependency>
  </runtime>
  <extendedLanguages>
    <extendedLanguage>f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)</extendedLanguage>
    <extendedLanguage>ceab5195-25ea-4f22-9b92-103b95ca8c0c(jetbrains.mps.lang.core)</extendedLanguage>
  </extendedLanguages>
</language>


<?xml version="1.0" encoding="UTF-8"?>
<language namespace="jetbrains.mps.ui.swt" uuid="71c80332-b17f-4f0a-be23-b5cba1d261f7" compileInMPS="true" doNotGenerateAdapters="false">
  <models>
    <modelRoot path="${language_descriptor}/languageAccessories" namespacePrefix="jetbrains.mps.ui.swt" />
    <modelRoot path="${language_descriptor}/languageModels" namespacePrefix="jetbrains.mps.ui.swt" />
  </models>
  <accessoryModels>
    <model modelUID="r:b5bea281-ab90-4fa9-bfa9-a6d130009710(jetbrains.mps.ui.swt.events)" />
    <model modelUID="r:fdfa4297-e47f-4051-a403-8ec60f159a16(jetbrains.mps.ui.swt.widgets)" />
  </accessoryModels>
  <generators>
    <generator name="ui" generatorUID="jetbrains.mps.ui.swt#1250358102411218055" uuid="fc9ba4c3-4355-4a86-b84b-1c46c728f9ea">
      <models>
        <modelRoot path="${language_descriptor}/generator/template" namespacePrefix="jetbrains.mps.ui.swt.generator.template" />
      </models>
      <external-templates>
        <generator generatorUID="da5e4290-fe8f-4051-99eb-423e4107c1b4(jetbrains.mps.ui#5725024602606565468)" />
      </external-templates>
      <dependencies>
        <dependency reexport="false">da5e4290-fe8f-4051-99eb-423e4107c1b4(jetbrains.mps.ui#5725024602606565468)</dependency>
        <dependency reexport="false">a5a5d5ab-3987-4848-9421-998f92430773(jetbrains.mps.ui.gwt#9106854556042091019)</dependency>
        <dependency reexport="false">8a448bd0-1380-4c01-9820-0f051d33888c(jetbrains.mps.ui.modeling)</dependency>
        <dependency reexport="false">feb13c42-6479-4631-bedd-7524f34b91c0(jetbrains.mps.ui.swing#5725024602606914374)</dependency>
        <dependency reexport="false">69934240-945d-492b-83e7-39bda70200e7(jetbrains.mps.ui.swt.runtime)</dependency>
      </dependencies>
      <usedLanguages>
        <usedLanguage>f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)</usedLanguage>
        <usedLanguage>5dc5fc0d-37ef-4782-8192-8b5ce1f69f80(jetbrains.mps.baseLanguage.extensionMethods)</usedLanguage>
        <usedLanguage>ceab5195-25ea-4f22-9b92-103b95ca8c0c(jetbrains.mps.lang.core)</usedLanguage>
      </usedLanguages>
      <usedDevKits>
        <usedDevKit>2677cb18-f558-4e33-bc38-a5139cee06dc(jetbrains.mps.devkit.language-design)</usedDevKit>
      </usedDevKits>
      <mapping-priorities>
        <mapping-priority-rule kind="strictly_together">
          <greater-priority-mapping>
            <generator generatorUID="fc9ba4c3-4355-4a86-b84b-1c46c728f9ea(jetbrains.mps.ui.swt#1250358102411218055)" />
            <external-mapping>
              <mapping-node modelUID="r:73e6a865-ca49-4dc1-9fd2-b963d45d4e87(jetbrains.mps.ui.swt.generator.template.main@generator)" nodeID="1250358102411225027" />
            </external-mapping>
          </greater-priority-mapping>
          <lesser-priority-mapping>
            <generator generatorUID="da5e4290-fe8f-4051-99eb-423e4107c1b4(jetbrains.mps.ui#5725024602606565468)" />
            <external-mapping>
              <mapping-set>
                <mapping-set-element>
                  <mapping-node modelUID="r:7fdb3fe3-1923-41bc-947f-2eaffc319dea(jetbrains.mps.ui.generator.template.main@generator)" nodeID="*" />
                </mapping-set-element>
                <mapping-set-element>
                  <mapping-node modelUID="r:39023b18-af4f-44db-bcb1-c118a59086cd(jetbrains.mps.ui.generator.template.meta@generator)" nodeID="*" />
                </mapping-set-element>
              </mapping-set>
            </external-mapping>
          </lesser-priority-mapping>
        </mapping-priority-rule>
        <mapping-priority-rule kind="strictly_before">
          <greater-priority-mapping>
            <generator generatorUID="fc9ba4c3-4355-4a86-b84b-1c46c728f9ea(jetbrains.mps.ui.swt#1250358102411218055)" />
            <external-mapping>
              <mapping-node modelUID="r:73e6a865-ca49-4dc1-9fd2-b963d45d4e87(jetbrains.mps.ui.swt.generator.template.main@generator)" nodeID="1250358102411225027" />
            </external-mapping>
          </greater-priority-mapping>
          <lesser-priority-mapping>
            <generator generatorUID="fc9ba4c3-4355-4a86-b84b-1c46c728f9ea(jetbrains.mps.ui.swt#1250358102411218055)" />
            <external-mapping>
              <mapping-node modelUID="r:73e6a865-ca49-4dc1-9fd2-b963d45d4e87(jetbrains.mps.ui.swt.generator.template.main@generator)" nodeID="873604604380269076" />
            </external-mapping>
          </lesser-priority-mapping>
        </mapping-priority-rule>
        <mapping-priority-rule kind="strictly_before">
          <greater-priority-mapping>
            <generator generatorUID="fc9ba4c3-4355-4a86-b84b-1c46c728f9ea(jetbrains.mps.ui.swt#1250358102411218055)" />
            <external-mapping>
              <mapping-node modelUID="r:73e6a865-ca49-4dc1-9fd2-b963d45d4e87(jetbrains.mps.ui.swt.generator.template.main@generator)" nodeID="873604604380269076" />
            </external-mapping>
          </greater-priority-mapping>
          <lesser-priority-mapping>
            <generator generatorUID="da5e4290-fe8f-4051-99eb-423e4107c1b4(jetbrains.mps.ui#5725024602606565468)" />
            <external-mapping>
              <mapping-node modelUID="r:0c4bfdbb-e20d-4270-a9e7-42e358fb6809(jetbrains.mps.ui.generator.template.cleanup@generator)" nodeID="*" />
            </external-mapping>
          </lesser-priority-mapping>
        </mapping-priority-rule>
      </mapping-priorities>
    </generator>
  </generators>
  <sourcePath />
  <dependencies>
    <dependency reexport="false">8a448bd0-1380-4c01-9820-0f051d33888c(jetbrains.mps.ui.modeling)</dependency>
    <dependency reexport="false">fc9ba4c3-4355-4a86-b84b-1c46c728f9ea(jetbrains.mps.ui.swt#1250358102411218055)</dependency>
    <dependency reexport="true">69934240-945d-492b-83e7-39bda70200e7(jetbrains.mps.ui.swt.runtime)</dependency>
  </dependencies>
  <usedLanguages>
    <usedLanguage>f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)</usedLanguage>
    <usedLanguage>fd392034-7849-419d-9071-12563d152375(jetbrains.mps.baseLanguage.closures)</usedLanguage>
    <usedLanguage>83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)</usedLanguage>
  </usedLanguages>
  <usedDevKits>
    <usedDevKit>2677cb18-f558-4e33-bc38-a5139cee06dc(jetbrains.mps.devkit.language-design)</usedDevKit>
  </usedDevKits>
  <extendedLanguages>
    <extendedLanguage>fb26dccf-fa54-4e9a-8ddb-b66311a34393(jetbrains.mps.ui)</extendedLanguage>
  </extendedLanguages>
</language>


<?xml version="1.0" encoding="UTF-8"?>
<language namespace="ypath">
  <structure>
    <model modelUID="ypath.structure" />
  </structure>
  <helginsTypeSystem>
    <model modelUID="ypath.helgins" />
  </helginsTypeSystem>
  <actions>
    <model modelUID="ypath.actions" />
  </actions>
  <constraints>
    <model modelUID="ypath.constraints" />
  </constraints>
  <scripts>
    <model modelUID="ypath.scripts" />
  </scripts>
  <editor>
    <model modelUID="ypath.editor" />
  </editor>
  <models>
    <modelRoot path="${language_descriptor}\languageModels" namespacePrefix="ypath" />
    <modelRoot path="${language_descriptor}\languageAccessories" namespacePrefix="ypath" />
  </models>
  <module />
  <accessoryModels>
    <model modelUID="ypath.treepaths" />
  </accessoryModels>
  <generators>
    <generator generatorUID="ypath#1168438160182" targetLanguage="jetbrains.mps.baseLanguage">
      <models>
        <modelRoot path="${language_descriptor}\generators\baseLanguage\templates" namespacePrefix="ypath.generator.baseLanguage.template" />
      </models>
      <module>
        <moduleRoot path="${mps_home}\languages\baseLanguage\language\baseLanguage.mpl" />
        <moduleRoot path="${mps_home}\baseLanguage\languages\baseLanguageInternal\baseLanguageInternal.mpl" />
      </module>
      <external-templates>
        <generator generatorUID="jetbrains.mps.baseLanguage#1129914002933" />
      </external-templates>
      <mapping-priorities>
        <mapping-priority-rule kind="strictly_together">
          <greater-priority-mapping>
            <mapping-node modelUID="ypath.generator.baseLanguage.template.main@templates" nodeID="1168438163478" />
          </greater-priority-mapping>
          <lesser-priority-mapping>
            <generator generatorUID="jetbrains.mps.baseLanguage#1129914002933" />
            <external-mapping>
              <mapping-node modelUID="jetbrains.mps.baseLanguage.generator.java.closures@templates" nodeID="*" />
            </external-mapping>
          </lesser-priority-mapping>
        </mapping-priority-rule>
      </mapping-priorities>
    </generator>
  </generators>
  <classPath>
    <entry path="${mps_home}\platform\ypath\classes" />
    <entry path="${mps_home}\paltform\ypath\runtime\classes" />
  </classPath>
</language>


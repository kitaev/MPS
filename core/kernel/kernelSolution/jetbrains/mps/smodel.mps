<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:5ff047e0-2953-4750-806a-bdc16824aa89(jetbrains.mps.smodel)">
  <persistence version="4" />
  <refactoringHistory />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <language namespace="fd392034-7849-419d-9071-12563d152375(jetbrains.mps.baseLanguage.closures)" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <languageAspect modelUID="r:5ff047e0-2953-4750-806a-bdc16824aa89(jetbrains.mps.smodel)" version="-1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590282(jetbrains.mps.lang.core.behavior)" version="-1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959028b(jetbrains.mps.lang.structure.behavior)" version="-1" />
  <languageAspect modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" />
  <maxImportIndex value="7" />
  <import index="1" modelUID="f:java_stub#jetbrains.mps.project.structure.modules(jetbrains.mps.project.structure.modules@java_stub)" version="-1" />
  <import index="4" modelUID="f:java_stub#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)" version="-1" />
  <import index="5" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <import index="6" modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" />
  <import index="7" modelUID="f:java_stub#java.util(java.util@java_stub)" version="-1" />
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="5073169472575923460">
    <property name="name:3" value="BootstrapLanguages" />
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="5073169472575947667">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="ACTIONS" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575947771" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575947669">
        <link role="classifier:3" targetNodeId="1.~ModuleReference" resolveInfo="ModuleReference" />
      </node>
      <node role="initializer:3" type="jetbrains.mps.lang.smodel.structure.CheckedModuleReference:16" id="5073169472575947670">
        <property name="moduleId:16" value="aee9cad2-acd4-4608-aef2-0004f6a1cdbd(jetbrains.mps.lang.actions)" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="5073169472575947675">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="BEHAVIOR" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575947773" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575947677">
        <link role="classifier:3" targetNodeId="1.~ModuleReference" resolveInfo="ModuleReference" />
      </node>
      <node role="initializer:3" type="jetbrains.mps.lang.smodel.structure.CheckedModuleReference:16" id="5073169472575947678">
        <property name="moduleId:16" value="af65afd8-f0dd-4942-87d9-63a55f2a9db1(jetbrains.mps.lang.behavior)" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="5073169472575947671">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="CONSTRAINTS" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575947772" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575947673">
        <link role="classifier:3" targetNodeId="1.~ModuleReference" resolveInfo="ModuleReference" />
      </node>
      <node role="initializer:3" type="jetbrains.mps.lang.smodel.structure.CheckedModuleReference:16" id="5073169472575947674">
        <property name="moduleId:16" value="3f4bc5f5-c6c1-4a28-8b10-c83066ffa4a1(jetbrains.mps.lang.constraints)" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="5073169472575947786">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="CORE" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575947787" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575947788">
        <link role="classifier:3" targetNodeId="1.~ModuleReference" resolveInfo="ModuleReference" />
      </node>
      <node role="initializer:3" type="jetbrains.mps.lang.smodel.structure.CheckedModuleReference:16" id="5073169472575947789">
        <property name="moduleId:16" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c(jetbrains.mps.lang.core)" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="5073169472575947703">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="DATA_FLOW" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575947780" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575947705">
        <link role="classifier:3" targetNodeId="1.~ModuleReference" resolveInfo="ModuleReference" />
      </node>
      <node role="initializer:3" type="jetbrains.mps.lang.smodel.structure.CheckedModuleReference:16" id="5073169472575947706">
        <property name="moduleId:16" value="7fa12e9c-b949-4976-b4fa-19accbc320b4(jetbrains.mps.lang.dataFlow)" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="5073169472575947663">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="EDITOR" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575947770" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575947665">
        <link role="classifier:3" targetNodeId="1.~ModuleReference" resolveInfo="ModuleReference" />
      </node>
      <node role="initializer:3" type="jetbrains.mps.lang.smodel.structure.CheckedModuleReference:16" id="5073169472575947666">
        <property name="moduleId:16" value="18bc6592-03a6-4e29-a83a-7ff23bde13ba(jetbrains.mps.lang.editor)" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="5073169472575947695">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="FIND_USAGES" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575947778" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575947697">
        <link role="classifier:3" targetNodeId="1.~ModuleReference" resolveInfo="ModuleReference" />
      </node>
      <node role="initializer:3" type="jetbrains.mps.lang.smodel.structure.CheckedModuleReference:16" id="5073169472575947698">
        <property name="moduleId:16" value="64d34fcd-ad02-4e73-aff8-a581124c2e30(jetbrains.mps.lang.findUsages)" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="5073169472575947723">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="GENERATOR" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575947785" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575947725">
        <link role="classifier:3" targetNodeId="1.~ModuleReference" resolveInfo="ModuleReference" />
      </node>
      <node role="initializer:3" type="jetbrains.mps.lang.smodel.structure.CheckedModuleReference:16" id="5073169472575947726">
        <property name="moduleId:16" value="b401a680-8325-4110-8fd3-84331ff25bef(jetbrains.mps.lang.generator)" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="5073169472575947691">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="INTENTIONS" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575947777" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575947693">
        <link role="classifier:3" targetNodeId="1.~ModuleReference" resolveInfo="ModuleReference" />
      </node>
      <node role="initializer:3" type="jetbrains.mps.lang.smodel.structure.CheckedModuleReference:16" id="5073169472575947694">
        <property name="moduleId:16" value="d7a92d38-f7db-40d0-8431-763b0c3c9f20(jetbrains.mps.lang.intentions)" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="5073169472575947699">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="PLUGIN" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575947779" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575947701">
        <link role="classifier:3" targetNodeId="1.~ModuleReference" resolveInfo="ModuleReference" />
      </node>
      <node role="initializer:3" type="jetbrains.mps.lang.smodel.structure.CheckedModuleReference:16" id="5073169472575947702">
        <property name="moduleId:16" value="28f9e497-3b42-4291-aeba-0a1039153ab1(jetbrains.mps.lang.plugin)" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="5073169472575947683">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="REFACTORING" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575947775" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575947685">
        <link role="classifier:3" targetNodeId="1.~ModuleReference" resolveInfo="ModuleReference" />
      </node>
      <node role="initializer:3" type="jetbrains.mps.lang.smodel.structure.CheckedModuleReference:16" id="5073169472575947686">
        <property name="moduleId:16" value="3ecd7c84-cde3-45de-886c-135ecc69b742(jetbrains.mps.lang.refactoring)" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="5073169472575947687">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="SCRIPT" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575947776" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575947689">
        <link role="classifier:3" targetNodeId="1.~ModuleReference" resolveInfo="ModuleReference" />
      </node>
      <node role="initializer:3" type="jetbrains.mps.lang.smodel.structure.CheckedModuleReference:16" id="5073169472575947690">
        <property name="moduleId:16" value="0eddeefa-c2d6-4437-bc2c-de50fd4ce470(jetbrains.mps.lang.script)" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="5073169472575947790">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="SHARED_CONCEPTS" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575947791" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575947792">
        <link role="classifier:3" targetNodeId="1.~ModuleReference" resolveInfo="ModuleReference" />
      </node>
      <node role="initializer:3" type="jetbrains.mps.lang.smodel.structure.CheckedModuleReference:16" id="5073169472575947793">
        <property name="moduleId:16" value="13744753-c81f-424a-9c1b-cf8943bf4e86(jetbrains.mps.lang.sharedConcepts)" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="5073169472575947719">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="SMODEL" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575947784" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575947721">
        <link role="classifier:3" targetNodeId="1.~ModuleReference" resolveInfo="ModuleReference" />
      </node>
      <node role="initializer:3" type="jetbrains.mps.lang.smodel.structure.CheckedModuleReference:16" id="5073169472575947722">
        <property name="moduleId:16" value="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="5073169472575947659">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="STRUCTURE" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575947769" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575947661">
        <link role="classifier:3" targetNodeId="1.~ModuleReference" resolveInfo="ModuleReference" />
      </node>
      <node role="initializer:3" type="jetbrains.mps.lang.smodel.structure.CheckedModuleReference:16" id="5073169472575947662">
        <property name="moduleId:16" value="c72da2b9-7cce-4447-8389-f407dc1158b7(jetbrains.mps.lang.structure)" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="5073169472575947715">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="STUBS" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575947783" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575947717">
        <link role="classifier:3" targetNodeId="1.~ModuleReference" resolveInfo="ModuleReference" />
      </node>
      <node role="initializer:3" type="jetbrains.mps.lang.smodel.structure.CheckedModuleReference:16" id="5073169472575947718">
        <property name="moduleId:16" value="ef703a71-a5a3-42af-b53c-ddced816ad5c(jetbrains.mps.lang.stubs)" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="5073169472575947707">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="TEST" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575947781" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575947709">
        <link role="classifier:3" targetNodeId="1.~ModuleReference" resolveInfo="ModuleReference" />
      </node>
      <node role="initializer:3" type="jetbrains.mps.lang.smodel.structure.CheckedModuleReference:16" id="5073169472575947710">
        <property name="moduleId:16" value="8585453e-6bfb-4d80-98de-b16074f1d86c(jetbrains.mps.lang.test)" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="5073169472575947711">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="TEXT_GEN" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575947782" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575947713">
        <link role="classifier:3" targetNodeId="1.~ModuleReference" resolveInfo="ModuleReference" />
      </node>
      <node role="initializer:3" type="jetbrains.mps.lang.smodel.structure.CheckedModuleReference:16" id="5073169472575947714">
        <property name="moduleId:16" value="b83431fe-5c8f-40bc-8a36-65e25f4dd253(jetbrains.mps.lang.textGen)" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="5073169472575947679">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="TYPESYSTEM" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575947774" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575947681">
        <link role="classifier:3" targetNodeId="1.~ModuleReference" resolveInfo="ModuleReference" />
      </node>
      <node role="initializer:3" type="jetbrains.mps.lang.smodel.structure.CheckedModuleReference:16" id="5073169472575947682">
        <property name="moduleId:16" value="7a5dda62-9140-4668-ab76-d5ed1746f2b2(jetbrains.mps.lang.typesystem)" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="5073169472575947628">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="BASE_LANGUAGE" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575947765" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575947631">
        <link role="classifier:3" targetNodeId="1.~ModuleReference" resolveInfo="ModuleReference" />
      </node>
      <node role="initializer:3" type="jetbrains.mps.lang.smodel.structure.CheckedModuleReference:16" id="5073169472575947633">
        <property name="moduleId:16" value="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="5073169472575947640">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="COLLECTIONS" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575947766" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575947642">
        <link role="classifier:3" targetNodeId="1.~ModuleReference" resolveInfo="ModuleReference" />
      </node>
      <node role="initializer:3" type="jetbrains.mps.lang.smodel.structure.CheckedModuleReference:16" id="5073169472575947643">
        <property name="moduleId:16" value="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="5073169472575947651">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="CLOSURES" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575947767" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575947653">
        <link role="classifier:3" targetNodeId="1.~ModuleReference" resolveInfo="ModuleReference" />
      </node>
      <node role="initializer:3" type="jetbrains.mps.lang.smodel.structure.CheckedModuleReference:16" id="5073169472575947654">
        <property name="moduleId:16" value="fd392034-7849-419d-9071-12563d152375(jetbrains.mps.baseLanguage.closures)" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="5073169472575947655">
      <property name="isFinal:3" value="true" />
      <property name="name:3" value="TUPLES" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575947768" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575947657">
        <link role="classifier:3" targetNodeId="1.~ModuleReference" resolveInfo="ModuleReference" />
      </node>
      <node role="initializer:3" type="jetbrains.mps.lang.smodel.structure.CheckedModuleReference:16" id="5073169472575947658">
        <property name="moduleId:16" value="a247e09e-2435-45ba-b8d2-07e93feba96a(jetbrains.mps.baseLanguage.tuples)" />
      </node>
    </node>
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575923461" />
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="5073169472575923462">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575923463" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="5073169472575923464" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5073169472575923465" />
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="5073169472575923466">
      <property name="name:3" value="baseLanguage" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575923467" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575923468">
        <link role="classifier:3" targetNodeId="4.~Language" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5073169472575923469">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="5073169472575947728">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="5073169472575947729">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5073169472575947730">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="5073169472575947731">
                <link role="classConcept:3" targetNodeId="4.~MPSModuleRepository" />
                <link role="baseMethodDeclaration:3" targetNodeId="4.~MPSModuleRepository.getInstance():jetbrains.mps.smodel.MPSModuleRepository" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="5073169472575947732">
                <link role="baseMethodDeclaration:3" targetNodeId="4.~MPSModuleRepository.getModule(jetbrains.mps.project.structure.modules.ModuleReference):jetbrains.mps.project.IModule" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference:3" id="5073169472575947735">
                  <link role="variableDeclaration:3" targetNodeId="5073169472575947628" resolveInfo="BASE_LANGUAGE" />
                </node>
              </node>
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575947734">
              <link role="classifier:3" targetNodeId="4.~Language" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="5073169472575923472">
      <property name="name:3" value="smodelLanguage" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575923473" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575923474">
        <link role="classifier:3" targetNodeId="4.~Language" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5073169472575923475">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="5073169472575947737">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="5073169472575947738">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5073169472575947739">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="5073169472575947740">
                <link role="classConcept:3" targetNodeId="4.~MPSModuleRepository" resolveInfo="MPSModuleRepository" />
                <link role="baseMethodDeclaration:3" targetNodeId="4.~MPSModuleRepository.getInstance():jetbrains.mps.smodel.MPSModuleRepository" resolveInfo="getInstance" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="5073169472575947741">
                <link role="baseMethodDeclaration:3" targetNodeId="4.~MPSModuleRepository.getModule(jetbrains.mps.project.structure.modules.ModuleReference):jetbrains.mps.project.IModule" resolveInfo="getModule" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference:3" id="5073169472575947745">
                  <link role="variableDeclaration:3" targetNodeId="5073169472575947719" resolveInfo="SMODEL" />
                </node>
              </node>
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575947743">
              <link role="classifier:3" targetNodeId="4.~Language" resolveInfo="Language" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="5073169472575923478">
      <property name="name:3" value="collectionsLanguage" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575923479" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575923480">
        <link role="classifier:3" targetNodeId="4.~Language" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5073169472575923481">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="5073169472575947746">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="5073169472575947747">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5073169472575947748">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="5073169472575947749">
                <link role="baseMethodDeclaration:3" targetNodeId="4.~MPSModuleRepository.getInstance():jetbrains.mps.smodel.MPSModuleRepository" resolveInfo="getInstance" />
                <link role="classConcept:3" targetNodeId="4.~MPSModuleRepository" resolveInfo="MPSModuleRepository" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="5073169472575947750">
                <link role="baseMethodDeclaration:3" targetNodeId="4.~MPSModuleRepository.getModule(jetbrains.mps.project.structure.modules.ModuleReference):jetbrains.mps.project.IModule" resolveInfo="getModule" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference:3" id="5073169472575947764">
                  <link role="variableDeclaration:3" targetNodeId="5073169472575947640" resolveInfo="COLLECTIONS" />
                </node>
              </node>
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575947752">
              <link role="classifier:3" targetNodeId="4.~Language" resolveInfo="Language" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="5073169472575923484">
      <property name="name:3" value="generatorLanguage" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5073169472575923485" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575923486">
        <link role="classifier:3" targetNodeId="4.~Language" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5073169472575923487">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="5073169472575947755">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="5073169472575947756">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5073169472575947757">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="5073169472575947758">
                <link role="baseMethodDeclaration:3" targetNodeId="4.~MPSModuleRepository.getInstance():jetbrains.mps.smodel.MPSModuleRepository" resolveInfo="getInstance" />
                <link role="classConcept:3" targetNodeId="4.~MPSModuleRepository" resolveInfo="MPSModuleRepository" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="5073169472575947759">
                <link role="baseMethodDeclaration:3" targetNodeId="4.~MPSModuleRepository.getModule(jetbrains.mps.project.structure.modules.ModuleReference):jetbrains.mps.project.IModule" resolveInfo="getModule" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference:3" id="5073169472575947763">
                  <link role="variableDeclaration:3" targetNodeId="5073169472575947723" resolveInfo="GENERATOR" />
                </node>
              </node>
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5073169472575947761">
              <link role="classifier:3" targetNodeId="4.~Language" resolveInfo="Language" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="5375364354070859437">
      <property name="name:3" value="coreLanguage" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5375364354070859441">
        <link role="classifier:3" targetNodeId="4.~Language" resolveInfo="Language" />
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5375364354070859439" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5375364354070859440">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="5375364354070859442">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="5375364354070859444">
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5375364354070859445">
              <link role="classifier:3" targetNodeId="4.~Language" resolveInfo="Language" />
            </node>
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5375364354070859449">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="5375364354070859448">
                <link role="baseMethodDeclaration:3" targetNodeId="4.~MPSModuleRepository.getInstance():jetbrains.mps.smodel.MPSModuleRepository" resolveInfo="getInstance" />
                <link role="classConcept:3" targetNodeId="4.~MPSModuleRepository" resolveInfo="MPSModuleRepository" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="5375364354070859597">
                <link role="baseMethodDeclaration:3" targetNodeId="4.~MPSModuleRepository.getModule(jetbrains.mps.project.structure.modules.ModuleReference):jetbrains.mps.project.IModule" resolveInfo="getModule" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference:3" id="5375364354070859598">
                  <link role="variableDeclaration:3" targetNodeId="5073169472575947786" resolveInfo="CORE" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <visible index="2" modelUID="r:00000000-0000-4000-0000-011c89590282(jetbrains.mps.lang.core.behavior)" />
  <visible index="3" modelUID="r:00000000-0000-4000-0000-011c8959028b(jetbrains.mps.lang.structure.behavior)" />
  <visible index="4" modelUID="f:java_stub#java.lang(java.lang@java_stub)" />
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="2274990519051114059">
    <property name="name:3" value="SNodeUtil" />
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="780982041803949193">
      <property name="name:3" value="CONCEPT_IResolveInfo" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="780982041803949199" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="780982041803949196" />
      <node role="initializer:3" type="jetbrains.mps.lang.smodel.structure.ConceptFqNameRefExpression:16" id="780982041803949198">
        <link role="conceptDeclaration:16" targetNodeId="5.1196978630214:0" resolveInfo="IResolveInfo" />
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="780982041803949200">
      <property name="name:3" value="CONCEPT_BaseConcept" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="780982041803949203" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="780982041803949204" />
      <node role="initializer:3" type="jetbrains.mps.lang.smodel.structure.ConceptFqNameRefExpression:16" id="780982041803949206">
        <link role="conceptDeclaration:16" targetNodeId="5.1133920641626:0" resolveInfo="BaseConcept" />
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="2274990519051152612">
      <property name="name:3" value="getPresentation" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="2274990519051152616" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="2274990519051152614" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="2274990519051152615">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="2274990519051152619">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="2274990519051152621">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="2274990519051152620">
              <link role="variableDeclaration:3" targetNodeId="2274990519051152617" resolveInfo="node" />
            </node>
            <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall:16" id="2274990519051263766">
              <property name="directCall:16" value="true" />
              <link role="baseMethodDeclaration:16" targetNodeId="2v.1213877396640" resolveInfo="getPresentation" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="2274990519051152617">
        <property name="name:3" value="node" />
        <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="2274990519051152618">
          <link role="concept:16" targetNodeId="5.1133920641626:0" resolveInfo="BaseConcept" />
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="2274990519051271953">
      <property name="name:3" value="getDetailedPresentation" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="2274990519051271957" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="2274990519051271955" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="2274990519051271956">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="2274990519051271960">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="2274990519051271962">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="2274990519051271961">
              <link role="variableDeclaration:3" targetNodeId="2274990519051271958" resolveInfo="node" />
            </node>
            <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall:16" id="2274990519051271966">
              <property name="directCall:16" value="true" />
              <link role="baseMethodDeclaration:16" targetNodeId="2v.2354269628709769373" resolveInfo="getDetailedPresentation" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="2274990519051271958">
        <property name="name:3" value="node" />
        <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="2274990519051271959">
          <link role="concept:16" targetNodeId="5.1133920641626:0" resolveInfo="BaseConcept" />
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="5858169027486689810">
      <property name="name:3" value="isDefaultSubstitutable" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="5858169027486690354" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5858169027486689812" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5858169027486689813">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="5858169027486690357">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5858169027486690359">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="5858169027486690358">
              <link role="variableDeclaration:3" targetNodeId="5858169027486690355" resolveInfo="node" />
            </node>
            <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall:16" id="5858169027486793626">
              <property name="directCall:16" value="true" />
              <link role="baseMethodDeclaration:16" targetNodeId="3v.7429110134803670673" resolveInfo="isDefaultSubstitutable" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="5858169027486690355">
        <property name="name:3" value="node" />
        <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="5858169027486690356">
          <link role="concept:16" targetNodeId="6.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="8442551749397191602">
      <property name="name:3" value="getMetaLevel" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="8442551749397192146" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="8442551749397191604" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="8442551749397191605">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="8442551749397192149">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8442551749397192151">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="8442551749397192150">
              <link role="variableDeclaration:3" targetNodeId="8442551749397192147" resolveInfo="node" />
            </node>
            <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall:16" id="8442551749397192155">
              <property name="directCall:16" value="true" />
              <link role="baseMethodDeclaration:16" targetNodeId="2v.3981318653438234726" resolveInfo="getMetaLevel" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="8442551749397192147">
        <property name="name:3" value="node" />
        <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="8442551749397192148">
          <link role="concept:16" targetNodeId="5.1133920641626:0" resolveInfo="BaseConcept" />
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="4383452389582120647">
      <property name="name:3" value="getConceptDeclarationAlias" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="4383452389582121191" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4383452389582120649" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4383452389582120650">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4383452389582121194">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4383452389582121196">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4383452389582121195">
              <link role="variableDeclaration:3" targetNodeId="4383452389582121192" resolveInfo="conceptDeclaration" />
            </node>
            <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess:16" id="4383452389582242480">
              <link role="property:16" targetNodeId="5.1156235010670:0" resolveInfo="alias" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4383452389582121192">
        <property name="name:3" value="conceptDeclaration" />
        <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="4383452389582121193">
          <link role="concept:16" targetNodeId="6.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="8339862546319979449">
      <property name="name:3" value="isInstanceOfConceptDeclaration" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="8339862546319979453" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="8339862546319979451" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="8339862546319979452">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="3773819293481018365">
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="3773819293481018366">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="3773819293481018374">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="3773819293481028265">
                <property name="value:3" value="false" />
              </node>
            </node>
          </node>
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="3773819293481018370">
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="3773819293481018373" />
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="3773819293481018369">
              <link role="variableDeclaration:3" targetNodeId="8339862546319979454" resolveInfo="node" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="8339862546319979457">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8339862546319981389">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8339862546319979465">
              <node role="operand:3" type="jetbrains.mps.lang.smodel.structure.SemanticDowncastExpression:16" id="8339862546319979463">
                <node role="leftExpression:16" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="8339862546319979458">
                  <link role="variableDeclaration:3" targetNodeId="8339862546319979454" resolveInfo="node" />
                </node>
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8339862546319981388">
                <link role="baseMethodDeclaration:3" targetNodeId="4.~SNode.getConceptFqName():java.lang.String" resolveInfo="getConceptFqName" />
              </node>
            </node>
            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8339862546319981393">
              <link role="baseMethodDeclaration:3" targetNodeId="4v.~String.equals(java.lang.Object):boolean" resolveInfo="equals" />
              <node role="actualArgument:3" type="jetbrains.mps.lang.smodel.structure.ConceptFqNameRefExpression:16" id="8339862546319981394">
                <link role="conceptDeclaration:16" targetNodeId="6.1071489090640:0" resolveInfo="ConceptDeclaration" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="8339862546319979454">
        <property name="name:3" value="node" />
        <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="8339862546319979456" />
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="8339862546319981450">
      <property name="name:3" value="isInstanceOfInterfaceConceptDeclaration" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="8339862546319981454" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="8339862546319981452" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="8339862546319981453">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="3773819293481018378">
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="3773819293481018379">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="3773819293481018387">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="3773819293481018389">
                <property name="value:3" value="false" />
              </node>
            </node>
          </node>
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="3773819293481018383">
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="3773819293481018386" />
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="3773819293481018382">
              <link role="variableDeclaration:3" targetNodeId="8339862546319981455" resolveInfo="node" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="8339862546319981457">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8339862546319981466">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8339862546319981461">
              <node role="operand:3" type="jetbrains.mps.lang.smodel.structure.SemanticDowncastExpression:16" id="8339862546319981459">
                <node role="leftExpression:16" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="8339862546319981458">
                  <link role="variableDeclaration:3" targetNodeId="8339862546319981455" resolveInfo="node" />
                </node>
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8339862546319981465">
                <link role="baseMethodDeclaration:3" targetNodeId="4.~SNode.getConceptFqName():java.lang.String" resolveInfo="getConceptFqName" />
              </node>
            </node>
            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8339862546319981470">
              <link role="baseMethodDeclaration:3" targetNodeId="4v.~String.equals(java.lang.Object):boolean" resolveInfo="equals" />
              <node role="actualArgument:3" type="jetbrains.mps.lang.smodel.structure.ConceptFqNameRefExpression:16" id="8339862546319981471">
                <link role="conceptDeclaration:16" targetNodeId="6.1169125989551:0" resolveInfo="InterfaceConceptDeclaration" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="8339862546319981455">
        <property name="name:3" value="node" />
        <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="8339862546319981456" />
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="8339862546319981395">
      <property name="name:3" value="isInstanceOfAbstractConceptDeclaration" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="8339862546319981399" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="8339862546319981397" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="8339862546319981398">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="3773819293481028267">
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="3773819293481028268">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="3773819293481028276">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="3773819293481028278">
                <property name="value:3" value="false" />
              </node>
            </node>
          </node>
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="3773819293481028272">
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="3773819293481028275" />
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="3773819293481028271">
              <link role="variableDeclaration:3" targetNodeId="8339862546319981400" resolveInfo="node" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="8339862546319981402">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="8339862546319981403">
            <property name="name:3" value="conceptFqName" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="8339862546319981404" />
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8339862546319981413">
              <node role="operand:3" type="jetbrains.mps.lang.smodel.structure.SemanticDowncastExpression:16" id="8339862546319981411">
                <node role="leftExpression:16" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="8339862546319981406">
                  <link role="variableDeclaration:3" targetNodeId="8339862546319981400" resolveInfo="node" />
                </node>
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8339862546319981417">
                <link role="baseMethodDeclaration:3" targetNodeId="4.~SNode.getConceptFqName():java.lang.String" resolveInfo="getConceptFqName" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="8339862546319981419">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.OrExpression:3" id="8339862546319981438">
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8339862546319981443">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8339862546319981442">
                <link role="variableDeclaration:3" targetNodeId="8339862546319981403" resolveInfo="conceptFqName" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8339862546319981447">
                <link role="baseMethodDeclaration:3" targetNodeId="4v.~String.equals(java.lang.Object):boolean" resolveInfo="equals" />
                <node role="actualArgument:3" type="jetbrains.mps.lang.smodel.structure.ConceptFqNameRefExpression:16" id="8339862546319981449">
                  <link role="conceptDeclaration:16" targetNodeId="6.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
                </node>
              </node>
            </node>
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.OrExpression:3" id="8339862546319981428">
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8339862546319981422">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8339862546319981421">
                  <link role="variableDeclaration:3" targetNodeId="8339862546319981403" resolveInfo="conceptFqName" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8339862546319981426">
                  <link role="baseMethodDeclaration:3" targetNodeId="4v.~String.equals(java.lang.Object):boolean" resolveInfo="equals" />
                  <node role="actualArgument:3" type="jetbrains.mps.lang.smodel.structure.ConceptFqNameRefExpression:16" id="8339862546319981427">
                    <link role="conceptDeclaration:16" targetNodeId="6.1071489090640:0" resolveInfo="ConceptDeclaration" />
                  </node>
                </node>
              </node>
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8339862546319981432">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8339862546319981431">
                  <link role="variableDeclaration:3" targetNodeId="8339862546319981403" resolveInfo="conceptFqName" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8339862546319981436">
                  <link role="baseMethodDeclaration:3" targetNodeId="4v.~String.equals(java.lang.Object):boolean" resolveInfo="equals" />
                  <node role="actualArgument:3" type="jetbrains.mps.lang.smodel.structure.ConceptFqNameRefExpression:16" id="8339862546319981437">
                    <link role="conceptDeclaration:16" targetNodeId="6.1169125989551:0" resolveInfo="InterfaceConceptDeclaration" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="8339862546319981400">
        <property name="name:3" value="node" />
        <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="8339862546319981401" />
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="2594890229324800853">
      <property name="name:3" value="getConceptDeclaration_IsRootable" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="2594890229324800859" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="2594890229324800855" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="2594890229324800856">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="2594890229324800860">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="2594890229324800862">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="2594890229324800861">
              <link role="variableDeclaration:3" targetNodeId="2594890229324800857" resolveInfo="node" />
            </node>
            <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess:16" id="2594890229324850475">
              <link role="property:16" targetNodeId="6.1096454100552:0" resolveInfo="rootable" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="2594890229324800857">
        <property name="name:3" value="concept" />
        <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="2594890229324800858">
          <link role="concept:16" targetNodeId="6.1071489090640:0" resolveInfo="ConceptDeclaration" />
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="2594890229324947030">
      <property name="name:3" value="getConceptDeclaration_Extends" />
      <node role="returnType:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="2594890229324947583">
        <link role="concept:16" targetNodeId="6.1071489090640:0" resolveInfo="ConceptDeclaration" />
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="2594890229324947032" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="2594890229324947033">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="2594890229324947576">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="2594890229324947578">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="2594890229324947577">
              <link role="variableDeclaration:3" targetNodeId="2594890229324947574" resolveInfo="concept" />
            </node>
            <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkAccess:16" id="2594890229324947582">
              <link role="link:16" targetNodeId="6.1071489389519:0" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="2594890229324947574">
        <property name="name:3" value="concept" />
        <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="2594890229324947575">
          <link role="concept:16" targetNodeId="6.1071489090640:0" resolveInfo="ConceptDeclaration" />
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="2594890229324947585">
      <property name="name:3" value="getConceptDeclaration_Implements" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="2594890229324947587" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="2594890229324947588">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="2594890229324963752">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="2594890229324963759">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="2594890229324963754">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="2594890229324963753">
                <link role="variableDeclaration:3" targetNodeId="2594890229324947593" resolveInfo="concept" />
              </node>
              <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess:16" id="2594890229324963758">
                <link role="link:16" targetNodeId="6.1169129564478:0" />
              </node>
            </node>
            <node role="operation:3" type="jetbrains.mps.baseLanguage.collections.structure.SelectOperation:7" id="2594890229324963781">
              <node role="closure:7" type="jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral:3" id="2594890229324963782">
                <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="2594890229324963783">
                  <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="2594890229324963786">
                    <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="2594890229324963788">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="2594890229324963787">
                        <link role="variableDeclaration:3" targetNodeId="2594890229324963784" resolveInfo="it" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkAccess:16" id="2594890229324963792">
                        <link role="link:16" targetNodeId="6.1169127628841:0" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="parameter:3" type="jetbrains.mps.baseLanguage.collections.structure.SmartClosureParameterDeclaration:7" id="2594890229324963784">
                  <property name="name:7" value="it" />
                  <node role="type:7" type="jetbrains.mps.baseLanguage.structure.UndefinedType:3" id="2594890229324963785" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="2594890229324947593">
        <property name="name:3" value="concept" />
        <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="2594890229324947594">
          <link role="concept:16" targetNodeId="6.1071489090640:0" resolveInfo="ConceptDeclaration" />
        </node>
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.collections.structure.SequenceType:7" id="2594890229324963749">
        <node role="elementType:7" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="2594890229324963751">
          <link role="concept:16" targetNodeId="6.1169125989551:0" resolveInfo="InterfaceConceptDeclaration" />
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="5178936997682662841">
      <property name="name:3" value="getConceptDeclaration_ImplementsReferenceNodes" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5178936997682662842" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5178936997682662843">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="5178936997682662844">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5178936997682662846">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="5178936997682662847">
              <link role="variableDeclaration:3" targetNodeId="5178936997682662858" resolveInfo="concept" />
            </node>
            <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess:16" id="5178936997682662848">
              <link role="link:16" targetNodeId="6.1169129564478:0" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="5178936997682662858">
        <property name="name:3" value="concept" />
        <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="5178936997682662859">
          <link role="concept:16" targetNodeId="6.1071489090640:0" resolveInfo="ConceptDeclaration" />
        </node>
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.collections.structure.SequenceType:7" id="5178936997682662860">
        <node role="elementType:7" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="5178936997682662861">
          <link role="concept:16" targetNodeId="6.1169127622168:0" resolveInfo="InterfaceConceptReference" />
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="5178936997682662837">
      <property name="name:3" value="getConcept_LinkDeclarations" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="5178936997682662862">
        <property name="name:3" value="concept" />
        <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="5178936997682662863">
          <link role="concept:16" targetNodeId="6.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
        </node>
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.collections.structure.SequenceType:7" id="5178936997682662864">
        <node role="elementType:7" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="5178936997682662866">
          <link role="concept:16" targetNodeId="6.1071489288298:0" resolveInfo="LinkDeclaration" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5178936997682662839" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5178936997682662840">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="5178936997682662867">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5178936997682662869">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="5178936997682662868">
              <link role="variableDeclaration:3" targetNodeId="5178936997682662862" resolveInfo="concept" />
            </node>
            <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess:16" id="5178936997682694465">
              <link role="link:16" targetNodeId="6.1071489727083:0" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="5178936997682694468">
      <property name="name:3" value="getConcept_PropertyDeclarations" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="5178936997682694469">
        <property name="name:3" value="concept" />
        <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="5178936997682694470">
          <link role="concept:16" targetNodeId="6.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
        </node>
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.collections.structure.SequenceType:7" id="5178936997682694471">
        <node role="elementType:7" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="5178936997682694472">
          <link role="concept:16" targetNodeId="6.1071489288299:0" resolveInfo="PropertyDeclaration" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5178936997682694473" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5178936997682694474">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="5178936997682694475">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5178936997682694476">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="5178936997682694477">
              <link role="variableDeclaration:3" targetNodeId="5178936997682694469" resolveInfo="concept" />
            </node>
            <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess:16" id="5178936997682694479">
              <link role="link:16" targetNodeId="6.1071489727084:0" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="5178936997682694482">
      <property name="name:3" value="getConcept_ConceptProperties" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="5178936997682694483">
        <property name="name:3" value="concept" />
        <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="5178936997682694484">
          <link role="concept:16" targetNodeId="6.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
        </node>
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.collections.structure.SequenceType:7" id="5178936997682694485">
        <node role="elementType:7" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="5178936997682694486">
          <link role="concept:16" targetNodeId="6.1105725413739:0" resolveInfo="ConceptProperty" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5178936997682694487" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5178936997682694488">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="5178936997682694489">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5178936997682694490">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="5178936997682694491">
              <link role="variableDeclaration:3" targetNodeId="5178936997682694483" resolveInfo="concept" />
            </node>
            <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess:16" id="5178936997682694493">
              <link role="link:16" targetNodeId="6.1105725339613:0" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="5178936997682694507">
      <property name="name:3" value="getConcept_ConceptLinks" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="5178936997682694508">
        <property name="name:3" value="concept" />
        <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="5178936997682694509">
          <link role="concept:16" targetNodeId="6.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
        </node>
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.collections.structure.SequenceType:7" id="5178936997682694510">
        <node role="elementType:7" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="5178936997682694511">
          <link role="concept:16" targetNodeId="6.1105736674127:0" resolveInfo="ConceptLink" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5178936997682694512" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5178936997682694513">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="5178936997682694514">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5178936997682694515">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="5178936997682694516">
              <link role="variableDeclaration:3" targetNodeId="5178936997682694508" resolveInfo="concept" />
            </node>
            <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess:16" id="5178936997682694518">
              <link role="link:16" targetNodeId="6.1105736949336:0" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="5178936997682694495">
      <property name="name:3" value="getConcept_ConceptPropertyDeclarations" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="5178936997682694496">
        <property name="name:3" value="concept" />
        <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="5178936997682694497">
          <link role="concept:16" targetNodeId="6.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
        </node>
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.collections.structure.SequenceType:7" id="5178936997682694498">
        <node role="elementType:7" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="5178936997682694499">
          <link role="concept:16" targetNodeId="6.1105725006687:0" resolveInfo="ConceptPropertyDeclaration" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5178936997682694500" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5178936997682694501">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="5178936997682694502">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5178936997682694503">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="5178936997682694504">
              <link role="variableDeclaration:3" targetNodeId="5178936997682694496" resolveInfo="concept" />
            </node>
            <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess:16" id="5178936997682694506">
              <link role="link:16" targetNodeId="6.1137467167200:0" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="5178936997682694520">
      <property name="name:3" value="getConcept_ConceptLinkDeclarations" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="5178936997682694521">
        <property name="name:3" value="concept" />
        <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="5178936997682694522">
          <link role="concept:16" targetNodeId="6.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
        </node>
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.collections.structure.SequenceType:7" id="5178936997682694523">
        <node role="elementType:7" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="5178936997682694524">
          <link role="concept:16" targetNodeId="6.1105736576531:0" resolveInfo="ConceptLinkDeclaration" />
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5178936997682694525" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5178936997682694526">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="5178936997682694527">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5178936997682694528">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="5178936997682694529">
              <link role="variableDeclaration:3" targetNodeId="5178936997682694521" resolveInfo="concept" />
            </node>
            <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess:16" id="5178936997682694531">
              <link role="link:16" targetNodeId="6.1137532086877:0" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="5178936997682694533">
      <property name="name:3" value="getInterfaceConceptDeclaration_Extends" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5178936997682694535" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5178936997682694536">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="5178936997682694537">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5178936997682694544">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5178936997682694538">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="5178936997682694539">
                <link role="variableDeclaration:3" targetNodeId="5178936997682694541" resolveInfo="concept" />
              </node>
              <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess:16" id="5178936997682694543">
                <link role="link:16" targetNodeId="6.1169127546356:0" />
              </node>
            </node>
            <node role="operation:3" type="jetbrains.mps.baseLanguage.collections.structure.SelectOperation:7" id="5178936997682694548">
              <node role="closure:7" type="jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral:3" id="5178936997682694549">
                <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5178936997682694550">
                  <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="5178936997682694553">
                    <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5178936997682694555">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="5178936997682694554">
                        <link role="variableDeclaration:3" targetNodeId="5178936997682694551" resolveInfo="it" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkAccess:16" id="5178936997682694559">
                        <link role="link:16" targetNodeId="6.1169127628841:0" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="parameter:3" type="jetbrains.mps.baseLanguage.collections.structure.SmartClosureParameterDeclaration:7" id="5178936997682694551">
                  <property name="name:7" value="it" />
                  <node role="type:7" type="jetbrains.mps.baseLanguage.structure.UndefinedType:3" id="5178936997682694552" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="5178936997682694541">
        <property name="name:3" value="concept" />
        <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="5178936997682694542">
          <link role="concept:16" targetNodeId="6.1169125989551:0" resolveInfo="InterfaceConceptDeclaration" />
        </node>
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.collections.structure.SequenceType:7" id="5178936997682694560">
        <node role="elementType:7" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="5178936997682694561">
          <link role="concept:16" targetNodeId="6.1169125989551:0" resolveInfo="InterfaceConceptDeclaration" />
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="5178936997682694564">
      <property name="name:3" value="getInterfaceConceptDeclaration_ExtendsReferenceNodes" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="5178936997682694565" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5178936997682694566">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="5178936997682694567">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5178936997682694569">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="5178936997682694570">
              <link role="variableDeclaration:3" targetNodeId="5178936997682694581" resolveInfo="concept" />
            </node>
            <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess:16" id="5178936997682694571">
              <link role="link:16" targetNodeId="6.1169127546356:0" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="5178936997682694581">
        <property name="name:3" value="concept" />
        <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="5178936997682694582">
          <link role="concept:16" targetNodeId="6.1169125989551:0" resolveInfo="InterfaceConceptDeclaration" />
        </node>
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.collections.structure.SequenceType:7" id="5178936997682694583">
        <node role="elementType:7" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="5178936997682694584">
          <link role="concept:16" targetNodeId="6.1169127622168:0" resolveInfo="InterfaceConceptReference" />
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="780982041803948603">
      <property name="name:3" value="getNodeShortDescription" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="780982041803948903" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="780982041803948605" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="780982041803948606">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="780982041803948609">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="780982041803948611">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="780982041803948610">
              <link role="variableDeclaration:3" targetNodeId="780982041803948607" resolveInfo="node" />
            </node>
            <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess:16" id="780982041803948615">
              <link role="property:16" targetNodeId="5.1156234966388:0" resolveInfo="shortDescription" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="780982041803948607">
        <property name="name:3" value="node" />
        <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="780982041803948608">
          <link role="concept:16" targetNodeId="5.1133920641626:0" resolveInfo="BaseConcept" />
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="780982041803940665">
      <property name="name:3" value="getConceptShortDescription" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="780982041803940679" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="780982041803940667" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="780982041803940668">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="780982041803940671">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="780982041803940673">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="780982041803940672">
              <link role="variableDeclaration:3" targetNodeId="780982041803940669" resolveInfo="concept" />
            </node>
            <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SConceptPropertyAccess:16" id="780982041803940680">
              <link role="conceptProperty:16" targetNodeId="5.1137473914776:0" resolveInfo="shortDescription" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="780982041803940669">
        <property name="name:3" value="concept" />
        <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="780982041803940670">
          <link role="concept:16" targetNodeId="5.1133920641626:0" resolveInfo="BaseConcept" />
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="780982041803943076">
      <property name="name:3" value="getConceptAlias" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="780982041803943077" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="780982041803943078" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="780982041803943079">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="780982041803943080">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="780982041803943081">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="780982041803943082">
              <link role="variableDeclaration:3" targetNodeId="780982041803943084" resolveInfo="concept" />
            </node>
            <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SConceptPropertyAccess:16" id="780982041803943086">
              <link role="conceptProperty:16" targetNodeId="5.1137473891462:0" resolveInfo="alias" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="780982041803943084">
        <property name="name:3" value="concept" />
        <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="780982041803943085">
          <link role="concept:16" targetNodeId="5.1133920641626:0" resolveInfo="BaseConcept" />
        </node>
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="780982041803949207">
      <property name="name:3" value="getResolveInfo" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="780982041803949211" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="780982041803949209" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="780982041803949210">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="780982041803949214">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="780982041803949216">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="780982041803949215">
              <link role="variableDeclaration:3" targetNodeId="780982041803949212" resolveInfo="node" />
            </node>
            <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess:16" id="780982041803949220">
              <link role="property:16" targetNodeId="5.1196978656277:0" resolveInfo="resolveInfo" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="780982041803949212">
        <property name="name:3" value="node" />
        <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="780982041803949213">
          <link role="concept:16" targetNodeId="5.1196978630214:0" resolveInfo="IResolveInfo" />
        </node>
      </node>
    </node>
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="2274990519051114060" />
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="2274990519051114061">
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="2274990519051114062" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="2274990519051114063" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="2274990519051114064" />
    </node>
  </node>
</model>


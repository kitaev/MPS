<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:3883084c-f018-4330-aab0-6829350c4b17(jetbrains.mps.debug.customViewers.typesystem)">
  <persistence version="4" />
  <refactoringHistory />
  <language namespace="fa8aeae9-4df9-4e13-bfb1-9b04c67ddb77(jetbrains.mps.debug.customViewers)" />
  <language namespace="7a5dda62-9140-4668-ab76-d5ed1746f2b2(jetbrains.mps.lang.typesystem)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="ceab5195-25ea-4f22-9b92-103b95ca8c0c(jetbrains.mps.lang.core)" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590345(jetbrains.mps.lang.pattern.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590334(jetbrains.mps.baseLanguage.closures.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590283(jetbrains.mps.lang.core.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902db(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959028c(jetbrains.mps.lang.structure.constraints)" version="11" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902fb(jetbrains.mps.lang.smodel.constraints)" version="21" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959033d(jetbrains.mps.lang.annotations.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902b4(jetbrains.mps.lang.typesystem.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590340(jetbrains.mps.lang.pattern.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ae(jetbrains.mps.lang.typesystem.constraints)" version="17" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590328(jetbrains.mps.baseLanguage.collections.constraints)" version="6" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959034b(jetbrains.mps.lang.quotation.structure)" version="0" />
  <devkit namespace="2677cb18-f558-4e33-bc38-a5139cee06dc(jetbrains.mps.devkit.language-design)" />
  <maxImportIndex value="1" />
  <import index="1" modelUID="r:c8cdf89f-8d25-442c-ae58-6e44844b68d7(jetbrains.mps.debug.customViewers.structure)" version="-1" />
  <node type="jetbrains.mps.lang.typesystem.structure.InferenceRule:3" id="5117350825036256355">
    <property name="name:3" value="typeof_WatchableCreator" />
    <property name="package:3" value="types" />
    <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5117350825036256356">
      <node role="statement:3" type="jetbrains.mps.lang.typesystem.structure.CreateEquationStatement:3" id="5117350825036256362">
        <node role="rightExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="5264817233616805960">
          <node role="normalType:3" type="jetbrains.mps.lang.quotation.structure.Quotation:0" id="5264817233616805961">
            <node role="quotedNode:0" type="jetbrains.mps.debug.customViewers.structure.WatchableType" id="5264817233616805963" />
          </node>
        </node>
        <node role="leftExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="5117350825036256365">
          <node role="normalType:3" type="jetbrains.mps.lang.typesystem.structure.TypeOfExpression:3" id="5117350825036256359">
            <node role="term:3" type="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference:3" id="5117350825036256361">
              <link role="applicableNode:3" targetNodeId="5117350825036256357" resolveInfo="watchableCreator" />
            </node>
          </node>
        </node>
      </node>
      <node role="statement:3" type="jetbrains.mps.lang.typesystem.structure.CreateLessThanInequationStatement:3" id="5264817233616805974">
        <node role="inequationGroup:3" type="jetbrains.mps.lang.typesystem.structure.DefaultGroupReference:3" id="5264817233616805975" />
        <node role="rightExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="5264817233616805979">
          <node role="normalType:3" type="jetbrains.mps.lang.quotation.structure.Quotation:0" id="5264817233616805980">
            <node role="quotedNode:0" type="jetbrains.mps.debug.customViewers.structure.ValueType" id="5264817233616805982" />
          </node>
        </node>
        <node role="leftExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="5264817233616805978">
          <node role="normalType:3" type="jetbrains.mps.lang.typesystem.structure.TypeOfExpression:3" id="5264817233616805966">
            <node role="term:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5264817233616805969">
              <node role="operand:3" type="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference:3" id="5264817233616805968">
                <link role="applicableNode:3" targetNodeId="5117350825036256357" resolveInfo="watchableCreator" />
              </node>
              <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkAccess:16" id="5264817233616805973">
                <link role="link:16" targetNodeId="1.5117350825036256341" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode:3" type="jetbrains.mps.lang.typesystem.structure.ConceptReference:3" id="5117350825036256357">
      <property name="name:3" value="watchableCreator" />
      <link role="concept:3" targetNodeId="1.5117350825036256338" resolveInfo="WatchableCreator" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.typesystem.structure.SubtypingRule:3" id="5264817233616805983">
    <property name="name:3" value="supertypesOfArrayValueType" />
    <property name="package:3" value="types" />
    <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5264817233616805984">
      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="5264817233616805987">
        <node role="expression:3" type="jetbrains.mps.lang.quotation.structure.Quotation:0" id="5264817233616805989">
          <node role="quotedNode:0" type="jetbrains.mps.debug.customViewers.structure.ValueType" id="5264817233616805991" />
        </node>
      </node>
    </node>
    <node role="applicableNode:3" type="jetbrains.mps.lang.typesystem.structure.ConceptReference:3" id="5264817233616805986">
      <property name="name:3" value="arrayValueType" />
      <link role="concept:3" targetNodeId="1.5117350825036234467" resolveInfo="ArrayValueType" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.typesystem.structure.SubtypingRule:3" id="5264817233616805992">
    <property name="name:3" value="supertypesOfPrimitiveValueType" />
    <property name="package:3" value="types" />
    <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5264817233616805993">
      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="5264817233616805994">
        <node role="expression:3" type="jetbrains.mps.lang.quotation.structure.Quotation:0" id="5264817233616805995">
          <node role="quotedNode:0" type="jetbrains.mps.debug.customViewers.structure.ValueType" id="5264817233616805996" />
        </node>
      </node>
    </node>
    <node role="applicableNode:3" type="jetbrains.mps.lang.typesystem.structure.ConceptReference:3" id="5264817233616805997">
      <property name="name:3" value="primitiveValueType" />
      <link role="concept:3" targetNodeId="1.5117350825036234478" resolveInfo="PrimitiveValueType" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.typesystem.structure.SubtypingRule:3" id="5264817233616805998">
    <property name="name:3" value="supertypesOfObjectValueType" />
    <property name="package:3" value="types" />
    <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5264817233616805999">
      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="5264817233616806000">
        <node role="expression:3" type="jetbrains.mps.lang.quotation.structure.Quotation:0" id="5264817233616806001">
          <node role="quotedNode:0" type="jetbrains.mps.debug.customViewers.structure.ValueType" id="5264817233616806002" />
        </node>
      </node>
    </node>
    <node role="applicableNode:3" type="jetbrains.mps.lang.typesystem.structure.ConceptReference:3" id="5264817233616806003">
      <property name="name:3" value="objectValueType" />
      <link role="concept:3" targetNodeId="1.5117350825036234473" resolveInfo="ObjectValueType" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.typesystem.structure.InferenceRule:3" id="2488554353950312724">
    <property name="name:3" value="typeof_FieldOperation" />
    <property name="package:3" value="operations.object" />
    <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="2488554353950312725">
      <node role="statement:3" type="jetbrains.mps.lang.typesystem.structure.CreateLessThanInequationStatement:3" id="2488554353950312736">
        <node role="inequationGroup:3" type="jetbrains.mps.lang.typesystem.structure.DefaultGroupReference:3" id="2488554353950312737" />
        <node role="rightExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="2488554353950312741">
          <node role="normalType:3" type="jetbrains.mps.lang.quotation.structure.Quotation:0" id="2488554353950312742">
            <node role="quotedNode:0" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="2488554353950312744" />
          </node>
        </node>
        <node role="leftExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="2488554353950312740">
          <node role="normalType:3" type="jetbrains.mps.lang.typesystem.structure.TypeOfExpression:3" id="2488554353950312728">
            <node role="term:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="2488554353950312731">
              <node role="operand:3" type="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference:3" id="2488554353950312730">
                <link role="applicableNode:3" targetNodeId="2488554353950312726" resolveInfo="fieldOperation" />
              </node>
              <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkAccess:16" id="2488554353950312735">
                <link role="link:16" targetNodeId="1.2488554353950312694" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode:3" type="jetbrains.mps.lang.typesystem.structure.ConceptReference:3" id="2488554353950312726">
      <property name="name:3" value="fieldOperation" />
      <link role="concept:3" targetNodeId="1.2488554353950312668" resolveInfo="FieldOperation" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.typesystem.structure.InferenceRule:3" id="2488554353950312780">
    <property name="name:3" value="typeof_ElementOperation" />
    <property name="package:3" value="operations.array" />
    <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="2488554353950312781">
      <node role="statement:3" type="jetbrains.mps.lang.typesystem.structure.CreateLessThanInequationStatement:3" id="2488554353950312792">
        <node role="inequationGroup:3" type="jetbrains.mps.lang.typesystem.structure.DefaultGroupReference:3" id="2488554353950312793" />
        <node role="rightExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="2488554353950312797">
          <node role="normalType:3" type="jetbrains.mps.lang.quotation.structure.Quotation:0" id="2488554353950312798">
            <node role="quotedNode:0" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="2488554353950312800" />
          </node>
        </node>
        <node role="leftExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="2488554353950312796">
          <node role="normalType:3" type="jetbrains.mps.lang.typesystem.structure.TypeOfExpression:3" id="2488554353950312784">
            <node role="term:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="2488554353950312787">
              <node role="operand:3" type="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference:3" id="2488554353950312786">
                <link role="applicableNode:3" targetNodeId="2488554353950312782" resolveInfo="elementOperation" />
              </node>
              <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkAccess:16" id="2488554353950312791">
                <link role="link:16" targetNodeId="1.2488554353950312753" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode:3" type="jetbrains.mps.lang.typesystem.structure.ConceptReference:3" id="2488554353950312782">
      <property name="name:3" value="elementOperation" />
      <link role="concept:3" targetNodeId="1.2488554353950312745" resolveInfo="ElementOperation" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.typesystem.structure.InferenceRule:3" id="1843851250586697609">
    <property name="name:3" value="typeof_ElementsRangeOperation" />
    <property name="package:3" value="operations.array" />
    <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="1843851250586697610">
      <node role="statement:3" type="jetbrains.mps.lang.typesystem.structure.CreateLessThanInequationStatement:3" id="1843851250586699805">
        <node role="inequationGroup:3" type="jetbrains.mps.lang.typesystem.structure.DefaultGroupReference:3" id="1843851250586699806" />
        <node role="rightExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="1843851250586699810">
          <node role="normalType:3" type="jetbrains.mps.lang.quotation.structure.Quotation:0" id="1843851250586699811">
            <node role="quotedNode:0" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="1843851250586699813" />
          </node>
        </node>
        <node role="leftExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="1843851250586699809">
          <node role="normalType:3" type="jetbrains.mps.lang.typesystem.structure.TypeOfExpression:3" id="1843851250586699797">
            <node role="term:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1843851250586699800">
              <node role="operand:3" type="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference:3" id="1843851250586699799">
                <link role="applicableNode:3" targetNodeId="1843851250586697611" resolveInfo="elementsRangeOperation" />
              </node>
              <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkAccess:16" id="1843851250586699804">
                <link role="link:16" targetNodeId="1.1843851250586697565" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="statement:3" type="jetbrains.mps.lang.typesystem.structure.CreateLessThanInequationStatement:3" id="1843851250586699814">
        <node role="inequationGroup:3" type="jetbrains.mps.lang.typesystem.structure.DefaultGroupReference:3" id="1843851250586699815" />
        <node role="rightExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="1843851250586699816">
          <node role="normalType:3" type="jetbrains.mps.lang.quotation.structure.Quotation:0" id="1843851250586699817">
            <node role="quotedNode:0" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="1843851250586699818" />
          </node>
        </node>
        <node role="leftExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="1843851250586699819">
          <node role="normalType:3" type="jetbrains.mps.lang.typesystem.structure.TypeOfExpression:3" id="1843851250586699820">
            <node role="term:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1843851250586699821">
              <node role="operand:3" type="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference:3" id="1843851250586699822">
                <link role="applicableNode:3" targetNodeId="1843851250586697611" resolveInfo="elementsRangeOperation" />
              </node>
              <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkAccess:16" id="1843851250586699824">
                <link role="link:16" targetNodeId="1.1843851250586697568" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode:3" type="jetbrains.mps.lang.typesystem.structure.ConceptReference:3" id="1843851250586697611">
      <property name="name:3" value="elementsRangeOperation" />
      <link role="concept:3" targetNodeId="1.1843851250586697564" resolveInfo="ElementsRangeOperation" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.typesystem.structure.InferenceRule:3" id="7744028807303023773">
    <property name="name:3" value="typeof_CallMethodOperation" />
    <property name="package:3" value="operations.object" />
    <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7744028807303023774">
      <node role="statement:3" type="jetbrains.mps.lang.typesystem.structure.CreateLessThanInequationStatement:3" id="7744028807303023776">
        <node role="inequationGroup:3" type="jetbrains.mps.lang.typesystem.structure.DefaultGroupReference:3" id="7744028807303023777" />
        <node role="rightExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="7744028807303023778">
          <node role="normalType:3" type="jetbrains.mps.lang.quotation.structure.Quotation:0" id="7744028807303023779">
            <node role="quotedNode:0" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="7744028807303023780" />
          </node>
        </node>
        <node role="leftExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="7744028807303023781">
          <node role="normalType:3" type="jetbrains.mps.lang.typesystem.structure.TypeOfExpression:3" id="7744028807303023782">
            <node role="term:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7744028807303023783">
              <node role="operand:3" type="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference:3" id="7744028807303023786">
                <link role="applicableNode:3" targetNodeId="7744028807303023775" resolveInfo="callMethodOperation" />
              </node>
              <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkAccess:16" id="7744028807303023787">
                <link role="link:16" targetNodeId="1.7744028807303021420" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="statement:3" type="jetbrains.mps.lang.typesystem.structure.CreateLessThanInequationStatement:3" id="7744028807303028951">
        <node role="inequationGroup:3" type="jetbrains.mps.lang.typesystem.structure.DefaultGroupReference:3" id="7744028807303028952" />
        <node role="rightExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="7744028807303028953">
          <node role="normalType:3" type="jetbrains.mps.lang.quotation.structure.Quotation:0" id="7744028807303028954">
            <node role="quotedNode:0" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="7744028807303028955" />
          </node>
        </node>
        <node role="leftExpression:3" type="jetbrains.mps.lang.typesystem.structure.NormalTypeClause:3" id="7744028807303028956">
          <node role="normalType:3" type="jetbrains.mps.lang.typesystem.structure.TypeOfExpression:3" id="7744028807303028957">
            <node role="term:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="7744028807303028958">
              <node role="operand:3" type="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference:3" id="7744028807303028959">
                <link role="applicableNode:3" targetNodeId="7744028807303023775" resolveInfo="callMethodOperation" />
              </node>
              <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.SLinkAccess:16" id="7744028807303028961">
                <link role="link:16" targetNodeId="1.7744028807303028944" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode:3" type="jetbrains.mps.lang.typesystem.structure.ConceptReference:3" id="7744028807303023775">
      <property name="name:3" value="callMethodOperation" />
      <link role="concept:3" targetNodeId="1.7744028807303021417" resolveInfo="CallMethodOperation" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.typesystem.structure.SubtypingRule:3" id="7430908097350531688">
    <property name="name:3" value="supertypesOfStringValueType" />
    <property name="package:3" value="types" />
    <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7430908097350531689">
      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="7430908097350531691">
        <node role="expression:3" type="jetbrains.mps.lang.quotation.structure.Quotation:0" id="7430908097350531693">
          <node role="quotedNode:0" type="jetbrains.mps.debug.customViewers.structure.ObjectValueType" id="7430908097350531695" />
        </node>
      </node>
    </node>
    <node role="applicableNode:3" type="jetbrains.mps.lang.typesystem.structure.ConceptReference:3" id="7430908097350531690">
      <property name="name:3" value="stringValueType" />
      <link role="concept:3" targetNodeId="1.7430908097350531683" resolveInfo="StringValueType" />
    </node>
  </node>
</model>


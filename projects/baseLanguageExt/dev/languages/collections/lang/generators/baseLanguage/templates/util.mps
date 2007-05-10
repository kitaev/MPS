<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.baseLanguage.ext.collections.lang.generator.baseLanguage.template.util">
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <language namespace="jetbrains.mps.bootstrap.helgins" />
  <maxImportIndex value="12" />
  <import index="1" modelUID="jetbrains.mps.baseLanguage.structure" />
  <import index="3" modelUID="jetbrains.mps.smodel@java_stub" />
  <import index="4" modelUID="jetbrains.mps.baseLanguage.structure@java_stub" />
  <import index="7" modelUID="jetbrains.mps.typesystem@java_stub" />
  <import index="8" modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" />
  <import index="9" modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.generator.baseLanguage.template.main@java_stub" />
  <import index="10" modelUID="jetbrains.mps.generator.template@java_stub" />
  <import index="12" modelUID="java.lang@java_stub" />
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1170956206132">
    <property name="name" value="QueriesUtil" />
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1170956222804">
      <property name="name" value="create_objectClassType" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1170956231011">
        <link role="concept" targetNodeId="1.1107535904670" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1170956222806">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1170956455090">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1170956455091">
            <property name="name" value="objectClassAdapter" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1170956501501">
              <link role="classifier" extResolveInfo="4.[Classifier]ClassConcept" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1170956387414">
              <link role="classConcept" extResolveInfo="3.[Classifier]SModelUtil_new" />
              <link role="baseMethodDeclaration" extResolveInfo="3.static method ([Classifier]SModelUtil_new).([StaticMethodDeclaration]findNodeByFQName((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Class, &lt;jetbrains.mps.baseLanguage.types.classifier [Object]&gt;]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Object]))" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.StringLiteral" id="1170956390305">
                <property name="value" value="java.lang.Object" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ClassifierClassExpression" id="1170956439026">
                <link role="classifier" extResolveInfo="4.[Classifier]ClassConcept" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1170956511112">
                <link role="variableDeclaration" targetNodeId="1170956303046" resolveInfo="scope" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1170956528053">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1170956528054">
            <property name="name" value="objectClass" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1170956528055">
              <link role="concept" targetNodeId="1.1068390468198" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1170956560419">
              <link role="baseMethodDeclaration" extResolveInfo="3.method ([Classifier]BaseAdapter).([InstanceMethodDeclaration]getNode() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode]))" />
              <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170956554588">
                <link role="variableDeclaration" targetNodeId="1170956455091" resolveInfo="objectClassAdapter" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1170956615006">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1170956615007">
            <property name="name" value="objectClassType" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1170956615009">
              <link role="concept" targetNodeId="1.1107535904670" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1170956591345">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Model_CreateNewNodeOperation" id="1170956594880">
                <link role="concept" targetNodeId="1.1107535904670" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1170956590110">
                <link role="variableDeclaration" targetNodeId="1170956300278" resolveInfo="model" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1170956625949">
          <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1170956632877">
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1170956636021">
              <node role="parameter" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170956641757">
                <link role="variableDeclaration" targetNodeId="1170956528054" resolveInfo="objectClass" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1170956626936">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1170956631923">
                <link role="link" targetNodeId="1.1107535924139" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170956625950">
                <link role="variableDeclaration" targetNodeId="1170956615007" resolveInfo="objectClassType" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1170956645322">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170956650808">
            <link role="variableDeclaration" targetNodeId="1170956615007" resolveInfo="objectClassType" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1170956300278">
        <property name="name" value="model" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SModelType" id="1170956300279" />
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1170956303046">
        <property name="name" value="scope" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1170956348899">
          <link role="classifier" extResolveInfo="3.[Classifier]IScope" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1178546097156" />
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1178821527695">
      <property name="name" value="create_Closure_returnedType" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1178821542390">
        <link role="concept" targetNodeId="1.1068431790189" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1178821527697" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1178821527698">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1178821685574">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1178821685575">
            <property name="name" value="returnType" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1178821685576" />
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1178822539259">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1178821667848">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1178821656563">
                  <link role="variableDeclaration" targetNodeId="1178821576406" resolveInfo="closure" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.helgins.Node_TypeOperation" id="1178821670397" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_CopyOperation" id="1178822543674" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1178821711768">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1178821711769">
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1178821868219">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1178821868220">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1178821888887">
                  <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1178821888888">
                    <link role="concept" targetNodeId="1.1068431790189" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1178821888889">
                      <link role="variableDeclaration" targetNodeId="1178821685575" resolveInfo="returnType" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1178821876327">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1178821872008">
                  <link role="variableDeclaration" targetNodeId="1178821685575" resolveInfo="returnType" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1178821878706">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.RefConcept_Reference" id="1178821881914">
                    <link role="conceptDeclaration" targetNodeId="1.1068431790189" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1178821796837">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1178821796835">
              <link role="variableDeclaration" targetNodeId="1178821685575" resolveInfo="returnType" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1178821797261" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1178821802347">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1178821802348">
            <link role="baseMethodDeclaration" extResolveInfo="10.method ([Classifier]ITemplateGenerator).([InstanceMethodDeclaration]showErrorMessage((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String])) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
            <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1178821802349">
              <link role="variableDeclaration" targetNodeId="1178821640739" resolveInfo="generator" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1178821802350">
              <link role="variableDeclaration" targetNodeId="1178821576406" resolveInfo="closure" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.PlusExpression" id="1178821936278">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1178821939239">
                <link role="variableDeclaration" targetNodeId="1178821685575" resolveInfo="returnType" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1178821802351">
                <property name="value" value="couldn't define closure return type: " />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1178821802352">
          <node role="expression" type="jetbrains.mps.bootstrap.helgins.Quotation" id="1178821802353">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.ClassifierType" id="1178821802354">
              <link role="classifier" extResolveInfo="12.[Classifier]Object" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1178821576406">
        <property name="name" value="closure" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1178821576407">
          <link role="concept" targetNodeId="1.1152728232947" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1178821640739">
        <property name="name" value="generator" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1178821649964">
          <link role="classifier" extResolveInfo="10.[Classifier]ITemplateGenerator" />
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1170975665472">
      <property name="name" value="create_ClosureWithInput_inputElementType" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1170975678624">
        <link role="concept" targetNodeId="1.1068431790189" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1170975665474">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1173886625952">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1173886625953">
            <property name="name" value="parent" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1173886625954">
              <link role="concept" targetNodeId="1.1068431790191" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1173886940041">
              <link role="concept" targetNodeId="1.1068431790191" />
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173886636801">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1173886635644">
                  <link role="variableDeclaration" targetNodeId="1170975746805" resolveInfo="closureWithInput" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetParentOperation" id="1173886638130" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1173886675273">
          <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173886680730">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1173886679791">
              <link role="variableDeclaration" targetNodeId="1173886625953" resolveInfo="parent" />
            </node>
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1173886682278">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.RefConcept_Reference" id="1177556243095">
                <link role="conceptDeclaration" targetNodeId="8.1151701983961" />
              </node>
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1173886675275">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1173887225138">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1173887225139">
                <property name="name" value="left" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1173887225140">
                  <link role="concept" targetNodeId="1.1068431790191" />
                </node>
                <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173887271522">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1173887262943">
                    <link role="concept" targetNodeId="8.1151701773464" />
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173887256941">
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1173887247923">
                        <link role="variableDeclaration" targetNodeId="1173886625953" resolveInfo="parent" />
                      </node>
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetParentOperation" id="1173887258692" />
                    </node>
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1173887273351">
                    <link role="link" targetNodeId="8.1151701835028" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1173886723904">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1173886729673">
                <link role="baseMethodDeclaration" extResolveInfo="9.static method ([Classifier]_QueriesUtil).([StaticMethodDeclaration]create_SequenceElementType((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Expression]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ITemplateGenerator])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode]))" />
                <link role="classConcept" extResolveInfo="9.[Classifier]_QueriesUtil" />
                <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173887294996">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1173887287901">
                    <link role="variableDeclaration" targetNodeId="1173887225139" resolveInfo="left" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAdapterOperation" id="1173887296560" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1173886833545">
                  <link role="variableDeclaration" targetNodeId="1170975981399" resolveInfo="generator" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1173885888593">
          <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1173886109695">
            <link role="baseMethodDeclaration" extResolveInfo="9.static method ([Classifier]_QueriesUtil).([StaticMethodDeclaration]create_SequenceElementType((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Expression]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ITemplateGenerator])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode]))" />
            <link role="classConcept" extResolveInfo="9.[Classifier]_QueriesUtil" />
            <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173886919304">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1173886905960">
                <link role="variableDeclaration" targetNodeId="1173886625953" resolveInfo="parent" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAdapterOperation" id="1173886920790" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1173886118745">
              <link role="variableDeclaration" targetNodeId="1170975981399" resolveInfo="generator" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1170975746805">
        <property name="name" value="closureWithInput" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1170975746806">
          <link role="concept" targetNodeId="8.1153509719989" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1170975981399">
        <property name="name" value="generator" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1170976002245">
          <link role="classifier" extResolveInfo="10.[Classifier]ITemplateGenerator" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1178546096787" />
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1178550080981" />
  </node>
</model>


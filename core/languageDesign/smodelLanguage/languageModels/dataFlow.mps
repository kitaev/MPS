<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.bootstrap.smodelLanguage.dataFlow">
  <persistence version="2" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.constraints" version="21" />
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="1" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.constraints" version="83" />
    <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.dataFlow">
    <languageAspect modelUID="jetbrains.mps.bootstrap.dataFlow.constraints" version="4" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.constraints" version="6" />
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="1" />
  </language>
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.core.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.internal.collections.constraints" version="2" />
  <maxImportIndex value="6" />
  <import index="1" modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="1" />
  <import index="2" modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  <import index="6" modelUID="jetbrains.mps.baseLanguage.behavior" version="-1" />
  <node type="jetbrains.mps.bootstrap.dataFlow.structure.DataFlowBuilderDeclaration" id="1210626395131">
    <property name="package" value="operation" />
    <link role="conceptDeclaration" targetNodeId="1.1138411891628" resolveInfo="SNodeOperation" />
    <node role="builderBlock" type="jetbrains.mps.bootstrap.dataFlow.structure.BuilderBlock" id="1210626395132">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210626395133">
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1210626400305">
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1210626400306">
            <property name="name" value="expr" />
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210626406328">
            <node role="operand" type="jetbrains.mps.bootstrap.dataFlow.structure.NodeParameter" id="1210626404967" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetDescendantsOperation" id="1210626411645">
              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1210626411646">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1210626416977">
                  <link role="conceptDeclaration" targetNodeId="2.1068431790191" resolveInfo="Expression" />
                </node>
              </node>
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210626400308">
            <node role="statement" type="jetbrains.mps.bootstrap.dataFlow.structure.EmitCodeForStatement" id="1210626429651">
              <node role="codeFor" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1210626432153">
                <link role="variable" targetNodeId="1210626400306" resolveInfo="expr" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.dataFlow.structure.DataFlowBuilderDeclaration" id="1211992491528">
    <link role="conceptDeclaration" targetNodeId="1.1140137987495" resolveInfo="SNodeTypeCastExpression" />
    <node role="builderBlock" type="jetbrains.mps.bootstrap.dataFlow.structure.BuilderBlock" id="1211992491529">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1211992491530">
        <node role="statement" type="jetbrains.mps.bootstrap.dataFlow.structure.EmitCodeForStatement" id="1211992496031">
          <node role="codeFor" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1211992504644">
            <node role="operand" type="jetbrains.mps.bootstrap.dataFlow.structure.NodeParameter" id="1211992500737" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1211992507741">
              <link role="link" targetNodeId="1.1140138123956" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <visible index="2" modelUID="jetbrains.mps.closures.structure" />
  <node type="jetbrains.mps.bootstrap.dataFlow.structure.DataFlowBuilderDeclaration" id="1214495912999">
    <property name="package" value="command" />
    <link role="conceptDeclaration" targetNodeId="1.1208782992286" resolveInfo="BaseExecuteCommandStatement" />
    <node role="builderBlock" type="jetbrains.mps.bootstrap.dataFlow.structure.BuilderBlock" id="1214495913000">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214495913001">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1216638831066">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216638831067">
            <node role="statement" type="jetbrains.mps.bootstrap.dataFlow.structure.EmitReadStatement" id="1216638831068">
              <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1216638831069">
                <link role="variableDeclaration" targetNodeId="1216638831070" resolveInfo="var" />
              </node>
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1216638831070">
            <property name="name" value="var" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1216638831071">
              <link role="concept" targetNodeId="2.1068581242863" resolveInfo="LocalVariableDeclaration" />
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216638831072">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216638839600">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216638831073">
                <node role="operand" type="jetbrains.mps.bootstrap.dataFlow.structure.NodeParameter" id="1216638831074" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1216638838847">
                  <link role="link" targetNodeId="1.1208941703859" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1216638843308">
                <link role="link" targetNodeId="2v.1199569916463" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1216638831076">
              <link role="conceptMethodDeclaration" targetNodeId="6.1214501165480" resolveInfo="getExternalVariablesDeclarations" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.bootstrap.dataFlow.structure.EmitCodeForStatement" id="1216551643415">
          <node role="codeFor" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216551753673">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216551651271">
              <node role="operand" type="jetbrains.mps.bootstrap.dataFlow.structure.NodeParameter" id="1216551650880" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1216551664778">
                <link role="link" targetNodeId="1.1208941703859" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1216551756533">
              <link role="link" targetNodeId="2v.1199569916463" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.dataFlow.structure.DataFlowBuilderDeclaration" id="1216646466443">
    <property name="package" value="command" />
    <link role="conceptDeclaration" targetNodeId="1.1208899702690" resolveInfo="CommandClosureLiteral" />
    <node role="builderBlock" type="jetbrains.mps.bootstrap.dataFlow.structure.BuilderBlock" id="1216646466444">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216646466445">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1216646468587">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216646468588">
            <node role="statement" type="jetbrains.mps.bootstrap.dataFlow.structure.EmitReadStatement" id="1216646468589">
              <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1216646468590">
                <link role="variableDeclaration" targetNodeId="1216646468591" resolveInfo="var" />
              </node>
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1216646468591">
            <property name="name" value="var" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1216646468592">
              <link role="concept" targetNodeId="2.1068581242863" resolveInfo="LocalVariableDeclaration" />
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216646468593">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216646468594">
              <node role="operand" type="jetbrains.mps.bootstrap.dataFlow.structure.NodeParameter" id="1216646468596" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1216646468598">
                <link role="link" targetNodeId="2v.1199569916463" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1216646468599">
              <link role="conceptMethodDeclaration" targetNodeId="6.1214501165480" resolveInfo="getExternalVariablesDeclarations" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.dataFlow.structure.DataFlowBuilderDeclaration" id="1220278792529">
    <link role="conceptDeclaration" targetNodeId="1.1145404486709" resolveInfo="SemanticDowncastExpression" />
    <node role="builderBlock" type="jetbrains.mps.bootstrap.dataFlow.structure.BuilderBlock" id="1220278792530">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220278792531">
        <node role="statement" type="jetbrains.mps.bootstrap.dataFlow.structure.EmitCodeForStatement" id="1220278795126">
          <node role="codeFor" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220278796425">
            <node role="operand" type="jetbrains.mps.bootstrap.dataFlow.structure.NodeParameter" id="1220278796206" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1220278806442">
              <link role="link" targetNodeId="1.1145404616321" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>


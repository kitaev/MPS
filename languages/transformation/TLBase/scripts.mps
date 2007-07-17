<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.transformation.TLBase.scripts">
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang" />
  <language namespace="jetbrains.mps.ide.scriptLanguage" />
  <maxImportIndex value="4" />
  <import index="1" modelUID="jetbrains.mps.transformation.TLBase.structure" />
  <import index="2" modelUID="java.lang@java_stub" />
  <import index="3" modelUID="java.io@java_stub" />
  <import index="4" modelUID="jetbrains.mps.bootstrap.sharedConcepts.structure" />
  <node type="jetbrains.mps.ide.scriptLanguage.Script" id="1184634633743">
    <property name="scriptName" value="CollectStatisticFor_refMacro_GetReferent" />
    <node role="statementList" type="jetbrains.mps.baseLanguage.StatementList" id="1184634633744">
      <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1184634777964">
        <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1184634777965">
          <property name="name" value="instances" />
          <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1184634777966" />
          <node role="initializer" type="jetbrains.mps.ide.scriptLanguage.FindConceptInstances" id="1184634732994">
            <link role="conceptDeclaration" targetNodeId="1.1167169188348" />
          </node>
        </node>
      </node>
      <node role="statement" type="jetbrains.mps.ide.scriptLanguage.ShowNodes" id="1184636227792">
        <property name="caption" value="sourceNode usages" />
        <node role="nodeList" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1184636227793">
          <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1184636227794">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1184636227795">
              <link role="variableDeclaration" targetNodeId="1184634777965" resolveInfo="instances" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.WhereOperation" id="1184636227796">
              <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.WhereBlock" id="1184636227797">
                <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.DefaultInputElement" id="1184636227798">
                  <property name="name" value="it" />
                </node>
                <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1184636227799">
                  <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1184636227800">
                    <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1184636227801">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1184636227802" />
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1184636227803">
                        <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAncestorOperation" id="1184636227804">
                          <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.OperationParm_Concept" id="1184636227805">
                            <link role="concept" targetNodeId="1.1167770111131" />
                          </node>
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.ClosureParameterReference" id="1184636227806">
                          <link role="closureParameter" targetNodeId="1184636227798" resolveInfo="it" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.ToListOperation" id="1184636227807" />
        </node>
      </node>
      <node role="statement" type="jetbrains.mps.baseLanguage.RemarkStatement" id="1184634995548">
        <property name="value" value="------" />
      </node>
      <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1184635018000">
        <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1184635019373">
          <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1184635018001">
            <link role="variableDeclaration" targetNodeId="1184634777965" resolveInfo="instances" />
          </node>
          <node role="rValue" type="jetbrains.mps.ide.scriptLanguage.FindConceptInstances" id="1184635026239">
            <link role="conceptDeclaration" targetNodeId="1.1167770229866" />
          </node>
        </node>
      </node>
      <node role="statement" type="jetbrains.mps.ide.scriptLanguage.ShowNodes" id="1184636254228">
        <property name="caption" value="templateRefernt usages" />
        <node role="nodeList" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1184636254229">
          <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1184636254230">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1184636254231">
              <link role="variableDeclaration" targetNodeId="1184634777965" resolveInfo="instances" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.WhereOperation" id="1184636254232">
              <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.WhereBlock" id="1184636254233">
                <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.DefaultInputElement" id="1184636254234">
                  <property name="name" value="it" />
                </node>
                <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1184636254235">
                  <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1184636254236">
                    <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1184636254237">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1184636254238" />
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1184636254239">
                        <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAncestorOperation" id="1184636254240">
                          <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.OperationParm_Concept" id="1184636254241">
                            <link role="concept" targetNodeId="1.1167770111131" />
                          </node>
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.ClosureParameterReference" id="1184636254242">
                          <link role="closureParameter" targetNodeId="1184636254234" resolveInfo="it" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.ToListOperation" id="1184636254243" />
        </node>
      </node>
      <node role="statement" type="jetbrains.mps.baseLanguage.RemarkStatement" id="1184635108542">
        <property name="value" value="------" />
      </node>
      <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1184635108543">
        <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1184635108544">
          <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1184635108545">
            <link role="variableDeclaration" targetNodeId="1184634777965" resolveInfo="instances" />
          </node>
          <node role="rValue" type="jetbrains.mps.ide.scriptLanguage.FindConceptInstances" id="1184635108546">
            <link role="conceptDeclaration" targetNodeId="1.1167774355440" />
          </node>
        </node>
      </node>
      <node role="statement" type="jetbrains.mps.ide.scriptLanguage.ShowNodes" id="1184635520882">
        <property name="caption" value="templateNode usages" />
        <node role="nodeList" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1184635592175">
          <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1184635582763">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1184635582764">
              <link role="variableDeclaration" targetNodeId="1184634777965" resolveInfo="instances" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.WhereOperation" id="1184635582765">
              <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.WhereBlock" id="1184635582766">
                <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.DefaultInputElement" id="1184635582767">
                  <property name="name" value="it" />
                </node>
                <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1184635582768">
                  <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1184635582769">
                    <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1184635582770">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1184635582771" />
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1184635582772">
                        <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAncestorOperation" id="1184635582773">
                          <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.OperationParm_Concept" id="1184635582774">
                            <link role="concept" targetNodeId="1.1167770111131" />
                          </node>
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.ClosureParameterReference" id="1184635582775">
                          <link role="closureParameter" targetNodeId="1184635582767" resolveInfo="it" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.ToListOperation" id="1184635597258" />
        </node>
      </node>
      <node role="statement" type="jetbrains.mps.baseLanguage.RemarkStatement" id="1184635155980">
        <property name="value" value="------" />
      </node>
      <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1184635155981">
        <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1184635155982">
          <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1184635155983">
            <link role="variableDeclaration" targetNodeId="1184634777965" resolveInfo="instances" />
          </node>
          <node role="rValue" type="jetbrains.mps.ide.scriptLanguage.FindConceptInstances" id="1184635155984">
            <link role="conceptDeclaration" targetNodeId="1.1166748937193" />
          </node>
        </node>
      </node>
      <node role="statement" type="jetbrains.mps.ide.scriptLanguage.ShowNodes" id="1184636282805">
        <property name="caption" value="sourceModel usages" />
        <node role="nodeList" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1184636282806">
          <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1184636282807">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1184636282808">
              <link role="variableDeclaration" targetNodeId="1184634777965" resolveInfo="instances" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.WhereOperation" id="1184636282809">
              <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.WhereBlock" id="1184636282810">
                <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.DefaultInputElement" id="1184636282811">
                  <property name="name" value="it" />
                </node>
                <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1184636282812">
                  <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1184636282813">
                    <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1184636282814">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1184636282815" />
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1184636282816">
                        <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAncestorOperation" id="1184636282817">
                          <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.OperationParm_Concept" id="1184636282818">
                            <link role="concept" targetNodeId="1.1167770111131" />
                          </node>
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.ClosureParameterReference" id="1184636282819">
                          <link role="closureParameter" targetNodeId="1184636282811" resolveInfo="it" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.ToListOperation" id="1184636282820" />
        </node>
      </node>
      <node role="statement" type="jetbrains.mps.baseLanguage.RemarkStatement" id="1184635189688">
        <property name="value" value="------" />
      </node>
      <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1184635189689">
        <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1184635189690">
          <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1184635189691">
            <link role="variableDeclaration" targetNodeId="1184634777965" resolveInfo="instances" />
          </node>
          <node role="rValue" type="jetbrains.mps.ide.scriptLanguage.FindConceptInstances" id="1184635189692">
            <link role="conceptDeclaration" targetNodeId="1.1166749287094" />
          </node>
        </node>
      </node>
      <node role="statement" type="jetbrains.mps.ide.scriptLanguage.ShowNodes" id="1184636299025">
        <property name="caption" value="generator usages" />
        <node role="nodeList" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1184636299026">
          <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1184636299027">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1184636299028">
              <link role="variableDeclaration" targetNodeId="1184634777965" resolveInfo="instances" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.WhereOperation" id="1184636299029">
              <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.WhereBlock" id="1184636299030">
                <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.DefaultInputElement" id="1184636299031">
                  <property name="name" value="it" />
                </node>
                <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1184636299032">
                  <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1184636299033">
                    <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1184636299034">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1184636299035" />
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1184636299036">
                        <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAncestorOperation" id="1184636299037">
                          <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.OperationParm_Concept" id="1184636299038">
                            <link role="concept" targetNodeId="1.1167770111131" />
                          </node>
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.ClosureParameterReference" id="1184636299039">
                          <link role="closureParameter" targetNodeId="1184636299031" resolveInfo="it" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.ToListOperation" id="1184636299040" />
        </node>
      </node>
      <node role="statement" type="jetbrains.mps.baseLanguage.RemarkStatement" id="1184635244317">
        <property name="value" value="------" />
      </node>
      <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1184635244318">
        <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1184635244319">
          <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1184635244320">
            <link role="variableDeclaration" targetNodeId="1184634777965" resolveInfo="instances" />
          </node>
          <node role="rValue" type="jetbrains.mps.ide.scriptLanguage.FindConceptInstances" id="1184635244321">
            <link role="conceptDeclaration" targetNodeId="4.1161622878565" />
          </node>
        </node>
      </node>
      <node role="statement" type="jetbrains.mps.ide.scriptLanguage.ShowNodes" id="1184636045598">
        <property name="caption" value="scope usages" />
        <node role="nodeList" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1184636045599">
          <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1184636045600">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1184636045601">
              <link role="variableDeclaration" targetNodeId="1184634777965" resolveInfo="instances" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.WhereOperation" id="1184636045602">
              <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.WhereBlock" id="1184636045603">
                <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.DefaultInputElement" id="1184636045604">
                  <property name="name" value="it" />
                </node>
                <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1184636045605">
                  <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1184636045606">
                    <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1184636045607">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1184636045608" />
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1184636045609">
                        <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAncestorOperation" id="1184636045610">
                          <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.OperationParm_Concept" id="1184636045611">
                            <link role="concept" targetNodeId="1.1167770111131" />
                          </node>
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.ClosureParameterReference" id="1184636045612">
                          <link role="closureParameter" targetNodeId="1184636045604" resolveInfo="it" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.ToListOperation" id="1184636045613" />
        </node>
      </node>
      <node role="statement" type="jetbrains.mps.baseLanguage.RemarkStatement" id="1184635337638">
        <property name="value" value="------" />
      </node>
      <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1184635337639">
        <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1184635337640">
          <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1184635337641">
            <link role="variableDeclaration" targetNodeId="1184634777965" resolveInfo="instances" />
          </node>
          <node role="rValue" type="jetbrains.mps.ide.scriptLanguage.FindConceptInstances" id="1184635337642">
            <link role="conceptDeclaration" targetNodeId="4.1161622753914" />
          </node>
        </node>
      </node>
      <node role="statement" type="jetbrains.mps.ide.scriptLanguage.ShowNodes" id="1184636317173">
        <property name="caption" value="operationContext usages" />
        <node role="nodeList" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1184636317174">
          <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1184636317175">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1184636317176">
              <link role="variableDeclaration" targetNodeId="1184634777965" resolveInfo="instances" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.WhereOperation" id="1184636317177">
              <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.WhereBlock" id="1184636317178">
                <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.DefaultInputElement" id="1184636317179">
                  <property name="name" value="it" />
                </node>
                <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1184636317180">
                  <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1184636317181">
                    <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1184636317182">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1184636317183" />
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1184636317184">
                        <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAncestorOperation" id="1184636317185">
                          <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.OperationParm_Concept" id="1184636317186">
                            <link role="concept" targetNodeId="1.1167770111131" />
                          </node>
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.ClosureParameterReference" id="1184636317187">
                          <link role="closureParameter" targetNodeId="1184636317179" resolveInfo="it" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.ToListOperation" id="1184636317188" />
        </node>
      </node>
    </node>
  </node>
</model>


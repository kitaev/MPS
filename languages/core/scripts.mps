<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.core.scripts">
  <persistence version="1" />
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang" />
  <language namespace="jetbrains.mps.ide.scriptLanguage" />
  <language namespace="jetbrains.mps.logging.refactoring" />
  <maxImportIndex value="8" />
  <import index="1" modelUID="jetbrains.mps.core.structure" version="-1" />
  <import index="2" modelUID="jetbrains.mps.ide.action@java_stub" version="-1" />
  <import index="3" modelUID="java.io@java_stub" version="-1" />
  <import index="4" modelUID="java.lang@java_stub" version="-1" />
  <import index="5" modelUID="jetbrains.mps.smodel@java_stub" version="-1" />
  <import index="6" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure" version="-1" />
  <import index="7" modelUID="java.util@java_stub" version="-1" />
  <import index="8" modelUID="jetbrains.mps.refactoring.framework@java_stub" version="-1" />
  <node type="jetbrains.mps.logging.refactoring.structure.Refactoring" id="1191408536233">
    <property name="name" value="MoveNodeRefactoring" />
    <node role="internalArguments" type="jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgument" id="1191408536234">
      <property name="name" value="nodePlace" />
      <property name="presentation" value="_" />
      <node role="argumentType" type="jetbrains.mps.logging.refactoring.structure.SNodeArgumentType" id="1191408536235" />
    </node>
    <node role="internalArguments" type="jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgument" id="1191408536236">
      <property name="name" value="modelPlace" />
      <property name="presentation" value="_" />
      <node role="argumentType" type="jetbrains.mps.logging.refactoring.structure.SModelArgumentType" id="1191408536237" />
    </node>
    <node role="internalArguments" type="jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgument" id="1191408536238">
      <property name="name" value="oldNode" />
      <property name="presentation" value="_" />
      <node role="argumentType" type="jetbrains.mps.logging.refactoring.structure.SNodeArgumentType" id="1191408536239" />
    </node>
    <node role="internalArguments" type="jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgument" id="1191408536240">
      <property name="name" value="newNode" />
      <property name="presentation" value="_" />
      <node role="argumentType" type="jetbrains.mps.logging.refactoring.structure.SNodeArgumentType" id="1191408536241" />
    </node>
    <node role="internalArguments" type="jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgument" id="1191930946086">
      <property name="name" value="mapping" />
      <property name="presentation" value="_" />
      <node role="argumentType" type="jetbrains.mps.logging.refactoring.structure.StringArgumentType" id="1191930952901" />
    </node>
    <node role="arguments" type="jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgument" id="1191408536242">
      <property name="name" value="place" />
      <property name="presentation" value="choose destination" />
      <node role="argumentType" type="jetbrains.mps.logging.refactoring.structure.SNodeOrModelArgumentType" id="1191408536243" />
    </node>
    <node role="doRefactorClause" type="jetbrains.mps.logging.refactoring.structure.DoRefactorClause" id="1191408536244">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1191408536245">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1191408536246">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1191408536247">
            <link role="baseMethodDeclaration" targetNodeId="3.~PrintStream.println(java.lang.String):void" resolveInfo="println" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1191408536248">
              <link role="baseMethodDeclaration" targetNodeId="4.~Object.toString():java.lang.String" resolveInfo="toString" />
              <node role="instance" type="jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgumentReference" id="1191408536249">
                <link role="argument" targetNodeId="1191408536242" resolveInfo="place" />
              </node>
            </node>
            <node role="instance" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1191408536250">
              <link role="variableDeclaration" targetNodeId="4.~System.out" resolveInfo="out" />
              <link role="classifier" targetNodeId="4.~System" resolveInfo="System" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1191408536251">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1191408536252">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1191408536253" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1191408536254">
              <link role="baseMethodDeclaration" targetNodeId="2.~ActionContext.getNode():jetbrains.mps.smodel.SNode" resolveInfo="getNode" />
              <node role="instance" type="jetbrains.mps.logging.refactoring.structure.ConceptFunctionParameter_ActionContext" id="1191408536255" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1191408536256">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1191408536257">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191408536258">
              <link role="variableDeclaration" targetNodeId="1191408536252" resolveInfo="node" />
            </node>
            <node role="lValue" type="jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgumentReference" id="1191408536259">
              <link role="argument" targetNodeId="1191408536238" resolveInfo="oldNode" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1191408536260">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1191408536261">
            <property name="name" value="concept" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1191408536262">
              <link role="concept" targetNodeId="6.1169125787135" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1191408536263">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetConceptOperation" id="1191408536264" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191408536265">
                <link role="variableDeclaration" targetNodeId="1191408536252" resolveInfo="node" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1191408536266">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1191408536267">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1191930995363">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1191930995364">
                <property name="name" value="map" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1191930995365">
                  <link role="classifier" targetNodeId="7.~HashMap" resolveInfo="HashMap" />
                  <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1191930995366">
                    <link role="classifier" targetNodeId="5.~SNode" resolveInfo="SNode" />
                  </node>
                  <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1191930995367">
                    <link role="classifier" targetNodeId="5.~SNode" resolveInfo="SNode" />
                  </node>
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1191930995368">
                  <link role="baseMethodDeclaration" targetNodeId="7.~HashMap.&lt;init&gt;()" resolveInfo="HashMap" />
                  <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1191930995369">
                    <link role="classifier" targetNodeId="5.~SNode" resolveInfo="SNode" />
                  </node>
                  <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1191930995370">
                    <link role="classifier" targetNodeId="5.~SNode" resolveInfo="SNode" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1191408536268">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1191408536269">
                <property name="name" value="nodeCopy" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1191408536270" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1191930977652">
                  <link role="baseMethodDeclaration" targetNodeId="5.~CopyUtil.copyAndGetMapping(jetbrains.mps.smodel.SNode,jetbrains.mps.smodel.SModel,java.util.Map):jetbrains.mps.smodel.SNode" resolveInfo="copyAndGetMapping" />
                  <link role="classConcept" targetNodeId="5.~CopyUtil" resolveInfo="CopyUtil" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191930977653">
                    <link role="variableDeclaration" targetNodeId="1191408536252" resolveInfo="node" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgumentReference" id="1191934174984">
                    <link role="argument" targetNodeId="1191408536236" resolveInfo="modelPlace" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191930977657">
                    <link role="variableDeclaration" targetNodeId="1191930995364" resolveInfo="map" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1191408536275">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1191408536276">
                <link role="baseMethodDeclaration" targetNodeId="5.~SModel.addRoot(jetbrains.mps.smodel.SNode):void" resolveInfo="addRoot" />
                <node role="instance" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1191408536277">
                  <node role="leftExpression" type="jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgumentReference" id="1191408536278">
                    <link role="argument" targetNodeId="1191408536236" resolveInfo="modelPlace" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191408536279">
                  <link role="variableDeclaration" targetNodeId="1191408536269" resolveInfo="nodeCopy" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1191408536280">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1191408536281">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_DeleteOperation" id="1191408536282" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191408536283">
                  <link role="variableDeclaration" targetNodeId="1191408536252" resolveInfo="node" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1191408536284">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1191408536285">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191408536286">
                  <link role="variableDeclaration" targetNodeId="1191408536269" resolveInfo="nodeCopy" />
                </node>
                <node role="lValue" type="jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgumentReference" id="1191408536287">
                  <link role="argument" targetNodeId="1191408536240" resolveInfo="newNode" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1191931028575">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1191931029764">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1191931067934">
                  <link role="baseMethodDeclaration" targetNodeId="8.~MarshallUtil.marshallNodeMap(java.util.Map):java.lang.String" resolveInfo="marshallNodeMap" />
                  <link role="classConcept" targetNodeId="8.~MarshallUtil" resolveInfo="MarshallUtil" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191931071810">
                    <link role="variableDeclaration" targetNodeId="1191930995364" resolveInfo="map" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgumentReference" id="1191931028576">
                  <link role="argument" targetNodeId="1191930946086" resolveInfo="mapping" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.InstanceOfExpression" id="1191408536288">
            <node role="classType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1191408536289">
              <link role="classifier" targetNodeId="5.~SModel" resolveInfo="SModel" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgumentReference" id="1191408536290">
              <link role="argument" targetNodeId="1191408536242" resolveInfo="place" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1191408536291">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1191408536292">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1191408536293">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1191408536294">
                <property name="name" value="placeConcept" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1191408536295">
                  <link role="concept" targetNodeId="6.1071489090640" />
                </node>
                <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1191408536296">
                  <link role="concept" targetNodeId="6.1071489090640" />
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1191408536297">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetConceptOperation" id="1191408536298" />
                    <node role="leftExpression" type="jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgumentReference" id="1191408536299">
                      <link role="argument" targetNodeId="1191408536234" resolveInfo="nodePlace" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1191408536300">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1191408536301">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1191408536302">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1191408536303">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1191930825815">
                      <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1191930825816">
                        <property name="name" value="map" />
                        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1191930825817">
                          <link role="classifier" targetNodeId="7.~HashMap" resolveInfo="HashMap" />
                          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1191930893999">
                            <link role="classifier" targetNodeId="5.~SNode" resolveInfo="SNode" />
                          </node>
                          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1191930898250">
                            <link role="classifier" targetNodeId="5.~SNode" resolveInfo="SNode" />
                          </node>
                        </node>
                        <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1191930796543">
                          <link role="baseMethodDeclaration" targetNodeId="7.~HashMap.&lt;init&gt;()" resolveInfo="HashMap" />
                          <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1191930902720">
                            <link role="classifier" targetNodeId="5.~SNode" resolveInfo="SNode" />
                          </node>
                          <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1191930905018">
                            <link role="classifier" targetNodeId="5.~SNode" resolveInfo="SNode" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1191930923519">
                      <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1191930923520">
                        <property name="name" value="nodeCopy" />
                        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1191930923521">
                          <link role="classifier" targetNodeId="5.~SNode" resolveInfo="SNode" />
                        </node>
                        <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1191930782275">
                          <link role="baseMethodDeclaration" targetNodeId="5.~CopyUtil.copyAndGetMapping(jetbrains.mps.smodel.SNode,jetbrains.mps.smodel.SModel,java.util.Map):jetbrains.mps.smodel.SNode" resolveInfo="copyAndGetMapping" />
                          <link role="classConcept" targetNodeId="5.~CopyUtil" resolveInfo="CopyUtil" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191930785885">
                            <link role="variableDeclaration" targetNodeId="1191408536252" resolveInfo="node" />
                          </node>
                          <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1191930884167">
                            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetModelOperation" id="1191930886764" />
                            <node role="leftExpression" type="jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgumentReference" id="1191930882135">
                              <link role="argument" targetNodeId="1191408536234" resolveInfo="nodePlace" />
                            </node>
                          </node>
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191930825820">
                            <link role="variableDeclaration" targetNodeId="1191930825816" resolveInfo="map" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1191408536313">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1191408536314">
                        <link role="baseMethodDeclaration" targetNodeId="5.~SNode.addChild(java.lang.String,jetbrains.mps.smodel.SNode):void" resolveInfo="addChild" />
                        <node role="instance" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1191408536315">
                          <node role="leftExpression" type="jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgumentReference" id="1191408536316">
                            <link role="argument" targetNodeId="1191408536234" resolveInfo="nodePlace" />
                          </node>
                        </node>
                        <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1191408536317">
                          <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1191408536318">
                            <link role="property" targetNodeId="6.1071599776563" />
                          </node>
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191408536319">
                            <link role="variableDeclaration" targetNodeId="1191408536350" resolveInfo="linkDeclaration" />
                          </node>
                        </node>
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191930934194">
                          <link role="variableDeclaration" targetNodeId="1191930923520" resolveInfo="nodeCopy" />
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1191408536321">
                      <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1191408536322">
                        <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_DeleteOperation" id="1191408536323" />
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191408536324">
                          <link role="variableDeclaration" targetNodeId="1191408536252" resolveInfo="node" />
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1191408536325">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1191408536326">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191930938257">
                          <link role="variableDeclaration" targetNodeId="1191930923520" resolveInfo="nodeCopy" />
                        </node>
                        <node role="lValue" type="jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgumentReference" id="1191408536328">
                          <link role="argument" targetNodeId="1191408536240" resolveInfo="newNode" />
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1191931084296">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1191931084297">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1191931084298">
                          <link role="baseMethodDeclaration" targetNodeId="8.~MarshallUtil.marshallNodeMap(java.util.Map):java.lang.String" resolveInfo="marshallNodeMap" />
                          <link role="classConcept" targetNodeId="8.~MarshallUtil" resolveInfo="MarshallUtil" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191931084299">
                            <link role="variableDeclaration" targetNodeId="1191930825816" resolveInfo="map" />
                          </node>
                        </node>
                        <node role="lValue" type="jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgumentReference" id="1191931084300">
                          <link role="argument" targetNodeId="1191930946086" resolveInfo="mapping" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1191408536329">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Concept_IsAssignableFromOperation" id="1191408536330">
                      <node role="sconceptExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191408536331">
                        <link role="variableDeclaration" targetNodeId="1191408536261" resolveInfo="concept" />
                      </node>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1191408536332">
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1191408536333">
                        <link role="link" targetNodeId="6.1071599976176" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191408536334">
                        <link role="variableDeclaration" targetNodeId="1191408536350" resolveInfo="linkDeclaration" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="iterable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1191408536335">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1191408536336">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1191408536337">
                    <link role="link" targetNodeId="6.1071489727083" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191408536338">
                    <link role="variableDeclaration" targetNodeId="1191408536294" resolveInfo="placeConcept" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereOperation" id="1191408536339">
                  <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereBlock" id="1191408536340">
                    <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.DefaultInputElement" id="1191408536341">
                      <property name="name" value="it" />
                    </node>
                    <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1191408536342">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1191408536343">
                        <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1191408536344">
                          <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_HasValue_Enum" id="1191408536345">
                            <node role="value" type="jetbrains.mps.bootstrap.smodelLanguage.structure.EnumMemberReference" id="1191408536346">
                              <link role="enumMember" targetNodeId="6.1084199179705" />
                            </node>
                          </node>
                          <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1191408536347">
                            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1191408536348">
                              <link role="property" targetNodeId="6.1071599937831" />
                            </node>
                            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1191408536349">
                              <link role="closureParameter" targetNodeId="1191408536341" resolveInfo="it" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1191408536350">
                <property name="name" value="linkDeclaration" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1191408536351">
                  <link role="concept" targetNodeId="6.1071489288298" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.InstanceOfExpression" id="1191408536352">
            <node role="classType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1191408536353">
              <link role="classifier" targetNodeId="5.~SNode" resolveInfo="SNode" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgumentReference" id="1191408536354">
              <link role="argument" targetNodeId="1191408536242" resolveInfo="place" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="isApplicableClause" type="jetbrains.mps.logging.refactoring.structure.IsApplicableClause" id="1191408536355">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1191408536356">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1191408536357">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1191408536358">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1191408536359" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1191408536360">
              <link role="baseMethodDeclaration" targetNodeId="2.~ActionContext.getNode():jetbrains.mps.smodel.SNode" resolveInfo="getNode" />
              <node role="instance" type="jetbrains.mps.logging.refactoring.structure.ConceptFunctionParameter_ActionContext" id="1191408536361" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1191408536362">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1191408536363">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1191408536364">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1191408536365">
                <property name="value" value="false" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1191408536366">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1191408536367" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191408536368">
              <link role="variableDeclaration" targetNodeId="1191408536358" resolveInfo="node" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1191408536369">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1191408536370">
            <property name="name" value="concept" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1191408536371">
              <link role="concept" targetNodeId="6.1169125787135" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1191408536372">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetConceptOperation" id="1191408536373" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191408536374">
                <link role="variableDeclaration" targetNodeId="1191408536358" resolveInfo="node" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1191408536375">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1191408536376">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1191408536377">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1191408536378">
                <property name="value" value="false" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1191408536379">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1191408536380">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1191408536381">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1191408536382">
                  <link role="conceptDeclaration" targetNodeId="6.1071489090640" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191408536383">
                <link role="variableDeclaration" targetNodeId="1191408536370" resolveInfo="concept" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1191408536384">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.InstanceOfExpression" id="1191408536385">
            <node role="classType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1191408536386">
              <link role="classifier" targetNodeId="5.~SModel" resolveInfo="SModel" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgumentReference" id="1191408536387">
              <link role="argument" targetNodeId="1191408536242" resolveInfo="place" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1191408536388">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1191408536389">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1191408536390">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1191408536391">
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SModelType" id="1191408536392" />
                  <node role="expression" type="jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgumentReference" id="1191408536393">
                    <link role="argument" targetNodeId="1191408536242" resolveInfo="place" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgumentReference" id="1191408536394">
                  <link role="argument" targetNodeId="1191408536236" resolveInfo="modelPlace" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1191408536395">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1191408536396">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1191408536397">
                  <link role="property" targetNodeId="6.1096454100552" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1191408536398">
                  <link role="concept" targetNodeId="6.1071489090640" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191408536399">
                    <link role="variableDeclaration" targetNodeId="1191408536370" resolveInfo="concept" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1191408536400">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1191408536401">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1191408536402">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1191408536403">
                <property name="name" value="placeConcept" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1191408536404">
                  <link role="concept" targetNodeId="6.1071489090640" />
                </node>
                <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1191408536405">
                  <link role="concept" targetNodeId="6.1071489090640" />
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1191408536406">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetConceptOperation" id="1191408536407" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1191408536408">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1191408536409">
                        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1191408536410" />
                        <node role="expression" type="jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgumentReference" id="1191408536411">
                          <link role="argument" targetNodeId="1191408536242" resolveInfo="place" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1191408536412">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1191408536413">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1191408536414">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1191408536415">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1191408536416">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1191408536417">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1191408536418">
                          <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1191408536419" />
                          <node role="expression" type="jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgumentReference" id="1191408536420">
                            <link role="argument" targetNodeId="1191408536242" resolveInfo="place" />
                          </node>
                        </node>
                        <node role="lValue" type="jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgumentReference" id="1191408536421">
                          <link role="argument" targetNodeId="1191408536234" resolveInfo="nodePlace" />
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1191408536422">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1191408536423">
                        <property name="value" value="true" />
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1191408536424">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Concept_IsAssignableFromOperation" id="1191408536425">
                      <node role="sconceptExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191408536426">
                        <link role="variableDeclaration" targetNodeId="1191408536370" resolveInfo="concept" />
                      </node>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1191408536427">
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1191408536428">
                        <link role="link" targetNodeId="6.1071599976176" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191408536429">
                        <link role="variableDeclaration" targetNodeId="1191408536445" resolveInfo="linkDeclaration" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="iterable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1191408536430">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1191408536431">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1191408536432">
                    <link role="link" targetNodeId="6.1071489727083" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191408536433">
                    <link role="variableDeclaration" targetNodeId="1191408536403" resolveInfo="placeConcept" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereOperation" id="1191408536434">
                  <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereBlock" id="1191408536435">
                    <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.DefaultInputElement" id="1191408536436">
                      <property name="name" value="it" />
                    </node>
                    <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1191408536437">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1191408536438">
                        <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1191408536439">
                          <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_HasValue_Enum" id="1191408536440">
                            <node role="value" type="jetbrains.mps.bootstrap.smodelLanguage.structure.EnumMemberReference" id="1191408536441">
                              <link role="enumMember" targetNodeId="6.1084199179705" />
                            </node>
                          </node>
                          <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1191408536442">
                            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1191408536443">
                              <link role="property" targetNodeId="6.1071599937831" />
                            </node>
                            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1191408536444">
                              <link role="closureParameter" targetNodeId="1191408536436" resolveInfo="it" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1191408536445">
                <property name="name" value="linkDeclaration" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1191408536446">
                  <link role="concept" targetNodeId="6.1071489288298" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.InstanceOfExpression" id="1191408536447">
            <node role="classType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1191408536448">
              <link role="classifier" targetNodeId="5.~SNode" resolveInfo="SNode" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgumentReference" id="1191408536449">
              <link role="argument" targetNodeId="1191408536242" resolveInfo="place" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1191408536450">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1191408536451">
            <property name="value" value="false" />
          </node>
        </node>
      </node>
    </node>
    <node role="updateModelClause" type="jetbrains.mps.logging.refactoring.structure.UpdateModelClause" id="1191408536452">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1191408536453">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1191848293025">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1191848307043">
            <link role="classConcept" targetNodeId="1191843360262" resolveInfo="RefactoringUtils" />
            <link role="baseMethodDeclaration" targetNodeId="1191843774738" resolveInfo="updateModelAfterMove" />
            <node role="actualArgument" type="jetbrains.mps.logging.refactoring.structure.ConceptFunctionParameter_SModel" id="1191848311622" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1191933777282">
              <link role="baseMethodDeclaration" targetNodeId="8.~MarshallUtil.unmarshallNodeMapToIdMap(java.lang.String):java.util.Map" resolveInfo="unmarshallNodeMapToIdMap" />
              <link role="classConcept" targetNodeId="8.~MarshallUtil" resolveInfo="MarshallUtil" />
              <node role="actualArgument" type="jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgumentReference" id="1191933780049">
                <link role="argument" targetNodeId="1191930946086" resolveInfo="mapping" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1191843360262">
    <property name="name" value="RefactoringUtils" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1191843360263" />
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1191843774738">
      <property name="name" value="updateModelAfterMove" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1191843774739" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1191843774740" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1191843774741">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1191843850819">
          <node role="iterable" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1191843850820">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1191843850821">
              <link role="variableDeclaration" targetNodeId="1191843801509" resolveInfo="model" />
            </node>
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Model_NodesOperation" id="1191843850822" />
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1191843850823">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1191843850824" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1191843850825">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1191843850826">
              <node role="iterable" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1191843850827">
                <link role="baseMethodDeclaration" targetNodeId="5.~SNode.getReferences():java.util.List" resolveInfo="getReferences" />
                <node role="instance" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1191843850828">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191843850829">
                    <link role="variableDeclaration" targetNodeId="1191843850823" resolveInfo="node" />
                  </node>
                </node>
              </node>
              <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1191843850830">
                <property name="name" value="reference" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1191843857044">
                  <link role="classifier" targetNodeId="5.~SReference" resolveInfo="SReference" />
                </node>
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1191843850832">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1191843943178">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1191843943179">
                    <property name="name" value="targetNodeId" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1194527026344">
                      <link role="classifier" targetNodeId="5.~SNodeId" resolveInfo="SNodeId" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1191843888473">
                      <link role="baseMethodDeclaration" targetNodeId="5.~SReference.getTargetNodeId():jetbrains.mps.smodel.SNodeId" resolveInfo="getTargetNodeId" />
                      <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191843879783">
                        <link role="variableDeclaration" targetNodeId="1191843850830" resolveInfo="reference" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1191843955900">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1191843955901">
                    <property name="name" value="targetModelUID" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1191843955902">
                      <link role="classifier" targetNodeId="4.~String" resolveInfo="String" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1191843904931">
                      <link role="baseMethodDeclaration" targetNodeId="5.~SModelUID.toString():java.lang.String" resolveInfo="toString" />
                      <node role="instance" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1191843850850">
                        <link role="baseMethodDeclaration" targetNodeId="5.~SReference.getTargetModelUID():jetbrains.mps.smodel.SModelUID" resolveInfo="getTargetModelUID" />
                        <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191843850851">
                          <link role="variableDeclaration" targetNodeId="1191843850830" resolveInfo="reference" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1192533860661">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1192533860662">
                    <property name="name" value="targetNodeInfo" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1192533860663">
                      <link role="classifier" targetNodeId="4.~String" resolveInfo="String" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1192533819516">
                      <link role="baseMethodDeclaration" targetNodeId="8.~MarshallUtil.nodeInfoFromIdAndModel(java.lang.String,java.lang.String):java.lang.String" resolveInfo="nodeInfoFromIdAndModel" />
                      <link role="classConcept" targetNodeId="8.~MarshallUtil" resolveInfo="MarshallUtil" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1194527032800">
                        <link role="baseMethodDeclaration" targetNodeId="4.~Object.toString():java.lang.String" resolveInfo="toString" />
                        <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1192533825642">
                          <link role="variableDeclaration" targetNodeId="1191843943179" resolveInfo="targetNodeId" />
                        </node>
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1192533831535">
                        <link role="variableDeclaration" targetNodeId="1191843955901" resolveInfo="targetModelUID" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1191843850833">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1191843850834">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1192533881026">
                      <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1192533881027">
                        <property name="name" value="newNodeInfo" />
                        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1192533881028">
                          <link role="classifier" targetNodeId="4.~String" resolveInfo="String" />
                        </node>
                        <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1192533892111">
                          <link role="baseMethodDeclaration" targetNodeId="7.~Map.get(java.lang.Object):java.lang.Object" resolveInfo="get" />
                          <node role="instance" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1192533888030">
                            <link role="variableDeclaration" targetNodeId="1191843803339" resolveInfo="map" />
                          </node>
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1192533898050">
                            <link role="variableDeclaration" targetNodeId="1192533860662" resolveInfo="targetNodeInfo" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1191843850835">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1191843912700">
                        <link role="baseMethodDeclaration" targetNodeId="5.~SReference.setTargetModelUID(jetbrains.mps.smodel.SModelUID):void" resolveInfo="setTargetModelUID" />
                        <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191843909166">
                          <link role="variableDeclaration" targetNodeId="1191843850830" resolveInfo="reference" />
                        </node>
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1191843972906">
                          <link role="baseMethodDeclaration" targetNodeId="5.~SModelUID.fromString(java.lang.String):jetbrains.mps.smodel.SModelUID" resolveInfo="fromString" />
                          <link role="classConcept" targetNodeId="5.~SModelUID" resolveInfo="SModelUID" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1192533912224">
                            <link role="baseMethodDeclaration" targetNodeId="8.~MarshallUtil.getModelUID(java.lang.String):java.lang.String" resolveInfo="getModelUID" />
                            <link role="classConcept" targetNodeId="8.~MarshallUtil" resolveInfo="MarshallUtil" />
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1192537707309">
                              <link role="variableDeclaration" targetNodeId="1192533881027" resolveInfo="newNodeInfo" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1191843850840">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1191843921392">
                        <link role="baseMethodDeclaration" targetNodeId="5.~SReference.setTargetNodeId(jetbrains.mps.smodel.SNodeId):void" resolveInfo="setTargetNodeId" />
                        <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1191843915732">
                          <link role="variableDeclaration" targetNodeId="1191843850830" resolveInfo="reference" />
                        </node>
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1194527047266">
                          <link role="baseMethodDeclaration" targetNodeId="5.~SNodeId.fromString(java.lang.String):jetbrains.mps.smodel.SNodeId" resolveInfo="fromString" />
                          <link role="classConcept" targetNodeId="5.~SNodeId" resolveInfo="SNodeId" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1194527047908">
                            <link role="classConcept" targetNodeId="8.~MarshallUtil" resolveInfo="MarshallUtil" />
                            <link role="baseMethodDeclaration" targetNodeId="8.~MarshallUtil.getNodeId(java.lang.String):java.lang.String" resolveInfo="getNodeId" />
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1194527047909">
                              <link role="variableDeclaration" targetNodeId="1192533881027" resolveInfo="newNodeInfo" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1191843872251">
                    <link role="baseMethodDeclaration" targetNodeId="7.~Map.containsKey(java.lang.Object):boolean" resolveInfo="containsKey" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1191843868217">
                      <link role="variableDeclaration" targetNodeId="1191843803339" resolveInfo="map" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1192533860664">
                      <link role="variableDeclaration" targetNodeId="1192533860662" resolveInfo="targetNodeInfo" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1191843801509">
        <property name="name" value="model" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SModelType" id="1191843801510" />
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1191843803339">
        <property name="name" value="map" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1191843831869">
          <link role="classifier" targetNodeId="7.~Map" resolveInfo="Map" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1191843835004">
            <link role="classifier" targetNodeId="4.~String" resolveInfo="String" />
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1191843837678">
            <link role="classifier" targetNodeId="4.~String" resolveInfo="String" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1192544184887">
      <property name="name" value="moveNodeToModel" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1192544196607">
        <link role="classifier" targetNodeId="4.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1192544184889" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1192544184890">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1192544242966">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1192544242967">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1192544242968">
              <link role="classifier" targetNodeId="4.~String" resolveInfo="String" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1192544218380">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1192544218381">
            <property name="name" value="map" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1192544218382">
              <link role="classifier" targetNodeId="7.~HashMap" resolveInfo="HashMap" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1192544218383">
                <link role="classifier" targetNodeId="5.~SNode" resolveInfo="SNode" />
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1192544218384">
                <link role="classifier" targetNodeId="5.~SNode" resolveInfo="SNode" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1192544218385">
              <link role="baseMethodDeclaration" targetNodeId="7.~HashMap.&lt;init&gt;()" resolveInfo="HashMap" />
              <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1192544218386">
                <link role="classifier" targetNodeId="5.~SNode" resolveInfo="SNode" />
              </node>
              <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1192544218387">
                <link role="classifier" targetNodeId="5.~SNode" resolveInfo="SNode" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1192544218388">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1192544218389">
            <property name="name" value="nodeCopy" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1192544218390" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1192544218391">
              <link role="baseMethodDeclaration" targetNodeId="5.~CopyUtil.copyAndGetMapping(jetbrains.mps.smodel.SNode,jetbrains.mps.smodel.SModel,java.util.Map):jetbrains.mps.smodel.SNode" resolveInfo="copyAndGetMapping" />
              <link role="classConcept" targetNodeId="5.~CopyUtil" resolveInfo="CopyUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1192544281208">
                <link role="variableDeclaration" targetNodeId="1192544264168" resolveInfo="sourceNode" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1192544285538">
                <link role="variableDeclaration" targetNodeId="1192544228803" resolveInfo="targetModel" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1192544218394">
                <link role="variableDeclaration" targetNodeId="1192544218381" resolveInfo="map" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1192544218395">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1192544218396">
            <link role="baseMethodDeclaration" targetNodeId="5.~SModel.addRoot(jetbrains.mps.smodel.SNode):void" resolveInfo="addRoot" />
            <node role="instance" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1192544218397">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1192544259963">
                <link role="variableDeclaration" targetNodeId="1192544228803" resolveInfo="targetModel" />
              </node>
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1192544218399">
              <link role="variableDeclaration" targetNodeId="1192544218389" resolveInfo="nodeCopy" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1192544218400">
          <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1192544218401">
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_DeleteOperation" id="1192544218402" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1192544288462">
              <link role="variableDeclaration" targetNodeId="1192544264168" resolveInfo="sourceNode" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1192544218404">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1192544218405">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1192544218406">
              <link role="classConcept" targetNodeId="8.~MarshallUtil" resolveInfo="MarshallUtil" />
              <link role="baseMethodDeclaration" targetNodeId="8.~MarshallUtil.marshallNodeMap(java.util.Map):java.lang.String" resolveInfo="marshallNodeMap" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1192544218407">
                <link role="variableDeclaration" targetNodeId="1192544218381" resolveInfo="map" />
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1192544249268">
              <link role="variableDeclaration" targetNodeId="1192544242967" resolveInfo="result" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1192544254302">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1192544256055">
            <link role="variableDeclaration" targetNodeId="1192544242967" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1192544264168">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1192544292261" />
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1192544228803">
        <property name="name" value="targetModel" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1192544228804">
          <link role="classifier" targetNodeId="5.~SModel" resolveInfo="SModel" />
        </node>
      </node>
    </node>
  </node>
</model>


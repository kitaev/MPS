<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.core.scripts">
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang" />
  <language namespace="jetbrains.mps.ide.scriptLanguage" />
  <language namespace="jetbrains.mps.logging.refactoring" />
  <maxImportIndex value="6" />
  <import index="1" modelUID="jetbrains.mps.core.structure" version="-1" />
  <import index="2" modelUID="jetbrains.mps.ide.action@java_stub" version="-1" />
  <import index="3" modelUID="java.io@java_stub" version="-1" />
  <import index="4" modelUID="java.lang@java_stub" version="-1" />
  <import index="5" modelUID="jetbrains.mps.smodel@java_stub" version="-1" />
  <import index="6" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure" version="-1" />
  <node type="jetbrains.mps.logging.refactoring.Refactoring" id="1191408536233">
    <property name="name" value="MoveNodeRefactoring" />
    <node role="internalArguments" type="jetbrains.mps.logging.refactoring.RequiredAdditionalArgument" id="1191408536234">
      <property name="name" value="nodePlace" />
      <property name="presentation" value="_" />
      <node role="argumentType" type="jetbrains.mps.logging.refactoring.SNodeArgumentType" id="1191408536235" />
    </node>
    <node role="internalArguments" type="jetbrains.mps.logging.refactoring.RequiredAdditionalArgument" id="1191408536236">
      <property name="name" value="modelPlace" />
      <property name="presentation" value="_" />
      <node role="argumentType" type="jetbrains.mps.logging.refactoring.SModelArgumentType" id="1191408536237" />
    </node>
    <node role="internalArguments" type="jetbrains.mps.logging.refactoring.RequiredAdditionalArgument" id="1191408536238">
      <property name="name" value="oldNode" />
      <property name="presentation" value="_" />
      <node role="argumentType" type="jetbrains.mps.logging.refactoring.SNodeArgumentType" id="1191408536239" />
    </node>
    <node role="internalArguments" type="jetbrains.mps.logging.refactoring.RequiredAdditionalArgument" id="1191408536240">
      <property name="name" value="newNode" />
      <property name="presentation" value="_" />
      <node role="argumentType" type="jetbrains.mps.logging.refactoring.SNodeArgumentType" id="1191408536241" />
    </node>
    <node role="arguments" type="jetbrains.mps.logging.refactoring.RequiredAdditionalArgument" id="1191408536242">
      <property name="name" value="place" />
      <property name="presentation" value="choose destination" />
      <node role="argumentType" type="jetbrains.mps.logging.refactoring.SNodeOrModelArgumentType" id="1191408536243" />
    </node>
    <node role="doRefactorClause" type="jetbrains.mps.logging.refactoring.DoRefactorClause" id="1191408536244">
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1191408536245">
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1191408536246">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1191408536247">
            <link role="baseMethodDeclaration" extResolveInfo="3.method ([Classifier]PrintStream).([InstanceMethodDeclaration]println((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String])))" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1191408536248">
              <link role="baseMethodDeclaration" extResolveInfo="4.method ([Classifier]Object).([InstanceMethodDeclaration]toString())" />
              <node role="instance" type="jetbrains.mps.logging.refactoring.RequiredAdditionalArgumentReference" id="1191408536249">
                <link role="argument" targetNodeId="1191408536242" resolveInfo="place" />
              </node>
            </node>
            <node role="instance" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1191408536250">
              <link role="variableDeclaration" extResolveInfo="4.static field ([Classifier]System).([StaticFieldDeclaration]out : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [PrintStream]))" />
              <link role="classifier" extResolveInfo="4.[Classifier]System" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1191408536251">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1191408536252">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1191408536253" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1191408536254">
              <link role="baseMethodDeclaration" extResolveInfo="2.method ([Classifier]ActionContext).([InstanceMethodDeclaration]getNode())" />
              <node role="instance" type="jetbrains.mps.logging.refactoring.ConceptFunctionParameter_ActionContext" id="1191408536255" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1191408536256">
          <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1191408536257">
            <node role="rValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1191408536258">
              <link role="variableDeclaration" targetNodeId="1191408536252" resolveInfo="node" />
            </node>
            <node role="lValue" type="jetbrains.mps.logging.refactoring.RequiredAdditionalArgumentReference" id="1191408536259">
              <link role="argument" targetNodeId="1191408536238" resolveInfo="oldNode" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1191408536260">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1191408536261">
            <property name="name" value="concept" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1191408536262">
              <link role="concept" targetNodeId="6.1169125787135" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1191408536263">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetConceptOperation" id="1191408536264" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1191408536265">
                <link role="variableDeclaration" targetNodeId="1191408536252" resolveInfo="node" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1191408536266">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1191408536267">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1191408536268">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1191408536269">
                <property name="name" value="nodeCopy" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1191408536270" />
                <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1191408536271">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_CopyOperation" id="1191408536272">
                    <node role="modelToCopy" type="jetbrains.mps.logging.refactoring.RequiredAdditionalArgumentReference" id="1191408536273">
                      <link role="argument" targetNodeId="1191408536236" resolveInfo="modelPlace" />
                    </node>
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1191408536274">
                    <link role="variableDeclaration" targetNodeId="1191408536252" resolveInfo="node" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1191408536275">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1191408536276">
                <link role="baseMethodDeclaration" extResolveInfo="5.method ([Classifier]SModel).([InstanceMethodDeclaration]addRoot((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode])))" />
                <node role="instance" type="jetbrains.mps.bootstrap.smodelLanguage.SemanticDowncastExpression" id="1191408536277">
                  <node role="leftExpression" type="jetbrains.mps.logging.refactoring.RequiredAdditionalArgumentReference" id="1191408536278">
                    <link role="argument" targetNodeId="1191408536236" resolveInfo="modelPlace" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1191408536279">
                  <link role="variableDeclaration" targetNodeId="1191408536269" resolveInfo="nodeCopy" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1191408536280">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1191408536281">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_DeleteOperation" id="1191408536282" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1191408536283">
                  <link role="variableDeclaration" targetNodeId="1191408536252" resolveInfo="node" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1191408536284">
              <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1191408536285">
                <node role="rValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1191408536286">
                  <link role="variableDeclaration" targetNodeId="1191408536269" resolveInfo="nodeCopy" />
                </node>
                <node role="lValue" type="jetbrains.mps.logging.refactoring.RequiredAdditionalArgumentReference" id="1191408536287">
                  <link role="argument" targetNodeId="1191408536240" resolveInfo="newNode" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1191408536288">
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassifierType" id="1191408536289">
              <link role="classifier" extResolveInfo="5.[Classifier]SModel" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.logging.refactoring.RequiredAdditionalArgumentReference" id="1191408536290">
              <link role="argument" targetNodeId="1191408536242" resolveInfo="place" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1191408536291">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1191408536292">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1191408536293">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1191408536294">
                <property name="name" value="placeConcept" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1191408536295">
                  <link role="concept" targetNodeId="6.1071489090640" />
                </node>
                <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1191408536296">
                  <link role="concept" targetNodeId="6.1071489090640" />
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1191408536297">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetConceptOperation" id="1191408536298" />
                    <node role="leftExpression" type="jetbrains.mps.logging.refactoring.RequiredAdditionalArgumentReference" id="1191408536299">
                      <link role="argument" targetNodeId="1191408536234" resolveInfo="nodePlace" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ForeachStatement" id="1191408536300">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1191408536301">
                <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1191408536302">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1191408536303">
                    <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1191408536304">
                      <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1191408536305">
                        <property name="name" value="nodeCopy" />
                        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1191408536306" />
                        <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1191408536307">
                          <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_CopyOperation" id="1191408536308">
                            <node role="modelToCopy" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1191408536309">
                              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetModelOperation" id="1191408536310" />
                              <node role="leftExpression" type="jetbrains.mps.logging.refactoring.RequiredAdditionalArgumentReference" id="1191408536311">
                                <link role="argument" targetNodeId="1191408536234" resolveInfo="nodePlace" />
                              </node>
                            </node>
                          </node>
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1191408536312">
                            <link role="variableDeclaration" targetNodeId="1191408536252" resolveInfo="node" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1191408536313">
                      <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1191408536314">
                        <link role="baseMethodDeclaration" extResolveInfo="5.method ([Classifier]SNode).([InstanceMethodDeclaration]addChild((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode])))" />
                        <node role="instance" type="jetbrains.mps.bootstrap.smodelLanguage.SemanticDowncastExpression" id="1191408536315">
                          <node role="leftExpression" type="jetbrains.mps.logging.refactoring.RequiredAdditionalArgumentReference" id="1191408536316">
                            <link role="argument" targetNodeId="1191408536234" resolveInfo="nodePlace" />
                          </node>
                        </node>
                        <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1191408536317">
                          <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1191408536318">
                            <link role="property" targetNodeId="6.1071599776563" />
                          </node>
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1191408536319">
                            <link role="variableDeclaration" targetNodeId="1191408536350" resolveInfo="linkDeclaration" />
                          </node>
                        </node>
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1191408536320">
                          <link role="variableDeclaration" targetNodeId="1191408536305" resolveInfo="nodeCopy" />
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1191408536321">
                      <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1191408536322">
                        <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_DeleteOperation" id="1191408536323" />
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1191408536324">
                          <link role="variableDeclaration" targetNodeId="1191408536252" resolveInfo="node" />
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1191408536325">
                      <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1191408536326">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1191408536327">
                          <link role="variableDeclaration" targetNodeId="1191408536305" resolveInfo="nodeCopy" />
                        </node>
                        <node role="lValue" type="jetbrains.mps.logging.refactoring.RequiredAdditionalArgumentReference" id="1191408536328">
                          <link role="argument" targetNodeId="1191408536240" resolveInfo="newNode" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1191408536329">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Concept_IsAssignableFromOperation" id="1191408536330">
                      <node role="sconceptExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1191408536331">
                        <link role="variableDeclaration" targetNodeId="1191408536261" resolveInfo="concept" />
                      </node>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1191408536332">
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1191408536333">
                        <link role="link" targetNodeId="6.1071599976176" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1191408536334">
                        <link role="variableDeclaration" targetNodeId="1191408536350" resolveInfo="linkDeclaration" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="iterable" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1191408536335">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1191408536336">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1191408536337">
                    <link role="link" targetNodeId="6.1071489727083" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1191408536338">
                    <link role="variableDeclaration" targetNodeId="1191408536294" resolveInfo="placeConcept" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.WhereOperation" id="1191408536339">
                  <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.WhereBlock" id="1191408536340">
                    <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.DefaultInputElement" id="1191408536341">
                      <property name="name" value="it" />
                    </node>
                    <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1191408536342">
                      <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1191408536343">
                        <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1191408536344">
                          <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Property_HasValue_Enum" id="1191408536345">
                            <node role="value" type="jetbrains.mps.bootstrap.smodelLanguage.EnumMemberReference" id="1191408536346">
                              <link role="enumMember" targetNodeId="6.1084199179705" />
                            </node>
                          </node>
                          <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1191408536347">
                            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1191408536348">
                              <link role="property" targetNodeId="6.1071599937831" />
                            </node>
                            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ClosureParameterReference" id="1191408536349">
                              <link role="closureParameter" targetNodeId="1191408536341" resolveInfo="it" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1191408536350">
                <property name="name" value="linkDeclaration" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1191408536351">
                  <link role="concept" targetNodeId="6.1071489288298" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1191408536352">
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassifierType" id="1191408536353">
              <link role="classifier" extResolveInfo="5.[Classifier]SNode" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.logging.refactoring.RequiredAdditionalArgumentReference" id="1191408536354">
              <link role="argument" targetNodeId="1191408536242" resolveInfo="place" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="isApplicableClause" type="jetbrains.mps.logging.refactoring.IsApplicableClause" id="1191408536355">
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1191408536356">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1191408536357">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1191408536358">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1191408536359" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1191408536360">
              <link role="baseMethodDeclaration" extResolveInfo="2.method ([Classifier]ActionContext).([InstanceMethodDeclaration]getNode())" />
              <node role="instance" type="jetbrains.mps.logging.refactoring.ConceptFunctionParameter_ActionContext" id="1191408536361" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1191408536362">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1191408536363">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1191408536364">
              <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1191408536365">
                <property name="value" value="false" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1191408536366">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1191408536367" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1191408536368">
              <link role="variableDeclaration" targetNodeId="1191408536358" resolveInfo="node" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1191408536369">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1191408536370">
            <property name="name" value="concept" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1191408536371">
              <link role="concept" targetNodeId="6.1169125787135" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1191408536372">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetConceptOperation" id="1191408536373" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1191408536374">
                <link role="variableDeclaration" targetNodeId="1191408536358" resolveInfo="node" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1191408536375">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1191408536376">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1191408536377">
              <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1191408536378">
                <property name="value" value="false" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.NotExpression" id="1191408536379">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1191408536380">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1191408536381">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.RefConcept_Reference" id="1191408536382">
                  <link role="conceptDeclaration" targetNodeId="6.1071489090640" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1191408536383">
                <link role="variableDeclaration" targetNodeId="1191408536370" resolveInfo="concept" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1191408536384">
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1191408536385">
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassifierType" id="1191408536386">
              <link role="classifier" extResolveInfo="5.[Classifier]SModel" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.logging.refactoring.RequiredAdditionalArgumentReference" id="1191408536387">
              <link role="argument" targetNodeId="1191408536242" resolveInfo="place" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1191408536388">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1191408536389">
              <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1191408536390">
                <node role="rValue" type="jetbrains.mps.baseLanguage.CastExpression" id="1191408536391">
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SModelType" id="1191408536392" />
                  <node role="expression" type="jetbrains.mps.logging.refactoring.RequiredAdditionalArgumentReference" id="1191408536393">
                    <link role="argument" targetNodeId="1191408536242" resolveInfo="place" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.logging.refactoring.RequiredAdditionalArgumentReference" id="1191408536394">
                  <link role="argument" targetNodeId="1191408536236" resolveInfo="modelPlace" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1191408536395">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1191408536396">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1191408536397">
                  <link role="property" targetNodeId="6.1096454100552" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1191408536398">
                  <link role="concept" targetNodeId="6.1071489090640" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1191408536399">
                    <link role="variableDeclaration" targetNodeId="1191408536370" resolveInfo="concept" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1191408536400">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1191408536401">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1191408536402">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1191408536403">
                <property name="name" value="placeConcept" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1191408536404">
                  <link role="concept" targetNodeId="6.1071489090640" />
                </node>
                <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1191408536405">
                  <link role="concept" targetNodeId="6.1071489090640" />
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1191408536406">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetConceptOperation" id="1191408536407" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParenthesizedExpression" id="1191408536408">
                      <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1191408536409">
                        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1191408536410" />
                        <node role="expression" type="jetbrains.mps.logging.refactoring.RequiredAdditionalArgumentReference" id="1191408536411">
                          <link role="argument" targetNodeId="1191408536242" resolveInfo="place" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ForeachStatement" id="1191408536412">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1191408536413">
                <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1191408536414">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1191408536415">
                    <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1191408536416">
                      <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1191408536417">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.CastExpression" id="1191408536418">
                          <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1191408536419" />
                          <node role="expression" type="jetbrains.mps.logging.refactoring.RequiredAdditionalArgumentReference" id="1191408536420">
                            <link role="argument" targetNodeId="1191408536242" resolveInfo="place" />
                          </node>
                        </node>
                        <node role="lValue" type="jetbrains.mps.logging.refactoring.RequiredAdditionalArgumentReference" id="1191408536421">
                          <link role="argument" targetNodeId="1191408536234" resolveInfo="nodePlace" />
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1191408536422">
                      <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1191408536423">
                        <property name="value" value="true" />
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1191408536424">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Concept_IsAssignableFromOperation" id="1191408536425">
                      <node role="sconceptExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1191408536426">
                        <link role="variableDeclaration" targetNodeId="1191408536370" resolveInfo="concept" />
                      </node>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1191408536427">
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1191408536428">
                        <link role="link" targetNodeId="6.1071599976176" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1191408536429">
                        <link role="variableDeclaration" targetNodeId="1191408536445" resolveInfo="linkDeclaration" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="iterable" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1191408536430">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1191408536431">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1191408536432">
                    <link role="link" targetNodeId="6.1071489727083" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1191408536433">
                    <link role="variableDeclaration" targetNodeId="1191408536403" resolveInfo="placeConcept" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.WhereOperation" id="1191408536434">
                  <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.WhereBlock" id="1191408536435">
                    <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.DefaultInputElement" id="1191408536436">
                      <property name="name" value="it" />
                    </node>
                    <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1191408536437">
                      <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1191408536438">
                        <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1191408536439">
                          <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Property_HasValue_Enum" id="1191408536440">
                            <node role="value" type="jetbrains.mps.bootstrap.smodelLanguage.EnumMemberReference" id="1191408536441">
                              <link role="enumMember" targetNodeId="6.1084199179705" />
                            </node>
                          </node>
                          <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1191408536442">
                            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1191408536443">
                              <link role="property" targetNodeId="6.1071599937831" />
                            </node>
                            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ClosureParameterReference" id="1191408536444">
                              <link role="closureParameter" targetNodeId="1191408536436" resolveInfo="it" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1191408536445">
                <property name="name" value="linkDeclaration" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1191408536446">
                  <link role="concept" targetNodeId="6.1071489288298" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1191408536447">
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassifierType" id="1191408536448">
              <link role="classifier" extResolveInfo="5.[Classifier]SNode" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.logging.refactoring.RequiredAdditionalArgumentReference" id="1191408536449">
              <link role="argument" targetNodeId="1191408536242" resolveInfo="place" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1191408536450">
          <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1191408536451">
            <property name="value" value="false" />
          </node>
        </node>
      </node>
    </node>
    <node role="updateModelClause" type="jetbrains.mps.logging.refactoring.UpdateModelClause" id="1191408536452">
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1191408536453">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1191408536454">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1191408536455">
            <property name="name" value="nodeId" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1191408536456">
              <link role="classifier" extResolveInfo="4.[Classifier]String" />
            </node>
            <node role="initializer" type="jetbrains.mps.logging.refactoring.GetNodeIdOperation" id="1191408536457">
              <node role="argument" type="jetbrains.mps.logging.refactoring.DowncastOperation" id="1191408536458">
                <node role="argument" type="jetbrains.mps.logging.refactoring.RequiredAdditionalArgumentReference" id="1191408536459">
                  <link role="argument" targetNodeId="1191408536238" resolveInfo="oldNode" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1191408536460">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1191408536461">
            <property name="name" value="modelUID" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1191408536462">
              <link role="classifier" extResolveInfo="4.[Classifier]String" />
            </node>
            <node role="initializer" type="jetbrains.mps.logging.refactoring.GetModelUIDOperation" id="1191408536463">
              <node role="argument" type="jetbrains.mps.logging.refactoring.DowncastOperation" id="1191408536464">
                <node role="argument" type="jetbrains.mps.logging.refactoring.RequiredAdditionalArgumentReference" id="1191408536465">
                  <link role="argument" targetNodeId="1191408536238" resolveInfo="oldNode" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ForeachStatement" id="1191408536466">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1191408536467">
            <node role="statement" type="jetbrains.mps.baseLanguage.ForeachStatement" id="1191408536468">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1191408536469">
                <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1191408536470">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1191408536471">
                    <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1191408536472">
                      <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1191408536473">
                        <link role="baseMethodDeclaration" extResolveInfo="5.method ([Classifier]SReference).([InstanceMethodDeclaration]setTargetModelUID((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SModelUID])))" />
                        <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1191408536474">
                          <link role="variableDeclaration" targetNodeId="1191408536495" resolveInfo="reference" />
                        </node>
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1191408536475">
                          <link role="baseMethodDeclaration" extResolveInfo="5.static method ([Classifier]SModelUID).([StaticMethodDeclaration]fromString((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String])))" />
                          <link role="classConcept" extResolveInfo="5.[Classifier]SModelUID" />
                          <node role="actualArgument" type="jetbrains.mps.logging.refactoring.GetModelUIDOperation" id="1191408536476">
                            <node role="argument" type="jetbrains.mps.logging.refactoring.DowncastOperation" id="1191408536477">
                              <node role="argument" type="jetbrains.mps.logging.refactoring.RequiredAdditionalArgumentReference" id="1191408536478">
                                <link role="argument" targetNodeId="1191408536240" resolveInfo="newNode" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1191408536479">
                      <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1191408536480">
                        <link role="baseMethodDeclaration" extResolveInfo="5.method ([Classifier]SReference).([InstanceMethodDeclaration]setTargetNodeId((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String])))" />
                        <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1191408536481">
                          <link role="variableDeclaration" targetNodeId="1191408536495" resolveInfo="reference" />
                        </node>
                        <node role="actualArgument" type="jetbrains.mps.logging.refactoring.GetNodeIdOperation" id="1191408536482">
                          <node role="argument" type="jetbrains.mps.logging.refactoring.DowncastOperation" id="1191408536483">
                            <node role="argument" type="jetbrains.mps.logging.refactoring.RequiredAdditionalArgumentReference" id="1191408536484">
                              <link role="argument" targetNodeId="1191408536240" resolveInfo="newNode" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.AndExpression" id="1191408536485">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1191408536486">
                      <link role="baseMethodDeclaration" extResolveInfo="4.method ([Classifier]String).([InstanceMethodDeclaration]equals((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Object])))" />
                      <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1191408536487">
                        <link role="variableDeclaration" targetNodeId="1191408536455" resolveInfo="nodeId" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1191408536488">
                        <link role="baseMethodDeclaration" extResolveInfo="5.method ([Classifier]SReference).([InstanceMethodDeclaration]getTargetNodeId())" />
                        <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1191408536489">
                          <link role="variableDeclaration" targetNodeId="1191408536495" resolveInfo="reference" />
                        </node>
                      </node>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1191408536490">
                      <link role="baseMethodDeclaration" extResolveInfo="4.method ([Classifier]String).([InstanceMethodDeclaration]equals((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Object])))" />
                      <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1191408536491">
                        <link role="variableDeclaration" targetNodeId="1191408536461" resolveInfo="modelUID" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1191408536492">
                        <link role="baseMethodDeclaration" extResolveInfo="5.method ([Classifier]SModelUID).([InstanceMethodDeclaration]toString())" />
                        <node role="instance" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1191408536493">
                          <link role="baseMethodDeclaration" extResolveInfo="5.method ([Classifier]SReference).([InstanceMethodDeclaration]getTargetModelUID())" />
                          <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1191408536494">
                            <link role="variableDeclaration" targetNodeId="1191408536495" resolveInfo="reference" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1191408536495">
                <property name="name" value="reference" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1191408536496">
                  <link role="classifier" extResolveInfo="5.[Classifier]SReference" />
                </node>
              </node>
              <node role="iterable" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1191408536497">
                <link role="baseMethodDeclaration" extResolveInfo="5.method ([Classifier]SNode).([InstanceMethodDeclaration]getReferences())" />
                <node role="instance" type="jetbrains.mps.bootstrap.smodelLanguage.SemanticDowncastExpression" id="1191408536498">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1191408536499">
                    <link role="variableDeclaration" targetNodeId="1191408536503" resolveInfo="node" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1191408536500">
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Model_NodesOperation" id="1191408536501" />
            <node role="leftExpression" type="jetbrains.mps.logging.refactoring.ConceptFunctionParameter_SModel" id="1191408536502" />
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1191408536503">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1191408536504" />
          </node>
        </node>
      </node>
    </node>
  </node>
</model>


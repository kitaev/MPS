<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:00000000-0000-4000-0000-011c89590305(jetbrains.mps.bootstrap.constraintsLanguage.actions)">
  <persistence version="3" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <language namespace="jetbrains.mps.bootstrap.sharedConcepts" />
  <language namespace="jetbrains.mps.bootstrap.actionsLanguage" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902fb(jetbrains.mps.bootstrap.smodelLanguage.constraints)" version="21" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.bootstrap.smodelLanguage.structure)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ba(jetbrains.mps.bootstrap.sharedConcepts.constraints)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902a4(jetbrains.mps.bootstrap.actionsLanguage.constraints)" version="16" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902a8(jetbrains.mps.bootstrap.actionsLanguage.structure)" version="22" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590328(jetbrains.mps.baseLanguage.ext.collections.lang.constraints)" version="6" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.ext.collections.lang.structure)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959030d(jetbrains.mps.bootstrap.constraintsLanguage.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.closures.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959028c(jetbrains.mps.bootstrap.structureLanguage.constraints)" version="11" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590307(jetbrains.mps.bootstrap.constraintsLanguage.constraints)" version="9" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590334(jetbrains.mps.closures.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590283(jetbrains.mps.core.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895903e4(jetbrains.mps.internal.collections.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902db(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <maxImportIndex value="8" />
  <import index="1" modelUID="r:00000000-0000-4000-0000-011c8959030d(jetbrains.mps.bootstrap.constraintsLanguage.structure)" version="0" />
  <import index="2" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="0" />
  <import index="4" modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.bootstrap.smodelLanguage.structure)" version="1" />
  <import index="6" modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.bootstrap.structureLanguage.structure)" version="-1" />
  <import index="8" modelUID="r:00000000-0000-4000-0000-011c8959028b(jetbrains.mps.bootstrap.structureLanguage.behavior)" version="-1" />
  <node type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstituteActions" id="1177671801449">
    <property name="name" value="thisExpression" />
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstituteActionsBuilder" id="1177671806653">
      <link role="applicableConcept" targetNodeId="2.1068431790191" />
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.structure.RemovePart" id="1177673390932">
        <link role="conceptToRemove" targetNodeId="2.1070475354124" />
      </node>
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.structure.RemovePart" id="1193401210854">
        <link role="conceptToRemove" targetNodeId="2.1073063089578" resolveInfo="SuperMethodCall" />
      </node>
      <node role="precondition" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstitutePreconditionFunction" id="1177671835252">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1177671835253">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1206018113266">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206018113267">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1206018122284">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1206018125333">
                  <property name="value" value="false" />
                </node>
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1206018121167">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206018121168">
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1206018121169">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1206018121170">
                    <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1208198540238">
                      <link role="conceptDeclaration" targetNodeId="1.1177670533743" resolveInfo="ConceptBehavior" />
                    </node>
                  </node>
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Inclusion" id="1206018121171" />
                </node>
                <node role="operand" type="jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptFunctionParameter_parentNode" id="1206018121172" />
              </node>
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1206018121173" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1206018126913">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206018126914">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1206018146479">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1206018156522">
                  <property name="value" value="false" />
                </node>
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1206018152169">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206018152170">
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1206018152171">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_ConceptList" id="1206018152172">
                    <node role="concept" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ConceptReference" id="1206018152173">
                      <link role="concept" targetNodeId="1.1177673300966" resolveInfo="ConceptMethodDeclaration" />
                    </node>
                    <node role="concept" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ConceptReference" id="1206018152174">
                      <link role="concept" targetNodeId="1.1177671617671" resolveInfo="ConceptConstructorDeclaration" />
                    </node>
                  </node>
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Inclusion" id="1206018152175" />
                </node>
                <node role="operand" type="jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptFunctionParameter_parentNode" id="1206018152176" />
              </node>
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1206018152177" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1177671843145">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1206018158664">
              <property name="value" value="true" />
            </node>
          </node>
        </node>
      </node>
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptSubstitutePart" id="1180137890394">
        <link role="concept" targetNodeId="1.1177671741405" />
      </node>
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptSubstitutePart" id="1193401055012">
        <link role="concept" targetNodeId="1.1193400262258" resolveInfo="SuperNodeExpression" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeFactories" id="1178097098932">
    <property name="name" value="ConceptMethod" />
    <node role="nodeFactory" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeFactory" id="1178097109793">
      <link role="applicableConcept" targetNodeId="1.1177673300966" />
      <node role="setupFunction" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSetupFunction" id="1178097118968">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178097118969">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1178097391681">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1178097391682">
              <property name="name" value="behaviour" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1178097391683">
                <link role="concept" targetNodeId="1.1177670533743" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1178097404929">
                <link role="concept" targetNodeId="1.1177670533743" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227837553">
                  <node role="operand" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSetupFunction_EnclosingNode" id="1178097399032" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetContainingRootOperation" id="1178097402864" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219836175906">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219836178470">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219836176190">
                <node role="operand" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSetupFunction_NewNode" id="1219836175907" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1219836178141">
                  <link role="link" targetNodeId="2.1178549979242" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation" id="1219836179754">
                <link role="concept" targetNodeId="2.1146644602865" resolveInfo="PublicVisibility" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1178097416603">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1178097462721">
              <node role="rightExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ConceptRefExpression" id="1178097466177">
                <link role="conceptDeclaration" targetNodeId="6.1169125787135" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227898531">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227900508">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1178097417575">
                    <link role="variableDeclaration" targetNodeId="1178097391682" resolveInfo="behaviour" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1178097432689">
                    <link role="link" targetNodeId="1.1177670543683" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetConceptOperation" id="1178097461608" />
              </node>
            </node>
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178097416605">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1178097524445">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227845205">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227935775">
                    <node role="operand" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSetupFunction_NewNode" id="1178097524446" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1178097528886">
                      <link role="property" targetNodeId="1.1177758833703" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1178097531810">
                    <node role="value" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1178097532765">
                      <property name="value" value="true" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1178097535330">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227917407">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227909348">
                    <node role="operand" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSetupFunction_NewNode" id="1178097535331" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1178097540693">
                      <link role="property" targetNodeId="1.1177676055874" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1178097542945">
                    <node role="value" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1178097543775">
                      <property name="value" value="true" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="nodeFactory" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeFactory" id="1220271011060">
      <link role="applicableConcept" targetNodeId="1.1206017324045" resolveInfo="StaticConceptMethodDeclaration" />
      <node role="setupFunction" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSetupFunction" id="1220271011061">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220271011062">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220271016095">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220271019237">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220271016503">
                <node role="operand" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSetupFunction_NewNode" id="1220271016096" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1220271018923">
                  <link role="link" targetNodeId="2.1178549979242" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation" id="1220271020599">
                <link role="concept" targetNodeId="2.1146644602865" resolveInfo="PublicVisibility" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstituteActions" id="1201274337701">
    <property name="name" value="ConceptMethodsWithoutThis" />
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstituteActionsBuilder" id="1201274347360">
      <link role="applicableConcept" targetNodeId="2.1068431790191" resolveInfo="Expression" />
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.structure.AddMenuPart" id="1201274391813">
        <link role="concept" targetNodeId="2.1197027756228" resolveInfo="DotExpression" />
        <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.structure.ParameterizedSubstituteMenuPart" id="1201274408288">
          <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201274511769">
            <link role="concept" targetNodeId="1.1177673300966" resolveInfo="ConceptMethodDeclaration" />
          </node>
          <node role="query" type="jetbrains.mps.bootstrap.actionsLanguage.structure.QueryFunction_ParameterizedSubstitute_Query" id="1201274408290">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201274408291">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201274415358">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201274415359">
                  <property name="name" value="behavior" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201274415360">
                    <link role="concept" targetNodeId="1.1177670533743" resolveInfo="ConceptBehavior" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227886578">
                    <node role="operand" type="jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptFunctionParameter_parentNode" id="1201274426321" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1201274426318">
                      <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Inclusion" id="1201274426319" />
                      <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1201274426320">
                        <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1208198540236">
                          <link role="conceptDeclaration" targetNodeId="1.1177670533743" resolveInfo="ConceptBehavior" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1201274428402">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227912493">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227882147">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201274429811">
                      <link role="variableDeclaration" targetNodeId="1201274415359" resolveInfo="behavior" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1201274435675">
                      <link role="link" targetNodeId="1.1177670543683" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1201274438696">
                    <link role="conceptMethodDeclaration" targetNodeId="8.1213877394200" resolveInfo="getAvailableConceptMethods" />
                    <node role="actualArgument" type="jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptFunctionParameter_parentNode" id="1201274441370" />
                    <node role="actualArgument" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_scope" id="1201274491840" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="handler" type="jetbrains.mps.bootstrap.actionsLanguage.structure.QueryFunction_ParameterizedSubstitute_Handler" id="1201274408292">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201274408293">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201274603292">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201274603293">
                  <property name="name" value="expr" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201274603294">
                    <link role="concept" targetNodeId="2.1197027756228" resolveInfo="DotExpression" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1201274606140">
                    <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1201274606141">
                      <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201274606142">
                        <link role="concept" targetNodeId="2.1197027756228" resolveInfo="DotExpression" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201274607942">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227923226">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227928992">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201274607943">
                      <link role="variableDeclaration" targetNodeId="1201274603293" resolveInfo="expr" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1208198853490">
                      <link role="link" targetNodeId="2.1197027771414" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation" id="1201274612780">
                    <link role="concept" targetNodeId="1.1177671741405" resolveInfo="ThisNodeExpression" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1201274646765">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1201274646766">
                  <property name="name" value="call" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201274646767">
                    <link role="concept" targetNodeId="4.1179409122411" resolveInfo="Node_ConceptMethodCall" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1201274650082">
                    <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1201274650083">
                      <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1201274650084">
                        <link role="concept" targetNodeId="4.1179409122411" resolveInfo="Node_ConceptMethodCall" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201274651633">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227846079">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227918907">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201274651634">
                      <link role="variableDeclaration" targetNodeId="1201274646766" resolveInfo="call" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1201274671518">
                      <link role="link" targetNodeId="4.1179409206125" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1201274673132">
                    <node role="parameter" type="jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptFunctionParameter_parameterObject" id="1201274676885" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201274618752">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227821177">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227841420">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201274618753">
                      <link role="variableDeclaration" targetNodeId="1201274603293" resolveInfo="expr" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1208198878147">
                      <link role="link" targetNodeId="2.1197027833540" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1201274694034">
                    <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201274694818">
                      <link role="variableDeclaration" targetNodeId="1201274646766" resolveInfo="call" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1201274697023">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1201274700026">
                  <link role="variableDeclaration" targetNodeId="1201274603293" resolveInfo="expr" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="precondition" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstitutePreconditionFunction" id="1201274358891">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1201274358892">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1201274363197">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1201274381008">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1201274382011" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227917740">
                <node role="operand" type="jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptFunctionParameter_parentNode" id="1201274363198" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1201274365000">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Inclusion" id="1201274366204" />
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_ConceptList" id="1201274771462">
                    <node role="concept" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ConceptReference" id="1201274774027">
                      <link role="concept" targetNodeId="1.1177673300966" resolveInfo="ConceptMethodDeclaration" />
                    </node>
                    <node role="concept" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ConceptReference" id="1201274776499">
                      <link role="concept" targetNodeId="1.1177671617671" resolveInfo="ConceptConstructorDeclaration" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>


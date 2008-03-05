<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.baseLanguage.ext.collections.lang.intentions">
  <persistence version="1" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.bootstrap.intentionsLanguage" />
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.helgins" />
  <language namespace="jetbrains.mps.bootstrap.editorLanguage" />
  <language namespace="jetbrains.mps.bootstrap.sharedConcepts" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.constraintsLanguage.structure" version="1" />
  <maxImportIndex value="3" />
  <import index="1" modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="0" />
  <import index="2" modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  <import index="3" modelUID="jetbrains.mps.core.structure" version="-1" />
  <node type="jetbrains.mps.bootstrap.intentionsLanguage.structure.IntentionDeclaration" id="1193396656620">
    <property name="name" value="ConvertForEachStatementToForeachStatement" />
    <property name="isErrorIntention" value="false" />
    <link role="forConcept" targetNodeId="1.1153943597977" resolveInfo="ForEachStatement" />
    <node role="descriptionFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.DescriptionBlock" id="1193396656621">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1193396656622">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1193396722872">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1193396722873">
            <property name="value" value="Convert to \&quot;for (Type var: iterable)\&quot;" />
          </node>
        </node>
      </node>
    </node>
    <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.IsApplicableBlock" id="1193396656623">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1193396656624">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1193396714705">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1193396714706">
            <property name="value" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node role="executeFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ExecuteBlock" id="1193396656625">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1193396656626">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1193397150804">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1193397150805">
            <property name="name" value="oldVariable" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1193397150806">
              <link role="concept" targetNodeId="1.1153944193378" resolveInfo="ForEachVariable" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227890925">
              <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1193397135677" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1193397138878">
                <link role="link" targetNodeId="1.1153944400369" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1193397770167">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1193397770168">
            <property name="name" value="variableType" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1193397770169">
              <link role="concept" targetNodeId="2.1068431790189" resolveInfo="Type" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1193397489122">
              <link role="concept" targetNodeId="2.1068431790189" resolveInfo="Type" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227838599">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227897005">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193397473825">
                    <link role="variableDeclaration" targetNodeId="1193397150805" resolveInfo="oldVariable" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.helgins.structure.Node_TypeOperation" id="1193397483317" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1193397485814" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1193396802064">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1193396802065">
            <property name="name" value="foreachStatement" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1193396802067">
              <link role="concept" targetNodeId="2.1144226303539" resolveInfo="ForeachStatement" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227901832">
              <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1193396827706" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ReplaceWithNewOperation" id="1193396832516">
                <link role="concept" targetNodeId="2.1144226303539" resolveInfo="ForeachStatement" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1193396845408">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227893614">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227842352">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193396845409">
                <link role="variableDeclaration" targetNodeId="1193396802065" resolveInfo="foreachStatement" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1193396857881">
                <link role="link" targetNodeId="2.1154032183016" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1193396861585">
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227845260">
                <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1193396867840" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1193396869466">
                  <link role="link" targetNodeId="2.1154032183016" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1193396886785">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227933754">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227915915">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193396886786">
                <link role="variableDeclaration" targetNodeId="1193396802065" resolveInfo="foreachStatement" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1193396916433">
                <link role="link" targetNodeId="2.1144226360166" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1193396918279">
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227852965">
                <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1193396919536" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1193396946723">
                  <link role="link" targetNodeId="1.1153944424730" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1199470907548">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227912457">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227915523">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1199470907549">
                <link role="variableDeclaration" targetNodeId="1193396802065" resolveInfo="foreachStatement" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1199470909529">
                <link role="property" targetNodeId="2.1199465379613" resolveInfo="label" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1199470913518">
              <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227897076">
                <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1199470915367" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1199470917437">
                  <link role="property" targetNodeId="2.1199465379613" resolveInfo="label" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1193397029396">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1193397029397">
            <property name="name" value="newVariable" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1193397029398">
              <link role="concept" targetNodeId="2.1068581242863" resolveInfo="LocalVariableDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227867767">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227931525">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193396951868">
                  <link role="variableDeclaration" targetNodeId="1193396802065" resolveInfo="foreachStatement" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1193396984449">
                  <link role="link" targetNodeId="2.1144230900587" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation" id="1193397020706" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1193397449135">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227879343">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227935908">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193397449136">
                <link role="variableDeclaration" targetNodeId="1193397029397" resolveInfo="newVariable" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1193397450879">
                <link role="property" targetNodeId="2.1083152972671" resolveInfo="name" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1193397458735">
              <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227925892">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193397461144">
                  <link role="variableDeclaration" targetNodeId="1193397150805" resolveInfo="oldVariable" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1193397462978">
                  <link role="property" targetNodeId="3.1169194664001" resolveInfo="name" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1193397466192">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227865966">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227899609">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193397466193">
                <link role="variableDeclaration" targetNodeId="1193397029397" resolveInfo="newVariable" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1193397467970">
                <link role="link" targetNodeId="2.1068431790188" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1193397470227">
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193397770170">
                <link role="variableDeclaration" targetNodeId="1193397770168" resolveInfo="type" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1193397276523">
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1193397276524">
            <property name="name" value="oldRef" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1193397276526">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1193397293765">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227881541">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227883503">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227886921">
                    <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1193397293766">
                      <link role="variable" targetNodeId="1193397276524" resolveInfo="oldRef" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ReplaceWithNewOperation" id="1193397296166">
                      <link role="concept" targetNodeId="2.1068581242866" resolveInfo="LocalVariableReference" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1193397312802">
                    <link role="link" targetNodeId="2.1070568296581" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1193397315664">
                  <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193397321490">
                    <link role="variableDeclaration" targetNodeId="1193397029397" resolveInfo="newVariable" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1193397282089">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227919527">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227884353">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193397282095">
                  <link role="variableDeclaration" targetNodeId="1193396802065" resolveInfo="foreachStatement" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1193397282094">
                  <link role="link" targetNodeId="2.1154032183016" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetDescendantsOperation" id="1193397282091">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1193397282092">
                  <link role="concept" targetNodeId="1.1153944233411" resolveInfo="ForEachVariableReference" />
                </node>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereOperation" id="1193397282096">
              <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereBlock" id="1193397282097">
                <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.DefaultInputElement" id="1193397282098">
                  <property name="name" value="it" />
                </node>
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1193397282099">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1193397282100">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1193397282101">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1193397282102">
                        <link role="variableDeclaration" targetNodeId="1193397150805" resolveInfo="oldVariable" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227942744">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1193397282105">
                          <link role="closureParameter" targetNodeId="1193397282098" resolveInfo="it" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1193397282104">
                          <link role="link" targetNodeId="1.1153944258490" />
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
    </node>
  </node>
  <visible index="2" modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.constraints" />
  <node type="jetbrains.mps.bootstrap.intentionsLanguage.structure.IntentionDeclaration" id="1204741875292">
    <property name="name" value="ConvertToForeachStatement" />
    <link role="forConcept" targetNodeId="1.1153513495343" resolveInfo="ForEachOperation" />
    <node role="descriptionFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.DescriptionBlock" id="1204741875293">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204741875294">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204741895869">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1204741895870">
            <property name="value" value="convert to \&quot;foreach &lt;e&gt; in &lt;sequence&gt;\&quot; statement" />
          </node>
        </node>
      </node>
    </node>
    <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.IsApplicableBlock" id="1204741875295">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204741875296">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204741915764">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204741953868">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204742096631">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204741948292">
                <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1204741947471" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1204741951562" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1204742098295" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1204741955778">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1204741957193">
                <link role="conceptDeclaration" targetNodeId="2.1068580123155" resolveInfo="ExpressionStatement" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="executeFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ExecuteBlock" id="1204741875297">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204741875298">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204742022647">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204742022648">
            <property name="name" value="forEachStatement" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1204742022649">
              <link role="concept" targetNodeId="1.1153943597977" resolveInfo="ForEachStatement" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204742022650">
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_InsertNewNextSiblingOperation" id="1204742054022">
                <link role="concept" targetNodeId="1.1153943597977" resolveInfo="ForEachStatement" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204742102334">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204742022652">
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1204742022653" />
                  <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1204742022654" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1204742103981" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204742067851">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204742082140">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204742068405">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204742067852">
                <link role="variableDeclaration" targetNodeId="1204742022648" resolveInfo="forEachStatement" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1204742081103">
                <link role="link" targetNodeId="1.1153944424730" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1204742085513">
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204742088551">
                <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1204742087725" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1204742110533">
                  <link role="conceptMethodDeclaration" targetNodeId="2v.1197471523275" resolveInfo="getLeft" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204742373258">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204742373259">
            <property name="name" value="oldIt" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1204742373260">
              <link role="concept" targetNodeId="1.1153248196026" resolveInfo="DefaultInputElement" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204742373261">
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1204742373262">
                <link role="link" targetNodeId="1.1153511990989" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204742373263">
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1204742373264">
                  <link role="link" targetNodeId="1.1153513533813" />
                </node>
                <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1204742373265" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204742156284">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204742219487">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204742217192">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204742156977">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204742156285">
                  <link role="variableDeclaration" targetNodeId="1204742022648" resolveInfo="forEachStatement" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1204742207476">
                  <link role="link" targetNodeId="1.1153944400369" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1204742218628">
                <link role="property" targetNodeId="3.1169194664001" resolveInfo="name" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1204742221812">
              <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204742289496">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204742373266">
                  <link role="variableDeclaration" targetNodeId="1204742373259" resolveInfo="it" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1204742290975">
                  <link role="property" targetNodeId="3.1169194664001" resolveInfo="name" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204742559934">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204742566241">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204742560875">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204742559935">
                <link role="variableDeclaration" targetNodeId="1204742022648" resolveInfo="forEachStatement" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1204742563135">
                <link role="link" targetNodeId="2.1154032183016" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1204742575947">
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204742610315">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204742579941">
                  <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1204742578799" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1204742584704">
                    <link role="link" targetNodeId="1.1153513533813" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1204742614636">
                  <link role="link" targetNodeId="2.1137022507850" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1204742443165">
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1204742443166">
            <property name="name" value="oldRef" />
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1204742450085">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.Expression" id="1204742450086" />
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204742450087">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204742450088">
                <link role="variableDeclaration" targetNodeId="1204742022648" resolveInfo="forEachStatement" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetDescendantsOperation" id="1204742450089">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1204742450090">
                  <link role="concept" targetNodeId="2.1153179560115" resolveInfo="ClosureParameterReference" />
                </node>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereOperation" id="1204742450091">
              <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereBlock" id="1204742450092">
                <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.DefaultInputElement" id="1204742450093">
                  <property name="name" value="it" />
                </node>
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204742450094">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204742463705">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1204742469922">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204742475290">
                        <link role="variableDeclaration" targetNodeId="1204742373259" resolveInfo="oldIt" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204742466113">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1204742463706">
                          <link role="closureParameter" targetNodeId="1204742450093" resolveInfo="it" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1204742468573">
                          <link role="link" targetNodeId="2.1153179615652" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204742443168">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204742492058">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204742528349">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204742520794">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204742492907">
                    <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1204742492059">
                      <link role="variable" targetNodeId="1204742443166" resolveInfo="oldRef" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ReplaceWithNewOperation" id="1204742494701">
                      <link role="concept" targetNodeId="1.1153944233411" resolveInfo="ForEachVariableReference" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1204742527385">
                    <link role="link" targetNodeId="1.1153944258490" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1204742535593">
                  <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204742539091">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204742538267">
                      <link role="variableDeclaration" targetNodeId="1204742022648" resolveInfo="forEachStatement" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1204742542622">
                      <link role="link" targetNodeId="1.1153944400369" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204742347535">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204742355771">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204742350341">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204742348233">
                <node role="operand" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1204742347536" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1204742349448" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1204742354613" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_DeleteOperation" id="1204742357759" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204742295341">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204742296331">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204742295342">
              <link role="variableDeclaration" targetNodeId="1204742022648" resolveInfo="forEachStatement" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.editorLanguage.structure.SelectLaterOperation" id="1204742309918">
              <node role="editorContext" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_editorContext" id="1204742318024" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>


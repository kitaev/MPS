<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.bootstrap.helgins.plugin">
  <persistence version="1"/>
  <refactoringHistory/>
  <language namespace="jetbrains.mps.bootstrap.pluginLanguage"/>
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="1"/>
  </language>
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="0"/>
  </language>
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="0"/>
  </language>
  <language namespace="jetbrains.mps.baseLanguage.classifiers"/>
  <maxImportIndex value="26"/>
  <import index="1" modelUID="jetbrains.mps.bootstrap.helgins.structure" version="-1"/>
  <import index="2" modelUID="jetbrains.mps.helgins.uiActions@java_stub" version="-1"/>
  <import index="3" modelUID="jetbrains.mps.ide.actions.nodes@java_stub" version="-1"/>
  <import index="4" modelUID="jetbrains.mps.ide.actions" version="-1"/>
  <import index="5" modelUID="jetbrains.mps.ide.action@java_stub" version="-1"/>
  <import index="6" modelUID="jetbrains.mps.bootstrap.helgins.dependencies@java_stub" version="-1"/>
  <import index="7" modelUID="java.util@java_stub" version="-1"/>
  <import index="8" modelUID="jetbrains.mps.smodel@java_stub" version="-1"/>
  <import index="9" modelUID="jetbrains.mps.util@java_stub" version="-1"/>
  <import index="10" modelUID="jetbrains.mps.nodeEditor@java_stub" version="-1"/>
  <import index="11" modelUID="java.awt.color@java_stub" version="-1"/>
  <import index="12" modelUID="java.awt@java_stub" version="-1"/>
  <import index="13" modelUID="jetbrains.mps.ide@java_stub" version="-1"/>
  <import index="14" modelUID="jetbrains.mps.project@java_stub" version="-1"/>
  <import index="15" modelUID="jetbrains.mps.ide.hierarchy@java_stub" version="-1"/>
  <import index="16" modelUID="jetbrains.mps.ide.toolsPane@java_stub" version="-1"/>
  <import index="17" modelUID="jetbrains.mps.plugins@java_stub" version="-1"/>
  <import index="18" modelUID="jetbrains.mpslite@java_stub" version="-1"/>
  <import index="19" modelUID="jetbrains.mps.baseLanguage.plugin" version="-1"/>
  <import index="20" modelUID="javax.swing@java_stub" version="-1"/>
  <import index="21" modelUID="jetbrains.mps.helgins.inference@java_stub" version="-1"/>
  <import index="22" modelUID="java.lang@java_stub" version="-1"/>
  <import index="23" modelUID="jetbrains.mps.ide.navigation@java_stub" version="-1"/>
  <import index="24" modelUID="jetbrains.mps.logging@java_stub" version="-1"/>
  <import index="25" modelUID="jetbrains.mps.helgins.integration@java_stub" version="-1"/>
  <import index="26" modelUID="jetbrains.mps.smodel.event@java_stub" version="-1"/>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionGroupDeclaration" id="1205244087094">
    <property name="name" value="TypesystemActions"/>
    <property name="caption" value="Type System"/>
    <node role="reference" type="jetbrains.mps.bootstrap.pluginLanguage.structure.JavaAction" id="1205244660047">
      <link role="javaClass" targetNodeId="3.~ShowNodeTypeAction" resolveInfo="ShowNodeTypeAction"/>
    </node>
    <node role="reference" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionReference" id="1206108013514">
      <link role="action" targetNodeId="1206101816406" resolveInfo="GoToTypeErrorRule"/>
    </node>
    <node role="reference" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionReference" id="1206185060411">
      <link role="action" targetNodeId="1206184013394" resolveInfo="ShowRulesWhichAffectNodeType"/>
    </node>
    <node role="reference" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionReference" id="1206101742154">
      <link role="action" targetNodeId="1206101064404" resolveInfo="GoToNodeThisDependsOn"/>
    </node>
    <node role="reference" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionReference" id="1205606669810">
      <link role="action" targetNodeId="1205606256131" resolveInfo="ShowSupertypes"/>
    </node>
    <node role="modifier" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ModificationStatement"
          id="1205245247513">
      <property name="additionType" value="false"/>
      <link role="modifiedGroup" targetNodeId="4.1204991231476" resolveInfo="EditorPopup"/>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionGroupDeclaration" id="1205244470519">
    <property name="name" value="HelginsNodeActions"/>
    <node role="modifier" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ModificationStatement"
          id="1205245180119">
      <link role="modifiedGroup" targetNodeId="4.1204991215587" resolveInfo="ProjectPaneNodeActions"/>
    </node>
    <node role="reference" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionReference" id="1206107912144">
      <link role="action" targetNodeId="1206101816406" resolveInfo="GoToTypeErrorRule"/>
    </node>
    <node role="reference" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionReference" id="1205606649807">
      <link role="action" targetNodeId="1205605492950" resolveInfo="HighlightDependentLeaves"/>
    </node>
    <node role="reference" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionReference" id="1206101735997">
      <link role="action" targetNodeId="1206101064404" resolveInfo="GoToNodeThisDependsOn"/>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionGroupDeclaration" id="1205245331359">
    <property name="name" value="HelginsEditorPopupInternal"/>
    <node role="reference" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionReference" id="1205606657683">
      <link role="action" targetNodeId="1205605492950" resolveInfo="HighlightDependentLeaves"/>
    </node>
    <node role="modifier" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ModificationStatement"
          id="1205245368690">
      <link role="modifiedGroup" targetNodeId="4.1204991231476" resolveInfo="EditorPopup"/>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDeclaration" id="1205605492950">
    <property name="name" value="HighlightDependentLeaves"/>
    <property name="caption" value="Highlight Dependent Leaves"/>
    <property name="package" value="Actions"/>
    <link role="extendedAction" targetNodeId="17.~CurrentProjectMPSAction" resolveInfo="CurrentProjectMPSAction"/>
    <node role="executeFunction" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ExecuteBlock"
          id="1205605492953">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205605492954">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1205605688760">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1205605688761">
            <property name="name" value="dependenciesCollector"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205605688762">
              <link role="classifier" targetNodeId="6.~DependenciesCollector" resolveInfo="DependenciesCollector"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1205605696483">
              <link role="baseMethodDeclaration" targetNodeId="6.~DependenciesCollector.&lt;init&gt;()"
                    resolveInfo="DependenciesCollector"/>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1205605714892">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1205605714893">
            <property name="name" value="leaves"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205605714894">
              <link role="classifier" targetNodeId="7.~HashSet" resolveInfo="HashSet"/>
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205605762663">
                <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode"/>
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1205605771400">
              <link role="baseMethodDeclaration" targetNodeId="7.~HashSet.&lt;init&gt;()" resolveInfo="HashSet"/>
              <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205605771401">
                <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode"/>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205605775325">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205605776983">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205605775326">
              <link role="variableDeclaration" targetNodeId="1205605688761" resolveInfo="dependenciesCollector"/>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                  id="1205605778032">
              <link role="baseMethodDeclaration"
                    targetNodeId="6.~DependenciesCollector.collectDependencies(jetbrains.mps.smodel.SNode,java.util.Map,java.util.Set):void"
                    resolveInfo="collectDependencies"/>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205870938914">
                <node role="operation"
                      type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetContainingRootOperation"
                      id="1205870940603"/>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206094523674">
                  <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                        id="1206094522548"/>
                  <node role="operation"
                        type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation"
                        id="1206094524504">
                    <link role="member" targetNodeId="1205870649330" resolveInfo="node"/>
                  </node>
                </node>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1205605811886">
                <link role="baseMethodDeclaration" targetNodeId="7.~HashMap.&lt;init&gt;()" resolveInfo="HashMap"/>
                <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType"
                      id="1205605830690">
                  <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode"/>
                </node>
                <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType"
                      id="1205605849599">
                  <link role="classifier" targetNodeId="9.~Pair" resolveInfo="Pair"/>
                  <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205605853258">
                    <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode"/>
                  </node>
                  <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205605856416">
                    <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode"/>
                  </node>
                </node>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                    id="1205605864981">
                <link role="variableDeclaration" targetNodeId="1205605714893" resolveInfo="leaves"/>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1205605929641">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1205605929642">
            <property name="name" value="editor"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205605929643">
              <link role="classifier" targetNodeId="10.~AbstractEditorComponent" resolveInfo="AbstractEditorComponent"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205605939725">
              <node role="operand"
                    type="jetbrains.mps.bootstrap.pluginLanguage.structure.ConceptFunctionParameter_ActionContext"
                    id="1205605938646"/>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                    id="1205606017440">
                <link role="baseMethodDeclaration" targetNodeId="5.~ActionContext.get(java.lang.Class):java.lang.Object"
                      resolveInfo="get"/>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression"
                      id="1205606083271">
                  <link role="classifier" targetNodeId="10.~AbstractEditorComponent"
                        resolveInfo="AbstractEditorComponent"/>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement"
              id="1205606089742">
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable"
                id="1205606089743">
            <property name="name" value="leaf"/>
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                id="1205606093044">
            <link role="variableDeclaration" targetNodeId="1205605714893" resolveInfo="leaves"/>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205606089745">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205606105828">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205606123697">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205606108361">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                        id="1205606105829">
                    <link role="variableDeclaration" targetNodeId="1205605929642" resolveInfo="editor"/>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                        id="1205606123571">
                    <link role="baseMethodDeclaration"
                          targetNodeId="10.~AbstractEditorComponent.getHighlightManager():jetbrains.mps.nodeEditor.NodeHighlightManager"
                          resolveInfo="getHighlightManager"/>
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                      id="1205606133668">
                  <link role="baseMethodDeclaration"
                        targetNodeId="10.~NodeHighlightManager.mark(jetbrains.mps.nodeEditor.DefaultEditorMessage):void"
                        resolveInfo="mark"/>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.NewExpression"
                        id="1205606138497">
                    <link role="baseMethodDeclaration"
                          targetNodeId="10.~NodeHighlightManager$HighlighterMessage.&lt;init&gt;(jetbrains.mps.smodel.SNode,java.awt.Color,java.lang.String,jetbrains.mps.nodeEditor.IEditorMessageOwner,jetbrains.mps.nodeEditor.IEditorComponent)"
                          resolveInfo="NodeHighlightManager.HighlighterMessage"/>
                    <node role="actualArgument"
                          type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference"
                          id="1205606182896">
                      <link role="variable" targetNodeId="1205606089743" resolveInfo="leaf"/>
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference"
                          id="1205606219283">
                      <link role="classifier" targetNodeId="12.~Color" resolveInfo="Color"/>
                      <link role="variableDeclaration" targetNodeId="12.~Color.CYAN" resolveInfo="CYAN"/>
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.NullLiteral"
                          id="1205606228133"/>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression"
                          id="1205606232638">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                            id="1205606231683">
                        <link role="variableDeclaration" targetNodeId="1205605929642" resolveInfo="editor"/>
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                            id="1205606237235">
                        <link role="baseMethodDeclaration"
                              targetNodeId="10.~AbstractEditorComponent.getGutterMessageOwner():jetbrains.mps.nodeEditor.IEditorMessageOwner"
                              resolveInfo="getGutterMessageOwner"/>
                      </node>
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                          id="1205606244441">
                      <link role="variableDeclaration" targetNodeId="1205605929642" resolveInfo="editor"/>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="parameterDeclaration" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterDeclaration"
          id="1205870649330">
      <property name="name" value="node"/>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1205870649331"/>
      <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1205870682131"/>
    </node>
    <node role="updateBlock" type="jetbrains.mps.bootstrap.pluginLanguage.structure.IsApplicableBlock"
          id="1205870702445">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205870702446">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206094507624">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205870708667">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205870708668">
              <node role="operation"
                    type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetContainingRootOperation"
                    id="1205870708670"/>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206094495777">
                <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                      id="1206094494354"/>
                <node role="operation"
                      type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation"
                      id="1206094498154">
                  <link role="member" targetNodeId="1205870649330" resolveInfo="node"/>
                </node>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation"
                  id="1205870708671">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference"
                    id="1205870708672">
                <link role="conceptDeclaration" targetNodeId="1.1174643105530" resolveInfo="InferenceRule"/>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDeclaration" id="1205606256131">
    <property name="name" value="ShowSupertypes"/>
    <property name="caption" value="Show Supertypes"/>
    <property name="package" value="Actions"/>
    <link role="extendedClass" targetNodeId="17.~CurrentProjectMPSAction" resolveInfo="CurrentProjectMPSAction"/>
    <link role="extendedAction" targetNodeId="17.~CurrentProjectMPSAction" resolveInfo="CurrentProjectMPSAction"/>
    <node role="executeFunction" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ExecuteBlock"
          id="1205606256134">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205606256135">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1205606368297">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1205606368298">
            <property name="name" value="tool"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205606368299">
              <link role="classifier" targetNodeId="2.~SupertypesViewTool" resolveInfo="SupertypesViewTool"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205606380730">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205606378555">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                      id="1205606379807">
                  <link role="baseMethodDeclaration"
                        targetNodeId="8.~IOperationContext.getProject():jetbrains.mps.project.MPSProject"
                        resolveInfo="getProject"/>
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206094546682">
                  <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                        id="1206094545477"/>
                  <node role="operation"
                        type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation"
                        id="1206094547388">
                    <link role="member" targetNodeId="1205870998409" resolveInfo="operationContext"/>
                  </node>
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                    id="1205606385037">
                <link role="baseMethodDeclaration"
                      targetNodeId="14.~MPSProject.getComponent(java.lang.Class):java.lang.Object"
                      resolveInfo="getComponent"/>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression"
                      id="1205606388210">
                  <link role="classifier" targetNodeId="2.~SupertypesViewTool" resolveInfo="SupertypesViewTool"/>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.AssertStatement" id="1205606391416">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1205606394607">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1205606396110"/>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                  id="1205606393403">
              <link role="variableDeclaration" targetNodeId="1205606368298" resolveInfo="tool"/>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205606399300">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205606400067">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205606399301">
              <link role="variableDeclaration" targetNodeId="1205606368298" resolveInfo="tool"/>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                  id="1205606403522">
              <link role="baseMethodDeclaration"
                    targetNodeId="15.~AbstractHierarchyView.showConceptInHierarchy(jetbrains.mps.smodel.INodeAdapter,jetbrains.mps.smodel.IOperationContext):void"
                    resolveInfo="showConceptInHierarchy"/>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205606862904">
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation"
                      id="1205606863609"/>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206094554858">
                  <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                        id="1206094553234"/>
                  <node role="operation"
                        type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation"
                        id="1206094556704">
                    <link role="member" targetNodeId="1205870959450" resolveInfo="node"/>
                  </node>
                </node>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206094567709">
                <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                      id="1206094566332"/>
                <node role="operation"
                      type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation"
                      id="1206094568197">
                  <link role="member" targetNodeId="1205870998409" resolveInfo="operationContext"/>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205606422343">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205606448224">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205606442413">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205606422704">
                <node role="operand"
                      type="jetbrains.mps.bootstrap.pluginLanguage.structure.ConceptFunctionParameter_ActionContext"
                      id="1205606422344"/>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                      id="1205606424831">
                  <link role="baseMethodDeclaration"
                        targetNodeId="5.~ActionContext.get(java.lang.Class):java.lang.Object" resolveInfo="get"/>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression"
                        id="1205606439770">
                    <link role="classifier" targetNodeId="13.~IDEProjectFrame" resolveInfo="IDEProjectFrame"/>
                  </node>
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                    id="1205606445661">
                <link role="baseMethodDeclaration"
                      targetNodeId="13.~AbstractProjectFrame.getToolsPane():jetbrains.mps.ide.toolsPane.ToolsPane"
                      resolveInfo="getToolsPane"/>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                  id="1205606460101">
              <link role="baseMethodDeclaration"
                    targetNodeId="16.~ToolsPane.selectTool(jetbrains.mps.ide.toolsPane.ITool):void"
                    resolveInfo="selectTool"/>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                    id="1205606462009">
                <link role="variableDeclaration" targetNodeId="1205606368298" resolveInfo="tool"/>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="parameterDeclaration" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterDeclaration"
          id="1205870959450">
      <property name="name" value="node"/>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1205870959451"/>
      <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1205870982126"/>
    </node>
    <node role="parameterDeclaration" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterDeclaration"
          id="1205870998409">
      <property name="name" value="operationContext"/>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1205870998410"/>
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205871000100">
        <link role="classifier" targetNodeId="8.~IOperationContext" resolveInfo="IOperationContext"/>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDeclaration" id="1206101064404">
    <property name="package" value="Actions"/>
    <property name="name" value="GoToNodeThisDependsOn"/>
    <property name="caption" value="Go To Node This Depends On"/>
    <link role="extendedAction" targetNodeId="17.~CurrentProjectMPSAction" resolveInfo="CurrentProjectMPSAction"/>
    <node role="executeFunction" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ExecuteBlock"
          id="1206101064405">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206101064406">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1206101064407">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1206101064408">
            <property name="name" value="dependenciesCollector"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206101064409">
              <link role="classifier" targetNodeId="6.~DependenciesCollector" resolveInfo="DependenciesCollector"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1206101064410">
              <link role="baseMethodDeclaration" targetNodeId="6.~DependenciesCollector.&lt;init&gt;()"
                    resolveInfo="DependenciesCollector"/>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1206101064411">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1206101064412">
            <property name="name" value="leaves"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206101064413">
              <link role="classifier" targetNodeId="7.~HashSet" resolveInfo="HashSet"/>
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206101064414">
                <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode"/>
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1206101064415">
              <link role="baseMethodDeclaration" targetNodeId="7.~HashSet.&lt;init&gt;()" resolveInfo="HashSet"/>
              <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206101064416">
                <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode"/>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1206101064417">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1206101064418">
            <property name="name" value="dependencies"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206101064419">
              <link role="classifier" targetNodeId="7.~HashMap" resolveInfo="HashMap"/>
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206101111468">
                <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode"/>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206101114080">
                <link role="classifier" targetNodeId="9.~Pair" resolveInfo="Pair"/>
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206101116738">
                  <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode"/>
                </node>
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206101118631">
                  <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode"/>
                </node>
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1206101135273">
              <link role="baseMethodDeclaration" targetNodeId="7.~HashMap.&lt;init&gt;()" resolveInfo="HashMap"/>
              <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206101135274">
                <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode"/>
              </node>
              <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206101135275">
                <link role="classifier" targetNodeId="9.~Pair" resolveInfo="Pair"/>
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206101135276">
                  <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode"/>
                </node>
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206101135277">
                  <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode"/>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206101165085">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206101166337">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206101165086">
              <link role="variableDeclaration" targetNodeId="1206101064408" resolveInfo="dependenciesCollector"/>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                  id="1206101167151">
              <link role="baseMethodDeclaration"
                    targetNodeId="6.~DependenciesCollector.collectDependencies(jetbrains.mps.smodel.SNode,java.util.Map,java.util.Set):void"
                    resolveInfo="collectDependencies"/>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206101182862">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206101180921">
                  <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                        id="1206101179795"/>
                  <node role="operation"
                        type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation"
                        id="1206101181861">
                    <link role="member" targetNodeId="1206101064420" resolveInfo="node"/>
                  </node>
                </node>
                <node role="operation"
                      type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetContainingRootOperation"
                      id="1206101184754"/>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                    id="1206101190600">
                <link role="variableDeclaration" targetNodeId="1206101064418" resolveInfo="dependencies"/>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                    id="1206101192727">
                <link role="variableDeclaration" targetNodeId="1206101064412" resolveInfo="leaves"/>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1206101197870">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206101197871">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206101243390">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1206101254882">
                <link role="baseMethodDeclaration"
                      targetNodeId="20.~JOptionPane.showMessageDialog(java.awt.Component,java.lang.Object):void"
                      resolveInfo="showMessageDialog"/>
                <link role="classConcept" targetNodeId="20.~JOptionPane" resolveInfo="JOptionPane"/>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression"
                      id="1206101399994">
                  <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                        id="1206101398056"/>
                  <node role="operation"
                        type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation"
                        id="1206101400293">
                    <link role="member" targetNodeId="1206101386411" resolveInfo="frame"/>
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral"
                      id="1206101406264">
                  <property name="value" value="node is not dependent"/>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1206101415641"/>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1206101200764">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206101203549">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                    id="1206101202485">
                <link role="variableDeclaration" targetNodeId="1206101064412" resolveInfo="leaves"/>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                    id="1206101209660">
                <link role="baseMethodDeclaration" targetNodeId="7.~HashSet.contains(java.lang.Object):boolean"
                      resolveInfo="contains"/>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression"
                      id="1206101213318">
                  <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                        id="1206101212192"/>
                  <node role="operation"
                        type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation"
                        id="1206101214726">
                    <link role="member" targetNodeId="1206101064420" resolveInfo="node"/>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1206101444148">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1206101444149">
            <property name="name" value="current"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206101444150">
              <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206101456467">
              <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                    id="1206101455263"/>
              <node role="operation"
                    type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation"
                    id="1206101457250">
                <link role="member" targetNodeId="1206101064420" resolveInfo="node"/>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.WhileStatement" id="1206101430582">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1206101475569">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1206101479540"/>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206101468065">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                    id="1206101467064">
                <link role="variableDeclaration" targetNodeId="1206101064418" resolveInfo="dependencies"/>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                    id="1206101471645">
                <link role="baseMethodDeclaration" targetNodeId="7.~HashMap.get(java.lang.Object):java.lang.Object"
                      resolveInfo="get"/>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                      id="1206101473771">
                  <link role="variableDeclaration" targetNodeId="1206101444149" resolveInfo="current"/>
                </node>
              </node>
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206101430584">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206101482932">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression"
                    id="1206101487578">
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                      id="1206101482933">
                  <link role="variableDeclaration" targetNodeId="1206101444149" resolveInfo="current"/>
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1206101678346">
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206101681239">
                    <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode"/>
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206101682318">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206101682319">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                            id="1206101682320">
                        <link role="variableDeclaration" targetNodeId="1206101064418" resolveInfo="dependencies"/>
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                            id="1206101682321">
                        <link role="baseMethodDeclaration"
                              targetNodeId="7.~HashMap.get(java.lang.Object):java.lang.Object" resolveInfo="get"/>
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                              id="1206101682322">
                          <link role="variableDeclaration" targetNodeId="1206101444149" resolveInfo="current"/>
                        </node>
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation"
                          id="1206101682323">
                      <link role="fieldDeclaration" targetNodeId="9.~Pair.o1" resolveInfo="o1"/>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206101635242">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206101651512">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206101643822">
              <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                    id="1206101635243"/>
              <node role="operation"
                    type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation"
                    id="1206101644996">
                <link role="member" targetNodeId="1206101614410" resolveInfo="editor"/>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                  id="1206101661359">
              <link role="baseMethodDeclaration"
                    targetNodeId="10.~AbstractEditorComponent.selectNode(jetbrains.mps.smodel.SNode):void"
                    resolveInfo="selectNode"/>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                    id="1206101663079">
                <link role="variableDeclaration" targetNodeId="1206101444149" resolveInfo="current"/>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="parameterDeclaration" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterDeclaration"
          id="1206101064420">
      <property name="name" value="node"/>
      <property name="isFinal" value="true"/>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1206101064421"/>
      <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1206101064422"/>
    </node>
    <node role="parameterDeclaration" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterDeclaration"
          id="1206101386411">
      <property name="name" value="frame"/>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1206101386412"/>
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206101389539">
        <link role="classifier" targetNodeId="12.~Frame" resolveInfo="Frame"/>
      </node>
    </node>
    <node role="parameterDeclaration" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterDeclaration"
          id="1206101614410">
      <property name="name" value="editor"/>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1206101614411"/>
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206101617475">
        <link role="classifier" targetNodeId="10.~AbstractEditorComponent" resolveInfo="AbstractEditorComponent"/>
      </node>
    </node>
    <node role="updateBlock" type="jetbrains.mps.bootstrap.pluginLanguage.structure.IsApplicableBlock"
          id="1206101064423">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206101064424">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206101064425">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206101064426">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206101064427">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206101064428">
                <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                      id="1206101064429"/>
                <node role="operation"
                      type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation"
                      id="1206101064430">
                  <link role="member" targetNodeId="1206101064420" resolveInfo="node"/>
                </node>
              </node>
              <node role="operation"
                    type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetContainingRootOperation"
                    id="1206101064431"/>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation"
                  id="1206101064432">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference"
                    id="1206101064433">
                <link role="conceptDeclaration" targetNodeId="1.1174643105530" resolveInfo="InferenceRule"/>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDeclaration" id="1206101816406">
    <property name="package" value="Actions"/>
    <property name="name" value="GoToTypeErrorRule"/>
    <property name="caption" value="Go To Rule Which Caused Error"/>
    <property name="shortcut" value="control alt shift R"/>
    <link role="extendedAction" targetNodeId="17.~CurrentProjectMPSAction" resolveInfo="CurrentProjectMPSAction"/>
    <node role="executeFunction" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ExecuteBlock"
          id="1206101816407">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206101816408">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1206105385968">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1206105385969">
            <property name="name" value="error"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206105385970">
              <link role="classifier" targetNodeId="21.~IErrorReporter" resolveInfo="IErrorReporter"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206105385971">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1206105385972">
                <link role="classConcept" targetNodeId="21.~TypeChecker" resolveInfo="TypeChecker"/>
                <link role="baseMethodDeclaration"
                      targetNodeId="21.~TypeChecker.getInstance():jetbrains.mps.helgins.inference.TypeChecker"
                      resolveInfo="getInstance"/>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                    id="1206105385973">
                <link role="baseMethodDeclaration"
                      targetNodeId="21.~TypeChecker.getTypeErrorDontCheck(jetbrains.mps.smodel.SNode):jetbrains.mps.helgins.inference.IErrorReporter"
                      resolveInfo="getTypeErrorDontCheck"/>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression"
                      id="1206105385974">
                  <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                        id="1206105385975"/>
                  <node role="operation"
                        type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation"
                        id="1206105385976">
                    <link role="member" targetNodeId="1206105063805" resolveInfo="node"/>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206108594276">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1206108595576">
            <link role="baseMethodDeclaration" targetNodeId="1206108407495" resolveInfo="goToTypeError"/>
            <link role="classConcept" targetNodeId="1206108391540" resolveInfo="GoToTypeErrorRuleUtil"/>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206108601395">
              <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                    id="1206108601396"/>
              <node role="operation"
                    type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation"
                    id="1206108601397">
                <link role="member" targetNodeId="1206105362102" resolveInfo="operationContext"/>
              </node>
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                  id="1206108603354">
              <link role="variableDeclaration" targetNodeId="1206105385969" resolveInfo="error"/>
            </node>
            <node role="actualArgument" type="jetbrains.mps.bootstrap.pluginLanguage.structure.Log" id="1206108607720"/>
          </node>
        </node>
      </node>
    </node>
    <node role="parameterDeclaration" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterDeclaration"
          id="1206105063805">
      <property name="name" value="node"/>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1206105063806"/>
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206105068420">
        <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode"/>
      </node>
    </node>
    <node role="parameterDeclaration" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterDeclaration"
          id="1206105362102">
      <property name="name" value="operationContext"/>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1206105362103"/>
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206105364120">
        <link role="classifier" targetNodeId="8.~IOperationContext" resolveInfo="IOperationContext"/>
      </node>
    </node>
    <node role="parameterDeclaration" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterDeclaration"
          id="1206105800777">
      <property name="name" value="editorsPane"/>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1206105800778"/>
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206105813612">
        <link role="classifier" targetNodeId="13.~EditorsPane" resolveInfo="EditorsPane"/>
      </node>
    </node>
    <node role="parameterDeclaration" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterDeclaration"
          id="1206108160319">
      <property name="name" value="project"/>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1206108160320"/>
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206108165513">
        <link role="classifier" targetNodeId="14.~MPSProject" resolveInfo="MPSProject"/>
      </node>
    </node>
    <node role="updateBlock" type="jetbrains.mps.bootstrap.pluginLanguage.structure.IsApplicableBlock"
          id="1206105095999">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206105096000">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1206105127535">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1206105127536">
            <property name="name" value="error"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206105127537">
              <link role="classifier" targetNodeId="21.~IErrorReporter" resolveInfo="IErrorReporter"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206105154776">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1206105151150">
                <link role="baseMethodDeclaration"
                      targetNodeId="21.~TypeChecker.getInstance():jetbrains.mps.helgins.inference.TypeChecker"
                      resolveInfo="getInstance"/>
                <link role="classConcept" targetNodeId="21.~TypeChecker" resolveInfo="TypeChecker"/>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                    id="1206105159032">
                <link role="baseMethodDeclaration"
                      targetNodeId="21.~TypeChecker.getTypeErrorDontCheck(jetbrains.mps.smodel.SNode):jetbrains.mps.helgins.inference.IErrorReporter"
                      resolveInfo="getTypeErrorDontCheck"/>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression"
                      id="1206105163612">
                  <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                        id="1206105161221"/>
                  <node role="operation"
                        type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation"
                        id="1206105165614">
                    <link role="member" targetNodeId="1206105063805" resolveInfo="node"/>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1206105173116">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1206105303541">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1206105316251">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1206105334747">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression"
                      id="1206105341395">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral"
                        id="1206105342398"/>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression"
                        id="1206105338438">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                          id="1206105336984">
                      <link role="variableDeclaration" targetNodeId="1206105127536" resolveInfo="error"/>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                          id="1206105339831">
                      <link role="baseMethodDeclaration"
                            targetNodeId="21.~IErrorReporter.getRuleModel():java.lang.String"
                            resolveInfo="getRuleModel"/>
                    </node>
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression"
                      id="1206105327712">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression"
                        id="1206105323599">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                          id="1206105322270">
                      <link role="variableDeclaration" targetNodeId="1206105127536" resolveInfo="error"/>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                          id="1206105324804">
                      <link role="baseMethodDeclaration" targetNodeId="21.~IErrorReporter.getRuleId():java.lang.String"
                            resolveInfo="getRuleId"/>
                    </node>
                  </node>
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral"
                        id="1206105332402"/>
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression"
                    id="1206105309685">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                      id="1206105306778">
                  <link role="variableDeclaration" targetNodeId="1206105127536" resolveInfo="error"/>
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral"
                      id="1206105314266"/>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1206108391540">
    <property name="name" value="GoToTypeErrorRuleUtil"/>
    <property name="package" value="Actions"/>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1206108391541"/>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1206108407495">
      <property name="name" value="goToTypeErrorRule"/>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1206108407496"/>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1206108407497"/>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206108407498">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1206108441229">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1206108441230">
            <property name="name" value="currentEditor"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206108441231">
              <link role="classifier" targetNodeId="13.~IEditor" resolveInfo="IEditor"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206108441232">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                    id="1206108441236">
                <link role="baseMethodDeclaration"
                      targetNodeId="13.~EditorsPane.getCurrentEditor():jetbrains.mps.ide.IEditor"
                      resolveInfo="getCurrentEditor"/>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206108462782">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1206108461186">
                  <link role="variableDeclaration" targetNodeId="1206108415663" resolveInfo="context"/>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                      id="1206108468758">
                  <link role="baseMethodDeclaration"
                        targetNodeId="8.~IOperationContext.getComponent(java.lang.Class):java.lang.Object"
                        resolveInfo="getComponent"/>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression"
                        id="1206108482409">
                    <link role="classifier" targetNodeId="13.~EditorsPane" resolveInfo="EditorsPane"/>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1206108441237">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1206108441238">
            <property name="name" value="ruleID"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206108441239">
              <link role="classifier" targetNodeId="22.~String" resolveInfo="String"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206108441240">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1206108441241">
                <link role="variableDeclaration" targetNodeId="1206108418949" resolveInfo="error"/>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                    id="1206108441242">
                <link role="baseMethodDeclaration" targetNodeId="21.~IErrorReporter.getRuleId():java.lang.String"
                      resolveInfo="getRuleId"/>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1206108441243">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1206108441244">
            <property name="name" value="ruleModel"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206108441245">
              <link role="classifier" targetNodeId="22.~String" resolveInfo="String"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206108441246">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1206108441247">
                <link role="variableDeclaration" targetNodeId="1206108418949" resolveInfo="error"/>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                    id="1206108441248">
                <link role="baseMethodDeclaration" targetNodeId="21.~IErrorReporter.getRuleModel():java.lang.String"
                      resolveInfo="getRuleModel"/>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1206108441249">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1206108441250">
            <property name="name" value="modelDescriptor"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206108441251">
              <link role="classifier" targetNodeId="8.~SModelDescriptor" resolveInfo="SModelDescriptor"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206108441252">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1206108441253">
                <link role="classConcept" targetNodeId="8.~SModelRepository" resolveInfo="SModelRepository"/>
                <link role="baseMethodDeclaration"
                      targetNodeId="8.~SModelRepository.getInstance():jetbrains.mps.smodel.SModelRepository"
                      resolveInfo="getInstance"/>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                    id="1206108441254">
                <link role="baseMethodDeclaration"
                      targetNodeId="8.~SModelRepository.getModelDescriptor(jetbrains.mps.smodel.SModelUID):jetbrains.mps.smodel.SModelDescriptor"
                      resolveInfo="getModelDescriptor"/>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall"
                      id="1206108441255">
                  <link role="classConcept" targetNodeId="8.~SModelUID" resolveInfo="SModelUID"/>
                  <link role="baseMethodDeclaration"
                        targetNodeId="8.~SModelUID.fromString(java.lang.String):jetbrains.mps.smodel.SModelUID"
                        resolveInfo="fromString"/>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                        id="1206108441256">
                    <link role="variableDeclaration" targetNodeId="1206108441244" resolveInfo="ruleModel"/>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1206108441257">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206108441258">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206108441259">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206108441260">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1206108568201">
                  <link role="variableDeclaration" targetNodeId="1206108552275" resolveInfo="LOG"/>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                      id="1206108441262">
                  <link role="baseMethodDeclaration" targetNodeId="24.~Logger.error(java.lang.String):void"
                        resolveInfo="error"/>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.PlusExpression"
                        id="1206108441263">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                          id="1206108441264">
                      <link role="variableDeclaration" targetNodeId="1206108441244" resolveInfo="ruleModel"/>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral"
                          id="1206108441265">
                      <property name="value" value="can't find rule's model"/>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1206108441266"/>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1206108441267">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1206108441268"/>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                  id="1206108441269">
              <link role="variableDeclaration" targetNodeId="1206108441250" resolveInfo="modelDescriptor"/>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1206108441270">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1206108441271">
            <property name="name" value="rule"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206108441272">
              <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206108441273">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206108441274">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                      id="1206108441275">
                  <link role="variableDeclaration" targetNodeId="1206108441250" resolveInfo="modelDescriptor"/>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                      id="1206108441276">
                  <link role="baseMethodDeclaration"
                        targetNodeId="8.~SModelDescriptor.getSModel():jetbrains.mps.smodel.SModel"
                        resolveInfo="getSModel"/>
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                    id="1206108441277">
                <link role="baseMethodDeclaration"
                      targetNodeId="8.~SModel.getNodeById(java.lang.String):jetbrains.mps.smodel.SNode"
                      resolveInfo="getNodeById"/>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                      id="1206108441278">
                  <link role="variableDeclaration" targetNodeId="1206108441238" resolveInfo="ruleID"/>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1206108441279">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206108441280">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206108441281">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206108441282">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1206108565104">
                  <link role="variableDeclaration" targetNodeId="1206108552275" resolveInfo="LOG"/>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                      id="1206108441284">
                  <link role="baseMethodDeclaration" targetNodeId="24.~Logger.error(java.lang.String):void"
                        resolveInfo="error"/>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.PlusExpression"
                        id="1206108441285">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression"
                          id="1206108441286">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression"
                            id="1206108441287">
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                              id="1206108441288">
                          <link role="variableDeclaration" targetNodeId="1206108441250" resolveInfo="modelDescriptor"/>
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral"
                              id="1206108441289">
                          <property name="value" value=" in the model "/>
                        </node>
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                            id="1206108441290">
                        <link role="variableDeclaration" targetNodeId="1206108441238" resolveInfo="ruleID"/>
                      </node>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral"
                          id="1206108441291">
                      <property name="value" value="can't find rule with id "/>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1206108441292">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1206108441293"/>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                  id="1206108441294">
              <link role="variableDeclaration" targetNodeId="1206108441271" resolveInfo="rule"/>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206108441295">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1206108441296">
            <link role="baseMethodDeclaration"
                  targetNodeId="23.~NavigationActionProcessor.executeNavigationAction(jetbrains.mps.ide.navigation.EditorNavigationCommand,jetbrains.mps.project.MPSProject,boolean):void"
                  resolveInfo="executeNavigationAction"/>
            <link role="classConcept" targetNodeId="23.~NavigationActionProcessor"
                  resolveInfo="NavigationActionProcessor"/>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1206108441297">
              <link role="baseMethodDeclaration"
                    targetNodeId="23.~EditorNavigationCommand.&lt;init&gt;(jetbrains.mps.smodel.SNode,jetbrains.mps.ide.IEditor,jetbrains.mps.ide.EditorsPane)"
                    resolveInfo="EditorNavigationCommand"/>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                    id="1206108441298">
                <link role="variableDeclaration" targetNodeId="1206108441271" resolveInfo="rule"/>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                    id="1206108441299">
                <link role="variableDeclaration" targetNodeId="1206108441230" resolveInfo="currentEditor"/>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206108496191">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1206108496192">
                  <link role="variableDeclaration" targetNodeId="1206108415663" resolveInfo="context"/>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                      id="1206108496193">
                  <link role="baseMethodDeclaration"
                        targetNodeId="8.~IOperationContext.getComponent(java.lang.Class):java.lang.Object"
                        resolveInfo="getComponent"/>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression"
                        id="1206108496194">
                    <link role="classifier" targetNodeId="13.~EditorsPane" resolveInfo="EditorsPane"/>
                  </node>
                </node>
              </node>
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206108505080">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1206108505081">
                <link role="variableDeclaration" targetNodeId="1206108415663" resolveInfo="context"/>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                    id="1206108505082">
                <link role="baseMethodDeclaration"
                      targetNodeId="8.~IOperationContext.getProject():jetbrains.mps.project.MPSProject"
                      resolveInfo="getProject"/>
              </node>
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1206108441306">
              <property name="value" value="true"/>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1206108415663">
        <property name="name" value="context"/>
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206108415664">
          <link role="classifier" targetNodeId="8.~IOperationContext" resolveInfo="IOperationContext"/>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1206108418949">
        <property name="name" value="error"/>
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206108420938">
          <link role="classifier" targetNodeId="21.~IErrorReporter" resolveInfo="IErrorReporter"/>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1206108552275">
        <property name="name" value="LOG"/>
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206108554529">
          <link role="classifier" targetNodeId="24.~Logger" resolveInfo="Logger"/>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDeclaration" id="1206108972918">
    <property name="package" value="Actions"/>
    <property name="name" value="RefactorModel"/>
    <property name="caption" value="Refactor Helgins Model"/>
    <link role="extendedAction" targetNodeId="17.~CurrentProjectMPSAction" resolveInfo="CurrentProjectMPSAction"/>
    <node role="executeFunction" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ExecuteBlock"
          id="1206108972919">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206109345596">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206109353589">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1206109356766">
            <link role="baseMethodDeclaration"
                  targetNodeId="2.~RefactorModelUtil.refactorModel(jetbrains.mps.smodel.SModelDescriptor):void"
                  resolveInfo="refactorModel"/>
            <link role="classConcept" targetNodeId="2.~RefactorModelUtil" resolveInfo="RefactorModelUtil"/>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206109731613">
              <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                    id="1206109731614"/>
              <node role="operation"
                    type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation"
                    id="1206109731615">
                <link role="member" targetNodeId="1206109222419" resolveInfo="model"/>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="updateBlock" type="jetbrains.mps.bootstrap.pluginLanguage.structure.IsApplicableBlock"
          id="1206109117791">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206109117792">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1206109279883">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1206109279884">
            <property name="name" value="languageAspect"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206109279885">
              <link role="classifier" targetNodeId="8.~LanguageAspect" resolveInfo="LanguageAspect"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1206109298766">
              <link role="baseMethodDeclaration"
                    targetNodeId="8.~Language.getModelAspect(jetbrains.mps.smodel.SModelDescriptor):jetbrains.mps.smodel.LanguageAspect"
                    resolveInfo="getModelAspect"/>
              <link role="classConcept" targetNodeId="8.~Language" resolveInfo="Language"/>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206109309968">
                <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                      id="1206109308638"/>
                <node role="operation"
                      type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation"
                      id="1206109311065">
                  <link role="member" targetNodeId="1206109222419" resolveInfo="model"/>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1206109315368">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1206109318421">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference"
                  id="1206109330249">
              <link role="enumConstantDeclaration" targetNodeId="8.~LanguageAspect.HELGINS_TYPESYSTEM"
                    resolveInfo="HELGINS_TYPESYSTEM"/>
              <link role="enumClass" targetNodeId="8.~LanguageAspect" resolveInfo="LanguageAspect"/>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                  id="1206109317356">
              <link role="variableDeclaration" targetNodeId="1206109279884" resolveInfo="languageAspect"/>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="parameterDeclaration" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterDeclaration"
          id="1206109222419">
      <property name="name" value="model"/>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1206109222420"/>
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206109226674">
        <link role="classifier" targetNodeId="8.~SModelDescriptor" resolveInfo="SModelDescriptor"/>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDeclaration" id="1206184013394">
    <property name="package" value="Actions"/>
    <property name="name" value="ShowRulesWhichAffectNodeType"/>
    <property name="caption" value="Show Rules Which Affect Node's Type"/>
    <link role="extendedAction" targetNodeId="17.~CurrentProjectMPSAction" resolveInfo="CurrentProjectMPSAction"/>
    <node role="executeFunction" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ExecuteBlock"
          id="1206184013395">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206184013396">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1206184164672">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1206184164673">
            <property name="name" value="component"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206184164674">
              <link role="classifier" targetNodeId="21.~NodeTypesComponent" resolveInfo="NodeTypesComponent"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206184179431">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1206184178461">
                <link role="baseMethodDeclaration"
                      targetNodeId="21.~NodeTypesComponentsRepository.getInstance():jetbrains.mps.helgins.inference.NodeTypesComponentsRepository"
                      resolveInfo="getInstance"/>
                <link role="classConcept" targetNodeId="21.~NodeTypesComponentsRepository"
                      resolveInfo="NodeTypesComponentsRepository"/>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                    id="1206184189872">
                <link role="baseMethodDeclaration"
                      targetNodeId="21.~NodeTypesComponentsRepository.getNodeTypesComponent(jetbrains.mps.smodel.SNode):jetbrains.mps.helgins.inference.NodeTypesComponent"
                      resolveInfo="getNodeTypesComponent"/>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression"
                      id="1206184203988">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206184203157">
                    <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                          id="1206184203158"/>
                    <node role="operation"
                          type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation"
                          id="1206184203159">
                      <link role="member" targetNodeId="1206184077195" resolveInfo="node"/>
                    </node>
                  </node>
                  <node role="operation"
                        type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetContainingRootOperation"
                        id="1206184208491"/>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1206184217025">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206184217026">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1206184227989"/>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1206184220343">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1206184224956"/>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                  id="1206184218998">
              <link role="variableDeclaration" targetNodeId="1206184164673" resolveInfo="component"/>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1206184239164">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1206184239165">
            <property name="name" value="rulesIds"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206184239166">
              <link role="classifier" targetNodeId="7.~Set" resolveInfo="Set"/>
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206184242091">
                <link role="classifier" targetNodeId="9.~Pair" resolveInfo="Pair"/>
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206184249563">
                  <link role="classifier" targetNodeId="22.~String" resolveInfo="String"/>
                </node>
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206184252159">
                  <link role="classifier" targetNodeId="22.~String" resolveInfo="String"/>
                </node>
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206184271336">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                    id="1206184269460">
                <link role="variableDeclaration" targetNodeId="1206184164673" resolveInfo="component"/>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                    id="1206184275151">
                <link role="baseMethodDeclaration"
                      targetNodeId="21.~NodeTypesComponent.getRulesWhichAffectNodeType(jetbrains.mps.smodel.SNode):java.util.Set"
                      resolveInfo="getRulesWhichAffectNodeType"/>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression"
                      id="1206184280668">
                  <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                        id="1206184280669"/>
                  <node role="operation"
                        type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation"
                        id="1206184280670">
                    <link role="member" targetNodeId="1206184077195" resolveInfo="node"/>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1206184284531">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206184284532">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1206184301338"/>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1206184294490">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1206184296586"/>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                  id="1206184290598">
              <link role="variableDeclaration" targetNodeId="1206184239165" resolveInfo="rulesIds"/>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1206184308308">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1206184308309">
            <property name="name" value="rules"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206184308310">
              <link role="classifier" targetNodeId="7.~List" resolveInfo="List"/>
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206184311703">
                <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode"/>
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1206184322877">
              <link role="baseMethodDeclaration" targetNodeId="7.~ArrayList.&lt;init&gt;()" resolveInfo="ArrayList"/>
              <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206184371238">
                <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode"/>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement"
              id="1206184382553">
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable"
                id="1206184382554">
            <property name="name" value="ruleId"/>
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                id="1206184390495">
            <link role="variableDeclaration" targetNodeId="1206184239165" resolveInfo="rulesIds"/>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206184382556">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
                  id="1206184407201">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                    id="1206184407202">
                <property name="name" value="modelDescriptor"/>
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206184407203">
                  <link role="classifier" targetNodeId="8.~SModelDescriptor" resolveInfo="SModelDescriptor"/>
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206184419506">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1206184418833">
                    <link role="baseMethodDeclaration"
                          targetNodeId="8.~SModelRepository.getInstance():jetbrains.mps.smodel.SModelRepository"
                          resolveInfo="getInstance"/>
                    <link role="classConcept" targetNodeId="8.~SModelRepository" resolveInfo="SModelRepository"/>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                        id="1206184434039">
                    <link role="baseMethodDeclaration"
                          targetNodeId="8.~SModelRepository.getModelDescriptor(jetbrains.mps.smodel.SModelUID):jetbrains.mps.smodel.SModelDescriptor"
                          resolveInfo="getModelDescriptor"/>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall"
                          id="1206184440276">
                      <link role="baseMethodDeclaration"
                            targetNodeId="8.~SModelUID.fromString(java.lang.String):jetbrains.mps.smodel.SModelUID"
                            resolveInfo="fromString"/>
                      <link role="classConcept" targetNodeId="8.~SModelUID" resolveInfo="SModelUID"/>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression"
                            id="1206184449700">
                        <node role="operand"
                              type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference"
                              id="1206184448308">
                          <link role="variable" targetNodeId="1206184382554" resolveInfo="ruleId"/>
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation"
                              id="1206184451234">
                          <link role="fieldDeclaration" targetNodeId="9.~Pair.o1" resolveInfo="o1"/>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1206184457392">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206184457393">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ContinueStatement"
                      id="1206184466714"/>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1206184460944">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral"
                      id="1206184463916"/>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                      id="1206184459506">
                  <link role="variableDeclaration" targetNodeId="1206184407202" resolveInfo="modelDescriptor"/>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
                  id="1206184473044">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                    id="1206184473045">
                <property name="name" value="rule"/>
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206184473046">
                  <link role="classifier" targetNodeId="8.~SNode" resolveInfo="SNode"/>
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206184483302">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206184479455">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                          id="1206184477954">
                      <link role="variableDeclaration" targetNodeId="1206184407202" resolveInfo="modelDescriptor"/>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                          id="1206184480770">
                      <link role="baseMethodDeclaration"
                            targetNodeId="8.~SModelDescriptor.getSModel():jetbrains.mps.smodel.SModel"
                            resolveInfo="getSModel"/>
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                        id="1206184489414">
                    <link role="baseMethodDeclaration"
                          targetNodeId="8.~SModel.getNodeById(java.lang.String):jetbrains.mps.smodel.SNode"
                          resolveInfo="getNodeById"/>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression"
                          id="1206184494650">
                      <node role="operand"
                            type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference"
                            id="1206184493196">
                        <link role="variable" targetNodeId="1206184382554" resolveInfo="ruleId"/>
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation"
                            id="1206184494919">
                        <link role="fieldDeclaration" targetNodeId="9.~Pair.o2" resolveInfo="o2"/>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1206184501827">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206184501828">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement"
                      id="1206184514039">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206184515072">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                          id="1206184514040">
                      <link role="variableDeclaration" targetNodeId="1206184308309" resolveInfo="rules"/>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                          id="1206184518340">
                      <link role="baseMethodDeclaration" targetNodeId="7.~List.add(java.lang.Object):boolean"
                            resolveInfo="add"/>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                            id="1206184521185">
                        <link role="variableDeclaration" targetNodeId="1206184473045" resolveInfo="rule"/>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1206184505504">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral"
                      id="1206184506382"/>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                      id="1206184504675">
                  <link role="variableDeclaration" targetNodeId="1206184473045" resolveInfo="rule"/>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1206184574643">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1206184574644">
            <property name="name" value="currentEditor"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206184574645">
              <link role="classifier" targetNodeId="13.~IEditor" resolveInfo="IEditor"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206184586353">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206184584413">
                <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                      id="1206184584414"/>
                <node role="operation"
                      type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation"
                      id="1206184584415">
                  <link role="member" targetNodeId="1206184143494" resolveInfo="editorsPane"/>
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                    id="1206184590683">
                <link role="baseMethodDeclaration"
                      targetNodeId="13.~EditorsPane.getCurrentEditor():jetbrains.mps.ide.IEditor"
                      resolveInfo="getCurrentEditor"/>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1206184769847">
          <property name="value" value="single rule"/>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1206184596201">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206184596202">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206184614807">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1206184620590">
                <link role="baseMethodDeclaration"
                      targetNodeId="23.~NavigationActionProcessor.executeNavigationAction(jetbrains.mps.ide.navigation.EditorNavigationCommand,jetbrains.mps.project.MPSProject):void"
                      resolveInfo="executeNavigationAction"/>
                <link role="classConcept" targetNodeId="23.~NavigationActionProcessor"
                      resolveInfo="NavigationActionProcessor"/>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.NewExpression"
                      id="1206184645701">
                  <link role="baseMethodDeclaration"
                        targetNodeId="23.~EditorNavigationCommand.&lt;init&gt;(jetbrains.mps.smodel.SNode,jetbrains.mps.ide.IEditor,jetbrains.mps.ide.EditorsPane)"
                        resolveInfo="EditorNavigationCommand"/>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression"
                        id="1206184664344">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                          id="1206184663233">
                      <link role="variableDeclaration" targetNodeId="1206184308309" resolveInfo="rules"/>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                          id="1206184667564">
                      <link role="baseMethodDeclaration" targetNodeId="7.~List.get(int):java.lang.Object"
                            resolveInfo="get"/>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant"
                            id="1206184669534">
                        <property name="value" value="0"/>
                      </node>
                    </node>
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                        id="1206184675692">
                    <link role="variableDeclaration" targetNodeId="1206184574644" resolveInfo="currentEditor"/>
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression"
                        id="1206184678084">
                    <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                          id="1206184678085"/>
                    <node role="operation"
                          type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation"
                          id="1206184678086">
                      <link role="member" targetNodeId="1206184143494" resolveInfo="editorsPane"/>
                    </node>
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression"
                      id="1206184702528">
                  <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                        id="1206184700995"/>
                  <node role="operation"
                        type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation"
                        id="1206184723674">
                    <link role="member" targetNodeId="1206184707842" resolveInfo="project"/>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1206184629373"/>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1206184606412">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1206184607103">
              <property name="value" value="1"/>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206184603753">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                    id="1206184602064">
                <link role="variableDeclaration" targetNodeId="1206184308309" resolveInfo="rules"/>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                    id="1206184604646">
                <link role="baseMethodDeclaration" targetNodeId="7.~List.size():int" resolveInfo="size"/>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1206184778661">
          <property name="value" value="multiple rules"/>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1206184347275">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1206184347276">
            <property name="name" value="m"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206184347277">
              <link role="classifier" targetNodeId="2.~MyMenu" resolveInfo="MyMenu"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1206184361197">
              <link role="baseMethodDeclaration"
                    targetNodeId="2.~MyMenu.&lt;init&gt;(java.util.List,jetbrains.mps.smodel.IOperationContext)"
                    resolveInfo="MyMenu"/>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                    id="1206184366557">
                <link role="variableDeclaration" targetNodeId="1206184308309" resolveInfo="rules"/>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206184368137">
                <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                      id="1206184368138"/>
                <node role="operation"
                      type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation"
                      id="1206184368139">
                  <link role="member" targetNodeId="1206184137708" resolveInfo="operationContext"/>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1206184372235">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1206184372236">
            <property name="name" value="x"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1206184372237"/>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1206184374723">
              <property name="value" value="0"/>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1206184377115">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1206184377116">
            <property name="name" value="y"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1206184377117"/>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1206184379932">
              <property name="value" value="0"/>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1206184528902">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1206184528903">
            <property name="name" value="cell"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206184528904">
              <link role="classifier" targetNodeId="10.~EditorCell" resolveInfo="EditorCell"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206184537487">
              <node role="operand"
                    type="jetbrains.mps.bootstrap.pluginLanguage.structure.ConceptFunctionParameter_ActionContext"
                    id="1206184536142"/>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                    id="1206184539020">
                <link role="baseMethodDeclaration" targetNodeId="5.~ActionContext.get(java.lang.Class):java.lang.Object"
                      resolveInfo="get"/>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression"
                      id="1206184550728">
                  <link role="classifier" targetNodeId="10.~EditorCell" resolveInfo="EditorCell"/>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1206184661357">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206184661358">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206184668383">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression"
                    id="1206184669166">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206184671421">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                        id="1206184670091">
                    <link role="variableDeclaration" targetNodeId="1206184528903" resolveInfo="cell"/>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                        id="1206184675172">
                    <link role="baseMethodDeclaration" targetNodeId="10.~EditorCell.getX():int" resolveInfo="getX"/>
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                      id="1206184668384">
                  <link role="variableDeclaration" targetNodeId="1206184372236" resolveInfo="x"/>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206184677189">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression"
                    id="1206184678035">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206184680258">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                        id="1206184678648">
                    <link role="variableDeclaration" targetNodeId="1206184528903" resolveInfo="cell"/>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                        id="1206184680854">
                    <link role="baseMethodDeclaration" targetNodeId="10.~EditorCell.getY():int" resolveInfo="getY"/>
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                      id="1206184677190">
                  <link role="variableDeclaration" targetNodeId="1206184377116" resolveInfo="y"/>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1206184663300">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1206184664381"/>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                  id="1206184662893">
              <link role="variableDeclaration" targetNodeId="1206184528903" resolveInfo="cell"/>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1206184688154">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1206184688155">
            <property name="name" value="invoker"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206184688156">
              <link role="classifier" targetNodeId="12.~Component" resolveInfo="Component"/>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1206184694065">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206184694066">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206184702795">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression"
                    id="1206184704641">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206184710489">
                  <node role="operand"
                        type="jetbrains.mps.bootstrap.pluginLanguage.structure.ConceptFunctionParameter_ActionContext"
                        id="1206184709629"/>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                        id="1206184713335">
                    <link role="baseMethodDeclaration" targetNodeId="5.~ActionContext.getFrame():java.awt.Frame"
                          resolveInfo="getFrame"/>
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                      id="1206184702796">
                  <link role="variableDeclaration" targetNodeId="1206184688155" resolveInfo="invoker"/>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1206184699462">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1206184700090"/>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                  id="1206184697554">
              <link role="variableDeclaration" targetNodeId="1206184574644" resolveInfo="currentEditor"/>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1206184718010">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206184718011">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206184720294">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression"
                      id="1206184721312">
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206184728723">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                          id="1206184727268">
                      <link role="variableDeclaration" targetNodeId="1206184574644" resolveInfo="currentEditor"/>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                          id="1206184731581">
                      <link role="baseMethodDeclaration"
                            targetNodeId="13.~IEditor.getCurrentEditorComponent():jetbrains.mps.nodeEditor.AbstractEditorComponent"
                            resolveInfo="getCurrentEditorComponent"/>
                    </node>
                  </node>
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                        id="1206184720295">
                    <link role="variableDeclaration" targetNodeId="1206184688155" resolveInfo="invoker"/>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206184737021">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206184739586">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206184737022">
              <link role="variableDeclaration" targetNodeId="1206184347276" resolveInfo="m"/>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                  id="1206184750842">
              <link role="baseMethodDeclaration" targetNodeId="20.~JPopupMenu.show(java.awt.Component,int,int):void"
                    resolveInfo="show"/>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                    id="1206184754765">
                <link role="variableDeclaration" targetNodeId="1206184688155" resolveInfo="invoker"/>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                    id="1206184759566">
                <link role="variableDeclaration" targetNodeId="1206184372236" resolveInfo="x"/>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                    id="1206184757878">
                <link role="variableDeclaration" targetNodeId="1206184377116" resolveInfo="y"/>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="parameterDeclaration" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterDeclaration"
          id="1206184077195">
      <property name="name" value="node"/>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1206184077196"/>
      <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1206184198171"/>
    </node>
    <node role="parameterDeclaration" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterDeclaration"
          id="1206184137708">
      <property name="name" value="operationContext"/>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1206184137709"/>
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206184140040">
        <link role="classifier" targetNodeId="8.~IOperationContext" resolveInfo="IOperationContext"/>
      </node>
    </node>
    <node role="parameterDeclaration" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterDeclaration"
          id="1206184143494">
      <property name="name" value="editorsPane"/>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1206184143495"/>
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206184557642">
        <link role="classifier" targetNodeId="13.~EditorsPane" resolveInfo="EditorsPane"/>
      </node>
    </node>
    <node role="parameterDeclaration" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterDeclaration"
          id="1206184707842">
      <property name="name" value="project"/>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1206184707843"/>
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206184713392">
        <link role="classifier" targetNodeId="14.~MPSProject" resolveInfo="MPSProject"/>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.CustomPluginDeclaration" id="1206189513856">
    <property name="name" value="HelginsPlugin"/>
    <node role="fieldDeclaration" type="jetbrains.mps.bootstrap.pluginLanguage.structure.PluginFieldDeclaration"
          id="1206189883535">
      <property name="name" value="myHighlighter"/>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1206190096079"/>
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206189986398">
        <link role="classifier" targetNodeId="25.~Highlighter" resolveInfo="Highlighter"/>
      </node>
    </node>
    <node role="fieldDeclaration" type="jetbrains.mps.bootstrap.pluginLanguage.structure.PluginFieldDeclaration"
          id="1206190091170">
      <property name="name" value="mySupertypesViewTool"/>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1206190099142"/>
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206190789295">
        <link role="classifier" targetNodeId="2.~SupertypesViewTool" resolveInfo="SupertypesViewTool"/>
      </node>
    </node>
    <node role="fieldDeclaration" type="jetbrains.mps.bootstrap.pluginLanguage.structure.PluginFieldDeclaration"
          id="1206189995008">
      <property name="name" value="myModelsListener"/>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1206190101628"/>
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206190032935">
        <link role="classifier" targetNodeId="26.~SModelsListener" resolveInfo="SModelsListener"/>
      </node>
      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1206190045109">
        <node role="creator" type="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator" id="1206190045110">
          <node role="cls" type="jetbrains.mps.baseLanguage.structure.AnonymousClass" id="1206190045111">
            <link role="classifier" targetNodeId="26.~SModelsAdapter" resolveInfo="SModelsAdapter"/>
            <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"
                  id="1206190061972">
              <property name="name" value="modelLoaded"/>
              <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1206190061973"/>
              <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1206190061974"/>
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206190061975"/>
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration"
                    id="1206190076164">
                <property name="name" value="modelDescriptor"/>
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206190076165">
                  <link role="classifier" targetNodeId="8.~SModelDescriptor" resolveInfo="SModelDescriptor"/>
                </node>
              </node>
            </node>
            <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1206190045112"/>
          </node>
        </node>
      </node>
    </node>
    <node role="initBlock" type="jetbrains.mps.bootstrap.pluginLanguage.structure.InitBlock" id="1206190084322">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206190084323">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1206190113488">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1206190118024">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1206190118668"/>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206190115913">
              <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                    id="1206190115914"/>
              <node role="operation"
                    type="jetbrains.mps.bootstrap.pluginLanguage.structure.PluginFieldReferenceOperation"
                    id="1206190115915">
                <link role="member" targetNodeId="1206189883535" resolveInfo="myHighlighter"/>
              </node>
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206190113490">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206190120887">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206190121860">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206190120888">
                  <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                        id="1206190120889"/>
                  <node role="operation"
                        type="jetbrains.mps.bootstrap.pluginLanguage.structure.PluginFieldReferenceOperation"
                        id="1206190120890">
                    <link role="member" targetNodeId="1206189883535" resolveInfo="myHighlighter"/>
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                      id="1206190123284">
                  <link role="baseMethodDeclaration" targetNodeId="10.~GenericEditorUpdater.stopUpdater():void"
                        resolveInfo="stopUpdater"/>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206190129600">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1206190134713">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1206190137044">
              <link role="baseMethodDeclaration" targetNodeId="25.~Highlighter.&lt;init&gt;()"
                    resolveInfo="Highlighter"/>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206190129601">
              <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                    id="1206190129602"/>
              <node role="operation"
                    type="jetbrains.mps.bootstrap.pluginLanguage.structure.PluginFieldReferenceOperation"
                    id="1206190129603">
                <link role="member" targetNodeId="1206189883535" resolveInfo="myHighlighter"/>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206190144546">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206190146472">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206190144547">
              <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                    id="1206190144548"/>
              <node role="operation"
                    type="jetbrains.mps.bootstrap.pluginLanguage.structure.PluginFieldReferenceOperation"
                    id="1206190144549">
                <link role="member" targetNodeId="1206189883535" resolveInfo="myHighlighter"/>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                  id="1206190149724">
              <link role="baseMethodDeclaration"
                    targetNodeId="10.~GenericEditorUpdater.setProjects(jetbrains.mps.project.MPSProjects):void"
                    resolveInfo="setProjects"/>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206190162337">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1206190160383">
                  <link role="baseMethodDeclaration"
                        targetNodeId="14.~ApplicationComponents.getInstance():jetbrains.mps.project.ApplicationComponents"
                        resolveInfo="getInstance"/>
                  <link role="classConcept" targetNodeId="14.~ApplicationComponents"
                        resolveInfo="ApplicationComponents"/>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                      id="1206190166574">
                  <link role="baseMethodDeclaration"
                        targetNodeId="14.~ApplicationComponents.getComponent(java.lang.Class):java.lang.Object"
                        resolveInfo="getComponent"/>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression"
                        id="1206190187277">
                    <link role="classifier" targetNodeId="14.~MPSProjects" resolveInfo="MPSProjects"/>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206190197216">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206190198346">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206190197217">
              <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                    id="1206190197218"/>
              <node role="operation"
                    type="jetbrains.mps.bootstrap.pluginLanguage.structure.PluginFieldReferenceOperation"
                    id="1206190197219">
                <link role="member" targetNodeId="1206189883535" resolveInfo="myHighlighter"/>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                  id="1206190199770">
              <link role="baseMethodDeclaration" targetNodeId="10.~GenericEditorUpdater.initComponent():void"
                    resolveInfo="initComponent"/>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1206190206178">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1206190206179">
            <property name="name" value="projectFrame"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206190206180">
              <link role="classifier" targetNodeId="13.~IDEProjectFrame" resolveInfo="IDEProjectFrame"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206192179828">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206192053481">
                <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                      id="1206192048104"/>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                      id="1206192178423">
                  <link role="baseMethodDeclaration"
                        targetNodeId="17.~DefaultPlugin.getProject():jetbrains.mps.project.MPSProject"
                        resolveInfo="getProject"/>
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                    id="1206192194076">
                <link role="baseMethodDeclaration"
                      targetNodeId="14.~MPSProject.getComponent(java.lang.Class):java.lang.Object"
                      resolveInfo="getComponent"/>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression"
                      id="1206192241702">
                  <link role="classifier" targetNodeId="13.~IDEProjectFrame" resolveInfo="IDEProjectFrame"/>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1206192247282">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206192247283">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206192261870">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression"
                    id="1206192266311">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1206192268611">
                  <link role="baseMethodDeclaration"
                        targetNodeId="2.~SupertypesViewTool.&lt;init&gt;(jetbrains.mps.ide.IDEProjectFrame)"
                        resolveInfo="SupertypesViewTool"/>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                        id="1206192271456">
                    <link role="variableDeclaration" targetNodeId="1206190206179" resolveInfo="projectFrame"/>
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206192261871">
                  <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                        id="1206192261872"/>
                  <node role="operation"
                        type="jetbrains.mps.bootstrap.pluginLanguage.structure.PluginFieldReferenceOperation"
                        id="1206192261873">
                    <link role="member" targetNodeId="1206190091170" resolveInfo="mySupertypesViewTool"/>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206192276114">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206192291066">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206192277085">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                        id="1206192276115">
                    <link role="variableDeclaration" targetNodeId="1206190206179" resolveInfo="projectFrame"/>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                        id="1206192282943">
                    <link role="baseMethodDeclaration"
                          targetNodeId="13.~AbstractProjectFrame.getToolsPane():jetbrains.mps.ide.toolsPane.ToolsPane"
                          resolveInfo="getToolsPane"/>
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                      id="1206192315729">
                  <link role="baseMethodDeclaration"
                        targetNodeId="16.~ToolsPane.add(jetbrains.mps.ide.toolsPane.ITool,boolean):void"
                        resolveInfo="add"/>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression"
                        id="1206192318433">
                    <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                          id="1206192318434"/>
                    <node role="operation"
                          type="jetbrains.mps.bootstrap.pluginLanguage.structure.PluginFieldReferenceOperation"
                          id="1206192318435">
                      <link role="member" targetNodeId="1206190091170" resolveInfo="mySupertypesViewTool"/>
                    </node>
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.BooleanConstant"
                        id="1206192321000">
                    <property name="value" value="false"/>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206192329142">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206192333100">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206192330332">
                  <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                        id="1206192329143"/>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                        id="1206192332099">
                    <link role="baseMethodDeclaration"
                          targetNodeId="17.~DefaultPlugin.getProject():jetbrains.mps.project.MPSProject"
                          resolveInfo="getProject"/>
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                      id="1206192336915">
                  <link role="baseMethodDeclaration"
                        targetNodeId="14.~MPSProject.addComponent(java.lang.Class,java.lang.Object):void"
                        resolveInfo="addComponent"/>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression"
                        id="1206192344338">
                    <link role="classifier" targetNodeId="2.~SupertypesViewTool" resolveInfo="SupertypesViewTool"/>
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression"
                        id="1206192347590">
                    <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                          id="1206192347591"/>
                    <node role="operation"
                          type="jetbrains.mps.bootstrap.pluginLanguage.structure.PluginFieldReferenceOperation"
                          id="1206192347592">
                      <link role="member" targetNodeId="1206190091170" resolveInfo="mySupertypesViewTool"/>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1206192252897">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1206192254681"/>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                  id="1206192248083">
              <link role="variableDeclaration" targetNodeId="1206190206179" resolveInfo="projectFrame"/>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206192358406">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206192363643">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1206192360596">
              <link role="baseMethodDeclaration"
                    targetNodeId="26.~SModelsMulticaster.getInstance():jetbrains.mps.smodel.event.SModelsMulticaster"
                    resolveInfo="getInstance"/>
              <link role="classConcept" targetNodeId="26.~SModelsMulticaster" resolveInfo="SModelsMulticaster"/>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                  id="1206192370473">
              <link role="baseMethodDeclaration"
                    targetNodeId="26.~SModelsMulticaster.addSModelsListener(jetbrains.mps.smodel.event.SModelsListener):void"
                    resolveInfo="addSModelsListener"/>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206192375881">
                <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                      id="1206192375882"/>
                <node role="operation"
                      type="jetbrains.mps.bootstrap.pluginLanguage.structure.PluginFieldReferenceOperation"
                      id="1206192375883">
                  <link role="member" targetNodeId="1206189995008" resolveInfo="myModelsListener"/>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206192381885">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206192391515">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206192383199">
              <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                    id="1206192381886"/>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                    id="1206192384936">
                <link role="baseMethodDeclaration"
                      targetNodeId="17.~DefaultPlugin.getProject():jetbrains.mps.project.MPSProject"
                      resolveInfo="getProject"/>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                  id="1206192392751">
              <link role="baseMethodDeclaration"
                    targetNodeId="14.~MPSProject.addComponent(java.lang.Class,java.lang.Object):void"
                    resolveInfo="addComponent"/>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression"
                    id="1206192402486">
                <link role="classifier" targetNodeId="25.~Highlighter" resolveInfo="Highlighter"/>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206192406785">
                <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                      id="1206192406786"/>
                <node role="operation"
                      type="jetbrains.mps.bootstrap.pluginLanguage.structure.PluginFieldReferenceOperation"
                      id="1206192406787">
                  <link role="member" targetNodeId="1206189883535" resolveInfo="myHighlighter"/>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="disposeBlock" type="jetbrains.mps.bootstrap.pluginLanguage.structure.DisposeBlock" id="1206190085402">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206190085403">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206192412351">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206192414761">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206192412352">
              <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                    id="1206192412353"/>
              <node role="operation"
                    type="jetbrains.mps.bootstrap.pluginLanguage.structure.PluginFieldReferenceOperation"
                    id="1206192412354">
                <link role="member" targetNodeId="1206189883535" resolveInfo="myHighlighter"/>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                  id="1206192415747">
              <link role="baseMethodDeclaration" targetNodeId="10.~GenericEditorUpdater.stopUpdater():void"
                    resolveInfo="stopUpdater"/>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206192420328">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206192430020">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206192421517">
              <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                    id="1206192420329"/>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                    id="1206192422925">
                <link role="baseMethodDeclaration"
                      targetNodeId="17.~DefaultPlugin.getProject():jetbrains.mps.project.MPSProject"
                      resolveInfo="getProject"/>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                  id="1206192436491">
              <link role="baseMethodDeclaration" targetNodeId="14.~MPSProject.removeComponent(java.lang.Class):void"
                    resolveInfo="removeComponent"/>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression"
                    id="1206192442586">
                <link role="classifier" targetNodeId="25.~Highlighter" resolveInfo="Highlighter"/>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206192447541">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206192451389">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206192448199">
              <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                    id="1206192447542"/>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                    id="1206192449435">
                <link role="baseMethodDeclaration"
                      targetNodeId="17.~DefaultPlugin.getProject():jetbrains.mps.project.MPSProject"
                      resolveInfo="getProject"/>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                  id="1206192453751">
              <link role="baseMethodDeclaration" targetNodeId="14.~MPSProject.removeComponent(java.lang.Class):void"
                    resolveInfo="removeComponent"/>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression"
                    id="1206192458908">
                <link role="classifier" targetNodeId="2.~SupertypesViewTool" resolveInfo="SupertypesViewTool"/>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1206192466160">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1206192466161">
            <property name="name" value="projectFrame"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206192466162">
              <link role="classifier" targetNodeId="13.~IDEProjectFrame" resolveInfo="IDEProjectFrame"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206192482746">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206192478696">
                <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                      id="1206192477461"/>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                      id="1206192479573">
                  <link role="baseMethodDeclaration"
                        targetNodeId="17.~DefaultPlugin.getProject():jetbrains.mps.project.MPSProject"
                        resolveInfo="getProject"/>
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                    id="1206192485873">
                <link role="baseMethodDeclaration"
                      targetNodeId="14.~MPSProject.getComponent(java.lang.Class):java.lang.Object"
                      resolveInfo="getComponent"/>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression"
                      id="1206192489921">
                  <link role="classifier" targetNodeId="13.~IDEProjectFrame" resolveInfo="IDEProjectFrame"/>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1206192492642">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206192492643">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206192516193">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206192519307">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206192516992">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                        id="1206192516194">
                    <link role="variableDeclaration" targetNodeId="1206192466161" resolveInfo="projectFrame"/>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                        id="1206192518447">
                    <link role="baseMethodDeclaration"
                          targetNodeId="13.~AbstractProjectFrame.getToolsPane():jetbrains.mps.ide.toolsPane.ToolsPane"
                          resolveInfo="getToolsPane"/>
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation"
                      id="1206192525153">
                  <link role="baseMethodDeclaration"
                        targetNodeId="16.~ToolsPane.removeTool(jetbrains.mps.ide.toolsPane.ITool):void"
                        resolveInfo="removeTool"/>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression"
                        id="1206192532734">
                    <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                          id="1206192532735"/>
                    <node role="operation"
                          type="jetbrains.mps.bootstrap.pluginLanguage.structure.PluginFieldReferenceOperation"
                          id="1206192532736">
                      <link role="member" targetNodeId="1206190091170" resolveInfo="mySupertypesViewTool"/>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1206192500308">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression"
                  id="1206192511736">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1206192512926"/>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206192508170">
                <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson"
                      id="1206192508171"/>
                <node role="operation"
                      type="jetbrains.mps.bootstrap.pluginLanguage.structure.PluginFieldReferenceOperation"
                      id="1206192508172">
                  <link role="member" targetNodeId="1206190091170" resolveInfo="mySupertypesViewTool"/>
                </node>
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression"
                  id="1206192496320">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                    id="1206192494802">
                <link role="variableDeclaration" targetNodeId="1206192466161" resolveInfo="projectFrame"/>
              </node>
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1206192497151"/>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>


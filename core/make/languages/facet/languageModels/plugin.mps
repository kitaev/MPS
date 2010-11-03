<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:aa4df85a-48f0-4531-a9c6-bb42f911e10f(jetbrains.mps.make.facet.plugin)">
  <persistence version="5" />
  <language namespace="696c1165-4a59-463b-bc5d-902caab85dd0(jetbrains.mps.make.facet)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="95f8a3e6-f994-4ca0-a65e-763c9bae2d3b(jetbrains.mps.make.script)" />
  <language namespace="443f4c36-fcf5-4eb6-9500-8d06ed259e3e(jetbrains.mps.baseLanguage.classifiers)" />
  <language namespace="df345b11-b8c7-4213-ac66-48d2a9b75d88(jetbrains.mps.baseLanguageInternal)" />
  <language namespace="a247e09e-2435-45ba-b8d2-07e93feba96a(jetbrains.mps.baseLanguage.tuples)" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590368(jetbrains.mps.lang.plugin.structure)" version="23" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590373(jetbrains.mps.baseLanguage.classifiers.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895903ac(jetbrains.mps.baseLanguageInternal.structure)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895904a4(jetbrains.mps.ide.actions)" version="-1" />
  <languageAspect modelUID="r:aa4df85a-48f0-4531-a9c6-bb42f911e10f(jetbrains.mps.make.facet.plugin)" version="-1" />
  <languageAspect modelUID="r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)" version="-1" />
  <languageAspect modelUID="r:309aeee7-bee8-445c-b31d-35928d1da75f(jetbrains.mps.baseLanguage.tuples.structure)" version="2" />
  <devkit namespace="e073aac8-8c71-4c23-be71-86bf7a6df0a2(jetbrains.mps.devkit.bootstrap-languages)" />
  <maxImportIndex value="12" />
  <import index="1" modelUID="r:b16ff46d-fa06-479d-9f5c-5b6e17e7f1b2(jetbrains.mps.make.facet.structure)" version="1" />
  <import index="2" modelUID="f:java_stub#java.io(java.io@java_stub)" version="-1" />
  <import index="3" modelUID="f:java_stub#jetbrains.mps.ide.generator(jetbrains.mps.ide.generator@java_stub)" version="-1" />
  <import index="4" modelUID="r:8e0d2787-667a-41b8-9f98-9bb45c087fba(jetbrains.mps.internal.make.runtime.script)" version="-1" />
  <import index="5" modelUID="r:71895ceb-c89d-4545-aa38-89d1cd891f17(jetbrains.mps.make.facet)" version="-1" />
  <import index="6" modelUID="r:9e5578e0-37f0-4c9b-a301-771bcb453678(jetbrains.mps.make.script)" version="-1" />
  <import index="7" modelUID="f:java_stub#jetbrains.mps.workbench(jetbrains.mps.workbench@java_stub)" version="-1" />
  <import index="8" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" />
  <import index="9" modelUID="f:java_stub#java.lang.reflect(java.lang.reflect@java_stub)" version="-1" />
  <import index="10" modelUID="f:java_stub#junit.framework(junit.framework@java_stub)" version="-1" />
  <import index="11" modelUID="f:java_stub#jetbrains.mps.logging(jetbrains.mps.logging@java_stub)" version="-1" />
  <import index="12" modelUID="f:java_stub#org.apache.log4j(org.apache.log4j@java_stub)" version="-1" />
  <visible index="2" modelUID="r:00000000-0000-4000-0000-011c895904a4(jetbrains.mps.ide.actions)" />
  <node type="jetbrains.mps.lang.plugin.structure.ActionGroupDeclaration:23" id="8163946392710004057">
    <property name="name:23" value="Make" />
    <node role="contents:23" type="jetbrains.mps.lang.plugin.structure.ElementListContents:23" id="8163946392710004058">
      <node role="reference:23" type="jetbrains.mps.lang.plugin.structure.ActionInstance:23" id="8163946392710004059">
        <link role="action:23" targetNodeId="8163946392710004061" resolveInfo="MakeModel" />
      </node>
    </node>
    <node role="modifier:23" type="jetbrains.mps.lang.plugin.structure.ModificationStatement:23" id="8163946392710004060">
      <link role="modifiedGroup:23" targetNodeId="2v.1204991236497" resolveInfo="Generate" />
      <link role="point:23" targetNodeId="2v.2841218117793440877" resolveInfo="generateModel" />
    </node>
    <node role="modifier:23" type="jetbrains.mps.lang.plugin.structure.ModificationStatement:23" id="7608382118277687566">
      <link role="modifiedGroup:23" targetNodeId="2v.1204991218714" resolveInfo="ModelActions" />
      <link role="point:23" targetNodeId="2v.2785640295550425522" resolveInfo="generateActions" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.plugin.structure.ActionDeclaration:23" id="8163946392710004061">
    <property name="name:23" value="MakeModel" />
    <property name="caption:23" value="_Make" />
    <node role="parameter:23" type="jetbrains.mps.lang.plugin.structure.ActionDataParameterDeclaration:23" id="4853833103871243502">
      <property name="name:23" value="context" />
      <link role="key:23" targetNodeId="7.~MPSDataKeys.OPERATION_CONTEXT" resolveInfo="OPERATION_CONTEXT" />
    </node>
    <node role="executeFunction:23" type="jetbrains.mps.lang.plugin.structure.ExecuteBlock:23" id="8163946392710004062">
      <node role="body:23" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="8163946392710004063">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="8163946392710004064">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8163946392710004065">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference:3" id="8163946392710004066">
              <link role="classifier:3" targetNodeId="8.~System" resolveInfo="System" />
              <link role="variableDeclaration:3" targetNodeId="8.~System.out" resolveInfo="out" />
            </node>
            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8163946392710004067">
              <link role="baseMethodDeclaration:3" targetNodeId="2.~PrintStream.println(java.lang.String):void" resolveInfo="println" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8163946392710004068">
                <property name="value:3" value="*** WOO-HOO!!!!" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4853833103871114035">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4853833103871114036">
            <property name="name:3" value="scb" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4853833103871114037">
              <link role="classifier:3" targetNodeId="4.6168415856807657684" resolveInfo="ScriptBuilder" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4853833103871114038">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4853833103871114039">
                <link role="baseMethodDeclaration:3" targetNodeId="4.6168415856807658341" resolveInfo="ScriptBuilder" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4853833103871114040">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4853833103871114041">
            <property name="name:3" value="scr" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4853833103871114042">
              <link role="classifier:3" targetNodeId="6.6168415856807657227" resolveInfo="IScript" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4853833103871114043">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4853833103871114044">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4853833103871114047">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4853833103871114048">
                    <link role="variableDeclaration:3" targetNodeId="4853833103871114036" resolveInfo="scb" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4853833103871114049">
                    <link role="baseMethodDeclaration:3" targetNodeId="4.671853460608826866" resolveInfo="withFacet" />
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4853833103871114050">
                      <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4853833103871114051">
                        <link role="baseMethodDeclaration:3" targetNodeId="5.6168415856807657099" resolveInfo="IFacet.Name" />
                        <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4853833103871114052">
                          <property name="value:3" value="Generator" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4853833103871114061">
                  <link role="baseMethodDeclaration:3" targetNodeId="4.6168415856807657780" resolveInfo="withTarget" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4853833103871114062">
                    <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4853833103871114063">
                      <link role="baseMethodDeclaration:3" targetNodeId="5.6168415856807657137" resolveInfo="ITarget.Name" />
                      <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4853833103871114064">
                        <property name="value:3" value="GenerateFiles" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4853833103871114065">
                <link role="baseMethodDeclaration:3" targetNodeId="4.6168415856807657813" resolveInfo="toScript" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="5409216892672462744">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5409216892672462745">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference:3" id="5409216892672462746">
              <link role="classifier:3" targetNodeId="8.~System" />
              <link role="variableDeclaration:3" targetNodeId="8.~System.out" />
            </node>
            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="5409216892672462747">
              <link role="baseMethodDeclaration:3" targetNodeId="2.~PrintStream.println(java.lang.String):void" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="5409216892672462749">
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5409216892672462753">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="5409216892672462752">
                    <link role="variableDeclaration:3" targetNodeId="4853833103871114041" resolveInfo="scr" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="5409216892672462757">
                    <link role="baseMethodDeclaration:3" targetNodeId="6.6168415856807657228" resolveInfo="isValid" />
                  </node>
                </node>
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="5409216892672462748">
                  <property name="value:3" value="*** Script valid: " />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4853833103871243536">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4853833103871243537">
            <property name="name:3" value="res" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4853833103871243538">
              <link role="classifier:3" targetNodeId="6.1291978361072214397" resolveInfo="IResult" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4853833103871243539">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4853833103871243540">
                <link role="variableDeclaration:3" targetNodeId="4853833103871114041" resolveInfo="scr" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4853833103871243541">
                <link role="baseMethodDeclaration:3" targetNodeId="6.6168415856807657241" resolveInfo="execute" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4853833103871243542">
                  <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator:3" id="4853833103871243543">
                    <node role="cls:3" type="jetbrains.mps.baseLanguage.structure.AnonymousClass:3" id="4853833103871243544">
                      <property name="nonStatic:3" value="true" />
                      <link role="classifier:3" targetNodeId="6.6168415856807657250" resolveInfo="IMonitor" />
                      <link role="baseMethodDeclaration:3" targetNodeId="8.~Object.&lt;init&gt;()" resolveInfo="Object" />
                      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4853833103871243545" />
                      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4853833103871243546">
                        <property name="isAbstract:3" value="false" />
                        <property name="name:3" value="pleaseStop" />
                        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4853833103871243547" />
                        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="4853833103871243548" />
                        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4853833103871243549">
                          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4853833103871243550">
                            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="4853833103871243551">
                              <property name="value:3" value="false" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4853833103871243552">
                        <property name="isAbstract:3" value="false" />
                        <property name="name:3" value="relayQuery" />
                        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4853833103871243553">
                          <property name="name:3" value="query" />
                          <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4853833103871243554">
                            <link role="classifier:3" targetNodeId="6.8486446835277348318" resolveInfo="IQuery" />
                            <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="4853833103871243555">
                              <link role="typeVariableDeclaration:3" targetNodeId="4853833103871243557" resolveInfo="T" />
                            </node>
                          </node>
                        </node>
                        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4853833103871243556" />
                        <node role="typeVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration:3" id="4853833103871243557">
                          <property name="name:3" value="T" />
                          <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4853833103871243558">
                            <link role="classifier:3" targetNodeId="6.2551169102353043399" resolveInfo="IOption" />
                          </node>
                        </node>
                        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference:3" id="4853833103871244618">
                          <link role="typeVariableDeclaration:3" targetNodeId="4853833103871243557" resolveInfo="T" />
                        </node>
                        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4853833103871243560">
                          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4853833103871243561">
                            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4853833103871243562">
                              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4853833103871243563">
                                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4853833103871243564">
                                  <link role="baseMethodDeclaration:3" targetNodeId="4.2798840071352747005" resolveInfo="UIQueryRelayStrategy" />
                                </node>
                              </node>
                              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4853833103871243565">
                                <link role="baseMethodDeclaration:3" targetNodeId="4.2798840071352747441" resolveInfo="relayQuery" />
                                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4853833103871243566">
                                  <link role="variableDeclaration:3" targetNodeId="4853833103871243553" resolveInfo="query" />
                                </node>
                                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4853833103871243567">
                                  <node role="operand:3" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpression:0" id="4853833103871243568" />
                                  <node role="operation:3" type="jetbrains.mps.lang.plugin.structure.ActionDataParameterReferenceOperation:23" id="4853833103871243569">
                                    <link role="member:23" targetNodeId="4853833103871243502" resolveInfo="context" />
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
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4853833103871243514">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4853833103871243515">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference:3" id="4853833103871243516">
              <link role="classifier:3" targetNodeId="8.~System" />
              <link role="variableDeclaration:3" targetNodeId="8.~System.out" />
            </node>
            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4853833103871243517">
              <link role="baseMethodDeclaration:3" targetNodeId="2.~PrintStream.println(java.lang.String):void" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4853833103871243519">
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4853833103871243523">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4853833103871243574">
                    <link role="variableDeclaration:3" targetNodeId="4853833103871243537" resolveInfo="res" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4853833103871243575">
                    <link role="baseMethodDeclaration:3" targetNodeId="6.1291978361072214431" resolveInfo="isSucessful" />
                  </node>
                </node>
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4853833103871243518">
                  <property name="value:3" value="*** Success: " />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.make.facet.structure.FacetDeclaration:1" id="4853833103870841534">
    <property name="name:1" value="Generator" />
    <node role="targetDeclaration:1" type="jetbrains.mps.make.facet.structure.TargetDeclaration:1" id="4853833103870841535">
      <property name="name:1" value="ConfigureGenerator" />
      <node role="job:1" type="jetbrains.mps.make.script.structure.JobDeclaration" id="4853833103870841536">
        <node role="query" type="jetbrains.mps.make.script.structure.QueryDefinition" id="4853833103870841539">
          <property name="name" value="SaveTransientModels" />
          <node role="expected" type="jetbrains.mps.make.script.structure.ExpectedOption" id="4853833103870841542">
            <property name="name" value="SaveTransient" />
            <node role="option" type="jetbrains.mps.make.script.structure.Option" id="4853833103870841543">
              <property name="name" value="SAVE" />
              <node role="presentation" type="jetbrains.mps.make.script.structure.Text" id="4853833103870841544">
                <property name="text" value="Save" />
              </node>
            </node>
            <node role="option" type="jetbrains.mps.make.script.structure.Option" id="4853833103870841545">
              <property name="name" value="DONT_SAVE" />
              <node role="presentation" type="jetbrains.mps.make.script.structure.Text" id="4853833103870841546">
                <property name="text" value="Don't save" />
              </node>
            </node>
            <node role="option" type="jetbrains.mps.make.script.structure.Option" id="4853833103870841547">
              <property name="name" value="BUGGER_OFF" />
              <node role="presentation" type="jetbrains.mps.make.script.structure.Text" id="4853833103870841548">
                <property name="text" value="Don't save and stop asking" />
              </node>
            </node>
          </node>
          <node role="presentation" type="jetbrains.mps.make.script.structure.Text" id="4853833103870841541">
            <property name="text" value="Save transient models?" />
          </node>
        </node>
        <node role="query" type="jetbrains.mps.make.script.structure.QueryDefinition" id="3868725017587288810">
          <property name="name" value="WontAskAgain" />
          <node role="expected" type="jetbrains.mps.make.script.structure.ExpectedOption" id="3868725017587288813">
            <property name="name" value="rrr" />
            <node role="option" type="jetbrains.mps.make.script.structure.Option" id="3868725017587288814">
              <property name="name" value="SURE" />
              <node role="presentation" type="jetbrains.mps.make.script.structure.Text" id="3868725017587288815">
                <property name="text" value="Rrrrr!" />
              </node>
            </node>
          </node>
          <node role="presentation" type="jetbrains.mps.make.script.structure.Text" id="3868725017587288812">
            <property name="text" value="Oh, terribly sorry! Won't bother you again!" />
          </node>
        </node>
        <node role="job" type="jetbrains.mps.make.script.structure.JobDefinition" id="4853833103870841537">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4853833103870841538">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4853833103870917896">
              <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4853833103870917897">
                <property name="name:3" value="settings" />
                <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4853833103870917898">
                  <link role="classifier:3" targetNodeId="3.~GenerationSettings" resolveInfo="GenerationSettings" />
                </node>
                <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="4853833103870917899">
                  <link role="baseMethodDeclaration:3" targetNodeId="3.~GenerationSettings.getInstance():jetbrains.mps.ide.generator.GenerationSettings" resolveInfo="getInstance" />
                  <link role="classConcept:3" targetNodeId="3.~GenerationSettings" resolveInfo="GenerationSettings" />
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4853833103870917987">
              <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4853833103870917988">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.SwitchStatement:3" id="4853833103870919124">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4853833103870919128">
                    <node role="operand:3" type="jetbrains.mps.make.script.structure.MonitorParameter" id="4853833103870919127" />
                    <node role="operation:3" type="jetbrains.mps.make.script.structure.RelayQueryOperation" id="4853833103870919132">
                      <link role="query" targetNodeId="4853833103870841539" resolveInfo="SaveTransientModels" />
                    </node>
                  </node>
                  <node role="defaultBlock:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4853833103870919126">
                    <node role="statement:3" type="jetbrains.mps.make.script.structure.ResultStatement" id="4853833103871058538">
                      <property name="result" value="FAILURE" />
                    </node>
                  </node>
                  <node role="case:3" type="jetbrains.mps.baseLanguage.structure.SwitchCase:3" id="4853833103870919133">
                    <node role="expression:3" type="jetbrains.mps.make.script.structure.OptionExpression" id="4853833103870974954">
                      <link role="option" targetNodeId="4853833103870841543" resolveInfo="SAVE" />
                    </node>
                    <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4853833103870919135">
                      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="3868725017587287664">
                        <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="3868725017587288793">
                          <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="3868725017587288796">
                            <property name="value:3" value="true" />
                          </node>
                          <node role="lValue:3" type="jetbrains.mps.make.facet.structure.LocalVariablesComponentExpression:1" id="3868725017587287665">
                            <node role="operand:1" type="jetbrains.mps.make.facet.structure.LocalVariablesExpression:1" id="3868725017587287666" />
                            <node role="operation:1" type="jetbrains.mps.baseLanguage.tuples.structure.NamedTupleComponentAccessOperation:2" id="3868725017587287667">
                              <link role="component:2" targetNodeId="3868725017587287660" resolveInfo="saveTransient" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="4853833103871046642" />
                    </node>
                  </node>
                  <node role="case:3" type="jetbrains.mps.baseLanguage.structure.SwitchCase:3" id="4853833103870974955">
                    <node role="expression:3" type="jetbrains.mps.make.script.structure.OptionExpression" id="4853833103870974958">
                      <link role="option" targetNodeId="4853833103870841545" resolveInfo="DONT_SAVE" />
                    </node>
                    <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4853833103870974957">
                      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="3868725017587288798">
                        <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="3868725017587288802">
                          <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="3868725017587288805">
                            <property name="value:3" value="false" />
                          </node>
                          <node role="lValue:3" type="jetbrains.mps.make.facet.structure.LocalVariablesComponentExpression:1" id="3868725017587288799">
                            <node role="operand:1" type="jetbrains.mps.make.facet.structure.LocalVariablesExpression:1" id="3868725017587288800" />
                            <node role="operation:1" type="jetbrains.mps.baseLanguage.tuples.structure.NamedTupleComponentAccessOperation:2" id="3868725017587288801">
                              <link role="component:2" targetNodeId="3868725017587287660" resolveInfo="saveTransient" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="4853833103871046655" />
                    </node>
                  </node>
                  <node role="case:3" type="jetbrains.mps.baseLanguage.structure.SwitchCase:3" id="4853833103871046651">
                    <node role="expression:3" type="jetbrains.mps.make.script.structure.OptionExpression" id="4853833103871058524">
                      <link role="option" targetNodeId="4853833103870841547" resolveInfo="PISS_OFF" />
                    </node>
                    <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4853833103871046653">
                      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="3868725017587288819">
                        <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="3868725017587288821">
                          <node role="operand:3" type="jetbrains.mps.make.script.structure.MonitorParameter" id="3868725017587288820" />
                          <node role="operation:3" type="jetbrains.mps.make.script.structure.RelayQueryOperation" id="3868725017587288825">
                            <link role="query" targetNodeId="3868725017587288810" resolveInfo="WontAskAgain" />
                          </node>
                        </node>
                      </node>
                      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="4853833103871058537" />
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.make.script.structure.ResultStatement" id="4853833103871058540">
                  <property name="result" value="SUCCESS" />
                </node>
              </node>
              <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4853833103870917992">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4853833103870917991">
                  <link role="variableDeclaration:3" targetNodeId="4853833103870917897" resolveInfo="settings" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4853833103870919123">
                  <link role="baseMethodDeclaration:3" targetNodeId="3.~GenerationSettings.isSaveTransientModels():boolean" resolveInfo="isSaveTransientModels" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="variables:1" type="jetbrains.mps.make.facet.structure.VariablesDeclaration:1" id="3868725017587287658">
        <property name="name:1" value="Variables" />
        <node role="component:1" type="jetbrains.mps.baseLanguage.tuples.structure.NamedTupleComponentDeclaration:2" id="3868725017587287660">
          <property name="final:2" value="false" />
          <property name="name:2" value="saveTransient" />
          <node role="type:2" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="3868725017587287662" />
        </node>
        <node role="visibility:1" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="3868725017587287659" />
      </node>
    </node>
    <node role="targetDeclaration:1" type="jetbrains.mps.make.facet.structure.TargetDeclaration:1" id="4853833103871058541">
      <property name="name:1" value="GenerateFiles" />
      <node role="job:1" type="jetbrains.mps.make.script.structure.JobDeclaration" id="4853833103871058542">
        <node role="job" type="jetbrains.mps.make.script.structure.JobDefinition" id="4853833103871058543">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4853833103871058544">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="3868725017587290550">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="3868725017587290551">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference:3" id="3868725017587290552">
                  <link role="classifier:3" targetNodeId="8.~System" />
                  <link role="variableDeclaration:3" targetNodeId="8.~System.out" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="3868725017587290553">
                  <link role="baseMethodDeclaration:3" targetNodeId="2.~PrintStream.println(java.lang.String):void" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="3868725017587290555">
                    <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="3868725017587290554">
                      <property name="value:3" value="Save transient: " />
                    </node>
                    <node role="rightExpression:3" type="jetbrains.mps.make.facet.structure.ForeignVariablesComponentExpression:1" id="3868725017587290558">
                      <node role="operand:1" type="jetbrains.mps.make.facet.structure.ForeignVariablesExpression:1" id="3868725017587290559">
                        <link role="target:1" targetNodeId="4853833103870841535" resolveInfo="ConfigureGenerator" />
                      </node>
                      <node role="operation:1" type="jetbrains.mps.baseLanguage.tuples.structure.NamedTupleComponentAccessOperation:2" id="3868725017587290560">
                        <link role="component:2" targetNodeId="3868725017587287660" resolveInfo="saveTransient" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="dependency:1" type="jetbrains.mps.make.facet.structure.TargetDependency:1" id="4853833103871067851">
        <property name="qualifier:1" value="AFTER" />
        <link role="dependsOn:1" targetNodeId="4853833103870841535" resolveInfo="ConfigureGenerator" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.plugin.structure.ApplicationPluginDeclaration:23" id="5409216892672534934">
    <property name="name:23" value="Facets" />
    <node role="initBlock:23" type="jetbrains.mps.lang.plugin.structure.ApplicationPluginInitBlock:23" id="5409216892672534935">
      <node role="body:23" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5409216892672534936">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.TryCatchStatement:3" id="5409216892672539760">
          <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5409216892672539761">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="3294363946766345127">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="3294363946766345136">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="3294363946766345129">
                  <link role="classConcept:3" targetNodeId="12.~Logger" resolveInfo="Logger" />
                  <link role="baseMethodDeclaration:3" targetNodeId="12.~Logger.getLogger(java.lang.String):org.apache.log4j.Logger" resolveInfo="getLogger" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="3294363946766345130">
                    <property name="value:3" value="jetbrains.mps.make" />
                  </node>
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="3294363946766345698">
                  <link role="baseMethodDeclaration:3" targetNodeId="12.~Category.setLevel(org.apache.log4j.Level):void" resolveInfo="setLevel" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference:3" id="3294363946766345699">
                    <link role="classifier:3" targetNodeId="12.~Level" resolveInfo="Level" />
                    <link role="variableDeclaration:3" targetNodeId="12.~Level.INFO" resolveInfo="INFO" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6124869363107730716">
              <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6124869363107730717">
                <property name="name:3" value="inst" />
                <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6124869363107730718">
                  <link role="classifier:3" targetNodeId="8.~Object" resolveInfo="Object" />
                </node>
                <node role="initializer:3" type="jetbrains.mps.baseLanguageInternal.structure.InternalNewExpression:1" id="6124869363107802046">
                  <property name="fqClassName:1" value="jetbrains.mps.make.facet.plugin.FacetManifest" />
                  <node role="type:1" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="8691142010581638403">
                    <link role="classifier:3" targetNodeId="8.~Object" resolveInfo="Object" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="5409216892672535881">
              <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="5409216892672535882">
                <property name="name:3" value="mf" />
                <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5409216892672535883">
                  <link role="classifier:3" targetNodeId="8.~Class" resolveInfo="Class" />
                  <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.WildCardType:3" id="5409216892672535884" />
                </node>
                <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6124869363107802049">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6124869363107802048">
                    <link role="variableDeclaration:3" targetNodeId="6124869363107730717" resolveInfo="o" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6124869363107803178">
                    <link role="baseMethodDeclaration:3" targetNodeId="8.~Object.getClass():java.lang.Class" resolveInfo="getClass" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="5409216892672535923">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="5409216892672535924">
                <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="5409216892672535925">
                  <link role="variableDeclaration:3" targetNodeId="6124869363107730717" resolveInfo="inst" />
                </node>
                <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5409216892672535926">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpression:0" id="5409216892672535948" />
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldAccessOperation:0" id="5409216892672535949">
                    <link role="member:0" targetNodeId="5409216892672535944" resolveInfo="manifest" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="5409216892672535929">
              <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="5409216892672535930">
                <property name="name:3" value="mth" />
                <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5409216892672535931">
                  <link role="classifier:3" targetNodeId="9.~Method" resolveInfo="Method" />
                </node>
                <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5409216892672535932">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="5409216892672535933">
                    <link role="variableDeclaration:3" targetNodeId="5409216892672535882" resolveInfo="mf" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="5409216892672535934">
                    <link role="baseMethodDeclaration:3" targetNodeId="8.~Class.getMethod(java.lang.String,java.lang.Class...):java.lang.reflect.Method" resolveInfo="getMethod" />
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="5409216892672535935">
                      <property name="value:3" value="registerFacets" />
                    </node>
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="5409216892672535936">
                      <link role="classifier:3" targetNodeId="5.6168415856807659069" resolveInfo="FacetRegistry" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="5409216892672535937">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5409216892672535938">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="5409216892672535939">
                  <link role="variableDeclaration:3" targetNodeId="5409216892672535930" resolveInfo="mth" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="5409216892672535940">
                  <link role="baseMethodDeclaration:3" targetNodeId="9.~Method.invoke(java.lang.Object,java.lang.Object...):java.lang.Object" resolveInfo="invoke" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="5409216892672535941">
                    <link role="variableDeclaration:3" targetNodeId="6124869363107730717" resolveInfo="inst" />
                  </node>
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="5409216892672535942">
                    <link role="baseMethodDeclaration:3" targetNodeId="5.6168415856807659150" resolveInfo="getInstance" />
                    <link role="classConcept:3" targetNodeId="5.6168415856807659069" resolveInfo="FacetRegistry" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="catchClause:3" type="jetbrains.mps.baseLanguage.structure.CatchClause:3" id="5409216892672539763">
            <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="5409216892672539764">
              <property name="name:3" value="e" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5409216892672539767">
                <link role="classifier:3" targetNodeId="8.~Exception" resolveInfo="Exception" />
              </node>
            </node>
            <node role="catchBody:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5409216892672539766">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="8691142010581677242">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8691142010581677244">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8691142010581677243">
                    <link role="variableDeclaration:3" targetNodeId="5409216892672539764" resolveInfo="e" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8691142010581678354">
                    <link role="baseMethodDeclaration:3" targetNodeId="8.~Throwable.printStackTrace():void" resolveInfo="printStackTrace" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="fieldDeclaration:23" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldDeclaration:0" id="5409216892672535944">
      <property name="name:0" value="manifest" />
      <node role="visibility:0" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="5409216892672535945" />
      <node role="type:0" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5409216892672535947">
        <link role="classifier:3" targetNodeId="8.~Object" resolveInfo="Object" />
      </node>
    </node>
    <node role="disposeBlock:23" type="jetbrains.mps.lang.plugin.structure.ApplicationPluginDisposeBlock:23" id="5409216892672535950">
      <node role="body:23" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5409216892672535951">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.TryCatchStatement:3" id="5409216892672552393">
          <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5409216892672552394">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="5409216892672535954">
              <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="5409216892672535955">
                <property name="name:3" value="mf" />
                <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5409216892672535956">
                  <link role="classifier:3" targetNodeId="8.~Class" resolveInfo="Class" />
                  <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.WildCardType:3" id="5409216892672535957" />
                </node>
                <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6124869363107803183">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6124869363107803180">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpression:0" id="6124869363107803181" />
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldAccessOperation:0" id="6124869363107803182">
                      <link role="member:0" targetNodeId="5409216892672535944" resolveInfo="manifest" />
                    </node>
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6124869363107803187">
                    <link role="baseMethodDeclaration:3" targetNodeId="8.~Object.getClass():java.lang.Class" resolveInfo="getClass" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="5409216892672535966">
              <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="5409216892672535967">
                <property name="name:3" value="mth" />
                <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5409216892672535968">
                  <link role="classifier:3" targetNodeId="9.~Method" resolveInfo="Method" />
                </node>
                <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5409216892672535969">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="5409216892672535970">
                    <link role="variableDeclaration:3" targetNodeId="5409216892672535955" resolveInfo="mf" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="5409216892672535971">
                    <link role="baseMethodDeclaration:3" targetNodeId="8.~Class.getMethod(java.lang.String,java.lang.Class...):java.lang.reflect.Method" resolveInfo="getMethod" />
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="5409216892672535972">
                      <property name="value:3" value="unRegisterFacets" />
                    </node>
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="5409216892672535973">
                      <link role="classifier:3" targetNodeId="5.6168415856807659069" resolveInfo="FacetRegistry" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="5409216892672535974">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5409216892672535975">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="5409216892672535976">
                  <link role="variableDeclaration:3" targetNodeId="5409216892672535967" resolveInfo="mth" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="5409216892672535977">
                  <link role="baseMethodDeclaration:3" targetNodeId="9.~Method.invoke(java.lang.Object,java.lang.Object...):java.lang.Object" resolveInfo="invoke" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="5409216892672535982">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpression:0" id="5409216892672535983" />
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldAccessOperation:0" id="5409216892672535984">
                      <link role="member:0" targetNodeId="5409216892672535944" resolveInfo="manifest" />
                    </node>
                  </node>
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="5409216892672535979">
                    <link role="classConcept:3" targetNodeId="5.6168415856807659069" resolveInfo="FacetRegistry" />
                    <link role="baseMethodDeclaration:3" targetNodeId="5.6168415856807659150" resolveInfo="getInstance" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="catchClause:3" type="jetbrains.mps.baseLanguage.structure.CatchClause:3" id="5409216892672552396">
            <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="5409216892672552397">
              <property name="name:3" value="e" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="5409216892672552400">
                <link role="classifier:3" targetNodeId="8.~Exception" resolveInfo="Exception" />
              </node>
            </node>
            <node role="catchBody:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="5409216892672552399">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="8691142010581678355">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8691142010581678357">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8691142010581678356">
                    <link role="variableDeclaration:3" targetNodeId="5409216892672552397" resolveInfo="e" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8691142010581678361">
                    <link role="baseMethodDeclaration:3" targetNodeId="8.~Throwable.printStackTrace():void" resolveInfo="printStackTrace" />
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


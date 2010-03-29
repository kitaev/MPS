<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:b955964c-0fc4-409f-99d6-efa65acee108(jetbrains.mps.plugins.pluginparts.tabbedEditor)">
  <persistence version="4" />
  <refactoringHistory />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902db(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590283(jetbrains.mps.lang.core.constraints)" version="2" />
  <maxImportIndex value="13" />
  <import index="1" modelUID="f:java_stub#jetbrains.mps.ide.tabbedEditor.tabs(jetbrains.mps.ide.tabbedEditor.tabs@java_stub)" version="-1" />
  <import index="2" modelUID="f:java_stub#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)" version="-1" />
  <import index="3" modelUID="f:java_stub#jetbrains.mps.ide.tabbedEditor(jetbrains.mps.ide.tabbedEditor@java_stub)" version="-1" />
  <import index="4" modelUID="f:java_stub#jetbrains.mps.lang.structure.structure(jetbrains.mps.lang.structure.structure@java_stub)" version="-1" />
  <import index="5" modelUID="f:java_stub#jetbrains.mps.project(jetbrains.mps.project@java_stub)" version="-1" />
  <import index="6" modelUID="f:java_stub#java.util(java.util@java_stub)" version="-1" />
  <import index="7" modelUID="f:java_stub#jetbrains.mps.util(jetbrains.mps.util@java_stub)" version="-1" />
  <import index="8" modelUID="f:java_stub#jetbrains.mps.util.annotation(jetbrains.mps.util.annotation@java_stub)" version="-1" />
  <import index="9" modelUID="f:java_stub#javax.swing(javax.swing@java_stub)" version="-1" />
  <import index="10" modelUID="f:java_stub#java.awt(java.awt@java_stub)" version="-1" />
  <import index="11" modelUID="f:java_stub#jetbrains.mps.workbench(jetbrains.mps.workbench@java_stub)" version="-1" />
  <import index="12" modelUID="f:java_stub#com.intellij.openapi.actionSystem(com.intellij.openapi.actionSystem@java_stub)" version="-1" />
  <import index="13" modelUID="f:java_stub#com.intellij.ide(com.intellij.ide@java_stub)" version="-1" />
  <visible index="2" modelUID="f:java_stub#java.lang(java.lang@java_stub)" />
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="504431509334724271">
    <property name="abstractClass:3" value="true" />
    <property name="name:3" value="BaseMultiTab" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724272" />
    <node role="superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724273">
      <link role="classifier:3" targetNodeId="1.~BaseMultitabbedTab" />
    </node>
    <node role="staticInnerClassifiers:3" type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="504431509334724274">
      <property name="name:3" value="MySModelRepositoryAdapter" />
      <property name="nonStatic:3" value="true" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="504431509334724275" />
      <node role="superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724276">
        <link role="classifier:3" targetNodeId="2.~SModelRepositoryAdapter" />
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="504431509334724277">
        <property name="isFinal:3" value="true" />
        <property name="name:3" value="myLanguage" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724278">
          <link role="classifier:3" targetNodeId="2.~Language" />
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="504431509334724279" />
      </node>
      <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="504431509334724280">
        <property name="isFinal:3" value="true" />
        <property name="name:3" value="myAspect" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724281">
          <link role="classifier:3" targetNodeId="2.~LanguageAspect" />
        </node>
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="504431509334724282" />
      </node>
      <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="504431509334724283">
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724284" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="504431509334724285">
          <property name="name:3" value="language" />
          <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724286">
            <link role="classifier:3" targetNodeId="2.~Language" />
          </node>
        </node>
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="504431509334724287">
          <property name="name:3" value="aspect" />
          <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724288">
            <link role="classifier:3" targetNodeId="2.~LanguageAspect" />
          </node>
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724591">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="504431509334724592">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="504431509334724593">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724594">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="504431509334724595">
                  <link role="fieldDeclaration:3" targetNodeId="504431509334724277" resolveInfo="myLanguage" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724596" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="504431509334724597">
                <link role="variableDeclaration:3" targetNodeId="504431509334724285" resolveInfo="language" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="504431509334724598">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="504431509334724599">
              <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724600">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="504431509334724601">
                  <link role="fieldDeclaration:3" targetNodeId="504431509334724280" resolveInfo="myAspect" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724602" />
              </node>
              <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="504431509334724603">
                <link role="variableDeclaration:3" targetNodeId="504431509334724287" resolveInfo="aspect" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="504431509334724289">
        <property name="name:3" value="modelAdded" />
        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724290" />
        <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="504431509334724291" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="504431509334724292">
          <property name="name:3" value="modelDescriptor" />
          <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724293">
            <link role="classifier:3" targetNodeId="2.~SModelDescriptor" />
          </node>
        </node>
        <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724604">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="504431509334724605">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="504431509334724606">
              <link role="classConcept:3" targetNodeId="2.~ProjectModels" />
              <link role="baseMethodDeclaration:3" targetNodeId="2.~ProjectModels.isProjectModel(jetbrains.mps.smodel.SModelReference):boolean" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724607">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="504431509334724608">
                  <link role="variableDeclaration:3" targetNodeId="504431509334724292" resolveInfo="modelDescriptor" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724609">
                  <link role="baseMethodDeclaration:3" targetNodeId="2.~SModelDescriptor.getSModelReference():jetbrains.mps.smodel.SModelReference" />
                </node>
              </node>
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724610">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="504431509334724611" />
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="504431509334724612">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="504431509334724613">
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="504431509334724614">
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="504431509334724615">
                  <link role="classConcept:3" targetNodeId="2.~Language" />
                  <link role="baseMethodDeclaration:3" targetNodeId="2.~Language.getLanguageFor(jetbrains.mps.smodel.SModelDescriptor):jetbrains.mps.smodel.Language" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="504431509334724616">
                    <link role="variableDeclaration:3" targetNodeId="504431509334724292" resolveInfo="modelDescriptor" />
                  </node>
                </node>
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724617">
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="504431509334724618">
                    <link role="fieldDeclaration:3" targetNodeId="504431509334724277" resolveInfo="myLanguage" />
                  </node>
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724619" />
                </node>
              </node>
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="504431509334724620">
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="504431509334724621">
                  <link role="classConcept:3" targetNodeId="2.~Language" />
                  <link role="baseMethodDeclaration:3" targetNodeId="2.~Language.getModelAspect(jetbrains.mps.smodel.SModelDescriptor):jetbrains.mps.smodel.LanguageAspect" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="504431509334724622">
                    <link role="variableDeclaration:3" targetNodeId="504431509334724292" resolveInfo="modelDescriptor" />
                  </node>
                </node>
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724623">
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="504431509334724624">
                    <link role="fieldDeclaration:3" targetNodeId="504431509334724280" resolveInfo="myAspect" />
                  </node>
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724625" />
                </node>
              </node>
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724626">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="504431509334724627">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724628">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724629">
                    <link role="classConcept:3" targetNodeId="504431509334724271" resolveInfo="BaseMultiTab" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724630">
                    <link role="baseMethodDeclaration:3" targetNodeId="1.~BaseMultitabbedTab.addModelToListen(jetbrains.mps.smodel.SModelDescriptor):void" />
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="504431509334724631">
                      <link role="variableDeclaration:3" targetNodeId="504431509334724292" resolveInfo="modelDescriptor" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="504431509334724632">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724633">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="504431509334724634">
                    <link role="classConcept:3" targetNodeId="2.~SModelRepository" />
                    <link role="baseMethodDeclaration:3" targetNodeId="2.~SModelRepository.getInstance():jetbrains.mps.smodel.SModelRepository" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724635">
                    <link role="baseMethodDeclaration:3" targetNodeId="2.~SModelRepository.removeModelRepositoryListener(jetbrains.mps.smodel.SModelRepositoryListener):void" />
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724636" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="504431509334724294">
      <property name="name:3" value="myModelRepositoryListener" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724295">
        <link role="classifier:3" targetNodeId="504431509334724274" resolveInfo="BaseMultiTab.MySModelRepositoryAdapter" />
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="504431509334724296" />
      <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="504431509334724297" />
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="504431509334724298">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility:3" id="504431509334724299" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="504431509334724300">
        <property name="name:3" value="tabbedEditor" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724301">
          <link role="classifier:3" targetNodeId="3.~TabbedEditor" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="504431509334724302">
        <property name="name:3" value="baseNode" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724303">
          <link role="classifier:3" targetNodeId="2.~SNode" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="504431509334724304">
        <property name="name:3" value="adapterClass" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724305">
          <link role="classifier:3" targetNodeId="2v.~Class" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.UpperBoundType:3" id="504431509334724306">
            <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724307">
              <link role="classifier:3" targetNodeId="2.~BaseAdapter" />
            </node>
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724308">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation:3" id="504431509334724309">
          <link role="baseMethodDeclaration:3" targetNodeId="1.~BaseMultitabbedTab.&lt;init&gt;(jetbrains.mps.ide.tabbedEditor.TabbedEditor,jetbrains.mps.smodel.SNode,java.lang.Class)" />
          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="504431509334724310">
            <link role="variableDeclaration:3" targetNodeId="504431509334724300" resolveInfo="tabbedEditor" />
          </node>
          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="504431509334724311">
            <link role="variableDeclaration:3" targetNodeId="504431509334724302" resolveInfo="baseNode" />
          </node>
          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="504431509334724312">
            <link role="variableDeclaration:3" targetNodeId="504431509334724304" resolveInfo="adapterClass" />
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="504431509334724313">
      <property name="name:3" value="addMultitabbedListener" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724314" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="504431509334724315" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="504431509334724316">
        <property name="name:3" value="aspect" />
        <property name="isFinal:3" value="true" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724317">
          <link role="classifier:3" targetNodeId="2.~LanguageAspect" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724318">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="504431509334724319">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="504431509334724320">
            <property name="name:3" value="concept" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724321">
              <link role="classifier:3" targetNodeId="4.~AbstractConceptDeclaration" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="504431509334724322">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="504431509334724323">
                <link role="classConcept:3" targetNodeId="2.~BaseAdapter" />
                <link role="baseMethodDeclaration:3" targetNodeId="2.~BaseAdapter.fromNode(jetbrains.mps.smodel.SNode):jetbrains.mps.smodel.INodeAdapter" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724324">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724325" />
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724326">
                    <link role="baseMethodDeclaration:3" targetNodeId="1.~BaseMultitabbedTab.getBaseNode():jetbrains.mps.smodel.SNode" />
                  </node>
                </node>
              </node>
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724327">
                <link role="classifier:3" targetNodeId="4.~AbstractConceptDeclaration" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="504431509334724328">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="504431509334724329">
            <property name="name:3" value="language" />
            <property name="isFinal:3" value="true" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724330">
              <link role="classifier:3" targetNodeId="2.~Language" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="504431509334724331">
              <link role="classConcept:3" targetNodeId="2.~SModelUtil_new" />
              <link role="baseMethodDeclaration:3" targetNodeId="2.~SModelUtil_new.getDeclaringLanguage(jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration,jetbrains.mps.smodel.IScope):jetbrains.mps.smodel.Language" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="504431509334724332">
                <link role="variableDeclaration:3" targetNodeId="504431509334724320" resolveInfo="concept" />
              </node>
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="504431509334724333">
                <link role="classConcept:3" targetNodeId="5.~GlobalScope" />
                <link role="baseMethodDeclaration:3" targetNodeId="5.~GlobalScope.getInstance():jetbrains.mps.project.GlobalScope" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="504431509334724334">
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="504431509334724335">
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="504431509334724336">
              <link role="variableDeclaration:3" targetNodeId="504431509334724329" resolveInfo="language" />
            </node>
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="504431509334724337" />
          </node>
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724338">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="504431509334724339" />
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="504431509334724340">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="504431509334724341">
            <property name="name:3" value="aspectModelDescriptor" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724342">
              <link role="classifier:3" targetNodeId="2.~SModelDescriptor" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724343">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="504431509334724344">
                <link role="variableDeclaration:3" targetNodeId="504431509334724316" resolveInfo="aspect" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724345">
                <link role="baseMethodDeclaration:3" targetNodeId="2.~LanguageAspect.get(jetbrains.mps.smodel.Language):jetbrains.mps.smodel.SModelDescriptor" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="504431509334724346">
                  <link role="variableDeclaration:3" targetNodeId="504431509334724329" resolveInfo="language" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="504431509334724347">
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="504431509334724348">
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="504431509334724349">
              <link role="variableDeclaration:3" targetNodeId="504431509334724341" resolveInfo="aspectModelDescriptor" />
            </node>
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="504431509334724350" />
          </node>
          <node role="ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="504431509334724351">
            <node role="statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724352">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="504431509334724353">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="504431509334724354">
                  <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724355">
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="504431509334724356">
                      <link role="fieldDeclaration:3" targetNodeId="504431509334724294" resolveInfo="myModelRepositoryListener" />
                    </node>
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724357" />
                  </node>
                  <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="504431509334724358">
                    <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="504431509334724359">
                      <link role="baseMethodDeclaration:3" targetNodeId="504431509334724283" resolveInfo="BaseMultiTab.MySModelRepositoryAdapter" />
                      <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="504431509334724360">
                        <link role="variableDeclaration:3" targetNodeId="504431509334724329" resolveInfo="language" />
                      </node>
                      <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="504431509334724361">
                        <link role="variableDeclaration:3" targetNodeId="504431509334724316" resolveInfo="aspect" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="504431509334724362">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724363">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="504431509334724364">
                    <link role="classConcept:3" targetNodeId="2.~SModelRepository" />
                    <link role="baseMethodDeclaration:3" targetNodeId="2.~SModelRepository.getInstance():jetbrains.mps.smodel.SModelRepository" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724365">
                    <link role="baseMethodDeclaration:3" targetNodeId="2.~SModelRepository.addModelRepositoryListener(jetbrains.mps.smodel.SModelRepositoryListener):void" />
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724366">
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="504431509334724367">
                        <link role="fieldDeclaration:3" targetNodeId="504431509334724294" resolveInfo="myModelRepositoryListener" />
                      </node>
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724368" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724369">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="504431509334724370">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724371">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724372" />
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724373">
                  <link role="baseMethodDeclaration:3" targetNodeId="1.~BaseMultitabbedTab.addModelToListen(jetbrains.mps.smodel.SModelDescriptor):void" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="504431509334724374">
                    <link role="variableDeclaration:3" targetNodeId="504431509334724341" resolveInfo="aspectModelDescriptor" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="504431509334724375">
      <property name="name:3" value="tryToLoadNodes" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility:3" id="504431509334724376" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724377">
        <link role="classifier:3" targetNodeId="6.~List" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724378">
          <link role="classifier:3" targetNodeId="7.~Pair" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724379">
            <link role="classifier:3" targetNodeId="2.~SNode" />
          </node>
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724380">
            <link role="classifier:3" targetNodeId="2.~IOperationContext" />
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724381">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="504431509334724382">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="504431509334724383">
            <property name="name:3" value="res" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724384">
              <link role="classifier:3" targetNodeId="6.~List" />
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724385">
                <link role="classifier:3" targetNodeId="7.~Pair" />
                <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724386">
                  <link role="classifier:3" targetNodeId="2.~SNode" />
                </node>
                <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724387">
                  <link role="classifier:3" targetNodeId="2.~IOperationContext" />
                </node>
              </node>
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="504431509334724388">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="504431509334724389">
                <link role="baseMethodDeclaration:3" targetNodeId="6.~ArrayList.&lt;init&gt;()" />
                <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724390">
                  <link role="classifier:3" targetNodeId="7.~Pair" />
                  <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724391">
                    <link role="classifier:3" targetNodeId="2.~SNode" />
                  </node>
                  <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724392">
                    <link role="classifier:3" targetNodeId="2.~IOperationContext" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="504431509334724393">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="504431509334724394">
            <property name="name:3" value="baseNode" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724395">
              <link role="classifier:3" targetNodeId="2.~SNode" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724396">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724397" />
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724398">
                <link role="baseMethodDeclaration:3" targetNodeId="1.~BaseMultitabbedTab.getBaseNode():jetbrains.mps.smodel.SNode" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="504431509334724399">
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="504431509334724400">
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="504431509334724401">
              <link role="variableDeclaration:3" targetNodeId="504431509334724394" resolveInfo="baseNode" />
            </node>
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="504431509334724402" />
          </node>
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724403">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="504431509334724404">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="504431509334724405">
                <link role="variableDeclaration:3" targetNodeId="504431509334724383" resolveInfo="res" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="504431509334724406">
          <node role="iterable:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724407">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724408" />
            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724409">
              <link role="baseMethodDeclaration:3" targetNodeId="504431509334724570" resolveInfo="getNodes" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="504431509334724410">
                <link role="variableDeclaration:3" targetNodeId="504431509334724394" resolveInfo="baseNode" />
              </node>
            </node>
          </node>
          <node role="variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="504431509334724411">
            <property name="name:3" value="node" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724412">
              <link role="classifier:3" targetNodeId="2.~SNode" />
            </node>
          </node>
          <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724413">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="504431509334724414">
              <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="504431509334724415">
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="504431509334724416">
                  <link role="variableDeclaration:3" targetNodeId="504431509334724411" resolveInfo="node" />
                </node>
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="504431509334724417" />
              </node>
              <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724418">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ContinueStatement:3" id="504431509334724419" />
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="504431509334724420">
              <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="504431509334724421">
                <property name="name:3" value="project" />
                <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724422">
                  <link role="classifier:3" targetNodeId="5.~MPSProject" />
                </node>
                <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724423">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724424">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724425">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724426" />
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724427">
                        <link role="baseMethodDeclaration:3" targetNodeId="1.~BaseMultitabbedTab.getTabbedEditor():jetbrains.mps.ide.tabbedEditor.TabbedEditor" />
                      </node>
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724428">
                      <link role="baseMethodDeclaration:3" targetNodeId="3.~TabbedEditor.getOperationContext():jetbrains.mps.smodel.IOperationContext" />
                    </node>
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724429">
                    <link role="baseMethodDeclaration:3" targetNodeId="2.~IOperationContext.getMPSProject():jetbrains.mps.project.MPSProject" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="504431509334724430">
              <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="504431509334724431">
                <property name="name:3" value="module" />
                <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724432">
                  <link role="classifier:3" targetNodeId="5.~IModule" />
                </node>
                <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724433">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724434">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724435">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="504431509334724436">
                        <link role="variableDeclaration:3" targetNodeId="504431509334724411" resolveInfo="node" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724437">
                        <link role="baseMethodDeclaration:3" targetNodeId="2.~SNode.getModel():jetbrains.mps.smodel.SModel" />
                      </node>
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724438">
                      <link role="baseMethodDeclaration:3" targetNodeId="2.~SModel.getModelDescriptor():jetbrains.mps.smodel.SModelDescriptor" />
                    </node>
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724439">
                    <link role="baseMethodDeclaration:3" targetNodeId="2.~SModelDescriptor.getModule():jetbrains.mps.project.IModule" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="504431509334724440">
              <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="504431509334724441">
                <property name="name:3" value="context" />
                <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724442">
                  <link role="classifier:3" targetNodeId="2.~IOperationContext" />
                </node>
                <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="504431509334724443">
                  <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="504431509334724444">
                    <link role="baseMethodDeclaration:3" targetNodeId="5.~ModuleContext.&lt;init&gt;(jetbrains.mps.project.IModule,jetbrains.mps.project.MPSProject)" />
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="504431509334724445">
                      <link role="variableDeclaration:3" targetNodeId="504431509334724431" resolveInfo="module" />
                    </node>
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="504431509334724446">
                      <link role="variableDeclaration:3" targetNodeId="504431509334724421" resolveInfo="project" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="504431509334724447">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724448">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="504431509334724449">
                  <link role="variableDeclaration:3" targetNodeId="504431509334724383" resolveInfo="res" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724450">
                  <link role="baseMethodDeclaration:3" targetNodeId="6.~List.add(java.lang.Object):boolean" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="504431509334724451">
                    <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="504431509334724452">
                      <link role="baseMethodDeclaration:3" targetNodeId="7.~Pair.&lt;init&gt;(java.lang.Object,java.lang.Object)" />
                      <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724453">
                        <link role="classifier:3" targetNodeId="2.~SNode" />
                      </node>
                      <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724454">
                        <link role="classifier:3" targetNodeId="2.~IOperationContext" />
                      </node>
                      <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="504431509334724455">
                        <link role="variableDeclaration:3" targetNodeId="504431509334724411" resolveInfo="node" />
                      </node>
                      <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="504431509334724456">
                        <link role="variableDeclaration:3" targetNodeId="504431509334724441" resolveInfo="context" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="504431509334724457">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="504431509334724458">
            <link role="variableDeclaration:3" targetNodeId="504431509334724383" resolveInfo="res" />
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="504431509334724459">
        <link role="annotation:3" targetNodeId="8.~Hack" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="504431509334724460">
      <property name="name:3" value="createLoadableNode" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility:3" id="504431509334724461" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724462">
        <link role="classifier:3" targetNodeId="7.~Pair" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724463">
          <link role="classifier:3" targetNodeId="2.~SNode" />
        </node>
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724464">
          <link role="classifier:3" targetNodeId="2.~IOperationContext" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="504431509334724465">
        <property name="name:3" value="ask" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="504431509334724466" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="504431509334724467">
        <property name="name:3" value="concept" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724468">
          <link role="classifier:3" targetNodeId="2.~SNode" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724469">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="504431509334724470">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="504431509334724471">
            <property name="name:3" value="node" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724472">
              <link role="classifier:3" targetNodeId="2.~SNode" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724473">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724474" />
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724475">
                <link role="baseMethodDeclaration:3" targetNodeId="504431509334724581" resolveInfo="createNode" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724476">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724477" />
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724478">
                    <link role="baseMethodDeclaration:3" targetNodeId="1.~BaseMultitabbedTab.getBaseNode():jetbrains.mps.smodel.SNode" />
                  </node>
                </node>
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="504431509334724479">
                  <link role="variableDeclaration:3" targetNodeId="504431509334724465" resolveInfo="ask" />
                </node>
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="504431509334724480">
                  <link role="variableDeclaration:3" targetNodeId="504431509334724467" resolveInfo="concept" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="504431509334724481">
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="504431509334724482">
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="504431509334724483">
              <link role="variableDeclaration:3" targetNodeId="504431509334724471" resolveInfo="node" />
            </node>
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="504431509334724484" />
          </node>
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724485">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="504431509334724486">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="504431509334724487">
                <link role="classConcept:3" targetNodeId="9.~JOptionPane" />
                <link role="baseMethodDeclaration:3" targetNodeId="9.~JOptionPane.showMessageDialog(java.awt.Component,java.lang.Object,java.lang.String,int):void" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724488">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724489" />
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724490">
                    <link role="baseMethodDeclaration:3" targetNodeId="1.~BaseMultitabbedTab.getComponent():javax.swing.JComponent" />
                  </node>
                </node>
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="504431509334724491">
                  <property name="value:3" value="Node creation finished with errors." />
                </node>
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="504431509334724492">
                  <property name="value:3" value="Error" />
                </node>
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference:3" id="504431509334724493">
                  <link role="classifier:3" targetNodeId="9.~JOptionPane" />
                  <link role="variableDeclaration:3" targetNodeId="9.~JOptionPane.ERROR_MESSAGE" />
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="504431509334724494">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="504431509334724495" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="504431509334724496">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="504431509334724497">
            <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="504431509334724498">
              <link role="baseMethodDeclaration:3" targetNodeId="7.~Pair.&lt;init&gt;(java.lang.Object,java.lang.Object)" />
              <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724499">
                <link role="classifier:3" targetNodeId="2.~SNode" />
              </node>
              <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724500">
                <link role="classifier:3" targetNodeId="2.~IOperationContext" />
              </node>
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="504431509334724501">
                <link role="variableDeclaration:3" targetNodeId="504431509334724471" resolveInfo="node" />
              </node>
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724502">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724503">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724504" />
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724505">
                    <link role="baseMethodDeclaration:3" targetNodeId="1.~BaseMultitabbedTab.getTabbedEditor():jetbrains.mps.ide.tabbedEditor.TabbedEditor" />
                  </node>
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724506">
                  <link role="baseMethodDeclaration:3" targetNodeId="3.~TabbedEditor.getOperationContext():jetbrains.mps.smodel.IOperationContext" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="504431509334724507">
      <property name="name:3" value="askCreate" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724508" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="504431509334724509" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724510">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="504431509334724511">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724512">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724513" />
            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724514">
              <link role="baseMethodDeclaration:3" targetNodeId="504431509334724518" resolveInfo="askCreate" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724515">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724516" />
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724517">
                  <link role="baseMethodDeclaration:3" targetNodeId="1.~BaseMultitabbedTab.getBaseNode():jetbrains.mps.smodel.SNode" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="504431509334724518">
      <property name="name:3" value="askCreate" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724519" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="504431509334724520" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="504431509334724521">
        <property name="name:3" value="baseNode" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724522">
          <link role="classifier:3" targetNodeId="2.~SNode" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724523">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="504431509334724524">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="504431509334724525">
            <property name="name:3" value="entity" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724526">
              <link role="classifier:3" targetNodeId="2v.~String" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="504431509334724527">
              <link role="classConcept:3" targetNodeId="7.~NameUtil" />
              <link role="baseMethodDeclaration:3" targetNodeId="7.~NameUtil.singularize(java.lang.String):java.lang.String" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724528">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724529" />
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724530">
                  <link role="baseMethodDeclaration:3" targetNodeId="504431509334724562" resolveInfo="getTitle" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="504431509334724531">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="504431509334724532">
            <link role="classConcept:3" targetNodeId="504431509334724637" resolveInfo="TabHelper" />
            <link role="baseMethodDeclaration:3" targetNodeId="504431509334724642" resolveInfo="ask" />
            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="504431509334724533">
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="504431509334724534">
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="504431509334724535">
                  <property name="value:3" value="Do you want to create a new " />
                </node>
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="504431509334724536">
                  <link role="classConcept:3" targetNodeId="7.~NameUtil" />
                  <link role="baseMethodDeclaration:3" targetNodeId="7.~NameUtil.decapitalize(java.lang.String):java.lang.String" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="504431509334724537">
                    <link role="variableDeclaration:3" targetNodeId="504431509334724525" resolveInfo="entity" />
                  </node>
                </node>
              </node>
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="504431509334724538">
                <property name="value:3" value="?" />
              </node>
            </node>
            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="504431509334724539">
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="504431509334724540">
                <property name="value:3" value="Create New " />
              </node>
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="504431509334724541">
                <link role="variableDeclaration:3" targetNodeId="504431509334724525" resolveInfo="entity" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="504431509334724542">
      <property name="name:3" value="dispose" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724543" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="504431509334724544" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724545">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="504431509334724546">
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="504431509334724547">
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724548">
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="504431509334724549">
                <link role="fieldDeclaration:3" targetNodeId="504431509334724294" resolveInfo="myModelRepositoryListener" />
              </node>
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724550" />
            </node>
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="504431509334724551" />
          </node>
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724552">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="504431509334724553">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724554">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="504431509334724555">
                  <link role="classConcept:3" targetNodeId="2.~SModelRepository" />
                  <link role="baseMethodDeclaration:3" targetNodeId="2.~SModelRepository.getInstance():jetbrains.mps.smodel.SModelRepository" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724556">
                  <link role="baseMethodDeclaration:3" targetNodeId="2.~SModelRepository.removeModelRepositoryListener(jetbrains.mps.smodel.SModelRepositoryListener):void" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724557">
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="504431509334724558">
                      <link role="fieldDeclaration:3" targetNodeId="504431509334724294" resolveInfo="myModelRepositoryListener" />
                    </node>
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724559" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="504431509334724560">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.SuperMethodCall:3" id="504431509334724561">
            <link role="baseMethodDeclaration:3" targetNodeId="1.~BaseMultitabbedTab.dispose():void" />
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="504431509334724562">
      <property name="isAbstract:3" value="true" />
      <property name="name:3" value="getTitle" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724563" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724564">
        <link role="classifier:3" targetNodeId="2v.~String" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724565" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="504431509334724566">
      <property name="isAbstract:3" value="true" />
      <property name="name:3" value="getNullText" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724567" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724568">
        <link role="classifier:3" targetNodeId="2v.~String" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724569" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="504431509334724570">
      <property name="isAbstract:3" value="true" />
      <property name="name:3" value="getNodes" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724571" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724572">
        <link role="classifier:3" targetNodeId="6.~List" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724573">
          <link role="classifier:3" targetNodeId="2.~SNode" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="504431509334724574">
        <property name="name:3" value="node" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724575">
          <link role="classifier:3" targetNodeId="2.~SNode" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724576" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="504431509334724577">
      <property name="isAbstract:3" value="true" />
      <property name="name:3" value="canCreate" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724578" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="504431509334724579" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724580" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="504431509334724581">
      <property name="isAbstract:3" value="true" />
      <property name="name:3" value="createNode" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724582" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724583">
        <link role="classifier:3" targetNodeId="2.~SNode" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="504431509334724584">
        <property name="name:3" value="node" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724585">
          <link role="classifier:3" targetNodeId="2.~SNode" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="504431509334724586">
        <property name="name:3" value="ask" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="504431509334724587" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="504431509334724588">
        <property name="name:3" value="concept" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724589">
          <link role="classifier:3" targetNodeId="2.~SNode" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724590" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="504431509334724637">
    <property name="name:3" value="TabHelper" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724638" />
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="504431509334724639">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724640" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724641" />
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="504431509334724642">
      <property name="name:3" value="ask" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724643" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="504431509334724644" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="504431509334724645">
        <property name="name:3" value="msg" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724646">
          <link role="classifier:3" targetNodeId="2v.~String" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="504431509334724647">
        <property name="name:3" value="title" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724648">
          <link role="classifier:3" targetNodeId="2v.~String" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724649">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="504431509334724650">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="504431509334724651">
            <property name="name:3" value="frame" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724652">
              <link role="classifier:3" targetNodeId="10.~Frame" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724653">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference:3" id="504431509334724654">
                <link role="classifier:3" targetNodeId="11.~MPSDataKeys" />
                <link role="variableDeclaration:3" targetNodeId="11.~MPSDataKeys.FRAME" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724655">
                <link role="baseMethodDeclaration:3" targetNodeId="12.~DataKey.getData(com.intellij.openapi.actionSystem.DataContext):java.lang.Object" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724656">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="504431509334724657">
                    <link role="classConcept:3" targetNodeId="13.~DataManager" />
                    <link role="baseMethodDeclaration:3" targetNodeId="13.~DataManager.getInstance():com.intellij.ide.DataManager" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724658">
                    <link role="baseMethodDeclaration:3" targetNodeId="13.~DataManager.getDataContext():com.intellij.openapi.actionSystem.DataContext" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="504431509334724659">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="504431509334724660">
            <property name="name:3" value="result" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="504431509334724661" />
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="504431509334724662">
              <link role="classConcept:3" targetNodeId="9.~JOptionPane" />
              <link role="baseMethodDeclaration:3" targetNodeId="9.~JOptionPane.showConfirmDialog(java.awt.Component,java.lang.Object,java.lang.String,int):int" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="504431509334724663">
                <link role="variableDeclaration:3" targetNodeId="504431509334724651" resolveInfo="frame" />
              </node>
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="504431509334724664">
                <link role="variableDeclaration:3" targetNodeId="504431509334724645" resolveInfo="msg" />
              </node>
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="504431509334724665">
                <link role="variableDeclaration:3" targetNodeId="504431509334724647" resolveInfo="title" />
              </node>
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference:3" id="504431509334724666">
                <link role="classifier:3" targetNodeId="9.~JOptionPane" />
                <link role="variableDeclaration:3" targetNodeId="9.~JOptionPane.YES_NO_OPTION" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="504431509334724667">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="504431509334724668">
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="504431509334724669">
              <link role="variableDeclaration:3" targetNodeId="504431509334724660" resolveInfo="result" />
            </node>
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference:3" id="504431509334724670">
              <link role="classifier:3" targetNodeId="9.~JOptionPane" />
              <link role="variableDeclaration:3" targetNodeId="9.~JOptionPane.YES_NO_OPTION" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="504431509334724671">
    <property name="abstractClass:3" value="true" />
    <property name="name:3" value="BaseTabbedEditor" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724672" />
    <node role="superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724673">
      <link role="classifier:3" targetNodeId="3.~TabbedEditor" />
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="504431509334724674">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724675" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="504431509334724676">
        <property name="name:3" value="context" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724677">
          <link role="classifier:3" targetNodeId="2.~IOperationContext" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="504431509334724678">
        <property name="name:3" value="node" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724679">
          <link role="classifier:3" targetNodeId="2.~SNode" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724680">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation:3" id="504431509334724681">
          <link role="baseMethodDeclaration:3" targetNodeId="3.~TabbedEditor.&lt;init&gt;(jetbrains.mps.smodel.IOperationContext,jetbrains.mps.smodel.SNode)" />
          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="504431509334724682">
            <link role="variableDeclaration:3" targetNodeId="504431509334724676" resolveInfo="context" />
          </node>
          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="504431509334724683">
            <link role="variableDeclaration:3" targetNodeId="504431509334724678" resolveInfo="node" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="504431509334724684">
    <property name="abstractClass:3" value="true" />
    <property name="name:3" value="BaseSingleTab" />
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724685" />
    <node role="superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724686">
      <link role="classifier:3" targetNodeId="1.~BaseSingletabbedTab" />
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="504431509334724687">
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724688" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="504431509334724689">
        <property name="name:3" value="tabbedEditor" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724690">
          <link role="classifier:3" targetNodeId="3.~TabbedEditor" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="504431509334724691">
        <property name="name:3" value="baseNode" />
        <property name="isFinal:3" value="true" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724692">
          <link role="classifier:3" targetNodeId="2.~SNode" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="504431509334724693">
        <property name="name:3" value="adapterClass" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724694">
          <link role="classifier:3" targetNodeId="2v.~Class" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.UpperBoundType:3" id="504431509334724695">
            <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724696">
              <link role="classifier:3" targetNodeId="2.~BaseAdapter" />
            </node>
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724697">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation:3" id="504431509334724698">
          <link role="baseMethodDeclaration:3" targetNodeId="1.~BaseSingletabbedTab.&lt;init&gt;(jetbrains.mps.ide.tabbedEditor.TabbedEditor,jetbrains.mps.smodel.SNode,java.lang.Class)" />
          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="504431509334724699">
            <link role="variableDeclaration:3" targetNodeId="504431509334724689" resolveInfo="tabbedEditor" />
          </node>
          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="504431509334724700">
            <link role="variableDeclaration:3" targetNodeId="504431509334724691" resolveInfo="baseNode" />
          </node>
          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="504431509334724701">
            <link role="variableDeclaration:3" targetNodeId="504431509334724693" resolveInfo="adapterClass" />
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="504431509334724702">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724703">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724704" />
            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724705">
              <link role="baseMethodDeclaration:3" targetNodeId="1.~BaseSingletabbedTab.addListener(jetbrains.mps.util.Condition):void" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="504431509334724706">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator:3" id="504431509334724707">
                  <node role="cls:3" type="jetbrains.mps.baseLanguage.structure.AnonymousClass:3" id="504431509334724708">
                    <property name="name:3" value="" />
                    <link role="classifier:3" targetNodeId="7.~Condition" resolveInfo="Condition" />
                    <link role="baseMethodDeclaration:3" targetNodeId="2v.~Object.&lt;init&gt;()" />
                    <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724709">
                      <link role="classifier:3" targetNodeId="2.~SModelDescriptor" resolveInfo="SModelDescriptor" />
                    </node>
                    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="504431509334724710">
                      <property name="name:3" value="met" />
                      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724711" />
                      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="504431509334724712" />
                      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="504431509334724713">
                        <property name="name:3" value="modelDescriptor" />
                        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724714">
                          <link role="classifier:3" targetNodeId="2.~SModelDescriptor" />
                        </node>
                      </node>
                      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724823">
                        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="504431509334724824">
                          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="504431509334724825">
                            <link role="classConcept:3" targetNodeId="7.~EqualUtil" />
                            <link role="baseMethodDeclaration:3" targetNodeId="7.~EqualUtil.equals(java.lang.Object,java.lang.Object):boolean" />
                            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724826">
                              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724827">
                                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="504431509334724828">
                                  <link role="variableDeclaration:3" targetNodeId="504431509334724713" resolveInfo="modelDescriptor" />
                                </node>
                                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724829">
                                  <link role="baseMethodDeclaration:3" targetNodeId="2.~SModelDescriptor.getSModel():jetbrains.mps.smodel.SModel" />
                                </node>
                              </node>
                              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724830">
                                <link role="baseMethodDeclaration:3" targetNodeId="2.~SModel.getSModelId():jetbrains.mps.smodel.SModelId" />
                              </node>
                            </node>
                            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724831">
                              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724832">
                                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="504431509334724833">
                                  <link role="variableDeclaration:3" targetNodeId="504431509334724691" resolveInfo="baseNode" />
                                </node>
                                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724834">
                                  <link role="baseMethodDeclaration:3" targetNodeId="2.~SNode.getModel():jetbrains.mps.smodel.SModel" />
                                </node>
                              </node>
                              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724835">
                                <link role="baseMethodDeclaration:3" targetNodeId="2.~SModel.getSModelId():jetbrains.mps.smodel.SModelId" />
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
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="504431509334724715">
      <property name="name:3" value="addSingletabbedListener" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724716" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="504431509334724717" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="504431509334724718">
        <property name="name:3" value="aspect" />
        <property name="isFinal:3" value="true" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724719">
          <link role="classifier:3" targetNodeId="2.~LanguageAspect" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724720">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="504431509334724721">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="504431509334724722">
            <property name="name:3" value="concept" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724723">
              <link role="classifier:3" targetNodeId="4.~AbstractConceptDeclaration" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="504431509334724724">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="504431509334724725">
                <link role="classConcept:3" targetNodeId="2.~BaseAdapter" />
                <link role="baseMethodDeclaration:3" targetNodeId="2.~BaseAdapter.fromNode(jetbrains.mps.smodel.SNode):jetbrains.mps.smodel.INodeAdapter" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724726">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724727" />
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724728">
                    <link role="baseMethodDeclaration:3" targetNodeId="1.~BaseSingletabbedTab.getBaseNode():jetbrains.mps.smodel.SNode" />
                  </node>
                </node>
              </node>
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724729">
                <link role="classifier:3" targetNodeId="4.~AbstractConceptDeclaration" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="504431509334724730">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="504431509334724731">
            <property name="name:3" value="language" />
            <property name="isFinal:3" value="true" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724732">
              <link role="classifier:3" targetNodeId="2.~Language" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="504431509334724733">
              <link role="classConcept:3" targetNodeId="2.~SModelUtil_new" />
              <link role="baseMethodDeclaration:3" targetNodeId="2.~SModelUtil_new.getDeclaringLanguage(jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration,jetbrains.mps.smodel.IScope):jetbrains.mps.smodel.Language" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="504431509334724734">
                <link role="variableDeclaration:3" targetNodeId="504431509334724722" resolveInfo="concept" />
              </node>
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="504431509334724735">
                <link role="classConcept:3" targetNodeId="5.~GlobalScope" />
                <link role="baseMethodDeclaration:3" targetNodeId="5.~GlobalScope.getInstance():jetbrains.mps.project.GlobalScope" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="504431509334724736">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724737">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724738" />
            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724739">
              <link role="baseMethodDeclaration:3" targetNodeId="1.~BaseSingletabbedTab.addListener(jetbrains.mps.util.Condition):void" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="504431509334724740">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator:3" id="504431509334724741">
                  <node role="cls:3" type="jetbrains.mps.baseLanguage.structure.AnonymousClass:3" id="504431509334724742">
                    <property name="name:3" value="" />
                    <link role="classifier:3" targetNodeId="7.~Condition" resolveInfo="Condition" />
                    <link role="baseMethodDeclaration:3" targetNodeId="2v.~Object.&lt;init&gt;()" />
                    <node role="typeParameter:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724743">
                      <link role="classifier:3" targetNodeId="2.~SModelDescriptor" resolveInfo="SModelDescriptor" />
                    </node>
                    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="504431509334724744">
                      <property name="name:3" value="met" />
                      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724745" />
                      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="504431509334724746" />
                      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="504431509334724747">
                        <property name="name:3" value="modelDescriptor" />
                        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724748">
                          <link role="classifier:3" targetNodeId="2.~SModelDescriptor" />
                        </node>
                      </node>
                      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724836">
                        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="504431509334724837">
                          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="504431509334724838">
                            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="504431509334724839">
                              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="504431509334724840">
                                <link role="classConcept:3" targetNodeId="2.~Language" />
                                <link role="baseMethodDeclaration:3" targetNodeId="2.~Language.getLanguageFor(jetbrains.mps.smodel.SModelDescriptor):jetbrains.mps.smodel.Language" />
                                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="504431509334724841">
                                  <link role="variableDeclaration:3" targetNodeId="504431509334724747" resolveInfo="modelDescriptor" />
                                </node>
                              </node>
                              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="504431509334724842">
                                <link role="variableDeclaration:3" targetNodeId="504431509334724731" resolveInfo="language" />
                              </node>
                            </node>
                            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="504431509334724843">
                              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="504431509334724844">
                                <link role="classConcept:3" targetNodeId="2.~Language" />
                                <link role="baseMethodDeclaration:3" targetNodeId="2.~Language.getModelAspect(jetbrains.mps.smodel.SModelDescriptor):jetbrains.mps.smodel.LanguageAspect" />
                                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="504431509334724845">
                                  <link role="variableDeclaration:3" targetNodeId="504431509334724747" resolveInfo="modelDescriptor" />
                                </node>
                              </node>
                              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="504431509334724846">
                                <link role="variableDeclaration:3" targetNodeId="504431509334724718" resolveInfo="aspect" />
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
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="504431509334724749">
      <property name="name:3" value="tryToLoadNode" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724750" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724751">
        <link role="classifier:3" targetNodeId="2.~SNode" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724752">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="504431509334724753">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724754">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724755" />
            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724756">
              <link role="baseMethodDeclaration:3" targetNodeId="504431509334724811" resolveInfo="getNode" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724757">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724758" />
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724759">
                  <link role="baseMethodDeclaration:3" targetNodeId="1.~BaseSingletabbedTab.getBaseNode():jetbrains.mps.smodel.SNode" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="504431509334724760">
      <property name="name:3" value="createLoadableNode" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724761" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724762">
        <link role="classifier:3" targetNodeId="2.~SNode" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724763">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="504431509334724764">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724765">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724766" />
            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724767">
              <link role="baseMethodDeclaration:3" targetNodeId="504431509334724817" resolveInfo="createNode" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724768">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724769" />
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724770">
                  <link role="baseMethodDeclaration:3" targetNodeId="1.~BaseSingletabbedTab.getBaseNode():jetbrains.mps.smodel.SNode" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="504431509334724771">
      <property name="name:3" value="askCreate" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724772" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="504431509334724773" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724774">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="504431509334724775">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724776">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724777" />
            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724778">
              <link role="baseMethodDeclaration:3" targetNodeId="504431509334724782" resolveInfo="askCreate" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724779">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724780" />
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724781">
                  <link role="baseMethodDeclaration:3" targetNodeId="1.~BaseSingletabbedTab.getBaseNode():jetbrains.mps.smodel.SNode" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="504431509334724782">
      <property name="name:3" value="askCreate" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724783" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="504431509334724784" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="504431509334724785">
        <property name="name:3" value="baseNode" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724786">
          <link role="classifier:3" targetNodeId="2.~SNode" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724787">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="504431509334724788">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="504431509334724789">
            <link role="classConcept:3" targetNodeId="504431509334724637" resolveInfo="TabHelper" />
            <link role="baseMethodDeclaration:3" targetNodeId="504431509334724642" resolveInfo="ask" />
            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="504431509334724790">
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="504431509334724791">
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="504431509334724792">
                  <property name="value:3" value="Do you want to create a new " />
                </node>
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="504431509334724793">
                  <link role="classConcept:3" targetNodeId="7.~NameUtil" />
                  <link role="baseMethodDeclaration:3" targetNodeId="7.~NameUtil.decapitalize(java.lang.String):java.lang.String" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724794">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724795" />
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724796">
                      <link role="baseMethodDeclaration:3" targetNodeId="504431509334724803" resolveInfo="getTitle" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="504431509334724797">
                <property name="value:3" value="?" />
              </node>
            </node>
            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="504431509334724798">
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="504431509334724799">
                <property name="value:3" value="Create New " />
              </node>
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="504431509334724800">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="504431509334724801" />
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="504431509334724802">
                  <link role="baseMethodDeclaration:3" targetNodeId="504431509334724803" resolveInfo="getTitle" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="504431509334724803">
      <property name="isAbstract:3" value="true" />
      <property name="name:3" value="getTitle" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724804" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724805">
        <link role="classifier:3" targetNodeId="2v.~String" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724806" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="504431509334724807">
      <property name="isAbstract:3" value="true" />
      <property name="name:3" value="getNullText" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724808" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724809">
        <link role="classifier:3" targetNodeId="2v.~String" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724810" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="504431509334724811">
      <property name="isAbstract:3" value="true" />
      <property name="name:3" value="getNode" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724812" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724813">
        <link role="classifier:3" targetNodeId="2.~SNode" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="504431509334724814">
        <property name="name:3" value="node" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724815">
          <link role="classifier:3" targetNodeId="2.~SNode" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724816" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="504431509334724817">
      <property name="isAbstract:3" value="true" />
      <property name="name:3" value="createNode" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="504431509334724818" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724819">
        <link role="classifier:3" targetNodeId="2.~SNode" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="504431509334724820">
        <property name="name:3" value="node" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="504431509334724821">
          <link role="classifier:3" targetNodeId="2.~SNode" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="504431509334724822" />
    </node>
  </node>
</model>


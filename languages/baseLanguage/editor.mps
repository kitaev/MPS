<?xml version="1.0" encoding="UTF-8"?>
<model namespace="jetbrains.mps.baseLanguage">
  <maxReferenceID value="20" />
  <language namespace="jetbrains.mps.bootstrap.editorLanguage" />
  <language namespace="jetbrains.mps.baseLanguage" />
  <import referenceID="8" name="structure" namespace="jetbrains.mps.baseLanguage" />
  <import referenceID="9" name="structure" namespace="jetbrains.mps.core" />
  <import referenceID="14" name="lang" namespace="java" />
  <import referenceID="15" name="semanticModel" namespace="jetbrains.mps" />
  <import referenceID="16" name="util" namespace="java" />
  <import referenceID="17" name="structureLanguage" namespace="jetbrains.mps.bootstrap" />
  <import referenceID="18" name="core" namespace="jetbrains.mps" />
  <import referenceID="19" name="baseLanguage" namespace="jetbrains.mps" />
  <import referenceID="21" name="generator" namespace="jetbrains.mps" />
  <import referenceID="22" name="collectionLanguage" namespace="jetbrains.mps" />
  <import referenceID="23" name="findUsages" namespace="jetbrains.mps" />
  <import referenceID="20" name="nodeEditor" namespace="jetbrains.mps" />
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1115664491666">
    <property name="name" value="__util" />
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664491667">
      <property name="name" value="_SemanticModelQuery_AllPrimativeTypes" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664491668">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491669">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491670">
        <link role="classifier" targetNodeId="16.1087811448220" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664491671">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664491672">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664491673">
            <property name="name" value="list" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491674">
              <link role="classifier" targetNodeId="16.1087811448220" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941765">
              <link role="baseMethodDeclaration" targetNodeId="1115664491683" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941766">
                <link role="classifier" targetNodeId="1115664491666" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664491675">
                <link role="variableDeclaration" targetNodeId="1115664491668" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664491676">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491677">
            <link role="baseMethodDeclaration" targetNodeId="16.1087811448229" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491678">
              <link role="variableDeclaration" targetNodeId="1115664491673" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664407708">
              <link role="baseMethodDeclaration" targetNodeId="18.1086856195751" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664407582">
                <link role="classifier" targetNodeId="19.1113723509695" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491679">
                <link role="baseMethodDeclaration" targetNodeId="15.1086945615528" />
                <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664491680">
                  <link role="variableDeclaration" targetNodeId="1115664491668" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664491681">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491682">
            <link role="variableDeclaration" targetNodeId="1115664491673" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664491683">
      <property name="name" value="_SemanticModelQuery_AllVariablePrimativeTypes" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664491684">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491685">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491686">
        <link role="classifier" targetNodeId="16.1087811448220" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664491687">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664491688">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664491689">
            <property name="name" value="list" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491690">
              <link role="classifier" targetNodeId="16.1087811448220" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NewExpression" id="1115664491691">
              <node role="constructorCall" type="jetbrains.mps.baseLanguage.ConstructorCall" id="1115664491692">
                <link role="baseMethodDeclaration" targetNodeId="16.1087811448225" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664491693">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664491694">
            <property name="name" value="model" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491695">
              <link role="classifier" targetNodeId="15.1086945614636" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491696">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945615528" />
              <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664491697">
                <link role="variableDeclaration" targetNodeId="1115664491684" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664491698">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491699">
            <link role="baseMethodDeclaration" targetNodeId="16.1087811448229" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491700">
              <link role="variableDeclaration" targetNodeId="1115664491689" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664407803">
              <link role="baseMethodDeclaration" targetNodeId="18.1086856195751" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664407756">
                <link role="classifier" targetNodeId="19.1113723508724" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491701">
                <link role="variableDeclaration" targetNodeId="1115664491694" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664491702">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491703">
            <link role="baseMethodDeclaration" targetNodeId="16.1087811448229" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491704">
              <link role="variableDeclaration" targetNodeId="1115664491689" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664407868">
              <link role="baseMethodDeclaration" targetNodeId="18.1086856195751" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664407836">
                <link role="classifier" targetNodeId="19.1113723508911" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491705">
                <link role="variableDeclaration" targetNodeId="1115664491694" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664491706">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491707">
            <link role="baseMethodDeclaration" targetNodeId="16.1087811448229" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491708">
              <link role="variableDeclaration" targetNodeId="1115664491689" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664407964">
              <link role="baseMethodDeclaration" targetNodeId="18.1086856195751" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664407916">
                <link role="classifier" targetNodeId="19.1113723509323" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491709">
                <link role="variableDeclaration" targetNodeId="1115664491694" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664491710">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491711">
            <link role="baseMethodDeclaration" targetNodeId="16.1087811448229" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491712">
              <link role="variableDeclaration" targetNodeId="1115664491689" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664408044">
              <link role="baseMethodDeclaration" targetNodeId="18.1086856195751" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664407996">
                <link role="classifier" targetNodeId="19.1113723507528" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491713">
                <link role="variableDeclaration" targetNodeId="1115664491694" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664491714">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491715">
            <link role="baseMethodDeclaration" targetNodeId="16.1087811448229" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491716">
              <link role="variableDeclaration" targetNodeId="1115664491689" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664408093">
              <link role="baseMethodDeclaration" targetNodeId="18.1086856195751" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664408060">
                <link role="classifier" targetNodeId="19.1113723507652" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491717">
                <link role="variableDeclaration" targetNodeId="1115664491694" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664491718">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491719">
            <link role="baseMethodDeclaration" targetNodeId="16.1087811448229" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491720">
              <link role="variableDeclaration" targetNodeId="1115664491689" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664408188">
              <link role="baseMethodDeclaration" targetNodeId="18.1086856195751" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664408125">
                <link role="classifier" targetNodeId="19.1113723507586" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491721">
                <link role="variableDeclaration" targetNodeId="1115664491694" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664491722">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491723">
            <link role="baseMethodDeclaration" targetNodeId="16.1087811448229" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491724">
              <link role="variableDeclaration" targetNodeId="1115664491689" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664408269">
              <link role="baseMethodDeclaration" targetNodeId="18.1086856195751" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664408221">
                <link role="classifier" targetNodeId="19.1113723508450" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491725">
                <link role="variableDeclaration" targetNodeId="1115664491694" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664491726">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491727">
            <link role="baseMethodDeclaration" targetNodeId="16.1087811448229" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491728">
              <link role="variableDeclaration" targetNodeId="1115664491689" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664408349">
              <link role="baseMethodDeclaration" targetNodeId="18.1086856195751" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664408301">
                <link role="classifier" targetNodeId="19.1113723508020" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491729">
                <link role="variableDeclaration" targetNodeId="1115664491694" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664491730">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491731">
            <link role="variableDeclaration" targetNodeId="1115664491689" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664491732">
      <property name="name" value="_SubstituteItemTextProvider_JavaElementText" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664491733">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491734">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664491735">
        <property name="name" value="itemObject" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491736">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491737">
        <link role="classifier" targetNodeId="14.1086945614127" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664491738">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664491739">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664491740">
            <property name="name" value="itemNode" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491741">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664491742">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491743">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664491744">
                <link role="variableDeclaration" targetNodeId="1115664491735" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664491745">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664491746">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664491747">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664491748">
                <property name="name" value="javaClassType" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491749">
                  <link role="classifier" targetNodeId="19.1108062816180" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664491750">
                  <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491751">
                    <link role="variableDeclaration" targetNodeId="1115664491740" />
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491752">
                    <link role="classifier" targetNodeId="19.1108062816180" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664491753">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491754">
                <link role="baseMethodDeclaration" targetNodeId="18.1086856195749" />
                <node role="instance" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491755">
                  <link role="baseMethodDeclaration" targetNodeId="19.1108062824398" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491756">
                    <link role="variableDeclaration" targetNodeId="1115664491748" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664491757">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491758">
              <link role="variableDeclaration" targetNodeId="1115664491740" />
            </node>
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491759">
              <link role="classifier" targetNodeId="19.1108062816180" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664491760">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664491761">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664491762">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664491763">
                <property name="name" value="baseMethodDeclaration" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664408397">
                  <link role="classifier" targetNodeId="19.1109971953619" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664491764">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664408413">
                    <link role="classifier" targetNodeId="19.1109971953619" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491765">
                    <link role="variableDeclaration" targetNodeId="1115664491740" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664491766">
              <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1115664491767">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1115664491768">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1115664491769">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941783">
                      <link role="baseMethodDeclaration" targetNodeId="1115664491799" />
                      <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941784">
                        <link role="classifier" targetNodeId="1115664491666" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664491770">
                        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664408478">
                          <link role="classifier" targetNodeId="19.1109971953619" />
                        </node>
                        <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491771">
                          <link role="variableDeclaration" targetNodeId="1115664491740" />
                        </node>
                      </node>
                    </node>
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1115664491772">
                      <property name="value" value=")" />
                    </node>
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1115664491773">
                    <property name="value" value="(" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491774">
                  <link role="baseMethodDeclaration" targetNodeId="18.1086856195749" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491775">
                    <link role="variableDeclaration" targetNodeId="1115664491763" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664491776">
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664408494">
              <link role="classifier" targetNodeId="19.1109971953619" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491777">
              <link role="variableDeclaration" targetNodeId="1115664491740" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664491778">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664491779">
            <property name="name" value="text" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491780">
              <link role="classifier" targetNodeId="14.1086945614127" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491781">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945615657" />
              <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491782">
                <link role="variableDeclaration" targetNodeId="1115664491740" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664491783">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664491784">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664491785">
              <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491786">
                <link role="variableDeclaration" targetNodeId="1115664491779" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.AndExpression" id="1115664491787">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664491788">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491789">
                <link role="variableDeclaration" targetNodeId="1115664491779" />
              </node>
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664491790" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.GreaterThanExpression" id="1115664491791">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491792">
                <link role="baseMethodDeclaration" targetNodeId="14.1086945614242" />
                <node role="instance" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491793">
                  <link role="baseMethodDeclaration" targetNodeId="14.1086945614348" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491794">
                    <link role="variableDeclaration" targetNodeId="1115664491779" />
                  </node>
                </node>
              </node>
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1115664491795">
                <property name="value" value="0" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664491796">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491797">
            <link role="baseMethodDeclaration" targetNodeId="15.1086945615639" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491798">
              <link role="variableDeclaration" targetNodeId="1115664491740" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664491799">
      <property name="name" value="_GetParametersText" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664491800">
        <property name="name" value="baseMethodDeclaration" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664406484">
          <link role="classifier" targetNodeId="19.1109971953619" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491801">
        <link role="classifier" targetNodeId="14.1086945614127" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664491802">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664491803">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664491804">
            <property name="name" value="paramsText" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491805">
              <link role="classifier" targetNodeId="14.1086945614127" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StringLiteral" id="1115664491806">
              <property name="value" value="" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664491807">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664491808">
            <property name="name" value="iterator" />
            <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664491809">
              <link role="classifier" targetNodeId="16.1087908128062" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664408558">
              <link role="baseMethodDeclaration" targetNodeId="19.1109971953999" />
              <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664491810">
                <link role="variableDeclaration" targetNodeId="1115664491800" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664491811">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664491812">
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664491813">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664491814">
                <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664491815">
                  <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664491816">
                    <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491817">
                      <link role="variableDeclaration" targetNodeId="1115664491804" />
                    </node>
                    <node role="rValue" type="jetbrains.mps.baseLanguage.PlusExpression" id="1115664491818">
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491819">
                        <link role="variableDeclaration" targetNodeId="1115664491804" />
                      </node>
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1115664491820">
                        <property name="value" value="," />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.GreaterThanExpression" id="1115664491821">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491822">
                  <link role="baseMethodDeclaration" targetNodeId="14.1086945614242" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491823">
                    <link role="variableDeclaration" targetNodeId="1115664491804" />
                  </node>
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1115664491824">
                  <property name="value" value="0" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664491825">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664491826">
                <property name="name" value="parameterDeclaration" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664408590">
                  <link role="classifier" targetNodeId="19.1109971953670" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664491827">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664408622">
                    <link role="classifier" targetNodeId="19.1109971953670" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491828">
                    <link role="baseMethodDeclaration" targetNodeId="16.1087908128065" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491829">
                      <link role="variableDeclaration" targetNodeId="1115664491808" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664491830">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664491831">
                <property name="name" value="paramType" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491832">
                  <link role="classifier" targetNodeId="19.1108060339906" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664408639">
                  <link role="baseMethodDeclaration" targetNodeId="19.1109971953100" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491833">
                    <link role="variableDeclaration" targetNodeId="1115664491826" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664491834">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664491835">
                <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664491836">
                  <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664491837">
                    <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491838">
                      <link role="variableDeclaration" targetNodeId="1115664491804" />
                    </node>
                    <node role="rValue" type="jetbrains.mps.baseLanguage.PlusExpression" id="1115664491839">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1115664491840">
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491841">
                          <link role="baseMethodDeclaration" targetNodeId="18.1086856195749" />
                          <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491842">
                            <link role="variableDeclaration" targetNodeId="1115664491831" />
                          </node>
                        </node>
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1115664491843">
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1115664491844">
                            <property name="value" value=" " />
                          </node>
                          <node role="rightExpression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491845">
                            <link role="baseMethodDeclaration" targetNodeId="18.1086856195749" />
                            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491846">
                              <link role="variableDeclaration" targetNodeId="1115664491826" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491847">
                        <link role="variableDeclaration" targetNodeId="1115664491804" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664491848">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491849">
                  <link role="variableDeclaration" targetNodeId="1115664491831" />
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664491850" />
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664491851">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664491852">
                <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664491853">
                  <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664491854">
                    <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491855">
                      <link role="variableDeclaration" targetNodeId="1115664491804" />
                    </node>
                    <node role="rValue" type="jetbrains.mps.baseLanguage.PlusExpression" id="1115664491856">
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1115664491857">
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1115664491858">
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491859">
                            <link role="variableDeclaration" targetNodeId="1115664491804" />
                          </node>
                          <node role="rightExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1115664491860">
                            <property name="value" value="???" />
                          </node>
                        </node>
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1115664491861">
                          <property name="value" value=" " />
                        </node>
                      </node>
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491862">
                        <link role="baseMethodDeclaration" targetNodeId="18.1086856195749" />
                        <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491863">
                          <link role="variableDeclaration" targetNodeId="1115664491826" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1115664491864">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491865">
                  <link role="variableDeclaration" targetNodeId="1115664491831" />
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664491866" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491867">
            <link role="baseMethodDeclaration" targetNodeId="16.1087908128063" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491868">
              <link role="variableDeclaration" targetNodeId="1115664491808" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664491869">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491870">
            <link role="variableDeclaration" targetNodeId="1115664491804" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664491871">
      <property name="name" value="_SemanticModelQuery_AllClasses" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664491872">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491873">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664491874">
        <link role="classifier" targetNodeId="16.1087811448033" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664491875">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664491876">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664491877">
            <property name="name" value="list" />
            <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664491878">
              <link role="classifier" targetNodeId="16.1087811448033" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NewExpression" id="1115664491879">
              <node role="constructorCall" type="jetbrains.mps.baseLanguage.ConstructorCall" id="1115664491880">
                <link role="baseMethodDeclaration" targetNodeId="16.1087811448225" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664491881">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664491882">
            <property name="name" value="parentNode" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491883">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491884">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945615661" />
              <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664491885">
                <link role="variableDeclaration" targetNodeId="1115664491872" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664491886">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664491887">
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664491888">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664491889">
                <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664491890">
                  <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491891">
                    <link role="baseMethodDeclaration" targetNodeId="16.1087811448036" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491892">
                      <link role="variableDeclaration" targetNodeId="1115664491877" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491893">
                      <link role="variableDeclaration" targetNodeId="1115664491882" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664491894">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491895">
                  <link role="variableDeclaration" targetNodeId="1115664491882" />
                </node>
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491896">
                  <link role="classifier" targetNodeId="19.1108062933074" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664491897">
              <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664491898">
                <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491899">
                  <link role="variableDeclaration" targetNodeId="1115664491882" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491900">
                  <link role="baseMethodDeclaration" targetNodeId="15.1086945615661" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491901">
                    <link role="variableDeclaration" targetNodeId="1115664491882" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664491902">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491903">
              <link role="variableDeclaration" targetNodeId="1115664491882" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664491904" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664491905">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664491906">
            <property name="name" value="model" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491907">
              <link role="classifier" targetNodeId="15.1086945614636" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491908">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945615528" />
              <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664491909">
                <link role="variableDeclaration" targetNodeId="1115664491872" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664491910">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664491911">
            <property name="name" value="roots" />
            <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664491912">
              <link role="classifier" targetNodeId="16.1087908128062" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491913">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945615213" />
              <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491914">
                <link role="variableDeclaration" targetNodeId="1115664491906" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664491915">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664491916">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664491917">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664491918">
                <property name="name" value="node" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491919">
                  <link role="classifier" targetNodeId="15.1086945614627" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664491920">
                  <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491921">
                    <link role="baseMethodDeclaration" targetNodeId="16.1087908128065" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491922">
                      <link role="variableDeclaration" targetNodeId="1115664491911" />
                    </node>
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491923">
                    <link role="classifier" targetNodeId="15.1086945614627" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664491924">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664491925">
                <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664491926">
                  <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491927">
                    <link role="baseMethodDeclaration" targetNodeId="16.1087811448036" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491928">
                      <link role="variableDeclaration" targetNodeId="1115664491877" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491929">
                      <link role="variableDeclaration" targetNodeId="1115664491918" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664491930">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491931">
                  <link role="variableDeclaration" targetNodeId="1115664491918" />
                </node>
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491932">
                  <link role="classifier" targetNodeId="19.1108062933074" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491933">
            <link role="baseMethodDeclaration" targetNodeId="16.1087908128063" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491934">
              <link role="variableDeclaration" targetNodeId="1115664491911" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664491935">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664491936">
            <property name="name" value="importedModels" />
            <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664491937">
              <link role="classifier" targetNodeId="16.1087908128062" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491938">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945615183" />
              <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491939">
                <link role="variableDeclaration" targetNodeId="1115664491906" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664491940">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664491941">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664491942">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664491943">
                <property name="name" value="importedModel" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491944">
                  <link role="classifier" targetNodeId="15.1086945614636" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664491945">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491946">
                    <link role="classifier" targetNodeId="15.1086945614636" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491947">
                    <link role="baseMethodDeclaration" targetNodeId="16.1087908128065" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491948">
                      <link role="variableDeclaration" targetNodeId="1115664491936" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664491949">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664491950">
                <property name="name" value="importedRoots" />
                <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664491951">
                  <link role="classifier" targetNodeId="16.1087908128062" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491952">
                  <link role="baseMethodDeclaration" targetNodeId="15.1086945615213" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491953">
                    <link role="variableDeclaration" targetNodeId="1115664491943" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664491954">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664491955">
                <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664491956">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664491957">
                    <property name="name" value="importedRoot" />
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491958">
                      <link role="classifier" targetNodeId="15.1086945614627" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664491959">
                      <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491960">
                        <link role="baseMethodDeclaration" targetNodeId="16.1087908128065" />
                        <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491961">
                          <link role="variableDeclaration" targetNodeId="1115664491950" />
                        </node>
                      </node>
                      <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491962">
                        <link role="classifier" targetNodeId="15.1086945614627" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664491963">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664491964">
                    <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664491965">
                      <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491966">
                        <link role="baseMethodDeclaration" targetNodeId="16.1087811448036" />
                        <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491967">
                          <link role="variableDeclaration" targetNodeId="1115664491877" />
                        </node>
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491968">
                          <link role="variableDeclaration" targetNodeId="1115664491957" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664491969">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491970">
                      <link role="variableDeclaration" targetNodeId="1115664491957" />
                    </node>
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491971">
                      <link role="classifier" targetNodeId="19.1108062933074" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491972">
                <link role="baseMethodDeclaration" targetNodeId="16.1087908128063" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491973">
                  <link role="variableDeclaration" targetNodeId="1115664491950" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491974">
            <link role="baseMethodDeclaration" targetNodeId="16.1087908128063" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491975">
              <link role="variableDeclaration" targetNodeId="1115664491936" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664491976">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491977">
            <link role="variableDeclaration" targetNodeId="1115664491877" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664491978">
      <property name="name" value="_SemanticModelQuery_JavaClassFields" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664491979">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491980">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491981">
        <link role="classifier" targetNodeId="16.1087811448220" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664491982">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664491983">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664491984">
            <property name="name" value="currNode" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491985">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664491986">
              <link role="variableDeclaration" targetNodeId="1115664491979" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664491987">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664491988">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664491989">
              <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664491990">
                <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491991">
                  <link role="variableDeclaration" targetNodeId="1115664491984" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664491992">
                  <link role="baseMethodDeclaration" targetNodeId="15.1086945615661" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491993">
                    <link role="variableDeclaration" targetNodeId="1115664491984" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.AndExpression" id="1115664491994">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.NotExpression" id="1115664491995">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664491996">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664491997">
                  <link role="variableDeclaration" targetNodeId="1115664491984" />
                </node>
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664491998">
                  <link role="classifier" targetNodeId="19.1108062933074" />
                </node>
              </node>
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664491999">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492000">
                <link role="variableDeclaration" targetNodeId="1115664491984" />
              </node>
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664492001" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492002">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492003">
            <property name="name" value="list" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492004">
              <link role="classifier" targetNodeId="16.1087811448220" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NewExpression" id="1115664492005">
              <node role="constructorCall" type="jetbrains.mps.baseLanguage.ConstructorCall" id="1115664492006">
                <link role="baseMethodDeclaration" targetNodeId="16.1087811448225" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492007">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492008">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492009">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492010">
                <property name="name" value="javaClass" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492011">
                  <link role="classifier" targetNodeId="19.1108062933074" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492012">
                  <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492013">
                    <link role="variableDeclaration" targetNodeId="1115664491984" />
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492014">
                    <link role="classifier" targetNodeId="19.1108062933074" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492015">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492016">
                <property name="name" value="fields" />
                <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664492017">
                  <link role="classifier" targetNodeId="16.1087908128062" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492034">
                  <link role="baseMethodDeclaration" targetNodeId="19.1108062942880" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492035">
                    <link role="variableDeclaration" targetNodeId="1115664492010" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664492036">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492037">
                <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492038">
                  <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492039">
                    <link role="baseMethodDeclaration" targetNodeId="16.1087811448229" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492040">
                      <link role="variableDeclaration" targetNodeId="1115664492003" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492041">
                      <link role="baseMethodDeclaration" targetNodeId="16.1087908128065" />
                      <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492042">
                        <link role="variableDeclaration" targetNodeId="1115664492016" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492043">
                <link role="baseMethodDeclaration" targetNodeId="16.1087908128063" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492044">
                  <link role="variableDeclaration" targetNodeId="1115664492016" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664492045">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492046">
              <link role="variableDeclaration" targetNodeId="1115664491984" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664492047" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664492048">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492049">
            <link role="variableDeclaration" targetNodeId="1115664492003" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664492050">
      <property name="name" value="_SemanticModelQuery_JavaClassMethods" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492051">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492052">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492053">
        <link role="classifier" targetNodeId="16.1087811448220" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492054">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492055">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492056">
            <property name="name" value="currNode" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492057">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492058">
              <link role="variableDeclaration" targetNodeId="1115664492051" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664492059">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492060">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492061">
              <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664492062">
                <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492063">
                  <link role="variableDeclaration" targetNodeId="1115664492056" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492064">
                  <link role="baseMethodDeclaration" targetNodeId="15.1086945615661" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492065">
                    <link role="variableDeclaration" targetNodeId="1115664492056" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.AndExpression" id="1115664492066">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.NotExpression" id="1115664492067">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664492068">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492069">
                  <link role="variableDeclaration" targetNodeId="1115664492056" />
                </node>
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492070">
                  <link role="classifier" targetNodeId="19.1108062933074" />
                </node>
              </node>
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664492071">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492072">
                <link role="variableDeclaration" targetNodeId="1115664492056" />
              </node>
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664492073" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492074">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492075">
            <property name="name" value="list" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492076">
              <link role="classifier" targetNodeId="16.1087811448220" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NewExpression" id="1115664492077">
              <node role="constructorCall" type="jetbrains.mps.baseLanguage.ConstructorCall" id="1115664492078">
                <link role="baseMethodDeclaration" targetNodeId="16.1087811448225" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492079">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492080">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492081">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492082">
                <property name="name" value="classConcept" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492083">
                  <link role="classifier" targetNodeId="19.1108062933074" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492084">
                  <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492085">
                    <link role="variableDeclaration" targetNodeId="1115664492056" />
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492086">
                    <link role="classifier" targetNodeId="19.1108062933074" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492087">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492088">
                <property name="name" value="methods" />
                <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664492089">
                  <link role="classifier" targetNodeId="16.1087908128062" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492090">
                  <link role="baseMethodDeclaration" targetNodeId="19.1108062871076" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492091">
                    <link role="variableDeclaration" targetNodeId="1115664492082" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664492092">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492093">
                <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492094">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492095">
                    <property name="name" value="method" />
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664408734">
                      <link role="classifier" targetNodeId="19.1109971952149" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492096">
                      <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664408750">
                        <link role="classifier" targetNodeId="19.1109971952149" />
                      </node>
                      <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492097">
                        <link role="baseMethodDeclaration" targetNodeId="16.1087908128065" />
                        <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492098">
                          <link role="variableDeclaration" targetNodeId="1115664492088" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492099">
                  <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492100">
                    <link role="baseMethodDeclaration" targetNodeId="16.1087811448229" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492101">
                      <link role="variableDeclaration" targetNodeId="1115664492075" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492102">
                      <link role="variableDeclaration" targetNodeId="1115664492095" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492103">
                <link role="baseMethodDeclaration" targetNodeId="16.1087908128063" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492104">
                  <link role="variableDeclaration" targetNodeId="1115664492088" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492105">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492106">
                <property name="name" value="staticMethods" />
                <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664492107">
                  <link role="classifier" targetNodeId="16.1087908128062" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492108">
                  <link role="baseMethodDeclaration" targetNodeId="19.1108062943817" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492109">
                    <link role="variableDeclaration" targetNodeId="1115664492082" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664492110">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492111">
                <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492112">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492113">
                    <property name="name" value="staticMethod" />
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664408783">
                      <link role="classifier" targetNodeId="19.1109971952099" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492114">
                      <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664408815">
                        <link role="classifier" targetNodeId="19.1109971952099" />
                      </node>
                      <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492115">
                        <link role="baseMethodDeclaration" targetNodeId="16.1087908128065" />
                        <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492116">
                          <link role="variableDeclaration" targetNodeId="1115664492106" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492117">
                  <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492118">
                    <link role="baseMethodDeclaration" targetNodeId="16.1087811448229" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492119">
                      <link role="variableDeclaration" targetNodeId="1115664492075" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492120">
                      <link role="variableDeclaration" targetNodeId="1115664492113" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492121">
                <link role="baseMethodDeclaration" targetNodeId="16.1087908128063" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492122">
                  <link role="variableDeclaration" targetNodeId="1115664492106" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664492123">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492124">
              <link role="variableDeclaration" targetNodeId="1115664492056" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664492125" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664492126">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492127">
            <link role="variableDeclaration" targetNodeId="1115664492075" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664492128">
      <property name="name" value="_SemanticModelQuery_JavaMethodParameters" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492129">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492130">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492131">
        <link role="classifier" targetNodeId="16.1087811448220" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492132">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492133">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492134">
            <property name="name" value="currNode" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492135">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492136">
              <link role="variableDeclaration" targetNodeId="1115664492129" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664492137">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492138">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492139">
              <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664492140">
                <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492141">
                  <link role="variableDeclaration" targetNodeId="1115664492134" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492142">
                  <link role="baseMethodDeclaration" targetNodeId="15.1086945615661" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492143">
                    <link role="variableDeclaration" targetNodeId="1115664492134" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.AndExpression" id="1115664492144">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.NotExpression" id="1115664492145">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664492146">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492147">
                  <link role="variableDeclaration" targetNodeId="1115664492134" />
                </node>
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664408847">
                  <link role="classifier" targetNodeId="19.1109971953619" />
                </node>
              </node>
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664492148">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492149">
                <link role="variableDeclaration" targetNodeId="1115664492134" />
              </node>
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664492150" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492151">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492152">
            <property name="name" value="list" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492153">
              <link role="classifier" targetNodeId="16.1087811448220" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NewExpression" id="1115664492154">
              <node role="constructorCall" type="jetbrains.mps.baseLanguage.ConstructorCall" id="1115664492155">
                <link role="baseMethodDeclaration" targetNodeId="16.1087811448225" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492156">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492157">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492158">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492159">
                <property name="name" value="baseMethodDeclaration" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664408864">
                  <link role="classifier" targetNodeId="19.1109971953619" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492160">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664408912">
                    <link role="classifier" targetNodeId="19.1109971953619" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492161">
                    <link role="variableDeclaration" targetNodeId="1115664492134" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492162">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492163">
                <property name="name" value="iterator" />
                <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664492164">
                  <link role="classifier" targetNodeId="16.1087908128062" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664408944">
                  <link role="baseMethodDeclaration" targetNodeId="19.1109971953999" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492165">
                    <link role="variableDeclaration" targetNodeId="1115664492159" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664492166">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492167">
                <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492168">
                  <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492169">
                    <link role="baseMethodDeclaration" targetNodeId="16.1087811448229" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492170">
                      <link role="variableDeclaration" targetNodeId="1115664492152" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492171">
                      <link role="baseMethodDeclaration" targetNodeId="16.1087908128065" />
                      <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492172">
                        <link role="variableDeclaration" targetNodeId="1115664492163" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492173">
                <link role="baseMethodDeclaration" targetNodeId="16.1087908128063" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492174">
                  <link role="variableDeclaration" targetNodeId="1115664492163" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664492175">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492176">
              <link role="variableDeclaration" targetNodeId="1115664492134" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664492177" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664492178">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492179">
            <link role="variableDeclaration" targetNodeId="1115664492152" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664492180">
      <property name="name" value="_SemanticModelQuery_AllFreeMethods" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492181">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492182">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664492183">
        <link role="classifier" targetNodeId="16.1087811448033" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492184">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492185">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492186">
            <property name="name" value="model" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492187">
              <link role="classifier" targetNodeId="15.1086945614636" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492188">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945615528" />
              <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492189">
                <link role="variableDeclaration" targetNodeId="1115664492181" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492190">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492191">
            <property name="name" value="list" />
            <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664492192">
              <link role="classifier" targetNodeId="16.1087811448033" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941785">
              <link role="baseMethodDeclaration" targetNodeId="1115664494102" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941786">
                <link role="classifier" targetNodeId="1115664491666" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492193">
                <link role="variableDeclaration" targetNodeId="1115664492186" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492194">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492195">
            <property name="name" value="imports" />
            <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664492196">
              <link role="classifier" targetNodeId="16.1087908128062" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492197">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945615183" />
              <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492198">
                <link role="variableDeclaration" targetNodeId="1115664492186" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664492199">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492200">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492201">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492202">
                <link role="baseMethodDeclaration" targetNodeId="16.1087811448070" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492203">
                  <link role="variableDeclaration" targetNodeId="1115664492191" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941787">
                  <link role="baseMethodDeclaration" targetNodeId="1115664494102" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941788">
                    <link role="classifier" targetNodeId="1115664491666" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492204">
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492205">
                      <link role="classifier" targetNodeId="15.1086945614636" />
                    </node>
                    <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492206">
                      <link role="baseMethodDeclaration" targetNodeId="16.1087908128065" />
                      <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492207">
                        <link role="variableDeclaration" targetNodeId="1115664492195" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492208">
            <link role="baseMethodDeclaration" targetNodeId="16.1087908128063" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492209">
              <link role="variableDeclaration" targetNodeId="1115664492195" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664492210">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492211">
            <link role="variableDeclaration" targetNodeId="1115664492191" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664492212">
      <property name="name" value="_SubstituteNodeActionHandler_LeftHandExpressionAcceptor" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492213">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492214">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492215">
        <property name="name" value="object" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492216">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492217">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492218">
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492219">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492220">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492221">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492222">
                <property name="name" value="expression" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664409041">
                  <link role="classifier" targetNodeId="19.1113723507352" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492223">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664409057">
                    <link role="classifier" targetNodeId="19.1113723507352" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492224">
                    <link role="variableDeclaration" targetNodeId="1115664492213" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492225">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664409105">
                <link role="baseMethodDeclaration" targetNodeId="19.1113723507372" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492226">
                  <link role="variableDeclaration" targetNodeId="1115664492222" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492227">
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492228">
                    <link role="variableDeclaration" targetNodeId="1115664492215" />
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664409137">
                    <link role="classifier" targetNodeId="19.1109971952788" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664492229">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492230">
              <link role="variableDeclaration" targetNodeId="1115664492213" />
            </node>
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664409170">
              <link role="classifier" targetNodeId="19.1113723507352" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492231">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492232">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492233">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492234">
                <property name="name" value="binaryOperation" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664409202">
                  <link role="classifier" targetNodeId="19.1113723507249" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492235">
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492236">
                    <link role="variableDeclaration" targetNodeId="1115664492213" />
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664409250">
                    <link role="classifier" targetNodeId="19.1113723507249" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492237">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664409282">
                <link role="baseMethodDeclaration" targetNodeId="19.1113723507304" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492238">
                  <link role="variableDeclaration" targetNodeId="1115664492234" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492239">
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492240">
                    <link role="variableDeclaration" targetNodeId="1115664492215" />
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664409314">
                    <link role="classifier" targetNodeId="19.1109971952788" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664492241">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492242">
              <link role="variableDeclaration" targetNodeId="1115664492213" />
            </node>
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664409346">
              <link role="classifier" targetNodeId="19.1113723507249" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492243">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492244">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492245">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492246">
                <property name="name" value="expression" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664409379">
                  <link role="classifier" targetNodeId="19.1113723508652" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492247">
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492248">
                    <link role="variableDeclaration" targetNodeId="1115664492213" />
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664409411">
                    <link role="classifier" targetNodeId="19.1113723508652" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492249">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664409443">
                <link role="baseMethodDeclaration" targetNodeId="19.1113723508672" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492250">
                  <link role="variableDeclaration" targetNodeId="1115664492246" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492251">
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492252">
                    <link role="variableDeclaration" targetNodeId="1115664492215" />
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664409475">
                    <link role="classifier" targetNodeId="19.1109971952788" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664492253">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492254">
              <link role="variableDeclaration" targetNodeId="1115664492213" />
            </node>
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664409523">
              <link role="classifier" targetNodeId="19.1113723508652" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664492255">
          <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492256">
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492257">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492258">
              <link role="variableDeclaration" targetNodeId="1115664492215" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664492259">
      <property name="name" value="_SubstituteNodeActionHandler_RightHandExpressionAcceptor" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492260">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492261">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492262">
        <property name="name" value="object" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492263">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492264">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492265">
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492266">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492267">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492268">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492269">
                <property name="name" value="expression" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664409556">
                  <link role="classifier" targetNodeId="19.1113723507352" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492270">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664409572">
                    <link role="classifier" targetNodeId="19.1113723507352" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492271">
                    <link role="variableDeclaration" targetNodeId="1115664492260" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492272">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664409620">
                <link role="baseMethodDeclaration" targetNodeId="19.1113723507376" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492273">
                  <link role="variableDeclaration" targetNodeId="1115664492269" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492274">
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492275">
                    <link role="variableDeclaration" targetNodeId="1115664492262" />
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664409668">
                    <link role="classifier" targetNodeId="19.1109971952788" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664492276">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492277">
              <link role="variableDeclaration" targetNodeId="1115664492260" />
            </node>
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664409700">
              <link role="classifier" targetNodeId="19.1113723507352" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492278">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492279">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492280">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492281">
                <property name="name" value="binaryOperation" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664409717">
                  <link role="classifier" targetNodeId="19.1113723507249" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492282">
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492283">
                    <link role="variableDeclaration" targetNodeId="1115664492260" />
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664409765">
                    <link role="classifier" targetNodeId="19.1113723507249" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492284">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664409797">
                <link role="baseMethodDeclaration" targetNodeId="19.1113723507300" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492285">
                  <link role="variableDeclaration" targetNodeId="1115664492281" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492286">
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492287">
                    <link role="variableDeclaration" targetNodeId="1115664492262" />
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664409829">
                    <link role="classifier" targetNodeId="19.1109971952788" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664492288">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492289">
              <link role="variableDeclaration" targetNodeId="1115664492260" />
            </node>
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664409877">
              <link role="classifier" targetNodeId="19.1113723507249" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492290">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492291">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492292">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492293">
                <property name="name" value="expression" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664409909">
                  <link role="classifier" targetNodeId="19.1113723507612" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492294">
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492295">
                    <link role="variableDeclaration" targetNodeId="1115664492260" />
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664409942">
                    <link role="classifier" targetNodeId="19.1113723507612" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492296">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664409974">
                <link role="baseMethodDeclaration" targetNodeId="19.1113723507636" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492297">
                  <link role="variableDeclaration" targetNodeId="1115664492293" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492298">
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492299">
                    <link role="variableDeclaration" targetNodeId="1115664492262" />
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664410022">
                    <link role="classifier" targetNodeId="19.1109971952788" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664492300">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492301">
              <link role="variableDeclaration" targetNodeId="1115664492260" />
            </node>
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664410054">
              <link role="classifier" targetNodeId="19.1113723507612" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492302">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492303">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492304">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492305">
                <property name="name" value="expression" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664410071">
                  <link role="classifier" targetNodeId="19.1113723509103" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492306">
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492307">
                    <link role="variableDeclaration" targetNodeId="1115664492260" />
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664410118">
                    <link role="classifier" targetNodeId="19.1113723509103" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492308">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664410151">
                <link role="baseMethodDeclaration" targetNodeId="19.1113723509119" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492309">
                  <link role="variableDeclaration" targetNodeId="1115664492305" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492310">
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492311">
                    <link role="variableDeclaration" targetNodeId="1115664492262" />
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664410183">
                    <link role="classifier" targetNodeId="19.1109971952788" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664492312">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492313">
              <link role="variableDeclaration" targetNodeId="1115664492260" />
            </node>
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664410231">
              <link role="classifier" targetNodeId="19.1113723509103" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664492314">
          <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492315">
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492316">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492317">
              <link role="variableDeclaration" targetNodeId="1115664492262" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664492318">
      <property name="name" value="_PopulateStaticMethods" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492319">
        <property name="name" value="javaClass" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492320">
          <link role="classifier" targetNodeId="19.1108062933074" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492321">
        <property name="name" value="list" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492322">
          <link role="classifier" targetNodeId="16.1087811448220" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1115664492323">
        <property name="name" value="void" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492324">
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492325">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492326">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492327">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492328">
                <property name="name" value="staticMethods" />
                <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664492329">
                  <link role="classifier" targetNodeId="16.1087908128062" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492330">
                  <link role="baseMethodDeclaration" targetNodeId="19.1108062943817" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492331">
                    <link role="variableDeclaration" targetNodeId="1115664492319" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664492332">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492333">
                <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492334">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492335">
                    <property name="name" value="staticMethod" />
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664410279">
                      <link role="classifier" targetNodeId="19.1109971952099" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492336">
                      <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664410311">
                        <link role="classifier" targetNodeId="19.1109971952099" />
                      </node>
                      <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492337">
                        <link role="baseMethodDeclaration" targetNodeId="16.1087908128065" />
                        <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492338">
                          <link role="variableDeclaration" targetNodeId="1115664492328" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492339">
                  <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492340">
                    <link role="baseMethodDeclaration" targetNodeId="16.1087811448229" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492341">
                      <link role="variableDeclaration" targetNodeId="1115664492321" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492342">
                      <link role="variableDeclaration" targetNodeId="1115664492335" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492343">
                <link role="baseMethodDeclaration" targetNodeId="16.1087908128063" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492344">
                  <link role="variableDeclaration" targetNodeId="1115664492328" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492345">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492346">
                <property name="name" value="extendedClass" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492347">
                  <link role="classifier" targetNodeId="19.1108062933074" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492348">
                  <link role="baseMethodDeclaration" targetNodeId="19.1108062943046" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492349">
                    <link role="variableDeclaration" targetNodeId="1115664492319" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492350">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941789">
                <link role="baseMethodDeclaration" targetNodeId="1115664492318" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941790">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492351">
                  <link role="variableDeclaration" targetNodeId="1115664492346" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492352">
                  <link role="variableDeclaration" targetNodeId="1115664492321" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664492353">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492354">
              <link role="variableDeclaration" targetNodeId="1115664492319" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664492355" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664492356">
      <property name="name" value="_SemanticModelQuery_ContextInstanceMethods" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492357">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492358">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664492359">
        <link role="classifier" targetNodeId="16.1087811448033" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492360">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492361">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492362">
            <property name="name" value="list" />
            <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664492363">
              <link role="classifier" targetNodeId="16.1087811448033" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NewExpression" id="1115664492364">
              <node role="constructorCall" type="jetbrains.mps.baseLanguage.ConstructorCall" id="1115664492365">
                <link role="baseMethodDeclaration" targetNodeId="16.1087811448225" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492366">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492367">
            <property name="name" value="methodCall" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664410407">
              <link role="classifier" targetNodeId="19.1113723508606" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492368">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664410439">
                <link role="classifier" targetNodeId="19.1113723508606" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492369">
                <link role="variableDeclaration" targetNodeId="1115664492357" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492370">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492371">
            <property name="name" value="instanceExpression" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664410487">
              <link role="classifier" targetNodeId="19.1109971952788" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664410503">
              <link role="baseMethodDeclaration" targetNodeId="19.1113723508624" />
              <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492372">
                <link role="variableDeclaration" targetNodeId="1115664492367" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492373">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492374">
            <property name="name" value="type" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492375">
              <link role="classifier" targetNodeId="19.1108060339906" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664492376">
              <link role="baseMethodDeclaration" targetNodeId="21.1117844019006" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492377">
                <link role="classifier" targetNodeId="21.1091033020742" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492378">
                <link role="variableDeclaration" targetNodeId="1115664492371" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492379">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492380">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492381">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492382">
                <property name="name" value="classifier" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492383">
                  <link role="classifier" targetNodeId="19.1108062862271" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492384">
                  <link role="baseMethodDeclaration" targetNodeId="19.1108062805024" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.ParenthesizedExpression" id="1115664492385">
                    <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492386">
                      <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492387">
                        <link role="variableDeclaration" targetNodeId="1115664492374" />
                      </node>
                      <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492388">
                        <link role="classifier" targetNodeId="19.1108062794093" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492389">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492390">
                <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492391">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941791">
                    <link role="baseMethodDeclaration" targetNodeId="1115664494305" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941792">
                      <link role="classifier" targetNodeId="1115664491666" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492392">
                      <link role="variableDeclaration" targetNodeId="1115664492382" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492393">
                      <link role="variableDeclaration" targetNodeId="1115664492362" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664492394">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664492395" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492396">
                  <link role="variableDeclaration" targetNodeId="1115664492382" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664492397">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492398">
              <link role="variableDeclaration" targetNodeId="1115664492374" />
            </node>
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492399">
              <link role="classifier" targetNodeId="19.1108062794093" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492400">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492401">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492402">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492403">
                <property name="name" value="featureConcepts" />
                <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664492404">
                  <link role="classifier" targetNodeId="16.1087811448033" />
                  <node role="parameter" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492405">
                    <link role="classifier" targetNodeId="17.1086945615917" />
                  </node>
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664492406">
                  <link role="baseMethodDeclaration" targetNodeId="19.1108511543547" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492407">
                    <link role="classifier" targetNodeId="19.1108511531953" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492408">
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492409">
                      <link role="classifier" targetNodeId="19.1108507006366" />
                    </node>
                    <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492410">
                      <link role="variableDeclaration" targetNodeId="1115664492374" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492411">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492412">
                <property name="name" value="iter" />
                <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664492413">
                  <link role="classifier" targetNodeId="16.1087908128062" />
                  <node role="parameter" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492414">
                    <link role="classifier" targetNodeId="17.1086945615917" />
                  </node>
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492415">
                  <link role="baseMethodDeclaration" targetNodeId="16.1087811448078" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492416">
                    <link role="variableDeclaration" targetNodeId="1115664492403" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664492417">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492418">
                <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492419">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492420">
                    <property name="name" value="featureConcept" />
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492421">
                      <link role="classifier" targetNodeId="17.1086945615917" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492422">
                      <link role="baseMethodDeclaration" targetNodeId="16.1087908128065" />
                      <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492423">
                        <link role="variableDeclaration" targetNodeId="1115664492412" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492424">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492425">
                    <property name="name" value="featureInterface" />
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492426">
                      <link role="classifier" targetNodeId="19.1108063020986" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664492427">
                      <link role="baseMethodDeclaration" targetNodeId="19.1108511543513" />
                      <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492428">
                        <link role="classifier" targetNodeId="19.1108511531953" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492429">
                        <link role="variableDeclaration" targetNodeId="1115664492420" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492430">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492431">
                    <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492432">
                      <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941793">
                        <link role="baseMethodDeclaration" targetNodeId="1115664494305" />
                        <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941794">
                          <link role="classifier" targetNodeId="1115664491666" />
                        </node>
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492433">
                          <link role="variableDeclaration" targetNodeId="1115664492425" />
                        </node>
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492434">
                          <link role="variableDeclaration" targetNodeId="1115664492362" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664492435">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492436">
                      <link role="variableDeclaration" targetNodeId="1115664492425" />
                    </node>
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664492437" />
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492438">
                <link role="baseMethodDeclaration" targetNodeId="16.1087908128063" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492439">
                  <link role="variableDeclaration" targetNodeId="1115664492412" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664492440">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492441">
              <link role="variableDeclaration" targetNodeId="1115664492374" />
            </node>
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492442">
              <link role="classifier" targetNodeId="19.1108507006366" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492443">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492444">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492445">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492446">
                <property name="name" value="collectionConcept" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492447">
                  <link role="classifier" targetNodeId="17.1086945615917" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664492448">
                  <link role="baseMethodDeclaration" targetNodeId="15.1109973928307" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492449">
                    <link role="classifier" targetNodeId="15.1086945614633" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492450">
                    <link role="baseMethodDeclaration" targetNodeId="22.1109971957041" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.ParenthesizedExpression" id="1115664492451">
                      <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492452">
                        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492453">
                          <link role="classifier" targetNodeId="22.1109971936893" />
                        </node>
                        <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492454">
                          <link role="variableDeclaration" targetNodeId="1115664492374" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492455">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492456">
                <property name="name" value="collectionInterface" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492457">
                  <link role="classifier" targetNodeId="19.1108063020986" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664492458">
                  <link role="baseMethodDeclaration" targetNodeId="19.1108511543513" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492459">
                    <link role="classifier" targetNodeId="19.1108511531953" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492460">
                    <link role="variableDeclaration" targetNodeId="1115664492446" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492461">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492462">
                <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492463">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941795">
                    <link role="baseMethodDeclaration" targetNodeId="1115664494305" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941796">
                      <link role="classifier" targetNodeId="1115664491666" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492464">
                      <link role="variableDeclaration" targetNodeId="1115664492456" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492465">
                      <link role="variableDeclaration" targetNodeId="1115664492362" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664492466">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492467">
                  <link role="variableDeclaration" targetNodeId="1115664492456" />
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664492468" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664492469">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492470">
              <link role="variableDeclaration" targetNodeId="1115664492374" />
            </node>
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492471">
              <link role="classifier" targetNodeId="22.1109971936893" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664492472">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492473">
            <link role="variableDeclaration" targetNodeId="1115664492362" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664492474">
      <property name="name" value="_SemanticModelQuery_ContextStaticMethods" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492475">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492476">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492477">
        <link role="classifier" targetNodeId="16.1087811448220" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492478">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492479">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492480">
            <property name="name" value="list" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492481">
              <link role="classifier" targetNodeId="16.1087811448220" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NewExpression" id="1115664492482">
              <node role="constructorCall" type="jetbrains.mps.baseLanguage.ConstructorCall" id="1115664492483">
                <link role="baseMethodDeclaration" targetNodeId="16.1087811448225" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492484">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492485">
            <property name="name" value="staticMethodCall" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664410632">
              <link role="classifier" targetNodeId="19.1113723509393" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492486">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664410665">
                <link role="classifier" targetNodeId="19.1113723509393" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492487">
                <link role="variableDeclaration" targetNodeId="1115664492475" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492488">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492489">
            <property name="name" value="staticType" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492490">
              <link role="classifier" targetNodeId="19.1108060339906" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664410713">
              <link role="baseMethodDeclaration" targetNodeId="19.1113723509413" />
              <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492491">
                <link role="variableDeclaration" targetNodeId="1115664492485" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492492">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492493">
            <property name="name" value="classConcept" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492494">
              <link role="classifier" targetNodeId="19.1108062933074" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664492495" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492496">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492497">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492498">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492499">
                <property name="name" value="classType" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492500">
                  <link role="classifier" targetNodeId="19.1108062816180" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492501">
                  <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492502">
                    <link role="variableDeclaration" targetNodeId="1115664492489" />
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492503">
                    <link role="classifier" targetNodeId="19.1108062816180" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492504">
              <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664492505">
                <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492506">
                  <link role="variableDeclaration" targetNodeId="1115664492493" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492507">
                  <link role="baseMethodDeclaration" targetNodeId="19.1108062824398" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492508">
                    <link role="variableDeclaration" targetNodeId="1115664492499" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664492509">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492510">
              <link role="variableDeclaration" targetNodeId="1115664492489" />
            </node>
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492511">
              <link role="classifier" targetNodeId="19.1108062816180" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492512">
          <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941797">
            <link role="baseMethodDeclaration" targetNodeId="1115664492318" />
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941798">
              <link role="classifier" targetNodeId="1115664491666" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492513">
              <link role="variableDeclaration" targetNodeId="1115664492493" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492514">
              <link role="variableDeclaration" targetNodeId="1115664492480" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664492515">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492516">
            <link role="variableDeclaration" targetNodeId="1115664492480" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664492517">
      <property name="name" value="_SemanticModelQuery_JavaLocalVariables" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492518">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492519">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492520">
        <link role="classifier" targetNodeId="16.1087811448220" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492521">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492522">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492523">
            <property name="name" value="currNode" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492524">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492525">
              <link role="variableDeclaration" targetNodeId="1115664492518" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664492526">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492527">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492528">
              <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664492529">
                <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492530">
                  <link role="variableDeclaration" targetNodeId="1115664492523" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492531">
                  <link role="baseMethodDeclaration" targetNodeId="15.1086945615661" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492532">
                    <link role="variableDeclaration" targetNodeId="1115664492523" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.AndExpression" id="1115664492533">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.NotExpression" id="1115664492534">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664492535">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492536">
                  <link role="variableDeclaration" targetNodeId="1115664492523" />
                </node>
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664410793">
                  <link role="classifier" targetNodeId="19.1109971954288" />
                </node>
              </node>
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664492537">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492538">
                <link role="variableDeclaration" targetNodeId="1115664492523" />
              </node>
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664492539" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492540">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492541">
            <property name="name" value="list" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492542">
              <link role="classifier" targetNodeId="16.1087811448220" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NewExpression" id="1115664492559">
              <node role="constructorCall" type="jetbrains.mps.baseLanguage.ConstructorCall" id="1115664492560">
                <link role="baseMethodDeclaration" targetNodeId="16.1087811448225" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492561">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492562">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492563">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941799">
                <link role="baseMethodDeclaration" targetNodeId="1115664492572" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941800">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492564">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664410842">
                    <link role="classifier" targetNodeId="19.1109971954288" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492565">
                    <link role="variableDeclaration" targetNodeId="1115664492523" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492566">
                  <link role="variableDeclaration" targetNodeId="1115664492541" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664492567">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492568">
              <link role="variableDeclaration" targetNodeId="1115664492523" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664492569" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664492570">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492571">
            <link role="variableDeclaration" targetNodeId="1115664492541" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664492572">
      <property name="name" value="_CollectLocalVariables" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492573">
        <property name="name" value="beforeStatement" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664406516">
          <link role="classifier" targetNodeId="19.1109971954288" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492574">
        <property name="name" value="list" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492575">
          <link role="classifier" targetNodeId="16.1087811448220" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1115664492576">
        <property name="name" value="void" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492577">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492578">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492579">
            <property name="name" value="statementList" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492580">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492581">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945615661" />
              <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492582">
                <link role="variableDeclaration" targetNodeId="1115664492573" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664492583">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492584">
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492585">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492586">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664492587" />
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1115664492588">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492589">
                  <link role="variableDeclaration" targetNodeId="1115664492579" />
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664492590" />
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492591">
              <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664492592">
                <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492593">
                  <link role="variableDeclaration" targetNodeId="1115664492579" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492594">
                  <link role="baseMethodDeclaration" targetNodeId="15.1086945615661" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492595">
                    <link role="variableDeclaration" targetNodeId="1115664492579" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.NotExpression" id="1115664492596">
            <node role="expression" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664492597">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492598">
                <link role="variableDeclaration" targetNodeId="1115664492579" />
              </node>
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664410905">
                <link role="classifier" targetNodeId="19.1109971953663" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492599">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492600">
            <property name="name" value="_statementList" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664410937">
              <link role="classifier" targetNodeId="19.1109971953663" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492601">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664410954">
                <link role="classifier" targetNodeId="19.1109971953663" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492602">
                <link role="variableDeclaration" targetNodeId="1115664492579" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492603">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492604">
            <property name="name" value="iterator" />
            <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664492605">
              <link role="classifier" targetNodeId="16.1087908128062" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664410986">
              <link role="baseMethodDeclaration" targetNodeId="19.1109971954282" />
              <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492606">
                <link role="variableDeclaration" targetNodeId="1115664492600" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664492607">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492608">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492609">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492610">
                <property name="name" value="statement" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664411018">
                  <link role="classifier" targetNodeId="19.1109971954288" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492611">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664411051">
                    <link role="classifier" targetNodeId="19.1109971954288" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492612">
                    <link role="baseMethodDeclaration" targetNodeId="16.1087908128065" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492613">
                      <link role="variableDeclaration" targetNodeId="1115664492604" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492614">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492615">
                <node role="statement" type="jetbrains.mps.baseLanguage.BreakStatement" id="1115664492616" />
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1115664492617">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492618">
                  <link role="variableDeclaration" targetNodeId="1115664492610" />
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492619">
                  <link role="variableDeclaration" targetNodeId="1115664492573" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492620">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492621">
                <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492622">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492623">
                    <property name="name" value="localStatement" />
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664411083">
                      <link role="classifier" targetNodeId="19.1113723508843" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492624">
                      <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664411115">
                        <link role="classifier" targetNodeId="19.1113723508843" />
                      </node>
                      <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492625">
                        <link role="variableDeclaration" targetNodeId="1115664492610" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492626">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492627">
                    <property name="name" value="declaration" />
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664411147">
                      <link role="classifier" targetNodeId="19.1113723508815" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664411180">
                      <link role="baseMethodDeclaration" targetNodeId="19.1113723508857" />
                      <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492628">
                        <link role="variableDeclaration" targetNodeId="1115664492623" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492629">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492630">
                    <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492631">
                      <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492632">
                        <link role="baseMethodDeclaration" targetNodeId="16.1087811448229" />
                        <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492633">
                          <link role="variableDeclaration" targetNodeId="1115664492574" />
                        </node>
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492634">
                          <link role="variableDeclaration" targetNodeId="1115664492627" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664492635">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492636">
                      <link role="variableDeclaration" targetNodeId="1115664492627" />
                    </node>
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664492637" />
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664492638">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492639">
                  <link role="variableDeclaration" targetNodeId="1115664492610" />
                </node>
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664411212">
                  <link role="classifier" targetNodeId="19.1113723508843" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492640">
            <link role="baseMethodDeclaration" targetNodeId="16.1087908128063" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492641">
              <link role="variableDeclaration" targetNodeId="1115664492604" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492642">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492643">
            <property name="name" value="containingStatement" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492644">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492645">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945615661" />
              <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492646">
                <link role="variableDeclaration" targetNodeId="1115664492579" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664492647">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492648">
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492649">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492650">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664492651" />
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1115664492652">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492653">
                  <link role="variableDeclaration" targetNodeId="1115664492643" />
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664492654" />
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492655">
              <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664492656">
                <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492657">
                  <link role="variableDeclaration" targetNodeId="1115664492643" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492658">
                  <link role="baseMethodDeclaration" targetNodeId="15.1086945615661" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492659">
                    <link role="variableDeclaration" targetNodeId="1115664492643" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.NotExpression" id="1115664492660">
            <node role="expression" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664492661">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492662">
                <link role="variableDeclaration" targetNodeId="1115664492643" />
              </node>
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664411244">
                <link role="classifier" targetNodeId="19.1109971954288" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492663">
          <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941801">
            <link role="baseMethodDeclaration" targetNodeId="1115664492572" />
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941802">
              <link role="classifier" targetNodeId="1115664491666" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492664">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664411309">
                <link role="classifier" targetNodeId="19.1109971954288" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492665">
                <link role="variableDeclaration" targetNodeId="1115664492643" />
              </node>
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492666">
              <link role="variableDeclaration" targetNodeId="1115664492574" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664492667">
      <property name="name" value="_SubstituteNodeActionHandler_ReturnStatementExpressionAcceptor" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492668">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492669">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492670">
        <property name="name" value="object" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492671">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492672">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492673">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492674">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492675">
            <property name="name" value="returnStatement" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664411341">
              <link role="classifier" targetNodeId="19.1113723509291" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492676">
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492677">
                <link role="variableDeclaration" targetNodeId="1115664492668" />
              </node>
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664411389">
                <link role="classifier" targetNodeId="19.1113723509291" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492678">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664411421">
            <link role="baseMethodDeclaration" targetNodeId="19.1113723509307" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492679">
              <link role="variableDeclaration" targetNodeId="1115664492675" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492680">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664411438">
                <link role="classifier" targetNodeId="19.1109971952788" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492681">
                <link role="variableDeclaration" targetNodeId="1115664492670" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664492682">
          <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492683">
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492684">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492685">
              <link role="variableDeclaration" targetNodeId="1115664492670" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664492686">
      <property name="name" value="_SubstituteNodeActionHandler_Statement_InsertInList" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492687">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492688">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492689">
        <property name="name" value="object" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492690">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492691">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492692">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492693">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492694">
            <property name="name" value="newStatement" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664411486">
              <link role="classifier" targetNodeId="19.1109971954288" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664492695" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492696">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492697">
            <property name="name" value="itemNode" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492698">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492699">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492700">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492701">
                <link role="variableDeclaration" targetNodeId="1115664492689" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492702">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492703">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492704">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492705">
                <property name="name" value="expressionStatement" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664411518">
                  <link role="classifier" targetNodeId="19.1113723508236" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664411598">
                  <link role="baseMethodDeclaration" targetNodeId="18.1086856195751" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664411550">
                    <link role="classifier" targetNodeId="19.1113723508236" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492706">
                    <link role="baseMethodDeclaration" targetNodeId="15.1086945615528" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492707">
                      <link role="variableDeclaration" targetNodeId="1115664492697" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492708">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664411630">
                <link role="baseMethodDeclaration" targetNodeId="19.1113723508252" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492709">
                  <link role="variableDeclaration" targetNodeId="1115664492705" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492710">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664411662">
                    <link role="classifier" targetNodeId="19.1109971952788" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492711">
                    <link role="variableDeclaration" targetNodeId="1115664492689" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492712">
              <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664492713">
                <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492714">
                  <link role="variableDeclaration" targetNodeId="1115664492694" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492715">
                  <link role="variableDeclaration" targetNodeId="1115664492705" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664492716">
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664411695">
              <link role="classifier" targetNodeId="19.1109971952788" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492717">
              <link role="variableDeclaration" targetNodeId="1115664492697" />
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.BlockStatement" id="1117575428530">
            <node role="statements" type="jetbrains.mps.baseLanguage.StatementList" id="1117575428531">
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1117575437877">
                <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1117575437878">
                  <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1117575437879">
                    <link role="variableDeclaration" targetNodeId="1115664492694" />
                  </node>
                  <node role="rValue" type="jetbrains.mps.baseLanguage.CastExpression" id="1117575437880">
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1117575437881">
                      <link role="classifier" targetNodeId="19.1109971954288" />
                    </node>
                    <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1117575437882">
                      <link role="variableDeclaration" targetNodeId="1115664492697" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="declarations" type="jetbrains.mps.baseLanguage.StatementList" id="1117575428532" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492728">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492729">
            <property name="name" value="statementList" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664411791">
              <link role="classifier" targetNodeId="19.1109971953663" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664492730" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492731">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492732">
            <property name="name" value="oldStatement" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664411824">
              <link role="classifier" targetNodeId="19.1109971954288" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664492733" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492734">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492735">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492736">
              <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664492737">
                <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492738">
                  <link role="variableDeclaration" targetNodeId="1115664492732" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492739">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664411840">
                    <link role="classifier" targetNodeId="19.1109971954288" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492740">
                    <link role="variableDeclaration" targetNodeId="1115664492687" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492741">
              <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664492742">
                <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492743">
                  <link role="variableDeclaration" targetNodeId="1115664492729" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492744">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664411873">
                    <link role="classifier" targetNodeId="19.1109971953663" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492745">
                    <link role="baseMethodDeclaration" targetNodeId="15.1086945615661" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492746">
                      <link role="variableDeclaration" targetNodeId="1115664492732" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664492747">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492748">
              <link role="variableDeclaration" targetNodeId="1115664492687" />
            </node>
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664411920">
              <link role="classifier" targetNodeId="19.1109971954288" />
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.BlockStatement" id="1117575892813">
            <node role="statements" type="jetbrains.mps.baseLanguage.StatementList" id="1117575892814">
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1117575905254">
                <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1117575905255">
                  <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1117575905256">
                    <link role="variableDeclaration" targetNodeId="1115664492729" />
                  </node>
                  <node role="rValue" type="jetbrains.mps.baseLanguage.CastExpression" id="1117575905257">
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1117575905258">
                      <link role="classifier" targetNodeId="19.1109971953663" />
                    </node>
                    <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1117575905259">
                      <link role="variableDeclaration" targetNodeId="1115664492687" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="declarations" type="jetbrains.mps.baseLanguage.StatementList" id="1117575892815" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492759">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492760">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492761">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664412033">
                <link role="baseMethodDeclaration" targetNodeId="19.1109971954289" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492762">
                  <link role="variableDeclaration" targetNodeId="1115664492729" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492763">
                  <link role="variableDeclaration" targetNodeId="1115664492732" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492764">
                  <link role="variableDeclaration" targetNodeId="1115664492694" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492765">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492766">
                <link role="baseMethodDeclaration" targetNodeId="15.1086945615671" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492767">
                  <link role="variableDeclaration" targetNodeId="1115664492732" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664492768">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492769">
              <link role="variableDeclaration" targetNodeId="1115664492732" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664492770" />
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.BlockStatement" id="1117575949323">
            <node role="statements" type="jetbrains.mps.baseLanguage.StatementList" id="1117575949324">
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1117575955732">
                <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1117575955733">
                  <link role="baseMethodDeclaration" targetNodeId="19.1109971954284" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1117575955734">
                    <link role="variableDeclaration" targetNodeId="1115664492729" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1117575955735">
                    <link role="variableDeclaration" targetNodeId="1115664492694" />
                  </node>
                </node>
              </node>
            </node>
            <node role="declarations" type="jetbrains.mps.baseLanguage.StatementList" id="1117575949325" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664492779">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1117575967721">
            <link role="variableDeclaration" targetNodeId="1115664492697" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664492781">
      <property name="name" value="_SubstituteItemTextProvider_VarDeclarationStatementText" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492782">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492783">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492784">
        <property name="name" value="itemObject" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492785">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492786">
        <link role="classifier" targetNodeId="14.1086945614127" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492787">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492788">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492789">
            <property name="name" value="itemNode" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492790">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492791">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492792">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492793">
                <link role="variableDeclaration" targetNodeId="1115664492784" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664492794">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492795">
            <link role="baseMethodDeclaration" targetNodeId="15.1086945615657" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492796">
              <link role="variableDeclaration" targetNodeId="1115664492789" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664492797">
      <property name="name" value="_SubstituteItemHandler_VarDeclarationStatementFactory" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492798">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492799">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492800">
        <property name="name" value="itemObject" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492801">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492802">
        <property name="name" value="pattern" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492803">
          <link role="classifier" targetNodeId="14.1086945614127" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492804">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492805">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492806">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492807">
            <property name="name" value="model" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492808">
              <link role="classifier" targetNodeId="15.1086945614636" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492809">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945615528" />
              <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492810">
                <link role="variableDeclaration" targetNodeId="1115664492798" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492811">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492812">
            <property name="name" value="typeNode" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492813">
              <link role="classifier" targetNodeId="19.1108060339906" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664492814" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492815">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492816">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492817">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492818">
                <property name="name" value="classType" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492819">
                  <link role="classifier" targetNodeId="19.1108062816180" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664492820">
                  <link role="baseMethodDeclaration" targetNodeId="19.1108062841694" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492821">
                    <link role="classifier" targetNodeId="19.1108062816180" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492822">
                    <link role="variableDeclaration" targetNodeId="1115664492807" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492823">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492824">
                <link role="baseMethodDeclaration" targetNodeId="19.1108062824451" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492825">
                  <link role="variableDeclaration" targetNodeId="1115664492818" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492826">
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492827">
                    <link role="variableDeclaration" targetNodeId="1115664492800" />
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492828">
                    <link role="classifier" targetNodeId="19.1108062933074" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492829">
              <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664492830">
                <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492831">
                  <link role="variableDeclaration" targetNodeId="1115664492812" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492832">
                  <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492833">
                    <link role="variableDeclaration" targetNodeId="1115664492818" />
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492834">
                    <link role="classifier" targetNodeId="19.1108060339906" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664492835">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492836">
              <link role="variableDeclaration" targetNodeId="1115664492800" />
            </node>
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492837">
              <link role="classifier" targetNodeId="19.1108062933074" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492838">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492839">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492840">
              <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664492841">
                <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492842">
                  <link role="variableDeclaration" targetNodeId="1115664492812" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492843">
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492844">
                    <link role="variableDeclaration" targetNodeId="1115664492800" />
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492845">
                    <link role="classifier" targetNodeId="19.1108060339906" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.NotExpression" id="1115664492846">
            <node role="expression" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664492847">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492848">
                <link role="variableDeclaration" targetNodeId="1115664492800" />
              </node>
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492849">
                <link role="classifier" targetNodeId="19.1108062933074" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492850">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492851">
            <property name="name" value="localVariableDeclaration" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664412160">
              <link role="classifier" targetNodeId="19.1113723508815" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664412240">
              <link role="baseMethodDeclaration" targetNodeId="18.1086856195751" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664412192">
                <link role="classifier" targetNodeId="19.1113723508815" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492852">
                <link role="variableDeclaration" targetNodeId="1115664492807" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492853">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664412272">
            <link role="baseMethodDeclaration" targetNodeId="19.1109971953102" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492854">
              <link role="variableDeclaration" targetNodeId="1115664492851" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492855">
              <link role="variableDeclaration" targetNodeId="1115664492812" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492856">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492857">
            <property name="name" value="declarationStatement" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664412289">
              <link role="classifier" targetNodeId="19.1113723508843" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664412369">
              <link role="baseMethodDeclaration" targetNodeId="18.1086856195751" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664412321">
                <link role="classifier" targetNodeId="19.1113723508843" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492858">
                <link role="variableDeclaration" targetNodeId="1115664492807" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492859">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664412401">
            <link role="baseMethodDeclaration" targetNodeId="19.1113723508859" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492860">
              <link role="variableDeclaration" targetNodeId="1115664492857" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492861">
              <link role="variableDeclaration" targetNodeId="1115664492851" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664492862">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492863">
            <link role="variableDeclaration" targetNodeId="1115664492857" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664492864">
      <property name="name" value="_SubstituteItemTextProvider_ParmDeclarationText" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492865">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492866">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492867">
        <property name="name" value="itemObject" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492868">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492869">
        <link role="classifier" targetNodeId="14.1086945614127" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492870">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492871">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492872">
            <property name="name" value="itemNode" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492873">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492874">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492875">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492876">
                <link role="variableDeclaration" targetNodeId="1115664492867" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664492877">
          <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1115664492878">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492879">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945615657" />
              <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492880">
                <link role="variableDeclaration" targetNodeId="1115664492872" />
              </node>
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1115664492881">
              <property name="value" value=" parm" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664492882">
      <property name="name" value="_SubstituteItemHandler_ParmDeclarationFactory" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492883">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492884">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492885">
        <property name="name" value="itemObject" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492886">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492887">
        <property name="name" value="pattern" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492888">
          <link role="classifier" targetNodeId="14.1086945614127" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492889">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492890">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492891">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492892">
            <property name="name" value="model" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492893">
              <link role="classifier" targetNodeId="15.1086945614636" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492894">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945615528" />
              <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492895">
                <link role="variableDeclaration" targetNodeId="1115664492883" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492896">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492897">
            <property name="name" value="typeNode" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492898">
              <link role="classifier" targetNodeId="19.1108060339906" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664492899" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492900">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492901">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492902">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492903">
                <property name="name" value="classType" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492904">
                  <link role="classifier" targetNodeId="19.1108062816180" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664492905">
                  <link role="baseMethodDeclaration" targetNodeId="19.1108062841694" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492906">
                    <link role="classifier" targetNodeId="19.1108062816180" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492907">
                    <link role="variableDeclaration" targetNodeId="1115664492892" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492908">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492909">
                <link role="baseMethodDeclaration" targetNodeId="19.1108062824451" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492910">
                  <link role="variableDeclaration" targetNodeId="1115664492903" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492911">
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492912">
                    <link role="variableDeclaration" targetNodeId="1115664492885" />
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492913">
                    <link role="classifier" targetNodeId="19.1108062933074" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492914">
              <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664492915">
                <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492916">
                  <link role="variableDeclaration" targetNodeId="1115664492897" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492917">
                  <link role="variableDeclaration" targetNodeId="1115664492903" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664492918">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492919">
              <link role="variableDeclaration" targetNodeId="1115664492885" />
            </node>
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492920">
              <link role="classifier" targetNodeId="19.1108062933074" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664492921">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492922">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492923">
              <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664492924">
                <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492925">
                  <link role="variableDeclaration" targetNodeId="1115664492897" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492926">
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492927">
                    <link role="variableDeclaration" targetNodeId="1115664492885" />
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492928">
                    <link role="classifier" targetNodeId="19.1108060339906" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.NotExpression" id="1115664492929">
            <node role="expression" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664492930">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492931">
                <link role="variableDeclaration" targetNodeId="1115664492885" />
              </node>
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492932">
                <link role="classifier" targetNodeId="19.1108062933074" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492933">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492934">
            <property name="name" value="parmDeclaration" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664412512">
              <link role="classifier" targetNodeId="19.1109971953670" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664412576">
              <link role="baseMethodDeclaration" targetNodeId="18.1086856195751" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664412528">
                <link role="classifier" targetNodeId="19.1109971953670" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492935">
                <link role="variableDeclaration" targetNodeId="1115664492892" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492936">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664412608">
            <link role="baseMethodDeclaration" targetNodeId="19.1109971953102" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492937">
              <link role="variableDeclaration" targetNodeId="1115664492934" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492938">
              <link role="variableDeclaration" targetNodeId="1115664492897" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664492939">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492940">
            <link role="variableDeclaration" targetNodeId="1115664492934" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664492941">
      <property name="name" value="_SubstituteNodeActionHandler_BaseMethod_AddParameter" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492942">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492943">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492944">
        <property name="name" value="object" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492945">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492946">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492947">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492948">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492949">
            <property name="name" value="parameterDeclaration" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664412641">
              <link role="classifier" targetNodeId="19.1109971953670" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492950">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664412657">
                <link role="classifier" targetNodeId="19.1109971953670" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492951">
                <link role="variableDeclaration" targetNodeId="1115664492944" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492952">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492953">
            <property name="name" value="baseMethodDeclaration" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664412705">
              <link role="classifier" targetNodeId="19.1109971953619" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492954">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664412737">
                <link role="classifier" targetNodeId="19.1109971953619" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492955">
                <link role="variableDeclaration" targetNodeId="1115664492942" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492956">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664412770">
            <link role="baseMethodDeclaration" targetNodeId="19.1109971953981" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492957">
              <link role="variableDeclaration" targetNodeId="1115664492953" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492958">
              <link role="variableDeclaration" targetNodeId="1115664492949" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664492959">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492960">
            <link role="variableDeclaration" targetNodeId="1115664492949" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664492961">
      <property name="name" value="_SubstituteNodeActionHandler_UndefinedOperatorExpressionAcceptor" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492962">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492963">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664492964">
        <property name="name" value="object" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492965">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492966">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664492967">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492968">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492969">
            <property name="name" value="undefinedOperator" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664412786">
              <link role="classifier" targetNodeId="19.1113723509637" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664492970">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664412818">
                <link role="classifier" targetNodeId="19.1113723509637" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664492971">
                <link role="variableDeclaration" targetNodeId="1115664492962" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492972">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492973">
            <property name="name" value="leftOperand" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492974">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492975">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945615661" />
              <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492976">
                <link role="variableDeclaration" targetNodeId="1115664492969" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664492977">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492978">
            <link role="baseMethodDeclaration" targetNodeId="15.1086945615671" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492979">
              <link role="variableDeclaration" targetNodeId="1115664492969" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492980">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492981">
            <property name="name" value="role" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492982">
              <link role="classifier" targetNodeId="14.1086945614127" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492983">
              <link role="baseMethodDeclaration" targetNodeId="15.1091213216518" />
              <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492984">
                <link role="variableDeclaration" targetNodeId="1115664492973" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492985">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492986">
            <property name="name" value="expressionParent" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664492987">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492988">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945615661" />
              <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492989">
                <link role="variableDeclaration" targetNodeId="1115664492973" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492990">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492991">
            <property name="name" value="siblings" />
            <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664492992">
              <link role="classifier" targetNodeId="16.1087811448033" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492993">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945615729" />
              <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492994">
                <link role="variableDeclaration" targetNodeId="1115664492986" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664492995">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664492996">
            <property name="name" value="index" />
            <node role="type" type="jetbrains.mps.baseLanguage.IntegerType" id="1115664492997">
              <property name="name" value="int" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664492998">
              <link role="baseMethodDeclaration" targetNodeId="16.1087811448056" />
              <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664492999">
                <link role="variableDeclaration" targetNodeId="1115664492991" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493000">
                <link role="variableDeclaration" targetNodeId="1115664492973" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493001">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493002">
            <property name="name" value="anchor" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493003">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664493004" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664493005">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493006">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493007">
              <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664493008">
                <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493009">
                  <link role="variableDeclaration" targetNodeId="1115664493002" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493010">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493011">
                    <link role="classifier" targetNodeId="15.1086945614627" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493012">
                    <link role="baseMethodDeclaration" targetNodeId="16.1087811448074" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493013">
                      <link role="variableDeclaration" targetNodeId="1115664492991" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.MinusExpression" id="1115664493014">
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493015">
                        <link role="variableDeclaration" targetNodeId="1115664492996" />
                      </node>
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1115664493016">
                        <property name="value" value="1" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.GreaterThanExpression" id="1115664493017">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493018">
              <link role="variableDeclaration" targetNodeId="1115664492996" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1115664493019">
              <property name="value" value="0" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493020">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493021">
            <link role="baseMethodDeclaration" targetNodeId="15.1086945615725" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493022">
              <link role="variableDeclaration" targetNodeId="1115664492986" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493023">
              <link role="variableDeclaration" targetNodeId="1115664492973" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664493024">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493025">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493026">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493027">
                <property name="name" value="expression" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664412866">
                  <link role="classifier" targetNodeId="19.1113723507352" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493028">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664412899">
                    <link role="classifier" targetNodeId="19.1113723507352" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493029">
                    <link role="variableDeclaration" targetNodeId="1115664492964" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493030">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664412946">
                <link role="baseMethodDeclaration" targetNodeId="19.1113723507372" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493031">
                  <link role="variableDeclaration" targetNodeId="1115664493027" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493032">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664412979">
                    <link role="classifier" targetNodeId="19.1113723508343" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493033">
                    <link role="variableDeclaration" targetNodeId="1115664492973" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.AndExpression" id="1115664493034">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664493035">
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664413011">
                <link role="classifier" targetNodeId="19.1113723507352" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493036">
                <link role="variableDeclaration" targetNodeId="1115664492964" />
              </node>
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664493037">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493038">
                <link role="variableDeclaration" targetNodeId="1115664492973" />
              </node>
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664413043">
                <link role="classifier" targetNodeId="19.1113723508343" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664493039">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493040">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493041">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493042">
                <property name="name" value="binaryOperation" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664413075">
                  <link role="classifier" targetNodeId="19.1113723507249" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493043">
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493044">
                    <link role="variableDeclaration" targetNodeId="1115664492964" />
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664413123">
                    <link role="classifier" targetNodeId="19.1113723507249" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493045">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664413156">
                <link role="baseMethodDeclaration" targetNodeId="19.1113723507304" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493046">
                  <link role="variableDeclaration" targetNodeId="1115664493042" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493047">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664413172">
                    <link role="classifier" targetNodeId="19.1109971952788" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493048">
                    <link role="variableDeclaration" targetNodeId="1115664492973" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664493049">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493050">
              <link role="variableDeclaration" targetNodeId="1115664492964" />
            </node>
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664413204">
              <link role="classifier" targetNodeId="19.1113723507249" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664493051">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493052">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493053">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493054">
                <property name="name" value="reference" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664413237">
                  <link role="classifier" targetNodeId="19.1113723508342" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493055">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664413253">
                    <link role="classifier" targetNodeId="19.1113723508342" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493056">
                    <link role="variableDeclaration" targetNodeId="1115664492964" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493057">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664413301">
                <link role="baseMethodDeclaration" targetNodeId="19.1113723508361" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493058">
                  <link role="variableDeclaration" targetNodeId="1115664493054" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493059">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664413333">
                    <link role="classifier" targetNodeId="19.1109971952788" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493060">
                    <link role="variableDeclaration" targetNodeId="1115664492973" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664493061">
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664413366">
              <link role="classifier" targetNodeId="19.1113723508342" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493062">
              <link role="variableDeclaration" targetNodeId="1115664492964" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664493063">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493064">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493065">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493066">
                <property name="name" value="expression" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664413398">
                  <link role="classifier" targetNodeId="19.1113723508606" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493067">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664413415">
                    <link role="classifier" targetNodeId="19.1113723508606" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493068">
                    <link role="variableDeclaration" targetNodeId="1115664492964" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493069">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664413462">
                <link role="baseMethodDeclaration" targetNodeId="19.1113723508626" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493070">
                  <link role="variableDeclaration" targetNodeId="1115664493066" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493071">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664413479">
                    <link role="classifier" targetNodeId="19.1109971952788" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493072">
                    <link role="variableDeclaration" targetNodeId="1115664492973" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664493073">
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664413511">
              <link role="classifier" targetNodeId="19.1113723508606" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493074">
              <link role="variableDeclaration" targetNodeId="1115664492964" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664493075">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493076">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493077">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493078">
                <property name="name" value="expression" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664413559">
                  <link role="classifier" targetNodeId="19.1113723508652" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493079">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664413576">
                    <link role="classifier" targetNodeId="19.1113723508652" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493080">
                    <link role="variableDeclaration" targetNodeId="1115664492964" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493081">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664413624">
                <link role="baseMethodDeclaration" targetNodeId="19.1113723508672" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493082">
                  <link role="variableDeclaration" targetNodeId="1115664493078" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493083">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664413656">
                    <link role="classifier" targetNodeId="19.1109971952788" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493084">
                    <link role="variableDeclaration" targetNodeId="1115664492973" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664493085">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493086">
              <link role="variableDeclaration" targetNodeId="1115664492964" />
            </node>
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664413688">
              <link role="classifier" targetNodeId="19.1113723508652" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493087">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493088">
            <link role="baseMethodDeclaration" targetNodeId="15.1091473120828" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493089">
              <link role="variableDeclaration" targetNodeId="1115664492986" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493090">
              <link role="variableDeclaration" targetNodeId="1115664493002" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493091">
              <link role="variableDeclaration" targetNodeId="1115664492981" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493092">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493093">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493094">
                <link role="variableDeclaration" targetNodeId="1115664492964" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493095">
          <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493096">
            <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493097">
              <link role="variableDeclaration" targetNodeId="1115664492964" />
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493098">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493099">
      <property name="name" value="_SemanticModelQuery_AllConstructors" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493100">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493101">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664493102">
        <link role="classifier" targetNodeId="16.1087811448033" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493103">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493104">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493105">
            <property name="name" value="model" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493106">
              <link role="classifier" targetNodeId="15.1086945614636" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493107">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945615528" />
              <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493108">
                <link role="variableDeclaration" targetNodeId="1115664493100" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493109">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493110">
            <property name="name" value="list" />
            <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664493111">
              <link role="classifier" targetNodeId="16.1087811448033" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941818">
              <link role="baseMethodDeclaration" targetNodeId="1115664494049" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941819">
                <link role="classifier" targetNodeId="1115664491666" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493112">
                <link role="variableDeclaration" targetNodeId="1115664493105" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493113">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493114">
            <property name="name" value="imports" />
            <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664493115">
              <link role="classifier" targetNodeId="16.1087908128062" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493116">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945615183" />
              <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493117">
                <link role="variableDeclaration" targetNodeId="1115664493105" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664493118">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493119">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493120">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493121">
                <link role="baseMethodDeclaration" targetNodeId="16.1087811448070" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493122">
                  <link role="variableDeclaration" targetNodeId="1115664493110" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941820">
                  <link role="baseMethodDeclaration" targetNodeId="1115664494049" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941821">
                    <link role="classifier" targetNodeId="1115664491666" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493123">
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493124">
                      <link role="classifier" targetNodeId="15.1086945614636" />
                    </node>
                    <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493125">
                      <link role="baseMethodDeclaration" targetNodeId="16.1087908128065" />
                      <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493126">
                        <link role="variableDeclaration" targetNodeId="1115664493114" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493127">
            <link role="baseMethodDeclaration" targetNodeId="16.1087908128063" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493128">
              <link role="variableDeclaration" targetNodeId="1115664493114" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493129">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493130">
            <link role="variableDeclaration" targetNodeId="1115664493110" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493131">
      <property name="name" value="_SubstituteNodeActionHandler_InstanceMethodCallInstanceAcceptor" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493132">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493133">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493134">
        <property name="name" value="object" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493135">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493136">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493137">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493138">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493139">
            <property name="name" value="instanceMethodCall" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664413832">
              <link role="classifier" targetNodeId="19.1113723508606" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493140">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664413848">
                <link role="classifier" targetNodeId="19.1113723508606" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493141">
                <link role="variableDeclaration" targetNodeId="1115664493132" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493142">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664413881">
            <link role="baseMethodDeclaration" targetNodeId="19.1113723508626" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493143">
              <link role="variableDeclaration" targetNodeId="1115664493139" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493144">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664413913">
                <link role="classifier" targetNodeId="19.1109971952788" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493145">
                <link role="variableDeclaration" targetNodeId="1115664493134" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493146">
          <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493147">
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493148">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493149">
              <link role="variableDeclaration" targetNodeId="1115664493134" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493150">
      <property name="name" value="_SubstituteNodeActionHandler_StaticMethodInstanceAcceptor" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493151">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493152">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493153">
        <property name="name" value="object" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493154">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493155">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493156">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493157">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493158">
            <property name="name" value="staticMethodCall" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664413961">
              <link role="classifier" targetNodeId="19.1113723509393" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493159">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664413993">
                <link role="classifier" targetNodeId="19.1113723509393" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493160">
                <link role="variableDeclaration" targetNodeId="1115664493151" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493161">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664414041">
            <link role="baseMethodDeclaration" targetNodeId="19.1113723509415" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493162">
              <link role="variableDeclaration" targetNodeId="1115664493158" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493163">
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493164">
                <link role="variableDeclaration" targetNodeId="1115664493153" />
              </node>
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493165">
                <link role="classifier" targetNodeId="19.1108062816180" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493166">
          <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493167">
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493168">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493169">
              <link role="variableDeclaration" targetNodeId="1115664493153" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493170">
      <property name="name" value="_SubstituteNodeActionHandler_BaseMethodCallMethodAcceptor" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493171">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493172">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493173">
        <property name="name" value="object" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493174">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493175">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493176">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493177">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493178">
            <property name="name" value="baseMethodCall" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664414089">
              <link role="classifier" targetNodeId="19.1113723507392" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493179">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664414121">
                <link role="classifier" targetNodeId="19.1113723507392" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493180">
                <link role="variableDeclaration" targetNodeId="1115664493171" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493181">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664414169">
            <link role="baseMethodDeclaration" targetNodeId="19.1113723507412" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493182">
              <link role="variableDeclaration" targetNodeId="1115664493178" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493183">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664414201">
                <link role="classifier" targetNodeId="19.1109971953619" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493184">
                <link role="variableDeclaration" targetNodeId="1115664493173" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493185">
          <node role="expression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664493186" />
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493187">
      <property name="name" value="_SubstituteNodeActionHandler_BaseMethodCall_InsertArgument" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493188">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493189">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493190">
        <property name="name" value="object" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493191">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493192">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493193">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493194">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493195">
            <property name="name" value="newArgument" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664414233">
              <link role="classifier" targetNodeId="19.1109971952788" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493196">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664414266">
                <link role="classifier" targetNodeId="19.1109971952788" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493197">
                <link role="variableDeclaration" targetNodeId="1115664493190" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664493213">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493214">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493215">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493216">
                <property name="name" value="baseMethodCall" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664414314">
                  <link role="classifier" targetNodeId="19.1113723507392" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493217">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664414346">
                    <link role="classifier" targetNodeId="19.1113723507392" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493218">
                    <link role="variableDeclaration" targetNodeId="1115664493188" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493219">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664414378">
                <link role="baseMethodDeclaration" targetNodeId="19.1113723507418" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493220">
                  <link role="variableDeclaration" targetNodeId="1115664493216" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493221">
                  <link role="variableDeclaration" targetNodeId="1115664493195" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664493222">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493223">
              <link role="variableDeclaration" targetNodeId="1115664493188" />
            </node>
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664414410">
              <link role="classifier" targetNodeId="19.1113723507392" />
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.BlockStatement" id="1115664493224">
            <node role="statements" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493225">
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493226">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493227">
                  <property name="name" value="oldArgument" />
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664414443">
                    <link role="classifier" targetNodeId="19.1109971952788" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493228">
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664414475">
                      <link role="classifier" targetNodeId="19.1109971952788" />
                    </node>
                    <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493229">
                      <link role="variableDeclaration" targetNodeId="1115664493188" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493230">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493231">
                  <property name="name" value="baseMethodCall" />
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664414523">
                    <link role="classifier" targetNodeId="19.1113723507392" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493232">
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664414555">
                      <link role="classifier" targetNodeId="19.1113723507392" />
                    </node>
                    <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493233">
                      <link role="baseMethodDeclaration" targetNodeId="15.1086945615661" />
                      <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493234">
                        <link role="variableDeclaration" targetNodeId="1115664493227" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493235">
                <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664414572">
                  <link role="baseMethodDeclaration" targetNodeId="19.1113723507438" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493236">
                    <link role="variableDeclaration" targetNodeId="1115664493231" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493237">
                    <link role="variableDeclaration" targetNodeId="1115664493227" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493238">
                    <link role="variableDeclaration" targetNodeId="1115664493195" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493239">
                <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493240">
                  <link role="baseMethodDeclaration" targetNodeId="15.1086945615671" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493241">
                    <link role="variableDeclaration" targetNodeId="1115664493227" />
                  </node>
                </node>
              </node>
            </node>
            <node role="declarations" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493242" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493243">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493244">
            <link role="variableDeclaration" targetNodeId="1115664493195" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493245">
      <property name="name" value="_SubstituteNodeActionHandler_BaseMethodDeclReturnTypeAcceptor" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493246">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493247">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493248">
        <property name="name" value="object" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493249">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493250">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493251">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493252">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493253">
            <property name="name" value="baseMethodDeclaration" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664414604">
              <link role="classifier" targetNodeId="19.1109971953619" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493254">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664414636">
                <link role="classifier" targetNodeId="19.1109971953619" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493255">
                <link role="variableDeclaration" targetNodeId="1115664493246" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493256">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664414684">
            <link role="baseMethodDeclaration" targetNodeId="19.1109971953971" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493257">
              <link role="variableDeclaration" targetNodeId="1115664493253" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493258">
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493259">
                <link role="variableDeclaration" targetNodeId="1115664493248" />
              </node>
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493260">
                <link role="classifier" targetNodeId="19.1108060339906" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493261">
          <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493262">
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493263">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493264">
              <link role="variableDeclaration" targetNodeId="1115664493248" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493265">
      <property name="name" value="_SubstituteNodeActionHandler_FieldReferenceInstanceAcceptor" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493266">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493267">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493268">
        <property name="name" value="object" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493269">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493270">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493271">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493272">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493273">
            <property name="name" value="fieldReference" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664414732">
              <link role="classifier" targetNodeId="19.1113723508342" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493274">
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493275">
                <link role="variableDeclaration" targetNodeId="1115664493266" />
              </node>
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664414780">
                <link role="classifier" targetNodeId="19.1113723508342" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493276">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664414812">
            <link role="baseMethodDeclaration" targetNodeId="19.1113723508361" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493277">
              <link role="variableDeclaration" targetNodeId="1115664493273" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493278">
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493279">
                <link role="variableDeclaration" targetNodeId="1115664493268" />
              </node>
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664414844">
                <link role="classifier" targetNodeId="19.1109971952788" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493280">
          <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493281">
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493282">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493283">
              <link role="variableDeclaration" targetNodeId="1115664493268" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493284">
      <property name="name" value="_SemanticNodeCondition_HasInitializer" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493285">
        <property name="name" value="node" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493286">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.BooleanType" id="1115664493287">
        <property name="name" value="boolean" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493288">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493289">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493290">
            <property name="name" value="varDeclaration" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664414876">
              <link role="classifier" targetNodeId="19.1109971952770" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493291">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664414909">
                <link role="classifier" targetNodeId="19.1109971952770" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493292">
                <link role="variableDeclaration" targetNodeId="1115664493285" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493293">
          <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664493294">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664414957">
              <link role="baseMethodDeclaration" targetNodeId="19.1109971953088" />
              <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493295">
                <link role="variableDeclaration" targetNodeId="1115664493290" />
              </node>
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664493296" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493297">
      <property name="name" value="_SubstituteNodeActionHandler_VariableDeclarationTypeAcceptor" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493298">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493299">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493300">
        <property name="name" value="object" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493301">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493302">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493303">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493304">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493305">
            <property name="name" value="variableDeclaration" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664414989">
              <link role="classifier" targetNodeId="19.1109971952770" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493306">
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493307">
                <link role="variableDeclaration" targetNodeId="1115664493298" />
              </node>
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664415037">
                <link role="classifier" targetNodeId="19.1109971952770" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493308">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664415069">
            <link role="baseMethodDeclaration" targetNodeId="19.1109971953102" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493309">
              <link role="variableDeclaration" targetNodeId="1115664493305" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493310">
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493311">
                <link role="variableDeclaration" targetNodeId="1115664493300" />
              </node>
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493312">
                <link role="classifier" targetNodeId="19.1108060339906" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493313">
          <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493314">
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493315">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493316">
              <link role="variableDeclaration" targetNodeId="1115664493300" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493317">
      <property name="name" value="_SubstituteNodeActionHandler_CastExpressionTypeAcceptor" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493318">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493319">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493320">
        <property name="name" value="object" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493321">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493322">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493323">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493324">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493325">
            <property name="name" value="castExpression" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664415117">
              <link role="classifier" targetNodeId="19.1113723507612" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493326">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664415149">
                <link role="classifier" targetNodeId="19.1113723507612" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493327">
                <link role="variableDeclaration" targetNodeId="1115664493318" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493328">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664415213">
            <link role="baseMethodDeclaration" targetNodeId="19.1113723507630" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493329">
              <link role="variableDeclaration" targetNodeId="1115664493325" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493330">
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493331">
                <link role="variableDeclaration" targetNodeId="1115664493320" />
              </node>
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493332">
                <link role="classifier" targetNodeId="19.1108060339906" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493333">
          <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493334">
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493335">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493336">
              <link role="variableDeclaration" targetNodeId="1115664493320" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493337">
      <property name="name" value="_SubstituteNodeActionHandler_InstanceOfExpressionTypeAcceptor" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493338">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493339">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493340">
        <property name="name" value="object" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493341">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493342">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493343">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493344">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493345">
            <property name="name" value="instanceOfExpression" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664415260">
              <link role="classifier" targetNodeId="19.1113723508652" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493346">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664415293">
                <link role="classifier" targetNodeId="19.1113723508652" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493347">
                <link role="variableDeclaration" targetNodeId="1115664493338" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493348">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664415341">
            <link role="baseMethodDeclaration" targetNodeId="19.1113723508676" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493349">
              <link role="variableDeclaration" targetNodeId="1115664493345" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493350">
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493351">
                <link role="variableDeclaration" targetNodeId="1115664493340" />
              </node>
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493352">
                <link role="classifier" targetNodeId="19.1108062816180" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493353">
          <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493354">
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493355">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493356">
              <link role="variableDeclaration" targetNodeId="1115664493340" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493357">
      <property name="name" value="_SubstituteNodeActionHandler_VariableDeclarationInitializerAcceptor" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493358">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493359">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493360">
        <property name="name" value="object" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493361">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493362">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493363">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493364">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493365">
            <property name="name" value="variableDeclaration" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664415404">
              <link role="classifier" targetNodeId="19.1109971952770" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493366">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664415436">
                <link role="classifier" targetNodeId="19.1109971952770" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493367">
                <link role="variableDeclaration" targetNodeId="1115664493358" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493368">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664415484">
            <link role="baseMethodDeclaration" targetNodeId="19.1109971953090" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493369">
              <link role="variableDeclaration" targetNodeId="1115664493365" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493370">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664415516">
                <link role="classifier" targetNodeId="19.1109971952788" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493371">
                <link role="variableDeclaration" targetNodeId="1115664493360" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493372">
          <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493373">
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493374">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493375">
              <link role="variableDeclaration" targetNodeId="1115664493360" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493376">
      <property name="name" value="_SubstituteNodeActionHandler_FieldReference_FieldDeclarationAcceptor" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493377">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493378">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493379">
        <property name="name" value="object" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493380">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493381">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493382">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493383">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493384">
            <property name="name" value="fieldReference" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664415549">
              <link role="classifier" targetNodeId="19.1113723508342" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493385">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664415581">
                <link role="classifier" targetNodeId="19.1113723508342" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493386">
                <link role="variableDeclaration" targetNodeId="1115664493377" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493387">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664415613">
            <link role="baseMethodDeclaration" targetNodeId="19.1113723508367" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493388">
              <link role="variableDeclaration" targetNodeId="1115664493384" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493389">
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493390">
                <link role="variableDeclaration" targetNodeId="1115664493379" />
              </node>
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664415661">
                <link role="classifier" targetNodeId="19.1109971952054" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493391">
          <node role="expression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664493392" />
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493393">
      <property name="name" value="_SubstituteNodeActionHandler_WhileStatementConditionAcceptor" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493394">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493395">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493396">
        <property name="name" value="object" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493397">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493398">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493399">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493400">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493401">
            <property name="name" value="whileStatement" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664415693">
              <link role="classifier" targetNodeId="19.1113723509721" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493402">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664415726">
                <link role="classifier" targetNodeId="19.1113723509721" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493403">
                <link role="variableDeclaration" targetNodeId="1115664493394" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493404">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664415758">
            <link role="baseMethodDeclaration" targetNodeId="19.1113723509745" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493405">
              <link role="variableDeclaration" targetNodeId="1115664493401" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493406">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664415790">
                <link role="classifier" targetNodeId="19.1109971952788" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493407">
                <link role="variableDeclaration" targetNodeId="1115664493396" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493408">
          <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493409">
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493410">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493411">
              <link role="variableDeclaration" targetNodeId="1115664493396" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493412">
      <property name="name" value="_SubstituteNodeActionHandler_IfStatementConditionAcceptor" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493413">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493414">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493415">
        <property name="name" value="object" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493416">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493417">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493418">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493419">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493420">
            <property name="name" value="ifStatement" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664415838">
              <link role="classifier" targetNodeId="19.1113723508558" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493421">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664415870">
                <link role="classifier" targetNodeId="19.1113723508558" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493422">
                <link role="variableDeclaration" targetNodeId="1115664493413" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493423">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664415918">
            <link role="baseMethodDeclaration" targetNodeId="19.1113723508582" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493424">
              <link role="variableDeclaration" targetNodeId="1115664493420" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493425">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664415950">
                <link role="classifier" targetNodeId="19.1109971952788" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493426">
                <link role="variableDeclaration" targetNodeId="1115664493415" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493427">
          <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493428">
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493429">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493430">
              <link role="variableDeclaration" targetNodeId="1115664493415" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493431">
      <property name="name" value="_SubstituteNodeActionHandler_ExtendedClassAcceptor" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493432">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493433">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493434">
        <property name="name" value="object" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493435">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493436">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493437">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493438">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493439">
            <property name="name" value="classConcept" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493440">
              <link role="classifier" targetNodeId="19.1108062933074" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493441">
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493442">
                <link role="variableDeclaration" targetNodeId="1115664493432" />
              </node>
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493443">
                <link role="classifier" targetNodeId="19.1108062933074" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493444">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493445">
            <link role="baseMethodDeclaration" targetNodeId="19.1108062943133" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493446">
              <link role="variableDeclaration" targetNodeId="1115664493439" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493447">
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493448">
                <link role="variableDeclaration" targetNodeId="1115664493434" />
              </node>
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493449">
                <link role="classifier" targetNodeId="19.1108062933074" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493450">
          <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493451">
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493452">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493453">
              <link role="variableDeclaration" targetNodeId="1115664493434" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493454">
      <property name="name" value="_SemanticModelQuery_AllStatementTypes" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493455">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493456">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664493457">
        <link role="classifier" targetNodeId="16.1087811448033" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493458">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493459">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493460">
            <property name="name" value="list" />
            <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664493461">
              <link role="classifier" targetNodeId="16.1087811448033" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NewExpression" id="1115664493462">
              <node role="constructorCall" type="jetbrains.mps.baseLanguage.ConstructorCall" id="1115664493463">
                <link role="baseMethodDeclaration" targetNodeId="16.1087811448225" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493464">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493465">
            <property name="name" value="model" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493466">
              <link role="classifier" targetNodeId="15.1086945614636" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493467">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945615528" />
              <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493468">
                <link role="variableDeclaration" targetNodeId="1115664493455" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493469">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493470">
            <property name="name" value="statementDeclaration" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493471">
              <link role="classifier" targetNodeId="17.1086945615917" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664493472">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945614672" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493473">
                <link role="classifier" targetNodeId="15.1086945614633" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493474">
                <link role="variableDeclaration" targetNodeId="1115664493465" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.StringLiteral" id="1115664493475">
                <property name="value" value="Statement" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664493476">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493477">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493478">
              <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664493479">
                <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493480">
                  <link role="variableDeclaration" targetNodeId="1115664493460" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664493481">
                  <link role="baseMethodDeclaration" targetNodeId="23.1115331247332" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493482">
                    <link role="classifier" targetNodeId="23.1115331184469" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493483">
                    <link role="variableDeclaration" targetNodeId="1115664493470" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493484">
              <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664493485">
                <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493486">
                  <link role="variableDeclaration" targetNodeId="1115664493460" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664493487">
                  <link role="baseMethodDeclaration" targetNodeId="15.1117844139426" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493488">
                    <link role="classifier" targetNodeId="15.1086945615339" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493489">
                    <link role="variableDeclaration" targetNodeId="1115664493465" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493490">
                    <link role="variableDeclaration" targetNodeId="1115664493460" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664493491">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493492">
              <link role="variableDeclaration" targetNodeId="1115664493470" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664493493" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493494">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493495">
            <link role="variableDeclaration" targetNodeId="1115664493460" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493496">
      <property name="name" value="_SemanticModelQuery_ContextInstanceFields" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493497">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493498">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664493499">
        <link role="classifier" targetNodeId="16.1087811448033" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493500">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493501">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493502">
            <property name="name" value="list" />
            <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664493503">
              <link role="classifier" targetNodeId="16.1087811448033" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NewExpression" id="1115664493504">
              <node role="constructorCall" type="jetbrains.mps.baseLanguage.ConstructorCall" id="1115664493505">
                <link role="baseMethodDeclaration" targetNodeId="16.1087811448225" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493506">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493507">
            <property name="name" value="field" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664416045">
              <link role="classifier" targetNodeId="19.1113723508342" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493508">
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493509">
                <link role="variableDeclaration" targetNodeId="1115664493497" />
              </node>
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664416077">
                <link role="classifier" targetNodeId="19.1113723508342" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493510">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493511">
            <property name="name" value="instanceExpression" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664416110">
              <link role="classifier" targetNodeId="19.1109971952788" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664416142">
              <link role="baseMethodDeclaration" targetNodeId="19.1113723508359" />
              <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493512">
                <link role="variableDeclaration" targetNodeId="1115664493507" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493513">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493514">
            <property name="name" value="type" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493515">
              <link role="classifier" targetNodeId="19.1108060339906" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664493516">
              <link role="baseMethodDeclaration" targetNodeId="21.1117844019006" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493517">
                <link role="classifier" targetNodeId="21.1091033020742" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493518">
                <link role="variableDeclaration" targetNodeId="1115664493511" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664493519">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493520">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493521">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493522">
                <property name="name" value="javaClass" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493523">
                  <link role="classifier" targetNodeId="19.1108062933074" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493524">
                  <link role="baseMethodDeclaration" targetNodeId="19.1108062824398" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.ParenthesizedExpression" id="1115664493525">
                    <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493526">
                      <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493527">
                        <link role="variableDeclaration" targetNodeId="1115664493514" />
                      </node>
                      <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493528">
                        <link role="classifier" targetNodeId="19.1108062816180" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664493529">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493530">
                <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493531">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493532">
                    <property name="name" value="fields" />
                    <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664493533">
                      <link role="classifier" targetNodeId="16.1087908128062" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493534">
                      <link role="baseMethodDeclaration" targetNodeId="19.1108062942880" />
                      <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493535">
                        <link role="variableDeclaration" targetNodeId="1115664493522" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664493536">
                  <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493537">
                    <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493538">
                      <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493539">
                        <link role="baseMethodDeclaration" targetNodeId="16.1087811448036" />
                        <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493540">
                          <link role="variableDeclaration" targetNodeId="1115664493502" />
                        </node>
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493541">
                          <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493542">
                            <link role="classifier" targetNodeId="15.1086945614627" />
                          </node>
                          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493543">
                            <link role="baseMethodDeclaration" targetNodeId="16.1087908128065" />
                            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493544">
                              <link role="variableDeclaration" targetNodeId="1115664493532" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493545">
                    <link role="baseMethodDeclaration" targetNodeId="16.1087908128063" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493546">
                      <link role="variableDeclaration" targetNodeId="1115664493532" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664493547">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493548">
                  <link role="variableDeclaration" targetNodeId="1115664493522" />
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664493549" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664493550">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493551">
              <link role="variableDeclaration" targetNodeId="1115664493514" />
            </node>
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493552">
              <link role="classifier" targetNodeId="19.1108062816180" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493553">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493554">
            <link role="variableDeclaration" targetNodeId="1115664493502" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493555">
      <property name="name" value="_SemanticModelQuery_BinaryOperationTypes" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493556">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493557">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664493558">
        <link role="classifier" targetNodeId="16.1087811448033" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493559">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493560">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493561">
            <property name="name" value="list" />
            <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664493562">
              <link role="classifier" targetNodeId="16.1087811448033" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NewExpression" id="1115664493563">
              <node role="constructorCall" type="jetbrains.mps.baseLanguage.ConstructorCall" id="1115664493564">
                <link role="baseMethodDeclaration" targetNodeId="16.1087811448225" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493565">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493566">
            <property name="name" value="model" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493567">
              <link role="classifier" targetNodeId="15.1086945614636" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493568">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945615528" />
              <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493569">
                <link role="variableDeclaration" targetNodeId="1115664493556" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493570">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493571">
            <property name="name" value="binaryOperationTypeDecl" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493572">
              <link role="classifier" targetNodeId="17.1086945615917" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664493573">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945614672" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493574">
                <link role="classifier" targetNodeId="15.1086945614633" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493575">
                <link role="variableDeclaration" targetNodeId="1115664493566" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.StringLiteral" id="1115664493576">
                <property name="value" value="BinaryOperation" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664493577">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493578">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493579">
              <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664493580">
                <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493581">
                  <link role="variableDeclaration" targetNodeId="1115664493561" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664493582">
                  <link role="baseMethodDeclaration" targetNodeId="23.1115331247332" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493583">
                    <link role="classifier" targetNodeId="23.1115331184469" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493584">
                    <link role="variableDeclaration" targetNodeId="1115664493571" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493585">
              <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664493586">
                <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493587">
                  <link role="variableDeclaration" targetNodeId="1115664493561" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664493588">
                  <link role="baseMethodDeclaration" targetNodeId="15.1117844139426" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493589">
                    <link role="classifier" targetNodeId="15.1086945615339" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493590">
                    <link role="variableDeclaration" targetNodeId="1115664493566" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493591">
                    <link role="variableDeclaration" targetNodeId="1115664493561" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664493592">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664493593" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493594">
              <link role="variableDeclaration" targetNodeId="1115664493571" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493595">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493596">
            <link role="baseMethodDeclaration" targetNodeId="16.1087811448036" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493597">
              <link role="variableDeclaration" targetNodeId="1115664493561" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664493598">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945614672" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493599">
                <link role="classifier" targetNodeId="15.1086945614633" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493600">
                <link role="variableDeclaration" targetNodeId="1115664493566" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.StringLiteral" id="1115664493601">
                <property name="value" value="InstanceMethodCall" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493602">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493603">
            <link role="baseMethodDeclaration" targetNodeId="16.1087811448036" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493604">
              <link role="variableDeclaration" targetNodeId="1115664493561" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664493605">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945614672" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493606">
                <link role="classifier" targetNodeId="15.1086945614633" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493607">
                <link role="variableDeclaration" targetNodeId="1115664493566" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.StringLiteral" id="1115664493608">
                <property name="value" value="FieldReference" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493609">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493610">
            <link role="variableDeclaration" targetNodeId="1115664493561" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493611">
      <property name="name" value="_SubstituteItemHandler_GenericNodeInstanceFactory" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493612">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493613">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493614">
        <property name="name" value="itemObject" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493615">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493616">
        <property name="name" value="pattern" />
        <node role="type" type="jetbrains.mps.baseLanguage.StringType" id="1115664493617" />
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493618">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493619">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493620">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493621">
            <property name="name" value="typeDeclaration" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493622">
              <link role="classifier" targetNodeId="17.1086945615917" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493623">
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493624">
                <link role="variableDeclaration" targetNodeId="1115664493614" />
              </node>
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493625">
                <link role="classifier" targetNodeId="17.1086945615917" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493626">
          <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664493627">
            <link role="baseMethodDeclaration" targetNodeId="15.1086945615417" />
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493628">
              <link role="classifier" targetNodeId="15.1086945615339" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493629">
              <link role="variableDeclaration" targetNodeId="1115664493621" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493630">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945615528" />
              <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493631">
                <link role="variableDeclaration" targetNodeId="1115664493612" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493632">
      <property name="name" value="_SubstituteItemHandler_JavaVariableReferenceFactory" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493633">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493634">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493635">
        <property name="name" value="itemObject" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493636">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493637">
        <property name="name" value="pattern" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493638">
          <link role="classifier" targetNodeId="14.1086945614127" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493639">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493640">
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493641">
          <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664493642">
            <link role="baseMethodDeclaration" targetNodeId="21.1119375985328" />
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493643">
              <link role="classifier" targetNodeId="21.1091033020742" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1119401134769">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945615528" />
              <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1119401127877">
                <link role="variableDeclaration" targetNodeId="1115664493633" />
              </node>
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493644">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664416205">
                <link role="classifier" targetNodeId="19.1109971952770" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493645">
                <link role="variableDeclaration" targetNodeId="1115664493635" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493646">
      <property name="name" value="_SubstituteItemHandler_ThisInstanceMethodCallFactory" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493647">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493648">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493649">
        <property name="name" value="itemObject" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493650">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493651">
        <property name="name" value="pattern" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493652">
          <link role="classifier" targetNodeId="14.1086945614127" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493653">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493654">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493655">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493656">
            <property name="name" value="callExpression" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664416238">
              <link role="classifier" targetNodeId="19.1113723508606" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664416318">
              <link role="baseMethodDeclaration" targetNodeId="18.1086856195751" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664416270">
                <link role="classifier" targetNodeId="19.1113723508606" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493657">
                <link role="baseMethodDeclaration" targetNodeId="15.1086945615528" />
                <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493658">
                  <link role="variableDeclaration" targetNodeId="1115664493647" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493659">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664416366">
            <link role="baseMethodDeclaration" targetNodeId="19.1113723508626" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493660">
              <link role="variableDeclaration" targetNodeId="1115664493656" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664416461">
              <link role="baseMethodDeclaration" targetNodeId="18.1086856195751" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664416398">
                <link role="classifier" targetNodeId="19.1113723509581" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493661">
                <link role="baseMethodDeclaration" targetNodeId="15.1086945615528" />
                <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493662">
                  <link role="variableDeclaration" targetNodeId="1115664493647" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493663">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664416494">
            <link role="baseMethodDeclaration" targetNodeId="19.1113723508632" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493664">
              <link role="variableDeclaration" targetNodeId="1115664493656" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493665">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664416526">
                <link role="classifier" targetNodeId="19.1109971952149" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493666">
                <link role="variableDeclaration" targetNodeId="1115664493649" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493667">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493668">
            <link role="variableDeclaration" targetNodeId="1115664493656" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493669">
      <property name="name" value="_SubstituteItemHandler_FalseLiteralFactory" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493670">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493671">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493672">
        <property name="name" value="itemObject" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493673">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493674">
        <property name="name" value="pattern" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493675">
          <link role="classifier" targetNodeId="14.1086945614127" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493676">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493677">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493678">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493679">
            <property name="name" value="falseLiteral" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664416574">
              <link role="classifier" targetNodeId="19.1113723507496" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664416654">
              <link role="baseMethodDeclaration" targetNodeId="18.1086856195751" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664416606">
                <link role="classifier" targetNodeId="19.1113723507496" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493680">
                <link role="baseMethodDeclaration" targetNodeId="15.1086945615528" />
                <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493681">
                  <link role="variableDeclaration" targetNodeId="1115664493670" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493682">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664416702">
            <link role="baseMethodDeclaration" targetNodeId="19.1113723507512" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493683">
              <link role="variableDeclaration" targetNodeId="1115664493679" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1115664493684">
              <property name="value" value="false" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493685">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493686">
            <link role="variableDeclaration" targetNodeId="1115664493679" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493687">
      <property name="name" value="_SubstituteItemHandler_TrueLiteralFactory" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493688">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493689">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493690">
        <property name="name" value="itemObject" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493691">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493692">
        <property name="name" value="pattern" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493693">
          <link role="classifier" targetNodeId="14.1086945614127" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493694">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493695">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493696">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493697">
            <property name="name" value="trueLiteral" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664416718">
              <link role="classifier" targetNodeId="19.1113723507496" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664416814">
              <link role="baseMethodDeclaration" targetNodeId="18.1086856195751" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664416751">
                <link role="classifier" targetNodeId="19.1113723507496" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493698">
                <link role="baseMethodDeclaration" targetNodeId="15.1086945615528" />
                <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493699">
                  <link role="variableDeclaration" targetNodeId="1115664493688" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493700">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664416846">
            <link role="baseMethodDeclaration" targetNodeId="19.1113723507512" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493701">
              <link role="variableDeclaration" targetNodeId="1115664493697" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1115664493702">
              <property name="value" value="true" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493703">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493704">
            <link role="variableDeclaration" targetNodeId="1115664493697" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493705">
      <property name="name" value="_SubstituteItemHandler_AssignmentExpressionFactory" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493706">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493707">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493708">
        <property name="name" value="itemObject" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493709">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493710">
        <property name="name" value="pattern" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493711">
          <link role="classifier" targetNodeId="14.1086945614127" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493712">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493713">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493714">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493715">
            <property name="name" value="assignmentExpression" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664416863">
              <link role="classifier" targetNodeId="19.1113723507352" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664416943">
              <link role="baseMethodDeclaration" targetNodeId="18.1086856195751" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664416895">
                <link role="classifier" targetNodeId="19.1113723507352" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493716">
                <link role="baseMethodDeclaration" targetNodeId="15.1086945615528" />
                <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493717">
                  <link role="variableDeclaration" targetNodeId="1115664493706" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664493718">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493719">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493720">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664416975">
                <link role="baseMethodDeclaration" targetNodeId="19.1113723507372" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493721">
                  <link role="variableDeclaration" targetNodeId="1115664493715" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664493722">
                  <link role="baseMethodDeclaration" targetNodeId="21.1119375985328" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493723">
                    <link role="classifier" targetNodeId="21.1091033020742" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1119401186259">
                    <link role="baseMethodDeclaration" targetNodeId="15.1086945615528" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1119401181022">
                      <link role="variableDeclaration" targetNodeId="1115664493706" />
                    </node>
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493724">
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664417008">
                      <link role="classifier" targetNodeId="19.1109971952770" />
                    </node>
                    <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493725">
                      <link role="variableDeclaration" targetNodeId="1115664493708" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664493726">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493727">
              <link role="variableDeclaration" targetNodeId="1115664493708" />
            </node>
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664417071">
              <link role="classifier" targetNodeId="19.1109971952770" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493728">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493729">
            <link role="variableDeclaration" targetNodeId="1115664493715" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493730">
      <property name="name" value="_SubstituteItemHandler_FieldReferenceFactory" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493731">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493732">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493733">
        <property name="name" value="itemObject" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493734">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493735">
        <property name="name" value="pattern" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493736">
          <link role="classifier" targetNodeId="14.1086945614127" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493737">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493738">
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493739">
          <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664417136">
            <link role="baseMethodDeclaration" targetNodeId="18.1086856195751" />
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664417103">
              <link role="classifier" targetNodeId="19.1113723508342" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493740">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945615528" />
              <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493741">
                <link role="variableDeclaration" targetNodeId="1115664493731" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493742">
      <property name="name" value="_SubstituteItemHandler_CreateClassType" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493743">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493744">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493745">
        <property name="name" value="itemObject" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493746">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493747">
        <property name="name" value="pattern" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493748">
          <link role="classifier" targetNodeId="14.1086945614127" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493749">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493750">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493751">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493752">
            <property name="name" value="classType" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493753">
              <link role="classifier" targetNodeId="19.1108062816180" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664493754">
              <link role="baseMethodDeclaration" targetNodeId="19.1108062841694" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493755">
                <link role="classifier" targetNodeId="19.1108062816180" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493756">
                <link role="baseMethodDeclaration" targetNodeId="15.1086945615528" />
                <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493757">
                  <link role="variableDeclaration" targetNodeId="1115664493743" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493758">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493759">
            <link role="baseMethodDeclaration" targetNodeId="19.1108062824451" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493760">
              <link role="variableDeclaration" targetNodeId="1115664493752" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493761">
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493762">
                <link role="variableDeclaration" targetNodeId="1115664493745" />
              </node>
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493763">
                <link role="classifier" targetNodeId="19.1108062933074" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493764">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493765">
            <link role="variableDeclaration" targetNodeId="1115664493752" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493766">
      <property name="name" value="_SemanticNodeCondition_ParentIsExpression" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493767">
        <property name="name" value="node" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493768">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.BooleanType" id="1115664493769">
        <property name="name" value="boolean" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493770">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493771">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493772">
            <property name="name" value="parentNode" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493773">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493774">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945615661" />
              <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493775">
                <link role="variableDeclaration" targetNodeId="1115664493767" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493776">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664493777">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493778">
              <link role="variableDeclaration" targetNodeId="1115664493772" />
            </node>
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664417215">
              <link role="classifier" targetNodeId="19.1109971952788" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493779">
      <property name="name" value="_SemanticModelQuery_AllExpressionTypes" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493780">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493781">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664493782">
        <link role="classifier" targetNodeId="16.1087811448033" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493783">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493784">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493785">
            <property name="name" value="list" />
            <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664493786">
              <link role="classifier" targetNodeId="16.1087811448033" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NewExpression" id="1115664493787">
              <node role="constructorCall" type="jetbrains.mps.baseLanguage.ConstructorCall" id="1115664493788">
                <link role="baseMethodDeclaration" targetNodeId="16.1087811448225" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493789">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493790">
            <property name="name" value="model" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493791">
              <link role="classifier" targetNodeId="15.1086945614636" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493792">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945615528" />
              <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493793">
                <link role="variableDeclaration" targetNodeId="1115664493780" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493794">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493795">
            <property name="name" value="expressionTypeDecl" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493796">
              <link role="classifier" targetNodeId="17.1086945615917" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664493797">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945614672" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493798">
                <link role="classifier" targetNodeId="15.1086945614633" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493799">
                <link role="variableDeclaration" targetNodeId="1115664493790" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.StringLiteral" id="1115664493800">
                <property name="value" value="Expression" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664493801">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493802">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493803">
              <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664493804">
                <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493805">
                  <link role="variableDeclaration" targetNodeId="1115664493785" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664493806">
                  <link role="baseMethodDeclaration" targetNodeId="23.1115331247332" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493807">
                    <link role="classifier" targetNodeId="23.1115331184469" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493808">
                    <link role="variableDeclaration" targetNodeId="1115664493795" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493809">
              <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664493810">
                <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493811">
                  <link role="variableDeclaration" targetNodeId="1115664493785" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664493812">
                  <link role="baseMethodDeclaration" targetNodeId="15.1117844139426" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493813">
                    <link role="classifier" targetNodeId="15.1086945615339" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493814">
                    <link role="variableDeclaration" targetNodeId="1115664493790" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493815">
                    <link role="variableDeclaration" targetNodeId="1115664493785" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664493816">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493817">
              <link role="variableDeclaration" targetNodeId="1115664493795" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664493818" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493819">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493820">
            <property name="name" value="list1" />
            <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664493821">
              <link role="classifier" targetNodeId="16.1087811448033" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NewExpression" id="1115664493822">
              <node role="constructorCall" type="jetbrains.mps.baseLanguage.ConstructorCall" id="1115664493823">
                <link role="baseMethodDeclaration" targetNodeId="16.1087811448225" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493824">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493825">
            <property name="name" value="binaryOperationConcept" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493826">
              <link role="classifier" targetNodeId="17.1086945615917" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664493827">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945614672" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493828">
                <link role="classifier" targetNodeId="15.1086945614633" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493829">
                <link role="variableDeclaration" targetNodeId="1115664493790" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.StringLiteral" id="1115664493830">
                <property name="value" value="BinaryOperation" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493831">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493832">
            <property name="name" value="iter" />
            <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664493833">
              <link role="classifier" targetNodeId="16.1087908128062" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493834">
              <link role="baseMethodDeclaration" targetNodeId="16.1087811448078" />
              <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493835">
                <link role="variableDeclaration" targetNodeId="1115664493785" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664493836">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493837">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493838">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493839">
                <property name="name" value="expression" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493840">
                  <link role="classifier" targetNodeId="17.1086945615917" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493841">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493842">
                    <link role="classifier" targetNodeId="17.1086945615917" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493843">
                    <link role="baseMethodDeclaration" targetNodeId="16.1087908128065" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493844">
                      <link role="variableDeclaration" targetNodeId="1115664493832" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664493845">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493846">
                <node role="statement" type="jetbrains.mps.baseLanguage.ContinueStatement" id="1115664493847" />
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664493848">
                <link role="baseMethodDeclaration" targetNodeId="15.1117844139450" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493849">
                  <link role="classifier" targetNodeId="15.1086945615339" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493850">
                  <link role="variableDeclaration" targetNodeId="1115664493825" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493851">
                  <link role="variableDeclaration" targetNodeId="1115664493839" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493852">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493853">
                <link role="baseMethodDeclaration" targetNodeId="16.1087811448036" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493854">
                  <link role="variableDeclaration" targetNodeId="1115664493820" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493855">
                  <link role="variableDeclaration" targetNodeId="1115664493839" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493856">
            <link role="baseMethodDeclaration" targetNodeId="16.1087908128063" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493857">
              <link role="variableDeclaration" targetNodeId="1115664493832" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493858">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493859">
            <link role="variableDeclaration" targetNodeId="1115664493820" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493860">
      <property name="name" value="_SubstituteNodeActionHandler_ParenthesizedExpression_ExpressionAcceptor" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493861">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493862">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493863">
        <property name="name" value="object" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493864">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493865">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493866">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493867">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493868">
            <property name="name" value="parenthesizedExpression" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664417263">
              <link role="classifier" targetNodeId="19.1113723509227" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493869">
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493870">
                <link role="variableDeclaration" targetNodeId="1115664493861" />
              </node>
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664417310">
                <link role="classifier" targetNodeId="19.1113723509227" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493871">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664417327">
            <link role="baseMethodDeclaration" targetNodeId="19.1113723509243" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493872">
              <link role="variableDeclaration" targetNodeId="1115664493868" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493873">
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493874">
                <link role="variableDeclaration" targetNodeId="1115664493863" />
              </node>
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664417359">
                <link role="classifier" targetNodeId="19.1109971952788" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493875">
          <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493876">
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493877">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493878">
              <link role="variableDeclaration" targetNodeId="1115664493863" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493879">
      <property name="name" value="_SubstituteItemHandler_FreeMethodCallFactory" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493880">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493881">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493882">
        <property name="name" value="itemObject" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493883">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493884">
        <property name="name" value="pattern" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493885">
          <link role="classifier" targetNodeId="14.1086945614127" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493886">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493887">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493888">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493889">
            <property name="name" value="methodCall" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664417392">
              <link role="classifier" targetNodeId="19.1113723508937" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664417472">
              <link role="baseMethodDeclaration" targetNodeId="18.1086856195751" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664417424">
                <link role="classifier" targetNodeId="19.1113723508937" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493890">
                <link role="baseMethodDeclaration" targetNodeId="15.1086945615528" />
                <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493891">
                  <link role="variableDeclaration" targetNodeId="1115664493880" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493892">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664417535">
            <link role="baseMethodDeclaration" targetNodeId="19.1113723508955" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493893">
              <link role="variableDeclaration" targetNodeId="1115664493889" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493894">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664417552">
                <link role="classifier" targetNodeId="19.1109971952128" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493895">
                <link role="variableDeclaration" targetNodeId="1115664493882" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493896">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493897">
            <link role="variableDeclaration" targetNodeId="1115664493889" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493898">
      <property name="name" value="_SubstituteItemHandler_InstanceMethodCallFactory" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493899">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493900">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493901">
        <property name="name" value="itemObject" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493902">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493903">
        <property name="name" value="pattern" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493904">
          <link role="classifier" targetNodeId="14.1086945614127" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493905">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493906">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493907">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493908">
            <property name="name" value="methodCall" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664417600">
              <link role="classifier" targetNodeId="19.1113723508606" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664417664">
              <link role="baseMethodDeclaration" targetNodeId="18.1086856195751" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664417616">
                <link role="classifier" targetNodeId="19.1113723508606" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493909">
                <link role="baseMethodDeclaration" targetNodeId="15.1086945615528" />
                <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493910">
                  <link role="variableDeclaration" targetNodeId="1115664493899" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493911">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493912">
            <link role="variableDeclaration" targetNodeId="1115664493908" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493913">
      <property name="name" value="_SemanticModelQuery_ContextStaticFields" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493914">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493915">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493916">
        <link role="classifier" targetNodeId="16.1087811448220" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493917">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493918">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493919">
            <property name="name" value="list" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493920">
              <link role="classifier" targetNodeId="16.1087811448220" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NewExpression" id="1115664493921">
              <node role="constructorCall" type="jetbrains.mps.baseLanguage.ConstructorCall" id="1115664493922">
                <link role="baseMethodDeclaration" targetNodeId="16.1087811448225" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493923">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493924">
            <property name="name" value="staticFieldReference" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664417712">
              <link role="classifier" targetNodeId="19.1113723509349" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493925">
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493926">
                <link role="variableDeclaration" targetNodeId="1115664493914" />
              </node>
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664417760">
                <link role="classifier" targetNodeId="19.1113723509349" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493927">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493928">
            <property name="name" value="staticType" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493929">
              <link role="classifier" targetNodeId="19.1108062816180" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664417792">
              <link role="baseMethodDeclaration" targetNodeId="19.1113723509365" />
              <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493930">
                <link role="variableDeclaration" targetNodeId="1115664493924" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664493931">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493932">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493933">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493934">
                <property name="name" value="javaClassType" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493935">
                  <link role="classifier" targetNodeId="19.1108062816180" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493936">
                  <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493937">
                    <link role="variableDeclaration" targetNodeId="1115664493928" />
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493938">
                    <link role="classifier" targetNodeId="19.1108062816180" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493939">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493940">
                <property name="name" value="javaClass" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493941">
                  <link role="classifier" targetNodeId="19.1108062933074" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493942">
                  <link role="baseMethodDeclaration" targetNodeId="19.1108062824398" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493943">
                    <link role="variableDeclaration" targetNodeId="1115664493934" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493944">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941822">
                <link role="baseMethodDeclaration" targetNodeId="1115664493952" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941823">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493945">
                  <link role="variableDeclaration" targetNodeId="1115664493940" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493946">
                  <link role="variableDeclaration" targetNodeId="1115664493919" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664493947">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493948">
              <link role="variableDeclaration" targetNodeId="1115664493928" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664493949" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664493950">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493951">
            <link role="variableDeclaration" targetNodeId="1115664493919" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493952">
      <property name="name" value="_PopulateStaticFields" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493953">
        <property name="name" value="javaClass" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493954">
          <link role="classifier" targetNodeId="19.1108062933074" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493955">
        <property name="name" value="list" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493956">
          <link role="classifier" targetNodeId="16.1087811448220" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1115664493957">
        <property name="name" value="void" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493958">
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664493959">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493960">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493961">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493962">
                <property name="name" value="staticFields" />
                <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664493963">
                  <link role="classifier" targetNodeId="16.1087908128062" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493964">
                  <link role="baseMethodDeclaration" targetNodeId="19.1108062943585" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493965">
                    <link role="variableDeclaration" targetNodeId="1115664493953" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664493966">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493967">
                <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493968">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493969">
                    <property name="name" value="staticField" />
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664417872">
                      <link role="classifier" targetNodeId="19.1109971952084" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493970">
                      <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493971">
                        <link role="baseMethodDeclaration" targetNodeId="16.1087908128065" />
                        <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493972">
                          <link role="variableDeclaration" targetNodeId="1115664493962" />
                        </node>
                      </node>
                      <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664417889">
                        <link role="classifier" targetNodeId="19.1109971952084" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493973">
                  <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493974">
                    <link role="baseMethodDeclaration" targetNodeId="16.1087811448229" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493975">
                      <link role="variableDeclaration" targetNodeId="1115664493955" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493976">
                      <link role="variableDeclaration" targetNodeId="1115664493969" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493977">
                <link role="baseMethodDeclaration" targetNodeId="16.1087908128063" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493978">
                  <link role="variableDeclaration" targetNodeId="1115664493962" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493979">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493980">
                <property name="name" value="extendedClass" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493981">
                  <link role="classifier" targetNodeId="19.1108062933074" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664493982">
                  <link role="baseMethodDeclaration" targetNodeId="19.1108062943046" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493983">
                    <link role="variableDeclaration" targetNodeId="1115664493953" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664493984">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941824">
                <link role="baseMethodDeclaration" targetNodeId="1115664493952" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941825">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664493985">
                  <link role="variableDeclaration" targetNodeId="1115664493980" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493986">
                  <link role="variableDeclaration" targetNodeId="1115664493955" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664493987">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664493988" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664493989">
              <link role="variableDeclaration" targetNodeId="1115664493953" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664493990">
      <property name="name" value="_SubstituteNodeActionHandler_SuperConstructorInvocation_InsertArgument" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493991">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493992">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664493993">
        <property name="name" value="object" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493994">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664493995">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664493996">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664493997">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664493998">
            <property name="name" value="newArgument" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664417985">
              <link role="classifier" targetNodeId="19.1109971952788" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664493999">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664418033">
                <link role="classifier" targetNodeId="19.1109971952788" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664494000">
                <link role="variableDeclaration" targetNodeId="1115664493993" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664494001">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494002">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494003">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494004">
                <property name="name" value="constructorInvocation" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664418065">
                  <link role="classifier" targetNodeId="19.1113723509495" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664494005">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664418097">
                    <link role="classifier" targetNodeId="19.1113723509495" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664494006">
                    <link role="variableDeclaration" targetNodeId="1115664493991" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664494007">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664418129">
                <link role="baseMethodDeclaration" targetNodeId="19.1113723509517" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494008">
                  <link role="variableDeclaration" targetNodeId="1115664494004" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494009">
                  <link role="variableDeclaration" targetNodeId="1115664493998" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664494010">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664494011">
              <link role="variableDeclaration" targetNodeId="1115664493991" />
            </node>
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664418177">
              <link role="classifier" targetNodeId="19.1113723509495" />
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.BlockStatement" id="1115664494012">
            <node role="statements" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494013">
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494014">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494015">
                  <property name="name" value="oldArgument" />
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664418209">
                    <link role="classifier" targetNodeId="19.1109971952788" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664494016">
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664418226">
                      <link role="classifier" targetNodeId="19.1109971952788" />
                    </node>
                    <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664494017">
                      <link role="variableDeclaration" targetNodeId="1115664493991" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494018">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494019">
                  <property name="name" value="constructorInvocation" />
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664418274">
                    <link role="classifier" targetNodeId="19.1113723509495" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664494020">
                    <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494021">
                      <link role="baseMethodDeclaration" targetNodeId="15.1086945615661" />
                      <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494038">
                        <link role="variableDeclaration" targetNodeId="1115664494015" />
                      </node>
                    </node>
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664418306">
                      <link role="classifier" targetNodeId="19.1113723509495" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664494039">
                <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664418338">
                  <link role="baseMethodDeclaration" targetNodeId="19.1113723509521" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494040">
                    <link role="variableDeclaration" targetNodeId="1115664494019" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494041">
                    <link role="variableDeclaration" targetNodeId="1115664494015" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494042">
                    <link role="variableDeclaration" targetNodeId="1115664493998" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664494043">
                <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494044">
                  <link role="baseMethodDeclaration" targetNodeId="15.1086945615671" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494045">
                    <link role="variableDeclaration" targetNodeId="1115664494015" />
                  </node>
                </node>
              </node>
            </node>
            <node role="declarations" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494046" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664494047">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494048">
            <link role="variableDeclaration" targetNodeId="1115664493998" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664494049">
      <property name="name" value="_allConstructors" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664494050">
        <property name="name" value="model" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494051">
          <link role="classifier" targetNodeId="15.1086945614636" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664494052">
        <link role="classifier" targetNodeId="16.1087811448033" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494053">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494054">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494055">
            <property name="name" value="list" />
            <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664494056">
              <link role="classifier" targetNodeId="16.1087811448033" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NewExpression" id="1115664494057">
              <node role="constructorCall" type="jetbrains.mps.baseLanguage.ConstructorCall" id="1115664494058">
                <link role="baseMethodDeclaration" targetNodeId="16.1087811448225" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494059">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494060">
            <property name="name" value="iter" />
            <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664494061">
              <link role="classifier" targetNodeId="16.1087908128062" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494062">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945615213" />
              <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664494063">
                <link role="variableDeclaration" targetNodeId="1115664494050" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664494064">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494065">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494066">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494067">
                <property name="name" value="node" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494068">
                  <link role="classifier" targetNodeId="15.1086945614627" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664494069">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494070">
                    <link role="classifier" targetNodeId="15.1086945614627" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494071">
                    <link role="baseMethodDeclaration" targetNodeId="16.1087908128065" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494072">
                      <link role="variableDeclaration" targetNodeId="1115664494060" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664494073">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494074">
                <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494075">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494076">
                    <property name="name" value="javaClass" />
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494077">
                      <link role="classifier" targetNodeId="19.1108062933074" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664494078">
                      <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494079">
                        <link role="variableDeclaration" targetNodeId="1115664494067" />
                      </node>
                      <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494080">
                        <link role="classifier" targetNodeId="19.1108062933074" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494081">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494082">
                    <property name="name" value="constructors" />
                    <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664494083">
                      <link role="classifier" targetNodeId="16.1087908128062" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494084">
                      <link role="baseMethodDeclaration" targetNodeId="19.1108062943353" />
                      <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494085">
                        <link role="variableDeclaration" targetNodeId="1115664494076" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664494086">
                  <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494087">
                    <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664494088">
                      <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494089">
                        <link role="baseMethodDeclaration" targetNodeId="16.1087811448036" />
                        <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494090">
                          <link role="variableDeclaration" targetNodeId="1115664494055" />
                        </node>
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494091">
                          <link role="baseMethodDeclaration" targetNodeId="16.1087908128065" />
                          <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494092">
                            <link role="variableDeclaration" targetNodeId="1115664494082" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494093">
                    <link role="baseMethodDeclaration" targetNodeId="16.1087908128063" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494094">
                      <link role="variableDeclaration" targetNodeId="1115664494082" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664494095">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494096">
                  <link role="variableDeclaration" targetNodeId="1115664494067" />
                </node>
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494097">
                  <link role="classifier" targetNodeId="19.1108062933074" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494098">
            <link role="baseMethodDeclaration" targetNodeId="16.1087908128063" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494099">
              <link role="variableDeclaration" targetNodeId="1115664494060" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664494100">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494101">
            <link role="variableDeclaration" targetNodeId="1115664494055" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664494102">
      <property name="name" value="_allFreeMethods" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664494103">
        <property name="name" value="model" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494104">
          <link role="classifier" targetNodeId="15.1086945614636" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664494105">
        <link role="classifier" targetNodeId="16.1087811448033" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494106">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494107">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494108">
            <property name="name" value="list" />
            <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664494109">
              <link role="classifier" targetNodeId="16.1087811448033" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NewExpression" id="1115664494110">
              <node role="constructorCall" type="jetbrains.mps.baseLanguage.ConstructorCall" id="1115664494111">
                <link role="baseMethodDeclaration" targetNodeId="16.1087811448225" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494112">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494113">
            <property name="name" value="iter" />
            <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664494114">
              <link role="classifier" targetNodeId="16.1087908128062" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494115">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945615213" />
              <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664494116">
                <link role="variableDeclaration" targetNodeId="1115664494103" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664494117">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494118">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494119">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494120">
                <property name="name" value="node" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494121">
                  <link role="classifier" targetNodeId="15.1086945614627" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664494122">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494123">
                    <link role="classifier" targetNodeId="15.1086945614627" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494124">
                    <link role="baseMethodDeclaration" targetNodeId="16.1087908128065" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494125">
                      <link role="variableDeclaration" targetNodeId="1115664494113" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664494126">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494127">
                <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664494128">
                  <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494129">
                    <link role="baseMethodDeclaration" targetNodeId="16.1087811448036" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494130">
                      <link role="variableDeclaration" targetNodeId="1115664494108" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494131">
                      <link role="variableDeclaration" targetNodeId="1115664494120" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664494132">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494133">
                  <link role="variableDeclaration" targetNodeId="1115664494120" />
                </node>
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664418386">
                  <link role="classifier" targetNodeId="19.1109971952128" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494134">
            <link role="baseMethodDeclaration" targetNodeId="16.1087908128063" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494135">
              <link role="variableDeclaration" targetNodeId="1115664494113" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664494136">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494137">
            <link role="variableDeclaration" targetNodeId="1115664494108" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664494138">
      <property name="name" value="_SemanticModelQuery_ContextEnumConstants" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664494139">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494140">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664494141">
        <link role="classifier" targetNodeId="16.1087811448033" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494142">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494143">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494144">
            <property name="name" value="list" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494145">
              <link role="classifier" targetNodeId="16.1087811448220" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NewExpression" id="1115664494146">
              <node role="constructorCall" type="jetbrains.mps.baseLanguage.ConstructorCall" id="1115664494147">
                <link role="baseMethodDeclaration" targetNodeId="16.1087811448225" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494148">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494149">
            <property name="name" value="reference" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664418419">
              <link role="classifier" targetNodeId="19.1113723508164" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664494150">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664418451">
                <link role="classifier" targetNodeId="19.1113723508164" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664494151">
                <link role="variableDeclaration" targetNodeId="1115664494139" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494152">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494153">
            <property name="name" value="classType" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494154">
              <link role="classifier" targetNodeId="19.1108062816180" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664418499">
              <link role="baseMethodDeclaration" targetNodeId="19.1113723508182" />
              <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494155">
                <link role="variableDeclaration" targetNodeId="1115664494149" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664494156">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494157">
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664494158">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494159">
                <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664494160">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941842">
                    <link role="baseMethodDeclaration" targetNodeId="1115664494173" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941843">
                      <link role="classifier" targetNodeId="1115664491666" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664494161">
                      <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664418563">
                        <link role="classifier" targetNodeId="19.1113723508046" />
                      </node>
                      <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494162">
                        <link role="baseMethodDeclaration" targetNodeId="19.1108062824398" />
                        <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494163">
                          <link role="variableDeclaration" targetNodeId="1115664494153" />
                        </node>
                      </node>
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494164">
                      <link role="variableDeclaration" targetNodeId="1115664494144" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664494165">
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664418580">
                  <link role="classifier" targetNodeId="19.1113723508046" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494166">
                  <link role="baseMethodDeclaration" targetNodeId="19.1108062824398" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494167">
                    <link role="variableDeclaration" targetNodeId="1115664494153" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664494168">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664494169" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494170">
              <link role="variableDeclaration" targetNodeId="1115664494153" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664494171">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494172">
            <link role="variableDeclaration" targetNodeId="1115664494144" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664494173">
      <property name="name" value="_PopulateEnumConstants" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664494174">
        <property name="name" value="enumClass" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664406548">
          <link role="classifier" targetNodeId="19.1113723508046" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664494175">
        <property name="name" value="list" />
        <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664494176">
          <link role="classifier" targetNodeId="16.1087811448033" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1115664494177">
        <property name="name" value="void" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494178">
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664494179">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494180">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494181">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494182">
                <property name="name" value="iterator" />
                <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664494183">
                  <link role="classifier" targetNodeId="16.1087908128062" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664418628">
                  <link role="baseMethodDeclaration" targetNodeId="19.1113723508084" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664494184">
                    <link role="variableDeclaration" targetNodeId="1115664494174" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664494185">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494186">
                <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494187">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494188">
                    <property name="name" value="declaration" />
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664418660">
                      <link role="classifier" targetNodeId="19.1113723508096" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664494189">
                      <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664418677">
                        <link role="classifier" targetNodeId="19.1113723508096" />
                      </node>
                      <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494190">
                        <link role="baseMethodDeclaration" targetNodeId="16.1087908128065" />
                        <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494191">
                          <link role="variableDeclaration" targetNodeId="1115664494182" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664494192">
                  <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494193">
                    <link role="baseMethodDeclaration" targetNodeId="16.1087811448036" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664494194">
                      <link role="variableDeclaration" targetNodeId="1115664494175" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494195">
                      <link role="variableDeclaration" targetNodeId="1115664494188" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494196">
                <link role="baseMethodDeclaration" targetNodeId="16.1087908128063" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494197">
                  <link role="variableDeclaration" targetNodeId="1115664494182" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664494198">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664494199">
              <link role="variableDeclaration" targetNodeId="1115664494174" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664494200" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664494201">
      <property name="name" value="_SemanticModelQuery_ContextSuperMethods" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664494202">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494203">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664494204">
        <link role="classifier" targetNodeId="16.1087811448033" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494205">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494206">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494207">
            <property name="name" value="list" />
            <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664494208">
              <link role="classifier" targetNodeId="16.1087811448033" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NewExpression" id="1115664494209">
              <node role="constructorCall" type="jetbrains.mps.baseLanguage.ConstructorCall" id="1115664494210">
                <link role="baseMethodDeclaration" targetNodeId="16.1087811448225" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494211">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494212">
            <property name="name" value="classConcept" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494213">
              <link role="classifier" targetNodeId="19.1108062933074" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664494214" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494215">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494216">
            <property name="name" value="parent" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494217">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494218">
              <link role="baseMethodDeclaration" targetNodeId="15.1086945615661" />
              <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664494219">
                <link role="variableDeclaration" targetNodeId="1115664494202" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664494220">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494221">
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664494222">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494223">
                <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664494224">
                  <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664494225">
                    <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494226">
                      <link role="variableDeclaration" targetNodeId="1115664494212" />
                    </node>
                    <node role="rValue" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664494227">
                      <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494228">
                        <link role="variableDeclaration" targetNodeId="1115664494216" />
                      </node>
                      <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494229">
                        <link role="classifier" targetNodeId="19.1108062933074" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.BreakStatement" id="1115664494230" />
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664494231">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494232">
                  <link role="variableDeclaration" targetNodeId="1115664494216" />
                </node>
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494233">
                  <link role="classifier" targetNodeId="19.1108062933074" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664494234">
              <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664494235">
                <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494236">
                  <link role="variableDeclaration" targetNodeId="1115664494216" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494237">
                  <link role="baseMethodDeclaration" targetNodeId="15.1086945615661" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494238">
                    <link role="variableDeclaration" targetNodeId="1115664494216" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664494239">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494240">
              <link role="variableDeclaration" targetNodeId="1115664494216" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664494241" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664494242">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494243">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494244">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494245">
                <property name="name" value="extendedClass" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494246">
                  <link role="classifier" targetNodeId="19.1108062933074" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494247">
                  <link role="baseMethodDeclaration" targetNodeId="19.1108062943046" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494248">
                    <link role="variableDeclaration" targetNodeId="1115664494212" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664494249">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494250">
                <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664494251">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941844">
                    <link role="baseMethodDeclaration" targetNodeId="1115664494305" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941845">
                      <link role="classifier" targetNodeId="1115664491666" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494252">
                      <link role="variableDeclaration" targetNodeId="1115664494245" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494253">
                      <link role="variableDeclaration" targetNodeId="1115664494207" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664494254">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494255">
                  <link role="variableDeclaration" targetNodeId="1115664494245" />
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664494256" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664494257">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494258">
              <link role="variableDeclaration" targetNodeId="1115664494212" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664494259" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664494260">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494261">
            <link role="variableDeclaration" targetNodeId="1115664494207" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664494262">
      <property name="name" value="_SubstituteNodeActionHandler_EnumConstant_InsertArgument" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664494263">
        <property name="name" value="sourceNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494264">
          <link role="classifier" targetNodeId="15.1086945614627" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664494265">
        <property name="name" value="object" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494266">
          <link role="classifier" targetNodeId="14.1086945614093" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494267">
        <link role="classifier" targetNodeId="15.1086945614627" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494268">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494269">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494270">
            <property name="name" value="newArgument" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664418772">
              <link role="classifier" targetNodeId="19.1109971952788" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664494271">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664418805">
                <link role="classifier" targetNodeId="19.1109971952788" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664494272">
                <link role="variableDeclaration" targetNodeId="1115664494265" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664494273">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494274">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494275">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494276">
                <property name="name" value="enumConstant" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664418837">
                  <link role="classifier" targetNodeId="19.1113723508096" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664494277">
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664494278">
                    <link role="variableDeclaration" targetNodeId="1115664494263" />
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664418885">
                    <link role="classifier" targetNodeId="19.1113723508096" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664494279">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664418917">
                <link role="baseMethodDeclaration" targetNodeId="19.1113723508146" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494280">
                  <link role="variableDeclaration" targetNodeId="1115664494276" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494281">
                  <link role="variableDeclaration" targetNodeId="1115664494270" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664494282">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664494283">
              <link role="variableDeclaration" targetNodeId="1115664494263" />
            </node>
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664418965">
              <link role="classifier" targetNodeId="19.1113723508096" />
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.BlockStatement" id="1115664494284">
            <node role="statements" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494285">
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494286">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494287">
                  <property name="name" value="oldArgument" />
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664418981">
                    <link role="classifier" targetNodeId="19.1109971952788" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664494288">
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664419014">
                      <link role="classifier" targetNodeId="19.1109971952788" />
                    </node>
                    <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664494289">
                      <link role="variableDeclaration" targetNodeId="1115664494263" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494290">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494291">
                  <property name="name" value="enumConstant" />
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664419046">
                    <link role="classifier" targetNodeId="19.1113723508096" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664494292">
                    <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494293">
                      <link role="baseMethodDeclaration" targetNodeId="15.1086945615661" />
                      <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494294">
                        <link role="variableDeclaration" targetNodeId="1115664494287" />
                      </node>
                    </node>
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664419078">
                      <link role="classifier" targetNodeId="19.1113723508096" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664494295">
                <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664419110">
                  <link role="baseMethodDeclaration" targetNodeId="19.1113723508150" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494296">
                    <link role="variableDeclaration" targetNodeId="1115664494291" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494297">
                    <link role="variableDeclaration" targetNodeId="1115664494287" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494298">
                    <link role="variableDeclaration" targetNodeId="1115664494270" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664494299">
                <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494300">
                  <link role="baseMethodDeclaration" targetNodeId="15.1086945615671" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494301">
                    <link role="variableDeclaration" targetNodeId="1115664494287" />
                  </node>
                </node>
              </node>
            </node>
            <node role="declarations" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494302" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1115664494303">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494304">
            <link role="variableDeclaration" targetNodeId="1115664494270" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1115664494305">
      <property name="name" value="_populateInstanceMethods" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664494306">
        <property name="name" value="classifier" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494307">
          <link role="classifier" targetNodeId="19.1108062862271" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1115664494308">
        <property name="name" value="list" />
        <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664494309">
          <link role="classifier" targetNodeId="16.1087811448033" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1115664494310" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494311">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494312">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494313">
            <property name="name" value="methods" />
            <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664494314">
              <link role="classifier" targetNodeId="16.1087908128062" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494315">
              <link role="baseMethodDeclaration" targetNodeId="19.1108062871076" />
              <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664494316">
                <link role="variableDeclaration" targetNodeId="1115664494306" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664494317">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494318">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494319">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494320">
                <property name="name" value="method" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664419158">
                  <link role="classifier" targetNodeId="19.1109971952149" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664494321">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664419191">
                    <link role="classifier" targetNodeId="19.1109971952149" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494322">
                    <link role="baseMethodDeclaration" targetNodeId="16.1087908128065" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494323">
                      <link role="variableDeclaration" targetNodeId="1115664494313" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494324">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494325">
                <property name="name" value="isOverridden" />
                <node role="type" type="jetbrains.mps.baseLanguage.BooleanType" id="1115664494326" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1115664494327">
                  <property name="value" value="false" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494328">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494329">
                <property name="name" value="methodsInList" />
                <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664494330">
                  <link role="classifier" targetNodeId="16.1087908128062" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494331">
                  <link role="baseMethodDeclaration" targetNodeId="16.1087811448078" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664494332">
                    <link role="variableDeclaration" targetNodeId="1115664494308" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664494333">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494334">
                <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494335">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494336">
                    <property name="name" value="methodInList" />
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664419223">
                      <link role="classifier" targetNodeId="19.1109971952149" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664494337">
                      <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664419255">
                        <link role="classifier" targetNodeId="19.1109971952149" />
                      </node>
                      <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494338">
                        <link role="baseMethodDeclaration" targetNodeId="16.1087908128065" />
                        <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494339">
                          <link role="variableDeclaration" targetNodeId="1115664494329" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664494340">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494341">
                    <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664494342">
                      <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664494343">
                        <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494344">
                          <link role="variableDeclaration" targetNodeId="1115664494325" />
                        </node>
                        <node role="rValue" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1115664494345">
                          <property name="value" value="true" />
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.BreakStatement" id="1115664494346" />
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115664494347">
                    <link role="baseMethodDeclaration" targetNodeId="21.1117844018988" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494348">
                      <link role="classifier" targetNodeId="21.1091033020742" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494349">
                      <link role="variableDeclaration" targetNodeId="1115664494320" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494350">
                      <link role="variableDeclaration" targetNodeId="1115664494336" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494351">
                <link role="baseMethodDeclaration" targetNodeId="16.1087908128063" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494352">
                  <link role="variableDeclaration" targetNodeId="1115664494329" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664494353">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494354">
                <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664494355">
                  <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494356">
                    <link role="baseMethodDeclaration" targetNodeId="16.1087811448036" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664494357">
                      <link role="variableDeclaration" targetNodeId="1115664494308" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494358">
                      <link role="variableDeclaration" targetNodeId="1115664494320" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.NotExpression" id="1115664494359">
                <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494360">
                  <link role="variableDeclaration" targetNodeId="1115664494325" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494361">
            <link role="baseMethodDeclaration" targetNodeId="16.1087908128063" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494362">
              <link role="variableDeclaration" targetNodeId="1115664494313" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494363">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494364">
            <property name="name" value="interfaces" />
            <node role="type" type="jetbrains.mps.baseLanguage.InterfaceType" id="1115664494365">
              <link role="classifier" targetNodeId="16.1087908128062" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664494366" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664494367">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494368">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494369">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494370">
                <property name="name" value="extendedClass" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494371">
                  <link role="classifier" targetNodeId="19.1108062933074" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494372">
                  <link role="baseMethodDeclaration" targetNodeId="19.1108062943046" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.ParenthesizedExpression" id="1115664494373">
                    <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664494374">
                      <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494375">
                        <link role="classifier" targetNodeId="19.1108062933074" />
                      </node>
                      <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664494376">
                        <link role="variableDeclaration" targetNodeId="1115664494306" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1115664494377">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494378">
                <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664494379">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941846">
                    <link role="baseMethodDeclaration" targetNodeId="1115664494305" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941847">
                      <link role="classifier" targetNodeId="1115664491666" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494380">
                      <link role="variableDeclaration" targetNodeId="1115664494370" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664494381">
                      <link role="variableDeclaration" targetNodeId="1115664494308" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1115664494382">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494383">
                  <link role="variableDeclaration" targetNodeId="1115664494370" />
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1115664494384" />
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664494385">
              <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664494386">
                <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494387">
                  <link role="variableDeclaration" targetNodeId="1115664494364" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494388">
                  <link role="baseMethodDeclaration" targetNodeId="19.1108062944049" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.ParenthesizedExpression" id="1115664494389">
                    <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664494390">
                      <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494391">
                        <link role="classifier" targetNodeId="19.1108062933074" />
                      </node>
                      <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664494392">
                        <link role="variableDeclaration" targetNodeId="1115664494306" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1115664494393">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664494394">
              <link role="variableDeclaration" targetNodeId="1115664494306" />
            </node>
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494395">
              <link role="classifier" targetNodeId="19.1108062933074" />
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.BlockStatement" id="1115664494396">
            <node role="statements" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494397">
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664494398">
                <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1115664494399">
                  <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494400">
                    <link role="variableDeclaration" targetNodeId="1115664494364" />
                  </node>
                  <node role="rValue" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494401">
                    <link role="baseMethodDeclaration" targetNodeId="19.1108063027104" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.ParenthesizedExpression" id="1115664494402">
                      <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664494403">
                        <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494404">
                          <link role="classifier" targetNodeId="19.1108063020986" />
                        </node>
                        <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664494405">
                          <link role="variableDeclaration" targetNodeId="1115664494306" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="declarations" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494406" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.WhileStatement" id="1115664494407">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1115664494408">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1115664494409">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1115664494410">
                <property name="name" value="interfaceType" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494411">
                  <link role="classifier" targetNodeId="19.1108062829581" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1115664494412">
                  <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494413">
                    <link role="baseMethodDeclaration" targetNodeId="16.1087908128065" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494414">
                      <link role="variableDeclaration" targetNodeId="1115664494364" />
                    </node>
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1115664494415">
                    <link role="classifier" targetNodeId="19.1108062829581" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1115664494416">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941848">
                <link role="baseMethodDeclaration" targetNodeId="1115664494305" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941849">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494417">
                  <link role="baseMethodDeclaration" targetNodeId="19.1108062841818" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494418">
                    <link role="variableDeclaration" targetNodeId="1115664494410" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1115664494419">
                  <link role="variableDeclaration" targetNodeId="1115664494308" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1115664494420">
            <link role="baseMethodDeclaration" targetNodeId="16.1087908128063" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1115664494421">
              <link role="variableDeclaration" targetNodeId="1115664494364" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1073416106125">
    <property name="name" value="StatementList_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068580123136" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1073416106126">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <link role="linkDeclaration" targetNodeId="8.1068581517665" />
      <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1079958242049">
        <property name="editable" value="true" />
        <property name="textFgColor" value="darkGray" />
        <property name="fontStyle" value="ITALIC" />
        <property name="drawBorder" value="false" />
        <property name="nullText" value="&lt;no statements&gt;" />
        <property name="selectable" value="true" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1074794490343">
    <property name="name" value="ClassConcept_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068390468198" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1076938177026">
      <property name="name" value="EmptyListActions" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_DeleteNode" id="1076938177027">
        <property name="disabled" value="true" />
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1074794490344">
      <property name="drawBorder" value="false" />
      <property name="name" value="classBox" />
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1074794604361">
        <property name="drawBorder" value="false" />
        <property name="name" value="headerRow" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1074794604362">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="class" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1074794745222">
          <property name="writable" value="true" />
          <property name="defaultText" value="&lt;no name&gt;" />
          <property name="defaultValue" value="&lt;no name&gt;" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="true" />
          <link role="propertyDeclaration" targetNodeId="9.1078489098626" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1109281144581">
          <property name="drawBorder" value="false" />
          <link role="editorComponent" targetNodeId="1109280020740" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1080648716828">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="extends" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1088354561031">
          <property name="drawBorder" value="false" />
          <property name="nullText" value="&lt;none&gt;" />
          <link role="linkDeclaration" targetNodeId="8.1069939147256" />
          <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1088354561032">
            <link role="conceptDeclaration" targetNodeId="8.1068390468198" />
            <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1088354561033">
              <property name="drawBorder" value="false" />
              <property name="readOnly" value="true" />
              <link role="propertyDeclaration" targetNodeId="8.1075300953595" />
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1107798989515">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="implements" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1107798989516">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="true" />
          <link role="linkDeclaration" targetNodeId="8.1095933932569" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1107798989517">
            <property name="editable" value="true" />
            <property name="drawBorder" value="false" />
            <property name="nullText" value="&lt;none&gt;" />
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1074794745224">
          <property name="text" value="{" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1074866421484">
        <property name="drawBorder" value="false" />
        <property name="name" value="fieldsArea" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1074866421485">
          <property name="text" value="    " />
          <property name="drawBorder" value="false" />
          <property name="name" value="fieldsIndentCell" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1074866421486">
          <property name="drawBorder" value="false" />
          <property name="name" value="fieldsList" />
          <property name="vertical" value="true" />
          <property name="selectable" value="false" />
          <link role="linkDeclaration" targetNodeId="8.1068390468199" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1074866524768">
            <property name="text" value=" &lt;&lt; fields &gt;&gt;" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="true" />
            <link role="actionSet" targetNodeId="1076938177026" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1087206751418">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1087206751419">
          <property name="text" value="    " />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1087206751420">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="true" />
          <link role="linkDeclaration" targetNodeId="8.1070462389653" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1087206751421">
            <property name="text" value=" &lt;&lt; static fields&gt;&gt;" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="true" />
            <link role="actionSet" targetNodeId="1076938177026" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1104451658934">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1074867634394">
        <property name="drawBorder" value="false" />
        <property name="name" value="constructorsArea" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1074867634395">
          <property name="text" value="    " />
          <property name="drawBorder" value="false" />
          <property name="name" value="constructorsIndentCell" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1074867634396">
          <property name="drawBorder" value="false" />
          <property name="name" value="constructorsList" />
          <property name="vertical" value="true" />
          <property name="selectable" value="false" />
          <link role="nodeFactoryQueryBody" targetNodeId="1082026262708" />
          <link role="linkDeclaration" targetNodeId="8.1068390468201" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1074867634397">
            <property name="text" value=" &lt;&lt; constructors &gt;&gt;" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="true" />
            <link role="actionSet" targetNodeId="1076938177026" />
          </node>
          <node role="nodeFactoryQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1082026262707">
            <property name="name" value="nodeFactoryQuery" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082026262903">
              <property name="name" value="listOwner" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082026262904">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1082026262905">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1082026262708" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1104451665639">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1074867682195">
        <property name="drawBorder" value="false" />
        <property name="name" value="methodsArea" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1074868243546">
          <property name="text" value="    " />
          <property name="drawBorder" value="false" />
          <property name="name" value="methodsIndentCell" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1074868243547">
          <property name="drawBorder" value="false" />
          <property name="name" value="methodsList" />
          <property name="vertical" value="true" />
          <property name="selectable" value="false" />
          <link role="linkDeclaration" targetNodeId="8.1107880067339" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1074868243548">
            <property name="text" value=" &lt;&lt; methods &gt;&gt;" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="true" />
            <link role="actionSet" targetNodeId="1076938177026" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1104451669405">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1080825388968">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1080825768015">
          <property name="text" value="    " />
          <property name="drawBorder" value="false" />
          <property name="name" value="methodsIndentCell" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1080825388970">
          <property name="drawBorder" value="false" />
          <property name="name" value="staticMethodList" />
          <property name="vertical" value="true" />
          <property name="selectable" value="false" />
          <link role="linkDeclaration" targetNodeId="8.1070462273904" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1080825538781">
            <property name="text" value=" &lt;&lt; static methods &gt;&gt;" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="true" />
            <link role="actionSet" targetNodeId="1076938177026" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1074794745225">
        <property name="text" value="}" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1074887681312">
    <property name="name" value="FieldReference_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068580123158" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1080138413255">
      <property name="name" value="InstanceCellActions" />
      <link role="specializes" targetNodeId="1082130590765" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1080138413256">
        <property name="substituteHandlerId" value="FieldReferenceInstanceAcceptor" />
        <link role="substituteQueryBody" targetNodeId="1081927995152" />
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927995146">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995147">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995148">
              <link role="classifier" targetNodeId="19.1113723508342" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995149">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995150">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995151">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927995152">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081950606555">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941852">
                <link role="baseMethodDeclaration" targetNodeId="1115664493265" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941853">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081950606558">
                  <link role="variableDeclaration" targetNodeId="1081927995147" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081950606560">
                  <link role="variableDeclaration" targetNodeId="1081927995149" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1080140075203">
      <property name="name" value="FieldCellActions" />
      <link role="specializes" targetNodeId="1107375429415" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1080143775376">
        <property name="substituteHandlerId" value="FieldReference_FieldDeclarationAcceptor" />
        <link role="substituteQueryBody" targetNodeId="1081927995345" />
        <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_ItemGroup" id="1080143775377">
          <property name="name" value="instanceFields" />
          <property name="queryId" value="ContextInstanceFields" />
          <property name="textProviderId" value="JavaElementText" />
          <link role="substituteModelQueryMethod" targetNodeId="1081927995371" />
          <link role="substituteTextQueryBody" targetNodeId="1081927995370" />
          <link role="substituteModelQueryBody" targetNodeId="1081927995375" />
          <link role="substituteTextQueryMethod" targetNodeId="1081927995364" />
          <node role="nodeSubstituteItemClass" type="jetbrains.mps.baseLanguage.ClassConcept" id="1089820984016">
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927995364">
              <property name="name" value="substituteItemText_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995365">
                <property name="name" value="mySourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995366">
                  <link role="classifier" targetNodeId="19.1113723508342" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995367">
                <property name="name" value="myItemObject" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995368">
                  <link role="classifier" targetNodeId="18.1086856195743" />
                </node>
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.StringType" id="1081927995369" />
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927995370">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081950795501">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941854">
                    <link role="baseMethodDeclaration" targetNodeId="1115664491732" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941855">
                      <link role="classifier" targetNodeId="1115664491666" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081950795504">
                      <link role="variableDeclaration" targetNodeId="1081927995365" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081950795506">
                      <link role="variableDeclaration" targetNodeId="1081927995367" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927995371">
              <property name="name" value="substituteItemModel_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995372">
                <property name="name" value="sourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995373">
                  <link role="classifier" targetNodeId="19.1113723508342" />
                </node>
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995374">
                <link role="classifier" targetNodeId="16.1087811448220" />
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927995375">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081950813413">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941856">
                    <link role="baseMethodDeclaration" targetNodeId="1115664493496" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941857">
                      <link role="classifier" targetNodeId="1115664491666" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081950813416">
                      <link role="variableDeclaration" targetNodeId="1081927995372" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927995339">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995340">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995341">
              <link role="classifier" targetNodeId="19.1113723508342" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995342">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995343">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995344">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927995345">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081950639295">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941858">
                <link role="baseMethodDeclaration" targetNodeId="1115664493376" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941859">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081950639298">
                  <link role="variableDeclaration" targetNodeId="1081927995340" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081950639300">
                  <link role="variableDeclaration" targetNodeId="1081927995342" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1080138219829">
      <property name="editable" value="true" />
      <property name="modelAccessorId" value="VariableReferenceName" />
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <link role="actionSet" targetNodeId="1107375429415" />
      <link role="keyMap" targetNodeId="1081427357000" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1080138264330">
        <property name="drawBorder" value="false" />
        <link role="linkDeclaration" targetNodeId="8.1080137532343" />
        <link role="actionSet" targetNodeId="1080138413255" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1080138264331">
        <property name="text" value="." />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1088425851836">
        <property name="drawBorder" value="false" />
        <property name="nullText" value="&lt;no field&gt;" />
        <link role="linkDeclaration" targetNodeId="8.1068581517664" />
        <link role="actionSet" targetNodeId="1080140075203" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1088425851837">
          <link role="conceptDeclaration" targetNodeId="8.1068431474542" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1088425851838">
            <property name="textFgColor" value="DARK_MAGENTA" />
            <property name="fontStyle" value="BOLD" />
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <link role="propertyDeclaration" targetNodeId="8.1083152972671" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075038120000">
    <property name="name" value="ParameterReference_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068581242874" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1088427419930">
      <property name="drawBorder" value="false" />
      <property name="nullText" value="&lt;no parm&gt;" />
      <link role="actionSet" targetNodeId="1107375429415" />
      <link role="linkDeclaration" targetNodeId="8.1068581517664" />
      <link role="keyMap" targetNodeId="1081427357000" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1088427419931">
        <link role="conceptDeclaration" targetNodeId="8.1068431474542" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1088427419932">
          <property name="drawBorder" value="false" />
          <property name="readOnly" value="true" />
          <link role="propertyDeclaration" targetNodeId="8.1083152972671" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075038182859">
    <property name="name" value="LocalVariableReference_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068581242866" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1119563683422">
      <property name="drawBorder" value="false" />
      <link role="linkDeclaration" targetNodeId="8.1068581517664" />
      <link role="actionSet" targetNodeId="1107375429415" />
      <link role="keyMap" targetNodeId="1081427357000" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1119563683423">
        <link role="conceptDeclaration" targetNodeId="8.1068431474542" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1119563690800">
          <property name="defaultText" value="&lt;no name&gt;" />
          <property name="drawBorder" value="false" />
          <property name="readOnly" value="true" />
          <link role="propertyDeclaration" targetNodeId="8.1083152972671" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075139052656">
    <property name="name" value="ConstructorDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068580123140" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075139052657">
      <property name="drawBorder" value="false" />
      <property name="name" value="methodBox" />
      <property name="vertical" value="true" />
      <property name="selectable" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075139052658">
        <property name="drawBorder" value="false" />
        <property name="name" value="headerRow" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1107467684674">
          <property name="editable" value="true" />
          <property name="defaultText" value="&lt;constructor&gt;" />
          <property name="drawBorder" value="false" />
          <property name="readOnly" value="true" />
          <link role="propertyDeclaration" targetNodeId="8.1083152972672" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075140096042">
          <property name="text" value="(" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1079958138015">
          <property name="drawBorder" value="false" />
          <link role="editorComponent" targetNodeId="1079954801953" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075140096043">
          <property name="text" value=") {" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075139937803">
        <property name="drawBorder" value="false" />
        <property name="name" value="bodyArea" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075139937804">
          <property name="text" value="  " />
          <property name="drawBorder" value="false" />
          <property name="name" value="indentCell" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075139937805">
          <property name="drawBorder" value="false" />
          <link role="linkDeclaration" targetNodeId="8.1068580123135" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075139395584">
        <property name="text" value="}" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075233459437">
    <property name="name" value="InstanceMethodDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068580123165" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1076937272595">
      <property name="name" value="ReturnTypeCellActions" />
      <link role="specializes" targetNodeId="1076932037578" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1076937272596">
        <property name="substituteHandlerId" value="BaseMethodDeclReturnTypeAcceptor" />
        <link role="substituteQueryBody" targetNodeId="1081927995689" />
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927995683">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995684">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995685">
              <link role="classifier" targetNodeId="19.1109971952149" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995686">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995687">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995688">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927995689">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081951398352">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941860">
                <link role="baseMethodDeclaration" targetNodeId="1115664493245" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941861">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951398355">
                  <link role="variableDeclaration" targetNodeId="1081927995684" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951398357">
                  <link role="variableDeclaration" targetNodeId="1081927995686" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075233459438">
      <property name="drawBorder" value="false" />
      <property name="name" value="methodBox" />
      <property name="vertical" value="true" />
      <property name="selectable" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075233459439">
        <property name="drawBorder" value="false" />
        <property name="name" value="headerRow" />
        <property name="vertical" value="false" />
        <property name="selectable" value="true" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075233539828">
          <property name="drawBorder" value="false" />
          <property name="nullText" value="&lt;no return type&gt;" />
          <property name="name" value="returnType" />
          <link role="linkDeclaration" targetNodeId="8.1068580123133" />
          <link role="actionSet" targetNodeId="1076937272595" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1075233459441">
          <property name="writable" value="true" />
          <property name="defaultText" value="&lt;no name&gt;" />
          <property name="defaultValue" value="?" />
          <property name="drawBorder" value="false" />
          <property name="name" value="methodName" />
          <link role="propertyDeclaration" targetNodeId="9.1078489098626" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075233459442">
          <property name="text" value="(" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1079958198392">
          <property name="drawBorder" value="false" />
          <link role="editorComponent" targetNodeId="1079954801953" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075233459445">
          <property name="text" value=") {" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075233459446">
        <property name="drawBorder" value="false" />
        <property name="name" value="bodyArea" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075233459447">
          <property name="text" value="  " />
          <property name="drawBorder" value="false" />
          <property name="name" value="indentCell" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075233459448">
          <property name="drawBorder" value="false" />
          <link role="linkDeclaration" targetNodeId="8.1068580123135" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075233459449">
        <property name="text" value="}" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075287750850">
    <property name="name" value="StaticMethodDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1081236700938" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1076941599931">
      <property name="name" value="ReturnTypeCellActions" />
      <link role="specializes" targetNodeId="1076932037578" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1076941710891">
        <property name="substituteHandlerId" value="BaseMethodDeclReturnTypeAcceptor" />
        <link role="substituteQueryBody" targetNodeId="1081927996165" />
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996159">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996160">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996161">
              <link role="classifier" targetNodeId="19.1109971952099" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996162">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996163">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996164">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996165">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081952151288">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941862">
                <link role="baseMethodDeclaration" targetNodeId="1115664493245" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941863">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081952151291">
                  <link role="variableDeclaration" targetNodeId="1081927996160" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081952151293">
                  <link role="variableDeclaration" targetNodeId="1081927996162" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075287750849">
      <property name="drawBorder" value="false" />
      <property name="name" value="methodBox" />
      <property name="vertical" value="true" />
      <property name="selectable" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075287750860">
        <property name="drawBorder" value="false" />
        <property name="name" value="headerRow" />
        <property name="vertical" value="false" />
        <property name="selectable" value="true" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1080826270968">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="static" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075287750861">
          <property name="drawBorder" value="false" />
          <property name="nullText" value="&lt;no type&gt;" />
          <property name="name" value="returnType" />
          <link role="linkDeclaration" targetNodeId="8.1068580123133" />
          <link role="actionSet" targetNodeId="1076941599931" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1075287750862">
          <property name="textFgColor" value="darkGray" />
          <property name="writable" value="true" />
          <property name="defaultText" value="&lt;no name&gt;" />
          <property name="defaultValue" value="?" />
          <property name="drawBorder" value="false" />
          <property name="name" value="methodName" />
          <link role="propertyDeclaration" targetNodeId="9.1078489098626" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075287750863">
          <property name="text" value="(" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1079958166205">
          <property name="drawBorder" value="false" />
          <link role="editorComponent" targetNodeId="1079954801953" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075287750856">
          <property name="text" value=") {" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075287750857">
        <property name="drawBorder" value="false" />
        <property name="name" value="bodyArea" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075287750858">
          <property name="text" value="  " />
          <property name="drawBorder" value="false" />
          <property name="name" value="indentCell" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075287750859">
          <property name="drawBorder" value="false" />
          <link role="linkDeclaration" targetNodeId="8.1068580123135" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075287750864">
        <property name="text" value="}" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075289941062">
    <property name="name" value="FieldDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068390468200" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1076781056865">
      <property name="name" value="NameCellActions" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_RightTransform" id="1076781056866">
        <property name="actionProviderId" value="AddInitializer" />
      </node>
    </node>
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1076932322494">
      <property name="name" value="TypeCellActions" />
      <link role="specializes" targetNodeId="1076932037578" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1076932513261">
        <property name="substituteHandlerId" value="VariableDeclarationTypeAcceptor" />
        <link role="substituteQueryBody" targetNodeId="1081927994663" />
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927994657">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927994658">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927994659">
              <link role="classifier" targetNodeId="19.1109971952054" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927994660">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927994661">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927994662">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927994663">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081950597565">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941864">
                <link role="baseMethodDeclaration" targetNodeId="1115664493297" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941865">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081950597568">
                  <link role="variableDeclaration" targetNodeId="1081927994658" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081950597570">
                  <link role="variableDeclaration" targetNodeId="1081927994660" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075289941063">
      <property name="drawBorder" value="false" />
      <property name="name" value="declarationBox" />
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075289941064">
        <property name="nullRefText" value="&lt;no type&gt;" />
        <property name="drawBorder" value="false" />
        <property name="nullText" value="&lt;no type&gt;" />
        <link role="linkDeclaration" targetNodeId="8.1068431790188" />
        <link role="actionSet" targetNodeId="1076932322494" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1075289970878">
        <property name="textFgColor" value="DARK_MAGENTA" />
        <property name="writable" value="true" />
        <property name="defaultText" value="&lt;no name&gt;" />
        <property name="fontStyle" value="BOLD" />
        <property name="defaultValue" value="?" />
        <property name="drawBorder" value="false" />
        <link role="actionSet" targetNodeId="1076781056865" />
        <link role="propertyDeclaration" targetNodeId="9.1078489098626" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075290206265">
        <property name="drawBorder" value="false" />
        <property name="name" value="initializerArea" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <link role="conditionalQueryBody" targetNodeId="1082097601658" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075290218688">
          <property name="text" value="=" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075290268533">
          <property name="drawBorder" value="false" />
          <link role="linkDeclaration" targetNodeId="8.1068431790190" />
          <link role="actionSet" targetNodeId="1077124145703" />
        </node>
        <node role="conditionalQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1082097601654">
          <property name="name" value="conditionalQuery" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082097601655">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082097601656">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.BooleanType" id="1082097601657">
            <property name="name" value="boolean" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1082097601658">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1082099647296">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941866">
                <link role="baseMethodDeclaration" targetNodeId="1115664493284" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941867">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082099722351">
                  <link role="variableDeclaration" targetNodeId="1082097601655" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075289999925">
        <property name="text" value=";" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075302295734">
    <property name="name" value="ParameterDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068498886292" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1076950581786">
      <property name="name" value="TypeCellActions" />
      <link role="specializes" targetNodeId="1076932037578" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1076950581787">
        <property name="substituteHandlerId" value="VariableDeclarationTypeAcceptor" />
        <link role="substituteQueryBody" targetNodeId="1081927994749" />
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927994743">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927994744">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927994745">
              <link role="classifier" targetNodeId="19.1109971953670" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927994746">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927994747">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927994748">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927994749">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081951541117">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941868">
                <link role="baseMethodDeclaration" targetNodeId="1115664493297" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941869">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951541120">
                  <link role="variableDeclaration" targetNodeId="1081927994744" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951541122">
                  <link role="variableDeclaration" targetNodeId="1081927994746" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1080043594937">
      <property name="name" value="NameCellActions" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_RightTransform" id="1080043594938">
        <property name="actionProviderId" value="AddParameterDeclaration" />
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075302295735">
      <property name="drawBorder" value="false" />
      <property name="name" value="declarationBox" />
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075302295736">
        <property name="drawBorder" value="false" />
        <property name="nullText" value="&lt;no type&gt;" />
        <link role="actionSet" targetNodeId="1076950581786" />
        <link role="linkDeclaration" targetNodeId="8.1068431790188" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1075302295737">
        <property name="writable" value="true" />
        <property name="defaultText" value="&lt;no name&gt;" />
        <property name="defaultValue" value="?" />
        <property name="drawBorder" value="false" />
        <link role="propertyDeclaration" targetNodeId="9.1078489098626" />
        <link role="actionSet" targetNodeId="1080043594937" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075303160500">
    <property name="name" value="LocalVariableDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068581242863" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1076938908095">
      <property name="name" value="TypeCellActions" />
      <link role="specializes" targetNodeId="1076932037578" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1076938908097">
        <property name="substituteHandlerId" value="VariableDeclarationTypeAcceptor" />
        <link role="substituteQueryBody" targetNodeId="1081927995734" />
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927995728">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995729">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995730">
              <link role="classifier" targetNodeId="19.1113723508815" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995731">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995732">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995733">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927995734">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081951447386">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941870">
                <link role="baseMethodDeclaration" targetNodeId="1115664493297" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941871">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951447389">
                  <link role="variableDeclaration" targetNodeId="1081927995729" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951447391">
                  <link role="variableDeclaration" targetNodeId="1081927995731" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1076938982020">
      <property name="name" value="NameCellActions" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_RightTransform" id="1076938982021">
        <property name="actionProviderId" value="AddInitializer" />
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075303160501">
      <property name="drawBorder" value="false" />
      <property name="name" value="declarationBox" />
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075303160502">
        <property name="drawBorder" value="false" />
        <property name="nullText" value="&lt;no type&gt;" />
        <link role="actionSet" targetNodeId="1076938908095" />
        <link role="linkDeclaration" targetNodeId="8.1068431790188" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1075303160503">
        <property name="writable" value="true" />
        <property name="defaultText" value="&lt;no name&gt;" />
        <property name="defaultValue" value="?" />
        <property name="drawBorder" value="false" />
        <link role="actionSet" targetNodeId="1076938982020" />
        <link role="keyMap" targetNodeId="1107341785237" />
        <link role="propertyDeclaration" targetNodeId="9.1078489098626" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075303160504">
        <property name="drawBorder" value="false" />
        <property name="conditionId" value="HasInitializer" />
        <property name="name" value="initializerArea" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <link role="conditionalQueryBody" targetNodeId="1082097602081" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075303160505">
          <property name="text" value="=" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075303160506">
          <property name="drawBorder" value="false" />
          <link role="linkDeclaration" targetNodeId="8.1068431790190" />
        </node>
        <node role="conditionalQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1082097602077">
          <property name="name" value="conditionalQuery" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082097602078">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082097602079">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.BooleanType" id="1082097602080">
            <property name="name" value="boolean" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1082097602081">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1082099699222">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941872">
                <link role="baseMethodDeclaration" targetNodeId="1115664493284" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941873">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082099722403">
                  <link role="variableDeclaration" targetNodeId="1082097602078" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075307690078">
    <property name="name" value="InstanceMethodCall_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068580123163" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1076936461312">
      <property name="name" value="InstanceCellActions" />
      <link role="specializes" targetNodeId="1082130590765" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1076936565079">
        <property name="substituteHandlerId" value="InstanceMethodCallInstanceAcceptor" />
        <link role="substituteQueryBody" targetNodeId="1081927995440" />
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927995434">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995435">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995436">
              <link role="classifier" targetNodeId="19.1113723508606" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995437">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995438">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995439">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927995440">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081951098381">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941874">
                <link role="baseMethodDeclaration" targetNodeId="1115664493131" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941875">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951098384">
                  <link role="variableDeclaration" targetNodeId="1081927995435" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951098386">
                  <link role="variableDeclaration" targetNodeId="1081927995437" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1076935149131">
      <property name="name" value="NameCellActions" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1076935149133">
        <link role="substituteQueryBody" targetNodeId="1081927995633" />
        <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_ItemGroup" id="1076935149134">
          <property name="name" value="instanceMethods" />
          <link role="substituteTextQueryMethod" targetNodeId="1081927995652" />
          <link role="substituteTextQueryBody" targetNodeId="1081927995658" />
          <link role="substituteModelQueryBody" targetNodeId="1081927995663" />
          <link role="substituteModelQueryMethod" targetNodeId="1081927995659" />
          <node role="nodeSubstituteItemClass" type="jetbrains.mps.baseLanguage.ClassConcept" id="1089820984033">
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927995652">
              <property name="name" value="substituteItemText_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995653">
                <property name="name" value="mySourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995654">
                  <link role="classifier" targetNodeId="19.1113723508606" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995655">
                <property name="name" value="myItemObject" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995656">
                  <link role="classifier" targetNodeId="18.1086856195743" />
                </node>
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.StringType" id="1081927995657" />
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927995658">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081951145417">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941876">
                    <link role="baseMethodDeclaration" targetNodeId="1115664491732" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941877">
                      <link role="classifier" targetNodeId="1115664491666" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951145420">
                      <link role="variableDeclaration" targetNodeId="1081927995653" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951145422">
                      <link role="variableDeclaration" targetNodeId="1081927995655" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927995659">
              <property name="name" value="substituteItemModel_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995660">
                <property name="name" value="sourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995661">
                  <link role="classifier" targetNodeId="19.1113723508606" />
                </node>
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995662">
                <link role="classifier" targetNodeId="16.1087811448220" />
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927995663">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081951372045">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941878">
                    <link role="baseMethodDeclaration" targetNodeId="1115664492356" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941879">
                      <link role="classifier" targetNodeId="1115664491666" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951372048">
                      <link role="variableDeclaration" targetNodeId="1081927995660" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927995627">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995628">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995629">
              <link role="classifier" targetNodeId="19.1113723508606" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995630">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995631">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995632">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927995633">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081951386784">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941880">
                <link role="baseMethodDeclaration" targetNodeId="1115664493170" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941881">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951386787">
                  <link role="variableDeclaration" targetNodeId="1081927995628" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951386789">
                  <link role="variableDeclaration" targetNodeId="1081927995630" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075307690079">
      <property name="drawBorder" value="false" />
      <property name="name" value="expressionBox" />
      <property name="vertical" value="false" />
      <link role="keyMap" targetNodeId="1081427357000" />
      <link role="actionSet" targetNodeId="1107375429415" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075308068515">
        <property name="drawBorder" value="false" />
        <link role="actionSet" targetNodeId="1076936461312" />
        <link role="linkDeclaration" targetNodeId="8.1068580123164" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075308084251">
        <property name="text" value="." />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1088426063979">
        <property name="drawBorder" value="false" />
        <property name="nullText" value="&lt;no method&gt;" />
        <link role="linkDeclaration" targetNodeId="8.1068499141037" />
        <link role="actionSet" targetNodeId="1076935149131" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1088426063980">
          <link role="conceptDeclaration" targetNodeId="8.1068580123132" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1088426063981">
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <link role="propertyDeclaration" targetNodeId="8.1083152972672" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075307690081">
        <property name="text" value="(" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1080129798218">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1080128409625" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075307690084">
        <property name="editable" value="false" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="actionSet" targetNodeId="1082463574819" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075308772515">
    <property name="name" value="StaticMethodCall_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1081236700937" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1081149570776">
      <property name="name" value="TypeActions" />
      <link role="specializes" targetNodeId="1082741406448" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1081149570777">
        <link role="substituteQueryBody" targetNodeId="1081927996024" />
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996018">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996019">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996020">
              <link role="classifier" targetNodeId="19.1113723509393" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996021">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996022">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996023">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996024">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081951614994">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941882">
                <link role="baseMethodDeclaration" targetNodeId="1115664493150" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941883">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951614997">
                  <link role="variableDeclaration" targetNodeId="1081927996019" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951614999">
                  <link role="variableDeclaration" targetNodeId="1081927996021" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1081149733740">
      <property name="name" value="MethodNameActions" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1081149733742">
        <property name="substituteHandlerId" value="BaseMethodCallMethodAcceptor" />
        <link role="substituteQueryBody" targetNodeId="1081927996109" />
        <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_ItemGroup" id="1081149733743">
          <property name="name" value="staticMethods" />
          <property name="queryId" value="ContextStaticMethods" />
          <property name="textProviderId" value="JavaElementText" />
          <link role="substituteModelQueryBody" targetNodeId="1081927996139" />
          <link role="substituteTextQueryBody" targetNodeId="1081927996134" />
          <link role="substituteTextQueryMethod" targetNodeId="1081927996128" />
          <link role="substituteModelQueryMethod" targetNodeId="1081927996135" />
          <node role="nodeSubstituteItemClass" type="jetbrains.mps.baseLanguage.ClassConcept" id="1089820984049">
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996128">
              <property name="name" value="substituteItemText_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996129">
                <property name="name" value="mySourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996130">
                  <link role="classifier" targetNodeId="19.1113723509393" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996131">
                <property name="name" value="myItemObject" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996132">
                  <link role="classifier" targetNodeId="18.1086856195743" />
                </node>
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.StringType" id="1081927996133" />
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996134">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081951816949">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941900">
                    <link role="baseMethodDeclaration" targetNodeId="1115664491732" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941901">
                      <link role="classifier" targetNodeId="1115664491666" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951816952">
                      <link role="variableDeclaration" targetNodeId="1081927996129" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951816954">
                      <link role="variableDeclaration" targetNodeId="1081927996131" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996135">
              <property name="name" value="substituteItemModel_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996136">
                <property name="name" value="sourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996137">
                  <link role="classifier" targetNodeId="19.1113723509393" />
                </node>
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996138">
                <link role="classifier" targetNodeId="16.1087811448220" />
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996139">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081952122815">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941902">
                    <link role="baseMethodDeclaration" targetNodeId="1115664492474" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941903">
                      <link role="classifier" targetNodeId="1115664491666" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081952122818">
                      <link role="variableDeclaration" targetNodeId="1081927996136" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996103">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996104">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996105">
              <link role="classifier" targetNodeId="19.1113723509393" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996106">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996107">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996108">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996109">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081951629922">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941904">
                <link role="baseMethodDeclaration" targetNodeId="1115664493170" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941905">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951629925">
                  <link role="variableDeclaration" targetNodeId="1081927996104" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951629927">
                  <link role="variableDeclaration" targetNodeId="1081927996106" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1081149310028">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <link role="actionSet" targetNodeId="1107375429415" />
      <link role="keyMap" targetNodeId="1081427357000" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1081149310029">
        <property name="drawBorder" value="false" />
        <property name="nullText" value="&lt;no type&gt;" />
        <link role="linkDeclaration" targetNodeId="8.1081236769986" />
        <link role="actionSet" targetNodeId="1081149570776" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1081149570778">
        <property name="text" value="." />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1088427863670">
        <property name="drawBorder" value="false" />
        <property name="nullText" value="&lt;no method&gt;" />
        <link role="actionSet" targetNodeId="1081149733740" />
        <link role="linkDeclaration" targetNodeId="8.1068499141037" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1088427863671">
          <link role="conceptDeclaration" targetNodeId="8.1068580123132" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1088427863672">
            <property name="fontStyle" value="ITALIC" />
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <link role="propertyDeclaration" targetNodeId="8.1083152972672" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1081149570780">
        <property name="text" value="(" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1081149570781">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1080128409625" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1081149570782">
        <property name="editable" value="false" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="actionSet" targetNodeId="1082463574819" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075310191002">
    <property name="name" value="EqualsExpression_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068580123152" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075310191003">
      <property name="drawBorder" value="false" />
      <property name="name" value="expressionBox" />
      <property name="actionSet" value="RightTransform" />
      <property name="vertical" value="false" />
      <property name="selectable" value="true" />
      <property name="gridLayout" value="true" />
      <link role="actionSet" targetNodeId="1107375429415" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1081777074470">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1081776311281" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075310191006">
        <property name="editable" value="true" />
        <property name="text" value="==" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="actionSet" targetNodeId="1082657774875" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1081777074471">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1081776482707" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075310480281">
    <property name="name" value="AssignmentExpression_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068498886294" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1076587264182">
      <property name="name" value="LeftExpressionActions" />
      <link role="specializes" targetNodeId="1082130590765" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1076587907859">
        <property name="substituteHandlerId" value="LeftHandExpressionAcceptor" />
        <link role="substituteQueryBody" targetNodeId="1081927994544" />
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927994538">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927994539">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927994540">
              <link role="classifier" targetNodeId="19.1113723507352" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927994541">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1086342303579">
              <link role="classifier" targetNodeId="14.1086945614093" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927994543">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927994544">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081950393299">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941906">
                <link role="baseMethodDeclaration" targetNodeId="1115664492212" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941907">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081950393302">
                  <link role="variableDeclaration" targetNodeId="1081927994539" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1086342571453">
                  <link role="variableDeclaration" targetNodeId="1081927994541" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1076699801734">
      <property name="name" value="RightExpressionActions" />
      <link role="specializes" targetNodeId="1082130590765" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1076699801735">
        <property name="substituteHandlerId" value="RightHandExpressionAcceptor" />
        <link role="substituteQueryBody" targetNodeId="1081927994656" />
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927994650">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927994651">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927994652">
              <link role="classifier" targetNodeId="19.1113723507352" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927994653">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1086342468196">
              <link role="classifier" targetNodeId="14.1086945614093" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927994655">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927994656">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081950419055">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941908">
                <link role="baseMethodDeclaration" targetNodeId="1115664492259" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941909">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081950419058">
                  <link role="variableDeclaration" targetNodeId="1081927994651" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1086342571463">
                  <link role="variableDeclaration" targetNodeId="1081927994653" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075310480282">
      <property name="drawBorder" value="false" />
      <property name="name" value="expressionBox" />
      <property name="actionSet" value="RightTransform" />
      <property name="vertical" value="false" />
      <property name="gridLayout" value="true" />
      <property name="selectable" value="true" />
      <link role="actionSet" targetNodeId="1107375429415" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075310480284">
        <property name="drawBorder" value="false" />
        <property name="actionSet" value="LeftExpression" />
        <property name="selectable" value="true" />
        <link role="errorActionSet" targetNodeId="1077284637890" />
        <link role="linkDeclaration" targetNodeId="8.1068498886295" />
        <link role="actionSet" targetNodeId="1076587264182" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075310480285">
        <property name="text" value="=" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075310480286">
        <property name="drawBorder" value="false" />
        <property name="actionSet" value="RightExpression" />
        <property name="selectable" value="true" />
        <link role="linkDeclaration" targetNodeId="8.1068498886297" />
        <link role="actionSet" targetNodeId="1076699801734" />
        <link role="errorActionSet" targetNodeId="1077284637890" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075310659937">
    <property name="name" value="MinusExpression_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068581242869" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075310659938">
      <property name="drawBorder" value="false" />
      <property name="name" value="expressionBox" />
      <property name="actionSet" value="RightTransform" />
      <property name="vertical" value="false" />
      <property name="gridLayout" value="true" />
      <property name="selectable" value="true" />
      <link role="actionSet" targetNodeId="1107375429415" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1081777125800">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1081776311281" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075310659941">
        <property name="editable" value="true" />
        <property name="text" value="-" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="actionSet" targetNodeId="1082657774875" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1081777125801">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1081776482707" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075310695835">
    <property name="name" value="PlusExpression_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068581242875" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075310695836">
      <property name="drawBorder" value="false" />
      <property name="name" value="expressionBox" />
      <property name="actionSet" value="RightTransform" />
      <property name="vertical" value="false" />
      <property name="selectable" value="true" />
      <property name="gridLayout" value="true" />
      <link role="actionSet" targetNodeId="1107375429415" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1081776530461">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1081776311281" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075310695839">
        <property name="editable" value="true" />
        <property name="text" value="+" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="actionSet" targetNodeId="1082657774875" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1081776530462">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1081776482707" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075311148296">
    <property name="name" value="BooleanType_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1070534644030" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075311148297">
      <property name="editable" value="true" />
      <property name="textFgColor" value="DARK_BLUE" />
      <property name="text" value="boolean" />
      <property name="drawBorder" value="false" />
      <property name="selectable" value="true" />
      <link role="keyMap" targetNodeId="1119265790350" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075311184611">
    <property name="name" value="ByteType_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1070534604311" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075311184612">
      <property name="editable" value="true" />
      <property name="textFgColor" value="DARK_BLUE" />
      <property name="text" value="byte" />
      <property name="drawBorder" value="false" />
      <property name="selectable" value="true" />
      <link role="keyMap" targetNodeId="1119265790350" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075311208800">
    <property name="name" value="CharType_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1070534555686" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075311208801">
      <property name="editable" value="true" />
      <property name="textFgColor" value="DARK_BLUE" />
      <property name="text" value="char" />
      <property name="drawBorder" value="false" />
      <property name="selectable" value="true" />
      <link role="keyMap" targetNodeId="1119265790350" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075311246068">
    <property name="name" value="FloatType_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1070534436861" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075311246069">
      <property name="editable" value="true" />
      <property name="textFgColor" value="DARK_BLUE" />
      <property name="text" value="float" />
      <property name="drawBorder" value="false" />
      <property name="selectable" value="true" />
      <link role="keyMap" targetNodeId="1119265790350" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075311278508">
    <property name="name" value="IntegerType_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1070534370425" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075311278509">
      <property name="editable" value="true" />
      <property name="textFgColor" value="DARK_BLUE" />
      <property name="text" value="int" />
      <property name="drawBorder" value="false" />
      <property name="selectable" value="true" />
      <link role="keyMap" targetNodeId="1119265790350" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075311329197">
    <property name="name" value="LongType_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068581242867" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075311329198">
      <property name="editable" value="true" />
      <property name="textFgColor" value="DARK_BLUE" />
      <property name="text" value="long" />
      <property name="drawBorder" value="false" />
      <property name="selectable" value="true" />
      <link role="keyMap" targetNodeId="1119265790350" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075311365246">
    <property name="name" value="ShortType_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1070533982221" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075311365247">
      <property name="editable" value="true" />
      <property name="text" value="short" />
      <property name="drawBorder" value="false" />
      <property name="selectable" value="true" />
      <link role="keyMap" targetNodeId="1119265790350" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075311403842">
    <property name="name" value="VoidType_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068581517677" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075311403843">
      <property name="editable" value="true" />
      <property name="textFgColor" value="DARK_BLUE" />
      <property name="text" value="void" />
      <property name="drawBorder" value="false" />
      <property name="selectable" value="true" />
      <link role="keyMap" targetNodeId="1119265790350" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075311808095">
    <property name="name" value="DoubleType_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1070534513062" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075311808096">
      <property name="editable" value="true" />
      <property name="textFgColor" value="DARK_BLUE" />
      <property name="text" value="double" />
      <property name="drawBorder" value="false" />
      <property name="selectable" value="true" />
      <link role="keyMap" targetNodeId="1119265790350" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075311823660">
    <property name="name" value="ClassType_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068580320022" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1109204485828">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <link role="keyMap" targetNodeId="1119265790350" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1109204507830">
        <property name="drawBorder" value="false" />
        <property name="nullText" value="&lt;no class&gt;" />
        <link role="linkDeclaration" targetNodeId="8.1107535970390" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1109204489563">
          <link role="conceptDeclaration" targetNodeId="8.1068390468198" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1109204507831">
            <property name="defaultText" value="&lt;no name&gt;" />
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <link role="propertyDeclaration" targetNodeId="8.1075300953595" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1109204507832">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1109203171524" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075374082688">
    <property name="name" value="IntegerConstant_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068580320020" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1083091696640">
      <property name="textFgColor" value="blue" />
      <property name="defaultText" value="&lt;int constant&gt;" />
      <property name="drawBorder" value="false" />
      <link role="actionSet" targetNodeId="1107375429415" />
      <link role="keyMap" targetNodeId="1081427357000" />
      <link role="propertyDeclaration" targetNodeId="8.1068580320021" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075374106049">
    <property name="name" value="BooleanConstant_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068580123137" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1088424970609">
      <property name="textFgColor" value="DARK_BLUE" />
      <property name="fontStyle" value="BOLD" />
      <property name="drawBorder" value="false" />
      <link role="propertyDeclaration" targetNodeId="8.1068580123138" />
      <link role="keyMap" targetNodeId="1081427357000" />
      <link role="actionSet" targetNodeId="1107375429415" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075374365333">
    <property name="name" value="ThisExpression_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1070475354124" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075374365334">
      <property name="editable" value="true" />
      <property name="textFgColor" value="DARK_BLUE" />
      <property name="text" value="this" />
      <property name="drawBorder" value="false" />
      <property name="selectable" value="true" />
      <link role="keyMap" targetNodeId="1081427357000" />
      <link role="actionSet" targetNodeId="1107375429415" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075374525819">
    <property name="name" value="NewExpression_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068581242872" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075374525820">
      <property name="drawBorder" value="false" />
      <property name="name" value="expressionBox" />
      <property name="vertical" value="false" />
      <link role="keyMap" targetNodeId="1081427357000" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075374525821">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="new" />
        <property name="fontStyle" value="BOLD" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075374525822">
        <property name="drawBorder" value="false" />
        <property name="nullText" value="&lt;no constructor call&gt;" />
        <property name="selectable" value="false" />
        <link role="linkDeclaration" targetNodeId="8.1068581242873" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075376169046">
    <property name="name" value="Expression_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068431790191" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1076780136970">
      <property name="name" value="NodeBoxActions" />
      <link role="specializes" targetNodeId="1082130590765" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_RightTransform" id="1079526533375">
        <property name="disabled" value="true" />
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Error" id="1075376431437">
      <property name="text" value="&lt;expression&gt;" />
      <property name="drawBorder" value="false" />
      <link role="keyMap" targetNodeId="1081427357000" />
      <link role="actionSet" targetNodeId="1076780136970" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075379141234">
    <property name="name" value="ExpressionStatement_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068580123155" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1100970304815">
      <property name="name" value="DeleteNode" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_DeleteNode" id="1100970310848" />
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075379141235">
      <property name="drawBorder" value="false" />
      <property name="name" value="statementBox" />
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075379141236">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="linkDeclaration" targetNodeId="8.1068580123156" />
        <link role="actionSet" targetNodeId="1100970304815" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075379141237">
        <property name="text" value=";" />
        <property name="drawBorder" value="false" />
        <property name="conditionId" value="IsParent_StatementList" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075379419312">
    <property name="name" value="IfStatement_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068580123159" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1076934492296">
      <property name="name" value="ConditionCellActions" />
      <link role="specializes" targetNodeId="1082130590765" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1076934492297">
        <property name="substituteHandlerId" value="IfStatementConditionAcceptor" />
        <link role="substituteQueryBody" targetNodeId="1081927995401" />
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927995395">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995396">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995397">
              <link role="classifier" targetNodeId="19.1113723508558" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995398">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995399">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995400">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927995401">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081950971593">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941910">
                <link role="baseMethodDeclaration" targetNodeId="1115664493412" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941911">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081950971596">
                  <link role="variableDeclaration" targetNodeId="1081927995396" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081950971598">
                  <link role="variableDeclaration" targetNodeId="1081927995398" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1082467477265">
      <property name="name" value="IfClosingBracketActions" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_RightTransform" id="1082467477266">
        <property name="actionProviderId" value="AddIfFalseStatement" />
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075379419313">
      <property name="drawBorder" value="false" />
      <property name="name" value="statementBox" />
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075379444330">
        <property name="drawBorder" value="false" />
        <property name="name" value="headerRow" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1101210485455">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="if" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075379663006">
          <property name="text" value="(" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075379700788">
          <property name="drawBorder" value="false" />
          <link role="linkDeclaration" targetNodeId="8.1068580123160" />
          <link role="errorActionSet" targetNodeId="1077284637890" />
          <link role="actionSet" targetNodeId="1076934492296" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075379740164">
          <property name="text" value=") {" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075379536706">
        <property name="drawBorder" value="false" />
        <property name="name" value="ifTrueBox" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075379821384">
          <property name="text" value="  " />
          <property name="drawBorder" value="false" />
          <property name="name" value="indentCell" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1082486433802">
          <property name="drawBorder" value="false" />
          <link role="linkDeclaration" targetNodeId="8.1068580123161" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075379536707">
        <property name="drawBorder" value="false" />
        <property name="name" value="ifFalseBranch" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <link role="conditionalQueryBody" targetNodeId="1082097601955" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1082541374920">
          <property name="text" value="}" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1101210485456">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="else" />
          <property name="fontStyle" value="BOLD" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1119293948309">
          <property name="drawBorder" value="false" />
          <link role="linkDeclaration" targetNodeId="8.1082485599094" />
        </node>
        <node role="conditionalQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1082097601951">
          <property name="name" value="conditionalQuery" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082097601952">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082097601953">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.BooleanType" id="1082097601954">
            <property name="name" value="boolean" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1082097601955">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1082463311172">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1082463311173">
                <property name="name" value="ifStatement" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082463311174">
                  <link role="classifier" targetNodeId="19.1113723508558" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1082463311175">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082463311176">
                    <link role="classifier" targetNodeId="19.1113723508558" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082463311177">
                    <link role="variableDeclaration" targetNodeId="1082097601952" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1082464819500">
              <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1082541373322">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1082541373323">
                  <link role="baseMethodDeclaration" targetNodeId="19.1113723508580" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1082541373324">
                    <link role="variableDeclaration" targetNodeId="1082463311173" />
                  </node>
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1082541373325" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075379580458">
        <property name="editable" value="true" />
        <property name="text" value="}" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="actionSet" targetNodeId="1082467477265" />
        <link role="conditionalQueryBody" targetNodeId="1082031373147" />
        <node role="conditionalQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1082031373143">
          <property name="name" value="conditionalQuery" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082031373144">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082031373145">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.BooleanType" id="1082031373146">
            <property name="name" value="boolean" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1082031373147">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1082488483416">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1082488483417">
                <property name="name" value="ifStatement" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082488483418">
                  <link role="classifier" targetNodeId="19.1113723508558" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1082488483419">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082488483420">
                    <link role="classifier" targetNodeId="19.1113723508558" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082488483421">
                    <link role="variableDeclaration" targetNodeId="1082031373144" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1082488483432">
              <node role="expression" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1082541373318">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1082541373319">
                  <link role="baseMethodDeclaration" targetNodeId="19.1113723508580" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1082541373320">
                    <link role="variableDeclaration" targetNodeId="1082488483417" />
                  </node>
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1082541373321" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075380566828">
    <property name="name" value="LocalVariableDeclarationStatement_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068581242864" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075380566829">
      <property name="drawBorder" value="false" />
      <property name="name" value="statementBox" />
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075380566830">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <link role="linkDeclaration" targetNodeId="8.1068581242865" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075380566831">
        <property name="text" value=";" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075380723765">
    <property name="name" value="ReturnStatement_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068581242878" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1076951358050">
      <property name="name" value="ExpressionCellActions" />
      <link role="specializes" targetNodeId="1082130590765" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1076951358051">
        <link role="substituteQueryBody" targetNodeId="1081927995850" />
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927995844">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995845">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995846">
              <link role="classifier" targetNodeId="19.1113723509291" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995847">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995848">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995849">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927995850">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081951557795">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941912">
                <link role="baseMethodDeclaration" targetNodeId="1115664492667" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941913">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951557798">
                  <link role="variableDeclaration" targetNodeId="1081927995845" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951557800">
                  <link role="variableDeclaration" targetNodeId="1081927995847" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075380723766">
      <property name="drawBorder" value="false" />
      <property name="name" value="statementBox" />
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075722075640">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="return" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075380723767">
        <property name="drawBorder" value="false" />
        <link role="actionSet" targetNodeId="1076951358050" />
        <link role="linkDeclaration" targetNodeId="8.1068581517676" />
        <link role="errorActionSet" targetNodeId="1077284637890" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075380723768">
        <property name="text" value=";" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075381298843">
    <property name="name" value="Statement_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068580123157" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Error" id="1078746085984">
      <property name="text" value="&lt;statement&gt;" />
      <property name="drawBorder" value="false" />
      <property name="name" value="nodeBox" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1076932037578">
    <property name="name" value="_Type_ActionSet" />
    <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1076932037579">
      <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_ItemGroup" id="1076932272477">
        <property name="handlerId" value="CreateClassifierType" />
        <property name="name" value="classifiers" />
        <property name="descriptionProviderId" value="SemanticNode_ModelFQName" />
        <property name="queryId" value="Classifiers" />
        <property name="textProviderId" value="SemanticNode_Name" />
        <link role="substituteModelQueryMethod" targetNodeId="1081927996786" />
        <link role="substituteHandlerQueryMethod" targetNodeId="1081927996761" />
        <link role="substituteModelQueryBody" targetNodeId="1081927996790" />
        <link role="substituteHandlerQueryBody" targetNodeId="1081927996769" />
        <link role="substituteTextQueryMethod" targetNodeId="1081927996779" />
        <node role="nodeSubstituteItemClass" type="jetbrains.mps.baseLanguage.ClassConcept" id="1089820984067">
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996761">
            <property name="name" value="substituteItemHandler_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996762">
              <property name="name" value="sourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996763">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996764">
              <property name="name" value="itemObject" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996765">
                <link role="classifier" targetNodeId="18.1086856195743" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996766">
              <property name="name" value="pattern" />
              <node role="type" type="jetbrains.mps.baseLanguage.StringType" id="1095249704865" />
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996768">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996769" />
          </node>
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996779">
            <property name="name" value="substituteItemText_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996780">
              <property name="name" value="mySourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996781">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996782">
              <property name="name" value="myItemObject" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996783">
                <link role="classifier" targetNodeId="18.1086856195743" />
              </node>
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.StringType" id="1081927996784" />
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996785">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081948161128">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941914">
                  <link role="baseMethodDeclaration" targetNodeId="1115664491732" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941915">
                    <link role="classifier" targetNodeId="1115664491666" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081948161131">
                    <link role="variableDeclaration" targetNodeId="1081927996780" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081948161133">
                    <link role="variableDeclaration" targetNodeId="1081927996782" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996786">
            <property name="name" value="substituteItemModel_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996787">
              <property name="name" value="sourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996788">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996789">
              <link role="classifier" targetNodeId="16.1087811448220" />
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996790" />
          </node>
        </node>
      </node>
      <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_ItemGroup" id="1090235804237">
        <property name="handlerId" value="InstantiateConcept" />
        <property name="name" value="types" />
        <property name="queryId" value="AllTypeConcepts" />
      </node>
      <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_ItemGroup" id="1109370789865">
        <property name="handlerId" value="CreateTypeVariableReference" />
        <property name="name" value="typeVariables" />
        <property name="queryId" value="TypeVariables" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1077124145703">
    <property name="name" value="_VariableInitializer_ActionSet" />
    <link role="specializes" targetNodeId="1082130590765" />
    <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1077124145704">
      <property name="substituteHandlerId" value="VariableDeclarationInitializerAcceptor" />
      <link role="substituteQueryBody" targetNodeId="1081927996880" />
      <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996874">
        <property name="name" value="substituteAcceptor_Query" />
        <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996875">
          <property name="name" value="node" />
          <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996876">
            <link role="classifier" targetNodeId="15.1086945614627" />
          </node>
        </node>
        <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996877">
          <property name="name" value="object" />
          <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996878">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
        </node>
        <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996879">
          <link role="classifier" targetNodeId="18.1086856195743" />
        </node>
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996880">
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081952278817">
            <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941916">
              <link role="baseMethodDeclaration" targetNodeId="1115664493357" />
              <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941917">
                <link role="classifier" targetNodeId="1115664491666" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081952278820">
                <link role="variableDeclaration" targetNodeId="1081927996875" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081952278822">
                <link role="variableDeclaration" targetNodeId="1081927996877" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1077284637890">
    <property name="name" value="DefErrorActions" />
    <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_DeleteNode" id="1077284637891">
      <property name="disabled" value="true" />
    </node>
    <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_RightTransform" id="1077284637892">
      <property name="disabled" value="true" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1079116706078">
    <property name="name" value="UndefinedOperator_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1079115200860" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1079116733033">
      <property name="name" value="Actions" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_DeleteNode" id="1079116733034" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_RightTransform" id="1079202659546">
        <property name="disabled" value="true" />
      </node>
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1079117057848">
        <property name="substituteHandlerId" value="UndefinedOperatorExpressionAcceptor" />
        <link role="substituteQueryBody" targetNodeId="1081927995894" />
        <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_ItemGroup" id="1082380741937">
          <property name="name" value="binaryExpressions" />
          <link role="substituteHandlerQueryMethod" targetNodeId="1082380828594" />
          <link role="substituteHandlerQueryBody" targetNodeId="1082380828602" />
          <link role="substituteModelQueryMethod" targetNodeId="1082380828619" />
          <link role="substituteModelQueryBody" targetNodeId="1082380828623" />
          <node role="nodeSubstituteItemClass" type="jetbrains.mps.baseLanguage.ClassConcept" id="1089820984070">
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1082380828594">
              <property name="name" value="substituteItemHandler_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082380828595">
                <property name="name" value="sourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082380828596">
                  <link role="classifier" targetNodeId="19.1113723509637" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082380828597">
                <property name="name" value="itemObject" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082380828598">
                  <link role="classifier" targetNodeId="18.1086856195743" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082380828599">
                <property name="name" value="pattern" />
                <node role="type" type="jetbrains.mps.baseLanguage.StringType" id="1095249439769" />
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1082380828601">
                <link role="classifier" targetNodeId="18.1086856195743" />
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1082380828602">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1082383864000">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941918">
                    <link role="baseMethodDeclaration" targetNodeId="1115664493611" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941919">
                      <link role="classifier" targetNodeId="1115664491666" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082383864003">
                      <link role="variableDeclaration" targetNodeId="1082380828595" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082383864005">
                      <link role="variableDeclaration" targetNodeId="1082380828597" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082383864007">
                      <link role="variableDeclaration" targetNodeId="1082380828599" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1082380828619">
              <property name="name" value="substituteItemModel_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082380828620">
                <property name="name" value="sourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082380828621">
                  <link role="classifier" targetNodeId="19.1113723509637" />
                </node>
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1082380828622">
                <link role="classifier" targetNodeId="16.1087811448220" />
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1082380828623">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1082380828624">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941920">
                    <link role="baseMethodDeclaration" targetNodeId="1115664493555" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941921">
                      <link role="classifier" targetNodeId="1115664491666" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082381212830">
                      <link role="variableDeclaration" targetNodeId="1082380828620" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_Simple" id="1079117057851">
          <property name="text" value="=" />
          <property name="handlerId" value="AssignmentExpressionFactory" />
          <link role="substituteHandlerQueryBody" targetNodeId="1081927995939" />
          <link role="substituteHandlerQueryMethod" targetNodeId="1081927995931" />
          <node role="nodeSubstituteItemClass" type="jetbrains.mps.baseLanguage.ClassConcept" id="1089820984071">
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927995931">
              <property name="name" value="substituteItemHandler_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995932">
                <property name="name" value="sourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995933">
                  <link role="classifier" targetNodeId="19.1113723509637" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995934">
                <property name="name" value="itemObject" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995935">
                  <link role="classifier" targetNodeId="18.1086856195743" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995936">
                <property name="name" value="pattern" />
                <node role="type" type="jetbrains.mps.baseLanguage.StringType" id="1095249439770" />
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995938">
                <link role="classifier" targetNodeId="18.1086856195743" />
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927995939">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081952194519">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941922">
                    <link role="baseMethodDeclaration" targetNodeId="1115664493705" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941923">
                      <link role="classifier" targetNodeId="1115664491666" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081952194522">
                      <link role="variableDeclaration" targetNodeId="1081927995932" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081952194524">
                      <link role="variableDeclaration" targetNodeId="1081927995934" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081952194526">
                      <link role="variableDeclaration" targetNodeId="1081927995936" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_Simple" id="1082648392046">
          <property name="text" value="instanceof" />
          <link role="substituteHandlerQueryMethod" targetNodeId="1082648409704" />
          <link role="substituteHandlerQueryBody" targetNodeId="1082648409712" />
          <node role="nodeSubstituteItemClass" type="jetbrains.mps.baseLanguage.ClassConcept" id="1089820984074">
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1082648409704">
              <property name="name" value="substituteItemHandler_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082648409705">
                <property name="name" value="sourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082648409706">
                  <link role="classifier" targetNodeId="19.1113723509637" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082648409707">
                <property name="name" value="itemObject" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082648409708">
                  <link role="classifier" targetNodeId="18.1086856195743" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082648409709">
                <property name="name" value="pattern" />
                <node role="type" type="jetbrains.mps.baseLanguage.StringType" id="1095249439773" />
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1082648409711">
                <link role="classifier" targetNodeId="18.1086856195743" />
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1082648409712">
                <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1082648736065">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1082648736066">
                    <property name="name" value="semanticModel" />
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082648736067">
                      <link role="classifier" targetNodeId="15.1086945614636" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1082648736068">
                      <link role="baseMethodDeclaration" targetNodeId="15.1086945615528" />
                      <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082648736069">
                        <link role="variableDeclaration" targetNodeId="1082648409705" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1082648736070">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1082648736071">
                    <link role="baseMethodDeclaration" targetNodeId="19.1113723508680" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1082648736072">
                      <link role="classifier" targetNodeId="19.1113723508652" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1082648736074">
                      <link role="variableDeclaration" targetNodeId="1082648736066" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927995888">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995889">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995890">
              <link role="classifier" targetNodeId="19.1113723509637" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995891">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995892">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995893">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927995894">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081952170060">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941924">
                <link role="baseMethodDeclaration" targetNodeId="1115664492961" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941925">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081952170063">
                  <link role="variableDeclaration" targetNodeId="1081927995889" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081952170065">
                  <link role="variableDeclaration" targetNodeId="1081927995891" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Error" id="1079116706079">
      <property name="text" value=" " />
      <property name="drawBorder" value="false" />
      <link role="actionSet" targetNodeId="1079116733033" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1079354856500">
    <property name="name" value="StringType_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1079352774609" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1079354856501">
      <property name="textFgColor" value="DARK_BLUE" />
      <property name="text" value="String" />
      <property name="drawBorder" value="false" />
      <property name="selectable" value="true" />
      <link role="keyMap" targetNodeId="1119265790350" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1079605217732">
    <property name="name" value="NotEqualsExpression_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1073239437375" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1079605716537">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <link role="actionSet" targetNodeId="1107375429415" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1081777156131">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1081776311281" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1079606035627">
        <property name="editable" value="true" />
        <property name="text" value="!=" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="actionSet" targetNodeId="1082657774875" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1081777156132">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1081776482707" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1079605716538">
    <property name="name" value="NullLiteral_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1070534058343" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1079605716541">
      <property name="editable" value="true" />
      <property name="textFgColor" value="DARK_BLUE" />
      <property name="text" value="null" />
      <property name="drawBorder" value="false" />
      <property name="selectable" value="true" />
      <link role="keyMap" targetNodeId="1081427357000" />
      <link role="actionSet" targetNodeId="1107375429415" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1079622224907">
    <property name="name" value="StringLiteral_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1070475926800" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1079623722228">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <link role="keyMap" targetNodeId="1081427357000" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1079623722229">
        <property name="textFgColor" value="DARK_GREEN" />
        <property name="text" value="\&quot;" />
        <property name="fontStyle" value="BOLD" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1079623722230">
        <property name="editable" value="true" />
        <property name="textFgColor" value="DARK_GREEN" />
        <property name="writable" value="true" />
        <property name="fontStyle" value="BOLD" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="propertyDeclaration" targetNodeId="8.1070475926801" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1079623722231">
        <property name="textFgColor" value="DARK_GREEN" />
        <property name="text" value="\&quot;" />
        <property name="fontStyle" value="BOLD" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="actionSet" targetNodeId="1082463574819" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.EditorComponentDeclaration" id="1079954801953">
    <property name="name" value="_BaseMethodParmListEditor" />
    <link role="conceptDeclaration" targetNodeId="8.1068580123132" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1079954818323">
      <property name="name" value="EmptyParmListActions" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_DeleteNode" id="1079954818324">
        <property name="disabled" value="true" />
      </node>
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1079955083903">
        <property name="substituteHandlerId" value="BaseMethod_AddParameter" />
        <link role="substituteQueryBody" targetNodeId="1081927996887" />
        <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_ItemGroup" id="1079955099623">
          <property name="handlerId" value="ParmDeclarationFactory" />
          <property name="name" value="primitiveTypeParms" />
          <property name="queryId" value="AllVariablePrimitiveTypes" />
          <property name="textProviderId" value="ParmDeclarationText" />
          <link role="substituteModelQueryMethod" targetNodeId="1081927996913" />
          <link role="substituteModelQueryBody" targetNodeId="1081927996917" />
          <link role="substituteTextQueryBody" targetNodeId="1081927996912" />
          <link role="substituteTextQueryMethod" targetNodeId="1081927996906" />
          <link role="substituteHandlerQueryMethod" targetNodeId="1081927996888" />
          <link role="substituteHandlerQueryBody" targetNodeId="1081927996896" />
          <node role="nodeSubstituteItemClass" type="jetbrains.mps.baseLanguage.ClassConcept" id="1089820984075">
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996888">
              <property name="name" value="substituteItemHandler_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996889">
                <property name="name" value="sourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996890">
                  <link role="classifier" targetNodeId="15.1086945614627" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996891">
                <property name="name" value="itemObject" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1086342816658">
                  <link role="classifier" targetNodeId="14.1086945614093" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996893">
                <property name="name" value="pattern" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1086342816659">
                  <link role="classifier" targetNodeId="14.1086945614127" />
                </node>
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996895">
                <link role="classifier" targetNodeId="18.1086856195743" />
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996896">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081952790059">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941926">
                    <link role="baseMethodDeclaration" targetNodeId="1115664492882" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941927">
                      <link role="classifier" targetNodeId="1115664491666" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081952790062">
                      <link role="variableDeclaration" targetNodeId="1081927996889" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1086342816660">
                      <link role="variableDeclaration" targetNodeId="1081927996891" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1086342816661">
                      <link role="variableDeclaration" targetNodeId="1081927996893" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996906">
              <property name="name" value="substituteItemText_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996907">
                <property name="name" value="mySourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996908">
                  <link role="classifier" targetNodeId="15.1086945614627" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996909">
                <property name="name" value="myItemObject" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1086342816662">
                  <link role="classifier" targetNodeId="14.1086945614093" />
                </node>
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.StringType" id="1081927996911" />
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996912">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081952749648">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941928">
                    <link role="baseMethodDeclaration" targetNodeId="1115664492864" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941929">
                      <link role="classifier" targetNodeId="1115664491666" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081952749651">
                      <link role="variableDeclaration" targetNodeId="1081927996907" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1086342816663">
                      <link role="variableDeclaration" targetNodeId="1081927996909" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996913">
              <property name="name" value="substituteItemModel_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996914">
                <property name="name" value="sourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996915">
                  <link role="classifier" targetNodeId="15.1086945614627" />
                </node>
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996916">
                <link role="classifier" targetNodeId="16.1087811448220" />
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996917">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081952731312">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941930">
                    <link role="baseMethodDeclaration" targetNodeId="1115664491683" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941931">
                      <link role="classifier" targetNodeId="1115664491666" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081952731315">
                      <link role="variableDeclaration" targetNodeId="1081927996914" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_ItemGroup" id="1079955337155">
          <property name="handlerId" value="ParmDeclarationFactory" />
          <property name="name" value="classTypeParms" />
          <property name="queryId" value="AllJavaClasses" />
          <property name="textProviderId" value="ParmDeclarationText" />
          <link role="substituteTextQueryMethod" targetNodeId="1081927996936" />
          <link role="substituteModelQueryBody" targetNodeId="1081927996947" />
          <link role="substituteModelQueryMethod" targetNodeId="1081927996943" />
          <link role="substituteTextQueryBody" targetNodeId="1081927996942" />
          <link role="substituteHandlerQueryBody" targetNodeId="1081927996926" />
          <link role="substituteHandlerQueryMethod" targetNodeId="1081927996918" />
          <node role="nodeSubstituteItemClass" type="jetbrains.mps.baseLanguage.ClassConcept" id="1089820984076">
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996918">
              <property name="name" value="substituteItemHandler_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996919">
                <property name="name" value="sourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996920">
                  <link role="classifier" targetNodeId="15.1086945614627" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996921">
                <property name="name" value="itemObject" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1086342816664">
                  <link role="classifier" targetNodeId="14.1086945614093" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996923">
                <property name="name" value="pattern" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1086342816665">
                  <link role="classifier" targetNodeId="14.1086945614127" />
                </node>
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996925">
                <link role="classifier" targetNodeId="18.1086856195743" />
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996926">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081952767895">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941932">
                    <link role="baseMethodDeclaration" targetNodeId="1115664492882" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941933">
                      <link role="classifier" targetNodeId="1115664491666" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081952767898">
                      <link role="variableDeclaration" targetNodeId="1081927996919" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1086342816666">
                      <link role="variableDeclaration" targetNodeId="1081927996921" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1086342816667">
                      <link role="variableDeclaration" targetNodeId="1081927996923" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996936">
              <property name="name" value="substituteItemText_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996937">
                <property name="name" value="mySourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996938">
                  <link role="classifier" targetNodeId="15.1086945614627" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996939">
                <property name="name" value="myItemObject" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1086342816668">
                  <link role="classifier" targetNodeId="14.1086945614093" />
                </node>
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.StringType" id="1081927996941" />
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996942">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081952760107">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941934">
                    <link role="baseMethodDeclaration" targetNodeId="1115664492864" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941935">
                      <link role="classifier" targetNodeId="1115664491666" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081952760110">
                      <link role="variableDeclaration" targetNodeId="1081927996937" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1086342816669">
                      <link role="variableDeclaration" targetNodeId="1081927996939" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996943">
              <property name="name" value="substituteItemModel_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996944">
                <property name="name" value="sourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996945">
                  <link role="classifier" targetNodeId="15.1086945614627" />
                </node>
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996946">
                <link role="classifier" targetNodeId="16.1087811448220" />
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996947">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081952743425">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941936">
                    <link role="baseMethodDeclaration" targetNodeId="1115664491871" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941937">
                      <link role="classifier" targetNodeId="1115664491666" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081952743428">
                      <link role="variableDeclaration" targetNodeId="1081927996944" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996881">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996882">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996883">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996884">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996885">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996886">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996887">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081952674116">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941938">
                <link role="baseMethodDeclaration" targetNodeId="1115664492941" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941939">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081952674119">
                  <link role="variableDeclaration" targetNodeId="1081927996882" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081952674121">
                  <link role="variableDeclaration" targetNodeId="1081927996884" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1079954801954">
      <property name="separatorText" value="," />
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <link role="linkDeclaration" targetNodeId="8.1068580123134" />
      <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1079954801955">
        <property name="editable" value="true" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="actionSet" targetNodeId="1079954818323" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1080122476251">
    <property name="name" value="AndExpression_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1080120340718" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1080820695015">
      <property name="drawBorder" value="false" />
      <property name="name" value="expressionBox" />
      <property name="vertical" value="false" />
      <property name="selectable" value="true" />
      <link role="actionSet" targetNodeId="1107375429415" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1081777006156">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1081776311281" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1080820695018">
        <property name="editable" value="true" />
        <property name="text" value="&amp;&amp;" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="actionSet" targetNodeId="1082657774875" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1081777006157">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1081776482707" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1080223480640">
    <property name="name" value="OrExpression_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1080223426719" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1080820695021">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <property name="selectable" value="true" />
      <link role="actionSet" targetNodeId="1107375429415" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1081777186554">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1081776311281" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1080820767811">
        <property name="editable" value="true" />
        <property name="text" value="||" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="actionSet" targetNodeId="1082657774875" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1081777186555">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1081776482707" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.EditorComponentDeclaration" id="1080128409625">
    <property name="name" value="_BaseMethodCallArgListEditor" />
    <link role="conceptDeclaration" targetNodeId="8.1068499141036" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1080128762409">
      <property name="name" value="NoArgumentsActions" />
      <link role="specializes" targetNodeId="1095167443093" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_DeleteNode" id="1080128762410">
        <property name="disabled" value="true" />
      </node>
    </node>
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1095167443093">
      <property name="name" value="ArgumentActions" />
      <link role="specializes" targetNodeId="1082130590765" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1095167470540">
        <link role="substituteQueryBody" targetNodeId="1095167470541" />
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1095167470542">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1095167470543">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1095167470544">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1095167470545">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1095167470546">
              <link role="classifier" targetNodeId="14.1086945614093" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1095167470547">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1095167470541">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1095167470548">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941940">
                <link role="baseMethodDeclaration" targetNodeId="1115664493187" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941941">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1095167470551">
                  <link role="variableDeclaration" targetNodeId="1095167470543" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1095167470553">
                  <link role="variableDeclaration" targetNodeId="1095167470545" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1080128409626">
      <property name="separatorText" value="," />
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <link role="elementActionSet" targetNodeId="1095167443093" />
      <link role="linkDeclaration" targetNodeId="8.1068499141038" />
      <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1080128409627">
        <property name="editable" value="true" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="actionSet" targetNodeId="1080128762409" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1080902646656">
    <property name="name" value="CastExpression_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1070534934090" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1080903478359">
      <property name="name" value="CastTypeActions" />
      <link role="specializes" targetNodeId="1076932037578" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1080903478361">
        <property name="substituteHandlerId" value="CastExpressionTypeAcceptor" />
        <link role="substituteQueryBody" targetNodeId="1081927995857" />
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927995851">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995852">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995853">
              <link role="classifier" targetNodeId="19.1113723507612" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995854">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995855">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995856">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927995857">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081950522355">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941942">
                <link role="baseMethodDeclaration" targetNodeId="1115664493317" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941943">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081950522358">
                  <link role="variableDeclaration" targetNodeId="1081927995852" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1095102191171">
                  <link role="variableDeclaration" targetNodeId="1081927995854" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1080903734783">
      <property name="name" value="CastExpressionActions" />
      <link role="specializes" targetNodeId="1082130590765" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1080903734785">
        <property name="substituteHandlerId" value="RightHandExpressionAcceptor" />
        <link role="substituteQueryBody" targetNodeId="1081927995864" />
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927995858">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995859">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995860">
              <link role="classifier" targetNodeId="19.1113723507612" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995861">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995862">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995863">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927995864">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081950508693">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941944">
                <link role="baseMethodDeclaration" targetNodeId="1115664492259" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941945">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081950508696">
                  <link role="variableDeclaration" targetNodeId="1081927995859" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081950508698">
                  <link role="variableDeclaration" targetNodeId="1081927995861" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1080902646660">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <link role="actionSet" targetNodeId="1107375429415" />
      <link role="keyMap" targetNodeId="1081427357000" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1080902646661">
        <property name="text" value="(" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1080902646662">
        <property name="drawBorder" value="false" />
        <link role="errorActionSet" targetNodeId="1077284637890" />
        <link role="actionSet" targetNodeId="1080903478359" />
        <link role="linkDeclaration" targetNodeId="8.1070534934091" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1080902646663">
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1080902646664">
        <property name="drawBorder" value="false" />
        <link role="errorActionSet" targetNodeId="1077284637890" />
        <link role="actionSet" targetNodeId="1080903734783" />
        <link role="linkDeclaration" targetNodeId="8.1070534934092" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075308772517">
    <property name="name" value="MethodCall_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068581242868" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1076940714064">
      <property name="name" value="NameCellActions" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1076940714066">
        <property name="substituteHandlerId" value="BaseMethodCallMethodAcceptor" />
        <link role="substituteQueryBody" targetNodeId="1081927995775" />
        <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_ItemGroup" id="1076940714067">
          <property name="name" value="methods" />
          <property name="queryId" value="FreeMethods" />
          <property name="textProviderId" value="JavaElementText" />
          <link role="substituteTextQueryMethod" targetNodeId="1081927995794" />
          <link role="substituteModelQueryBody" targetNodeId="1081927995805" />
          <link role="substituteTextQueryBody" targetNodeId="1081927995800" />
          <node role="nodeSubstituteItemClass" type="jetbrains.mps.baseLanguage.ClassConcept" id="1089820984077">
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927995794">
              <property name="name" value="substituteItemText_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995795">
                <property name="name" value="mySourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995796">
                  <link role="classifier" targetNodeId="19.1113723508937" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995797">
                <property name="name" value="myItemObject" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995798">
                  <link role="classifier" targetNodeId="18.1086856195743" />
                </node>
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.StringType" id="1081927995799" />
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927995800">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081951493183">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941946">
                    <link role="baseMethodDeclaration" targetNodeId="1115664491732" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941947">
                      <link role="classifier" targetNodeId="1115664491666" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951493186">
                      <link role="variableDeclaration" targetNodeId="1081927995795" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951493188">
                      <link role="variableDeclaration" targetNodeId="1081927995797" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927995801">
              <property name="name" value="substituteItemModel_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995802">
                <property name="name" value="sourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995803">
                  <link role="classifier" targetNodeId="19.1113723508937" />
                </node>
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995804">
                <link role="classifier" targetNodeId="16.1087811448220" />
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927995805">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081951480179">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941948">
                    <link role="baseMethodDeclaration" targetNodeId="1115664492180" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941949">
                      <link role="classifier" targetNodeId="1115664491666" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951480182">
                      <link role="variableDeclaration" targetNodeId="1081927995802" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927995769">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995770">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995771">
              <link role="classifier" targetNodeId="19.1113723508937" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995772">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995773">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995774">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927995775">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081951470595">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941950">
                <link role="baseMethodDeclaration" targetNodeId="1115664493170" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941951">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951470598">
                  <link role="variableDeclaration" targetNodeId="1081927995770" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951470600">
                  <link role="variableDeclaration" targetNodeId="1081927995772" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075308772516">
      <property name="drawBorder" value="false" />
      <property name="name" value="expressionBox" />
      <property name="vertical" value="false" />
      <link role="keyMap" targetNodeId="1081427357000" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1088426839520">
        <property name="drawBorder" value="false" />
        <property name="nullText" value="&lt;no method&gt;" />
        <link role="actionSet" targetNodeId="1076940714064" />
        <link role="linkDeclaration" targetNodeId="8.1068499141037" />
        <link role="keyMap" targetNodeId="1081427357000" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1088426839521">
          <link role="conceptDeclaration" targetNodeId="8.1068580123132" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1088426839522">
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <link role="propertyDeclaration" targetNodeId="8.1083152972672" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075308772518">
        <property name="text" value="(" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1080129841829">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1080128409625" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075308772521">
        <property name="editable" value="false" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="actionSet" targetNodeId="1082463574819" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075287750843">
    <property name="name" value="MethodDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068390468204" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1076941599932">
      <property name="name" value="ReturnTypeCellActions" />
      <link role="specializes" targetNodeId="1076932037578" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1076941710890">
        <property name="substituteHandlerId" value="BaseMethodDeclReturnTypeAcceptor" />
        <link role="substituteQueryBody" targetNodeId="1081927994742" />
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927994736">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927994737">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927994738">
              <link role="classifier" targetNodeId="19.1109971952128" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927994739">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927994740">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927994741">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927994742">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081951521002">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941952">
                <link role="baseMethodDeclaration" targetNodeId="1115664493245" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941953">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951521005">
                  <link role="variableDeclaration" targetNodeId="1081927994737" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951521007">
                  <link role="variableDeclaration" targetNodeId="1081927994739" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075287750844">
      <property name="drawBorder" value="false" />
      <property name="name" value="methodBox" />
      <property name="vertical" value="true" />
      <property name="selectable" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075287750845">
        <property name="drawBorder" value="false" />
        <property name="name" value="headerRow" />
        <property name="vertical" value="false" />
        <property name="selectable" value="true" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075287750846">
          <property name="drawBorder" value="false" />
          <property name="nullText" value="&lt;no return type&gt;" />
          <property name="name" value="returnType" />
          <link role="actionSet" targetNodeId="1076941599932" />
          <link role="linkDeclaration" targetNodeId="8.1068580123133" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1075287750847">
          <property name="writable" value="true" />
          <property name="defaultText" value="&lt;no name&gt;" />
          <property name="defaultValue" value="?" />
          <property name="drawBorder" value="false" />
          <property name="name" value="methodName" />
          <link role="propertyDeclaration" targetNodeId="9.1078489098626" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075287750848">
          <property name="text" value="(" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1079958166204">
          <property name="drawBorder" value="false" />
          <link role="editorComponent" targetNodeId="1079954801953" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075287750851">
          <property name="text" value=") {" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075287750852">
        <property name="drawBorder" value="false" />
        <property name="name" value="bodyArea" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075287750853">
          <property name="text" value="  " />
          <property name="drawBorder" value="false" />
          <property name="name" value="indentCell" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075287750854">
          <property name="drawBorder" value="false" />
          <link role="linkDeclaration" targetNodeId="8.1068580123135" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075287750855">
        <property name="text" value="}" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1081257049503">
    <property name="name" value="InstanceOfExpression_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1081256982272" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1081257125113">
      <property name="name" value="LeftExpressionsActions" />
      <link role="specializes" targetNodeId="1082130590765" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1081257125114">
        <property name="substituteHandlerId" value="LeftHandExpressionAcceptor" />
        <link role="substituteQueryBody" targetNodeId="1081927996172" />
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996166">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996167">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996168">
              <link role="classifier" targetNodeId="19.1113723508652" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996169">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996170">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996171">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996172">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081951406561">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941954">
                <link role="baseMethodDeclaration" targetNodeId="1115664492212" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941955">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951406564">
                  <link role="variableDeclaration" targetNodeId="1081927996167" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951406566">
                  <link role="variableDeclaration" targetNodeId="1081927996169" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1081257125115">
      <property name="name" value="InstanceOfTypes" />
      <link role="specializes" targetNodeId="1082741406448" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1081257125116">
        <property name="substituteHandlerId" value="InstanceOfExpressionTypeAcceptor" />
        <link role="substituteQueryBody" targetNodeId="1081927996195" />
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996173">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996190">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996191">
              <link role="classifier" targetNodeId="19.1113723508652" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996192">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996193">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996194">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996195">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081951433771">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941956">
                <link role="baseMethodDeclaration" targetNodeId="1115664493337" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941957">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951433774">
                  <link role="variableDeclaration" targetNodeId="1081927996190" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081951433776">
                  <link role="variableDeclaration" targetNodeId="1081927996192" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1081257073129">
      <property name="drawBorder" value="false" />
      <property name="name" value="expressionBox" />
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1081257097746">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="actionSet" targetNodeId="1081257125113" />
        <link role="linkDeclaration" targetNodeId="8.1081256993304" />
        <link role="errorActionSet" targetNodeId="1077284637890" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1081257097747">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="instanceof" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1081257097748">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="linkDeclaration" targetNodeId="8.1081256993305" />
        <link role="actionSet" targetNodeId="1081257125115" />
        <link role="errorActionSet" targetNodeId="1077284637890" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1081264157973">
    <property name="name" value="WhileStatement_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1076505808687" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1081264222445">
      <property name="name" value="ConditionCellActions" />
      <link role="specializes" targetNodeId="1082130590765" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1081264241574">
        <property name="substituteHandlerId" value="WhileStatementConditionAcceptor" />
        <link role="substituteQueryBody" targetNodeId="1081927995871" />
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927995865">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995866">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995867">
              <link role="classifier" targetNodeId="19.1113723509721" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927995868">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995869">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927995870">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927995871">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081952286073">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941958">
                <link role="baseMethodDeclaration" targetNodeId="1115664493393" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941959">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081952286076">
                  <link role="variableDeclaration" targetNodeId="1081927995866" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081952286078">
                  <link role="variableDeclaration" targetNodeId="1081927995868" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1081264241575">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1081264241576">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1081264296765">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="while" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1101210485457">
          <property name="text" value="(" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1081264296766">
          <property name="drawBorder" value="false" />
          <link role="keyMap" targetNodeId="1081427357000" />
          <link role="errorActionSet" targetNodeId="1077284637890" />
          <link role="linkDeclaration" targetNodeId="8.1076505808688" />
          <link role="actionSet" targetNodeId="1081264222445" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1081264296767">
          <property name="text" value=") {" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1081264296784">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1090928635163">
          <property name="text" value="  " />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1081264296785">
          <property name="drawBorder" value="false" />
          <link role="linkDeclaration" targetNodeId="8.1076505808689" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1081264296786">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1081264296787">
          <property name="text" value="}" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapDeclaration" id="1081427357000">
    <property name="name" value="_Expression_KeyMap" />
    <node role="entry" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapEntry" id="1104592502615">
      <property name="modifiers" value="ctrl+shift" />
      <property name="keycode" value="VK_P" />
      <property name="actionProviderId" value="Expression_Parens" />
    </node>
    <node role="entry" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapEntry" id="1105461961740">
      <property name="modifiers" value="ctrl" />
      <property name="keycode" value="VK_DELETE" />
      <property name="actionProviderId" value="Expression_Delete" />
    </node>
    <node role="entry" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapEntry" id="1107520051989">
      <property name="keycode" value=")" />
      <property name="actionProviderId" value="Expression_Finish_Parens" />
    </node>
    <node role="entry" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapEntry" id="1107765911459">
      <property name="keycode" value="VK_DELETE" />
      <property name="actionProviderId" value="Expression_DeleteIfEmpty" />
    </node>
    <node role="entry" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapEntry" id="1107766072928">
      <property name="keycode" value="VK_BACK_SPACE" />
      <property name="actionProviderId" value="Expression_DeleteIfEmpty" />
    </node>
    <node role="entry" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapEntry" id="1108717230420">
      <property name="keycode" value="VK_COMMA" />
      <property name="actionProviderId" value="Expression_AddParameter" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.EditorComponentDeclaration" id="1081776311281">
    <property name="name" value="_BinaryOperation_Left_Component" />
    <link role="conceptDeclaration" targetNodeId="8.1081773326031" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1081776374361">
      <property name="name" value="Actions" />
      <link role="specializes" targetNodeId="1082130590765" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1081776374362">
        <property name="substituteHandlerId" value="LeftHandExpressionAcceptor" />
        <link role="substituteQueryBody" targetNodeId="1081927997273" />
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927997267">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927997268">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927997269">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927997270">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1086342816685">
              <link role="classifier" targetNodeId="14.1086945614093" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927997272">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927997273">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081950385308">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941960">
                <link role="baseMethodDeclaration" targetNodeId="1115664492212" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941961">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081950385311">
                  <link role="variableDeclaration" targetNodeId="1081927997268" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1086342816686">
                  <link role="variableDeclaration" targetNodeId="1081927997270" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1081776360032">
      <property name="drawBorder" value="false" />
      <link role="actionSet" targetNodeId="1081776374361" />
      <link role="linkDeclaration" targetNodeId="8.1081773367580" />
      <link role="errorActionSet" targetNodeId="1077284637890" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.EditorComponentDeclaration" id="1081776482707">
    <property name="name" value="_BinaryOperation_Right_Component" />
    <link role="conceptDeclaration" targetNodeId="8.1081773326031" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1081776482708">
      <property name="name" value="Actions" />
      <link role="specializes" targetNodeId="1082130590765" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1081776482709">
        <property name="substituteHandlerId" value="RightHandExpressionAcceptor" />
        <link role="substituteQueryBody" targetNodeId="1081927997280" />
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927997274">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927997275">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927997276">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927997277">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1086342816687">
              <link role="classifier" targetNodeId="14.1086945614093" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927997279">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927997280">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081950320890">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941962">
                <link role="baseMethodDeclaration" targetNodeId="1115664492259" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941963">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081950320893">
                  <link role="variableDeclaration" targetNodeId="1081927997275" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081950320895">
                  <link role="variableDeclaration" targetNodeId="1081927997277" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1081776482710">
      <property name="drawBorder" value="false" />
      <link role="linkDeclaration" targetNodeId="8.1081773367579" />
      <link role="errorActionSet" targetNodeId="1077284637890" />
      <link role="actionSet" targetNodeId="1081776482708" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1081790432906">
    <property name="name" value="SuperConstructorInvocation_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1070475587102" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1085475861765">
      <property name="name" value="NoArgumentsActions" />
      <link role="specializes" targetNodeId="1095254423832" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_DeleteNode" id="1085475861766">
        <property name="disabled" value="true" />
      </node>
    </node>
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1095254423832">
      <property name="name" value="ArgumentActions" />
      <link role="specializes" targetNodeId="1082130590765" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1095254471168">
        <link role="substituteQueryBody" targetNodeId="1095254471169" />
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1095254471170">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1095254471171">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1095254471172">
              <link role="classifier" targetNodeId="19.1113723509495" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1095254471173">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1095254471174">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1095254471175">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1095254471169">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1095254471176">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941964">
                <link role="baseMethodDeclaration" targetNodeId="1115664493990" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941965">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1095254471178">
                  <link role="variableDeclaration" targetNodeId="1095254471171" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1095254471179">
                  <link role="variableDeclaration" targetNodeId="1095254471173" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1085059533049">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085059604178">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="super(" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1085475861768">
        <property name="separatorText" value="," />
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <link role="elementActionSet" targetNodeId="1095254423832" />
        <link role="linkDeclaration" targetNodeId="8.1070475587104" />
        <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085475861769">
          <property name="editable" value="true" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="true" />
          <link role="actionSet" targetNodeId="1085475861765" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085140612097">
        <property name="text" value=");" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1081792356328">
    <property name="name" value="SuperMethodCall_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1073063089578" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1091709481234">
      <property name="name" value="NameCellActions" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1091709481235">
        <link role="substituteQueryBody" targetNodeId="1091709481236" />
        <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_ItemGroup" id="1091709481237">
          <property name="name" value="superMethods" />
          <link role="substituteModelQueryMethod" targetNodeId="1091709481246" />
          <link role="substituteMatcherQueryBody" targetNodeId="1091709481241" />
          <link role="substituteDescriptionTextQueryMethod" targetNodeId="1091709481244" />
          <link role="substituteHandlerQueryMethod" targetNodeId="1091709481238" />
          <link role="substituteModelQueryBody" targetNodeId="1091709481247" />
          <link role="substituteMatcherQueryMethod" targetNodeId="1091709481240" />
          <link role="substituteModelQueryMethod" targetNodeId="1091709481246" />
          <link role="substituteTextQueryBody" targetNodeId="1091709481243" />
          <link role="substituteDescriptionTextQueryBody" targetNodeId="1091709481245" />
          <link role="substituteHandlerQueryBody" targetNodeId="1091709481239" />
          <link role="substituteTextQueryMethod" targetNodeId="1091709481242" />
          <link role="substituteTextQueryMethod" targetNodeId="1091709481242" />
          <node role="nodeSubstituteItemClass" type="jetbrains.mps.baseLanguage.ClassConcept" id="1091709481248">
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1091709481238">
              <property name="name" value="substituteItemHandler_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1091709481249">
                <property name="name" value="sourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1091709481250">
                  <link role="classifier" targetNodeId="19.1113723509543" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1091709481251">
                <property name="name" value="itemObject" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1091709481252">
                  <link role="classifier" targetNodeId="18.1086856195743" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1091709481253">
                <property name="name" value="pattern" />
                <node role="type" type="jetbrains.mps.baseLanguage.StringType" id="1091709481254" />
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1091709481255">
                <link role="classifier" targetNodeId="18.1086856195743" />
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1091709481239" />
            </node>
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1091709481240">
              <property name="name" value="substituteItemMatcher_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1091709481256">
                <property name="name" value="sourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1091709481257">
                  <link role="classifier" targetNodeId="19.1113723509543" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1091709481258">
                <property name="name" value="itemNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1091709481259">
                  <link role="classifier" targetNodeId="18.1086856195743" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1091709481260">
                <property name="name" value="pattern" />
                <node role="type" type="jetbrains.mps.baseLanguage.StringType" id="1091709481261" />
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.BooleanType" id="1091709481262">
                <property name="name" value="boolean" />
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1091709481241" />
            </node>
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1091709481242">
              <property name="name" value="substituteItemText_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1091709481263">
                <property name="name" value="mySourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1091709481264">
                  <link role="classifier" targetNodeId="19.1113723509543" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1091709481265">
                <property name="name" value="myItemObject" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1091709481266">
                  <link role="classifier" targetNodeId="14.1086945614093" />
                </node>
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.StringType" id="1091709481267" />
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1091709481243">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1091709481268">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941966">
                    <link role="baseMethodDeclaration" targetNodeId="1115664491732" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941967">
                      <link role="classifier" targetNodeId="1115664491666" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1091709481271">
                      <link role="variableDeclaration" targetNodeId="1091709481263" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1091709481273">
                      <link role="variableDeclaration" targetNodeId="1091709481265" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1091709481244">
              <property name="name" value="substituteItemDescriptionText_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1091709481274">
                <property name="name" value="sourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1091709481275">
                  <link role="classifier" targetNodeId="19.1113723509543" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1091709481276">
                <property name="name" value="itemObject" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1091709481277">
                  <link role="classifier" targetNodeId="14.1086945614093" />
                </node>
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.StringType" id="1091709481278" />
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1091709481245" />
            </node>
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1091709481246">
              <property name="name" value="substituteItemModel_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1091709481279">
                <property name="name" value="sourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1091709481280">
                  <link role="classifier" targetNodeId="19.1113723509543" />
                </node>
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1091709481281">
                <link role="classifier" targetNodeId="16.1087811448220" />
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1091709481247">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1091709481282">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941968">
                    <link role="baseMethodDeclaration" targetNodeId="1115664494201" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941969">
                      <link role="classifier" targetNodeId="1115664491666" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1091709481285">
                      <link role="variableDeclaration" targetNodeId="1091709481279" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1091709481286">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1091709481287">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1091709481288">
              <link role="classifier" targetNodeId="19.1113723509543" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1091709481289">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1091709481290">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1091709481291">
            <link role="classifier" targetNodeId="15.1086945614627" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1091709481236">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1091709481292">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941970">
                <link role="baseMethodDeclaration" targetNodeId="1115664493170" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941971">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1091709481295">
                  <link role="variableDeclaration" targetNodeId="1091709481287" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1091709481297">
                  <link role="variableDeclaration" targetNodeId="1091709481289" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1091709481298">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <link role="keyMap" targetNodeId="1081427357000" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1091709481299">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="super" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1101210485458">
        <property name="text" value="." />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1091709481300">
        <property name="drawBorder" value="false" />
        <link role="linkDeclaration" targetNodeId="8.1068499141037" />
        <link role="actionSet" targetNodeId="1091709481234" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1091709481301">
          <link role="conceptDeclaration" targetNodeId="8.1068580123132" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1091709481302">
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <link role="propertyDeclaration" targetNodeId="8.1083152972672" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1091709481303">
        <property name="text" value="(" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1091709481304">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1080128409625" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1091709481305">
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
        <link role="actionSet" targetNodeId="1082463574819" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1081792505531">
    <property name="name" value="StaticFieldReference_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1070533707846" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1082740154391">
      <property name="name" value="TypeActions" />
      <link role="specializes" targetNodeId="1082741406448" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1082740539820">
        <link role="substituteQueryBody" targetNodeId="1082740734502" />
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1082740734501">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082740734721">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082740734722">
              <link role="classifier" targetNodeId="19.1113723509349" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082740734723">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082740734724">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1082740734725">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1082740734502">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1082741878874">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1082741878875">
                <property name="name" value="classType" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1082741878877">
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082741878879">
                    <link role="variableDeclaration" targetNodeId="1082740734723" />
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1108064267209">
                    <link role="classifier" targetNodeId="19.1108062816180" />
                  </node>
                </node>
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1108064267210">
                  <link role="classifier" targetNodeId="19.1108062816180" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1082741878880">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1082741878881">
                <property name="name" value="staticFieldReference" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082741878882">
                  <link role="classifier" targetNodeId="19.1113723509349" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1082741878883">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082741878884">
                    <link role="classifier" targetNodeId="19.1113723509349" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082741878885">
                    <link role="variableDeclaration" targetNodeId="1082740734721" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1082741878886">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1082741878887">
                <link role="baseMethodDeclaration" targetNodeId="19.1113723509367" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1082741878904">
                  <link role="variableDeclaration" targetNodeId="1082741878881" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1082741937256">
                  <link role="variableDeclaration" targetNodeId="1082741878875" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1082741937257">
              <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1082741937258">
                <link role="variableDeclaration" targetNodeId="1082741878875" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1082742081259">
      <property name="name" value="FieldNameActions" />
      <link role="specializes" targetNodeId="1107375429415" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1082742081260">
        <link role="substituteQueryBody" targetNodeId="1082742196817" />
        <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_ItemGroup" id="1082742081261">
          <property name="name" value="fields" />
          <link role="substituteModelQueryBody" targetNodeId="1082742196815" />
          <link role="substituteTextQueryBody" targetNodeId="1082742196813" />
          <link role="substituteModelQueryMethod" targetNodeId="1082742196814" />
          <link role="substituteTextQueryMethod" targetNodeId="1082742196812" />
          <node role="nodeSubstituteItemClass" type="jetbrains.mps.baseLanguage.ClassConcept" id="1089820984078">
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1082742196812">
              <property name="name" value="substituteItemText_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082742196994">
                <property name="name" value="mySourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082742196995">
                  <link role="classifier" targetNodeId="19.1113723509349" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082742196996">
                <property name="name" value="myItemObject" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082742196997">
                  <link role="classifier" targetNodeId="18.1086856195743" />
                </node>
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.StringType" id="1082742196998" />
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1082742196813">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1082743011474">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941972">
                    <link role="baseMethodDeclaration" targetNodeId="1115664491732" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941973">
                      <link role="classifier" targetNodeId="1115664491666" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082743011477">
                      <link role="variableDeclaration" targetNodeId="1082742196994" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082743011479">
                      <link role="variableDeclaration" targetNodeId="1082742196996" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1082742196814">
              <property name="name" value="substituteItemModel_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082742196999">
                <property name="name" value="sourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082742197000">
                  <link role="classifier" targetNodeId="19.1113723509349" />
                </node>
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1082742197001">
                <link role="classifier" targetNodeId="16.1087811448220" />
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1082742196815">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1082742430396">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941974">
                    <link role="baseMethodDeclaration" targetNodeId="1115664493913" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941975">
                      <link role="classifier" targetNodeId="1115664491666" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082742946082">
                      <link role="variableDeclaration" targetNodeId="1082742196999" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1082742196816">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082742196975">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082742196976">
              <link role="classifier" targetNodeId="19.1113723509349" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082742196977">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082742196978">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1082742196979">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1082742196817">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1082742343080">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1082742343081">
                <property name="name" value="staticField" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082742343082">
                  <link role="classifier" targetNodeId="19.1109971952084" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1082742343083">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082742343084">
                    <link role="classifier" targetNodeId="19.1109971952084" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082742343085">
                    <link role="variableDeclaration" targetNodeId="1082742196977" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1082742343086">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1082742343087">
                <property name="name" value="staticFieldReference" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082742343088">
                  <link role="classifier" targetNodeId="19.1113723509349" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1082742343089">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082742343090">
                    <link role="classifier" targetNodeId="19.1113723509349" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082742343091">
                    <link role="variableDeclaration" targetNodeId="1082742196975" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1082742343092">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1082742343093">
                <link role="baseMethodDeclaration" targetNodeId="19.1113723509373" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1082742343094">
                  <link role="variableDeclaration" targetNodeId="1082742343087" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1082742343096">
                  <link role="variableDeclaration" targetNodeId="1082742343081" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1082742343097">
              <node role="expression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1082742343098" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1082740154392">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <link role="actionSet" targetNodeId="1107375429415" />
      <link role="keyMap" targetNodeId="1081427357000" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1082740154393">
        <property name="drawBorder" value="false" />
        <link role="actionSet" targetNodeId="1082740154391" />
        <link role="linkDeclaration" targetNodeId="8.1082739776687" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1082740154394">
        <property name="text" value="." />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1088427644683">
        <property name="drawBorder" value="false" />
        <property name="nullText" value="&lt;no field&gt;" />
        <link role="linkDeclaration" targetNodeId="8.1068581517664" />
        <link role="actionSet" targetNodeId="1082742081259" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1088427644684">
          <link role="conceptDeclaration" targetNodeId="8.1068431474542" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1088427644685">
            <property name="textFgColor" value="DARK_MAGENTA" />
            <property name="fontStyle" value="BOLD_ITALIC" />
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <link role="propertyDeclaration" targetNodeId="8.1083152972671" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075306216359">
    <property name="name" value="ConstructorCall_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068580123139" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075306625330">
      <property name="drawBorder" value="false" />
      <property name="name" value="expressionBox" />
      <property name="vertical" value="false" />
      <link role="keyMap" targetNodeId="1081427357000" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1088425374189">
        <property name="drawBorder" value="false" />
        <property name="nullText" value="&lt;no constructor declaration&gt;" />
        <link role="actionSet" targetNodeId="1106930001705" />
        <link role="linkDeclaration" targetNodeId="8.1070567750949" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1088425374190">
          <link role="conceptDeclaration" targetNodeId="8.1068580123140" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1107465798583">
            <property name="editable" value="true" />
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <link role="propertyDeclaration" targetNodeId="8.1083152972672" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Alternation" id="1109285287789">
        <property name="alternationConditionAspectMethodId" value="ConstructorCall_HasTypeParameters" />
        <property name="drawBorder" value="false" />
        <property name="vertical" value="true" />
        <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1109285230257">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1109285287790">
            <property name="text" value="&lt;" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1109285287791">
            <property name="separatorText" value="," />
            <property name="drawBorder" value="false" />
            <property name="vertical" value="false" />
            <link role="linkDeclaration" targetNodeId="8.1076339062843" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1109285287792">
            <property name="text" value="&gt;" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
          </node>
        </node>
        <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1109285287793">
          <property name="editable" value="true" />
          <property name="drawBorder" value="false" />
          <link role="keyMap" targetNodeId="1109285887125" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075306727718">
        <property name="text" value="(" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1080129204427">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1080128409625" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075306727720">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="actionSet" targetNodeId="1082463574819" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1081880010406">
    <property name="name" value="ParenthesizedExpression_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1079359253375" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1082386043671">
      <property name="name" value="ExpressionActions" />
      <link role="specializes" targetNodeId="1082130590765" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1082386043672">
        <link role="substituteQueryBody" targetNodeId="1082387503959" />
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1082387503953">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082387503954">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082387503955">
              <link role="classifier" targetNodeId="19.1113723509227" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082387503956">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082387503957">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1082387503958">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1082387503959">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1082387682452">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941976">
                <link role="baseMethodDeclaration" targetNodeId="1115664493860" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941977">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082387682455">
                  <link role="variableDeclaration" targetNodeId="1082387503954" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082387682457">
                  <link role="variableDeclaration" targetNodeId="1082387503956" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1081880010409">
      <property name="drawBorder" value="false" />
      <property name="name" value="nodeBox" />
      <property name="vertical" value="false" />
      <link role="keyMap" targetNodeId="1081427357000" />
      <link role="actionSet" targetNodeId="1107375429415" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1081880010410">
        <property name="text" value="(" />
        <property name="drawBorder" value="false" />
        <link role="keyMap" targetNodeId="1107347527745" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1081880010411">
        <property name="drawBorder" value="false" />
        <link role="actionSet" targetNodeId="1082386043671" />
        <link role="linkDeclaration" targetNodeId="8.1079359253376" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1081880010412">
        <property name="editable" value="false" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="actionSet" targetNodeId="1082463574819" />
        <link role="keyMap" targetNodeId="1107347562215" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1081929659485">
    <property name="name" value="NotExpression_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1081516740877" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1081931088319">
      <property name="name" value="NotExpressionActions" />
      <link role="specializes" targetNodeId="1082130590765" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1081931088321">
        <property name="substituteHandlerId" value="RightHandExpressionAcceptor" />
        <link role="substituteQueryMethod" targetNodeId="1081927995858" />
        <link role="substituteQueryBody" targetNodeId="1081927995864" />
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1081929706295">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <link role="actionSet" targetNodeId="1107375429415" />
      <link role="keyMap" targetNodeId="1081427357000" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1081930071608">
        <property name="text" value="!(" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1081930071609">
        <property name="drawBorder" value="false" />
        <link role="actionSet" targetNodeId="1081931088319" />
        <link role="linkDeclaration" targetNodeId="8.1081516765348" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1081930071610">
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1081930071611">
    <property name="name" value="GreaterThanExpression_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1081506762703" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1081930071612">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <link role="actionSet" targetNodeId="1107375429415" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1081930083677">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1081776311281" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1081930083678">
        <property name="editable" value="true" />
        <property name="text" value="&gt;" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="actionSet" targetNodeId="1082657774875" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1081930083679">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1081776482707" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1081930092606">
    <property name="name" value="LessThanExpression_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1081506773034" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1081930114469">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <link role="actionSet" targetNodeId="1107375429415" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1081930125362">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1081776311281" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1081930125363">
        <property name="editable" value="true" />
        <property name="text" value="&lt;" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="actionSet" targetNodeId="1082657774875" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1081930125364">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1081776482707" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1081933895507">
    <property name="name" value="BreakStatement_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1081855346303" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1101210155304">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1101210485459">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="break" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1101210485460">
        <property name="text" value=";" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1081942381484">
    <property name="name" value="Type_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068431790189" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Error" id="1081942381485">
      <property name="text" value="&lt;type&gt;" />
      <property name="drawBorder" value="false" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1082114095844">
    <property name="name" value="ContinueStatement_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1082113931046" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1101210185160">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1101210485461">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="continue" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1101210485462">
        <property name="text" value=";" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1082130590765">
    <property name="name" value="_Expression_ActionSet" />
    <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1082130590766">
      <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_ItemGroup" id="1107204021660">
        <property name="handlerId" value="Expression_CodeBlockParameter_CreateReference" />
        <property name="name" value="blockParameters" />
        <property name="queryId" value="Expression_CodeBlockParameters" />
      </node>
      <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_ItemGroup" id="1082130590767">
        <property name="handlerId" value="JavaVariableReferenceFactory" />
        <property name="name" value="fields" />
        <property name="queryId" value="JavaClassFields" />
        <property name="textProviderId" value="JavaElementText" />
        <link role="substituteTextQueryBody" targetNodeId="1081927996227" />
        <link role="substituteModelQueryBody" targetNodeId="1081927996232" />
        <link role="substituteHandlerQueryBody" targetNodeId="1081927996211" />
        <link role="substituteHandlerQueryMethod" targetNodeId="1081927996203" />
        <link role="substituteTextQueryMethod" targetNodeId="1081927996221" />
        <link role="substituteModelQueryMethod" targetNodeId="1081927996228" />
        <node role="nodeSubstituteItemClass" type="jetbrains.mps.baseLanguage.ClassConcept" id="1089820984096">
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996203">
            <property name="name" value="substituteItemHandler_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996204">
              <property name="name" value="sourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996205">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996206">
              <property name="name" value="itemObject" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996207">
                <link role="classifier" targetNodeId="18.1086856195743" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996208">
              <property name="name" value="pattern" />
              <node role="type" type="jetbrains.mps.baseLanguage.StringType" id="1095249439790" />
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996210">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996211">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081949217853">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941978">
                  <link role="baseMethodDeclaration" targetNodeId="1115664493632" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941979">
                    <link role="classifier" targetNodeId="1115664491666" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949217856">
                    <link role="variableDeclaration" targetNodeId="1081927996204" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949217858">
                    <link role="variableDeclaration" targetNodeId="1081927996206" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949217860">
                    <link role="variableDeclaration" targetNodeId="1081927996208" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996221">
            <property name="name" value="substituteItemText_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996222">
              <property name="name" value="mySourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996223">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996224">
              <property name="name" value="myItemObject" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996225">
                <link role="classifier" targetNodeId="18.1086856195743" />
              </node>
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.StringType" id="1081927996226" />
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996227">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081949209879">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941980">
                  <link role="baseMethodDeclaration" targetNodeId="1115664491732" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941981">
                    <link role="classifier" targetNodeId="1115664491666" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949209882">
                    <link role="variableDeclaration" targetNodeId="1081927996222" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949209884">
                    <link role="variableDeclaration" targetNodeId="1081927996224" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996228">
            <property name="name" value="substituteItemModel_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996229">
              <property name="name" value="sourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996230">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996231">
              <link role="classifier" targetNodeId="16.1087811448220" />
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996232">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081949203859">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941982">
                  <link role="baseMethodDeclaration" targetNodeId="1115664491978" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941983">
                    <link role="classifier" targetNodeId="1115664491666" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949203862">
                    <link role="variableDeclaration" targetNodeId="1081927996229" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_ItemGroup" id="1082130590768">
        <property name="handlerId" value="JavaVariableReferenceFactory" />
        <property name="name" value="parameters" />
        <property name="queryId" value="JavaMethodParameters" />
        <property name="textProviderId" value="JavaElementText" />
        <link role="substituteModelQueryMethod" targetNodeId="1081927996258" />
        <link role="substituteHandlerQueryMethod" targetNodeId="1081927996233" />
        <link role="substituteModelQueryBody" targetNodeId="1081927996262" />
        <link role="substituteTextQueryMethod" targetNodeId="1081927996251" />
        <link role="substituteTextQueryBody" targetNodeId="1081927996257" />
        <link role="substituteModelQueryMethod" targetNodeId="1081927996258" />
        <link role="substituteHandlerQueryMethod" targetNodeId="1081927996233" />
        <link role="substituteHandlerQueryBody" targetNodeId="1081927996241" />
        <node role="nodeSubstituteItemClass" type="jetbrains.mps.baseLanguage.ClassConcept" id="1089820984097">
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996233">
            <property name="name" value="substituteItemHandler_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996234">
              <property name="name" value="sourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996235">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996236">
              <property name="name" value="itemObject" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996237">
                <link role="classifier" targetNodeId="18.1086856195743" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996238">
              <property name="name" value="pattern" />
              <node role="type" type="jetbrains.mps.baseLanguage.StringType" id="1095249439791" />
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996240">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996241">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081949222174">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941984">
                  <link role="baseMethodDeclaration" targetNodeId="1115664493632" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941985">
                    <link role="classifier" targetNodeId="1115664491666" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949222177">
                    <link role="variableDeclaration" targetNodeId="1081927996234" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949222179">
                    <link role="variableDeclaration" targetNodeId="1081927996236" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949222181">
                    <link role="variableDeclaration" targetNodeId="1081927996238" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996251">
            <property name="name" value="substituteItemText_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996252">
              <property name="name" value="mySourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996253">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996254">
              <property name="name" value="myItemObject" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996255">
                <link role="classifier" targetNodeId="18.1086856195743" />
              </node>
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.StringType" id="1081927996256" />
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996257">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081949232377">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941986">
                  <link role="baseMethodDeclaration" targetNodeId="1115664491732" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941987">
                    <link role="classifier" targetNodeId="1115664491666" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949232380">
                    <link role="variableDeclaration" targetNodeId="1081927996252" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949232382">
                    <link role="variableDeclaration" targetNodeId="1081927996254" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996258">
            <property name="name" value="substituteItemModel_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996259">
              <property name="name" value="sourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996260">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996261">
              <link role="classifier" targetNodeId="16.1087811448220" />
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996262">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081949304354">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941988">
                  <link role="baseMethodDeclaration" targetNodeId="1115664492128" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941989">
                    <link role="classifier" targetNodeId="1115664491666" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949304357">
                    <link role="variableDeclaration" targetNodeId="1081927996259" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_ItemGroup" id="1082130590769">
        <property name="handlerId" value="JavaVariableReferenceFactory" />
        <property name="name" value="localVariables" />
        <property name="queryId" value="JavaLocalVariables" />
        <property name="textProviderId" value="JavaElementText" />
        <link role="substituteTextQueryBody" targetNodeId="1081927996287" />
        <link role="substituteModelQueryMethod" targetNodeId="1081927996288" />
        <link role="substituteHandlerQueryBody" targetNodeId="1081927996271" />
        <link role="substituteHandlerQueryMethod" targetNodeId="1081927996263" />
        <link role="substituteTextQueryMethod" targetNodeId="1081927996281" />
        <link role="substituteModelQueryBody" targetNodeId="1081927996292" />
        <node role="nodeSubstituteItemClass" type="jetbrains.mps.baseLanguage.ClassConcept" id="1089820984098">
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996263">
            <property name="name" value="substituteItemHandler_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996264">
              <property name="name" value="sourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996265">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996266">
              <property name="name" value="itemObject" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996267">
                <link role="classifier" targetNodeId="18.1086856195743" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996268">
              <property name="name" value="pattern" />
              <node role="type" type="jetbrains.mps.baseLanguage.StringType" id="1095249439792" />
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996270">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996271">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081949229182">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941990">
                  <link role="baseMethodDeclaration" targetNodeId="1115664493632" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941991">
                    <link role="classifier" targetNodeId="1115664491666" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949229185">
                    <link role="variableDeclaration" targetNodeId="1081927996264" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949229187">
                    <link role="variableDeclaration" targetNodeId="1081927996266" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949229189">
                    <link role="variableDeclaration" targetNodeId="1081927996268" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996281">
            <property name="name" value="substituteItemText_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996282">
              <property name="name" value="mySourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996283">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996284">
              <property name="name" value="myItemObject" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996285">
                <link role="classifier" targetNodeId="18.1086856195743" />
              </node>
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.StringType" id="1081927996286" />
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996287">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081949235149">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941992">
                  <link role="baseMethodDeclaration" targetNodeId="1115664491732" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941993">
                    <link role="classifier" targetNodeId="1115664491666" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949235152">
                    <link role="variableDeclaration" targetNodeId="1081927996282" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949235154">
                    <link role="variableDeclaration" targetNodeId="1081927996284" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996288">
            <property name="name" value="substituteItemModel_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996289">
              <property name="name" value="sourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996290">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996291">
              <link role="classifier" targetNodeId="16.1087811448220" />
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996292">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081949315983">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941994">
                  <link role="baseMethodDeclaration" targetNodeId="1115664492517" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941995">
                    <link role="classifier" targetNodeId="1115664491666" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949315986">
                    <link role="variableDeclaration" targetNodeId="1081927996289" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_ItemGroup" id="1082130590770">
        <property name="handlerId" value="MethodCallFactory" />
        <property name="name" value="freeMethods" />
        <property name="queryId" value="FreeMethods" />
        <property name="textProviderId" value="JavaElementText" />
        <link role="substituteModelQueryMethod" targetNodeId="1081927996318" />
        <link role="substituteModelQueryBody" targetNodeId="1081927996322" />
        <link role="substituteTextQueryMethod" targetNodeId="1081927996311" />
        <link role="substituteHandlerQueryBody" targetNodeId="1081927996301" />
        <link role="substituteHandlerQueryMethod" targetNodeId="1081927996293" />
        <link role="substituteTextQueryBody" targetNodeId="1081927996317" />
        <node role="nodeSubstituteItemClass" type="jetbrains.mps.baseLanguage.ClassConcept" id="1089820984099">
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996293">
            <property name="name" value="substituteItemHandler_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996294">
              <property name="name" value="sourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996295">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996296">
              <property name="name" value="itemObject" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996297">
                <link role="classifier" targetNodeId="18.1086856195743" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996298">
              <property name="name" value="pattern" />
              <node role="type" type="jetbrains.mps.baseLanguage.StringType" id="1095249439793" />
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996300">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996301">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081949342288">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941996">
                  <link role="baseMethodDeclaration" targetNodeId="1115664493879" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941997">
                    <link role="classifier" targetNodeId="1115664491666" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949342291">
                    <link role="variableDeclaration" targetNodeId="1081927996294" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949342293">
                    <link role="variableDeclaration" targetNodeId="1081927996296" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949342295">
                    <link role="variableDeclaration" targetNodeId="1081927996298" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996311">
            <property name="name" value="substituteItemText_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996312">
              <property name="name" value="mySourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996313">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996314">
              <property name="name" value="myItemObject" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996315">
                <link role="classifier" targetNodeId="18.1086856195743" />
              </node>
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.StringType" id="1081927996316" />
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996317">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081949237733">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687941998">
                  <link role="baseMethodDeclaration" targetNodeId="1115664491732" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687941999">
                    <link role="classifier" targetNodeId="1115664491666" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949237736">
                    <link role="variableDeclaration" targetNodeId="1081927996312" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949237738">
                    <link role="variableDeclaration" targetNodeId="1081927996314" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996318">
            <property name="name" value="substituteItemModel_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996319">
              <property name="name" value="sourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996320">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996321">
              <link role="classifier" targetNodeId="16.1087811448220" />
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996322">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081949325112">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687942000">
                  <link role="baseMethodDeclaration" targetNodeId="1115664492180" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687942001">
                    <link role="classifier" targetNodeId="1115664491666" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949325115">
                    <link role="variableDeclaration" targetNodeId="1081927996319" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_ItemGroup" id="1082130590771">
        <property name="handlerId" value="ThisInstanceMethodCallFactory" />
        <property name="name" value="instanceMethods" />
        <property name="queryId" value="JavaClassMethods" />
        <property name="textProviderId" value="JavaElementText" />
        <link role="substituteHandlerQueryBody" targetNodeId="1081927996331" />
        <link role="substituteHandlerQueryMethod" targetNodeId="1081927996323" />
        <link role="substituteModelQueryBody" targetNodeId="1081927996352" />
        <link role="substituteModelQueryMethod" targetNodeId="1081927996348" />
        <link role="substituteTextQueryMethod" targetNodeId="1081927996341" />
        <link role="substituteTextQueryBody" targetNodeId="1081927996347" />
        <node role="nodeSubstituteItemClass" type="jetbrains.mps.baseLanguage.ClassConcept" id="1089820984100">
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996323">
            <property name="name" value="substituteItemHandler_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996324">
              <property name="name" value="sourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996325">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996326">
              <property name="name" value="itemObject" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996327">
                <link role="classifier" targetNodeId="18.1086856195743" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996328">
              <property name="name" value="pattern" />
              <node role="type" type="jetbrains.mps.baseLanguage.StringType" id="1095249439794" />
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996330">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996331">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081949412168">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687942002">
                  <link role="baseMethodDeclaration" targetNodeId="1115664493646" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687942003">
                    <link role="classifier" targetNodeId="1115664491666" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949412171">
                    <link role="variableDeclaration" targetNodeId="1081927996324" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949412173">
                    <link role="variableDeclaration" targetNodeId="1081927996326" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949412175">
                    <link role="variableDeclaration" targetNodeId="1081927996328" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996341">
            <property name="name" value="substituteItemText_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996342">
              <property name="name" value="mySourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996343">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996344">
              <property name="name" value="myItemObject" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996345">
                <link role="classifier" targetNodeId="18.1086856195743" />
              </node>
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.StringType" id="1081927996346" />
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996347">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081949291302">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687942004">
                  <link role="baseMethodDeclaration" targetNodeId="1115664491732" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687942005">
                    <link role="classifier" targetNodeId="1115664491666" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949291305">
                    <link role="variableDeclaration" targetNodeId="1081927996342" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949291307">
                    <link role="variableDeclaration" targetNodeId="1081927996344" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996348">
            <property name="name" value="substituteItemModel_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996349">
              <property name="name" value="sourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996350">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996351">
              <link role="classifier" targetNodeId="16.1087811448220" />
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996352">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081949354406">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687942006">
                  <link role="baseMethodDeclaration" targetNodeId="1115664492050" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687942007">
                    <link role="classifier" targetNodeId="1115664491666" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949354409">
                    <link role="variableDeclaration" targetNodeId="1081927996349" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_ItemGroup" id="1082130899953">
        <property name="name" value="expressionTypes" />
        <link role="substituteHandlerQueryBody" targetNodeId="1082131184588" />
        <link role="substituteModelQueryMethod" targetNodeId="1082131184613" />
        <link role="substituteModelQueryBody" targetNodeId="1082131184617" />
        <link role="substituteHandlerQueryMethod" targetNodeId="1082131184580" />
        <node role="nodeSubstituteItemClass" type="jetbrains.mps.baseLanguage.ClassConcept" id="1089820984101">
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1082131184580">
            <property name="name" value="substituteItemHandler_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082131184581">
              <property name="name" value="sourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082131184582">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082131184583">
              <property name="name" value="itemObject" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082131184584">
                <link role="classifier" targetNodeId="18.1086856195743" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082131184585">
              <property name="name" value="pattern" />
              <node role="type" type="jetbrains.mps.baseLanguage.StringType" id="1095249439811" />
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1082131184587">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1082131184588">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1082131184589">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687942008">
                  <link role="baseMethodDeclaration" targetNodeId="1115664493611" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687942009">
                    <link role="classifier" targetNodeId="1115664491666" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082131184592">
                    <link role="variableDeclaration" targetNodeId="1082131184581" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082131184594">
                    <link role="variableDeclaration" targetNodeId="1082131184583" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082131184596">
                    <link role="variableDeclaration" targetNodeId="1082131184585" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1082131184613">
            <property name="name" value="substituteItemModel_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082131184614">
              <property name="name" value="sourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082131184615">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1082131184616">
              <link role="classifier" targetNodeId="16.1087811448220" />
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1082131184617">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1082131184618">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687942010">
                  <link role="baseMethodDeclaration" targetNodeId="1115664493779" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687942011">
                    <link role="classifier" targetNodeId="1115664491666" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082131184621">
                    <link role="variableDeclaration" targetNodeId="1082131184614" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_Simple" id="1082132100375">
        <property name="text" value="false" />
        <property name="handlerId" value="FalseLiteralFactory" />
        <link role="substituteHandlerQueryBody" targetNodeId="1081927996361" />
        <link role="substituteHandlerQueryMethod" targetNodeId="1081927996353" />
        <node role="nodeSubstituteItemClass" type="jetbrains.mps.baseLanguage.ClassConcept" id="1089820984102">
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996353">
            <property name="name" value="substituteItemHandler_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996354">
              <property name="name" value="sourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996355">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996356">
              <property name="name" value="itemObject" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996357">
                <link role="classifier" targetNodeId="18.1086856195743" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996358">
              <property name="name" value="pattern" />
              <node role="type" type="jetbrains.mps.baseLanguage.StringType" id="1095249439812" />
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996360">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996361">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1082010676671">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687942012">
                  <link role="baseMethodDeclaration" targetNodeId="1115664493669" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687942013">
                    <link role="classifier" targetNodeId="1115664491666" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082010676674">
                    <link role="variableDeclaration" targetNodeId="1081927996354" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082010676676">
                    <link role="variableDeclaration" targetNodeId="1081927996356" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082010676678">
                    <link role="variableDeclaration" targetNodeId="1081927996358" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_Simple" id="1082132100376">
        <property name="text" value="true" />
        <property name="handlerId" value="TrueLiteralFactory" />
        <link role="substituteHandlerQueryBody" targetNodeId="1081927996379" />
        <link role="substituteHandlerQueryMethod" targetNodeId="1081927996371" />
        <node role="nodeSubstituteItemClass" type="jetbrains.mps.baseLanguage.ClassConcept" id="1089820984103">
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996371">
            <property name="name" value="substituteItemHandler_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996372">
              <property name="name" value="sourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996373">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996374">
              <property name="name" value="itemObject" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996375">
                <link role="classifier" targetNodeId="18.1086856195743" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996376">
              <property name="name" value="pattern" />
              <node role="type" type="jetbrains.mps.baseLanguage.StringType" id="1095249439813" />
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996378">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996379">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1081949440192">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687942014">
                  <link role="baseMethodDeclaration" targetNodeId="1115664493687" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687942015">
                    <link role="classifier" targetNodeId="1115664491666" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949440195">
                    <link role="variableDeclaration" targetNodeId="1081927996372" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949440197">
                    <link role="variableDeclaration" targetNodeId="1081927996374" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1081949440199">
                    <link role="variableDeclaration" targetNodeId="1081927996376" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_Simple" id="1082132100377">
        <property name="matcherId" value="IntegerLiteralMatcher" />
        <property name="text" value="integer constant" />
        <property name="handlerId" value="IntegerLiteralFactory" />
        <link role="substituteHandlerQueryMethod" targetNodeId="1081927996389" />
        <link role="substituteMatcherQueryMethod" targetNodeId="1081927996398" />
        <link role="substituteHandlerQueryBody" targetNodeId="1081927996397" />
        <link role="substituteMatcherQueryBody" targetNodeId="1081927996406" />
        <link role="substituteHandlerQueryMethod" targetNodeId="1081927996389" />
        <node role="nodeSubstituteItemClass" type="jetbrains.mps.baseLanguage.ClassConcept" id="1089820984104">
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996389">
            <property name="name" value="substituteItemHandler_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996390">
              <property name="name" value="sourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996391">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996392">
              <property name="name" value="itemObject" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996393">
                <link role="classifier" targetNodeId="18.1086856195743" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996394">
              <property name="name" value="pattern" />
              <node role="type" type="jetbrains.mps.baseLanguage.StringType" id="1095249439814" />
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996396">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996397">
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1083144100785">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1083144100786">
                  <property name="name" value="intLiteral" />
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1083144100787">
                    <link role="classifier" targetNodeId="19.1113723508692" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1083144100788">
                    <link role="baseMethodDeclaration" targetNodeId="19.1113723508712" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1083144100789">
                      <link role="classifier" targetNodeId="19.1113723508692" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1083144100791">
                      <link role="baseMethodDeclaration" targetNodeId="15.1086945615528" />
                      <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1083144100792">
                        <link role="variableDeclaration" targetNodeId="1081927996390" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1083144100793">
                <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1083144100794">
                  <link role="baseMethodDeclaration" targetNodeId="15.1086945615647" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.StringLiteral" id="1095091330722">
                    <property name="value" value="value" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1083144100798">
                    <link role="variableDeclaration" targetNodeId="1081927996394" />
                  </node>
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1083144100799">
                    <link role="variableDeclaration" targetNodeId="1083144100786" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1083144100800">
                <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1083144100801">
                  <link role="variableDeclaration" targetNodeId="1083144100786" />
                </node>
              </node>
            </node>
          </node>
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1081927996398">
            <property name="name" value="substituteItemMatcher_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996399">
              <property name="name" value="sourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1081927996400">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996401">
              <property name="name" value="itemObject" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1095091330723">
                <link role="classifier" targetNodeId="18.1086856195743" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1081927996403">
              <property name="name" value="pattern" />
              <node role="type" type="jetbrains.mps.baseLanguage.StringType" id="1095249439815" />
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.BooleanType" id="1081927996405">
              <property name="name" value="boolean" />
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1081927996406">
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1095091330724">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1095091330725">
                  <property name="name" value="intConstantType" />
                  <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1095091330727">
                    <link role="baseMethodDeclaration" targetNodeId="15.1086945614672" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1095091330728">
                      <link role="classifier" targetNodeId="15.1086945614633" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1095091330730">
                      <link role="baseMethodDeclaration" targetNodeId="15.1086945615528" />
                      <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1095091330731">
                        <link role="variableDeclaration" targetNodeId="1081927996399" />
                      </node>
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.StringLiteral" id="1095091330733">
                      <property name="value" value="IntegerConstant" />
                    </node>
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1100543115633">
                    <link role="classifier" targetNodeId="17.1086945615917" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1095093597718">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1095093597719">
                  <property name="name" value="propDeclaration" />
                  <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1095093597721">
                    <link role="baseMethodDeclaration" targetNodeId="15.1117844139438" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1095093597722">
                      <link role="classifier" targetNodeId="15.1086945615339" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1095093597724">
                      <link role="variableDeclaration" targetNodeId="1095091330725" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.StringLiteral" id="1095093597726">
                      <property name="value" value="value" />
                    </node>
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1100543115634">
                    <link role="classifier" targetNodeId="17.1100542739192" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1095093597727">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1095093597728">
                  <property name="name" value="propSupport" />
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1095093597729">
                    <link role="classifier" targetNodeId="15.1086945615739" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1095093597730">
                    <link role="baseMethodDeclaration" targetNodeId="15.1117844135510" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1095093597731">
                      <link role="classifier" targetNodeId="15.1086945615739" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1095093597733">
                      <link role="variableDeclaration" targetNodeId="1095093597719" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1095093597734">
                <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1095093597735">
                  <link role="baseMethodDeclaration" targetNodeId="15.1086945615743" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1095093597737">
                    <link role="variableDeclaration" targetNodeId="1081927996403" />
                  </node>
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1095093597738">
                    <link role="variableDeclaration" targetNodeId="1095093597728" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_Simple" id="1113255239454">
        <property name="matcherId" value="FloatingPointMathcer" />
        <property name="text" value="floating point constant" />
        <property name="handlerId" value="NewFloatingPointConstant" />
      </node>
    </node>
    <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SurroundNodeWith" id="1112351841336">
      <property name="substituteHandlerId" value="stub_method" />
      <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_Simple" id="1112351949412">
        <property name="text" value="(expr)" />
        <property name="handlerId" value="ParensHandler" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1082381396722">
    <property name="name" value="BinaryOperation_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1081773326031" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Error" id="1082381396723">
      <property name="text" value="&lt;binary operation&gt;" />
      <property name="drawBorder" value="false" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1082463574819">
    <property name="name" value="_ExpressionClosingParethesis_ActionSet" />
    <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_DeleteNode" id="1082463574820">
      <property name="disabled" value="true" />
    </node>
    <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_RightTransform" id="1082463574821">
      <property name="actionProviderId" value="Expression" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1082485734863">
    <property name="name" value="Block_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1082485599095" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1119291654779">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1119291719344">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1119291719345">
          <property name="text" value="{" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1119291719346">
          <property name="drawBorder" value="false" />
          <link role="linkDeclaration" targetNodeId="8.1082485599096" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1119291721269">
        <property name="text" value="}" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="cellLayout" type="jetbrains.mps.bootstrap.editorLanguage.CellLayout_Vertical" id="1119291668296" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1082657774875">
    <property name="name" value="_BinaryOperation_Operator_ActionSet" />
    <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1105031302054">
      <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_ItemGroup" id="1105031328102">
        <property name="handlerId" value="BinaryOperationReplacementFactory" />
        <property name="name" value="binaryOperation" />
        <property name="queryId" value="AllBinaryOperations" />
      </node>
      <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1105031328103">
        <node role="returnType" type="jetbrains.mps.baseLanguage.Type" id="1105031328104" />
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1105031328105" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1082741406448">
    <property name="name" value="_ClassType_ActionSet" />
    <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1082741406449">
      <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_ItemGroup" id="1082741406450">
        <property name="name" value="classTypes" />
        <link role="substituteModelQueryBody" targetNodeId="1082741457168" />
        <link role="substituteTextQueryBody" targetNodeId="1082741457163" />
        <link role="substituteHandlerQueryBody" targetNodeId="1082741457147" />
        <link role="substituteModelQueryMethod" targetNodeId="1082741457164" />
        <link role="substituteHandlerQueryMethod" targetNodeId="1082741457139" />
        <link role="substituteTextQueryMethod" targetNodeId="1082741457157" />
        <node role="nodeSubstituteItemClass" type="jetbrains.mps.baseLanguage.ClassConcept" id="1089820984130">
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1082741457139">
            <property name="name" value="substituteItemHandler_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082741457140">
              <property name="name" value="sourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082741457141">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082741457142">
              <property name="name" value="itemObject" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082741457143">
                <link role="classifier" targetNodeId="18.1086856195743" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082741457144">
              <property name="name" value="pattern" />
              <node role="type" type="jetbrains.mps.baseLanguage.StringType" id="1095249439818" />
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1082741457146">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1082741457147">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1082741566032">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687942060">
                  <link role="baseMethodDeclaration" targetNodeId="1115664493742" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687942061">
                    <link role="classifier" targetNodeId="1115664491666" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082741566035">
                    <link role="variableDeclaration" targetNodeId="1082741457140" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082741566037">
                    <link role="variableDeclaration" targetNodeId="1082741457142" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082741566039">
                    <link role="variableDeclaration" targetNodeId="1082741457144" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1082741457157">
            <property name="name" value="substituteItemText_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082741457158">
              <property name="name" value="mySourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082741457159">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082741457160">
              <property name="name" value="myItemObject" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082741457161">
                <link role="classifier" targetNodeId="18.1086856195743" />
              </node>
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.StringType" id="1082741457162" />
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1082741457163">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1082741580024">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687942062">
                  <link role="baseMethodDeclaration" targetNodeId="1115664491732" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687942063">
                    <link role="classifier" targetNodeId="1115664491666" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082741580027">
                    <link role="variableDeclaration" targetNodeId="1082741457158" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082741580029">
                    <link role="variableDeclaration" targetNodeId="1082741457160" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1082741457164">
            <property name="name" value="substituteItemModel_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1082741457165">
              <property name="name" value="sourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1082741457166">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1082741457167">
              <link role="classifier" targetNodeId="16.1087811448220" />
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1082741457168">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1082741491872">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687942064">
                  <link role="baseMethodDeclaration" targetNodeId="1115664491871" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687942065">
                    <link role="classifier" targetNodeId="1115664491666" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1082741491875">
                    <link role="variableDeclaration" targetNodeId="1082741457165" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1083262769250">
    <property name="name" value="EnumConstantReference_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1083260308424" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1090928601262">
      <property name="name" value="TypeActions" />
      <link role="specializes" targetNodeId="1082741406448" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1090928601263">
        <link role="substituteQueryBody" targetNodeId="1090928601270" />
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1090928601264">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1090928601265">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1090928601266">
              <link role="classifier" targetNodeId="19.1113723508164" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1090928601267">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1090928601268">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1090928601269">
            <link role="classifier" targetNodeId="15.1086945614627" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1090928601270">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1090928601271">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1090928601272">
                <property name="name" value="classType" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1090928601274">
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1090928601275">
                    <link role="variableDeclaration" targetNodeId="1090928601267" />
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1108064267227">
                    <link role="classifier" targetNodeId="19.1108062816180" />
                  </node>
                </node>
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1108064267228">
                  <link role="classifier" targetNodeId="19.1108062816180" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1090928601277">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1090928601278">
                <property name="name" value="reference" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1090928601279">
                  <link role="classifier" targetNodeId="19.1113723508164" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1090928601280">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1090928601281">
                    <link role="classifier" targetNodeId="19.1113723508164" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1090928601282">
                    <link role="variableDeclaration" targetNodeId="1090928601265" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1090928601283">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1090928601284">
                <link role="baseMethodDeclaration" targetNodeId="19.1113723508184" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1090928601285">
                  <link role="variableDeclaration" targetNodeId="1090928601278" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1090928601289">
                  <link role="variableDeclaration" targetNodeId="1090928601272" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1090928601292">
              <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1090928601293">
                <link role="variableDeclaration" targetNodeId="1090928601272" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1090928601294">
      <property name="name" value="ConstantNameActions" />
      <link role="specializes" targetNodeId="1107375429415" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1090928601296">
        <link role="substituteQueryBody" targetNodeId="1090928601352" />
        <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_ItemGroup" id="1090928601297">
          <property name="name" value="constants" />
          <link role="substituteHandlerQueryBody" targetNodeId="1090928601307" />
          <link role="substituteMatcherQueryMethod" targetNodeId="1090928601308" />
          <link role="substituteTextQueryMethod" targetNodeId="1090928601317" />
          <link role="substituteTextQueryMethod" targetNodeId="1090928601317" />
          <link role="substituteDescriptionTextQueryMethod" targetNodeId="1090928601330" />
          <link role="substituteTextQueryBody" targetNodeId="1090928601323" />
          <link role="substituteDescriptionTextQueryBody" targetNodeId="1090928601336" />
          <link role="substituteModelQueryMethod" targetNodeId="1090928601337" />
          <link role="substituteModelQueryBody" targetNodeId="1090928601341" />
          <link role="substituteHandlerQueryMethod" targetNodeId="1090928601299" />
          <link role="substituteMatcherQueryBody" targetNodeId="1090928601316" />
          <node role="nodeSubstituteItemClass" type="jetbrains.mps.baseLanguage.ClassConcept" id="1090928601298">
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1090928601299">
              <property name="name" value="substituteItemHandler_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1090928601300">
                <property name="name" value="sourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1090928601301">
                  <link role="classifier" targetNodeId="19.1113723508164" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1090928601302">
                <property name="name" value="itemObject" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1090928601303">
                  <link role="classifier" targetNodeId="18.1086856195743" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1090928601304">
                <property name="name" value="pattern" />
                <node role="type" type="jetbrains.mps.baseLanguage.StringType" id="1090928601305" />
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1090928601306">
                <link role="classifier" targetNodeId="18.1086856195743" />
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1090928601307" />
            </node>
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1090928601308">
              <property name="name" value="substituteItemMatcher_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1090928601309">
                <property name="name" value="sourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1090928601310">
                  <link role="classifier" targetNodeId="19.1113723508164" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1090928601311">
                <property name="name" value="itemNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1090928601312">
                  <link role="classifier" targetNodeId="18.1086856195743" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1090928601313">
                <property name="name" value="pattern" />
                <node role="type" type="jetbrains.mps.baseLanguage.StringType" id="1090928601314" />
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.BooleanType" id="1090928601315">
                <property name="name" value="boolean" />
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1090928601316" />
            </node>
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1090928601317">
              <property name="name" value="substituteItemText_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1090928601318">
                <property name="name" value="sourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1090928601319">
                  <link role="classifier" targetNodeId="19.1113723508164" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1090928601320">
                <property name="name" value="itemObject" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1090928601321">
                  <link role="classifier" targetNodeId="14.1086945614093" />
                </node>
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.StringType" id="1090928601322" />
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1090928601323">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1090930967328">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687942066">
                    <link role="baseMethodDeclaration" targetNodeId="1115664491732" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687942067">
                      <link role="classifier" targetNodeId="1115664491666" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1090930967331">
                      <link role="variableDeclaration" targetNodeId="1082742196994" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1090930967333">
                      <link role="variableDeclaration" targetNodeId="1082742196996" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1090928601330">
              <property name="name" value="substituteItemDescriptionText_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1090928601331">
                <property name="name" value="sourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1090928601332">
                  <link role="classifier" targetNodeId="19.1113723508164" />
                </node>
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1090928601333">
                <property name="name" value="itemObject" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1090928601334">
                  <link role="classifier" targetNodeId="14.1086945614093" />
                </node>
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.StringType" id="1090928601335" />
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1090928601336" />
            </node>
            <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1090928601337">
              <property name="name" value="substituteItemModel_Query" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1090928601338">
                <property name="name" value="sourceNode" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1090928601339">
                  <link role="classifier" targetNodeId="19.1113723508164" />
                </node>
              </node>
              <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1090928601340">
                <link role="classifier" targetNodeId="16.1087811448220" />
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1090928601341">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1090928601342">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687942068">
                    <link role="baseMethodDeclaration" targetNodeId="1115664494138" />
                    <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687942069">
                      <link role="classifier" targetNodeId="1115664491666" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1090928601345">
                      <link role="variableDeclaration" targetNodeId="1090928601338" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1090928601346">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1090928601347">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1090928601348">
              <link role="classifier" targetNodeId="19.1113723508164" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1090928601349">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1090928601350">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1090928601351">
            <link role="classifier" targetNodeId="15.1086945614627" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1090928601352">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1090928601353">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1090928601354">
                <property name="name" value="declaration" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1090928601355">
                  <link role="classifier" targetNodeId="19.1113723508096" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1090928601356">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1090928601357">
                    <link role="classifier" targetNodeId="19.1113723508096" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1090928601358">
                    <link role="variableDeclaration" targetNodeId="1090928601349" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1090928601359">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1090928601360">
                <property name="name" value="reference" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1090928601361">
                  <link role="classifier" targetNodeId="19.1113723508164" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.CastExpression" id="1090928601362">
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1090928601363">
                    <link role="classifier" targetNodeId="19.1113723508164" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1090928601364">
                    <link role="variableDeclaration" targetNodeId="1090928601347" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1091461667073">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1091461667090">
                <link role="baseMethodDeclaration" targetNodeId="19.1113723508188" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1091461667091">
                  <link role="variableDeclaration" targetNodeId="1090928601360" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1091461667093">
                  <link role="variableDeclaration" targetNodeId="1090928601354" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1090928601374">
              <node role="expression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1090928601375" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1090928601376">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1090928601377">
        <property name="drawBorder" value="false" />
        <link role="actionSet" targetNodeId="1090928601262" />
        <link role="linkDeclaration" targetNodeId="8.1083260308425" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1090928601378">
        <property name="text" value="." />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1090928601379">
        <property name="drawBorder" value="false" />
        <link role="actionSet" targetNodeId="1090928601294" />
        <link role="linkDeclaration" targetNodeId="8.1083260308426" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1090928601380">
          <link role="conceptDeclaration" targetNodeId="8.1083245299891" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1090928601381">
            <property name="drawBorder" value="false" />
            <link role="propertyDeclaration" targetNodeId="9.1078489098626" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1084188901668">
    <property name="name" value="StaticFieldDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1070462154015" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1084188979609">
      <property name="name" value="NameCellActions" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_RightTransform" id="1084188979610">
        <property name="actionProviderId" value="AddInitializer" />
      </node>
    </node>
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1084188979611">
      <property name="name" value="TypeCellActions" />
      <link role="specializes" targetNodeId="1076932037578" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1084188979612">
        <property name="substituteHandlerId" value="VariableDeclarationTypeAcceptor" />
        <link role="substituteQueryBody" targetNodeId="1081927994663" />
        <link role="substituteQueryMethod" targetNodeId="1081927994657" />
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1084188901669">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1084188979613">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="static" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1084188979614">
        <property name="nullRefText" value="&lt;no type&gt;" />
        <property name="drawBorder" value="false" />
        <property name="nullText" value="&lt;no type&gt;" />
        <link role="linkDeclaration" targetNodeId="8.1068431790188" />
        <link role="actionSet" targetNodeId="1084188979611" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1084188979615">
        <property name="textFgColor" value="DARK_MAGENTA" />
        <property name="writable" value="true" />
        <property name="defaultText" value="&lt;no name&gt;" />
        <property name="fontStyle" value="BOLD_ITALIC" />
        <property name="defaultValue" value="?" />
        <property name="drawBorder" value="false" />
        <link role="actionSet" targetNodeId="1084188979609" />
        <link role="propertyDeclaration" targetNodeId="9.1078489098626" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1084188979616">
        <property name="drawBorder" value="false" />
        <property name="conditionId" value="HasInitializer" />
        <property name="name" value="initializerArea" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <link role="conditionalQueryMethod" targetNodeId="1082097601654" />
        <link role="conditionalQueryBody" targetNodeId="1082097601658" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1084188979617">
          <property name="text" value="=" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1084188979618">
          <property name="drawBorder" value="false" />
          <link role="actionSet" targetNodeId="1077124145703" />
          <link role="keyMap" targetNodeId="1081427357000" />
          <link role="linkDeclaration" targetNodeId="8.1068431790190" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1084188979619">
        <property name="text" value=";" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1085483277582">
    <property name="name" value="EnumClass_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1083245097125" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1085483457768">
      <property name="name" value="EmptyListActions" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_DeleteNode" id="1085483457769">
        <property name="disabled" value="true" />
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1085483277583">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1085483277584">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085483277585">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="enum" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1085483277586">
          <property name="drawBorder" value="false" />
          <property name="selectable" value="true" />
          <link role="propertyDeclaration" targetNodeId="8.1075300953595" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085483277587">
          <property name="text" value="{" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1085483277588">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085483277589">
          <property name="text" value="    " />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1085483277590">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="true" />
          <link role="linkDeclaration" targetNodeId="8.1083245396908" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085483277591">
            <property name="text" value="&lt;&lt; enum constants &gt;&gt;" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="true" />
            <link role="actionSet" targetNodeId="1085483457768" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1085483273078">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085483273079">
          <property name="text" value="    " />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1085483273080">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="true" />
          <link role="linkDeclaration" targetNodeId="8.1068390468199" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085483273081">
            <property name="text" value="&lt;&lt; fields &gt;&gt;" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="true" />
            <link role="actionSet" targetNodeId="1085483457768" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1085483457770">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085483457771">
          <property name="text" value="    " />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1085483457772">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="true" />
          <link role="nodeFactoryQueryBody" targetNodeId="1085485817063" />
          <link role="linkDeclaration" targetNodeId="8.1068390468201" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085483457773">
            <property name="text" value="&lt;&lt; constructors &gt;&gt;" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="true" />
            <link role="actionSet" targetNodeId="1085483457768" />
          </node>
          <node role="nodeFactoryQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1085485817059">
            <property name="name" value="nodeFactoryQuery" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1085485817060">
              <property name="name" value="listOwner" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1085485817061">
                <link role="classifier" targetNodeId="15.1086945614627" />
              </node>
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1085485817062">
              <link role="classifier" targetNodeId="15.1086945614627" />
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1085485817063" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1085483457774">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085483457775">
          <property name="text" value="    " />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1085483457776">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="true" />
          <link role="linkDeclaration" targetNodeId="8.1107880067339" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085483457777">
            <property name="text" value="&lt;&lt; methods &gt;&gt;" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="true" />
            <link role="actionSet" targetNodeId="1085483457768" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1085483457778">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085483457779">
          <property name="text" value="    " />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1085483457780">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="true" />
          <link role="linkDeclaration" targetNodeId="8.1070462273904" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085483457781">
            <property name="text" value="&lt;&lt; static methods &gt;&gt;" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="true" />
            <link role="actionSet" targetNodeId="1085483457768" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085483277593">
        <property name="text" value="}" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1085485112422">
    <property name="name" value="EnumConstantDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1083245299891" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1085485112425">
      <property name="name" value="NoArgumentsActions" />
      <link role="specializes" targetNodeId="1095257479496" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_DeleteNode" id="1085485112426">
        <property name="disabled" value="true" />
      </node>
    </node>
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1095257479496">
      <property name="name" value="ArgumentActions" />
      <link role="specializes" targetNodeId="1082130590765" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1095257566411">
        <link role="substituteQueryBody" targetNodeId="1095257566412" />
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1095257566413">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1095257566414">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1095257566415">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1095257566416">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1095257566417">
              <link role="classifier" targetNodeId="14.1086945614093" />
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1095257566412">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1095257566418">
              <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687942085">
                <link role="baseMethodDeclaration" targetNodeId="1115664494262" />
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687942086">
                  <link role="classifier" targetNodeId="1115664491666" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1095257566420">
                  <link role="variableDeclaration" targetNodeId="1095257566414" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1095257566421">
                  <link role="variableDeclaration" targetNodeId="1095257566416" />
                </node>
              </node>
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1095257566422">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1085485112428">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1085485112429">
        <property name="drawBorder" value="false" />
        <link role="propertyDeclaration" targetNodeId="9.1078489098626" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085485112430">
        <property name="text" value="(" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1085485112431">
        <property name="separatorText" value="," />
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <link role="elementActionSet" targetNodeId="1095257479496" />
        <link role="linkDeclaration" targetNodeId="8.1083245396909" />
        <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1095257566423">
          <property name="editable" value="true" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="true" />
          <link role="actionSet" targetNodeId="1085485112425" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085485112432">
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1090242255906">
    <property name="name" value="VariableReference_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1068498886296" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Error" id="1090310064235">
      <property name="text" value="&lt;collection&gt;" />
      <property name="drawBorder" value="false" />
      <link role="actionSet" targetNodeId="1107375429415" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1092120339522">
    <property name="name" value="MulExpression_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1092119917967" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1092120339525">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <link role="actionSet" targetNodeId="1107375429415" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1092120339526">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1081776311281" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1092120339527">
        <property name="text" value="*" />
        <property name="drawBorder" value="false" />
        <link role="actionSet" targetNodeId="1082657774875" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1092120339528">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1081776482707" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1095950539781">
    <property name="name" value="DivExpression_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1095950406618" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1095950575407">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <link role="actionSet" targetNodeId="1107375429415" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1095950663111">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1081776311281" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1095950663112">
        <property name="text" value="/" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1095950663113">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1081776482707" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1106930001705">
    <property name="name" value="_ConstructorCall_ActionSet" />
    <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1106930111081">
      <property name="substituteHandlerId" value="ConstructorCall_SetConstructorDeclaration" />
      <link role="substituteQueryBody" targetNodeId="1106930111082" />
      <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.SubstituteItem_ItemGroup" id="1106930092923">
        <property name="name" value="constructors" />
        <link role="substituteTextQueryMethod" targetNodeId="1106930111085" />
        <link role="substituteModelQueryMethod" targetNodeId="1106930111083" />
        <link role="substituteTextQueryBody" targetNodeId="1106930111084" />
        <link role="substituteModelQueryBody" targetNodeId="1106930111086" />
        <node role="nodeSubstituteItemClass" type="jetbrains.mps.baseLanguage.ClassConcept" id="1106930111087">
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1106930111085">
            <property name="name" value="substituteItemText_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1106930111088">
              <property name="name" value="mySourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1106930111089">
                <link role="classifier" targetNodeId="19.1113723507910" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1106930111090">
              <property name="name" value="myItemObject" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1106930111091">
                <link role="classifier" targetNodeId="14.1086945614093" />
              </node>
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.StringType" id="1106930111107" />
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1106930111084">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1106930111108">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687942087">
                  <link role="baseMethodDeclaration" targetNodeId="1115664491732" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687942088">
                    <link role="classifier" targetNodeId="1115664491666" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1106930111110">
                    <link role="variableDeclaration" targetNodeId="1106930111088" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1106930111111">
                    <link role="variableDeclaration" targetNodeId="1106930111090" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1106930111083">
            <property name="name" value="substituteItemModel_Query" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1106930111112">
              <property name="name" value="sourceNode" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1106930111113">
                <link role="classifier" targetNodeId="19.1113723507910" />
              </node>
            </node>
            <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1106930111114">
              <link role="classifier" targetNodeId="16.1087811448220" />
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1106930111086">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1106930111115">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1115687942089">
                  <link role="baseMethodDeclaration" targetNodeId="1115664493099" />
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1115687942090">
                    <link role="classifier" targetNodeId="1115664491666" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1106930111117">
                    <link role="variableDeclaration" targetNodeId="1106930111112" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1106930111118">
        <property name="name" value="substituteAcceptor_Query" />
        <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1106930111119">
          <property name="name" value="node" />
          <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1106930111120">
            <link role="classifier" targetNodeId="19.1113723507910" />
          </node>
        </node>
        <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1106930111121">
          <property name="name" value="object" />
          <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1106930111122">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
        </node>
        <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1106930111123">
          <link role="classifier" targetNodeId="18.1086856195743" />
        </node>
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1106930111082" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.EditorComponentDeclaration" id="1107192536658">
    <property name="name" value="_CodeBlock_Component" />
    <link role="conceptDeclaration" targetNodeId="8.1107134345596" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1119314994020">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <property name="selectable" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1119315002099">
        <property name="drawBorder" value="false" />
        <property name="nullText" value="&lt;no statement&gt;" />
        <link role="linkDeclaration" targetNodeId="8.1107134797946" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1107213958236">
    <link role="conceptDeclaration" targetNodeId="8.1107136355904" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1107214220284">
      <property name="drawBorder" value="false" />
      <property name="nullText" value="&lt;no ref to block parameter&gt;" />
      <link role="keyMap" targetNodeId="1081427357000" />
      <link role="actionSet" targetNodeId="1107375429415" />
      <link role="linkDeclaration" targetNodeId="8.1107136391389" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1107214174736">
        <link role="conceptDeclaration" targetNodeId="8.1107135704075" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_ModelAccess" id="1107214220285">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="fontStyle" value="ITALIC" />
          <property name="modelAccessorId" value="Node_DefaultText" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapDeclaration" id="1107341785237">
    <property name="name" value="_LocalVariableName_KeyMap" />
    <node role="entry" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapEntry" id="1107341794192">
      <property name="keycode" value="=" />
      <property name="actionProviderId" value="LocalVariable_AddInitializez" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapDeclaration" id="1107347527745">
    <property name="name" value="_LeftParen_KeyMap" />
    <node role="entry" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapEntry" id="1107347535801">
      <property name="keycode" value="VK_DELETE" />
      <property name="actionProviderId" value="DeleteParens" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapDeclaration" id="1107347562215">
    <property name="name" value="_RightParen_KeyMap" />
    <node role="entry" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapEntry" id="1107347568898">
      <property name="keycode" value="VK_BACK_SPACE" />
      <property name="actionProviderId" value="DeleteParens" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1107375429415">
    <property name="name" value="_Expression_RTransform_ActionSet" />
    <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_RightTransform" id="1107375490807">
      <property name="actionProviderId" value="Expression" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.EditorComponentDeclaration" id="1107383695987">
    <property name="name" value="_CodeBlockEndingStatement_Component" />
    <link role="conceptDeclaration" targetNodeId="8.1107383054539" />
    <node role="actionSetDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.CellActionSetDeclaration" id="1107385818494">
      <property name="name" value="ExpressionCellActions" />
      <link role="specializes" targetNodeId="1082130590765" />
      <node role="actionDeclaration" type="jetbrains.mps.bootstrap.editorLanguage.ActionModel_SubstituteNode" id="1107385840128">
        <property name="substituteHandlerId" value="CodeBlockEndingStatement_SetExpression" />
        <link role="substituteQueryBody" targetNodeId="1107385840129" />
        <node role="substituteQueryMethod" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1107385840130">
          <property name="name" value="substituteAcceptor_Query" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1107385840131">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1107385840132">
              <link role="classifier" targetNodeId="19.1113723509291" />
            </node>
          </node>
          <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1107385840133">
            <property name="name" value="object" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1107385840134">
              <link role="classifier" targetNodeId="18.1086856195743" />
            </node>
          </node>
          <node role="returnType" type="jetbrains.mps.baseLanguage.ClassType" id="1107385840135">
            <link role="classifier" targetNodeId="18.1086856195743" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1107385840129" />
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1107383781633">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_ModelAccess" id="1107384111588">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="modelAccessorId" value="Node_DefaultText" />
        <property name="fontStyle" value="BOLD_ITALIC" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1107384111589">
        <property name="drawBorder" value="false" />
        <property name="conditionId" value="ParentIsCodeBlockWhichReturnsAValue" />
        <link role="linkDeclaration" targetNodeId="8.1107383540437" />
        <link role="actionSet" targetNodeId="1107385818494" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1107384111590">
        <property name="text" value=";" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1107385143309">
    <link role="conceptDeclaration" targetNodeId="8.1107382435476" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1107385184644">
      <property name="drawBorder" value="false" />
      <link role="editorComponent" targetNodeId="1107383695987" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1107385186546">
    <link role="conceptDeclaration" targetNodeId="8.1107382563459" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1107385191192">
      <property name="drawBorder" value="false" />
      <link role="editorComponent" targetNodeId="1107383695987" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1107385201823">
    <link role="conceptDeclaration" targetNodeId="8.1107382924189" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1107385205424">
      <property name="drawBorder" value="false" />
      <link role="editorComponent" targetNodeId="1107383695987" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1107385225328">
    <link role="conceptDeclaration" targetNodeId="8.1107382634457" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1107385229693">
      <property name="drawBorder" value="false" />
      <link role="editorComponent" targetNodeId="1107383695987" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1107460489241">
    <link role="conceptDeclaration" targetNodeId="8.1107460423361" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1107460527820">
      <property name="editable" value="true" />
      <property name="textFgColor" value="DARK_BLUE" />
      <property name="text" value="var" />
      <property name="drawBorder" value="false" />
      <property name="selectable" value="true" />
      <link role="keyMap" targetNodeId="1119265790350" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1107796847143">
    <property name="name" value="ClassConcept_Editor" />
    <link role="conceptDeclaration" targetNodeId="8.1107796713796" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1107796852505">
      <property name="drawBorder" value="false" />
      <property name="name" value="classBox" />
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1107796852507">
        <property name="drawBorder" value="false" />
        <property name="name" value="headerRow" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1107796852517">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="interface" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1107796852518">
          <property name="writable" value="true" />
          <property name="defaultText" value="&lt;no name&gt;" />
          <property name="defaultValue" value="&lt;no name&gt;" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="true" />
          <link role="propertyDeclaration" targetNodeId="9.1078489098626" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1109281106345">
          <property name="drawBorder" value="false" />
          <link role="editorComponent" targetNodeId="1109280020740" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1107796852519">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="extends" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1107797338699">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="true" />
          <link role="linkDeclaration" targetNodeId="8.1107797138135" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1107797338700">
            <property name="editable" value="true" />
            <property name="drawBorder" value="false" />
            <property name="nullText" value="&lt;none&gt;" />
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1107796852521">
          <property name="text" value="{" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1107796852512">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1107796852513">
        <property name="drawBorder" value="false" />
        <property name="name" value="methodsArea" />
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1107796852538">
          <property name="text" value="    " />
          <property name="drawBorder" value="false" />
          <property name="name" value="methodsIndentCell" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1107796852539">
          <property name="drawBorder" value="false" />
          <property name="name" value="methodsList" />
          <property name="vertical" value="true" />
          <property name="selectable" value="false" />
          <link role="linkDeclaration" targetNodeId="8.1107880067339" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1107796852540">
            <property name="text" value=" &lt;&lt; methods &gt;&gt;" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="true" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1107796852514">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1107796852516">
        <property name="text" value="}" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1107797431326">
    <link role="conceptDeclaration" targetNodeId="8.1107796918309" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1109204541098">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <link role="keyMap" targetNodeId="1119265790350" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1109204552943">
        <property name="drawBorder" value="false" />
        <property name="nullText" value="&lt;no interface&gt;" />
        <link role="linkDeclaration" targetNodeId="8.1107796943716" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1109204552944">
          <link role="conceptDeclaration" targetNodeId="8.1107796713796" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1109204552945">
            <property name="defaultText" value="&lt;no name&gt;" />
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <link role="propertyDeclaration" targetNodeId="8.1107796744532" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1109204552946">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1109203171524" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1109197034694">
    <link role="conceptDeclaration" targetNodeId="8.1106250402230" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Error" id="1109197079664">
      <property name="text" value="&lt;choose feature constructor&gt;" />
      <property name="drawBorder" value="false" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.EditorComponentDeclaration" id="1109203171524">
    <property name="name" value="_ClassifierType_Parameters_Component" />
    <link role="conceptDeclaration" targetNodeId="8.1107535904670" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Alternation" id="1109203429356">
      <property name="alternationConditionAspectMethodId" value="ClassifierType_HasParameters" />
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1109203429358">
        <property name="editable" value="true" />
        <property name="drawBorder" value="false" />
        <link role="keyMap" targetNodeId="1109203345916" />
      </node>
      <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1109203570452">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1109203624719">
          <property name="text" value="&lt;" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1109203624720">
          <property name="separatorText" value="," />
          <property name="drawBorder" value="false" />
          <property name="vertical" value="false" />
          <link role="linkDeclaration" targetNodeId="8.1109201940907" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1109203624721">
          <property name="text" value="&gt;" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapDeclaration" id="1109203345916">
    <property name="name" value="_ClassifierType_AddTypeParameter_KeyMap" />
    <node role="entry" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapEntry" id="1109203392464">
      <property name="keycode" value="&lt;" />
      <property name="actionProviderId" value="ClassifierType_AddParameter" />
    </node>
    <node role="entry" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapEntry" id="1109283149863">
      <property name="modifiers" value="ctrl" />
      <property name="keycode" value="VK_SPACE" />
      <property name="actionProviderId" value="ClassifierType_AddParameter" />
    </node>
    <node role="entry" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapEntry" id="1109283150286">
      <property name="keycode" value="VK_INSERT" />
      <property name="actionProviderId" value="ClassifierType_AddParameter" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.EditorComponentDeclaration" id="1109280020740">
    <property name="name" value="_GenericDeclaration_TypeVariables_Component" />
    <link role="conceptDeclaration" targetNodeId="8.1109279851642" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Alternation" id="1109280119303">
      <property name="alternationConditionAspectMethodId" value="GenericDeclaration_HasTypeVariables" />
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1109280205087">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1109280296588">
          <property name="text" value="&lt;" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1109280296589">
          <property name="separatorText" value="," />
          <property name="drawBorder" value="false" />
          <property name="vertical" value="false" />
          <link role="linkDeclaration" targetNodeId="8.1109279881614" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1109280296590">
          <property name="text" value="&gt;" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="cellLayout" type="jetbrains.mps.bootstrap.editorLanguage.CellLayout_Horizontal" id="1109280296591" />
      </node>
      <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1109280404592">
        <property name="editable" value="true" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="keyMap" targetNodeId="1109280904140" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapDeclaration" id="1109280904140">
    <property name="name" value="_GenericDeclaration_AddTypeVariable_KeyMap" />
    <node role="entry" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapEntry" id="1109280932969">
      <property name="keycode" value="&lt;" />
      <property name="actionProviderId" value="GenericDeclaration_AddTypeVariable" />
    </node>
    <node role="entry" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapEntry" id="1109281680642">
      <property name="modifiers" value="ctrl" />
      <property name="keycode" value="VK_SPACE" />
      <property name="actionProviderId" value="GenericDeclaration_AddTypeVariable" />
    </node>
    <node role="entry" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapEntry" id="1109281782877">
      <property name="keycode" value="VK_INSERT" />
      <property name="actionProviderId" value="GenericDeclaration_AddTypeVariable" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1109281376921">
    <link role="conceptDeclaration" targetNodeId="8.1109279763828" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1109281432641">
      <property name="defaultText" value="&lt;no name&gt;" />
      <property name="drawBorder" value="false" />
      <link role="propertyDeclaration" targetNodeId="8.1109279783704" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1109283666334">
    <link role="conceptDeclaration" targetNodeId="8.1109283449304" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1109283721555">
      <property name="drawBorder" value="false" />
      <property name="nullText" value="&lt;no type variable&gt;" />
      <link role="linkDeclaration" targetNodeId="8.1109283546497" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1109283693882">
        <link role="conceptDeclaration" targetNodeId="8.1109279763828" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1109283721556">
          <property name="defaultText" value="&lt;no name&gt;" />
          <property name="drawBorder" value="false" />
          <property name="readOnly" value="true" />
          <link role="propertyDeclaration" targetNodeId="8.1109279783704" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapDeclaration" id="1109285887125">
    <property name="name" value="_ConstructorCall_AddTypeParameter_KeyMap" />
    <node role="entry" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapEntry" id="1109285920422">
      <property name="keycode" value="&lt;" />
      <property name="actionProviderId" value="ConstructorCall_AddTypeParameter" />
    </node>
    <node role="entry" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapEntry" id="1109285920892">
      <property name="modifiers" value="ctrl" />
      <property name="keycode" value="VK_SPACE" />
      <property name="actionProviderId" value="ConstructorCall_AddTypeParameter" />
    </node>
    <node role="entry" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapEntry" id="1109285921331">
      <property name="keycode" value="VK_INSERT" />
      <property name="actionProviderId" value="ConstructorCall_AddTypeParameter" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1112992952159">
    <link role="conceptDeclaration" targetNodeId="8.1111509017652" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1113006710627">
      <property name="textFgColor" value="blue" />
      <property name="defaultText" value="?.?" />
      <property name="drawBorder" value="false" />
      <link role="propertyDeclaration" targetNodeId="8.1113006610751" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1113208357709">
    <link role="conceptDeclaration" targetNodeId="8.1070534760951" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1113208366980">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <link role="keyMap" targetNodeId="1119265790350" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1113208455587">
        <property name="drawBorder" value="false" />
        <link role="linkDeclaration" targetNodeId="8.1070534760952" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1113208455588">
        <property name="text" value="[]" />
        <property name="drawBorder" value="false" />
        <link role="keyMap" targetNodeId="1119269292522" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1116615249130">
    <link role="conceptDeclaration" targetNodeId="8.1116615150612" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1116615268507">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1116615277650">
        <property name="drawBorder" value="false" />
        <property name="nullText" value="&lt;no classifier&gt;" />
        <link role="linkDeclaration" targetNodeId="8.1116615189566" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1116615277651">
          <link role="conceptDeclaration" targetNodeId="8.1107461130800" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1116615309371">
            <property name="textFgColor" value="DARK_BLUE" />
            <property name="defaultText" value="&lt;no name&gt;" />
            <property name="fontStyle" value="ITALIC" />
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <link role="propertyDeclaration" targetNodeId="9.1078489098626" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1116615336905">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value=".class" />
        <property name="fontStyle" value="ITALIC" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapDeclaration" id="1119265790350">
    <property name="name" value="_TypeKeyMap" />
    <node role="entry" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapEntry" id="1119265795851">
      <property name="keycode" value="[" />
      <property name="actionProviderId" value="TransformToArrayType" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapDeclaration" id="1119269292522">
    <property name="name" value="_ArrayTypeBracketsActions" />
    <node role="entry" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapEntry" id="1119269308210">
      <property name="keycode" value="VK_DELETE" />
      <property name="actionProviderId" value="DeleteArrayType" />
    </node>
    <node role="entry" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapEntry" id="1119270874006">
      <property name="keycode" value="VK_BACK_SPACE" />
      <property name="actionProviderId" value="DeleteArrayType" />
    </node>
  </node>
</model>


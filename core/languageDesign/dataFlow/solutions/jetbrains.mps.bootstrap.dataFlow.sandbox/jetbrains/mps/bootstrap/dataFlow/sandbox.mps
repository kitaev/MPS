<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.bootstrap.dataFlow.sandbox">
  <persistence version="1" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.bootstrap.dataFlow" />
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="1" />
  </language>
  <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="0" />
  <maxImportIndex value="3" />
  <import index="1" modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  <import index="2" modelUID="java.util@java_stub" version="-1" />
  <import index="3" modelUID="java.lang@java_stub" version="-1" />
  <node type="jetbrains.mps.bootstrap.dataFlow.structure.DataFlowBuilderDeclaration" id="1206443195068">
    <link role="conceptDeclaration" targetNodeId="1.1068499141036" resolveInfo="BaseMethodCall" />
    <node role="builderBlock" type="jetbrains.mps.bootstrap.dataFlow.structure.BuilderBlock" id="1206443195069">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206443195070">
        <node role="statement" type="jetbrains.mps.bootstrap.dataFlow.structure.EmitReadStatement" id="1206444249958">
          <node role="variable" type="jetbrains.mps.bootstrap.dataFlow.structure.NodeParameter" id="1206444250913" />
        </node>
        <node role="statement" type="jetbrains.mps.bootstrap.dataFlow.structure.EmitReadStatement" id="1206444251884">
          <node role="variable" type="jetbrains.mps.bootstrap.dataFlow.structure.NodeParameter" id="1206444252745" />
        </node>
        <node role="statement" type="jetbrains.mps.bootstrap.dataFlow.structure.EmitReadStatement" id="1206444253653">
          <node role="variable" type="jetbrains.mps.bootstrap.dataFlow.structure.NodeParameter" id="1206444254515" />
        </node>
        <node role="statement" type="jetbrains.mps.bootstrap.dataFlow.structure.EmitWriteStatement" id="1206444594794">
          <node role="variable" type="jetbrains.mps.bootstrap.dataFlow.structure.NodeParameter" id="1206444596015" />
        </node>
        <node role="statement" type="jetbrains.mps.bootstrap.dataFlow.structure.EmitJumpStatement" id="1206445429873">
          <node role="jumpTo" type="jetbrains.mps.bootstrap.dataFlow.structure.LabelPosition" id="1207062897436">
            <link role="label" targetNodeId="1207062593569" resolveInfo="abc" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.bootstrap.dataFlow.structure.EmitLabelStatement" id="1207062593569">
          <property name="name" value="abc" />
        </node>
        <node role="statement" type="jetbrains.mps.bootstrap.dataFlow.structure.EmitIfJumpStatement" id="1206445590393">
          <node role="jumpTo" type="jetbrains.mps.bootstrap.dataFlow.structure.AfterPosition" id="1206445591770">
            <node role="relativeTo" type="jetbrains.mps.bootstrap.dataFlow.structure.NodeParameter" id="1206445594303" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1206443792481">
    <property name="name" value="ABC" />
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1207320884179">
      <property name="name" value="abcdef" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1207320884180" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1207320884181" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207320884182">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207320887277">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207320887278">
            <property name="name" value="i" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1207320887279" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1207320894210">
              <link role="baseMethodDeclaration" targetNodeId="1207320894204" resolveInfo="azd" />
              <link role="classConcept" targetNodeId="1206443792481" resolveInfo="ABC" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1207320894204">
      <property name="name" value="azd" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1207320894206" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207320894207">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207320894208">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1207320894209">
            <property name="value" value="230" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1206464422842">
      <property name="name" value="abc" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1207223822176" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1206464422844" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206464422845">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207219760109">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207219760110">
            <property name="name" value="s" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207219760111">
              <link role="classifier" targetNodeId="3.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207309893331">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207309893332" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207309893333">
                <link role="baseMethodDeclaration" targetNodeId="1207309893322" resolveInfo="testExtractMethod" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207305638178">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207305638179">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207305638180" />
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207305638181">
              <link role="baseMethodDeclaration" targetNodeId="1207305638165" resolveInfo="testExtractMethod" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.TryCatchStatement" id="1207219775396">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207219775397">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207223817207">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1207223829345">
                <property name="value" value="3" />
              </node>
            </node>
          </node>
          <node role="catchClause" type="jetbrains.mps.baseLanguage.structure.CatchClause" id="1207219775399">
            <node role="throwable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207219775400">
              <property name="name" value="t" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207219777684">
                <link role="classifier" targetNodeId="3.~Throwable" resolveInfo="Throwable" />
              </node>
            </node>
            <node role="catchBody" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207219775402">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207224209622">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207224209623">
                  <link role="variableDeclaration" targetNodeId="1207219760110" resolveInfo="s" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207224214141">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1207224214846">
            <property name="value" value="239" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1207309893322">
      <property name="name" value="testExtractMethod" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207309893323">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207309893329">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1207309893334" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207309893324">
        <link role="classifier" targetNodeId="3.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1207305638165">
      <property name="name" value="abcdef" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207305638166">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207305638168">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207305638169">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207305638170">
              <link role="baseMethodDeclaration" targetNodeId="1207226408871" resolveInfo="test" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1207305638171">
                <property name="value" value="223" />
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207305638172" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207305638173">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207305638174">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207305638175" />
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207305638176">
              <link role="baseMethodDeclaration" targetNodeId="1207226408871" resolveInfo="test" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1207305638177">
                <property name="value" value="231" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1207305638167" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1207300388224">
      <property name="name" value="cond" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1207300389854" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1207300388226" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207300388227">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207300391542">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1207300393560">
            <property name="value" value="false" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1207226408871">
      <property name="name" value="test" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1207226419331" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1207226408873" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207226408874">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207298132237">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207304245327">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207304245328">
              <link role="baseMethodDeclaration" targetNodeId="1207300388224" resolveInfo="cond" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207304245329" />
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207298132239">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207304246346">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207304246347">
                <property name="name" value="i" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1207304246348" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207308287936">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207308287937" />
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207308287938">
                    <link role="baseMethodDeclaration" targetNodeId="1207308287927" resolveInfo="testExtractMethod" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207304249743">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207304249744">
                <property name="name" value="j" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1207304249745" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1207324203883">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1207324205042">
                    <link role="variableDeclaration" targetNodeId="1207231044454" resolveInfo="p" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1207304251247">
                    <property name="value" value="40" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207304253702">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1207304254126">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1207304255989">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207304256617">
                    <link role="variableDeclaration" targetNodeId="1207304249744" resolveInfo="j" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207304255035">
                    <link role="variableDeclaration" targetNodeId="1207304246347" resolveInfo="i" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1207304253703">
                  <link role="variableDeclaration" targetNodeId="1207231044454" resolveInfo="p" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207304859605">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1207304859606">
            <link role="variableDeclaration" targetNodeId="1207231044454" resolveInfo="p" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1207231044454">
        <property name="name" value="p" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1207231044455" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1207308287927">
      <property name="name" value="testExtractMethod" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207308287928">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207308287930">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207308287931">
            <property name="name" value="i" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1207308287932" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207308295636">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207308295637" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207308295638">
                <link role="baseMethodDeclaration" targetNodeId="1207308295627" resolveInfo="testExtractMethod" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207308287934">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207308287935">
            <link role="variableDeclaration" targetNodeId="1207308287931" resolveInfo="i" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1207308287929" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1207308295627">
      <property name="name" value="testExtractMethod" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207308295628">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207308295630">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207308295631">
            <property name="name" value="i" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1207308295632" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1207308295633">
              <property name="value" value="239" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207308295634">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207308295635">
            <link role="variableDeclaration" targetNodeId="1207308295631" resolveInfo="i" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1207308295629" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1207235927016">
      <property name="name" value="newMethod" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1207235927017" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207235927018">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207235927052">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1207300365695">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1207303581678">
              <link role="variableDeclaration" targetNodeId="1207235927036" resolveInfo="p" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1207235927059">
              <link role="variableDeclaration" targetNodeId="1207235927038" resolveInfo="i" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1207235927019" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1207235927036">
        <property name="name" value="p" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1207235927037" />
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1207235927038">
        <property name="name" value="i" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1207235927039" />
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1206443792482" />
    <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207141396977">
      <link role="classifier" targetNodeId="1206443792481" resolveInfo="ABC" />
    </node>
  </node>
</model>


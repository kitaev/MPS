<?xml version="1.0" encoding="UTF-8"?>
<model namespace="jetbrains.mps.baseLanguage.resolve">
  <maxReferenceID value="0" />
  <language namespace="jetbrains.mps.baseLanguage" />
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1120132608419">
    <property name="name" value="New" />
    <node role="staticField" type="jetbrains.mps.baseLanguage.StaticFieldDeclaration" id="1120238865673">
      <property name="name" value="q" />
      <node role="type" type="jetbrains.mps.baseLanguage.ArrayType" id="1120238875988">
        <node role="componentType" type="jetbrains.mps.baseLanguage.BooleanType" id="1120238879678" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1120132621811">
      <property name="name" value="string" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1120132645940">
        <property name="name" value="x" />
        <node role="type" type="jetbrains.mps.baseLanguage.CharType" id="1120132649880" />
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1120136360785">
        <property name="name" value="y" />
        <node role="type" type="jetbrains.mps.baseLanguage.CharType" id="1120136365193" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1120132621985">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1120132705443">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1120132705476">
            <property name="name" value="s" />
            <node role="type" type="jetbrains.mps.baseLanguage.CharType" id="1120132705477" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.StringLiteral" id="1120132751214">
              <property name="value" value="e" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1120239144334">
          <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1120239144335">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1120239144336">
              <link role="variableDeclaration" targetNodeId="1120132645940" bad="false" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1120239144337">
              <link role="baseMethodDeclaration" targetNodeId="1120132621811" bad="false" />
              <node role="instance" type="jetbrains.mps.baseLanguage.ThisExpression" id="1120239144338" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1120239144339">
                <link role="variableDeclaration" targetNodeId="1120132645940" bad="false" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1120132760871">
          <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1120132769125">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1120132766857">
              <link role="variableDeclaration" targetNodeId="1120132705476" bad="false" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1120132775018">
              <link role="variableDeclaration" targetNodeId="1120132645940" bad="false" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.StringType" id="1120132631361" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1120238903134">
      <property name="name" value="string" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1120238903136">
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1120238937391">
          <node role="expression" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1120239004622">
            <link role="variableDeclaration" targetNodeId="1120238865673" bad="false" />
            <node role="classType" type="jetbrains.mps.baseLanguage.ClassType" id="1120239004623">
              <link role="classifier" targetNodeId="1120132608419" bad="false" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1120569707985">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1120569707986">
            <property name="name" value="new2" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1120569707987">
              <link role="classifier" targetNodeId="1120132915670" bad="false" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NewExpression" id="1120569721739">
              <node role="constructorCall" type="jetbrains.mps.baseLanguage.ConstructorCall" id="1120569721740">
                <link role="baseMethodDeclaration" targetNodeId="1120569738663" bad="false" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.BooleanType" id="1120238910059" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1120132789160">
      <property name="name" value="foo" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1120132789162">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1120132834698">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1120132834699">
            <property name="name" value="y" />
            <node role="type" type="jetbrains.mps.baseLanguage.CharType" id="1120132834700" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.StringLiteral" id="1120132856736">
              <property name="value" value="f" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1120132870722">
          <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1120132882680">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1120132879240">
              <link role="variableDeclaration" targetNodeId="1120132834699" bad="false" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1120132888791">
              <link role="baseMethodDeclaration" targetNodeId="1120132621811" bad="false" />
              <node role="instance" type="jetbrains.mps.baseLanguage.ThisExpression" id="1120132888792" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1120132906965">
                <link role="variableDeclaration" targetNodeId="1120132827852" bad="false" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.StringType" id="1120132795631" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1120132827852">
        <property name="name" value="x" />
        <node role="type" type="jetbrains.mps.baseLanguage.CharType" id="1120132827853" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1120151576652">
      <property name="name" value="foo" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1120151576672">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1120151576673">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1120151576674">
            <property name="name" value="y" />
            <node role="type" type="jetbrains.mps.baseLanguage.CharType" id="1120151576675" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.StringLiteral" id="1120151576676">
              <property name="value" value="f" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1120151576677">
          <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1120151576678">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1120151576679">
              <link role="variableDeclaration" targetNodeId="1120151576674" bad="false" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1120151576680">
              <link role="baseMethodDeclaration" targetNodeId="1120132621811" bad="false" />
              <node role="instance" type="jetbrains.mps.baseLanguage.ThisExpression" id="1120151576681" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1120151576682">
                <link role="variableDeclaration" targetNodeId="1120151576670" bad="false" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.StringType" id="1120151576669" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1120151576670">
        <property name="name" value="x" />
        <node role="type" type="jetbrains.mps.baseLanguage.CharType" id="1120151576671" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1120132915670">
    <property name="name" value="New2" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.ConstructorDeclaration" id="1120569738663">
      <node role="returnType" type="jetbrains.mps.baseLanguage.Type" id="1120569848501" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1120569738664" />
    </node>
    <node role="staticField" type="jetbrains.mps.baseLanguage.StaticFieldDeclaration" id="1120239044759">
      <property name="name" value="q" />
      <node role="type" type="jetbrains.mps.baseLanguage.ArrayType" id="1120239049011">
        <node role="componentType" type="jetbrains.mps.baseLanguage.BooleanType" id="1120239052232" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.FieldDeclaration" id="1120239030877">
      <property name="name" value="q" />
      <node role="type" type="jetbrains.mps.baseLanguage.ArrayType" id="1120239035067">
        <node role="componentType" type="jetbrains.mps.baseLanguage.BooleanType" id="1120239038507" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1120132925280">
      <property name="name" value="string" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1120132925282">
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1120132968212">
          <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1120132975248">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1120132972668">
              <link role="variableDeclaration" targetNodeId="1120132945972" bad="false" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1120132976812">
              <link role="variableDeclaration" targetNodeId="1120132950896" bad="false" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1120568813650">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1120568813651">
            <property name="name" value="zed" />
            <node role="type" type="jetbrains.mps.baseLanguage.BooleanType" id="1120568813652" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1120640300186">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1120640300187">
            <property name="name" value="obj" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1120640300188">
              <link role="classifier" targetNodeId="1120132915670" bad="false" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NewExpression" id="1120640315380">
              <node role="constructorCall" type="jetbrains.mps.baseLanguage.ConstructorCall" id="1120640315381">
                <link role="baseMethodDeclaration" targetNodeId="1120569738663" bad="false" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1120640354779">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1120640354780">
            <property name="name" value="boo" />
            <node role="type" type="jetbrains.mps.baseLanguage.BooleanType" id="1120640354781" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.FieldReference" id="1120640375866">
              <link role="variableDeclaration" targetNodeId="1120239030877" bad="false" />
              <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1120640365612">
                <link role="variableDeclaration" targetNodeId="1120640300187" bad="false" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1120560628794">
          <node role="expression" type="jetbrains.mps.baseLanguage.NotExpression" id="1120560628795">
            <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1120569389192">
              <link role="variableDeclaration" targetNodeId="1120132945972" bad="false" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1120239844864">
          <node role="expression" type="jetbrains.mps.baseLanguage.FieldReference" id="1120239844865">
            <link role="variableDeclaration" targetNodeId="1120239030877" bad="false" />
            <node role="instance" type="jetbrains.mps.baseLanguage.ThisExpression" id="1120239844866" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.StringType" id="1120132927939" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1120132945972">
        <property name="name" value="x" />
        <node role="type" type="jetbrains.mps.baseLanguage.CharType" id="1120132945973" />
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1120132950896">
        <property name="name" value="y" />
        <node role="type" type="jetbrains.mps.baseLanguage.CharType" id="1120132952320" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1120132995095">
      <property name="name" value="string" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1120132995097">
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1120133012352">
          <node role="expression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1120133018104">
            <property name="value" value="wow" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1120237327496">
          <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1120237327497">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1120237327498">
              <link role="variableDeclaration" targetNodeId="1120133007333" bad="false" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1120237327499">
              <link role="baseMethodDeclaration" targetNodeId="1120132925280" bad="false" />
              <node role="instance" type="jetbrains.mps.baseLanguage.ThisExpression" id="1120237327500" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1120237327501">
                <link role="variableDeclaration" targetNodeId="1120133007333" bad="false" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.StringType" id="1120133000004" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1120133007333">
        <property name="name" value="k" />
        <node role="type" type="jetbrains.mps.baseLanguage.CharType" id="1120133007334" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1120650827325">
      <property name="name" value="method" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1120650827374">
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1120652423840">
          <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1120652423841">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1120652423842">
              <link role="variableDeclaration" targetNodeId="1120146414229" bad="true" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1120652423843">
              <link role="baseMethodDeclaration" targetNodeId="1120132925280" bad="false" />
              <node role="instance" type="jetbrains.mps.baseLanguage.ThisExpression" id="1120652423844" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1120652423860">
                <link role="variableDeclaration" targetNodeId="1120146414229" bad="true" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.IntegerType" id="1120650835469" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1120650843204">
        <property name="name" value="k" />
        <node role="type" type="jetbrains.mps.baseLanguage.IntegerType" id="1120650843205" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1120146414211">
      <property name="name" value="foo" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1120146414231">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1120146414232">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1120146414233">
            <property name="name" value="y" />
            <node role="type" type="jetbrains.mps.baseLanguage.CharType" id="1120146414234" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.StringLiteral" id="1120146414235">
              <property name="value" value="f" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1120236168194">
          <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1120236168195">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1120236168196">
              <link role="variableDeclaration" targetNodeId="1120146414229" bad="false" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1120236168197">
              <link role="baseMethodDeclaration" targetNodeId="1120132925280" bad="false" />
              <node role="instance" type="jetbrains.mps.baseLanguage.ThisExpression" id="1120236168198" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1120236168199">
                <link role="variableDeclaration" targetNodeId="1120146414229" bad="false" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1120146414236">
          <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1120146414237">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1120146414238">
              <link role="variableDeclaration" targetNodeId="1120146414233" bad="false" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1120146414239">
              <link role="baseMethodDeclaration" targetNodeId="1120132925280" bad="false" />
              <node role="instance" type="jetbrains.mps.baseLanguage.ThisExpression" id="1120146414240" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1120146414241">
                <link role="variableDeclaration" targetNodeId="1120146414229" bad="false" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1120640425430">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1120640425431">
            <property name="name" value="obj" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1120640425432">
              <link role="classifier" targetNodeId="1120132915670" bad="false" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NewExpression" id="1120640425433">
              <node role="constructorCall" type="jetbrains.mps.baseLanguage.ConstructorCall" id="1120640425434">
                <link role="baseMethodDeclaration" targetNodeId="1120569738663" bad="false" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1120640397245">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1120640397246">
            <property name="name" value="boo" />
            <node role="type" type="jetbrains.mps.baseLanguage.BooleanType" id="1120640397247" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.FieldReference" id="1120640397248">
              <link role="variableDeclaration" targetNodeId="1120239030877" bad="false" />
              <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1120640397249">
                <link role="variableDeclaration" targetNodeId="1120640425431" bad="false" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1120569398083">
          <node role="expression" type="jetbrains.mps.baseLanguage.NotExpression" id="1120569398084">
            <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1120569398085">
              <link role="variableDeclaration" targetNodeId="1120146414229" bad="false" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.StringType" id="1120146414228" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1120146414229">
        <property name="name" value="x" />
        <node role="type" type="jetbrains.mps.baseLanguage.CharType" id="1120146414230" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1120149654800">
    <property name="name" value="New3" />
    <node role="field" type="jetbrains.mps.baseLanguage.FieldDeclaration" id="1120239783330">
      <property name="name" value="q" />
      <node role="type" type="jetbrains.mps.baseLanguage.ArrayType" id="1120239785723">
        <node role="componentType" type="jetbrains.mps.baseLanguage.BooleanType" id="1120239788085" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1120149686817">
      <property name="name" value="foo" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1120149686868">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1120149686869">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1120149686870">
            <property name="name" value="y" />
            <node role="type" type="jetbrains.mps.baseLanguage.CharType" id="1120149686871" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.StringLiteral" id="1120149686872">
              <property name="value" value="f" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1120149686873">
          <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1120149686874">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1120149686875">
              <link role="variableDeclaration" targetNodeId="1120149686870" bad="false" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1120149686876">
              <link role="baseMethodDeclaration" targetNodeId="1120132621811" bad="false" />
              <node role="instance" type="jetbrains.mps.baseLanguage.ThisExpression" id="1120149686877" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1120149686878">
                <link role="variableDeclaration" targetNodeId="1120149686866" bad="false" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.StringType" id="1120149686865" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1120149686866">
        <property name="name" value="x" />
        <node role="type" type="jetbrains.mps.baseLanguage.CharType" id="1120149686867" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1120239797836">
      <property name="name" value="kuu" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1120239797838">
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1120239812592">
          <node role="expression" type="jetbrains.mps.baseLanguage.FieldReference" id="1120239818110">
            <link role="variableDeclaration" targetNodeId="1120239783330" bad="false" />
            <node role="instance" type="jetbrains.mps.baseLanguage.ThisExpression" id="1120239818111" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1120570786234">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1120570786235">
            <property name="name" value="new2" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassType" id="1120570786236">
              <link role="classifier" targetNodeId="1120132915670" bad="false" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.NewExpression" id="1120570786237">
              <node role="constructorCall" type="jetbrains.mps.baseLanguage.ConstructorCall" id="1120570786238">
                <link role="baseMethodDeclaration" targetNodeId="1120569738663" bad="false" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.StringType" id="1120239803559" />
    </node>
  </node>
</model>


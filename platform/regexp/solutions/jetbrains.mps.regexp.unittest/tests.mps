<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:710bb5ca-133c-4e34-80eb-4be42af51339(tests)">
  <persistence version="4" />
  <refactoringHistory />
  <language namespace="daafa647-f1f7-4b0b-b096-69cd7c8408c0(jetbrains.mps.baseLanguage.regexp)" />
  <language namespace="f61473f9-130f-42f6-b98d-6c438812c2f6(jetbrains.mps.baseLanguage.unitTest)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <language namespace="443f4c36-fcf5-4eb6-9500-8d06ed259e3e(jetbrains.mps.baseLanguage.classifiers)" />
  <language namespace="ceab5195-25ea-4f22-9b92-103b95ca8c0c(jetbrains.mps.lang.core)" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590515(jetbrains.mps.baseLanguage.regexp.constraints)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590518(jetbrains.mps.baseLanguage.regexp.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902db(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590283(jetbrains.mps.lang.core.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902d2(jetbrains.mps.baseLanguage.unitTest.constraints)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902d5(jetbrains.mps.baseLanguage.unitTest.plugin)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902fb(jetbrains.mps.lang.smodel.constraints)" version="21" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590334(jetbrains.mps.baseLanguage.closures.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590373(jetbrains.mps.baseLanguage.classifiers.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959036e(jetbrains.mps.baseLanguage.classifiers.constraints)" version="7" />
  <maxImportIndex value="5" />
  <import index="2" modelUID="f:java_stub#java.util(java.util@java_stub)" version="-1" />
  <import index="3" modelUID="f:java_stub#java.util.regex(java.util.regex@java_stub)" version="-1" />
  <import index="4" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" />
  <import index="5" modelUID="f:java_stub#java.io(java.io@java_stub)" version="-1" />
  <visible index="2" modelUID="r:00000000-0000-4000-0000-011c89590519(jetbrains.mps.baseLanguage.regexp.jetbrains.mps.regexp.accessory)" />
  <node type="jetbrains.mps.baseLanguage.unitTest.structure.BTestCase" id="6799940379546332953">
    <property name="testCaseName" value="Statements" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6799940379546332954" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6799940379546332955">
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6799940379546332956" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6799940379546332957" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6799940379546332958" />
    </node>
    <node role="testMethodList" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethodList" id="6799940379546332959">
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="6799940379546332960">
        <property name="methodName" value="ifmatch" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6799940379546332961" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6799940379546332962" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6799940379546332963">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6799940379546332980">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6799940379546332981">
              <property name="name:3" value="input" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="6799940379546332982" />
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6799940379546332984">
                <property name="value:3" value="reader@gmail.com" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6799940379546332987">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6799940379546332988">
              <property name="name:3" value="matches" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6799940379546332989" />
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6799940379546332991">
                <property name="value:3" value="false" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.regexp.structure.MatchRegexpStatement:0" id="6799940379546332964">
            <node role="body:0" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6799940379546332965">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6799940379546332992">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6799940379546332994">
                  <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6799940379546332993">
                    <link role="variableDeclaration:3" targetNodeId="6799940379546332988" resolveInfo="matches" />
                  </node>
                  <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6799940379546332997">
                    <property name="value:3" value="true" />
                  </node>
                </node>
              </node>
            </node>
            <node role="expr:0" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6799940379546332985">
              <link role="variableDeclaration:3" targetNodeId="6799940379546332981" resolveInfo="input" />
            </node>
            <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression:0" id="6799940379546332976">
              <property name="caseInsensitive:0" value="false" />
              <property name="dotAll:0" value="false" />
              <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclarationReferenceRegexp:0" id="233706782641329819">
                <link role="regexp:0" targetNodeId="6799940379546332969" resolveInfo="EMail" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="6799940379546332999">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6799940379546333004">
              <link role="variableDeclaration:3" targetNodeId="6799940379546332988" resolveInfo="matches" />
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="6129327962763158480">
        <property name="methodName" value="iftilde" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6129327962763158481" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6129327962763158482" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6129327962763158483">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6129327962763158498">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6129327962763158499">
              <property name="name:3" value="result" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="6129327962763158500" />
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6129327962763158502">
                <property name="value:3" value="false" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.regexp.structure.FindMatchStatement:0" id="6129327962763158487">
            <node role="expr:0" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6129327962763158491">
              <property name="value:3" value="aaabcd" />
            </node>
            <node role="body:0" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6129327962763158489">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6129327962763158503">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6129327962763158505">
                  <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6129327962763158504">
                    <link role="variableDeclaration:3" targetNodeId="6129327962763158499" resolveInfo="result" />
                  </node>
                  <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="6129327962763158508">
                    <property name="value:3" value="true" />
                  </node>
                </node>
              </node>
            </node>
            <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression:0" id="6129327962763158494">
              <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp:0" id="6129327962763158496">
                <property name="text:0" value="ab" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="6129327962763158514">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6129327962763158516">
              <link role="variableDeclaration:3" targetNodeId="6129327962763158499" resolveInfo="result" />
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="633895403833555338">
        <property name="methodName" value="findall" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="633895403833555339" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="633895403833555340" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="633895403833555341">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="633895403833555344">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="633895403833555345">
              <property name="name:3" value="i" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="633895403833555346" />
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="633895403833555347">
                <property name="value:3" value="0" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.regexp.structure.ForEachMatchStatement:0" id="633895403833555348">
            <node role="expr:0" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="633895403833555349">
              <property name="value:3" value="abababab" />
            </node>
            <node role="body:0" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="633895403833555350">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="633895403833555351">
                <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="633895403833555352">
                  <property name="value:3" value="ab" />
                </node>
                <node role="actual" type="jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReference:0" id="633895403833555353">
                  <link role="match:0" targetNodeId="633895403833555358" resolveInfo="aa" />
                </node>
              </node>
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="633895403833555354">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.PostfixIncrementExpression:3" id="633895403833555355">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="633895403833555356">
                    <link role="variableDeclaration:3" targetNodeId="633895403833555345" resolveInfo="i" />
                  </node>
                </node>
              </node>
            </node>
            <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression:0" id="633895403833555357">
              <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp:0" id="633895403833555358">
                <property name="name:0" value="aa" />
                <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="633895403833555359">
                  <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="633895403833555360">
                    <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                  </node>
                  <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="633895403833555361">
                    <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="633895403833555363">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="633895403833555364">
              <property name="value:3" value="4" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="633895403833555365">
              <link role="variableDeclaration:3" targetNodeId="633895403833555345" resolveInfo="i" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.regexp.structure.Regexps:0" id="6799940379546332968">
    <property name="name:0" value="Regexps" />
    <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclaration:0" id="6799940379546332969">
      <property name="name:0" value="EMail" />
      <property name="description:0" value="email regexp" />
      <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="6799940379546350580">
        <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="6799940379546350583">
          <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp:0" id="6799940379546350586">
            <property name="text:0" value="@" />
          </node>
          <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp:0" id="6799940379546914498">
            <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="6799940379547300497">
              <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
            </node>
          </node>
        </node>
        <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="6799940379546350600">
          <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="5533535376639120957">
            <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
          </node>
          <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.StarRegexp:0" id="6799940379547199073">
            <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.ParensRegexp:0" id="6799940379547199074">
              <node role="expr:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="6799940379547199075">
                <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.DotRegexp:0" id="5533535376639120959" />
                <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp:0" id="6799940379547199077">
                  <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="5533535376639120958">
                    <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclaration:0" id="5533535376639120949">
      <property name="name:0" value="esc_Brackets" />
      <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp:0" id="1353467374625726864">
        <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp:0" id="1353467374625726865">
          <property name="name:0" value="as" />
          <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.OrRegexp:0" id="1353467374625726866">
            <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="1353467374625726867">
              <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="1353467374625726868">
                <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp:0" id="1353467374625726869">
                  <property name="text:0" value="]" />
                </node>
                <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp:0" id="1353467374625726870">
                  <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="1353467374625726871">
                    <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                  </node>
                </node>
              </node>
              <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp:0" id="1353467374625726872">
                <property name="text:0" value="[" />
              </node>
            </node>
            <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.OrRegexp:0" id="1353467374625726873">
              <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="1353467374625726874">
                <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp:0" id="1353467374625726875">
                  <property name="text:0" value="(" />
                </node>
                <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="1353467374625726876">
                  <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp:0" id="1353467374625726877">
                    <property name="text:0" value=")" />
                  </node>
                  <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp:0" id="1353467374625726878">
                    <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="1353467374625726879">
                      <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="1353467374625726880">
                <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="1353467374625726881">
                  <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp:0" id="1353467374625726882">
                    <property name="text:0" value="}" />
                  </node>
                  <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp:0" id="1353467374625726883">
                    <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="1353467374625726884">
                      <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                    </node>
                  </node>
                </node>
                <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp:0" id="1353467374625726885">
                  <property name="text:0" value="{" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclaration:0" id="1353467374624831077">
      <property name="name:0" value="ssdssds" />
      <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="1353467374625020297">
        <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp:0" id="1353467374624831083">
          <property name="text:0" value="(asdadsasd)" />
        </node>
        <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="1353467374625824275">
          <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="1353467374625909705">
            <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp:0" id="1353467374625909708">
              <property name="text:0" value="$" />
            </node>
            <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.UnicodeCharacterRegexp:0" id="1353467374625824278">
              <property name="code:0" value="0022" />
            </node>
          </node>
          <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="1353467374626009226">
            <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.FromNToMTimesRegexp:0" id="1353467374625213924">
              <property name="n:0" value="1" />
              <property name="m:0" value="4" />
              <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="1353467374625213925">
                <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="1353467374625213926">
                  <link role="symbolClass:0" targetNodeId="2v.1174554696286" resolveInfo="\D" />
                </node>
                <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="1353467374625213927">
                  <link role="symbolClass:0" targetNodeId="2v.1174554752025" resolveInfo="\W" />
                </node>
              </node>
            </node>
            <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="1353467374626825854">
              <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="1353467374626009229">
                <link role="symbolClass:0" targetNodeId="2v.3050481019132403217" resolveInfo="\\" />
              </node>
              <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.LineEndRegexp:0" id="1353467374626825859" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclaration:0" id="3551998361336998501">
      <property name="name:0" value="asas" />
      <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.NTimesRegexp:0" id="3551998361337647042">
        <property name="n:0" value="1" />
        <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PositiveSymbolClassRegexp:0" id="3551998361337647043">
          <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassSymbolClassPart:0" id="3551998361337647044">
            <link role="declaration:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
          </node>
          <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.IntervalSymbolClassPart:0" id="3551998361337647045">
            <property name="start:0" value="0" />
            <property name="end:0" value="9" />
          </node>
          <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.IntersectionSymbolClassPart:0" id="3551998361337647046">
            <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.IntervalSymbolClassPart:0" id="3551998361337647047">
              <property name="start:0" value="a" />
              <property name="end:0" value="z" />
            </node>
            <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassSymbolClassPart:0" id="3551998361337647048">
              <link role="declaration:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
            </node>
          </node>
          <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.CharacterSymbolClassPart:0" id="3551998361337647049">
            <property name="character:0" value="(" />
          </node>
          <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.CharacterSymbolClassPart:0" id="3551998361337647050">
            <property name="character:0" value=")" />
          </node>
          <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.CharacterSymbolClassPart:0" id="3551998361337647051">
            <property name="character:0" value="[" />
          </node>
          <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.CharacterSymbolClassPart:0" id="3551998361337647052">
            <property name="character:0" value="]" />
          </node>
        </node>
      </node>
    </node>
    <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclaration:0" id="8786899561264886888">
      <property name="name:0" value="test2" />
      <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8786899561264886917">
        <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp:0" id="8786899561264886890">
          <property name="name:0" value="myname" />
          <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8786899561264886904">
            <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.StarRegexp:0" id="8786899561264886911">
              <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PositiveSymbolClassRegexp:0" id="8786899561264886912">
                <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassSymbolClassPart:0" id="8786899561264886913">
                  <link role="declaration:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                </node>
                <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassSymbolClassPart:0" id="8786899561264886914">
                  <link role="declaration:0" targetNodeId="2v.1174554674770" resolveInfo="\d" />
                </node>
                <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.CharacterSymbolClassPart:0" id="8786899561264886916">
                  <property name="character:0" value="_" />
                </node>
              </node>
            </node>
            <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8786899561264886908">
              <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
            </node>
          </node>
        </node>
        <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8786899561264886921">
          <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8786899561265006298">
            <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8786899561265107276">
              <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8786899561266078734">
                <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
              </node>
              <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReferenceRegexp:0" id="8786899561265006302">
                <link role="match:0" targetNodeId="8786899561264886890" resolveInfo="myname" />
              </node>
            </node>
            <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.StarRegexp:0" id="8786899561264886926">
              <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8786899561264886925">
                <link role="symbolClass:0" targetNodeId="2v.1174554710194" resolveInfo="\s" />
              </node>
            </node>
          </node>
          <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp:0" id="8786899561264886920">
            <property name="text:0" value=":" />
          </node>
        </node>
      </node>
    </node>
    <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclaration:0" id="4759120547781122944">
      <property name="name:0" value="qq" />
      <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="4759120547781167972">
        <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="4759120547781167978">
          <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="4759120547781170025">
            <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="4759120547781170084">
              <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="7048923897762185388">
                <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="7048923897762264286">
                  <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.PositiveSymbolClassRegexp:0" id="7048923897762413168">
                    <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassSymbolClassPart:0" id="7048923897762413169">
                      <link role="declaration:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                    </node>
                    <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.IntervalSymbolClassPart:0" id="7048923897762413170">
                      <property name="start:0" value="a" />
                      <property name="end:0" value="z" />
                    </node>
                    <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.IntersectionSymbolClassPart:0" id="7048923897762413171">
                      <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.CharacterSymbolClassPart:0" id="7048923897762413172">
                        <property name="character:0" value="a" />
                      </node>
                      <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.IntersectionSymbolClassPart:0" id="7048923897762413173">
                        <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.IntervalSymbolClassPart:0" id="7048923897762413174">
                          <property name="start:0" value="b" />
                          <property name="end:0" value="c" />
                        </node>
                        <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassSymbolClassPart:0" id="7048923897762413175">
                          <link role="declaration:0" targetNodeId="2v.3050481019132403217" resolveInfo="\\" />
                        </node>
                      </node>
                    </node>
                    <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassSymbolClassPart:0" id="7048923897762413176">
                      <link role="declaration:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                    </node>
                  </node>
                  <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.ParensRegexp:0" id="7048923897762264243">
                    <node role="expr:0" type="jetbrains.mps.baseLanguage.regexp.structure.LazyStarRegexp:0" id="7048923897762264215">
                      <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="7048923897762264216">
                        <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="7048923897762264217">
                  <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="7048923897762264227">
                    <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.QuestionRegexp:0" id="7048923897762264235">
                      <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="7048923897762264236">
                        <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                      </node>
                    </node>
                    <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.QuestionRegexp:0" id="7048923897762264225">
                      <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="7048923897762264226">
                        <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                      </node>
                    </node>
                  </node>
                  <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.FromNToMTimesRegexp:0" id="4759120547781170092">
                    <property name="m:0" value="2" />
                    <property name="n:0" value="1" />
                    <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="4759120547781170097">
                      <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="4759120547781170112">
                        <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="4759120547781170100">
                          <link role="symbolClass:0" targetNodeId="2v.1174554674770" resolveInfo="\d" />
                        </node>
                        <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.PositiveSymbolClassRegexp:0" id="4759120547781170115">
                          <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.IntervalSymbolClassPart:0" id="4759120547781170117">
                            <property name="start:0" value="a" />
                            <property name="end:0" value="z" />
                          </node>
                          <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassSymbolClassPart:0" id="4759120547781170120">
                            <link role="declaration:0" targetNodeId="2v.1174554674770" resolveInfo="\d" />
                          </node>
                          <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassSymbolClassPart:0" id="4759120547781170122">
                            <link role="declaration:0" targetNodeId="2v.3050481019132403217" resolveInfo="\\" />
                          </node>
                          <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassSymbolClassPart:0" id="4759120547781170125">
                            <link role="declaration:0" targetNodeId="2v.1174554710194" resolveInfo="\s" />
                          </node>
                        </node>
                      </node>
                      <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp:0" id="4759120547781295277">
                        <property name="text:0" value="aaa\u0000" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp:0" id="4759120547781170046">
                <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="4759120547781170033">
                  <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                </node>
              </node>
            </node>
            <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.PositiveSymbolClassRegexp:0" id="4759120547781167999">
              <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.CharacterSymbolClassPart:0" id="4759120547781168000">
                <property name="character:0" value="s" />
              </node>
            </node>
          </node>
          <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.LazyPlusRegexp:0" id="4759120547781167976">
            <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="4759120547781167975">
              <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
            </node>
          </node>
        </node>
        <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.LazyStarRegexp:0" id="4759120547781122985">
          <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.NegativeSymbolClassRegexp:0" id="4759120547781122986">
            <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.CharacterSymbolClassPart:0" id="4759120547781122987">
              <property name="character:0" value="e" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclaration:0" id="7048923897762884716">
      <property name="name:0" value="nameInBrackets" />
      <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="7048923897762884719">
        <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp:0" id="7048923897762884722">
          <property name="text:0" value="]" />
        </node>
        <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="7048923897762884723">
          <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp:0" id="7048923897762884726">
            <property name="name:0" value="nameInBr" />
            <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp:0" id="7048923897762884729">
              <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="7048923897762884728">
                <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
              </node>
            </node>
          </node>
          <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp:0" id="7048923897762884718">
            <property name="text:0" value="[" />
          </node>
        </node>
      </node>
    </node>
    <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclaration:0" id="902359922144295065">
      <property name="name:0" value="Identifier" />
      <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp:0" id="902359922144295067">
        <property name="name:0" value="identifier" />
        <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="902359922144295080">
          <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.PositiveSymbolClassRegexp:0" id="902359922144295070">
            <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.IntervalSymbolClassPart:0" id="902359922144295072">
              <property name="start:0" value="a" />
              <property name="end:0" value="z" />
            </node>
            <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.IntervalSymbolClassPart:0" id="902359922144295075">
              <property name="start:0" value="A" />
              <property name="end:0" value="Z" />
            </node>
            <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.CharacterSymbolClassPart:0" id="902359922144295079">
              <property name="character:0" value="_" />
            </node>
          </node>
          <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp:0" id="902359922144295094">
            <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PositiveSymbolClassRegexp:0" id="902359922144295083">
              <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.IntervalSymbolClassPart:0" id="902359922144295085">
                <property name="start:0" value="a" />
                <property name="end:0" value="z" />
              </node>
              <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.IntervalSymbolClassPart:0" id="902359922144295088">
                <property name="start:0" value="A" />
                <property name="end:0" value="Z" />
              </node>
              <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.CharacterSymbolClassPart:0" id="902359922144295090">
                <property name="character:0" value="_" />
              </node>
              <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.IntervalSymbolClassPart:0" id="902359922144295093">
                <property name="start:0" value="0" />
                <property name="end:0" value="9" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclaration:0" id="902359922144295098">
      <property name="name:0" value="ArrayType" />
      <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="902359922144295101">
        <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="902359922144295105">
          <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp:0" id="902359922144295108">
            <property name="text:0" value="]" />
          </node>
          <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="902359922144295109">
            <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp:0" id="902359922144295112">
              <property name="name:0" value="number" />
              <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp:0" id="902359922144295115">
                <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="902359922144295114">
                  <link role="symbolClass:0" targetNodeId="2v.1174554674770" resolveInfo="\d" />
                </node>
              </node>
            </node>
            <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp:0" id="902359922144295104">
              <property name="text:0" value="[" />
            </node>
          </node>
        </node>
        <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclarationReferenceRegexp:0" id="902359922144295100">
          <link role="regexp:0" targetNodeId="902359922144295065" resolveInfo="Identifier" />
        </node>
      </node>
    </node>
    <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclaration:0" id="902359922144295096">
      <property name="name:0" value="VarDeclaration" />
      <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="902359922144295119">
        <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp:0" id="902359922144295122">
          <property name="name:0" value="name" />
          <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp:0" id="902359922144295125">
            <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="902359922144295124">
              <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
            </node>
          </node>
        </node>
        <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclarationReferenceRegexp:0" id="902359922144295118">
          <link role="regexp:0" targetNodeId="902359922144295098" resolveInfo="ArrayType" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.unitTest.structure.BTestCase" id="1353467374625228509">
    <property name="testCaseName" value="Escaping" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="1353467374625228510" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="1353467374625228511">
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="1353467374625228512" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="1353467374625228513" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="1353467374625228514" />
    </node>
    <node role="testMethodList" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethodList" id="1353467374625228515">
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1353467374625228516">
        <property name="methodName" value="escapeInLiteral" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="1353467374625228517" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="1353467374625228518" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="1353467374625228519">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="1353467374625228614">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1353467374625228615">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="1353467374625228616">
                <property name="value:3" value="[asdsa]" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.regexp.structure.MatchRegexpOperation:0" id="1353467374625228617">
                <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression:0" id="1353467374625228618">
                  <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclarationReferenceRegexp:0" id="1353467374625228619">
                    <link role="regexp:0" targetNodeId="5533535376639120949" resolveInfo="esc_Brackets" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="1353467374625327703">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1353467374625327704">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="1353467374625327705">
                <property name="value:3" value="(asdsa)" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.regexp.structure.MatchRegexpOperation:0" id="1353467374625327706">
                <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression:0" id="1353467374625327707">
                  <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclarationReferenceRegexp:0" id="1353467374625327708">
                    <link role="regexp:0" targetNodeId="5533535376639120949" resolveInfo="esc_Brackets" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="1353467374625327710">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1353467374625327711">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="1353467374625327712">
                <property name="value:3" value="{qq}" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.regexp.structure.MatchRegexpOperation:0" id="1353467374625327713">
                <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression:0" id="1353467374625327714">
                  <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclarationReferenceRegexp:0" id="1353467374625327715">
                    <link role="regexp:0" targetNodeId="5533535376639120949" resolveInfo="esc_Brackets" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse" id="1353467374625412825">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1353467374625412827">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="1353467374625412828">
                <property name="value:3" value="s{qq}" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.regexp.structure.MatchRegexpOperation:0" id="1353467374625412829">
                <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression:0" id="1353467374625412830">
                  <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclarationReferenceRegexp:0" id="1353467374625412831">
                    <link role="regexp:0" targetNodeId="5533535376639120949" resolveInfo="esc_Brackets" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="8330008649153446819">
        <property name="methodName" value="testPredefined" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="8330008649153446820" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="8330008649153446821" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="8330008649153446822">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="8330008649153446829">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="8330008649153446830">
              <property name="name:3" value="p" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="8330008649153446831">
                <link role="classifier:3" targetNodeId="3.~Pattern" resolveInfo="Pattern" />
              </node>
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression:0" id="8330008649153446832">
                <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8330008649153447615">
                  <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8330008649153447619">
                    <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8330008649153447623">
                      <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8330008649153448116">
                        <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8330008649153448119">
                          <link role="symbolClass:0" targetNodeId="2v.1202318346829" resolveInfo="\b" />
                        </node>
                        <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.PositiveSymbolClassRegexp:0" id="8330008649153447626">
                          <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassSymbolClassPart:0" id="8330008649153448115">
                            <link role="declaration:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                          </node>
                          <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassSymbolClassPart:0" id="8330008649153447797">
                            <link role="declaration:0" targetNodeId="2v.1174554696286" resolveInfo="\D" />
                          </node>
                        </node>
                      </node>
                      <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8330008649153447622">
                        <link role="symbolClass:0" targetNodeId="2v.1174554752025" resolveInfo="\W" />
                      </node>
                    </node>
                    <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8330008649153447618">
                      <link role="symbolClass:0" targetNodeId="2v.3050481019132403217" resolveInfo="\\" />
                    </node>
                  </node>
                  <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8330008649153446833">
                    <link role="symbolClass:0" targetNodeId="2v.1174554710194" resolveInfo="\s" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8330008649153446835">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8330008649153446838">
              <property name="value:3" value="\\s\\\\\\W[\\w\\D]\\b" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153446839">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8330008649153446840">
                <link role="variableDeclaration:3" targetNodeId="8330008649153446830" resolveInfo="p" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153446841">
                <link role="baseMethodDeclaration:3" targetNodeId="3.~Pattern.pattern():java.lang.String" resolveInfo="pattern" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="8330008649153753492">
        <property name="methodName" value="range1" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="8330008649153753493" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="8330008649153753494" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="8330008649153753495">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="8330008649153753497">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="8330008649153753498">
              <property name="name:3" value="p" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="8330008649153753499">
                <link role="classifier:3" targetNodeId="3.~Pattern" resolveInfo="Pattern" />
              </node>
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression:0" id="8330008649153753500">
                <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PositiveSymbolClassRegexp:0" id="8330008649153753518">
                  <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.CharacterSymbolClassPart:0" id="8330008649153753519">
                    <property name="character:0" value="a" />
                  </node>
                  <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.IntervalSymbolClassPart:0" id="8330008649153753521">
                    <property name="start:0" value="c" />
                    <property name="end:0" value="f" />
                  </node>
                  <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassSymbolClassPart:0" id="8173814113624937010">
                    <link role="declaration:0" targetNodeId="2v.1174554674770" resolveInfo="\d" />
                  </node>
                  <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.CharacterSymbolClassPart:0" id="8173814113624942577">
                    <property name="character:0" value="-" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8330008649153753512">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8330008649153753513">
              <property name="value:3" value="[ac-f\\d\\-]" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153753514">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8330008649153753515">
                <link role="variableDeclaration:3" targetNodeId="8330008649153753498" resolveInfo="p" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153753516">
                <link role="baseMethodDeclaration:3" targetNodeId="3.~Pattern.pattern():java.lang.String" resolveInfo="pattern" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="8173814113625132292">
        <property name="methodName" value="rangeIntersection" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="8173814113625132293" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="8173814113625132294" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="8173814113625132295">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="8173814113625132297">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="8173814113625132298">
              <property name="name:3" value="p" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="8173814113625132299">
                <link role="classifier:3" targetNodeId="3.~Pattern" resolveInfo="Pattern" />
              </node>
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression:0" id="8173814113625132300">
                <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PositiveSymbolClassRegexp:0" id="8173814113625132301">
                  <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.IntervalSymbolClassPart:0" id="8173814113625141355">
                    <property name="start:0" value="1" />
                    <property name="end:0" value="9" />
                  </node>
                  <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.IntersectionSymbolClassPart:0" id="8173814113625141348">
                    <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassSymbolClassPart:0" id="8173814113625141349">
                      <link role="declaration:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                    </node>
                    <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.NegativeSymbolClassRegexp:0" id="8173814113625141350">
                      <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.IntervalSymbolClassPart:0" id="8173814113625141353">
                        <property name="start:0" value="d" />
                        <property name="end:0" value="f" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8173814113625132306">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8173814113625132307">
              <property name="value:3" value="[1-9\\w&amp;&amp;[^d-f]]" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8173814113625132308">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8173814113625132309">
                <link role="variableDeclaration:3" targetNodeId="8173814113625132298" resolveInfo="p" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8173814113625132310">
                <link role="baseMethodDeclaration:3" targetNodeId="3.~Pattern.pattern():java.lang.String" resolveInfo="pattern" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="8173814113625245868">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8173814113625245877">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8173814113625245871">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8173814113625245870">
                  <link role="variableDeclaration:3" targetNodeId="8173814113625132298" resolveInfo="p" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8173814113625245875">
                  <link role="baseMethodDeclaration:3" targetNodeId="3.~Pattern.matcher(java.lang.CharSequence):java.util.regex.Matcher" resolveInfo="matcher" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8173814113625245876">
                    <property name="value:3" value="1" />
                  </node>
                </node>
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8173814113625245881">
                <link role="baseMethodDeclaration:3" targetNodeId="3.~Matcher.matches():boolean" resolveInfo="matches" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="8173814113625245883">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8173814113625245884">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8173814113625245885">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8173814113625245886">
                  <link role="variableDeclaration:3" targetNodeId="8173814113625132298" resolveInfo="p" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8173814113625245887">
                  <link role="baseMethodDeclaration:3" targetNodeId="3.~Pattern.matcher(java.lang.CharSequence):java.util.regex.Matcher" resolveInfo="matcher" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8173814113625245888">
                    <property name="value:3" value="a" />
                  </node>
                </node>
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8173814113625245889">
                <link role="baseMethodDeclaration:3" targetNodeId="3.~Matcher.matches():boolean" resolveInfo="matches" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="8173814113625245891">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8173814113625245892">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8173814113625245893">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8173814113625245894">
                  <link role="variableDeclaration:3" targetNodeId="8173814113625132298" resolveInfo="p" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8173814113625245895">
                  <link role="baseMethodDeclaration:3" targetNodeId="3.~Pattern.matcher(java.lang.CharSequence):java.util.regex.Matcher" resolveInfo="matcher" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8173814113625245896">
                    <property name="value:3" value="g" />
                  </node>
                </node>
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8173814113625245897">
                <link role="baseMethodDeclaration:3" targetNodeId="3.~Matcher.matches():boolean" resolveInfo="matches" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse" id="8173814113625245899">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8173814113625245908">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8173814113625245909">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8173814113625245910">
                  <link role="variableDeclaration:3" targetNodeId="8173814113625132298" resolveInfo="p" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8173814113625245911">
                  <link role="baseMethodDeclaration:3" targetNodeId="3.~Pattern.matcher(java.lang.CharSequence):java.util.regex.Matcher" resolveInfo="matcher" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8173814113625245912">
                    <property name="value:3" value="f" />
                  </node>
                </node>
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8173814113625245913">
                <link role="baseMethodDeclaration:3" targetNodeId="3.~Matcher.matches():boolean" resolveInfo="matches" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="8173814113625141357">
        <property name="methodName" value="rangeIntersectionSimple" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="8173814113625141358" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="8173814113625141359" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="8173814113625141360">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="8173814113625141361">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="8173814113625141362">
              <property name="name:3" value="p" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="8173814113625141363">
                <link role="classifier:3" targetNodeId="3.~Pattern" resolveInfo="Pattern" />
              </node>
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression:0" id="8173814113625141364">
                <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PositiveSymbolClassRegexp:0" id="8173814113625141365">
                  <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.IntersectionSymbolClassPart:0" id="8173814113625141367">
                    <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassSymbolClassPart:0" id="8173814113625141368">
                      <link role="declaration:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                    </node>
                    <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.NegativeSymbolClassRegexp:0" id="8173814113625141369">
                      <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.IntervalSymbolClassPart:0" id="8173814113625141370">
                        <property name="start:0" value="d" />
                        <property name="end:0" value="f" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8173814113625141371">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8173814113625141372">
              <property name="value:3" value="[\\w&amp;&amp;[^d-f]]" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8173814113625141373">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8173814113625141374">
                <link role="variableDeclaration:3" targetNodeId="8173814113625141362" resolveInfo="p" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8173814113625141375">
                <link role="baseMethodDeclaration:3" targetNodeId="3.~Pattern.pattern():java.lang.String" resolveInfo="pattern" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="8330008649153447596">
        <property name="methodName" value="testStringLiteral" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="8330008649153447597" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="8330008649153447598" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="8330008649153447599">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="8330008649153447600">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="8330008649153447601">
              <property name="name:3" value="p" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="8330008649153447602">
                <link role="classifier:3" targetNodeId="3.~Pattern" resolveInfo="Pattern" />
              </node>
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression:0" id="8330008649153447603">
                <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8330008649153447604">
                  <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8330008649153447605">
                    <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp:0" id="8330008649153447606">
                      <property name="text:0" value="\&quot;" />
                    </node>
                    <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp:0" id="8330008649153447607">
                      <property name="text:0" value="&quot;" />
                    </node>
                  </node>
                  <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp:0" id="8330008649153447634">
                    <property name="text:0" value="'\'" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8330008649153447609">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8330008649153447610">
              <property name="value:3" value="'\\'\&quot;\\\&quot;" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153447611">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8330008649153447612">
                <link role="variableDeclaration:3" targetNodeId="8330008649153447601" resolveInfo="p" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153447613">
                <link role="baseMethodDeclaration:3" targetNodeId="3.~Pattern.pattern():java.lang.String" resolveInfo="pattern" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="8330008649153448279">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153448287">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153448282">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8330008649153448281">
                  <link role="variableDeclaration:3" targetNodeId="8330008649153447601" resolveInfo="p" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153448286">
                  <link role="baseMethodDeclaration:3" targetNodeId="3.~Pattern.matcher(java.lang.CharSequence):java.util.regex.Matcher" resolveInfo="matcher" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8330008649153448292">
                    <property name="value:3" value="''\&quot;\&quot;" />
                  </node>
                </node>
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153448291">
                <link role="baseMethodDeclaration:3" targetNodeId="3.~Matcher.matches():boolean" resolveInfo="matches" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="8330008649153549856">
        <property name="methodName" value="testBackref" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="8330008649153549857" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="8330008649153549858" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="8330008649153549859">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="8330008649153549860">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="8330008649153549861">
              <property name="name:3" value="p" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="8330008649153549862">
                <link role="classifier:3" targetNodeId="3.~Pattern" resolveInfo="Pattern" />
              </node>
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression:0" id="8330008649153549863">
                <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8330008649153549870">
                  <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.LineEndRegexp:0" id="8330008649153549873" />
                  <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8330008649153549877">
                    <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8330008649153549882">
                      <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReferenceRegexp:0" id="8330008649153549885">
                        <link role="match:0" targetNodeId="8330008649153549880" resolveInfo="ioo" />
                      </node>
                      <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp:0" id="8330008649153549880">
                        <property name="name:0" value="ioo" />
                        <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp:0" id="8330008649153549887">
                          <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8330008649153549886">
                            <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.LineStartRegexp:0" id="8330008649153549869" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8330008649153549890">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8330008649153549891">
              <property name="value:3" value="^(\\w+)\\1$" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153549892">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8330008649153549893">
                <link role="variableDeclaration:3" targetNodeId="8330008649153549861" resolveInfo="p" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153549894">
                <link role="baseMethodDeclaration:3" targetNodeId="3.~Pattern.pattern():java.lang.String" resolveInfo="pattern" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="8330008649153549901">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153549902">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153549903">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8330008649153549904">
                  <link role="variableDeclaration:3" targetNodeId="8330008649153549861" resolveInfo="p" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153549905">
                  <link role="baseMethodDeclaration:3" targetNodeId="3.~Pattern.matcher(java.lang.CharSequence):java.util.regex.Matcher" resolveInfo="matcher" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8330008649153549906">
                    <property name="value:3" value="kbbbwkbbbw" />
                  </node>
                </node>
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153549907">
                <link role="baseMethodDeclaration:3" targetNodeId="3.~Matcher.matches():boolean" resolveInfo="matches" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse" id="8330008649153549917">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153549919">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153549920">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8330008649153549921">
                  <link role="variableDeclaration:3" targetNodeId="8330008649153549861" resolveInfo="p" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153549922">
                  <link role="baseMethodDeclaration:3" targetNodeId="3.~Pattern.matcher(java.lang.CharSequence):java.util.regex.Matcher" resolveInfo="matcher" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8330008649153549923">
                    <property name="value:3" value="kbbbwkbbw" />
                  </node>
                </node>
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153549924">
                <link role="baseMethodDeclaration:3" targetNodeId="3.~Matcher.matches():boolean" resolveInfo="matches" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="8330008649153751541">
        <property name="methodName" value="testAutoBrackets" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="8330008649153751542" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="8330008649153751543" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="8330008649153751544">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="8330008649153751545">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="8330008649153751546">
              <property name="name:3" value="p" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="8330008649153751547">
                <link role="classifier:3" targetNodeId="3.~Pattern" resolveInfo="Pattern" />
              </node>
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression:0" id="8330008649153751549">
                <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8330008649153751552">
                  <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8330008649153751581">
                    <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.LineEndRegexp:0" id="8330008649153751584" />
                    <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp:0" id="8330008649153751561">
                      <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8330008649153751564">
                        <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8330008649153751567">
                          <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                        </node>
                        <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8330008649153751563">
                          <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.LineStartRegexp:0" id="8330008649153751551" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8330008649153751586">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8330008649153751587">
              <property name="value:3" value="^(?:\\w\\w)+$" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153751588">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8330008649153751589">
                <link role="variableDeclaration:3" targetNodeId="8330008649153751546" resolveInfo="p" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153751590">
                <link role="baseMethodDeclaration:3" targetNodeId="3.~Pattern.pattern():java.lang.String" resolveInfo="pattern" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="8330008649153751591">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153751592">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153751593">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8330008649153751594">
                  <link role="variableDeclaration:3" targetNodeId="8330008649153751546" resolveInfo="p" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153751595">
                  <link role="baseMethodDeclaration:3" targetNodeId="3.~Pattern.matcher(java.lang.CharSequence):java.util.regex.Matcher" resolveInfo="matcher" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8330008649153751596">
                    <property name="value:3" value="bwbb" />
                  </node>
                </node>
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153751597">
                <link role="baseMethodDeclaration:3" targetNodeId="3.~Matcher.matches():boolean" resolveInfo="matches" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse" id="8330008649153751599">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153751608">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153751602">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8330008649153751601">
                  <link role="variableDeclaration:3" targetNodeId="8330008649153751546" resolveInfo="p" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153751606">
                  <link role="baseMethodDeclaration:3" targetNodeId="3.~Pattern.matcher(java.lang.CharSequence):java.util.regex.Matcher" resolveInfo="matcher" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8330008649153751607">
                    <property name="value:3" value="bbb" />
                  </node>
                </node>
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153751612">
                <link role="baseMethodDeclaration:3" targetNodeId="3.~Matcher.matches():boolean" resolveInfo="matches" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="8330008649153752705">
        <property name="methodName" value="testAutoBrackets24" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="8330008649153752706" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="8330008649153752707" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="8330008649153752708">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="8330008649153752709">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="8330008649153752710">
              <property name="name:3" value="p" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="8330008649153752711">
                <link role="classifier:3" targetNodeId="3.~Pattern" resolveInfo="Pattern" />
              </node>
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression:0" id="8330008649153752712">
                <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8330008649153752713">
                  <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8330008649153752714">
                    <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.LineEndRegexp:0" id="8330008649153752715" />
                    <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.FromNToMTimesRegexp:0" id="8330008649153752740">
                      <property name="n:0" value="2" />
                      <property name="m:0" value="4" />
                      <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8330008649153752741">
                        <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8330008649153752742">
                          <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                        </node>
                        <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8330008649153752743">
                          <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.LineStartRegexp:0" id="8330008649153752720" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8330008649153752721">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8330008649153752722">
              <property name="value:3" value="^(?:\\w\\w){2,4}$" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153752723">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8330008649153752724">
                <link role="variableDeclaration:3" targetNodeId="8330008649153752710" resolveInfo="p" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153752725">
                <link role="baseMethodDeclaration:3" targetNodeId="3.~Pattern.pattern():java.lang.String" resolveInfo="pattern" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="8330008649153752726">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153752727">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153752728">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8330008649153752729">
                  <link role="variableDeclaration:3" targetNodeId="8330008649153752710" resolveInfo="p" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153752730">
                  <link role="baseMethodDeclaration:3" targetNodeId="3.~Pattern.matcher(java.lang.CharSequence):java.util.regex.Matcher" resolveInfo="matcher" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8330008649153752731">
                    <property name="value:3" value="bwbbbb" />
                  </node>
                </node>
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153752732">
                <link role="baseMethodDeclaration:3" targetNodeId="3.~Matcher.matches():boolean" resolveInfo="matches" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse" id="8330008649153752733">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153752734">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153752735">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8330008649153752736">
                  <link role="variableDeclaration:3" targetNodeId="8330008649153752710" resolveInfo="p" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153752737">
                  <link role="baseMethodDeclaration:3" targetNodeId="3.~Pattern.matcher(java.lang.CharSequence):java.util.regex.Matcher" resolveInfo="matcher" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8330008649153752738">
                    <property name="value:3" value="bbaabbaacc" />
                  </node>
                </node>
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153752739">
                <link role="baseMethodDeclaration:3" targetNodeId="3.~Matcher.matches():boolean" resolveInfo="matches" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="8330008649153753025">
        <property name="methodName" value="testAutoBrackets2ormore" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="8330008649153753026" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="8330008649153753027" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="8330008649153753028">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="8330008649153753029">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="8330008649153753030">
              <property name="name:3" value="p" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="8330008649153753031">
                <link role="classifier:3" targetNodeId="3.~Pattern" resolveInfo="Pattern" />
              </node>
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression:0" id="8330008649153753032">
                <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8330008649153753033">
                  <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8330008649153753034">
                    <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.LineEndRegexp:0" id="8330008649153753035" />
                    <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.AtLeastNTimesRegexp:0" id="8330008649153753060">
                      <property name="n:0" value="2" />
                      <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8330008649153753062">
                        <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8330008649153753063">
                          <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                        </node>
                        <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8330008649153753064">
                          <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.LineStartRegexp:0" id="8330008649153753040" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8330008649153753041">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8330008649153753042">
              <property name="value:3" value="^(?:\\w\\w){2,}$" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153753043">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8330008649153753044">
                <link role="variableDeclaration:3" targetNodeId="8330008649153753030" resolveInfo="p" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153753045">
                <link role="baseMethodDeclaration:3" targetNodeId="3.~Pattern.pattern():java.lang.String" resolveInfo="pattern" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="8330008649153753046">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153753047">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153753048">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8330008649153753049">
                  <link role="variableDeclaration:3" targetNodeId="8330008649153753030" resolveInfo="p" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153753050">
                  <link role="baseMethodDeclaration:3" targetNodeId="3.~Pattern.matcher(java.lang.CharSequence):java.util.regex.Matcher" resolveInfo="matcher" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8330008649153753051">
                    <property name="value:3" value="bwbb" />
                  </node>
                </node>
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153753052">
                <link role="baseMethodDeclaration:3" targetNodeId="3.~Matcher.matches():boolean" resolveInfo="matches" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse" id="8330008649153753053">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153753054">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153753055">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8330008649153753056">
                  <link role="variableDeclaration:3" targetNodeId="8330008649153753030" resolveInfo="p" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153753057">
                  <link role="baseMethodDeclaration:3" targetNodeId="3.~Pattern.matcher(java.lang.CharSequence):java.util.regex.Matcher" resolveInfo="matcher" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8330008649153753058">
                    <property name="value:3" value="bb" />
                  </node>
                </node>
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153753059">
                <link role="baseMethodDeclaration:3" targetNodeId="3.~Matcher.matches():boolean" resolveInfo="matches" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="8330008649153753101">
        <property name="methodName" value="testAutoBrackets2exactly" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="8330008649153753102" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="8330008649153753103" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="8330008649153753104">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="8330008649153753105">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="8330008649153753106">
              <property name="name:3" value="p" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="8330008649153753107">
                <link role="classifier:3" targetNodeId="3.~Pattern" resolveInfo="Pattern" />
              </node>
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression:0" id="8330008649153753108">
                <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8330008649153753109">
                  <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8330008649153753110">
                    <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.LineEndRegexp:0" id="8330008649153753111" />
                    <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.NTimesRegexp:0" id="8330008649153753137">
                      <property name="n:0" value="2" />
                      <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8330008649153753139">
                        <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8330008649153753140">
                          <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                        </node>
                        <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8330008649153753141">
                          <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.LineStartRegexp:0" id="8330008649153753116" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8330008649153753117">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8330008649153753118">
              <property name="value:3" value="^(?:\\w\\w){2}$" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153753119">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8330008649153753120">
                <link role="variableDeclaration:3" targetNodeId="8330008649153753106" resolveInfo="p" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153753121">
                <link role="baseMethodDeclaration:3" targetNodeId="3.~Pattern.pattern():java.lang.String" resolveInfo="pattern" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="8330008649153753122">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153753123">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153753124">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8330008649153753125">
                  <link role="variableDeclaration:3" targetNodeId="8330008649153753106" resolveInfo="p" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153753126">
                  <link role="baseMethodDeclaration:3" targetNodeId="3.~Pattern.matcher(java.lang.CharSequence):java.util.regex.Matcher" resolveInfo="matcher" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8330008649153753127">
                    <property name="value:3" value="bwbb" />
                  </node>
                </node>
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153753128">
                <link role="baseMethodDeclaration:3" targetNodeId="3.~Matcher.matches():boolean" resolveInfo="matches" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse" id="8330008649153753129">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153753130">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8330008649153753131">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8330008649153753132">
                  <link role="variableDeclaration:3" targetNodeId="8330008649153753106" resolveInfo="p" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153753133">
                  <link role="baseMethodDeclaration:3" targetNodeId="3.~Pattern.matcher(java.lang.CharSequence):java.util.regex.Matcher" resolveInfo="matcher" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8330008649153753134">
                    <property name="value:3" value="bb" />
                  </node>
                </node>
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8330008649153753135">
                <link role="baseMethodDeclaration:3" targetNodeId="3.~Matcher.matches():boolean" resolveInfo="matches" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.unitTest.structure.BTestCase" id="6129327962763155569">
    <property name="testCaseName" value="Replace" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6129327962763155570" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6129327962763155571">
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6129327962763155572" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6129327962763155573" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6129327962763155574" />
    </node>
    <node role="testMethodList" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethodList" id="6129327962763155575">
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="6129327962763155576">
        <property name="methodName" value="replace1" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6129327962763155577" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6129327962763155578" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6129327962763155579">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6129327962763155612">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6129327962763155615">
              <property name="name:3" value="s" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="6129327962763155617" />
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.regexp.structure.ReplaceWithRegexpExpression:0" id="6129327962763155581">
                <node role="expr:0" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6129327962763155597">
                  <property name="value:3" value="Manny goes home" />
                </node>
                <node role="replaceBlock:0" type="jetbrains.mps.baseLanguage.regexp.structure.ReplaceBlock:0" id="6129327962763155583">
                  <node role="body:0" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6129327962763155584">
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6129327962763155602">
                      <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="6129327962763155608">
                        <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="6129327962763155604">
                          <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6129327962763155603">
                            <property name="value:3" value="&lt;" />
                          </node>
                          <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReference:0" id="6129327962763155607">
                            <link role="match:0" targetNodeId="6129327962763155599" resolveInfo="aa" />
                          </node>
                        </node>
                        <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6129327962763155611">
                          <property name="value:3" value="&gt;" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression:0" id="6129327962763155586">
                  <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp:0" id="6129327962763155599">
                    <property name="name:0" value="aa" />
                    <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp:0" id="6129327962763155600">
                      <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="6129327962763155601">
                        <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="6129327962763155619">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6129327962763155622">
              <property name="value:3" value="&lt;Manny&gt; &lt;goes&gt; &lt;home&gt;" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6129327962763155623">
              <link role="variableDeclaration:3" targetNodeId="6129327962763155615" resolveInfo="s" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.unitTest.structure.BTestCase" id="6129327962764348634">
    <property name="testCaseName" value="Match" />
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="2588298302278368432">
      <property name="name:3" value="check" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="2588298302278368433" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="2588298302278368434" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="2588298302278368435">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="2588298302278368442">
          <node role="condition:3" type="jetbrains.mps.baseLanguage.regexp.structure.FindMatchExpression:0" id="2588298302278368443">
            <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression:0" id="2588298302278368444">
              <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="2588298302278368472">
                <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="2588298302278368476">
                  <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.StarRegexp:0" id="2588298302278368481">
                    <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="2588298302278368480">
                      <link role="symbolClass:0" targetNodeId="2v.1174554710194" resolveInfo="\s" />
                    </node>
                  </node>
                  <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp:0" id="2588298302278368475">
                    <property name="text:0" value="!" />
                  </node>
                </node>
                <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp:0" id="2588298302278368445">
                  <property name="name:0" value="mname" />
                  <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp:0" id="2588298302278368446">
                    <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="2588298302278368447">
                      <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="inputExpression:0" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="2588298302278368471">
              <link role="variableDeclaration:3" targetNodeId="2588298302278368436" resolveInfo="searchin" />
            </node>
          </node>
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="2588298302278368449">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="2588298302278368450">
              <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="2588298302278368451">
                <property name="value:3" value="xyz" />
              </node>
              <node role="actual" type="jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReference:0" id="2588298302278368452">
                <link role="match:0" targetNodeId="2588298302278368445" resolveInfo="mname" />
              </node>
            </node>
          </node>
          <node role="elsifClauses:3" type="jetbrains.mps.baseLanguage.structure.ElsifClause:3" id="2588298302278368453">
            <node role="condition:3" type="jetbrains.mps.baseLanguage.regexp.structure.FindMatchExpression:0" id="2588298302278368454">
              <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression:0" id="2588298302278368455">
                <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp:0" id="2588298302278368456">
                  <property name="name:0" value="rrt" />
                  <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp:0" id="2588298302278368457">
                    <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PositiveSymbolClassRegexp:0" id="2588298302278368458">
                      <node role="part:0" type="jetbrains.mps.baseLanguage.regexp.structure.IntervalSymbolClassPart:0" id="2588298302278368459">
                        <property name="start:0" value="a" />
                        <property name="end:0" value="f" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="inputExpression:0" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="2588298302278369372">
                <link role="variableDeclaration:3" targetNodeId="2588298302278368436" resolveInfo="searchin" />
              </node>
            </node>
            <node role="statementList:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="2588298302278368461">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="2588298302278368462">
                <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="2588298302278368463">
                  <property name="value:3" value="aaad" />
                </node>
                <node role="actual" type="jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReference:0" id="2588298302278368464">
                  <link role="match:0" targetNodeId="2588298302278368456" resolveInfo="rrt" />
                </node>
              </node>
            </node>
          </node>
          <node role="ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="2588298302278368492">
            <node role="statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="2588298302278368493">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.Fail" id="2588298302278368494">
                <node role="message" type="jetbrains.mps.baseLanguage.unitTest.structure.Message" id="2588298302278368495">
                  <node role="message" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="2588298302278368496">
                    <property name="value:3" value="no match" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="2588298302278368436">
        <property name="name:3" value="searchin" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="2588298302278368437" />
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6129327962764348635" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="6129327962764348636">
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6129327962764348637" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6129327962764348638" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6129327962764348639" />
    </node>
    <node role="testMethodList" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethodList" id="6129327962764348640">
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="6129327962764348641">
        <property name="methodName" value="find" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6129327962764348642" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6129327962764348643" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6129327962764348644">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="6129327962764368469">
            <node role="condition" type="jetbrains.mps.baseLanguage.regexp.structure.FindMatchExpression:0" id="6129327962764368475">
              <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression:0" id="6129327962764368478">
                <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.AtLeastNTimesRegexp:0" id="6129327962764368491">
                  <property name="n:0" value="3" />
                  <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp:0" id="6129327962764368492">
                    <property name="text:0" value="c" />
                  </node>
                </node>
              </node>
              <node role="inputExpression:0" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6129327962764368471">
                <property name="value:3" value="acccasdawe" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse" id="6129327962764368494">
            <node role="condition" type="jetbrains.mps.baseLanguage.regexp.structure.FindMatchExpression:0" id="6129327962764368496">
              <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression:0" id="6129327962764368497">
                <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.AtLeastNTimesRegexp:0" id="6129327962764368498">
                  <property name="n:0" value="3" />
                  <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp:0" id="6129327962764368499">
                    <property name="text:0" value="c" />
                  </node>
                </node>
              </node>
              <node role="inputExpression:0" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6129327962764368500">
                <property name="value:3" value="accasdawe" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="6129327962764576436">
        <property name="methodName" value="match" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6129327962764576437" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6129327962764576438" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6129327962764576439">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="6129327962764576440">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4452696118160649093">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4452696118160578750">
                <property name="value:3" value="ww" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.regexp.structure.MatchRegexpOperation:0" id="4452696118160649097">
                <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression:0" id="4452696118160649098">
                  <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="4452696118160649101">
                    <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="4452696118160649100">
                      <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                    </node>
                    <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="4452696118160649104">
                      <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse" id="6129327962764679037">
            <node role="condition" type="jetbrains.mps.baseLanguage.regexp.structure.MatchRegexpExpression:0" id="6129327962764679039">
              <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression:0" id="6129327962764679040">
                <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="4452696118160649109">
                  <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReferenceRegexp:0" id="4452696118160649112">
                    <link role="match:0" targetNodeId="4452696118160649105" resolveInfo="chars" />
                  </node>
                  <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp:0" id="4452696118160649105">
                    <property name="name:0" value="chars" />
                    <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="4452696118160649106">
                      <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="4452696118160649107">
                        <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                      </node>
                      <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="4452696118160649108">
                        <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="inputExpression:0" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6129327962764679045">
                <property name="value:3" value="www" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="6129327962764679735">
        <property name="methodName" value="split" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="6129327962764679736" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="6129327962764679737" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="6129327962764679738">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="6129327962764679769">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="6129327962764679770">
              <property name="name:3" value="list" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6129327962764679771">
                <link role="classifier:3" targetNodeId="2.~List" resolveInfo="List" />
                <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="6129327962764679775" />
              </node>
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.regexp.structure.SplitExpression:0" id="6129327962764679777">
                <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression:0" id="6129327962764679778">
                  <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="6129327962764679779">
                    <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.StarRegexp:0" id="6129327962764679780">
                      <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="6129327962764679781">
                        <link role="symbolClass:0" targetNodeId="2v.1174554710194" resolveInfo="\s" />
                      </node>
                    </node>
                    <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp:0" id="6129327962764679782">
                      <property name="text:0" value="," />
                    </node>
                  </node>
                </node>
                <node role="expr:0" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6129327962764679783">
                  <property name="value:3" value="abc, def, xxyyy" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="6129327962764679785">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6129327962764679789">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6129327962764679788">
                <link role="variableDeclaration:3" targetNodeId="6129327962764679770" resolveInfo="list" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6129327962764679793">
                <link role="baseMethodDeclaration:3" targetNodeId="2.~List.size():int" resolveInfo="size" />
              </node>
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6129327962764679794">
              <property name="value:3" value="3" />
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="6129327962764679796">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6129327962764679799">
              <property name="value:3" value="abc" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6129327962764679801">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6129327962764679800">
                <link role="variableDeclaration:3" targetNodeId="6129327962764679770" resolveInfo="list" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6129327962764679805">
                <link role="baseMethodDeclaration:3" targetNodeId="2.~List.get(int):java.lang.Object" resolveInfo="get" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6129327962764679806">
                  <property name="value:3" value="0" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="6129327962764679809">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6129327962764679810">
              <property name="value:3" value="def" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6129327962764679811">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6129327962764679812">
                <link role="variableDeclaration:3" targetNodeId="6129327962764679770" resolveInfo="list" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6129327962764679813">
                <link role="baseMethodDeclaration:3" targetNodeId="2.~List.get(int):java.lang.Object" resolveInfo="get" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6129327962764679816">
                  <property name="value:3" value="1" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="6129327962764679819">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="6129327962764679820">
              <property name="value:3" value="xxyyy" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6129327962764679821">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6129327962764679822">
                <link role="variableDeclaration:3" targetNodeId="6129327962764679770" resolveInfo="list" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6129327962764679823">
                <link role="baseMethodDeclaration:3" targetNodeId="2.~List.get(int):java.lang.Object" resolveInfo="get" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="6129327962764679826">
                  <property name="value:3" value="2" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="7048923897762884731">
        <property name="methodName" value="refFromRegexps" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="7048923897762884732" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="7048923897762884733" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7048923897762884734">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="7048923897762907461">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="7048923897762907462">
              <property name="name:3" value="executed" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="7048923897762913397" />
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="7048923897762907465">
                <property name="value:3" value="false" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.regexp.structure.FindMatchStatement:0" id="7048923897762884735">
            <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression:0" id="7048923897762884736">
              <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="7048923897762937787">
                <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp:0" id="7048923897762937790">
                  <property name="name:0" value="aq1" />
                  <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.StarRegexp:0" id="7048923897762942662">
                    <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="7048923897762942661">
                      <link role="symbolClass:0" targetNodeId="2v.1174554710194" resolveInfo="\s" />
                    </node>
                  </node>
                </node>
                <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclarationReferenceRegexp:0" id="7048923897762884741">
                  <link role="regexp:0" targetNodeId="7048923897762884716" resolveInfo="nameInBrackets" />
                </node>
              </node>
            </node>
            <node role="expr:0" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="7048923897762884740">
              <property name="value:3" value="asdasd [ww]" />
            </node>
            <node role="body:0" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="7048923897762884739">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="7048923897762884746">
                <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="7048923897762884749">
                  <property name="value:3" value="ww" />
                </node>
                <node role="actual" type="jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReference:0" id="7048923897762942664">
                  <link role="match:0" targetNodeId="7048923897762884726" resolveInfo="nameInBr" />
                </node>
              </node>
              <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="7048923897762971918">
                <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="7048923897762971921">
                  <property name="value:3" value=" " />
                </node>
                <node role="actual" type="jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReference:0" id="7048923897762971922">
                  <link role="match:0" targetNodeId="7048923897762937790" resolveInfo="aq1" />
                </node>
              </node>
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="7048923897762913391">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="7048923897762913393">
                  <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="7048923897762913392">
                    <link role="variableDeclaration:3" targetNodeId="7048923897762907462" resolveInfo="executed" />
                  </node>
                  <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="7048923897762913396">
                    <property name="value:3" value="true" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="7048923897762913399">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="7048923897762913401">
              <link role="variableDeclaration:3" targetNodeId="7048923897762907462" resolveInfo="executed" />
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="4276824325038067892">
        <property name="methodName" value="matchInIf" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4276824325038067893" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4276824325038067894" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4276824325038067895">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="2588298302278368465">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="2588298302278368466">
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="2588298302278368467">
                <link role="baseMethodDeclaration:3" targetNodeId="2588298302278368432" resolveInfo="check" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="2588298302278368469">
                  <property name="value:3" value="! xyz" />
                </node>
              </node>
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="2588298302278368468" />
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="2588298302278368484">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="2588298302278368486">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="2588298302278368485" />
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="2588298302278368490">
                <link role="baseMethodDeclaration:3" targetNodeId="2588298302278368432" resolveInfo="check" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="2588298302278368491">
                  <property name="value:3" value="xxxaaadyyy" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="902359922144295130">
        <property name="methodName" value="innerRegexps" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="902359922144295131" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="902359922144295132" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="902359922144295133">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="902359922144295134">
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="902359922144295136">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="902359922144295146">
                <node role="actual" type="jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReference:0" id="902359922144295151">
                  <link role="match:0" targetNodeId="902359922144295122" resolveInfo="name" />
                </node>
                <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="902359922144295150">
                  <property name="value:3" value="inner" />
                </node>
              </node>
              <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="902359922144295163">
                <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="902359922144295166">
                  <property name="value:3" value="3" />
                </node>
                <node role="actual" type="jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReference:0" id="1767845709140912926">
                  <link role="match:0" targetNodeId="902359922144295112" resolveInfo="number" />
                </node>
              </node>
              <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="902359922144295169">
                <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="902359922144295172">
                  <property name="value:3" value="_123" />
                </node>
                <node role="actual" type="jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReference:0" id="1767845709140912928">
                  <link role="match:0" targetNodeId="902359922144295067" resolveInfo="identifier" />
                </node>
              </node>
            </node>
            <node role="condition:3" type="jetbrains.mps.baseLanguage.regexp.structure.FindMatchExpression:0" id="902359922144295141">
              <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.InlineRegexpExpression:0" id="902359922144295142">
                <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.RegexpDeclarationReferenceRegexp:0" id="902359922144295145">
                  <link role="regexp:0" targetNodeId="902359922144295096" resolveInfo="VarDeclaration" />
                </node>
              </node>
              <node role="inputExpression:0" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="902359922144295137">
                <property name="value:3" value="_123[3]inner" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.unitTest.structure.BTestCase" id="3796137614137404062">
    <property name="testCaseName" value="PerlReplace" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="3796137614137404063" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="3796137614137404064">
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="3796137614137404065" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="3796137614137404066" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="3796137614137404067" />
    </node>
    <node role="testMethodList" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethodList" id="3796137614137404068">
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="3796137614137404069">
        <property name="methodName" value="simple" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="3796137614137404070" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="3796137614137404071" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="3796137614137404072">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="3796137614137404073">
            <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="3796137614137404074">
              <property name="name:3" value="input" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="3796137614137404075" />
              <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="3796137614137404077">
                <property name="value:3" value="aaabbccddeeffffffff" />
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="3796137614137404079">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="3796137614137404082">
              <property name="value:3" value="a!b!c!d!e!f!" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="3796137614137538861">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="3796137614137404083">
                <link role="variableDeclaration:3" targetNodeId="3796137614137404074" resolveInfo="input" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation:0" id="3796137614137538865">
                <property name="globalReplace:0" value="true" />
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReferenceReplacement:0" id="3796137614137943831">
                  <link role="match:0" targetNodeId="3796137614137538871" resolveInfo="list" />
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.LiteralReplacement:0" id="3796137614137943837">
                  <property name="text:0" value="!" />
                </node>
                <node role="search:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="3796137614137929921">
                  <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.ParensRegexp:0" id="1643569692137825803">
                    <node role="expr:0" type="jetbrains.mps.baseLanguage.regexp.structure.StarRegexp:0" id="1643569692137825804">
                      <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="1643569692137825805">
                        <link role="symbolClass:0" targetNodeId="2v.1174554710194" resolveInfo="\s" />
                      </node>
                    </node>
                  </node>
                  <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="1643569692137919035">
                    <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.StarRegexp:0" id="1643569692137919039">
                      <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReferenceRegexp:0" id="1643569692137919038">
                        <link role="match:0" targetNodeId="3796137614137538871" resolveInfo="list" />
                      </node>
                    </node>
                    <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp:0" id="3796137614137538871">
                      <property name="name:0" value="list" />
                      <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="1643569692137919034">
                        <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="1643569692138211513">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="1643569692138211514">
              <property name="value:3" value="a!bbccddeeffffffff" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1643569692138211515">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="1643569692138211516">
                <link role="variableDeclaration:3" targetNodeId="3796137614137404074" resolveInfo="input" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation:0" id="1643569692138211517">
                <property name="globalReplace:0" value="false" />
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReferenceReplacement:0" id="1643569692138211518">
                  <link role="match:0" targetNodeId="1643569692138211527" resolveInfo="list" />
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.LiteralReplacement:0" id="1643569692138211519">
                  <property name="text:0" value="!" />
                </node>
                <node role="search:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="1643569692138211520">
                  <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.ParensRegexp:0" id="1643569692138211521">
                    <node role="expr:0" type="jetbrains.mps.baseLanguage.regexp.structure.StarRegexp:0" id="1643569692138211522">
                      <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="1643569692138211523">
                        <link role="symbolClass:0" targetNodeId="2v.1174554710194" resolveInfo="\s" />
                      </node>
                    </node>
                  </node>
                  <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="1643569692138211524">
                    <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.StarRegexp:0" id="1643569692138211525">
                      <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReferenceRegexp:0" id="1643569692138211526">
                        <link role="match:0" targetNodeId="1643569692138211527" resolveInfo="list" />
                      </node>
                    </node>
                    <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp:0" id="1643569692138211527">
                      <property name="name:0" value="list" />
                      <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="1643569692138211528">
                        <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="8942139995508443379">
        <property name="methodName" value="swap" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="8942139995508443380" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="8942139995508443381" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="8942139995508443382">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8942139995508443383">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8942139995508443386">
              <property name="value:3" value="word2 first" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8942139995508443388">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8942139995508443387">
                <property name="value:3" value="   first   word2" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation:0" id="8942139995508443392">
                <property name="globalReplace:0" value="false" />
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReferenceReplacement:0" id="8942139995508443428">
                  <link role="match:0" targetNodeId="8942139995508443418" resolveInfo="w2" />
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.LiteralReplacement:0" id="8942139995508443432">
                  <property name="text:0" value=" " />
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReferenceReplacement:0" id="8942139995508443434">
                  <link role="match:0" targetNodeId="8942139995508443404" resolveInfo="w1" />
                </node>
                <node role="search:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8942139995508443398">
                  <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.StarRegexp:0" id="8942139995508443396">
                    <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8942139995508443395">
                      <link role="symbolClass:0" targetNodeId="2v.1174554710194" resolveInfo="\s" />
                    </node>
                  </node>
                  <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8942139995508443409">
                    <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="8942139995508443415">
                      <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp:0" id="8942139995508443418">
                        <property name="name:0" value="w2" />
                        <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp:0" id="8942139995508443421">
                          <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8942139995508443420">
                            <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                          </node>
                        </node>
                      </node>
                      <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp:0" id="8942139995508443413">
                        <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8942139995508443412">
                          <link role="symbolClass:0" targetNodeId="2v.1174554710194" resolveInfo="\s" />
                        </node>
                      </node>
                    </node>
                    <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp:0" id="8942139995508443404">
                      <property name="name:0" value="w1" />
                      <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp:0" id="8942139995508443407">
                        <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8942139995508443406">
                          <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4452696118160649121">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4452696118160649123">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4452696118160649122" />
              <node role="operation:3" type="jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation:0" id="4452696118160649127">
                <node role="search:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp:0" id="4452696118160649133">
                  <property name="name:0" value="word" />
                  <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="4452696118160649135">
                    <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                  </node>
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.LiteralReplacement:0" id="4452696118160649137">
                  <property name="text:0" value="[" />
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReferenceReplacement:0" id="4452696118160649139">
                  <link role="match:0" targetNodeId="4452696118160649133" resolveInfo="word" />
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.LiteralReplacement:0" id="4452696118160649141">
                  <property name="text:0" value="]" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1767845709140460447">
        <property name="methodName" value="oneLetter" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="1767845709140460448" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="1767845709140460449" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="1767845709140460450">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="1767845709140460451">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="1767845709140460454">
              <property name="value:3" value="A" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1767845709140460456">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="1767845709140460455">
                <property name="value:3" value="A" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation:0" id="1767845709140460460">
                <node role="search:0" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp:0" id="1767845709140460462">
                  <property name="text:0" value="a" />
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.LiteralReplacement:0" id="1767845709140460463">
                  <property name="text:0" value="AA" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="1767845709140460465">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="1767845709140460466">
              <property name="value:3" value="AA" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1767845709140460467">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="1767845709140460468">
                <property name="value:3" value="A" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation:0" id="1767845709140460469">
                <property name="caseInsensitive:0" value="true" />
                <property name="globalReplace:0" value="false" />
                <property name="dotAll:0" value="false" />
                <property name="multiLine:0" value="false" />
                <node role="search:0" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp:0" id="1767845709140460470">
                  <property name="text:0" value="a" />
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.LiteralReplacement:0" id="1767845709140460471">
                  <property name="text:0" value="AA" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="3632055896798290267">
        <property name="methodName" value="dotAllMode" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="3632055896798290268" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="3632055896798290269" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="3632055896798290270">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="3632055896798290271">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="3632055896798292824">
              <property name="value:3" value="!\n!\n!" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="3632055896798292812">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="3632055896798290274">
                <property name="value:3" value="aaaaa\nddddd\nwwwww" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation:0" id="3632055896798292816">
                <property name="globalReplace:0" value="true" />
                <node role="search:0" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp:0" id="3632055896798292819">
                  <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.DotRegexp:0" id="3632055896798292821" />
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.LiteralReplacement:0" id="3632055896798292823">
                  <property name="text:0" value="!" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="3632055896798292826">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="3632055896798292827">
              <property name="value:3" value="!" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="3632055896798292828">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="3632055896798292829">
                <property name="value:3" value="aaaaa\nddddd\nwwwww" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation:0" id="3632055896798292830">
                <property name="dotAll:0" value="true" />
                <property name="globalReplace:0" value="true" />
                <node role="search:0" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp:0" id="3632055896798292831">
                  <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.DotRegexp:0" id="3632055896798292832" />
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.LiteralReplacement:0" id="3632055896798292833">
                  <property name="text:0" value="!" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="3632055896798292834">
        <property name="methodName" value="multiLine" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="3632055896798292835" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="3632055896798292836" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="3632055896798292837">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="3632055896798292838">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="3632055896798292841">
              <property name="value:3" value="sada\n[asdad]\nasda\n[asada]" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="3632055896798292844">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="3632055896798292842">
                <property name="value:3" value="sada\nasdad:\nasda\nasada:" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation:0" id="3632055896798292848">
                <property name="globalReplace:0" value="true" />
                <property name="multiLine:0" value="true" />
                <node role="search:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="3632055896798292861">
                  <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="3632055896798292866">
                    <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp:0" id="3632055896798292869">
                      <property name="text:0" value=":" />
                    </node>
                    <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp:0" id="3632055896798292864">
                      <property name="name:0" value="text" />
                      <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp:0" id="3632055896798292871">
                        <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="3632055896798292870">
                          <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.LineStartRegexp:0" id="3632055896798292851" />
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.LiteralReplacement:0" id="3632055896798292879">
                  <property name="text:0" value="[" />
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReferenceReplacement:0" id="3632055896798292875">
                  <link role="match:0" targetNodeId="3632055896798292864" resolveInfo="text" />
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.LiteralReplacement:0" id="3632055896798292877">
                  <property name="text:0" value="]" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="3632055896798296107">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="3632055896798296108">
              <property name="value:3" value="sada\nasdad:\nasda\nasada:" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="3632055896798296109">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="3632055896798296110">
                <property name="value:3" value="sada\nasdad:\nasda\nasada:" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation:0" id="3632055896798296111">
                <property name="globalReplace:0" value="true" />
                <property name="multiLine:0" value="false" />
                <node role="search:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="3632055896798296112">
                  <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.SeqRegexp:0" id="3632055896798296113">
                    <node role="right:0" type="jetbrains.mps.baseLanguage.regexp.structure.StringLiteralRegexp:0" id="3632055896798296114">
                      <property name="text:0" value=":" />
                    </node>
                    <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchParensRegexp:0" id="3632055896798296115">
                      <property name="name:0" value="text" />
                      <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PlusRegexp:0" id="3632055896798296116">
                        <node role="regexp:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="3632055896798296117">
                          <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="left:0" type="jetbrains.mps.baseLanguage.regexp.structure.LineStartRegexp:0" id="3632055896798296118" />
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.LiteralReplacement:0" id="3632055896798296119">
                  <property name="text:0" value="[" />
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.MatchVariableReferenceReplacement:0" id="3632055896798296120">
                  <link role="match:0" targetNodeId="3632055896798296115" resolveInfo="text" />
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.LiteralReplacement:0" id="3632055896798296121">
                  <property name="text:0" value="]" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="8942139995508580996">
        <property name="methodName" value="checkLiterals" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="8942139995508580997" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="8942139995508580998" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="8942139995508580999">
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8942139995508581000">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8942139995508581003">
              <property name="value:3" value="\\" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8942139995508581005">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8942139995508581004">
                <property name="value:3" value="a" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation:0" id="8942139995508581009">
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.LiteralReplacement:0" id="8942139995508581019">
                  <property name="text:0" value="\\" />
                </node>
                <node role="search:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8942139995508581020">
                  <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8942139995508582632">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8942139995508582633">
              <property name="value:3" value="[]" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8942139995508582634">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8942139995508582635">
                <property name="value:3" value="a" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation:0" id="8942139995508582636">
                <node role="search:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8942139995508582638">
                  <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.LiteralReplacement:0" id="8942139995508582639">
                  <property name="text:0" value="[]" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8942139995508582641">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8942139995508582642">
              <property name="value:3" value="$" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8942139995508582643">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8942139995508582644">
                <property name="value:3" value="a" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation:0" id="8942139995508582645">
                <node role="search:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8942139995508582647">
                  <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.LiteralReplacement:0" id="8942139995508582648">
                  <property name="text:0" value="$" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8942139995508723029">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8942139995508723030">
              <property name="value:3" value="\&quot;" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8942139995508723031">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8942139995508723032">
                <property name="value:3" value="a" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation:0" id="8942139995508723033">
                <node role="search:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8942139995508723034">
                  <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.LiteralReplacement:0" id="8942139995508723035">
                  <property name="text:0" value="&quot;" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8942139995509275196">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8942139995509275197">
              <property name="value:3" value="\&quot;" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8942139995509275198">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8942139995509275199">
                <property name="value:3" value="a" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation:0" id="8942139995509275200">
                <node role="search:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8942139995509275201">
                  <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.LiteralReplacement:0" id="8942139995509275202">
                  <property name="text:0" value="\&quot;" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8942139995508723037">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8942139995508723038">
              <property name="value:3" value="()" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8942139995508723039">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8942139995508723040">
                <property name="value:3" value="a" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation:0" id="8942139995508723041">
                <node role="search:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8942139995508723042">
                  <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.LiteralReplacement:0" id="8942139995508723043">
                  <property name="text:0" value="()" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8942139995508723045">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8942139995508723046">
              <property name="value:3" value="{}" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8942139995508723047">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8942139995508723048">
                <property name="value:3" value="a" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation:0" id="8942139995508723049">
                <node role="search:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8942139995508723050">
                  <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.LiteralReplacement:0" id="8942139995508723052">
                  <property name="text:0" value="{}" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8942139995508724135">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8942139995508724136">
              <property name="value:3" value="\n" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8942139995508724137">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8942139995508724138">
                <property name="value:3" value="a" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation:0" id="8942139995508724139">
                <node role="search:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8942139995508724140">
                  <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.LiteralReplacement:0" id="8942139995508724142">
                  <property name="text:0" value="\n" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8942139995508724144">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8942139995508724145">
              <property name="value:3" value="^" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8942139995508724146">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8942139995508724147">
                <property name="value:3" value="a" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation:0" id="8942139995508724148">
                <node role="search:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8942139995508724149">
                  <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.LiteralReplacement:0" id="8942139995508724151">
                  <property name="text:0" value="^" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8942139995508724153">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8942139995508724154">
              <property name="value:3" value="'" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8942139995508724155">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8942139995508724156">
                <property name="value:3" value="a" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation:0" id="8942139995508724157">
                <node role="search:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8942139995508724158">
                  <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.LiteralReplacement:0" id="8942139995508724160">
                  <property name="text:0" value="'" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="8942139995509275205">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8942139995509275206">
              <property name="value:3" value="'" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8942139995509275207">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8942139995509275208">
                <property name="value:3" value="a" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation:0" id="8942139995509275209">
                <node role="search:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="8942139995509275210">
                  <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.LiteralReplacement:0" id="8942139995509275211">
                  <property name="text:0" value="\'" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="1767845709140460419">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="1767845709140460422">
              <property name="value:3" value="\u2606" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1767845709140460424">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="1767845709140460423">
                <property name="value:3" value="a" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation:0" id="1767845709140460428">
                <node role="search:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="1767845709140460430">
                  <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.LiteralReplacement:0" id="1767845709140460431">
                  <property name="text:0" value="\u2606" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement:3" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="1767845709140460433">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="1767845709140460436">
              <property name="value:3" value="\r" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="1767845709140460438">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="1767845709140460437">
                <property name="value:3" value="a" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.regexp.structure.ReplaceRegexpOperation:0" id="1767845709140460442">
                <node role="search:0" type="jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassRegexp:0" id="1767845709140460444">
                  <link role="symbolClass:0" targetNodeId="2v.1174554738336" resolveInfo="\w" />
                </node>
                <node role="replacement:0" type="jetbrains.mps.baseLanguage.regexp.structure.LiteralReplacement:0" id="1767845709140460445">
                  <property name="text:0" value="\r" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>


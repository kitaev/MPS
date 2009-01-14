<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:6fb1beb5-17d5-44c1-a541-c95672dc4233(jetbrains.mps.dataFlow.runtime)">
  <persistence version="3" />
  <refactoringHistory />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <language namespace="ac2f1963-1b72-479d-bbf6-e8da39fb6f41(jetbrains.mps.lang.annotations)" />
  <language namespace="7a5dda62-9140-4668-ab76-d5ed1746f2b2(jetbrains.mps.lang.typesystem)" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590283(jetbrains.mps.lang.core.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902db(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895903fe(jetbrains.mps.baseLanguage.strings.constraints)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590402(jetbrains.mps.baseLanguage.strings.structure)" version="9" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="4" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590328(jetbrains.mps.baseLanguage.collections.constraints)" version="6" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590334(jetbrains.mps.baseLanguage.closures.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902fb(jetbrains.mps.lang.smodel.constraints)" version="21" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959033d(jetbrains.mps.lang.annotations.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ae(jetbrains.mps.lang.typesystem.constraints)" version="17" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902b4(jetbrains.mps.lang.typesystem.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959028c(jetbrains.mps.lang.structure.constraints)" version="11" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590340(jetbrains.mps.lang.pattern.constraints)" version="2" />
  <maxImportIndex value="9" />
  <import index="1" modelUID="f:java_stub#jetbrains.mps.lang.dataFlow.framework(jetbrains.mps.lang.dataFlow.framework@java_stub)" version="-1" />
  <import index="3" modelUID="f:java_stub#java.util(java.util@java_stub)" version="-1" />
  <import index="4" modelUID="f:java_stub#jetbrains.mps.lang.dataFlow.framework.instructions(jetbrains.mps.lang.dataFlow.framework.instructions@java_stub)" version="-1" />
  <import index="5" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" />
  <import index="6" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="1" />
  <import index="7" modelUID="f:java_stub#org.jetbrains.annotations(org.jetbrains.annotations@java_stub)" version="-1" />
  <import index="8" modelUID="f:java_stub#jetbrains.mps.lang.dataFlow(jetbrains.mps.lang.dataFlow@java_stub)" version="-1" />
  <import index="9" modelUID="r:00000000-0000-4000-0000-011c895902c0(jetbrains.mps.baseLanguage.behavior)" version="-1" />
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1230465993863">
    <property name="name" value="NullableAnalyzer" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1230465993864" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1230465993865">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1230465993866" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1230465993867" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1230465993868" />
    </node>
    <node role="implementedInterface" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1230466377843">
      <link role="classifier" targetNodeId="1.~DataFlowAnalyzer" resolveInfo="DataFlowAnalyzer" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.collections.structure.MapType" id="1230466804321">
        <node role="valueType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1230466816090">
          <link role="classifier" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
        </node>
        <node role="keyType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1230542056782">
          <link role="typeVariableDeclaration" targetNodeId="1230541617901" resolveInfo="T" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1230466514668">
      <property name="name" value="getDirection" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1230466514669" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1230466514670">
        <link role="classifier" targetNodeId="1.~AnalysisDirection" resolveInfo="AnalysisDirection" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1230466514671">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1230466539112">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1230466549222">
            <link role="enumConstantDeclaration" targetNodeId="1.~AnalysisDirection.FORWARD" resolveInfo="FORWARD" />
            <link role="enumClass" targetNodeId="1.~AnalysisDirection" resolveInfo="AnalysisDirection" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1230466518110">
      <property name="name" value="initial" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1230466518111" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.collections.structure.MapType" id="1230466827046">
        <node role="keyType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1230542066658">
          <link role="typeVariableDeclaration" targetNodeId="1230541617901" resolveInfo="T" />
        </node>
        <node role="valueType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1230466835128">
          <link role="classifier" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1230466518114">
        <property name="name" value="program" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1230466518115">
          <link role="classifier" targetNodeId="1.~Program" resolveInfo="Program" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1230466518116">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1230466961134">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1230466961135">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.MapType" id="1230466961136">
              <node role="keyType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1230542069140">
                <link role="typeVariableDeclaration" targetNodeId="1230541617901" resolveInfo="T" />
              </node>
              <node role="valueType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1230467008883">
                <link role="classifier" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1230466982124">
              <node role="creator" type="jetbrains.mps.baseLanguage.collections.structure.HashMapCreator" id="1230466985251">
                <node role="valueType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1230467000099">
                  <link role="classifier" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
                </node>
                <node role="keyType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1230542073494">
                  <link role="typeVariableDeclaration" targetNodeId="1230541617901" resolveInfo="T" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.collections.structure.ForEachStatement" id="1230467013463">
          <node role="variable" type="jetbrains.mps.baseLanguage.collections.structure.ForEachVariable" id="1230467013464">
            <property name="name" value="var" />
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1230467019908">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1230467018812">
              <link role="variableDeclaration" targetNodeId="1230466518114" resolveInfo="p0" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1230467023833">
              <link role="baseMethodDeclaration" targetNodeId="1.~Program.getVariables():java.util.Set" resolveInfo="getVariables" />
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1230467013466">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1230467043101">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1230467062540">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1230467077129">
                  <link role="enumConstantDeclaration" targetNodeId="1230466601089" resolveInfo="NOT_INIT" />
                  <link role="enumClass" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.collections.structure.MapElement" id="1230467046103">
                  <node role="key" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1230542090478">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1230542090479">
                      <node role="expression" type="jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference" id="1230542090480">
                        <link role="variable" targetNodeId="1230467013464" resolveInfo="var" />
                      </node>
                      <node role="type" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1230542096650">
                        <link role="typeVariableDeclaration" targetNodeId="1230541617901" resolveInfo="T" />
                      </node>
                    </node>
                  </node>
                  <node role="map" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1230467043102">
                    <link role="variableDeclaration" targetNodeId="1230466961135" resolveInfo="result" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1230466930376">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1230467084368">
            <link role="variableDeclaration" targetNodeId="1230466961135" resolveInfo="result" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1230466520789">
      <property name="name" value="merge" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1230466520790" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1230466520793">
        <property name="name" value="program" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1230466520794">
          <link role="classifier" targetNodeId="1.~Program" resolveInfo="Program" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1230466520795">
        <property name="name" value="values" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1230466520796">
          <link role="classifier" targetNodeId="3.~Set" resolveInfo="Set" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.collections.structure.MapType" id="1230492610737">
            <node role="keyType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1230542116437">
              <link role="typeVariableDeclaration" targetNodeId="1230541617901" resolveInfo="T" />
            </node>
            <node role="valueType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1230492610739">
              <link role="classifier" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.collections.structure.MapType" id="1230492606047">
        <node role="keyType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1230542100881">
          <link role="typeVariableDeclaration" targetNodeId="1230541617901" resolveInfo="T" />
        </node>
        <node role="valueType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1230492606049">
          <link role="classifier" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1230492713175">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1230492993908">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1230492993909">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.MapType" id="1230492993910">
              <node role="keyType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1230542120503">
                <link role="typeVariableDeclaration" targetNodeId="1230541617901" resolveInfo="T" />
              </node>
              <node role="valueType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1230493027633">
                <link role="classifier" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1230493039323">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1230493039324">
                <link role="baseMethodDeclaration" targetNodeId="1230466518110" resolveInfo="initial" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1230493041717">
                  <link role="variableDeclaration" targetNodeId="1230466520793" resolveInfo="programm" />
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1230493039325" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.collections.structure.ForEachStatement" id="1230492885375">
          <node role="variable" type="jetbrains.mps.baseLanguage.collections.structure.ForEachVariable" id="1230492885376">
            <property name="name" value="var" />
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1230492901507">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1230492899646">
              <link role="variableDeclaration" targetNodeId="1230466520793" resolveInfo="programm" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1230492904339">
              <link role="baseMethodDeclaration" targetNodeId="1.~Program.getVariables():java.util.Set" resolveInfo="getVariables" />
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1230492885378">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1230492922388">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1230492922389">
                <property name="name" value="variable" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1230542170875">
                  <link role="typeVariableDeclaration" targetNodeId="1230541617901" resolveInfo="T" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1230492939330">
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1230542174768">
                    <link role="typeVariableDeclaration" targetNodeId="1230541617901" resolveInfo="T" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference" id="1230492941286">
                    <link role="variable" targetNodeId="1230492885376" resolveInfo="var" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.collections.structure.ForEachStatement" id="1230493300403">
              <node role="variable" type="jetbrains.mps.baseLanguage.collections.structure.ForEachVariable" id="1230493300404">
                <property name="name" value="value" />
              </node>
              <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1230493309674">
                <link role="variableDeclaration" targetNodeId="1230466520795" resolveInfo="values" />
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1230493300406">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1230493315910">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1230493315911">
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1230493315912">
                      <node role="operand" type="jetbrains.mps.baseLanguage.collections.structure.MapElement" id="1230493315913">
                        <node role="key" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1230493315914">
                          <link role="variableDeclaration" targetNodeId="1230492922389" resolveInfo="variable" />
                        </node>
                        <node role="map" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1230493315915">
                          <link role="variableDeclaration" targetNodeId="1230492993909" resolveInfo="result" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1230493315916">
                        <link role="baseMethodDeclaration" targetNodeId="1230493082402" resolveInfo="merge" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.collections.structure.MapElement" id="1230493327021">
                          <node role="map" type="jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference" id="1230493320237">
                            <link role="variable" targetNodeId="1230493300404" resolveInfo="value" />
                          </node>
                          <node role="key" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1230493333595">
                            <link role="variableDeclaration" targetNodeId="1230492922389" resolveInfo="variable" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="lValue" type="jetbrains.mps.baseLanguage.collections.structure.MapElement" id="1230493315917">
                      <node role="map" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1230493315918">
                        <link role="variableDeclaration" targetNodeId="1230492993909" resolveInfo="result" />
                      </node>
                      <node role="key" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1230493315919">
                        <link role="variableDeclaration" targetNodeId="1230492922389" resolveInfo="variable" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1230493340693">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1230493342508">
            <link role="variableDeclaration" targetNodeId="1230492993909" resolveInfo="result" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1230466891926">
      <property name="name" value="fun" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1230466891927" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.collections.structure.MapType" id="1230466891928">
        <node role="keyType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1230542181583">
          <link role="typeVariableDeclaration" targetNodeId="1230541617901" resolveInfo="T" />
        </node>
        <node role="valueType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1230466891930">
          <link role="classifier" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1230466891931">
        <property name="name" value="input" />
        <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.MapType" id="1230466891932">
          <node role="keyType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1230542186906">
            <link role="typeVariableDeclaration" targetNodeId="1230541617901" resolveInfo="T" />
          </node>
          <node role="valueType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1230466891934">
            <link role="classifier" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1230466891935">
        <property name="name" value="state" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1230466891936">
          <link role="classifier" targetNodeId="1.~ProgramState" resolveInfo="ProgramState" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1230466891937">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1230491608553">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1230491608554">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.MapType" id="1230491652621">
              <node role="keyType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1230542192072">
                <link role="typeVariableDeclaration" targetNodeId="1230541617901" resolveInfo="T" />
              </node>
              <node role="valueType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1230491652623">
                <link role="classifier" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1230491736812">
              <node role="creator" type="jetbrains.mps.baseLanguage.collections.structure.HashMapCreator" id="1230491746193">
                <node role="keyType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1230542196700">
                  <link role="typeVariableDeclaration" targetNodeId="1230541617901" resolveInfo="T" />
                </node>
                <node role="valueType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1230491778369">
                  <link role="classifier" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1230491828707">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1230491845234">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1230491828708">
              <link role="variableDeclaration" targetNodeId="1230491608554" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1230491857784">
              <link role="baseMethodDeclaration" targetNodeId="3.~Map.putAll(java.util.Map):void" resolveInfo="putAll" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1230491860316">
                <link role="variableDeclaration" targetNodeId="1230466891931" resolveInfo="input" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1230491521744">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.InstanceOfExpression" id="1230491534826">
            <node role="classType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1230491583316">
              <link role="classifier" targetNodeId="4.~WriteInstruction" resolveInfo="WriteInstruction" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1230491904230">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1230491525857">
                <link role="variableDeclaration" targetNodeId="1230466891935" resolveInfo="p1" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1230491908264">
                <link role="baseMethodDeclaration" targetNodeId="1.~ProgramState.getInstruction():jetbrains.mps.lang.dataFlow.framework.instructions.Instruction" resolveInfo="getInstruction" />
              </node>
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1230491521746">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1230491884861">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1230491884862">
                <property name="name" value="write" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1230491884863">
                  <link role="classifier" targetNodeId="4.~WriteInstruction" resolveInfo="WriteInstruction" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1230491891475">
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1230491891476">
                    <link role="classifier" targetNodeId="4.~WriteInstruction" resolveInfo="WriteInstruction" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1230491911781">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1230491893619">
                      <link role="variableDeclaration" targetNodeId="1230466891935" resolveInfo="state" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1230491913534">
                      <link role="baseMethodDeclaration" targetNodeId="1.~ProgramState.getInstruction():jetbrains.mps.lang.dataFlow.framework.instructions.Instruction" resolveInfo="getInstruction" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1230491974265">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1230491974266">
                <property name="name" value="value" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1230491980837">
                  <link role="classifier" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1230491988652">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1230491988653">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1230491988654">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1230491988655">
                        <link role="variableDeclaration" targetNodeId="1230491884862" resolveInfo="write" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1230491988656">
                        <link role="baseMethodDeclaration" targetNodeId="4.~WriteInstruction.getValue():java.lang.Object" resolveInfo="getValue" />
                      </node>
                    </node>
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1230491988657">
                      <link role="classifier" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1230492654783">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1230492654784">
                <property name="name" value="variable" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1230542204589">
                  <link role="typeVariableDeclaration" targetNodeId="1230541617901" resolveInfo="T" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1230492654787">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1230492654788">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1230492654789">
                      <link role="variableDeclaration" targetNodeId="1230491884862" resolveInfo="write" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1230492654790">
                      <link role="baseMethodDeclaration" targetNodeId="4.~WriteInstruction.getVariable():java.lang.Object" resolveInfo="getVariable" />
                    </node>
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1230542208380">
                    <link role="typeVariableDeclaration" targetNodeId="1230541617901" resolveInfo="T" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1230491997883">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1230492002373">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1230492004329" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1230492000075">
                  <link role="variableDeclaration" targetNodeId="1230491974266" resolveInfo="value" />
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1230492027937">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1230492028813">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1230492028814">
                    <node role="lValue" type="jetbrains.mps.baseLanguage.collections.structure.MapElement" id="1230492028816">
                      <node role="map" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1230492028817">
                        <link role="variableDeclaration" targetNodeId="1230491608554" resolveInfo="result" />
                      </node>
                      <node role="key" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1230492635953">
                        <link role="variableDeclaration" targetNodeId="1230492654784" resolveInfo="variable" />
                      </node>
                    </node>
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1230492056138">
                      <link role="enumConstantDeclaration" targetNodeId="1230466696500" resolveInfo="UNKNOWN" />
                      <link role="enumClass" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1230492036402">
                <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1230492036403">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1230492037560">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1230492037561">
                      <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1230492037562">
                        <link role="variableDeclaration" targetNodeId="1230491974266" resolveInfo="value" />
                      </node>
                      <node role="lValue" type="jetbrains.mps.baseLanguage.collections.structure.MapElement" id="1230492037563">
                        <node role="map" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1230492037564">
                          <link role="variableDeclaration" targetNodeId="1230491608554" resolveInfo="result" />
                        </node>
                        <node role="key" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1230492665156">
                          <link role="variableDeclaration" targetNodeId="1230492654784" resolveInfo="variable" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1230491864166">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1230491867621">
            <link role="variableDeclaration" targetNodeId="1230491608554" resolveInfo="result" />
          </node>
        </node>
      </node>
    </node>
    <node role="typeVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration" id="1230541617901">
      <property name="name" value="T" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.EnumClass" id="1230466569958">
    <property name="name" value="NullableVariableState" />
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1230493082402">
      <property name="name" value="merge" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1230493089015">
        <link role="classifier" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1230493082404" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1230493082405">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1230493110877">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1230493110879">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1230493143438">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1230493146455">
                <link role="variableDeclaration" targetNodeId="1230493096297" resolveInfo="state" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1230493125775">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1230493119834" />
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1230493126638">
              <link role="baseMethodDeclaration" targetNodeId="5.~Object.equals(java.lang.Object):boolean" resolveInfo="equals" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1230493140671">
                <link role="enumConstantDeclaration" targetNodeId="1230466601089" resolveInfo="NOT_INIT" />
                <link role="enumClass" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1230493264152">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1230493264153">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1230493264154">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1230493275599" />
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1230493264156">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1230493270551">
              <link role="variableDeclaration" targetNodeId="1230493096297" resolveInfo="state" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1230493264158">
              <link role="baseMethodDeclaration" targetNodeId="5.~Object.equals(java.lang.Object):boolean" resolveInfo="equals" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1230493264159">
                <link role="enumClass" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
                <link role="enumConstantDeclaration" targetNodeId="1230466601089" resolveInfo="NOT_INIT" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1230493182407">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1230493182408">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1230493194355">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1230493196310" />
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1230493189037">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1230493187505" />
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1230493189431">
              <link role="baseMethodDeclaration" targetNodeId="5.~Object.equals(java.lang.Object):boolean" resolveInfo="equals" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1230493192557">
                <link role="variableDeclaration" targetNodeId="1230493096297" resolveInfo="state" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1230550762807">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1230550762808">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1230550835720">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1230550846050">
                <link role="enumClass" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
                <link role="enumConstantDeclaration" targetNodeId="1230466696500" resolveInfo="UNKNOWN" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1230550809866">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1230550815839">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1230550812588" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1230550818998">
                <link role="baseMethodDeclaration" targetNodeId="5.~Object.equals(java.lang.Object):boolean" resolveInfo="equals" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1230550833328">
                  <link role="enumConstantDeclaration" targetNodeId="1230550705523" resolveInfo="NOT_NULL" />
                  <link role="enumClass" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
                </node>
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1230550772094">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1230550767999">
                <link role="variableDeclaration" targetNodeId="1230493096297" resolveInfo="state" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1230550779472">
                <link role="baseMethodDeclaration" targetNodeId="5.~Object.equals(java.lang.Object):boolean" resolveInfo="equals" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1230550798880">
                  <link role="enumConstantDeclaration" targetNodeId="1230466696500" resolveInfo="UNKNOWN" />
                  <link role="enumClass" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1230550854380">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1230550854381">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1230550854382">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1230550854383">
                <link role="enumClass" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
                <link role="enumConstantDeclaration" targetNodeId="1230466696500" resolveInfo="UNKNOWN" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1230550854384">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1230550854385">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1230550854386" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1230550854387">
                <link role="baseMethodDeclaration" targetNodeId="5.~Object.equals(java.lang.Object):boolean" resolveInfo="equals" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1230550868520">
                  <link role="enumConstantDeclaration" targetNodeId="1230466696500" resolveInfo="UNKNOWN" />
                  <link role="enumClass" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
                </node>
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1230550854389">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1230550854390">
                <link role="variableDeclaration" targetNodeId="1230493096297" resolveInfo="state" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1230550854391">
                <link role="baseMethodDeclaration" targetNodeId="5.~Object.equals(java.lang.Object):boolean" resolveInfo="equals" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1230550861315">
                  <link role="enumConstantDeclaration" targetNodeId="1230550705523" resolveInfo="NOT_NULL" />
                  <link role="enumClass" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1230493203942">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1230493245119">
            <link role="enumClass" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
            <link role="enumConstantDeclaration" targetNodeId="1230466710001" resolveInfo="NULLABLE" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1230493096297">
        <property name="name" value="state" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1230493096298">
          <link role="classifier" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
        </node>
      </node>
    </node>
    <node role="enumConstant" type="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration" id="1230466601089">
      <property name="name" value="NOT_INIT" />
    </node>
    <node role="enumConstant" type="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration" id="1230466608293">
      <property name="name" value="NULL" />
    </node>
    <node role="enumConstant" type="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration" id="1230466696500">
      <property name="name" value="UNKNOWN" />
    </node>
    <node role="enumConstant" type="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration" id="1230550705523">
      <property name="name" value="NOT_NULL" />
    </node>
    <node role="enumConstant" type="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration" id="1230466710001">
      <property name="name" value="NULLABLE" />
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1230466569959" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1230466569960">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1230466569961" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1230466569962" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1230466569963" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1230553634583">
    <property name="name" value="NullableUtil" />
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1230553645870">
      <property name="name" value="getVariableStateByAnnotation" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1230553654890">
        <link role="classifier" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1230553645872" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1230553645873">
        <node role="statement" type="jetbrains.mps.baseLanguage.collections.structure.ForEachStatement" id="1230553832692">
          <node role="variable" type="jetbrains.mps.baseLanguage.collections.structure.ForEachVariable" id="1230553832693">
            <property name="name" value="annotation" />
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1230553841901">
            <link role="variableDeclaration" targetNodeId="1230553679126" resolveInfo="annotations" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1230553832695">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1230553844418">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1230554151902">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1230553858836">
                  <node role="operand" type="jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference" id="1230553847093">
                    <link role="variable" targetNodeId="1230553832693" resolveInfo="annotation" />
                  </node>
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1230553874480">
                    <link role="link" targetNodeId="6.1188208074048" />
                  </node>
                </node>
                <node role="rightExpression" type="jetbrains.mps.lang.smodel.structure.NodeRefExpression" id="1230554156015">
                  <link role="referentNode" targetNodeId="7.~Nullable" resolveInfo="Nullable" />
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1230553844420">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1230554080866">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1230554096950">
                    <link role="enumConstantDeclaration" targetNodeId="1230466710001" resolveInfo="NULLABLE" />
                    <link role="enumClass" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1230554107781">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1230554107787">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1230554107788">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1230554132040">
                    <link role="enumConstantDeclaration" targetNodeId="1230550705523" resolveInfo="NOT_NULL" />
                    <link role="enumClass" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1230554176847">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1230554176848">
                  <node role="operand" type="jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference" id="1230554176849">
                    <link role="variable" targetNodeId="1230553832693" resolveInfo="annotation" />
                  </node>
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1230554176850">
                    <link role="link" targetNodeId="6.1188208074048" />
                  </node>
                </node>
                <node role="rightExpression" type="jetbrains.mps.lang.smodel.structure.NodeRefExpression" id="1230554176851">
                  <link role="referentNode" targetNodeId="7.~NotNull" resolveInfo="NotNull" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1230554191306">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1230554212388">
            <link role="enumConstantDeclaration" targetNodeId="1230466696500" resolveInfo="UNKNOWN" />
            <link role="enumClass" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1230553679126">
        <property name="name" value="annotations" />
        <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeListType" id="1230553679127">
          <link role="elementConcept" targetNodeId="6.1188207840427" resolveInfo="AnnotationInstance" />
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1231870916113">
      <property name="name" value="getVariableReferenceStates" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.collections.structure.MapType" id="1231871156886">
        <node role="keyType" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1231871160342">
          <link role="concept" targetNodeId="6.1068581242866" resolveInfo="LocalVariableReference" />
        </node>
        <node role="valueType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1231871171015">
          <link role="classifier" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1231870916115" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1231870916116">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1231871578289">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1231871578290">
            <property name="name" value="p" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1231871578291">
              <link role="classifier" targetNodeId="1.~Program" resolveInfo="Program" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231871635452">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1231871634045">
                <link role="baseMethodDeclaration" targetNodeId="8.~DataFlowManager.getInstance():jetbrains.mps.lang.dataFlow.DataFlowManager" resolveInfo="getInstance" />
                <link role="classConcept" targetNodeId="8.~DataFlowManager" resolveInfo="DataFlowManager" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1231871638455">
                <link role="baseMethodDeclaration" targetNodeId="8.~DataFlowManager.buildProgramFor(jetbrains.mps.smodel.SNode):jetbrains.mps.lang.dataFlow.framework.Program" resolveInfo="buildProgramFor" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1231871641878">
                  <link role="variableDeclaration" targetNodeId="1231871529083" resolveInfo="node" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1231872040911">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1231872040912">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.MapType" id="1231872040913">
              <node role="keyType" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1231872043369">
                <link role="concept" targetNodeId="6.1068581242866" resolveInfo="LocalVariableReference" />
              </node>
              <node role="valueType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1231872080667">
                <link role="classifier" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1231872103201">
              <node role="creator" type="jetbrains.mps.baseLanguage.collections.structure.HashMapCreator" id="1231872103202">
                <node role="keyType" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1231872103203">
                  <link role="concept" targetNodeId="6.1068581242866" resolveInfo="LocalVariableReference" />
                </node>
                <node role="valueType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1231872103204">
                  <link role="classifier" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1231871732743">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1231871732744">
            <property name="name" value="analysisResult" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1231871732745">
              <link role="classifier" targetNodeId="1.~AnalysisResult" resolveInfo="AnalysisResult" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.collections.structure.MapType" id="1231871739685">
                <node role="keyType" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1231871739686" />
                <node role="valueType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1231871739687">
                  <link role="classifier" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
                </node>
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231871747955">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1231871747956">
                <link role="variableDeclaration" targetNodeId="1231871578290" resolveInfo="p" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1231871747957">
                <link role="baseMethodDeclaration" targetNodeId="1.~Program.analyze(jetbrains.mps.lang.dataFlow.framework.DataFlowAnalyzer):jetbrains.mps.lang.dataFlow.framework.AnalysisResult" resolveInfo="analyze" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1231871747958">
                  <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1231871747959">
                    <link role="baseMethodDeclaration" targetNodeId="1230465993865" resolveInfo="NullableAnalyzer" />
                    <node role="typeParameter" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1231871747960" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.collections.structure.ForEachStatement" id="1231871802706">
          <node role="variable" type="jetbrains.mps.baseLanguage.collections.structure.ForEachVariable" id="1231871802707">
            <property name="name" value="reference" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1231871802709">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1231932591684">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1231932591685">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1231932639301">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1231932639302">
                    <property name="name" value="instruction" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1231932639303">
                      <link role="classifier" targetNodeId="4.~Instruction" resolveInfo="Instruction" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231932639304">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231932639305">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1231932639306">
                          <link role="variableDeclaration" targetNodeId="1231871578290" resolveInfo="p" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1231932639307">
                          <link role="baseMethodDeclaration" targetNodeId="1.~Program.getInstructionsFor(java.lang.Object):java.util.List" resolveInfo="getInstructionsFor" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference" id="1231932639308">
                            <link role="variable" targetNodeId="1231871802707" resolveInfo="reference" />
                          </node>
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1231932639309">
                        <link role="baseMethodDeclaration" targetNodeId="3.~List.get(int):java.lang.Object" resolveInfo="get" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1231932639310">
                          <property name="value" value="0" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1231932656430">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1231932656431">
                    <node role="lValue" type="jetbrains.mps.baseLanguage.collections.structure.MapElement" id="1231932656432">
                      <node role="key" type="jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference" id="1231932656433">
                        <link role="variable" targetNodeId="1231871802707" resolveInfo="reference" />
                      </node>
                      <node role="map" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1231932656434">
                        <link role="variableDeclaration" targetNodeId="1231872040912" resolveInfo="result" />
                      </node>
                    </node>
                    <node role="rValue" type="jetbrains.mps.baseLanguage.collections.structure.MapElement" id="1231932656435">
                      <node role="key" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231934216542">
                        <node role="operand" type="jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference" id="1231932656436">
                          <link role="variable" targetNodeId="1231871802707" resolveInfo="reference" />
                        </node>
                        <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1231934220083">
                          <link role="link" targetNodeId="6.1070568296581" />
                        </node>
                      </node>
                      <node role="map" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231932656437">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1231932656438">
                          <link role="variableDeclaration" targetNodeId="1231871732744" resolveInfo="analysisResult" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1231932656439">
                          <link role="baseMethodDeclaration" targetNodeId="1.~AnalysisResult.get(jetbrains.mps.lang.dataFlow.framework.instructions.Instruction):java.lang.Object" resolveInfo="get" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1231932656440">
                            <link role="variableDeclaration" targetNodeId="1231932639302" resolveInfo="instruction" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1231932632866">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231932632867">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231932632868">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1231932632869">
                      <link role="variableDeclaration" targetNodeId="1231871578290" resolveInfo="p" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1231932632870">
                      <link role="baseMethodDeclaration" targetNodeId="1.~Program.getInstructionsFor(java.lang.Object):java.util.List" resolveInfo="getInstructionsFor" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference" id="1231932632871">
                        <link role="variable" targetNodeId="1231871802707" resolveInfo="reference" />
                      </node>
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1231932632872">
                    <link role="baseMethodDeclaration" targetNodeId="3.~List.isEmpty():boolean" resolveInfo="isEmpty" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231871819463">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1231871812914">
              <link role="variableDeclaration" targetNodeId="1231871529083" resolveInfo="node" />
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_GetDescendantsOperation" id="1231871830608">
              <node role="parameter" type="jetbrains.mps.lang.smodel.structure.OperationParm_Concept" id="1231871830609">
                <node role="conceptArgument" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" id="1231871909068">
                  <link role="conceptDeclaration" targetNodeId="6.1068581242866" resolveInfo="LocalVariableReference" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1231872117115">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1231872119070">
            <link role="variableDeclaration" targetNodeId="1231872040912" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1231871529083">
        <property name="name" value="node" />
        <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1231871529084" />
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1231939371846">
      <property name="name" value="getBadNullableProblems" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1231939371848" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1231939371849">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1231939507480">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1231939507481">
            <property name="name" value="analizysResult" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1231939507482">
              <link role="classifier" targetNodeId="1231930009973" resolveInfo="NullableAnalysisResult" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1231939573096">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1231939573097">
                <link role="baseMethodDeclaration" targetNodeId="1231930009975" resolveInfo="NullableAnalysisResult" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1231939650251">
                  <link role="variableDeclaration" targetNodeId="1231939437805" resolveInfo="node" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1231939697727">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231939985554">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1231939984272">
              <link role="variableDeclaration" targetNodeId="1231939507481" resolveInfo="analizysResult" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1231939987010">
              <link role="baseMethodDeclaration" targetNodeId="1231939943205" resolveInfo="checkNodes" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1231939992605">
                <link role="variableDeclaration" targetNodeId="1231939437805" resolveInfo="node" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.lang.smodel.structure.SNodeListType" id="1231939385194" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1231939437805">
        <property name="name" value="node" />
        <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1231939437806">
          <link role="concept" targetNodeId="6.1068580123136" resolveInfo="StatementList" />
        </node>
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1230553634584" />
  </node>
  <visible index="2" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" />
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1231930009973">
    <property name="name" value="NullableAnalysisResult" />
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1231930352029">
      <property name="name" value="checkNode" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1231940222214" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1231930352032">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1231930491768">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1231930491769">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1231940126853">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231940126854">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1231940126855">
                  <link role="baseMethodDeclaration" targetNodeId="1231930527015" resolveInfo="isBadAssignment" />
                  <node role="actualArgument" type="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" id="1231940126856">
                    <link role="concept" targetNodeId="6.1068498886294" resolveInfo="AssignmentExpression" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1231940126857">
                      <link role="variableDeclaration" targetNodeId="1231930372631" resolveInfo="node" />
                    </node>
                  </node>
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1231940126858" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231930496351">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1231930495366">
              <link role="variableDeclaration" targetNodeId="1231930372631" resolveInfo="node" />
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" id="1231930499995">
              <node role="conceptArgument" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" id="1231930503215">
                <link role="conceptDeclaration" targetNodeId="6.1068498886294" resolveInfo="AssignmentExpression" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1231937997163">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1231937997164">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1231940132629">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231940132630">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1231940132631" />
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1231940132632">
                  <link role="baseMethodDeclaration" targetNodeId="1231938088663" resolveInfo="isBadMethodCall" />
                  <node role="actualArgument" type="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" id="1231940132633">
                    <link role="concept" targetNodeId="6.1204053956946" resolveInfo="IMethodCall" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1231940132634">
                      <link role="variableDeclaration" targetNodeId="1231930372631" resolveInfo="node" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231938000825">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1231937999777">
              <link role="variableDeclaration" targetNodeId="1231930372631" resolveInfo="node" />
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" id="1231938002968">
              <node role="conceptArgument" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" id="1231938013938">
                <link role="conceptDeclaration" targetNodeId="6.1204053956946" resolveInfo="IMethodCall" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1231942169567">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1231942169568">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1231942169569">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231942169570">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1231942169571" />
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1231942169572">
                  <link role="baseMethodDeclaration" targetNodeId="1231942194677" resolveInfo="checkDotExpression" />
                  <node role="actualArgument" type="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" id="1231942169573">
                    <link role="concept" targetNodeId="6.1197027756228" resolveInfo="DotExpression" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1231942169574">
                      <link role="variableDeclaration" targetNodeId="1231930372631" resolveInfo="node" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231942169575">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1231942169576">
              <link role="variableDeclaration" targetNodeId="1231930372631" resolveInfo="node" />
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" id="1231942169577">
              <node role="conceptArgument" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" id="1231942189550">
                <link role="conceptDeclaration" targetNodeId="6.1197027756228" resolveInfo="DotExpression" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1231940103363" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1231930372631">
        <property name="name" value="node" />
        <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1231930372632" />
        <node role="annotation" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance" id="1231931027022">
          <link role="annotation" targetNodeId="7.~NotNull" resolveInfo="NotNull" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1231930527015">
      <property name="name" value="checkAssignment" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1231940139325" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1231940226873" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1231930527018">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1231931409555">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1231931409556">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1231940156114">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231940157166">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231940156115">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1231940156116">
                    <link role="fieldDeclaration" targetNodeId="1231939899060" resolveInfo="myCheckResults" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1231940156117" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.AddElementOperation" id="1231940159373">
                  <node role="argument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1231940163689">
                    <link role="variableDeclaration" targetNodeId="1231930539192" resolveInfo="assignment" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231931562454">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1231931562455">
              <link role="baseMethodDeclaration" targetNodeId="1231931413918" resolveInfo="badAssignment" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231940943841">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231940937008">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1231940937009">
                    <link role="variableDeclaration" targetNodeId="1231930539192" resolveInfo="assignment" />
                  </node>
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1231940937010">
                    <link role="link" targetNodeId="6.1068498886295" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall" id="1231940945986">
                  <link role="baseMethodDeclaration" targetNodeId="9.1230540989695" resolveInfo="getNullableState" />
                </node>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231940917888">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1231940917889">
                  <link role="baseMethodDeclaration" targetNodeId="1231931064678" resolveInfo="getNodeState" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231940917890">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1231940917891">
                      <link role="variableDeclaration" targetNodeId="1231930539192" resolveInfo="assignment" />
                    </node>
                    <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1231940927912">
                      <link role="link" targetNodeId="6.1068498886297" />
                    </node>
                  </node>
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1231940917893" />
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1231931562456" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1231930539192">
        <property name="name" value="assignment" />
        <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1231930539193">
          <link role="concept" targetNodeId="6.1068498886294" resolveInfo="AssignmentExpression" />
        </node>
        <node role="annotation" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance" id="1231931012803">
          <link role="annotation" targetNodeId="7.~NotNull" resolveInfo="NotNull" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1231938088663">
      <property name="name" value="checkMethodCall" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1231940143405" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1231940229610" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1231938088666">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1231938305260">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1231938305261">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1231938344739">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1231938344740">
                <property name="name" value="parameter" />
                <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1231938344741">
                  <link role="concept" targetNodeId="6.1068498886292" resolveInfo="ParameterDeclaration" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231938444600">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231938365825">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231938359639">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231938356463">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1231938354430">
                          <link role="variableDeclaration" targetNodeId="1231938102594" resolveInfo="call" />
                        </node>
                        <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1231938358137">
                          <link role="link" targetNodeId="6.1068499141037" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1231938363308">
                        <link role="link" targetNodeId="6.1068580123134" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.ToListOperation" id="1231938442551" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetElementOperation" id="1231938446588">
                    <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1231938449763">
                      <link role="variableDeclaration" targetNodeId="1231938305263" resolveInfo="i" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1231938455642">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1231938455643">
                <property name="name" value="expression" />
                <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1231938455644">
                  <link role="concept" targetNodeId="6.1068431790191" resolveInfo="Expression" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231938476501">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231938472559">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231938466241">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1231938465334">
                        <link role="variableDeclaration" targetNodeId="1231938102594" resolveInfo="call" />
                      </node>
                      <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1231938470948">
                        <link role="link" targetNodeId="6.1068499141038" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.ToListOperation" id="1231938475702" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetElementOperation" id="1231938477036">
                    <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1231938479133">
                      <link role="variableDeclaration" targetNodeId="1231938305263" resolveInfo="i" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1231941117764">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1231941117765">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1231941486482">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231941487534">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231941486483">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1231941486484">
                        <link role="fieldDeclaration" targetNodeId="1231939899060" resolveInfo="myCheckResults" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1231941486485" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.AddElementOperation" id="1231941491523">
                      <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1231941493433">
                        <link role="variableDeclaration" targetNodeId="1231938455643" resolveInfo="expression" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231941133316">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1231941133317">
                  <link role="baseMethodDeclaration" targetNodeId="1231931413918" resolveInfo="badAssignment" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1231941426601">
                    <link role="baseMethodDeclaration" targetNodeId="1230553645870" resolveInfo="getVariableStateByAnnotation" />
                    <link role="classConcept" targetNodeId="1230553634583" resolveInfo="NullableUtil" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231941439886">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1231941439056">
                        <link role="variableDeclaration" targetNodeId="1231938344740" resolveInfo="parameter" />
                      </node>
                      <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1231941444562">
                        <link role="link" targetNodeId="6.1188208488637" />
                      </node>
                    </node>
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231941473257">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1231941473258">
                      <link role="baseMethodDeclaration" targetNodeId="1231931064678" resolveInfo="getNodeState" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1231941476417">
                        <link role="variableDeclaration" targetNodeId="1231938455643" resolveInfo="expression" />
                      </node>
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1231941473259" />
                  </node>
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1231941133318" />
              </node>
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1231938305263">
            <property name="name" value="i" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1231938306218" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1231938309923">
              <property name="value" value="0" />
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1231938315472">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1231938312487">
              <link role="variableDeclaration" targetNodeId="1231938305263" resolveInfo="i" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231938326605">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231938322742">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1231938320538">
                  <link role="variableDeclaration" targetNodeId="1231938102594" resolveInfo="call" />
                </node>
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1231938325667">
                  <link role="link" targetNodeId="6.1068499141038" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetSizeOperation" id="1231938329390" />
            </node>
          </node>
          <node role="iteration" type="jetbrains.mps.baseLanguage.structure.PostfixIncrementExpression" id="1231938332440">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1231938332441">
              <link role="variableDeclaration" targetNodeId="1231938305263" resolveInfo="i" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1231938102594">
        <property name="name" value="call" />
        <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1231938102595">
          <link role="concept" targetNodeId="6.1204053956946" resolveInfo="IMethodCall" />
        </node>
        <node role="annotation" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance" id="1231938134393">
          <link role="annotation" targetNodeId="7.~NotNull" resolveInfo="NotNull" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1231942194677">
      <property name="name" value="checkDotExpression" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1231942204688">
        <property name="name" value="call" />
        <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1231942207565">
          <link role="concept" targetNodeId="6.1197027756228" resolveInfo="DotExpression" />
        </node>
        <node role="annotation" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance" id="1231942218832">
          <link role="annotation" targetNodeId="7.~NotNull" resolveInfo="NotNull" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1231942194678" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1231942194679" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1231942194680">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1231942285378">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1231942285379">
            <property name="name" value="operand" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1231942285380">
              <link role="classifier" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231942404657">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1231942404658">
                <link role="baseMethodDeclaration" targetNodeId="1231931064678" resolveInfo="getNodeState" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231942408009">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1231942407303">
                    <link role="variableDeclaration" targetNodeId="1231942204688" resolveInfo="call" />
                  </node>
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1231942414905">
                    <link role="link" targetNodeId="6.1197027771414" />
                  </node>
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1231942404659" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1231942229318">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1231942308078">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1231942308079">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1231942308080">
                <link role="variableDeclaration" targetNodeId="1231942285379" resolveInfo="oprand" />
              </node>
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1231942308081">
                <link role="enumConstantDeclaration" targetNodeId="1230466710001" resolveInfo="NULLABLE" />
                <link role="enumClass" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
              </node>
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1231942312569">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1231942312570">
                <link role="variableDeclaration" targetNodeId="1231942285379" resolveInfo="oprand" />
              </node>
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1231942319448">
                <link role="enumConstantDeclaration" targetNodeId="1230466608293" resolveInfo="NULL" />
                <link role="enumClass" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
              </node>
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1231942229320">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1231942328106">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231942339936">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231942328107">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1231942328108">
                    <link role="fieldDeclaration" targetNodeId="1231939899060" resolveInfo="myCheckResults" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1231942328109" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.AddElementOperation" id="1231942342251">
                  <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231942506216">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1231942506217">
                      <link role="variableDeclaration" targetNodeId="1231942204688" resolveInfo="call" />
                    </node>
                    <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1231942506218">
                      <link role="link" targetNodeId="6.1197027771414" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1231931064678">
      <property name="name" value="getNodeState" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1231931076355">
        <link role="classifier" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1231940252830" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1231931064681">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1231931099139">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1231931099141">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1231931145978">
              <node role="expression" type="jetbrains.mps.baseLanguage.collections.structure.MapElement" id="1231931206582">
                <node role="key" type="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" id="1231931217825">
                  <link role="concept" targetNodeId="6.1068581242866" resolveInfo="LocalVariableReference" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1231931209416">
                    <link role="variableDeclaration" targetNodeId="1231931089012" resolveInfo="node" />
                  </node>
                </node>
                <node role="map" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231931150589">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1231931150590">
                    <link role="fieldDeclaration" targetNodeId="1231930135283" resolveInfo="result" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1231931150591" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1231932599959">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231931121566">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1231931120612">
                <link role="variableDeclaration" targetNodeId="1231931089012" resolveInfo="node" />
              </node>
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" id="1231931123585">
                <node role="conceptArgument" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" id="1231931144367">
                  <link role="conceptDeclaration" targetNodeId="6.1068581242866" resolveInfo="LocalVariableReference" />
                </node>
              </node>
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231932655702">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231932652432">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1231932652433">
                  <link role="fieldDeclaration" targetNodeId="1231930135283" resolveInfo="result" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1231932652434" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.ContainsKeyOperation" id="1231932664973">
                <node role="key" type="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" id="1231932671719">
                  <link role="concept" targetNodeId="6.1068581242866" resolveInfo="LocalVariableReference" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1231932668885">
                    <link role="variableDeclaration" targetNodeId="1231931089012" resolveInfo="node" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1231931226193">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231931232859">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1231931232231">
              <link role="variableDeclaration" targetNodeId="1231931089012" resolveInfo="node" />
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall" id="1231931299614">
              <link role="baseMethodDeclaration" targetNodeId="9.1230540989695" resolveInfo="getNullableState" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1231931089012">
        <property name="name" value="node" />
        <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1231931089013">
          <link role="concept" targetNodeId="6.1068431790191" resolveInfo="Expression" />
        </node>
        <node role="annotation" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance" id="1231931200409">
          <link role="annotation" targetNodeId="7.~NotNull" resolveInfo="NotNull" />
        </node>
      </node>
      <node role="annotation" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance" id="1231931157061">
        <link role="annotation" targetNodeId="7.~NotNull" resolveInfo="NotNull" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1231931413918">
      <property name="name" value="badAssignment" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1231931469323" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1231940256241" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1231931428519">
        <property name="name" value="lValue" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1231931428520">
          <link role="classifier" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
        </node>
        <node role="annotation" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance" id="1231931458024">
          <link role="annotation" targetNodeId="7.~NotNull" resolveInfo="NotNull" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1231931435193">
        <property name="name" value="rValue" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1231931445039">
          <link role="classifier" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
        </node>
        <node role="annotation" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance" id="1231931463338">
          <link role="annotation" targetNodeId="7.~NotNull" resolveInfo="NotNull" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1231931509288">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1231931509289">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1231931537805">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1231931664730">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1231931668266">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1231931664731">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1231931664733">
                    <link role="variableDeclaration" targetNodeId="1231931435193" resolveInfo="rValue" />
                  </node>
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1231931664732">
                    <link role="enumConstantDeclaration" targetNodeId="1230466710001" resolveInfo="NULLABLE" />
                    <link role="enumClass" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
                  </node>
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1231931673237">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1231931673238">
                    <link role="variableDeclaration" targetNodeId="1231931435193" resolveInfo="rValue" />
                  </node>
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1231931681709">
                    <link role="enumConstantDeclaration" targetNodeId="1230466608293" resolveInfo="NULL" />
                    <link role="enumClass" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
                  </node>
                </node>
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1231931519092">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1231931513901">
                <link role="variableDeclaration" targetNodeId="1231931428519" resolveInfo="lValue" />
              </node>
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1231936506916">
                <link role="enumConstantDeclaration" targetNodeId="1230550705523" resolveInfo="NOT_NULL" />
                <link role="enumClass" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1231939943205">
      <property name="name" value="checkNodes" />
      <node role="returnType" type="jetbrains.mps.lang.smodel.structure.SNodeListType" id="1231939963546" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1231940263962" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1231939943208">
        <node role="statement" type="jetbrains.mps.baseLanguage.collections.structure.ForEachStatement" id="1231939996221">
          <node role="variable" type="jetbrains.mps.baseLanguage.collections.structure.ForEachVariable" id="1231939996222">
            <property name="name" value="descendant" />
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231939996223">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1231940003743">
              <link role="variableDeclaration" targetNodeId="1231939949747" resolveInfo="list" />
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_GetDescendantsOperation" id="1231939996225">
              <node role="parameter" type="jetbrains.mps.lang.smodel.structure.OperationParm_Concept" id="1231939996226">
                <node role="conceptArgument" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" id="1231939996227">
                  <link role="conceptDeclaration" targetNodeId="2v.1133920641626" resolveInfo="BaseConcept" />
                </node>
              </node>
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1231939996228">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1231940038319">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231940038320">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1231940038321">
                  <link role="baseMethodDeclaration" targetNodeId="1231930352029" resolveInfo="isBadNode" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference" id="1231940039995">
                    <link role="variable" targetNodeId="1231939996222" resolveInfo="descendant" />
                  </node>
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1231940038322" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1231940047216">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231940048468">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1231940048470" />
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1231940064018">
              <link role="fieldDeclaration" targetNodeId="1231939899060" resolveInfo="nodes" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1231939949747">
        <property name="name" value="list" />
        <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1231939949748">
          <link role="concept" targetNodeId="6.1068580123136" resolveInfo="StatementList" />
        </node>
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1231930135283">
      <property name="name" value="myResult" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1231930135284" />
      <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.MapType" id="1231930137427">
        <node role="keyType" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1231930143586">
          <link role="concept" targetNodeId="6.1068581242866" resolveInfo="LocalVariableReference" />
        </node>
        <node role="valueType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1231930178666">
          <link role="classifier" targetNodeId="1230466569958" resolveInfo="NullableVariableState" />
        </node>
      </node>
      <node role="annotation" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance" id="1231930987921">
        <link role="annotation" targetNodeId="7.~NotNull" resolveInfo="NotNull" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1231939899060">
      <property name="name" value="myCheckResults" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1231939899061" />
      <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeListType" id="1231939901007" />
      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1231939907337">
        <node role="creator" type="jetbrains.mps.lang.smodel.structure.SNodeListCreator" id="1231939907338">
          <node role="createdType" type="jetbrains.mps.lang.smodel.structure.SNodeListType" id="1231939907339" />
        </node>
      </node>
      <node role="annotation" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance" id="1231939915215">
        <link role="annotation" targetNodeId="7.~NotNull" resolveInfo="NotNull" />
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1231930009974" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1231930009975">
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1231930084417">
        <property name="name" value="statementList" />
        <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1231930087653">
          <link role="concept" targetNodeId="6.1068580123136" resolveInfo="StatementList" />
        </node>
        <node role="annotation" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance" id="1231931034837">
          <link role="annotation" targetNodeId="7.~NotNull" resolveInfo="NotNull" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1231930009976" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1231930009977" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1231930009978">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1231930193169">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1231930194845">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1231930193170">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1231930193171">
                <link role="fieldDeclaration" targetNodeId="1231930135283" resolveInfo="result" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1231930193172" />
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1231930197754">
              <link role="classConcept" targetNodeId="1230553634583" resolveInfo="NullableUtil" />
              <link role="baseMethodDeclaration" targetNodeId="1231870916113" resolveInfo="getGetVariableReferenceStates" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1231930197755">
                <link role="variableDeclaration" targetNodeId="1231930084417" resolveInfo="statementList" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>


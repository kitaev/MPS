<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:00000000-0000-4000-0000-011c89590457(jetbrains.mps.samples.matrixLanguage.runtime)">
  <persistence version="3" />
  <refactoringHistory />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="7a5dda62-9140-4668-ab76-d5ed1746f2b2(jetbrains.mps.lang.typesystem)" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ae(jetbrains.mps.lang.typesystem.constraints)" version="17" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959028c(jetbrains.mps.lang.structure.constraints)" version="11" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590283(jetbrains.mps.lang.core.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590340(jetbrains.mps.lang.pattern.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902fb(jetbrains.mps.lang.smodel.constraints)" version="21" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590334(jetbrains.mps.baseLanguage.closures.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902db(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959033d(jetbrains.mps.lang.annotations.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590345(jetbrains.mps.lang.pattern.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902b4(jetbrains.mps.lang.typesystem.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895903fe(jetbrains.mps.baseLanguage.strings.constraints)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590402(jetbrains.mps.baseLanguage.strings.structure)" version="9" />
  <maxImportIndex value="2" />
  <import index="1" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" />
  <import index="2" modelUID="f:java_stub#java.io(java.io@java_stub)" version="-1" />
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1209978932613">
    <property name="name" value="Matrix" />
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1209981479321">
      <property name="name" value="values" />
      <property name="isFinal" value="false" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1209981514829">
        <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1209981515065">
          <node role="componentType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210153078358">
            <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1209981507889" />
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1210153297615">
      <property name="name" value="operations" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1210153297616" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210153300958">
        <link role="classifier" targetNodeId="1210153117710" resolveInfo="FieldOperations" />
        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210153303539">
          <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1209980434079">
      <property name="name" value="getValueAt" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210156348644">
        <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1209980434081" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209980434082">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1209980494407">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1209980510705">
            <node role="index" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1209980514117">
              <link role="variableDeclaration" targetNodeId="1209980467652" resolveInfo="column" />
            </node>
            <node role="array" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1209980504414">
              <node role="index" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1209980507325">
                <link role="variableDeclaration" targetNodeId="1209980465228" resolveInfo="row" />
              </node>
              <node role="array" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209980499925">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1209980502726">
                  <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1209980499927" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1209980465228">
        <property name="name" value="row" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1209980465229" />
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1209980467652">
        <property name="name" value="column" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1209980469060" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1209981406336">
      <property name="name" value="clone" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1209981552196">
        <link role="classifier" targetNodeId="1209978932613" resolveInfo="Matrix" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1209981406338" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209981406339">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1209981650583">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1209981650584">
            <property name="name" value="copy" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1209981656133">
              <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1209981656354">
                <node role="componentType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210153535649">
                  <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
                </node>
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1210157047576">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1210157047577">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1210157047578">
                  <node role="creator" type="jetbrains.mps.baseLanguage.structure.ArrayCreator" id="1210157047579">
                    <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210157047580">
                      <link role="classifier" targetNodeId="1.~Object" resolveInfo="Object" />
                    </node>
                    <node role="dimensionExpression" type="jetbrains.mps.baseLanguage.structure.DimensionExpression" id="1210157047581">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210157047582">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210157047583">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210157047584" />
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210157047585">
                            <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation" id="1210157047586" />
                      </node>
                    </node>
                    <node role="dimensionExpression" type="jetbrains.mps.baseLanguage.structure.DimensionExpression" id="1210157047587">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210157047588">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210157047589">
                          <node role="index" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210157047590">
                            <property name="value" value="0" />
                          </node>
                          <node role="array" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210157047591">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210157047592" />
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210157047593">
                              <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                            </node>
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation" id="1210157047594" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1210157047595">
                  <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1210157047596">
                    <node role="componentType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210157047597">
                      <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1209981753046">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209981753047">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1210153672195">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210153672196">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210153729345">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1210153729346">
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210153753837">
                      <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210153755020">
                        <link role="variableDeclaration" targetNodeId="1210153672198" resolveInfo="j" />
                      </node>
                      <node role="array" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210153729352">
                        <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210153729353">
                          <link role="variableDeclaration" targetNodeId="1209981753049" resolveInfo="i" />
                        </node>
                        <node role="array" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210153729354">
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210153729355">
                            <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                          </node>
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210153729356" />
                        </node>
                      </node>
                    </node>
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210153733669">
                      <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210153734068">
                        <link role="variableDeclaration" targetNodeId="1210153672198" resolveInfo="j" />
                      </node>
                      <node role="array" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210153729358">
                        <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210153729359">
                          <link role="variableDeclaration" targetNodeId="1209981753049" resolveInfo="i" />
                        </node>
                        <node role="array" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210153729360">
                          <link role="variableDeclaration" targetNodeId="1209981650584" resolveInfo="copy" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1210153672198">
                <property name="name" value="j" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1210153673699" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210153681543">
                  <property name="value" value="0" />
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1210153692447">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210153701990">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210153698473">
                    <node role="index" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210153700384">
                      <property name="value" value="0" />
                    </node>
                    <node role="array" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210153695138">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210153693856" />
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210153697046">
                        <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                      </node>
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation" id="1210153703058" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210153687401">
                  <link role="variableDeclaration" targetNodeId="1210153672198" resolveInfo="j" />
                </node>
              </node>
              <node role="iteration" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1210153715171">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1210153716681">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210153717483">
                    <property name="value" value="1" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210153715990">
                    <link role="variableDeclaration" targetNodeId="1210153672198" resolveInfo="j" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210153710129">
                  <link role="variableDeclaration" targetNodeId="1210153672198" resolveInfo="j" />
                </node>
              </node>
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1209981753049">
            <property name="name" value="i" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1209981754364" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1209981775400">
              <property name="value" value="0" />
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1209981787922">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209981798278">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209981791633">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1209981790207" />
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1209981797152">
                  <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation" id="1209981799531" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209981771133">
              <link role="variableDeclaration" targetNodeId="1209981753049" resolveInfo="i" />
            </node>
          </node>
          <node role="iteration" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1209983407062">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1209983408742">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1209983409873">
                <property name="value" value="1" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209983408725">
                <link role="variableDeclaration" targetNodeId="1209981753049" resolveInfo="i" />
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209981839452">
              <link role="variableDeclaration" targetNodeId="1209981753049" resolveInfo="i" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1209981626765">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1217888346876">
            <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1217888346878">
              <link role="baseMethodDeclaration" targetNodeId="1210153033269" resolveInfo="Matrix" />
              <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210153777851">
                <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209982063281">
                <link role="variableDeclaration" targetNodeId="1209981650584" resolveInfo="copy" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210153569647">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210153569648">
                  <link role="fieldDeclaration" targetNodeId="1210153297615" resolveInfo="operations" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210153569649" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1209984254660">
      <property name="name" value="mult" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1209984265778">
        <link role="classifier" targetNodeId="1209978932613" resolveInfo="Matrix" />
        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210155294226">
          <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1209984254662" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209984254663">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1209984611200">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1209984611201">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1209984636830">
              <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1209984637256">
                <node role="componentType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210154087820">
                  <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
                </node>
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1210158642299">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1210158642300">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1210158642301">
                  <node role="creator" type="jetbrains.mps.baseLanguage.structure.ArrayCreator" id="1210158642302">
                    <node role="dimensionExpression" type="jetbrains.mps.baseLanguage.structure.DimensionExpression" id="1210158642303">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210158642304">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210158642305">
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210158642306">
                            <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                          </node>
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210158642307" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation" id="1210158642308" />
                      </node>
                    </node>
                    <node role="dimensionExpression" type="jetbrains.mps.baseLanguage.structure.DimensionExpression" id="1210158642309">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210158642310">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210158642311">
                          <node role="index" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210158642312">
                            <property name="value" value="0" />
                          </node>
                          <node role="array" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210158642313">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210158642314" />
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210158642315">
                              <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                            </node>
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation" id="1210158642316" />
                      </node>
                    </node>
                    <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210158642317">
                      <link role="classifier" targetNodeId="1.~Object" resolveInfo="Object" />
                    </node>
                  </node>
                </node>
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1210158642318">
                  <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1210158642319">
                    <node role="componentType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210158642320">
                      <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1209984328118">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209984328119">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1209984478971">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209984478972">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1209984728753">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1209984741283">
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1209984737226">
                      <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209984738407">
                        <link role="variableDeclaration" targetNodeId="1209984478974" resolveInfo="j" />
                      </node>
                      <node role="array" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1209984730244">
                        <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209984734635">
                          <link role="variableDeclaration" targetNodeId="1209984328121" resolveInfo="i" />
                        </node>
                        <node role="array" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209984728754">
                          <link role="variableDeclaration" targetNodeId="1209984611201" resolveInfo="copy" />
                        </node>
                      </node>
                    </node>
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210154306452">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210154305424">
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210154305425">
                          <link role="fieldDeclaration" targetNodeId="1210153297615" resolveInfo="operations" />
                        </node>
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210154305426" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210154309180">
                        <link role="baseMethodDeclaration" targetNodeId="1210154147927" resolveInfo="mult" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210154314745">
                          <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210154314746">
                            <link role="variableDeclaration" targetNodeId="1209984478974" resolveInfo="j" />
                          </node>
                          <node role="array" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210154314747">
                            <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210154314748">
                              <link role="variableDeclaration" targetNodeId="1209984328121" resolveInfo="i" />
                            </node>
                            <node role="array" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210154314749">
                              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210154314750">
                                <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                              </node>
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210154314751" />
                            </node>
                          </node>
                        </node>
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210154322725">
                          <link role="variableDeclaration" targetNodeId="1209984272421" resolveInfo="v" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1209984478974">
                <property name="name" value="j" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1209984481310" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1209984488454">
                  <property name="value" value="0" />
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1209984513824">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209984528688">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1209984522431">
                    <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209984537560">
                      <link role="variableDeclaration" targetNodeId="1209984328121" resolveInfo="i" />
                    </node>
                    <node role="array" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209984517556">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1209984516270" />
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1209984519658">
                        <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                      </node>
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation" id="1209984532326" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209984499671">
                  <link role="variableDeclaration" targetNodeId="1209984478974" resolveInfo="j" />
                </node>
              </node>
              <node role="iteration" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1209984542639">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1209984543913">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1209984545139">
                    <property name="value" value="1" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209984542799">
                    <link role="variableDeclaration" targetNodeId="1209984478974" resolveInfo="j" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209984541416">
                  <link role="variableDeclaration" targetNodeId="1209984478974" resolveInfo="j" />
                </node>
              </node>
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1209984328121">
            <property name="name" value="i" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1209984330426" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1209984345028">
              <property name="value" value="0" />
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1209984350261">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209984506708">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209984506063">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1209984506064">
                  <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1209984506065" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation" id="1209984508121" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209984340766">
              <link role="variableDeclaration" targetNodeId="1209984328121" resolveInfo="i" />
            </node>
          </node>
          <node role="iteration" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1209984405310">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1209984407663">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1209984408481">
                <property name="value" value="1" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209984407662">
                <link role="variableDeclaration" targetNodeId="1209984328121" resolveInfo="i" />
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209984402677">
              <link role="variableDeclaration" targetNodeId="1209984328121" resolveInfo="i" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1209984779000">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1217888431774">
            <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1217888431793">
              <link role="baseMethodDeclaration" targetNodeId="1210153033269" resolveInfo="Matrix" />
              <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210155303531">
                <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209984786114">
                <link role="variableDeclaration" targetNodeId="1209984611201" resolveInfo="copy" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210153920936">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210153920937">
                  <link role="fieldDeclaration" targetNodeId="1210153297615" resolveInfo="operations" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210153920938" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1209984272421">
        <property name="name" value="v" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210154127164">
          <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1210180594117">
      <property name="name" value="div" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210180594118">
        <link role="classifier" targetNodeId="1209978932613" resolveInfo="Matrix" />
        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210180594119">
          <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1210180594120" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210180594121">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1210180594122">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1210180594123">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1210180594124">
              <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1210180594125">
                <node role="componentType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210180594126">
                  <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
                </node>
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1210180594127">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1210180594128">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1210180594129">
                  <node role="creator" type="jetbrains.mps.baseLanguage.structure.ArrayCreator" id="1210180594130">
                    <node role="dimensionExpression" type="jetbrains.mps.baseLanguage.structure.DimensionExpression" id="1210180594131">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210180594132">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210180594133">
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210180594134">
                            <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                          </node>
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210180594135" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation" id="1210180594136" />
                      </node>
                    </node>
                    <node role="dimensionExpression" type="jetbrains.mps.baseLanguage.structure.DimensionExpression" id="1210180594137">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210180594138">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210180594139">
                          <node role="index" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210180594140">
                            <property name="value" value="0" />
                          </node>
                          <node role="array" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210180594141">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210180594142" />
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210180594143">
                              <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                            </node>
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation" id="1210180594144" />
                      </node>
                    </node>
                    <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210180594145">
                      <link role="classifier" targetNodeId="1.~Object" resolveInfo="Object" />
                    </node>
                  </node>
                </node>
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1210180594146">
                  <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1210180594147">
                    <node role="componentType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210180594148">
                      <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210180616002">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1210180617617">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210180622280">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210180621063">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210180621064">
                  <link role="fieldDeclaration" targetNodeId="1210153297615" resolveInfo="operations" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210180621065" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210180775386">
                <link role="baseMethodDeclaration" targetNodeId="1210180637222" resolveInfo="multiplicativeInverse" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210180778627">
                  <link role="variableDeclaration" targetNodeId="1210180594212" resolveInfo="v" />
                </node>
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210180616003">
              <link role="variableDeclaration" targetNodeId="1210180594212" resolveInfo="v" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1210180594149">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210180594150">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1210180594151">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210180594152">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210180594153">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1210180594154">
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210180594155">
                      <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210180594156">
                        <link role="variableDeclaration" targetNodeId="1210180594173" resolveInfo="j" />
                      </node>
                      <node role="array" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210180594157">
                        <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210180594158">
                          <link role="variableDeclaration" targetNodeId="1210180594190" resolveInfo="i" />
                        </node>
                        <node role="array" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210180594159">
                          <link role="variableDeclaration" targetNodeId="1210180594123" resolveInfo="result" />
                        </node>
                      </node>
                    </node>
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210180594160">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210180594161">
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210180594162">
                          <link role="fieldDeclaration" targetNodeId="1210153297615" resolveInfo="operations" />
                        </node>
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210180594163" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210180594164">
                        <link role="baseMethodDeclaration" targetNodeId="1210154147927" resolveInfo="mult" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210180594165">
                          <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210180594166">
                            <link role="variableDeclaration" targetNodeId="1210180594173" resolveInfo="j" />
                          </node>
                          <node role="array" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210180594167">
                            <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210180594168">
                              <link role="variableDeclaration" targetNodeId="1210180594190" resolveInfo="i" />
                            </node>
                            <node role="array" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210180594169">
                              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210180594170">
                                <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                              </node>
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210180594171" />
                            </node>
                          </node>
                        </node>
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210180594172">
                          <link role="variableDeclaration" targetNodeId="1210180594212" resolveInfo="v" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1210180594173">
                <property name="name" value="j" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1210180594174" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210180594175">
                  <property name="value" value="0" />
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1210180594176">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210180594177">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210180594178">
                    <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210180594179">
                      <link role="variableDeclaration" targetNodeId="1210180594190" resolveInfo="i" />
                    </node>
                    <node role="array" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210180594180">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210180594181" />
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210180594182">
                        <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                      </node>
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation" id="1210180594183" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210180594184">
                  <link role="variableDeclaration" targetNodeId="1210180594173" resolveInfo="j" />
                </node>
              </node>
              <node role="iteration" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1210180594185">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1210180594186">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210180594187">
                    <property name="value" value="1" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210180594188">
                    <link role="variableDeclaration" targetNodeId="1210180594173" resolveInfo="j" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210180594189">
                  <link role="variableDeclaration" targetNodeId="1210180594173" resolveInfo="j" />
                </node>
              </node>
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1210180594190">
            <property name="name" value="i" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1210180594191" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210180594192">
              <property name="value" value="0" />
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1210180594193">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210180594194">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210180594195">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210180594196">
                  <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210180594197" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation" id="1210180594198" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210180594199">
              <link role="variableDeclaration" targetNodeId="1210180594190" resolveInfo="i" />
            </node>
          </node>
          <node role="iteration" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1210180594200">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1210180594201">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210180594202">
                <property name="value" value="1" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210180594203">
                <link role="variableDeclaration" targetNodeId="1210180594190" resolveInfo="i" />
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210180594204">
              <link role="variableDeclaration" targetNodeId="1210180594190" resolveInfo="i" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1210180594205">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1217888320837">
            <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1217888320855">
              <link role="baseMethodDeclaration" targetNodeId="1210153033269" resolveInfo="Matrix" />
              <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210180594211">
                <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210180594207">
                <link role="variableDeclaration" targetNodeId="1210180594123" resolveInfo="result" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210180594208">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210180594209">
                  <link role="fieldDeclaration" targetNodeId="1210153297615" resolveInfo="operations" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210180594210" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210180594212">
        <property name="name" value="v" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210180594213">
          <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1209984941837">
      <property name="name" value="add" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1209985093795">
        <link role="classifier" targetNodeId="1209978932613" resolveInfo="Matrix" />
        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210155063686">
          <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1209984941839" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209984941840">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210151282986">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210151282987">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210151282988" />
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210151282989">
              <link role="baseMethodDeclaration" targetNodeId="1210151282941" resolveInfo="ChechSizeEquals" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210151282990">
                <link role="variableDeclaration" targetNodeId="1209985110870" resolveInfo="m" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1209985928920">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1209985928921">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1209985928922">
              <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1209985928923">
                <node role="componentType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210154506370">
                  <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
                </node>
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1210158548432">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1210158548433">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1210158548434">
                  <node role="creator" type="jetbrains.mps.baseLanguage.structure.ArrayCreator" id="1210158548435">
                    <node role="dimensionExpression" type="jetbrains.mps.baseLanguage.structure.DimensionExpression" id="1210158548436">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210158548437">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210158548438">
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210158548439">
                            <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                          </node>
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210158548440" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation" id="1210158548441" />
                      </node>
                    </node>
                    <node role="dimensionExpression" type="jetbrains.mps.baseLanguage.structure.DimensionExpression" id="1210158548442">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210158548443">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210158548444">
                          <node role="index" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210158548445">
                            <property name="value" value="0" />
                          </node>
                          <node role="array" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210158548446">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210158548447" />
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210158548448">
                              <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                            </node>
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation" id="1210158548449" />
                      </node>
                    </node>
                    <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210158548450">
                      <link role="classifier" targetNodeId="1.~Object" resolveInfo="Object" />
                    </node>
                  </node>
                </node>
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1210158548451">
                  <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1210158548452">
                    <node role="componentType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210158548453">
                      <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1209985955403">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209985955404">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1209985955405">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209985955406">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1209985955407">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1209985955408">
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1209985955418">
                      <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209985955419">
                        <link role="variableDeclaration" targetNodeId="1209985955423" resolveInfo="j" />
                      </node>
                      <node role="array" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1209985955420">
                        <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209985955421">
                          <link role="variableDeclaration" targetNodeId="1209985955440" resolveInfo="i" />
                        </node>
                        <node role="array" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209985955422">
                          <link role="variableDeclaration" targetNodeId="1209985928921" resolveInfo="result" />
                        </node>
                      </node>
                    </node>
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210154550444">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210154548113">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210154547060" />
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210154549637">
                          <link role="fieldDeclaration" targetNodeId="1210153297615" resolveInfo="operations" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210154551703">
                        <link role="baseMethodDeclaration" targetNodeId="1210153209836" resolveInfo="add" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210154554102">
                          <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210154554103">
                            <link role="variableDeclaration" targetNodeId="1209985955423" resolveInfo="j" />
                          </node>
                          <node role="array" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210154554104">
                            <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210154554105">
                              <link role="variableDeclaration" targetNodeId="1209985955440" resolveInfo="i" />
                            </node>
                            <node role="array" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210154554106">
                              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210154554107">
                                <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                              </node>
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210154554108" />
                            </node>
                          </node>
                        </node>
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210154564659">
                          <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210154564660">
                            <link role="variableDeclaration" targetNodeId="1209985955423" resolveInfo="j" />
                          </node>
                          <node role="array" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210154564661">
                            <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210154564662">
                              <link role="variableDeclaration" targetNodeId="1209985955440" resolveInfo="i" />
                            </node>
                            <node role="array" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210154564663">
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210154564664">
                                <link role="variableDeclaration" targetNodeId="1209985110870" resolveInfo="m" />
                              </node>
                              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210154564665">
                                <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1209985955423">
                <property name="name" value="j" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1209985955424" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1209985955425">
                  <property name="value" value="0" />
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1209985955426">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209985955427">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1209985955428">
                    <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209985955429">
                      <link role="variableDeclaration" targetNodeId="1209985955440" resolveInfo="i" />
                    </node>
                    <node role="array" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209985955430">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1209985955431" />
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1209985955432">
                        <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                      </node>
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation" id="1209985955433" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209985955434">
                  <link role="variableDeclaration" targetNodeId="1209985955423" resolveInfo="j" />
                </node>
              </node>
              <node role="iteration" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1209985955435">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1209985955436">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1209985955437">
                    <property name="value" value="1" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209985955438">
                    <link role="variableDeclaration" targetNodeId="1209985955423" resolveInfo="j" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209985955439">
                  <link role="variableDeclaration" targetNodeId="1209985955423" resolveInfo="j" />
                </node>
              </node>
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1209985955440">
            <property name="name" value="i" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1209985955441" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1209985955442">
              <property name="value" value="0" />
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1209985955443">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209985955444">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209985955445">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1209985955446">
                  <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1209985955447" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation" id="1209985955448" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209985955449">
              <link role="variableDeclaration" targetNodeId="1209985955440" resolveInfo="i" />
            </node>
          </node>
          <node role="iteration" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1209985955450">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1209985955451">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1209985955452">
                <property name="value" value="1" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209985955453">
                <link role="variableDeclaration" targetNodeId="1209985955440" resolveInfo="i" />
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209985955454">
              <link role="variableDeclaration" targetNodeId="1209985955440" resolveInfo="i" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1209985126099">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1217888371061">
            <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1217888371064">
              <link role="baseMethodDeclaration" targetNodeId="1210153033269" resolveInfo="Matrix" />
              <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210155074103">
                <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209986285703">
                <link role="variableDeclaration" targetNodeId="1209985928921" resolveInfo="result" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210153927445">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210153927446">
                  <link role="fieldDeclaration" targetNodeId="1210153297615" resolveInfo="operations" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210153927447" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1209985110870">
        <property name="name" value="m" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1209985110871">
          <link role="classifier" targetNodeId="1209978932613" resolveInfo="Matrix" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210155050706">
            <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1210151302822">
      <property name="name" value="sub" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210151302823">
        <link role="classifier" targetNodeId="1209978932613" resolveInfo="Matrix" />
        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210155366120">
          <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1210151302824" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210151302825">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210151302826">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210151302827">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210151302828" />
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210151302829">
              <link role="baseMethodDeclaration" targetNodeId="1210151282941" resolveInfo="ChechSizeEquals" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210151302830">
                <link role="variableDeclaration" targetNodeId="1210151302914" resolveInfo="m" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1210151302831">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1210151302832">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1210151302833">
              <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1210151302834">
                <node role="componentType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210155384050">
                  <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
                </node>
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1210158568238">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1210158568239">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1210158568240">
                  <node role="creator" type="jetbrains.mps.baseLanguage.structure.ArrayCreator" id="1210158568241">
                    <node role="dimensionExpression" type="jetbrains.mps.baseLanguage.structure.DimensionExpression" id="1210158568242">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210158568243">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210158568244">
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210158568245">
                            <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                          </node>
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210158568246" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation" id="1210158568247" />
                      </node>
                    </node>
                    <node role="dimensionExpression" type="jetbrains.mps.baseLanguage.structure.DimensionExpression" id="1210158568248">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210158568249">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210158568250">
                          <node role="index" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210158568251">
                            <property name="value" value="0" />
                          </node>
                          <node role="array" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210158568252">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210158568253" />
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210158568254">
                              <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                            </node>
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation" id="1210158568255" />
                      </node>
                    </node>
                    <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210158568256">
                      <link role="classifier" targetNodeId="1.~Object" resolveInfo="Object" />
                    </node>
                  </node>
                </node>
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1210158568257">
                  <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1210158568258">
                    <node role="componentType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210158568259">
                      <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1210151302853">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210151302854">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1210151302855">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210151302856">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210151302857">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1210151302858">
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210151302874">
                      <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210151302875">
                        <link role="variableDeclaration" targetNodeId="1210151302879" resolveInfo="j" />
                      </node>
                      <node role="array" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210151302876">
                        <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210151302877">
                          <link role="variableDeclaration" targetNodeId="1210151302896" resolveInfo="i" />
                        </node>
                        <node role="array" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210151302878">
                          <link role="variableDeclaration" targetNodeId="1210151302832" resolveInfo="result" />
                        </node>
                      </node>
                    </node>
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210155821368">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210155817174">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210155816918" />
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210155820479">
                          <link role="fieldDeclaration" targetNodeId="1210153297615" resolveInfo="operations" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210155823220">
                        <link role="baseMethodDeclaration" targetNodeId="1210153209836" resolveInfo="add" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210155824650">
                          <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210155824651">
                            <link role="variableDeclaration" targetNodeId="1210151302879" resolveInfo="j" />
                          </node>
                          <node role="array" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210155824652">
                            <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210155824653">
                              <link role="variableDeclaration" targetNodeId="1210151302896" resolveInfo="i" />
                            </node>
                            <node role="array" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210155824654">
                              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210155824655">
                                <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                              </node>
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210155824656" />
                            </node>
                          </node>
                        </node>
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210155839234">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210155836542">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210155836129" />
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210155838598">
                              <link role="fieldDeclaration" targetNodeId="1210153297615" resolveInfo="operations" />
                            </node>
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210155849213">
                            <link role="baseMethodDeclaration" targetNodeId="1210155503328" resolveInfo="AddittiveInverse" />
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210155865345">
                              <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210155865346">
                                <link role="variableDeclaration" targetNodeId="1210151302879" resolveInfo="j" />
                              </node>
                              <node role="array" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210155865347">
                                <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210155865348">
                                  <link role="variableDeclaration" targetNodeId="1210151302896" resolveInfo="i" />
                                </node>
                                <node role="array" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210155865349">
                                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210155865350">
                                    <link role="variableDeclaration" targetNodeId="1210151302914" resolveInfo="m" />
                                  </node>
                                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210155865351">
                                    <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
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
              <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1210151302879">
                <property name="name" value="j" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1210151302880" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210151302881">
                  <property name="value" value="0" />
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1210151302882">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210151302883">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210151302884">
                    <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210151302885">
                      <link role="variableDeclaration" targetNodeId="1210151302896" resolveInfo="i" />
                    </node>
                    <node role="array" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210151302886">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210151302887" />
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210151302888">
                        <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                      </node>
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation" id="1210151302889" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210151302890">
                  <link role="variableDeclaration" targetNodeId="1210151302879" resolveInfo="j" />
                </node>
              </node>
              <node role="iteration" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1210151302891">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1210151302892">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210151302893">
                    <property name="value" value="1" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210151302894">
                    <link role="variableDeclaration" targetNodeId="1210151302879" resolveInfo="j" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210151302895">
                  <link role="variableDeclaration" targetNodeId="1210151302879" resolveInfo="j" />
                </node>
              </node>
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1210151302896">
            <property name="name" value="i" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1210151302897" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210151302898">
              <property name="value" value="0" />
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1210151302899">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210151302900">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210151302901">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210151302902">
                  <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210151302903" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation" id="1210151302904" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210151302905">
              <link role="variableDeclaration" targetNodeId="1210151302896" resolveInfo="i" />
            </node>
          </node>
          <node role="iteration" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1210151302906">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1210151302907">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210151302908">
                <property name="value" value="1" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210151302909">
                <link role="variableDeclaration" targetNodeId="1210151302896" resolveInfo="i" />
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210151302910">
              <link role="variableDeclaration" targetNodeId="1210151302896" resolveInfo="i" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1210151302911">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1217888431548">
            <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1217888431551">
              <link role="baseMethodDeclaration" targetNodeId="1210153033269" resolveInfo="Matrix" />
              <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210155375936">
                <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210151302913">
                <link role="variableDeclaration" targetNodeId="1210151302832" resolveInfo="result" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210153933860">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210153933861">
                  <link role="fieldDeclaration" targetNodeId="1210153297615" resolveInfo="operations" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210153933862" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210151302914">
        <property name="name" value="m" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210151302915">
          <link role="classifier" targetNodeId="1209978932613" resolveInfo="Matrix" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210155370091">
            <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1210151282941">
      <property name="name" value="ChechSizeEquals" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210151282942">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1210151282946">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210151282947">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ThrowStatement" id="1210151282948">
              <node role="throwable" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1217888404159">
                <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1217888404176">
                  <link role="baseMethodDeclaration" targetNodeId="1209985705530" resolveInfo="BadMatrixDimensionException" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1210151282950">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210151282951">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210151282984">
                <link role="variableDeclaration" targetNodeId="1210151282944" resolveInfo="m" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210151282953">
                <link role="baseMethodDeclaration" targetNodeId="1209985136722" resolveInfo="getRowsNumber" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210151282954">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210151282955" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210151282956">
                <link role="baseMethodDeclaration" targetNodeId="1209985136722" resolveInfo="getRowsNumber" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1210151282957">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210151282958">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ThrowStatement" id="1210151282959">
              <node role="throwable" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1217888430247">
                <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1217888430264">
                  <link role="baseMethodDeclaration" targetNodeId="1209985705530" resolveInfo="BadMatrixDimensionException" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1210151282961">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210151282962">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210151282985">
                <link role="variableDeclaration" targetNodeId="1210151282944" resolveInfo="m" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210151282964">
                <link role="baseMethodDeclaration" targetNodeId="1209985414706" resolveInfo="getColumnsNumber" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210151282965">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210151282966" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210151282967">
                <link role="baseMethodDeclaration" targetNodeId="1209985414706" resolveInfo="getColumnsNumber" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1210151282943" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210151282944">
        <property name="name" value="m" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210151282945">
          <link role="classifier" targetNodeId="1209978932613" resolveInfo="Matrix" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210155996993">
            <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1210151289106" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1210002194351">
      <property name="name" value="mult" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210002211889">
        <link role="classifier" targetNodeId="1209978932613" resolveInfo="Matrix" />
        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210156003584">
          <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1210002194353" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210002194354">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1210002239919">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210002239920">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ThrowStatement" id="1210002239921">
              <node role="throwable" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1217888372651">
                <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1217888372653">
                  <link role="baseMethodDeclaration" targetNodeId="1209985705530" resolveInfo="BadMatrixDimensionException" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1210002239923">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210002239924">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210002239925">
                <link role="variableDeclaration" targetNodeId="1210002226200" resolveInfo="m" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210002239926">
                <link role="baseMethodDeclaration" targetNodeId="1209985136722" resolveInfo="getRowsNumber" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210002239927">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210002239928" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210002239929">
                <link role="baseMethodDeclaration" targetNodeId="1209985414706" resolveInfo="getColumnsNumber" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1210002268961">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1210002268962">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1210002268963">
              <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1210002268964">
                <node role="componentType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210156039168">
                  <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
                </node>
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1210158589325">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1210158589326">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1210158589327">
                  <node role="creator" type="jetbrains.mps.baseLanguage.structure.ArrayCreator" id="1210158589328">
                    <node role="dimensionExpression" type="jetbrains.mps.baseLanguage.structure.DimensionExpression" id="1210158589329">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210158589330">
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210158589331">
                          <link role="baseMethodDeclaration" targetNodeId="1209985136722" resolveInfo="getRowsNumber" />
                        </node>
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210158589332" />
                      </node>
                    </node>
                    <node role="dimensionExpression" type="jetbrains.mps.baseLanguage.structure.DimensionExpression" id="1210158589333">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210158589334">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210158589335">
                          <link role="variableDeclaration" targetNodeId="1210002226200" resolveInfo="m" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210158589336">
                          <link role="baseMethodDeclaration" targetNodeId="1209985414706" resolveInfo="getColumnsNumber" />
                        </node>
                      </node>
                    </node>
                    <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210158589337">
                      <link role="classifier" targetNodeId="1.~Object" resolveInfo="Object" />
                    </node>
                  </node>
                </node>
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1210158589338">
                  <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1210158589339">
                    <node role="componentType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210158589340">
                      <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1210002268983">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210002268984">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1210002268985">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210002268986">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1210002547541">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1210002547542">
                    <property name="name" value="sum" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210156054337">
                      <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1210234011885" />
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1210002561640">
                  <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1210002561641">
                    <property name="name" value="k" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1210002561642" />
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210002561643">
                      <property name="value" value="0" />
                    </node>
                  </node>
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210002561644">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1210156151513">
                      <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1210156151514">
                        <property name="name" value="tmp" />
                        <node role="type" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210156151515">
                          <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
                        </node>
                        <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210156163529">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210156160746">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210156160445" />
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210156162674">
                              <link role="fieldDeclaration" targetNodeId="1210153297615" resolveInfo="operations" />
                            </node>
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210156170240">
                            <link role="baseMethodDeclaration" targetNodeId="1210154147927" resolveInfo="mult" />
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210156179651">
                              <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210156179652">
                                <link role="variableDeclaration" targetNodeId="1210002561641" resolveInfo="k" />
                              </node>
                              <node role="array" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210156179653">
                                <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210156179654">
                                  <link role="variableDeclaration" targetNodeId="1210002269026" resolveInfo="i" />
                                </node>
                                <node role="array" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210156179655">
                                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210156179656">
                                    <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                                  </node>
                                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210156179657" />
                                </node>
                              </node>
                            </node>
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210156188940">
                              <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210156188941">
                                <link role="variableDeclaration" targetNodeId="1210002269009" resolveInfo="j" />
                              </node>
                              <node role="array" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210156188942">
                                <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210156188943">
                                  <link role="variableDeclaration" targetNodeId="1210002561641" resolveInfo="k" />
                                </node>
                                <node role="array" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210156188944">
                                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210156188945">
                                    <link role="variableDeclaration" targetNodeId="1210002226200" resolveInfo="m" />
                                  </node>
                                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210156188946">
                                    <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1210234020298">
                      <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210234020299">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210234051437">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1210234094466">
                            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210242209284">
                              <link role="variableDeclaration" targetNodeId="1210156151514" resolveInfo="tmp" />
                            </node>
                            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210234051446">
                              <link role="variableDeclaration" targetNodeId="1210002547542" resolveInfo="sum" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1210234024240">
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1210234026360" />
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210234023295">
                          <link role="variableDeclaration" targetNodeId="1210002547542" resolveInfo="sum" />
                        </node>
                      </node>
                      <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1210234041848">
                        <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210234041849">
                          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210234042841">
                            <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1210234042842">
                              <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210234042843">
                                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210234042844">
                                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210234042845">
                                    <link role="fieldDeclaration" targetNodeId="1210153297615" resolveInfo="operations" />
                                  </node>
                                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210234042846" />
                                </node>
                                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210234042847">
                                  <link role="baseMethodDeclaration" targetNodeId="1210153209836" resolveInfo="add" />
                                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210234042848">
                                    <link role="variableDeclaration" targetNodeId="1210002547542" resolveInfo="sum" />
                                  </node>
                                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210234042849">
                                    <link role="variableDeclaration" targetNodeId="1210156151514" resolveInfo="tmp" />
                                  </node>
                                </node>
                              </node>
                              <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210234042850">
                                <link role="variableDeclaration" targetNodeId="1210002547542" resolveInfo="sum" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1210002561667">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210002561668">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210002561669">
                        <link role="baseMethodDeclaration" targetNodeId="1209985414706" resolveInfo="getColumnsNumber" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210002561670" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210002561671">
                      <link role="variableDeclaration" targetNodeId="1210002561641" resolveInfo="k" />
                    </node>
                  </node>
                  <node role="iteration" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1210002561672">
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1210002561673">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210002561674">
                        <property name="value" value="1" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210002561675">
                        <link role="variableDeclaration" targetNodeId="1210002561641" resolveInfo="k" />
                      </node>
                    </node>
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210002561676">
                      <link role="variableDeclaration" targetNodeId="1210002561641" resolveInfo="k" />
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210002687851">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1210002708232">
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210002713836">
                      <link role="variableDeclaration" targetNodeId="1210002547542" resolveInfo="sum" />
                    </node>
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210002708234">
                      <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210002708235">
                        <link role="variableDeclaration" targetNodeId="1210002269009" resolveInfo="j" />
                      </node>
                      <node role="array" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210002708236">
                        <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210002708237">
                          <link role="variableDeclaration" targetNodeId="1210002269026" resolveInfo="i" />
                        </node>
                        <node role="array" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210002708238">
                          <link role="variableDeclaration" targetNodeId="1210002268962" resolveInfo="result" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1210002269009">
                <property name="name" value="j" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1210002269010" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210002269011">
                  <property name="value" value="0" />
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1210002420915">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210002424595">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210002497246">
                    <link role="variableDeclaration" targetNodeId="1210002226200" resolveInfo="m" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210002429368">
                    <link role="baseMethodDeclaration" targetNodeId="1209985414706" resolveInfo="getColumnsNumber" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210002269020">
                  <link role="variableDeclaration" targetNodeId="1210002269009" resolveInfo="j" />
                </node>
              </node>
              <node role="iteration" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1210002269021">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1210002269022">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210002269023">
                    <property name="value" value="1" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210002269024">
                    <link role="variableDeclaration" targetNodeId="1210002269009" resolveInfo="j" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210002269025">
                  <link role="variableDeclaration" targetNodeId="1210002269009" resolveInfo="j" />
                </node>
              </node>
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1210002269026">
            <property name="name" value="i" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1210002269027" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210002269028">
              <property name="value" value="0" />
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1210002269029">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210002399592">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210002269033" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210002403051">
                <link role="baseMethodDeclaration" targetNodeId="1209985136722" resolveInfo="getRowsNumber" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210002269035">
              <link role="variableDeclaration" targetNodeId="1210002269026" resolveInfo="i" />
            </node>
          </node>
          <node role="iteration" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1210002269036">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1210002269037">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210002269038">
                <property name="value" value="1" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210002269039">
                <link role="variableDeclaration" targetNodeId="1210002269026" resolveInfo="i" />
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210002269040">
              <link role="variableDeclaration" targetNodeId="1210002269026" resolveInfo="i" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1210002269041">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1217888362651">
            <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1217888362654">
              <link role="baseMethodDeclaration" targetNodeId="1210153033269" resolveInfo="Matrix" />
              <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210156017850">
                <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210002269043">
                <link role="variableDeclaration" targetNodeId="1210002268962" resolveInfo="result" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210153946243">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210153946244">
                  <link role="fieldDeclaration" targetNodeId="1210153297615" resolveInfo="operations" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210153946245" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210002226200">
        <property name="name" value="m" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210002226201">
          <link role="classifier" targetNodeId="1209978932613" resolveInfo="Matrix" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210156008396">
            <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1209986357670">
      <property name="name" value="transpose" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1209986375946">
        <link role="classifier" targetNodeId="1209978932613" resolveInfo="Matrix" />
        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210159123210">
          <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1209986357672" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209986357673">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1209986542525">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1209986542526">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1209986542527">
              <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1209986542528">
                <node role="componentType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210155955556">
                  <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
                </node>
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1210158597644">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1210158597645">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1210158597646">
                  <node role="creator" type="jetbrains.mps.baseLanguage.structure.ArrayCreator" id="1210158597647">
                    <node role="dimensionExpression" type="jetbrains.mps.baseLanguage.structure.DimensionExpression" id="1210158597648">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210158597649">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210158597650">
                          <node role="index" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210158597651">
                            <property name="value" value="0" />
                          </node>
                          <node role="array" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210158597652">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210158597653" />
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210158597654">
                              <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                            </node>
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation" id="1210158597655" />
                      </node>
                    </node>
                    <node role="dimensionExpression" type="jetbrains.mps.baseLanguage.structure.DimensionExpression" id="1210158597656">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210158597657">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210158597658">
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210158597659">
                            <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                          </node>
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210158597660" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation" id="1210158597661" />
                      </node>
                    </node>
                    <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210159106008">
                      <link role="classifier" targetNodeId="1.~Object" resolveInfo="Object" />
                    </node>
                  </node>
                </node>
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1210158597663">
                  <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1210158597664">
                    <node role="componentType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210158597665">
                      <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1209986601008">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209986601009">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1209986601010">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209986601011">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1209986601012">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1209986601013">
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1209986601015">
                      <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209986601016">
                        <link role="variableDeclaration" targetNodeId="1209986601034" resolveInfo="j" />
                      </node>
                      <node role="array" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1209986601017">
                        <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209986601018">
                          <link role="variableDeclaration" targetNodeId="1209986601051" resolveInfo="i" />
                        </node>
                        <node role="array" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209986601019">
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1209986601020">
                            <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                          </node>
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1209986601021" />
                        </node>
                      </node>
                    </node>
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1209986601029">
                      <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209986620894">
                        <link role="variableDeclaration" targetNodeId="1209986601051" resolveInfo="i" />
                      </node>
                      <node role="array" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1209986601031">
                        <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209986616973">
                          <link role="variableDeclaration" targetNodeId="1209986601034" resolveInfo="j" />
                        </node>
                        <node role="array" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209986601033">
                          <link role="variableDeclaration" targetNodeId="1209986542526" resolveInfo="result" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1209986601034">
                <property name="name" value="j" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1209986601035" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1209986601036">
                  <property name="value" value="0" />
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1209986601037">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209986601038">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1209986601039">
                    <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209986601040">
                      <link role="variableDeclaration" targetNodeId="1209986601051" resolveInfo="i" />
                    </node>
                    <node role="array" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209986601041">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1209986601042" />
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1209986601043">
                        <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                      </node>
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation" id="1209986601044" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209986601045">
                  <link role="variableDeclaration" targetNodeId="1209986601034" resolveInfo="j" />
                </node>
              </node>
              <node role="iteration" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1209986601046">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1209986601047">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1209986601048">
                    <property name="value" value="1" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209986601049">
                    <link role="variableDeclaration" targetNodeId="1209986601034" resolveInfo="j" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209986601050">
                  <link role="variableDeclaration" targetNodeId="1209986601034" resolveInfo="j" />
                </node>
              </node>
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1209986601051">
            <property name="name" value="i" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1209986601052" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1209986601053">
              <property name="value" value="0" />
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1209986601054">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209986601055">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209986601056">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1209986601057">
                  <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1209986601058" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation" id="1209986601059" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209986601060">
              <link role="variableDeclaration" targetNodeId="1209986601051" resolveInfo="i" />
            </node>
          </node>
          <node role="iteration" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1209986601061">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1209986601062">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1209986601063">
                <property name="value" value="1" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209986601064">
                <link role="variableDeclaration" targetNodeId="1209986601051" resolveInfo="i" />
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209986601065">
              <link role="variableDeclaration" targetNodeId="1209986601051" resolveInfo="i" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1209986691940">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1217888364215">
            <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1217888364218">
              <link role="baseMethodDeclaration" targetNodeId="1210153033269" resolveInfo="Matrix" />
              <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210159133359">
                <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209986711486">
                <link role="variableDeclaration" targetNodeId="1209986542526" resolveInfo="result" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210153952283">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210153952284">
                  <link role="fieldDeclaration" targetNodeId="1210153297615" resolveInfo="operations" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210153952285" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1209990108954">
      <property name="name" value="determinant" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210159155410">
        <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1209990108956" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209990108957">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1209990562704">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1209990571921">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209990575809">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209990575810">
                <link role="baseMethodDeclaration" targetNodeId="1209985414706" resolveInfo="getColumnsNumber" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1209990575811" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209990568785">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209990568786">
                <link role="baseMethodDeclaration" targetNodeId="1209985136722" resolveInfo="getRowsNumber" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1209990568787" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209990562706">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ThrowStatement" id="1209990582829">
              <node role="throwable" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1217888382006">
                <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1217888382008">
                  <link role="baseMethodDeclaration" targetNodeId="1209985705530" resolveInfo="BadMatrixDimensionException" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1209990629637">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209990676653">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209990676654">
              <link role="baseMethodDeclaration" targetNodeId="1209990679836" resolveInfo="determinant2" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1209990782947">
                <property name="value" value="0" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1209990811598">
                <node role="creator" type="jetbrains.mps.baseLanguage.structure.ArrayCreator" id="1209990814091">
                  <node role="componentType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1209990817070" />
                  <node role="dimensionExpression" type="jetbrains.mps.baseLanguage.structure.DimensionExpression" id="1209990814093">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209990825689">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209990823963">
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1209990823964">
                          <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                        </node>
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1209990823965" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation" id="1209990827259" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1209990676655" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1209990679836">
      <property name="name" value="determinant" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210158687586">
        <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209990679839">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1209995437783">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209995437784">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1209995540487">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209995540488">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1209995590837">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209995590838">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1209995676394">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209995688583">
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209995688584">
                          <link role="baseMethodDeclaration" targetNodeId="1209980434079" resolveInfo="getValueAt" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1209995697926">
                            <link role="variableDeclaration" targetNodeId="1209990723053" resolveInfo="row" />
                          </node>
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209995705619">
                            <link role="variableDeclaration" targetNodeId="1209995540490" resolveInfo="i" />
                          </node>
                        </node>
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1209995688585" />
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1209995650465">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1209995664787">
                      <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209995669859">
                        <link role="variableDeclaration" targetNodeId="1209995540490" resolveInfo="i" />
                      </node>
                      <node role="array" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1209995663833">
                        <link role="variableDeclaration" targetNodeId="1209990732125" resolveInfo="notFree" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1209995540490">
                <property name="name" value="i" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1209995546854" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1209995552893">
                  <property name="value" value="0" />
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1209995566741">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209995571999">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209995572000">
                    <link role="baseMethodDeclaration" targetNodeId="1209985136722" resolveInfo="getRowsNumber" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1209995572001" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209995559396">
                  <link role="variableDeclaration" targetNodeId="1209995540490" resolveInfo="i" />
                </node>
              </node>
              <node role="iteration" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1209995578990">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1209995579634">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1209995583583">
                    <property name="value" value="1" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209995585114">
                    <link role="variableDeclaration" targetNodeId="1209995540490" resolveInfo="i" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209995575916">
                  <link role="variableDeclaration" targetNodeId="1209995540490" resolveInfo="i" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1209995493940">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.MinusExpression" id="1209995515430">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1209995516339">
                <property name="value" value="1" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209995501770">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209995501771">
                  <link role="baseMethodDeclaration" targetNodeId="1209985414706" resolveInfo="getColumnsNumber" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1209995501772" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1209995492051">
              <link role="variableDeclaration" targetNodeId="1209990723053" resolveInfo="row" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1209991230597">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1209991230598">
            <property name="name" value="signum" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1210234133129" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210234148671">
              <property name="value" value="1" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1209991253172">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1209991253173">
            <property name="name" value="sum" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210158769819">
              <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1210234173378" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1209991117069">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209991117070">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1209996618127">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1209996633212">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1209996638147">
                  <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209996640804">
                    <link role="variableDeclaration" targetNodeId="1209991117072" resolveInfo="i" />
                  </node>
                  <node role="array" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1209996637005">
                    <link role="variableDeclaration" targetNodeId="1209990732125" resolveInfo="notFree" />
                  </node>
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209996618129">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1209996619643">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1209996619644">
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1209996619645">
                      <property name="value" value="true" />
                    </node>
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1209996619646">
                      <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209996619647">
                        <link role="variableDeclaration" targetNodeId="1209991117072" resolveInfo="i" />
                      </node>
                      <node role="array" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1209996619648">
                        <link role="variableDeclaration" targetNodeId="1209990732125" resolveInfo="notFree" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1210158967008">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1210158967009">
                    <property name="name" value="tmp" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210158967010">
                      <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210158976642">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210158975645">
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210158975646">
                          <link role="fieldDeclaration" targetNodeId="1210153297615" resolveInfo="operations" />
                        </node>
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210158975647" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210158977791">
                        <link role="baseMethodDeclaration" targetNodeId="1210154147927" resolveInfo="mult" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210158987471">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210158987472" />
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210158987473">
                            <link role="baseMethodDeclaration" targetNodeId="1209990679836" resolveInfo="determinant" />
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1210158987474">
                              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210158987475">
                                <property name="value" value="1" />
                              </node>
                              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210158987476">
                                <link role="variableDeclaration" targetNodeId="1209990723053" resolveInfo="row" />
                              </node>
                            </node>
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210158987477">
                              <link role="variableDeclaration" targetNodeId="1209990732125" resolveInfo="notFree" />
                            </node>
                          </node>
                        </node>
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210159003362">
                          <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210159003363">
                            <link role="variableDeclaration" targetNodeId="1209991117072" resolveInfo="i" />
                          </node>
                          <node role="array" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1210159003364">
                            <node role="index" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210159003365">
                              <link role="variableDeclaration" targetNodeId="1209990723053" resolveInfo="row" />
                            </node>
                            <node role="array" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210159003366">
                              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210159003367">
                                <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                              </node>
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210159003368" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1210234260640">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210234260641">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210234286071">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1210234308220">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210234326045">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210234309396">
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210234309397">
                              <link role="fieldDeclaration" targetNodeId="1210153297615" resolveInfo="operations" />
                            </node>
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210234309398" />
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210234329193">
                            <link role="baseMethodDeclaration" targetNodeId="1210155503328" resolveInfo="addittiveInverse" />
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210234332542">
                              <link role="variableDeclaration" targetNodeId="1210158967009" resolveInfo="tmp" />
                            </node>
                          </node>
                        </node>
                        <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210234305444">
                          <link role="variableDeclaration" targetNodeId="1210158967009" resolveInfo="tmp" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1210234274530">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210234275518">
                      <property name="value" value="-1" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210234264755">
                      <link role="variableDeclaration" targetNodeId="1209991230598" resolveInfo="signum" />
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1210234208754">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210234208755">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210234238313">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1210234394261">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210234395046">
                          <link role="variableDeclaration" targetNodeId="1210158967009" resolveInfo="tmp" />
                        </node>
                        <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210234238314">
                          <link role="variableDeclaration" targetNodeId="1209991253173" resolveInfo="sum" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1210234217638">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1210234220158" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210234210524">
                      <link role="variableDeclaration" targetNodeId="1209991253173" resolveInfo="sum" />
                    </node>
                  </node>
                  <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1210234231712">
                    <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210234231713">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210234232637">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1210234232638">
                          <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210234232639">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210234232640">
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210234232641" />
                              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210234232642">
                                <link role="fieldDeclaration" targetNodeId="1210153297615" resolveInfo="operations" />
                              </node>
                            </node>
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210234232643">
                              <link role="baseMethodDeclaration" targetNodeId="1210153209836" resolveInfo="add" />
                              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210234232644">
                                <link role="variableDeclaration" targetNodeId="1209991253173" resolveInfo="sum" />
                              </node>
                              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210234409973">
                                <link role="variableDeclaration" targetNodeId="1210158967009" resolveInfo="tmp" />
                              </node>
                            </node>
                          </node>
                          <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210234232652">
                            <link role="variableDeclaration" targetNodeId="1209991253173" resolveInfo="sum" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1209996619663">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1210158911919">
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.MinusExpression" id="1210234199573">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210234201749">
                        <link role="variableDeclaration" targetNodeId="1209991230598" resolveInfo="signum" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210234198524">
                        <property name="value" value="0" />
                      </node>
                    </node>
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209996619668">
                      <link role="variableDeclaration" targetNodeId="1209991230598" resolveInfo="signum" />
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1209996619669">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1209996619670">
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1209996619671">
                      <property name="value" value="false" />
                    </node>
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1209996619672">
                      <node role="index" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209996619673">
                        <link role="variableDeclaration" targetNodeId="1209991117072" resolveInfo="i" />
                      </node>
                      <node role="array" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1209996619674">
                        <link role="variableDeclaration" targetNodeId="1209990732125" resolveInfo="notFree" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1209991117072">
            <property name="name" value="i" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1209991118108" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1209991189311">
              <property name="value" value="0" />
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1209991201627">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209991201628">
              <link role="variableDeclaration" targetNodeId="1209991117072" resolveInfo="i" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209991212238">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209991210938">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1209991210939">
                  <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1209991210940" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation" id="1209991213931" />
            </node>
          </node>
          <node role="iteration" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1209991217025">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1209991218568">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1209991219129">
                <property name="value" value="1" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209991218567">
                <link role="variableDeclaration" targetNodeId="1209991117072" resolveInfo="i" />
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209991216617">
              <link role="variableDeclaration" targetNodeId="1209991117072" resolveInfo="i" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1209991104110">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209991261473">
            <link role="variableDeclaration" targetNodeId="1209991253173" resolveInfo="sum" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1209990723053">
        <property name="name" value="row" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1209990723054" />
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1209990732125">
        <property name="name" value="notFree" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1209990738879">
          <node role="componentType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1209990734241" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1209995945438" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1209985136722">
      <property name="name" value="getRowsNumber" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1209985136724" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209985136725">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1209985293242">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209985398990">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209985396073">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1209985396074">
                <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1209985396075" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation" id="1209985403253" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1209985236788" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1209985414706">
      <property name="name" value="getColumnsNumber" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1209985414707" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209985414708">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1209985414709">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209985414710">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1209985433777">
              <node role="index" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1209985436428">
                <property name="value" value="0" />
              </node>
              <node role="array" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209985414711">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1209985414712">
                  <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1209985414713" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation" id="1209985414714" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1209985414715" />
    </node>
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1210153033269">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1210153033270" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1210153033271" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210153033272">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210153281299">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1210153281300">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210153281301">
              <link role="variableDeclaration" targetNodeId="1210153044756" resolveInfo="values" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210153281302">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210153281303" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210153281304">
                <link role="fieldDeclaration" targetNodeId="1209981479321" resolveInfo="values" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210153284105">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1210153320788">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210153322418">
              <link role="variableDeclaration" targetNodeId="1210153093445" resolveInfo="operation" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210153284122">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210153284106" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210153318595">
                <link role="fieldDeclaration" targetNodeId="1210153297615" resolveInfo="operations" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210153044756">
        <property name="name" value="values" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1210153087094">
          <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1210153087315">
            <node role="componentType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210153044757">
              <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210153093445">
        <property name="name" value="operations" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210153265089">
          <link role="classifier" targetNodeId="1210153117710" resolveInfo="FieldOperations" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210153315608">
            <link role="typeVariableDeclaration" targetNodeId="1210152719594" resolveInfo="ScalarType" />
          </node>
        </node>
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1209978932614" />
    <node role="typeVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration" id="1210152719594">
      <property name="name" value="ScalarType" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1209985643136">
    <property name="name" value="BadMatrixDimensionException" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1209985705530">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1209985705531" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1209985705532" />
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1209985643137" />
    <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1209985840823">
      <link role="classifier" targetNodeId="1.~RuntimeException" resolveInfo="RuntimeException" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.Interface" id="1210153117710">
    <property name="name" value="FieldOperations" />
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1210153209836">
      <property name="name" value="add" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210153218624">
        <link role="typeVariableDeclaration" targetNodeId="1210153168048" resolveInfo="ScalarType" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1210153209838" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210153209839">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1210154198597">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1210154200115" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210153223705">
        <property name="name" value="a" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210153223706">
          <link role="typeVariableDeclaration" targetNodeId="1210153168048" resolveInfo="ScalarType" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210153225270">
        <property name="name" value="b" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210153228633">
          <link role="typeVariableDeclaration" targetNodeId="1210153168048" resolveInfo="ScalarType" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1210154147927">
      <property name="name" value="mult" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210154168434">
        <link role="typeVariableDeclaration" targetNodeId="1210153168048" resolveInfo="ScalarType" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1210154147929" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210154147930">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1210154202679">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1210154204290" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210154177076">
        <property name="name" value="a" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210154177077">
          <link role="typeVariableDeclaration" targetNodeId="1210153168048" resolveInfo="ScalarType" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210154178578">
        <property name="name" value="b" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210154180267">
          <link role="typeVariableDeclaration" targetNodeId="1210153168048" resolveInfo="ScalarType" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1210155503328">
      <property name="name" value="addittiveInverse" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210155512607">
        <link role="typeVariableDeclaration" targetNodeId="1210153168048" resolveInfo="ScalarType" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1210155503330" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210155503331">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1210155524924">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1210155525926" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210155518062">
        <property name="name" value="a" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210155518063">
          <link role="typeVariableDeclaration" targetNodeId="1210153168048" resolveInfo="ScalarType" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1210180637222">
      <property name="name" value="multiplicativeInverse" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210180637223">
        <link role="typeVariableDeclaration" targetNodeId="1210153168048" resolveInfo="ScalarType" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1210180637224" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210180637225">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1210180637226">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1210180637227" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210180637228">
        <property name="name" value="a" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210180637229">
          <link role="typeVariableDeclaration" targetNodeId="1210153168048" resolveInfo="ScalarType" />
        </node>
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1210153117711" />
    <node role="typeVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration" id="1210153168048">
      <property name="name" value="ScalarType" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1210153359165">
    <property name="name" value="DoubleFieldOperations" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1210153463385">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1210153463386" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1210153463387" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210153463388" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1210153400955">
      <property name="name" value="add" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210153416778">
        <link role="classifier" targetNodeId="1.~Double" resolveInfo="Double" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1210153400957" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210153400958">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1210153429616">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1210153430526">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210153431623">
              <link role="variableDeclaration" targetNodeId="1210153424143" resolveInfo="b" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210153430509">
              <link role="variableDeclaration" targetNodeId="1210153422906" resolveInfo="a" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210153422906">
        <property name="name" value="a" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210153422907">
          <link role="classifier" targetNodeId="1.~Double" resolveInfo="Double" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210153424143">
        <property name="name" value="b" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210153426474">
          <link role="classifier" targetNodeId="1.~Double" resolveInfo="Double" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1210154222308">
      <property name="name" value="mult" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210154233922">
        <link role="classifier" targetNodeId="1.~Double" resolveInfo="Double" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1210154222310" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210154222311">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1210154247475">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.MulExpression" id="1210154249057">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210154249856">
              <link role="variableDeclaration" targetNodeId="1210154241738" resolveInfo="b" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210154249040">
              <link role="variableDeclaration" targetNodeId="1210154240376" resolveInfo="a" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210154240376">
        <property name="name" value="a" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210154240377">
          <link role="classifier" targetNodeId="1.~Double" resolveInfo="Double" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210154241738">
        <property name="name" value="b" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210154243802">
          <link role="classifier" targetNodeId="1.~Double" resolveInfo="Double" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1210155410545">
      <property name="name" value="addittiveInverse" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210155539521">
        <link role="classifier" targetNodeId="1.~Double" resolveInfo="Double" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1210155410547" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210155410548">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1210155548041">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.MinusExpression" id="1210155554766">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210155556691">
              <link role="variableDeclaration" targetNodeId="1210155545273" resolveInfo="a" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210155554734">
              <property name="value" value="0" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210155545273">
        <property name="name" value="a" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210155545274">
          <link role="classifier" targetNodeId="1.~Double" resolveInfo="Double" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1210180714674">
      <property name="name" value="multiplicativeInverse" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210180736619">
        <link role="classifier" targetNodeId="1.~Double" resolveInfo="Double" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1210180714676" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210180714677">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1210180714678">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DivExpression" id="1210180745784">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210180749571">
              <link role="variableDeclaration" targetNodeId="1210180714680" resolveInfo="a" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210180744876">
              <property name="value" value="1" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210180714680">
        <property name="name" value="a" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210180742155">
          <link role="classifier" targetNodeId="1.~Double" resolveInfo="Double" />
        </node>
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1210153359166" />
    <node role="implementedInterface" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210153374141">
      <link role="classifier" targetNodeId="1210153117710" resolveInfo="FieldOperations" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210153377801">
        <link role="classifier" targetNodeId="1.~Double" resolveInfo="Double" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1210241674240">
    <property name="name" value="MatrixIterator" />
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1210241770067">
      <property name="name" value="getNext" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210241850825">
        <link role="typeVariableDeclaration" targetNodeId="1210241797540" resolveInfo="ScalarType" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1210241770069" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210241770070">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1210241854640">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1210241854641">
            <property name="name" value="t" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210241854642">
              <link role="typeVariableDeclaration" targetNodeId="1210241797540" resolveInfo="ScalarType" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210241868473">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210241860147">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210241860148">
                  <link role="fieldDeclaration" targetNodeId="1210241687125" resolveInfo="matrix" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210241860149" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210241872979">
                <link role="baseMethodDeclaration" targetNodeId="1209980434079" resolveInfo="getValueAt" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210241874262">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210241874263">
                    <link role="fieldDeclaration" targetNodeId="1210241699870" resolveInfo="i" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210241874264" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210241890890">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210241890891">
                    <link role="fieldDeclaration" targetNodeId="1210241709848" resolveInfo="j" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210241890892" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210241921207">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1210241923243">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1210241926267">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210241927802">
                <property name="value" value="1" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210241924372">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210241959330">
                  <link role="fieldDeclaration" targetNodeId="1210241709848" resolveInfo="j" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210241924374" />
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210241921208">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210241957438">
                <link role="fieldDeclaration" targetNodeId="1210241709848" resolveInfo="j" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210241921210" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1210241930384">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210241930385">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210241968822">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1210241971593">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1210241973193">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210241974528">
                    <property name="value" value="1" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210241973144">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210241973145">
                      <link role="fieldDeclaration" targetNodeId="1210241699870" resolveInfo="i" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210241973146" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210241968823">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210241968824">
                    <link role="fieldDeclaration" targetNodeId="1210241699870" resolveInfo="i" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210241968825" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210241978235">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1210241982303">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210241983604">
                  <property name="value" value="0" />
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210241978236">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210241978237">
                    <link role="fieldDeclaration" targetNodeId="1210241709848" resolveInfo="j" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210241978238" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.GreaterThanOrEqualsExpression" id="1210241934049">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210241939705">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210241938210">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210241938211">
                  <link role="fieldDeclaration" targetNodeId="1210241687125" resolveInfo="matrix" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210241938212" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210241950448">
                <link role="baseMethodDeclaration" targetNodeId="1209985414706" resolveInfo="getColumnsNumber" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210241933076">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210241962598">
                <link role="fieldDeclaration" targetNodeId="1210241709848" resolveInfo="j" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210241933078" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1210241905011">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210241911189">
            <link role="variableDeclaration" targetNodeId="1210241854641" resolveInfo="t" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1210241986231">
      <property name="name" value="getRow" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1210241993304" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1210241986233" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210241986234">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1210242001684">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210242004140">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210242004141">
              <link role="fieldDeclaration" targetNodeId="1210241699870" resolveInfo="i" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210242004142" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1210242005847">
      <property name="name" value="getColumnl" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1210242012920" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1210242005849" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210242005850">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1210242022253">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210242024991">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210242024992">
              <link role="fieldDeclaration" targetNodeId="1210241709848" resolveInfo="j" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210242024993" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1210242026713">
      <property name="name" value="hasNext" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1210242034114" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1210242026715" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210242026716">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1210242044198">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1210242048533">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210242050922">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210242049677">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210242049678">
                  <link role="fieldDeclaration" targetNodeId="1210241687125" resolveInfo="matrix" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210242049679" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210242055069">
                <link role="baseMethodDeclaration" targetNodeId="1209985136722" resolveInfo="getRowsNumber" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210242047029">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210242047030">
                <link role="fieldDeclaration" targetNodeId="1210241699870" resolveInfo="i" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210242047031" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1210241718295">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1210241718296" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1210241718297" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210241718298">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210241730401">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1210241733969">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210241743215">
              <link role="variableDeclaration" targetNodeId="1210241723630" resolveInfo="matrix" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210241730402">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210241730403">
                <link role="fieldDeclaration" targetNodeId="1210241687125" resolveInfo="matrix" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210241730404" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210241746234">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1210241755638">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210241756470">
              <property name="value" value="0" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210241752368">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210241752369">
                <link role="fieldDeclaration" targetNodeId="1210241699870" resolveInfo="i" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210241752370" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210241759348">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1210241761481">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1210241763047">
              <property name="value" value="0" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210241759366">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210241759349" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1210241760448">
                <link role="fieldDeclaration" targetNodeId="1210241709848" resolveInfo="j" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210241723630">
        <property name="name" value="matrix" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210241723631">
          <link role="classifier" targetNodeId="1209978932613" resolveInfo="Matrix" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210241808782">
            <link role="typeVariableDeclaration" targetNodeId="1210241797540" resolveInfo="ScalarType" />
          </node>
        </node>
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1210241687125">
      <property name="name" value="matrix" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1210241687126" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210241839910">
        <link role="classifier" targetNodeId="1209978932613" resolveInfo="Matrix" />
        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1210241843023">
          <link role="typeVariableDeclaration" targetNodeId="1210241797540" resolveInfo="ScalarType" />
        </node>
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1210241699870">
      <property name="name" value="i" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1210241699871" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1210241702515" />
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1210241709848">
      <property name="name" value="j" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1210241709849" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1210241710993" />
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1210241674241" />
    <node role="typeVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration" id="1210241797540">
      <property name="name" value="ScalarType" />
    </node>
  </node>
</model>


<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.internalCollections.test.closures">
  <persistence version="1" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.baseLanguage.unitTest" />
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="1" />
  </language>
  <language namespace="jetbrains.mps.closures">
    <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.internal.collections" />
  <maxImportIndex value="3" />
  <import index="1" modelUID="java.util@java_stub" version="-1" />
  <import index="2" modelUID="java.lang@java_stub" version="-1" />
  <import index="3" modelUID="jetbrains.mps.internal.collections.runtime@java_stub" version="-1" />
  <node type="jetbrains.mps.baseLanguage.unitTest.structure.BTestCase" id="1203180268870">
    <property name="testCaseName" value="Where" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1203180268871" />
    <node role="testMethodList" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethodList" id="1203180268872">
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1203883087690">
        <property name="methodName" value="whereMethod" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1203883087691" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1203883087692">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1203883107824">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1203883107825">
              <property name="name" value="seq" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1203883107826">
                <link role="classifier" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1203883107828">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1203883107829">
                <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.fromIterable(java.lang.Iterable):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromIterable" />
                <link role="classConcept" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204793841938">
                  <link role="baseMethodDeclaration" targetNodeId="1204793778541" resolveInfo="input5" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1204793841939" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1203883107832">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1203883107833">
              <property name="name" value="test" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1203883107834">
                <link role="classifier" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1203883107836">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1203883107837">
                <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.where(jetbrains.mps.internal.collections.runtime.IWhereFilter):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="where" />
                <node role="actualArgument" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1203883107838">
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1203883107839">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1203883121582">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1203883124890">
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1203883137593">
                          <property name="value" value="1" />
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.RemExpression" id="1203883122207">
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1203883121583">
                            <link role="variableDeclaration" targetNodeId="1203883107846" resolveInfo="it" />
                          </node>
                          <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1203883123621">
                            <property name="value" value="2" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1203883107846">
                    <property name="name" value="it" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1203883107847" />
                  </node>
                </node>
                <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203883107848">
                  <link role="variableDeclaration" targetNodeId="1203883107825" resolveInfo="seq" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1203883107864">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1203883107865">
              <link role="baseMethodDeclaration" targetNodeId="1204129289579" resolveInfo="assertIterableEquals" />
              <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1203883107866" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204794106270">
                <link role="baseMethodDeclaration" targetNodeId="1204793880605" resolveInfo="expectOdd5" />
                <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1204794106271" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1203883107868">
                <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.toIterable():java.lang.Iterable" resolveInfo="toIterable" />
                <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203883107869">
                  <link role="variableDeclaration" targetNodeId="1203883107833" resolveInfo="test" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1204735206254">
        <property name="methodName" value="whereFilterVar" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1204735206255" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204735206256">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204735219221">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204735219222">
              <property name="name" value="seq" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204735219223">
                <link role="classifier" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204735219225">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204735219226">
                <link role="classConcept" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.fromIterable(java.lang.Iterable):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromIterable" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204793850382">
                  <link role="baseMethodDeclaration" targetNodeId="1204793778541" resolveInfo="input5" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1204793850383" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204735229828">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204735229829">
              <property name="name" value="filter" />
              <node role="initializer" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1204735229833">
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204735229834">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204735229835">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1204735229836">
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.RemExpression" id="1204735229837">
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204735229838">
                          <link role="variableDeclaration" targetNodeId="1204735229841" resolveInfo="it" />
                        </node>
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204735229839">
                          <property name="value" value="2" />
                        </node>
                      </node>
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204735229840">
                        <property name="value" value="1" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1204735229841">
                  <property name="name" value="it" />
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1204735229842" />
                </node>
              </node>
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204735236961">
                <link role="classifier" targetNodeId="3.~IWhereFilter" resolveInfo="IWhereFilter" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204735277677">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204735219228">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204735219229">
              <property name="name" value="test" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204735219230">
                <link role="classifier" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204735219232">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204735285865">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204735219244">
                  <link role="variableDeclaration" targetNodeId="1204735219222" resolveInfo="seq" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204735285866">
                  <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.where(jetbrains.mps.internal.collections.runtime.IWhereFilter):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="where" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204735229844">
                    <link role="variableDeclaration" targetNodeId="1204735229829" resolveInfo="where" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204735219252">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204735295373">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1204735219254" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204735295374">
                <link role="baseMethodDeclaration" targetNodeId="1204129289579" resolveInfo="assertIterableEquals" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204794063519">
                  <link role="baseMethodDeclaration" targetNodeId="1204793880605" resolveInfo="expOdd5" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1204794063520" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204735290521">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204735219257">
                    <link role="variableDeclaration" targetNodeId="1204735219229" resolveInfo="test" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204735290522">
                    <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.toIterable():java.lang.Iterable" resolveInfo="toIterable" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1204735541061">
        <property name="methodName" value="whereOperation" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1204735541062" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204735541063">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204735571101">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204735571102">
              <property name="name" value="seq" />
              <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType" id="1204735571103">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204735573868">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204793831623">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1204793827780" />
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204793831624">
                  <link role="baseMethodDeclaration" targetNodeId="1204793778541" resolveInfo="input5" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204735610384">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204735610385">
              <property name="name" value="test" />
              <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType" id="1204735610386">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204735610387">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1204735610388">
                <node role="operation" type="jetbrains.mps.internal.collections.structure.WhereOperation" id="1204735610389">
                  <node role="closure" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1204735610390">
                    <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204735610391">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204735610392">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1204735610393">
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.RemExpression" id="1204735610394">
                            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204735610395">
                              <link role="variableDeclaration" targetNodeId="1204735610398" resolveInfo="it" />
                            </node>
                            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204735610396">
                              <property name="value" value="2" />
                            </node>
                          </node>
                          <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204735610397">
                            <property name="value" value="1" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1204735610398">
                      <property name="name" value="it" />
                      <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1204735610399" />
                    </node>
                  </node>
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204735610401">
                  <link role="variableDeclaration" targetNodeId="1204735571102" resolveInfo="seq" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204735619642">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204735619643">
              <property name="name" value="expected" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204735619644">
                <link role="classifier" targetNodeId="2.~Iterable" resolveInfo="Iterable" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204735619645">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204735619646">
                <link role="classConcept" targetNodeId="1.~Arrays" resolveInfo="Arrays" />
                <link role="baseMethodDeclaration" targetNodeId="1.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204735619647">
                  <property name="value" value="1" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204735619648">
                  <property name="value" value="3" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204735626612">
                  <property name="value" value="5" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204735619649">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204735619650">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1204735619651" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204735619652">
                <link role="baseMethodDeclaration" targetNodeId="1204129289579" resolveInfo="assertIterableEquals" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204735619653">
                  <link role="variableDeclaration" targetNodeId="1204735619643" resolveInfo="expected" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204735619655">
                  <link role="variableDeclaration" targetNodeId="1204735610385" resolveInfo="test" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204130927735">
      <link role="classifier" targetNodeId="1204129267857" resolveInfo="Util_Test" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.unitTest.structure.BTestCase" id="1203687532018">
    <property name="testCaseName" value="Runtime" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1203687532019" />
    <node role="testMethodList" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethodList" id="1203687532020">
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1203687537673">
        <property name="methodName" value="fromIterable" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1203687537674" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1203687537675">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1203687746946">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1203687746947">
              <property name="name" value="seq" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1203687746948">
                <link role="classifier" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1203687746950">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1203687746951">
                <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.fromIterable(java.lang.Iterable):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromIterable" />
                <link role="classConcept" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204794247494">
                  <link role="baseMethodDeclaration" targetNodeId="1204793778541" resolveInfo="input5" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1204794247495" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1203687954472">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1203687954473">
              <link role="baseMethodDeclaration" targetNodeId="1204129289579" resolveInfo="assertIterableEquals" />
              <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1203687954474" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204794256566">
                <link role="baseMethodDeclaration" targetNodeId="1204793778541" resolveInfo="input5" />
                <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1204794256567" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1203687961491">
                <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.toIterable():java.lang.Iterable" resolveInfo="toIterable" />
                <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203687958643">
                  <link role="variableDeclaration" targetNodeId="1203687746947" resolveInfo="ss" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204129285768">
      <link role="classifier" targetNodeId="1204129267857" resolveInfo="Util_Test" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.unitTest.structure.BTestCase" id="1203688720943">
    <property name="testCaseName" value="Mapper" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1203688720944" />
    <node role="testMethodList" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethodList" id="1203688720945">
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1203688725368">
        <property name="methodName" value="mapMethod" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1203688725369" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1203688725370">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1203688764224">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1203688764225">
              <property name="name" value="seq" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1203688764226">
                <link role="classifier" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1203688764228">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1203688764229">
                <link role="classConcept" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.fromIterable(java.lang.Iterable):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromIterable" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204794206446">
                  <link role="baseMethodDeclaration" targetNodeId="1204793778541" resolveInfo="input5" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1204794206447" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1203688904914">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1203688904915">
              <property name="name" value="test" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1203688904916">
                <link role="classifier" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1203688926767">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1203688904919">
                <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.map(jetbrains.mps.internal.collections.runtime.IMapper):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="map" />
                <node role="actualArgument" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1203688904920">
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1203688904921">
                    <node role="statement" type="jetbrains.mps.closures.structure.YieldStatement" id="1203688904922">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1203688904923">
                        <link role="variableDeclaration" targetNodeId="1203688904928" resolveInfo="it" />
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.closures.structure.YieldStatement" id="1203688904924">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.MulExpression" id="1203688904925">
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1203688904926">
                          <link role="variableDeclaration" targetNodeId="1203688904928" resolveInfo="it" />
                        </node>
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1203688904927">
                          <property name="value" value="2" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1203688904928">
                    <property name="name" value="it1" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1203688904929" />
                  </node>
                </node>
                <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203688904930">
                  <link role="variableDeclaration" targetNodeId="1203688764225" resolveInfo="seq" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1203689005469">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1203689005470">
              <property name="name" value="expected" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1203689005471">
                <link role="classifier" targetNodeId="2.~Iterable" resolveInfo="Iterable" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1203689005472">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1203689005473">
                <link role="baseMethodDeclaration" targetNodeId="1.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
                <link role="classConcept" targetNodeId="1.~Arrays" resolveInfo="Arrays" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1203689005474">
                  <property name="value" value="1" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1203689013429">
                  <property name="value" value="2" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1203689005475">
                  <property name="value" value="2" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1203689014966">
                  <property name="value" value="4" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1203689005476">
                  <property name="value" value="3" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1203689016901">
                  <property name="value" value="6" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1203689005477">
                  <property name="value" value="4" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1203689018710">
                  <property name="value" value="8" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1203689005478">
                  <property name="value" value="5" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1203689020542">
                  <property name="value" value="10" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1203689024283">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1203689024284">
              <link role="baseMethodDeclaration" targetNodeId="1204129289579" resolveInfo="assertIterableEquals" />
              <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1203689024285" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203689026009">
                <link role="variableDeclaration" targetNodeId="1203689005470" resolveInfo="expected" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1203689031518">
                <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.toIterable():java.lang.Iterable" resolveInfo="toIterable" />
                <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203689027658">
                  <link role="variableDeclaration" targetNodeId="1203688904915" resolveInfo="test" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1203688847796">
        <property name="methodName" value="mapperVar" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1203688847797" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1203688847798">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1203689079729">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1203689079730">
              <property name="name" value="seq" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1203689079731">
                <link role="classifier" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1203689079733">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1203689079734">
                <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.fromIterable(java.lang.Iterable):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromIterable" />
                <link role="classConcept" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204794218359">
                  <link role="baseMethodDeclaration" targetNodeId="1204793778541" resolveInfo="input5" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1204794218360" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1203688860708">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1203688860709">
              <property name="name" value="mapper" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1203688860710">
                <link role="classifier" targetNodeId="3.~IMapper" resolveInfo="IMapper" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1203688860711">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1203689057283">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1203688860713">
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1203688860714">
                  <node role="statement" type="jetbrains.mps.closures.structure.YieldStatement" id="1203688860715">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1203688860716">
                      <link role="variableDeclaration" targetNodeId="1203688860721" resolveInfo="it" />
                    </node>
                  </node>
                  <node role="statement" type="jetbrains.mps.closures.structure.YieldStatement" id="1203688860717">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.MulExpression" id="1203688860718">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1203688860719">
                        <property name="value" value="2" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1203688860720">
                        <link role="variableDeclaration" targetNodeId="1203688860721" resolveInfo="it" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1203688860721">
                  <property name="name" value="i" />
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1203688860723" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1203689087221">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1203689087222">
              <property name="name" value="expected" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1203689087223">
                <link role="classifier" targetNodeId="2.~Iterable" resolveInfo="Iterable" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1203689087224">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1203689087225">
                <link role="classConcept" targetNodeId="1.~Arrays" resolveInfo="Arrays" />
                <link role="baseMethodDeclaration" targetNodeId="1.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1203689087226">
                  <property name="value" value="1" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1203689087227">
                  <property name="value" value="2" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1203689087228">
                  <property name="value" value="2" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1203689087229">
                  <property name="value" value="4" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1203689087230">
                  <property name="value" value="3" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1203689087231">
                  <property name="value" value="6" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1203689087232">
                  <property name="value" value="4" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1203689087233">
                  <property name="value" value="8" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1203689087234">
                  <property name="value" value="5" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1203689087235">
                  <property name="value" value="10" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1203689087237">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1203689087238">
              <link role="baseMethodDeclaration" targetNodeId="1204129289579" resolveInfo="assertIterableEquals" />
              <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1203689087239" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203689087240">
                <link role="variableDeclaration" targetNodeId="1203689087222" resolveInfo="expected" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1203689105290">
                <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.toIterable():java.lang.Iterable" resolveInfo="toIterable" />
                <node role="instance" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1203689095850">
                  <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.map(jetbrains.mps.internal.collections.runtime.IMapper):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="map" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203689093164">
                    <link role="variableDeclaration" targetNodeId="1203689079730" resolveInfo="seq" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203689102114">
                    <link role="variableDeclaration" targetNodeId="1203688860709" resolveInfo="foo" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1203883642101">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1203883642102">
              <link role="baseMethodDeclaration" targetNodeId="1204129289579" resolveInfo="assertIterableEquals" />
              <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1203883642103" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203883642104">
                <link role="variableDeclaration" targetNodeId="1203689087222" resolveInfo="expected" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1203883642105">
                <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.toIterable():java.lang.Iterable" resolveInfo="toIterable" />
                <node role="instance" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1203883647550">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203883642107">
                    <link role="variableDeclaration" targetNodeId="1203689079730" resolveInfo="seq" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1203883648706">
                    <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.map(jetbrains.mps.internal.collections.runtime.IMapper):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="map" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1203883650420">
                      <link role="variableDeclaration" targetNodeId="1203688860709" resolveInfo="mapper" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1204739052456">
        <property name="methodName" value="mappingOperation" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1204739052457" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204739052458">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204739142384">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204739142385">
              <property name="name" value="test" />
              <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType" id="1204739142386">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204739142387">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1204739142388">
                <node role="operation" type="jetbrains.mps.internal.collections.structure.MappingOperation" id="1204739142389">
                  <node role="closure" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1204739142390">
                    <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204739142391">
                      <node role="statement" type="jetbrains.mps.closures.structure.YieldStatement" id="1204739142392">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204739142393">
                          <link role="variableDeclaration" targetNodeId="1204739142398" resolveInfo="i" />
                        </node>
                      </node>
                      <node role="statement" type="jetbrains.mps.closures.structure.YieldStatement" id="1204739142394">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.MulExpression" id="1204739142395">
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204739142396">
                            <link role="variableDeclaration" targetNodeId="1204739142398" resolveInfo="i" />
                          </node>
                          <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204739142397">
                            <property name="value" value="2" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1204739142398">
                      <property name="name" value="i" />
                      <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1204739142399" />
                    </node>
                  </node>
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204794235762">
                  <link role="baseMethodDeclaration" targetNodeId="1204793778541" resolveInfo="input5" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1204794235763" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204739156914">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204739156915">
              <link role="baseMethodDeclaration" targetNodeId="1204129289579" resolveInfo="assertIterableEquals" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204739162716">
                <link role="classConcept" targetNodeId="1.~Arrays" resolveInfo="Arrays" />
                <link role="baseMethodDeclaration" targetNodeId="1.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204739162717">
                  <property name="value" value="1" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204739162718">
                  <property name="value" value="2" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204739162719">
                  <property name="value" value="2" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204739162720">
                  <property name="value" value="4" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204739162721">
                  <property name="value" value="3" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204739162722">
                  <property name="value" value="6" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204739162723">
                  <property name="value" value="4" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204739162724">
                  <property name="value" value="8" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204739162725">
                  <property name="value" value="5" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204739162726">
                  <property name="value" value="10" />
                </node>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204739166103">
                <link role="variableDeclaration" targetNodeId="1204739142385" resolveInfo="test" />
              </node>
              <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1204739156916" />
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1203884002064">
        <property name="methodName" value="weirdness" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1203884002065" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1203884002066">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204046272629">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204046272630">
              <property name="name" value="input" />
              <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType" id="1204046272631">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204046272632">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204046272633">
                <link role="classConcept" targetNodeId="1.~Arrays" resolveInfo="Arrays" />
                <link role="baseMethodDeclaration" targetNodeId="1.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204046272634">
                  <property name="value" value="1" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204046272635">
                  <property name="value" value="12" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204046272636">
                  <property name="value" value="3" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204046272637">
                  <property name="value" value="14" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204046272638">
                  <property name="value" value="5" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.CommentedStatementsBlock" id="1203884222012">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204075089782">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204075089783">
                <property name="name" value="output" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204075089784">
                  <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.where(jetbrains.mps.internal.collections.runtime.IWhereFilter):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="where" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204075089785">
                    <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.map(jetbrains.mps.internal.collections.runtime.IMapper):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="map" />
                    <node role="actualArgument" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1204075089786">
                      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204075089787">
                        <node role="statement" type="jetbrains.mps.closures.structure.YieldStatement" id="1204075089788">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204075089789">
                            <link role="classConcept" targetNodeId="2.~String" resolveInfo="String" />
                            <link role="baseMethodDeclaration" targetNodeId="2.~String.valueOf(int):java.lang.String" resolveInfo="valueOf" />
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204075089790">
                              <link role="variableDeclaration" targetNodeId="1204075089791" resolveInfo="it2" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1204075089791">
                        <property name="name" value="it2" />
                        <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1204075089792" />
                      </node>
                    </node>
                    <node role="instance" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204075089793">
                      <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.fromIterable(java.lang.Iterable):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromIterable" />
                      <link role="classConcept" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204075089794">
                        <link role="variableDeclaration" targetNodeId="1204046272630" resolveInfo="input" />
                      </node>
                    </node>
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1204075089795">
                    <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204075089796">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204075089797">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1204075089798">
                          <property name="value" value="false" />
                        </node>
                      </node>
                    </node>
                    <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1204075089799">
                      <property name="name" value="it3" />
                      <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1204075089800" />
                    </node>
                  </node>
                </node>
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204075096578">
                  <link role="classifier" targetNodeId="2.~Object" resolveInfo="Object" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204075077670">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204075077671">
                <property name="name" value="output2" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204075077672">
                  <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.where(jetbrains.mps.internal.collections.runtime.IWhereFilter):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="where" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204075077673">
                    <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.map(jetbrains.mps.internal.collections.runtime.IMapper):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="map" />
                    <node role="actualArgument" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1204075077674">
                      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204075077675">
                        <node role="statement" type="jetbrains.mps.closures.structure.YieldStatement" id="1204075077676">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204075077677">
                            <link role="classConcept" targetNodeId="2.~String" resolveInfo="String" />
                            <link role="baseMethodDeclaration" targetNodeId="2.~String.valueOf(int):java.lang.String" resolveInfo="valueOf" />
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204075077678">
                              <link role="variableDeclaration" targetNodeId="1204075077679" resolveInfo="it2" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1204075077679">
                        <property name="name" value="it2" />
                        <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1204075077680" />
                      </node>
                    </node>
                    <node role="instance" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204075077682">
                      <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.fromIterable(java.lang.Iterable):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromIterable" />
                      <link role="classConcept" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204075077683">
                        <link role="variableDeclaration" targetNodeId="1204046272630" resolveInfo="input" />
                      </node>
                    </node>
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1204075077684">
                    <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204075077685">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204075077686">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1204075077687">
                          <property name="value" value="false" />
                        </node>
                      </node>
                    </node>
                    <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1204075077688">
                      <property name="name" value="it3" />
                      <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1204075077689" />
                    </node>
                  </node>
                </node>
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204075077690">
                  <link role="classifier" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204046286229">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204046286230">
                <property name="name" value="output3" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204049372627">
                  <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.where(jetbrains.mps.internal.collections.runtime.IWhereFilter):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="where" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204046286233">
                    <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.map(jetbrains.mps.internal.collections.runtime.IMapper):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="map" />
                    <node role="actualArgument" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1204046286234">
                      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204046286235">
                        <node role="statement" type="jetbrains.mps.closures.structure.YieldStatement" id="1204046286236">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204046286237">
                            <link role="classConcept" targetNodeId="2.~String" resolveInfo="String" />
                            <link role="baseMethodDeclaration" targetNodeId="2.~String.valueOf(int):java.lang.String" resolveInfo="valueOf" />
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204046286238">
                              <link role="variableDeclaration" targetNodeId="1204046286239" resolveInfo="it" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1204046286239">
                        <property name="name" value="it2" />
                        <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1204046286240" />
                      </node>
                    </node>
                    <node role="instance" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204046286241">
                      <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.fromIterable(java.lang.Iterable):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromIterable" />
                      <link role="classConcept" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204046286242">
                        <link role="variableDeclaration" targetNodeId="1204046272630" resolveInfo="input" />
                      </node>
                    </node>
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1204049378003">
                    <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204049378004">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204049456349">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1204049456350">
                          <property name="value" value="false" />
                        </node>
                      </node>
                    </node>
                    <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1204049382297">
                      <property name="name" value="it3" />
                      <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1204049382298" />
                    </node>
                  </node>
                </node>
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204074947230">
                  <link role="classifier" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                  <node role="parameter" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1204075045509" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204074997149">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204074997772">
                <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.where(jetbrains.mps.internal.collections.runtime.IWhereFilter):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="where" />
                <node role="instance" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204074997773">
                  <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.map(jetbrains.mps.internal.collections.runtime.IMapper):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="map" />
                  <node role="actualArgument" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1204074997774">
                    <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204074997775">
                      <node role="statement" type="jetbrains.mps.closures.structure.YieldStatement" id="1204074997776">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204074997777">
                          <link role="classConcept" targetNodeId="2.~String" resolveInfo="String" />
                          <link role="baseMethodDeclaration" targetNodeId="2.~String.valueOf(int):java.lang.String" resolveInfo="valueOf" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204074997778">
                            <link role="variableDeclaration" targetNodeId="1204074997779" resolveInfo="it2" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1204074997779">
                      <property name="name" value="it2" />
                      <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1204074997780" />
                    </node>
                  </node>
                  <node role="instance" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204074997781">
                    <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.fromIterable(java.lang.Iterable):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromIterable" />
                    <link role="classConcept" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204074997782">
                      <link role="variableDeclaration" targetNodeId="1204046272630" resolveInfo="input" />
                    </node>
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1204074997783">
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204074997784">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204074997785">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1204074997786">
                        <property name="value" value="false" />
                      </node>
                    </node>
                  </node>
                  <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1204074997787">
                    <property name="name" value="it3" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1204074997788" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204130933818">
      <link role="classifier" targetNodeId="1204129267857" resolveInfo="Util_Test" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.unitTest.structure.BTestCase" id="1204111028494">
    <property name="testCaseName" value="ChainedOperations" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1204111028495" />
    <node role="testMethodList" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethodList" id="1204111028496">
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1204111038459">
        <property name="methodName" value="chainedCall" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1204111038460" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204111038461">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204129169608">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204129169609">
              <property name="name" value="test" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204129169610">
                <link role="classifier" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204129169612">
                  <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204129169613">
                <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.where(jetbrains.mps.internal.collections.runtime.IWhereFilter):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="where" />
                <node role="actualArgument" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1204129169614">
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204129169615">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204129169616">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1204129169617">
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204129169618">
                          <link role="baseMethodDeclaration" targetNodeId="2.~String.length():int" resolveInfo="length" />
                          <node role="instance" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204129169619">
                            <link role="variableDeclaration" targetNodeId="1204129169621" resolveInfo="it" />
                          </node>
                        </node>
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204129169620">
                          <property name="value" value="2" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1204129169621">
                    <property name="name" value="it" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1204129169622" />
                  </node>
                </node>
                <node role="instance" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204129169623">
                  <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.map(jetbrains.mps.internal.collections.runtime.IMapper):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="map" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204796033444">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204129169624">
                      <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.fromIterable(java.lang.Iterable):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromIterable" />
                      <link role="classConcept" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204795937760">
                        <link role="baseMethodDeclaration" targetNodeId="1204793778541" resolveInfo="input5" />
                        <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1204795937761" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204796035420">
                      <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.select(jetbrains.mps.internal.collections.runtime.ISelector):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="select" />
                      <node role="actualArgument" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1204796037813">
                        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204796037814">
                          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204796050606">
                            <node role="expression" type="jetbrains.mps.baseLanguage.structure.MulExpression" id="1204796050620">
                              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204796056811">
                                <property name="value" value="3" />
                              </node>
                              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204796050607">
                                <link role="variableDeclaration" targetNodeId="1204796042997" resolveInfo="it" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1204796042997">
                          <property name="name" value="it" />
                          <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1204796042998" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1204129169626">
                    <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204129169627">
                      <node role="statement" type="jetbrains.mps.closures.structure.YieldStatement" id="1204129169628">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204129169629">
                          <link role="baseMethodDeclaration" targetNodeId="2.~String.valueOf(int):java.lang.String" resolveInfo="valueOf" />
                          <link role="classConcept" targetNodeId="2.~String" resolveInfo="String" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204129169630">
                            <link role="variableDeclaration" targetNodeId="1204129169631" resolveInfo="it" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1204129169631">
                      <property name="name" value="it" />
                      <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1204129169632" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204129134076">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204129134077">
              <link role="baseMethodDeclaration" targetNodeId="1204129289579" resolveInfo="assertIterableEquals" />
              <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1204129134078" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204129181180">
                <link role="baseMethodDeclaration" targetNodeId="1.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
                <link role="classConcept" targetNodeId="1.~Arrays" resolveInfo="Arrays" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1204129182297">
                  <property name="value" value="12" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1204129185646">
                  <property name="value" value="15" />
                </node>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204129192006">
                <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.toIterable():java.lang.Iterable" resolveInfo="toIterable" />
                <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204129189437">
                  <link role="variableDeclaration" targetNodeId="1204129169609" resolveInfo="test" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1204797491110">
        <property name="methodName" value="chainedOperations" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1204797491111" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204797491112">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204797574869">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204797574870">
              <property name="name" value="test" />
              <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType" id="1204797574871">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204797574872">
                  <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1204797574873">
                <node role="operation" type="jetbrains.mps.internal.collections.structure.WhereOperation" id="1204797574874">
                  <node role="closure" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1204797574875">
                    <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204797574876">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204797574877">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1204797574878">
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204797574879">
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204797574880">
                              <link role="baseMethodDeclaration" targetNodeId="2.~String.length():int" resolveInfo="length" />
                            </node>
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204797574881">
                              <link role="variableDeclaration" targetNodeId="1204797574883" resolveInfo="it" />
                            </node>
                          </node>
                          <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204797574882">
                            <property name="value" value="2" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1204797574883">
                      <property name="name" value="it" />
                      <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1204797574884" />
                    </node>
                  </node>
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1204797574886">
                  <node role="operation" type="jetbrains.mps.internal.collections.structure.MappingOperation" id="1204797574887">
                    <node role="closure" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1204797574888">
                      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204797574889">
                        <node role="statement" type="jetbrains.mps.closures.structure.YieldStatement" id="1204797574890">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204797574891">
                            <link role="baseMethodDeclaration" targetNodeId="2.~String.valueOf(int):java.lang.String" resolveInfo="valueOf" />
                            <link role="classConcept" targetNodeId="2.~String" resolveInfo="String" />
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204797574892">
                              <link role="variableDeclaration" targetNodeId="1204797574893" resolveInfo="it" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1204797574893">
                        <property name="name" value="it" />
                        <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1204797574894" />
                      </node>
                    </node>
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1204797574896">
                    <node role="operation" type="jetbrains.mps.internal.collections.structure.SelectOperation" id="1204797574897">
                      <node role="closure" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1204797574898">
                        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204797574899">
                          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204797574900">
                            <node role="expression" type="jetbrains.mps.baseLanguage.structure.MulExpression" id="1204797574901">
                              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204797574902">
                                <link role="variableDeclaration" targetNodeId="1204797574904" resolveInfo="it" />
                              </node>
                              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204797574903">
                                <property name="value" value="3" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1204797574904">
                          <property name="name" value="it" />
                          <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1204797574905" />
                        </node>
                      </node>
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204797574907">
                      <link role="baseMethodDeclaration" targetNodeId="1204793778541" resolveInfo="input5" />
                      <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1204797574908" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204797594112">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204797594113">
              <link role="baseMethodDeclaration" targetNodeId="1204129289579" resolveInfo="assertIterableEquals" />
              <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1204797594114" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204797599757">
                <link role="baseMethodDeclaration" targetNodeId="1.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
                <link role="classConcept" targetNodeId="1.~Arrays" resolveInfo="Arrays" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1204797599758">
                  <property name="value" value="12" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1204797599759">
                  <property name="value" value="15" />
                </node>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204797602409">
                <link role="variableDeclaration" targetNodeId="1204797574870" resolveInfo="test" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204130940183">
      <link role="classifier" targetNodeId="1204129267857" resolveInfo="Util_Test" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.unitTest.structure.BTestCase" id="1204129267857">
    <property name="testCaseName" value="Util" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1204129267858" />
    <node role="testMethodList" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethodList" id="1204129267859">
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1204129298262">
        <property name="methodName" value="dummy" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1204129298263" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204129298264" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1204129289579">
      <property name="name" value="assertIterableEquals" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1204129289580" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1204129289581" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204129289582">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204129289583">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204129289584">
            <property name="name" value="expIt" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204129289585">
              <link role="classifier" targetNodeId="1.~Iterator" resolveInfo="Iterator" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1204129289586">
                <link role="typeVariableDeclaration" targetNodeId="1204129289619" resolveInfo="T" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204129289587">
              <link role="baseMethodDeclaration" targetNodeId="2.~Iterable.iterator():java.util.Iterator" resolveInfo="iterator" />
              <node role="instance" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204129289588">
                <link role="variableDeclaration" targetNodeId="1204129289613" resolveInfo="exp" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204129289589">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204129289590">
            <property name="name" value="testIt" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204129289591">
              <link role="classifier" targetNodeId="1.~Iterator" resolveInfo="Iterator" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1204129289592">
                <link role="typeVariableDeclaration" targetNodeId="1204129289619" resolveInfo="T" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204129289593">
              <link role="baseMethodDeclaration" targetNodeId="2.~Iterable.iterator():java.util.Iterator" resolveInfo="iterator" />
              <node role="instance" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204129289594">
                <link role="variableDeclaration" targetNodeId="1204129289616" resolveInfo="test" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.WhileStatement" id="1204129289595">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1204129289596">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204129289597">
              <link role="baseMethodDeclaration" targetNodeId="1.~Iterator.hasNext():boolean" resolveInfo="hasNext" />
              <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204129289598">
                <link role="variableDeclaration" targetNodeId="1204129289590" resolveInfo="testIt" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204129289599">
              <link role="baseMethodDeclaration" targetNodeId="1.~Iterator.hasNext():boolean" resolveInfo="hasNext" />
              <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204129289600">
                <link role="variableDeclaration" targetNodeId="1204129289584" resolveInfo="expIt" />
              </node>
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204129289601">
            <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertEquals" id="1204129289602">
              <node role="expected" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204129289603">
                <link role="baseMethodDeclaration" targetNodeId="1.~Iterator.next():java.lang.Object" resolveInfo="next" />
                <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204129289604">
                  <link role="variableDeclaration" targetNodeId="1204129289584" resolveInfo="expIt" />
                </node>
              </node>
              <node role="actual" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204129289605">
                <link role="baseMethodDeclaration" targetNodeId="1.~Iterator.next():java.lang.Object" resolveInfo="next" />
                <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204129289606">
                  <link role="variableDeclaration" targetNodeId="1204129289590" resolveInfo="testIt" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse" id="1204129289607">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204129289608">
            <link role="baseMethodDeclaration" targetNodeId="1.~Iterator.hasNext():boolean" resolveInfo="hasNext" />
            <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204129289609">
              <link role="variableDeclaration" targetNodeId="1204129289584" resolveInfo="expIt" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse" id="1204129289610">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204129289611">
            <link role="baseMethodDeclaration" targetNodeId="1.~Iterator.hasNext():boolean" resolveInfo="hasNext" />
            <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204129289612">
              <link role="variableDeclaration" targetNodeId="1204129289590" resolveInfo="testIt" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1204129289613">
        <property name="name" value="exp" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204129289614">
          <link role="classifier" targetNodeId="2.~Iterable" resolveInfo="Iterable" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1204129289615">
            <link role="typeVariableDeclaration" targetNodeId="1204129289619" resolveInfo="T" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1204129289616">
        <property name="name" value="test" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204129289617">
          <link role="classifier" targetNodeId="2.~Iterable" resolveInfo="Iterable" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1204129289618">
            <link role="typeVariableDeclaration" targetNodeId="1204129289619" resolveInfo="T" />
          </node>
        </node>
      </node>
      <node role="typeVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration" id="1204129289619">
        <property name="name" value="T" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1205510239182">
      <property name="name" value="assertIterableEqualsAsSet" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1205510239183" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1205510239184" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205510239185">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205510293181">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205510293182">
            <property name="name" value="expSet" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205510293183">
              <link role="classifier" targetNodeId="1.~HashSet" resolveInfo="HashSet" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1205510300746">
                <link role="typeVariableDeclaration" targetNodeId="1205510266049" resolveInfo="T" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1205510305357">
              <link role="baseMethodDeclaration" targetNodeId="1.~HashSet.&lt;init&gt;()" resolveInfo="HashSet" />
              <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1205510305358">
                <link role="typeVariableDeclaration" targetNodeId="1205510266049" resolveInfo="T" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1205510374413">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205510374414">
            <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="1205510571430">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205510573550">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205510573551">
                  <link role="variableDeclaration" targetNodeId="1205510293182" resolveInfo="expSet" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205510573552">
                  <link role="baseMethodDeclaration" targetNodeId="1.~HashSet.add(java.lang.Object):boolean" resolveInfo="add" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205510573553">
                    <link role="variableDeclaration" targetNodeId="1205510374417" resolveInfo="e" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1205510381833">
            <link role="variableDeclaration" targetNodeId="1205510258589" resolveInfo="exp" />
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205510374417">
            <property name="name" value="e" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1205510378532">
              <link role="typeVariableDeclaration" targetNodeId="1205510266049" resolveInfo="T" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205510415090">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205510415091">
            <property name="name" value="testIt" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205510415092">
              <link role="classifier" targetNodeId="1.~Iterator" resolveInfo="Iterator" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1205510415093">
                <link role="typeVariableDeclaration" targetNodeId="1205510266049" resolveInfo="T" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1205510415094">
              <link role="baseMethodDeclaration" targetNodeId="2.~Iterable.iterator():java.util.Iterator" resolveInfo="iterator" />
              <node role="instance" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1205510415095">
                <link role="variableDeclaration" targetNodeId="1205510273505" resolveInfo="test" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.WhileStatement" id="1205510423541">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205510425943">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205510425611">
              <link role="variableDeclaration" targetNodeId="1205510415091" resolveInfo="testIt" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205510428899">
              <link role="baseMethodDeclaration" targetNodeId="1.~Iterator.hasNext():boolean" resolveInfo="hasNext" />
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205510423543">
            <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="1205510602150">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205510604558">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205510604559">
                  <link role="variableDeclaration" targetNodeId="1205510293182" resolveInfo="expSet" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205510604560">
                  <link role="baseMethodDeclaration" targetNodeId="1.~HashSet.remove(java.lang.Object):boolean" resolveInfo="remove" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205510604561">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205510604562">
                      <link role="variableDeclaration" targetNodeId="1205510415091" resolveInfo="testIt" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205510604563">
                      <link role="baseMethodDeclaration" targetNodeId="1.~Iterator.next():java.lang.Object" resolveInfo="next" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="1205510464994">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205510470734">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205510470225">
              <link role="variableDeclaration" targetNodeId="1205510293182" resolveInfo="expSet" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205510471750">
              <link role="baseMethodDeclaration" targetNodeId="1.~HashSet.isEmpty():boolean" resolveInfo="isEmpty" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse" id="1205510476148">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205510478471">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205510478220">
              <link role="variableDeclaration" targetNodeId="1205510415091" resolveInfo="testIt" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205510480575">
              <link role="baseMethodDeclaration" targetNodeId="1.~Iterator.hasNext():boolean" resolveInfo="hasNext" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1205510258589">
        <property name="name" value="exp" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205510258590">
          <link role="classifier" targetNodeId="2.~Iterable" resolveInfo="Iterable" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1205510271079">
            <link role="typeVariableDeclaration" targetNodeId="1205510266049" resolveInfo="T" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1205510273505">
        <property name="name" value="test" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205510275274">
          <link role="classifier" targetNodeId="2.~Iterable" resolveInfo="Iterable" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1205510276823">
            <link role="typeVariableDeclaration" targetNodeId="1205510266049" resolveInfo="T" />
          </node>
        </node>
      </node>
      <node role="typeVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration" id="1205510266049">
        <property name="name" value="T" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1205510696455">
      <property name="name" value="assertIterableEqualsIgnoreOrder" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1205510696456" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1205510696457" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205510696458">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205510696459">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205510696460">
            <property name="name" value="cardMap" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205510696461">
              <link role="classifier" targetNodeId="1.~HashMap" resolveInfo="HashMap" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1205510696462">
                <link role="typeVariableDeclaration" targetNodeId="1205510696507" resolveInfo="T" />
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205510714047">
                <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1205510696463">
              <link role="baseMethodDeclaration" targetNodeId="1.~HashMap.&lt;init&gt;()" resolveInfo="HashMap" />
              <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1205510696464">
                <link role="typeVariableDeclaration" targetNodeId="1205510696507" resolveInfo="T" />
              </node>
              <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205510726420">
                <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1205510696465">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205510696466">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205510749494">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205510749495">
                <property name="name" value="card" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205510749496">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205510749497">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205510749498">
                    <link role="baseMethodDeclaration" targetNodeId="1.~HashMap.get(java.lang.Object):java.lang.Object" resolveInfo="get" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205510749499">
                      <link role="variableDeclaration" targetNodeId="1205510696473" resolveInfo="e" />
                    </node>
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205510749500">
                    <link role="variableDeclaration" targetNodeId="1205510696460" resolveInfo="expCardMap" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205510762209">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205510762801">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205510762210">
                  <link role="variableDeclaration" targetNodeId="1205510696460" resolveInfo="expCardMap" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205510764680">
                  <link role="baseMethodDeclaration" targetNodeId="1.~HashMap.put(java.lang.Object,java.lang.Object):java.lang.Object" resolveInfo="put" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205510766393">
                    <link role="variableDeclaration" targetNodeId="1205510696473" resolveInfo="e" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression" id="1205510770622">
                    <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1205510775170">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1205510776621" />
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205510773796">
                        <link role="variableDeclaration" targetNodeId="1205510749495" resolveInfo="card" />
                      </node>
                    </node>
                    <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1205510779008">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205510779647">
                        <property name="value" value="1" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205510779001">
                        <link role="variableDeclaration" targetNodeId="1205510749495" resolveInfo="card" />
                      </node>
                    </node>
                    <node role="ifFalse" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205510781165">
                      <property name="value" value="1" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1205510696472">
            <link role="variableDeclaration" targetNodeId="1205510696501" resolveInfo="exp" />
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205510696473">
            <property name="name" value="e" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1205510696474">
              <link role="typeVariableDeclaration" targetNodeId="1205510696507" resolveInfo="T" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205510696475">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205510696476">
            <property name="name" value="testIt" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205510696477">
              <link role="classifier" targetNodeId="1.~Iterator" resolveInfo="Iterator" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1205510696478">
                <link role="typeVariableDeclaration" targetNodeId="1205510696507" resolveInfo="T" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1205510696479">
              <link role="baseMethodDeclaration" targetNodeId="2.~Iterable.iterator():java.util.Iterator" resolveInfo="iterator" />
              <node role="instance" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1205510696480">
                <link role="variableDeclaration" targetNodeId="1205510696504" resolveInfo="test" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.WhileStatement" id="1205510696481">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205510696482">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205510696483">
              <link role="variableDeclaration" targetNodeId="1205510696476" resolveInfo="testIt" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205510696484">
              <link role="baseMethodDeclaration" targetNodeId="1.~Iterator.hasNext():boolean" resolveInfo="hasNext" />
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205510696485">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205510825325">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205510825326">
                <property name="name" value="next" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1205510825327">
                  <link role="typeVariableDeclaration" targetNodeId="1205510696507" resolveInfo="T" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205510825328">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205510825329">
                    <link role="baseMethodDeclaration" targetNodeId="1.~Iterator.next():java.lang.Object" resolveInfo="next" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205510825330">
                    <link role="variableDeclaration" targetNodeId="1205510696476" resolveInfo="testIt" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205510816913">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205510816914">
                <property name="name" value="card" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205510816915">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205510816916">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205510816917">
                    <link role="baseMethodDeclaration" targetNodeId="1.~HashMap.remove(java.lang.Object):java.lang.Object" resolveInfo="remove" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205510835175">
                      <link role="variableDeclaration" targetNodeId="1205510825326" resolveInfo="next" />
                    </node>
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205510816919">
                    <link role="variableDeclaration" targetNodeId="1205510696460" resolveInfo="expCardMap" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse" id="1205510906159">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1205510908224">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1205510909668" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205510908026">
                  <link role="variableDeclaration" targetNodeId="1205510816914" resolveInfo="card" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1205510867763">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205510867764">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205510875568">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205510878062">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205510877714">
                      <link role="variableDeclaration" targetNodeId="1205510696460" resolveInfo="expCardMap" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205510879796">
                      <link role="baseMethodDeclaration" targetNodeId="1.~HashMap.put(java.lang.Object,java.lang.Object):java.lang.Object" resolveInfo="put" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205510881094">
                        <link role="variableDeclaration" targetNodeId="1205510825326" resolveInfo="next" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.MinusExpression" id="1205510883026">
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205510883641">
                          <property name="value" value="1" />
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205510883018">
                          <link role="variableDeclaration" targetNodeId="1205510816914" resolveInfo="card" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.GreaterThanExpression" id="1205510871921">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205510872618">
                  <property name="value" value="1" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205510870246">
                  <link role="variableDeclaration" targetNodeId="1205510816914" resolveInfo="card" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" id="1205510696493">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205510960041">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205510696495">
              <link role="variableDeclaration" targetNodeId="1205510696460" resolveInfo="expSet" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205510961042">
              <link role="baseMethodDeclaration" targetNodeId="1.~HashMap.isEmpty():boolean" resolveInfo="isEmpty" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse" id="1205510696497">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205510696498">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205510696499">
              <link role="variableDeclaration" targetNodeId="1205510696476" resolveInfo="testIt" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205510696500">
              <link role="baseMethodDeclaration" targetNodeId="1.~Iterator.hasNext():boolean" resolveInfo="hasNext" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1205510696501">
        <property name="name" value="exp" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205510696502">
          <link role="classifier" targetNodeId="2.~Iterable" resolveInfo="Iterable" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1205510696503">
            <link role="typeVariableDeclaration" targetNodeId="1205510696507" resolveInfo="T" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1205510696504">
        <property name="name" value="test" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205510696505">
          <link role="classifier" targetNodeId="2.~Iterable" resolveInfo="Iterable" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1205510696506">
            <link role="typeVariableDeclaration" targetNodeId="1205510696507" resolveInfo="T" />
          </node>
        </node>
      </node>
      <node role="typeVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration" id="1205510696507">
        <property name="name" value="T" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1204991762959">
      <property name="name" value="inputEmpty" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType" id="1204991765850">
        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204991770729">
          <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1204991762961" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204991762962">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1204991776828">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204991781266">
            <link role="baseMethodDeclaration" targetNodeId="1.~Collections.emptyList():java.util.List" resolveInfo="emptyList" />
            <link role="classConcept" targetNodeId="1.~Collections" resolveInfo="Collections" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1204793778541">
      <property name="name" value="input5" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1204793778543" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204793778544">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1204793794443">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204793800326">
            <link role="baseMethodDeclaration" targetNodeId="1.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
            <link role="classConcept" targetNodeId="1.~Arrays" resolveInfo="Arrays" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204793805340">
              <property name="value" value="1" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204793806430">
              <property name="value" value="2" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204793807185">
              <property name="value" value="3" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204793807779">
              <property name="value" value="4" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204793808363">
              <property name="value" value="5" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType" id="1204794148838">
        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204794152990">
          <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1204793880605">
      <property name="name" value="expectOdd5" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1204793880607" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204793880608">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1204793900310">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204793903969">
            <link role="baseMethodDeclaration" targetNodeId="1.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
            <link role="classConcept" targetNodeId="1.~Arrays" resolveInfo="Arrays" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204793905876">
              <property name="value" value="1" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204793907221">
              <property name="value" value="3" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204793908373">
              <property name="value" value="5" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType" id="1204794156954">
        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204794161184">
          <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1204981312409">
      <property name="name" value="expectEven10" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType" id="1204981315250">
        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204981318733">
          <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1204981312411" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204981312412">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1204981333544">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204981334696">
            <link role="baseMethodDeclaration" targetNodeId="1.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
            <link role="classConcept" targetNodeId="1.~Arrays" resolveInfo="Arrays" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204981334697">
              <property name="value" value="2" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204981334698">
              <property name="value" value="4" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204981334699">
              <property name="value" value="6" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204981334700">
              <property name="value" value="8" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204981334701">
              <property name="value" value="10" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.unitTest.structure.BTestCase" id="1204285379459">
    <property name="testCaseName" value="SelectTest" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1204285379460" />
    <node role="testMethodList" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethodList" id="1204285379461">
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1204285386955">
        <property name="methodName" value="selectMethod" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1204285386956" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204285386957">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204285480048">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204285480049">
              <property name="name" value="seq" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204285480050">
                <link role="classifier" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204285480052">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204285480053">
                <link role="classConcept" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.fromIterable(java.lang.Iterable):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromIterable" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204794171121">
                  <link role="baseMethodDeclaration" targetNodeId="1204793778541" resolveInfo="input5" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1204794171122" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204286012436">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204286012437">
              <property name="name" value="test" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204286012438">
                <link role="classifier" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204286023449">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204286012441">
                <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.select(jetbrains.mps.internal.collections.runtime.ISelector):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="select" />
                <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204286012442">
                  <link role="variableDeclaration" targetNodeId="1204285480049" resolveInfo="seq" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1204286012443">
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204286012444">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204565508631">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression" id="1204565508632">
                        <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1204565512036">
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.RemExpression" id="1204565512037">
                            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204565515183">
                              <link role="variableDeclaration" targetNodeId="1204286012456" resolveInfo="it" />
                            </node>
                            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204565512039">
                              <property name="value" value="2" />
                            </node>
                          </node>
                          <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204565512040">
                            <property name="value" value="1" />
                          </node>
                        </node>
                        <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.MulExpression" id="1204565520889">
                          <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204565521662">
                            <property name="value" value="2" />
                          </node>
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204565520845">
                            <link role="variableDeclaration" targetNodeId="1204286012456" resolveInfo="it" />
                          </node>
                        </node>
                        <node role="ifFalse" type="jetbrains.mps.baseLanguage.structure.MulExpression" id="1204565524315">
                          <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204565524844">
                            <property name="value" value="3" />
                          </node>
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204565524302">
                            <link role="variableDeclaration" targetNodeId="1204286012456" resolveInfo="it" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1204286012456">
                    <property name="name" value="it" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1204286012457" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204285525147">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204285525148">
              <link role="baseMethodDeclaration" targetNodeId="1204129289579" resolveInfo="assertIterableEquals" />
              <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1204285525149" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204285527746">
                <link role="baseMethodDeclaration" targetNodeId="1.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
                <link role="classConcept" targetNodeId="1.~Arrays" resolveInfo="Arrays" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204285527747">
                  <property name="value" value="2" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204565536005">
                  <property name="value" value="6" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204285527749">
                  <property name="value" value="6" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204565540668">
                  <property name="value" value="12" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204285527751">
                  <property name="value" value="10" />
                </node>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204285548386">
                <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.toIterable():java.lang.Iterable" resolveInfo="toIterable" />
                <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204286028730">
                  <link role="variableDeclaration" targetNodeId="1204286012437" resolveInfo="test" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1204567341454">
        <property name="methodName" value="selectMethod2" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1204567341455" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204567341456">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204567390244">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204567390245">
              <property name="name" value="a" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1204567390246" />
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204567408063">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204567402893">
                  <link role="baseMethodDeclaration" targetNodeId="2.~Character.valueOf(char):java.lang.Character" resolveInfo="valueOf" />
                  <link role="classConcept" targetNodeId="2.~Character" resolveInfo="Character" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.CharConstant" id="1204567403985">
                    <property name="charConstant" value="a" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204567422126">
                  <link role="baseMethodDeclaration" targetNodeId="2.~Character.charValue():char" resolveInfo="charValue" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204567357170">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204567357171">
              <property name="name" value="input" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204567357172">
                <link role="classifier" targetNodeId="2.~Iterable" resolveInfo="Iterable" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204567360553">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204567368470">
                <link role="baseMethodDeclaration" targetNodeId="1.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
                <link role="classConcept" targetNodeId="1.~Arrays" resolveInfo="Arrays" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204567428881">
                  <link role="variableDeclaration" targetNodeId="1204567390245" resolveInfo="a" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1204567430360">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204567431023">
                    <property name="value" value="1" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204567430330">
                    <link role="variableDeclaration" targetNodeId="1204567390245" resolveInfo="a" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1204567432478">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204567432752">
                    <property name="value" value="2" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204567432366">
                    <link role="variableDeclaration" targetNodeId="1204567390245" resolveInfo="a" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1204567434338">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204567434866">
                    <property name="value" value="3" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204567434261">
                    <link role="variableDeclaration" targetNodeId="1204567390245" resolveInfo="a" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1204567437034">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204567437997">
                    <property name="value" value="4" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204567437001">
                    <link role="variableDeclaration" targetNodeId="1204567390245" resolveInfo="a" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204567602773">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204567602774">
              <property name="name" value="seq" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204567602775">
                <link role="classifier" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204567602777">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204567602778">
                <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.fromIterable(java.lang.Iterable):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromIterable" />
                <link role="classConcept" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204567602779">
                  <link role="variableDeclaration" targetNodeId="1204567357171" resolveInfo="input" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204567448644">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204567448645">
              <property name="name" value="test" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204567448646">
                <link role="classifier" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204567457790">
                  <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204567468934">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204567602780">
                  <link role="variableDeclaration" targetNodeId="1204567602774" resolveInfo="sequence" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204567469805">
                  <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.select(jetbrains.mps.internal.collections.runtime.ISelector):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="select" />
                  <node role="actualArgument" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1204567471859">
                    <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204567471860">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204567506889">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204567511158">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204567508190">
                            <link role="baseMethodDeclaration" targetNodeId="2.~Character.valueOf(char):java.lang.Character" resolveInfo="valueOf" />
                            <link role="classConcept" targetNodeId="2.~Character" resolveInfo="Character" />
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1204567520036">
                              <node role="type" type="jetbrains.mps.baseLanguage.structure.CharType" id="1204567520037" />
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204636613706">
                                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204567520038">
                                  <link role="variableDeclaration" targetNodeId="1204567475725" resolveInfo="it" />
                                </node>
                                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204636615968">
                                  <link role="baseMethodDeclaration" targetNodeId="2.~Integer.intValue():int" resolveInfo="intValue" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204567511901">
                            <link role="baseMethodDeclaration" targetNodeId="2.~Character.toString():java.lang.String" resolveInfo="toString" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1204567475725">
                      <property name="name" value="it" />
                      <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1204567475726" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204567526026">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204567526027">
              <link role="baseMethodDeclaration" targetNodeId="1204129289579" resolveInfo="assertIterableEquals" />
              <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1204567526028" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204567535785">
                <link role="baseMethodDeclaration" targetNodeId="1.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
                <link role="classConcept" targetNodeId="1.~Arrays" resolveInfo="Arrays" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1204567537031">
                  <property name="value" value="a" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1204567539873">
                  <property name="value" value="b" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1204567542194">
                  <property name="value" value="c" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1204567543885">
                  <property name="value" value="d" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1204567545534">
                  <property name="value" value="e" />
                </node>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204567549942">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204567548837">
                  <link role="variableDeclaration" targetNodeId="1204567448645" resolveInfo="test" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204567551517">
                  <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.toIterable():java.lang.Iterable" resolveInfo="toIterable" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1204566267278">
        <property name="methodName" value="selectorVar" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1204566267279" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204566267280">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204566280512">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204566280513">
              <property name="name" value="seq" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204566280514">
                <link role="classifier" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204566280516">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204566280517">
                <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.fromIterable(java.lang.Iterable):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromIterable" />
                <link role="classConcept" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204794189867">
                  <link role="baseMethodDeclaration" targetNodeId="1204793778541" resolveInfo="input5" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1204794189868" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204566288174">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204566288175">
              <property name="name" value="selector" />
              <node role="initializer" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1204566288179">
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204566288180">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204566288181">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression" id="1204566288182">
                      <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.MulExpression" id="1204566288183">
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204566288184">
                          <link role="variableDeclaration" targetNodeId="1204566288194" resolveInfo="it" />
                        </node>
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204566288185">
                          <property name="value" value="2" />
                        </node>
                      </node>
                      <node role="ifFalse" type="jetbrains.mps.baseLanguage.structure.MulExpression" id="1204566288186">
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204566288187">
                          <link role="variableDeclaration" targetNodeId="1204566288194" resolveInfo="it" />
                        </node>
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204566288188">
                          <property name="value" value="3" />
                        </node>
                      </node>
                      <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1204566288189">
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.RemExpression" id="1204566288190">
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204566288191">
                            <link role="variableDeclaration" targetNodeId="1204566288194" resolveInfo="it" />
                          </node>
                          <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204566288192">
                            <property name="value" value="2" />
                          </node>
                        </node>
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204566288193">
                          <property name="value" value="1" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1204566288194">
                  <property name="name" value="it" />
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1204566288195" />
                </node>
              </node>
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204567276269">
                <link role="classifier" targetNodeId="3.~ISelector" resolveInfo="ISelector" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204567280266">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204567284488">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204566280520">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204566280521">
              <property name="name" value="test" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204566280522">
                <link role="classifier" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204566280524">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204566280525">
                <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.select(jetbrains.mps.internal.collections.runtime.ISelector):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="select" />
                <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204566280526">
                  <link role="variableDeclaration" targetNodeId="1204566280513" resolveInfo="seq" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204566288197">
                  <link role="variableDeclaration" targetNodeId="1204566288175" resolveInfo="selector" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204566280544">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204566280545">
              <link role="baseMethodDeclaration" targetNodeId="1204129289579" resolveInfo="assertIterableEquals" />
              <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1204566280546" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204566280547">
                <link role="baseMethodDeclaration" targetNodeId="1.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
                <link role="classConcept" targetNodeId="1.~Arrays" resolveInfo="Arrays" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204566280548">
                  <property name="value" value="2" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204566280549">
                  <property name="value" value="6" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204566280550">
                  <property name="value" value="6" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204566280551">
                  <property name="value" value="12" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204566280552">
                  <property name="value" value="10" />
                </node>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204566280553">
                <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.toIterable():java.lang.Iterable" resolveInfo="toIterable" />
                <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204566280554">
                  <link role="variableDeclaration" targetNodeId="1204566280521" resolveInfo="test" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204285385474">
      <link role="classifier" targetNodeId="1204129267857" resolveInfo="Util_Test" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.unitTest.structure.BTestCase" id="1204981070050">
    <property name="testCaseName" value="VisitAll" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1204981070051" />
    <node role="testMethodList" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethodList" id="1204981070052">
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1204981082670">
        <property name="methodName" value="visitAllMethod" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1204981082671" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204981082672">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204981149253">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204981149254">
              <property name="name" value="seq" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204981149255">
                <link role="classifier" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204981149256">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204981149257">
                <link role="classConcept" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.fromIterable(java.lang.Iterable):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromIterable" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204981149258">
                  <link role="baseMethodDeclaration" targetNodeId="1204793778541" resolveInfo="input5" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1204981149259" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204981157515">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204981157516">
              <property name="name" value="res" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204981157517">
                <link role="classifier" targetNodeId="1.~ArrayList" resolveInfo="ArrayList" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204981161348">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1204981166075">
                <link role="baseMethodDeclaration" targetNodeId="1.~ArrayList.&lt;init&gt;()" resolveInfo="ArrayList" />
                <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204981166076">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204981228593">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204981228799">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204981228594">
                <link role="variableDeclaration" targetNodeId="1204981149254" resolveInfo="seq" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204981230371">
                <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.visitAll(jetbrains.mps.internal.collections.runtime.IVisitor):void" resolveInfo="visitAll" />
                <node role="actualArgument" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1204981231857">
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204981231858">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204981243634">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204981244256">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204981243635">
                          <link role="variableDeclaration" targetNodeId="1204981157516" resolveInfo="res" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204981247192">
                          <link role="baseMethodDeclaration" targetNodeId="1.~ArrayList.add(java.lang.Object):boolean" resolveInfo="add" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.MulExpression" id="1204981249480">
                            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204981250279">
                              <property name="value" value="2" />
                            </node>
                            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204981249468">
                              <link role="variableDeclaration" targetNodeId="1204981238572" resolveInfo="i" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1204981238572">
                    <property name="name" value="i" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1204981238573" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204981283532">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204981283533">
              <link role="baseMethodDeclaration" targetNodeId="1204129289579" resolveInfo="assertIterableEquals" />
              <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1204981283534" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204981349808">
                <link role="baseMethodDeclaration" targetNodeId="1204981312409" resolveInfo="expectEven10" />
                <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1204981349809" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204981352537">
                <link role="variableDeclaration" targetNodeId="1204981157516" resolveInfo="res" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1204981444171">
        <property name="methodName" value="visitorVar" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1204981444172" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204981444173">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204981460743">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204981460744">
              <property name="name" value="seq" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204981460745">
                <link role="classifier" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204981460746">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204981460747">
                <link role="classConcept" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.fromIterable(java.lang.Iterable):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromIterable" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204981460748">
                  <link role="baseMethodDeclaration" targetNodeId="1204793778541" resolveInfo="input5" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1204981460749" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204981460750">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204981460751">
              <property name="name" value="res" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204981460752">
                <link role="classifier" targetNodeId="1.~ArrayList" resolveInfo="ArrayList" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204981460753">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1204981460754">
                <link role="baseMethodDeclaration" targetNodeId="1.~ArrayList.&lt;init&gt;()" resolveInfo="ArrayList" />
                <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204981460755">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204981468132">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204981468133">
              <property name="name" value="visitor" />
              <node role="initializer" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1204981468137">
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204981468138">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204981468139">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204981468140">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204981468141">
                        <link role="baseMethodDeclaration" targetNodeId="1.~ArrayList.add(java.lang.Object):boolean" resolveInfo="add" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.MulExpression" id="1204981468142">
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204981468143">
                            <link role="variableDeclaration" targetNodeId="1204981468146" resolveInfo="i" />
                          </node>
                          <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204981468144">
                            <property name="value" value="2" />
                          </node>
                        </node>
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204981468145">
                        <link role="variableDeclaration" targetNodeId="1204981460751" resolveInfo="res" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1204981468146">
                  <property name="name" value="i" />
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1204981468147" />
                </node>
              </node>
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204981473537">
                <link role="classifier" targetNodeId="3.~IVisitor" resolveInfo="IVisitor" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204981476607">
                  <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204981460756">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204981460757">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204981460758">
                <link role="variableDeclaration" targetNodeId="1204981460744" resolveInfo="seq" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1204981460759">
                <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.visitAll(jetbrains.mps.internal.collections.runtime.IVisitor):void" resolveInfo="visitAll" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204981468153">
                  <link role="variableDeclaration" targetNodeId="1204981468133" resolveInfo="visitor" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204981460772">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204981460773">
              <link role="baseMethodDeclaration" targetNodeId="1204129289579" resolveInfo="assertIterableEquals" />
              <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1204981460774" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1204981460775">
                <link role="baseMethodDeclaration" targetNodeId="1204981312409" resolveInfo="expectEven10" />
                <node role="instance" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1204981460776" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204981460777">
                <link role="variableDeclaration" targetNodeId="1204981460751" resolveInfo="res" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204981076603">
      <link role="classifier" targetNodeId="1204129267857" resolveInfo="Util_Test" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.unitTest.structure.BTestCase" id="1205686908852">
    <property name="testCaseName" value="Sort" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1205686908853" />
    <node role="testMethodList" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethodList" id="1205686908854">
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1205686919725">
        <property name="methodName" value="sortMethod" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1205686919726" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205686919727">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205686939428">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205686939429">
              <property name="name" value="input" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205686939430">
                <link role="classifier" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205686941883">
                  <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205686951326">
                <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.fromArray(java.lang.Object[]):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromArray" />
                <link role="classConcept" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205686952130">
                  <property name="value" value="Z" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205686954986">
                  <property name="value" value="YY" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205686963659">
                  <property name="value" value="XXX" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205686980456">
                  <property name="value" value="WWWW" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205687012362">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205687012363">
              <property name="name" value="test" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205687012364">
                <link role="classifier" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205687014873">
                  <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205687023596">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205687023038">
                  <link role="variableDeclaration" targetNodeId="1205686939429" resolveInfo="input" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205687024678">
                  <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.sort(jetbrains.mps.internal.collections.runtime.ISelector,boolean):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="sort" />
                  <node role="actualArgument" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1205687027624">
                    <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205687027625">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205687039732">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205687040253">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1205687039733">
                            <link role="variableDeclaration" targetNodeId="1205687034805" resolveInfo="it" />
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205687042099">
                            <link role="baseMethodDeclaration" targetNodeId="2.~String.length():int" resolveInfo="length" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1205687034805">
                      <property name="name" value="it" />
                      <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1205687034806" />
                    </node>
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1205687045753">
                    <property name="value" value="false" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205687052916">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205687052917">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205687052918">
                <link role="baseMethodDeclaration" targetNodeId="1204129289579" resolveInfo="assertIterableEquals" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205687058087">
                  <link role="classConcept" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                  <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.fromArray(java.lang.Object[]):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromArray" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205687058091">
                    <property name="value" value="WWWW" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205693135286">
                    <property name="value" value="XXX" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205693141199">
                    <property name="value" value="YY" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205693143859">
                    <property name="value" value="Z" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205693161145">
                  <link role="variableDeclaration" targetNodeId="1205687012363" resolveInfo="test" />
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1205687052919" />
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1205693972826">
        <property name="methodName" value="toComparableVar" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1205693972827" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205693972828">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205693992437">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205693992438">
              <property name="name" value="input" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205693992439">
                <link role="classifier" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205693992440">
                  <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205693992441">
                <link role="classConcept" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.fromArray(java.lang.Object[]):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromArray" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205693992442">
                  <property name="value" value="Z" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205693992443">
                  <property name="value" value="YY" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205693992444">
                  <property name="value" value="XXX" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205693992445">
                  <property name="value" value="WWWW" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205694004150">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205694004151">
              <property name="name" value="tocomp" />
              <node role="initializer" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1205694004155">
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205694004156">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205694004157">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205694004158">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205694004159">
                        <link role="baseMethodDeclaration" targetNodeId="2.~String.length():int" resolveInfo="length" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1205694004160">
                        <link role="variableDeclaration" targetNodeId="1205694004161" resolveInfo="it" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1205694004161">
                  <property name="name" value="it" />
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1205694004162" />
                </node>
              </node>
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205694012630">
                <link role="classifier" targetNodeId="3.~ISelector" resolveInfo="ISelector" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205694018815">
                  <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
                </node>
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205694021411">
                  <link role="classifier" targetNodeId="2.~Comparable" resolveInfo="Comparable" />
                  <node role="parameter" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1205736255915" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205693992447">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205693992448">
              <property name="name" value="test" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205693992449">
                <link role="classifier" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205693992450">
                  <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205693992451">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205693992452">
                  <link role="variableDeclaration" targetNodeId="1205693992438" resolveInfo="input" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205693992453">
                  <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.sort(jetbrains.mps.internal.collections.runtime.ISelector,boolean):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="sort" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205694004164">
                    <link role="variableDeclaration" targetNodeId="1205694004151" resolveInfo="tocomp" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1205693992462">
                    <property name="value" value="false" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205693992463">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205693992464">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205693992465">
                <link role="baseMethodDeclaration" targetNodeId="1204129289579" resolveInfo="assertIterableEquals" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205693992466">
                  <link role="classConcept" targetNodeId="3.~Sequence" resolveInfo="Sequence" />
                  <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.fromArray(java.lang.Object[]):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromArray" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205693992467">
                    <property name="value" value="WWWW" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205693992468">
                    <property name="value" value="XXX" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205693992469">
                    <property name="value" value="YY" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205693992470">
                    <property name="value" value="Z" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205693992471">
                  <link role="variableDeclaration" targetNodeId="1205693992448" resolveInfo="test" />
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1205693992472" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205738190893">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205738190894">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205738190895">
                <link role="baseMethodDeclaration" targetNodeId="1204129289579" resolveInfo="assertIterableEquals" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205738193283">
                  <link role="variableDeclaration" targetNodeId="1205693992438" resolveInfo="input" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205738195178">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205738194787">
                    <link role="variableDeclaration" targetNodeId="1205693992448" resolveInfo="test" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205738196489">
                    <link role="baseMethodDeclaration" targetNodeId="3.~Sequence.sort(jetbrains.mps.internal.collections.runtime.ISelector,boolean):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="sort" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205738200359">
                      <link role="variableDeclaration" targetNodeId="1205694004151" resolveInfo="tocomp" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1205738202903">
                      <property name="value" value="true" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1205738190896" />
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1205737327889">
        <property name="methodName" value="sortOperationInternal" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1205737327890" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205737327891">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205737356797">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205737356798">
              <property name="name" value="input" />
              <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType" id="1205737356799">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205737359406">
                  <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205737368391">
                <link role="baseMethodDeclaration" targetNodeId="1.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
                <link role="classConcept" targetNodeId="1.~Arrays" resolveInfo="Arrays" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205737375631">
                  <property name="value" value="Z" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205737375632">
                  <property name="value" value="YY" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205737375633">
                  <property name="value" value="XXX" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205737375634">
                  <property name="value" value="WWWW" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205737614814">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205737614815">
              <property name="name" value="test" />
              <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType" id="1205737614816">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205737614817">
                  <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205737614818">
                <node role="operation" type="jetbrains.mps.internal.collections.structure.SortOperation" id="1205737614819">
                  <node role="closure" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1205737614820">
                    <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205737614821">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205737614822">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205737614823">
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205737614824">
                            <link role="baseMethodDeclaration" targetNodeId="2.~String.length():int" resolveInfo="length" />
                          </node>
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1205737614825">
                            <link role="variableDeclaration" targetNodeId="1205737614826" resolveInfo="it" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1205737614826">
                      <property name="name" value="it" />
                      <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1205737614827" />
                    </node>
                  </node>
                  <node role="ascending" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1205737614828">
                    <property name="value" value="false" />
                  </node>
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205737614829">
                  <link role="variableDeclaration" targetNodeId="1205737356798" resolveInfo="input" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205737451617">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205737451618">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205737451619">
                <link role="baseMethodDeclaration" targetNodeId="1204129289579" resolveInfo="assertIterableEquals" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205737460658">
                  <link role="baseMethodDeclaration" targetNodeId="1.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
                  <link role="classConcept" targetNodeId="1.~Arrays" resolveInfo="Arrays" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205737468812">
                    <property name="value" value="WWWW" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205737468813">
                    <property name="value" value="XXX" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205737468814">
                    <property name="value" value="YY" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205737468815">
                    <property name="value" value="Z" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205737617541">
                  <link role="variableDeclaration" targetNodeId="1205737614815" resolveInfo="test" />
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1205737451620" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205738220224">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205738220225">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205738220226">
                <link role="baseMethodDeclaration" targetNodeId="1204129289579" resolveInfo="assertIterableEquals" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205738222537">
                  <link role="variableDeclaration" targetNodeId="1205737356798" resolveInfo="input" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205738226394">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205738226005">
                    <link role="variableDeclaration" targetNodeId="1205737614815" resolveInfo="test" />
                  </node>
                  <node role="operation" type="jetbrains.mps.internal.collections.structure.SortOperation" id="1205738230333">
                    <node role="closure" type="jetbrains.mps.closures.structure.ClosureLiteral" id="1205738230334">
                      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205738230335">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205738233966">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205738235251">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1205738233967">
                              <link role="variableDeclaration" targetNodeId="1205738230336" resolveInfo="it" />
                            </node>
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205738235886">
                              <link role="baseMethodDeclaration" targetNodeId="2.~String.length():int" resolveInfo="length" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="parameter" type="jetbrains.mps.internal.collections.structure.SmartClosureParameterDeclaration" id="1205738230336">
                        <property name="name" value="it" />
                        <node role="type" type="jetbrains.mps.baseLanguage.structure.WildCardType" id="1205738230337" />
                      </node>
                    </node>
                    <node role="ascending" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1205738238651">
                      <property name="value" value="true" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1205738220227" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205686917878">
      <link role="classifier" targetNodeId="1204129267857" resolveInfo="Util_Test" />
    </node>
  </node>
</model>


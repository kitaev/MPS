<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:00000000-0000-4000-0000-011c895903ef(jetbrains.mps.internalCollections.test.compareOperations)">
  <persistence version="3" />
  <refactoringHistory />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <language namespace="f61473f9-130f-42f6-b98d-6c438812c2f6(jetbrains.mps.baseLanguage.unitTest)" />
  <language namespace="fd392034-7849-419d-9071-12563d152375(jetbrains.mps.baseLanguage.closures)" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590328(jetbrains.mps.baseLanguage.collections.constraints)" version="6" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902d2(jetbrains.mps.baseLanguage.unitTest.constraints)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895903e4(jetbrains.mps.internal.collections.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959028c(jetbrains.mps.lang.structure.constraints)" version="11" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590334(jetbrains.mps.baseLanguage.closures.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590283(jetbrains.mps.lang.core.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902db(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895903fe(jetbrains.mps.baseLanguage.strings.constraints)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590402(jetbrains.mps.baseLanguage.strings.structure)" version="9" />
  <maxImportIndex value="4" />
  <import index="1" modelUID="f:java_stub#jetbrains.mps.internal.collections.runtime(jetbrains.mps.internal.collections.runtime@java_stub)" version="-1" />
  <import index="2" modelUID="r:00000000-0000-4000-0000-011c895903ee(jetbrains.mps.internalCollections.test.closures)" version="-1" />
  <import index="3" modelUID="f:java_stub#java.util(java.util@java_stub)" version="-1" />
  <import index="4" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" />
  <node type="jetbrains.mps.baseLanguage.unitTest.structure.BTestCase" id="1205497877107">
    <property name="testCaseName" value="Union" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1205497877108" />
    <node role="testMethodList" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethodList" id="1205497877109">
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1205497886685">
        <property name="methodName" value="unionMethod" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1205497886686" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205497886687">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205511148280">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205511148281">
              <property name="name" value="input" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205511148282">
                <link role="classifier" targetNodeId="1.~ISequence" resolveInfo="ISequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205512629090">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205511160485">
                <link role="classConcept" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
                <link role="baseMethodDeclaration" targetNodeId="1.~Sequence.fromArray(java.lang.Object...):jetbrains.mps.internal.collections.runtime.ISequence" resolveInfo="fromArray" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205511162540">
                  <property name="value" value="1" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205511164101">
                  <property name="value" value="2" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205511165090">
                  <property name="value" value="3" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205514702459">
                  <property name="value" value="3" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205511178142">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205511178143">
              <property name="name" value="test" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205511178144">
                <link role="classifier" targetNodeId="1.~ISequence" resolveInfo="ISequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205512633769">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205511181861">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205511181252">
                  <link role="variableDeclaration" targetNodeId="1205511148281" resolveInfo="input" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205511183582">
                  <link role="baseMethodDeclaration" targetNodeId="1.~ISequence.union(jetbrains.mps.internal.collections.runtime.ISequence):jetbrains.mps.internal.collections.runtime.ISequence" resolveInfo="union" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205511187139">
                    <link role="classConcept" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
                    <link role="baseMethodDeclaration" targetNodeId="1.~Sequence.fromArray(java.lang.Object...):jetbrains.mps.internal.collections.runtime.ISequence" resolveInfo="fromArray" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205511189035">
                      <property name="value" value="2" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205514705086">
                      <property name="value" value="2" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205511191868">
                      <property name="value" value="3" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205511193310">
                      <property name="value" value="4" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205511228648">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205511228649">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205511228650">
                <link role="baseMethodDeclaration" targetNodeId="2.1205510696455" resolveInfo="assertIterableEqualsIgnoreOrder" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205511243531">
                  <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
                  <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object...):java.util.List" resolveInfo="asList" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205511247166">
                    <property name="value" value="1" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205511248091">
                    <property name="value" value="2" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205514712041">
                    <property name="value" value="2" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205511250145">
                    <property name="value" value="3" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205514713565">
                    <property name="value" value="3" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205511251298">
                    <property name="value" value="4" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205511254468">
                  <link role="variableDeclaration" targetNodeId="1205511178143" resolveInfo="test" />
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1205511228651" />
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1205512662549">
        <property name="methodName" value="unionOperation" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1205512662550" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205512662551">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205512669744">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205512669745">
              <property name="name" value="input" />
              <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.SequenceType" id="1205512669746">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205512671882">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205512731849">
                <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
                <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object...):java.util.List" resolveInfo="asList" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205512734034">
                  <property name="value" value="1" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205512734808">
                  <property name="value" value="2" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205512735413">
                  <property name="value" value="3" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205514717103">
                  <property name="value" value="3" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205512738194">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205512738195">
              <property name="name" value="test" />
              <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.SequenceType" id="1205512738196">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205512740170">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205512744266">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205512743897">
                  <link role="variableDeclaration" targetNodeId="1205512669745" resolveInfo="input" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.UnionOperation" id="1205512745952">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205512751867">
                    <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
                    <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object...):java.util.List" resolveInfo="asList" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205512753225">
                      <property name="value" value="2" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205514719390">
                      <property name="value" value="2" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205512757231">
                      <property name="value" value="3" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205512758690">
                      <property name="value" value="4" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205512764395">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205512764396">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205512764397">
                <link role="baseMethodDeclaration" targetNodeId="2.1205510696455" resolveInfo="assertIterableEqualsIgnoreOrder" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205512771300">
                  <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
                  <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object...):java.util.List" resolveInfo="asList" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205512771301">
                    <property name="value" value="1" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205512771302">
                    <property name="value" value="2" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205514722110">
                    <property name="value" value="2" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205512771303">
                    <property name="value" value="3" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205514723326">
                    <property name="value" value="3" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205512771304">
                    <property name="value" value="4" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205512774235">
                  <link role="variableDeclaration" targetNodeId="1205512738195" resolveInfo="test" />
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1205512764398" />
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1241359235502">
        <property name="methodName" value="nextWithoutHasNext" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1241359235503" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1241359235504">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1241359235505">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1241359235506">
              <property name="name" value="it" />
              <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.IteratorType" id="1241359235507">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1241359235508" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359235509">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359235510">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1241359235511">
                    <node role="creator" type="jetbrains.mps.baseLanguage.collections.structure.ListCreatorWithInit" id="1241359235512">
                      <node role="elementType" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1241359235513" />
                      <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359235514">
                        <property name="value" value="1" />
                      </node>
                      <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359235515">
                        <property name="value" value="2" />
                      </node>
                      <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241360580987">
                        <property name="value" value="2" />
                      </node>
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.UnionOperation" id="1241359245386">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1241359247423">
                      <node role="creator" type="jetbrains.mps.baseLanguage.collections.structure.ListCreatorWithInit" id="1241359249867">
                        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1241359251135" />
                        <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359254903">
                          <property name="value" value="2" />
                        </node>
                        <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359255389">
                          <property name="value" value="3" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetIteratorOperation" id="1241359235523" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertSame" id="1241359235524">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359235525">
              <property name="value" value="1" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359235526">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1241359235527">
                <link role="variableDeclaration" targetNodeId="1241359235506" resolveInfo="it" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetNextOperation" id="1241359235528" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertSame" id="1241359235529">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359235530">
              <property name="value" value="2" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359235531">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1241359235532">
                <link role="variableDeclaration" targetNodeId="1241359235506" resolveInfo="it" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetNextOperation" id="1241359235533" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertSame" id="1241359235534">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359235535">
              <property name="value" value="2" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359235536">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1241359235537">
                <link role="variableDeclaration" targetNodeId="1241359235506" resolveInfo="it" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetNextOperation" id="1241359235538" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertSame" id="1241359235539">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359235540">
              <property name="value" value="3" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359235541">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1241359235542">
                <link role="variableDeclaration" targetNodeId="1241359235506" resolveInfo="it" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetNextOperation" id="1241359235543" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse" id="1241359235549">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359235550">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1241359235551">
                <link role="variableDeclaration" targetNodeId="1241359235506" resolveInfo="it" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.HasNextOperation" id="1241359235552" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertThrows" id="1241359235553">
            <node role="exceptionType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1241359235554">
              <link role="classifier" targetNodeId="3.~NoSuchElementException" resolveInfo="NoSuchElementException" />
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1241359235555">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359235556">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1241359235557">
                  <link role="variableDeclaration" targetNodeId="1241359235506" resolveInfo="it" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetNextOperation" id="1241359235558" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205511222599">
      <link role="classifier" targetNodeId="2.1204129267857" resolveInfo="Util_Test" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.unitTest.structure.BTestCase" id="1205514854257">
    <property name="testCaseName" value="SubtractTest" />
    <property name="name" value="SubtractTest_Test" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1205514854258" />
    <node role="testMethodList" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethodList" id="1205514854259">
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1205514867105">
        <property name="methodName" value="subtractMethod" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1205514867106" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205514867107">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205514874053">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205514874054">
              <property name="name" value="input" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205514874055">
                <link role="classifier" targetNodeId="1.~ISequence" resolveInfo="ISequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205514876435">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205514884137">
                <link role="classConcept" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
                <link role="baseMethodDeclaration" targetNodeId="1.~Sequence.fromArray(java.lang.Object...):jetbrains.mps.internal.collections.runtime.ISequence" resolveInfo="fromArray" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205514886694">
                  <property name="value" value="1" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205514887955">
                  <property name="value" value="2" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205514889228">
                  <property name="value" value="2" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205514890391">
                  <property name="value" value="3" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205514891365">
                  <property name="value" value="3" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205514892517">
                  <property name="value" value="3" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205598010244">
                  <property name="value" value="4" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205514898886">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205514898887">
              <property name="name" value="test" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205514898888">
                <link role="classifier" targetNodeId="1.~ISequence" resolveInfo="ISequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205514903051">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205514907739">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205514907383">
                  <link role="variableDeclaration" targetNodeId="1205514874054" resolveInfo="input" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205514914414">
                  <link role="baseMethodDeclaration" targetNodeId="1.~ISequence.subtract(jetbrains.mps.internal.collections.runtime.ISequence):jetbrains.mps.internal.collections.runtime.ISequence" resolveInfo="subtract" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205514919218">
                    <link role="classConcept" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
                    <link role="baseMethodDeclaration" targetNodeId="1.~Sequence.fromArray(java.lang.Object...):jetbrains.mps.internal.collections.runtime.ISequence" resolveInfo="fromArray" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205514924581">
                      <property name="value" value="2" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205514925679">
                      <property name="value" value="3" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205514926574">
                      <property name="value" value="3" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205514927847">
                      <property name="value" value="4" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205598013237">
                      <property name="value" value="5" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205515400905">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205515400906">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205515400907">
                <link role="baseMethodDeclaration" targetNodeId="2.1205510696455" resolveInfo="assertIterableEqualsIgnoreOrder" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205515402643">
                  <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
                  <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object...):java.util.List" resolveInfo="asList" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515402644">
                    <property name="value" value="1" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515402645">
                    <property name="value" value="2" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515402646">
                    <property name="value" value="3" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205515405081">
                  <link role="variableDeclaration" targetNodeId="1205514898887" resolveInfo="test" />
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1205515400908" />
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1205515308375">
        <property name="methodName" value="subtractOperation" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1205515308376" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205515308377">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205515314846">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205515314847">
              <property name="name" value="input" />
              <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.SequenceType" id="1205515314848">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205515316974">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205515327053">
                <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
                <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object...):java.util.List" resolveInfo="asList" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515328156">
                  <property name="value" value="1" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515329051">
                  <property name="value" value="2" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515329842">
                  <property name="value" value="2" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515330599">
                  <property name="value" value="3" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515331282">
                  <property name="value" value="3" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515332131">
                  <property name="value" value="3" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205598040133">
                  <property name="value" value="4" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205598042554">
                  <property name="value" value="4" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205515334646">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205515334647">
              <property name="name" value="test" />
              <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.SequenceType" id="1205515334648">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205515337003">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205515342046">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205515341444">
                  <link role="variableDeclaration" targetNodeId="1205515314847" resolveInfo="input" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.ExcludeOperation" id="1205515346267">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205515360850">
                    <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
                    <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object...):java.util.List" resolveInfo="asList" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515367558">
                      <property name="value" value="2" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515371367">
                      <property name="value" value="3" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515372414">
                      <property name="value" value="4" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205598044486">
                      <property name="value" value="4" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205598046153">
                      <property name="value" value="5" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205515413330">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205515413331">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205515413332">
                <link role="baseMethodDeclaration" targetNodeId="2.1205510696455" resolveInfo="assertIterableEqualsIgnoreOrder" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205515419420">
                  <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
                  <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object...):java.util.List" resolveInfo="asList" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515422466">
                    <property name="value" value="1" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515423216">
                    <property name="value" value="2" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515423825">
                    <property name="value" value="3" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205598037696">
                    <property name="value" value="3" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205515426292">
                  <link role="variableDeclaration" targetNodeId="1205515334647" resolveInfo="test" />
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1205515413333" />
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1241359271609">
        <property name="methodName" value="nextWithoutHasNext" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1241359271610" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1241359271611">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1241359271612">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1241359271613">
              <property name="name" value="it" />
              <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.IteratorType" id="1241359271614">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1241359271615" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359271616">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359271617">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1241359271618">
                    <node role="creator" type="jetbrains.mps.baseLanguage.collections.structure.ListCreatorWithInit" id="1241359271619">
                      <node role="elementType" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1241359271620" />
                      <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359271621">
                        <property name="value" value="1" />
                      </node>
                      <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359271622">
                        <property name="value" value="2" />
                      </node>
                      <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359271623">
                        <property name="value" value="3" />
                      </node>
                      <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359299132">
                        <property name="value" value="4" />
                      </node>
                      <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359299874">
                        <property name="value" value="5" />
                      </node>
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.ExcludeOperation" id="1241359283179">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1241359284521">
                      <node role="creator" type="jetbrains.mps.baseLanguage.collections.structure.ListCreatorWithInit" id="1241359287347">
                        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1241359288672" />
                        <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359291168">
                          <property name="value" value="3" />
                        </node>
                        <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359291698">
                          <property name="value" value="2" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetIteratorOperation" id="1241359271630" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertSame" id="1241359271631">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359271632">
              <property name="value" value="1" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359271633">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1241359271634">
                <link role="variableDeclaration" targetNodeId="1241359271613" resolveInfo="it" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetNextOperation" id="1241359271635" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertSame" id="1241359271646">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359271647">
              <property name="value" value="4" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359271648">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1241359271649">
                <link role="variableDeclaration" targetNodeId="1241359271613" resolveInfo="it" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetNextOperation" id="1241359271650" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertSame" id="1241359271651">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359271652">
              <property name="value" value="5" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359271653">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1241359271654">
                <link role="variableDeclaration" targetNodeId="1241359271613" resolveInfo="it" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetNextOperation" id="1241359271655" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse" id="1241359271656">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359271657">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1241359271658">
                <link role="variableDeclaration" targetNodeId="1241359271613" resolveInfo="it" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.HasNextOperation" id="1241359271659" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertThrows" id="1241359271660">
            <node role="exceptionType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1241359271661">
              <link role="classifier" targetNodeId="3.~NoSuchElementException" resolveInfo="NoSuchElementException" />
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1241359271662">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359271663">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1241359271664">
                  <link role="variableDeclaration" targetNodeId="1241359271613" resolveInfo="it" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetNextOperation" id="1241359271665" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205514865665">
      <link role="classifier" targetNodeId="2.1204129267857" resolveInfo="Util_Test" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.unitTest.structure.BTestCase" id="1205515610187">
    <property name="testCaseName" value="Intersect" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1205515610188" />
    <node role="testMethodList" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethodList" id="1205515610189">
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1205515625184">
        <property name="methodName" value="intersectMethod" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1205515625185" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205515625186">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205515636456">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205515636457">
              <property name="name" value="input" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205515636458">
                <link role="classifier" targetNodeId="1.~ISequence" resolveInfo="ISequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205515636459">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205515636460">
                <link role="classConcept" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
                <link role="baseMethodDeclaration" targetNodeId="1.~Sequence.fromArray(java.lang.Object...):jetbrains.mps.internal.collections.runtime.ISequence" resolveInfo="fromArray" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515636461">
                  <property name="value" value="1" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515636462">
                  <property name="value" value="2" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515636463">
                  <property name="value" value="2" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515636464">
                  <property name="value" value="3" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205515636468">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205515636469">
              <property name="name" value="test" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205515636470">
                <link role="classifier" targetNodeId="1.~ISequence" resolveInfo="ISequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205515636471">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205515636472">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205515636473">
                  <link role="variableDeclaration" targetNodeId="1205515636457" resolveInfo="input" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205515636474">
                  <link role="baseMethodDeclaration" targetNodeId="1.~ISequence.intersect(jetbrains.mps.internal.collections.runtime.ISequence):jetbrains.mps.internal.collections.runtime.ISequence" resolveInfo="intersect" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205515636475">
                    <link role="classConcept" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
                    <link role="baseMethodDeclaration" targetNodeId="1.~Sequence.fromArray(java.lang.Object...):jetbrains.mps.internal.collections.runtime.ISequence" resolveInfo="fromArray" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515636476">
                      <property name="value" value="2" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515636477">
                      <property name="value" value="3" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515636478">
                      <property name="value" value="3" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515636479">
                      <property name="value" value="4" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205515636481">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205515636482">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205515636483">
                <link role="baseMethodDeclaration" targetNodeId="2.1205510696455" resolveInfo="assertIterableEqualsIgnoreOrder" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205515636484">
                  <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
                  <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object...):java.util.List" resolveInfo="asList" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515636486">
                    <property name="value" value="2" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515636487">
                    <property name="value" value="3" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205515636488">
                  <link role="variableDeclaration" targetNodeId="1205515636469" resolveInfo="test" />
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1205515636489" />
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1205515751004">
        <property name="methodName" value="intersectOperation" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1205515751005" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205515751006">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205515757404">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205515757405">
              <property name="name" value="input" />
              <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.SequenceType" id="1205515757406">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205515757407">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205515757408">
                <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
                <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object...):java.util.List" resolveInfo="asList" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515757409">
                  <property name="value" value="1" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515757410">
                  <property name="value" value="2" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515757411">
                  <property name="value" value="2" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515757414">
                  <property name="value" value="3" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205597975278">
                  <property name="value" value="4" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205597976434">
                  <property name="value" value="4" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205515757415">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205515757416">
              <property name="name" value="test" />
              <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.SequenceType" id="1205515757417">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205515757418">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205515757419">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205515757420">
                  <link role="variableDeclaration" targetNodeId="1205515757405" resolveInfo="input" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IntersectOperation" id="1205516082337">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205516083681">
                    <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
                    <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object...):java.util.List" resolveInfo="asList" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205516083682">
                      <property name="value" value="2" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205516083683">
                      <property name="value" value="3" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205516083684">
                      <property name="value" value="3" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205516083685">
                      <property name="value" value="4" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205597979304">
                      <property name="value" value="4" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205597980277">
                      <property name="value" value="5" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205515757428">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205515757429">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205515757430">
                <link role="baseMethodDeclaration" targetNodeId="2.1205510696455" resolveInfo="assertIterableEqualsIgnoreOrder" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205515757431">
                  <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
                  <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object...):java.util.List" resolveInfo="asList" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515757433">
                    <property name="value" value="2" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205515757434">
                    <property name="value" value="3" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205597983310">
                    <property name="value" value="4" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205597984156">
                    <property name="value" value="4" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205515757435">
                  <link role="variableDeclaration" targetNodeId="1205515757416" resolveInfo="test" />
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1205515757436" />
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1241359315966">
        <property name="methodName" value="nextWithoutHasNext" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1241359315967" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1241359315968">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1241359315969">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1241359315970">
              <property name="name" value="it" />
              <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.IteratorType" id="1241359315971">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1241359315972" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359315973">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359315974">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1241359315975">
                    <node role="creator" type="jetbrains.mps.baseLanguage.collections.structure.ListCreatorWithInit" id="1241359315976">
                      <node role="elementType" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1241359315977" />
                      <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359315978">
                        <property name="value" value="1" />
                      </node>
                      <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359315979">
                        <property name="value" value="2" />
                      </node>
                      <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359315980">
                        <property name="value" value="3" />
                      </node>
                      <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359323573">
                        <property name="value" value="4" />
                      </node>
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IntersectOperation" id="1241359327142">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1241359328361">
                      <node role="creator" type="jetbrains.mps.baseLanguage.collections.structure.ListCreatorWithInit" id="1241359331102">
                        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1241359332498" />
                        <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359336666">
                          <property name="value" value="2" />
                        </node>
                        <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359337266">
                          <property name="value" value="3" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetIteratorOperation" id="1241359315987" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertSame" id="1241359315993">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359315994">
              <property name="value" value="2" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359315995">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1241359315996">
                <link role="variableDeclaration" targetNodeId="1241359315970" resolveInfo="it" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetNextOperation" id="1241359315997" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertSame" id="1241359315998">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359315999">
              <property name="value" value="3" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359316000">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1241359316001">
                <link role="variableDeclaration" targetNodeId="1241359315970" resolveInfo="it" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetNextOperation" id="1241359316002" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse" id="1241359316013">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359316014">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1241359316015">
                <link role="variableDeclaration" targetNodeId="1241359315970" resolveInfo="it" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.HasNextOperation" id="1241359316016" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertThrows" id="1241359316017">
            <node role="exceptionType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1241359316018">
              <link role="classifier" targetNodeId="3.~NoSuchElementException" resolveInfo="NoSuchElementException" />
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1241359316019">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359316020">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1241359316021">
                  <link role="variableDeclaration" targetNodeId="1241359315970" resolveInfo="it" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetNextOperation" id="1241359316022" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205515694633">
      <link role="classifier" targetNodeId="2.1204129267857" resolveInfo="Util_Test" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.unitTest.structure.BTestCase" id="1205528089811">
    <property name="testCaseName" value="Disjunct" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1205528089812" />
    <node role="testMethodList" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethodList" id="1205528089813">
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1205528105673">
        <property name="methodName" value="disjunctionMethod" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1205528105674" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205528105675">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205528129142">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205528129143">
              <property name="name" value="input" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205528129144">
                <link role="classifier" targetNodeId="1.~ISequence" resolveInfo="ISequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205528129145">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205528129146">
                <link role="classConcept" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
                <link role="baseMethodDeclaration" targetNodeId="1.~Sequence.fromArray(java.lang.Object...):jetbrains.mps.internal.collections.runtime.ISequence" resolveInfo="fromArray" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205528129147">
                  <property name="value" value="1" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205528129148">
                  <property name="value" value="2" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205528129150">
                  <property name="value" value="3" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205528138586">
                  <property name="value" value="3" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205528140509">
                  <property name="value" value="3" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205528129151">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205528129152">
              <property name="name" value="test" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205528129153">
                <link role="classifier" targetNodeId="1.~ISequence" resolveInfo="ISequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205528129154">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205528129155">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205528129156">
                  <link role="variableDeclaration" targetNodeId="1205528129143" resolveInfo="input" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205528129157">
                  <link role="baseMethodDeclaration" targetNodeId="1.~ISequence.disjunction(jetbrains.mps.internal.collections.runtime.ISequence):jetbrains.mps.internal.collections.runtime.ISequence" resolveInfo="disjunction" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205528129158">
                    <link role="classConcept" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
                    <link role="baseMethodDeclaration" targetNodeId="1.~Sequence.fromArray(java.lang.Object...):jetbrains.mps.internal.collections.runtime.ISequence" resolveInfo="fromArray" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205528205540">
                      <property name="value" value="1" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205528129159">
                      <property name="value" value="2" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205528185208">
                      <property name="value" value="2" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205528129160">
                      <property name="value" value="3" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205528129161">
                      <property name="value" value="3" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205528129162">
                      <property name="value" value="4" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205528129163">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205528129164">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205528129165">
                <link role="baseMethodDeclaration" targetNodeId="2.1205510696455" resolveInfo="assertIterableEqualsIgnoreOrder" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205528129166">
                  <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
                  <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object...):java.util.List" resolveInfo="asList" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205528308230">
                    <property name="value" value="2" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205528129168">
                    <property name="value" value="3" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205528220943">
                    <property name="value" value="4" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205528129169">
                  <link role="variableDeclaration" targetNodeId="1205528129152" resolveInfo="test" />
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1205528129170" />
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1205598508954">
        <property name="methodName" value="discjunctOperation" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1205598508955" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205598508956">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205598522795">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205598522796">
              <property name="name" value="input" />
              <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.SequenceType" id="1205598522797">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205598522798">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205598522799">
                <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
                <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object...):java.util.List" resolveInfo="asList" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205598522800">
                  <property name="value" value="1" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205598522801">
                  <property name="value" value="2" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205598522802">
                  <property name="value" value="2" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205598522803">
                  <property name="value" value="3" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205598522804">
                  <property name="value" value="4" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205598522805">
                  <property name="value" value="4" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205598522806">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205598522807">
              <property name="name" value="test" />
              <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.SequenceType" id="1205598522808">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205598522809">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205598522810">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205598522811">
                  <link role="variableDeclaration" targetNodeId="1205598522796" resolveInfo="input" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.DisjunctOperation" id="1221825186652">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205598625089">
                    <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
                    <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object...):java.util.List" resolveInfo="asList" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205598627844">
                      <property name="value" value="1" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205598629493">
                      <property name="value" value="2" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205598632240">
                      <property name="value" value="4" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205598634292">
                      <property name="value" value="4" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205598635517">
                      <property name="value" value="5" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205598522820">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205598522821">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205598522822">
                <link role="baseMethodDeclaration" targetNodeId="2.1205510696455" resolveInfo="assertIterableEqualsIgnoreOrder" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205598522823">
                  <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
                  <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object...):java.util.List" resolveInfo="asList" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205598522824">
                    <property name="value" value="2" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205598522825">
                    <property name="value" value="3" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205598522827">
                    <property name="value" value="5" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205598522828">
                  <link role="variableDeclaration" targetNodeId="1205598522807" resolveInfo="test" />
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1205598522829" />
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1205756979836">
        <property name="methodName" value="disjunctionEquivalence" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1205756979837" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205756979838">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205756990207">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205756990208">
              <property name="name" value="a" />
              <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.SequenceType" id="1205756990209">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.StringType" id="1225196704697" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205757018264">
                <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
                <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object...):java.util.List" resolveInfo="asList" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205757237869">
                  <property name="value" value="X" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205757240169">
                  <property name="value" value="W" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205757245736">
                  <property name="value" value="Z" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205757248005">
                  <property name="value" value="Y" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205757250706">
                  <property name="value" value="X" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205757252503">
                  <property name="value" value="Z" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205757255150">
                  <property name="value" value="X" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205757257141">
                  <property name="value" value="Y" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205757259091">
                  <property name="value" value="W" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205757045800">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205757045801">
              <property name="name" value="b" />
              <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.SequenceType" id="1205757045802">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.StringType" id="1225196717668" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205757058054">
                <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
                <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object...):java.util.List" resolveInfo="asList" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205757268461">
                  <property name="value" value="V" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205757273185">
                  <property name="value" value="X" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205757275234">
                  <property name="value" value="V" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205757277144">
                  <property name="value" value="Z" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205757282911">
                  <property name="value" value="Z" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205757284375">
                  <property name="value" value="Z" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1205757286792">
                  <property name="value" value="Y" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205757101413">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205757101414">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205757101415">
                <link role="baseMethodDeclaration" targetNodeId="2.1205510696455" resolveInfo="assertIterableEqualsIgnoreOrder" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205757109114">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205757108646">
                    <link role="variableDeclaration" targetNodeId="1205756990208" resolveInfo="a" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.DisjunctOperation" id="1221825186671">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205757117631">
                      <link role="variableDeclaration" targetNodeId="1205757045801" resolveInfo="b" />
                    </node>
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205757137759">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205757129244">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205757128659">
                      <link role="variableDeclaration" targetNodeId="1205756990208" resolveInfo="a" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.UnionOperation" id="1205757131488">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205757134354">
                        <link role="variableDeclaration" targetNodeId="1205757045801" resolveInfo="b" />
                      </node>
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.ExcludeOperation" id="1205757141029">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205757145554">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205757145282">
                        <link role="variableDeclaration" targetNodeId="1205756990208" resolveInfo="a" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IntersectOperation" id="1205757146888">
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205757148550">
                          <link role="variableDeclaration" targetNodeId="1205757045801" resolveInfo="b" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1205757101416" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205757152997">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205757152998">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205757152999">
                <link role="baseMethodDeclaration" targetNodeId="2.1205510696455" resolveInfo="assertIterableEqualsIgnoreOrder" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205757155370">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205757154953">
                    <link role="variableDeclaration" targetNodeId="1205756990208" resolveInfo="a" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.DisjunctOperation" id="1221825186626">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205757158066">
                      <link role="variableDeclaration" targetNodeId="1205757045801" resolveInfo="b" />
                    </node>
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205757170102">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205757165063">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205757164647">
                      <link role="variableDeclaration" targetNodeId="1205756990208" resolveInfo="a" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.ExcludeOperation" id="1205757166054">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205757167475">
                        <link role="variableDeclaration" targetNodeId="1205757045801" resolveInfo="b" />
                      </node>
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.UnionOperation" id="1205757171996">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205757174088">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205757173406">
                        <link role="variableDeclaration" targetNodeId="1205757045801" resolveInfo="b" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.ExcludeOperation" id="1205757175188">
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205757176508">
                          <link role="variableDeclaration" targetNodeId="1205756990208" resolveInfo="a" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1205757153000" />
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1241359347132">
        <property name="methodName" value="nextWithoutHasNext" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1241359347133" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1241359347134">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1241359347135">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1241359347136">
              <property name="name" value="it" />
              <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.IteratorType" id="1241359347137">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1241359347138" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359347139">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359347140">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1241359347141">
                    <node role="creator" type="jetbrains.mps.baseLanguage.collections.structure.ListCreatorWithInit" id="1241359347142">
                      <node role="elementType" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1241359347143" />
                      <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359347144">
                        <property name="value" value="1" />
                      </node>
                      <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359347145">
                        <property name="value" value="2" />
                      </node>
                      <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359347146">
                        <property name="value" value="3" />
                      </node>
                      <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359355666">
                        <property name="value" value="4" />
                      </node>
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.DisjunctOperation" id="1241359361764">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1241359363070">
                      <node role="creator" type="jetbrains.mps.baseLanguage.collections.structure.ListCreatorWithInit" id="1241359365500">
                        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1241359366934" />
                        <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359421882">
                          <property name="value" value="3" />
                        </node>
                        <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359422476">
                          <property name="value" value="4" />
                        </node>
                        <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359423062">
                          <property name="value" value="5" />
                        </node>
                        <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359424044">
                          <property name="value" value="6" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetIteratorOperation" id="1241359347153" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertSame" id="1241359347154">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359347155">
              <property name="value" value="1" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359347156">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1241359347157">
                <link role="variableDeclaration" targetNodeId="1241359347136" resolveInfo="it" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetNextOperation" id="1241359347158" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertSame" id="1241359347159">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359347160">
              <property name="value" value="2" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359347161">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1241359347162">
                <link role="variableDeclaration" targetNodeId="1241359347136" resolveInfo="it" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetNextOperation" id="1241359347163" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertSame" id="1241359347164">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359347165">
              <property name="value" value="5" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359347166">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1241359347167">
                <link role="variableDeclaration" targetNodeId="1241359347136" resolveInfo="it" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetNextOperation" id="1241359347168" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertSame" id="1241359347169">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359347170">
              <property name="value" value="6" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359347171">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1241359347172">
                <link role="variableDeclaration" targetNodeId="1241359347136" resolveInfo="it" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetNextOperation" id="1241359347173" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse" id="1241359347179">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359347180">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1241359347181">
                <link role="variableDeclaration" targetNodeId="1241359347136" resolveInfo="it" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.HasNextOperation" id="1241359347182" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertThrows" id="1241359347183">
            <node role="exceptionType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1241359347184">
              <link role="classifier" targetNodeId="3.~NoSuchElementException" resolveInfo="NoSuchElementException" />
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1241359347185">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359347186">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1241359347187">
                  <link role="variableDeclaration" targetNodeId="1241359347136" resolveInfo="it" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetNextOperation" id="1241359347188" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205528122497">
      <link role="classifier" targetNodeId="2.1204129267857" resolveInfo="Util_Test" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.unitTest.structure.BTestCase" id="1205574331460">
    <property name="testCaseName" value="Concat" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1205574331461" />
    <node role="testMethodList" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethodList" id="1205574331462">
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1205574337823">
        <property name="methodName" value="concatMethod" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1205574337824" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205574337825">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205574351719">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205574351720">
              <property name="name" value="input" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205574351721">
                <link role="classifier" targetNodeId="1.~ISequence" resolveInfo="ISequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205574355160">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205574367185">
                <link role="classConcept" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
                <link role="baseMethodDeclaration" targetNodeId="1.~Sequence.fromArray(java.lang.Object...):jetbrains.mps.internal.collections.runtime.ISequence" resolveInfo="fromArray" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205574368335">
                  <property name="value" value="1" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205574369190">
                  <property name="value" value="2" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205574370032">
                  <property name="value" value="3" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205574560755">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205574560756">
              <property name="name" value="test" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205574560757">
                <link role="classifier" targetNodeId="1.~ISequence" resolveInfo="ISequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205574564350">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205574570865">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205574570138">
                  <link role="variableDeclaration" targetNodeId="1205574351720" resolveInfo="input" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205574573307">
                  <link role="baseMethodDeclaration" targetNodeId="1.~ISequence.concat(jetbrains.mps.internal.collections.runtime.ISequence):jetbrains.mps.internal.collections.runtime.ISequence" resolveInfo="concat" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205574577532">
                    <link role="classConcept" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
                    <link role="baseMethodDeclaration" targetNodeId="1.~Sequence.fromArray(java.lang.Object...):jetbrains.mps.internal.collections.runtime.ISequence" resolveInfo="fromArray" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205574579886">
                      <property name="value" value="4" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205574580591">
                      <property name="value" value="5" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205574581223">
                      <property name="value" value="6" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205574593026">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205574593027">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205574593028">
                <link role="baseMethodDeclaration" targetNodeId="2.1204129289579" resolveInfo="assertIterableEquals" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205574602081">
                  <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
                  <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object...):java.util.List" resolveInfo="asList" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205574603334">
                    <property name="value" value="1" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205574604061">
                    <property name="value" value="2" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205574604656">
                    <property name="value" value="3" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205574605299">
                    <property name="value" value="4" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205574605894">
                    <property name="value" value="5" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1205574606688">
                    <property name="value" value="6" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205574610063">
                  <link role="variableDeclaration" targetNodeId="1205574560756" resolveInfo="test" />
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1205574593029" />
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1206730385103">
        <property name="methodName" value="concatOperation" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1206730385104" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206730385105">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1206730396345">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1206730396346">
              <property name="name" value="input" />
              <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.SequenceType" id="1206730396347">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206730398987">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206730424275">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1206730424276">
                  <link role="baseMethodDeclaration" targetNodeId="2.1204793778541" resolveInfo="input5" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1206730424277" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1206730428795">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1206730428796">
              <property name="name" value="test" />
              <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.SequenceType" id="1206730428797">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1206730430597">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206730436702">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206730435860">
                  <link role="variableDeclaration" targetNodeId="1206730396346" resolveInfo="input" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.ConcatOperation" id="1206730437700">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1206730443964">
                    <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
                    <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object...):java.util.List" resolveInfo="asList" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1206730448324">
                      <property name="value" value="6" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1206730449200">
                      <property name="value" value="7" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1206730450165">
                      <property name="value" value="8" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1206730451291">
                      <property name="value" value="9" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1206730452182">
                      <property name="value" value="10" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206730455918">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206730455919">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1206730455920">
                <link role="baseMethodDeclaration" targetNodeId="2.1204129289579" resolveInfo="assertIterableEquals" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206730461475">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1206730461476">
                    <link role="baseMethodDeclaration" targetNodeId="2.1206730471291" resolveInfo="expect10" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1206730461477" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206730467851">
                  <link role="variableDeclaration" targetNodeId="1206730428796" resolveInfo="test" />
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1206730455921" />
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1241358954601">
        <property name="methodName" value="nextWithoutHasNext" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1241358954602" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1241358954603">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1241359038129">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1241359038130">
              <property name="name" value="it" />
              <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.IteratorType" id="1241359038131">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1241359038132" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359038133">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359038134">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1241359038135">
                    <node role="creator" type="jetbrains.mps.baseLanguage.collections.structure.ListCreatorWithInit" id="1241359038136">
                      <node role="elementType" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1241359038137" />
                      <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359038138">
                        <property name="value" value="1" />
                      </node>
                      <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359038139">
                        <property name="value" value="2" />
                      </node>
                      <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359038140">
                        <property name="value" value="3" />
                      </node>
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.ConcatOperation" id="1241359038141">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1241359038142">
                      <node role="creator" type="jetbrains.mps.baseLanguage.collections.structure.ListCreatorWithInit" id="1241359038143">
                        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1241359038144" />
                        <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359038145">
                          <property name="value" value="4" />
                        </node>
                        <node role="initValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359038146">
                          <property name="value" value="5" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetIteratorOperation" id="1241359038147" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertSame" id="1241359050395">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359050936">
              <property name="value" value="1" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359052994">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1241359052776">
                <link role="variableDeclaration" targetNodeId="1241359038130" resolveInfo="it" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetNextOperation" id="1241359053726" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertSame" id="1241359059520">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359059521">
              <property name="value" value="2" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359059522">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1241359059523">
                <link role="variableDeclaration" targetNodeId="1241359038130" resolveInfo="it" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetNextOperation" id="1241359059524" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertSame" id="1241359061883">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359061884">
              <property name="value" value="3" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359061885">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1241359061886">
                <link role="variableDeclaration" targetNodeId="1241359038130" resolveInfo="it" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetNextOperation" id="1241359061887" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertSame" id="1241359062926">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359062927">
              <property name="value" value="4" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359062928">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1241359062929">
                <link role="variableDeclaration" targetNodeId="1241359038130" resolveInfo="it" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetNextOperation" id="1241359062930" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertSame" id="1241359063765">
            <node role="expected" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1241359063766">
              <property name="value" value="5" />
            </node>
            <node role="actual" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359063767">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1241359063768">
                <link role="variableDeclaration" targetNodeId="1241359038130" resolveInfo="it" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetNextOperation" id="1241359063769" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertFalse" id="1241359075606">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359200942">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1241359076603">
                <link role="variableDeclaration" targetNodeId="1241359038130" resolveInfo="it" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.HasNextOperation" id="1241359201649" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.unitTest.structure.AssertThrows" id="1241359081160">
            <node role="exceptionType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1241359096302">
              <link role="classifier" targetNodeId="3.~NoSuchElementException" resolveInfo="NoSuchElementException" />
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1241359092606">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1241359092632">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1241359092607">
                  <link role="variableDeclaration" targetNodeId="1241359038130" resolveInfo="it" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetNextOperation" id="1241359093291" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205574589034">
      <link role="classifier" targetNodeId="2.1204129267857" resolveInfo="Util_Test" />
    </node>
  </node>
</model>


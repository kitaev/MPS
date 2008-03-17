<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.internalCollections.test.compareOperations">
  <persistence version="1" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="1" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage.unitTest" />
  <language namespace="jetbrains.mps.internal.collections" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <language-engaged-on-generation namespace="jetbrains.mps.internal.collections" />
  <maxImportIndex value="4" />
  <import index="1" modelUID="jetbrains.mps.internal.collections.runtime@java_stub" version="-1" />
  <import index="2" modelUID="jetbrains.mps.internalCollections.test.closures" version="-1" />
  <import index="3" modelUID="java.util@java_stub" version="-1" />
  <import index="4" modelUID="java.lang@java_stub" version="-1" />
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
                <link role="classifier" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205512629090">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205511160485">
                <link role="classConcept" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
                <link role="baseMethodDeclaration" targetNodeId="1.~Sequence.fromArray(java.lang.Object[]):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromArray" />
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
                <link role="classifier" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205512633769">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205511181861">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205511181252">
                  <link role="variableDeclaration" targetNodeId="1205511148281" resolveInfo="input" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205511183582">
                  <link role="baseMethodDeclaration" targetNodeId="1.~Sequence.union(jetbrains.mps.internal.collections.runtime.Sequence):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="union" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205511187139">
                    <link role="classConcept" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
                    <link role="baseMethodDeclaration" targetNodeId="1.~Sequence.fromArray(java.lang.Object[]):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromArray" />
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
                  <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
                  <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
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
              <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType" id="1205512669746">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205512671882">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205512731849">
                <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
                <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
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
              <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType" id="1205512738196">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205512740170">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205512744266">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205512743897">
                  <link role="variableDeclaration" targetNodeId="1205512669745" resolveInfo="input" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.UnionOperation" id="1205512745952">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205512751867">
                    <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
                    <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
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
                  <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
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
    </node>
    <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205511222599">
      <link role="classifier" targetNodeId="2.1204129267857" resolveInfo="Util_Test" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.unitTest.structure.BTestCase" id="1205514854257">
    <property name="testCaseName" value="SubstractTest" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1205514854258" />
    <node role="testMethodList" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethodList" id="1205514854259">
      <node role="testMethod" type="jetbrains.mps.baseLanguage.unitTest.structure.TestMethod" id="1205514867105">
        <property name="methodName" value="substractMethod" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1205514867106" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205514867107">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205514874053">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205514874054">
              <property name="name" value="input" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205514874055">
                <link role="classifier" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205514876435">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205514884137">
                <link role="baseMethodDeclaration" targetNodeId="1.~Sequence.fromArray(java.lang.Object[]):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromArray" />
                <link role="classConcept" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
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
                <link role="classifier" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205514903051">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205514907739">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205514907383">
                  <link role="variableDeclaration" targetNodeId="1205514874054" resolveInfo="input" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205514914414">
                  <link role="baseMethodDeclaration" targetNodeId="1.~Sequence.substract(jetbrains.mps.internal.collections.runtime.Sequence):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="substract" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205514919218">
                    <link role="baseMethodDeclaration" targetNodeId="1.~Sequence.fromArray(java.lang.Object[]):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromArray" />
                    <link role="classConcept" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
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
                  <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
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
        <property name="methodName" value="substractOperation" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1205515308376" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205515308377">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205515314846">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205515314847">
              <property name="name" value="input" />
              <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType" id="1205515314848">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205515316974">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205515327053">
                <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
                <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
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
              <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType" id="1205515334648">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205515337003">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205515342046">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205515341444">
                  <link role="variableDeclaration" targetNodeId="1205515314847" resolveInfo="input" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ExcludeOperation" id="1205515346267">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205515360850">
                    <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
                    <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
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
                  <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
                  <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
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
                <link role="classifier" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205515636459">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205515636460">
                <link role="classConcept" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
                <link role="baseMethodDeclaration" targetNodeId="1.~Sequence.fromArray(java.lang.Object[]):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromArray" />
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
                <link role="classifier" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205515636471">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205515636472">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205515636473">
                  <link role="variableDeclaration" targetNodeId="1205515636457" resolveInfo="input" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205515636474">
                  <link role="baseMethodDeclaration" targetNodeId="1.~Sequence.intersect(jetbrains.mps.internal.collections.runtime.Sequence):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="intersect" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205515636475">
                    <link role="baseMethodDeclaration" targetNodeId="1.~Sequence.fromArray(java.lang.Object[]):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromArray" />
                    <link role="classConcept" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
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
                  <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
                  <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
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
              <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType" id="1205515757406">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205515757407">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205515757408">
                <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
                <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
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
              <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType" id="1205515757417">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205515757418">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205515757419">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205515757420">
                  <link role="variableDeclaration" targetNodeId="1205515757405" resolveInfo="input" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.IntersectOperation" id="1205516082337">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205516083681">
                    <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
                    <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
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
                  <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
                  <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
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
                <link role="classifier" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205528129145">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205528129146">
                <link role="baseMethodDeclaration" targetNodeId="1.~Sequence.fromArray(java.lang.Object[]):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromArray" />
                <link role="classConcept" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
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
                <link role="classifier" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205528129154">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205528129155">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205528129156">
                  <link role="variableDeclaration" targetNodeId="1205528129143" resolveInfo="input" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205528129157">
                  <link role="baseMethodDeclaration" targetNodeId="1.~Sequence.disjunction(jetbrains.mps.internal.collections.runtime.Sequence):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="disjunction" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205528129158">
                    <link role="baseMethodDeclaration" targetNodeId="1.~Sequence.fromArray(java.lang.Object[]):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromArray" />
                    <link role="classConcept" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
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
                  <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
                  <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
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
              <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType" id="1205598522797">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205598522798">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205598522799">
                <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
                <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
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
              <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType" id="1205598522808">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205598522809">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205598522810">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205598522811">
                  <link role="variableDeclaration" targetNodeId="1205598522796" resolveInfo="input" />
                </node>
                <node role="operation" type="jetbrains.mps.internal.collections.structure.DisjunctOperation" id="1205598611511">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205598625089">
                    <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
                    <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
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
                  <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
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
                <link role="classifier" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205574355160">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205574367185">
                <link role="baseMethodDeclaration" targetNodeId="1.~Sequence.fromArray(java.lang.Object[]):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromArray" />
                <link role="classConcept" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
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
                <link role="classifier" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205574564350">
                  <link role="classifier" targetNodeId="4.~Integer" resolveInfo="Integer" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205574570865">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205574570138">
                  <link role="variableDeclaration" targetNodeId="1205574351720" resolveInfo="input" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205574573307">
                  <link role="baseMethodDeclaration" targetNodeId="1.~Sequence.concat(jetbrains.mps.internal.collections.runtime.Sequence):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="concat" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1205574577532">
                    <link role="baseMethodDeclaration" targetNodeId="1.~Sequence.fromArray(java.lang.Object[]):jetbrains.mps.internal.collections.runtime.Sequence" resolveInfo="fromArray" />
                    <link role="classConcept" targetNodeId="1.~Sequence" resolveInfo="Sequence" />
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
                  <link role="baseMethodDeclaration" targetNodeId="3.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
                  <link role="classConcept" targetNodeId="3.~Arrays" resolveInfo="Arrays" />
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
    </node>
    <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205574589034">
      <link role="classifier" targetNodeId="2.1204129267857" resolveInfo="Util_Test" />
    </node>
  </node>
</model>


<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.ide.newDevkitDialog">
  <persistence version="1" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.ide.uiLanguage" />
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.uiLanguage" />
  <language namespace="jetbrains.mps.baseLanguage.classifiers" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="0" />
  </language>
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <maxImportIndex value="12" />
  <import index="1" modelUID="java.awt@java_stub" version="-1" />
  <import index="2" modelUID="java.lang@java_stub" version="-1" />
  <import index="4" modelUID="jetbrains.mps.project@java_stub" version="-1" />
  <import index="6" modelUID="jetbrains.mps.ide.common" version="-1" />
  <import index="7" modelUID="jetbrains.mps.util@java_stub" version="-1" />
  <import index="8" modelUID="java.io@java_stub" version="-1" />
  <import index="9" modelUID="jetbrains.mps.projectLanguage.structure" version="-1" />
  <import index="10" modelUID="jetbrains.mps.projectLanguage@java_stub" version="-1" />
  <import index="11" modelUID="jetbrains.mps.vfs@java_stub" version="-1" />
  <import index="12" modelUID="jetbrains.mps.core.structure" version="-1" />
  <visible index="2" modelUID="jetbrains.mps.uiLanguage.components" />
  <node type="jetbrains.mps.uiLanguage.structure.ComponentDeclaration" id="1204026592280">
    <property name="name" value="NewDevKitDialog" />
    <node role="root" type="jetbrains.mps.ide.uiLanguage.structure.IDEDialog" id="1204026607298">
      <property name="title" value="New Dev Kit" />
      <node role="button" type="jetbrains.mps.ide.uiLanguage.structure.IDEDialogButton" id="1204026678528">
        <property name="text" value="OK" />
        <property name="isDefault" value="true" />
        <node role="handler" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204027101807">
          <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1205754224035" />
          <node role="operation" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodCallOperation" id="1205834446420">
            <link role="member" targetNodeId="1204027050087" resolveInfo="onOk" />
          </node>
        </node>
      </node>
      <node role="button" type="jetbrains.mps.ide.uiLanguage.structure.IDEDialogButton" id="1204026688952">
        <property name="text" value="Cancel" />
        <node role="handler" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204117533899">
          <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1205754224083" />
          <node role="operation" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodCallOperation" id="1205834446423">
            <link role="member" targetNodeId="1204027087626" resolveInfo="onCancel" />
          </node>
        </node>
      </node>
      <node role="contentPane" type="jetbrains.mps.uiLanguage.structure.Grid" id="1204026619518">
        <node role="row" type="jetbrains.mps.uiLanguage.structure.GridRow" id="1204026619519">
          <node role="component" type="jetbrains.mps.uiLanguage.structure.ComponentInstance" id="1204026619520">
            <link role="componentDeclaration" targetNodeId="2v.1202465811094" resolveInfo="Label" />
            <node role="content" type="jetbrains.mps.uiLanguage.structure.AttributeValue" id="1204026619521">
              <link role="attribute" targetNodeId="2v.1202465836231" resolveInfo="text" />
              <node role="value" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1204026644203">
                <property name="value" value="Devkit Name:" />
              </node>
            </node>
          </node>
        </node>
        <node role="row" type="jetbrains.mps.uiLanguage.structure.GridRow" id="1204026619523">
          <node role="component" type="jetbrains.mps.uiLanguage.structure.ComponentInstance" id="1204026619524">
            <link role="componentDeclaration" targetNodeId="2v.1202464198724" resolveInfo="TextField" />
            <node role="content" type="jetbrains.mps.uiLanguage.structure.AttributeValue" id="1204026619525">
              <link role="attribute" targetNodeId="2v.1202464208353" resolveInfo="text" />
              <node role="value" type="jetbrains.mps.uiLanguage.structure.BindExpression" id="1204026619526">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204026619527">
                  <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1205754224094" />
                  <node role="operation" type="jetbrains.mps.uiLanguage.structure.AttributeReferenceOperation" id="1204026675276">
                    <link role="member" targetNodeId="1204026659144" resolveInfo="devkitName" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="row" type="jetbrains.mps.uiLanguage.structure.GridRow" id="1204026619530">
          <node role="component" type="jetbrains.mps.uiLanguage.structure.ComponentInstance" id="1204026619531">
            <link role="componentDeclaration" targetNodeId="2v.1202465811094" resolveInfo="Label" />
            <node role="content" type="jetbrains.mps.uiLanguage.structure.AttributeValue" id="1204026619532">
              <link role="attribute" targetNodeId="2v.1202465836231" resolveInfo="text" />
              <node role="value" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1204026619533">
                <property name="value" value="Devkit Path:" />
              </node>
            </node>
          </node>
        </node>
        <node role="row" type="jetbrains.mps.uiLanguage.structure.GridRow" id="1204026619534">
          <node role="component" type="jetbrains.mps.uiLanguage.structure.ComponentInstance" id="1204026619535">
            <link role="componentDeclaration" targetNodeId="6.1203601634745" resolveInfo="PathField" />
            <node role="content" type="jetbrains.mps.uiLanguage.structure.AttributeValue" id="1204027152488">
              <link role="attribute" targetNodeId="6.1203601661865" resolveInfo="path" />
              <node role="value" type="jetbrains.mps.uiLanguage.structure.BindExpression" id="1204027153786">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204027154820">
                  <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1205754224315" />
                  <node role="operation" type="jetbrains.mps.uiLanguage.structure.AttributeReferenceOperation" id="1204027157401">
                    <link role="member" targetNodeId="1204026664006" resolveInfo="devkitDir" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.uiLanguage.structure.ComponentController" id="1204026656767">
    <link role="component" targetNodeId="1204026592280" resolveInfo="NewDevKitDialog" />
    <node role="componentMethod" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration" id="1204027050087">
      <property name="name" value="onOk" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1204027085953" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204027050089">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1204027462424">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204027462425">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204027470627">
              <node role="expression" type="jetbrains.mps.ide.uiLanguage.structure.ReportErrorExpression" id="1204027470628">
                <node role="errorText" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1204027471614">
                  <property name="value" value="Enter DevKit Directory" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1204027477351" />
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1204027468420">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204027469626">
              <property name="value" value="0" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205834554414">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204027464007">
                <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1205754224320" />
                <node role="operation" type="jetbrains.mps.uiLanguage.structure.AttributeReferenceOperation" id="1204027465462">
                  <link role="member" targetNodeId="1204026664006" resolveInfo="devkitDir" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205834554415">
                <link role="baseMethodDeclaration" targetNodeId="2.~String.length():int" resolveInfo="length" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1204027478681">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204027478682">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204027489978">
              <node role="expression" type="jetbrains.mps.ide.uiLanguage.structure.ReportErrorExpression" id="1204027489979">
                <node role="errorText" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1204027490856">
                  <property name="value" value="Enter DevKit Name" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1204027496358" />
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1204027486552">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204027487945">
              <property name="value" value="0" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205834556713">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204027480311">
                <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1205754224147" />
                <node role="operation" type="jetbrains.mps.uiLanguage.structure.AttributeReferenceOperation" id="1204027483298">
                  <link role="member" targetNodeId="1204026659144" resolveInfo="devkitName" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205834556714">
                <link role="baseMethodDeclaration" targetNodeId="2.~String.length():int" resolveInfo="length" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204027640131">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204027640132">
            <property name="name" value="devkitPath" />
            <property name="isFinal" value="true" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204027640133">
              <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1204027646764">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1204027650425">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1204027657557">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1204027658591">
                    <property name="value" value=".devkit" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204027655319">
                    <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1205754224273" />
                    <node role="operation" type="jetbrains.mps.uiLanguage.structure.AttributeReferenceOperation" id="1204027657165">
                      <link role="member" targetNodeId="1204026659144" resolveInfo="devkitName" />
                    </node>
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1204027649080">
                  <link role="classifier" targetNodeId="8.~File" resolveInfo="File" />
                  <link role="variableDeclaration" targetNodeId="8.~File.separator" resolveInfo="separator" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204027645136">
                <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1205754224138" />
                <node role="operation" type="jetbrains.mps.uiLanguage.structure.AttributeReferenceOperation" id="1204027646373">
                  <link role="member" targetNodeId="1204026664006" resolveInfo="devkitDir" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1204027665297">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204027665298">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204027676165">
              <node role="expression" type="jetbrains.mps.ide.uiLanguage.structure.ReportErrorExpression" id="1204027676166">
                <node role="errorText" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1204027678873">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1204027680158">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1204027681114">
                      <property name="value" value=" already exists" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204027679844">
                      <link role="variableDeclaration" targetNodeId="1204027640132" resolveInfo="pathName" />
                    </node>
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1204027676934">
                    <property name="value" value="File " />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1204027686054" />
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205834558465">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1204027666582">
              <link role="baseMethodDeclaration" targetNodeId="8.~File.&lt;init&gt;(java.lang.String)" resolveInfo="File" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204027670083">
                <link role="variableDeclaration" targetNodeId="1204027640132" resolveInfo="pathName" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205834558466">
              <link role="baseMethodDeclaration" targetNodeId="8.~File.exists():boolean" resolveInfo="exists" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1204027859406">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204027859407">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204027872201">
              <node role="expression" type="jetbrains.mps.ide.uiLanguage.structure.ReportErrorExpression" id="1204027872202">
                <node role="errorText" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1204027872845">
                  <property name="value" value="Path should be absolute" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1204027880519" />
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1204027870244">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205834560858">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1204027870246">
                <link role="baseMethodDeclaration" targetNodeId="8.~File.&lt;init&gt;(java.lang.String)" resolveInfo="File" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204027870247">
                  <link role="variableDeclaration" targetNodeId="1204027640132" resolveInfo="pathName" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205834560859">
                <link role="baseMethodDeclaration" targetNodeId="8.~File.isAbsolute():boolean" resolveInfo="isAbsolute" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204027894162">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204027894163">
            <property name="name" value="dir" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204027894164">
              <link role="classifier" targetNodeId="8.~File" resolveInfo="File" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1204027896604">
              <link role="baseMethodDeclaration" targetNodeId="8.~File.&lt;init&gt;(java.lang.String)" resolveInfo="File" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204027900746">
                <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1205754224177" />
                <node role="operation" type="jetbrains.mps.uiLanguage.structure.AttributeReferenceOperation" id="1204027902170">
                  <link role="member" targetNodeId="1204026664006" resolveInfo="devkitDir" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1204027907063">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204027907064">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1204027917698">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204027917699">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204027923502">
                  <node role="expression" type="jetbrains.mps.ide.uiLanguage.structure.ReportErrorExpression" id="1204027923503">
                    <node role="errorText" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1204027924192">
                      <property name="value" value="Enter correct path" />
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1204027928772" />
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1204027920124">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204027933712">
                  <link role="baseMethodDeclaration" targetNodeId="7.~DirectoryUtil.askToCreateNewDirectory(java.awt.Frame,java.io.File):boolean" resolveInfo="askToCreateNewDirectory" />
                  <link role="classConcept" targetNodeId="7.~DirectoryUtil" resolveInfo="DirectoryUtil" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1204027949731">
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204027949732">
                      <link role="classifier" targetNodeId="1.~Frame" resolveInfo="Frame" />
                    </node>
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205834565815">
                      <node role="operand" type="jetbrains.mps.ide.uiLanguage.structure.DialogExpression" id="1204027949734" />
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205834565816">
                        <link role="baseMethodDeclaration" targetNodeId="1.~Window.getOwner():java.awt.Window" resolveInfo="getOwner" />
                      </node>
                    </node>
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204027954549">
                    <link role="variableDeclaration" targetNodeId="1204027894163" resolveInfo="dir" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1204027908692">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205834563766">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204027910225">
                <link role="variableDeclaration" targetNodeId="1204027894163" resolveInfo="dir" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205834563767">
                <link role="baseMethodDeclaration" targetNodeId="8.~File.exists():boolean" resolveInfo="exists" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ExecuteCommandStatement" id="1208784477816">
          <node role="commandClosureLiteral" type="jetbrains.mps.bootstrap.smodelLanguage.structure.CommandClosureLiteral" id="1208942214868">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208942214869">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208942214870">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208942214871">
                  <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1208942214872" />
                  <node role="operation" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodCallOperation" id="1208942214873">
                    <link role="member" targetNodeId="1204027985317" resolveInfo="createNewDevKit" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1208942214874">
                      <link role="baseMethodDeclaration" targetNodeId="8.~File.&lt;init&gt;(java.lang.String)" resolveInfo="File" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208942214875">
                        <link role="variableDeclaration" targetNodeId="1204027640132" resolveInfo="devkitPath" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204027091693">
          <node role="expression" type="jetbrains.mps.ide.uiLanguage.structure.DisposeDialogExpression" id="1204027091694" />
        </node>
      </node>
    </node>
    <node role="componentMethod" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration" id="1204027087626">
      <property name="name" value="onCancel" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1204027088942" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204027087628">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204027092992">
          <node role="expression" type="jetbrains.mps.ide.uiLanguage.structure.DisposeDialogExpression" id="1204027092993" />
        </node>
      </node>
    </node>
    <node role="componentMethod" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration" id="1204027179199">
      <property name="name" value="updateSolutionPath" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1204027180359" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204027179201">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1204027191787">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204027191788">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1204027196562" />
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1204027194605">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1204027195530" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204027193198">
              <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1205754224192" />
              <node role="operation" type="jetbrains.mps.uiLanguage.structure.AttributeReferenceOperation" id="1204027194200">
                <link role="member" targetNodeId="1204026853869" resolveInfo="project" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204027187688">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204027187689">
            <property name="name" value="path" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204027187690">
              <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204027246048">
              <link role="baseMethodDeclaration" targetNodeId="7.~FileUtil.getCanonicalPath(java.io.File):java.lang.String" resolveInfo="getCanonicalPath" />
              <link role="classConcept" targetNodeId="7.~FileUtil" resolveInfo="FileUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205834587952">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205834571991">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204027247848">
                    <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1205754224360" />
                    <node role="operation" type="jetbrains.mps.uiLanguage.structure.AttributeReferenceOperation" id="1204027247850">
                      <link role="member" targetNodeId="1204026853869" resolveInfo="project" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205834571992">
                    <link role="baseMethodDeclaration" targetNodeId="4.~MPSProject.getProjectFile():java.io.File" resolveInfo="getProjectFile" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205834587953">
                  <link role="baseMethodDeclaration" targetNodeId="8.~File.getParentFile():java.io.File" resolveInfo="getParentFile" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204027260587">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204027260588">
            <property name="name" value="prefix" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204027260589">
              <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1204027265249">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1204027276104">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1204027279358">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1204027281642">
                    <link role="classifier" targetNodeId="8.~File" resolveInfo="File" />
                    <link role="variableDeclaration" targetNodeId="8.~File.separator" resolveInfo="separator" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1204027277778">
                    <property name="value" value="devkits" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1204027274853">
                  <link role="classifier" targetNodeId="8.~File" resolveInfo="File" />
                  <link role="variableDeclaration" targetNodeId="8.~File.separator" resolveInfo="separator" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204027264639">
                <link role="variableDeclaration" targetNodeId="1204027187689" resolveInfo="path" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1204027305859">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204027305860">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204027325480">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1204027329547">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1204027331786">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204027334618">
                    <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1205754224120" />
                    <node role="operation" type="jetbrains.mps.uiLanguage.structure.AttributeReferenceOperation" id="1204027337167">
                      <link role="member" targetNodeId="1204026659144" resolveInfo="devkitName" />
                    </node>
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204027331128">
                    <link role="variableDeclaration" targetNodeId="1204027260588" resolveInfo="prefix" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204027325763">
                  <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1205754224126" />
                  <node role="operation" type="jetbrains.mps.uiLanguage.structure.AttributeReferenceOperation" id="1204027328499">
                    <link role="member" targetNodeId="1204026664006" resolveInfo="devkitDir" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1204027313106">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205834587950">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204027320320">
                <node role="operation" type="jetbrains.mps.uiLanguage.structure.AttributeReferenceOperation" id="1204027320321">
                  <link role="member" targetNodeId="1204026664006" resolveInfo="devkitDir" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1205754224274" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205834587951">
                <link role="baseMethodDeclaration" targetNodeId="2.~String.startsWith(java.lang.String):boolean" resolveInfo="startsWith" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204027317972">
                  <link role="variableDeclaration" targetNodeId="1204027260588" resolveInfo="prefix" />
                </node>
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1204027309273">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205834587948">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204027320317">
                  <node role="operation" type="jetbrains.mps.uiLanguage.structure.AttributeReferenceOperation" id="1204027320318">
                    <link role="member" targetNodeId="1204026664006" resolveInfo="devkitDir" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1205754224194" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205834587949">
                  <link role="baseMethodDeclaration" targetNodeId="2.~String.length():int" resolveInfo="length" />
                </node>
              </node>
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1204027311698">
                <property name="value" value="0" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="componentMethod" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration" id="1204027985317">
      <property name="name" value="createNewDevKit" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1204028053073">
        <property name="name" value="devkitPath" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204028095490">
          <link role="classifier" targetNodeId="8.~File" resolveInfo="File" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1204027986523" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204028223029">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1204028226155">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1204028226156">
            <property name="name" value="descriptor" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1204028226157">
              <link role="concept" targetNodeId="9.1166132531625" resolveInfo="DevKitDescriptor" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1204028230925">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1204028230926">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1204028230927">
                  <link role="concept" targetNodeId="9.1166132531625" resolveInfo="DevKitDescriptor" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204028239960">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204028243823">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204028240447">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204028239961">
                <link role="variableDeclaration" targetNodeId="1204028226156" resolveInfo="descriptor" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1204028242353">
                <link role="property" targetNodeId="12.1169194664001" resolveInfo="name" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1204028244747">
              <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204028250219">
                <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1205754224290" />
                <node role="operation" type="jetbrains.mps.uiLanguage.structure.AttributeReferenceOperation" id="1204028251814">
                  <link role="member" targetNodeId="1204026659144" resolveInfo="devkitName" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204028268732">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1204028271453">
            <link role="baseMethodDeclaration" targetNodeId="10.~DescriptorsPersistence.saveDevKitDescriptor(jetbrains.mps.projectLanguage.structure.DevKitDescriptor,jetbrains.mps.vfs.IFile):void" resolveInfo="saveDevKitDescriptor" />
            <link role="classConcept" targetNodeId="10.~DescriptorsPersistence" resolveInfo="DescriptorsPersistence" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204028273815">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1204028272735">
                <link role="variableDeclaration" targetNodeId="1204028226156" resolveInfo="descriptor" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1204028274895" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1204028284620">
              <link role="baseMethodDeclaration" targetNodeId="11.~FileSystemFile.&lt;init&gt;(java.io.File)" resolveInfo="FileSystemFile" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204028292228">
                <link role="variableDeclaration" targetNodeId="1204028053073" resolveInfo="devkitPath" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204028297621">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205834587946">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204028297873">
              <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1205754224313" />
              <node role="operation" type="jetbrains.mps.uiLanguage.structure.AttributeReferenceOperation" id="1204028299500">
                <link role="member" targetNodeId="1204026853869" resolveInfo="project" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205834587947">
              <link role="baseMethodDeclaration" targetNodeId="4.~MPSProject.addProjectDevKit(jetbrains.mps.vfs.IFile):void" resolveInfo="addProjectDevKit" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1204028312595">
                <link role="baseMethodDeclaration" targetNodeId="11.~FileSystemFile.&lt;init&gt;(java.io.File)" resolveInfo="FileSystemFile" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1204028312596">
                  <link role="variableDeclaration" targetNodeId="1204028053073" resolveInfo="devkitPath" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="attribute" type="jetbrains.mps.uiLanguage.structure.AttributeDeclaration" id="1204026659144">
      <property name="name" value="devkitName" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204026661583">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="onChange" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204027358445">
        <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1205754224195" />
        <node role="operation" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodCallOperation" id="1205834446418">
          <link role="member" targetNodeId="1204027179199" resolveInfo="updateSolutionPath" />
        </node>
      </node>
    </node>
    <node role="attribute" type="jetbrains.mps.uiLanguage.structure.AttributeDeclaration" id="1204026664006">
      <property name="name" value="devkitDir" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204026667024">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="attribute" type="jetbrains.mps.uiLanguage.structure.AttributeDeclaration" id="1204026853869">
      <property name="name" value="project" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1204026860004">
        <link role="classifier" targetNodeId="4.~MPSProject" resolveInfo="MPSProject" />
      </node>
      <node role="onChange" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204027354175">
        <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1205754224017" />
        <node role="operation" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodCallOperation" id="1205834446425">
          <link role="member" targetNodeId="1204027179199" resolveInfo="updateSolutionPath" />
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.uiLanguage.structure.ComponentConstructor" id="1204027369199">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1204027369200">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204027371638">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1204027374097">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1204027374771">
              <property name="value" value="" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204027371890">
              <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1205754224276" />
              <node role="operation" type="jetbrains.mps.uiLanguage.structure.AttributeReferenceOperation" id="1204027373236">
                <link role="member" targetNodeId="1204026659144" resolveInfo="devkitName" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1204027376133">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1204027379560">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1204027380438">
              <property name="value" value="" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204027376463">
              <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1205754224142" />
              <node role="operation" type="jetbrains.mps.uiLanguage.structure.AttributeReferenceOperation" id="1204027378496">
                <link role="member" targetNodeId="1204026664006" resolveInfo="devkitDir" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>


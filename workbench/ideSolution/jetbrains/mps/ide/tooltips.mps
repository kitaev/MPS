<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:2170b42c-b000-4bd7-a2c2-c5cf5fe74d08(jetbrains.mps.ide.tooltips)">
  <persistence version="3" />
  <refactoringHistory />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902db(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590283(jetbrains.mps.lang.core.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590328(jetbrains.mps.baseLanguage.collections.constraints)" version="6" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590334(jetbrains.mps.baseLanguage.closures.constraints)" version="2" />
  <maxImportIndex value="12" />
  <import index="1" modelUID="f:java_stub#javax.swing(javax.swing@java_stub)" version="-1" />
  <import index="2" modelUID="f:java_stub#java.awt(java.awt@java_stub)" version="-1" />
  <import index="3" modelUID="f:java_stub#java.awt.event(java.awt.event@java_stub)" version="-1" />
  <import index="4" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" />
  <import index="5" modelUID="f:java_stub#javax.swing.text(javax.swing.text@java_stub)" version="-1" />
  <import index="6" modelUID="f:java_stub#com.intellij.openapi.editor(com.intellij.openapi.editor@java_stub)" version="-1" />
  <import index="7" modelUID="f:java_stub#jetbrains.mps.nodeEditor(jetbrains.mps.nodeEditor@java_stub)" version="-1" />
  <import index="8" modelUID="f:java_stub#javax.swing.border(javax.swing.border@java_stub)" version="-1" />
  <import index="9" modelUID="f:java_stub#jetbrains.mps.util(jetbrains.mps.util@java_stub)" version="-1" />
  <import index="10" modelUID="f:java_stub#com.intellij.openapi.components(com.intellij.openapi.components@java_stub)" version="-1" />
  <import index="11" modelUID="f:java_stub#org.jetbrains.annotations(org.jetbrains.annotations@java_stub)" version="-1" />
  <import index="12" modelUID="f:java_stub#com.intellij.openapi.application(com.intellij.openapi.application@java_stub)" version="-1" />
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="5522183980949036968">
    <property name="name" value="ToolTip" />
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1657638272963421745">
      <property name="name" value="show" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1657638272963421746" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1657638272963421747" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1657638272963421748">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="2913460188527323534">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="2913460188527323538">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="2913460188527323541">
              <link role="variableDeclaration" targetNodeId="1657638272963423029" resolveInfo="hintInformation" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="2913460188527323535">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="2913460188527323536">
                <link role="fieldDeclaration" targetNodeId="2913460188527323530" resolveInfo="myHintInformation" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="2913460188527323537" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="6160742249368370033">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="6160742249368370034">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="6160742249368370035">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="6160742249368370036" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="6160742249368370037">
                <link role="fieldDeclaration" targetNodeId="6160742249368370030" resolveInfo="myDialog" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="6160742249368370038">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="6160742249368370039">
                <link role="baseMethodDeclaration" targetNodeId="5522183980949036978" resolveInfo="ToolTip.MyDialog" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="6160742249368370040">
                  <link role="variableDeclaration" targetNodeId="1657638272963423024" resolveInfo="owner" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="6160742249368370041">
                  <link role="variableDeclaration" targetNodeId="1657638272963423026" resolveInfo="location" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="6160742249368370042">
                  <link role="variableDeclaration" targetNodeId="1657638272963423029" resolveInfo="hintInformation" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1657638272963423033">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="55409159062220466">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="6160742249368370043">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="6160742249368370044" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="6160742249368370045">
                <link role="fieldDeclaration" targetNodeId="6160742249368370030" resolveInfo="myDialog" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="6773493145900289018">
              <link role="baseMethodDeclaration" targetNodeId="2.~Component.setVisible(boolean):void" resolveInfo="setVisible" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="6773493145900289019">
                <property name="value" value="true" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1657638272963423024">
        <property name="name" value="owner" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1657638272963423025">
          <link role="classifier" targetNodeId="2.~Frame" resolveInfo="Frame" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1657638272963423026">
        <property name="name" value="location" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1657638272963423028">
          <link role="classifier" targetNodeId="2.~Point" resolveInfo="Point" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1657638272963423029">
        <property name="name" value="hintInformation" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1657638272963423031">
          <link role="classifier" targetNodeId="1657638272963062314" resolveInfo="HintInformation" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="6160742249368370026">
      <property name="name" value="hide" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="6160742249368370027" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="6160742249368370028" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="6160742249368370029">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="7988039361770506433">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="7988039361770506434">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="7988039361770506444">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="7988039361770506445">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="7988039361770506446">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="7988039361770506447">
                    <link role="fieldDeclaration" targetNodeId="6160742249368370030" resolveInfo="myDialog" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="7988039361770506448" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="7988039361770506449">
                  <link role="baseMethodDeclaration" targetNodeId="1657638272963062268" resolveInfo="dispose" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="7988039361770506450">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="7988039361770506451">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="7988039361770506452" />
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="7988039361770506453">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="7988039361770506454">
                    <link role="fieldDeclaration" targetNodeId="6160742249368370030" resolveInfo="myDialog" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="7988039361770506455" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="7988039361770506440">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="7988039361770506443" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="7988039361770506437">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="7988039361770506438">
                <link role="fieldDeclaration" targetNodeId="6160742249368370030" resolveInfo="myDialog" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="7988039361770506439" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="2913460188527323522">
      <property name="name" value="getText" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.StringType" id="2913460188527323526" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="2913460188527323524" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="2913460188527323525">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="2913460188527323527">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="2913460188527323549">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="2913460188527323546">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="2913460188527323547">
                <link role="fieldDeclaration" targetNodeId="2913460188527323530" resolveInfo="myHintInformation" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="2913460188527323548" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="2913460188527323553">
              <link role="baseMethodDeclaration" targetNodeId="1657638272963062338" resolveInfo="getText" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticField" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration" id="5522183980949036991">
      <property name="isFinal" value="true" />
      <property name="name" value="BACKGROUND_COLOR" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="5522183980949036992" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="5522183980949036995">
        <link role="classifier" targetNodeId="2.~Color" resolveInfo="Color" />
      </node>
      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="5522183980949036998">
        <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="5522183980949037000">
          <link role="baseMethodDeclaration" targetNodeId="2.~Color.&lt;init&gt;(int,int,int)" resolveInfo="Color" />
          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="5522183980949037001">
            <property name="value" value="253" />
          </node>
          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="5522183980949037003">
            <property name="value" value="254" />
          </node>
          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="5522183980949037005">
            <property name="value" value="226" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticInnerClassifiers" type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="5522183980949036976">
      <property name="name" value="MyDialog" />
      <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="5522183980949036983">
        <property name="name" value="myTextArea" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="5522183980949036984" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="5522183980949036986">
          <link role="classifier" targetNodeId="1.~JTextArea" resolveInfo="JTextArea" />
        </node>
      </node>
      <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="5522183980949036987">
        <property name="name" value="myPrevFocusOwner" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="5522183980949036988" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="5522183980949036990">
          <link role="classifier" targetNodeId="2.~Component" resolveInfo="Component" />
        </node>
      </node>
      <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="5522183980949037006">
        <property name="name" value="myOwnerFocusListener" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="5522183980949037007" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="5522183980949037009">
          <link role="classifier" targetNodeId="3.~FocusListener" resolveInfo="FocusListener" />
        </node>
        <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="5522183980949037011">
          <node role="creator" type="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator" id="5522183980949037013">
            <node role="cls" type="jetbrains.mps.baseLanguage.structure.AnonymousClass" id="5522183980949037014">
              <property name="nonStatic" value="true" />
              <link role="classifier" targetNodeId="3.~FocusAdapter" resolveInfo="FocusAdapter" />
              <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="5522183980949037015" />
              <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="5522183980949037016">
                <property name="name" value="focusLost" />
                <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="5522183980949037017" />
                <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="5522183980949037018" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="5522183980949037019">
                  <property name="name" value="p0" />
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="5522183980949037020">
                    <link role="classifier" targetNodeId="3.~FocusEvent" resolveInfo="FocusEvent" />
                  </node>
                </node>
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="5522183980949037021">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="5522183980949037023">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="5522183980949037024">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="5522183980949037025">
                        <link role="baseMethodDeclaration" targetNodeId="1657638272963062268" resolveInfo="dispose" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="5522183980949037026">
                        <link role="classConcept" targetNodeId="5522183980949036976" resolveInfo="MyDialog" />
                      </node>
                    </node>
                  </node>
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.Statement" id="5522183980949037050" />
                </node>
                <node role="annotation" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance" id="5522183980949037022">
                  <link role="annotation" targetNodeId="4.~Override" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="5522183980949037027">
        <property name="name" value="myOwnerMouseListener" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="5522183980949037028" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="5522183980949037030">
          <link role="classifier" targetNodeId="3.~MouseListener" resolveInfo="MouseListener" />
        </node>
        <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="5522183980949037033">
          <node role="creator" type="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator" id="5522183980949037035">
            <node role="cls" type="jetbrains.mps.baseLanguage.structure.AnonymousClass" id="5522183980949037036">
              <property name="nonStatic" value="true" />
              <link role="classifier" targetNodeId="3.~MouseAdapter" resolveInfo="MouseAdapter" />
              <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="5522183980949037037" />
              <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="5522183980949037038">
                <property name="name" value="mousePressed" />
                <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="5522183980949037039" />
                <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="5522183980949037040" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="5522183980949037041">
                  <property name="name" value="p0" />
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="5522183980949037042">
                    <link role="classifier" targetNodeId="3.~MouseEvent" resolveInfo="MouseEvent" />
                  </node>
                </node>
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="5522183980949037043">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="5522183980949037045">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="5522183980949037046">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="5522183980949037047">
                        <link role="baseMethodDeclaration" targetNodeId="1657638272963062268" resolveInfo="dispose" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="5522183980949037048">
                        <link role="classConcept" targetNodeId="5522183980949036976" resolveInfo="MyDialog" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="annotation" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance" id="5522183980949037044">
                  <link role="annotation" targetNodeId="4.~Override" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1657638272963033126">
        <property name="name" value="myOwnerKeyListener" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1657638272963033127" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1657638272963033129">
          <link role="classifier" targetNodeId="3.~KeyListener" resolveInfo="KeyListener" />
        </node>
        <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1657638272963033131">
          <node role="creator" type="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator" id="1657638272963061112">
            <node role="cls" type="jetbrains.mps.baseLanguage.structure.AnonymousClass" id="1657638272963061113">
              <property name="nonStatic" value="true" />
              <link role="classifier" targetNodeId="3.~KeyAdapter" resolveInfo="KeyAdapter" />
              <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1657638272963061114" />
              <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1657638272963061115">
                <property name="name" value="keyPressed" />
                <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1657638272963061116" />
                <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1657638272963061117" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1657638272963061118">
                  <property name="name" value="p0" />
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1657638272963061119">
                    <link role="classifier" targetNodeId="3.~KeyEvent" resolveInfo="KeyEvent" />
                  </node>
                </node>
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1657638272963061120">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1657638272963061122">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963061123">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1657638272963061124">
                        <link role="baseMethodDeclaration" targetNodeId="1657638272963062268" resolveInfo="dispose" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1657638272963061125">
                        <link role="classConcept" targetNodeId="5522183980949036976" resolveInfo="Hint.MyDialog" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="annotation" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance" id="1657638272963061121">
                  <link role="annotation" targetNodeId="4.~Override" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="5522183980949036977" />
      <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="5522183980949036978">
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="5522183980949036979" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="5522183980949036980" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="5522183980949036981">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation" id="1841229352184927592">
            <link role="baseMethodDeclaration" targetNodeId="2.~Window.&lt;init&gt;(java.awt.Frame)" resolveInfo="Window" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1841229352184927593">
              <link role="variableDeclaration" targetNodeId="1657638272963062307" resolveInfo="owner" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1657638272963248464">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1657638272963248468">
              <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963248472">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1657638272963248471">
                  <link role="variableDeclaration" targetNodeId="1657638272963062307" resolveInfo="owner" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1657638272963248476">
                  <link role="baseMethodDeclaration" targetNodeId="2.~Window.getFocusOwner():java.awt.Component" resolveInfo="getFocusOwner" />
                </node>
              </node>
              <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963248465">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1657638272963248466">
                  <link role="fieldDeclaration" targetNodeId="5522183980949036987" resolveInfo="myPrevFocusOwner" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1657638272963248467" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.Statement" id="1657638272963248477" />
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1657638272963248493">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963248494">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1657638272963248495">
                <link role="baseMethodDeclaration" targetNodeId="2.~Window.setFocusableWindowState(boolean):void" resolveInfo="setFocusableWindowState" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1657638272963248497">
                  <property name="value" value="false" />
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1657638272963248496" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.Statement" id="1657638272963248498" />
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1657638272963248500">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1657638272963248504">
              <node role="rValue" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1657638272963248507">
                <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1657638272963248508">
                  <link role="baseMethodDeclaration" targetNodeId="1.~JTextArea.&lt;init&gt;()" resolveInfo="JTextArea" />
                </node>
              </node>
              <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963248501">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1657638272963248502">
                  <link role="fieldDeclaration" targetNodeId="5522183980949036983" resolveInfo="myTextArea" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1657638272963248503" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1657638272963249951">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963249955">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963249952">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1657638272963249953">
                  <link role="fieldDeclaration" targetNodeId="5522183980949036983" resolveInfo="myTextArea" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1657638272963249954" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1657638272963249959">
                <link role="baseMethodDeclaration" targetNodeId="5.~JTextComponent.setEditable(boolean):void" resolveInfo="setEditable" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1657638272963249960">
                  <property name="value" value="false" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1657638272963248510">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963248514">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963248511">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1657638272963248512">
                  <link role="fieldDeclaration" targetNodeId="5522183980949036983" resolveInfo="myTextArea" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1657638272963248513" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1657638272963249943">
                <link role="baseMethodDeclaration" targetNodeId="5.~JTextComponent.setText(java.lang.String):void" resolveInfo="setText" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963249945">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1657638272963249944">
                    <link role="variableDeclaration" targetNodeId="1657638272963062312" resolveInfo="nodeInformation" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1657638272963249949">
                    <link role="baseMethodDeclaration" targetNodeId="1657638272963062338" resolveInfo="getText" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1657638272963249962">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963249966">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963249963">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1657638272963249964">
                  <link role="fieldDeclaration" targetNodeId="5522183980949036983" resolveInfo="myTextArea" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1657638272963249965" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1657638272963249970">
                <link role="baseMethodDeclaration" targetNodeId="1.~JTextArea.setFont(java.awt.Font):void" resolveInfo="setFont" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963252351">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1657638272963252350">
                    <link role="baseMethodDeclaration" targetNodeId="7.~EditorSettings.getInstance():jetbrains.mps.nodeEditor.EditorSettings" resolveInfo="getInstance" />
                    <link role="classConcept" targetNodeId="7.~EditorSettings" resolveInfo="EditorSettings" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1657638272963252355">
                    <link role="baseMethodDeclaration" targetNodeId="7.~EditorSettings.getDefaultEditorFont():java.awt.Font" resolveInfo="getDefaultEditorFont" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.Statement" id="1657638272963252356" />
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1657638272963252358">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963252362">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963252359">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1657638272963252360">
                  <link role="fieldDeclaration" targetNodeId="5522183980949036983" resolveInfo="myTextArea" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1657638272963252361" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1657638272963252366">
                <link role="baseMethodDeclaration" targetNodeId="1.~JComponent.setBackground(java.awt.Color):void" resolveInfo="setBackground" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1657638272963252367">
                  <link role="variableDeclaration" targetNodeId="5522183980949036991" resolveInfo="BACKGROUND_COLOR" />
                  <link role="classifier" targetNodeId="5522183980949036968" resolveInfo="Hint" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1657638272963252369">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1657638272963252370">
              <property name="name" value="scrollPane" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1657638272963252371">
                <link role="classifier" targetNodeId="1.~JScrollPane" resolveInfo="JScrollPane" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1657638272963252373">
                <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1657638272963252717">
                  <link role="baseMethodDeclaration" targetNodeId="1.~JScrollPane.&lt;init&gt;(java.awt.Component)" resolveInfo="JScrollPane" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963252718">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1657638272963252719">
                      <link role="fieldDeclaration" targetNodeId="5522183980949036983" resolveInfo="myTextArea" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1657638272963252720" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1657638272963252722">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963252724">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1657638272963252723">
                <link role="variableDeclaration" targetNodeId="1657638272963252370" resolveInfo="scrollPane" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1657638272963252728">
                <link role="baseMethodDeclaration" targetNodeId="1.~JComponent.setBorder(javax.swing.border.Border):void" resolveInfo="setBorder" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1657638272963252729">
                  <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1657638272963252731">
                    <link role="baseMethodDeclaration" targetNodeId="8.~LineBorder.&lt;init&gt;(java.awt.Color)" resolveInfo="LineBorder" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1657638272963252732">
                      <link role="classifier" targetNodeId="2.~Color" resolveInfo="Color" />
                      <link role="variableDeclaration" targetNodeId="2.~Color.BLACK" resolveInfo="BLACK" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1657638272963252734">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963252735">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1657638272963252736">
                <link role="baseMethodDeclaration" targetNodeId="2.~Container.add(java.awt.Component):java.awt.Component" resolveInfo="add" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1657638272963252738">
                  <link role="variableDeclaration" targetNodeId="1657638272963252370" resolveInfo="scrollPane" />
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1657638272963252737" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.Statement" id="1657638272963252739" />
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1657638272963252741">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963252742">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1657638272963252743">
                <link role="baseMethodDeclaration" targetNodeId="2.~Window.pack():void" resolveInfo="pack" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1657638272963252744" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1657638272963252746">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963252747">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1657638272963252748">
                <link role="baseMethodDeclaration" targetNodeId="2.~Component.setLocation(int,int):void" resolveInfo="setLocation" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1104302755530028865">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1104302755530028864">
                    <link role="variableDeclaration" targetNodeId="1657638272963062309" resolveInfo="location" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1104302755530028869">
                    <link role="fieldDeclaration" targetNodeId="2.~Point.x" resolveInfo="x" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1104302755530028877">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1104302755530028872">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1104302755530028871">
                      <link role="variableDeclaration" targetNodeId="1657638272963062309" resolveInfo="location" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1104302755530028876">
                      <link role="fieldDeclaration" targetNodeId="2.~Point.y" resolveInfo="y" />
                    </node>
                  </node>
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1104302755530028881">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1104302755530028882">
                      <link role="baseMethodDeclaration" targetNodeId="2.~Component.getHeight():int" resolveInfo="getHeight" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1104302755530028883" />
                  </node>
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1657638272963252749" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.Statement" id="1657638272963252751" />
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1657638272963252753">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1657638272963252754">
              <property name="name" value="rect" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1657638272963252755">
                <link role="classifier" targetNodeId="2.~Rectangle" resolveInfo="Rectangle" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1657638272963252759">
                <link role="baseMethodDeclaration" targetNodeId="9.~WindowsUtil.findDeviceBoundsAt(java.awt.Point):java.awt.Rectangle" resolveInfo="findDeviceBoundsAt" />
                <link role="classConcept" targetNodeId="9.~WindowsUtil" resolveInfo="WindowsUtil" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1657638272963252760">
                  <link role="variableDeclaration" targetNodeId="1657638272963062309" resolveInfo="location" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1657638272963252762">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1657638272963252763">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1657638272963252794">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963252795">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1657638272963252796">
                    <link role="baseMethodDeclaration" targetNodeId="2.~Component.setLocation(int,int):void" resolveInfo="setLocation" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.MinusExpression" id="1657638272963252813">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963252816">
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1657638272963252817">
                          <link role="baseMethodDeclaration" targetNodeId="2.~Component.getWidth():int" resolveInfo="getWidth" />
                        </node>
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1657638272963252818" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1657638272963252804">
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963252799">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1657638272963252798">
                            <link role="variableDeclaration" targetNodeId="1657638272963252754" resolveInfo="rect" />
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1657638272963252803">
                            <link role="fieldDeclaration" targetNodeId="2.~Rectangle.x" resolveInfo="x" />
                          </node>
                        </node>
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963252808">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1657638272963252807">
                            <link role="variableDeclaration" targetNodeId="1657638272963252754" resolveInfo="rect" />
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1657638272963252812">
                            <link role="fieldDeclaration" targetNodeId="2.~Rectangle.width" resolveInfo="width" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963252820">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1657638272963252821">
                        <link role="baseMethodDeclaration" targetNodeId="2.~Component.getY():int" resolveInfo="getY" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1657638272963252822" />
                    </node>
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1657638272963252797" />
                </node>
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1657638272963252781">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1657638272963252788">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963252791">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1657638272963252792">
                    <link role="baseMethodDeclaration" targetNodeId="2.~Component.getWidth():int" resolveInfo="getWidth" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1657638272963252793" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963252784">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1657638272963252785">
                    <link role="baseMethodDeclaration" targetNodeId="2.~Component.getX():int" resolveInfo="getX" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1657638272963252786" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1657638272963252772">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963252767">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1657638272963252766">
                    <link role="variableDeclaration" targetNodeId="1657638272963252754" resolveInfo="rect" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1657638272963252771">
                    <link role="fieldDeclaration" targetNodeId="2.~Rectangle.x" resolveInfo="x" />
                  </node>
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963252776">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1657638272963252775">
                    <link role="variableDeclaration" targetNodeId="1657638272963252754" resolveInfo="rect" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1657638272963252780">
                    <link role="fieldDeclaration" targetNodeId="2.~Rectangle.width" resolveInfo="width" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1657638272963252824">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1657638272963252825">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1657638272963252826">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963252827">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1657638272963252828">
                    <link role="baseMethodDeclaration" targetNodeId="2.~Component.setLocation(int,int):void" resolveInfo="setLocation" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963252867">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1657638272963252868">
                        <link role="baseMethodDeclaration" targetNodeId="2.~Component.getX():int" resolveInfo="getX" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1657638272963252869" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.MinusExpression" id="1657638272963252829">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963252830">
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1657638272963252865">
                          <link role="baseMethodDeclaration" targetNodeId="2.~Component.getHeight():int" resolveInfo="getHeight" />
                        </node>
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1657638272963252832" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1657638272963252833">
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963252834">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1657638272963252835">
                            <link role="variableDeclaration" targetNodeId="1657638272963252754" resolveInfo="rect" />
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1657638272963252870">
                            <link role="fieldDeclaration" targetNodeId="2.~Rectangle.y" resolveInfo="y" />
                          </node>
                        </node>
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963252837">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1657638272963252838">
                            <link role="variableDeclaration" targetNodeId="1657638272963252754" resolveInfo="rect" />
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1657638272963252871">
                            <link role="fieldDeclaration" targetNodeId="2.~Rectangle.height" resolveInfo="height" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1657638272963252843" />
                </node>
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1657638272963252844">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1657638272963252845">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963252846">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1657638272963252863">
                    <link role="baseMethodDeclaration" targetNodeId="2.~Component.getHeight():int" resolveInfo="getHeight" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1657638272963252848" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963252849">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1657638272963252862">
                    <link role="baseMethodDeclaration" targetNodeId="2.~Component.getY():int" resolveInfo="getY" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1657638272963252851" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1657638272963252852">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963252853">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1657638272963252854">
                    <link role="variableDeclaration" targetNodeId="1657638272963252754" resolveInfo="rect" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1657638272963252859">
                    <link role="fieldDeclaration" targetNodeId="2.~Rectangle.y" resolveInfo="y" />
                  </node>
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963252856">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1657638272963252857">
                    <link role="variableDeclaration" targetNodeId="1657638272963252754" resolveInfo="rect" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1657638272963252860">
                    <link role="fieldDeclaration" targetNodeId="2.~Rectangle.height" resolveInfo="height" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.Statement" id="1657638272963248479" />
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1657638272963062302">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963062303">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1657638272963062304">
                <link role="baseMethodDeclaration" targetNodeId="1657638272963062217" resolveInfo="addListeners" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1657638272963062305" />
            </node>
          </node>
        </node>
        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1657638272963062307">
          <property name="name" value="owner" />
          <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1657638272963062308">
            <link role="classifier" targetNodeId="2.~Frame" resolveInfo="Frame" />
          </node>
        </node>
        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1657638272963062309">
          <property name="name" value="location" />
          <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1657638272963062311">
            <link role="classifier" targetNodeId="2.~Point" resolveInfo="Point" />
          </node>
        </node>
        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1657638272963062312">
          <property name="name" value="nodeInformation" />
          <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1657638272963062348">
            <link role="classifier" targetNodeId="1657638272963062314" resolveInfo="NodeInformation" />
          </node>
        </node>
      </node>
      <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1657638272963062217">
        <property name="name" value="addListeners" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1657638272963062218" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1657638272963062219" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1657638272963062220">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="8287697530462525571">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="8287697530462525572">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="8287697530462525582">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8287697530462525583">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8287697530462525584">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="8287697530462525585">
                      <link role="fieldDeclaration" targetNodeId="5522183980949036987" resolveInfo="myPrevFocusOwner" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="8287697530462525586" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8287697530462525587">
                    <link role="baseMethodDeclaration" targetNodeId="2.~Component.addFocusListener(java.awt.event.FocusListener):void" resolveInfo="addFocusListener" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8287697530462525588">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="8287697530462525589">
                        <link role="fieldDeclaration" targetNodeId="5522183980949037006" resolveInfo="myOwnerFocusListener" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="8287697530462525590" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="8287697530462525591">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8287697530462525592">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8287697530462525593">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="8287697530462525594">
                      <link role="fieldDeclaration" targetNodeId="5522183980949036987" resolveInfo="myPrevFocusOwner" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="8287697530462525595" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8287697530462525596">
                    <link role="baseMethodDeclaration" targetNodeId="2.~Component.addMouseListener(java.awt.event.MouseListener):void" resolveInfo="addMouseListener" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8287697530462525597">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="8287697530462525598">
                        <link role="fieldDeclaration" targetNodeId="5522183980949037027" resolveInfo="myOwnerMouseListener" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="8287697530462525599" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="8287697530462525600">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8287697530462525601">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8287697530462525602">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="8287697530462525603">
                      <link role="fieldDeclaration" targetNodeId="5522183980949036987" resolveInfo="myPrevFocusOwner" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="8287697530462525604" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8287697530462525605">
                    <link role="baseMethodDeclaration" targetNodeId="2.~Component.addKeyListener(java.awt.event.KeyListener):void" resolveInfo="addKeyListener" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8287697530462525606">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="8287697530462525607">
                        <link role="fieldDeclaration" targetNodeId="1657638272963033126" resolveInfo="myOwnerKeyListener" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="8287697530462525608" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="8287697530462525578">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="8287697530462525581" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8287697530462525575">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="8287697530462525576">
                  <link role="fieldDeclaration" targetNodeId="5522183980949036987" resolveInfo="myPrevFocusOwner" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="8287697530462525577" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1657638272963062222">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.SuperMethodCall" id="1657638272963062223">
              <link role="baseMethodDeclaration" targetNodeId="2.~Window.dispose():void" resolveInfo="dispose" />
            </node>
          </node>
        </node>
      </node>
      <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1657638272963062268">
        <property name="name" value="dispose" />
        <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1657638272963062269" />
        <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1657638272963062270" />
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1657638272963062271">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="8287697530462525611">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="8287697530462525612">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="8287697530462527655">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8287697530462527656">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8287697530462527657">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="8287697530462527658">
                      <link role="fieldDeclaration" targetNodeId="5522183980949036987" resolveInfo="myPrevFocusOwner" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="8287697530462527659" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8287697530462527660">
                    <link role="baseMethodDeclaration" targetNodeId="2.~Component.removeFocusListener(java.awt.event.FocusListener):void" resolveInfo="removeFocusListener" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8287697530462527661">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="8287697530462527662">
                        <link role="fieldDeclaration" targetNodeId="5522183980949037006" resolveInfo="myOwnerFocusListener" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="8287697530462527663" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="8287697530462527664">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8287697530462527665">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8287697530462527666">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="8287697530462527667">
                      <link role="fieldDeclaration" targetNodeId="5522183980949036987" resolveInfo="myPrevFocusOwner" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="8287697530462527668" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8287697530462527669">
                    <link role="baseMethodDeclaration" targetNodeId="2.~Component.removeMouseListener(java.awt.event.MouseListener):void" resolveInfo="removeMouseListener" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8287697530462527670">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="8287697530462527671">
                        <link role="fieldDeclaration" targetNodeId="5522183980949037027" resolveInfo="myOwnerMouseListener" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="8287697530462527672" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="8287697530462527673">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8287697530462527674">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8287697530462527675">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="8287697530462527676">
                      <link role="fieldDeclaration" targetNodeId="5522183980949036987" resolveInfo="myPrevFocusOwner" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="8287697530462527677" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="8287697530462527678">
                    <link role="baseMethodDeclaration" targetNodeId="2.~Component.removeKeyListener(java.awt.event.KeyListener):void" resolveInfo="removeKeyListener" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8287697530462527679">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="8287697530462527680">
                        <link role="fieldDeclaration" targetNodeId="1657638272963033126" resolveInfo="myOwnerKeyListener" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="8287697530462527681" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="8287697530462527651">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="8287697530462527654" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8287697530462527648">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="8287697530462527649">
                  <link role="fieldDeclaration" targetNodeId="5522183980949036987" resolveInfo="myPrevFocusOwner" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="8287697530462527650" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1657638272963062299">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.SuperMethodCall" id="1657638272963062300">
              <link role="baseMethodDeclaration" targetNodeId="2.~Window.dispose():void" resolveInfo="dispose" />
            </node>
          </node>
        </node>
        <node role="annotation" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance" id="1657638272963062301">
          <link role="annotation" targetNodeId="4.~Override" resolveInfo="Override" />
        </node>
      </node>
      <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="6773493145900287928">
        <link role="classifier" targetNodeId="2.~Window" resolveInfo="Window" />
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="5522183980949036969" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="5522183980949036970">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="5522183980949036971" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="5522183980949036972" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="5522183980949036973" />
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="6160742249368370030">
      <property name="name" value="myDialog" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="6160742249368370031" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="6160742249368370032">
        <link role="classifier" targetNodeId="5522183980949036976" resolveInfo="ToolTip.MyDialog" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="2913460188527323530">
      <property name="name" value="myHintInformation" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="2913460188527323531" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="2913460188527323533">
        <link role="classifier" targetNodeId="1657638272963062314" resolveInfo="ToolTipData" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1657638272963062314">
    <property name="name" value="ToolTipData" />
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1657638272963062338">
      <property name="name" value="getText" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.StringType" id="1657638272963062342" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1657638272963062340" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1657638272963062341">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1657638272963062343">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963062345">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1657638272963062346">
              <link role="fieldDeclaration" targetNodeId="1657638272963062322" resolveInfo="myText" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1657638272963062347" />
          </node>
        </node>
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1657638272963062322">
      <property name="name" value="myText" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1657638272963062323" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.StringType" id="1657638272963062325" />
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1657638272963062315" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1657638272963062316">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1657638272963062317" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1657638272963062318" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1657638272963062319">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1657638272963062326">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1657638272963062330">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1657638272963062333">
              <link role="variableDeclaration" targetNodeId="1657638272963062320" resolveInfo="text" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963062327">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1657638272963062328">
                <link role="fieldDeclaration" targetNodeId="1657638272963062322" resolveInfo="myText" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1657638272963062329" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1657638272963062320">
        <property name="name" value="text" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.StringType" id="1657638272963062321" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1657638272963439183">
    <property name="name" value="MPSToolTipManager" />
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1657638272963450918">
      <property name="name" value="myComponents" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1657638272963450919" />
      <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.SetType" id="1657638272963450922">
        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1657638272963450924">
          <link role="classifier" targetNodeId="2.~Component" resolveInfo="Component" />
        </node>
      </node>
      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1657638272963450926">
        <node role="creator" type="jetbrains.mps.baseLanguage.collections.structure.HashSetCreator" id="1657638272963450927">
          <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1657638272963450928">
            <link role="classifier" targetNodeId="2.~Component" resolveInfo="Component" />
          </node>
        </node>
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1657638272963450942">
      <property name="name" value="myListener" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1657638272963450943" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1657638272963450947">
        <link role="classifier" targetNodeId="3.~MouseMotionListener" resolveInfo="MouseMotionListener" />
      </node>
      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1657638272963450949">
        <node role="creator" type="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator" id="1657638272963450951">
          <node role="cls" type="jetbrains.mps.baseLanguage.structure.AnonymousClass" id="1657638272963450952">
            <property name="nonStatic" value="true" />
            <link role="classifier" targetNodeId="3.~MouseMotionAdapter" resolveInfo="MouseMotionAdapter" />
            <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1657638272963450953" />
            <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="6543815770065587493">
              <property name="name" value="mouseMoved" />
              <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="6543815770065587494" />
              <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="6543815770065587495" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="6543815770065587496">
                <property name="name" value="p0" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="6543815770065587497">
                  <link role="classifier" targetNodeId="3.~MouseEvent" resolveInfo="MouseEvent" />
                </node>
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="6543815770065587498">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="6543815770065587513">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="6543815770065587514">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="6543815770065587515">
                      <link role="baseMethodDeclaration" targetNodeId="6543815770065587500" resolveInfo="mouseMoved" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="6543815770065587517">
                        <link role="variableDeclaration" targetNodeId="6543815770065587496" resolveInfo="p0" />
                      </node>
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="6543815770065587516">
                      <link role="classConcept" targetNodeId="1657638272963439183" resolveInfo="MPSToolTipManager" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="annotation" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance" id="6543815770065587499">
                <link role="annotation" targetNodeId="4.~Override" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="3100043705483489792">
      <property name="name" value="myToolTip" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="3100043705483489793" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="3100043705483489796">
        <link role="classifier" targetNodeId="5522183980949036968" resolveInfo="ToolTip" />
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1657638272963439215">
      <property name="name" value="getInstance" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1657638272963439219">
        <link role="classifier" targetNodeId="1657638272963439183" resolveInfo="MPSToolTipManager" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1657638272963439217" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1657638272963439218">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1657638272963450899">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963442227">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1657638272963439818">
              <link role="baseMethodDeclaration" targetNodeId="12.~ApplicationManager.getApplication():com.intellij.openapi.application.Application" resolveInfo="getApplication" />
              <link role="classConcept" targetNodeId="12.~ApplicationManager" resolveInfo="ApplicationManager" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1657638272963449902">
              <link role="baseMethodDeclaration" targetNodeId="10.~ComponentManager.getComponent(java.lang.String):com.intellij.openapi.components.BaseComponent" resolveInfo="getComponent" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression" id="1657638272963449903">
                <link role="classifier" targetNodeId="1657638272963439183" resolveInfo="MPSToolTipManager" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1657638272963439184" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1657638272963439185">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1657638272963439186" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1657638272963439187" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1657638272963439188" />
    </node>
    <node role="implementedInterface" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1657638272963439193">
      <link role="classifier" targetNodeId="10.~ApplicationComponent" resolveInfo="ApplicationComponent" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1657638272963439194">
      <property name="name" value="getComponentName" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1657638272963439195" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.StringType" id="1657638272963439208" />
      <node role="annotation" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance" id="1657638272963439197">
        <link role="annotation" targetNodeId="11.~NonNls" resolveInfo="NonNls" />
      </node>
      <node role="annotation" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance" id="1657638272963439198">
        <link role="annotation" targetNodeId="11.~NotNull" resolveInfo="NotNull" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1657638272963439199">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1657638272963439209">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1657638272963439212">
            <property name="value" value="MPSTooltipManager" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1657638272963439200">
      <property name="name" value="disposeComponent" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1657638272963439201" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1657638272963439202" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1657638272963439203" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1657638272963439204">
      <property name="name" value="initComponent" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1657638272963439205" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1657638272963439206" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1657638272963439207" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1657638272963450913">
      <property name="name" value="registerComponent" />
      <property name="isFinal" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1657638272963450907" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1657638272963450911">
        <property name="name" value="component" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1657638272963450912">
          <link role="classifier" targetNodeId="2.~Component" resolveInfo="Component" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1657638272963450909">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1657638272963450929">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963450933">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1657638272963450930">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1657638272963450931">
                <link role="fieldDeclaration" targetNodeId="1657638272963450918" resolveInfo="myComponents" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1657638272963450932" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.AddSetElementOperation" id="1657638272963450937">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1657638272963450940">
                <link role="variableDeclaration" targetNodeId="1657638272963450911" resolveInfo="component" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="6543815770065574162">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="6543815770065574164">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="6543815770065574163">
              <link role="variableDeclaration" targetNodeId="1657638272963450911" resolveInfo="component" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="6543815770065583663">
              <link role="baseMethodDeclaration" targetNodeId="2.~Component.addMouseMotionListener(java.awt.event.MouseMotionListener):void" resolveInfo="addMouseMotionListener" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="6543815770065583664">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="6543815770065583665">
                  <link role="fieldDeclaration" targetNodeId="1657638272963450942" resolveInfo="myListener" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="6543815770065583666" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1657638272963450908" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="6543815770065587500">
      <property name="name" value="mouseMoved" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="6543815770065587501" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="6543815770065587505" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="6543815770065587503">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="6543815770065605909">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="6543815770065605910">
            <property name="name" value="component" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="6543815770065605911">
              <link role="classifier" targetNodeId="1.~JComponent" resolveInfo="JComponent" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="6543815770065605912">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="6543815770065605913">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="6543815770065605914">
                  <link role="variableDeclaration" targetNodeId="6543815770065587506" resolveInfo="event" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="6543815770065605915">
                  <link role="baseMethodDeclaration" targetNodeId="3.~ComponentEvent.getComponent():java.awt.Component" resolveInfo="getComponent" />
                </node>
              </node>
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="6543815770065605916">
                <link role="classifier" targetNodeId="1.~JComponent" resolveInfo="JComponent" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="78827631726060868">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="78827631726060869">
            <property name="name" value="point" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="78827631726060870">
              <link role="classifier" targetNodeId="2.~Point" resolveInfo="Point" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="5762050414977292871">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="5762050414977292870">
                <link role="variableDeclaration" targetNodeId="6543815770065605910" resolveInfo="component" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="5762050414977295786">
                <link role="baseMethodDeclaration" targetNodeId="1.~JComponent.getToolTipLocation(java.awt.event.MouseEvent):java.awt.Point" resolveInfo="getToolTipLocation" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="5762050414977295787">
                  <link role="variableDeclaration" targetNodeId="6543815770065587506" resolveInfo="event" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="5931142688898142071">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="5931142688898142072">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="5931142688898142084">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="5931142688898142086">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="5931142688898142090">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="5931142688898142089">
                    <link role="variableDeclaration" targetNodeId="6543815770065587506" resolveInfo="event" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="5931142688898142094">
                    <link role="baseMethodDeclaration" targetNodeId="3.~MouseEvent.getPoint():java.awt.Point" resolveInfo="getPoint" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="5931142688898142085">
                  <link role="variableDeclaration" targetNodeId="78827631726060869" resolveInfo="point" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="5931142688898142080">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="5931142688898142083" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="5931142688898142075">
              <link role="variableDeclaration" targetNodeId="78827631726060869" resolveInfo="point" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="6543815770065588426">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="6543815770065588427">
            <property name="name" value="text" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.StringType" id="3100043705483489836" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="6543815770065588429">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="6543815770065605917">
                <link role="variableDeclaration" targetNodeId="6543815770065605910" resolveInfo="component" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="6543815770065588436">
                <link role="baseMethodDeclaration" targetNodeId="1.~JComponent.getToolTipText(java.awt.event.MouseEvent):java.lang.String" resolveInfo="getToolTipText" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="6543815770065588437">
                  <link role="variableDeclaration" targetNodeId="6543815770065587506" resolveInfo="event" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="5943684961278746292">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="5943684961278746293">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="5943684961278746294" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="5943684961278747633">
              <link role="variableDeclaration" targetNodeId="6543815770065588427" resolveInfo="text" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="5943684961278746296">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="5943684961278747682">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="5943684961278747683">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="5943684961278747684">
                  <link role="baseMethodDeclaration" targetNodeId="78827631726060875" resolveInfo="showToolTip" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="5943684961278747686">
                    <link role="variableDeclaration" targetNodeId="6543815770065588427" resolveInfo="text" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="5943684961278747688">
                    <link role="variableDeclaration" targetNodeId="6543815770065605910" resolveInfo="component" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="5943684961278747690">
                    <link role="variableDeclaration" targetNodeId="78827631726060869" resolveInfo="point" />
                  </node>
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="5943684961278747685" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="5943684961278746336">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="5943684961278746337">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="5943684961278747714">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="5943684961278747715">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="5943684961278747716" />
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="5943684961278747717">
                    <link role="baseMethodDeclaration" targetNodeId="5943684961278747691" resolveInfo="hideToolTip" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="6543815770065587506">
        <property name="name" value="event" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="6543815770065587507">
          <link role="classifier" targetNodeId="3.~MouseEvent" resolveInfo="MouseEvent" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="6462432499626686448">
      <property name="name" value="getContainingFrame" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="6462432499626687728">
        <link role="classifier" targetNodeId="2.~Frame" resolveInfo="Frame" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="6462432499626686450" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="6462432499626686451">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.WhileStatement" id="6462432499626687731">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="6462432499626688549">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="6462432499626688552" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="6462432499626687735">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="6462432499626687734">
                <link role="variableDeclaration" targetNodeId="6462432499626687729" resolveInfo="component" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="6462432499626688548">
                <link role="baseMethodDeclaration" targetNodeId="2.~Component.getParent():java.awt.Container" resolveInfo="getParent" />
              </node>
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="6462432499626687733">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="6462432499626688553">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="6462432499626688555">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="6462432499626688559">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="6462432499626688558">
                    <link role="variableDeclaration" targetNodeId="6462432499626687729" resolveInfo="component" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="6462432499626689787">
                    <link role="baseMethodDeclaration" targetNodeId="2.~Component.getParent():java.awt.Container" resolveInfo="getParent" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="6462432499626688554">
                  <link role="variableDeclaration" targetNodeId="6462432499626687729" resolveInfo="component" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="6462432499626689789">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="6462432499626689791">
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="6462432499626689792">
              <link role="classifier" targetNodeId="2.~Frame" resolveInfo="Frame" />
            </node>
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="6462432499626689794">
              <link role="variableDeclaration" targetNodeId="6462432499626687729" resolveInfo="component" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="6462432499626687729">
        <property name="name" value="component" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="6462432499626687730">
          <link role="classifier" targetNodeId="2.~Component" resolveInfo="Component" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="78827631726060875">
      <property name="name" value="showToolTip" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="78827631726060876" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="78827631726060877" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="78827631726060878">
        <property name="name" value="text" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.StringType" id="78827631726060879" />
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="78827631726060880">
        <property name="name" value="component" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="78827631726060881">
          <link role="classifier" targetNodeId="1.~JComponent" resolveInfo="JComponent" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="78827631726060882">
        <property name="name" value="point" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="78827631726060883">
          <link role="classifier" targetNodeId="2.~Point" resolveInfo="Point" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="78827631726060884">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="5943684961278747639">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="5943684961278747640">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="2913460188527316690">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="2913460188527316691">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="2913460188527323559" />
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NPEEqualsExpression" id="2913460188527323555">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="2913460188527323558">
                  <link role="variableDeclaration" targetNodeId="78827631726060878" resolveInfo="text" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="2913460188527316697">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="2913460188527316694">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="2913460188527316695">
                      <link role="fieldDeclaration" targetNodeId="3100043705483489792" resolveInfo="myToolTip" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="2913460188527316696" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="2913460188527323554">
                    <link role="baseMethodDeclaration" targetNodeId="2913460188527323522" resolveInfo="getText" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="7182957271087795488">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="7182957271087795489">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="7182957271087795490">
                  <link role="baseMethodDeclaration" targetNodeId="5943684961278747691" resolveInfo="hideToolTip" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="7182957271087795491" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="7182957271087795475">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="7182957271087795476">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="7182957271087795477">
                <link role="fieldDeclaration" targetNodeId="3100043705483489792" resolveInfo="myToolTip" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="7182957271087795478" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="7182957271087795479" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="7182957271087794168">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="7182957271087794169">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="7182957271087794170">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="7182957271087794171">
                <link role="fieldDeclaration" targetNodeId="3100043705483489792" resolveInfo="myToolTip" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="7182957271087794172" />
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="7182957271087794173">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="7182957271087794174">
                <link role="baseMethodDeclaration" targetNodeId="5522183980949036970" resolveInfo="ToolTip" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="7182957271087794175">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="7182957271087794176">
            <property name="name" value="frame" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="7182957271087794177">
              <link role="classifier" targetNodeId="2.~Frame" resolveInfo="Frame" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="7182957271087794178">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="7182957271087794179">
                <link role="baseMethodDeclaration" targetNodeId="6462432499626686448" resolveInfo="getContainingFrame" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="7182957271087794180">
                  <link role="variableDeclaration" targetNodeId="78827631726060880" resolveInfo="component" />
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="7182957271087794181" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="7182957271087794182">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="7182957271087794183">
            <property name="name" value="widowPoint" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="7182957271087794184">
              <link role="classifier" targetNodeId="2.~Point" resolveInfo="Point" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="7182957271087794185">
              <link role="baseMethodDeclaration" targetNodeId="1.~SwingUtilities.convertPoint(java.awt.Component,java.awt.Point,java.awt.Component):java.awt.Point" resolveInfo="convertPoint" />
              <link role="classConcept" targetNodeId="1.~SwingUtilities" resolveInfo="SwingUtilities" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="7182957271087794186">
                <link role="variableDeclaration" targetNodeId="78827631726060880" resolveInfo="component" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="7182957271087794187">
                <link role="variableDeclaration" targetNodeId="78827631726060882" resolveInfo="point" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="7182957271087794188">
                <link role="variableDeclaration" targetNodeId="7182957271087794176" resolveInfo="frame" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="7182957271087794189">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="7182957271087794190">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="7182957271087794191">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="7182957271087794192">
                <link role="fieldDeclaration" targetNodeId="3100043705483489792" resolveInfo="myToolTip" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="7182957271087794193" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="7182957271087794194">
              <link role="baseMethodDeclaration" targetNodeId="1657638272963421745" resolveInfo="show" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="7182957271087794195">
                <link role="variableDeclaration" targetNodeId="7182957271087794176" resolveInfo="frame" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="7182957271087794196">
                <link role="variableDeclaration" targetNodeId="7182957271087794183" resolveInfo="widowPoint" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="7182957271087794197">
                <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="7182957271087794198">
                  <link role="baseMethodDeclaration" targetNodeId="1657638272963062316" resolveInfo="ToolTipData" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="7182957271087794199">
                    <link role="variableDeclaration" targetNodeId="78827631726060878" resolveInfo="text" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="5943684961278747691">
      <property name="name" value="hideToolTip" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="5943684961278747692" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="5943684961278747693" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="5943684961278747694">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="5943684961278747695">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="5943684961278747696">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="5943684961278747697" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="5943684961278747698">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="5943684961278747699">
                <link role="fieldDeclaration" targetNodeId="3100043705483489792" resolveInfo="myToolTip" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="5943684961278747700" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="5943684961278747701">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="5943684961278747702">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="5943684961278747703">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="5943684961278747704">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="5943684961278747705">
                    <link role="fieldDeclaration" targetNodeId="3100043705483489792" resolveInfo="myToolTip" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="5943684961278747706" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="5943684961278747707">
                  <link role="baseMethodDeclaration" targetNodeId="6160742249368370026" resolveInfo="hide" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="5943684961278747708">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="5943684961278747709">
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="5943684961278747710">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="5943684961278747711">
                    <link role="fieldDeclaration" targetNodeId="3100043705483489792" resolveInfo="myToolTip" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="5943684961278747712" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="5943684961278747713" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>


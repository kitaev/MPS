<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:40062e7d-2d40-4964-a55f-255e1fee23d7(jetbrains.mps.debugger.java.remote)">
  <persistence version="7" />
  <language namespace="22e72e4c-0f69-46ce-8403-6750153aa615(jetbrains.mps.runConfigurations)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="fbc14279-5e2a-4c87-a5d1-5f7061e6c456(jetbrains.mps.debug.apiLang)" />
  <import index="h3aa" modelUID="f:java_stub#jetbrains.mps.debug.runtime.settings(jetbrains.mps.debug.runtime.settings@java_stub)" version="-1" />
  <import index="3ri6" modelUID="f:java_stub#jetbrains.mps.debugger.java.run(jetbrains.mps.debugger.java.run@java_stub)" version="-1" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="uhxm" modelUID="r:f3383ae6-205a-4e7c-8dd9-c29966e29e49(jetbrains.mps.runConfigurations.structure)" version="-1" implicit="yes" />
  <import index="tpee" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" implicit="yes" />
  <import index="44uo" modelUID="r:40062e7d-2d40-4964-a55f-255e1fee23d7(jetbrains.mps.debugger.java.remote)" version="-1" implicit="yes" />
  <import index="mwyq" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" implicit="yes" />
  <import index="s42p" modelUID="f:java_stub#java.text(java.text@java_stub)" version="-1" implicit="yes" />
  <import index="i09a" modelUID="f:java_stub#javax.swing(javax.swing@java_stub)" version="-1" implicit="yes" />
  <import index="5p1m" modelUID="f:java_stub#java.awt(java.awt@java_stub)" version="-1" implicit="yes" />
  <import index="1ah9" modelUID="f:java_stub#javax.swing.text(javax.swing.text@java_stub)" version="-1" implicit="yes" />
  <import index="qyfj" modelUID="f:java_stub#java.beans(java.beans@java_stub)" version="-1" implicit="yes" />
  <import index="p8sl" modelUID="f:java_stub#jetbrains.mps.baseLanguage.util.plugin.run(jetbrains.mps.baseLanguage.util.plugin.run@java_stub)" version="-1" implicit="yes" />
  <import index="4bsm" modelUID="f:java_stub#java.awt.event(java.awt.event@java_stub)" version="-1" implicit="yes" />
  <import index="qvoq" modelUID="f:java_stub#org.jetbrains.annotations(org.jetbrains.annotations@java_stub)" version="-1" implicit="yes" />
  <import index="86gq" modelUID="r:f516737e-c915-4042-896e-de34190042b2(jetbrains.mps.debug.apiLang.structure)" version="0" implicit="yes" />
  <roots>
    <node type="uhxm.RunConfigurationKind" typeId="uhxm.2401501559171345994" id="7806358006983489356">
      <property name="name" nameId="tpck.1169194664001" value="RemoteNew" />
    </node>
    <node type="uhxm.RunConfiguration" typeId="uhxm.2401501559171345993" id="7806358006983511602">
      <property name="name" nameId="tpck.1169194664001" value="RemoteNew" />
      <link role="configurationType" roleId="uhxm.2401501559171353314" targetNodeId="7806358006983489356" resolveInfo="Remote" />
    </node>
    <node type="tpee.ClassConcept" typeId="tpee.1068390468198" id="7806358006983511789">
      <property name="name" nameId="tpck.1169194664001" value="RemoteSettingsEditor" />
    </node>
    <node type="uhxm.RunConfigurationExecutor" typeId="uhxm.2401501559171392633" id="7806358006983590272">
      <property name="canRun" nameId="uhxm.5925077313451868299" value="false" />
      <link role="runConfiguration" roleId="uhxm.1048802521465114237" targetNodeId="7806358006983511602" resolveInfo="RemoteNew" />
    </node>
  </roots>
  <root id="7806358006983489356">
    <node role="iconPath" roleId="uhxm.4806795137173723123" type="uhxm.IconPath" typeId="uhxm.4806795137173575894" id="7806358006983489357">
      <property name="path" nameId="uhxm.4806795137173575895" value="${mps_home}/plugins/debugger-java/resources/jetbrains/mps/debugger/java/remote/remote_run_configuration.png" />
    </node>
  </root>
  <root id="7806358006983511602">
    <node role="editor" roleId="uhxm.3754890006475816675" type="uhxm.SettingsEditor" typeId="uhxm.3754890006475816671" id="7806358006983511603">
      <node role="propertyDeclaration" roleId="uhxm.1529002684853821488" type="uhxm.EditorPropertyDeclaration" typeId="uhxm.4777576391478268201" id="7806358006983555636">
        <property name="name" nameId="tpck.1169194664001" value="myEditor" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7806358006983555638">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="7806358006983511789" resolveInfo="RemoteSettingsEditor" />
        </node>
      </node>
      <node role="createEditor" roleId="uhxm.4777576391477979221" type="uhxm.CreateEditor_Function" typeId="uhxm.4777576391477887149" id="7806358006983511604">
        <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983511605">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983555639">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7806358006983555641">
              <node role="rValue" roleId="tpee.1068498886297" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7806358006983555644">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7806358006983577339">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7806358006983511896" resolveInfo="RemoteSettingsEditor" />
                </node>
              </node>
              <node role="lValue" roleId="tpee.1068498886295" type="uhxm.EditorPropertyReference" typeId="uhxm.4777576391478268202" id="7806358006983555640">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983555636" resolveInfo="myEditor" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="resetFrom" roleId="uhxm.4777576391477979229" type="uhxm.ResetFrom_Function" typeId="uhxm.4777576391477979226" id="7806358006983577344">
        <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983577345">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983577346">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983577348">
              <node role="operand" roleId="tpee.1197027771414" type="uhxm.EditorPropertyReference" typeId="uhxm.4777576391478268202" id="7806358006983577347">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983555636" resolveInfo="myEditor" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7806358006983578537">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7806358006983512055" resolveInfo="reset" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983586557">
                  <node role="operand" roleId="tpee.1197027771414" type="uhxm.Configuration_Parameter" typeId="uhxm.4777576391478077373" id="7806358006983586556" />
                  <node role="operation" roleId="tpee.1197027833540" type="uhxm.PersistentPropertyReferenceOperation" typeId="uhxm.4928971978190606409" id="7806358006983586561">
                    <link role="variableDeclaration" roleId="uhxm.4928971978190606410" targetNodeId="7806358006983577340" resolveInfo="mySettings" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="applyTo" roleId="uhxm.4777576391477979222" type="uhxm.ApplyTo_Function" typeId="uhxm.4777576391477979223" id="7806358006983586562">
        <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983586563">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983586564">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983586566">
              <node role="operand" roleId="tpee.1197027771414" type="uhxm.EditorPropertyReference" typeId="uhxm.4777576391478268202" id="7806358006983586565">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983555636" resolveInfo="myEditor" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7806358006983590263">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7806358006983512079" resolveInfo="apply" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983590265">
                  <node role="operand" roleId="tpee.1197027771414" type="uhxm.Configuration_Parameter" typeId="uhxm.4777576391478077373" id="7806358006983590264" />
                  <node role="operation" roleId="tpee.1197027833540" type="uhxm.PersistentPropertyReferenceOperation" typeId="uhxm.4928971978190606409" id="7806358006983590269">
                    <link role="variableDeclaration" roleId="uhxm.4928971978190606410" targetNodeId="7806358006983577340" resolveInfo="mySettings" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="iconPath" roleId="uhxm.4806795137173723122" type="uhxm.IconPath" typeId="uhxm.4806795137173575894" id="7806358006983511606" />
    <node role="persistentProperty" roleId="uhxm.77193491200308914" type="uhxm.PersistentPropertyDeclaration" typeId="uhxm.1048802521465149470" id="7806358006983577340">
      <property name="name" nameId="tpck.1169194664001" value="mySettings" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7806358006983577342">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="h3aa.~RemoteConnectionSettings" resolveInfo="RemoteConnectionSettings" />
      </node>
    </node>
  </root>
  <root id="7806358006983511789">
    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7806358006983511790" />
    <node role="superclass" roleId="tpee.1165602531693" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7806358006983511791">
      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i09a.~JPanel" />
    </node>
    <node role="staticInnerClassifiers" roleId="tpee.1178616825527" type="tpee.ClassConcept" typeId="tpee.1068390468198" id="7806358006983511792">
      <property name="name" nameId="tpck.1169194664001" value="MyKeyAdapter" />
      <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7806358006983511793" />
      <node role="superclass" roleId="tpee.1165602531693" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7806358006983511794">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="4bsm.~KeyAdapter" />
      </node>
      <node role="implementedInterface" roleId="tpee.1095933932569" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7806358006983511795">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="qyfj.~PropertyChangeListener" />
      </node>
      <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="7806358006983511796">
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7806358006983511797" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7806358006983511798" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983511799" />
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7806358006983511800">
        <property name="name" nameId="tpck.1169194664001" value="keyReleased" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7806358006983511801" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7806358006983511802" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7806358006983511803">
          <property name="name" nameId="tpck.1169194664001" value="e" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7806358006983511804">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="4bsm.~KeyEvent" />
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983511805">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983511806">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7806358006983511807">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7806358006983512001" resolveInfo="updateFieldsFromUi" />
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983511808">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983511809">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983511810">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511881" resolveInfo="myPortTextField" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7806358006983511811">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i09a.~JComponent%dsetForeground(java%dawt%dColor)%cvoid" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.TernaryOperatorExpression" typeId="tpee.1163668896201" id="7806358006983511812">
                  <node role="condition" roleId="tpee.1163668914799" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983511813">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983511814">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511881" resolveInfo="myPortTextField" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7806358006983511815">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i09a.~JFormattedTextField%disEditValid()%cboolean" />
                    </node>
                  </node>
                  <node role="ifTrue" roleId="tpee.1163668922816" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7806358006983511816">
                    <link role="classifier" roleId="tpee.1144433057691" targetNodeId="5p1m.~Color" />
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5p1m.~Color%dBLACK" />
                  </node>
                  <node role="ifFalse" roleId="tpee.1163668934364" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7806358006983511817">
                    <link role="classifier" roleId="tpee.1144433057691" targetNodeId="5p1m.~Color" />
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5p1m.~Color%dRED" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7806358006983511818">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="mwyq.~Override" />
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7806358006983511819">
        <property name="name" nameId="tpck.1169194664001" value="propertyChange" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7806358006983511820" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7806358006983511821" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7806358006983511822">
          <property name="name" nameId="tpck.1169194664001" value="evt" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7806358006983511823">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="qyfj.~PropertyChangeEvent" />
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983511824">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983511825">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7806358006983511826">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7806358006983512001" resolveInfo="updateFieldsFromUi" />
            </node>
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7806358006983511827">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="mwyq.~Override" />
        </node>
      </node>
    </node>
    <node role="staticInnerClassifiers" roleId="tpee.1178616825527" type="tpee.ClassConcept" typeId="tpee.1068390468198" id="7806358006983511828">
      <property name="name" nameId="tpck.1169194664001" value="MyDefaultFormatter" />
      <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7806358006983511829" />
      <node role="superclass" roleId="tpee.1165602531693" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7806358006983511830">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="1ah9.~DefaultFormatter" />
      </node>
      <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="7806358006983511831">
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7806358006983511832" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7806358006983511833" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983511834" />
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7806358006983511835">
        <property name="name" nameId="tpck.1169194664001" value="stringToValue" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7806358006983511836" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7806358006983511837">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="mwyq.~Object" />
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7806358006983511838">
          <property name="name" nameId="tpck.1169194664001" value="text" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="7806358006983555632" />
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983511840">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.TryCatchStatement" typeId="tpee.1164879751025" id="7806358006983511841">
            <node role="catchClause" roleId="tpee.1164903496223" type="tpee.CatchClause" typeId="tpee.1164903280175" id="7806358006983511842">
              <node role="catchBody" roleId="tpee.1164903359218" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983511843">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ThrowStatement" typeId="tpee.1164991038168" id="7806358006983511844">
                  <node role="throwable" roleId="tpee.1164991057263" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7806358006983511845">
                    <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7806358006983511846">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="s42p.~ParseException%d&lt;init&gt;(java%dlang%dString,int)" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7806358006983511847">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511838" resolveInfo="text" />
                      </node>
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="7806358006983511848">
                        <property name="value" nameId="tpee.1068580320021" value="0" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="throwable" roleId="tpee.1164903359217" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7806358006983511849">
                <property name="name" nameId="tpck.1169194664001" value="e" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7806358006983511850">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="mwyq.~NumberFormatException" />
                </node>
              </node>
            </node>
            <node role="body" roleId="tpee.1164879758292" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983511851">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7806358006983511852">
                <node role="expression" roleId="tpee.1068581517676" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7806358006983511853">
                  <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="mwyq.~Integer" />
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="mwyq.~Integer%dparseInt(java%dlang%dString)%cint" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7806358006983511854">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511838" resolveInfo="text" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7806358006983511855">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="mwyq.~Override" />
        </node>
        <node role="throwsItem" roleId="tpee.1164879685961" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7806358006983511856">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="s42p.~ParseException" />
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7806358006983511857">
        <property name="name" nameId="tpck.1169194664001" value="valueToString" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7806358006983511858" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.StringType" typeId="tpee.1225271177708" id="7806358006983555631" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7806358006983511860">
          <property name="name" nameId="tpck.1169194664001" value="value" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7806358006983511861">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="mwyq.~Object" />
          </node>
          <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7806358006983511862">
            <link role="annotation" roleId="tpee.1188208074048" targetNodeId="qvoq.~Nullable" />
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983511863">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7806358006983511864">
            <node role="condition" roleId="tpee.1068580123160" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="7806358006983511865">
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7806358006983511866">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511860" resolveInfo="value" />
              </node>
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7806358006983511867" />
            </node>
            <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983511868">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7806358006983511869">
                <node role="expression" roleId="tpee.1068581517676" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7806358006983511870" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7806358006983511871">
            <node role="expression" roleId="tpee.1068581517676" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7806358006983511872">
              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="mwyq.~Integer" />
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="mwyq.~Integer%dtoString(int)%cjava%dlang%dString" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.CastExpression" typeId="tpee.1070534934090" id="7806358006983511873">
                <node role="expression" roleId="tpee.1070534934092" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7806358006983511874">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511860" resolveInfo="value" />
                </node>
                <node role="type" roleId="tpee.1070534934091" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7806358006983511875">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="mwyq.~Integer" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7806358006983511876">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="mwyq.~Override" />
        </node>
        <node role="throwsItem" roleId="tpee.1164879685961" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7806358006983511877">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="s42p.~ParseException" />
        </node>
      </node>
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7806358006983511878">
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <property name="name" nameId="tpck.1169194664001" value="myHostTextField" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7806358006983511879">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i09a.~JTextField" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7806358006983511880" />
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7806358006983511881">
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <property name="name" nameId="tpck.1169194664001" value="myPortTextField" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7806358006983511882">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i09a.~JFormattedTextField" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7806358006983511883" />
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7806358006983511884">
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <property name="name" nameId="tpck.1169194664001" value="myCommandLineTextField" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7806358006983511885">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i09a.~JTextField" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7806358006983511886" />
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7806358006983511887">
      <property name="name" nameId="tpck.1169194664001" value="myPort" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.IntegerType" typeId="tpee.1070534370425" id="7806358006983511888" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7806358006983511889" />
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7806358006983511890">
      <property name="name" nameId="tpck.1169194664001" value="myHost" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="7806358006983555635" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7806358006983511892" />
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7806358006983511893">
      <property name="name" nameId="tpck.1169194664001" value="myCommandLine" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="7806358006983555634" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7806358006983511895" />
    </node>
    <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="7806358006983511896">
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7806358006983511897" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7806358006983511898" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983511899">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.SuperConstructorInvocation" typeId="tpee.1070475587102" id="7806358006983511900">
          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i09a.~JPanel%d&lt;init&gt;(java%dawt%dLayoutManager)" />
          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7806358006983511901">
            <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7806358006983511902">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="5p1m.~GridBagLayout%d&lt;init&gt;()" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7806358006983511903">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7806358006983511904">
            <property name="name" nameId="tpck.1169194664001" value="listener" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7806358006983511905">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="7806358006983511792" resolveInfo="RemoteSettingsEditor.MyKeyAdapter" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7806358006983511906">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7806358006983511907">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7806358006983511796" resolveInfo="RemoteSettingsEditor.MyKeyAdapter" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983511908">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7806358006983511909">
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983511910">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511878" resolveInfo="myHostTextField" />
            </node>
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7806358006983511911">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7806358006983511912">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i09a.~JTextField%d&lt;init&gt;()" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983511913">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983511914">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983511915">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511878" resolveInfo="myHostTextField" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7806358006983511916">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="5p1m.~Component%daddKeyListener(java%dawt%devent%dKeyListener)%cvoid" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7806358006983511917">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511904" resolveInfo="listener" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7806358006983511918">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7806358006983511919">
            <property name="name" nameId="tpck.1169194664001" value="formatter" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7806358006983511920">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="1ah9.~DefaultFormatter" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7806358006983511921">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7806358006983511922">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7806358006983511831" resolveInfo="RemoteSettingsEditor.MyDefaultFormatter" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983511923">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983511924">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7806358006983511925">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511919" resolveInfo="formatter" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7806358006983511926">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="1ah9.~DefaultFormatter%dsetAllowsInvalid(boolean)%cvoid" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7806358006983511927">
                <property name="value" nameId="tpee.1068580123138" value="true" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983511928">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983511929">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7806358006983511930">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511919" resolveInfo="formatter" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7806358006983511931">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="1ah9.~DefaultFormatter%dsetCommitsOnValidEdit(boolean)%cvoid" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7806358006983511932">
                <property name="value" nameId="tpee.1068580123138" value="true" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983511933">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983511934">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7806358006983511935">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511919" resolveInfo="formatter" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7806358006983511936">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="1ah9.~DefaultFormatter%dsetOverwriteMode(boolean)%cvoid" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7806358006983511937" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983511938">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7806358006983511939">
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983511940">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511881" resolveInfo="myPortTextField" />
            </node>
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7806358006983511941">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7806358006983511942">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i09a.~JFormattedTextField%d&lt;init&gt;(javax%dswing%dJFormattedTextField$AbstractFormatter)" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7806358006983511943">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511919" resolveInfo="formatter" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983511944">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983511945">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983511946">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511881" resolveInfo="myPortTextField" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7806358006983511947">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="5p1m.~Container%daddPropertyChangeListener(java%dlang%dString,java%dbeans%dPropertyChangeListener)%cvoid" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7806358006983511948">
                <property name="value" nameId="tpee.1070475926801" value="value" />
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7806358006983511949">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511904" resolveInfo="listener" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983511950">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983511951">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983511952">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511881" resolveInfo="myPortTextField" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7806358006983511953">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="5p1m.~Component%daddKeyListener(java%dawt%devent%dKeyListener)%cvoid" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7806358006983511954">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511904" resolveInfo="listener" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983511955">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7806358006983511956">
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983511957">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511884" resolveInfo="myCommandLineTextField" />
            </node>
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7806358006983511958">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7806358006983511959">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i09a.~JTextField%d&lt;init&gt;()" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983511960">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983511961">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983511962">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511884" resolveInfo="myCommandLineTextField" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7806358006983511963">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="1ah9.~JTextComponent%dsetEditable(boolean)%cvoid" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7806358006983511964" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983511965">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7806358006983511966">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="5p1m.~Container%dadd(java%dawt%dComponent,java%dlang%dObject)%cvoid" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7806358006983511967">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7806358006983511968">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i09a.~JLabel%d&lt;init&gt;(java%dlang%dString)" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7806358006983511969">
                  <property name="value" nameId="tpee.1070475926801" value="Host:" />
                </node>
              </node>
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7806358006983511970">
              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="p8sl.~LayoutUtil" />
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="p8sl.~LayoutUtil%dcreateLabelConstraints(int)%cjava%dawt%dGridBagConstraints" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="7806358006983511971">
                <property name="value" nameId="tpee.1068580320021" value="0" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983511972">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7806358006983511973">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="5p1m.~Container%dadd(java%dawt%dComponent,java%dlang%dObject)%cvoid" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983511974">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511878" resolveInfo="myHostTextField" />
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7806358006983511975">
              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="p8sl.~LayoutUtil" />
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="p8sl.~LayoutUtil%dcreateFieldConstraints(int)%cjava%dawt%dGridBagConstraints" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="7806358006983511976">
                <property name="value" nameId="tpee.1068580320021" value="1" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983511977">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7806358006983511978">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="5p1m.~Container%dadd(java%dawt%dComponent,java%dlang%dObject)%cvoid" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7806358006983511979">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7806358006983511980">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i09a.~JLabel%d&lt;init&gt;(java%dlang%dString)" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7806358006983511981">
                  <property name="value" nameId="tpee.1070475926801" value="Port:" />
                </node>
              </node>
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7806358006983511982">
              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="p8sl.~LayoutUtil" />
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="p8sl.~LayoutUtil%dcreateLabelConstraints(int)%cjava%dawt%dGridBagConstraints" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="7806358006983511983">
                <property name="value" nameId="tpee.1068580320021" value="2" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983511984">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7806358006983511985">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="5p1m.~Container%dadd(java%dawt%dComponent,java%dlang%dObject)%cvoid" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983511986">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511881" resolveInfo="myPortTextField" />
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7806358006983511987">
              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="p8sl.~LayoutUtil" />
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="p8sl.~LayoutUtil%dcreateFieldConstraints(int)%cjava%dawt%dGridBagConstraints" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="7806358006983511988">
                <property name="value" nameId="tpee.1068580320021" value="3" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983511989">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7806358006983511990">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="5p1m.~Container%dadd(java%dawt%dComponent,java%dlang%dObject)%cvoid" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7806358006983511991">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7806358006983511992">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i09a.~JLabel%d&lt;init&gt;(java%dlang%dString)" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7806358006983511993">
                  <property name="value" nameId="tpee.1070475926801" value="Remote JVM Command Line Arguments:" />
                </node>
              </node>
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7806358006983511994">
              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="p8sl.~LayoutUtil" />
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="p8sl.~LayoutUtil%dcreateLabelConstraints(int)%cjava%dawt%dGridBagConstraints" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="7806358006983511995">
                <property name="value" nameId="tpee.1068580320021" value="4" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983511996">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7806358006983511997">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="5p1m.~Container%dadd(java%dawt%dComponent,java%dlang%dObject)%cvoid" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983511998">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511884" resolveInfo="myCommandLineTextField" />
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7806358006983511999">
              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="p8sl.~LayoutUtil" />
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="p8sl.~LayoutUtil%dcreateFieldConstraints(int)%cjava%dawt%dGridBagConstraints" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="7806358006983512000">
                <property name="value" nameId="tpee.1068580320021" value="5" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7806358006983512001">
      <property name="name" nameId="tpck.1169194664001" value="updateFieldsFromUi" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7806358006983512002" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7806358006983512003" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983512004">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983512005">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7806358006983512006">
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983512007">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511890" resolveInfo="myHost" />
            </node>
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983512008">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983512009">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511878" resolveInfo="myHostTextField" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7806358006983512010">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="1ah9.~JTextComponent%dgetText()%cjava%dlang%dString" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983512011">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7806358006983512012">
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983512013">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511887" resolveInfo="myPort" />
            </node>
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.CastExpression" typeId="tpee.1070534934090" id="7806358006983512014">
              <node role="expression" roleId="tpee.1070534934092" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983512015">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983512016">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511881" resolveInfo="myPortTextField" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7806358006983512017">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i09a.~JFormattedTextField%dgetValue()%cjava%dlang%dObject" />
                </node>
              </node>
              <node role="type" roleId="tpee.1070534934091" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7806358006983512018">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="mwyq.~Integer" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983512019">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7806358006983512020">
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983512021">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511893" resolveInfo="myCommandLine" />
            </node>
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7806358006983512022">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7806358006983512047" resolveInfo="formClientCommandLine" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983512023">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983512024">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983512025">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511884" resolveInfo="myCommandLineTextField" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7806358006983512026">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="1ah9.~JTextComponent%dsetText(java%dlang%dString)%cvoid" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983512027">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511893" resolveInfo="myCommandLine" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7806358006983512028">
      <property name="name" nameId="tpck.1169194664001" value="updateUiFromFields" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7806358006983512029" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7806358006983512030" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983512031">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983512032">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983512033">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983512034">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511878" resolveInfo="myHostTextField" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7806358006983512035">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="1ah9.~JTextComponent%dsetText(java%dlang%dString)%cvoid" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983512036">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511890" resolveInfo="myHost" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983512037">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983512038">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983512039">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511881" resolveInfo="myPortTextField" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7806358006983512040">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i09a.~JFormattedTextField%dsetValue(java%dlang%dObject)%cvoid" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983512041">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511887" resolveInfo="myPort" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983512042">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983512043">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983512044">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511884" resolveInfo="myCommandLineTextField" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7806358006983512045">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="1ah9.~JTextComponent%dsetText(java%dlang%dString)%cvoid" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983512046">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511893" resolveInfo="myCommandLine" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7806358006983512047">
      <property name="name" nameId="tpck.1169194664001" value="formClientCommandLine" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7806358006983512048" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.StringType" typeId="tpee.1225271177708" id="7806358006983555633" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983512050">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7806358006983512051">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7806358006983512052">
            <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="h3aa.~RemoteConnectionSettings" />
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="h3aa.~RemoteConnectionSettings%dgetClientCommandLine(boolean,int)%cjava%dlang%dString" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7806358006983512053">
              <property name="value" nameId="tpee.1068580123138" value="true" />
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983512054">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511887" resolveInfo="myPort" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7806358006983512055">
      <property name="name" nameId="tpck.1169194664001" value="reset" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7806358006983512056" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7806358006983512057" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7806358006983512058">
        <property name="name" nameId="tpck.1169194664001" value="settings" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7806358006983512059">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="h3aa.~DebugConnectionSettings" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983512060">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983512061">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7806358006983512062">
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983512063">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511890" resolveInfo="myHost" />
            </node>
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983512064">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7806358006983512065">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983512058" resolveInfo="settings" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7806358006983512066">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="h3aa.~DebugConnectionSettings%dgetHostName()%cjava%dlang%dString" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983512067">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7806358006983512068">
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983512069">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511887" resolveInfo="myPort" />
            </node>
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983512070">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7806358006983512071">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983512058" resolveInfo="settings" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7806358006983512072">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="h3aa.~DebugConnectionSettings%dgetPort()%cint" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983512073">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7806358006983512074">
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983512075">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511893" resolveInfo="myCommandLine" />
            </node>
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7806358006983512076">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7806358006983512047" resolveInfo="formClientCommandLine" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983512077">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7806358006983512078">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7806358006983512028" resolveInfo="updateUiFromFields" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7806358006983512079">
      <property name="name" nameId="tpck.1169194664001" value="apply" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7806358006983512080" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7806358006983512081" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7806358006983512082">
        <property name="name" nameId="tpck.1169194664001" value="settings" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7806358006983512083">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="h3aa.~DebugConnectionSettings" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983512084">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983512085">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983512086">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7806358006983512087">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983512082" resolveInfo="settings" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7806358006983512088">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="h3aa.~DebugConnectionSettings%dsetHostName(java%dlang%dString)%cvoid" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983512089">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511890" resolveInfo="myHost" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7806358006983512090">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7806358006983512091">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7806358006983512092">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983512082" resolveInfo="settings" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7806358006983512093">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="h3aa.~DebugConnectionSettings%dsetPort(int)%cvoid" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7806358006983512094">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983511887" resolveInfo="myPort" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="7806358006983590272">
    <node role="execute" roleId="uhxm.7945003362267213473" type="uhxm.ExecuteConfiguration_Function" typeId="uhxm.6139196002333163564" id="7806358006983590273">
      <node role="process" roleId="uhxm.2866018809101862242" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7806358006983590640">
        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7806358006983590634" resolveInfo="handler" />
      </node>
      <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="7806358006983590275">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7806358006983590633">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7806358006983590634">
            <property name="name" nameId="tpck.1169194664001" value="handler" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7806358006983590635">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="3ri6.~RemoteDebugProcessHandler" resolveInfo="RemoteDebugProcessHandler" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7806358006983590636">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7806358006983590637">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="3ri6.~RemoteDebugProcessHandler%d&lt;init&gt;(com%dintellij%dopenapi%dproject%dProject)" resolveInfo="RemoteDebugProcessHandler" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="uhxm.Project_Parameter" typeId="uhxm.7684700299064179245" id="7806358006983590638" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="debugger" roleId="uhxm.4371737370139995047" type="86gq.DebuggerReference" typeId="86gq.1104094430779068753" id="7806358006983590277">
      <property name="debuggerName" nameId="86gq.1104094430779068757" value="Java" />
    </node>
  </root>
</model>


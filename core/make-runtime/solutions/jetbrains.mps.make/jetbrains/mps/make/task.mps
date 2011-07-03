<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:968e6282-1927-4825-b398-1abb70e38b6d(jetbrains.mps.make.task)">
  <persistence version="7" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <language namespace="fd392034-7849-419d-9071-12563d152375(jetbrains.mps.baseLanguage.closures)" />
  <import index="i82i" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#com.intellij.openapi.progress(MPS.Classpath/com.intellij.openapi.progress@java_stub)" version="-1" />
  <import index="r27b" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#org.jetbrains.annotations(MPS.Classpath/org.jetbrains.annotations@java_stub)" version="-1" />
  <import index="yif3" modelUID="r:13ec431d-483d-451c-a648-ffefde4fef51(jetbrains.mps.internal.make.runtime.backports)" version="-1" />
  <import index="i9so" modelUID="r:9e5578e0-37f0-4c9b-a301-771bcb453678(jetbrains.mps.make.script)" version="-1" />
  <import index="yo81" modelUID="r:4ea5a78b-cb8a-4831-b227-f7860a22491d(jetbrains.mps.make.resources)" version="-1" />
  <import index="cfml" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.messages(MPS.Classpath/jetbrains.mps.messages@java_stub)" version="-1" />
  <import index="vft3" modelUID="f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.util.concurrent.atomic(JDK/java.util.concurrent.atomic@java_stub)" version="-1" />
  <import index="53gy" modelUID="f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.util.concurrent(JDK/java.util.concurrent@java_stub)" version="-1" />
  <import index="27v0" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#com.intellij.openapi.project(MPS.Classpath/com.intellij.openapi.project@java_stub)" version="-1" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="tpee" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" implicit="yes" />
  <import index="tp2c" modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" implicit="yes" />
  <import index="tp2q" modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" implicit="yes" />
  <import index="e2lb" modelUID="f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)" version="-1" implicit="yes" />
  <roots>
    <node type="tpee.ClassConcept" typeId="tpee.1068390468198" id="6699733160349392730">
      <property name="name" nameId="tpck.1169194664001" value="MakeTask" />
      <property name="nonStatic" nameId="tpee.521412098689998745" value="false" />
      <property name="abstractClass" nameId="tpee.1075300953594" value="false" />
    </node>
  </roots>
  <root id="6699733160349392730">
    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="6699733160349392731" />
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="6699733160349392732">
      <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
      <property name="name" nameId="tpck.1169194664001" value="run" />
      <property name="isFinal" nameId="tpee.1181808852946" value="false" />
      <property name="isDeprecated" nameId="tpee.1224848525476" value="false" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="6699733160349392733" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="6699733160349392734" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6699733160349392735">
        <property name="name" nameId="tpck.1169194664001" value="pi" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349392736">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i82i.~ProgressIndicator" resolveInfo="ProgressIndicator" />
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="6699733160349392737">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="r27b.~NotNull" resolveInfo="NotNull" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6699733160349392738">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="6699733160349392739">
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="6699733160349392740">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.TryStatement" typeId="tpee.1153952380246" id="4217695621345840082">
              <node role="body" roleId="tpee.1153952416686" type="tpee.StatementList" typeId="tpee.1068580123136" id="4217695621345840083">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4217695621345840075">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="4217695621345840076">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="4217695621345839846" resolveInfo="doRun" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4217695621345840077">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349392735" resolveInfo="pi" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="finallyBody" roleId="tpee.1153952429843" type="tpee.StatementList" typeId="tpee.1068580123136" id="4217695621345840085">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.TryCatchStatement" typeId="tpee.1164879751025" id="4217695621345840086">
                  <node role="body" roleId="tpee.1164879758292" type="tpee.StatementList" typeId="tpee.1068580123136" id="4217695621345840087">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4217695621345840079">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="4217695621345840080">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6699733160349393089" resolveInfo="reconcile" />
                      </node>
                    </node>
                  </node>
                  <node role="catchClause" roleId="tpee.1164903496223" type="tpee.CatchClause" typeId="tpee.1164903280175" id="4217695621345840088">
                    <node role="throwable" roleId="tpee.1164903359217" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="4217695621345840089">
                      <property name="name" nameId="tpck.1169194664001" value="ignore" />
                      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4217695621345840092">
                        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~RuntimeException" resolveInfo="RuntimeException" />
                      </node>
                    </node>
                    <node role="catchBody" roleId="tpee.1164903359218" type="tpee.StatementList" typeId="tpee.1068580123136" id="4217695621345840091" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6699733160349392959">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6699733160349392960">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393248" resolveInfo="myState" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6699733160349392961">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="vft3.~AtomicReference%dcompareAndSet(java%dlang%dObject,java%dlang%dObject)%cboolean" resolveInfo="compareAndSet" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="6699733160349392962">
                <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="6699733160349393281" resolveInfo="MakeTask.TaskState" />
                <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="6699733160349393286" resolveInfo="NOT_STARTED" />
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="6699733160349392963">
                <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="6699733160349393281" resolveInfo="MakeTask.TaskState" />
                <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="6699733160349393287" resolveInfo="RUNNING" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="6699733160349392971">
      <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
      <property name="name" nameId="tpck.1169194664001" value="onCancel" />
      <property name="isFinal" nameId="tpee.1181808852946" value="false" />
      <property name="isDeprecated" nameId="tpee.1224848525476" value="false" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="6699733160349392972" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="6699733160349392973" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6699733160349392974">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6699733160349392975">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="6699733160349392976">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="6699733160349392977" />
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6699733160349392978">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="6699733160349392979" />
              <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="6699733160349392980">
                <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="6699733160349393269" resolveInfo="myResult" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="6699733160349392983">
        <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="6699733160349392984">
      <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
      <property name="name" nameId="tpck.1169194664001" value="cancel" />
      <property name="isFinal" nameId="tpee.1181808852946" value="false" />
      <property name="isDeprecated" nameId="tpee.1224848525476" value="false" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="6699733160349392985" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.BooleanType" typeId="tpee.1070534644030" id="6699733160349392986" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6699733160349392987">
        <property name="name" nameId="tpck.1169194664001" value="b" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.BooleanType" typeId="tpee.1070534644030" id="6699733160349392988" />
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6699733160349392989">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6699733160349392990">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="6699733160349392991" />
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="6699733160349392992">
      <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
      <property name="name" nameId="tpck.1169194664001" value="isCancelled" />
      <property name="isFinal" nameId="tpee.1181808852946" value="false" />
      <property name="isDeprecated" nameId="tpee.1224848525476" value="false" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="6699733160349392993" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.BooleanType" typeId="tpee.1070534644030" id="6699733160349392994" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6699733160349392995">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6699733160349392996">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="6699733160349392997">
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="6699733160349392998">
              <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="6699733160349393289" resolveInfo="CANCELLED" />
              <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="6699733160349393281" resolveInfo="MakeTask.TaskState" />
            </node>
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6699733160349392999">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6699733160349393000">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393248" resolveInfo="myState" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6699733160349393001">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="vft3.~AtomicReference%dget()%cjava%dlang%dObject" resolveInfo="get" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="6699733160349393002">
      <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
      <property name="name" nameId="tpck.1169194664001" value="isDone" />
      <property name="isFinal" nameId="tpee.1181808852946" value="false" />
      <property name="isDeprecated" nameId="tpee.1224848525476" value="false" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="6699733160349393003" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.BooleanType" typeId="tpee.1070534644030" id="6699733160349393004" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6699733160349393005">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6699733160349393006">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AndExpression" typeId="tpee.1080120340718" id="6699733160349393007">
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="6699733160349393008">
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="6699733160349393009">
                <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="6699733160349393287" resolveInfo="RUNNING" />
                <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="6699733160349393281" resolveInfo="MakeTask.TaskState" />
              </node>
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6699733160349393010">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6699733160349393011">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393248" resolveInfo="myState" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6699733160349393012">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="vft3.~AtomicReference%dget()%cjava%dlang%dObject" resolveInfo="get" />
                </node>
              </node>
            </node>
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="6699733160349393013">
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6699733160349393014">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6699733160349393015">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393248" resolveInfo="myState" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6699733160349393016">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="vft3.~AtomicReference%dget()%cjava%dlang%dObject" resolveInfo="get" />
                </node>
              </node>
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="6699733160349393017">
                <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="6699733160349393286" resolveInfo="NOT_STARTED" />
                <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="6699733160349393281" resolveInfo="MakeTask.TaskState" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="6699733160349393018">
      <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
      <property name="name" nameId="tpck.1169194664001" value="get" />
      <property name="isFinal" nameId="tpee.1181808852946" value="false" />
      <property name="isDeprecated" nameId="tpee.1224848525476" value="false" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="6699733160349393019" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349393020">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.1291978361072214397" resolveInfo="IResult" />
      </node>
      <node role="throwsItem" roleId="tpee.1164879685961" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349393021">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~InterruptedException" resolveInfo="InterruptedException" />
      </node>
      <node role="throwsItem" roleId="tpee.1164879685961" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349393022">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="53gy.~ExecutionException" resolveInfo="ExecutionException" />
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6699733160349393023">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6699733160349393024">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6699733160349393025">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6699733160349393026">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393242" resolveInfo="myLatch" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6699733160349393027">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="53gy.~CountDownLatch%dawait()%cvoid" resolveInfo="await" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="6699733160349393028">
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="6699733160349393029">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ThrowStatement" typeId="tpee.1164991038168" id="6699733160349393030">
              <node role="throwable" roleId="tpee.1164991057263" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="6699733160349393031">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="6699733160349393032">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="53gy.~CancellationException%d&lt;init&gt;()" resolveInfo="CancellationException" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="tpee.1068580123160" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="6699733160349393033">
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="6699733160349393034">
              <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="6699733160349393289" resolveInfo="CANCELLED" />
              <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="6699733160349393281" resolveInfo="MakeTask.TaskState" />
            </node>
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6699733160349393035">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6699733160349393036">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393248" resolveInfo="myState" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6699733160349393037">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="vft3.~AtomicReference%dget()%cjava%dlang%dObject" resolveInfo="get" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="6699733160349393038">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6699733160349393039">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393269" resolveInfo="myResult" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="6699733160349393040">
      <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
      <property name="name" nameId="tpck.1169194664001" value="get" />
      <property name="isFinal" nameId="tpee.1181808852946" value="false" />
      <property name="isDeprecated" nameId="tpee.1224848525476" value="false" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="6699733160349393041" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349393042">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.1291978361072214397" resolveInfo="IResult" />
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6699733160349393043">
        <property name="name" nameId="tpck.1169194664001" value="timeout" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.LongType" typeId="tpee.1068581242867" id="6699733160349393044" />
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6699733160349393045">
        <property name="name" nameId="tpck.1169194664001" value="unit" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349393046">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="53gy.~TimeUnit" resolveInfo="TimeUnit" />
        </node>
      </node>
      <node role="throwsItem" roleId="tpee.1164879685961" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349393047">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~InterruptedException" resolveInfo="InterruptedException" />
      </node>
      <node role="throwsItem" roleId="tpee.1164879685961" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349393048">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="53gy.~ExecutionException" resolveInfo="ExecutionException" />
      </node>
      <node role="throwsItem" roleId="tpee.1164879685961" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349393049">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="53gy.~TimeoutException" resolveInfo="TimeoutException" />
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6699733160349393050">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6699733160349393051">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6699733160349393052">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6699733160349393053">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393242" resolveInfo="myLatch" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6699733160349393054">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="53gy.~CountDownLatch%dawait(long,java%dutil%dconcurrent%dTimeUnit)%cboolean" resolveInfo="await" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6699733160349393055">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393043" resolveInfo="timeout" />
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6699733160349393056">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393045" resolveInfo="unit" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="6699733160349393057">
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="6699733160349393058">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ThrowStatement" typeId="tpee.1164991038168" id="6699733160349393059">
              <node role="throwable" roleId="tpee.1164991057263" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="6699733160349393060">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="6699733160349393061">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="53gy.~CancellationException%d&lt;init&gt;()" resolveInfo="CancellationException" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="tpee.1068580123160" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="6699733160349393062">
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="6699733160349393063">
              <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="6699733160349393281" resolveInfo="MakeTask.TaskState" />
              <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="6699733160349393289" resolveInfo="CANCELLED" />
            </node>
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6699733160349393064">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6699733160349393065">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393248" resolveInfo="myState" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6699733160349393066">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="vft3.~AtomicReference%dget()%cjava%dlang%dObject" resolveInfo="get" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="6699733160349393067">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6699733160349393068">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393269" resolveInfo="myResult" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="6699733160349393069">
      <property name="name" nameId="tpck.1169194664001" value="displayInfo" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6699733160349393070">
        <property name="name" nameId="tpck.1169194664001" value="info" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="6699733160349393071" />
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="6699733160349393072" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.ProtectedVisibility" typeId="tpee.1146644641414" id="6699733160349393073" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6699733160349393074" />
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="6699733160349393075">
      <property name="name" nameId="tpck.1169194664001" value="useProgressIndicator" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="6699733160349393076" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.ProtectedVisibility" typeId="tpee.1146644641414" id="6699733160349393077" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6699733160349393078" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6699733160349393079">
        <property name="name" nameId="tpck.1169194664001" value="pi" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349393080">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i82i.~ProgressIndicator" resolveInfo="ProgressIndicator" />
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="6699733160349393081">
      <property name="name" nameId="tpck.1169194664001" value="aboutToStart" />
      <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="6699733160349393082" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.ProtectedVisibility" typeId="tpee.1146644641414" id="6699733160349393083" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6699733160349393084" />
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="6699733160349393085">
      <property name="name" nameId="tpck.1169194664001" value="done" />
      <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="6699733160349393086" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.ProtectedVisibility" typeId="tpee.1146644641414" id="6699733160349393087" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6699733160349393088" />
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="4217695621345839846">
      <property name="name" nameId="tpck.1169194664001" value="doRun" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="4217695621345839847" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="4217695621345840073" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="4217695621345839845">
        <property name="name" nameId="tpck.1169194664001" value="pi" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4217695621345839849">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i82i.~ProgressIndicator" resolveInfo="ProgressIndicator" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="4217695621345839850">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4217695621345839851">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="4217695621345839852">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6699733160349393081" resolveInfo="aboutToStart" />
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4217695621345839853">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4217695621345839854">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4217695621345839855">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4217695621345839845" resolveInfo="pi" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4217695621345839856">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i82i.~ProgressIndicator%dpushState()%cvoid" resolveInfo="pushState" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="4217695621345839857">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="4217695621345839835">
            <property name="name" nameId="tpck.1169194664001" value="clsize" />
            <property name="isFinal" nameId="tpee.1176718929932" value="true" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.IntegerType" typeId="tpee.1070534370425" id="4217695621345839858" />
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4217695621345839859">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4217695621345839860">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="4217695621345839861" />
                <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="4217695621345839862">
                  <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="6699733160349393263" resolveInfo="myClInput" />
                </node>
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp2q.GetSizeOperation" typeId="tp2q.1162935959151" id="4217695621345839863" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="4217695621345839864">
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="4217695621345839865">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="4217695621345839866" />
          </node>
          <node role="condition" roleId="tpee.1068580123160" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="4217695621345839868">
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4217695621345839869">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4217695621345839835" resolveInfo="clsize" />
            </node>
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="4217695621345839870">
              <property name="value" nameId="tpee.1068580320021" value="0" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="4217695621345839871">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="4217695621345839836">
            <property name="name" nameId="tpck.1169194664001" value="clfrac" />
            <property name="isFinal" nameId="tpee.1176718929932" value="true" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.DoubleType" typeId="tpee.1070534513062" id="4217695621345839872" />
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.ParenthesizedExpression" typeId="tpee.1079359253375" id="4217695621345839873">
              <node role="expression" roleId="tpee.1079359253376" type="tpee.DivExpression" typeId="tpee.1095950406618" id="4217695621345839874">
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4217695621345839875">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4217695621345839835" resolveInfo="clsize" />
                </node>
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.FloatingPointConstant" typeId="tpee.1111509017652" id="4217695621345839876">
                  <property name="value" nameId="tpee.1113006610751" value="1.0" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="4217695621345839877">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="4217695621345839838">
            <property name="name" nameId="tpck.1169194664001" value="idx" />
            <property name="isFinal" nameId="tpee.1176718929932" value="true" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ArrayType" typeId="tpee.1070534760951" id="4217695621345839878">
              <node role="componentType" roleId="tpee.1070534760952" type="tpee.IntegerType" typeId="tpee.1070534370425" id="4217695621345839879" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="4217695621345839880">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ArrayCreatorWithInitializer" typeId="tpee.1154542696413" id="4217695621345839881">
                <node role="componentType" roleId="tpee.1154542793668" type="tpee.IntegerType" typeId="tpee.1070534370425" id="4217695621345839882" />
                <node role="initValue" roleId="tpee.1154542803372" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="4217695621345839883">
                  <property name="value" nameId="tpee.1068580320021" value="0" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4217695621345839884">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="4217695621345839885">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6699733160349393075" resolveInfo="useProgressIndicator" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="4217695621345839886">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.AnonymousClassCreator" typeId="tpee.1182160077978" id="4217695621345839887">
                <node role="cls" roleId="tpee.1182160096073" type="tpee.AnonymousClass" typeId="tpee.1170345865475" id="4217695621345839888">
                  <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="yif3.2130030975859798588" resolveInfo="ProgressIndicatorDelegate" />
                  <link role="classifier" roleId="tpee.1170346070688" targetNodeId="yif3.2130030975859798586" resolveInfo="ProgressIndicatorDelegate" />
                  <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="4217695621345839889" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4217695621345839890">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4217695621345839845" resolveInfo="pi" />
                  </node>
                  <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="4217695621345839891">
                    <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
                    <property name="name" nameId="tpck.1169194664001" value="setFraction" />
                    <property name="isFinal" nameId="tpee.1181808852946" value="false" />
                    <property name="isDeprecated" nameId="tpee.1224848525476" value="false" />
                    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="4217695621345839892" />
                    <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="4217695621345839893" />
                    <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="4217695621345839837">
                      <property name="name" nameId="tpck.1169194664001" value="d" />
                      <node role="type" roleId="tpee.5680397130376446158" type="tpee.DoubleType" typeId="tpee.1070534513062" id="4217695621345839894" />
                    </node>
                    <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="4217695621345839895">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4217695621345839896">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4217695621345839897">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="4217695621345839898">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="yif3.2130030975859848037" resolveInfo="getDelegate" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4217695621345839899">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i82i.~ProgressIndicator%dsetFraction(double)%cvoid" resolveInfo="setFraction" />
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.MulExpression" typeId="tpee.1092119917967" id="4217695621345839900">
                              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4217695621345839901">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4217695621345839836" resolveInfo="clfrac" />
                              </node>
                              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.ParenthesizedExpression" typeId="tpee.1079359253375" id="4217695621345839902">
                                <node role="expression" roleId="tpee.1079359253376" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="4217695621345839903">
                                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4217695621345839904">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4217695621345839837" resolveInfo="d" />
                                  </node>
                                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.ArrayAccessExpression" typeId="tpee.1173175405605" id="4217695621345839905">
                                    <node role="index" roleId="tpee.1173175577737" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="4217695621345839906">
                                      <property name="value" nameId="tpee.1068580320021" value="0" />
                                    </node>
                                    <node role="array" roleId="tpee.1173175590490" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4217695621345839907">
                                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4217695621345839838" resolveInfo="idx" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="4217695621345839908">
                      <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
                    </node>
                  </node>
                  <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="4217695621345839909">
                    <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
                    <property name="name" nameId="tpck.1169194664001" value="setText2" />
                    <property name="isFinal" nameId="tpee.1181808852946" value="false" />
                    <property name="isDeprecated" nameId="tpee.1224848525476" value="false" />
                    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="4217695621345839910" />
                    <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="4217695621345839911" />
                    <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="4217695621345839912">
                      <property name="name" nameId="tpck.1169194664001" value="string" />
                      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4217695621345839913">
                        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" resolveInfo="String" />
                      </node>
                    </node>
                    <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="4217695621345839914" />
                    <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="4217695621345839915">
                      <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.Statement" typeId="tpee.1068580123157" id="4217695621345839916" />
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="4217695621345839917">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="4217695621345839840">
            <property name="name" nameId="tpck.1169194664001" value="scit" />
            <node role="type" roleId="tpee.5680397130376446158" type="tp2q.IteratorType" typeId="tp2q.1237467705688" id="4217695621345839918">
              <node role="elementType" roleId="tp2q.1237467730343" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4217695621345839919">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6168415856807657227" resolveInfo="IScript" />
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4217695621345839920">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="4217695621345839921">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393256" resolveInfo="myScripts" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp2q.GetIteratorOperation" typeId="tp2q.1237467461002" id="4217695621345839922" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="4217695621345839923">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="4217695621345839839">
            <property name="name" nameId="tpck.1169194664001" value="clit" />
            <node role="type" roleId="tpee.5680397130376446158" type="tp2q.IteratorType" typeId="tp2q.1237467705688" id="4217695621345839924">
              <node role="elementType" roleId="tp2q.1237467730343" type="tpee.UpperBoundType" typeId="tpee.1171903916106" id="4217695621345839925">
                <node role="bound" roleId="tpee.1171903916107" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="4217695621345839926">
                  <node role="elementType" roleId="tp2q.1151689745422" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4217695621345839927">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="yo81.6168415856807657256" resolveInfo="IResource" />
                  </node>
                </node>
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4217695621345839928">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="4217695621345839929">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393263" resolveInfo="myClInput" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp2q.GetIteratorOperation" typeId="tp2q.1237467461002" id="4217695621345839930" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.WhileStatement" typeId="tpee.1076505808687" id="4217695621345839931">
          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="4217695621345839932">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="4217695621345839933">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="4217695621345839843">
                <property name="name" nameId="tpck.1169194664001" value="cl" />
                <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="4217695621345839934">
                  <node role="elementType" roleId="tp2q.1151689745422" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4217695621345839935">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="yo81.6168415856807657256" resolveInfo="IResource" />
                  </node>
                </node>
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4217695621345839936">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4217695621345839937">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4217695621345839839" resolveInfo="clit" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tp2q.GetNextOperation" typeId="tp2q.1237471031357" id="4217695621345839938" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="4217695621345839939">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="4217695621345839842">
                <property name="name" nameId="tpck.1169194664001" value="scr" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4217695621345839940">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6168415856807657227" resolveInfo="IScript" />
                </node>
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4217695621345839941">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4217695621345839942">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4217695621345839840" resolveInfo="scit" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tp2q.GetNextOperation" typeId="tp2q.1237471031357" id="4217695621345839943" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.Statement" typeId="tpee.1068580123157" id="4217695621345839944" />
            <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="4217695621345839945">
              <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="4217695621345839946">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="4217695621345839947">
                  <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="4217695621345839841">
                    <property name="name" nameId="tpck.1169194664001" value="msg" />
                    <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="4217695621345839948" />
                    <node role="initializer" roleId="tpee.1068431790190" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="4217695621345839949">
                      <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="4217695621345839950">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393260" resolveInfo="myScrName" />
                      </node>
                      <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="4217695621345839951">
                        <property name="value" nameId="tpee.1070475926801" value=" failed" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4217695621345839952">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4217695621345839953">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="4217695621345839954">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393276" resolveInfo="myMessageHandler" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4217695621345839955">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cfml.~IMessageHandler%dhandle(jetbrains%dmps%dmessages%dIMessage)%cvoid" resolveInfo="handle" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="4217695621345839956">
                        <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="4217695621345839957">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cfml.~Message%d&lt;init&gt;(jetbrains%dmps%dmessages%dMessageKind,java%dlang%dString)" resolveInfo="Message" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="4217695621345839958">
                            <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="cfml.~MessageKind" resolveInfo="MessageKind" />
                            <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="cfml.~MessageKind%dERROR" resolveInfo="ERROR" />
                          </node>
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="4217695621345839959">
                            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4217695621345839960">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4217695621345839841" resolveInfo="msg" />
                            </node>
                            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="4217695621345839961">
                              <property name="value" nameId="tpee.1070475926801" value=". Invalid script." />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4217695621345839962">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="4217695621345839963">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6699733160349393069" resolveInfo="displayInfo" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4217695621345839964">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4217695621345839841" resolveInfo="msg" />
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4217695621345839965">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="4217695621345839966">
                    <node role="lValue" roleId="tpee.1068498886295" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4217695621345839967">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="4217695621345839968" />
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="4217695621345839969">
                        <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="6699733160349393269" resolveInfo="myResult" />
                      </node>
                    </node>
                    <node role="rValue" roleId="tpee.1068498886297" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="4217695621345839970">
                      <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="4217695621345839971">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.4629164904928188012" resolveInfo="IResult.FAILURE" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="4217695621345839972" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.BreakStatement" typeId="tpee.1081855346303" id="4217695621345839973" />
              </node>
              <node role="condition" roleId="tpee.1068580123160" type="tpee.NotExpression" typeId="tpee.1081516740877" id="4217695621345839974">
                <node role="expression" roleId="tpee.1081516765348" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4217695621345839975">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4217695621345839976">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4217695621345839842" resolveInfo="scr" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4217695621345839977">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.6168415856807657228" resolveInfo="isValid" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.Statement" typeId="tpee.1068580123157" id="4217695621345839978" />
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4217695621345839979">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4217695621345839980">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4217695621345839981">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4217695621345839845" resolveInfo="pi" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4217695621345839982">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i82i.~ProgressIndicator%dsetText2(java%dlang%dString)%cvoid" resolveInfo="setText2" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="4217695621345839983">
                    <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4217695621345839984">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4217695621345839985">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4217695621345839986">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4217695621345839843" resolveInfo="cl" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tp2q.SelectOperation" typeId="tp2q.1202128969694" id="4217695621345839987">
                          <node role="closure" roleId="tp2q.1204796294226" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="4217695621345839988">
                            <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="4217695621345839989">
                              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4217695621345839990">
                                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4217695621345839991">
                                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParenthesizedExpression" typeId="tpee.1079359253375" id="4217695621345839992">
                                    <node role="expression" roleId="tpee.1079359253376" type="tpee.CastExpression" typeId="tpee.1070534934090" id="4217695621345839993">
                                      <node role="type" roleId="tpee.1070534934091" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4217695621345839994">
                                        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="yo81.6168415856807657256" resolveInfo="IResource" />
                                      </node>
                                      <node role="expression" roleId="tpee.1070534934092" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4217695621345839995">
                                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4217695621345839844" resolveInfo="r" />
                                      </node>
                                    </node>
                                  </node>
                                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4217695621345839996">
                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="yo81.2708838034905920964" resolveInfo="describe" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="parameter" roleId="tp2c.1199569906740" type="tp2q.SmartClosureParameterDeclaration" typeId="tp2q.1203518072036" id="4217695621345839844">
                              <property name="name" nameId="tpck.1169194664001" value="r" />
                              <node role="type" roleId="tpee.5680397130376446158" type="tpee.UndefinedType" typeId="tpee.4836112446988635817" id="4217695621345839997" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tp2q.JoinOperation" typeId="tp2q.1240687580870" id="4217695621345839998">
                        <node role="delimiter" roleId="tp2q.1240687658305" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="4217695621345839999">
                          <property name="value" nameId="tpee.1070475926801" value="," />
                        </node>
                      </node>
                    </node>
                    <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="4217695621345840000">
                      <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="4217695621345840001">
                        <property name="value" nameId="tpee.1070475926801" value=" " />
                      </node>
                      <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="4217695621345840002">
                        <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="4217695621345840003">
                          <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.ParenthesizedExpression" typeId="tpee.1079359253375" id="4217695621345840004">
                            <node role="expression" roleId="tpee.1079359253376" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="4217695621345840005">
                              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="4217695621345840006">
                                <property name="value" nameId="tpee.1068580320021" value="1" />
                              </node>
                              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.ArrayAccessExpression" typeId="tpee.1173175405605" id="4217695621345840007">
                                <node role="index" roleId="tpee.1173175577737" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="4217695621345840008">
                                  <property name="value" nameId="tpee.1068580320021" value="0" />
                                </node>
                                <node role="array" roleId="tpee.1173175590490" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4217695621345840009">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4217695621345839838" resolveInfo="idx" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="4217695621345840010">
                            <property name="value" nameId="tpee.1070475926801" value="/" />
                          </node>
                        </node>
                        <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4217695621345840011">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4217695621345839835" resolveInfo="clsize" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4217695621345840012">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="4217695621345840013">
                <node role="lValue" roleId="tpee.1068498886295" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4217695621345840014">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="4217695621345840015" />
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="4217695621345840016">
                    <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="6699733160349393269" resolveInfo="myResult" />
                  </node>
                </node>
                <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4217695621345840017">
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4217695621345840018">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.8545022408569007101" resolveInfo="execute" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4217695621345840019">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="4217695621345840020" />
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="4217695621345840021">
                        <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="6699733160349393273" resolveInfo="myController" />
                      </node>
                    </node>
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4217695621345840022">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4217695621345839843" resolveInfo="cl" />
                    </node>
                  </node>
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4217695621345840023">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4217695621345839842" resolveInfo="scr" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="4217695621345840024">
              <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="4217695621345840025">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.BreakStatement" typeId="tpee.1081855346303" id="4217695621345840026" />
              </node>
              <node role="condition" roleId="tpee.1068580123160" type="tpee.OrExpression" typeId="tpee.1080223426719" id="4217695621345840027">
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4217695621345840028">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4217695621345840029">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4217695621345839845" resolveInfo="pi" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4217695621345840030">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i82i.~ProgressIndicator%disCanceled()%cboolean" resolveInfo="isCanceled" />
                  </node>
                </node>
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.NotExpression" typeId="tpee.1081516740877" id="4217695621345840031">
                  <node role="expression" roleId="tpee.1081516765348" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4217695621345840032">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4217695621345840033">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="4217695621345840034" />
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="4217695621345840035">
                        <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="6699733160349393269" resolveInfo="myResult" />
                      </node>
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4217695621345840036">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.1291978361072214431" resolveInfo="isSucessful" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4217695621345840037">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.PostfixIncrementExpression" typeId="tpee.1214918800624" id="4217695621345840038">
                <node role="expression" roleId="tpee.1239714902950" type="tpee.ArrayAccessExpression" typeId="tpee.1173175405605" id="4217695621345840039">
                  <node role="index" roleId="tpee.1173175577737" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="4217695621345840040">
                    <property name="value" nameId="tpee.1068580320021" value="0" />
                  </node>
                  <node role="array" roleId="tpee.1173175590490" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4217695621345840041">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4217695621345839838" resolveInfo="idx" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="tpee.1076505808688" type="tpee.AndExpression" typeId="tpee.1080120340718" id="4217695621345840042">
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4217695621345840043">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4217695621345840044">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4217695621345839839" resolveInfo="clit" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp2q.HasNextOperation" typeId="tp2q.1237470895604" id="4217695621345840045" />
            </node>
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4217695621345840046">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4217695621345840047">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4217695621345839840" resolveInfo="scit" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp2q.HasNextOperation" typeId="tp2q.1237470895604" id="4217695621345840048" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4217695621345840049">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4217695621345840050">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4217695621345840051">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4217695621345839845" resolveInfo="pi" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4217695621345840052">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i82i.~ProgressIndicator%dpopState()%cvoid" resolveInfo="popState" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4217695621345840053">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4217695621345840054">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4217695621345840055">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="4217695621345840056" />
              <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="4217695621345840057">
                <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="6699733160349393248" resolveInfo="myState" />
              </node>
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4217695621345840058">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="vft3.~AtomicReference%dset(java%dlang%dObject)%cvoid" resolveInfo="set" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="4217695621345840059">
                <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="6699733160349393290" resolveInfo="INDETERMINATE" />
                <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="6699733160349393281" resolveInfo="MakeTask.TaskState" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="6699733160349393089">
      <property name="name" nameId="tpck.1169194664001" value="reconcile" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="6699733160349393090" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="6699733160349393091" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6699733160349393092">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="6699733160349393093">
          <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.BlockStatement" typeId="tpee.1082485599095" id="6699733160349393094">
            <node role="statements" roleId="tpee.1082485599096" type="tpee.StatementList" typeId="tpee.1068580123136" id="6699733160349393095">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="6699733160349393096">
                <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="6699733160349393097">
                  <property name="name" nameId="tpck.1169194664001" value="msg" />
                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="6699733160349393098" />
                  <node role="initializer" roleId="tpee.1068431790190" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="6699733160349393099">
                    <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6699733160349393100">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="6699733160349393101" />
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="6699733160349393102">
                        <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="6699733160349393260" resolveInfo="myScrName" />
                      </node>
                    </node>
                    <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="6699733160349393103">
                      <property name="value" nameId="tpee.1070475926801" value=" successful" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6699733160349393104">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="6699733160349393105">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6699733160349393069" resolveInfo="displayInfo" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="6699733160349393106">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393097" resolveInfo="msg" />
                  </node>
                </node>
              </node>
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6699733160349393107">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6699733160349393108">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6699733160349393109">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="6699733160349393110" />
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="6699733160349393111">
                      <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="6699733160349393248" resolveInfo="myState" />
                    </node>
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6699733160349393112">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="vft3.~AtomicReference%dset(java%dlang%dObject)%cvoid" resolveInfo="set" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="6699733160349393113">
                      <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="6699733160349393281" resolveInfo="MakeTask.TaskState" />
                      <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="6699733160349393288" resolveInfo="DONE" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="elsifClauses" roleId="tpee.1206060520071" type="tpee.ElsifClause" typeId="tpee.1206060495898" id="6699733160349393114">
            <node role="condition" roleId="tpee.1206060619838" type="tpee.NotExpression" typeId="tpee.1081516740877" id="6699733160349393115">
              <node role="expression" roleId="tpee.1081516765348" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6699733160349393116">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6699733160349393117">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="6699733160349393118" />
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="6699733160349393119">
                    <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="6699733160349393269" resolveInfo="myResult" />
                  </node>
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6699733160349393120">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.1291978361072214431" resolveInfo="isSucessful" />
                </node>
              </node>
            </node>
            <node role="statementList" roleId="tpee.1206060644605" type="tpee.StatementList" typeId="tpee.1068580123136" id="6699733160349393121">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="6699733160349393122">
                <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="6699733160349393123">
                  <property name="name" nameId="tpck.1169194664001" value="msg" />
                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="6699733160349393124" />
                  <node role="initializer" roleId="tpee.1068431790190" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="6699733160349393125">
                    <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6699733160349393126">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="6699733160349393127" />
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="6699733160349393128">
                        <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="6699733160349393260" resolveInfo="myScrName" />
                      </node>
                    </node>
                    <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="6699733160349393129">
                      <property name="value" nameId="tpee.1070475926801" value=" failed" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6699733160349393130">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6699733160349393131">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6699733160349393132">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393276" resolveInfo="myMessageHandler" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6699733160349393133">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cfml.~IMessageHandler%dhandle(jetbrains%dmps%dmessages%dIMessage)%cvoid" resolveInfo="handle" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="6699733160349393134">
                      <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="6699733160349393135">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cfml.~Message%d&lt;init&gt;(jetbrains%dmps%dmessages%dMessageKind,java%dlang%dString)" resolveInfo="Message" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="6699733160349393136">
                          <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="cfml.~MessageKind%dERROR" resolveInfo="ERROR" />
                          <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="cfml.~MessageKind" resolveInfo="MessageKind" />
                        </node>
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="6699733160349393137">
                          <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="6699733160349393138">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393123" resolveInfo="msg" />
                          </node>
                          <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="6699733160349393139">
                            <property name="value" nameId="tpee.1070475926801" value=". See previous messages for details." />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6699733160349393140">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="6699733160349393141">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6699733160349393069" resolveInfo="displayInfo" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="6699733160349393142">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393123" resolveInfo="msg" />
                  </node>
                </node>
              </node>
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6699733160349393143">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6699733160349393144">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6699733160349393145">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="6699733160349393146" />
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="6699733160349393147">
                      <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="6699733160349393248" resolveInfo="myState" />
                    </node>
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6699733160349393148">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="vft3.~AtomicReference%dset(java%dlang%dObject)%cvoid" resolveInfo="set" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="6699733160349393149">
                      <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="6699733160349393281" resolveInfo="MakeTask.TaskState" />
                      <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="6699733160349393288" resolveInfo="DONE" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="6699733160349393150">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="6699733160349393151">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="6699733160349393152">
                <property name="name" nameId="tpck.1169194664001" value="msg" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="6699733160349393153" />
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="6699733160349393154">
                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6699733160349393155">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="6699733160349393156" />
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="6699733160349393157">
                      <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="6699733160349393260" resolveInfo="myScrName" />
                    </node>
                  </node>
                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="6699733160349393158">
                    <property name="value" nameId="tpee.1070475926801" value=" aborted" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6699733160349393159">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="6699733160349393160">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6699733160349393069" resolveInfo="displayInfo" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="6699733160349393161">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393152" resolveInfo="msg" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6699733160349393162">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6699733160349393163">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6699733160349393164">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="6699733160349393165" />
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="6699733160349393166">
                    <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="6699733160349393248" resolveInfo="myState" />
                  </node>
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6699733160349393167">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="vft3.~AtomicReference%dset(java%dlang%dObject)%cvoid" resolveInfo="set" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="6699733160349393168">
                    <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="6699733160349393281" resolveInfo="MakeTask.TaskState" />
                    <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="6699733160349393289" resolveInfo="CANCELLED" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="tpee.1068580123160" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="6699733160349393169">
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="6699733160349393170" />
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6699733160349393171">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="6699733160349393172" />
              <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="6699733160349393173">
                <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="6699733160349393269" resolveInfo="myResult" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6699733160349393174">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6699733160349393175">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6699733160349393176">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393242" resolveInfo="myLatch" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6699733160349393177">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="53gy.~CountDownLatch%dcountDown()%cvoid" resolveInfo="countDown" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6699733160349393178">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="6699733160349393179">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6699733160349393085" resolveInfo="done" />
          </node>
        </node>
      </node>
    </node>
    <node role="superclass" roleId="tpee.1165602531693" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349393180">
      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i82i.~Task$Backgroundable" resolveInfo="Task.Backgroundable" />
    </node>
    <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="6699733160349393181">
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6699733160349393182">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.SuperConstructorInvocation" typeId="tpee.1070475587102" id="6699733160349393183">
          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i82i.~Task$Backgroundable%d&lt;init&gt;(com%dintellij%dopenapi%dproject%dProject,java%dlang%dString,boolean,com%dintellij%dopenapi%dprogress%dPerformInBackgroundOption)" resolveInfo="Task.Backgroundable" />
          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6699733160349393184">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393220" resolveInfo="project" />
          </node>
          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6699733160349393185">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393223" resolveInfo="title" />
          </node>
          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="6699733160349393186">
            <property name="value" nameId="tpee.1068580123138" value="true" />
          </node>
          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6699733160349393187">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393240" resolveInfo="bgoption" />
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6699733160349393188">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="6699733160349393189">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6699733160349393190">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393226" resolveInfo="scripts" />
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6699733160349393191">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="6699733160349393192" />
              <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="6699733160349393193">
                <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="6699733160349393256" resolveInfo="myScripts" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6699733160349393194">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="6699733160349393195">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6699733160349393196">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393229" resolveInfo="scrName" />
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6699733160349393197">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="6699733160349393198" />
              <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="6699733160349393199">
                <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="6699733160349393260" resolveInfo="myScrName" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6699733160349393200">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="6699733160349393201">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6699733160349393202">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393231" resolveInfo="clInput" />
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6699733160349393203">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="6699733160349393204" />
              <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="6699733160349393205">
                <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="6699733160349393263" resolveInfo="myClInput" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6699733160349393206">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="6699733160349393207">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6699733160349393208">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393236" resolveInfo="ctl" />
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6699733160349393209">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="6699733160349393210" />
              <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="6699733160349393211">
                <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="6699733160349393273" resolveInfo="myController" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6699733160349393212">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="6699733160349393213">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6699733160349393214">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6699733160349393238" resolveInfo="mh" />
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6699733160349393215">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="6699733160349393216" />
              <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="6699733160349393217">
                <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="6699733160349393276" resolveInfo="myMessageHandler" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="6699733160349393218" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="6699733160349393219" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6699733160349393220">
        <property name="name" nameId="tpck.1169194664001" value="project" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349393221">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="27v0.~Project" resolveInfo="Project" />
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="6699733160349393222">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="r27b.~Nullable" resolveInfo="Nullable" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6699733160349393223">
        <property name="name" nameId="tpck.1169194664001" value="title" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349393224">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" resolveInfo="String" />
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="6699733160349393225">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="r27b.~NotNull" resolveInfo="NotNull" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6699733160349393226">
        <property name="name" nameId="tpck.1169194664001" value="scripts" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="6699733160349393227">
          <node role="elementType" roleId="tp2q.1151689745422" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349393228">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6168415856807657227" resolveInfo="IScript" />
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6699733160349393229">
        <property name="name" nameId="tpck.1169194664001" value="scrName" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="6699733160349393230" />
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6699733160349393231">
        <property name="name" nameId="tpck.1169194664001" value="clInput" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="6699733160349393232">
          <node role="elementType" roleId="tp2q.1151689745422" type="tpee.UpperBoundType" typeId="tpee.1171903916106" id="6699733160349393233">
            <node role="bound" roleId="tpee.1171903916107" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="6699733160349393234">
              <node role="elementType" roleId="tp2q.1151689745422" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349393235">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="yo81.6168415856807657256" resolveInfo="IResource" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6699733160349393236">
        <property name="name" nameId="tpck.1169194664001" value="ctl" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349393237">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.4648565975300663454" resolveInfo="IScriptController" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6699733160349393238">
        <property name="name" nameId="tpck.1169194664001" value="mh" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349393239">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cfml.~IMessageHandler" resolveInfo="IMessageHandler" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6699733160349393240">
        <property name="name" nameId="tpck.1169194664001" value="bgoption" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349393241">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i82i.~PerformInBackgroundOption" resolveInfo="PerformInBackgroundOption" />
        </node>
      </node>
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="6699733160349393242">
      <property name="name" nameId="tpck.1169194664001" value="myLatch" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="6699733160349393243" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349393244">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="53gy.~CountDownLatch" resolveInfo="CountDownLatch" />
      </node>
      <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="6699733160349393245">
        <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="6699733160349393246">
          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="53gy.~CountDownLatch%d&lt;init&gt;(int)" resolveInfo="CountDownLatch" />
          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="6699733160349393247">
            <property name="value" nameId="tpee.1068580320021" value="1" />
          </node>
        </node>
      </node>
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="6699733160349393248">
      <property name="name" nameId="tpck.1169194664001" value="myState" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="6699733160349393249" />
      <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="6699733160349393250">
        <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="6699733160349393251">
          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="vft3.~AtomicReference%d&lt;init&gt;(java%dlang%dObject)" resolveInfo="AtomicReference" />
          <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349393252">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="6699733160349393281" resolveInfo="MakeTask.TaskState" />
          </node>
          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="6699733160349393253">
            <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="6699733160349393286" resolveInfo="NOT_STARTED" />
            <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="6699733160349393281" resolveInfo="MakeTask.TaskState" />
          </node>
        </node>
      </node>
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349393254">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vft3.~AtomicReference" resolveInfo="AtomicReference" />
        <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349393255">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="6699733160349393281" resolveInfo="MakeTask.TaskState" />
        </node>
      </node>
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="6699733160349393256">
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <property name="name" nameId="tpck.1169194664001" value="myScripts" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="6699733160349393257" />
      <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="6699733160349393258">
        <node role="elementType" roleId="tp2q.1151689745422" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349393259">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6168415856807657227" resolveInfo="IScript" />
        </node>
      </node>
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="6699733160349393260">
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <property name="name" nameId="tpck.1169194664001" value="myScrName" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="6699733160349393261" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="6699733160349393262" />
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="6699733160349393263">
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <property name="name" nameId="tpck.1169194664001" value="myClInput" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="6699733160349393264" />
      <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="6699733160349393265">
        <node role="elementType" roleId="tp2q.1151689745422" type="tpee.UpperBoundType" typeId="tpee.1171903916106" id="6699733160349393266">
          <node role="bound" roleId="tpee.1171903916107" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="6699733160349393267">
            <node role="elementType" roleId="tp2q.1151689745422" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349393268">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="yo81.6168415856807657256" resolveInfo="IResource" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="6699733160349393269">
      <property name="isFinal" nameId="tpee.1176718929932" value="false" />
      <property name="name" nameId="tpck.1169194664001" value="myResult" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="6699733160349393270" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349393271">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.1291978361072214397" resolveInfo="IResult" />
      </node>
      <node role="initializer" roleId="tpee.1068431790190" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="6699733160349393272" />
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="6699733160349393273">
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <property name="name" nameId="tpck.1169194664001" value="myController" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="6699733160349393274" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349393275">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.4648565975300663454" resolveInfo="IScriptController" />
      </node>
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="6699733160349393276">
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <property name="name" nameId="tpck.1169194664001" value="myMessageHandler" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="6699733160349393277" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349393278">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cfml.~IMessageHandler" resolveInfo="IMessageHandler" />
      </node>
    </node>
    <node role="implementedInterface" roleId="tpee.1095933932569" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349393279">
      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="53gy.~Future" resolveInfo="Future" />
      <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349393280">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.1291978361072214397" resolveInfo="IResult" />
      </node>
    </node>
    <node role="staticInnerClassifiers" roleId="tpee.1178616825527" type="tpee.EnumClass" typeId="tpee.1083245097125" id="6699733160349393281">
      <property name="nonStatic" nameId="tpee.521412098689998745" value="false" />
      <property name="name" nameId="tpck.1169194664001" value="TaskState" />
      <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="6699733160349393282">
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="6699733160349393283" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="6699733160349393284" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6699733160349393285" />
      </node>
      <node role="enumConstant" roleId="tpee.1083245396908" type="tpee.EnumConstantDeclaration" typeId="tpee.1083245299891" id="6699733160349393286">
        <property name="name" nameId="tpck.1169194664001" value="NOT_STARTED" />
        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6699733160349393282" resolveInfo="MakeTask.TaskState" />
      </node>
      <node role="enumConstant" roleId="tpee.1083245396908" type="tpee.EnumConstantDeclaration" typeId="tpee.1083245299891" id="6699733160349393287">
        <property name="name" nameId="tpck.1169194664001" value="RUNNING" />
        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6699733160349393282" resolveInfo="MakeTask.TaskState" />
      </node>
      <node role="enumConstant" roleId="tpee.1083245396908" type="tpee.EnumConstantDeclaration" typeId="tpee.1083245299891" id="6699733160349393288">
        <property name="name" nameId="tpck.1169194664001" value="DONE" />
        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6699733160349393282" resolveInfo="MakeTask.TaskState" />
      </node>
      <node role="enumConstant" roleId="tpee.1083245396908" type="tpee.EnumConstantDeclaration" typeId="tpee.1083245299891" id="6699733160349393289">
        <property name="name" nameId="tpck.1169194664001" value="CANCELLED" />
        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6699733160349393282" resolveInfo="MakeTask.TaskState" />
      </node>
      <node role="enumConstant" roleId="tpee.1083245396908" type="tpee.EnumConstantDeclaration" typeId="tpee.1083245299891" id="6699733160349393290">
        <property name="name" nameId="tpck.1169194664001" value="INDETERMINATE" />
        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6699733160349393282" resolveInfo="MakeTask.TaskState" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="6699733160349393291" />
    </node>
  </root>
</model>


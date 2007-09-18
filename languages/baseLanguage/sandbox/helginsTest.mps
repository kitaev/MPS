<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.baseLanguage.sandbox.helginsTest">
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.bootstrap.helgins" />
  <language namespace="jetbrains.mps.core" />
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <language namespace="jetbrains.mps.transformation.TLBase" />
  <maxImportIndex value="6" />
  <import index="1" modelUID="java.util@java_stub" />
  <import index="2" modelUID="java.lang@java_stub" />
  <import index="3" modelUID="java.io@java_stub" />
  <import index="4" modelUID="jetbrains.mps.baseLanguage.structure@java_stub" />
  <import index="5" modelUID="jetbrains.mps.smodel@java_stub" />
  <import index="6" modelUID="jetbrains.mps.baseLanguage.structure" />
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1182952452380">
    <property name="name" value="TestHelgins" />
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1182952459350">
      <property name="name" value="aaa" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1182952459351" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1182952459352" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1182952459353">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1182952462716">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1182952462717">
            <property name="name" value="bbb" />
            <node role="type" type="jetbrains.mps.baseLanguage.IntegerType" id="1182952462718" />
            <node role="helginsJudgement$attribute" type="jetbrains.mps.bootstrap.helgins.HelginsJudgement" id="1188945652617">
              <node role="type" type="jetbrains.mps.baseLanguage.IntegerType" id="1188945681698" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1182952465956">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1182952465957">
            <property name="name" value="ccc" />
            <node role="type" type="jetbrains.mps.baseLanguage.IntegerType" id="1182952465958" />
            <node role="helginsJudgement$attribute" type="jetbrains.mps.bootstrap.helgins.HelginsJudgement" id="1182952471600">
              <node role="term" type="jetbrains.mps.core.BaseConcept" id="1182952471601" />
              <node role="type" type="jetbrains.mps.baseLanguage.IntegerType" id="1182952491607" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1182959036465">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1182959036466">
            <property name="name" value="m1" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1182959036467">
              <link role="classifier" extResolveInfo="1.[Classifier]Map" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1182959064047">
                <link role="classifier" extResolveInfo="2.[Classifier]String" />
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1182959092835">
                <link role="classifier" extResolveInfo="1.[Classifier]List" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1182959097999">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1182959121938">
            <link role="baseMethodDeclaration" extResolveInfo="1.method ([Classifier]Map).([InstanceMethodDeclaration]get((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Object])) : (jetbrains.mps.baseLanguage.types.any/jetbrains.mps.baseLanguage.types.any))" />
            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1182959098000">
              <link role="variableDeclaration" targetNodeId="1182959036466" resolveInfo="m1" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.StringLiteral" id="1182959123775">
              <property name="value" value="" />
            </node>
            <node role="helginsJudgement$attribute" type="jetbrains.mps.bootstrap.helgins.HelginsJudgement" id="1182959130050">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1182959141905">
                <link role="classifier" extResolveInfo="1.[Classifier]List" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1182959154505">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1182959154506">
            <property name="name" value="m2" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1182959154507">
              <link role="classifier" extResolveInfo="1.[Classifier]Map" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1182959159199">
                <link role="classifier" extResolveInfo="2.[Classifier]String" />
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1182959162712">
                <link role="classifier" extResolveInfo="1.[Classifier]List" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1182959170517">
                  <link role="classifier" extResolveInfo="2.[Classifier]String" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1182959175865">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1182959186943">
            <link role="baseMethodDeclaration" extResolveInfo="1.method ([Classifier]List).([InstanceMethodDeclaration]get((jetbrains.mps.baseLanguage.types.int/jetbrains.mps.baseLanguage.types.int)) : (jetbrains.mps.baseLanguage.types.any/jetbrains.mps.baseLanguage.types.any))" />
            <node role="instance" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1182959180324">
              <link role="baseMethodDeclaration" extResolveInfo="1.method ([Classifier]Map).([InstanceMethodDeclaration]get((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Object])) : (jetbrains.mps.baseLanguage.types.any/jetbrains.mps.baseLanguage.types.any))" />
              <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1182959175866">
                <link role="variableDeclaration" targetNodeId="1182959154506" resolveInfo="m2" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.StringLiteral" id="1182959183555">
                <property name="value" value="" />
              </node>
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1182959189350">
              <property name="value" value="0" />
            </node>
            <node role="helginsJudgement$attribute" type="jetbrains.mps.bootstrap.helgins.HelginsJudgement" id="1182959200570">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1182959204321">
                <link role="classifier" extResolveInfo="2.[Classifier]String" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1185976309337">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1185976309338">
            <property name="name" value="node1" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1185976309339">
              <link role="classifier" extResolveInfo="5.[Classifier]SNode" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1185976224121">
          <node role="expression" type="jetbrains.mps.baseLanguage.TernaryOperatorExpression" id="1185976225185">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.NewExpression" id="1185976231611">
              <link role="baseMethodDeclaration" extResolveInfo="4.constructor [Classifier]ClassConcept[ConstructorDeclaration] ((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode]))" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1185976314778">
                <link role="variableDeclaration" targetNodeId="1185976309338" resolveInfo="node1" />
              </node>
            </node>
            <node role="ifFalse" type="jetbrains.mps.baseLanguage.NewExpression" id="1185976317810">
              <link role="baseMethodDeclaration" extResolveInfo="4.constructor [Classifier]Interface[ConstructorDeclaration] ((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode]))" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1185976323878">
                <link role="variableDeclaration" targetNodeId="1185976309338" resolveInfo="node1" />
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1185976224122">
              <property name="value" value="true" />
            </node>
            <node role="helginsJudgement$attribute" type="jetbrains.mps.bootstrap.helgins.HelginsJudgement" id="1185976332629">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1185976341334">
                <link role="classifier" extResolveInfo="4.[Classifier]Classifier" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1183121968326">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1183121968327">
            <property name="name" value="s" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1183121968328">
              <link role="classifier" extResolveInfo="2.[Classifier]String" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1185980227759">
          <node role="expression" type="jetbrains.mps.baseLanguage.EnumConstantReference" id="1185980230104">
            <link role="enumConstantDeclaration" targetNodeId="1185980183785" resolveInfo="e1" />
            <link role="enumClass" targetNodeId="1185980179658" resolveInfo="E" />
            <node role="helginsJudgement$attribute" type="jetbrains.mps.bootstrap.helgins.HelginsJudgement" id="1185980305329">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1185980349504">
                <link role="classifier" targetNodeId="1185980179658" resolveInfo="E" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1185980364443">
          <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1185980364477">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1185980365793">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1185980367187">
                <property name="value" value="4" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1185980365730">
                <property name="value" value="3" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1185980364444">
              <property name="value" value="2" />
            </node>
            <node role="helginsJudgement$attribute" type="jetbrains.mps.bootstrap.helgins.HelginsJudgement" id="1185980374469">
              <node role="type" type="jetbrains.mps.baseLanguage.IntegerType" id="1185980377236" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1185980393379">
          <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1185980393397">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1185980395119">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1185980396419">
                <property name="value" value="" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1185980395056">
                <property name="value" value="3" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1185980393380">
              <property name="value" value="2" />
            </node>
            <node role="helginsJudgement$attribute" type="jetbrains.mps.bootstrap.helgins.HelginsJudgement" id="1185980405701">
              <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1185980408750">
                <link role="classifier" extResolveInfo="2.[Classifier]String" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1185981078590">
          <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1185981078591">
            <property name="value" value="true" />
            <node role="helginsJudgement$attribute" type="jetbrains.mps.bootstrap.helgins.HelginsJudgement" id="1185981081045">
              <node role="type" type="jetbrains.mps.baseLanguage.BooleanType" id="1185981152870" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1188914216787">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1188914216788">
            <property name="name" value="c" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1188914216789">
              <link role="classifier" extResolveInfo="2.[Classifier]Comparable" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1188914209922">
          <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1188914209923">
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1188914243494">
              <link role="classifier" extResolveInfo="2.[Classifier]Iterable" />
            </node>
            <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1188914225102">
              <link role="variableDeclaration" targetNodeId="1188914216788" resolveInfo="c" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1183121979332">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1183121979333">
            <property name="name" value="n" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1183121979334">
              <link role="classifier" extResolveInfo="1.[Classifier]Map" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1183121987992">
                <link role="classifier" extResolveInfo="2.[Classifier]String" />
              </node>
              <node role="parameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1183121992416">
                <link role="classifier" extResolveInfo="2.[Classifier]String" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1182952452381" />
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1183122071960">
    <property name="name" value="U" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.ConstructorDeclaration" id="1185360731742">
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1185360731743" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1185360731744" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1185360731745">
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1185365383359">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1185442616460">
            <link role="baseMethodDeclaration" extResolveInfo="3.method ([Classifier]PrintStream).([InstanceMethodDeclaration]print((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Object])) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
            <node role="instance" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1185365383360">
              <link role="classifier" extResolveInfo="2.[Classifier]System" />
              <link role="variableDeclaration" extResolveInfo="2.static field ([Classifier]System).([StaticFieldDeclaration]out : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [PrintStream]))" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.StringLiteral" id="1185442641191">
              <property name="value" value="" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1185442656146">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1185442660884">
            <link role="baseMethodDeclaration" extResolveInfo="3.method ([Classifier]PrintStream).([InstanceMethodDeclaration]print((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Object])) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
            <node role="instance" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1185442656147">
              <link role="classifier" extResolveInfo="2.[Classifier]System" />
              <link role="variableDeclaration" extResolveInfo="2.static field ([Classifier]System).([StaticFieldDeclaration]out : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [PrintStream]))" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.StringLiteral" id="1185442664276">
              <property name="value" value="" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.FieldDeclaration" id="1185360671325">
      <property name="name" value="myW" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1185360675015" />
      <node role="type" type="jetbrains.mps.baseLanguage.IntegerType" id="1185360699173" />
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1183122071961" />
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1185360719518">
    <property name="name" value="W" />
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1185360727395">
      <property name="name" value="foo" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1185360727396" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1185360727397" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1185360727398">
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1185360738035">
          <node role="expression" type="jetbrains.mps.baseLanguage.FieldReference" id="1185360744874">
            <link role="variableDeclaration" targetNodeId="1185360671325" resolveInfo="myW" />
            <node role="instance" type="jetbrains.mps.baseLanguage.NewExpression" id="1185360738036">
              <link role="baseMethodDeclaration" targetNodeId="1185360731742" resolveInfo="U" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1185360719519" />
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1185362000191">
    <property name="name" value="V" />
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1185362004584">
      <property name="name" value="foo" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.IntegerType" id="1185362033382" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1185362004586" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1185362004587">
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1185362044190">
          <node role="expression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1185362044191">
            <property name="value" value="" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1185362038249">
          <node role="expression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1185362038250">
            <property name="value" value="3" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1185959725429">
          <node role="expression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1185959725430">
            <property name="value" value="" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1185959709371">
          <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1185959709670">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1185959711080">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1185959712865">
                <property name="value" value="34" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1185959711001">
                <property name="value" value="3" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1185959709372">
              <property name="value" value="2" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1188997568460">
          <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1188997579930">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1188997594777">
              <property name="value" value="3" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1188997568461">
              <property name="value" value="2" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1188997633685">
          <node role="expression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1188997633686">
            <property name="value" value="4" />
          </node>
        </node>
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1185362000192" />
  </node>
  <node type="jetbrains.mps.baseLanguage.EnumClass" id="1185980179658">
    <property name="name" value="E" />
    <node role="enumConstant" type="jetbrains.mps.baseLanguage.EnumConstantDeclaration" id="1185980183785">
      <property name="name" value="e1" />
    </node>
    <node role="enumConstant" type="jetbrains.mps.baseLanguage.EnumConstantDeclaration" id="1185980186583">
      <property name="name" value="e2" />
    </node>
    <node role="enumConstant" type="jetbrains.mps.baseLanguage.EnumConstantDeclaration" id="1185980188678">
      <property name="name" value="e3" />
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1185980179659" />
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1186051408113">
    <property name="name" value="CollectionsHelginsTest" />
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1186051417381">
      <property name="name" value="foo" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1186051417382" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1186051417383" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1186051417384">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1186051436244">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1186051436245">
            <property name="name" value="modelDescriptors" />
            <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.ListType" id="1186051436246">
              <node role="elementType" type="jetbrains.mps.baseLanguage.ClassifierType" id="1186051436247">
                <link role="classifier" extResolveInfo="5.[Classifier]SModelDescriptor" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1186051491169">
          <node role="expression" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1186051436251">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1186051436252">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1186051436253">
                <link role="variableDeclaration" targetNodeId="1186051436245" resolveInfo="modelDescriptors" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.SelectOperation" id="1186051436254">
                <node role="selector" type="jetbrains.mps.baseLanguage.ext.collections.lang.SelectorBlock" id="1186051436255">
                  <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.DefaultInputElement" id="1186051436256">
                    <property name="name" value="it" />
                  </node>
                  <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1186051436257">
                    <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1186051436258">
                      <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1186051436259">
                        <link role="baseMethodDeclaration" extResolveInfo="5.method ([Classifier]SModelDescriptor).([InstanceMethodDeclaration]getSModel() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SModel]))" />
                        <node role="instance" type="jetbrains.mps.baseLanguage.ClosureParameterReference" id="1186051436260">
                          <link role="closureParameter" targetNodeId="1186051436256" resolveInfo="it" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.ToListOperation" id="1186051436261" />
          </node>
        </node>
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1186051408114" />
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1188945707402">
    <property name="name" value="GenericParm_base" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.ConstructorDeclaration" id="1188945893035">
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1188945893036" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1188945893037" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1188945893038" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1188945753531">
      <property name="name" value="m" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.TypeVariableReference" id="1188947202242">
        <link role="typeVariableDeclaration" targetNodeId="1188945747827" resolveInfo="T" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1188945753533" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1188945753534">
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1188947205696">
          <node role="expression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1188947207839" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1188945759394">
        <property name="name" value="t" />
        <node role="type" type="jetbrains.mps.baseLanguage.TypeVariableReference" id="1188945759395">
          <link role="typeVariableDeclaration" targetNodeId="1188945747827" resolveInfo="T" />
        </node>
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1188945707403" />
    <node role="typeVariableDeclaration" type="jetbrains.mps.baseLanguage.TypeVariableDeclaration" id="1188945747827">
      <property name="name" value="T" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1188945773006">
    <property name="name" value="GenericParm" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.ConstructorDeclaration" id="1188945821081">
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1188945821082" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1188945821083" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1188945821084" />
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1188945803970">
      <property name="name" value="test" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1188945803971" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1188945803972" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1188945803973">
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1188945809974">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1188945843055">
            <link role="baseMethodDeclaration" targetNodeId="1188945793151" resolveInfo="m" />
            <node role="instance" type="jetbrains.mps.baseLanguage.ParenthesizedExpression" id="1188945809975">
              <node role="expression" type="jetbrains.mps.baseLanguage.NewExpression" id="1188945812914">
                <link role="baseMethodDeclaration" targetNodeId="1188945821081" resolveInfo="GenericParm" />
              </node>
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.StringLiteral" id="1188945845400">
              <property name="value" value="" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1188945865589">
          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1188945865590">
            <link role="baseMethodDeclaration" targetNodeId="1188945753531" resolveInfo="m" />
            <node role="instance" type="jetbrains.mps.baseLanguage.ParenthesizedExpression" id="1188945865591">
              <node role="expression" type="jetbrains.mps.baseLanguage.NewExpression" id="1188945865592">
                <link role="baseMethodDeclaration" targetNodeId="1188945893035" resolveInfo="GenericParm_base" />
                <node role="typeParameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1188949374782">
                  <link role="classifier" extResolveInfo="2.[Classifier]String" />
                </node>
              </node>
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.StringLiteral" id="1188945865593">
              <property name="value" value="" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1188952448412">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1188952448413">
            <property name="name" value="list" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1188952448414">
              <link role="classifier" extResolveInfo="1.[Classifier]List" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1188952457448">
                <link role="classifier" extResolveInfo="2.[Classifier]String" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1188952441271">
              <link role="baseMethodDeclaration" extResolveInfo="1.static method ([Classifier]Collections).([StaticMethodDeclaration]emptyList())" />
              <link role="classConcept" extResolveInfo="1.[Classifier]Collections" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1188945793151">
      <property name="name" value="m" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassifierType" id="1188949351199">
        <link role="classifier" extResolveInfo="2.[Classifier]String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1188945793153" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1188945793154">
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1188949354591">
          <node role="expression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1188949356624" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1188945799655">
        <property name="name" value="s" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1188945799656">
          <link role="classifier" extResolveInfo="2.[Classifier]String" />
        </node>
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1188945773007" />
    <node role="superclass" type="jetbrains.mps.baseLanguage.ClassifierType" id="1188945783977">
      <link role="classifier" targetNodeId="1188945707402" resolveInfo="GenericParm_base" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1188945790604">
        <link role="classifier" extResolveInfo="2.[Classifier]String" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.transformation.TLBase.TemplateDeclaration" id="1190107724478">
    <property name="name" value="Test" />
    <link role="applicableConcept" targetNodeId="6.1068580123136" />
    <node role="contentNode" type="jetbrains.mps.baseLanguage.StatementList" id="1190107741339">
      <node role="templateFragment$attribute" type="jetbrains.mps.transformation.TLBase.TemplateFragment" id="1190107747840" />
      <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1190107797234">
        <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1190107804310">
          <link role="baseMethodDeclaration" extResolveInfo="3.method ([Classifier]PrintStream).([InstanceMethodDeclaration]println((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String])))" />
          <node role="instance" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1190107797235">
            <link role="classifier" extResolveInfo="2.[Classifier]System" />
            <link role="variableDeclaration" extResolveInfo="2.static field ([Classifier]System).([StaticFieldDeclaration]out : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [PrintStream]))" />
          </node>
          <node role="nodeMacro$attribute" type="jetbrains.mps.transformation.TLBase.LoopMacro" id="1190108405218">
            <node role="sourceNodesQuery" type="jetbrains.mps.transformation.TLBase.SourceSubstituteMacro_SourceNodesQuery" id="1190108405219">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1190108405220">
                <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1190108492147">
                  <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1190108495258">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1190108497902">
                      <link role="link" targetNodeId="6.1068581517665" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.transformation.TLBase.TemplateFunctionParameter_sourceNode" id="1190108492148" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="actualArgument" type="jetbrains.mps.baseLanguage.StringLiteral" id="1190108418924">
            <property name="value" value="sds" />
            <node role="propertyMacro$property_attribute$value" type="jetbrains.mps.transformation.TLBase.PropertyMacro" id="1190108428378">
              <link role="property" targetNodeId="6.1070475926801" />
              <node role="propertyValueFunction" type="jetbrains.mps.transformation.TLBase.PropertyMacro_GetPropertyValue" id="1190108428379">
                <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1190108428380">
                  <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1190108506137">
                    <node role="expression" type="jetbrains.mps.transformation.TLBase.TemplateFunctionParameter_sourceNode" id="1190108506138" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>


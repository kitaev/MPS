<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.baseLanguage.sandbox.helginsTest">
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.bootstrap.helgins" />
  <language namespace="jetbrains.mps.core" />
  <maxImportIndex value="3" />
  <import index="1" modelUID="java.util@java_stub" />
  <import index="2" modelUID="java.lang@java_stub" />
  <import index="3" modelUID="java.io@java_stub" />
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
            <node role="helginsJudgement$attribute" type="jetbrains.mps.bootstrap.helgins.HelginsJudgement" id="1182952482728">
              <node role="term" type="jetbrains.mps.core.BaseConcept" id="1182952482729" />
              <node role="type" type="jetbrains.mps.baseLanguage.IntegerType" id="1182952489153" />
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
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1183121968326">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1183121968327">
            <property name="name" value="s" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1183121968328">
              <link role="classifier" extResolveInfo="2.[Classifier]String" />
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
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1185362000192" />
  </node>
</model>


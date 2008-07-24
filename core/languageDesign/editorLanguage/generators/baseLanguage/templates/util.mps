<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.bootstrap.editorLanguage.generator.baseLanguage.template.util">
  <persistence version="1" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.constraints" version="83" />
    <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.constraints" version="21" />
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.constraints" version="6" />
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="1" />
  </language>
  <language namespace="jetbrains.mps.transformation.generationContext" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.constraintsLanguage.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.editorLanguage.constraints" version="21" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.structureLanguage.constraints" version="11" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.sharedConcepts.constraints" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.core.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.internal.collections.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.editorLanguage.structure" version="25" />
  <languageAspect modelUID="jetbrains.mps.transformation.TLBase.constraints" version="16" />
  <languageAspect modelUID="jetbrains.mps.transformation.TLBase.structure" version="1" />
  <maxImportIndex value="14" />
  <import index="1" modelUID="jetbrains.mps.generator.template@java_stub" version="-1" />
  <import index="3" modelUID="jetbrains.mps.bootstrap.editorLanguage.structure" version="25" />
  <import index="5" modelUID="java.lang@java_stub" version="-1" />
  <import index="6" modelUID="jetbrains.mps.core.structure" version="-1" />
  <import index="7" modelUID="jetbrains.mps.smodel@java_stub" version="-1" />
  <import index="9" modelUID="jetbrains.mps.util@java_stub" version="-1" />
  <import index="10" modelUID="jetbrains.mps.nodeEditor.cellProviders@java_stub" version="-1" />
  <import index="14" modelUID="jetbrains.mps.bootstrap.editorLanguage.generator.baseLanguage.template.main@templates" version="-1" />
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1186771508849">
    <property name="name" value="QueriesUtil" />
    <node role="staticField" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration" id="1210358696034">
      <property name="name" value="CELL_READABLE_ID" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1210358696035" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210358699882">
        <link role="classifier" targetNodeId="5.~Object" resolveInfo="Object" />
      </node>
      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1212794635592">
        <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1212794635594">
          <link role="baseMethodDeclaration" targetNodeId="5.~Object.&lt;init&gt;()" resolveInfo="Object" />
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1212794206564">
      <property name="name" value="getProviderClassNameForCellWithRole" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1212794212412">
        <link role="classifier" targetNodeId="5.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1212794206566" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1212794206567">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1212794442177">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1212794442178">
            <property name="name" value="conceptFqName" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1212794442179">
              <link role="classifier" targetNodeId="5.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1212794442180">
              <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1212794442181">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1212794442182">
                  <link role="variableDeclaration" targetNodeId="1212794236741" resolveInfo="node" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1212794442183">
                <link role="baseMethodDeclaration" targetNodeId="7.~SNode.getConceptFqName():java.lang.String" resolveInfo="getConceptFqName" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1212794530704">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1212794530705">
            <property name="name" value="something" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1212794530706">
              <link role="classifier" targetNodeId="5.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1212794530707">
              <link role="baseMethodDeclaration" targetNodeId="9.~NameUtil.removeStructureFromFqName(java.lang.String):java.lang.String" resolveInfo="removeStructureFromFqName" />
              <link role="classConcept" targetNodeId="9.~NameUtil" resolveInfo="NameUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1212794530708">
                <link role="variableDeclaration" targetNodeId="1212794442178" resolveInfo="conceptFqName" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1212794627449">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1212794627450">
            <link role="baseMethodDeclaration" targetNodeId="10.~CellProviderNameUtil.getProviderClassName(java.lang.String):java.lang.String" resolveInfo="getProviderClassName" />
            <link role="classConcept" targetNodeId="10.~CellProviderNameUtil" resolveInfo="CellProviderNameUtil" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1212794627451">
              <link role="variableDeclaration" targetNodeId="1212794530705" resolveInfo="something" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1212794236741">
        <property name="name" value="node" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1212794236742">
          <link role="concept" targetNodeId="3.1139848536355" resolveInfo="CellModel_WithRole" />
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1186771518038">
      <property name="name" value="getGeneratedClassByContainingRoot" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1186771523542" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1186771518040" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1186771518041">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1186771602770">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1186771602771">
            <property name="name" value="containingRoot" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1186771602772" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227894462">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1186771587249">
                <link role="variableDeclaration" targetNodeId="1186771576684" resolveInfo="inputNode" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetContainingRootOperation" id="1186771598035" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1216920016544">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216920024594">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1216920022296">
              <link role="variableDeclaration" targetNodeId="1216919983462" resolveInfo="genctx" />
            </node>
            <node role="operation" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetOutputByLabelAndInput" id="1216920028832">
              <link role="label" targetNodeId="14.1215475930256" resolveInfo="generatedClass" />
              <node role="inputNode" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1216920312306">
                <link role="variableDeclaration" targetNodeId="1186771602771" resolveInfo="containingRoot" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1186771576684">
        <property name="name" value="inputNode" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1186771576685" />
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1216919983462">
        <property name="name" value="genctx" />
        <node role="type" type="jetbrains.mps.transformation.generationContext.structure.GenerationContextType" id="1216919988605" />
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1186773435542">
      <property name="name" value="getGeneratedClassByCellContainer" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1186773443483" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1186773435544" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1186773435545">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1186773834833">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227939604">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227895850">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1186773840227">
                <link role="variableDeclaration" targetNodeId="1186773722859" resolveInfo="inputCellModel" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1186773856949" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1186773860860">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1186773886237">
                <link role="conceptDeclaration" targetNodeId="3.1073390211982" />
              </node>
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1186773834835">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1186773915894">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227890953">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1186773921631">
                  <link role="variableDeclaration" targetNodeId="1186773722859" resolveInfo="inputCellModel" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsRoleOperation" id="1186773931291">
                  <link role="conceptOfParent" targetNodeId="3.1073390211982" />
                  <link role="linkInParent" targetNodeId="3.1140524464359" />
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1186773915896">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1186773976121">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208995329079">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1186773976125">
                      <link role="variableDeclaration" targetNodeId="1186773787502" resolveInfo="generator" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208995329080">
                      <link role="baseMethodDeclaration" targetNodeId="1.~ITemplateGenerator.findOutputNodeByInputNodeAndMappingName(jetbrains.mps.smodel.SNode,java.lang.String):jetbrains.mps.smodel.SNode" resolveInfo="findOutputNodeByInputNodeAndMappingName" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227890028">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1186774967964">
                          <link role="variableDeclaration" targetNodeId="1186773722859" resolveInfo="inputCellModel" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1186774967963" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1186773976124">
                        <property name="value" value="nodeListHandler" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1186775053216">
          <property name="value" value="otherwise get 'generatedClass' by enclosing 'editor component'" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1186775150069">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1186775150070">
            <property name="name" value="ancestor" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1186775150071">
              <link role="concept" targetNodeId="3.1080736578640" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227913967">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1186775112891">
                <link role="variableDeclaration" targetNodeId="1186773722859" resolveInfo="inputCellModel" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1186775118223">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1186775123865">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1208995357732">
                    <link role="conceptDeclaration" targetNodeId="3.1080736578640" resolveInfo="BaseEditorComponent" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1186775156401">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208995332348">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1186775166002">
              <link role="variableDeclaration" targetNodeId="1186773787502" resolveInfo="generator" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208995332349">
              <link role="baseMethodDeclaration" targetNodeId="1.~ITemplateGenerator.findOutputNodeByInputNodeAndMappingName(jetbrains.mps.smodel.SNode,java.lang.String):jetbrains.mps.smodel.SNode" resolveInfo="findOutputNodeByInputNodeAndMappingName" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1186775185425">
                <link role="variableDeclaration" targetNodeId="1186775150070" resolveInfo="ancestor" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1186775166001">
                <property name="value" value="generatedClass" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1186773722859">
        <property name="name" value="inputCellModel" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1186773722860">
          <link role="concept" targetNodeId="3.1073389214265" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1186773787502">
        <property name="name" value="generator" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1186773795832">
          <link role="classifier" targetNodeId="1.~ITemplateGenerator" resolveInfo="ITemplateGenerator" />
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1186775920903">
      <property name="name" value="getGeneratedClassByAncestor" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1186775920904" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1186775920905" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1186775920906">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1186776238853">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1186776238854">
            <property name="name" value="ancestors" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1186776238855" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227842350">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1186775953339">
                <link role="variableDeclaration" targetNodeId="1186775920918" resolveInfo="inputNode" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorsOperation" id="1186775959593" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1186776253122">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1186776253123">
            <property name="name" value="outputClasses" />
            <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType" id="1186776253124">
              <node role="elementType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1186776253125" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208995339510">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1186776238856">
                <link role="variableDeclaration" targetNodeId="1186776238854" resolveInfo="ancestors" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.MappingOperation" id="1186776072208">
                <node role="mapper" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.MapperBlock" id="1186776072209">
                  <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.DefaultInputElement" id="1186776072210">
                    <property name="name" value="it" />
                  </node>
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1186776072211">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1186776164209">
                      <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1186776164210">
                        <property name="name" value="output" />
                        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1186776171056" />
                        <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208995333956">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1186776082370">
                            <link role="variableDeclaration" targetNodeId="1186775920920" resolveInfo="generator" />
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208995333957">
                            <link role="baseMethodDeclaration" targetNodeId="1.~ITemplateGenerator.findOutputNodeByInputNodeAndMappingName(jetbrains.mps.smodel.SNode,java.lang.String):jetbrains.mps.smodel.SNode" resolveInfo="findOutputNodeByInputNodeAndMappingName" />
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1186776097186">
                              <link role="closureParameter" targetNodeId="1186776072210" resolveInfo="it" />
                            </node>
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1186776106626">
                              <property name="value" value="generatedClass" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1186776176995">
                      <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1186776176996">
                        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.TraversalYieldStatement" id="1186776211051">
                          <node role="value" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1186776212881">
                            <link role="variableDeclaration" targetNodeId="1186776164210" resolveInfo="output" />
                          </node>
                        </node>
                        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.TraversalStopStatement" id="1186776216961" />
                      </node>
                      <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1186776183641">
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1186776185175" />
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1186776181577">
                          <link role="variableDeclaration" targetNodeId="1186776164210" resolveInfo="output" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1186776271252">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208995338460">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1186776273629">
              <link role="variableDeclaration" targetNodeId="1186776253123" resolveInfo="outputClasses" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation" id="1186776276756" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1186775920918">
        <property name="name" value="inputNode" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1186775920919" />
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1186775920920">
        <property name="name" value="generator" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1186775920921">
          <link role="classifier" targetNodeId="1.~ITemplateGenerator" resolveInfo="ITemplateGenerator" />
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1189585733348">
      <property name="name" value="keyMapActionClassName" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1189585751182">
        <link role="classifier" targetNodeId="5.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1189585733350" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1189585733351">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1189585802292">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1189585802293">
            <property name="name" value="keyMapDeclaration" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1189585802294">
              <link role="concept" targetNodeId="3.1081293058843" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1189585790873">
              <link role="concept" targetNodeId="3.1081293058843" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227890458">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1189585782073">
                  <link role="variableDeclaration" targetNodeId="1189585755476" resolveInfo="keyMapItem" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1189585787001" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1189585806715">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1189585806716">
            <property name="name" value="index" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1189585806717" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1189585810180">
              <property name="value" value="0" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1189585833182">
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1189585833183">
            <property name="name" value="curItem" />
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227849629">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1189585838693">
              <link role="variableDeclaration" targetNodeId="1189585802293" resolveInfo="keyMapDeclaration" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1189585846207">
              <link role="link" targetNodeId="3.1136930944870" />
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1189585833185">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1189585858333">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1189585858334">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.BreakStatement" id="1189585871790" />
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1189585861160">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1189585863897">
                  <link role="variableDeclaration" targetNodeId="1189585755476" resolveInfo="keyMapItem" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1189585860420">
                  <link role="variable" targetNodeId="1189585833183" resolveInfo="curItem" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1189585878566">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1189585879262">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1189585881497">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1189585882253">
                    <property name="value" value="1" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1189585880649">
                    <link role="variableDeclaration" targetNodeId="1189585806716" resolveInfo="index" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1189585878567">
                  <link role="variableDeclaration" targetNodeId="1189585806716" resolveInfo="index" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1189585967515">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1189585968515">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1189585968516">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1189585968517">
                <link role="variableDeclaration" targetNodeId="1189585806716" resolveInfo="index" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1189585968518">
                <property name="value" value="_Action" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227895558">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1189585968521">
                <link role="variableDeclaration" targetNodeId="1189585802293" resolveInfo="keyMapDeclaration" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1189585974237">
                <link role="property" targetNodeId="6.1169194664001" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1189585755476">
        <property name="name" value="keyMapItem" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1189585755477">
          <link role="concept" targetNodeId="3.1136916919141" />
        </node>
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1186771508850" />
  </node>
</model>


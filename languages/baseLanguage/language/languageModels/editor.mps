<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.baseLanguage.editor">
  <language namespace="jetbrains.mps.bootstrap.editorLanguage" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang" />
  <maxImportIndex value="52" />
  <import index="17" modelUID="jetbrains.mps.baseLanguage.structure" />
  <import index="18" modelUID="jetbrains.mps.core.structure" />
  <import index="19" modelUID="java.util@java_stub" />
  <import index="20" modelUID="jetbrains.mps.smodel@java_stub" />
  <import index="21" modelUID="jetbrains.mps.nodeEditor@java_stub" />
  <import index="22" modelUID="jetbrains.mps.baseLanguage.types@java_stub" />
  <import index="23" modelUID="javax.swing@java_stub" />
  <import index="24" modelUID="java.lang@java_stub" />
  <import index="27" modelUID="jetbrains.mps.baseLanguage.actions" />
  <import index="43" modelUID="jetbrains.mps.baseLanguage.editor" />
  <import index="44" modelUID="jetbrains.mps.baseLanguage@java_stub" />
  <import index="45" modelUID="jetbrains.mps.smodel.search@java_stub" />
  <import index="46" modelUID="jetbrains.mps.baseLanguage.search@java_stub" />
  <import index="48" modelUID="jetbrains.mps.baseLanguage.editor@java_stub" />
  <import index="49" modelUID="jetbrains.mps.baseLanguage.structure@java_stub" />
  <import index="50" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure@java_stub" />
  <import index="51" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure" />
  <import index="52" modelUID="jetbrains.mps.util@java_stub" />
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1073416106125">
    <property name="name" value="StatementList_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1068580123136" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1073416106126">
      <property name="usesFolding" value="true" />
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <property name="selectable" value="false" />
      <link role="relationDeclaration" targetNodeId="17.1068581517665" />
      <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1079958242049">
        <property name="editable" value="true" />
        <property name="nullText" value="&lt;no statements&gt;" />
        <property name="textFgColor" value="darkGray" />
        <property name="fontStyle" value="ITALIC" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1074794490343">
    <property name="name" value="ClassConcept_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1068390468198" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1074794490344">
      <property name="name" value="classBox" />
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1074794604361">
        <property name="name" value="headerRow" />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1146646520730">
          <property name="noTargetText" value="/*package*/" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1146646494462" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1074794604362">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="class" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1074794745222">
          <property name="writable" value="true" />
          <property name="defaultValue" value="&lt;no name&gt;" />
          <property name="noTargetText" value="&lt;no name&gt;" />
          <property name="drawBorder" value="false" />
          <property name="rightTransformAnchorTag" value="default_RTransform" />
          <property name="selectable" value="true" />
          <link role="relationDeclaration" targetNodeId="18.1169194664001" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1109281144581">
          <property name="drawBorder" value="false" />
          <link role="editorComponent" targetNodeId="1109280020740" />
          <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1145916139208">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1145916139209">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1145916141539">
                <node role="expression" type="jetbrains.mps.baseLanguage.GreaterThanExpression" id="1145916156296">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1145916162986">
                    <property name="value" value="0" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1145916150825">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1145916145307">
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1145916144087" />
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1145916148730">
                        <link role="link" targetNodeId="17.1109279881614" />
                      </node>
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.LinkList_GetCountOperation" id="1145916153779" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1165604179539">
          <property name="vertical" value="true" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1165604195026">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1165604195027">
              <property name="textFgColor" value="red" />
              <property name="text" value="extends (deprecated)" />
              <property name="drawBorder" value="false" />
              <property name="selectable" value="false" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1165604203737">
              <property name="noTargetText" value="&lt;none&gt;" />
              <property name="drawBorder" value="false" />
              <link role="relationDeclaration" targetNodeId="17.1069939147256" />
              <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1165604203738">
                <link role="conceptDeclaration" targetNodeId="17.1068390468198" />
                <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1165604203739">
                  <property name="drawBorder" value="false" />
                  <property name="readOnly" value="true" />
                  <link role="relationDeclaration" targetNodeId="17.1075300953595" />
                </node>
              </node>
            </node>
            <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1165625641774">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1165625641775">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1165625758869">
                  <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1165625772186">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1165625775721" />
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1165625765966">
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1165625763605" />
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1165625768092">
                        <link role="link" targetNodeId="17.1069939147256" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1165604224375">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1165604224376">
              <property name="textFgColor" value="DARK_BLUE" />
              <property name="text" value="extends" />
              <property name="drawBorder" value="false" />
              <property name="selectable" value="false" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1165604250911">
              <property name="noTargetText" value="&lt;none&gt;" />
              <property name="drawBorder" value="false" />
              <link role="relationDeclaration" targetNodeId="17.1165602531693" />
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1107798989515">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="implements" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1107798989516">
          <property name="vertical" value="true" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1095933932569" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1107798989517">
            <property name="nullText" value="&lt;none&gt;" />
            <property name="editable" value="true" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1074794745224">
          <property name="selectable" value="false" />
          <property name="text" value="{" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1128555992206">
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1128555992207">
          <property name="selectable" value="false" />
          <property name="text" value="    " />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1128555992208">
          <property name="vertical" value="true" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1128555889557" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1128555992209">
            <property name="selectable" value="true" />
            <property name="text" value=" &lt;&lt; static fields &gt;&gt;" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1074866421484">
        <property name="name" value="fieldsArea" />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1074866421485">
          <property name="text" value="    " />
          <property name="name" value="fieldsIndentCell" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1074866421486">
          <property name="name" value="fieldsList" />
          <property name="vertical" value="true" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1068390468199" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1074866524768">
            <property name="selectable" value="true" />
            <property name="text" value=" &lt;&lt; fields &gt;&gt;" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1104451658934">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1074867634394">
        <property name="name" value="constructorsArea" />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1074867634395">
          <property name="text" value="    " />
          <property name="name" value="constructorsIndentCell" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1074867634396">
          <property name="name" value="constructorsList" />
          <property name="vertical" value="true" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1068390468201" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1074867634397">
            <property name="selectable" value="true" />
            <property name="text" value=" &lt;&lt; constructors &gt;&gt;" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1104451665639">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1074867682195">
        <property name="name" value="methodsArea" />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1074868243546">
          <property name="text" value="    " />
          <property name="name" value="methodsIndentCell" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1074868243547">
          <property name="name" value="methodsList" />
          <property name="vertical" value="true" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1107880067339" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1074868243548">
            <property name="selectable" value="true" />
            <property name="text" value=" &lt;&lt; methods &gt;&gt;" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1104451669405">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1080825388968">
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1080825768015">
          <property name="text" value="    " />
          <property name="name" value="methodsIndentCell" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1080825388970">
          <property name="name" value="staticMethodList" />
          <property name="vertical" value="true" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1070462273904" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1080825538781">
            <property name="selectable" value="true" />
            <property name="text" value=" &lt;&lt; static methods &gt;&gt;" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1171627059323">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1171626428104">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1171626432783">
          <property name="text" value="    " />
          <property name="name" value="methodsIndentCell" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1171626439957">
          <property name="vertical" value="true" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1171626442600">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1171626443711">
              <property name="textFgColor" value="DARK_BLUE" />
              <property name="text" value="static" />
              <property name="drawBorder" value="false" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1171626447354">
              <property name="text" value="{" />
              <property name="drawBorder" value="false" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1171626454623">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1171626456266">
              <property name="selectable" value="false" />
              <property name="text" value="  " />
              <property name="drawBorder" value="false" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1171626461862">
              <property name="drawBorder" value="false" />
              <link role="relationDeclaration" targetNodeId="17.1171626359898" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1171626450231">
            <property name="text" value="}" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1171628086722">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1171628086723">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1171628216019">
              <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1171628234230">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1171628238670" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1171628226507">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1171628232588">
                    <link role="link" targetNodeId="17.1171626359898" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1171628225240" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1171626379134">
        <property name="text" value="}" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1171628247797">
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <property name="selectable" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1171628247798">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1171628247799">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="static" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1171628247800">
          <property name="text" value="{" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1171628247801">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1171628247802">
          <property name="selectable" value="false" />
          <property name="text" value="  " />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1171628247803">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1171626359898" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1171628247804">
        <property name="text" value="}" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1074887681312">
    <property name="name" value="FieldReference_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1068580123158" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1080138219829">
      <property name="editable" value="true" />
      <property name="modelAccessorId" value="VariableReferenceName" />
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1080138264330">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1080137532343" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1080138264331">
        <property name="text" value="." />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1088425851836">
        <property name="noTargetText" value="&lt;no member&gt;" />
        <property name="attractsFocus" value="0" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1070568237987" />
        <link role="actionMap" targetNodeId="1142045237802" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1088425851837">
          <link role="conceptDeclaration" targetNodeId="17.1068390468200" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1088425851838">
            <property name="textFgColor" value="DARK_MAGENTA" />
            <property name="readOnly" value="true" />
            <property name="fontStyle" value="BOLD" />
            <property name="drawBorder" value="false" />
            <link role="relationDeclaration" targetNodeId="17.1083152972671" />
          </node>
        </node>
        <node role="menuDescriptor" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuDescriptor" id="1165014900128">
          <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_ReferentPrimary" id="1165014906520" />
          <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_ReplaceNode_Group" id="1165014916912">
            <property name="presentation" value="default_referent" />
            <node role="parameterObjectType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1165014939507" />
            <node role="parametersFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_AbstractGroup_Query" id="1165014916914">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1165014916915">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1165015049020">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1165015049021">
                    <link role="classConcept" targetNodeId="1163704265146" resolveInfo="_QueriesUtil" />
                    <link role="baseMethodDeclaration" targetNodeId="1164049019134" resolveInfo="convertReferenceMenu_FieldReference_getParameterObjects" />
                    <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_Abstract_editedNode" id="1165015049022" />
                  </node>
                </node>
              </node>
            </node>
            <node role="createFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_ReplaceNode_Group_Create" id="1165014916916">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1165014916917">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1165015269979">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1165015269980">
                    <link role="classConcept" targetNodeId="1163704265146" resolveInfo="_QueriesUtil" />
                    <link role="baseMethodDeclaration" targetNodeId="1164049658716" resolveInfo="convertReferenceMenu_FieldReference_convertReferenceNode" />
                    <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_Abstract_editedNode" id="1165015269981" />
                    <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_AbstractGroup_parameterObject" id="1165015269982" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075139052656">
    <property name="name" value="ConstructorDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1068580123140" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075139052657">
      <property name="name" value="methodBox" />
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <property name="selectable" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075139052658">
        <property name="name" value="headerRow" />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1107467684674">
          <property name="editable" value="true" />
          <property name="readOnly" value="true" />
          <property name="noTargetText" value="&lt;constructor&gt;" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1083152972672" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075140096042">
          <property name="selectable" value="false" />
          <property name="text" value="(" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1138337100850">
          <property name="separatorText" value="," />
          <property name="vertical" value="false" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1068580123134" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1138337100851">
            <property name="editable" value="true" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="true" />
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075140096043">
          <property name="selectable" value="true" />
          <property name="text" value=")" />
          <property name="drawBorder" value="false" />
          <link role="actionMap" targetNodeId="1164890912564" resolveInfo="_BaseMethodDeclaration_Actions" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Alternation" id="1165410808112">
          <property name="drawBorder" value="false" />
          <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1165410808113">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1165410808114">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1165410808115">
                <node role="expression" type="jetbrains.mps.baseLanguage.GreaterThanExpression" id="1165410808116">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1165410808117">
                    <property name="value" value="0" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1165410808118">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1165410808119">
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1165410808120" />
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1165410808121">
                        <link role="link" targetNodeId="17.1164879685961" />
                      </node>
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.LinkList_GetCountOperation" id="1165410808122" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1165410808123">
            <property name="text" value="{" />
            <property name="drawBorder" value="false" />
          </node>
          <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1165410808124">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1165410808125">
              <property name="textFgColor" value="DARK_BLUE" />
              <property name="text" value="throws" />
              <property name="drawBorder" value="false" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1165410808126">
              <property name="separatorText" value="," />
              <property name="drawBorder" value="false" />
              <link role="relationDeclaration" targetNodeId="17.1164879685961" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1165410808127">
              <property name="text" value="{" />
              <property name="drawBorder" value="false" />
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075139937803">
        <property name="name" value="bodyArea" />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075139937804">
          <property name="text" value="  " />
          <property name="name" value="indentCell" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075139937805">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1068580123135" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075139395584">
        <property name="editable" value="true" />
        <property name="text" value="}" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1171332311166">
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075233459437">
    <property name="name" value="InstanceMethodDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1068580123165" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075233459438">
      <property name="name" value="methodBox" />
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <property name="selectable" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075233459439">
        <property name="name" value="headerRow" />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075233539828">
          <property name="noTargetText" value="&lt;no return type&gt;" />
          <property name="name" value="returnType" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1068580123133" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1075233459441">
          <property name="writable" value="true" />
          <property name="defaultValue" value="?" />
          <property name="noTargetText" value="&lt;no name&gt;" />
          <property name="name" value="methodName" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="18.1169194664001" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075233459442">
          <property name="selectable" value="false" />
          <property name="text" value="(" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1138337135190">
          <property name="separatorText" value="," />
          <property name="vertical" value="false" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1068580123134" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1138337135191">
            <property name="editable" value="true" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="true" />
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075233459445">
          <property name="selectable" value="true" />
          <property name="text" value=")" />
          <property name="drawBorder" value="false" />
          <link role="actionMap" targetNodeId="1164890912564" resolveInfo="_BaseMethodDeclaration_Actions" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Alternation" id="1164890868848">
          <property name="drawBorder" value="false" />
          <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1164890868849">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1164890868850">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1164890868851">
                <node role="expression" type="jetbrains.mps.baseLanguage.GreaterThanExpression" id="1164890868852">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1164890868853">
                    <property name="value" value="0" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164890868854">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164890868855">
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1164890868856" />
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1164890868857">
                        <link role="link" targetNodeId="17.1164879685961" />
                      </node>
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.LinkList_GetCountOperation" id="1164890868858" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1164890868860">
            <property name="text" value="{" />
            <property name="drawBorder" value="false" />
          </node>
          <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1164891041670">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1164891139740">
              <property name="textFgColor" value="DARK_BLUE" />
              <property name="text" value="throws" />
              <property name="drawBorder" value="false" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1164891051033">
              <property name="separatorText" value="," />
              <property name="drawBorder" value="false" />
              <link role="relationDeclaration" targetNodeId="17.1164879685961" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1164891057035">
              <property name="text" value="{" />
              <property name="drawBorder" value="false" />
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075233459446">
        <property name="name" value="bodyArea" />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075233459447">
          <property name="text" value="  " />
          <property name="name" value="indentCell" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075233459448">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1068580123135" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075233459449">
        <property name="editable" value="true" />
        <property name="text" value="}" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1171332353715">
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075287750850">
    <property name="name" value="StaticMethodDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1081236700938" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075287750849">
      <property name="name" value="methodBox" />
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <property name="selectable" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075287750860">
        <property name="name" value="headerRow" />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1080826270968">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="static" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075287750861">
          <property name="noTargetText" value="&lt;no type&gt;" />
          <property name="name" value="returnType" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1068580123133" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1075287750862">
          <property name="textFgColor" value="darkGray" />
          <property name="writable" value="true" />
          <property name="noTargetText" value="&lt;no name&gt;" />
          <property name="defaultValue" value="?" />
          <property name="name" value="methodName" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="18.1169194664001" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075287750863">
          <property name="selectable" value="false" />
          <property name="text" value="(" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1138337151587">
          <property name="separatorText" value="," />
          <property name="vertical" value="false" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1068580123134" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1138337151588">
            <property name="editable" value="true" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="true" />
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075287750856">
          <property name="selectable" value="true" />
          <property name="text" value=")" />
          <property name="drawBorder" value="false" />
          <link role="actionMap" targetNodeId="1164890912564" resolveInfo="_BaseMethodDeclaration_Actions" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Alternation" id="1164890626615">
          <property name="drawBorder" value="false" />
          <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1164890626616">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1164890626617">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1164890791770">
                <node role="expression" type="jetbrains.mps.baseLanguage.GreaterThanExpression" id="1164890814261">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1164890819170">
                    <property name="value" value="0" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164890805275">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164890796069">
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1164890795990" />
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1164890803914">
                        <link role="link" targetNodeId="17.1164879685961" />
                      </node>
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.LinkList_GetCountOperation" id="1164890809760" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1164890632759">
            <property name="text" value="{" />
            <property name="drawBorder" value="false" />
          </node>
          <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1164891084595">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1164891194929">
              <property name="textFgColor" value="DARK_BLUE" />
              <property name="text" value="throws" />
              <property name="drawBorder" value="false" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1164891084596">
              <property name="separatorText" value="," />
              <property name="drawBorder" value="false" />
              <link role="relationDeclaration" targetNodeId="17.1164879685961" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1164891084597">
              <property name="text" value="{" />
              <property name="drawBorder" value="false" />
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075287750857">
        <property name="name" value="bodyArea" />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075287750858">
          <property name="text" value="  " />
          <property name="name" value="indentCell" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075287750859">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1068580123135" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075287750864">
        <property name="editable" value="true" />
        <property name="text" value="}" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1171332369936">
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075289941062">
    <property name="name" value="FieldDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1068390468200" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075289941063">
      <property name="name" value="declarationBox" />
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075289941064">
        <property name="noTargetText" value="&lt;no type&gt;" />
        <property name="nullRefText" value="&lt;no type&gt;" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1068431790188" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1075289970878">
        <property name="textFgColor" value="DARK_MAGENTA" />
        <property name="writable" value="true" />
        <property name="fontStyle" value="BOLD" />
        <property name="defaultValue" value="?" />
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no name&gt;" />
        <property name="rightTransformAnchorTag" value="default_RTransform" />
        <link role="relationDeclaration" targetNodeId="18.1169194664001" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075290206265">
        <property name="name" value="initializerArea" />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075290218688">
          <property name="text" value="=" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075290268533">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1068431790190" />
        </node>
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1145916298341">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1145916298342">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1145916300406">
              <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1145916312567">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1145916317742" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1145916304502">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1145916303189" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1145916307597">
                    <link role="link" targetNodeId="17.1068431790190" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075289999925">
        <property name="text" value=";" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075302295734">
    <property name="name" value="ParameterDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1068498886292" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075302295735">
      <property name="name" value="declarationBox" />
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1176719480878">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="final" />
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1176719487941">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1176719487942">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1176719511639">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1176719525283">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1176719514047" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1176719526846">
                  <link role="property" targetNodeId="17.1176718929932" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075302295736">
        <property name="noTargetText" value="&lt;no type&gt;" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1068431790188" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1075302295737">
        <property name="writable" value="true" />
        <property name="defaultValue" value="?" />
        <property name="noTargetText" value="&lt;no name&gt;" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="18.1169194664001" />
        <link role="actionMap" targetNodeId="1140748024390" />
      </node>
    </node>
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1176718956231">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1176718960811">
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1176719472468">
          <property name="text" value="final :" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1176719475501">
          <link role="relationDeclaration" targetNodeId="17.1176718929932" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075303160500">
    <property name="name" value="LocalVariableDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1068581242863" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075303160501">
      <property name="name" value="declarationBox" />
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <link role="keyMap" targetNodeId="1144406653773" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1177528607804">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="final" />
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1177528613676">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1177528613677">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1177528665489">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1177528671655">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1177528666961" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1177528672935">
                  <link role="property" targetNodeId="17.1176718929932" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075303160502">
        <property name="noTargetText" value="&lt;no type&gt;" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1068431790188" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1075303160503">
        <property name="writable" value="true" />
        <property name="noTargetText" value="&lt;no name&gt;" />
        <property name="attractsFocus" value="0" />
        <property name="defaultValue" value="?" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="18.1169194664001" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075303160504">
        <property name="name" value="initializerArea" />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075303160505">
          <property name="text" value="=" />
          <property name="drawBorder" value="false" />
          <link role="actionMap" targetNodeId="1144367099981" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075303160506">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1068431790190" />
        </node>
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1145916333852">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1145916333853">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1145916335870">
              <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1145916353782">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1145916357629" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1145916339920">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1145916338778" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1145916344889">
                    <link role="link" targetNodeId="17.1068431790190" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1177528761004">
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1177528761777">
        <property name="text" value="final" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1177528805179">
        <link role="relationDeclaration" targetNodeId="17.1176718929932" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075307690078">
    <property name="name" value="InstanceMethodCall_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1068580123163" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075307690079">
      <property name="name" value="expressionBox" />
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075308068515">
        <property name="noTargetText" value="&lt;no instance&gt;" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1068580123164" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075308084251">
        <property name="selectable" value="false" />
        <property name="text" value="." />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1088426063979">
        <property name="noTargetText" value="&lt;no member&gt;" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1070568044740" />
        <link role="actionMap" targetNodeId="1142045498909" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1088426063980">
          <link role="conceptDeclaration" targetNodeId="17.1068580123165" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1088426063981">
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="17.1083152972672" />
          </node>
        </node>
        <node role="menuDescriptor" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuDescriptor" id="1165018668942">
          <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_ReferentPrimary" id="1165018673303" />
          <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_ReplaceNode_Group" id="1165018678977">
            <property name="presentation" value="default_referent" />
            <node role="parameterObjectType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1165018683420" />
            <node role="parametersFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_AbstractGroup_Query" id="1165018678979">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1165018678980">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1165018702027">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1165018702028">
                    <link role="classConcept" targetNodeId="1163704265146" resolveInfo="_QueriesUtil" />
                    <link role="baseMethodDeclaration" targetNodeId="1164049862510" resolveInfo="convertReferenceMenu_InstanceMethodCall_getParameterObjects" />
                    <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_Abstract_editedNode" id="1165018702029" />
                  </node>
                </node>
              </node>
            </node>
            <node role="createFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_ReplaceNode_Group_Create" id="1165018678981">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1165018678982">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1165018717018">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1165018717019">
                    <link role="classConcept" targetNodeId="1163704265146" resolveInfo="_QueriesUtil" />
                    <link role="baseMethodDeclaration" targetNodeId="1164049979558" resolveInfo="convertReferenceMenu_InstanceMethodCall_convertReferenceNode" />
                    <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_Abstract_editedNode" id="1165018717020" />
                    <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_AbstractGroup_parameterObject" id="1165018717021" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075307690081">
        <property name="text" value="(" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1138337255870">
        <property name="separatorText" value="," />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1068499141038" />
        <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1138337255871">
          <property name="editable" value="true" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="true" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075307690084">
        <property name="editable" value="false" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075308772515">
    <property name="name" value="StaticMethodCall_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1081236700937" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1081149310028">
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1144433246063">
        <property name="noTargetText" value="&lt;no class&gt;" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1144433194310" />
        <link role="actionMap" targetNodeId="1172061831827" resolveInfo="StaticMethodCall_Actions" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1144433246064">
          <link role="conceptDeclaration" targetNodeId="17.1068390468198" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1144433246065">
            <property name="noTargetText" value="&lt;no name&gt;" />
            <property name="readOnly" value="true" />
            <property name="drawBorder" value="false" />
            <link role="relationDeclaration" targetNodeId="18.1169194664001" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1081149570778">
        <property name="text" value="." />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1088427863670">
        <property name="noTargetText" value="&lt;no method&gt;" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1081236769987" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1088427863671">
          <link role="conceptDeclaration" targetNodeId="17.1081236700938" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1088427863672">
            <property name="fontStyle" value="ITALIC" />
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="17.1083152972672" />
          </node>
        </node>
        <node role="menuDescriptor" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuDescriptor" id="1165018814906">
          <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_ReferentPrimary" id="1165018818751" />
          <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_ReplaceNode_Group" id="1165018823331">
            <property name="presentation" value="default_referent" />
            <node role="parameterObjectType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1165018827571" />
            <node role="parametersFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_AbstractGroup_Query" id="1165018823333">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1165018823334">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1165018838912">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1165018838913">
                    <link role="classConcept" targetNodeId="1163704265146" resolveInfo="_QueriesUtil" />
                    <link role="baseMethodDeclaration" targetNodeId="1164039169687" resolveInfo="convertReferenceMenu_StaticMethodCall_getParameterObjects" />
                    <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_Abstract_editedNode" id="1165018838914" />
                  </node>
                </node>
              </node>
            </node>
            <node role="createFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_ReplaceNode_Group_Create" id="1165018823335">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1165018823336">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1165018852106">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1165018852107">
                    <link role="classConcept" targetNodeId="1163704265146" resolveInfo="_QueriesUtil" />
                    <link role="baseMethodDeclaration" targetNodeId="1164039527232" resolveInfo="convertReferenceMenu_StaticMethodCall_convertReferenceNode" />
                    <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_Abstract_editedNode" id="1165018852108" />
                    <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_AbstractGroup_parameterObject" id="1165018852109" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1173991610903">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1173990860683" resolveInfo="BaseMethodCall_actualArgumentList" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075310480281">
    <property name="name" value="AssignmentExpression_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1068498886294" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075310480282">
      <property name="actionSet" value="RightTransform" />
      <property name="name" value="expressionBox" />
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <property name="gridLayout" value="true" />
      <property name="selectable" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075310480284">
        <property name="actionSet" value="LeftExpression" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="relationDeclaration" targetNodeId="17.1068498886295" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075310480285">
        <property name="selectable" value="false" />
        <property name="text" value="=" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075310480286">
        <property name="actionSet" value="RightExpression" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="relationDeclaration" targetNodeId="17.1068498886297" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075374082688">
    <property name="name" value="IntegerConstant_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1068580320020" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1083091696640">
      <property name="noTargetText" value="&lt;int constant&gt;" />
      <property name="textFgColor" value="blue" />
      <property name="drawBorder" value="false" />
      <link role="relationDeclaration" targetNodeId="17.1068580320021" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075374106049">
    <property name="name" value="BooleanConstant_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1068580123137" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1088424970609">
      <property name="fontStyle" value="BOLD" />
      <property name="textFgColor" value="DARK_BLUE" />
      <property name="drawBorder" value="false" />
      <link role="relationDeclaration" targetNodeId="17.1068580123138" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075374365333">
    <property name="name" value="ThisExpression_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1070475354124" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075374365334">
      <property name="editable" value="true" />
      <property name="textFgColor" value="DARK_BLUE" />
      <property name="text" value="this" />
      <property name="drawBorder" value="false" />
      <property name="selectable" value="true" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075374525819">
    <property name="name" value="NewExpression_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1068581242872" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075374525820">
      <property name="name" value="expressionBox" />
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075374525821">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="new" />
        <property name="fontStyle" value="BOLD" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1135374809818">
        <property name="noTargetText" value="&lt;no constructor declaration&gt;" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1135374435992" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1135374809819">
          <link role="conceptDeclaration" targetNodeId="17.1068580123140" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1135374809820">
            <property name="editable" value="true" />
            <property name="readOnly" value="true" />
            <property name="drawBorder" value="false" />
            <property name="rightTransformAnchorTag" value="ext_1_RTransform" />
            <link role="relationDeclaration" targetNodeId="17.1083152972672" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1140831696926">
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1140831696927">
          <property name="selectable" value="false" />
          <property name="text" value="&lt;" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1140831696928">
          <property name="separatorText" value="," />
          <property name="vertical" value="false" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1135374457323" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1140831696929">
          <property name="selectable" value="false" />
          <property name="text" value="&gt;" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1145916244484">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1145916244485">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1145916246455">
              <node role="expression" type="jetbrains.mps.baseLanguage.GreaterThanExpression" id="1145916261228">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1145916265137">
                  <property name="value" value="0" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1145916256460">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1145916250068">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1145916248785" />
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1145916252897">
                      <link role="link" targetNodeId="17.1135374457323" />
                    </node>
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.LinkList_GetCountOperation" id="1145916258883" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1173996658993">
        <property name="drawBorder" value="false" />
        <link role="editorComponent" targetNodeId="1173990860683" resolveInfo="BaseMethodCall_actualArgumentList" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075376169046">
    <property name="name" value="Expression_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1068431790191" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Error" id="1075376431437">
      <property name="text" value="expression" />
      <property name="drawBorder" value="false" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075379141234">
    <property name="name" value="ExpressionStatement_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1068580123155" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075379141235">
      <property name="name" value="statementBox" />
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075379141236">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="relationDeclaration" targetNodeId="17.1068580123156" />
        <link role="actionMap" targetNodeId="1140226376803" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075379141237">
        <property name="text" value=";" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075379419312">
    <property name="name" value="IfStatement_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1068580123159" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075379419313">
      <property name="name" value="statementBox" />
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075379444330">
        <property name="name" value="headerRow" />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1101210485455">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="if" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075379663006">
          <property name="text" value="(" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075379700788">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1068580123160" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075379740164">
          <property name="text" value=") {" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075379536706">
        <property name="name" value="ifTrueBox" />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075379821384">
          <property name="text" value="  " />
          <property name="name" value="indentCell" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1082486433802">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1068580123161" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1145915991621">
        <property name="editable" value="true" />
        <property name="text" value="}" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="actionMap" targetNodeId="1141078927588" />
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1145915991622">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1145915991623">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1145915991624">
              <node role="expression" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1145915991625">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1145915991626" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1145915991627">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1145915991628" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1145915991629">
                    <link role="link" targetNodeId="17.1082485599094" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1145913930430">
        <property name="vertical" value="true" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1145913989016">
          <property name="name" value="ifFalseBranch" />
          <property name="vertical" value="false" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1145913989017">
            <property name="text" value="}" />
            <property name="drawBorder" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1145913989018">
            <property name="textFgColor" value="DARK_BLUE" />
            <property name="text" value="else" />
            <property name="fontStyle" value="BOLD" />
            <property name="drawBorder" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1145913989019">
            <property name="text" value="{" />
            <property name="drawBorder" value="false" />
            <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1145914055789">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1145914055790">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1145914057776">
                  <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1145914068843">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1145914062591">
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1145914061262" />
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1145914065264">
                        <link role="link" targetNodeId="17.1082485599094" />
                      </node>
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1145915149985">
                      <link role="concept" targetNodeId="17.1082485599095" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1145913989028">
          <property name="name" value="ifFalseBranch" />
          <property name="vertical" value="false" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1145913989029">
            <property name="selectable" value="false" />
            <property name="text" value="  " />
            <property name="drawBorder" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1145913989030">
            <property name="drawBorder" value="false" />
            <link role="relationDeclaration" targetNodeId="17.1082485599094" />
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1145913989039">
          <property name="name" value="ifFalseBranch" />
          <property name="vertical" value="false" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1145913989040">
            <property name="text" value="}" />
            <property name="drawBorder" value="false" />
            <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1145915528690">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1145915528691">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1145915600531">
                  <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1145915614239">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1145915605316">
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1145915603424" />
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1145915611988">
                        <link role="link" targetNodeId="17.1082485599094" />
                      </node>
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1145915617209">
                      <link role="concept" targetNodeId="17.1082485599095" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1145913965422">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1145913965423">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1145913972529">
              <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1145913993616">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1145913977423">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1145913975609" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1145913980346">
                    <link role="link" targetNodeId="17.1082485599094" />
                  </node>
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1145913986428" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075380566828">
    <property name="name" value="LocalVariableDeclarationStatement_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1068581242864" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075380566829">
      <property name="name" value="statementBox" />
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075380566830">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1068581242865" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075380566831">
        <property name="text" value=";" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075380723765">
    <property name="name" value="ReturnStatement_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1068581242878" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075380723766">
      <property name="name" value="statementBox" />
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075722075640">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="return" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="actionMap" targetNodeId="1152311212234" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075380723767">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1068581517676" />
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1152310298068">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1152310298069">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1152310301867">
              <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1152310336746">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1152310342764" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1152310318134">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1152310315883" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1152310330589">
                    <link role="link" targetNodeId="17.1068581517676" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075380723768">
        <property name="text" value=";" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075381298843">
    <property name="name" value="Statement_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1068580123157" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Error" id="1078746085984">
      <property name="name" value="nodeBox" />
      <property name="drawBorder" value="false" />
      <property name="text" value="&lt;statement&gt;" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1079605716538">
    <property name="name" value="NullLiteral_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1070534058343" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1079605716541">
      <property name="editable" value="true" />
      <property name="textFgColor" value="DARK_BLUE" />
      <property name="text" value="null" />
      <property name="drawBorder" value="false" />
      <property name="selectable" value="true" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1079622224907">
    <property name="name" value="StringLiteral_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1070475926800" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1079623722228">
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1079623722229">
        <property name="textFgColor" value="DARK_GREEN" />
        <property name="text" value="&quot;" />
        <property name="fontStyle" value="BOLD" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1079623722230">
        <property name="layoutConstraint" value="punctuation" />
        <property name="editable" value="true" />
        <property name="textFgColor" value="DARK_GREEN" />
        <property name="allowEmptyText" value="true" />
        <property name="writable" value="true" />
        <property name="fontStyle" value="BOLD" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="relationDeclaration" targetNodeId="17.1070475926801" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1079623722231">
        <property name="layoutConstraint" value="punctuation" />
        <property name="textFgColor" value="DARK_GREEN" />
        <property name="text" value="&quot;" />
        <property name="fontStyle" value="BOLD" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1080902646656">
    <property name="name" value="CastExpression_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1070534934090" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1080902646660">
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1144186748520">
        <property name="drawBorder" value="false" />
        <link role="actionMap" targetNodeId="1144185359094" />
        <link role="keyMap" targetNodeId="1158938292640" resolveInfo="CastExpression_KeyMap" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1144186756096">
          <property name="text" value="(" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1144186756097">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1070534934091" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1144186756098">
          <property name="text" value=")" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1080902646664">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1070534934092" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075308772517">
    <property name="name" value="MethodCall_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1068581242868" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075308772516">
      <property name="name" value="expressionBox" />
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1088426839520">
        <property name="noTargetText" value="&lt;no method&gt;" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1070568331956" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1088426839521">
          <link role="conceptDeclaration" targetNodeId="17.1068390468204" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1088426839522">
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="17.1083152972672" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075308772518">
        <property name="text" value="(" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1138337209329">
        <property name="separatorText" value="," />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1068499141038" />
        <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1138337209330">
          <property name="editable" value="true" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="true" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075308772521">
        <property name="editable" value="false" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1075287750843">
    <property name="name" value="MethodDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1068390468204" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075287750844">
      <property name="name" value="methodBox" />
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <property name="selectable" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075287750845">
        <property name="name" value="headerRow" />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075287750846">
          <property name="noTargetText" value="&lt;no return type&gt;" />
          <property name="name" value="returnType" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1068580123133" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1075287750847">
          <property name="writable" value="true" />
          <property name="defaultValue" value="?" />
          <property name="noTargetText" value="&lt;no name&gt;" />
          <property name="name" value="methodName" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="18.1169194664001" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075287750848">
          <property name="selectable" value="false" />
          <property name="text" value="(" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1138337126106">
          <property name="separatorText" value="," />
          <property name="vertical" value="false" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1068580123134" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1138337126107">
            <property name="editable" value="true" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="true" />
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075287750851">
          <property name="selectable" value="false" />
          <property name="text" value=") {" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1075287750852">
        <property name="name" value="bodyArea" />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075287750853">
          <property name="text" value="  " />
          <property name="name" value="indentCell" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1075287750854">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1068580123135" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1075287750855">
        <property name="editable" value="true" />
        <property name="text" value="}" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1081257049503">
    <property name="parseable" value="true" />
    <property name="name" value="InstanceOfExpression_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1081256982272" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1081257073129">
      <property name="name" value="expressionBox" />
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1081257097746">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="relationDeclaration" targetNodeId="17.1081256993304" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1081257097747">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="instanceof" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1081257097748">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="relationDeclaration" targetNodeId="17.1081256993305" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1081264157973">
    <property name="name" value="WhileStatement_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1076505808687" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1081264241575">
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1081264241576">
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1081264296765">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="while" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1101210485457">
          <property name="text" value="(" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1081264296766">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1076505808688" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1081264296767">
          <property name="text" value=") {" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1081264296784">
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1090928635163">
          <property name="selectable" value="false" />
          <property name="text" value="  " />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1081264296785">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1154032183016" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1081264296786">
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1081264296787">
          <property name="text" value="}" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapDeclaration" id="1081427357000">
    <property name="name" value="Expression_KeyMap" />
    <property name="everyModel" value="true" />
    <link role="applicableConcept" targetNodeId="17.1068431790191" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1140723699454">
      <property name="description" value="put expression in parenthesis" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1140723699566">
        <property name="keycode" value="VK_P" />
        <property name="modifiers" value="ctrl+shift" />
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1140723699456">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1140723699631">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1158862234754">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1158862259038">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1158862234755" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithNewOperation" id="1158862262461">
                <link role="concept" targetNodeId="17.1079359253375" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1166035149309">
      <property name="caretPolicy" value="caret_at_last_position" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1166035149310">
        <property name="keycode" value="VK_0" />
        <property name="modifiers" value="ctrl+shift" />
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1166035149311">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1166035149312">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1166035418075">
            <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1166035431639">
              <link role="classConcept" extResolveInfo="48.[Classifier]ParenthesisUtil" />
              <link role="baseMethodDeclaration" extResolveInfo="48.static method ([Classifier]ParenthesisUtil).([StaticMethodDeclaration]addClosingParenthesis((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Expression]), (jetbrains.mps.baseLanguage.types.boolean/jetbrains.mps.baseLanguage.types.boolean), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorContext])) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1171545042393">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAdapterOperation" id="1171545043333" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1166035784259" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1166035451111" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1166090256931" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1166035160001">
      <property name="caretPolicy" value="caret_at_first_position" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1166035160002">
        <property name="keycode" value="VK_9" />
        <property name="modifiers" value="ctrl+shift" />
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1166035160003">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1166035160004">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1166035468581">
            <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1166035468582">
              <link role="classConcept" extResolveInfo="48.[Classifier]ParenthesisUtil" />
              <link role="baseMethodDeclaration" extResolveInfo="48.static method ([Classifier]ParenthesisUtil).([StaticMethodDeclaration]addClosingParenthesis((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Expression]), (jetbrains.mps.baseLanguage.types.boolean/jetbrains.mps.baseLanguage.types.boolean), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorContext])) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1171545046991">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAdapterOperation" id="1171545047994" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1166035794761" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1166035468584">
                <property name="value" value="true" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1166090268983" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1174345740550">
      <property name="description" value="introduce variable (var declaration)" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1174345740551">
        <property name="keycode" value="VK_V" />
        <property name="modifiers" value="ctrl+alt" />
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1174345740552">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1174345740553">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1174614246414">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.VarDeclaration" id="1174614246415">
              <property name="name" value="nodeEditorComponent" />
              <node role="type" type="jetbrains.mps.baseLanguage.Type" id="1174614246416" />
              <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1174346129692">
                <link role="baseMethodDeclaration" extResolveInfo="21.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getNodeEditorComponent() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [AbstractEditorComponent]))" />
                <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1174346114314" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1174680997538">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.VarDeclaration" id="1174680997539">
              <property name="name" value="name" />
              <node role="type" type="jetbrains.mps.baseLanguage.Type" id="1174680997540" />
              <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1174346101625">
                <link role="baseMethodDeclaration" extResolveInfo="23.static method ([Classifier]JOptionPane).([StaticMethodDeclaration]showInputDialog((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Component]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Object])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]))" />
                <link role="classConcept" extResolveInfo="23.[Classifier]JOptionPane" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174614246433">
                  <link role="variableDeclaration" targetNodeId="1174614246415" resolveInfo="nodeEditorComponent" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.StringLiteral" id="1174346137241">
                  <property name="value" value="Enter variable name" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1174346184152">
            <node role="condition" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1174346188140">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1174346190190" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174681057473">
                <link role="variableDeclaration" targetNodeId="1174680997539" resolveInfo="name" />
              </node>
            </node>
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1174346184154">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1174346206754" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1174834870203">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1174834870204">
              <property name="name" value="selectedNode" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1174834874301" />
              <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1174348346419">
                <link role="baseMethodDeclaration" extResolveInfo="21.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getSelectedNode() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode]))" />
                <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1174348339197" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1174681588836">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.VarDeclaration" id="1174681588837">
              <property name="name" value="varStatement" />
              <node role="type" type="jetbrains.mps.baseLanguage.Type" id="1174681588838" />
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1174348381914">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1174348376990">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174834881614">
                    <link role="variableDeclaration" targetNodeId="1174834870204" resolveInfo="selectedNode" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetModelOperation" id="1174348378256" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Model_CreateNewNodeOperation" id="1174348385211">
                  <link role="concept" targetNodeId="17.1068581242864" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1174681612749">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.VarDeclaration" id="1174681612750">
              <property name="name" value="varDeclaration" />
              <node role="type" type="jetbrains.mps.baseLanguage.Type" id="1174681612751" />
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1174348439033">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1174348432203">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174681598277">
                    <link role="variableDeclaration" targetNodeId="1174681588837" resolveInfo="varStatement" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1174499355539">
                    <link role="link" targetNodeId="17.1068581242865" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetNewChildOperation" id="1174348441034">
                  <link role="concept" targetNodeId="17.1174335983096" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1174348469086">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1174348486715">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1174348470697">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174681620456">
                  <link role="variableDeclaration" targetNodeId="1174681612750" resolveInfo="varDeclaration" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1174398328639">
                  <link role="property" targetNodeId="17.1083152972671" />
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Property_SetOperation" id="1174348488669">
                <node role="value" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174681061493">
                  <link role="variableDeclaration" targetNodeId="1174680997539" resolveInfo="name" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1174681653903">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.VarDeclaration" id="1174681653904">
              <property name="name" value="statement" />
              <node role="type" type="jetbrains.mps.baseLanguage.Type" id="1174681653905" />
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1174348545200">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174834885475">
                  <link role="variableDeclaration" targetNodeId="1174834870204" resolveInfo="selectedNode" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAncestorOperation" id="1174348546810">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.OperationParm_Concept" id="1174348550077">
                    <link role="concept" targetNodeId="17.1068580123157" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1174834665664">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1174834665666">
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1174834993576">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1174834997938">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174834993577">
                    <link role="variableDeclaration" targetNodeId="1174681653904" resolveInfo="statement" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithAnotherOperation" id="1174835000720">
                    <node role="parameter" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174835004128">
                      <link role="variableDeclaration" targetNodeId="1174681588837" resolveInfo="varStatement" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.AndExpression" id="1174834933408">
              <node role="rightExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1174834943037">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174834937567">
                  <link role="variableDeclaration" targetNodeId="1174681653904" resolveInfo="statement" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1174834944897">
                  <link role="concept" targetNodeId="17.1068580123155" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1174834927935">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1174834914448">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174834909510">
                    <link role="variableDeclaration" targetNodeId="1174834870204" resolveInfo="selectedNode" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetParentOperation" id="1174834920699" />
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174834931282">
                  <link role="variableDeclaration" targetNodeId="1174681653904" resolveInfo="statement" />
                </node>
              </node>
            </node>
            <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.BlockStatement" id="1174834955524">
              <node role="statements" type="jetbrains.mps.baseLanguage.StatementList" id="1174834955525">
                <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1174834966501">
                  <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1174834966502">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174834966503">
                      <link role="variableDeclaration" targetNodeId="1174681653904" resolveInfo="statement" />
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_InsertPrevSiblingOperation" id="1174834966504">
                      <node role="parameter" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174834966505">
                        <link role="variableDeclaration" targetNodeId="1174681588837" resolveInfo="varStatement" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1174834966506">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.VarDeclaration" id="1174834966507">
                    <property name="name" value="reference" />
                    <node role="type" type="jetbrains.mps.baseLanguage.Type" id="1174834966508" />
                    <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1174834966509">
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174834966510">
                        <link role="variableDeclaration" targetNodeId="1174834870204" resolveInfo="selectedNode" />
                      </node>
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithNewOperation" id="1174834966511">
                        <link role="concept" targetNodeId="17.1068581242866" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1174834966512">
                  <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1174834966513">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1174834966514">
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174834966515">
                        <link role="variableDeclaration" targetNodeId="1174834966507" resolveInfo="reference" />
                      </node>
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1174834966516">
                        <link role="link" targetNodeId="17.1070568296581" />
                      </node>
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1174834966517">
                      <node role="parameter" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174834966518">
                        <link role="variableDeclaration" targetNodeId="1174681612750" resolveInfo="varDeclaration" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1174835314543">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1174835314544">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1174835314545">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174835314546">
                  <link role="variableDeclaration" targetNodeId="1174681612750" resolveInfo="varDeclaration" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1174835314547">
                  <link role="link" targetNodeId="17.1068431790190" />
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1174835314548">
                <node role="parameter" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174835314549">
                  <link role="variableDeclaration" targetNodeId="1174834870204" resolveInfo="selectedNode" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1081790432906">
    <property name="name" value="SuperConstructorInvocation_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1070475587102" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1085059533049">
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085059604178">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="super(" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1085475861768">
        <property name="separatorText" value="," />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1070475587104" />
        <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085475861769">
          <property name="editable" value="true" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="true" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085140612097">
        <property name="text" value=");" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1081792356328">
    <property name="name" value="SuperMethodCall_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1073063089578" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1091709481298">
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1091709481299">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="super" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1101210485458">
        <property name="text" value="." />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1091709481300">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1073063089579" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1091709481301">
          <link role="conceptDeclaration" targetNodeId="17.1068580123165" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1091709481302">
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="17.1083152972672" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1091709481303">
        <property name="text" value="(" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1138337224101">
        <property name="separatorText" value="," />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1068499141038" />
        <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1138337224102">
          <property name="editable" value="true" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="true" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1091709481305">
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1081792505531">
    <property name="name" value="StaticFieldReference_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1070533707846" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1082740154392">
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1144433124322">
        <property name="noTargetText" value="&lt;no classifier&gt;" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1144433057691" />
        <link role="actionMap" targetNodeId="1172013289681" resolveInfo="StaticFieldReference_Actions" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1144433124323">
          <link role="conceptDeclaration" targetNodeId="17.1107461130800" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1144433124324">
            <property name="noTargetText" value="&lt;no name&gt;" />
            <property name="readOnly" value="true" />
            <property name="drawBorder" value="false" />
            <link role="relationDeclaration" targetNodeId="18.1169194664001" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1082740154394">
        <property name="text" value="." />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1088427644683">
        <property name="noTargetText" value="&lt;no static member&gt;" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1070568178160" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1088427644684">
          <link role="conceptDeclaration" targetNodeId="17.1070462154015" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1088427644685">
            <property name="textFgColor" value="DARK_MAGENTA" />
            <property name="readOnly" value="true" />
            <property name="fontStyle" value="BOLD_ITALIC" />
            <property name="drawBorder" value="false" />
            <link role="relationDeclaration" targetNodeId="17.1083152972671" />
          </node>
        </node>
        <node role="menuDescriptor" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuDescriptor" id="1165018744026">
          <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_ReferentPrimary" id="1165018745902" />
          <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_ReplaceNode_Group" id="1165018751529">
            <property name="presentation" value="default_referent" />
            <node role="parameterObjectType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1165018755832" />
            <node role="parametersFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_AbstractGroup_Query" id="1165018751531">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1165018751532">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1165018767954">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1165018767955">
                    <link role="classConcept" targetNodeId="1163704265146" resolveInfo="_QueriesUtil" />
                    <link role="baseMethodDeclaration" targetNodeId="1163704285491" resolveInfo="convertReferenceMenu_StaticFieldReference_getParameterObjects" />
                    <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_Abstract_editedNode" id="1165018767956" />
                  </node>
                </node>
              </node>
            </node>
            <node role="createFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_ReplaceNode_Group_Create" id="1165018751533">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1165018751534">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1165018780554">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1165018780555">
                    <link role="classConcept" targetNodeId="1163704265146" resolveInfo="_QueriesUtil" />
                    <link role="baseMethodDeclaration" targetNodeId="1163711274845" resolveInfo="convertReferenceMenu_StaticFieldReference_convertReferenceNode" />
                    <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_Abstract_editedNode" id="1165018780556" />
                    <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_AbstractGroup_parameterObject" id="1165018780557" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1081880010406">
    <property name="parseable" value="true" />
    <property name="name" value="ParenthesizedExpression_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1079359253375" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1081880010409">
      <property name="name" value="nodeBox" />
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1081880010410">
        <property name="text" value="(" />
        <property name="drawBorder" value="false" />
        <link role="actionMap" targetNodeId="1166027091157" resolveInfo="DeleteParenthesis_Actions" />
        <link role="keyMap" targetNodeId="1166110777830" resolveInfo="OpenParenthesis_KeyMap" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1081880010411">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1079359253376" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1081880010412">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="actionMap" targetNodeId="1166027091157" resolveInfo="DeleteParenthesis_Actions" />
        <link role="keyMap" targetNodeId="1166102189373" resolveInfo="Parenthesis_KeyMap" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1081929659485">
    <property name="name" value="NotExpression_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1081516740877" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1081929706295">
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1081930071608">
        <property name="text" value="!(" />
        <property name="drawBorder" value="false" />
        <link role="actionMap" targetNodeId="1140733182387" resolveInfo="NotExpression_Parens_Actions" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1081930071609">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1081516765348" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1081930071610">
        <property name="selectable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
        <link role="actionMap" targetNodeId="1140733182387" resolveInfo="NotExpression_Parens_Actions" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1081933895507">
    <property name="name" value="BreakStatement_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1081855346303" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1101210155304">
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1101210485459">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="break" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1101210485460">
        <property name="text" value=";" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1081942381484">
    <property name="name" value="Type_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1068431790189" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Alternation" id="1138060380694">
      <property name="drawBorder" value="false" />
      <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Error" id="1138060384542">
        <property name="text" value="&lt;type&gt;" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_ConceptProperty" id="1138060501183">
        <property name="noTargetText" value="&lt;type has no alias&gt;" />
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="18.1137473891462" />
      </node>
      <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1146070379313">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1146070379314">
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1146070422323">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1146070429201">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1146070426825" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SConceptPropertyAccess" id="1146070431436">
                <link role="conceptProperty" targetNodeId="18.1137473854053" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1082114095844">
    <property name="name" value="ContinueStatement_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1082113931046" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1101210185160">
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1101210485461">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="continue" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1101210485462">
        <property name="text" value=";" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1082485734863">
    <property name="name" value="BlockStatement_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1082485599095" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1119291654779">
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1144224544543">
        <property name="text" value="{" />
        <property name="drawBorder" value="false" />
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1145916598814">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1145916598815">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1145916600894">
              <node role="expression" type="jetbrains.mps.baseLanguage.NotExpression" id="1145916626131">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1145916630775">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1145916628899" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsRoleOperation" id="1145916633510">
                    <link role="conceptOfParent" targetNodeId="17.1068580123159" />
                    <link role="linkInParent" targetNodeId="17.1082485599094" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1119291719344">
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1119291719345">
          <property name="selectable" value="false" />
          <property name="text" value="  " />
          <property name="drawBorder" value="false" />
          <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1145916692407">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1145916692408">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1145916693361">
                <node role="expression" type="jetbrains.mps.baseLanguage.NotExpression" id="1145916693362">
                  <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1145916693363">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1145916693364" />
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsRoleOperation" id="1145916693365">
                      <link role="linkInParent" targetNodeId="17.1082485599094" />
                      <link role="conceptOfParent" targetNodeId="17.1068580123159" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1119291719346">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1082485599096" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1119291721269">
        <property name="text" value="}" />
        <property name="drawBorder" value="false" />
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1145916702929">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1145916702930">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1145916703868">
              <node role="expression" type="jetbrains.mps.baseLanguage.NotExpression" id="1145916703869">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1145916703870">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1145916703871" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsRoleOperation" id="1145916703872">
                    <link role="linkInParent" targetNodeId="17.1082485599094" />
                    <link role="conceptOfParent" targetNodeId="17.1068580123159" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="cellLayout" type="jetbrains.mps.bootstrap.editorLanguage.CellLayout_Vertical" id="1119291668296" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1083262769250">
    <property name="name" value="EnumConstantReference_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1083260308424" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1090928601376">
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1144432986234">
        <property name="noTargetText" value="&lt;no enum&gt;" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1144432896254" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1144432986235">
          <link role="conceptDeclaration" targetNodeId="17.1083245097125" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1144432992143">
            <property name="noTargetText" value="&lt;no name&gt;" />
            <property name="readOnly" value="true" />
            <property name="drawBorder" value="false" />
            <link role="relationDeclaration" targetNodeId="18.1169194664001" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1090928601378">
        <property name="text" value="." />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1090928601379">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1083260308426" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1090928601380">
          <link role="conceptDeclaration" targetNodeId="17.1083245299891" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1090928601381">
            <property name="fontStyle" value="BOLD" />
            <property name="textFgColor" value="DARK_MAGENTA" />
            <property name="drawBorder" value="false" />
            <link role="relationDeclaration" targetNodeId="18.1169194664001" />
          </node>
        </node>
        <node role="menuDescriptor" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuDescriptor" id="1165018325083">
          <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_ReferentPrimary" id="1165018328818" />
          <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_ReplaceNode_Group" id="1165018346117">
            <property name="presentation" value="default_referent" />
            <node role="parameterObjectType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1165018365478" />
            <node role="parametersFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_AbstractGroup_Query" id="1165018346119">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1165018346120">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1165018383069">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1165018383070">
                    <link role="classConcept" targetNodeId="1163704265146" resolveInfo="_QueriesUtil" />
                    <link role="baseMethodDeclaration" targetNodeId="1164040653636" resolveInfo="convertReferenceMenu_EnumConstantReference_getParameterObjects" />
                    <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_Abstract_editedNode" id="1165018383071" />
                  </node>
                </node>
              </node>
            </node>
            <node role="createFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_ReplaceNode_Group_Create" id="1165018346121">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1165018346122">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1165018403153">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1165018403154">
                    <link role="classConcept" targetNodeId="1163704265146" resolveInfo="_QueriesUtil" />
                    <link role="baseMethodDeclaration" targetNodeId="1164040812310" resolveInfo="convertReferenceMenu_EnumConstantReference_convertReferenceNode" />
                    <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_Abstract_editedNode" id="1165018403155" />
                    <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_AbstractGroup_parameterObject" id="1165018403156" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1084188901668">
    <property name="name" value="StaticFieldDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1070462154015" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1084188901669">
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1084188979613">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="static" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1084188979614">
        <property name="noTargetText" value="&lt;no type&gt;" />
        <property name="nullRefText" value="&lt;no type&gt;" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1068431790188" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1084188979615">
        <property name="textFgColor" value="DARK_MAGENTA" />
        <property name="writable" value="true" />
        <property name="fontStyle" value="BOLD_ITALIC" />
        <property name="defaultValue" value="?" />
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no name&gt;" />
        <property name="rightTransformAnchorTag" value="default_RTransform" />
        <link role="relationDeclaration" targetNodeId="18.1169194664001" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1084188979616">
        <property name="name" value="initializerArea" />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1084188979617">
          <property name="text" value="=" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1084188979618">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1068431790190" />
        </node>
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1145916370724">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1145916370725">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1145916372819">
              <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1145916388935">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1145916400547" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1145916377494">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1145916376040" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1145916379839">
                    <link role="link" targetNodeId="17.1068431790190" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1084188979619">
        <property name="text" value=";" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1085483277582">
    <property name="name" value="EnumClass_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1083245097125" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1085483277583">
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1085483277584">
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085483277585">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="enum" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1085483277586">
          <property name="drawBorder" value="false" />
          <property name="selectable" value="true" />
          <link role="relationDeclaration" targetNodeId="17.1075300953595" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169763676999">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="implements" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1169763677000">
          <property name="vertical" value="true" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1095933932569" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169763677001">
            <property name="nullText" value="&lt;none&gt;" />
            <property name="editable" value="true" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085483277587">
          <property name="selectable" value="false" />
          <property name="text" value="{" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1085483277588">
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085483277589">
          <property name="text" value="    " />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1085483277590">
          <property name="vertical" value="true" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1083245396908" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085483277591">
            <property name="selectable" value="true" />
            <property name="text" value="&lt;&lt; enum constants &gt;&gt;" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1138307589269">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1085483273078">
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085483273079">
          <property name="text" value="    " />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1085483273080">
          <property name="vertical" value="true" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1068390468199" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085483273081">
            <property name="selectable" value="true" />
            <property name="text" value="&lt;&lt; fields &gt;&gt;" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1138307592880">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1085483457770">
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085483457771">
          <property name="text" value="    " />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1085483457772">
          <property name="vertical" value="true" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1068390468201" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085483457773">
            <property name="selectable" value="true" />
            <property name="text" value="&lt;&lt; constructors &gt;&gt;" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1138307596445">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1085483457774">
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085483457775">
          <property name="text" value="    " />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1085483457776">
          <property name="vertical" value="true" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1107880067339" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085483457777">
            <property name="selectable" value="true" />
            <property name="text" value="&lt;&lt; methods &gt;&gt;" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1138307599041">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1085483457778">
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085483457779">
          <property name="text" value="    " />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1085483457780">
          <property name="vertical" value="true" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1070462273904" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085483457781">
            <property name="selectable" value="true" />
            <property name="text" value="&lt;&lt; static methods &gt;&gt;" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085483277593">
        <property name="selectable" value="false" />
        <property name="text" value="}" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1085485112422">
    <property name="name" value="EnumConstantDeclaration_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1083245299891" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1085485112428">
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1085485112429">
        <property name="fontStyle" value="BOLD" />
        <property name="textFgColor" value="DARK_MAGENTA" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="18.1169194664001" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085485112430">
        <property name="text" value="(" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1085485112431">
        <property name="separatorText" value="," />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1083245396909" />
        <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1095257566423">
          <property name="editable" value="true" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="true" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1085485112432">
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1090242255906">
    <property name="name" value="VariableReference_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1068498886296" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1134569731483">
      <property name="drawBorder" value="false" />
      <link role="relationDeclaration" targetNodeId="17.1068581517664" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1134569731484">
        <link role="conceptDeclaration" targetNodeId="17.1068431474542" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1134569731485">
          <property name="noTargetText" value="&lt;no name&gt;" />
          <property name="readOnly" value="true" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1083152972671" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1107796847143">
    <property name="name" value="Interface_Editor" />
    <link role="conceptDeclaration" targetNodeId="17.1107796713796" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1107796852505">
      <property name="name" value="classBox" />
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1107796852507">
        <property name="name" value="headerRow" />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1107796852517">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="interface" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1107796852518">
          <property name="writable" value="true" />
          <property name="defaultValue" value="&lt;no name&gt;" />
          <property name="noTargetText" value="&lt;no name&gt;" />
          <property name="drawBorder" value="false" />
          <property name="rightTransformAnchorTag" value="default_RTransform" />
          <property name="selectable" value="true" />
          <link role="relationDeclaration" targetNodeId="18.1169194664001" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1109281106345">
          <property name="drawBorder" value="false" />
          <link role="editorComponent" targetNodeId="1109280020740" />
          <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1145916182768">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1145916182769">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1145916184973">
                <node role="expression" type="jetbrains.mps.baseLanguage.GreaterThanExpression" id="1145916200293">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1145916205062">
                    <property name="value" value="0" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1145916194557">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1145916189226">
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1145916187991" />
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1145916192477">
                        <link role="link" targetNodeId="17.1109279881614" />
                      </node>
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.LinkList_GetCountOperation" id="1145916196636" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1107796852519">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="extends" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1107797338699">
          <property name="vertical" value="true" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1107797138135" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1107797338700">
            <property name="nullText" value="&lt;none&gt;" />
            <property name="editable" value="true" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1107796852521">
          <property name="selectable" value="false" />
          <property name="text" value="{" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1128556090207">
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1128556090208">
          <property name="selectable" value="false" />
          <property name="text" value="    " />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1128556090209">
          <property name="vertical" value="true" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1128555889557" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1128556090210">
            <property name="selectable" value="true" />
            <property name="text" value=" &lt;&lt; static fields&gt;&gt;" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1107796852512">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1107796852513">
        <property name="name" value="methodsArea" />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1107796852538">
          <property name="text" value="    " />
          <property name="name" value="methodsIndentCell" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1107796852539">
          <property name="name" value="methodsList" />
          <property name="vertical" value="true" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1107880067339" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1107796852540">
            <property name="selectable" value="true" />
            <property name="text" value=" &lt;&lt; methods &gt;&gt;" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1107796852514">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1107796852516">
        <property name="selectable" value="false" />
        <property name="text" value="}" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.EditorComponentDeclaration" id="1109280020740">
    <property name="name" value="_GenericDeclaration_TypeVariables_Component" />
    <link role="conceptDeclaration" targetNodeId="17.1109279851642" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1140573670191">
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <property name="selectable" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1140573670192">
        <property name="selectable" value="false" />
        <property name="text" value="&lt;" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1140573670193">
        <property name="separatorText" value="," />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1109279881614" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1140573670194">
        <property name="selectable" value="false" />
        <property name="text" value="&gt;" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="cellLayout" type="jetbrains.mps.bootstrap.editorLanguage.CellLayout_Horizontal" id="1140573670195" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1109281376921">
    <link role="conceptDeclaration" targetNodeId="17.1109279763828" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1109281432641">
      <property name="noTargetText" value="&lt;no name&gt;" />
      <property name="drawBorder" value="false" />
      <link role="relationDeclaration" targetNodeId="17.1109279783704" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1109283666334">
    <link role="conceptDeclaration" targetNodeId="17.1109283449304" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1109283721555">
      <property name="noTargetText" value="&lt;no type variable&gt;" />
      <property name="drawBorder" value="false" />
      <link role="relationDeclaration" targetNodeId="17.1109283546497" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1109283693882">
        <link role="conceptDeclaration" targetNodeId="17.1109279763828" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1109283721556">
          <property name="noTargetText" value="&lt;no name&gt;" />
          <property name="readOnly" value="true" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1109279783704" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1112992952159">
    <link role="conceptDeclaration" targetNodeId="17.1111509017652" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1113006710627">
      <property name="noTargetText" value="?.?" />
      <property name="textFgColor" value="blue" />
      <property name="drawBorder" value="false" />
      <link role="relationDeclaration" targetNodeId="17.1113006610751" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1113208357709">
    <link role="conceptDeclaration" targetNodeId="17.1070534760951" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1113208366980">
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1113208455587">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1070534760952" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1113208455588">
        <property name="text" value="[]" />
        <property name="drawBorder" value="false" />
        <link role="actionMap" targetNodeId="1140562594615" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1116615249130">
    <link role="conceptDeclaration" targetNodeId="17.1116615150612" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1116615268507">
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1116615277650">
        <property name="noTargetText" value="&lt;no classifier&gt;" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1116615189566" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1116615277651">
          <link role="conceptDeclaration" targetNodeId="17.1107461130800" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1116615309371">
            <property name="noTargetText" value="&lt;no name&gt;" />
            <property name="readOnly" value="true" />
            <property name="drawBorder" value="false" />
            <link role="relationDeclaration" targetNodeId="18.1169194664001" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1116615336905">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value=".class" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1128163980260">
    <link role="conceptDeclaration" targetNodeId="17.1107535904670" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Alternation" id="1140569118323">
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1140569207250">
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1140569208432">
          <property name="noTargetText" value="&lt;no classifier&gt;" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1107535924139" />
          <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1140569208433">
            <link role="conceptDeclaration" targetNodeId="17.1107461130800" />
            <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1140569208434">
              <property name="noTargetText" value="&lt;no name&gt;" />
              <property name="readOnly" value="true" />
              <property name="drawBorder" value="false" />
              <link role="relationDeclaration" targetNodeId="18.1169194664001" />
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1140569244933">
          <property name="selectable" value="true" />
          <property name="text" value="&lt;" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1140569244934">
          <property name="separatorText" value="," />
          <property name="vertical" value="false" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1109201940907" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1140569244935">
          <property name="selectable" value="true" />
          <property name="text" value="&gt;" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1145473161607">
        <property name="noTargetText" value="&lt;no classifier&gt;" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1107535924139" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1145473161608">
          <link role="conceptDeclaration" targetNodeId="17.1107461130800" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1145473161609">
            <property name="noTargetText" value="&lt;no name&gt;" />
            <property name="readOnly" value="true" />
            <property name="drawBorder" value="false" />
            <link role="relationDeclaration" targetNodeId="18.1169194664001" />
          </node>
        </node>
      </node>
      <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1145920376960">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1145920376961">
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1145920380913">
            <node role="expression" type="jetbrains.mps.baseLanguage.GreaterThanExpression" id="1145920404483">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1145920409767">
                <property name="value" value="0" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1145920399324">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1145920389932">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1145920387884" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1145920394870">
                    <link role="link" targetNodeId="17.1109201940907" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.LinkList_GetCountOperation" id="1145920401825" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1137022694554">
    <link role="conceptDeclaration" targetNodeId="17.1137021947720" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1176906088276">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_ModelAccess" id="1176906095407">
        <property name="editable" value="false" />
        <property name="selectable" value="false" />
        <node role="modelAcessor" type="jetbrains.mps.bootstrap.editorLanguage.ModelAccessor" id="1176906095408">
          <node role="getter" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_ModelAccess_Getter" id="1176906095409">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1176906095410">
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1176906166607">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1176906166608">
                  <property name="name" value="result" />
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1176906166609">
                    <link role="classifier" extResolveInfo="24.[Classifier]StringBuilder" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.NewExpression" id="1176906175457">
                    <link role="baseMethodDeclaration" extResolveInfo="24.constructor [Classifier]StringBuilder[ConstructorDeclaration] ()" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1176906196550">
                <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1176906199587">
                  <link role="baseMethodDeclaration" extResolveInfo="24.method ([Classifier]StringBuilder).([InstanceMethodDeclaration]append((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [CharSequence])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [AbstractStringBuilder]))" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1176906196551">
                    <link role="variableDeclaration" targetNodeId="1176906166608" resolveInfo="result" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.StringLiteral" id="1176906203855">
                    <property name="value" value="(" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1176906389199">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1176906389200">
                  <property name="name" value="parameters" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1176906874577">
                    <link role="elementConcept" targetNodeId="51.1071489090640" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1176906454367">
                    <link role="baseMethodDeclaration" extResolveInfo="20.method ([Classifier]SNode).([InstanceMethodDeclaration]getConceptLinkTargets((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]), (jetbrains.mps.baseLanguage.types.boolean/jetbrains.mps.baseLanguage.types.boolean), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;jetbrains.mps.baseLanguage.types.classifier [SNode]&gt;]))" />
                    <node role="instance" type="jetbrains.mps.bootstrap.smodelLanguage.SemanticDowncastExpression" id="1176906447434">
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1176906428897" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1176906651363">
                      <link role="classifier" extResolveInfo="49.[Classifier]ConceptFunction" />
                      <link role="variableDeclaration" extResolveInfo="49.static field ([Classifier]ConceptFunction).([StaticFieldDeclaration]CLNK_ApplicableConceptFunctionParameter : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]))" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1176906661775">
                      <property name="value" value="true" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1176906666628">
                      <link role="baseMethodDeclaration" extResolveInfo="21.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getScope() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope]))" />
                      <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1176906663982" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1176906670461">
                <node role="expression" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1176906672369">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1176906670462">
                    <link role="variableDeclaration" targetNodeId="1176906389200" resolveInfo="parameters" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.AddAllElementsOperation" id="1176906673698">
                    <node role="argument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1176906678415">
                      <link role="baseMethodDeclaration" extResolveInfo="20.method ([Classifier]SNode).([InstanceMethodDeclaration]getConceptLinkTargets((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]), (jetbrains.mps.baseLanguage.types.boolean/jetbrains.mps.baseLanguage.types.boolean), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;jetbrains.mps.baseLanguage.types.classifier [SNode]&gt;]))" />
                      <node role="instance" type="jetbrains.mps.bootstrap.smodelLanguage.SemanticDowncastExpression" id="1176906678416">
                        <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1176906678417" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1176906678418">
                        <link role="classifier" extResolveInfo="49.[Classifier]ConceptFunction" />
                        <link role="variableDeclaration" extResolveInfo="49.static field ([Classifier]ConceptFunction).([StaticFieldDeclaration]CLNK_ConceptFunctionParameter : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]))" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1176906678419">
                        <property name="value" value="true" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1176906678420">
                        <link role="baseMethodDeclaration" extResolveInfo="21.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getScope() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope]))" />
                        <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1176906678421" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1176906753277">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1176906753278">
                  <property name="name" value="isFirst" />
                  <node role="type" type="jetbrains.mps.baseLanguage.BooleanType" id="1176906753279" />
                  <node role="initializer" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1176908159767">
                    <property name="value" value="true" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ForeachStatement" id="1176906739193">
                <node role="iterable" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1176906749204">
                  <link role="variableDeclaration" targetNodeId="1176906389200" resolveInfo="parameters" />
                </node>
                <node role="variable" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1176906739195">
                  <property name="name" value="cfp" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1176906741439">
                    <link role="concept" targetNodeId="51.1071489090640" />
                  </node>
                </node>
                <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1176906739197">
                  <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1176906760398">
                    <node role="condition" type="jetbrains.mps.baseLanguage.NotExpression" id="1176906763490">
                      <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1176906765258">
                        <link role="variableDeclaration" targetNodeId="1176906753278" resolveInfo="first" />
                      </node>
                    </node>
                    <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1176906760400">
                      <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1176906770395">
                        <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1176906772969">
                          <link role="baseMethodDeclaration" extResolveInfo="24.method ([Classifier]StringBuilder).([InstanceMethodDeclaration]append((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [CharSequence])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [AbstractStringBuilder]))" />
                          <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1176906770396">
                            <link role="variableDeclaration" targetNodeId="1176906166608" resolveInfo="result" />
                          </node>
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.StringLiteral" id="1176906775059">
                            <property name="value" value=", " />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1176907378292">
                    <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1176907379887">
                      <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1176907378293">
                        <link role="variableDeclaration" targetNodeId="1176906753278" resolveInfo="isFirst" />
                      </node>
                      <node role="rValue" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1176907697030" />
                    </node>
                  </node>
                  <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1176907370849">
                    <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1176907388238">
                      <link role="baseMethodDeclaration" extResolveInfo="24.method ([Classifier]StringBuilder).([InstanceMethodDeclaration]append((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [CharSequence])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [AbstractStringBuilder]))" />
                      <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1176907370850">
                        <link role="variableDeclaration" targetNodeId="1176906166608" resolveInfo="result" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1176907841968">
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1176907390474">
                          <link role="variableDeclaration" targetNodeId="1176906739195" resolveInfo="cfp" />
                        </node>
                        <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SConceptPropertyAccess" id="1176907852735">
                          <link role="conceptProperty" targetNodeId="18.1137473891462" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1176906207297">
                <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1176906210008">
                  <link role="baseMethodDeclaration" extResolveInfo="24.method ([Classifier]StringBuilder).([InstanceMethodDeclaration]append((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [CharSequence])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [AbstractStringBuilder]))" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1176906207298">
                    <link role="variableDeclaration" targetNodeId="1176906166608" resolveInfo="result" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.StringLiteral" id="1176906211901">
                    <property name="value" value=")-&gt;" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1176908482282">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1176908482283">
                  <property name="name" value="retType" />
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1176908482284">
                    <link role="classifier" extResolveInfo="20.[Classifier]SNode" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1176908474418">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1176908454162">
                      <link role="baseMethodDeclaration" extResolveInfo="20.method ([Classifier]SNode).([InstanceMethodDeclaration]getConceptLinkTargets((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]), (jetbrains.mps.baseLanguage.types.boolean/jetbrains.mps.baseLanguage.types.boolean), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;jetbrains.mps.baseLanguage.types.classifier [SNode]&gt;]))" />
                      <node role="instance" type="jetbrains.mps.bootstrap.smodelLanguage.SemanticDowncastExpression" id="1176908444830">
                        <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1176908440385" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1176908464335">
                        <link role="classifier" extResolveInfo="49.[Classifier]ConceptFunction" />
                        <link role="variableDeclaration" extResolveInfo="49.static field ([Classifier]ConceptFunction).([StaticFieldDeclaration]CLNK_ConceptFunctionReturnType : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]))" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1176908718153" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1176908723170">
                        <link role="baseMethodDeclaration" extResolveInfo="21.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getScope() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope]))" />
                        <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1176908720943" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.GetFirstOperation" id="1176908475467" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1176908485790">
                <node role="condition" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1176908489611">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1176908491633" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1176908487480">
                    <link role="variableDeclaration" targetNodeId="1176908482283" resolveInfo="retType" />
                  </node>
                </node>
                <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1176908485792">
                  <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1176908494221">
                    <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1176908497809">
                      <link role="baseMethodDeclaration" extResolveInfo="24.method ([Classifier]StringBuilder).([InstanceMethodDeclaration]append((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [CharSequence])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [AbstractStringBuilder]))" />
                      <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1176908494222">
                        <link role="variableDeclaration" targetNodeId="1176906166608" resolveInfo="result" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.StringLiteral" id="1176908500298">
                        <property name="value" value="???" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.BlockStatement" id="1176908505198">
                  <node role="statements" type="jetbrains.mps.baseLanguage.StatementList" id="1176908505199">
                    <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1176908507770">
                      <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1176908510338">
                        <link role="baseMethodDeclaration" extResolveInfo="24.method ([Classifier]StringBuilder).([InstanceMethodDeclaration]append((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [CharSequence])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [AbstractStringBuilder]))" />
                        <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1176908507771">
                          <link role="variableDeclaration" targetNodeId="1176906166608" resolveInfo="result" />
                        </node>
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1176909004176">
                          <link role="baseMethodDeclaration" extResolveInfo="52.static method ([Classifier]NameUtil).([StaticMethodDeclaration]shortNameFromLongName((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]))" />
                          <link role="classConcept" extResolveInfo="52.[Classifier]NameUtil" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1176909004558">
                            <link role="baseMethodDeclaration" extResolveInfo="20.method ([Classifier]SNode).([InstanceMethodDeclaration]getName() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]))" />
                            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1176909004559">
                              <link role="variableDeclaration" targetNodeId="1176908482283" resolveInfo="retType" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1176906182241">
                <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1176906186484">
                  <link role="baseMethodDeclaration" extResolveInfo="24.method ([Classifier]StringBuilder).([InstanceMethodDeclaration]toString() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]))" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1176906185322">
                    <link role="variableDeclaration" targetNodeId="1176906166608" resolveInfo="result" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="setter" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_ModelAccess_Setter" id="1176906095411">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1176906095412" />
          </node>
          <node role="validator" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_ModelAccess_Validator" id="1176906095413">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1176906095414">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1176906152240">
                <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1176906157713">
                  <link role="baseMethodDeclaration" extResolveInfo="24.method ([Classifier]String).([InstanceMethodDeclaration]equals((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Object])) : (jetbrains.mps.baseLanguage.types.boolean/jetbrains.mps.baseLanguage.types.boolean))" />
                  <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_oldText" id="1176906154820" />
                  <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_text" id="1176906159386" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1176906088277">
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1176906091983">
          <property name="text" value="  " />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1176906088278">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1137022507850" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1139533461943">
    <link role="conceptDeclaration" targetNodeId="17.1107135704075" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_ConceptProperty" id="1139533905854">
      <property name="textFgColor" value="DARK_BLUE" />
      <property name="fontStyle" value="ITALIC" />
      <property name="noTargetText" value="&lt;ConceptFunctionParameter with no alias&gt;" />
      <property name="drawBorder" value="false" />
      <link role="relationDeclaration" targetNodeId="18.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapDeclaration" id="1140226376803">
    <property name="name" value="ExpressionStatement_Expression_Actions" />
    <link role="applicableConcept" targetNodeId="17.1068580123155" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1140226437070">
      <property name="description" value="delete whole statement" />
      <property name="actionId" value="delete_action_id" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1140226437072">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1140226437137">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1140226528509">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1140226531354">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1140226528556" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_DeleteOperation" id="1140226534405" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapDeclaration" id="1140562594615">
    <property name="name" value="ArrayType_Brackets_Actions" />
    <link role="applicableConcept" targetNodeId="17.1070534760951" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1140562601804">
      <property name="description" value="replace array type with array's component type" />
      <property name="actionId" value="delete_action_id" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1140562601821">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1140562601823">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1140562636421">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1140562639579">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1140562636438" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithAnotherOperation" id="1140562643471">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1140562648615">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1140562646926" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1140562653381">
                    <link role="link" targetNodeId="17.1070534760952" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapDeclaration" id="1140722264121">
    <property name="name" value="BinaryOperation_Symbol_Actions" />
    <link role="applicableConcept" targetNodeId="17.1081773326031" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1140722318748">
      <property name="description" value="disable delete" />
      <property name="actionId" value="delete_action_id" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1140722318749">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1140722318987" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapDeclaration" id="1140733182387">
    <property name="name" value="NotExpression_Parens_Actions" />
    <link role="applicableConcept" targetNodeId="17.1081516740877" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1140733217028">
      <property name="description" value="remove not-expression" />
      <property name="actionId" value="delete_action_id" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1140733217046">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1140733217126">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1140733960321">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1140733962854">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1140733960337" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithAnotherOperation" id="1140733967996">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1140733973561">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1140733971560" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1159219278148">
                    <link role="link" targetNodeId="17.1081516765348" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapDeclaration" id="1140734304236">
    <property name="name" value="BinaryOperation_LeftArgument_Actions" />
    <link role="applicableConcept" targetNodeId="17.1081773326031" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1140734304237">
      <property name="description" value="replace binary operation with right operand" />
      <property name="actionId" value="delete_action_id" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1140734304242">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1140734304243">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1140734654521">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1140734656414">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1140734654538" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithAnotherOperation" id="1140734659758">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1140734664965">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1140734663104" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1140734670887">
                    <link role="link" targetNodeId="17.1081773367579" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapDeclaration" id="1140734681122">
    <property name="name" value="BinaryOperation_RightArgument_Actions" />
    <link role="applicableConcept" targetNodeId="17.1081773326031" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1140734681123">
      <property name="description" value="replace binary operation with left operand" />
      <property name="actionId" value="delete_action_id" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1140734681128">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1140734681129">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1140734681130">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1140734681131">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1140734681132" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithAnotherOperation" id="1140734681133">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1140734681134">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1140734681135" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1140734699075">
                    <link role="link" targetNodeId="17.1081773367580" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapDeclaration" id="1140748024390">
    <property name="name" value="ParameterDeclaration_Name_Actions" />
    <link role="applicableConcept" targetNodeId="17.1068498886292" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1140748044079">
      <property name="description" value="add next parameter" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1140748044081">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1140748044192">
          <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1140748074212">
            <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1140748087032">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1140748082201">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1140748081466" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetParentOperation" id="1140748086234" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1140748089330">
                <link role="concept" targetNodeId="17.1068580123132" />
              </node>
            </node>
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1140748074229">
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1140748099722">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1140748123279">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1140748105352">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1140748111276">
                      <link role="concept" targetNodeId="17.1068580123132" />
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1140748101536">
                        <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1140748099723" />
                        <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetParentOperation" id="1140748110775" />
                      </node>
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1140748122746">
                      <link role="link" targetNodeId="17.1068580123134" />
                    </node>
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.LinkList_AddNewChildOperation" id="1140748128873" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapDeclaration" id="1141078927588">
    <property name="name" value="IfStatement_Actions" />
    <link role="applicableConcept" targetNodeId="17.1068580123159" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1141078941917">
      <property name="description" value="add false branch" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1141078941919">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1141078941921">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1141079034145">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1141079059242">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1141079036631">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1141079034161" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1141079056866">
                  <link role="link" targetNodeId="17.1082485599094" />
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetNewChildOperation" id="1141079065431" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapDeclaration" id="1142045237802">
    <property name="name" value="FieldReference_FieldName_Actions" />
    <link role="applicableConcept" targetNodeId="17.1068580123158" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1142045287538">
      <property name="description" value="replace field reference with expression before period" />
      <property name="actionId" value="delete_action_id" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1142045287539">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1142045287540">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1142045412353">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1142045414527">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1142045412354" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithAnotherOperation" id="1142045420997">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1142045426907">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1142045426187" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1142045437768">
                    <link role="link" targetNodeId="17.1080137532343" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapDeclaration" id="1142045498909">
    <property name="name" value="InstanceMethodCall_MethodName_Actions" />
    <link role="applicableConcept" targetNodeId="17.1068580123163" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1142045514676">
      <property name="description" value="replace method call with expression before period" />
      <property name="actionId" value="delete_action_id" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1142045514677">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1142045514678">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1142045544523">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1142045545790">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1142045544524" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithAnotherOperation" id="1142045548494">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1142045558716">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1142045555340" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1142045567123">
                    <link role="link" targetNodeId="17.1068580123164" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapDeclaration" id="1144185359094">
    <property name="name" value="CastExpression_Actions" />
    <link role="applicableConcept" targetNodeId="17.1070534934090" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1144185375057">
      <property name="description" value="remove type cast" />
      <property name="actionId" value="delete_action_id" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1144185375058">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1144185375059">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1144185429029">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1144185430249">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1144185429030" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithAnotherOperation" id="1144185433250">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1144185438316">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1144185437065" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1144185440426">
                    <link role="link" targetNodeId="17.1070534934092" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1144226417952">
    <link role="conceptDeclaration" targetNodeId="17.1144226303539" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1144226433013">
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1144226435781">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1144226437079">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="for" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1144226456238">
          <property name="text" value="(" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1144231017698">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1144230900587" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1144226473821">
          <property name="selectable" value="false" />
          <property name="text" value=":" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1144226478511">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1144226360166" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1144226481903">
          <property name="text" value=")" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1144226484296">
          <property name="text" value="{" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1144226488189">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1144226489706">
          <property name="selectable" value="false" />
          <property name="text" value="  " />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1144226492349">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1154032183016" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1144226496132">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1144226498103">
          <property name="text" value="}" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1144231351548">
    <link role="conceptDeclaration" targetNodeId="17.1144231330558" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1144231387418">
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1144231387419">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1144231387420">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="for" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1144231387421">
          <property name="text" value="(" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1144231387422">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1144230900587" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1144231387423">
          <property name="text" value=";" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1144231420872">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1144231399730" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1144231423624">
          <property name="text" value=";" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1144231426986">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1144231408325" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1144231387425">
          <property name="text" value=")" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1144231387426">
          <property name="text" value="{" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1144231387427">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1144231387428">
          <property name="selectable" value="false" />
          <property name="text" value="  " />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1144231387429">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1154032183016" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1144231387430">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1144231387431">
          <property name="text" value="}" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapDeclaration" id="1144367099981">
    <property name="name" value="LocalVariableDeclaration_Initializer_Actions" />
    <link role="applicableConcept" targetNodeId="17.1068581242863" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1144367145106">
      <property name="description" value="remove initializer" />
      <property name="actionId" value="delete_action_id" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1144367145107">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1144367145108">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1144367224297">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1144367229801">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1144367225924">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1144367224298" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1144367227909">
                  <link role="link" targetNodeId="17.1068431790190" />
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_DeleteChildOperation" id="1144367235177" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapDeclaration" id="1144406653773">
    <property name="name" value="LocalVariableDeclaration_KeyMap" />
    <link role="applicableConcept" targetNodeId="17.1068581242863" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1144406696429">
      <property name="description" value="inline local variable" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1145481213349">
        <property name="keycode" value="VK_N" />
        <property name="modifiers" value="alt" />
      </node>
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1144406696430">
        <property name="keycode" value="VK_N" />
        <property name="modifiers" value="ctrl+alt" />
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_IsApplicableFunction" id="1144406696431">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1144406696432">
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1144406710075">
            <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1144407231018">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1144407233443" />
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1144407228500">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1159379770909" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1144407229845">
                  <link role="link" targetNodeId="17.1068431790190" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1144406696433">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1144406696434">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1144407113379">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1144407113380">
              <property name="name" value="modelDescriptor" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1144407113381">
                <link role="classifier" extResolveInfo="20.[Classifier]SModelDescriptor" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1145474050918">
                <link role="baseMethodDeclaration" extResolveInfo="20.method ([Classifier]SModel).([InstanceMethodDeclaration]getModelDescriptor() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SModelDescriptor]))" />
                <node role="instance" type="jetbrains.mps.bootstrap.smodelLanguage.SemanticDowncastExpression" id="1145474029453">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1145473763793">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1145473763794" />
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetModelOperation" id="1145473763795" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.AssertStatement" id="1161261440449">
            <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1161261445187">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1161261447096" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1161261442498">
                <link role="variableDeclaration" targetNodeId="1144407113380" resolveInfo="modelDescriptor" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1144407189794">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1144407189795">
              <property name="name" value="usages" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1144407189796">
                <link role="classifier" extResolveInfo="19.[Classifier]Set" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1144407194876">
                  <link role="classifier" extResolveInfo="20.[Classifier]SReference" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1144407200090">
                <link role="baseMethodDeclaration" extResolveInfo="20.method ([Classifier]SModelDescriptor).([InstanceMethodDeclaration]findUsages((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Set, &lt;jetbrains.mps.baseLanguage.types.classifier [SReference]&gt;]))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1144407202640">
                  <link role="variableDeclaration" targetNodeId="1144407113380" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1159379780961" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1159395058344">
            <node role="condition" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1159395072959">
              <link role="baseMethodDeclaration" extResolveInfo="19.method ([Classifier]Set).([InstanceMethodDeclaration]isEmpty() : (jetbrains.mps.baseLanguage.types.boolean/jetbrains.mps.baseLanguage.types.boolean))" />
              <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1159395064300">
                <link role="variableDeclaration" targetNodeId="1144407189795" resolveInfo="usages" />
              </node>
            </node>
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1159395058346">
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1159395102367">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1159395102368">
                  <link role="baseMethodDeclaration" extResolveInfo="23.static method ([Classifier]JOptionPane).([StaticMethodDeclaration]showMessageDialog((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Component]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Object]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]), (jetbrains.mps.baseLanguage.types.int/jetbrains.mps.baseLanguage.types.int)) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
                  <link role="classConcept" extResolveInfo="23.[Classifier]JOptionPane" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1159395102369">
                    <link role="baseMethodDeclaration" extResolveInfo="21.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getNodeEditorComponent() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [AbstractEditorComponent]))" />
                    <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1159395102370" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.StringLiteral" id="1159395102371">
                    <property name="value" value="Variable is never used" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.StringLiteral" id="1159395102372" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1159395102373">
                    <link role="classifier" extResolveInfo="23.[Classifier]JOptionPane" />
                    <link role="variableDeclaration" extResolveInfo="23.static field ([Classifier]JOptionPane).([StaticFieldDeclaration]INFORMATION_MESSAGE : (jetbrains.mps.baseLanguage.types.int/jetbrains.mps.baseLanguage.types.int))" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1159395102374" />
            </node>
            <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.BlockStatement" id="1159395209016">
              <node role="statements" type="jetbrains.mps.baseLanguage.StatementList" id="1159395209017">
                <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1159395534907">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1159395534908">
                    <property name="name" value="code" />
                    <node role="type" type="jetbrains.mps.baseLanguage.IntegerType" id="1159395534910" />
                    <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1159395352110">
                      <link role="classConcept" extResolveInfo="23.[Classifier]JOptionPane" />
                      <link role="baseMethodDeclaration" extResolveInfo="23.static method ([Classifier]JOptionPane).([StaticMethodDeclaration]showConfirmDialog((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Component]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Object]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]), (jetbrains.mps.baseLanguage.types.int/jetbrains.mps.baseLanguage.types.int)) : (jetbrains.mps.baseLanguage.types.int/jetbrains.mps.baseLanguage.types.int))" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1159395352111">
                        <link role="baseMethodDeclaration" extResolveInfo="21.method ([Classifier]EditorContext).([InstanceMethodDeclaration]getNodeEditorComponent() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [AbstractEditorComponent]))" />
                        <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1159395352112" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.PlusExpression" id="1159395419272">
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1159395461887">
                          <node role="rightExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1159395470234">
                            <property name="value" value=" occurrences)" />
                          </node>
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1159395441949">
                            <link role="baseMethodDeclaration" extResolveInfo="19.method ([Classifier]Set).([InstanceMethodDeclaration]size() : (jetbrains.mps.baseLanguage.types.int/jetbrains.mps.baseLanguage.types.int))" />
                            <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1159395431963">
                              <link role="variableDeclaration" targetNodeId="1144407189795" resolveInfo="usages" />
                            </node>
                          </node>
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1159395352113">
                          <property name="value" value="Inline variable? (" />
                        </node>
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.StringLiteral" id="1159395352114" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1159395352115">
                        <link role="classifier" extResolveInfo="23.[Classifier]JOptionPane" />
                        <link role="variableDeclaration" extResolveInfo="23.static field ([Classifier]JOptionPane).([StaticFieldDeclaration]YES_NO_OPTION : (jetbrains.mps.baseLanguage.types.int/jetbrains.mps.baseLanguage.types.int))" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1159395552975">
                  <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1159395564588">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1159395572778">
                      <link role="classifier" extResolveInfo="23.[Classifier]JOptionPane" />
                      <link role="variableDeclaration" extResolveInfo="23.static field ([Classifier]JOptionPane).([StaticFieldDeclaration]YES_OPTION : (jetbrains.mps.baseLanguage.types.int/jetbrains.mps.baseLanguage.types.int))" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1159395559228">
                      <link role="variableDeclaration" targetNodeId="1159395534908" resolveInfo="code" />
                    </node>
                  </node>
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1159395552977">
                    <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1159395593154" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ForeachStatement" id="1144407265414">
            <node role="iterable" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1144407274826">
              <link role="variableDeclaration" targetNodeId="1144407189795" />
            </node>
            <node role="variable" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1144407265416">
              <property name="name" value="ref" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1144407268184">
                <link role="classifier" extResolveInfo="20.[Classifier]SReference" />
              </node>
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1144407265418">
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1144407405214">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1144407405215">
                  <property name="name" value="sourceNode" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1144407405216" />
                  <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1144407417319">
                    <link role="baseMethodDeclaration" extResolveInfo="20.method ([Classifier]SReference).([InstanceMethodDeclaration]getSourceNode() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode]))" />
                    <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1144407414254">
                      <link role="variableDeclaration" targetNodeId="1144407265416" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1144407362715">
                <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1144407362717">
                  <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1145474226174">
                    <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1145474244975">
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1145474234614">
                        <link role="concept" targetNodeId="17.1068498886296" />
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1145474226175">
                          <link role="variableDeclaration" targetNodeId="1144407405215" />
                        </node>
                      </node>
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithAnotherOperation" id="1145474249679">
                        <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1145474260403">
                          <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1145474257713">
                            <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1159379780942" />
                            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1145474259058">
                              <link role="link" targetNodeId="17.1068431790190" />
                            </node>
                          </node>
                          <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_CopyOperation" id="1145474263357" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1144407422821">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1144407422070">
                    <link role="variableDeclaration" targetNodeId="1144407405215" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1144407424228">
                    <link role="concept" targetNodeId="17.1068498886296" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1144408314121">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1144408663967">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1145474723754">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1159379780944" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAncestorOperation" id="1171476530678">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.OperationParm_Concept" id="1145474736054">
                    <link role="concept" targetNodeId="17.1068581242864" />
                  </node>
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_DeleteOperation" id="1144408667624" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1173815138231">
      <property name="description" value="split into declaration and assignment" />
      <property name="showInPopup" value="true" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1173815138232">
        <property name="keycode" value="VK_ENTER" />
        <property name="modifiers" value="alt" />
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1173815138233">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1173815138234">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1173815449555">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1173815449556">
              <property name="name" value="eStatement" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1173815449554">
                <link role="concept" targetNodeId="17.1068580123155" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173815399574">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173815394607">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1173815393756" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetModelOperation" id="1173815396973" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Model_CreateNewNodeOperation" id="1173815404503">
                  <link role="concept" targetNodeId="17.1068580123155" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1173815479707">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1173815479708">
              <property name="name" value="assignment" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1173815479706">
                <link role="concept" targetNodeId="17.1068498886294" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173815464248">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173815459859">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1173815458540">
                    <link role="variableDeclaration" targetNodeId="1173815449556" resolveInfo="statement" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1173815463570">
                    <link role="link" targetNodeId="17.1068580123156" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetNewChildOperation" id="1173815467505">
                  <link role="concept" targetNodeId="17.1068498886294" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1173815495206">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173815501853">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173815497652">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1173815495207">
                  <link role="variableDeclaration" targetNodeId="1173815479708" resolveInfo="assignment" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1173815500893">
                  <link role="link" targetNodeId="17.1068498886297" />
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1173815504001">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173815511219">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1173815510103" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1173815514148">
                    <link role="link" targetNodeId="17.1068431790190" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1173815588617">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1173815588618">
              <property name="name" value="local" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1173815588616">
                <link role="concept" targetNodeId="17.1068581242866" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173815565283">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173815521186">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1173815520007">
                    <link role="variableDeclaration" targetNodeId="1173815479708" resolveInfo="assignment" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1173815528896">
                    <link role="link" targetNodeId="17.1068498886295" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetNewChildOperation" id="1173815567509">
                  <link role="concept" targetNodeId="17.1068581242866" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1173815596616">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173815618607">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173815597671">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1173815596617">
                  <link role="variableDeclaration" targetNodeId="1173815588618" resolveInfo="local" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1173815617912">
                  <link role="link" targetNodeId="17.1070568296581" />
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1173815619801">
                <node role="parameter" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1173815626450" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1173815807473">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173815809090">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173816080056">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1173816080057" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAncestorOperation" id="1173816080058">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.OperationParm_Concept" id="1173816080059">
                    <link role="concept" targetNodeId="17.1068580123157" />
                  </node>
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_InsertNextSiblingOperation" id="1173815810910">
                <node role="parameter" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1173815814589">
                  <link role="variableDeclaration" targetNodeId="1173815449556" resolveInfo="eStatement" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_IsApplicableFunction" id="1173815175135">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1173815175136">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1173815213641">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173815222272">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173815214805">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1173815213642" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1173815217328">
                  <link role="link" targetNodeId="17.1068431790190" />
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsNotNullOperation" id="1173815223873" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1145552942324">
    <link role="conceptDeclaration" targetNodeId="17.1145552809883" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Error" id="1145552947529">
      <property name="text" value="what?" />
      <property name="drawBorder" value="false" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1145553127929">
    <link role="conceptDeclaration" targetNodeId="17.1145552977093" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1145553172764">
      <property name="name" value="expressionBox" />
      <property name="vertical" value="false" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1145553172765">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="new" />
        <property name="fontStyle" value="BOLD" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1145553197247">
        <property name="noTargetText" value="?" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1145553007750" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1146644925113">
    <link role="conceptDeclaration" targetNodeId="17.1146644602865" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1146644928271">
      <property name="textFgColor" value="DARK_BLUE" />
      <property name="text" value="public" />
      <property name="fontStyle" value="BOLD" />
      <property name="drawBorder" value="false" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1146644985742">
    <link role="conceptDeclaration" targetNodeId="17.1146644623116" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1146644988135">
      <property name="textFgColor" value="DARK_BLUE" />
      <property name="text" value="private" />
      <property name="fontStyle" value="BOLD" />
      <property name="drawBorder" value="false" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1146645052825">
    <link role="conceptDeclaration" targetNodeId="17.1146644641414" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1146645055811">
      <property name="textFgColor" value="DARK_BLUE" />
      <property name="text" value="protected" />
      <property name="fontStyle" value="BOLD" />
      <property name="drawBorder" value="false" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapDeclaration" id="1152311212234">
    <property name="name" value="ReturnStatement_Actions" />
    <link role="applicableConcept" targetNodeId="17.1068581242878" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1152311238844">
      <property name="description" value="add return expression" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1152311238845">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1152311238846">
          <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1152311340870">
            <node role="condition" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1152311351517">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1152311355738" />
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1152311347327">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1152311343998" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1152311349516">
                  <link role="link" targetNodeId="17.1068581517676" />
                </node>
              </node>
            </node>
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1152311340872">
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1152311361185">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1152311361186">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1152311361187">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1152311361188" />
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1152311361189">
                      <link role="link" targetNodeId="17.1068581517676" />
                    </node>
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetNewChildOperation" id="1152311361190" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1172931671809">
      <property name="actionId" value="delete_action_id" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1172931671810">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1172931671811">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1172931987773">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1172931987774">
              <property name="name" value="expressionStatement" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1172931987775">
                <link role="concept" targetNodeId="17.1068580123155" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172932002825">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1172932002230" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithNewOperation" id="1172932005357">
                  <link role="concept" targetNodeId="17.1068580123155" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1172932018265">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172932021347">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172932019080">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1172932018266">
                  <link role="variableDeclaration" targetNodeId="1172931987774" resolveInfo="expressionStatement" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1172932020893">
                  <link role="link" targetNodeId="17.1068580123156" />
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1172932022505">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172932027664">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1172932027100" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1172932029321">
                    <link role="link" targetNodeId="17.1068581517676" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1153179573304">
    <link role="conceptDeclaration" targetNodeId="17.1153179560115" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1153179576790">
      <property name="drawBorder" value="false" />
      <link role="relationDeclaration" targetNodeId="17.1153179615652" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1153179576791">
        <link role="conceptDeclaration" targetNodeId="17.1153179527848" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1153179665872">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="readOnly" value="true" />
          <property name="fontStyle" value="ITALIC" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="18.1169194664001" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1153952460625">
    <link role="conceptDeclaration" targetNodeId="17.1153952380246" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1153952495820">
      <property name="name" value="statementBox" />
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1153952537425">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="try {" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Alternation" id="1164881171028">
        <property name="drawBorder" value="false" />
        <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1164881171029">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1164881171030">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1164881628084">
              <node role="expression" type="jetbrains.mps.baseLanguage.GreaterThanExpression" id="1164906007190">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164905998718">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164881631930">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1164881631007" />
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1164905996842">
                      <link role="link" targetNodeId="17.1164903700860" />
                    </node>
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.LinkList_GetCountOperation" id="1164906002016" />
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1164906113939">
                  <property name="value" value="0" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1164881229403">
          <property name="name" value="ifTrueBox" />
          <property name="vertical" value="false" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1164881229404">
            <property name="text" value="  " />
            <property name="name" value="indentCell" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1164881229405">
            <property name="drawBorder" value="false" />
            <link role="relationDeclaration" targetNodeId="17.1153952416686" />
          </node>
        </node>
        <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1164881235374">
          <property name="vertical" value="true" />
          <property name="drawBorder" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1164881240166">
            <property name="name" value="ifTrueBox" />
            <property name="vertical" value="false" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1164881240167">
              <property name="text" value="  " />
              <property name="name" value="indentCell" />
              <property name="drawBorder" value="false" />
              <property name="selectable" value="false" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1164881240168">
              <property name="drawBorder" value="false" />
              <link role="relationDeclaration" targetNodeId="17.1153952416686" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1164903740612">
            <property name="vertical" value="true" />
            <property name="drawBorder" value="false" />
            <link role="relationDeclaration" targetNodeId="17.1164903700860" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1153952559385">
        <property name="name" value="ifTrueBox" />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1156760034198">
          <property name="text" value="}" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1156760036872">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="finally" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1156760040296">
          <property name="text" value="{" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1153952622722">
        <property name="name" value="ifTrueBox" />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1153952622723">
          <property name="text" value="  " />
          <property name="name" value="indentCell" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1153952622724">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1153952429843" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1153952495829">
        <property name="editable" value="true" />
        <property name="text" value="}" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1154543001514">
    <link role="conceptDeclaration" targetNodeId="17.1154542696413" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1154543006078">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1154543009938">
        <property name="attractsFocus" value="2" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1154542793668" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1154543021847">
        <property name="text" value="[]" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1154543041458">
        <property name="text" value="{" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1154543050632">
        <property name="separatorText" value="," />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1154542803372" />
        <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1154543473706">
          <property name="editable" value="true" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="true" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1154543071509">
        <property name="text" value="}" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1157103825466">
    <link role="conceptDeclaration" targetNodeId="17.1157103807699" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1157103836672">
      <property name="textFgColor" value="DARK_BLUE" />
      <property name="text" value="number" />
      <property name="drawBorder" value="false" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapDeclaration" id="1158938292640">
    <property name="name" value="CastExpression_KeyMap" />
    <link role="applicableConcept" targetNodeId="17.1070534934090" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1158938418835">
      <property name="description" value="fills cast type of cast expression" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1158938418836">
        <property name="keycode" value="VK_SPACE" />
        <property name="modifiers" value="ctrl+shift" />
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_IsApplicableFunction" id="1158938418837">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1158938418838">
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1158938751597">
            <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1158938751598">
              <link role="baseMethodDeclaration" targetNodeId="27.1158872234373" />
              <link role="classConcept" targetNodeId="27.1158872173903" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1159378741136" />
            </node>
          </node>
        </node>
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1158938418851">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1158938418852">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1158938821620">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1158938821621">
              <property name="name" value="type" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1158938821623">
                <link role="concept" targetNodeId="17.1068431790189" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1158938807556">
                <link role="baseMethodDeclaration" targetNodeId="27.1158872840752" />
                <link role="classConcept" targetNodeId="27.1158872173903" />
                <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1159378754621" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1158938418869">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1158938418870">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1158938418871">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1159378764044" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1158938418873">
                  <link role="link" targetNodeId="17.1070534934091" />
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1158938418874">
                <node role="parameter" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1158938829859">
                  <link role="variableDeclaration" targetNodeId="1158938821621" resolveInfo="type" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1160998925942">
    <link role="conceptDeclaration" targetNodeId="17.1160998861373" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1160998929742">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1160998932010">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="assert" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1160998948730">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1160998896846" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1160998951921">
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1160998953485">
          <property name="text" value=":" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1160998956472">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1160998916832" />
        </node>
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1160998991141">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1160998991142">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1160999047428">
              <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1160999059730">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1160999073890" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1160999053385">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1160999052055" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1160999057386">
                    <link role="link" targetNodeId="17.1160998916832" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1161001754075">
        <property name="text" value=";" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1160998960176">
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1160998963757">
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1160998967247">
          <property name="text" value="Error message : " />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1160998974609">
          <property name="noTargetText" value="&lt;no message&gt;" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1160998916832" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1163668945130">
    <link role="conceptDeclaration" targetNodeId="17.1163668896201" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1163668947305">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1163668952186">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1163668914799" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1163668954406">
        <property name="text" value="?" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1163668956502">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1163668922816" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1163668958738">
        <property name="selectable" value="false" />
        <property name="text" value=":" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1163668962067">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1163668934364" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1163670694952">
    <link role="conceptDeclaration" targetNodeId="17.1163670641947" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1163670711192">
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1163670713648">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1163670716711">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="case" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1163670720712">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1163670677455" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1163670734837">
          <property name="text" value=":" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1163670739981">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1163670742518">
          <property name="selectable" value="false" />
          <property name="text" value="  " />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1163670745145">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1163670683720" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1163670786880">
    <link role="conceptDeclaration" targetNodeId="17.1163670490218" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1163670789804">
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1163670794760">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1163670796715">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="switch" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1163670800858">
          <property name="text" value="(" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1163670803641">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1163670766145" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1163670806471">
          <property name="text" value=")" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1163670808551">
          <property name="text" value="{" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1163670841710">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1163670843446">
          <property name="selectable" value="false" />
          <property name="text" value="  " />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1163670928772">
          <property name="vertical" value="true" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1163670772911" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1163670934493">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1163670935682">
          <property name="text" value="  " />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1163671008278">
          <property name="vertical" value="true" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1163671019030">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1163671020671">
              <property name="textFgColor" value="DARK_BLUE" />
              <property name="text" value="default" />
              <property name="drawBorder" value="false" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1163671022658">
              <property name="text" value=":" />
              <property name="drawBorder" value="false" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1163671033004">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1163671034803">
              <property name="selectable" value="false" />
              <property name="text" value="  " />
              <property name="drawBorder" value="false" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1163671042758">
              <property name="drawBorder" value="false" />
              <link role="relationDeclaration" targetNodeId="17.1163670592366" />
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1163670831817">
        <property name="text" value="}" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1163704265146">
    <property name="name" value="QueriesUtil" />
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1163704285491">
      <property name="name" value="replaceNodeMenu_StaticFieldReference_getParameterObjects" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1163704292666" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1163704285493">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1163704509843">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1163704509844">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1163704509845" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.GenericNewExpression" id="1163704533394">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListCreator" id="1163704535349">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1163704535350" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1163704572844">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1163704572845">
            <property name="name" value="classifier" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1163704572863">
              <link role="concept" targetNodeId="17.1107461130800" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1163704551358">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1163704550013">
                <link role="variableDeclaration" targetNodeId="1163704459542" resolveInfo="referenceNode" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1163704555749">
                <link role="link" targetNodeId="17.1144433057691" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1163704576802">
          <node role="condition" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1163704580759">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1163704582637" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1163704578868">
              <link role="variableDeclaration" targetNodeId="1163704572845" resolveInfo="classifier" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1163704576804">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1163704584435">
              <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1163704587906">
                <link role="variableDeclaration" targetNodeId="1163704509844" resolveInfo="result" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1163705010789">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1163705010790">
            <property name="name" value="classHierarchy" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1163705010792">
              <link role="classifier" extResolveInfo="45.[Classifier]ISearchScope" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1163704851290">
              <link role="classConcept" extResolveInfo="44.[Classifier]BaseLanguageSearchUtil_new" />
              <link role="baseMethodDeclaration" extResolveInfo="44.static method ([Classifier]BaseLanguageSearchUtil_new).([StaticMethodDeclaration]createClassifierHierarchyScope((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Classifier]), (jetbrains.mps.baseLanguage.types.int/jetbrains.mps.baseLanguage.types.int)) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ISearchScope]))" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1171389356251">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAdapterOperation" id="1171389359676" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1171389353454">
                  <link role="variableDeclaration" targetNodeId="1163704572845" resolveInfo="classifier" />
                </node>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1163706048278">
                <link role="classifier" extResolveInfo="46.[Classifier]IClassifiersSearchScope" />
                <link role="variableDeclaration" extResolveInfo="46.static field ([Classifier]IClassifiersSearchScope).([StaticFieldDeclaration]STATIC_MEMBER : (jetbrains.mps.baseLanguage.types.int/jetbrains.mps.baseLanguage.types.int))" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1163710683368">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1163710683369">
            <property name="name" value="staticMethods" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1171389392255" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1170779577114">
              <link role="classConcept" extResolveInfo="20.[Classifier]BaseAdapter" />
              <link role="baseMethodDeclaration" extResolveInfo="20.static method ([Classifier]BaseAdapter).([StaticMethodDeclaration]toNodes((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;? extends jetbrains.mps.baseLanguage.types.classifier [INodeAdapter]&gt;])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;jetbrains.mps.baseLanguage.types.classifier [SNode]&gt;]))" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1170779577949">
                <link role="classConcept" extResolveInfo="44.[Classifier]BaseLanguageSearchUtil_new" />
                <link role="baseMethodDeclaration" extResolveInfo="44.static method ([Classifier]BaseLanguageSearchUtil_new).([StaticMethodDeclaration]getMethodsExcludingOverridden((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ISearchScope])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;jetbrains.mps.baseLanguage.types.classifier [BaseMethodDeclaration]&gt;]))" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170779577950">
                  <link role="variableDeclaration" targetNodeId="1163705010790" resolveInfo="classHierarchy" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1163706100968">
          <node role="expression" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1163706102204">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1163706100969">
              <link role="variableDeclaration" targetNodeId="1163704509844" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.AddAllElementsOperation" id="1163706106941">
              <node role="argument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1163710722988">
                <link role="variableDeclaration" targetNodeId="1163710683369" resolveInfo="staticMethods" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1163710941084">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1163710941085">
            <property name="name" value="allStaticMembers" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1163710998243" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1163710973210">
              <link role="baseMethodDeclaration" extResolveInfo="45.method ([Classifier]ISearchScope).([InstanceMethodDeclaration]getNodes() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;jetbrains.mps.baseLanguage.types.classifier [SNode]&gt;]))" />
              <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1163710965979">
                <link role="variableDeclaration" targetNodeId="1163705010790" resolveInfo="classHierarchy" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1163711018666">
          <node role="expression" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1163711021028">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1163711018667">
              <link role="variableDeclaration" targetNodeId="1163704509844" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.AddAllElementsOperation" id="1163711024044">
              <node role="argument" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1163711030282">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1163711027984">
                  <link role="variableDeclaration" targetNodeId="1163710941085" resolveInfo="allStaticMembers" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.WhereOperation" id="1163711180822">
                  <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.WhereBlock" id="1163711180823">
                    <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.DefaultInputElement" id="1163711180824">
                      <property name="name" value="m" />
                    </node>
                    <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1163711180825">
                      <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1163711188776">
                        <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1163711188777">
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.ClosureParameterReference" id="1163711202109">
                            <link role="closureParameter" targetNodeId="1163711180824" resolveInfo="m" />
                          </node>
                          <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1163711188779">
                            <link role="concept" targetNodeId="17.1083245299891" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1163704539774">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1163704542510">
            <link role="variableDeclaration" targetNodeId="1163704509844" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1163704459542">
        <property name="name" value="node" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1163704459543">
          <link role="concept" targetNodeId="17.1070533707846" />
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1163711274845">
      <property name="name" value="replaceNodeMenu_StaticFieldReference_createReplacementNode" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1163711594379">
        <property name="name" value="node" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1163711594380">
          <link role="concept" targetNodeId="17.1070533707846" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1163711605884">
        <property name="name" value="parameterObject" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1163711608183" />
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1163711282004" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1163711274847">
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1163711599506">
          <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1163711624606">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1163711623246">
              <link role="variableDeclaration" targetNodeId="1163711605884" resolveInfo="parameterObject" />
            </node>
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1163711627201">
              <link role="concept" targetNodeId="17.1081236700938" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1163711599508">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1163711697708">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1163711697709">
                <property name="name" value="newNode" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1163711697711">
                  <link role="concept" targetNodeId="17.1081236700937" />
                </node>
                <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1163711662316">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1163711658173">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1163711655594">
                      <link role="variableDeclaration" targetNodeId="1163711594379" resolveInfo="referenceNode" />
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetModelOperation" id="1163711660283" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Model_CreateNewNodeOperation" id="1163711663973">
                    <link role="concept" targetNodeId="17.1081236700937" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1163713896601">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1163713909793">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1163713904197">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1163713896602">
                    <link role="variableDeclaration" targetNodeId="1163711697709" resolveInfo="newNode" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1163713907260">
                    <link role="link" targetNodeId="17.1081236769987" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1163713927919">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1163714033437">
                    <link role="concept" targetNodeId="17.1081236700938" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1163714031686">
                      <link role="variableDeclaration" targetNodeId="1163711605884" resolveInfo="parameterObject" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1163711716651">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1163711766998">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1163711749996">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1163711716652">
                    <link role="variableDeclaration" targetNodeId="1163711697709" resolveInfo="newNode" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1163711765747">
                    <link role="link" targetNodeId="17.1144433194310" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1163711767890">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1163711791708">
                    <link role="concept" targetNodeId="17.1068390468198" />
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1163711782018">
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1163711780470">
                        <link role="variableDeclaration" targetNodeId="1163711594379" resolveInfo="referenceNode" />
                      </node>
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1163711786894">
                        <link role="link" targetNodeId="17.1144433057691" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1163711804335">
              <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1163711808274">
                <link role="variableDeclaration" targetNodeId="1163711697709" resolveInfo="newNode" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1163711821557">
          <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1163711827358">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1163711825373">
              <link role="variableDeclaration" targetNodeId="1163711605884" resolveInfo="parameterObject" />
            </node>
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1163711828984">
              <link role="concept" targetNodeId="17.1083245299891" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1163711821559">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1163711843268">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1163711843269">
                <property name="name" value="newNode" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1163711843270">
                  <link role="concept" targetNodeId="17.1083260308424" />
                </node>
                <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1163711843271">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1163711843272">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1163711843273">
                      <link role="variableDeclaration" targetNodeId="1163711594379" resolveInfo="referenceNode" />
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetModelOperation" id="1163711843274" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Model_CreateNewNodeOperation" id="1163711843275">
                    <link role="concept" targetNodeId="17.1083260308424" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1163714108127">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1163714122443">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1163714109394">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1163714108128">
                    <link role="variableDeclaration" targetNodeId="1163711843269" resolveInfo="newNode" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1163714121145">
                    <link role="link" targetNodeId="17.1083260308426" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1163714124101">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1163714133275">
                    <link role="concept" targetNodeId="17.1083245299891" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1163714128181">
                      <link role="variableDeclaration" targetNodeId="1163711605884" resolveInfo="parameterObject" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1163711843276">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1163711843277">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1163711843278">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1163711843279">
                    <link role="variableDeclaration" targetNodeId="1163711843269" resolveInfo="newNode" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1163711865947">
                    <link role="link" targetNodeId="17.1144432896254" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1163711843281">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1163711843282">
                    <link role="concept" targetNodeId="17.1083245097125" />
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1163711843283">
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1163711843284">
                        <link role="variableDeclaration" targetNodeId="1163711594379" resolveInfo="referenceNode" />
                      </node>
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1163711843285">
                        <link role="link" targetNodeId="17.1144433057691" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1163711843286">
              <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1163711843287">
                <link role="variableDeclaration" targetNodeId="1163711843269" resolveInfo="newNode" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1163711879917">
          <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1163711885888">
            <link role="variableDeclaration" targetNodeId="1163711594379" resolveInfo="referenceNode" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1164039169687">
      <property name="name" value="replaceNodeMenu_StaticMethodCall_getParameterObjects" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1164039169688" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1164039169689">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1164039169690">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1164039169691">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1164039169692" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.GenericNewExpression" id="1164039169693">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListCreator" id="1164039169694">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1164039169695" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1164039169696">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1164039169697">
            <property name="name" value="classifier" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1164039169698">
              <link role="concept" targetNodeId="17.1107461130800" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164039169699">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164039169700">
                <link role="variableDeclaration" targetNodeId="1164039169750" resolveInfo="referenceNode" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1164039320112">
                <link role="link" targetNodeId="17.1144433194310" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1164039169702">
          <node role="condition" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1164039169703">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1164039169704" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164039169705">
              <link role="variableDeclaration" targetNodeId="1164039169697" resolveInfo="classifier" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1164039169706">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1164039169707">
              <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164039169708">
                <link role="variableDeclaration" targetNodeId="1164039169691" resolveInfo="result" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1164039169709">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1164039169710">
            <property name="name" value="classHierarchy" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1164039169711">
              <link role="classifier" extResolveInfo="45.[Classifier]ISearchScope" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1164039169712">
              <link role="classConcept" extResolveInfo="44.[Classifier]BaseLanguageSearchUtil_new" />
              <link role="baseMethodDeclaration" extResolveInfo="44.static method ([Classifier]BaseLanguageSearchUtil_new).([StaticMethodDeclaration]createClassifierHierarchyScope((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Classifier]), (jetbrains.mps.baseLanguage.types.int/jetbrains.mps.baseLanguage.types.int)) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ISearchScope]))" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1171389598419">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAdapterOperation" id="1171389600532" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1171389595887">
                  <link role="variableDeclaration" targetNodeId="1164039169697" resolveInfo="classifier" />
                </node>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1164039169716">
                <link role="variableDeclaration" extResolveInfo="46.static field ([Classifier]IClassifiersSearchScope).([StaticFieldDeclaration]STATIC_MEMBER : (jetbrains.mps.baseLanguage.types.int/jetbrains.mps.baseLanguage.types.int))" />
                <link role="classifier" extResolveInfo="46.[Classifier]IClassifiersSearchScope" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1164039169717">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1164039169718">
            <property name="name" value="staticFields" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1171389614501" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1170780182660">
              <link role="classConcept" extResolveInfo="20.[Classifier]BaseAdapter" />
              <link role="baseMethodDeclaration" extResolveInfo="20.static method ([Classifier]BaseAdapter).([StaticMethodDeclaration]toNodes((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;? extends jetbrains.mps.baseLanguage.types.classifier [INodeAdapter]&gt;])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;jetbrains.mps.baseLanguage.types.classifier [SNode]&gt;]))" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1170780183088">
                <link role="classConcept" extResolveInfo="44.[Classifier]BaseLanguageSearchUtil_new" />
                <link role="baseMethodDeclaration" extResolveInfo="44.static method ([Classifier]BaseLanguageSearchUtil_new).([StaticMethodDeclaration]getFieldsExcludingOverridden((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ISearchScope])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;jetbrains.mps.baseLanguage.types.classifier [VariableDeclaration]&gt;]))" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170780183089">
                  <link role="variableDeclaration" targetNodeId="1164039169710" resolveInfo="classHierarchy" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1164039169722">
          <node role="expression" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1164039169723">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164039169724">
              <link role="variableDeclaration" targetNodeId="1164039169691" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.AddAllElementsOperation" id="1164039169725">
              <node role="argument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164039169727">
                <link role="variableDeclaration" targetNodeId="1164039169718" resolveInfo="staticMethods" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1164039169729">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1164039169730">
            <property name="name" value="allStaticMembers" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1164039169731" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1164039169732">
              <link role="baseMethodDeclaration" extResolveInfo="45.method ([Classifier]ISearchScope).([InstanceMethodDeclaration]getNodes() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;jetbrains.mps.baseLanguage.types.classifier [SNode]&gt;]))" />
              <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164039169733">
                <link role="variableDeclaration" targetNodeId="1164039169710" resolveInfo="classHierarchy" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1164039169734">
          <node role="expression" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1164039169735">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164039169736">
              <link role="variableDeclaration" targetNodeId="1164039169691" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.AddAllElementsOperation" id="1164039169737">
              <node role="argument" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1164039169738">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164039169739">
                  <link role="variableDeclaration" targetNodeId="1164039169730" resolveInfo="allStaticMembers" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.WhereOperation" id="1164039169740">
                  <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.WhereBlock" id="1164039169741">
                    <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.DefaultInputElement" id="1164039169742">
                      <property name="name" value="m" />
                    </node>
                    <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1164039169743">
                      <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1164039169744">
                        <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164039169745">
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.ClosureParameterReference" id="1164039169746">
                            <link role="closureParameter" targetNodeId="1164039169742" resolveInfo="m" />
                          </node>
                          <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1164039169747">
                            <link role="concept" targetNodeId="17.1083245299891" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1164039169748">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164039169749">
            <link role="variableDeclaration" targetNodeId="1164039169691" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1164039169750">
        <property name="name" value="node" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1164039169751">
          <link role="concept" targetNodeId="17.1081236700937" />
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1164039527232">
      <property name="name" value="replaceNodeMenu_StaticMethodCall_createReplacementNode" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1164039527233">
        <property name="name" value="node" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1164039527234">
          <link role="concept" targetNodeId="17.1081236700937" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1164039527235">
        <property name="name" value="parameterObject" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1164039527236" />
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1164039527237" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1164039527238">
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1164039527239">
          <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164039527240">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164039527241">
              <link role="variableDeclaration" targetNodeId="1164039527235" resolveInfo="parameterObject" />
            </node>
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1164039527242">
              <link role="concept" targetNodeId="17.1070462154015" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1164039527243">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1164039527244">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1164039527245">
                <property name="name" value="newNode" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1164039527246">
                  <link role="concept" targetNodeId="17.1070533707846" />
                </node>
                <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164039527247">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164039527248">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164039527249">
                      <link role="variableDeclaration" targetNodeId="1164039527233" resolveInfo="referenceNode" />
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetModelOperation" id="1164039527250" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Model_CreateNewNodeOperation" id="1164039527251">
                    <link role="concept" targetNodeId="17.1070533707846" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1164039527252">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164039527253">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164039527254">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164039527255">
                    <link role="variableDeclaration" targetNodeId="1164039527245" resolveInfo="newNode" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1164039610338">
                    <link role="link" targetNodeId="17.1070568178160" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1164039527257">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1164039527258">
                    <link role="concept" targetNodeId="17.1070462154015" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164039527259">
                      <link role="variableDeclaration" targetNodeId="1164039527235" resolveInfo="parameterObject" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1164039527260">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164039527261">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164039527262">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164039527263">
                    <link role="variableDeclaration" targetNodeId="1164039527245" resolveInfo="newNode" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1164039631011">
                    <link role="link" targetNodeId="17.1144433057691" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1164039527265">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164039527267">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164039527268">
                      <link role="variableDeclaration" targetNodeId="1164039527233" resolveInfo="referenceNode" />
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1164039641856">
                      <link role="link" targetNodeId="17.1144433194310" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1164039527270">
              <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164039527271">
                <link role="variableDeclaration" targetNodeId="1164039527245" resolveInfo="newNode" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1164039527272">
          <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164039527273">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164039527274">
              <link role="variableDeclaration" targetNodeId="1164039527235" resolveInfo="parameterObject" />
            </node>
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1164039527275">
              <link role="concept" targetNodeId="17.1083245299891" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1164039527276">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1164039527277">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1164039527278">
                <property name="name" value="newNode" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1164039527279">
                  <link role="concept" targetNodeId="17.1083260308424" />
                </node>
                <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164039527280">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164039527281">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164039527282">
                      <link role="variableDeclaration" targetNodeId="1164039527233" resolveInfo="referenceNode" />
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetModelOperation" id="1164039527283" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Model_CreateNewNodeOperation" id="1164039527284">
                    <link role="concept" targetNodeId="17.1083260308424" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1164039527285">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164039527286">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164039527287">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164039527288">
                    <link role="variableDeclaration" targetNodeId="1164039527278" resolveInfo="newNode" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1164039527289">
                    <link role="link" targetNodeId="17.1083260308426" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1164039527290">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1164039527291">
                    <link role="concept" targetNodeId="17.1083245299891" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164039527292">
                      <link role="variableDeclaration" targetNodeId="1164039527235" resolveInfo="parameterObject" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1164039527293">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164039527294">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164039527295">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164039527296">
                    <link role="variableDeclaration" targetNodeId="1164039527278" resolveInfo="newNode" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1164039527297">
                    <link role="link" targetNodeId="17.1144432896254" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1164039527298">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1164039527299">
                    <link role="concept" targetNodeId="17.1083245097125" />
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164039527300">
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164039527301">
                        <link role="variableDeclaration" targetNodeId="1164039527233" resolveInfo="referenceNode" />
                      </node>
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1164039658576">
                        <link role="link" targetNodeId="17.1144433194310" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1164039527303">
              <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164039527304">
                <link role="variableDeclaration" targetNodeId="1164039527278" resolveInfo="newNode" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1164039527305">
          <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164039527306">
            <link role="variableDeclaration" targetNodeId="1164039527233" resolveInfo="referenceNode" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1164040653636">
      <property name="name" value="replaceNodeMenu_EnumConstantReference_getParameterObjects" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1164040653637" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1164040653638">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1164040653639">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1164040653640">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1164040653641" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.GenericNewExpression" id="1164040653642">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListCreator" id="1164040653643">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1164040653644" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1164040653645">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1164040653646">
            <property name="name" value="classifier" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1164040653647">
              <link role="concept" targetNodeId="17.1107461130800" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164040653648">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164040653649">
                <link role="variableDeclaration" targetNodeId="1164040653699" resolveInfo="referenceNode" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1164040690810">
                <link role="link" targetNodeId="17.1144432896254" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1164040653651">
          <node role="condition" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1164040653652">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1164040653653" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164040653654">
              <link role="variableDeclaration" targetNodeId="1164040653646" resolveInfo="classifier" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1164040653655">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1164040653656">
              <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164040653657">
                <link role="variableDeclaration" targetNodeId="1164040653640" resolveInfo="result" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1164040653658">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1164040653659">
            <property name="name" value="classHierarchy" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1164040653660">
              <link role="classifier" extResolveInfo="45.[Classifier]ISearchScope" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1164040653661">
              <link role="classConcept" extResolveInfo="44.[Classifier]BaseLanguageSearchUtil_new" />
              <link role="baseMethodDeclaration" extResolveInfo="44.static method ([Classifier]BaseLanguageSearchUtil_new).([StaticMethodDeclaration]createClassifierHierarchyScope((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Classifier]), (jetbrains.mps.baseLanguage.types.int/jetbrains.mps.baseLanguage.types.int)) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ISearchScope]))" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1171389651925">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAdapterOperation" id="1171389654694" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1171389650159">
                  <link role="variableDeclaration" targetNodeId="1164040653646" resolveInfo="classifier" />
                </node>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1164040653665">
                <link role="classifier" extResolveInfo="46.[Classifier]IClassifiersSearchScope" />
                <link role="variableDeclaration" extResolveInfo="46.static field ([Classifier]IClassifiersSearchScope).([StaticFieldDeclaration]STATIC_MEMBER : (jetbrains.mps.baseLanguage.types.int/jetbrains.mps.baseLanguage.types.int))" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1164040653666">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1164040653667">
            <property name="name" value="staticFields" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1171389666539" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1170779455630">
              <link role="classConcept" extResolveInfo="20.[Classifier]BaseAdapter" />
              <link role="baseMethodDeclaration" extResolveInfo="20.static method ([Classifier]BaseAdapter).([StaticMethodDeclaration]toNodes((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;? extends jetbrains.mps.baseLanguage.types.classifier [INodeAdapter]&gt;])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;jetbrains.mps.baseLanguage.types.classifier [SNode]&gt;]))" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1170779456152">
                <link role="classConcept" extResolveInfo="44.[Classifier]BaseLanguageSearchUtil_new" />
                <link role="baseMethodDeclaration" extResolveInfo="44.static method ([Classifier]BaseLanguageSearchUtil_new).([StaticMethodDeclaration]getFieldsExcludingOverridden((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ISearchScope])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;jetbrains.mps.baseLanguage.types.classifier [VariableDeclaration]&gt;]))" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170779456153">
                  <link role="variableDeclaration" targetNodeId="1164040653659" resolveInfo="classHierarchy" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1164040653671">
          <node role="expression" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1164040653672">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164040653673">
              <link role="variableDeclaration" targetNodeId="1164040653640" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.AddAllElementsOperation" id="1164040653674">
              <node role="argument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164040653676">
                <link role="variableDeclaration" targetNodeId="1164040653667" resolveInfo="staticFields" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1164040779195">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1164040779196">
            <property name="name" value="staticMethods" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1171389678883" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1170779822628">
              <link role="classConcept" extResolveInfo="20.[Classifier]BaseAdapter" />
              <link role="baseMethodDeclaration" extResolveInfo="20.static method ([Classifier]BaseAdapter).([StaticMethodDeclaration]toNodes((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;? extends jetbrains.mps.baseLanguage.types.classifier [INodeAdapter]&gt;])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;jetbrains.mps.baseLanguage.types.classifier [SNode]&gt;]))" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1170779823088">
                <link role="classConcept" extResolveInfo="44.[Classifier]BaseLanguageSearchUtil_new" />
                <link role="baseMethodDeclaration" extResolveInfo="44.static method ([Classifier]BaseLanguageSearchUtil_new).([StaticMethodDeclaration]getMethodsExcludingOverridden((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ISearchScope])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;jetbrains.mps.baseLanguage.types.classifier [BaseMethodDeclaration]&gt;]))" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170779823089">
                  <link role="variableDeclaration" targetNodeId="1164040653659" resolveInfo="classHierarchy" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1164040779200">
          <node role="expression" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1164040779201">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164040779202">
              <link role="variableDeclaration" targetNodeId="1164040653640" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.AddAllElementsOperation" id="1164040779203">
              <node role="argument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164040779205">
                <link role="variableDeclaration" targetNodeId="1164040779196" resolveInfo="staticMethods" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1164040653697">
          <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164040653698">
            <link role="variableDeclaration" targetNodeId="1164040653640" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1164040653699">
        <property name="name" value="node" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1164040653700">
          <link role="concept" targetNodeId="17.1083260308424" />
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1164040812310">
      <property name="name" value="replaceNodeMenu_EnumConstantReference_createReplacementNode" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1164040812311">
        <property name="name" value="node" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1164040812312">
          <link role="concept" targetNodeId="17.1083260308424" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1164040812313">
        <property name="name" value="parameterObject" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1164040812314" />
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1164040812315" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1164040812316">
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1164040812317">
          <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164040812318">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164040812319">
              <link role="variableDeclaration" targetNodeId="1164040812313" resolveInfo="parameterObject" />
            </node>
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1164040812320">
              <link role="concept" targetNodeId="17.1070462154015" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1164040812321">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1164040812322">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1164040812323">
                <property name="name" value="newNode" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1164040812324">
                  <link role="concept" targetNodeId="17.1070533707846" />
                </node>
                <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164040812325">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164040812326">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164040812327">
                      <link role="variableDeclaration" targetNodeId="1164040812311" resolveInfo="referenceNode" />
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetModelOperation" id="1164040812328" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Model_CreateNewNodeOperation" id="1164040812329">
                    <link role="concept" targetNodeId="17.1070533707846" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1164040812330">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164040812331">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164040812332">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164040812333">
                    <link role="variableDeclaration" targetNodeId="1164040812323" resolveInfo="newNode" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1164040812334">
                    <link role="link" targetNodeId="17.1070568178160" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1164040812335">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1164040812336">
                    <link role="concept" targetNodeId="17.1070462154015" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164040812337">
                      <link role="variableDeclaration" targetNodeId="1164040812313" resolveInfo="parameterObject" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1164040812338">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164040812339">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164040812340">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164040812341">
                    <link role="variableDeclaration" targetNodeId="1164040812323" resolveInfo="newNode" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1164040812342">
                    <link role="link" targetNodeId="17.1144433057691" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1164040812343">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164040812344">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164040812345">
                      <link role="variableDeclaration" targetNodeId="1164040812311" resolveInfo="referenceNode" />
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1164040847493">
                      <link role="link" targetNodeId="17.1144432896254" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1164040812363">
              <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164040812364">
                <link role="variableDeclaration" targetNodeId="1164040812323" resolveInfo="newNode" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1164040888832">
          <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164040888833">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164040888834">
              <link role="variableDeclaration" targetNodeId="1164040812313" resolveInfo="parameterObject" />
            </node>
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1164040888835">
              <link role="concept" targetNodeId="17.1081236700938" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1164040888836">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1164040888837">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1164040888838">
                <property name="name" value="newNode" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1164040888839">
                  <link role="concept" targetNodeId="17.1081236700937" />
                </node>
                <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164040888840">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164040888841">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164040888842">
                      <link role="variableDeclaration" targetNodeId="1164040812311" resolveInfo="referenceNode" />
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetModelOperation" id="1164040888843" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Model_CreateNewNodeOperation" id="1164040888844">
                    <link role="concept" targetNodeId="17.1081236700937" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1164040888845">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164040888846">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164040888847">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164040888848">
                    <link role="variableDeclaration" targetNodeId="1164040888838" resolveInfo="newNode" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1164040888849">
                    <link role="link" targetNodeId="17.1081236769987" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1164040888850">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1164040888851">
                    <link role="concept" targetNodeId="17.1081236700938" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164040888852">
                      <link role="variableDeclaration" targetNodeId="1164040812313" resolveInfo="parameterObject" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1164040888853">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164040888854">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164040888855">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164040888856">
                    <link role="variableDeclaration" targetNodeId="1164040888838" resolveInfo="newNode" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1164040888857">
                    <link role="link" targetNodeId="17.1144433194310" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1164040888858">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164040888860">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164040888861">
                      <link role="variableDeclaration" targetNodeId="1164040812311" resolveInfo="referenceNode" />
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1164040908626">
                      <link role="link" targetNodeId="17.1144432896254" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1164040888863">
              <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164040888864">
                <link role="variableDeclaration" targetNodeId="1164040888838" resolveInfo="newNode" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1164040812398">
          <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164040812399">
            <link role="variableDeclaration" targetNodeId="1164040812311" resolveInfo="referenceNode" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1164049019134">
      <property name="name" value="replaceNodeMenu_FieldReference_getParameterObjects" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1164049019135" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1164049019136">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1164049019143">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1164049019144">
            <property name="name" value="instance" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1164049019145">
              <link role="concept" targetNodeId="17.1068431790191" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164049019146">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164049019147">
                <link role="variableDeclaration" targetNodeId="1164049019190" resolveInfo="referenceNode" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1164049172027">
                <link role="link" targetNodeId="17.1080137532343" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1164049019149">
          <node role="condition" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1164049019150">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1164049019151" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164049019152">
              <link role="variableDeclaration" targetNodeId="1164049019144" resolveInfo="classifier" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1164049019153">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1164049019154">
              <node role="expression" type="jetbrains.mps.baseLanguage.GenericNewExpression" id="1171390008580">
                <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListCreator" id="1171390008581">
                  <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1171390008582" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1164049352159">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1164049352160">
            <property name="name" value="instanceType" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1171290395614">
              <link role="classifier" extResolveInfo="49.[Classifier]ClassifierType" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1164049264881">
              <link role="classConcept" extResolveInfo="22.[Classifier]BaseLanguageTypesUtil_new" />
              <link role="baseMethodDeclaration" extResolveInfo="22.static method ([Classifier]BaseLanguageTypesUtil_new).([StaticMethodDeclaration]tryObtain_ClassifierType((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Expression])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ClassifierType]))" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1171289094108">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAdapterOperation" id="1171289094970" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164049326282">
                  <link role="variableDeclaration" targetNodeId="1164049019144" resolveInfo="instance" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1164049402273">
          <node role="condition" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1164049410574">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1164049413593" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164049407386">
              <link role="variableDeclaration" targetNodeId="1164049352160" resolveInfo="instanceType" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1164049402275">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1164049416578">
              <node role="expression" type="jetbrains.mps.baseLanguage.GenericNewExpression" id="1171390008559">
                <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListCreator" id="1171390008560">
                  <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1171390008561" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1164049019156">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1164049019157">
            <property name="name" value="classHierarchy" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1164049019158">
              <link role="classifier" extResolveInfo="45.[Classifier]ISearchScope" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1164049019159">
              <link role="classConcept" extResolveInfo="44.[Classifier]BaseLanguageSearchUtil_new" />
              <link role="baseMethodDeclaration" extResolveInfo="44.static method ([Classifier]BaseLanguageSearchUtil_new).([StaticMethodDeclaration]createClassifierHierarchyScope((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ClassifierType]), (jetbrains.mps.baseLanguage.types.int/jetbrains.mps.baseLanguage.types.int)) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ISearchScope]))" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1171290418852">
                <link role="variableDeclaration" targetNodeId="1164049352160" resolveInfo="instanceType" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1164049019163">
                <link role="classifier" extResolveInfo="46.[Classifier]IClassifiersSearchScope" />
                <link role="variableDeclaration" extResolveInfo="46.static field ([Classifier]IClassifiersSearchScope).([StaticFieldDeclaration]INSTANCE_METHOD : (jetbrains.mps.baseLanguage.types.int/jetbrains.mps.baseLanguage.types.int))" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1164049019188">
          <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1171390044008">
            <link role="classConcept" extResolveInfo="20.[Classifier]BaseAdapter" />
            <link role="baseMethodDeclaration" extResolveInfo="20.static method ([Classifier]BaseAdapter).([StaticMethodDeclaration]toNodes((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;? extends jetbrains.mps.baseLanguage.types.classifier [INodeAdapter]&gt;])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;jetbrains.mps.baseLanguage.types.classifier [SNode]&gt;]))" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1171390044009">
              <link role="classConcept" extResolveInfo="44.[Classifier]BaseLanguageSearchUtil_new" />
              <link role="baseMethodDeclaration" extResolveInfo="44.static method ([Classifier]BaseLanguageSearchUtil_new).([StaticMethodDeclaration]getMethodsExcludingOverridden((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ISearchScope])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;jetbrains.mps.baseLanguage.types.classifier [BaseMethodDeclaration]&gt;]))" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1171390046386">
                <link role="variableDeclaration" targetNodeId="1164049019157" resolveInfo="classHierarchy" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1164049019190">
        <property name="name" value="node" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1164049019191">
          <link role="concept" targetNodeId="17.1068580123158" />
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1164049658716">
      <property name="name" value="replaceNodeMenu_FieldReference_createReplacementNode" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1164049658717">
        <property name="name" value="node" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1164049658718">
          <link role="concept" targetNodeId="17.1068580123158" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1164049658719">
        <property name="name" value="parameterObject" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1164049658720" />
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1164049658721" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1164049658722">
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1164049658723">
          <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164049658724">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164049658725">
              <link role="variableDeclaration" targetNodeId="1164049658719" resolveInfo="parameterObject" />
            </node>
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1164049658726">
              <link role="concept" targetNodeId="17.1068580123165" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1164049658727">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1164049658728">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1164049658729">
                <property name="name" value="newNode" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1164049658730">
                  <link role="concept" targetNodeId="17.1068580123163" />
                </node>
                <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164049658731">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164049658732">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164049658733">
                      <link role="variableDeclaration" targetNodeId="1164049658717" resolveInfo="referenceNode" />
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetModelOperation" id="1164049658734" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Model_CreateNewNodeOperation" id="1164049658735">
                    <link role="concept" targetNodeId="17.1068580123163" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1164049658736">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164049658737">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164049658738">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164049658739">
                    <link role="variableDeclaration" targetNodeId="1164049658729" resolveInfo="newNode" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1164049796932">
                    <link role="link" targetNodeId="17.1070568044740" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1164049658741">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1164049658742">
                    <link role="concept" targetNodeId="17.1068580123165" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164049658743">
                      <link role="variableDeclaration" targetNodeId="1164049658719" resolveInfo="parameterObject" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1164049658744">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164049658745">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164049658746">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164049658747">
                    <link role="variableDeclaration" targetNodeId="1164049658729" resolveInfo="newNode" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1164049764118">
                    <link role="link" targetNodeId="17.1068580123164" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1164049658749">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164049658750">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164049658751">
                      <link role="variableDeclaration" targetNodeId="1164049658717" resolveInfo="referenceNode" />
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1164049787619">
                      <link role="link" targetNodeId="17.1080137532343" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1164049658753">
              <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164049658754">
                <link role="variableDeclaration" targetNodeId="1164049658729" resolveInfo="newNode" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1164049658787">
          <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164049658788">
            <link role="variableDeclaration" targetNodeId="1164049658717" resolveInfo="referenceNode" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1164049862510">
      <property name="name" value="replaceNodeMenu_InstanceMethodCall_getParameterObjects" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1164049862511" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1164049862512">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1164049862519">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1164049862520">
            <property name="name" value="instance" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1164049862521">
              <link role="concept" targetNodeId="17.1068431790191" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164049862522">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164049862523">
                <link role="variableDeclaration" targetNodeId="1164049862562" resolveInfo="referenceNode" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1164049911427">
                <link role="link" targetNodeId="17.1068580123164" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1164049862525">
          <node role="condition" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1164049862526">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1164049862527" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164049862528">
              <link role="variableDeclaration" targetNodeId="1164049862520" resolveInfo="instance" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1164049862529">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1164049862530">
              <node role="expression" type="jetbrains.mps.baseLanguage.GenericNewExpression" id="1171389903300">
                <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListCreator" id="1171389903301">
                  <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1171389903302" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1164049862532">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1164049862533">
            <property name="name" value="instanceType" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1171290433806">
              <link role="classifier" extResolveInfo="49.[Classifier]ClassifierType" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1164049862535">
              <link role="classConcept" extResolveInfo="22.[Classifier]BaseLanguageTypesUtil_new" />
              <link role="baseMethodDeclaration" extResolveInfo="22.static method ([Classifier]BaseLanguageTypesUtil_new).([StaticMethodDeclaration]tryObtain_ClassifierType((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Expression])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ClassifierType]))" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1171289236753">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAdapterOperation" id="1171289238162" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164049862537">
                  <link role="variableDeclaration" targetNodeId="1164049862520" resolveInfo="instance" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1164049862540">
          <node role="condition" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1164049862541">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1164049862542" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164049862543">
              <link role="variableDeclaration" targetNodeId="1164049862533" resolveInfo="instanceType" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1164049862544">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1164049862545">
              <node role="expression" type="jetbrains.mps.baseLanguage.GenericNewExpression" id="1171389920351">
                <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListCreator" id="1171389920352">
                  <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1171389920353" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1164049862547">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1164049862548">
            <property name="name" value="classHierarchy" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1164049862549">
              <link role="classifier" extResolveInfo="45.[Classifier]ISearchScope" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1164049862550">
              <link role="classConcept" extResolveInfo="44.[Classifier]BaseLanguageSearchUtil_new" />
              <link role="baseMethodDeclaration" extResolveInfo="44.static method ([Classifier]BaseLanguageSearchUtil_new).([StaticMethodDeclaration]createClassifierHierarchyScope((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ClassifierType]), (jetbrains.mps.baseLanguage.types.int/jetbrains.mps.baseLanguage.types.int)) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ISearchScope]))" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1171290448932">
                <link role="variableDeclaration" targetNodeId="1164049862533" resolveInfo="instanceType" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1164049862552">
                <link role="classifier" extResolveInfo="46.[Classifier]IClassifiersSearchScope" />
                <link role="variableDeclaration" extResolveInfo="46.static field ([Classifier]IClassifiersSearchScope).([StaticFieldDeclaration]INSTANCE_FIELD : (jetbrains.mps.baseLanguage.types.int/jetbrains.mps.baseLanguage.types.int))" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1171389829754">
          <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1171389832515">
            <link role="classConcept" extResolveInfo="20.[Classifier]BaseAdapter" />
            <link role="baseMethodDeclaration" extResolveInfo="20.static method ([Classifier]BaseAdapter).([StaticMethodDeclaration]toNodes((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;? extends jetbrains.mps.baseLanguage.types.classifier [INodeAdapter]&gt;])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;jetbrains.mps.baseLanguage.types.classifier [SNode]&gt;]))" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1171389832516">
              <link role="classConcept" extResolveInfo="44.[Classifier]BaseLanguageSearchUtil_new" />
              <link role="baseMethodDeclaration" extResolveInfo="44.static method ([Classifier]BaseLanguageSearchUtil_new).([StaticMethodDeclaration]getFieldsExcludingOverridden((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ISearchScope])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;jetbrains.mps.baseLanguage.types.classifier [VariableDeclaration]&gt;]))" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1171389834971">
                <link role="variableDeclaration" targetNodeId="1164049862548" resolveInfo="classHierarchy" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1164049862562">
        <property name="name" value="referenceNode" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1164049862563">
          <link role="concept" targetNodeId="17.1068580123163" />
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1164049979558">
      <property name="name" value="replaceNodeMenu_InstanceMethodCall_createReplacementNode" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1164049979559">
        <property name="name" value="node" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1164049979560">
          <link role="concept" targetNodeId="17.1068580123163" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1164049979561">
        <property name="name" value="parameterObject" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1164049979562" />
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1164049979563" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1164049979564">
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1164049979565">
          <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164049979566">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164049979567">
              <link role="variableDeclaration" targetNodeId="1164049979561" resolveInfo="parameterObject" />
            </node>
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1164049979568">
              <link role="concept" targetNodeId="17.1068390468200" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1164049979569">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1164049979570">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1164049979571">
                <property name="name" value="newNode" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1164049979572">
                  <link role="concept" targetNodeId="17.1068580123158" />
                </node>
                <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164049979573">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164049979574">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164049979575">
                      <link role="variableDeclaration" targetNodeId="1164049979559" resolveInfo="referenceNode" />
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetModelOperation" id="1164049979576" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Model_CreateNewNodeOperation" id="1164049979577">
                    <link role="concept" targetNodeId="17.1068580123158" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1164049979578">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164049979579">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164049979580">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164049979581">
                    <link role="variableDeclaration" targetNodeId="1164049979571" resolveInfo="newNode" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1164050042067">
                    <link role="link" targetNodeId="17.1070568237987" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1164049979583">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1164049979584">
                    <link role="concept" targetNodeId="17.1068390468200" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164049979585">
                      <link role="variableDeclaration" targetNodeId="1164049979561" resolveInfo="parameterObject" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1164049979586">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164049979587">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164049979588">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164049979589">
                    <link role="variableDeclaration" targetNodeId="1164049979571" resolveInfo="newNode" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1164050054240">
                    <link role="link" targetNodeId="17.1080137532343" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1164049979591">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164049979592">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164049979593">
                      <link role="variableDeclaration" targetNodeId="1164049979559" resolveInfo="referenceNode" />
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1164050058023">
                      <link role="link" targetNodeId="17.1068580123164" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1164049979595">
              <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164049979596">
                <link role="variableDeclaration" targetNodeId="1164049979571" resolveInfo="newNode" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1164049979597">
          <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1164049979598">
            <link role="variableDeclaration" targetNodeId="1164049979559" resolveInfo="referenceNode" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1164880014998">
    <link role="conceptDeclaration" targetNodeId="17.1164879751025" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1164880022438">
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1164880031472">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1164880033959">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="try" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1164880041383">
          <property name="text" value="{" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1164880052763">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1164880062312">
          <property name="selectable" value="false" />
          <property name="text" value="  " />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1164880067767">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1164879758292" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1164903583459">
        <property name="vertical" value="true" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1164903496223" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1164911197638">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1164911197639">
          <property name="editable" value="true" />
          <property name="text" value="}" />
          <property name="drawBorder" value="false" />
          <property name="rightTransformAnchorTag" value="default_RTransform" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapDeclaration" id="1164883858924">
    <property name="name" value="_TryCatchStatement_Actions" />
    <link role="applicableConcept" targetNodeId="17.1164879751025" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1164883993548">
      <property name="description" value="finally" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1164883993549">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1164883993550">
          <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1164884007254">
            <node role="condition" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1164884013416">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1164884018529" />
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164884009227">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1164884009179" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetParentOperation" id="1164884011665" />
              </node>
            </node>
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1164884007256">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1164884020076" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1164884034594">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1164884034595">
              <property name="name" value="tryStatement" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1164884034596">
                <link role="concept" targetNodeId="17.1153952380246" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1171895022891">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1171895021092">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1171895019966" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetModelOperation" id="1171895022249" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Model_CreateNewNodeOperation" id="1171895029173">
                  <link role="concept" targetNodeId="17.1153952380246" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1164884034601">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164884034602">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164884034603">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164884034604">
                  <link role="variableDeclaration" targetNodeId="1164884034595" resolveInfo="tryStatement" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1164884034605">
                  <link role="link" targetNodeId="17.1153952416686" />
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1164884034606">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164884034607">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1164884089274" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1164884034609">
                    <link role="link" targetNodeId="17.1164879758292" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ForeachStatement" id="1164904305172">
            <node role="iterable" type="jetbrains.mps.bootstrap.smodelLanguage.SemanticDowncastExpression" id="1164904357774">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164904326788">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1164904326756" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1164904331945">
                  <link role="link" targetNodeId="17.1164903496223" />
                </node>
              </node>
            </node>
            <node role="variable" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1164904305174">
              <property name="name" value="clause" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1164904311489">
                <link role="concept" targetNodeId="17.1164903280175" />
              </node>
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1164904305176">
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1164904375619">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164904385545">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164904376637">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164904375620">
                      <link role="variableDeclaration" targetNodeId="1164884034595" resolveInfo="tryStatement" />
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1164904384888">
                      <link role="link" targetNodeId="17.1164903700860" />
                    </node>
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.LinkList_AddChildOperation" id="1164904392843">
                    <node role="parameter" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164904398861">
                      <link role="variableDeclaration" targetNodeId="1164904305174" resolveInfo="clause" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1164884034628">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164884034629">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1164884086148" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithAnotherOperation" id="1164884034631">
                <node role="parameter" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164884034632">
                  <link role="variableDeclaration" targetNodeId="1164884034595" resolveInfo="tryStatement" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1164906478336">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164906486668">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164906479369">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1164906478337">
                  <link role="variableDeclaration" targetNodeId="1164884034595" resolveInfo="tryStatement" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1164906485292">
                  <link role="link" targetNodeId="17.1153952429843" />
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetNewChildOperation" id="1164906489075" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1164908177264">
      <property name="description" value="catch" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1164908177265">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1164908177266">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1164908293014">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164908301596">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164908293094">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1164908293015" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1164908300345">
                  <link role="link" targetNodeId="17.1164903496223" />
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.LinkList_AddNewChildOperation" id="1164908306972" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapDeclaration" id="1164890912564">
    <property name="name" value="_BaseMethodDeclaration_Actions" />
    <link role="applicableConcept" targetNodeId="17.1068580123132" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1164890932034">
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1164890932035">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1164890932036">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1164890989319">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164890992776">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1164890989353">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1164890989320" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1164890991729">
                  <link role="link" targetNodeId="17.1164879685961" />
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.LinkList_AddNewChildOperation" id="1164890995465" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1164903401135">
    <link role="conceptDeclaration" targetNodeId="17.1164903280175" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1164903406669">
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1164903407620">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1164903407621">
          <property name="text" value="}" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1164903407622">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="catch" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1164903407623">
          <property name="text" value="(" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1164903407624">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1164903359217" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1164903407625">
          <property name="text" value=") {" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1164903407626">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1164903407627">
          <property name="selectable" value="false" />
          <property name="text" value="  " />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1164903407628">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1164903359218" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1164991126499">
    <link role="conceptDeclaration" targetNodeId="17.1164991038168" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1164991133830">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1164991135285">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="throw" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1164991147291">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1164991057263" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1164991154683">
        <property name="text" value=";" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapDeclaration" id="1166027091157">
    <property name="name" value="DeleteParenthesis_Actions" />
    <link role="applicableConcept" targetNodeId="17.1079359253375" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1166027896275">
      <property name="actionId" value="delete_action_id" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1166027896276">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1166027896277">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1166027909660">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1166027909865">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1166027909661" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithAnotherOperation" id="1166027912163">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1166027920867">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1166027919209" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1166027923836">
                    <link role="link" targetNodeId="17.1079359253376" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1166063928779">
    <link role="conceptDeclaration" targetNodeId="17.1081773326031" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1166063955820">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1166063955821">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1081773367580" />
        <link role="actionMap" targetNodeId="1140734304236" resolveInfo="BinaryOperation_LeftArgument_Actions" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_ConceptProperty" id="1166063984223">
        <property name="editable" value="true" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
        <link role="relationDeclaration" targetNodeId="18.1137473891462" />
        <node role="menuDescriptor" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuDescriptor" id="1166064618699">
          <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.CellMenuPart_ReplaceNode_CustomNodeConcept" id="1166130635793">
            <link role="replacementConcept" targetNodeId="17.1081773326031" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1166063955825">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1081773367579" />
        <link role="actionMap" targetNodeId="1140734681122" resolveInfo="BinaryOperation_RightArgument_Actions" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapDeclaration" id="1166102189373">
    <property name="name" value="CloseParenthesis_KeyMap" />
    <link role="applicableConcept" targetNodeId="17.1079359253375" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1166102291292">
      <property name="description" value="move closing parenthesis to the right" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1166102291293">
        <property name="keycode" value="VK_RIGHT" />
        <property name="modifiers" value="ctrl+shift" />
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1166102291294">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1166102291295">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1166102291296">
            <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1166102291297">
              <link role="classConcept" extResolveInfo="48.[Classifier]ParenthesisUtil" />
              <link role="baseMethodDeclaration" extResolveInfo="48.static method ([Classifier]ParenthesisUtil).([StaticMethodDeclaration]moveParenthesisToTheRight((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ParenthesizedExpression]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorContext])) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1171544980718">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAdapterOperation" id="1171544983534" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1166102291300" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1166111860240" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1166113551769">
      <property name="description" value="move closing parenthesis to the left" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1166113551770">
        <property name="keycode" value="VK_LEFT" />
        <property name="modifiers" value="ctrl+shift" />
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1166113551771">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1166113551772">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1166113551773">
            <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1166113551774">
              <link role="classConcept" extResolveInfo="48.[Classifier]ParenthesisUtil" />
              <link role="baseMethodDeclaration" extResolveInfo="48.static method ([Classifier]ParenthesisUtil).([StaticMethodDeclaration]moveParenthesisToTheLeftInside((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ParenthesizedExpression]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorContext])) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1171544987269">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAdapterOperation" id="1171544988726" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1166113551777" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1166113551778" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapDeclaration" id="1166110777830">
    <property name="name" value="OpenParenthesis_KeyMap" />
    <link role="applicableConcept" targetNodeId="17.1079359253375" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1166110801457">
      <property name="description" value="move opening parenthesis to the left" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1166110801458">
        <property name="keycode" value="VK_LEFT" />
        <property name="modifiers" value="ctrl+shift" />
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1166110801459">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1166110801460">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1166110801461">
            <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1166110801462">
              <link role="classConcept" extResolveInfo="48.[Classifier]ParenthesisUtil" />
              <link role="baseMethodDeclaration" extResolveInfo="48.static method ([Classifier]ParenthesisUtil).([StaticMethodDeclaration]moveParenthesisToTheLeft((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ParenthesizedExpression]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorContext])) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1171545003930">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAdapterOperation" id="1171545004761" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1166110801465" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1166111811556" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1166114419153">
      <property name="description" value="move opening parenthesis to the right" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1166114419154">
        <property name="keycode" value="VK_RIGHT" />
        <property name="modifiers" value="ctrl+shift" />
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1166114419155">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1166114419156">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1166114419157">
            <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1166114419158">
              <link role="classConcept" extResolveInfo="48.[Classifier]ParenthesisUtil" />
              <link role="baseMethodDeclaration" extResolveInfo="48.static method ([Classifier]ParenthesisUtil).([StaticMethodDeclaration]moveParenthesisToTheRightInside((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ParenthesizedExpression]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EditorContext])) : (jetbrains.mps.baseLanguage.types.void/jetbrains.mps.baseLanguage.types.void))" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1171545009340">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAdapterOperation" id="1171545010765" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1166114419161" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_editorContext" id="1166114419162" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1168623081884">
    <link role="conceptDeclaration" targetNodeId="17.1168622733562" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1168623087575">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1168623096233">
        <property name="textFgColor" value="gray" />
        <property name="text" value="//" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1168623099813">
        <property name="textFgColor" value="gray" />
        <property name="allowEmptyText" value="true" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1168623065899" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1170075795309">
    <link role="conceptDeclaration" targetNodeId="17.1170075670744" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1170075810518">
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1170075817744">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1170075817745">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="synchronized" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1170075823529">
          <property name="text" value="(" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1170075826297">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1170075728144" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1170075828377">
          <property name="text" value=")" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1170075830098">
          <property name="text" value="{" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1170075853699">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1170075854670">
          <property name="selectable" value="false" />
          <property name="text" value="  " />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1170075860532">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1170075736412" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1170075832210">
        <property name="text" value="}" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1170345896430">
    <link role="conceptDeclaration" targetNodeId="17.1170345865475" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1170345921993">
      <property name="name" value="classBox" />
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1170345921994">
        <property name="name" value="headerRow" />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1170346125887">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="new" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1170346086721">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1170346070688" />
          <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1170346086722">
            <link role="conceptDeclaration" targetNodeId="17.1107461130800" />
            <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1170346092162">
              <property name="drawBorder" value="false" />
              <property name="readOnly" value="true" />
              <link role="relationDeclaration" targetNodeId="18.1169194664001" />
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1170346096289">
          <property name="text" value="(" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1170346136560">
          <property name="separatorText" value="," />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1170346101385" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1170346142297">
          <property name="text" value=")" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1170345922029">
          <property name="selectable" value="false" />
          <property name="text" value="{" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1170345922034">
        <property name="name" value="fieldsArea" />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1170345922035">
          <property name="text" value="    " />
          <property name="name" value="fieldsIndentCell" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1170345922036">
          <property name="name" value="fieldsList" />
          <property name="vertical" value="true" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1068390468199" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1170345922037">
            <property name="selectable" value="true" />
            <property name="text" value=" &lt;&lt; fields &gt;&gt;" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1170345922038">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1170345922044">
        <property name="name" value="methodsArea" />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1170345922045">
          <property name="text" value="    " />
          <property name="name" value="methodsIndentCell" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1170345922046">
          <property name="name" value="methodsList" />
          <property name="vertical" value="true" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1107880067339" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1170345922047">
            <property name="selectable" value="true" />
            <property name="text" value=" &lt;&lt; methods &gt;&gt;" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1170345922048">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1170345922049">
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1170345922050">
          <property name="text" value="    " />
          <property name="name" value="methodsIndentCell" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1170345922051">
          <property name="name" value="staticMethodList" />
          <property name="vertical" value="true" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1070462273904" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1170345922052">
            <property name="selectable" value="true" />
            <property name="text" value=" &lt;&lt; static methods &gt;&gt;" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1170345922053">
        <property name="selectable" value="false" />
        <property name="text" value="}" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1170346961658">
    <link role="conceptDeclaration" targetNodeId="17.1170346941296" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1170346963692">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1170346967168">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1170346951344" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1171903619613">
    <link role="conceptDeclaration" targetNodeId="17.1171903607971" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1171903622365">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1171903623445">
        <property name="text" value="?" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1171903877173">
    <link role="conceptDeclaration" targetNodeId="17.1171903862077" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1171903879284">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1171903880552">
        <property name="text" value="?" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1171903882257">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="super" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1171903885353">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1171903869531" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1171903928452">
    <link role="conceptDeclaration" targetNodeId="17.1171903916106" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1171903933830">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1171903933831">
        <property name="text" value="?" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1171903933832">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="extends" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1171903933833">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1171903916107" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1172008996157">
    <link role="conceptDeclaration" targetNodeId="17.1172008963197" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1172009002550">
      <property name="drawBorder" value="false" />
      <link role="relationDeclaration" targetNodeId="17.1172008963202" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1172009002551">
        <link role="conceptDeclaration" targetNodeId="17.1070462154015" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1172009005787">
          <property name="textFgColor" value="DARK_MAGENTA" />
          <property name="readOnly" value="true" />
          <property name="fontStyle" value="BOLD_ITALIC" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="17.1083152972671" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapDeclaration" id="1172013289681">
    <property name="name" value="StaticFieldReference_Actions" />
    <link role="applicableConcept" targetNodeId="17.1070533707846" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1172013324430">
      <property name="actionId" value="delete_action_id" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1172013324431">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1172013324432">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1172013530879">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1172013530880">
              <property name="name" value="classifier1" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1172013530882">
                <link role="concept" targetNodeId="17.1107461130800" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172013523424">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1172013522642" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1172013525847">
                  <link role="link" targetNodeId="17.1144433057691" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1172013563498">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1172013563499">
              <property name="name" value="classifier2" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1172013563501">
                <link role="concept" targetNodeId="17.1107461130800" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172013543714">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1172013543073" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAncestorOperation" id="1172013544762">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.OperationParm_Concept" id="1172013551497">
                    <link role="concept" targetNodeId="17.1107461130800" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1172013567472">
            <node role="condition" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1172013570836">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1172013573432">
                <link role="variableDeclaration" targetNodeId="1172013563499" resolveInfo="classifier2" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1172013569428">
                <link role="variableDeclaration" targetNodeId="1172013530880" resolveInfo="classifier1" />
              </node>
            </node>
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1172013567474">
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1172013608906">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1172013608907">
                  <property name="name" value="localStaticFieldReference" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1172013608909">
                    <link role="concept" targetNodeId="17.1172008963197" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172013580700">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1172013580701" />
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithNewOperation" id="1172013580702">
                      <link role="concept" targetNodeId="17.1172008963197" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1172013614693">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172013626244">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172013615460">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1172013614694">
                      <link role="variableDeclaration" targetNodeId="1172013608907" resolveInfo="localStaticFieldReference" />
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1172013625633">
                      <link role="link" targetNodeId="17.1172008963202" />
                    </node>
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1172013627854">
                    <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172013631216">
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1172013630497" />
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1172013633717">
                        <link role="link" targetNodeId="17.1070568178160" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1172058463645">
    <link role="conceptDeclaration" targetNodeId="17.1172058436953" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1172058688093">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1172058697111">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1172058436957" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1172058697112">
          <link role="conceptDeclaration" targetNodeId="17.1081236700938" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1172058703208">
            <property name="fontStyle" value="ITALIC" />
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="17.1083152972672" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1172058730163">
        <property name="text" value="(" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1172058760745">
        <property name="separatorText" value="," />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1068499141038" />
        <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1172058772949">
          <property name="editable" value="true" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="true" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1172058732259">
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapDeclaration" id="1172061831827">
    <property name="name" value="StaticMethodCall_Actions" />
    <link role="applicableConcept" targetNodeId="17.1081236700937" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1172061911016">
      <property name="actionId" value="delete_action_id" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1172061911017">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1172061911018">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1172061934541">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1172061934542">
              <property name="name" value="classConcept1" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1172061934543">
                <link role="concept" targetNodeId="17.1068390468198" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172061934544">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1172061934545" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1172061950914">
                  <link role="link" targetNodeId="17.1144433194310" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1172061934547">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1172061934548">
              <property name="name" value="classConcept2" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1172061934549">
                <link role="concept" targetNodeId="17.1068390468198" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172061934550">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1172061934551" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAncestorOperation" id="1172061934552">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.OperationParm_Concept" id="1172061934553">
                    <link role="concept" targetNodeId="17.1068390468198" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1172061934554">
            <node role="condition" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1172061934555">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1172061934556">
                <link role="variableDeclaration" targetNodeId="1172061934548" resolveInfo="classifier2" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1172061934557">
                <link role="variableDeclaration" targetNodeId="1172061934542" resolveInfo="classifier1" />
              </node>
            </node>
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1172061934558">
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1172061934559">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1172061934560">
                  <property name="name" value="localStaticMethodCall" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1172061934561">
                    <link role="concept" targetNodeId="17.1172058436953" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172061934562">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1172061934563" />
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithNewOperation" id="1172061934564">
                      <link role="concept" targetNodeId="17.1172058436953" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1172061934565">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172061934566">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172061934567">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1172061934568">
                      <link role="variableDeclaration" targetNodeId="1172061934560" resolveInfo="localStaticFieldReference" />
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1172062011321">
                      <link role="link" targetNodeId="17.1172058436957" />
                    </node>
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1172061934570">
                    <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172061934571">
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1172061934572" />
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1172062016416">
                        <link role="link" targetNodeId="17.1081236769987" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.ForEachStatement" id="1172062166210">
                <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.ForEachVariable" id="1172062166211">
                  <property name="name" value="actualArgument" />
                </node>
                <node role="inputSequence" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172062171981">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1172062171246" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccessAsList" id="1172062175638">
                    <link role="link" targetNodeId="17.1068499141038" />
                  </node>
                </node>
                <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1172062166213">
                  <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1172062186842">
                    <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172062191112">
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172062188172">
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1172062186843">
                          <link role="variableDeclaration" targetNodeId="1172061934560" resolveInfo="localStaticMethodCall" />
                        </node>
                        <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1172062190252">
                          <link role="link" targetNodeId="17.1068499141038" />
                        </node>
                      </node>
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.LinkList_AddChildOperation" id="1172062199707">
                        <node role="parameter" type="jetbrains.mps.baseLanguage.ext.collections.lang.ForEachVariableReference" id="1172062202849">
                          <link role="variable" targetNodeId="1172062166211" resolveInfo="actualArgument" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1173175587503">
    <link role="conceptDeclaration" targetNodeId="17.1173175405605" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1173175599366">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1173175602450">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1173175590490" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1173175604827">
        <property name="text" value="[" />
        <property name="drawBorder" value="false" />
        <link role="actionMap" targetNodeId="1173187381459" resolveInfo="ArrayAccessExpression_Actions" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1173175607861">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1173175577737" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1173175610988">
        <property name="text" value="]" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1173176876902">
    <link role="conceptDeclaration" targetNodeId="17.1173176849460" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1173176909123">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1173176912363">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1173176867072" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1173176916850">
        <property name="fontStyle" value="PLAIN" />
        <property name="text" value=".length" />
        <property name="drawBorder" value="false" />
        <link role="actionMap" targetNodeId="1173187270078" resolveInfo="ArrayLengthExpression_Actions" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapDeclaration" id="1173187270078">
    <property name="name" value="ArrayLengthExpression_Actions" />
    <link role="applicableConcept" targetNodeId="17.1173176849460" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1173187353088">
      <property name="actionId" value="delete_action_id" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1173187353089">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1173187353090">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1173187359027">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173187359841">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1173187359028" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithAnotherOperation" id="1173187361311">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173187362986">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1173187362594" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1173187367331">
                    <link role="link" targetNodeId="17.1173176867072" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapDeclaration" id="1173187381459">
    <property name="name" value="ArrayAccessExpression_Actions" />
    <link role="applicableConcept" targetNodeId="17.1173175405605" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1173187404461">
      <property name="actionId" value="delete_action_id" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1173187404462">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1173187404463">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1173187415542">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173187415825">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1173187415543" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithAnotherOperation" id="1173187417529">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173187419579">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1173187419328" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1173187421205">
                    <link role="link" targetNodeId="17.1173175590490" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.EditorComponentDeclaration" id="1173990860683">
    <property name="name" value="BaseMethodCall_actualArgumentList" />
    <link role="conceptDeclaration" targetNodeId="17.1068499141036" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1173990937233">
      <property name="drawBorder" value="false" />
      <property name="selectable" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1173990956438">
        <property name="text" value="(" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1173990956439">
        <property name="separatorText" value="," />
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1068499141038" />
        <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1173990956440">
          <property name="editable" value="true" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="true" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1173990956441">
        <property name="editable" value="false" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="true" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1174336117518">
    <link role="conceptDeclaration" targetNodeId="17.1174335983096" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1174336120927">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1174336122788">
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="var" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1174336145056">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="18.1169194664001" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1174336162245">
        <property name="text" value="=" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1174336167700">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="17.1068431790190" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1177326561663">
    <link role="conceptDeclaration" targetNodeId="17.1177326519037" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1177326571087">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1177326606089">
        <property name="textFgColor" value="gray" />
        <property name="text" value="/*" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1177326628328">
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1177326628329">
          <property name="text" value="  " />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1177326980923">
          <property name="cellBackground" value="lightGray" />
          <property name="vertical" value="true" />
          <link role="relationDeclaration" targetNodeId="17.1177326540772" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1177326622077">
        <property name="textFgColor" value="gray" />
        <property name="text" value="*/" />
      </node>
    </node>
  </node>
</model>


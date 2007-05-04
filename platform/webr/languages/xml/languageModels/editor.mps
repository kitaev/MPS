<?xml version="1.0" encoding="UTF-8"?>
<model name="webr.xml.editor">
  <language namespace="jetbrains.mps.bootstrap.editorLanguage" />
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang" />
  <language namespace="jetbrains.mps.bootstrap.sharedConcepts" />
  <maxImportIndex value="37" />
  <import index="1" modelUID="webr.xml.structure" />
  <import index="2" modelUID="jetbrains.mps.core.structure" />
  <import index="14" modelUID="java.lang@java_stub" />
  <import index="29" modelUID="jetbrains.mps.smodel@java_stub" />
  <import index="30" modelUID="webr.xml.editor" />
  <import index="31" modelUID="webr.xmlSchema.structure" />
  <import index="33" modelUID="jetbrains.mps.nodeEditor@java_stub" />
  <import index="34" modelUID="webr.xml.util@java_stub" />
  <import index="36" modelUID="webr.xmlInternal.structure" />
  <import index="37" modelUID="webr.xmlSchema.editor" />
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1161373286904">
    <link role="conceptDeclaration" targetNodeId="1.1161373262136" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1161373290875">
      <property name="drawBorder" value="false" />
      <property name="allowEmptyText" value="true" />
      <property name="attractsFocus" value="1" />
      <property name="fontStyle" value="BOLD" />
      <property name="textFgColor" value="DARK_GREEN" />
      <link role="relationDeclaration" targetNodeId="1.1161373273669" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1161911500984">
    <link role="conceptDeclaration" targetNodeId="1.1161911457732" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1161961882631">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1161961886493">
        <property name="selectable" value="false" />
        <property name="drawBorder" value="false" />
        <property name="text" value="*" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1161961889607">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1161911474092" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1163629288709">
    <link role="conceptDeclaration" targetNodeId="1.1163629230879" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Alternation" id="1166301006369">
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1166301006370">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1166301006371">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1175117827937">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1175117830892">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1175117827938" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1175117832409">
                <link role="property" targetNodeId="1.1166231449055" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Alternation" id="1166303669050">
        <property name="vertical" value="true" />
        <property name="drawBorder" value="false" />
        <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1166303669051">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1166303669052">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1175117855146">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1166303835480">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1166303827931">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1166303827336" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetParentOperation" id="1166303829557" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1166303838918">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.RefConcept_Reference" id="1177626176131">
                    <link role="conceptDeclaration" targetNodeId="1.1163629230879" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1166304045424">
          <property name="vertical" value="true" />
          <property name="drawBorder" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1166304045425">
            <property name="drawBorder" value="false" />
            <property name="text" value="(" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1166304045426">
            <property name="selectable" value="false" />
            <property name="drawBorder" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1166304045427">
              <property name="selectable" value="false" />
              <property name="drawBorder" value="false" />
              <property name="text" value="  " />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1166304045428">
              <property name="drawBorder" value="false" />
              <property name="vertical" value="true" />
              <property name="name" value="ver1" />
              <link role="relationDeclaration" targetNodeId="1.1163629255661" />
              <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1166304045429">
                <property name="drawBorder" value="false" />
                <property name="editable" value="true" />
              </node>
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1166304772939">
            <property name="drawBorder" value="false" />
            <property name="text" value=")" />
          </node>
        </node>
        <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1166304051499">
          <property name="vertical" value="true" />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="true" />
          <property name="name" value="ver2" />
          <link role="relationDeclaration" targetNodeId="1.1163629255661" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1166304051500">
            <property name="drawBorder" value="false" />
            <property name="editable" value="true" />
          </node>
        </node>
      </node>
      <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Alternation" id="1166316630612">
        <property name="vertical" value="true" />
        <property name="drawBorder" value="false" />
        <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1166316630613">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1166316630614">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1175117846785">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1166316648051">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1166316643784">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1166316641611" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetParentOperation" id="1166316647097" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1166316650443">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.RefConcept_Reference" id="1177626176088">
                    <link role="conceptDeclaration" targetNodeId="1.1167523027466" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1166316633197">
          <property name="drawBorder" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1166316633198">
            <property name="drawBorder" value="false" />
            <property name="text" value="(" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1166316633199">
            <property name="drawBorder" value="false" />
            <property name="name" value="hor2" />
            <link role="relationDeclaration" targetNodeId="1.1163629255661" />
            <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1166316633200">
              <property name="drawBorder" value="false" />
              <property name="editable" value="true" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1166316633201">
            <property name="drawBorder" value="false" />
            <property name="text" value=")" />
          </node>
        </node>
        <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1166316671278">
          <property name="drawBorder" value="false" />
          <property name="name" value="hor1" />
          <link role="relationDeclaration" targetNodeId="1.1163629255661" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1166316671279">
            <property name="drawBorder" value="false" />
            <property name="editable" value="true" />
            <property name="attractsFocus" value="1" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapDeclaration" id="1166220073978">
    <property name="everyModel" value="true" />
    <property name="name" value="Element_keymap" />
    <link role="applicableConcept" targetNodeId="1.1167523027466" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1166220162470">
      <property name="description" value="make element empty" />
      <property name="showInPopup" value="true" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1166220162471">
        <property name="keycode" value="VK_ENTER" />
        <property name="modifiers" value="alt" />
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1166220162472">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1166220162473">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1166220424916">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1166220429842">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1166220426934">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1166220424917" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1167707443197">
                  <link role="property" targetNodeId="1.1172970532917" />
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Property_SetOperation" id="1166220430827">
                <node role="value" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1166220436345">
                  <property name="value" value="true" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_IsApplicableFunction" id="1166220918074">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1166220918075">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1166739495979">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1166739495980">
              <property name="name" value="contentList" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1166739495982">
                <link role="concept" targetNodeId="1.1163629230879" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1166220963312">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1166220962608" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1167525058802">
                  <link role="link" targetNodeId="1.1172970431688" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1166739562398">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1166739562399">
              <property name="name" value="contents" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1166739562401">
                <link role="elementConcept" targetNodeId="1.1161371727643" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1166739509487">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1166739508908">
                  <link role="variableDeclaration" targetNodeId="1166739495980" resolveInfo="contentList" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccessAsList" id="1172970009566">
                  <link role="link" targetNodeId="1.1163629255661" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1166739413632">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1166739413633">
              <property name="name" value="count" />
              <node role="type" type="jetbrains.mps.baseLanguage.IntegerType" id="1166739413635" />
              <node role="initializer" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1166739577044">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1166739576434">
                  <link role="variableDeclaration" targetNodeId="1166739562399" resolveInfo="contents" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.GetSizeOperation" id="1166739581217" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1172970018051">
            <node role="expression" type="jetbrains.mps.baseLanguage.AndExpression" id="1166220954120">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.ParenthesizedExpression" id="1166739426496">
                <node role="expression" type="jetbrains.mps.baseLanguage.OrExpression" id="1166739436062">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.AndExpression" id="1166739444820">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.AndExpression" id="1166741166147">
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1166739597862">
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1166739589454">
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1166739588890">
                            <link role="variableDeclaration" targetNodeId="1166739562399" resolveInfo="contents" />
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.GetFirstOperation" id="1166739590173" />
                        </node>
                        <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1166739599925">
                          <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.RefConcept_Reference" id="1177626176194">
                            <link role="conceptDeclaration" targetNodeId="1.1161373262136" />
                          </node>
                        </node>
                      </node>
                      <node role="rightExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1166741169317">
                        <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1166741169318">
                          <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1166741169319">
                            <link role="concept" targetNodeId="1.1161373262136" />
                            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1166741169320">
                              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1166741169321">
                                <link role="variableDeclaration" targetNodeId="1166739562399" resolveInfo="contents" />
                              </node>
                              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.GetFirstOperation" id="1166741169322" />
                            </node>
                          </node>
                          <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1166741169323">
                            <link role="property" targetNodeId="1.1161373273669" />
                          </node>
                        </node>
                        <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Property_HasValue_Simple" id="1166741169324">
                          <node role="value" type="jetbrains.mps.baseLanguage.NullLiteral" id="1166741291801" />
                        </node>
                      </node>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1166739439660">
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1166739437815">
                        <link role="variableDeclaration" targetNodeId="1166739413633" resolveInfo="count" />
                      </node>
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1166739440788">
                        <property name="value" value="1" />
                      </node>
                    </node>
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1166739426497">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1166739426499">
                      <link role="variableDeclaration" targetNodeId="1166739413633" resolveInfo="count" />
                    </node>
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1166739426498">
                      <property name="value" value="0" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.NotExpression" id="1166220938179">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1166220938180">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1166220938181" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1167707439384">
                    <link role="property" targetNodeId="1.1172970532917" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1166221164010">
      <property name="description" value="make element not empty" />
      <property name="showInPopup" value="true" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1166221164011">
        <property name="keycode" value="VK_ENTER" />
        <property name="modifiers" value="alt" />
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1166221164012">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1166221164013">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1166222205063">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1166222207583">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1166222205503">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1166222205064" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1167707449012">
                  <link role="property" targetNodeId="1.1172970532917" />
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Property_SetOperation" id="1166222208225">
                <node role="value" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1166222212352" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_IsApplicableFunction" id="1166222185228">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1166222185229">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1172970048319">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1166222191593">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1166222190795" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1167707446667">
                <link role="property" targetNodeId="1.1172970532917" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1166315669614">
      <property name="description" value="make element horizontal" />
      <property name="showInPopup" value="true" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1166315669615">
        <property name="keycode" value="VK_ENTER" />
        <property name="modifiers" value="alt" />
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1166315669616">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1166315669617">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1167525257480">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1167525264127">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1167525262172">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1167525257951">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1167525257481" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1167525261483">
                    <link role="link" targetNodeId="1.1172970431688" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1167525263376">
                  <link role="property" targetNodeId="1.1166231449055" />
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Property_SetOperation" id="1167525265269">
                <node role="value" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1167525273068">
                  <property name="value" value="true" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_IsApplicableFunction" id="1166315705103">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1166315705104">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1175118028018">
            <node role="expression" type="jetbrains.mps.baseLanguage.NotExpression" id="1175118034400">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1175118034401">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1175118034402">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1175118034403" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1175118034404">
                    <link role="link" targetNodeId="1.1172970431688" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1175118034405">
                  <link role="property" targetNodeId="1.1166231449055" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1166316963289">
      <property name="description" value="make element vertical" />
      <property name="showInPopup" value="true" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1166316963290">
        <property name="keycode" value="VK_ENTER" />
        <property name="modifiers" value="alt" />
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1166316963291">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1166316963292">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1167525284945">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1167525291169">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1167525288433">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1167525285400">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1167525284946" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1167525287682">
                    <link role="link" targetNodeId="1.1172970431688" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1167525290121">
                  <link role="property" targetNodeId="1.1166231449055" />
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Property_SetOperation" id="1167525291998">
                <node role="value" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1167525296860" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_IsApplicableFunction" id="1166316985074">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1166316985075">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1175118001518">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1175118010694">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1175118004364">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1175118001519" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1175118008615">
                  <link role="link" targetNodeId="1.1172970431688" />
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1175118013804">
                <link role="property" targetNodeId="1.1166231449055" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1166232139036">
    <link role="conceptDeclaration" targetNodeId="1.1161371727643" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Error" id="1166803177963">
      <property name="drawBorder" value="false" />
      <property name="text" value="content" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapDeclaration" id="1166301257335">
    <property name="everyModel" value="true" />
    <property name="name" value="ContentList_keymap" />
    <link role="applicableConcept" targetNodeId="1.1163629230879" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1166301276602">
      <property name="description" value="make contentList horizontal" />
      <property name="showInPopup" value="true" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1166301276603">
        <property name="keycode" value="VK_ENTER" />
        <property name="modifiers" value="alt" />
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1166301276604">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1166301276605">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1166301348699">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1166301351531">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1166301349201">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1166301348700" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1166301350858">
                  <link role="property" targetNodeId="1.1166231449055" />
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Property_SetOperation" id="1166301352204">
                <node role="value" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1166301358924">
                  <property name="value" value="true" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_IsApplicableFunction" id="1166301313856">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1166301313857">
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1166301317014">
            <node role="expression" type="jetbrains.mps.baseLanguage.NotExpression" id="1166301334742">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1166301334743">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1166301334744" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1166301334745">
                  <link role="property" targetNodeId="1.1166231449055" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1170160217677">
      <property name="description" value="make contentList vertical" />
      <property name="showInPopup" value="true" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1170160217678">
        <property name="keycode" value="VK_ENTER" />
        <property name="modifiers" value="alt" />
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1170160217679">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1170160217680">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1170160269133">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1170160273449">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1170160269338">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1170160269134" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1170160272495">
                  <link role="property" targetNodeId="1.1166231449055" />
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Property_SetOperation" id="1170160276745">
                <node role="value" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1170160283403" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_IsApplicableFunction" id="1170160250359">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1170160250360">
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1170160258272">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1170160261836">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1170160261289" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1170160263384">
                <link role="property" targetNodeId="1.1166231449055" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1166802885616">
    <link role="conceptDeclaration" targetNodeId="1.1163340203555" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Error" id="1166802888430">
      <property name="drawBorder" value="false" />
      <property name="text" value="baseText" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1167523152214">
    <link role="conceptDeclaration" targetNodeId="1.1167523027466" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Alternation" id="1167707777767">
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1167707777768">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1167707777769">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1175117932180">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1167707799774">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1167707799242" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1167707800697">
                <link role="property" targetNodeId="1.1172970532917" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Alternation" id="1167707781224">
        <property name="vertical" value="true" />
        <property name="drawBorder" value="false" />
        <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1167707781225">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1167707781226">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1175117942058">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1175117954827">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1175117945638">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.ConceptFunctionParameter_node" id="1175117942059" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccessAsNode" id="1175117950654">
                    <link role="link" targetNodeId="1.1172970431688" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1175117956828">
                  <link role="property" targetNodeId="1.1166231449055" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167707781232">
          <property name="vertical" value="true" />
          <property name="drawBorder" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167707781233">
            <property name="selectable" value="false" />
            <property name="drawBorder" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167707781234">
              <property name="drawBorder" value="false" />
              <property name="text" value="&lt;" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1167707781235">
              <property name="drawBorder" value="false" />
              <link role="relationDeclaration" targetNodeId="1.1167523262932" />
              <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1167707781236">
                <link role="conceptDeclaration" targetNodeId="31.1167512696010" />
                <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1167707781237">
                  <property name="drawBorder" value="false" />
                  <property name="fontStyle" value="BOLD" />
                  <property name="readOnly" value="true" />
                  <property name="textFgColor" value="query" />
                  <link role="relationDeclaration" targetNodeId="31.1167838788027" />
                  <node role="cellForegroundFunction" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_Color" id="1176894050085">
                    <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1176894050086">
                      <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1178297240448">
                        <node role="expression" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1176894053477">
                          <link role="variableDeclaration" extResolveInfo="34.static field ([Classifier]XmlColorConstants).([StaticFieldDeclaration]XML_COLOR : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Color]))" />
                          <link role="classifier" targetNodeId="37.1178296794013" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1177880060739">
              <link role="editorComponent" targetNodeId="1177879858526" resolveInfo="Element_attributeList" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167707781239">
              <property name="drawBorder" value="false" />
              <property name="text" value="&gt;" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167707781240">
            <property name="selectable" value="false" />
            <property name="drawBorder" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167707781241">
              <property name="selectable" value="false" />
              <property name="drawBorder" value="false" />
              <property name="text" value="  " />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1167707781242">
              <property name="drawBorder" value="false" />
              <link role="relationDeclaration" targetNodeId="1.1172970431688" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167707781243">
            <property name="selectable" value="false" />
            <property name="drawBorder" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167707781244">
              <property name="drawBorder" value="false" />
              <property name="text" value="&lt;/" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1167707781245">
              <property name="drawBorder" value="false" />
              <link role="relationDeclaration" targetNodeId="1.1167523262932" />
              <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1167707781246">
                <link role="conceptDeclaration" targetNodeId="31.1167512696010" />
                <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1167707781247">
                  <property name="drawBorder" value="false" />
                  <property name="fontStyle" value="BOLD" />
                  <property name="readOnly" value="true" />
                  <property name="textFgColor" value="query" />
                  <link role="relationDeclaration" targetNodeId="31.1167838788027" />
                  <node role="cellForegroundFunction" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_Color" id="1176894067185">
                    <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1176894067186">
                      <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1178297281029">
                        <node role="expression" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1176894067554">
                          <link role="variableDeclaration" extResolveInfo="34.static field ([Classifier]XmlColorConstants).([StaticFieldDeclaration]XML_COLOR : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Color]))" />
                          <link role="classifier" targetNodeId="37.1178296794013" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167707781248">
              <property name="drawBorder" value="false" />
              <property name="text" value="&gt;" />
            </node>
          </node>
        </node>
        <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167707781249">
          <property name="drawBorder" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167707781250">
            <property name="drawBorder" value="false" />
            <property name="text" value="&lt;" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1167707781251">
            <property name="drawBorder" value="false" />
            <link role="relationDeclaration" targetNodeId="1.1167523262932" />
            <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1167707781252">
              <link role="conceptDeclaration" targetNodeId="31.1167512696010" />
              <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1167707781253">
                <property name="drawBorder" value="false" />
                <property name="fontStyle" value="BOLD" />
                <property name="readOnly" value="true" />
                <property name="textFgColor" value="query" />
                <link role="relationDeclaration" targetNodeId="31.1167838788027" />
                <node role="cellForegroundFunction" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_Color" id="1176894072164">
                  <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1176894072165">
                    <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1178297289235">
                      <node role="expression" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1176894072486">
                        <link role="variableDeclaration" extResolveInfo="34.static field ([Classifier]XmlColorConstants).([StaticFieldDeclaration]XML_COLOR : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Color]))" />
                        <link role="classifier" targetNodeId="37.1178296794013" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1177880053862">
            <link role="editorComponent" targetNodeId="1177879858526" resolveInfo="Element_attributeList" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167707781255">
            <property name="drawBorder" value="false" />
            <property name="text" value="&gt;" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1167707781256">
            <property name="drawBorder" value="false" />
            <property name="attractsFocus" value="1" />
            <link role="relationDeclaration" targetNodeId="1.1172970431688" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167707781257">
            <property name="drawBorder" value="false" />
            <property name="text" value="&lt;/" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1167707781258">
            <property name="drawBorder" value="false" />
            <link role="relationDeclaration" targetNodeId="1.1167523262932" />
            <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1167707781259">
              <link role="conceptDeclaration" targetNodeId="31.1167512696010" />
              <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1167707781260">
                <property name="drawBorder" value="false" />
                <property name="fontStyle" value="BOLD" />
                <property name="readOnly" value="true" />
                <property name="textFgColor" value="query" />
                <link role="relationDeclaration" targetNodeId="31.1167838788027" />
                <node role="cellForegroundFunction" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_Color" id="1176894077956">
                  <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1176894077957">
                    <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1178297296850">
                      <node role="expression" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1176894078371">
                        <link role="variableDeclaration" extResolveInfo="34.static field ([Classifier]XmlColorConstants).([StaticFieldDeclaration]XML_COLOR : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Color]))" />
                        <link role="classifier" targetNodeId="37.1178296794013" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167707781261">
            <property name="drawBorder" value="false" />
            <property name="text" value="&gt;" />
          </node>
        </node>
      </node>
      <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167707815948">
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167707822184">
          <property name="drawBorder" value="false" />
          <property name="text" value="&lt;" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1167707829436">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="1.1167523262932" />
          <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1167707829437">
            <link role="conceptDeclaration" targetNodeId="31.1167512696010" />
            <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1167707832954">
              <property name="drawBorder" value="false" />
              <property name="fontStyle" value="BOLD" />
              <property name="readOnly" value="true" />
              <property name="textFgColor" value="query" />
              <link role="relationDeclaration" targetNodeId="31.1167838788027" />
              <node role="cellForegroundFunction" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_Color" id="1176894084421">
                <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1176894084422">
                  <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1178297304403">
                    <node role="expression" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1176894084742">
                      <link role="variableDeclaration" extResolveInfo="34.static field ([Classifier]XmlColorConstants).([StaticFieldDeclaration]XML_COLOR : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Color]))" />
                      <link role="classifier" targetNodeId="37.1178296794013" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1177880043960">
          <link role="editorComponent" targetNodeId="1177879858526" resolveInfo="Element_attributeList" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167707847271">
          <property name="drawBorder" value="false" />
          <property name="text" value="/&gt;" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1167700380922">
    <link role="conceptDeclaration" targetNodeId="1.1167700349452" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1167700384113">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1167701355879">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1167701332877" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1167701355880">
          <link role="conceptDeclaration" targetNodeId="31.1167697887602" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1167701361647">
            <property name="drawBorder" value="false" />
            <property name="fontStyle" value="BOLD_ITALIC" />
            <property name="readOnly" value="true" />
            <property name="textFgColor" value="query" />
            <link role="relationDeclaration" targetNodeId="31.1167698115100" />
            <node role="cellForegroundFunction" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_Color" id="1176894092744">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1176894092745">
                <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1178297314034">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1176894093065">
                    <link role="variableDeclaration" extResolveInfo="34.static field ([Classifier]XmlColorConstants).([StaticFieldDeclaration]XML_COLOR : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Color]))" />
                    <link role="classifier" targetNodeId="37.1178296794013" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167700385990">
        <property name="drawBorder" value="false" />
        <property name="text" value="=" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167701625714">
        <property name="drawBorder" value="false" />
        <property name="text" value="&quot;" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1167703291707">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1167703268127" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1167701628076">
        <property name="drawBorder" value="false" />
        <property name="text" value="&quot;" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1168397366544">
    <link role="conceptDeclaration" targetNodeId="1.1165235274815" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Error" id="1168397368593">
      <property name="drawBorder" value="false" />
      <property name="text" value="baseAttribute" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapDeclaration" id="1172192350452">
    <property name="everyModel" value="true" />
    <property name="name" value="Content_keymap" />
    <link role="applicableConcept" targetNodeId="1.1161371727643" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapItem" id="1172192461215">
      <property name="description" value="create content list" />
      <property name="showInPopup" value="true" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMapKeystroke" id="1172192461216">
        <property name="keycode" value="VK_ENTER" />
        <property name="modifiers" value="alt" />
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_ExecuteFunction" id="1172192461217">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1172192461218">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1172192565706">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1172192565707">
              <property name="name" value="contentList" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1172192565709">
                <link role="concept" targetNodeId="1.1163629230879" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172192552517">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1172192552047" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithNewOperation" id="1172192554768">
                  <link role="concept" targetNodeId="1.1163629230879" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1172192578258">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172192593262">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172192578869">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1172192578259">
                  <link role="variableDeclaration" targetNodeId="1172192565707" resolveInfo="contentList" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1172192592558">
                  <link role="link" targetNodeId="1.1163629255661" />
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.LinkList_AddChildOperation" id="1172192599544">
                <node role="parameter" type="jetbrains.mps.bootstrap.editorLanguage.CellKeyMap_FunctionParm_selectedNode" id="1172192602781" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1172192633564">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172192646147">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172192641504">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1172192633628">
                  <link role="variableDeclaration" targetNodeId="1172192565707" resolveInfo="contentList" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1172192645349">
                  <link role="link" targetNodeId="1.1163629255661" />
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.LinkList_AddNewChildOperation" id="1172192648039" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1172192656525">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172192661857">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172192657308">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1172192656526">
                  <link role="variableDeclaration" targetNodeId="1172192565707" resolveInfo="contentList" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1172192660778">
                  <link role="property" targetNodeId="1.1166231449055" />
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Property_SetOperation" id="1172192663827">
                <node role="value" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1172192665829">
                  <property name="value" value="true" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1172960855593">
    <link role="conceptDeclaration" targetNodeId="1.1172960673168" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1172960860439">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1172960862019">
        <property name="drawBorder" value="false" />
        <property name="text" value="&amp;" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1172960872446">
        <property name="layoutConstraint" value="punctuation" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1172960837561" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1172960872447">
          <link role="conceptDeclaration" targetNodeId="31.1172950047361" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1172960875027">
            <property name="textFgColor" value="query" />
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="31.1172959826115" />
            <node role="cellForegroundFunction" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_Color" id="1176894100193">
              <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1176894100194">
                <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1178297321228">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1176894100452">
                    <link role="variableDeclaration" extResolveInfo="34.static field ([Classifier]XmlColorConstants).([StaticFieldDeclaration]XML_COLOR : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Color]))" />
                    <link role="classifier" targetNodeId="37.1178296794013" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1172960865411">
        <property name="layoutConstraint" value="punctuation" />
        <property name="drawBorder" value="false" />
        <property name="text" value=";" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.EditorComponentDeclaration" id="1177879858526">
    <property name="name" value="Element_attributeList" />
    <link role="conceptDeclaration" targetNodeId="1.1167523027466" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1177879924827">
      <property name="vertical" value="false" />
      <link role="relationDeclaration" targetNodeId="1.1177879757622" />
      <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1177879946031" />
    </node>
  </node>
</model>


<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.bootstrap.smodelLanguage.editor">
  <language namespace="jetbrains.mps.bootstrap.editorLanguage" />
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <maxImportIndex value="4" />
  <import index="1" modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" />
  <import index="2" modelUID="jetbrains.mps.core.structure" />
  <import index="3" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure" />
  <import index="4" modelUID="jetbrains.mps.baseLanguage.structure" />
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1138063451695">
    <link role="conceptDeclaration" targetNodeId="1.1138056022639" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1138412409274">
      <property name="drawBorder" value="false" />
      <property name="noTargetText" value="&lt;no property&gt;" />
      <link role="relationDeclaration" targetNodeId="1.1138056395725" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1138412409275">
        <link role="conceptDeclaration" targetNodeId="3.1071489288299" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1138412409276">
          <property name="drawBorder" value="false" />
          <property name="readOnly" value="true" />
          <link role="relationDeclaration" targetNodeId="2.1078489098626" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1138063757082">
    <link role="conceptDeclaration" targetNodeId="1.1138055978872" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1138063769790">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1138063769791">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1138056667223" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1138063769792">
        <property name="text" value="." />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1138412455559">
        <property name="attractsFocus" value="1" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1138411864174" />
        <link role="actionMap" targetNodeId="1140123519849" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1138063852256">
    <link role="conceptDeclaration" targetNodeId="1.1138056143562" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1138412329756">
      <property name="drawBorder" value="false" />
      <property name="noTargetText" value="&lt;no link&gt;" />
      <link role="relationDeclaration" targetNodeId="1.1138056516764" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1138412329757">
        <link role="conceptDeclaration" targetNodeId="3.1071489288298" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1138412329758">
          <property name="drawBorder" value="false" />
          <property name="readOnly" value="true" />
          <link role="relationDeclaration" targetNodeId="3.1071599776563" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1138063886704">
    <link role="conceptDeclaration" targetNodeId="1.1138056282393" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1138412361312">
      <property name="drawBorder" value="false" />
      <property name="noTargetText" value="&lt;no link&gt;" />
      <link role="relationDeclaration" targetNodeId="1.1138056546658" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1138412361313">
        <link role="conceptDeclaration" targetNodeId="3.1071489288298" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1138412361314">
          <property name="drawBorder" value="false" />
          <property name="readOnly" value="true" />
          <link role="relationDeclaration" targetNodeId="3.1071599776563" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1138405893950">
    <link role="conceptDeclaration" targetNodeId="1.1138055754698" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1138405907970">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1138405916830">
        <property name="editable" value="true" />
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="snode" />
        <property name="fontStyle" value="BOLD" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1138406005691">
        <property name="text" value="&lt;" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1138406014241">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1138405853777" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1138406014240">
          <link role="conceptDeclaration" targetNodeId="3.1071489090640" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1138406019759">
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <property name="noTargetText" value="&lt;no name&gt;" />
            <link role="relationDeclaration" targetNodeId="2.1078489098626" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1138406102625">
        <property name="text" value="&gt;" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1138412002490">
    <link role="conceptDeclaration" targetNodeId="1.1138411891628" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Error" id="1138412005946">
      <property name="text" value="&lt;choose operaion&gt;" />
      <property name="drawBorder" value="false" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1138661965229">
    <link role="conceptDeclaration" targetNodeId="1.1138661924179" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1138661974653">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1138661978216">
        <property name="editable" value="true" />
        <property name="text" value="set (" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1138662130034">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no value&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1138662048170" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1138662136645">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1138676397914">
    <link role="conceptDeclaration" targetNodeId="1.1138676077309" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1138676418683">
      <property name="drawBorder" value="false" />
      <property name="noTargetText" value="&lt;no enum member&gt;" />
      <link role="relationDeclaration" targetNodeId="1.1138676095763" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1138676418699">
        <link role="conceptDeclaration" targetNodeId="3.1083171877298" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1138676426764">
          <property name="textFgColor" value="DARK_MAGENTA" />
          <property name="fontStyle" value="BOLD" />
          <property name="drawBorder" value="false" />
          <property name="readOnly" value="true" />
          <property name="noTargetText" value="&lt;no ext value&gt;" />
          <link role="relationDeclaration" targetNodeId="3.1083923523172" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1138757943608">
    <link role="conceptDeclaration" targetNodeId="1.1138757581985" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1139880110903">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1139880110904">
        <property name="editable" value="true" />
        <property name="text" value="set new (" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1139880110905">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;default&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1139880128956" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1139880110906">
          <link role="conceptDeclaration" targetNodeId="3.1071489090640" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1139880110907">
            <link role="relationDeclaration" targetNodeId="2.1078489098626" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1139880110908">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1139184505217">
    <link role="conceptDeclaration" targetNodeId="1.1139184414036" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1139877768037">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1139877769323">
        <property name="editable" value="true" />
        <property name="text" value="add new (" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1139877775154">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;default&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1139877738879" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1139877775153">
          <link role="conceptDeclaration" targetNodeId="3.1071489090640" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1139877785578">
            <link role="relationDeclaration" targetNodeId="2.1078489098626" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1139877793189">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1139616285308">
    <link role="conceptDeclaration" targetNodeId="1.1139613262185" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1139616289482">
      <property name="editable" value="true" />
      <property name="text" value="parent" />
      <property name="attractsFocus" value="1" />
      <property name="drawBorder" value="false" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1139621561609">
    <link role="conceptDeclaration" targetNodeId="1.1139621453865" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1139621567253">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1139621579911">
        <property name="editable" value="true" />
        <property name="text" value="isInstanceOf(" />
        <property name="fontStyle" value="PLAIN" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1139621610101">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no concept&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1139621517231" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1139621610100">
          <link role="conceptDeclaration" targetNodeId="3.1071489090640" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1139621618369">
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="2.1078489098626" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1139621663918">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1139859062995">
    <link role="conceptDeclaration" targetNodeId="1.1139858892567" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1139859068528">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1139859072592">
        <property name="editable" value="true" />
        <property name="text" value="new next-sibling (" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1139859121222">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no concept&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1139858951584" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1139859121221">
          <link role="conceptDeclaration" targetNodeId="3.1071489090640" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1139859127630">
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="2.1078489098626" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1139859097547">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1139868014682">
    <link role="conceptDeclaration" targetNodeId="1.1139867745658" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1139868035538">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1139868035539">
        <property name="editable" value="true" />
        <property name="text" value="replace with new (" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1139868035540">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no concept&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1139867957129" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1139868035541">
          <link role="conceptDeclaration" targetNodeId="3.1071489090640" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1139868035542">
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="2.1078489098626" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1139868035543">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1139870425549">
    <link role="conceptDeclaration" targetNodeId="1.1139870260207" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1139870427663">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1139870427664">
        <property name="editable" value="true" />
        <property name="text" value="add (" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1139870441857">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1139870362308" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1139870427668">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1140029629081">
    <link role="conceptDeclaration" targetNodeId="1.1140029532506" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1140029629082">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1140029629083">
        <property name="editable" value="true" />
        <property name="text" value="insert first (" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1140029629084">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1139870362308" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1140029629085">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapDeclaration" id="1140123519849">
    <property name="name" value="SNodeOperationExpression_Operation_Actions" />
    <link role="applicableConcept" targetNodeId="1.1138055978872" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1140123561975">
      <property name="description" value="replace operation expression with left expression" />
      <property name="actionId" value="delete_action_id" />
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_IsApplicableFunction" id="1140123561976">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1140123562103">
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1140125586895">
            <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1140125589522">
              <property name="value" value="true" />
            </node>
          </node>
        </node>
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1140123561977">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1140123562104">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1140143244848">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1140143247163">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1140143244849" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithAnotherOperation" id="1140143253429">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1140143258604">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1140143256963" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1140143262730">
                    <link role="link" targetNodeId="1.1138056667223" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1140143268170">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1140143270828">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1140143268171" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_DeleteOperation" id="1140143275001" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1140129701012">
    <link role="conceptDeclaration" targetNodeId="1.1140129518788" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1140129710123">
      <property name="editable" value="true" />
      <property name="text" value="delete" />
      <property name="drawBorder" value="false" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1140131924706">
    <link role="conceptDeclaration" targetNodeId="1.1140131837776" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1140131934568">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1140131934569">
        <property name="editable" value="true" />
        <property name="text" value="replace with (" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1140131934570">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1139870362308" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1140131934571">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1140133705633">
    <link role="conceptDeclaration" targetNodeId="1.1140133623887" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1140133705634">
      <property name="editable" value="true" />
      <property name="text" value="delete" />
      <property name="drawBorder" value="false" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1140138174990">
    <link role="conceptDeclaration" targetNodeId="1.1140137987495" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1140138178976">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1140138184899">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1140138123956" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1140138199073">
        <property name="text" value=":" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1140138237889">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no concept&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1140138128738" />
        <link role="actionMap" targetNodeId="1140139667693" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1140138237888">
          <link role="conceptDeclaration" targetNodeId="3.1071489090640" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1140138242844">
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="2.1078489098626" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapDeclaration" id="1140139667693">
    <property name="name" value="SNodeTypeCastExpression_Concept_Actions" />
    <link role="applicableConcept" targetNodeId="1.1140137987495" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1140139769225">
      <property name="description" value="replace type case with left expression" />
      <property name="actionId" value="delete_action_id" />
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_IsApplicableFunction" id="1140139769226">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1140139769244">
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1140139858996">
            <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1140139861044">
              <property name="value" value="true" />
            </node>
          </node>
        </node>
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1140139769227">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1140139769245">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1140139883561">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1140139885751">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1140139883562" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithAnotherOperation" id="1140139898486">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1140139907020">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1140139905394" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1140139909459">
                    <link role="link" targetNodeId="1.1140138123956" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1140139914789">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1140139916322">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1140139916729" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_DeleteOperation" id="1140139922730" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1140725455179">
    <link role="conceptDeclaration" targetNodeId="1.1140725362528" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1140725455180">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1140725455181">
        <property name="editable" value="true" />
        <property name="text" value="set (" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1140725455182">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1140725362529" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1140725455183">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
</model>


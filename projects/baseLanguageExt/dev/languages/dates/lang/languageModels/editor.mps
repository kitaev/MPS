<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.baseLanguage.ext.dates.lang.editor">
  <language namespace="jetbrains.mps.bootstrap.editorLanguage" />
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <maxImportIndex value="39" />
  <import index="1" modelUID="jetbrains.mps.baseLanguage.ext.dates.lang.structure" />
  <import index="2" modelUID="jetbrains.mps.core.structure" />
  <import index="28" modelUID="jetbrains.mps.baseLanguage.ext.dates.internal.structure" />
  <import index="36" modelUID="jetbrains.mps.baseLanguage.structure" />
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1169486849321">
    <link role="conceptDeclaration" targetNodeId="1.1169486306512" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1169486856776">
      <property name="editable" value="false" />
      <property name="textFgColor" value="DARK_BLUE" />
      <property name="drawBorder" value="false" />
      <link role="relationDeclaration" targetNodeId="1.1169486418493" />
    </node>
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1169488749971">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1169488752877">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1169488752878">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="1.1169486362588" />
          <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1169488752879">
            <link role="conceptDeclaration" targetNodeId="28.1169491688591" />
            <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1169488752880">
              <property name="drawBorder" value="false" />
              <property name="readOnly" value="true" />
              <link role="relationDeclaration" targetNodeId="2.1078489098626" />
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1169488752881">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="1.1169486445258" />
          <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1169488752882">
            <link role="conceptDeclaration" targetNodeId="28.1169491669264" />
            <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1169488752883">
              <property name="drawBorder" value="false" />
              <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169488752884">
                <property name="text" value="for" />
                <property name="drawBorder" value="false" />
              </node>
              <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1169488752885">
                <property name="drawBorder" value="false" />
                <property name="readOnly" value="true" />
                <link role="relationDeclaration" targetNodeId="28.1169491669265" />
              </node>
              <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Alternation" id="1169488752886">
                <property name="drawBorder" value="false" />
                <property name="vertical" value="true" />
                <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1169488752887">
                  <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1169488752888">
                    <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1169488752889">
                      <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1169488752890">
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1169488752891">
                          <property name="value" value="1" />
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1169488752892">
                          <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.NodeCondition_FunctionParm_node" id="1169488752893" />
                          <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1169488752894">
                            <link role="property" targetNodeId="28.1169491669265" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169488752895">
                  <property name="text" value="times" />
                  <property name="drawBorder" value="false" />
                </node>
                <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169488752896">
                  <property name="text" value="time" />
                  <property name="drawBorder" value="false" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1169488749972">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="true" />
        <property name="gridLayout" value="true" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1169488749973">
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169488749974">
            <property name="text" value="meaning" />
            <property name="drawBorder" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1169488749975">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <link role="relationDeclaration" targetNodeId="1.1169486362588" />
            <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1169488749976">
              <link role="conceptDeclaration" targetNodeId="28.1169491688591" />
              <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1169488749977">
                <property name="drawBorder" value="false" />
                <property name="readOnly" value="true" />
                <link role="relationDeclaration" targetNodeId="28.1169491688592" />
              </node>
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1169488749978">
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169488749979">
            <property name="text" value="repeating meaning" />
            <property name="drawBorder" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1169488749980">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <link role="relationDeclaration" targetNodeId="1.1169486445258" />
            <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1169488749981">
              <link role="conceptDeclaration" targetNodeId="28.1169491669264" />
              <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1169488749982">
                <property name="drawBorder" value="false" />
                <property name="readOnly" value="true" />
                <link role="relationDeclaration" targetNodeId="28.1169491669266" />
              </node>
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1169488749983">
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169488749984">
            <property name="text" value="examples" />
            <property name="drawBorder" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1169488749985">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <link role="relationDeclaration" targetNodeId="1.1169486362588" />
            <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1169488749986">
              <link role="conceptDeclaration" targetNodeId="28.1169491688591" />
              <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1169488749987">
                <property name="drawBorder" value="false" />
                <property name="readOnly" value="true" />
                <link role="relationDeclaration" targetNodeId="28.1169491688593" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1169487499058">
    <link role="conceptDeclaration" targetNodeId="1.1169487448949" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1169487502217">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1169487515953">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="2.1078489098626" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169487520470">
        <property name="text" value=":" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1169487525785">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1169487470543" />
        <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169487531301">
          <property name="drawBorder" value="false" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1169488436456">
    <link role="conceptDeclaration" targetNodeId="1.1169481390637" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1169488439006">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1169488442900">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169488446011">
          <property name="text" value="formats" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1169550080987">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="2.1078489098626" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169488454762">
          <property name="text" value="{" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1169488462237">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169488464176">
          <property name="text" value="  " />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1169488470193">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="true" />
          <link role="relationDeclaration" targetNodeId="1.1169488417691" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169488478179">
            <property name="drawBorder" value="false" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169488458781">
        <property name="text" value="}" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1169495358926">
    <link role="conceptDeclaration" targetNodeId="1.1169495318439" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1169495511306">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169495516841">
        <property name="text" value="'" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1169495511307">
        <property name="textFgColor" value="DARK_GREEN" />
        <property name="fontStyle" value="BOLD" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1169495350409" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169495521014">
        <property name="text" value="'" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1169549287824">
    <link role="conceptDeclaration" targetNodeId="1.1169495337236" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Error" id="1169549290218">
      <property name="text" value="format token" />
      <property name="drawBorder" value="false" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1169557727967">
    <link role="conceptDeclaration" targetNodeId="1.1169557513226" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1169557732251">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1169557735519">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1169557612323" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1172066155438">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <link role="actionMap" targetNodeId="1172066082833" resolveInfo="FormatExression_KeyMap" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1172066163903">
          <property name="text" value="#" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1172066155439">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="1.1169557643590" />
          <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1172066155440">
            <link role="conceptDeclaration" targetNodeId="1.1169487448949" />
            <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1172066155441">
              <property name="drawBorder" value="false" />
              <property name="readOnly" value="true" />
              <link role="relationDeclaration" targetNodeId="2.1078489098626" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1169563386806">
    <link role="conceptDeclaration" targetNodeId="1.1169563273551" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1169563391622">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1169563396905">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1169563300146" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1169563396906">
          <link role="conceptDeclaration" targetNodeId="1.1169487448949" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1169563404674">
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="2.1078489098626" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1169563544178">
    <link role="conceptDeclaration" targetNodeId="1.1169563444535" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1169563547149">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1169563552715">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1169563469176" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169563557092">
        <property name="text" value="-&gt;" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1169639470143">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1169563482193" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1169639470144">
          <link role="conceptDeclaration" targetNodeId="1.1169487448949" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1169639481256">
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="2.1078489098626" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1169563638159">
    <link role="conceptDeclaration" targetNodeId="1.1169562965517" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1169563701046">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1169563701047">
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169563701048">
          <property name="text" value="switch" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169563701049">
          <property name="text" value="{" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1169563711212">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169563711213">
          <property name="text" value="  " />
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1169563716715">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="true" />
          <link role="relationDeclaration" targetNodeId="1.1169563619049" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169563723216">
            <property name="drawBorder" value="false" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169563728374">
        <property name="text" value="}" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1169630154117">
    <link role="conceptDeclaration" targetNodeId="1.1169630122569" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169630158947">
      <property name="textFgColor" value="DARK_BLUE" />
      <property name="text" value="now" />
      <property name="drawBorder" value="false" />
    </node>
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169630199294">
      <property name="text" value="Instance of DateTime corresponding to current moment" />
      <property name="drawBorder" value="false" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1169631841789">
    <link role="conceptDeclaration" targetNodeId="1.1169631506005" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1169632541034">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169632549428">
        <property name="textFgColor" value="blue" />
        <property name="text" value="&gt;" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1169632541035">
        <property name="drawBorder" value="false" />
        <property name="drawBrackets" value="true" />
        <link role="relationDeclaration" targetNodeId="36.1137022507850" />
      </node>
    </node>
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1169632462117">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <property name="gridLayout" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169632474700">
        <property name="text" value="parameters:" />
        <property name="fontStyle" value="PLAIN" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1169632462118">
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1169632462119">
          <property name="underlined" value="2" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="1.1169631741860" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169632462120">
          <property name="text" value="date time to format" />
          <property name="fontStyle" value="PLAIN" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169637649280">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169637659953">
        <property name="text" value="returns:" />
        <property name="fontStyle" value="PLAIN" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169637702453">
        <property name="text" value="Last statement should be an ExpressionStatement" />
        <property name="fontStyle" value="PLAIN" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1169637675313">
        <property name="text" value="Value of the expression is a condition to test" />
        <property name="fontStyle" value="PLAIN" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1169635325073">
    <link role="conceptDeclaration" targetNodeId="1.1169634841825" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1169635331920">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1169635337297">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="36.1068431790188" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1169635345143">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="36.1083152972671" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1171963239567">
    <link role="conceptDeclaration" targetNodeId="1.1171963068132" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1171963874545">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1171964018735">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1171964003156" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_ConceptProperty" id="1171966473900">
        <property name="layoutConstraint" value="punctuation" />
        <property name="editable" value="false" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="2.1137473891462" />
        <link role="actionMap" targetNodeId="1172065403260" resolveInfo="UnaryDateTimeOperation_KeyMap" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1171964300764">
    <link role="conceptDeclaration" targetNodeId="1.1171964197527" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1171964303907">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1171964305284">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1171964270700" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1172066873242">
        <property name="layoutConstraint" value="punctuation" />
        <property name="text" value=".datetime" />
        <property name="drawBorder" value="false" />
        <link role="actionMap" targetNodeId="1172065886141" resolveInfo="ToDateTimeOperation_KeyMap" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapDeclaration" id="1172065403260">
    <property name="name" value="UnaryDateTimeOperation_KeyMap" />
    <link role="applicableConcept" targetNodeId="1.1171963068132" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1172065438479">
      <property name="description" value="Delete operation" />
      <property name="actionId" value="delete_action_id" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1172065438480">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1172065438481">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1172065525877">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172065526192">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1172065556367" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithAnotherOperation" id="1172065548896">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172065584442">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1172065584050" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1172065586099">
                    <link role="link" targetNodeId="1.1171964003156" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapDeclaration" id="1172065886141">
    <property name="name" value="ToDateTimeOperation_KeyMap" />
    <link role="applicableConcept" targetNodeId="1.1171964197527" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1172065925329">
      <property name="actionId" value="delete_action_id" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1172065925330">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1172065925331">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1172065934942">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172065935319">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1172065934943" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithAnotherOperation" id="1172065940929">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172066010557">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1172066010290" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1172066028621">
                    <link role="link" targetNodeId="1.1171964270700" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapDeclaration" id="1172066082833">
    <property name="name" value="FormatExression_KeyMap" />
    <link role="applicableConcept" targetNodeId="1.1169557513226" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1172066120068">
      <property name="actionId" value="delete_action_id" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1172066120069">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1172066120070">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1172066127165">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172066127386">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1172066127166" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithAnotherOperation" id="1172066130465">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1172066132374">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1172066132060" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1172066140859">
                    <link role="link" targetNodeId="1.1169557612323" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1172074935895">
    <link role="conceptDeclaration" targetNodeId="1.1172074800504" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1172074938400">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1172074941766">
        <property name="text" value="(" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1172074946226">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1172074898284" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1172075395293">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1172075381034" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1172075403775">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1172074912819" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1172075408431">
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1172075412353">
        <property name="text" value="by" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1172075419695">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1172074844144" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1172075419696">
          <link role="conceptDeclaration" targetNodeId="28.1172074318583" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1172075423712">
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="2.1169194664001" />
          </node>
        </node>
      </node>
    </node>
  </node>
</model>


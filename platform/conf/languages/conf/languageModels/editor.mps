<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:4552583f-8a1d-409d-a4c9-d1a157bad5eb(jetbrains.mps.platform.conf.editor)">
  <persistence version="4" />
  <refactoringHistory />
  <language namespace="32d0a39c-772f-4490-8142-e50f9a9f19d4(jetbrains.mps.platform.conf)" />
  <language namespace="18bc6592-03a6-4e29-a83a-7ff23bde13ba(jetbrains.mps.lang.editor)" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959029e(jetbrains.mps.lang.editor.structure)" version="32" />
  <languageAspect modelUID="r:4552583f-8a1d-409d-a4c9-d1a157bad5eb(jetbrains.mps.platform.conf.editor)" version="-1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <languageAspect modelUID="r:8f4e8d01-a81e-409b-a7a6-092ad440588f(jetbrains.mps.platform.conf.behavior)" version="-1" />
  <devkit namespace="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  <maxImportIndex value="1" />
  <import index="1" modelUID="r:d3304d29-cd93-4341-982d-9f0d1a8b40bf(jetbrains.mps.platform.conf.structure)" version="0" />
  <visible index="2" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" />
  <node type="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration:32" id="5314521579133271088">
    <property name="virtualPackage:32" value="xml" />
    <link role="conceptDeclaration:32" targetNodeId="1.5314521579133271086:0" resolveInfo="XmlConfiguration" />
    <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Collection:32" id="5314521579133271090">
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Collection:32" id="5314521579133271093">
        <node role="styleItem:32" type="jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem:32" id="5314521579133271094">
          <property name="flag:32" value="false" />
        </node>
        <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Constant:32" id="5314521579133271097">
          <property name="text:32" value="configuration" />
        </node>
        <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Constant:32" id="5314521579133271103">
          <property name="text:32" value="&quot;" />
        </node>
        <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Property:32" id="5314521579133271101">
          <link role="relationDeclaration:32" targetNodeId="2v.1169194664001:0" resolveInfo="name" />
        </node>
        <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Constant:32" id="5314521579133271106">
          <property name="text:32" value="&quot;" />
        </node>
        <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Horizontal:32" id="5314521579133271096" />
      </node>
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Indent:32" id="5314521579133271108" />
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_RefNode:32" id="1740160309778174793">
        <link role="relationDeclaration:32" targetNodeId="1.7130790807395857418:0" />
      </node>
      <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Vertical:32" id="5314521579133271092" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration:32" id="1740160309778208724">
    <property name="virtualPackage:32" value="xml" />
    <link role="conceptDeclaration:32" targetNodeId="1.5066720069350533027:0" resolveInfo="XInclude" />
    <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Collection:32" id="1740160309778208726">
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Component:32" id="1740160309778213313">
        <link role="editorComponent:32" targetNodeId="1740160309778213296" resolveInfo="ConfigurationXmlNode_Header" />
      </node>
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_RefCell:32" id="1829899669319019853">
        <link role="relationDeclaration:32" targetNodeId="1.1829899669318982164:0" />
        <node role="editorComponent:32" type="jetbrains.mps.lang.editor.structure.InlineEditorComponent:32" id="1829899669319019854">
          <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Property:32" id="1829899669319019856">
            <property name="readOnly:32" value="true" />
            <link role="relationDeclaration:32" targetNodeId="2v.1169194664001:0" resolveInfo="name" />
          </node>
        </node>
      </node>
      <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Horizontal:32" id="1740160309778208728" />
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Constant:32" id="4559888222469859038">
        <property name="text:32" value="/" />
      </node>
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Property:32" id="4559888222469859040">
        <property name="noTargetText:32" value="&lt;undefined&gt;" />
        <property name="allowEmptyText:32" value="true" />
        <link role="relationDeclaration:32" targetNodeId="1.4559888222469859036:0" resolveInfo="xpointer" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.editor.structure.EditorComponentDeclaration:32" id="1740160309778213296">
    <property name="virtualPackage:32" value="xml" />
    <property name="name:32" value="ConfigurationXmlNode_Header" />
    <link role="conceptDeclaration:32" targetNodeId="1.5066720069350533029:0" resolveInfo="ConfigurationXmlNode" />
    <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Collection:32" id="1740160309778213298">
      <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Horizontal:32" id="1740160309778213300" />
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_ConceptProperty:32" id="1740160309778213307">
        <link role="relationDeclaration:32" targetNodeId="2v.1137473891462:0" resolveInfo="alias" />
      </node>
    </node>
  </node>
  <visible index="3" modelUID="r:8f4e8d01-a81e-409b-a7a6-092ad440588f(jetbrains.mps.platform.conf.behavior)" />
  <node type="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration:32" id="1740160309778213304">
    <property name="virtualPackage:32" value="elements.containers" />
    <link role="conceptDeclaration:32" targetNodeId="1.1740160309778170999:0" resolveInfo="Components" />
    <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Collection:32" id="1740160309778227727">
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_ReadOnlyModelAccessor:32" id="3919891163767797425">
        <node role="modelAccessor:32" type="jetbrains.mps.lang.editor.structure.ReadOnlyModelAccessor:32" id="3919891163767797426">
          <node role="getter:32" type="jetbrains.mps.lang.editor.structure.QueryFunction_ModelAccess_Getter:32" id="3919891163767797427">
            <node role="body:32" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="3919891163767797428">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="3919891163767837982">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="3919891163767837984">
                  <node role="operand:3" type="jetbrains.mps.lang.editor.structure.ConceptFunctionParameter_node:32" id="3919891163767837983" />
                  <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall:16" id="3919891163767837988">
                    <link role="baseMethodDeclaration:16" targetNodeId="3v.3919891163767797432" resolveInfo="getName" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Collection:32" id="1740160309778227732">
        <node role="styleItem:32" type="jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem:32" id="1740160309778227733">
          <property name="flag:32" value="false" />
        </node>
        <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Indent:32" id="1740160309778227740" />
        <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_RefNodeList:32" id="1740160309778227736">
          <link role="relationDeclaration:32" targetNodeId="1.1740160309778170996:0" />
          <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_VerticalGrid:32" id="2955496203774982638" />
        </node>
        <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Horizontal:32" id="1740160309778227738" />
      </node>
      <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Vertical:32" id="1740160309778227728" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration:32" id="1740160309778221574">
    <property name="virtualPackage:32" value="elements" />
    <link role="conceptDeclaration:32" targetNodeId="1.1740160309778217806:0" resolveInfo="IdeaPlugin" />
    <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Collection:32" id="1740160309778221576">
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Component:32" id="1740160309778221579">
        <link role="editorComponent:32" targetNodeId="1740160309778213296" resolveInfo="ConfigurationXmlNode_Header" />
      </node>
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Collection:32" id="1740160309778226743">
        <node role="styleItem:32" type="jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem:32" id="1740160309778226744">
          <property name="flag:32" value="false" />
        </node>
        <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Indent:32" id="1740160309778226747" />
        <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Horizontal:32" id="1740160309778226746" />
        <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_RefNodeList:32" id="1740160309778221585">
          <link role="relationDeclaration:32" targetNodeId="1.1740160309778221573:0" />
          <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Vertical:32" id="1740160309778221586" />
        </node>
      </node>
      <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Vertical:32" id="1740160309778221578" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration:32" id="1740160309778233534">
    <property name="virtualPackage:32" value="elements.components" />
    <link role="conceptDeclaration:32" targetNodeId="1.4635942846893810046:0" resolveInfo="Component" />
    <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Collection:32" id="2955496203774982639">
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_ReadOnlyModelAccessor:32" id="2955496203774982640">
        <node role="modelAccessor:32" type="jetbrains.mps.lang.editor.structure.ReadOnlyModelAccessor:32" id="2955496203774982641">
          <node role="getter:32" type="jetbrains.mps.lang.editor.structure.QueryFunction_ModelAccess_Getter:32" id="2955496203774982642">
            <node role="body:32" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="2955496203774982643">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="2955496203774982644">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="2955496203774982645">
                  <node role="operand:3" type="jetbrains.mps.lang.editor.structure.ConceptFunctionParameter_node:32" id="2955496203774982646" />
                  <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall:16" id="2955496203774982647">
                    <link role="baseMethodDeclaration:16" targetNodeId="3v.1740160309778233539" resolveInfo="name" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="styleItem:32" type="jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem:32" id="2955496203774982648">
        <property name="flag:32" value="false" />
      </node>
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Constant:32" id="2955496203774982649">
        <property name="text:32" value="interface" />
      </node>
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_RefCell:32" id="2955496203774982650">
        <link role="relationDeclaration:32" targetNodeId="1.1740160309778171032:0" />
        <node role="editorComponent:32" type="jetbrains.mps.lang.editor.structure.InlineEditorComponent:32" id="2955496203774982651">
          <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Property:32" id="2955496203774982652">
            <property name="readOnly:32" value="true" />
            <link role="relationDeclaration:32" targetNodeId="2v.1169194664001:0" resolveInfo="name" />
          </node>
        </node>
      </node>
      <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Horizontal:32" id="2955496203774982653" />
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Constant:32" id="2955496203774982654">
        <property name="text:32" value="implementation" />
      </node>
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_RefCell:32" id="2955496203774982655">
        <link role="relationDeclaration:32" targetNodeId="1.1740160309778171033:0" />
        <node role="editorComponent:32" type="jetbrains.mps.lang.editor.structure.InlineEditorComponent:32" id="2955496203774982656">
          <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Property:32" id="2955496203774982657">
            <property name="readOnly:32" value="true" />
            <link role="relationDeclaration:32" targetNodeId="2v.1169194664001:0" resolveInfo="name" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration:32" id="6121364846593555971">
    <property name="virtualPackage:32" value="elements.containers" />
    <link role="conceptDeclaration:32" targetNodeId="1.1740160309778208723:0" resolveInfo="Extensions" />
    <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Collection:32" id="6121364846593555973">
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Component:32" id="6121364846593555976">
        <link role="editorComponent:32" targetNodeId="1740160309778213296" resolveInfo="ConfigurationXmlNode_Header" />
      </node>
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Collection:32" id="6121364846593555978">
        <node role="styleItem:32" type="jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem:32" id="6121364846593555979">
          <property name="flag:32" value="false" />
        </node>
        <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Indent:32" id="6121364846593555982" />
        <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_RefNodeList:32" id="6121364846593556001">
          <link role="relationDeclaration:32" targetNodeId="1.1740160309778170996:0" />
          <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_VerticalGrid:32" id="2955496203774766501" />
        </node>
        <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Horizontal:32" id="6121364846593555981" />
      </node>
      <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Vertical:32" id="6121364846593555975" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration:32" id="6121364846593753609">
    <property name="virtualPackage:32" value="elements.extensions" />
    <link role="conceptDeclaration:32" targetNodeId="1.1740160309778171016:0" resolveInfo="Service" />
    <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Collection:32" id="2955496203774769116">
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_ReadOnlyModelAccessor:32" id="2955496203774769117">
        <node role="modelAccessor:32" type="jetbrains.mps.lang.editor.structure.ReadOnlyModelAccessor:32" id="2955496203774769118">
          <node role="getter:32" type="jetbrains.mps.lang.editor.structure.QueryFunction_ModelAccess_Getter:32" id="2955496203774769119">
            <node role="body:32" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="2955496203774769120">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="2955496203774769121">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="2955496203774769122">
                  <node role="operand:3" type="jetbrains.mps.lang.editor.structure.ConceptFunctionParameter_node:32" id="2955496203774769123" />
                  <node role="operation:3" type="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall:16" id="2955496203774769124">
                    <link role="baseMethodDeclaration:16" targetNodeId="3v.6121364846593753707" resolveInfo="name" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Collection:32" id="3793993770298338254">
        <node role="styleItem:32" type="jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem:32" id="3793993770298338255">
          <property name="flag:32" value="false" />
        </node>
        <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Indent:32" id="3793993770298338257" />
        <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Constant:32" id="2955496203774769126">
          <property name="text:32" value="serviceInterface:" />
        </node>
        <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_RefCell:32" id="2955496203774769127">
          <link role="relationDeclaration:32" targetNodeId="1.1740160309778171028:0" />
          <node role="editorComponent:32" type="jetbrains.mps.lang.editor.structure.InlineEditorComponent:32" id="2955496203774769128">
            <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Property:32" id="2955496203774769129">
              <property name="readOnly:32" value="true" />
              <link role="relationDeclaration:32" targetNodeId="2v.1169194664001:0" resolveInfo="name" />
            </node>
          </node>
        </node>
        <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Constant:32" id="2955496203774769131">
          <property name="text:32" value="serviceImplementation:" />
        </node>
        <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_RefCell:32" id="2955496203774769132">
          <link role="relationDeclaration:32" targetNodeId="1.1740160309778171029:0" />
          <node role="editorComponent:32" type="jetbrains.mps.lang.editor.structure.InlineEditorComponent:32" id="2955496203774769133">
            <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Property:32" id="2955496203774769134">
              <property name="readOnly:32" value="true" />
              <link role="relationDeclaration:32" targetNodeId="2v.1169194664001:0" resolveInfo="name" />
            </node>
          </node>
        </node>
      </node>
      <node role="styleItem:32" type="jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem:32" id="2955496203774769125">
        <property name="flag:32" value="false" />
      </node>
      <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Horizontal:32" id="2955496203774769130" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration:32" id="6121364846593763600">
    <property name="virtualPackage:32" value="elements.extensions" />
    <link role="conceptDeclaration:32" targetNodeId="1.5314521579133239121:0" resolveInfo="Extension" />
    <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Collection:32" id="6121364846593763602">
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_RefCell:32" id="6121364846593763641">
        <link role="relationDeclaration:32" targetNodeId="1.6121364846593763607:0" />
        <node role="editorComponent:32" type="jetbrains.mps.lang.editor.structure.InlineEditorComponent:32" id="6121364846593763642">
          <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Property:32" id="6121364846593763644">
            <property name="readOnly:32" value="true" />
            <link role="relationDeclaration:32" targetNodeId="2v.1169194664001:0" resolveInfo="name" />
          </node>
        </node>
      </node>
      <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Vertical:32" id="6121364846593763604" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.editor.structure.EditorComponentDeclaration:32" id="6121364846593763646">
    <property name="virtualPackage:32" value="elements.extensions" />
    <property name="name:32" value="Extension_name" />
    <link role="conceptDeclaration:32" targetNodeId="1.5314521579133239121:0" resolveInfo="Extension" />
    <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Collection:32" id="6121364846593763648">
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_RefCell:32" id="6121364846593763651">
        <link role="relationDeclaration:32" targetNodeId="1.6121364846593763607:0" />
        <node role="editorComponent:32" type="jetbrains.mps.lang.editor.structure.InlineEditorComponent:32" id="6121364846593763652">
          <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Property:32" id="6121364846593763654">
            <property name="readOnly:32" value="true" />
            <link role="relationDeclaration:32" targetNodeId="2v.1169194664001:0" resolveInfo="name" />
          </node>
        </node>
      </node>
      <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Horizontal:32" id="6121364846593763650" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration:32" id="6121364846593763658">
    <property name="virtualPackage:32" value="elements.extensions" />
    <link role="conceptDeclaration:32" targetNodeId="1.6121364846593763655:0" resolveInfo="BeanExtension" />
    <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Collection:32" id="6121364846593763660">
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_RefCell:32" id="7161354651095722352">
        <link role="relationDeclaration:32" targetNodeId="1.6121364846593763657:0" />
        <node role="editorComponent:32" type="jetbrains.mps.lang.editor.structure.InlineEditorComponent:32" id="7161354651095722353">
          <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Property:32" id="7161354651095722355">
            <property name="readOnly:32" value="true" />
            <link role="relationDeclaration:32" targetNodeId="2v.1169194664001:0" resolveInfo="name" />
          </node>
        </node>
      </node>
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_RefNodeList:32" id="6121364846593790780">
        <link role="relationDeclaration:32" targetNodeId="1.6121364846593790725:0" />
        <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Indent:32" id="6121364846593790782" />
      </node>
      <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Horizontal:32" id="3793993770298337757" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration:32" id="6121364846593790703">
    <property name="virtualPackage:32" value="elements.extensions" />
    <link role="conceptDeclaration:32" targetNodeId="1.6121364846593790701:0" resolveInfo="InterfaceExtension" />
    <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Collection:32" id="3793993770298337177">
      <node role="styleItem:32" type="jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem:32" id="3793993770298337178">
        <property name="flag:32" value="false" />
      </node>
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_RefCell:32" id="3793993770298337179">
        <link role="relationDeclaration:32" targetNodeId="1.6121364846593790702:0" />
        <node role="editorComponent:32" type="jetbrains.mps.lang.editor.structure.InlineEditorComponent:32" id="3793993770298337180">
          <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Property:32" id="3793993770298337181">
            <property name="readOnly:32" value="true" />
            <link role="relationDeclaration:32" targetNodeId="2v.1169194664001:0" resolveInfo="name" />
          </node>
        </node>
      </node>
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Collection:32" id="3793993770298338996">
        <node role="styleItem:32" type="jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem:32" id="3793993770298338997">
          <property name="flag:32" value="false" />
        </node>
        <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Indent:32" id="3793993770298338999" />
        <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Constant:32" id="3793993770298337183">
          <property name="text:32" value="implementation:" />
        </node>
        <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_RefCell:32" id="3793993770298337184">
          <link role="relationDeclaration:32" targetNodeId="1.7161354651095889473:0" />
          <node role="editorComponent:32" type="jetbrains.mps.lang.editor.structure.InlineEditorComponent:32" id="3793993770298337185">
            <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Property:32" id="3793993770298337186">
              <property name="readOnly:32" value="true" />
              <link role="relationDeclaration:32" targetNodeId="2v.1169194664001:0" resolveInfo="name" />
            </node>
          </node>
        </node>
      </node>
      <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Horizontal:32" id="3793993770298337182" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration:32" id="6121364846593790783">
    <property name="virtualPackage:32" value="elements.extensions" />
    <link role="conceptDeclaration:32" targetNodeId="1.6121364846593790726:0" resolveInfo="BeanExtensionAttribute" />
    <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Collection:32" id="6121364846593790785">
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Property:32" id="6121364846593790788">
        <link role="relationDeclaration:32" targetNodeId="2v.1169194664001:0" resolveInfo="name" />
      </node>
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Constant:32" id="6121364846593790790">
        <property name="text:32" value="=" />
      </node>
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Property:32" id="6121364846593790794">
        <link role="relationDeclaration:32" targetNodeId="1.6121364846593790729:0" resolveInfo="value" />
      </node>
      <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Horizontal:32" id="6121364846593790787" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration:32" id="6121364846593814063">
    <property name="virtualPackage:32" value="elements.containers" />
    <link role="conceptDeclaration:32" targetNodeId="1.7130790807395857422:0" resolveInfo="ExtensionPoints" />
    <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Collection:32" id="6121364846593814065">
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Component:32" id="6121364846593814068">
        <link role="editorComponent:32" targetNodeId="1740160309778213296" resolveInfo="ConfigurationXmlNode_Header" />
      </node>
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Collection:32" id="6121364846593814070">
        <node role="styleItem:32" type="jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem:32" id="6121364846593814071">
          <property name="flag:32" value="false" />
        </node>
        <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Indent:32" id="6121364846593814074" />
        <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_RefNodeList:32" id="6121364846593814082">
          <link role="relationDeclaration:32" targetNodeId="1.1740160309778170996:0" />
          <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_VerticalGrid:32" id="2955496203774753013" />
        </node>
        <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Horizontal:32" id="6121364846593814073" />
      </node>
      <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Vertical:32" id="6121364846593814067" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration:32" id="6618365175184753250">
    <property name="virtualPackage:32" value="elements.extensionPoints" />
    <link role="conceptDeclaration:32" targetNodeId="1.1740160309778171006:0" resolveInfo="BeanExtensionPoint" />
    <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Collection:32" id="6618365175184753252">
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Property:32" id="6618365175184970726">
        <link role="relationDeclaration:32" targetNodeId="2v.1169194664001:0" resolveInfo="name" />
      </node>
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Constant:32" id="6618365175184884784">
        <property name="text:32" value="beanClass=" />
      </node>
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_RefCell:32" id="6618365175184753257">
        <link role="relationDeclaration:32" targetNodeId="1.1740160309778171025:0" />
        <node role="editorComponent:32" type="jetbrains.mps.lang.editor.structure.InlineEditorComponent:32" id="6618365175184753258">
          <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Property:32" id="6618365175184753260">
            <property name="readOnly:32" value="true" />
            <link role="relationDeclaration:32" targetNodeId="2v.1169194664001:0" resolveInfo="name" />
          </node>
        </node>
      </node>
      <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Horizontal:32" id="6618365175184753254" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration:32" id="6618365175184935114">
    <property name="virtualPackage:32" value="elements.extensionPoints" />
    <link role="conceptDeclaration:32" targetNodeId="1.1740160309778171007:0" resolveInfo="IntefaceExtensionPoint" />
    <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Collection:32" id="6618365175184935116">
      <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Horizontal:32" id="6618365175184935118" />
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Property:32" id="7161354651095860397">
        <link role="relationDeclaration:32" targetNodeId="2v.1169194664001:0" resolveInfo="name" />
      </node>
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Constant:32" id="6618365175184935122">
        <property name="text:32" value="interface=" />
      </node>
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_RefCell:32" id="6618365175184935124">
        <link role="relationDeclaration:32" targetNodeId="1.1740160309778171026:0" />
        <node role="editorComponent:32" type="jetbrains.mps.lang.editor.structure.InlineEditorComponent:32" id="6618365175184935125">
          <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Property:32" id="6618365175184935127">
            <property name="readOnly:32" value="true" />
            <link role="relationDeclaration:32" targetNodeId="2v.1169194664001:0" resolveInfo="name" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration:32" id="5522969664585014982">
    <property name="virtualPackage:32" value="elements" />
    <link role="conceptDeclaration:32" targetNodeId="1.5522969664585014978:0" resolveInfo="Components" />
    <node role="cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Collection:32" id="5522969664585014984">
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Component:32" id="5522969664585014985">
        <link role="editorComponent:32" targetNodeId="1740160309778213296" resolveInfo="ConfigurationXmlNode_Header" />
      </node>
      <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Collection:32" id="5522969664585014986">
        <node role="styleItem:32" type="jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem:32" id="5522969664585014987">
          <property name="flag:32" value="false" />
        </node>
        <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Indent:32" id="5522969664585014988" />
        <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Horizontal:32" id="5522969664585014989" />
        <node role="childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_RefNodeList:32" id="5522969664585014990">
          <link role="relationDeclaration:32" targetNodeId="1.5522969664585014980:0" />
          <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Vertical:32" id="2955496203774982637" />
        </node>
      </node>
      <node role="cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Vertical:32" id="5522969664585014992" />
    </node>
  </node>
</model>


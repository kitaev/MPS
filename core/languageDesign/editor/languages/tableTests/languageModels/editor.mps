<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:7c11bd8b-19a5-4d34-b98b-933031eac331(jetbrains.mps.lang.editor.tableTests.editor)">
  <persistence version="6" />
  <language namespace="48c3e946-6e2c-44cd-9882-eada7feeac68(jetbrains.mps.lang.editor.tableTests)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="0272d3b4-4cc8-481e-9e2f-07793fbfcb41(jetbrains.mps.lang.editor.table)" />
  <devkit namespace="e073aac8-8c71-4c23-be71-86bf7a6df0a2(jetbrains.mps.devkit.bootstrap-languages)" />
  <import index="1" modelUID="r:129d7ce0-d484-44f5-af4b-5ca6f3d19cba(jetbrains.mps.lang.editor.tableTests.structure)" version="-1" />
  <import index="5" modelUID="r:b60215f1-3d3e-41cc-8321-723ef8eb59dd(jetbrains.mps.lang.editor.table.runtime)" version="-1" />
  <import index="2" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="3" modelUID="r:00000000-0000-4000-0000-011c8959029e(jetbrains.mps.lang.editor.structure)" version="32" implicit="yes" />
  <import index="4" modelUID="r:2ae43476-98ce-4354-9a55-d7b44e372d64(jetbrains.mps.lang.editor.table.structure)" version="0" implicit="yes" />
  <root_stubs>
    <node type="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration:32" id="2253133157537017839">
      <property name="2.virtualPackage:0" value="matrix" />
      <link role="3.conceptDeclaration:32" targetNodeId="1.100731542480281057" resolveInfo="Table" />
    </node>
    <node type="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration:32" id="5561556180861832418">
      <property name="2.virtualPackage:0" value="matrix" />
      <link role="3.conceptDeclaration:32" targetNodeId="1.100731542480281058" resolveInfo="DataCell_" />
    </node>
  </root_stubs>
  <node type="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration:32" id="2253133157537017839">
    <property name="2.virtualPackage:0" value="matrix" />
    <link role="3.conceptDeclaration:32" targetNodeId="1.100731542480281057" resolveInfo="Table" />
    <node role="3.cellModel:32" type="jetbrains.mps.lang.editor.table.structure.CellModel_HierarchycalTable:0" id="6216065619544954181">
      <link role="4.headerRowLinkDeclaration:0" targetNodeId="1.100731542480281062" />
      <link role="4.rowsLinkDeclaration:0" targetNodeId="1.100731542480281063" />
      <link role="4.cellsInRowLinkDeclaration:0" targetNodeId="1.100731542480281061" />
    </node>
  </node>
  <node type="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration:32" id="5561556180861832418">
    <property name="2.virtualPackage:0" value="matrix" />
    <link role="3.conceptDeclaration:32" targetNodeId="1.100731542480281058" resolveInfo="DataCell_" />
    <node role="3.cellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Collection:32" id="5561556180861832420">
      <node role="3.childCellModel:32" type="jetbrains.mps.lang.editor.structure.CellModel_Property:32" id="5561556180861832423">
        <link role="3.relationDeclaration:32" targetNodeId="1.100731542480281059" resolveInfo="value" />
      </node>
      <node role="3.cellLayout:32" type="jetbrains.mps.lang.editor.structure.CellLayout_Horizontal:32" id="5561556180861832422" />
    </node>
  </node>
</model>


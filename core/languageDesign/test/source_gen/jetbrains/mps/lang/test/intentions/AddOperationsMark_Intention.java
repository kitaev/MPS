/*
 * Copyright 2003-2008 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.lang.test.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.test.behavior.NodesTestCase_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.AttributesRolesUtil;

public class AddOperationsMark_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.lang.core.structure.BaseConcept";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Add Test Operations Annotation";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return NodesTestCase_Behavior.isIntentionApplicable_1217250498008(node);
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode newAnootation = SConceptOperations.createNewNode("jetbrains.mps.lang.test.structure.NodeOperationsContainer", null);
    SLinkOperations.setTarget(node, AttributesRolesUtil.childRoleFromAttributeRole("nodeOpraretionsMark"), newAnootation, true);
    editorContext.select(newAnootation);
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.test.intentions";
  }

}

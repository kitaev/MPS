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
package jetbrains.mps.vcs.diff.changes;

import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.project.GlobalScope;

public class AddNodeChange extends NewNodeChange {

  private SNodeId myPreviousNode;

  public AddNodeChange(String nodeType, SNodeId nodeId, String role, SNodeId parentId, SNodeId prevNode) {
    super(nodeType, nodeId, role, parentId);
    myPreviousNode = prevNode;
  }


  public SNodeId getPreviousNode() {
    return myPreviousNode;
  }

  public String toString() {
    return "add node  " + getNodeId() + " in role " + getNodeRole() + " before " + getPreviousNode();
  }

  public boolean apply(SModel m) {
    SNode parent = m.getNodeById(getNodeParent());
    if (parent == null) {
      return false;
    }

    SNodeId prevNode = getPreviousNode();
    SNode prev = null;
    if (prevNode != null) {
      prev = m.getNodeById(prevNode);
    }

    SNode n = SModelUtil_new.instantiateConceptDeclaration(getConceptFqName(), m, GlobalScope.getInstance(), false);
    assert n != null;
    n.setId(getNodeId());
    
    parent.insertChild(prev, getNodeRole(), n);
    return true;
  }

}

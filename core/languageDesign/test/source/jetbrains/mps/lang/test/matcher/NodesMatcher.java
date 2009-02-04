/*
 * Copyright 2003-2009 JetBrains s.r.o.
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
package jetbrains.mps.lang.test.matcher;

import jetbrains.mps.smodel.SNode;

import java.util.*;

public class NodesMatcher {

  public static NodeDifference matchNodes(SNode a, SNode b) {
    ArrayList<SNode> aList = new ArrayList<SNode>();
    aList.add(a);
    ArrayList<SNode> bList = new ArrayList<SNode>();
    bList.add(b);
    ArrayList<NodeDifference> diffs = matchNodes(aList, bList);
    if (diffs != null) {
      return diffs.get(0);
    } else {
      return null;
    }
  }

  public static ArrayList<NodeDifference> matchNodes(List<SNode> a, List<SNode> b) {
    HashMap<SNode, SNode> map = new HashMap<SNode, SNode>();
    return matchNodes(a, b, map);
  }

  public static ArrayList<NodeDifference> matchNodes(List<SNode> a, List<SNode> b, Map<SNode, SNode> map) {
    Iterator<SNode> iteratorA = a.iterator();
    Iterator<SNode> iteratorB = b.iterator();
    while (iteratorA.hasNext() && iteratorB.hasNext()) {
      match(iteratorA.next(), iteratorB.next(), map);
    }

    ArrayList<NodeDifference> ret = null;
    iteratorA = a.iterator();
    iteratorB = b.iterator();
    while (iteratorA.hasNext() && iteratorB.hasNext()) {
      NodeDifference diff = matchNodes(iteratorA.next(), iteratorB.next(), map);
      if (diff != null) {
        if (ret == null) {
          ret = new ArrayList<NodeDifference>();
        }
        ret.add(diff);
      }
    }
    return ret;
  }

  private static void match(SNode a, SNode b, Map<SNode, SNode> map) {
     if (!a.getConceptFqName().equals(b.getConceptFqName())) {
      return;
    }

    HashSet<String> roles = new HashSet<String>();
    roles.addAll(a.getChildRoles());
    roles.addAll(b.getChildRoles());
    for (String role : roles) {
      List<SNode> children1 = a.getChildren(role);
      List<SNode> children2 = b.getChildren(role);
      if (children1.size() != children2.size()) {
        continue;
      }
      for (int i = 0; i < children1.size(); i++) {
        match(children1.get(i), children2.get(i), map);
      }
    }
    
    map.put(a, b);
  }


  public static NodeDifference matchNodes(SNode a, SNode b, Map<SNode, SNode> map) {
    ArrayList<DifferanceItem> difference = new ArrayList<DifferanceItem>();
    if (matchConcepts(a, b, difference)) return new NodeDifference(a.toString(), difference);

    matchProperties(a, b, difference);
    matchChildren(a, b, map, difference);
    matchReferences(a, b, map, difference);

    if (difference.size() != 0) {
      return new NodeDifference(a.toString(), difference);
    }
    return null;
  }

  private static boolean matchConcepts(SNode a, SNode b, ArrayList<DifferanceItem> difference) {
    if (!a.getConceptFqName().equals(b.getConceptFqName())) {
      difference.add(new ConceptDifference(a.getConceptFqName(), b.getConceptFqName()));
      return true;
    }
    return false;
  }

  private static void matchReferences(SNode a, SNode b, Map<SNode, SNode> map, ArrayList<DifferanceItem> difference) {
    HashSet<String> roles = new HashSet<String>();
    roles.addAll(a.getReferenceRoles());
    roles.addAll(b.getReferenceRoles());
    for (String role: roles) {
      SNode reference1 = null;
      if (a.getReference(role) != null) {
        reference1 = a.getReference(role).getTargetNode();
      }
      SNode reference2 = null;
      if (b.getReference(role) != null) {
        reference2 = b.getReference(role).getTargetNode();
      }

      if (map.containsKey(reference1)) {
        if (map.get(reference1) != reference2) {
          difference.add(new ReferenceDifferense(role, true));
        }
      } else {
        if (reference1 != reference2) {
          difference.add(new ReferenceDifferense(role, false));
        }
      }
    }
  }

  private static void matchChildren(SNode a, SNode b, Map<SNode, SNode> map, ArrayList<DifferanceItem> difference) {
    HashSet<String> roles = new HashSet<String>();
    roles.addAll(a.getChildRoles());
    roles.addAll(b.getChildRoles());
    for (String role: roles) {
      List<SNode> children1 = a.getChildren(role);
      List<SNode> children2 = b.getChildren(role);
      if (children1.size() != children2.size()) {
        difference.add(new ChildrenCountDifference(role, children1.size(), children2.size()));
        continue;
      }
      for (int i = 0; i < children1.size(); i++) {
        NodeDifference d = matchNodes(children1.get(i), children2.get(i), map);
        if (d != null) {
          difference.add(d);
        }
      }
    }
  }

  private static void matchProperties(SNode a, SNode b, ArrayList<DifferanceItem> difference) {
    HashSet<String> propertes = new HashSet<String>();
    propertes.addAll(a.getPropertyNames());
    propertes.addAll(b.getPropertyNames());
    for (String key: propertes) {
      String p1 = a.getProperties().get(key);
      String p2 = b.getProperties().get(key);
      if (p1 == null || p2 == null || !p1.equals(p2)) {
        difference.add(new PropertyDifferense(key));
      }
    }
  }

}

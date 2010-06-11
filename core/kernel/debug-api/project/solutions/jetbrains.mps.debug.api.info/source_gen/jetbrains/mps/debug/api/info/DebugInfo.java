package jetbrains.mps.debug.api.info;

/*Generated by MPS */

import jetbrains.mps.smodel.SModel;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import org.apache.commons.lang.ObjectUtils;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.Set;
import org.jdom.Element;
import java.util.Arrays;
import org.jdom.DataConversionException;

public class DebugInfo {
  private static final String ROOT = "root";
  private static final String DEBUG_INFO = "debugInfo";
  private static final String ROOT_ID_ATTR = "nodeId";
  private static final String UNSPECIFIED_ROOT = "";

  private SModel myModel;
  private Map<String, DebugInfoRoot> myRoots = MapSequence.fromMap(new HashMap<String, DebugInfoRoot>());

  public DebugInfo() {
  }

  public SModel getModel() {
    return this.myModel;
  }

  public void setModel(SModel model) {
    this.myModel = model;
  }

  public void addPosition(PositionInfo position, String rootId) {
    if (rootId == null) {
      rootId = UNSPECIFIED_ROOT;
    }
    DebugInfoRoot infoRoot = MapSequence.fromMap(myRoots).get(rootId);
    if (infoRoot == null) {
      infoRoot = new DebugInfoRoot(rootId);
      MapSequence.fromMap(myRoots).put(rootId, infoRoot);
    }
    infoRoot.addPosition(position);
  }

  public void addScopePosition(ScopePositionInfo position, String rootId) {
    if (rootId == null) {
      rootId = UNSPECIFIED_ROOT;
    }
    DebugInfoRoot infoRoot = MapSequence.fromMap(myRoots).get(rootId);
    if (infoRoot == null) {
      infoRoot = new DebugInfoRoot(rootId);
      MapSequence.fromMap(myRoots).put(rootId, infoRoot);
    }
    infoRoot.addScopePosition(position);
  }

  public void addUnitPosition(UnitPositionInfo unitPosition, String rootId) {
    if (rootId == null) {
      rootId = UNSPECIFIED_ROOT;
    }
    DebugInfoRoot infoRoot = MapSequence.fromMap(myRoots).get(rootId);
    if (infoRoot == null) {
      infoRoot = new DebugInfoRoot(rootId);
      MapSequence.fromMap(myRoots).put(rootId, infoRoot);
    }
    infoRoot.addUnitPosition(unitPosition);
  }

  public DebugInfoRoot getRootInfo(String rootId) {
    return MapSequence.fromMap(myRoots).get((rootId == null ?
      UNSPECIFIED_ROOT :
      rootId
    ));
  }

  public void replaceRoot(DebugInfoRoot root) {
    MapSequence.fromMap(myRoots).put(root.getRootId(), root);
  }

  public List<SNode> getNodesForLine(String str, SModel model) {
    List<SNode> result = new ArrayList<SNode>();
    for (PositionInfo element : Sequence.fromIterable(MapSequence.fromMap(myRoots).values()).translate(new ITranslator2<DebugInfoRoot, PositionInfo>() {
      public Iterable<PositionInfo> translate(DebugInfoRoot it) {
        return it.getPositions();
      }
    })) {
      if (ObjectUtils.equals(element.getFileAndLine(), str)) {
        String nodeId = element.getNodeId();
        SNode node = model.getNodeById(nodeId);
        ListSequence.fromList(result).addElement(node);
      }
    }
    return result;
  }

  public SNode getNodeForLine(String file, int line, SModel model) {
    List<PositionInfo> resultList = ListSequence.fromList(new ArrayList<PositionInfo>());
    for (PositionInfo element : Sequence.fromIterable(MapSequence.fromMap(myRoots).values()).translate(new ITranslator2<DebugInfoRoot, PositionInfo>() {
      public Iterable<PositionInfo> translate(DebugInfoRoot it) {
        return it.getPositions();
      }
    })) {
      if (ObjectUtils.equals(element.getFileName(), file) && element.getStartLine() <= line && line <= element.getEndLine()) {
        ListSequence.fromList(resultList).addElement(element);
      }
    }
    if (ListSequence.fromList(resultList).isEmpty()) {
      return null;
    }
    Iterable<PositionInfo> sorted = ListSequence.fromList(resultList).sort(new ISelector<PositionInfo, Comparable<?>>() {
      public Comparable<?> select(PositionInfo it) {
        return it;
      }
    }, true);
    final PositionInfo firstPositionInfo = Sequence.fromIterable(sorted).first();
    String nodeId = firstPositionInfo.getNodeId();
    // here we do some magic to fix the following bug: 
    // each node in base language owns a '\n' symbol in a previous line 
    // in the following code we will never get 'for' node quering line 1: 
    // 1.  for (...) { 
    // 2.    some statement 
    // 3.  } 
    // since 'some statement' takes lines 1-2 instead of just line 2 
    // TODO actually, this mega-hack might not work for other languages 
    // we should seriously consider fixing debug info generation instead 
    if (Sequence.fromIterable(sorted).count() > 1 && firstPositionInfo.getStartLine() == line && firstPositionInfo.getLineDistance() > 0) {
      nodeId = ListSequence.fromList(Sequence.fromIterable(sorted).toListSequence()).getElement(1).getNodeId();
    }
    // here we have another example of how not to write code 
    // this is a hack fixing MPS-8644 
    // the problem is with the BlockStatement which sometimes generates to nothing, but is still present in .debug 
    // so in the code like this: 
    // 1. { 
    // 2. statement 
    // 3. } 
    // block statement occupy the same place as "statement" because this code generates into: 
    // 1. statement 
    // the solution is simple: 
    // among all node with same position we select the deepest 
    if (Sequence.fromIterable(sorted).count() > 1) {
      Iterable<PositionInfo> sameSpacePositions = Sequence.fromIterable(sorted).where(new IWhereFilter<PositionInfo>() {
        public boolean accept(PositionInfo it) {
          return firstPositionInfo.isOccupyTheSameSpace(it);
        }
      });
      if (Sequence.fromIterable(sameSpacePositions).count() > 1) {
        SNode currentNode = model.getNodeById(firstPositionInfo.getNodeId());
        boolean finished = false;
        while (!(finished)) {
          finished = true;
          for (PositionInfo otherPos : Sequence.fromIterable(sameSpacePositions)) {
            SNode otherNode = model.getNodeById(otherPos.getNodeId());
            if ((otherNode != null) && otherNode.isDescendantOf(currentNode, false)) {
              currentNode = otherNode;
              finished = false;
              break;
            }
          }
        }
        return currentNode;
      }
    }
    // TODO seriously, instead of adding another hack do something with textgen 
    return model.getNodeById(nodeId);
  }

  public SNode getVarForLine(String file, int line, SModel model, String varName) {
    List<ScopePositionInfo> resultList = ListSequence.fromList(new ArrayList<ScopePositionInfo>());
    for (ScopePositionInfo element : Sequence.fromIterable(MapSequence.fromMap(myRoots).values()).translate(new ITranslator2<DebugInfoRoot, ScopePositionInfo>() {
      public Iterable<ScopePositionInfo> translate(DebugInfoRoot it) {
        return it.getScopePositions();
      }
    })) {
      if (ObjectUtils.equals(element.getFileName(), file) && element.getStartLine() <= line && line <= element.getEndLine()) {
        ListSequence.fromList(resultList).addElement(element);
      }
    }
    if (ListSequence.fromList(resultList).isEmpty()) {
      return null;
    }
    Iterable<ScopePositionInfo> sorted = ListSequence.fromList(resultList).sort(new ISelector<ScopePositionInfo, Comparable<?>>() {
      public Comparable<?> select(ScopePositionInfo it) {
        return it;
      }
    }, true);
    for (ScopePositionInfo info : sorted) {
      SNode var = info.getVarNode(varName, model);
      if (var != null) {
        return var;
      }
    }
    return null;
  }

  public PositionInfo getPositionForNode(String nodeId) {
    for (PositionInfo element : Sequence.fromIterable(MapSequence.fromMap(myRoots).values()).translate(new ITranslator2<DebugInfoRoot, PositionInfo>() {
      public Iterable<PositionInfo> translate(DebugInfoRoot it) {
        return it.getPositions();
      }
    })) {
      if (ObjectUtils.equals(element.getNodeId(), nodeId)) {
        return element;
      }
    }
    return null;
  }

  public String getUnitNameForLine(String file, int line) {
    // TODO duplication! 
    List<UnitPositionInfo> resultList = ListSequence.fromList(new ArrayList<UnitPositionInfo>());
    for (UnitPositionInfo element : Sequence.fromIterable(MapSequence.fromMap(myRoots).values()).translate(new ITranslator2<DebugInfoRoot, UnitPositionInfo>() {
      public Iterable<UnitPositionInfo> translate(DebugInfoRoot it) {
        return it.getUnitPositions();
      }
    })) {
      if (ObjectUtils.equals(element.getFileName(), file) && element.getStartLine() <= line && line <= element.getEndLine()) {
        ListSequence.fromList(resultList).addElement(element);
      }
    }
    if (ListSequence.fromList(resultList).isEmpty()) {
      return null;
    }
    Iterable<UnitPositionInfo> sorted = ListSequence.fromList(resultList).sort(new ISelector<UnitPositionInfo, Comparable<?>>() {
      public Comparable<?> select(UnitPositionInfo it) {
        return it;
      }
    }, true);
    UnitPositionInfo firstPositionInfo = Sequence.fromIterable(sorted).first();
    return firstPositionInfo.getUnitName();
  }

  public SNode getUnitNodeForLine(String file, int line, SModel model) {
    // TODO second duplication! 
    List<UnitPositionInfo> resultList = ListSequence.fromList(new ArrayList<UnitPositionInfo>());
    for (UnitPositionInfo element : Sequence.fromIterable(MapSequence.fromMap(myRoots).values()).translate(new ITranslator2<DebugInfoRoot, UnitPositionInfo>() {
      public Iterable<UnitPositionInfo> translate(DebugInfoRoot it) {
        return it.getUnitPositions();
      }
    })) {
      if (ObjectUtils.equals(element.getFileName(), file) && element.getStartLine() <= line && line <= element.getEndLine()) {
        ListSequence.fromList(resultList).addElement(element);
      }
    }
    if (ListSequence.fromList(resultList).isEmpty()) {
      return null;
    }
    Iterable<UnitPositionInfo> sorted = ListSequence.fromList(resultList).sort(new ISelector<UnitPositionInfo, Comparable<?>>() {
      public Comparable<?> select(UnitPositionInfo it) {
        return it;
      }
    }, false);
    UnitPositionInfo firstPositionInfo = Sequence.fromIterable(sorted).first();
    return model.getNodeById(firstPositionInfo.getNodeId());
  }

  public List<String> getRoots() {
    return SetSequence.fromSet(MapSequence.fromMap(this.myRoots).keySet()).toListSequence();
  }

  public Set<PositionInfo> getPositions(String rootId) {
    DebugInfoRoot infoRoot = MapSequence.fromMap(this.myRoots).get(rootId);
    return (infoRoot != null ?
      infoRoot.getPositions() :
      null
    );
  }

  public Element toXml() {
    Element root = new Element(DEBUG_INFO);
    if (myRoots != null) {
      String[] roots = SetSequence.fromSet(MapSequence.fromMap(myRoots).keySet()).toGenericArray(String.class);
      Arrays.sort(roots);
      for (String id : roots) {
        DebugInfoRoot dir = MapSequence.fromMap(myRoots).get(id);
        if (id.equals(UNSPECIFIED_ROOT)) {
          dir.toXml(root);
        } else {
          Element e = new Element(ROOT);
          e.setAttribute(ROOT_ID_ATTR, id);
          dir.toXml(e);
          root.addContent(e);
        }
      }
    }
    return root;
  }

  public static DebugInfo fromXml(Element root) {
    DebugInfo info = new DebugInfo();
    try {
      DebugInfoRoot unspecified = DebugInfoRoot.fromXml(root, UNSPECIFIED_ROOT);
      if (unspecified != null) {
        MapSequence.fromMap(info.myRoots).put(UNSPECIFIED_ROOT, unspecified);
      }

      for (Element re : ((List<Element>) root.getChildren(ROOT))) {
        String rootId = re.getAttributeValue(ROOT_ID_ATTR);
        MapSequence.fromMap(info.myRoots).put(rootId, DebugInfoRoot.fromXml(re, rootId));
      }
    } catch (DataConversionException e) {
      throw new RuntimeException(e);
    }
    return info;
  }
}

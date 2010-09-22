package jetbrains.mps.debug.api.info;

/*Generated by MPS */

import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.vfs.IFile;
import org.jdom.DataConversionException;
import org.jdom.Element;

import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DebugInfoRoot {
  private static final String NODE_INFO = "nodeInfo";
  private static final String VAR_INFO = "varInfo";
  private static final String SCOPE_INFO = "scopeInfo";
  private static final String UNIT_INFO = "unitInfo";
  private static Logger LOG = Logger.getLogger(DebugInfoRoot.class);

  private String myRootId;
  private Set<PositionInfo> myPositions;
  private Set<ScopePositionInfo> myScopePositions;
  private Set<UnitPositionInfo> myUnitPositions;

  public DebugInfoRoot(String rootId) {
    this.myRootId = rootId;
  }

  public void addPosition(PositionInfo position) {
    if (myPositions == null) {
      myPositions = SetSequence.fromSet(new TreeSet<PositionInfo>());
    }
    SetSequence.fromSet(myPositions).addElement(position);
  }

  public void addScopePosition(ScopePositionInfo position) {
    if (myScopePositions == null) {
      myScopePositions = SetSequence.fromSet(new TreeSet<ScopePositionInfo>());
    }
    SetSequence.fromSet(myScopePositions).addElement(position);
  }

  public void addUnitPosition(UnitPositionInfo unitPosition) {
    if (myUnitPositions == null) {
      myUnitPositions = SetSequence.fromSet(new TreeSet<UnitPositionInfo>());
    }
    SetSequence.fromSet(myUnitPositions).addElement(unitPosition);
  }

  public String getRootId() {
    return this.myRootId;
  }

  public Set<PositionInfo> getPositions() {
    return this.myPositions;
  }

  public Set<ScopePositionInfo> getScopePositions() {
    return this.myScopePositions;
  }

  public Set<UnitPositionInfo> getUnitPositions() {
    return this.myUnitPositions;
  }

  public void toXml(Element container) {
    if (myPositions != null) {
      for (PositionInfo position : myPositions) {
        Element e = new Element(NODE_INFO);
        position.saveTo(e);
        container.addContent(e);
      }
    }
    if (myScopePositions != null) {
      for (ScopePositionInfo position : myScopePositions) {
        Element e = new Element(SCOPE_INFO);
        position.saveTo(e);
        container.addContent(e);
      }
    }
    if (myUnitPositions != null) {
      for (UnitPositionInfo position : myUnitPositions) {
        Element e = new Element(UNIT_INFO);
        position.saveTo(e);
        container.addContent(e);
      }
    }
  }

  public static DebugInfoRoot fromXml(Element element, String id) throws DataConversionException {
    Element root = element;
    DebugInfoRoot result = new DebugInfoRoot(id);
    for (Element e : ((List<Element>) root.getChildren(NODE_INFO))) {
      result.addPosition(new PositionInfo(e));
    }
    for (Element e : ((List<Element>) root.getChildren(SCOPE_INFO))) {
      result.addScopePosition(new ScopePositionInfo(e));
    }
    for (Element e : ((List<Element>) root.getChildren(UNIT_INFO))) {
      result.addUnitPosition(new UnitPositionInfo(e));
    }
    return result;
  }

  public static IFile getDebugFileOfModel(String outputDir, SModelDescriptor model) {
    String modelName = NameUtil.pathFromNamespace(model.getLongName());
    String debugPath = modelName.substring(0, modelName.length()) + File.separator + ".debug";
    return FileSystem.getInstance().getFileByPath(outputDir + File.separator + debugPath);
  }
}

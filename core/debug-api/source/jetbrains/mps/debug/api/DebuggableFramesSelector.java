package jetbrains.mps.debug.api;

import jetbrains.mps.generator.traceInfo.TraceInfoUtil;
import jetbrains.mps.debug.api.programState.ILocation;
import jetbrains.mps.debug.api.programState.IStackFrame;
import jetbrains.mps.debug.api.programState.NullLocation;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import org.apache.commons.lang.ObjectUtils;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class DebuggableFramesSelector implements IDebuggableFramesSelector {
  @Override
  public IStackFrame findDeepestDebuggableFrame(List<IStackFrame> frames) {
    for (IStackFrame frame : frames) {
      if (isDebuggableFrame(frame)) return frame;
    }
    if (frames.isEmpty()) return null;
    return frames.get(0);
  }

  @Override
  public int findDeepestDebuggableFrameIndex(List<IStackFrame> frames) {
    int index = 0;
    for (IStackFrame frame : frames) {
      if (isDebuggableFrame(frame)) return index;
      index++;
    }
    if (frames.isEmpty()) return AbstractUiState.NO_FRAME;
    return 0;
  }

  @Override
  public boolean isDebuggableFrame(@NotNull IStackFrame frame) {
    ILocation location = frame.getLocation();
    if (location instanceof NullLocation) return false;

    SNode node = TraceInfoUtil.getNode(location.getUnitName(), location.getFileName(), location.getLineNumber());
    return node != null;
  }

  @Override
  public boolean isDebuggablePosition(String unitName, String fileName, int position) {
    SNode node = TraceInfoUtil.getNode(unitName, fileName, position);
    return node != null;
  }

  @Override
  public boolean isSamePosition(String lastUnitName, String lastFileName, int lastLineNumber, int lastFrameCount, String nextUnitName, String nextFileName, int nextLineNumber, int nextFrameCount) {
    if (ObjectUtils.equals(lastUnitName, nextUnitName) && lastLineNumber == nextLineNumber && lastFrameCount == nextFrameCount) {
      return true;
    }

    SNode lastNode = TraceInfoUtil.getNode(lastUnitName, lastFileName, lastLineNumber);
    SNode nextNode = TraceInfoUtil.getNode(nextUnitName, nextFileName, nextLineNumber);
    return lastNode == nextNode;
  }
}

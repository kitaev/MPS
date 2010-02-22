package jetbrains.mps.debug;

/*Generated by MPS */

import com.intellij.execution.impl.ConsoleViewImpl;
import com.intellij.execution.ui.ConsoleViewContentType;
import com.intellij.execution.filters.Filter;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.smodel.SNode;
import com.intellij.execution.filters.HyperlinkInfo;
import com.intellij.openapi.project.Project;
import java.util.List;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModel;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.ide.DataManager;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.project.ProjectOperationContext;
import jetbrains.mps.workbench.editors.MPSEditorOpener;
import org.jetbrains.annotations.Nullable;

public class StacktraceUtil {
  private static String STRING_START = "at ";

  public static void appendStacktraceToConsole(ConsoleViewImpl consoleView, String text, ConsoleViewContentType type) {
    consoleView.print(text, type);
  }

  private static Filter.Result tryToParseLine(String line, int offset) {
    if (!(StringUtils.trim(line).startsWith(STRING_START))) {
      return null;
    }

    int start = line.indexOf(STRING_START) + STRING_START.length();
    String tmpStr = line.substring(start);
    int parenIndex = tmpStr.indexOf("(");
    if (parenIndex == -1) {
      return null;
    }

    String methodName = tmpStr.substring(0, parenIndex);
    int closingParenIndex = tmpStr.indexOf(")");
    if (closingParenIndex == -1) {
      return null;
    }

    String position = tmpStr.substring(parenIndex + 1, closingParenIndex);
    final SNode nodeToShow = getNodes(methodName, position);
    if (nodeToShow == null) {
      return null;
    }

    return new Filter.Result(start + parenIndex + 1 + offset, start + closingParenIndex + offset, new HyperlinkInfo() {
      public void navigate(Project p0) {
        StacktraceUtil.showNode(nodeToShow);
      }
    });
  }

  public static SNode getNode(String method, final String file, final int position) {
    int lastDot = method.lastIndexOf(".");
    String pkg = (lastDot == -1 ?
      "" :
      method.substring(0, lastDot)
    );
    List<SModelDescriptor> list = SModelRepository.getInstance().getModelDescriptorsByModelName(pkg);
    for (final SModelDescriptor descriptor : ListSequence.fromList(list)) {
      if (SModelStereotype.isStubModelStereotype(descriptor.getStereotype())) {
        continue;
      }

      final DebugInfo result = BLDebugInfoCache.getInstance().get(descriptor);
      if (result == null) {
        continue;
      }

      final Wrappers._T<SNode> nodeToShow = new Wrappers._T<SNode>();
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          nodeToShow.value = result.getNodeForLine(file, position, descriptor.getSModel());
        }
      });

      if (nodeToShow.value != null) {
        return nodeToShow.value;
      }
    }

    return null;
  }

  private static SNode getNodes(String stacktraceLine, String position) {
    int lastDot = stacktraceLine.lastIndexOf(".");
    String pkg = (lastDot == -1 ?
      "" :
      stacktraceLine.substring(0, lastDot)
    );
    String[] split = position.split(":");
    if (split.length >= 2) {
      return getNode(pkg, split[0], Integer.parseInt(split[1]));
    }
    return null;
  }

  public static String getGeneratedFileName(SNode node) {
    SNode snode = ((SNode) node);
    SModel model = snode.getModel();
    DebugInfo debugInfo = BLDebugInfoCache.getInstance().get(model.getModelDescriptor());
    if (debugInfo == null) {
      return null;
    }
    PositionInfo positionInfo = debugInfo.getPositionForNode(snode.getId());
    if (positionInfo == null) {
      return null;
    }
    return model.getLongName() + "." + positionInfo.getFileName();
  }

  private static void showNode(SNode node) {
    DataContext dataContext = DataManager.getInstance().getDataContext();
    MPSProject project = MPSDataKeys.MPS_PROJECT.getData(dataContext);
    ProjectOperationContext operationContext = new ProjectOperationContext(project);
    MPSEditorOpener opener = operationContext.getComponent(MPSEditorOpener.class);
    opener.editNode(node, operationContext);
  }

  public static ConsoleViewImpl createConsoleView(Project project) {
    ConsoleViewImpl result = new ConsoleViewImpl(project, false);
    result.addMessageFilter(new StacktraceUtil.StackTraceFilter());
    return result;
  }

  public static class StackTraceFilter implements Filter {
    public StackTraceFilter() {
    }

    @Nullable
    public Filter.Result applyFilter(String line, int length) {
      return tryToParseLine(line, length - line.length());
    }
  }
}

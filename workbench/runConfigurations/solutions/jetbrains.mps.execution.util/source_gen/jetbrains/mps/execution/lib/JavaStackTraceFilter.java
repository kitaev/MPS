package jetbrains.mps.execution.lib;

/*Generated by MPS */

import com.intellij.execution.filters.Filter;
import org.jetbrains.annotations.Nullable;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.traceInfo.TraceInfoUtil;
import com.intellij.execution.filters.HyperlinkInfo;
import com.intellij.openapi.project.Project;
import jetbrains.mps.project.ProjectOperationContext;
import jetbrains.mps.workbench.editors.MPSEditorOpener;

public class JavaStackTraceFilter implements Filter {
  private static String STRING_START = "at ";

  public JavaStackTraceFilter() {
  }

  @Nullable
  public Filter.Result applyFilter(String line, int length) {
    return tryToParseLine(line, length - line.length());
  }

  public static Filter.Result tryToParseLine(String line, int offset) {
    if (!(StringUtils.trim(line).startsWith(JavaStackTraceFilter.STRING_START))) {
      return null;
    }

    int start = line.indexOf(JavaStackTraceFilter.STRING_START) + JavaStackTraceFilter.STRING_START.length();
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
    final SNode nodeToShow = TraceInfoUtil.getNodes(methodName, position);
    if (nodeToShow == null) {
      return null;
    }

    return new Filter.Result(start + parenIndex + 1 + offset, start + closingParenIndex + offset, new HyperlinkInfo() {
      public void navigate(Project p0) {
        JavaStackTraceFilter.showNode(p0, nodeToShow);
      }
    });
  }

  private static void showNode(Project p, SNode node) {
    ProjectOperationContext operationContext = ProjectOperationContext.get(p);
    MPSEditorOpener opener = p.getComponent(MPSEditorOpener.class);
    opener.editNode(node, operationContext);
  }
}

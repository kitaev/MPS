package jetbrains.mps.dataFlow.runtime;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Map;
import jetbrains.mps.lang.dataFlow.framework.Program;
import jetbrains.mps.lang.dataFlow.DataFlowManager;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.lang.dataFlow.framework.AnalysisResult;
import jetbrains.mps.lang.dataFlow.framework.instructions.Instruction;

public class NullableUtil {

  public static NullableVariableState getVariableStateByAnnotation(List<SNode> annotations) {
    for(SNode annotation : ListSequence.fromList(annotations)) {
      if (SLinkOperations.getTarget(annotation, "annotation", false) == SNodeOperations.getNode("f:java_stub#org.jetbrains.annotations(org.jetbrains.annotations@java_stub)", "~Nullable")) {
        return NullableVariableState.NULLABLE;
      }
      if (SLinkOperations.getTarget(annotation, "annotation", false) == SNodeOperations.getNode("f:java_stub#org.jetbrains.annotations(org.jetbrains.annotations@java_stub)", "~NotNull")) {
        return NullableVariableState.NOT_NULL;
      }
    }
    return NullableVariableState.UNKNOWN;
  }

  public static Map<SNode, NullableVariableState> getVariableReferenceStates(SNode node) {
    Program p = DataFlowManager.getInstance().buildProgramFor(node);
    Map<SNode, NullableVariableState> result = MapSequence.fromMap(new HashMap<SNode, NullableVariableState>());
    AnalysisResult<Map<SNode, NullableVariableState>> analysisResult = p.analyze(new NullableAnalyzer<SNode>());
    for(SNode reference : ListSequence.fromList(SNodeOperations.getDescendants(node, "jetbrains.mps.baseLanguage.structure.LocalVariableReference", false))) {
      if (!(p.getInstructionsFor(reference).isEmpty())) {
        Instruction instruction = p.getInstructionsFor(reference).get(0);
        NullableVariableState state = MapSequence.fromMap(analysisResult.get(instruction)).get(SLinkOperations.getTarget(reference, "variableDeclaration", false));
        if (state != null) {
          MapSequence.fromMap(result).put(reference, state);
        }
      }
    }
    return result;
  }

  public static List<SNode> getBadNullableProblems(SNode node) {
    NullableAnalysisResult analizysResult = new NullableAnalysisResult(node);
    return analizysResult.checkNodes(node);
  }

}

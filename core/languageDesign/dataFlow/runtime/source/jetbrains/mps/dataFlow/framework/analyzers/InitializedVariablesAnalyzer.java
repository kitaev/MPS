package jetbrains.mps.dataFlow.framework.analyzers;

import jetbrains.mps.dataFlow.framework.DataFlowAnalyzer;
import jetbrains.mps.dataFlow.framework.AnalysisDirection;
import jetbrains.mps.dataFlow.framework.Program;
import jetbrains.mps.dataFlow.framework.ProgramState;
import jetbrains.mps.dataFlow.framework.instructions.WriteInstruction;
import jetbrains.mps.dataFlow.framework.instructions.Instruction;

import java.util.Set;
import java.util.HashSet;

public class InitializedVariablesAnalyzer implements DataFlowAnalyzer<Set<Object>> {

  public Set<Object> initial(Program p) {
    return new HashSet<Object>(p.getVariables());
  }

  public Set<Object> merge(Program p, Set<Set<Object>> input) {
    Set<Object> result = initial(p);
    for (Set<Object> item : input) {
      result.retainAll(item);
    }
    return result;
  }

  public Set<Object> fun(Set<Object> input, ProgramState s) {
    Instruction instruction = s.getInstruction();
    Set<Object> result = new HashSet<Object>(input);

    if (s.isStart()) {
      result.clear();
    }

    if (instruction instanceof WriteInstruction) {
      WriteInstruction write = (WriteInstruction) instruction;
      result.add(write.getVariable());
    }

    return result;
  }

  public AnalysisDirection getDirection() {
    return AnalysisDirection.FORWARD;
  }
}

package jetbrains.mps.lang.smodel.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilders;
import jetbrains.mps.lang.dataFlow.DataFlowManager;

public class DFABuilders extends DataFlowBuilders {
  public void install(DataFlowManager manager) {
    manager.register("jetbrains.mps.lang.smodel.structure.SNodeOperation", new SNodeOperation_DataFlow());
    manager.register("jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression", new SNodeTypeCastExpression_DataFlow());
    manager.register("jetbrains.mps.lang.smodel.structure.SemanticDowncastExpression", new SemanticDowncastExpression_DataFlow());
    manager.register("jetbrains.mps.lang.smodel.structure.Concept_IsSubConceptOfOperation", new Concept_IsSubConceptOfOperation_DataFlow());
    manager.register("jetbrains.mps.lang.smodel.structure.PoundExpression", new PoundExpression_DataFlow());
    manager.register("jetbrains.mps.lang.smodel.structure.Concept_IsSuperConceptOfOperation", new Concept_IsSuperConceptOfOperation_DataFlow());
    manager.register("jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation", new Node_IsInstanceOfOperation_DataFlow());
  }
}

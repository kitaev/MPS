package jetbrains.mps.baseLanguage.collections.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilders;
import jetbrains.mps.lang.dataFlow.DataFlowManager;

public class DFABuilders extends DataFlowBuilders {
  public void install(DataFlowManager manager) {
    manager.register("jetbrains.mps.baseLanguage.collections.structure.ForEachStatement", new ForEachStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.AddAllElementsOperation", new AddAllElementsOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.MapElement", new MapElement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.ContainsOperation", new ContainsOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.GetIndexOfOperation", new GetIndexOfOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.BinaryOperation", new BinaryOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference", new ForEachVariableReference_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.PageOperation", new PageOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.RemoveAllElementsOperation", new RemoveAllElementsOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.RemoveElementOperation", new RemoveElementOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.SkipOperation", new SkipOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.TakeOperation", new TakeOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.AddElementOperation", new AddElementOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.GetElementOperation", new GetElementOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.InternalSequenceOperation", new InternalSequenceOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.AddSetElementOperation", new AddSetElementOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.RemoveSetElementOperation", new RemoveSetElementOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.AddAllSetElementsOperation", new AddAllSetElementsOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.RemoveAllSetElementsOperation", new RemoveAllSetElementsOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.RemoveAtElementOperation", new RemoveAtElementOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.AddLastElementOperation", new AddLastElementOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.AddFirstElementOperation", new AddFirstElementOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.DowncastExpression", new DowncastExpression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.SequenceCreator", new SequenceCreator_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.SingletonSequenceCreator", new SingletonSequenceCreator_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.AbstractContainerCreator", new AbstractContainerCreator_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.HeadSetOperation", new HeadSetOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.TailSetOperation", new TailSetOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.SubSetOperation", new SubSetOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.HeadMapOperation", new HeadMapOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.SubMapOperation", new SubMapOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.TailMapOperation", new TailMapOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.JoinOperation", new JoinOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.InsertElementOperation", new InsertElementOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.ListElementAccessExpression", new ListElementAccessExpression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.ContainsKeyOperation", new ContainsKeyOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.ContainsValueOperation", new ContainsValueOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.MapEntry", new MapEntry_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.MapInitializer", new MapInitializer_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.HashMapCreator", new HashMapCreator_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.MapOperationExpression", new MapOperationExpression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.MapRemoveOperation", new MapRemoveOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.PutAllOperation", new PutAllOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.ChunkOperation", new ChunkOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.ComparatorSortOperation", new ComparatorSortOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.SortOperation", new SortOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.ContainsAllOperation", new ContainsAllOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.SubListOperation", new SubListOperation_DataFlow());
  }
}

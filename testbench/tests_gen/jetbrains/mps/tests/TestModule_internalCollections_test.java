package jetbrains.mps.tests;

/*Generated by MPS */

import jetbrains.mps.testbench.junit.runners.ModuleSymbolicSuite;
import org.junit.runner.RunWith;

@ModuleSymbolicSuite.ModuleClassSymbols(classes = {"jetbrains.mps.internalCollections.test.basicOperations.Sequence_Test", "jetbrains.mps.internalCollections.test.basicOperations.Chunks_Test", "jetbrains.mps.internalCollections.test.basicOperations.Distinct_Test", "jetbrains.mps.internalCollections.test.basicOperations.List_Test", "jetbrains.mps.internalCollections.test.basicOperations.Map_Test", "jetbrains.mps.internalCollections.test.basicOperations.Set_Test", "jetbrains.mps.internalCollections.test.basicOperations.Array_Test", "jetbrains.mps.internalCollections.test.basicOperations.Iterator_Test", "jetbrains.mps.internalCollections.test.basicOperations.LinkedMap_Test", "jetbrains.mps.internalCollections.test.basicOperations.SortedMap_Test", "jetbrains.mps.internalCollections.test.basicOperations.SortedSet_Test", "jetbrains.mps.internalCollections.test.basicOperations.QueueDequeStack_Test", "jetbrains.mps.internalCollections.test.nullHacks.NullSequence_Test", "jetbrains.mps.internalCollections.test.nullHacks.NullValues_Test", "jetbrains.mps.internalCollections.test.nullHacks.NullEmpty_Test", "jetbrains.mps.internalCollections.test.compareOperations.Union_Test", "jetbrains.mps.internalCollections.test.compareOperations.SubtractTest_Test", "jetbrains.mps.internalCollections.test.compareOperations.Intersect_Test", "jetbrains.mps.internalCollections.test.compareOperations.Disjunct_Test", "jetbrains.mps.internalCollections.test.compareOperations.Concat_Test", "jetbrains.mps.internalCollections.test.closures.Where_Test", "jetbrains.mps.internalCollections.test.closures.Runtime_Test", "jetbrains.mps.internalCollections.test.closures.Mapper_Test", "jetbrains.mps.internalCollections.test.closures.ChainedOperations_Test", "jetbrains.mps.internalCollections.test.closures.Util_Test", "jetbrains.mps.internalCollections.test.closures.SelectTest_Test", "jetbrains.mps.internalCollections.test.closures.VisitAll_Test", "jetbrains.mps.internalCollections.test.closures.Sort_Test", "jetbrains.mps.internalCollections.test.closures.ForEach_Test", "jetbrains.mps.internalCollections.test.closures.Find_Test", "jetbrains.mps.internalCollections.test.closures.Advanced_Test", "jetbrains.mps.internalCollections.test.closures.RemoveWhereTest_Test", "jetbrains.mps.internalCollections.test.closures.ReduceFold_Test"}, tests = {"test_sequenceMethods,test_sequenceFromClosure,test_sequenceInitializer,test_sequenceInitializer2,test_sequenceOperations,test_toOperations,test_primitiveParameter,test_singleton,test__toString,test_asSequence,test_asSequencePrim,test_containsAll,test_join,test_test_MPS6197,test_sequenceTypeWithoutElement,test_dummy", "test_chunkMethods,test_chunkOperations,test_pageOperationNoSideEffects,test_takeAll,test_nextWithoutHasNext,test_dummy", "test_distinctMethod,test_distinctOperation,test_nextWithoutHasNext,test_dummy", "test_listCreator,test_initSize,test_add,test_addAll,test_copy,test_remove,test_removeAll,test_reverse,test_sameList,test_toArray,test_insertSet,test_elementAccess,test_serializeList,test_emptyLinkedList,test_nonEmptyLinkedList,test_clear,test_addFirst,test_addLast,test_removeAt,test_removeFirst,test_removeLast,test_primitiveParameter,test_array,test_fromArray,test__toString,test_mps5845,test_mps5818,test_mps6093,test_subList,test_headList,test_tailList,test_containsAll,test_mps6232,test_mps8045,test_linkedlist,test_dummy", "test_initSize,test_mapMethod,test_mapInitializer,test_mapNoInitializer,test_clear,test_primitiveParameter,test_array,test_arrayOfString,test_contains,test_mps4050,test__toString,test_mappings,test_mapIsASequence,test_putAll,test_removeKey,test_mappings2,test_weakHashMap,test_dummy", "test_initSize,test_emptyCreator,test_nonEmptyCreator,test_clear,test_add,test_addAll,test_copy,test_remove,test_removeAll,test_primitiveParameter,test_contains,test_linkedHashSet,test__toString,test_array,test_eq,test_mps6232,test_weakSet,test_dummy", "test_iterateArrayFor,test_iterateArrayYield,test_dummy", "test__null,test_singleton,test_iterating,test_containerIterator,test_dummy", "test_insertOrder,test_accessOrder,test_dummy", "test_sortedMap,test_headMap,test_tailMap,test_subMap,test_dummy", "test_order,test_multiOrder,test_headSet,test_tailSet,test_subSet,test_comparator,test_dummy", "test_queue,test_priorityQueue,test_stack,test_stackClassic,test_deque", "test_nullSequence,test_nullCompareOperations,test_nullTranslate,test_nullList,test_forEach,test_nullArray,test_dummy", "test_nullValues,test_nullElements,test_nullsViaBackdoor,test_dummy", "test_nullFirstLast,test_nullAddAll,test_dummy", "test_unionMethod,test_unionOperation,test_nextWithoutHasNext,test_dummy", "test_subtractMethod,test_subtractOperation,test_nextWithoutHasNext,test_dummy", "test_intersectMethod,test_intersectOperation,test_nextWithoutHasNext,test_dummy", "test_disjunctionMethod,test_discjunctOperation,test_disjunctionEquivalence,test_nextWithoutHasNext,test_dummy", "test_concatMethod,test_concatOperation,test_nextWithoutHasNext,test_dummy", "test_whereMethod,test_whereFilterVar,test_whereOperation,test_nextWithoutHasNext,test_whereAdvancesTooEarly,test_dummy", "test_fromIterable,test_dummy", "test_mapMethod,test_mapperVar,test_mappingOperation,test_legacyMapper,test_stopSkip,test_stopBug,test_selectMany,test_nextWithoutHasNext,test_selectManyAdvancesTooEarly,test_dummy", "test_chainedCall,test_chainedOperations,test_dummy", "test_dummy", "test_selectMethod,test_selectMethod2,test_selectorVar,test_selectOperation,test_legacySelector,test_selectMany,test_nextWithoutHasNext,test_selectAdvancesTooEarly,test_dummy", "test_visitAllMethod,test_visitorVar,test_visitOperation,test_visitorVarOperation,test_legacyForEach,test_skipStop,test_parameterizedAdaptation,test_typing,test_dummy", "test_sortMethod,test_toComparableVar,test_sortOperationInternal,test_caseSensitive,test_caseInsensitive,test_legacySort,test_alsoSort,test_dummy", "test_legacyForeach,test_iterateArray,test_noWrapperForGNE,test_noWrapperForArray,test_mps10737,test_dummy", "test_findFirstLast,test_mps10458,test_anyAll,test_dummy", "test_nestedYield,test_dummy", "test_listRemoveWhere,test_queueRemoveWhere,test_dummy", "test_reduceLeft,test_reduceRight,test_foldLeft,test_foldRight,test_mps10786,test_dummy"})
@ModuleSymbolicSuite.ModuleReference("b5660d3a-8a0d-4815-881b-7c884f61c9c7(internalCollections.test)")
@RunWith(ModuleSymbolicSuite.class)
public class TestModule_internalCollections_test {
  public TestModule_internalCollections_test() {
  }
}

import jetbrains.mps.junit.WatchingSuite;
import jetbrains.mps.test.MpsMakeHelper;
import junit.framework.TestSuite;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import java.lang.reflect.Method;

@SuiteClasses({jetbrains.mps.baseLanguage.closures.test.ClosureLiteralDataFlow_Test.class,
jetbrains.mps.baseLanguage.closures.test.ClosureDataFlow_Test.class,
jetbrains.mps.generator.test.ParallelPoolTest.class,
jetbrains.mps.internalCollections.test.compareOperations.SubtractTest_Test.class,
jetbrains.mps.internalCollections.test.compareOperations.Disjunct_Test.class,
jetbrains.mps.internalCollections.test.basicOperations.QueueDequeStack_Test.class,
jetbrains.mps.internalCollections.test.nullHacks.NullValues_Test.class,
jetbrains.mps.internalCollections.test.compareOperations.Intersect_Test.class,
jetbrains.mps.internalCollections.test.closures.SelectTest_Test.class,
jetbrains.mps.internalCollections.test.closures.ForEach_Test.class,
jetbrains.mps.internalCollections.test.closures.Util_Test.class,
jetbrains.mps.internalCollections.test.closures.Where_Test.class,
jetbrains.mps.internalCollections.test.basicOperations.Distinct_Test.class,
jetbrains.mps.internalCollections.test.closures.ReduceFold_Test.class,
jetbrains.mps.internalCollections.test.basicOperations.Chunks_Test.class,
jetbrains.mps.internalCollections.test.closures.Runtime_Test.class,
jetbrains.mps.internalCollections.test.basicOperations.SortedMap_Test.class,
jetbrains.mps.internalCollections.test.closures.Mapper_Test.class,
jetbrains.mps.internalCollections.test.basicOperations.Map_Test.class,
jetbrains.mps.internalCollections.test.basicOperations.Set_Test.class,
jetbrains.mps.internalCollections.test.nullHacks.NullEmpty_Test.class,
jetbrains.mps.internalCollections.test.closures.RemoveWhereTest_Test.class,
jetbrains.mps.internalCollections.test.closures.VisitAll_Test.class,
jetbrains.mps.internalCollections.test.basicOperations.SortedSet_Test.class,
jetbrains.mps.internalCollections.test.compareOperations.Concat_Test.class,
jetbrains.mps.internalCollections.test.closures.ChainedOperations_Test.class,
jetbrains.mps.internalCollections.test.basicOperations.List_Test.class,
jetbrains.mps.internalCollections.test.closures.Sort_Test.class,
jetbrains.mps.internalCollections.test.basicOperations.LinkedMap_Test.class,
jetbrains.mps.internalCollections.test.nullHacks.NullSequence_Test.class,
jetbrains.mps.internalCollections.test.basicOperations.Iterator_Test.class,
jetbrains.mps.internalCollections.test.compareOperations.Union_Test.class,
jetbrains.mps.internalCollections.test.basicOperations.Array_Test.class,
jetbrains.mps.internalCollections.test.closures.Advanced_Test.class,
jetbrains.mps.internalCollections.test.basicOperations.Sequence_Test.class,
jetbrains.mps.internalCollections.test.closures.Find_Test.class,
jetbrains.mps.baseLanguage.tuples.test.GenericNamedTuples_Test.class,
jetbrains.mps.baseLanguage.tuples.test.NamedTuples_Test.class,
jetbrains.mps.baseLanguage.tuples.test.IndexedTuples_Test.class,
jetbrains.mps.lang.pattern.test.Patternv3_Test.class,
jetbrains.mps.lang.pattern.test.PatternOrPattern_Test.class,
jetbrains.mps.lang.pattern.test.Patternv2_Test.class,
jetbrains.mps.lang.pattern.test.PatternOrPattern2_Test.class,
jetbrains.mps.lang.pattern.test.PatternMultipleOr_Test.class,
jetbrains.mps.lang.pattern.test.Patternv1_Test.class,
jetbrains.mps.lang.pattern.test.PatternListPattern_Test.class,
jetbrains.mps.lang.pattern.test.PatternProperty_Test.class,
jetbrains.mps.runtime.BundleTest.class,
jetbrains.mps.runtime.BundleLoadingTest.class,
jetbrains.mps.workbench.dialogs.project.components.parts.lists.SortedListTest.class,
jetbrains.mps.ide.messages.MessageViewListModelTest.class,
jetbrains.mps.baseLanguage.tuples.test.Tuples_Test.class,
jetbrains.mps.lang.smodel.test.InsertPrevSiblingOperation_Focus_Test.class,
jetbrains.mps.ide.blame.command.YouTrackURLTest.class,
jetbrains.mps.vcs.diff.MergeRefactoringTest.class,
jetbrains.mps.make.dependencies.GraphTestCase.class,
jetbrains.mps.make.TestMakeOnRealProject.class,
jetbrains.mps.make.dependencies.FindStronglyConnectedComponentsTestCase.class,
jetbrains.mps.diff.DiffTestCase.class,
jetbrains.mps.vcs.diff.MergeNotLoseExternalChangesTest.class,
jetbrains.mps.vcs.diff.MergeReferencesTest.class,
jetbrains.mps.vcs.diff.MergeConceptAndImportsTest.class,
jetbrains.mps.debug.evaluation.transform.tests.TransformationUtil_Complex_Test.class,
jetbrains.mps.debug.evaluation.transform.tests.TransformationUtil_Expressions_Test.class,
jetbrains.mps.smodel.test.reflection.SNodeGetReferenceOperation_Test.class,
jetbrains.mps.smodel.test.reflection.SNodeGetReterencesOperation_Test.class,
jetbrains.mps.smodel.test.smodelOperations.SLinkImplicitSelect_Test.class,
jetbrains.mps.smodel.test.reflection.SNodeGetChildrenOperation_Test.class,
jetbrains.mps.smodel.test.smodelOperations.SLinkListAccess_ListModifyingOperaions_Test.class,
jetbrains.mps.build.ant.BrokenReferencesTestTest.class,
jetbrains.mps.build.ant.WhatToDoSerializationConsistencyTest.class,
jetbrains.mps.build.ant.TeamCityMesageFormatTest.class,
jetbrains.mps.build.ant.GenerateTaskFilesCreationTest.class,
jetbrains.mps.baseLanguage.test.TypesTest_BL_Test.class,
jetbrains.mps.baseLanguage.test.UnusedAssignmentWithIF_Test.class,
jetbrains.mps.baseLanguage.test.DataFlowInClosure_Test.class,
jetbrains.mps.baseLanguage.test.UnusedParameters_Test.class,
jetbrains.mps.baseLanguage.test.ForLoop_Test.class,
jetbrains.mps.baseLanguage.test.UnusedAssignment_Test.class,
jetbrains.mps.baseLanguage.test.TestSafeEquals_Test.class,
jetbrains.mps.baseLanguage.test.UnusedVariableDeclaration_Test.class,
jetbrains.mps.baseLanguage.test.IfStatementWithReturns_Test.class,
jetbrains.mps.baseLanguage.test.AnonymousClass_Test.class,
jetbrains.mps.baseLanguage.test.CommentCanBeUnreachable_Test.class,
jetbrains.mps.baseLanguage.test.CatchingUnthrownException_Test.class,
jetbrains.mps.baseLanguage.test.VariableUninitialized_Test.class,
jetbrains.mps.baseLanguage.test.ListWithConceptFunction_Test.class,
jetbrains.mps.baseLanguage.test.IfStatementWrongUnreachable_Test.class,
jetbrains.mps.baseLanguage.test.UnreachableStatements_Test.class,
jetbrains.mps.baseLanguage.test.ReadAction_Test.class,
jetbrains.mps.baseLanguage.test.CommandDataflowWithReturn_Test.class,
jetbrains.mps.baseLanguage.test.UnexpectedReturnInAnonymousClass_Test.class,
jetbrains.mps.baseLanguage.test.MethodParametersTest_Test.class,
jetbrains.mps.baseLanguage.test.OnlyStatementsCanUnreachable_Test.class,
jetbrains.mps.baseLanguage.test.IfStatementDataFlow_Test.class,
jetbrains.mps.refactoringTest.InlineRecursiveMethod_Test.class,
jetbrains.mps.refactoringTest.AddThrowDeclaration_Test.class,
jetbrains.mps.refactoringTest.ExtractContinue_Test.class,
jetbrains.mps.editorTest.DeleteFieldReference_Test.class,
jetbrains.mps.editorTest.SubstitudeAmbigousActions_Test.class,
jetbrains.mps.refactoringTest.ConvertAnonymousWithTypeVariablesComplexTest_Test.class,
jetbrains.mps.editorTest.RemoveNodeTest_Test.class,
jetbrains.mps.editorTest.RestoreCellSelection_Test.class,
jetbrains.mps.editorTest.SimpleUndoTest_Test.class,
jetbrains.mps.editorTest.LT_DotExpression_with_MinusAssignment_Test.class,
jetbrains.mps.editorTest.RightTransformInAnnotation_Test.class,
jetbrains.mps.editorTest.PressingEndWithSelectedNode_Test.class,
jetbrains.mps.editorTest.DeleteFirstChild_Test.class,
jetbrains.mps.refactoringTest.InlineInClosureWithOutsideAssingment_Test.class,
jetbrains.mps.refactoringTest.ChangeMethodName_Test.class,
jetbrains.mps.editorTest.InsertBeforeUnaryMinus_Test.class,
jetbrains.mps.refactoringTest.SimpleFindForExtractFromManyStatements_Test.class,
jetbrains.mps.editorTest.DeleteClosingCurlyBrace_Test.class,
jetbrains.mps.refactoringTest.FindInputVariables_Test.class,
jetbrains.mps.refactoringTest.MethodsWithoutReturnStatement_Test.class,
jetbrains.mps.editorTest.Post_ThisSavingClassConceptUnset_Test.class,
jetbrains.mps.editorTest.AddingParameterThroughtWrapper_Test.class,
jetbrains.mps.refactoringTest.MoveStaticFieldSimpleTest_Test.class,
jetbrains.mps.editorTest.InsertBeforeInIf_Test.class,
jetbrains.mps.editorTest.AssignmentTest_Test.class,
jetbrains.mps.refactoringTest.RemoveParameter_Test.class,
jetbrains.mps.editorTest.DefaultCellInfoTest_Test.class,
jetbrains.mps.editorTest.SideDeleteAtEndWhithBackSpace_Test.class,
jetbrains.mps.refactoringTest.CheckInlineWithThrow_Test.class,
jetbrains.mps.editorTest.Pre_LocalStaicFieldToStaticFieldReference_Test.class,
jetbrains.mps.refactoringTest.ChangeParametersOrder_Test.class,
jetbrains.mps.editorTest.ReturnFollowerByVarName_Test.class,
jetbrains.mps.editorTest.LT_DotExpression_with_Cast_Test.class,
jetbrains.mps.editorTest.DeleteOverridenMethodInBehavior_Test.class,
jetbrains.mps.editorTest.SidedeleteAtTheEnd_Test.class,
jetbrains.mps.editorTest.StaticBehaviorMethodWithParameters_completion_Test.class,
jetbrains.mps.editorTest.AssociativityProblem_Test.class,
jetbrains.mps.refactoringTest.DeclarationVariablesInMethod_Test.class,
jetbrains.mps.editorTest.Post_StaticFieldToLocalStaticFieldReference_Test.class,
jetbrains.mps.editorTest.LT_PlusExpressionRArgument_with_Plus_Test.class,
jetbrains.mps.editorTest.AnonymousClassTest_Test.class,
jetbrains.mps.editorTest.LT_Assignment_with_PlusAssignment_Test.class,
jetbrains.mps.refactoringTest.CheckVisibility_Test.class,
jetbrains.mps.refactoringTest.InlineAssingmentWithClosures_Test.class,
jetbrains.mps.refactoringTest.InlineInBehaviorWithThis_Test.class,
jetbrains.mps.refactoringTest.FindAndMoveFromIfForIntroduceLocalVar_Test.class,
jetbrains.mps.refactoringTest.ExtractMethodWithThrows_Test.class,
jetbrains.mps.editorTest.LT_ListElementAccess_with_PlusOperation_Test.class,
jetbrains.mps.refactoringTest.InlineModelWithConstants_Test.class,
jetbrains.mps.editorTest.LT_PostfixDecrementExpression_with_PrefixDecrement_Test.class,
jetbrains.mps.refactoringTest.MoveMethodWithUssages_Test.class,
jetbrains.mps.refactoringTest.staticContainerClassTest_Test.class,
jetbrains.mps.editorTest.AssignLeftTransform_Test.class,
jetbrains.mps.refactoringTest.IntroduceVariableFromWildcards_Test.class,
jetbrains.mps.editorTest.AssigningToField_Test.class,
jetbrains.mps.editorTest.LT_DotExpression_with_UnaryMinus_Test.class,
jetbrains.mps.editorTest.SimpleRedoTest_Test.class,
jetbrains.mps.refactoringTest.ExtractFromExpressionWithoutReturn_Test.class,
jetbrains.mps.editorTest.RT_Assert_with_colon_Test.class,
jetbrains.mps.editorTest.TwoMullTwo_Test.class,
jetbrains.mps.editorTest.BadCodeTest_Test.class,
jetbrains.mps.editorTest.LT_DotExpression_with_Parenthesis_Test.class,
jetbrains.mps.refactoringTest.ConceptMethod_Test.class,
jetbrains.mps.editorTest.PerformLeftTransformWithNoLeftTransformActions_Test.class,
jetbrains.mps.editorTest.LT_DotExpression_with_PrefixDecrement_Test.class,
jetbrains.mps.refactoringTest.ReplaceOutputVaryable_Test.class,
jetbrains.mps.refactoringTest.TwoParametersWithSameType_Test.class,
jetbrains.mps.refactoringTest.ConvertAnonymousWithParameterReference_Test.class,
jetbrains.mps.refactoringTest.ChangeMethodParametersForStatement_Test.class,
jetbrains.mps.refactoringTest.MoveStaticFieldWithUsageTest_Test.class,
jetbrains.mps.refactoringTest.SimpleInlineWithOneReturn_Test.class,
jetbrains.mps.editorTest.SelectTwoCells_Test.class,
jetbrains.mps.editorTest.MovingNode_Test.class,
jetbrains.mps.editorTest.AnnotationSelection_Test.class,
jetbrains.mps.refactoringTest.SimpleFindForIntroduceConstant_Test.class,
jetbrains.mps.refactoringTest.ConvertAnonymousWithLocalVariablesTest_Test.class,
jetbrains.mps.editorTest.RT_addTypeVariable_Test.class,
jetbrains.mps.editorTest.DeleteVariableInitializer_Test.class,
jetbrains.mps.refactoringTest.InlineFromBehavior_Test.class,
jetbrains.mps.refactoringTest.SimpleFindForIntroduceLocalVariable_Test.class,
jetbrains.mps.editorTest.SurroundExpressionWithParenthesis_Test.class,
jetbrains.mps.editorTest.AssignmentExpression_Test.class,
jetbrains.mps.editorTest.PressingBackspaseInFirstPosition_Test.class,
jetbrains.mps.refactoringTest.FindForMethodWithIVariableLikeNodes_Test.class,
jetbrains.mps.refactoringTest.CheckInlineCanBePerformed_Test.class,
jetbrains.mps.editorTest.PriorityCheckTest_Test.class,
jetbrains.mps.refactoringTest.ExtractMethodWithOutputVaryableFromStatement_Test.class,
jetbrains.mps.refactoringTest.InlineFromBehaviorWithMethods_Test.class,
jetbrains.mps.editorTest.WrappingCellShouldntBeSelectable_Test.class,
jetbrains.mps.editorTest.TypingIncorrectTextInFields_Test.class,
jetbrains.mps.editorTest.TypeToTypeof_Test.class,
jetbrains.mps.editorTest.SurrondWithParenthesisTest_Test.class,
jetbrains.mps.refactoringTest.SimpleFindForExtractFromStatement_Test.class,
jetbrains.mps.editorTest.ReturnNullTest_Test.class,
jetbrains.mps.editorTest.TestForNonEmptyProperty_Test.class,
jetbrains.mps.editorTest.SurrondByParensesis_Test.class,
jetbrains.mps.editorTest.STHintTest_Test.class,
jetbrains.mps.editorTest.CompexTransformTest_Test.class,
jetbrains.mps.refactoringTest.ConvertAnonymousWithTypeVariablesTest_Test.class,
jetbrains.mps.refactoringTest.OneReturnTransformation_Test.class,
jetbrains.mps.refactoringTest.ExtractFromAnonymous_Test.class,
jetbrains.mps.editorTest.PriorityProblem_Test.class,
jetbrains.mps.editorTest.LT_PostfixIncrementExpression_with_PrefixIncrement_Test.class,
jetbrains.mps.editorTest.LT_MulExpressionRArgument_with_Plus_Test.class,
jetbrains.mps.editorTest.Post_ThisSettingClassConcept_Test.class,
jetbrains.mps.editorTest.LT_PlusExpression_with_Plus_Test.class,
jetbrains.mps.refactoringTest.InlineLocalVariableReferenceWithoutDeclarationDeleting_Test.class,
jetbrains.mps.editorTest.IfAndElseTest_Test.class,
jetbrains.mps.editorTest.InterWithNonLabelSelected_Test.class,
jetbrains.mps.editorTest.EditorCellSomeProblem_Test.class,
jetbrains.mps.refactoringTest.MoveMethodWithMethods_Test.class,
jetbrains.mps.refactoringTest.SimpleFindForExtractWithReturn_Test.class,
jetbrains.mps.editorTest.ReturnFollowedBySpaceVarName_Test.class,
jetbrains.mps.refactoringTest.InlineMethodWithConceptFunctionParameters_Test.class,
jetbrains.mps.editorTest.ReplacePlusWithMinus_Test.class,
jetbrains.mps.refactoringTest.InlineMethodInTest_Test.class,
jetbrains.mps.refactoringTest.SimpleMoveMethod_Test.class,
jetbrains.mps.editorTest.RT_AssertInstanceMethodCallOperation_with_colon_Test.class,
jetbrains.mps.editorTest.LT_DotExpression_with_Not_Test.class,
jetbrains.mps.refactoringTest.IntroduceFinalLocalVariable_Test.class,
jetbrains.mps.editorTest.LT_MapElement_with_Assignment_Test.class,
jetbrains.mps.editorTest.LeftTransformOfDotOperation_Test.class,
jetbrains.mps.editorTest.EditingNotEditableProperty_Test.class,
jetbrains.mps.editorTest.SelectionByShiftArrows_Test.class,
jetbrains.mps.editorTest.RT_toStaticFieldReference_Test.class,
jetbrains.mps.editorTest.SelectionOfWrappedCell_Test.class,
jetbrains.mps.refactoringTest.InlineWithNoSourcesAttached_Test.class,
jetbrains.mps.editorTest.RightTransform_Test.class,
jetbrains.mps.refactoringTest.InlineMethodThatChangesParameters_Test.class,
jetbrains.mps.editorTest.AddingParameterWithEnter_Test.class,
jetbrains.mps.refactoringTest.ConceptFunctioParameterTest_Test.class,
jetbrains.mps.refactoringTest.InlineManyReturns_Test.class,
jetbrains.mps.editorTest.ReplacingSelection_Test.class,
jetbrains.mps.refactoringTest.StaticMethod_Test.class,
jetbrains.mps.refactoringTest.ExtractMethodWithOutputVaryableFromExpression_Test.class,
jetbrains.mps.refactoringTest.CheckStaticVisibility_Test.class,
jetbrains.mps.refactoringTest.MoveMethodWithParameters_Test.class,
jetbrains.mps.refactoringTest.InlineWithVoidTypeAndBug_Test.class,
jetbrains.mps.refactoringTest.ChangeSignatureOfStaticMethod_Test.class,
jetbrains.mps.editorTest.RestoringSThintCell_Test.class,
jetbrains.mps.editorTest.NodeAfterSubstitutionHasNoErrorCell_Test.class,
jetbrains.mps.refactoringTest.SimpleFindForExtractFromExpression_Test.class,
jetbrains.mps.editorTest.IntelligentInputWithSubstitutionChooser_Test.class,
jetbrains.mps.editorTest.TwoPlusTwo_Test.class,
jetbrains.mps.refactoringTest.InlineWithoutReturnStatement_Test.class,
jetbrains.mps.editorTest.Post_ThisRemovingClassConcept_Test.class,
jetbrains.mps.editorTest.TryingToLeftTransformNewExpression_Test.class,
jetbrains.mps.editorTest.RestoreRangeSeletion_Test.class,
jetbrains.mps.refactoringTest.SimpleMoveStaticMethod_Test.class,
jetbrains.mps.editorTest.CaretInStaticMethodCall_Test.class,
jetbrains.mps.refactoringTest.ChangeSigantureOfInterface_Test.class,
jetbrains.mps.editorTest.DeleteIfPossibleMethod_Test.class,
jetbrains.mps.refactoringTest.FindForMethodWithOutputVariable_Test.class,
jetbrains.mps.editorTest.SidedeleteAtEndWithOneStatement_Test.class,
jetbrains.mps.refactoringTest.MoveMethodWithFields_Test.class,
jetbrains.mps.refactoringTest.SimpleInlineVariable_Test.class,
jetbrains.mps.refactoringTest.ExtractFromStatementWithReturnValue_Test.class,
jetbrains.mps.editorTest.LT_AssignmentRValue_with_PlusAssignment_Test.class,
jetbrains.mps.editorTest.ConflictingRigthTransform_Test.class,
jetbrains.mps.refactoringTest.staticContainerBehaviorTest_Test.class,
jetbrains.mps.editorTest.LT_DotExpression_with_PlusOperation_Test.class,
jetbrains.mps.editorTest.IntSpaceA_Test.class,
jetbrains.mps.refactoringTest.ExtractFromStatements_Test.class,
jetbrains.mps.refactoringTest.ReturnStatement_Test.class,
jetbrains.mps.refactoringTest.ExtractFromExpression_Test.class,
jetbrains.mps.editorTest.SubstituteSmallPatternInLeft_Test.class,
jetbrains.mps.editorTest.LT_PlusExpression_with_Cast_Test.class,
jetbrains.mps.editorTest.SidedeleteAtStartOfIf_Test.class,
jetbrains.mps.refactoringTest.ChangeParameterName_Test.class,
jetbrains.mps.editorTest.LT_SNodeTypeCast_with_PlusExpression_Test.class,
jetbrains.mps.refactoringTest.InlineMethodWithUnusedParameters_Test.class,
jetbrains.mps.refactoringTest.InlineAssingmentInClosure_Test.class,
jetbrains.mps.refactoringTest.OneReturnWithNotVariableParameters_Test.class,
jetbrains.mps.refactoringTest.OneReturnWithParameteres_Test.class,
jetbrains.mps.refactoringTest.ChangeReturningType_Test.class,
jetbrains.mps.refactoringTest.ExtractMethodFromConstructor_Test.class,
jetbrains.mps.refactoringTest.ExtractMethodFromClosure_Test.class,
jetbrains.mps.editorTest.IntentionTest_Test.class,
jetbrains.mps.editorTest.EqualsTest_Test.class,
jetbrains.mps.refactoringTest.ConvertAnonymousInterfaceTest_Test.class,
jetbrains.mps.refactoringTest.OneReturnStatement_Test.class,
jetbrains.mps.refactoringTest.InlineStaticFromAnotherClass_Test.class,
jetbrains.mps.refactoringTest.IntroduceConstantFromAnonimousClass_Test.class,
jetbrains.mps.editorTest.DeleteOnSelectedNode_Test.class,
jetbrains.mps.refactoringTest.InlineInsideClosure_Test.class,
jetbrains.mps.refactoringTest.ConvertAnonymousAbstractClassWithConstructorTest_Test.class,
jetbrains.mps.refactoringTest.ChangeParameterType_Test.class,
jetbrains.mps.refactoringTest.ConvertAnonymousAbstractClassTest_Test.class,
jetbrains.mps.refactoringTest.ExtractAddingNewDeclaration_Test.class,
jetbrains.mps.editorTest.MoveNodeRange_Test.class,
jetbrains.mps.editorTest.Post_ThisSavingClassConceptSet_Test.class,
jetbrains.mps.editorTest.BracesTest_Test.class,
jetbrains.mps.editorTest.BadCodeInTheLeftTest_Test.class,
jetbrains.mps.editorTest.RT_AssertBinaryOperation_with_colon_Test.class,
jetbrains.mps.editorTest.AddingTypeParameterToConstructor_Test.class,
jetbrains.mps.refactoringTest.ConvertAnonymousWithLocalVariables_Test.class,
jetbrains.mps.refactoringTest.SimpleFindAndMoveForIntroduceLocalVar_Test.class,
jetbrains.mps.editorTest.SubstitutionOfMethodWithNameSimularToStaticMethod_Test.class,
jetbrains.mps.editorTest.ForTest_Test.class,
jetbrains.mps.editorTest.LT_PlusExpressionRArgument_with_Mul_Test.class,
jetbrains.mps.refactoringTest.ExtractFromStatementsEndsWithReturn_Test.class,
jetbrains.mps.editorTest.DeleteOpenCurlyBrace_Test.class,
jetbrains.mps.editorTest.SmartReferenseUpdateOnChange_Test.class,
jetbrains.mps.editorTest.DotExpression_Test.class,
jetbrains.mps.editorTest.TestAutoresolve_Test.class,
jetbrains.mps.editorTest.MathE_Test.class,
jetbrains.mps.editorTest.SettingTextToNodeAfterApplingAction_Test.class,
jetbrains.mps.editorTest.FieldDeletion_Test.class,
jetbrains.mps.editorTest.ForEachTest_Test.class,
jetbrains.mps.editorTest.LT_PlusExpressionRArgument_with_Assignment_Test.class,
jetbrains.mps.refactoringTest.InlineWithoutDeclarationDeletion_Test.class,
jetbrains.mps.refactoringTest.ExtractBreak_Test.class,
jetbrains.mps.refactoringTest.InlineReferenceWithAssignment_Test.class,
jetbrains.mps.refactoringTest.ExtractFromIntention_Test.class,
jetbrains.mps.editorTest.RightTransformWithSmallPatternCompletion_Test.class,
jetbrains.mps.editorTest.RT_toArray_Test.class,
jetbrains.mps.editorTest.EnterAfterElseIf_Test.class,
jetbrains.mps.editorTest.smartStatementsInsert_Test.class,
jetbrains.mps.refactoringTest.IntroduceFinalField_Test.class,
jetbrains.mps.editorTest.PressingDelInLastPosition_Test.class,
jetbrains.mps.editorTest.SidedeleteAtStart_Test.class,
jetbrains.mps.refactoringTest.InlineMethodWithVoidType_Test.class,
jetbrains.mps.refactoringTest.InlineFromExpression_Test.class,
jetbrains.mps.refactoringTest.AddParameter_Test.class,
jetbrains.mps.editorTest.DeleteStatement_Test.class,
jetbrains.mps.refactoringTest.ExtractDifferentReturns_Test.class,
jetbrains.mps.editorTest.LT_PostfixIncrement_with_Plus_Test.class,
jetbrains.mps.refactoringTest.InlineLocalVariableReferense_Test.class,
jetbrains.mps.refactoringTest.ConvertAnonymousToStaticTest_Test.class,
jetbrains.mps.refactoringTest.ExtractDefaultClassifierMethodDeclaration_Test.class,
jetbrains.mps.refactoringTest.InlineFromConceptFunction_Test.class,
jetbrains.mps.editorTest.ActionAtFirstPostionProblem_Test.class,
jetbrains.mps.refactoringTest.InlineMethodWithReturnAtTheEnd_Test.class,
jetbrains.mps.refactoringTest.BreakStatement_Test.class,
jetbrains.mps.refactoringTest.IntroduceVariableFromAnonimousClass_Test.class,
jetbrains.mps.refactoringTest.InlineFromAnotherClass_Test.class,
jetbrains.mps.closures.test.Child_Test.class,
jetbrains.mps.closures.test.SequenceFunctionTypes_Test.class,
jetbrains.mps.closures.test.YieldClosures_Test.class,
jetbrains.mps.closures.test.Parent_Test.class,
jetbrains.mps.closures.test.AdvancedFunctionTypes_Test.class,
jetbrains.mps.closures.test.ThisExpression_Test.class,
jetbrains.mps.closures.test.ClassifierAdapters_Test.class,
jetbrains.mps.closures.test.ClosuresBase_Test.class,
jetbrains.mps.closures.test.FinalClosureParameter_Test.class,
jetbrains.mps.closures.test.ExternalReferences_Test.class,
jetbrains.mps.closures.test.FunctionTypes_Test.class,
jetbrains.mps.closures.test.WhileBreak_Test.class,
jetbrains.mps.analyzers.mpsAnalyzers.testNullable.testNullableAnalyzer_Test.class,
jetbrains.mps.baseLanguage.math.runtime.IntervalTest.class,
jetbrains.mps.refactoring.RefactoringTest.class,
tests.Match_Test.class,
tests.PerlReplace_Test.class,
tests.Statements_Test.class,
tests.Escaping_Test.class,
tests.Replace_Test.class,
jetbrains.mps.baseLanguage.collections.unittest.simple_operations.Map_Test.class,
jetbrains.mps.baseLanguage.collections.unittest.simple_operations.ListOperations_Test.class,
jetbrains.mps.baseLanguage.collections.unittest.skip_take_test.SkipTakePage_Test.class,
jetbrains.mps.baseLanguage.collections.unittest.query_operations.Mapping_Test1_Test.class,
jetbrains.mps.baseLanguage.collections.unittest.generics_test.Generics1_Test.class,
jetbrains.mps.baseLanguage.collections.unittest.simple_operations.NaiveSetOperations_Test.class,
jetbrains.mps.baseLanguage.collections.unittest.simple_operations.Null_Test.class,
jetbrains.mps.baseLanguage.collections.unittest.query_operations.Where_Select_Test1_Test.class,
jetbrains.mps.baseLanguage.collections.unittest.simple_operations.Contains_Test.class,
jetbrains.mps.baseLanguage.collections.unittest.simple_operations.Concat_Test_Test.class,
jetbrains.mps.baseLanguage.collections.unittest.simple_operations.Distinct_Test.class,
jetbrains.mps.baseLanguage.collections.unittest.simple_operations.Union_Test.class})
@RunWith(WatchingSuite.class)
public class GlobalTestSuite extends TestSuite {
  @BeforeClass
  public static void make () throws Exception {
    new MpsMakeHelper().make();
  }
}

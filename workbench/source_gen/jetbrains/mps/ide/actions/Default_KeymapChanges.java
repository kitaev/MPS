package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseKeymapChanges;
import com.intellij.openapi.actionSystem.Shortcut;
import com.intellij.openapi.actionSystem.KeyboardShortcut;
import javax.swing.KeyStroke;
import java.util.List;
import java.util.ArrayList;

public class Default_KeymapChanges extends BaseKeymapChanges {
  public Default_KeymapChanges() {
    // simple 
    addSimpleShortcut("jetbrains.mps.ide.actions.AddLanguageImport_Action", getShortcut("ctrl L"));
    addSimpleShortcut("jetbrains.mps.ide.actions.AddModelImportByRoot_Action", getShortcut("ctrl R"));
    addSimpleShortcut("jetbrains.mps.ide.actions.AddModelImport_Action", getShortcut("ctrl M"));
    addSimpleShortcut("jetbrains.mps.ide.actions.CloneModel_Action", getShortcut("shift F5"));
    addSimpleShortcut("jetbrains.mps.ide.actions.CloneRoot_Action", getShortcut("shift F5"));
    addSimpleShortcut("jetbrains.mps.ide.actions.CollapseAll_Action", getShortcut("ctrl shift SUBTRACT"), getShortcut("ctrl shift MINUS"));
    addSimpleShortcut("jetbrains.mps.ide.actions.Collapse_Action", getShortcut("ctrl SUBTRACT"), getShortcut("ctrl MINUS"));
    addSimpleShortcut("jetbrains.mps.ide.actions.CopyNodeReference_Action", getShortcut("ctrl shift C"));
    addSimpleShortcut("jetbrains.mps.ide.actions.CopyNode_Action", getShortcut("ctrl C"));
    addSimpleShortcut("jetbrains.mps.ide.actions.CutNode_Action", getShortcut("ctrl X"));
    addSimpleShortcut("jetbrains.mps.ide.actions.DeleteGenerator_Action", getShortcut(" DELETE"));
    addSimpleShortcut("jetbrains.mps.ide.actions.DeleteModels_Action", getShortcut(" DELETE"));
    addSimpleShortcut("jetbrains.mps.ide.actions.DeleteModules_Action", getShortcut(" DELETE"));
    addSimpleShortcut("jetbrains.mps.ide.actions.DeleteNode_Action", getShortcut(" DELETE"));
    addSimpleShortcut("jetbrains.mps.ide.actions.DeletePropertyAction_Action", getShortcut(" DELETE"));
    addSimpleShortcut("jetbrains.mps.ide.actions.DeleteReferenceAction_Action", getShortcut(" DELETE"));
    addSimpleShortcut("jetbrains.mps.ide.actions.DevkitProperties_Action", getShortcut("alt ENTER"));
    addSimpleShortcut("jetbrains.mps.ide.actions.EvaluateExpression_Action", getShortcut("alt F8"));
    addSimpleShortcut("jetbrains.mps.ide.actions.ExpandAll_Action", getShortcut("ctrl shift ADD"), getShortcut("ctrl shift EQUALS"));
    addSimpleShortcut("jetbrains.mps.ide.actions.Expand_Action", getShortcut("ctrl ADD"), getShortcut("ctrl EQUALS"));
    addSimpleShortcut("jetbrains.mps.ide.actions.FastFindNodeUsages_Action", getShortcut("ctrl F7"));
    addSimpleShortcut("jetbrains.mps.ide.actions.FindNext_Action", getShortcut(" F3"));
    addSimpleShortcut("jetbrains.mps.ide.actions.FindPrevious_Action", getShortcut("shift F3"));
    addSimpleShortcut("jetbrains.mps.ide.actions.FindSpecificNodeUsages_Action", getShortcut("alt F7"));
    addSimpleShortcut("jetbrains.mps.ide.actions.Find_Action", getShortcut("ctrl F"));
    addSimpleShortcut("jetbrains.mps.ide.actions.FoldSelection_Action", getShortcut("ctrl PERIOD"));
    addSimpleShortcut("jetbrains.mps.ide.actions.GenerationIntentions_Action", getShortcut("alt INSERT"));
    addSimpleShortcut("jetbrains.mps.ide.actions.GeneratorProperties_Action", getShortcut("alt ENTER"));
    addSimpleShortcut("jetbrains.mps.ide.actions.GoByCurrentReference_Action", getShortcut("ctrl B"));
    addSimpleShortcut("jetbrains.mps.ide.actions.GoToNodeById_Action", getShortcut("ctrl G"));
    addSimpleShortcut("jetbrains.mps.ide.actions.HighlightCellDependencies_Action", getShortcut("ctrl alt shift F7"));
    addSimpleShortcut("jetbrains.mps.ide.actions.HighlightInstances_Action", getShortcut("ctrl shift F6"));
    addSimpleShortcut("jetbrains.mps.ide.actions.HighlightUsages_Action", getShortcut("ctrl shift F7"));
    addSimpleShortcut("jetbrains.mps.ide.actions.LanguageProperties_Action", getShortcut("alt ENTER"));
    addSimpleShortcut("jetbrains.mps.ide.actions.MPSProjectPaths_Action", getShortcut("alt ENTER"));
    addSimpleShortcut("jetbrains.mps.ide.actions.ModelProperties_Action", getShortcut("alt ENTER"));
    addSimpleShortcut("jetbrains.mps.ide.actions.MoveFileOrDirectory_Action", getShortcut(" F6"));
    addSimpleShortcut("jetbrains.mps.ide.actions.PasteNode_Action", getShortcut("ctrl V"));
    addSimpleShortcut("jetbrains.mps.ide.actions.QuickCreate_Action", getShortcut("alt INSERT"), getShortcut("ctrl alt INSERT"));
    addSimpleShortcut("jetbrains.mps.ide.actions.RemoveFromFavorites_Action", getShortcut("ctrl DELETE"));
    addSimpleShortcut("jetbrains.mps.ide.actions.RenameFileOrDirectory_Action", getShortcut("shift F6"));
    addSimpleShortcut("jetbrains.mps.ide.actions.RenameModel_Action", getShortcut("shift F6"));
    addSimpleShortcut("jetbrains.mps.ide.actions.RenamePackage_Action", getShortcut("shift F6"));
    addSimpleShortcut("jetbrains.mps.ide.actions.RenameSolution_Action", getShortcut("shift F6"));
    addSimpleShortcut("jetbrains.mps.ide.actions.Resume_Action", getShortcut(" F9"));
    addSimpleShortcut("jetbrains.mps.ide.actions.SetBookmarkNoNumber_Action", getShortcut(" F11"));
    addSimpleShortcut("jetbrains.mps.ide.actions.ShowBookmarksDialog_Action", getShortcut("shift F11"));
    addSimpleShortcut("jetbrains.mps.ide.actions.ShowClassInHierarchy_Action", getShortcut("ctrl H"));
    addSimpleShortcut("jetbrains.mps.ide.actions.ShowConceptInHierarchy_Action", getShortcut("ctrl H"));
    addSimpleShortcut("jetbrains.mps.ide.actions.ShowImplementations_Action", getShortcut("ctrl shift I"));
    addSimpleShortcut("jetbrains.mps.ide.actions.ShowInProject_Action", getShortcut("alt F2"));
    addSimpleShortcut("jetbrains.mps.ide.actions.ShowModelChecker_Action", getShortcut("ctrl alt C"));
    addSimpleShortcut("jetbrains.mps.ide.actions.ShowNodeInExplorer_Action", getShortcut("alt F12"));
    addSimpleShortcut("jetbrains.mps.ide.actions.ShowNodeInInspector_Action", getShortcut("ctrl I"));
    addSimpleShortcut("jetbrains.mps.ide.actions.ShowNodeInfo_Action", getShortcut("ctrl Q"));
    addSimpleShortcut("jetbrains.mps.ide.actions.ShowParameters_Action", getShortcut("ctrl P"));
    addSimpleShortcut("jetbrains.mps.ide.actions.SolutionProperties_Action", getShortcut("alt ENTER"));
    addSimpleShortcut("jetbrains.mps.ide.actions.StepInto_Action", getShortcut(" F7"));
    addSimpleShortcut("jetbrains.mps.ide.actions.StepOut_Action", getShortcut("shift F8"));
    addSimpleShortcut("jetbrains.mps.ide.actions.StepOver_Action", getShortcut(" F8"));
    addSimpleShortcut("jetbrains.mps.ide.actions.SurroundWithIntentions_Action", getShortcut("ctrl alt T"));
    addSimpleShortcut("jetbrains.mps.ide.actions.ToggleBreakpoint_Action", getShortcut("ctrl F8"));
    addSimpleShortcut("jetbrains.mps.ide.actions.ViewBreakpoints_Action", getShortcut("ctrl shift F8"));
    // simple parameterized 
    addComplexShortcut("jetbrains.mps.ide.actions.FileDelete_Action", new BaseKeymapChanges.ComplexShortcut.ParameterizedSimpleShortcut(getShortcut(" DELETE")));
    addComplexShortcut("jetbrains.mps.ide.actions.GoToAction_Action", new BaseKeymapChanges.ComplexShortcut.ParameterizedSimpleShortcut(getShortcut("ctrl shift A")));
    addComplexShortcut("jetbrains.mps.ide.actions.GoToDevkit_Action", new BaseKeymapChanges.ComplexShortcut.ParameterizedSimpleShortcut(getShortcut("ctrl alt shift D")));
    addComplexShortcut("jetbrains.mps.ide.actions.GoToFile_Action", new BaseKeymapChanges.ComplexShortcut.ParameterizedSimpleShortcut(getShortcut("ctrl shift N")));
    addComplexShortcut("jetbrains.mps.ide.actions.GoToLanguage_Action", new BaseKeymapChanges.ComplexShortcut.ParameterizedSimpleShortcut(getShortcut("ctrl alt shift L")));
    addComplexShortcut("jetbrains.mps.ide.actions.GoToModel_Action", new BaseKeymapChanges.ComplexShortcut.ParameterizedSimpleShortcut(getShortcut("ctrl alt shift M")));
    addComplexShortcut("jetbrains.mps.ide.actions.GoToNamedNode_Action", new BaseKeymapChanges.ComplexShortcut.ParameterizedSimpleShortcut(getShortcut("ctrl alt shift N")));
    addComplexShortcut("jetbrains.mps.ide.actions.GoToRootNode_Action", new BaseKeymapChanges.ComplexShortcut.ParameterizedSimpleShortcut(getShortcut("ctrl N")));
    addComplexShortcut("jetbrains.mps.ide.actions.GoToSolution_Action", new BaseKeymapChanges.ComplexShortcut.ParameterizedSimpleShortcut(getShortcut("ctrl alt shift S")));
    addComplexShortcut("jetbrains.mps.ide.actions.SelectInActionAdapter_Action", new BaseKeymapChanges.ComplexShortcut.ParameterizedSimpleShortcut(getShortcut("alt F1")));
    // complex 
    addComplexShortcut("jetbrains.mps.ide.actions.GoToBookmark_Action", new Default_KeymapChanges.GoToBookmark_ShortcutChange_qjewi8_vc());
    addComplexShortcut("jetbrains.mps.ide.actions.SetBookmark_Action", new Default_KeymapChanges.SetBookmark_ShortcutChange_qjewi8_wc());
  }

  public String getScheme() {
    return "$default";
  }

  public static Shortcut getShortcut(String stroke) {
    return new KeyboardShortcut(KeyStroke.getKeyStroke(stroke), null);
  }

  public class GoToBookmark_ShortcutChange_qjewi8_vc extends BaseKeymapChanges.ComplexShortcut {
    public GoToBookmark_ShortcutChange_qjewi8_vc() {
    }

    public List<Shortcut> getShortcutsFor(Object... objects) {
      List<Shortcut> _result = new ArrayList<Shortcut>();
      _result.add(new KeyboardShortcut(KeyStroke.getKeyStroke("ctrl " + ((Integer) objects[0])), null));
      return _result;
    }
  }

  public class SetBookmark_ShortcutChange_qjewi8_wc extends BaseKeymapChanges.ComplexShortcut {
    public SetBookmark_ShortcutChange_qjewi8_wc() {
    }

    public List<Shortcut> getShortcutsFor(Object... objects) {
      List<Shortcut> _result = new ArrayList<Shortcut>();
      _result.add(new KeyboardShortcut(KeyStroke.getKeyStroke("ctrl shift " + ((Integer) objects[0])), null));
      return _result;
    }
  }
}

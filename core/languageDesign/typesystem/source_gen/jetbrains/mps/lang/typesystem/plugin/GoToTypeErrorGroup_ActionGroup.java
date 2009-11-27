package jetbrains.mps.lang.typesystem.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import java.util.Set;
import com.intellij.openapi.util.Pair;
import jetbrains.mps.workbench.ActionPlace;
import jetbrains.mps.util.Condition;
import jetbrains.mps.workbench.action.BaseAction;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import java.util.List;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DataContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.typesystem.inference.TypeChecker;
import org.jetbrains.annotations.Nullable;

public class GoToTypeErrorGroup_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(GoToTypeErrorGroup_ActionGroup.class);
  public static final String ID = "jetbrains.mps.lang.typesystem.plugin.GoToTypeErrorGroup";

  private Set<Pair<ActionPlace, Condition<BaseAction>>> myPlaces = SetSequence.fromSet(new HashSet<Pair<ActionPlace, Condition<BaseAction>>>());
  private List<AnAction> myAllActions;

  public GoToTypeErrorGroup_ActionGroup() {
    super("Go to Rule Which Caused Error", ID);
    this.setIsAlwaysVisible(false);
    this.setIsInternal(false);
    this.setPopup(true);
    try {
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void doUpdate(AnActionEvent event) {
    try {
      DataContext context = event.getDataContext();
      SNode node = MPSDataKeys.NODE.getData(context);
      if (node == null) {
        GoToTypeErrorGroup_ActionGroup.this.disable(event.getPresentation());
        return;
      }
      IErrorReporter error = TypeChecker.getInstance().getTypeMessageDontCheck(node);
      if (error == null || error.getRuleId() == null || error.getRuleModel() == null || error.getAdditionalRulesIds().isEmpty()) {
        GoToTypeErrorGroup_ActionGroup.this.disable(event.getPresentation());
        return;
      }
      GoToTypeErrorGroup_ActionGroup.this.enable(event.getPresentation());
      GoToTypeErrorGroup_ActionGroup.this.removeAll();
      jetbrains.mps.util.Pair<String, String> firstId = new jetbrains.mps.util.Pair<String, String>(error.getRuleModel(), error.getRuleId());
      GoToTypeErrorGroup_ActionGroup.this.addAction("jetbrains.mps.lang.typesystem.plugin.GoToTypeErrorRule_InGroup_Action", "jetbrains.mps.lang.typesystem", firstId, true);
      for (jetbrains.mps.util.Pair<String, String> id : error.getAdditionalRulesIdsInReverseOrder()) {
        GoToTypeErrorGroup_ActionGroup.this.addAction("jetbrains.mps.lang.typesystem.plugin.GoToTypeErrorRule_InGroup_Action", "jetbrains.mps.lang.typesystem", id, false);
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
    for (Pair<ActionPlace, Condition<BaseAction>> p : this.myPlaces) {
      this.addPlace(p.first, p.second);
    }
  }

  public void addPlace(ActionPlace place, @Nullable Condition<BaseAction> cond) {
    SetSequence.fromSet(this.myPlaces).addElement(new Pair<ActionPlace, Condition<BaseAction>>(place, cond));
  }

  public void adjust() {
    this.insertGroupIntoAnother(TypesystemActions_ActionGroup.ID, null);
    this.insertGroupIntoAnother(TypesystemNodeActions_ActionGroup.ID, null);
  }
}

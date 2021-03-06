package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.workbench.MPSDataKeys;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.ModelAccess;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import java.awt.Rectangle;
import jetbrains.mps.nodeEditor.EditorContext;
import java.awt.Point;
import com.intellij.ui.awt.RelativePoint;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class GoToInheritedClassifier_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(GoToInheritedClassifier_Action.class);

  public GoToInheritedClassifier_Action() {
    super("Go to Inherited Classifiers", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    return SNodeOperations.isInstanceOf(((SNode) MapSequence.fromMap(_params).get("classifierNode")), "jetbrains.mps.baseLanguage.structure.ClassConcept") || SNodeOperations.isInstanceOf(((SNode) MapSequence.fromMap(_params).get("classifierNode")), "jetbrains.mps.baseLanguage.structure.Interface");
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "GoToInheritedClassifier", t);
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    {
      SNode node = event.getData(MPSDataKeys.NODE);
      if (node != null) {
        if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.Classifier"))) {
          node = null;
        }
      }
      MapSequence.fromMap(_params).put("classifierNode", node);
    }
    if (MapSequence.fromMap(_params).get("classifierNode") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("editorComponent", event.getData(MPSDataKeys.EDITOR_COMPONENT));
    if (MapSequence.fromMap(_params).get("editorComponent") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("editorContext", event.getData(MPSDataKeys.EDITOR_CONTEXT));
    if (MapSequence.fromMap(_params).get("editorContext") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("context", event.getData(MPSDataKeys.OPERATION_CONTEXT));
    if (MapSequence.fromMap(_params).get("context") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("frame", event.getData(MPSDataKeys.FRAME));
    if (MapSequence.fromMap(_params).get("frame") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("project", event.getData(MPSDataKeys.PROJECT));
    if (MapSequence.fromMap(_params).get("project") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      final List<String> finderClasses = ListSequence.fromList(new ArrayList<String>());
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          if (SNodeOperations.isInstanceOf(((SNode) MapSequence.fromMap(_params).get("classifierNode")), "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
            ListSequence.fromList(finderClasses).addElement("jetbrains.mps.baseLanguage.findUsages.DerivedClasses_Finder");
          } else {
            ListSequence.fromList(finderClasses).addElement("jetbrains.mps.baseLanguage.findUsages.ImplementingClasses_Finder");
            ListSequence.fromList(finderClasses).addElement("jetbrains.mps.baseLanguage.findUsages.DerivedInterfaces_Finder");
          }
        }
      });

      final List<SNode> nodes = new ArrayList<SNode>();
      ProgressManager.getInstance().run(new Task.Modal(((Project) MapSequence.fromMap(_params).get("project")), "Searching...", true) {
        public void run(@NotNull final ProgressIndicator p) {
          ModelAccess.instance().runReadAction(new Runnable() {
            public void run() {
              for (String finderClass : ListSequence.fromList(finderClasses)) {
                ListSequence.fromList(nodes).addSequence(ListSequence.fromList(FindUtils.executeFinder(finderClass, ((SNode) MapSequence.fromMap(_params).get("classifierNode")), GlobalScope.getInstance(), p)));
              }
            }
          });
        }
      });
      final Wrappers._T<List<SNode>> nodesIncludingEnumConstants = new Wrappers._T<List<SNode>>();
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          nodesIncludingEnumConstants.value = GoToInheritedClassifier_Action.this.appendEnumConstants(nodes, _params);
        }
      });

      Rectangle cellBounds = ((EditorContext) MapSequence.fromMap(_params).get("editorContext")).getSelectedCell().getBounds();
      Point point = new Point(((int) cellBounds.getMinX()), ((int) cellBounds.getMaxY()));
      RelativePoint relPoint = new RelativePoint(((EditorComponent) MapSequence.fromMap(_params).get("editorComponent")), point);

      GoToHelper.showInheritedClassesMenu(nodesIncludingEnumConstants.value, relPoint, ((Project) MapSequence.fromMap(_params).get("project")));
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "GoToInheritedClassifier", t);
    }
  }

  private List<SNode> appendEnumConstants(List<SNode> nodes, final Map<String, Object> _params) {
    List<SNode> result = new ArrayList<SNode>();
    for (SNode node : ListSequence.fromList(nodes)) {
      ListSequence.fromList(result).addElement(node);
      if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.EnumClass")) {
        for (SNode enumConstant : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.EnumClass"), "enumConstant", true))) {
          ListSequence.fromList(result).addElement(enumConstant);
        }
      }
    }
    return result;
  }
}

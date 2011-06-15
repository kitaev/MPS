package jetbrains.mps.ide.migration.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.smodel.SModelReference;
import java.util.HashMap;
import jetbrains.mps.smodel.SModelDescriptor;
import com.intellij.openapi.project.Project;
import jetbrains.mps.project.ProjectScope;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.project.IModule;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelId;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import javax.swing.JOptionPane;
import java.awt.Frame;

public class ReResolveStubRefs_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(ReResolveStubRefs_Action.class);

  public ReResolveStubRefs_Action() {
    super("Re-resolve Stub Refs", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "ReResolveStubRefs", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("project", event.getData(MPSDataKeys.PROJECT));
    if (MapSequence.fromMap(_params).get("project") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("frame", event.getData(MPSDataKeys.FRAME));
    if (MapSequence.fromMap(_params).get("frame") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      int i = 0;
      Map<String, SModelReference> cache = MapSequence.fromMap(new HashMap<String, SModelReference>());
      for (final SModelDescriptor d : ((Project) MapSequence.fromMap(_params).get("project")).getComponent(ProjectScope.class).getModelDescriptors()) {
        if (!(d instanceof EditableSModelDescriptor)) {
          continue;
        }
        if (!(SModelStereotype.isUserModel(d))) {
          continue;
        }

        if (d == null) {
          continue;
        }
        IModule module = d.getModule();
        if (module == null) {
          continue;
        }

        Set<SModelReference> toRemove = SetSequence.fromSet(new HashSet<SModelReference>());
        for (SNode node : d.getSModel().nodes()) {
          for (SReference ref : node.getReferences()) {
            SModelId modelId = ref.getTargetSModelReference().getSModelId();
            SNodeId nodeId = ref.getTargetNodeId();

            if (modelId instanceof SModelId.RegularSModelId) {
              continue;
            }
            if (ref.getTargetNode() != null) {
              continue;
            }

            String oldId = ((SModelId.ForeignSModelId) modelId).getId();
            SModelReference replacement = null;

            SModelReference cachedReplacement = MapSequence.fromMap(cache).get(oldId);
            if (cachedReplacement != null && module.getScope().getModelDescriptor(cachedReplacement) != null) {
              replacement = cachedReplacement;
            } else {
              for (SModelDescriptor md : module.getScope().getModelDescriptors()) {
                SModelReference mdRef = md.getSModelReference();
                SModelId mdId = mdRef.getSModelId();
                if (mdId instanceof SModelId.RegularSModelId) {
                  continue;
                }
                if (!(ReResolveStubRefs_Action.this.matches(oldId, ((SModelId.ForeignSModelId) mdId).getId(), _params))) {
                  continue;
                }
                if (md.getSModel().getNodeById(nodeId) == null) {
                  continue;
                }

                replacement = md.getSModelReference();
                MapSequence.fromMap(cache).put(oldId, replacement);
                break;
              }
            }

            if (replacement != null) {
              SetSequence.fromSet(toRemove).addElement(ref.getTargetSModelReference());

              SModelReference mr = replacement;
              d.getSModel().addModelImport(mr, false);
              ref.setTargetSModelReference(mr);

              i++;
            }
          }
        }
        SetSequence.fromSet(toRemove).visitAll(new IVisitor<SModelReference>() {
          public void visit(SModelReference it) {
            d.getSModel().deleteModelImport(it);
          }
        });
      }
      JOptionPane.showMessageDialog(((Frame) MapSequence.fromMap(_params).get("frame")), i + " problems fixed");
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "ReResolveStubRefs", t);
      }
    }
  }

  /*package*/ boolean matches(String id1, String id2, final Map<String, Object> _params) {
    String id1Ste = id1.substring(0, id1.indexOf("#"));
    String id2Ste = id2.substring(0, id1.indexOf("#"));

    if (!(id1Ste.equals(id2Ste))) {
      return false;
    }

    String id1M = id1.substring(id1.lastIndexOf("#") + 1, id1.length());
    String id2M = id2.substring(id2.lastIndexOf("#") + 1, id2.length());

    if (!(id1M.equals(id2M))) {
      return false;
    }

    return true;
  }
}

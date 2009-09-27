package jetbrains.mps.refactoring.framework.paramchooser;

import com.intellij.ide.DataManager;
import com.intellij.ide.util.gotoByName.ChooseByNameModel;
import com.intellij.navigation.NavigationItem;
import com.intellij.openapi.actionSystem.DataContext;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.*;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.workbench.choose.models.BaseModelItem;
import jetbrains.mps.workbench.choose.models.BaseModelModel;
import jetbrains.mps.workbench.choose.modules.BaseModuleItem;
import jetbrains.mps.workbench.choose.modules.BaseModuleModel;
import jetbrains.mps.workbench.choose.nodes.BaseNodeItem;
import jetbrains.mps.workbench.choose.nodes.BaseNodeModel;

public abstract class ChooserType {
  public abstract ChooseByNameModel createChooserModel();

  public static class NodeChooserType extends ChooserType {
    public NodeChooserType() {
    }

    public ChooseByNameModel createChooserModel() {
      DataContext dataContext = DataManager.getInstance().getDataContext();
      final MPSProject mpsProject = MPSDataKeys.MPS_PROJECT.getData(dataContext);

      return new BaseNodeModel(mpsProject) {
        public NavigationItem doGetNavigationItem(final SNode node) {
          return new BaseNodeItem(node) {
            public void navigate(boolean requestFocus) {
            }
          };
        }

        public SNode[] find(boolean checkboxState) {
          return null;
        }

        public SNode[] find(IScope scope) {
          throw new UnsupportedOperationException("must not be used");
        }

        public boolean loadInitialCheckBoxState() {
          return false;
        }
      };
    }
  }

  public static class ModelChooserType extends ChooserType {
    public ModelChooserType() {
    }

    public ChooseByNameModel createChooserModel() {
      DataContext dataContext = DataManager.getInstance().getDataContext();
      final MPSProject mpsProject = MPSDataKeys.MPS_PROJECT.getData(dataContext);

      return new BaseModelModel(mpsProject) {
        public NavigationItem doGetNavigationItem(SModelDescriptor model) {
          return new BaseModelItem(model) {
            public void navigate(boolean requestFocus) {
            }
          };
        }

        public SModelDescriptor[] find(boolean checkboxState) {
          return SModelRepository.getInstance().getModelDescriptors().toArray(new SModelDescriptor[SModelRepository.getInstance().getModelDescriptors().size()]);
        }

        public SModelDescriptor[] find(IScope scope) {
          throw new UnsupportedOperationException("must not be used");
        }

        public boolean loadInitialCheckBoxState() {
          return false;
        }
      };
    }
  }


  public static class ModuleChooserType extends ChooserType {
    public ModuleChooserType() {
    }

    public ChooseByNameModel createChooserModel() {
      DataContext dataContext = DataManager.getInstance().getDataContext();
      final MPSProject mpsProject = MPSDataKeys.MPS_PROJECT.getData(dataContext);

      return new BaseModuleModel(mpsProject, "module") {
        public NavigationItem doGetNavigationItem(IModule module) {
          return new BaseModuleItem(module) {
            public void navigate(boolean requestFocus) {
            }
          };
        }

        public IModule[] find(boolean checkboxState) {
          return MPSModuleRepository.getInstance().getAllModules().toArray(new IModule[MPSModuleRepository.getInstance().getAllModules().size()]);
        }

        public IModule[] find(IScope scope) {
          throw new UnsupportedOperationException("must not be used");
        }

        public boolean loadInitialCheckBoxState() {
          return false;
        }
      };
    }
  }
}

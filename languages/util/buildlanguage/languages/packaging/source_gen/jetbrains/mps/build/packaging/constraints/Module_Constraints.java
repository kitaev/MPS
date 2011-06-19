package jetbrains.mps.build.packaging.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.project.ModuleId;
import jetbrains.mps.build.packaging.behavior.Module_Behavior;

public class Module_Constraints extends BaseConstraintsDescriptor {
  public Module_Constraints() {
    super("jetbrains.mps.build.packaging.structure.Module");
  }

  @Override
  protected Map<String, PropertyConstraintsDescriptor> getNotDefaultProperties() {
    Map<String, PropertyConstraintsDescriptor> properties = new HashMap();
    properties.put("name", new BasePropertyConstraintsDescriptor("name", this) {
      @Override
      public boolean hasOwnGetter() {
        return true;
      }

      @Override
      public Object getValue(SNode node, IScope scope) {
        String propertyName = "name";
        {
          if (SPropertyOperations.getString(node, "id") == null) {
            return "";
          }
          IModule module = MPSModuleRepository.getInstance().getModuleById(ModuleId.fromString(SPropertyOperations.getString(node, "id")));
          if (module == null) {
            return null;
          }
          return Module_Behavior.extractModuleProperName_1235487584035(module);
        }
      }
    });
    return properties;
  }
}

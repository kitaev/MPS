package jetbrains.mps.ide.findusages.findalgorithm.finders;

import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.MPSModuleRepository;

public class ModuleClassReference<T> {
  private ModuleReference myModuleRef;
  private String myClassName;

  public ModuleClassReference(ModuleReference moduleRef, String className) {
    myModuleRef = moduleRef;
    myClassName = className;
  }

  public ModuleReference getModuleRef() {
    return myModuleRef;
  }

  public String getClassName() {
    return myClassName;
  }

  public Class<T> loadClass() {
    IModule module = MPSModuleRepository.getInstance().getModule(myModuleRef);
    if (module == null) return null;
    Class loadedClass = module.getClass(myClassName);
    if (loadedClass == null) return null;
    return (Class<T>) loadedClass;
  }
}

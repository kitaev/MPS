package jetbrains.mps.baseLanguage.stubs;

/*Generated by MPS */

import jetbrains.mps.stubs.BaseLibStubDescriptor;
import jetbrains.mps.project.structure.model.ModelRootManager;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.reloading.CommonPaths;

public class MPS_StubDescriptor extends BaseLibStubDescriptor {
  public MPS_StubDescriptor() {
    super("MPS.Classpath", "37a3367b-1fb2-44d8-aa6b-18075e74e003", new ModelRootManager("f3061a53-9226-4cc5-a443-f952ceaf5816", "jetbrains.mps.baseLanguage.stubs.JavaStubs_MPS"));
  }

  public List<String> getPaths() {
    return ListSequence.fromListWithValues(new ArrayList<String>(), CommonPaths.getMPSPaths());
  }
}

package jetbrains.mps.make.script.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntentionsDescriptor;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.SModelReference;

public class IntentionsDescriptor extends BaseIntentionsDescriptor {
  public IntentionsDescriptor() {
    super(new ModuleReference("jetbrains.mps.make.script", "95f8a3e6-f994-4ca0-a65e-763c9bae2d3b"), SModelReference.fromString("r:5909e14d-efc7-4305-a9c5-848760da6cbc(jetbrains.mps.make.script.intentions)"));
  }

  public void init() {
    add(new Option_makeDefault_Intention(), "8626841540115943116");
  }
}

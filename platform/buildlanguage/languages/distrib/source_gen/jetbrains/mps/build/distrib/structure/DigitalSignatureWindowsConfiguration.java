package jetbrains.mps.build.distrib.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DigitalSignatureWindowsConfiguration extends BaseConcept {
  public static final String concept = "jetbrains.mps.build.distrib.structure.DigitalSignatureWindowsConfiguration";

  public DigitalSignatureWindowsConfiguration(SNode node) {
    super(node);
  }

  public static DigitalSignatureWindowsConfiguration newInstance(SModel sm, boolean init) {
    return (DigitalSignatureWindowsConfiguration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.distrib.structure.DigitalSignatureWindowsConfiguration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DigitalSignatureWindowsConfiguration newInstance(SModel sm) {
    return DigitalSignatureWindowsConfiguration.newInstance(sm, false);
  }

}

package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InputLine extends BaseConcept {
  public static final String concept = "jetbrains.mps.bash.structure.InputLine";

  public InputLine(SNode node) {
    super(node);
  }

  public static InputLine newInstance(SModel sm, boolean init) {
    return (InputLine)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.InputLine", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InputLine newInstance(SModel sm) {
    return InputLine.newInstance(sm, false);
  }
}

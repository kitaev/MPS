package jetbrains.mps.baseLanguage.regexp.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;

public class AtLeastNTimesRegexp_BehaviorDescriptor extends UnaryRegexp_BehaviorDescriptor {
  public AtLeastNTimesRegexp_BehaviorDescriptor() {
  }

  public String virtual_getString_1222432436326(SNode thisNode, List<SNode> vars) {
    return AtLeastNTimesRegexp_Behavior.virtual_getString_1222432436326(thisNode, vars);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.regexp.structure.AtLeastNTimesRegexp";
  }
}

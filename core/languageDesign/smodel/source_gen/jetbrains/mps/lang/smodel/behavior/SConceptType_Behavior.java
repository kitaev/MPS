package jetbrains.mps.lang.smodel.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.util.NameUtil;

public class SConceptType_Behavior {

  public static void init(SNode thisNode) {
  }

  public static String virtual_getPresentation_1213877396640(SNode thisNode) {
    SNode concept = SLinkOperations.getTarget(thisNode, "conceptDeclaraton", false);
    if (concept == null) {
      return "concept< >";
    } else
    {
      return "concept<" + SPropertyOperations.getString(concept, "name") + ">";
    }
  }

  public static List<String> virtual_getVariableSuffixes_1213877337304(SNode thisNode) {
    List<String> variableSuffixes = ListSequence.<String>fromArray("concept");
    if ((SLinkOperations.getTarget(thisNode, "conceptDeclaraton", false) != null)) {
      String name = NameUtil.decapitalize(SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "conceptDeclaraton", false), "name"));
      for(String element : ListSequence.fromList(NameUtil.splitByCamels(name))) {
        ListSequence.fromList(variableSuffixes).addElement(element + "Concept");
      }
    }
    return variableSuffixes;
  }

}

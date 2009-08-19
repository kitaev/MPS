package jetbrains.mps.lang.structure.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_LinkDeclaration_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_LinkDeclaration_NonTypesystemRule() {
  }

  public void applyRule(final SNode linkToCheck, final TypeCheckingContext typeCheckingContext) {
    // link role shouldn't hide roles in super-concepts
    if (SPropertyOperations.getString(linkToCheck, "role") == null) {
      return;
    }
    SNode declaringConcept = SNodeOperations.getAncestor(linkToCheck, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration", false, false);
    List<SNode> supers = SConceptOperations.getDirectSuperConcepts(declaringConcept, false);
    Iterable<SNode> linksInSupers = ListSequence.fromList(supers).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(final SNode concept) {
        return new Iterable<SNode>() {
          public Iterator<SNode> iterator() {
            return new YieldingIterator<SNode>() {
              private int __CP__ = 0;
              private List<SNode> _3_links;
              private SNode _4_link;
              private Iterator<SNode> _4_link_it;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 4:
                      this._4_link_it = ListSequence.fromList(_3_links).iterator();
                    case 5:
                      if (!(this._4_link_it.hasNext())) {
                        this.__CP__ = 1;
                        break;
                      }
                      this._4_link = this._4_link_it.next();
                      this.__CP__ = 6;
                      break;
                    case 7:
                      this.__CP__ = 5;
                      this.yield(_4_link);
                      return true;
                    case 0:
                      this._3_links = SLinkOperations.getTargets(concept, "linkDeclaration", true);
                      this.__CP__ = 4;
                      break;
                    case 6:
                      this.__CP__ = 7;
                      break;
                    default:
                      break __loop__;
                  }
                } while(true);
                return false;
              }
            };
          }
        };
      }
    });
    for (SNode link : Sequence.fromIterable(linksInSupers)) {
      if (SPropertyOperations.getString(linkToCheck, "role").equals(SPropertyOperations.getString(link, "role")) && SLinkOperations.getTarget(linkToCheck, "specializedLink", false) != link) {
        {
          BaseIntentionProvider intentionProvider = null;
          IErrorTarget errorTarget = new NodeErrorTarget();
          typeCheckingContext.reportTypeError(linkToCheck, "link '" + SPropertyOperations.getString(link, "role") + "' is already declared in " + SPropertyOperations.getString(SNodeOperations.getAncestor(link, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration", false, false), "name"), "r:00000000-0000-4000-0000-011c8959028f(jetbrains.mps.lang.structure.typesystem)", "1212181840083", intentionProvider, errorTarget);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.structure.structure.LinkDeclaration";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}

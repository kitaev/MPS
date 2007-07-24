package jetbrains.mps.bootstrap.helgins.runtime;

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.refactoring.CopyUtil;
import jetbrains.mps.patterns.IMatchingPattern;
import jetbrains.mps.project.GlobalScope;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 16.04.2007
 * Time: 13:26:18
 * To change this template use File | Settings | File Templates.
 */
public class HUtil {

  public static SNode copyIfNecessary ( SNode node, SModel model ) {
     if ( node != null && node . getParent (  ) != null ) {
        return CopyUtil.copy (node, model, false) ;
     } else {
        return node ;
     }
  }

  public static IMatchingPattern createMatchingPatternByConceptFQName(final String conceptFQName) {
    return new IMatchingPattern() {
      public boolean match(SNode nodeToMatch) {
        if (nodeToMatch == null) return false;
        return nodeToMatch.isInstanceOfConcept(conceptFQName, GlobalScope.getInstance());
      }
    };
  }

}

package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.IScope;

import java.util.List;

import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import org.jetbrains.annotations.Nullable;

public class InterfaceAncestors_Finder extends GeneratedFinder {
  public static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.InterfaceAncestors_Finder");

  public boolean isVisible() {
    return true;
  }

  public String getDescription() {
    return "Interface Ancestors";
  }

  public String getLongDescription() {
    return "";
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.Interface";
  }

  public boolean isApplicable(SNode node) {
    return !(SequenceOperations.isEmpty(SLinkOperations.getTargets(node, "extendedInterface", true)));
  }

  protected void doFind(SNode node, IScope scope, List<SNode> _results) {
    SNode current = node;
    {
      ICursor<SNode> _zCursor17 = CursorFactory.createCursor(SLinkOperations.getTargets(current, "extendedInterface", true));
      try {
        while (_zCursor17.moveToNext()) {
          SNode ancestor = _zCursor17.getCurrent();
          ListOperations.addElement(_results, ancestor);
          {
            ICursor<SNode> _zCursor18 = CursorFactory.createCursor(this.executeFinder("jetbrains.mps.baseLanguage.findUsages.InterfaceAncestors_Finder", ancestor, scope));
            try {
              while (_zCursor18.moveToNext()) {
                SNode ancestorAncestor = _zCursor18.getCurrent();
                ListOperations.addElement(_results, ancestorAncestor);
              }
            } finally {
              _zCursor18.release();
            }
          }
        }
      } finally {
        _zCursor17.release();
      }
    }
  }

  public void getSearchedNodes(SNode node, IScope scope, List<SNode> _results) {
    ListOperations.addElement(_results, node);
  }

  public String getNodeCategory(SNode node) {
    return "Ancestor";
  }

  @Nullable()
  public String getNodePresentation(SNode node) {
    return null;
  }

}

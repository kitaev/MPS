package jetbrains.mps.smodel.action;

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;

/**
 * Created by IntelliJ IDEA.
 * User: Igoor
 * Date: Mar 7, 2006
 * Time: 2:24:52 PM
 * To change this template use File | Settings | File Templates.
 */
public interface IChildNodeSetter {
  public void doExecute(SNode parentNode, SNode oldChild, SNode newChild, IScope scope);
  public SNode execute(SNode parentNode, SNode oldChild, SNode newChild, IScope scope);
}

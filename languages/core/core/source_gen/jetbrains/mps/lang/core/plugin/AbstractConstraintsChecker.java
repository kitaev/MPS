package jetbrains.mps.lang.core.plugin;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;

public abstract class AbstractConstraintsChecker {
  public AbstractConstraintsChecker() {
  }

  public abstract void checkNode(SNode node, LanguageErrorsComponent component, IOperationContext operationContext);
}

package jetbrains.mps.make.script;

/*Generated by MPS */

import jetbrains.mps.make.facet.ITarget;

public interface IParametersPool {
  public <T> T parameters(ITarget.Name target, Class<T> cls);
  public void setPredecessor(IParametersPool ppool);
}

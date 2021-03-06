package jetbrains.mps.ide.dataFlow.presentation;

/*Generated by MPS */


public interface IGraphCreator<T extends IInstruction<T>> {
  public IBlock<T> createBlock(T instruction, int x, int y, int width, int height);
  public IBlock<T> findBlockWith(IInstruction<T> instruction);
}

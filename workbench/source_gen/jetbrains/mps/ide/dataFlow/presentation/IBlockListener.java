package jetbrains.mps.ide.dataFlow.presentation;

/*Generated by MPS */

import java.awt.event.MouseEvent;

public interface IBlockListener<T extends IInstruction<T>> {
  public void mousePressed(MouseEvent event, IInstruction<T> instruction);
}

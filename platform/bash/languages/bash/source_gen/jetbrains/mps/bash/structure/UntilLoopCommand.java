package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class UntilLoopCommand extends AbstractLoopCommand {
  public static final String concept = "jetbrains.mps.bash.structure.UntilLoopCommand";
  public static final String TEST_COMMAND = "testCommand";

  public UntilLoopCommand(SNode node) {
    super(node);
  }

  public AbstractCommand getTestCommand() {
    return (AbstractCommand)this.getChild(AbstractCommand.class, UntilLoopCommand.TEST_COMMAND);
  }

  public void setTestCommand(AbstractCommand node) {
    super.setChild(UntilLoopCommand.TEST_COMMAND, node);
  }

  public static UntilLoopCommand newInstance(SModel sm, boolean init) {
    return (UntilLoopCommand)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.UntilLoopCommand", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static UntilLoopCommand newInstance(SModel sm) {
    return UntilLoopCommand.newInstance(sm, false);
  }
}

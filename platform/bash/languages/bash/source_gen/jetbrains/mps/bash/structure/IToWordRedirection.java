package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.INodeAdapter;

public interface IToWordRedirection extends INodeAdapter {
  public static final String concept = "jetbrains.mps.bash.structure.IToWordRedirection";
  public static final String WORD = "word";

  public GeneralizedWord getWord();
  public void setWord(GeneralizedWord node);
}

package jetbrains.mps.baseLanguage.builders.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.INodeAdapter;
import jetbrains.mps.baseLanguage.structure.StatementList;

public interface BuilderContainer extends INodeAdapter {
  public static final String concept = "jetbrains.mps.baseLanguage.builders.structure.BuilderContainer";
  public static final String BUILDER = "builder";
  public static final String BODY = "body";

  public Builder getBuilder();
  public void setBuilder(Builder node);
  public StatementList getBody();
  public void setBody(StatementList node);
}

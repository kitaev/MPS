package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.collections.structure.SequenceOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ChunkOperation extends SequenceOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.ChunkOperation";
  public static final String LENGTH = "length";

  public ChunkOperation(SNode node) {
    super(node);
  }

  public Expression getLength() {
    return (Expression)this.getChild(Expression.class, ChunkOperation.LENGTH);
  }

  public void setLength(Expression node) {
    super.setChild(ChunkOperation.LENGTH, node);
  }


  public static ChunkOperation newInstance(SModel sm, boolean init) {
    return (ChunkOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ChunkOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ChunkOperation newInstance(SModel sm) {
    return ChunkOperation.newInstance(sm, false);
  }

}

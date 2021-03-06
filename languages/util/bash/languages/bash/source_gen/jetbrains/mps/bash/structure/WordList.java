package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class WordList extends BaseConcept {
  public static final String concept = "jetbrains.mps.bash.structure.WordList";
  public static final String WORDS = "words";

  public WordList(SNode node) {
    super(node);
  }

  public int getWordsesCount() {
    return this.getChildCount(WordList.WORDS);
  }

  public Iterator<GeneralizedWord> wordses() {
    return this.children(GeneralizedWord.class, WordList.WORDS);
  }

  public List<GeneralizedWord> getWordses() {
    return this.getChildren(GeneralizedWord.class, WordList.WORDS);
  }

  public void addWords(GeneralizedWord node) {
    this.addChild(WordList.WORDS, node);
  }

  public void insertWords(GeneralizedWord prev, GeneralizedWord node) {
    this.insertChild(prev, WordList.WORDS, node);
  }

  public static WordList newInstance(SModel sm, boolean init) {
    return (WordList) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.WordList", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static WordList newInstance(SModel sm) {
    return WordList.newInstance(sm, false);
  }
}

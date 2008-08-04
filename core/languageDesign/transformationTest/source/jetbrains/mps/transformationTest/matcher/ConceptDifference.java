package jetbrains.mps.transformationTest.matcher;

/**
 * Created by IntelliJ IDEA.
 */
public class ConceptDifference extends DifferanceItem {
  public String myConcept1;
  public String myConcept2;

  public ConceptDifference(String concept1, String concept2) {
    myConcept1 = concept1;
    myConcept2 = concept2;
  }

  public String toString() {
    return "Different concepts: " + myConcept1 + ", " + myConcept2;
  }

  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (!(obj instanceof ConceptDifference)) {
      return false;
    }
    ConceptDifference diff = (ConceptDifference)obj;
    return myConcept1.equals(diff.myConcept1) && myConcept2.equals(diff.myConcept2);
  }
}

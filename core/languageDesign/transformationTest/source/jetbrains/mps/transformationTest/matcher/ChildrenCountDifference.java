package jetbrains.mps.transformationTest.matcher;

/**
 * Created by IntelliJ IDEA.
 */
public class ChildrenCountDifference extends DifferanceItem {
  private String myRole;
  private int myCount1;
  private int myCount2;

  public ChildrenCountDifference(String role, int c1, int c2) {
    myRole = role;
    myCount1 = c1;
    myCount2 = c2;
  }

  public String toString() {
    return "Different children count in role: " + myRole + " [" + myCount1 + ", " + myCount2 + "]";
  }

  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (!(obj instanceof ChildrenCountDifference)) {
      return false;
    }
    ChildrenCountDifference diff = (ChildrenCountDifference) obj;
    return myRole.equals(diff.myRole) && myCount1 == diff.myCount1 && myCount2 == diff.myCount2; 
  }
}

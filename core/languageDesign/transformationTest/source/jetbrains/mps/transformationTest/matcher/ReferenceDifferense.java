package jetbrains.mps.transformationTest.matcher;

/**
 * Created by IntelliJ IDEA.
 */
public class ReferenceDifferense extends DifferanceItem {
  private String myRole;
  private boolean myInternal;

  public ReferenceDifferense(String role, boolean internal) {
    myRole = role;
    myInternal = internal;
  }

  public String toString() {
    if (myInternal) {
      return "Different internal reference of role: " + myRole;
    } {
      return "Different external reference of role: " + myRole;
    }
  }

  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (!(obj instanceof ReferenceDifferense)) {
      return false;
    }
    ReferenceDifferense diff = (ReferenceDifferense)obj;
    return myRole.equals(diff.myRole) && myInternal == diff.myInternal;

  }
}

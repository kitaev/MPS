package jetbrains.mps.transformationTest.matcher;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Evgeny.Kurbatsky
 * Date: 15.05.2008
 * Time: 13:51:26
 * To change this template use File | Settings | File Templates.
 */
public class NodeDifference extends DifferanceItem {
  private String myName;
  private List<DifferanceItem> myDifference = new ArrayList<DifferanceItem>();

  public NodeDifference(String name, List<DifferanceItem> diffs) {
    this.myName = name;
    myDifference = new ArrayList<DifferanceItem>(diffs);
  }

  public String toString(int deep) {
    String pref = "";
    for (int i = 0; i < deep; i++) {
      pref += "  ";
    }
    StringBuffer buff = new StringBuffer();
    buff.append(pref + "Node: " + myName + "\n");
    for (DifferanceItem item: myDifference) {
      if (item instanceof NodeDifference) {
        buff.append(((NodeDifference)item).toString(deep + 1));
      } else {
        buff.append(pref + "  " + item + "\n");
      }
    }
    return buff.toString();
  }

  public String toString() {
    return toString(0);
  }

  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (!(obj instanceof NodeDifference)) {
      return false;
    }
    NodeDifference diff = (NodeDifference)obj;
    if (myName == null || ! myName.equals(diff.myName)) {
      return false;
    }

    if (! myDifference.equals(diff.myDifference)) {
      return false;
    }
    return true;
  }
}


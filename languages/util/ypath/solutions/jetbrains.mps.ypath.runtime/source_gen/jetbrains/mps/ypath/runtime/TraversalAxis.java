package jetbrains.mps.ypath.runtime;

/*Generated by MPS */

import java.util.List;
import java.util.LinkedList;

public enum TraversalAxis {
  DESCENDANTS("descendants", "DESCENDANTS"),
  SELF_DESCENDANTS("self and descendants", "SELF_DESCENDANTS"),
  CHILDREN("children", "CHILDREN"),
  ANCESTORS("ancestors", "ANCESTORS"),
  SELF_ANCESTORS("self and ancestors", "SELF_ANCESTORS"),
  FOLLOWING_SIBLINGS("following siblings", "FOLLOWING_SIBLINGS"),
  SELF_FOLLOWING_SIBLINGS("self and following siblings", "SELF_FOLLOWING_SIBLINGS"),
  PRECEDING_SIBLINGS("preceding siblings", "PRECEDING_SIBLINGS"),
  PRECEDING_SIBLINGS_SELF("preceding siblings and self", "PRECEDING_SIBLINGS_SELF");

  /*package*/ String myName;
  /*package*/ String myValue;

  TraversalAxis(String name, String value) {
    this.myName = name;
    this.myValue = value;
  }

  public String getName() {
    return this.myName;
  }

  public String getValueAsString() {
    return this.myValue;
  }

  public String getValue() {
    return this.myValue;
  }

  public static List<TraversalAxis> getConstants() {
    List<TraversalAxis> list = new LinkedList<TraversalAxis>();
    list.add(DESCENDANTS);
    list.add(SELF_DESCENDANTS);
    list.add(CHILDREN);
    list.add(ANCESTORS);
    list.add(SELF_ANCESTORS);
    list.add(FOLLOWING_SIBLINGS);
    list.add(SELF_FOLLOWING_SIBLINGS);
    list.add(PRECEDING_SIBLINGS);
    list.add(PRECEDING_SIBLINGS_SELF);
    return list;
  }

  public static TraversalAxis getDefault() {
    return DESCENDANTS;
  }

  public static TraversalAxis parseValue(String value) {
    if (value == null) {
      return TraversalAxis.getDefault();
    }
    if (value.equals(DESCENDANTS.getValueAsString())) {
      return DESCENDANTS;
    }
    if (value.equals(SELF_DESCENDANTS.getValueAsString())) {
      return SELF_DESCENDANTS;
    }
    if (value.equals(CHILDREN.getValueAsString())) {
      return CHILDREN;
    }
    if (value.equals(ANCESTORS.getValueAsString())) {
      return ANCESTORS;
    }
    if (value.equals(SELF_ANCESTORS.getValueAsString())) {
      return SELF_ANCESTORS;
    }
    if (value.equals(FOLLOWING_SIBLINGS.getValueAsString())) {
      return FOLLOWING_SIBLINGS;
    }
    if (value.equals(SELF_FOLLOWING_SIBLINGS.getValueAsString())) {
      return SELF_FOLLOWING_SIBLINGS;
    }
    if (value.equals(PRECEDING_SIBLINGS.getValueAsString())) {
      return PRECEDING_SIBLINGS;
    }
    if (value.equals(PRECEDING_SIBLINGS_SELF.getValueAsString())) {
      return PRECEDING_SIBLINGS_SELF;
    }
    return TraversalAxis.getDefault();
  }
}

package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;

public enum TraversalAxis {
  DESCENDANTS("DESCENDANTS", "DESCENDANTS"),
  SELF_DESCENDANTS("SELF_DESCENDANTS", "SELF_DESCENDANTS"),
  CHILDREN("CHILDREN", "CHILDREN"),
  ANCESTORS("ANCESTORS", "ANCESTORS"),
  SELF_ANCESTORS("SELF_ANCESTORS", "SELF_ANCESTORS"),
  FOLLOWING_SIBLINGS("FOLLOWING_SIBLINGS", "FOLLOWING_SIBLINGS"),
  SELF_FOLLOWING_SIBLINGS("SELF_FOLLOWING_SIBLINGS", "SELF_FOLLOWING_SIBLINGS"),
  PRECEDING_SIBLINGS("PRECEDING_SIBLINGS", "PRECEDING_SIBLINGS"),
  PRECEDING_SIBLINGS_SELF("PRECEDING_SIBLINGS_SELF", "PRECEDING_SIBLINGS_SELF");

  private String myName;
  private String myValue;

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
    List<TraversalAxis> list = ListSequence.fromList(new LinkedList<TraversalAxis>());
    ListSequence.fromList(list).addElement(TraversalAxis.DESCENDANTS);
    ListSequence.fromList(list).addElement(TraversalAxis.SELF_DESCENDANTS);
    ListSequence.fromList(list).addElement(TraversalAxis.CHILDREN);
    ListSequence.fromList(list).addElement(TraversalAxis.ANCESTORS);
    ListSequence.fromList(list).addElement(TraversalAxis.SELF_ANCESTORS);
    ListSequence.fromList(list).addElement(TraversalAxis.FOLLOWING_SIBLINGS);
    ListSequence.fromList(list).addElement(TraversalAxis.SELF_FOLLOWING_SIBLINGS);
    ListSequence.fromList(list).addElement(TraversalAxis.PRECEDING_SIBLINGS);
    ListSequence.fromList(list).addElement(TraversalAxis.PRECEDING_SIBLINGS_SELF);
    return list;
  }

  public static TraversalAxis getDefault() {
    return TraversalAxis.DESCENDANTS;
  }

  public static TraversalAxis parseValue(String value) {
    if (value == null) {
      return TraversalAxis.getDefault();
    }
    if (value.equals(TraversalAxis.DESCENDANTS.getValueAsString())) {
      return TraversalAxis.DESCENDANTS;
    }
    if (value.equals(TraversalAxis.SELF_DESCENDANTS.getValueAsString())) {
      return TraversalAxis.SELF_DESCENDANTS;
    }
    if (value.equals(TraversalAxis.CHILDREN.getValueAsString())) {
      return TraversalAxis.CHILDREN;
    }
    if (value.equals(TraversalAxis.ANCESTORS.getValueAsString())) {
      return TraversalAxis.ANCESTORS;
    }
    if (value.equals(TraversalAxis.SELF_ANCESTORS.getValueAsString())) {
      return TraversalAxis.SELF_ANCESTORS;
    }
    if (value.equals(TraversalAxis.FOLLOWING_SIBLINGS.getValueAsString())) {
      return TraversalAxis.FOLLOWING_SIBLINGS;
    }
    if (value.equals(TraversalAxis.SELF_FOLLOWING_SIBLINGS.getValueAsString())) {
      return TraversalAxis.SELF_FOLLOWING_SIBLINGS;
    }
    if (value.equals(TraversalAxis.PRECEDING_SIBLINGS.getValueAsString())) {
      return TraversalAxis.PRECEDING_SIBLINGS;
    }
    if (value.equals(TraversalAxis.PRECEDING_SIBLINGS_SELF.getValueAsString())) {
      return TraversalAxis.PRECEDING_SIBLINGS_SELF;
    }
    return TraversalAxis.getDefault();
  }

}

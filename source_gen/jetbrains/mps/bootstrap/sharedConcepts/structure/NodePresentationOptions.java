package jetbrains.mps.bootstrap.sharedConcepts.structure;

/*Generated by MPS */

import java.util.List;
import java.util.LinkedList;

public enum NodePresentationOptions {
  default_("<default>", null),
  referent_("<referent node>", "default_referent"),
  custom_("<custom>", "custom");

  /* package */String myName;
  /* package */String myValue;

 NodePresentationOptions(String name, String value) {
    this.myName = name;
    this.myValue = value;
  }

  public static List<NodePresentationOptions> getConstants() {
    List<NodePresentationOptions> list = new LinkedList<NodePresentationOptions>();
    list.add(NodePresentationOptions.default_);
    list.add(NodePresentationOptions.referent_);
    list.add(NodePresentationOptions.custom_);
    return list;
  }

  public static NodePresentationOptions getDefault() {
    return NodePresentationOptions.default_;
  }

  public static NodePresentationOptions parseValue(String value) {
    if(value == null) {
      return NodePresentationOptions.getDefault();
    }
    if(value.equals(NodePresentationOptions.default_.getValueAsString())) {
      return NodePresentationOptions.default_;
    }
    if(value.equals(NodePresentationOptions.referent_.getValueAsString())) {
      return NodePresentationOptions.referent_;
    }
    if(value.equals(NodePresentationOptions.custom_.getValueAsString())) {
      return NodePresentationOptions.custom_;
    }
    return NodePresentationOptions.getDefault();
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

}

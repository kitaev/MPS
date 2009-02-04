/*
 * Copyright 2003-2009 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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

  /* package */String myName;
  /* package */String myValue;

 TraversalAxis(String name, String value) {
    this.myName = name;
    this.myValue = value;
  }

  public static List<TraversalAxis> getConstants() {
    List<TraversalAxis> list = new LinkedList<TraversalAxis>();
    list.add(TraversalAxis.DESCENDANTS);
    list.add(TraversalAxis.SELF_DESCENDANTS);
    list.add(TraversalAxis.CHILDREN);
    list.add(TraversalAxis.ANCESTORS);
    list.add(TraversalAxis.SELF_ANCESTORS);
    list.add(TraversalAxis.FOLLOWING_SIBLINGS);
    list.add(TraversalAxis.SELF_FOLLOWING_SIBLINGS);
    list.add(TraversalAxis.PRECEDING_SIBLINGS);
    list.add(TraversalAxis.PRECEDING_SIBLINGS_SELF);
    return list;
  }
  public static TraversalAxis getDefault() {
    return TraversalAxis.DESCENDANTS;
  }
  public static TraversalAxis parseValue(String value) {
    if(value == null) {
      return TraversalAxis.getDefault();
    }
    if(value.equals(TraversalAxis.DESCENDANTS.getValueAsString())) {
      return TraversalAxis.DESCENDANTS;
    }
    if(value.equals(TraversalAxis.SELF_DESCENDANTS.getValueAsString())) {
      return TraversalAxis.SELF_DESCENDANTS;
    }
    if(value.equals(TraversalAxis.CHILDREN.getValueAsString())) {
      return TraversalAxis.CHILDREN;
    }
    if(value.equals(TraversalAxis.ANCESTORS.getValueAsString())) {
      return TraversalAxis.ANCESTORS;
    }
    if(value.equals(TraversalAxis.SELF_ANCESTORS.getValueAsString())) {
      return TraversalAxis.SELF_ANCESTORS;
    }
    if(value.equals(TraversalAxis.FOLLOWING_SIBLINGS.getValueAsString())) {
      return TraversalAxis.FOLLOWING_SIBLINGS;
    }
    if(value.equals(TraversalAxis.SELF_FOLLOWING_SIBLINGS.getValueAsString())) {
      return TraversalAxis.SELF_FOLLOWING_SIBLINGS;
    }
    if(value.equals(TraversalAxis.PRECEDING_SIBLINGS.getValueAsString())) {
      return TraversalAxis.PRECEDING_SIBLINGS;
    }
    if(value.equals(TraversalAxis.PRECEDING_SIBLINGS_SELF.getValueAsString())) {
      return TraversalAxis.PRECEDING_SIBLINGS_SELF;
    }
    return TraversalAxis.getDefault();
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

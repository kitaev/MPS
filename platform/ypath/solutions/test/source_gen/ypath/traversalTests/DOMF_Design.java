/*
 * Copyright 2003-2008 JetBrains s.r.o.
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
package ypath.traversalTests;

/*Generated by MPS */

import jetbrains.mps.ypath.design.IParameterizedFeatureDesign;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISequenceClosure;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;

public class DOMF_Design {
  public static class Design_Feature_child extends IParameterizedFeatureDesign.Stub<String> implements IParameterizedFeatureDesign<String> {

    public Iterable<String> getParameters(SNode nodeType) {
      return Sequence.fromClosure(new ISequenceClosure <String>() {

        public Iterable<String> iterable() {
          return new Iterable <String>() {

            public Iterator<String> iterator() {
              return new YieldingIterator <String>() {

                private int __CP__ = 0;

                protected boolean moveToNext() {
__loop__:
                  do {
__switch__:
                    switch (this.__CP__) {
                      case -1:
                        assert false : "Internal error";
                        return false;
                      case 2:
                        this.__CP__ = 3;
                        this.yield("foo");
                        return true;
                      case 3:
                        this.__CP__ = 4;
                        this.yield("bar");
                        return true;
                      case 4:
                        this.__CP__ = 1;
                        this.yield("baz");
                        return true;
                      case 0:
                        this.__CP__ = 2;
                        break;
                      default:
                        break __loop__;
                    }
                  } while(true);
                  return false;
                }

              };
            }

          };
        }

      });
    }

    public SNode getTargetType(String param, SNode nodeType) {
      return new _Quotations.QuotationClass_0().createNode();
    }

    public String parameterToString(String param) {
      return param;
    }

}

}

/*
 * Copyright 2003-2011 JetBrains s.r.o.
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
package jetbrains.mps.debug.runtime.java.programState.proxies;

import jetbrains.mps.util.annotation.ToRemove;

import java.util.ArrayList;
import java.util.List;

@Deprecated
@ToRemove(version = 2.0)
public class CustomViewersDescriptor {
  protected List<ValueWrapperFactory> myValueWrapperFactories = new ArrayList<ValueWrapperFactory>();

  public List<ValueWrapperFactory> getValueWrapperFactories() {
    return new ArrayList<ValueWrapperFactory>(myValueWrapperFactories);
  }
}

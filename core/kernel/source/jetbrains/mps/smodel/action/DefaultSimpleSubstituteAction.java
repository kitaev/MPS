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
package jetbrains.mps.smodel.action;

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;

public abstract class DefaultSimpleSubstituteAction extends DefaultChildNodeSubstituteAction {
  public DefaultSimpleSubstituteAction(Object parameterObject, SNode parentNode, SNode currentChild, IChildNodeSetter setter, IScope scope) {
    super(parameterObject, parentNode, currentChild, setter, scope);
  }

  public boolean hasSubstitute() {
    return false;
  }

  public boolean canSubstituteStrictly(String pattern) {
    if (hasSubstitute()) {
      return canSubstitute_internal(pattern, true);
    }
    return super.canSubstituteStrictly(pattern);
  }

  public boolean canSubstitute(String pattern) {
    if (hasSubstitute()) {
      return canSubstitute_internal(pattern, false);
    }
    return super.canSubstitute(pattern);
  }

  protected boolean canSubstitute_internal(String pattern, boolean strictly) {
    return false;
  }
}

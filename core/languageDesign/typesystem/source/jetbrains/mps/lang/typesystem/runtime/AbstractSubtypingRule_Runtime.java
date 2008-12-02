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
package jetbrains.mps.lang.typesystem.runtime;

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.CollectionUtil;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 29.03.2007
 * Time: 10:15:53
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractSubtypingRule_Runtime implements ISubtypingRule_Runtime {


  public List<SNode> getSubOrSuperTypes(SNode type) {
    SNode subOrSuperType = getSubOrSuperType(type);
    if (subOrSuperType == null) {
      return new ArrayList<SNode>(0);
    }
    return CollectionUtil.list(subOrSuperType);
  }

  public SNode getSubOrSuperType(SNode type) {
    return null;
  }

  public boolean isWeak() {
    return false;
  }
}

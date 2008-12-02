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
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 10.10.2008
 * Time: 15:13:23
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractInequationReplacementRule_Runtime extends InequationReplacementRule_Runtime {
  public void processInequation(SNode subtype, SNode supertype, EquationInfo errorInfo) {
    processInequation(subtype, supertype, errorInfo, null);
  }

  public abstract void processInequation(SNode subtype, SNode supertype, EquationInfo errorInfo, TypeCheckingContext typeCheckingContext);
}

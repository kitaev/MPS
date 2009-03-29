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
package jetbrains.mps.lang.typesystem.runtime;

import jetbrains.mps.lang.structure.structure.ConceptDeclaration;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 16.04.2007
 * Time: 15:33:37
 * To change this template use File | Settings | File Templates.
 */
public class CheckingRuleSet<T extends ICheckingRule_Runtime> extends RuleSet<T> {

  public void makeConsistent() {
    /*
    for (AbstractConceptDeclaration conceptDeclaration : myRules.keySet()) {
      if (conceptDeclaration == null) {
        continue;
      }
      Set<T> rules = myRules.get(conceptDeclaration);
      if (rules == null) continue;
      if(!(conceptDeclaration instanceof ConceptDeclaration)) continue;
      ConceptDeclaration parent = ((ConceptDeclaration)conceptDeclaration).getExtends();

      boolean b = false;
      for (T rule_runtime : rules) {
        if (rule_runtime.overrides()) {
          b = true;
          break;
        }
      }
      if (b) continue;


      while (parent != null) {
        Set<T> parentRules = myRules.get(parent);
        if (parentRules != null) {
          rules.addAll(parentRules);
        }
        boolean b1 = false;
        if (parentRules != null) {
          for (T rule_runtime : parentRules) {
            if (rule_runtime.overrides()) {
              b1 = true;
              break;
            }
          }
        }
        if (b1) break;
        parent = parent.getExtends();
      }
    }
    */
  }
}

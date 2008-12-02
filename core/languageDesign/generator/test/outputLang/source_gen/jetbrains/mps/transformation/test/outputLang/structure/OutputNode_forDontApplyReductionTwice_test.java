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
package jetbrains.mps.transformation.test.outputLang.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class OutputNode_forDontApplyReductionTwice_test extends OutputNode {
  public static final String concept = "jetbrains.mps.transformation.test.outputLang.structure.OutputNode_forDontApplyReductionTwice_test";

  public OutputNode_forDontApplyReductionTwice_test(SNode node) {
    super(node);
  }

  public static OutputNode_forDontApplyReductionTwice_test newInstance(SModel sm, boolean init) {
    return (OutputNode_forDontApplyReductionTwice_test)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.transformation.test.outputLang.structure.OutputNode_forDontApplyReductionTwice_test", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static OutputNode_forDontApplyReductionTwice_test newInstance(SModel sm) {
    return OutputNode_forDontApplyReductionTwice_test.newInstance(sm, false);
  }

}

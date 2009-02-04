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
package jetbrains.mps.transformation.test.inputLang.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InputNode_A extends InputNode {
  public static final String concept = "jetbrains.mps.transformation.test.inputLang.structure.InputNode_A";
  public static final String OPTION = "option";

  public InputNode_A(SNode node) {
    super(node);
  }

  public Option getOption() {
    String value = super.getProperty(InputNode_A.OPTION);
    return Option.parseValue(value);
  }

  public void setOption(Option value) {
    super.setProperty(InputNode_A.OPTION, value.getValueAsString());
  }


  public static InputNode_A newInstance(SModel sm, boolean init) {
    return (InputNode_A)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.transformation.test.inputLang.structure.InputNode_A", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InputNode_A newInstance(SModel sm) {
    return InputNode_A.newInstance(sm, false);
  }

}

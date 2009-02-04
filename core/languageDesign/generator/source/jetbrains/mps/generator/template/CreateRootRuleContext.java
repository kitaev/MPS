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
package jetbrains.mps.generator.template;

import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;

public class CreateRootRuleContext extends TemplateQueryContext {
  private SNode myRule;

  public CreateRootRuleContext(SNode ruleNode, ITemplateGenerator generator) {
    super(null, null, generator);
    myRule = ruleNode;
  }

  public SNode getRuleNodeForLogging() {
    return myRule;
  }
}

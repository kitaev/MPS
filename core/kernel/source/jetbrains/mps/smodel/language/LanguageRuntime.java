/*
 * Copyright 2003-2010 JetBrains s.r.o.
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
package jetbrains.mps.smodel.language;

import jetbrains.mps.generator.runtime.TemplateModule;
import jetbrains.mps.ide.findusages.BaseFindUsagesDescriptor;
import jetbrains.mps.lang.typesystem.runtime.IHelginsDescriptor;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.structure.*;

import java.util.Collection;

/**
 * evgeny, 3/11/11
 */
public abstract class LanguageRuntime {
  public abstract String getNamespace();

  public IHelginsDescriptor getTypesystem() {
    // TODO generate
    return new LanguageRuntimeInterpreted(MPSModuleRepository.getInstance().getLanguage(getNamespace())).getTypesystem();
  }

  public BaseFindUsagesDescriptor getFindUsages() {
    return null;
  }

  public abstract Collection<TemplateModule> getGenerators();

  public DescriptorProvider<StructureDescriptor> getStructureAspect() {
    return LanguageRuntimeInterpreted.STRUCTURE_PROVIDER;
  }

  public DescriptorProvider<BehaviorDescriptor> getBehaviorAspect() {
    return LanguageRuntimeInterpreted.BEHAVIOR_PROVIDER;
  }

  public DescriptorProvider<ConstraintsDescriptor> getConstraintsAspect() {
    return LanguageRuntimeInterpreted.CONSTRAINTS_PROVIDER;
  }

  protected <T> DescriptorProvider<T> getAspectDescriptorByClassName(String className) {
    try {
      return (DescriptorProvider<T>) MPSModuleRepository.getInstance().getLanguage(getNamespace()).getClass(className).newInstance();
    } catch (Throwable t) {
      return null;
    }
  }
}

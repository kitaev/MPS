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
package jetbrains.mps.project.structure.modules.mappingpriorities;

import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.project.structure.modules.RefUpdateUtil;

import java.util.List;
import java.util.ArrayList;

public class MappingConfig_ExternalRef extends MappingConfig_AbstractRef {
  private ModuleReference myGenerator;
  private MappingConfig_AbstractRef myMappingConfig;

  public MappingConfig_ExternalRef() {
    myMappingConfig = new MappingConfig_AbstractRef();
  }

  public ModuleReference getGenerator() {
    return myGenerator;
  }

  public void setGenerator(ModuleReference generator) {
    myGenerator = generator;
  }

  public MappingConfig_AbstractRef getMappingConfig() {
    return myMappingConfig;
  }

  public void setMappingConfig(MappingConfig_AbstractRef ref) {
    myMappingConfig = ref;
  }

  public MappingConfig_ExternalRef getCopy() {
    MappingConfig_ExternalRef result = new MappingConfig_ExternalRef();
    result.myGenerator = myGenerator;
    result.myMappingConfig = myMappingConfig != null ? myMappingConfig.getCopy() : null;
    return result;
  }

  @Override
  public boolean isIncomplete() {
    if (myGenerator == null) return false;
    return myMappingConfig.isIncomplete();
  }

  @Override
  public boolean updateModuleReferences() {
    List<ModuleReference> list = new ArrayList<ModuleReference>();
    list.add(myGenerator);
    boolean result = RefUpdateUtil.updateModuleRefs(list);
    myGenerator = list.get(0);
    return result;
  }
}

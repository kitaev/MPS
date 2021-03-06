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

package jetbrains.mps.ide.projectPane.fileSystem.nodes;

import com.intellij.openapi.project.Project;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.IScope;
import org.jetbrains.annotations.NotNull;

import java.awt.Frame;

class NullOperationContext implements IOperationContext {
  public NullOperationContext() {
  }

  public Project getProject() {
    return null;
  }

  public IModule getModule() {
    return null;
  }

  @NotNull
  public IScope getScope() {
    return GlobalScope.getInstance();
  }

  public Frame getMainFrame() {
    return null;
  }

  public boolean isValid() {
    return true;
  }

  public boolean isTestMode() {
    return false;
  }

  public <T> T getComponent(Class<T> clazz) {
    return null;
  }
}

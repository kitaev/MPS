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
package jetbrains.mps.lang.generator.plugin.debug;

import jetbrains.mps.ide.ui.MPSTree;
import jetbrains.mps.project.MPSProject;

public class GenerationTracerTree extends MPSTree {
  private TracerNode myRootTracerNode;
  private MPSProject myProject;
  private boolean myAutoscrollToSource;

  public GenerationTracerTree(TracerNode root, MPSProject project) {
    myRootTracerNode = root;
    myProject = project;
  }

  protected GenerationTracerTreeNode rebuild() {
    return new GenerationTracerTreeNode(myRootTracerNode, myProject);
  }

  public boolean isAutoscrollToSource() {
    return myAutoscrollToSource;
  }

  public void setAutoscrollToSource(boolean b) {
    myAutoscrollToSource = b;
  }


}

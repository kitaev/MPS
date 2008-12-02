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
package jetbrains.mps.ide.findusages.view.treeholder.treedata.nodedatatypes;

import jetbrains.mps.ide.findusages.CantLoadSomethingException;
import jetbrains.mps.ide.findusages.view.treeholder.path.PathItemRole;
import jetbrains.mps.project.MPSProject;
import org.jdom.Element;

import javax.swing.Icon;

public class MainNodeData extends BaseNodeData {
  public MainNodeData(PathItemRole role) {
    super(role, "", "", true, false, false);
  }

  public MainNodeData(Element element, MPSProject project) throws CantLoadSomethingException {
    read(element, project);
  }

  public Icon getIcon() {
    return null;
  }

  public Object getIdObject() {
    return "";
  }
}

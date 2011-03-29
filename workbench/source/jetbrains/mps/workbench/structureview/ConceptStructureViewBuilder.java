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
package jetbrains.mps.workbench.structureview;

import com.intellij.ide.structureView.*;
import com.intellij.ide.util.treeView.smartTree.*;
import com.intellij.openapi.project.Project;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ConceptStructureViewBuilder extends TreeBasedStructureViewBuilder {
  private Project myProject;
  private SNodePointer myNode;

  public ConceptStructureViewBuilder(Project project, SNodePointer node) {
    myProject = project;
    myNode = node;
  }

  @NotNull
  public StructureViewModel createStructureViewModel() {
    return new StructureViewModel() {
      @Nullable
      public Object getCurrentEditorElement() {
        return null;
      }

      public void addEditorPositionListener(FileEditorPositionListener p0) {

      }

      public void removeEditorPositionListener(FileEditorPositionListener p0) {

      }

      public void addModelListener(ModelListener p0) {

      }

      public void removeModelListener(ModelListener p0) {

      }

      @NotNull
      public StructureViewTreeElement getRoot() {
        return new ConceptTreeElement(myProject, myNode);
      }

      public void dispose() {

      }

      public boolean shouldEnterElement(Object p0) {
        return false;
      }

      @NotNull
      public Filter[] getFilters() {
        return new Filter[0];
      }

      @NotNull
      public Sorter[] getSorters() {
        return new Sorter[0];
      }

      @NotNull
      public Grouper[] getGroupers() {
        return new Grouper[0];
      }
    };
  }

}

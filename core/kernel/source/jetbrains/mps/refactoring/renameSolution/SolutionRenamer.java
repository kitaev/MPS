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
package jetbrains.mps.refactoring.renameSolution;

import jetbrains.mps.project.Solution;
import jetbrains.mps.project.structure.modules.SolutionDescriptor;
import jetbrains.mps.smodel.MPSModuleRepository;

public class SolutionRenamer {
  private Solution mySolution;
  private String myNewName;

  public SolutionRenamer(Solution solution, String newName) {
    mySolution = solution;
    myNewName = newName;
  }

  public void rename() {
    SolutionDescriptor solutionDescriptor = mySolution.getSolutionDescriptor();
    solutionDescriptor.setNamespace(myNewName);
    mySolution.setSolutionDescriptor(solutionDescriptor);
    mySolution.save();

    MPSModuleRepository.getInstance().updateReferences();        
  }
}

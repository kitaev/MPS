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
package jetbrains.mps.lang.dataFlow.framework;

import java.util.Set;

public enum AnalysisDirection {

  FORWARD() {
    public Set<ProgramState> dependencies(ProgramState s) {
      return s.pred();
    }

    public Set<ProgramState> dependents(ProgramState s) {
      return s.succ();
    }
  },

  BACKWARD() {
    public Set<ProgramState> dependencies(ProgramState s) {
      return s.succ();
    }

    public Set<ProgramState> dependents(ProgramState s) {
      return s.pred();
    }
  };

  public abstract Set<ProgramState> dependencies(ProgramState s);
  public abstract Set<ProgramState> dependents(ProgramState s);

}

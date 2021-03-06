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
package jetbrains.mps.reloading;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ClasspathStringCollector extends EachClassPathItemVisitor {
  @NotNull
  private List<String> myStrings;

  public ClasspathStringCollector(List<String> strings) {
    myStrings = strings;
  }

  public ClasspathStringCollector() {
    this(new ArrayList<String>());
  }

  @Override
  public void visit(FileClassPathItem cpItem) {
    myStrings.add(cpItem.getClassPath());
  }

  @Override
  public void visit(JarFileClassPathItem cpItem) {
    myStrings.add(cpItem.getFile().getAbsolutePath());
  }

  public List<String> getResultAndReInit() {
    List<String> result = myStrings;
    myStrings = new ArrayList<String>();
    return result;
  }

}

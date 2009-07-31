package jetbrains.mps.build.ant;
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

import org.apache.tools.ant.BuildFileTest;
import org.apache.tools.ant.BuildException;

public class GenerateTaskTest extends BuildFileTest {

  public void setUp() {
    configureProject(GenerateTaskTest.class.getResource("test.generate.task.xml").getFile());
  }

  public void testNormalWork() {
    executeTarget("testNormalWork");
  }

  public void testSuccess() {
    executeTarget("testSuccess");
  }

  public void testNormalWorkWithModels() {
    executeTarget("testNormalWorkWithModels");
  }

  public void testNormalWorkWithModules() {
    executeTarget("testNormalWorkWithModules");
  }

  public void testNormalWorkWithLibrary() {
    executeTarget("testLibraries");
  }

  public void testFailOnGeneration() {
    runTestForBuildExceptionOnTarget("testFailOnGenerationError");
  }

  public void testBuildException() {
    runTestForBuildExceptionOnTarget("testBuildException");
  }

  public void testBuildExceptionInModelsDir() {
    runTestForBuildExceptionOnTarget("testModelsWithBuildException");
  }

  private void runTestForBuildExceptionOnTarget(String targetName) {
    try {
      executeTarget(targetName);
    } catch (BuildException e) {
      return;
    }
    fail("BuildException in target " + targetName + " expected.");
  }
}

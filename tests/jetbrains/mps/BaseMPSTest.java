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
package jetbrains.mps;

import junit.framework.TestCase;

import java.io.File;

import jetbrains.mps.lang.typesystem.tests.HelginsTestUtil;
import jetbrains.mps.refactoring.framework.tests.IRefactoringTester;

import javax.swing.SwingUtilities;

public class BaseMPSTest extends TestCase {
  protected void setUp() throws Exception {
    super.setUp();
  }

  protected void tearDown() throws Exception {
    super.tearDown();
    for (int i = 0; i < 3; i++) {
      try {
        SwingUtilities.invokeAndWait(new Runnable() {
          public void run() {

          }
        });
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

   protected void assertGenerates(File project, String... configurations) {
    String res = testProject(project, configurations);
    assertTrue(res, res == null);
  }

  protected void assertGenerates(File project) {
    assertGenerates(project, new String[0]);
  }

  protected String testProject(File project, String[] configurations) {
    return TestMain.testProject(project, configurations);
  }

  protected String testProject(File project) {
    return TestMain.testProject(project, new String[0]);
  }

  protected String testProject(File project, String message) {
    return TestMain.testProject(project, message);
  }

  protected boolean testProjectGenerationForLeaks(File project) {
    return TestMain.testProjectGenerationForLeaks(project);
  }

  protected void testHelgins(File project, String modelName) {
    HelginsTestUtil.doTest(project, modelName);
  }

  protected boolean testRefactoringTestEnvironment(File projectDirectory) {
    return TestMain.testRefactoringTestEnvironment(projectDirectory);
  }

  protected boolean testRefactoringOnProject(File projectDirectory, String refactoringTesterClassName) {
    try {
      Class<? extends IRefactoringTester> cls = (Class<? extends IRefactoringTester>) Class.forName(refactoringTesterClassName);
      return TestMain.testRefactoringOnProject(projectDirectory, cls.newInstance());
    } catch (Throwable t) {
      throw new RuntimeException(t);
    }
  }
}

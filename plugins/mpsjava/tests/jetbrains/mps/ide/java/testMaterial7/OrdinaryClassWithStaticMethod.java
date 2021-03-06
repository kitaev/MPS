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
package jetbrains.mps.ide.java.testMaterial7;

/**
 * Created by IntelliJ IDEA.
 * Date: 03.06.2010
 * Time: 18:18:52
 * To change this template use File | Settings | File Templates.
 */
public class OrdinaryClassWithStaticMethod {
  int myField;

  public void fooBar() {

  }

  public void bar() {
    myField = 2;
    this.myField = 2;
    bar();
    this.bar();
  }

  public class MyInner {
    public void foo() {
      myField = 2;
      bar();
      OrdinaryClassWithStaticMethod.this.bar();
      OrdinaryClassWithStaticMethod.this.myField = 2;
    }
  }
}

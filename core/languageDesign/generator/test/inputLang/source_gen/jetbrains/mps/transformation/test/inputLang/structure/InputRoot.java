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
package jetbrains.mps.transformation.test.inputLang.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InputRoot extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.transformation.test.inputLang.structure.InputRoot";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String USE_IN_TEST = "useInTest";
  public static final String INPUT_CHILD = "inputChild";

  public InputRoot(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(InputRoot.NAME);
  }

  public void setName(String value) {
    this.setProperty(InputRoot.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(InputRoot.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(InputRoot.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(InputRoot.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(InputRoot.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(InputRoot.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(InputRoot.VIRTUAL_PACKAGE, value);
  }

  public UseInTest getUseInTest() {
    String value = super.getProperty(InputRoot.USE_IN_TEST);
    return UseInTest.parseValue(value);
  }

  public void setUseInTest(UseInTest value) {
    super.setProperty(InputRoot.USE_IN_TEST, value.getValueAsString());
  }

  public int getInputChildsCount() {
    return this.getChildCount(InputRoot.INPUT_CHILD);
  }

  public Iterator<InputNode> inputChilds() {
    return this.children(InputNode.class, InputRoot.INPUT_CHILD);
  }

  public List<InputNode> getInputChilds() {
    return this.getChildren(InputNode.class, InputRoot.INPUT_CHILD);
  }

  public void addInputChild(InputNode node) {
    this.addChild(InputRoot.INPUT_CHILD, node);
  }

  public void insertInputChild(InputNode prev, InputNode node) {
    this.insertChild(prev, InputRoot.INPUT_CHILD, node);
  }


  public static InputRoot newInstance(SModel sm, boolean init) {
    return (InputRoot)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.transformation.test.inputLang.structure.InputRoot", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InputRoot newInstance(SModel sm) {
    return InputRoot.newInstance(sm, false);
  }

}

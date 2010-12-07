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
package jetbrains.mps.newTypesystem.operation.block;

import jetbrains.mps.newTypesystem.operation.AbstractOperation;
import jetbrains.mps.newTypesystem.state.Block;
import jetbrains.mps.typesystem.inference.EquationInfo;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 07.12.10
 * Time: 16:08
 * To change this template use File | Settings | File Templates.
 */
public class RemoveBlockOperation extends AbstractOperation {
   private Block myBlock;

  public RemoveBlockOperation(Block block) {
    myBlock = block;
    myEquationInfo = new EquationInfo(null, " ", block.getNodeModel(), block.getNodeId());
  }

  @Override
  public String getPresentation() {
    return "Block executed : [" + myBlock.getPresentation() + "]";
  }

  @Override
  public void doUndo(jetbrains.mps.newTypesystem.state.State state) {
    state.addBlockNoVars(myBlock);
  }

  @Override
  public void doRedo(jetbrains.mps.newTypesystem.state.State state) {
    state.removeBlockNoVars(myBlock);
  }

  @Override
  public void execute(jetbrains.mps.newTypesystem.state.State state) {
    super.execute(state);
    myBlock.performAction();
  }
}

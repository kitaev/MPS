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
package jetbrains.mps.datatransfer;

import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.smodel.*;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 15.08.2005
 * Time: 16:27:28
 * To change this template use File | Settings | File Templates.
 */
public class CloneModelUtil {

  public static SModel cloneModel(final SModel model, final SModel modelCopy, IScope scope) {
    modelCopy.runLoadingAction(new Runnable() {
      public void run() {
        for (SNode root : CopyUtil.copy(model.getRoots())) {
          modelCopy.addRoot(root);
        }
      }
    });
    return modelCopy;
  }

}

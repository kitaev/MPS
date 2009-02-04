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
package jetbrains.mps.workbench.actions.goTo.index;

import com.intellij.util.indexing.*;
import com.intellij.util.indexing.FileBasedIndex.InputFilter;
import com.intellij.util.io.KeyDescriptor;
import com.intellij.openapi.vfs.VirtualFile;
import jetbrains.mps.fileTypes.MPSFileTypeFactory;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import org.jetbrains.annotations.NonNls;

import java.io.IOException;
import java.io.DataOutput;
import java.io.DataInput;
import java.util.List;

public class RootNodeNameIndex extends ScalarIndexExtension<SNodeDescriptor> {
  @NonNls
  public static final ID<SNodeDescriptor, Void> NAME = ID.create("RootNodeNameIndex");
  private final MyInputFilter myInputFilter = new MyInputFilter();
  private final EnumeratorSNodeDescriptor myKeyDescriptor = new EnumeratorSNodeDescriptor();

  public ID<SNodeDescriptor, Void> getName() {
    return NAME;
  }

  public DataIndexer<SNodeDescriptor, Void, FileContent> getIndexer() {
    return new BaseSNodeDescriptorIndexer() {
      public List<SNode> getNodes(SModel model) {
        return model.getRoots();
      }
    };
  }

  public KeyDescriptor<SNodeDescriptor> getKeyDescriptor() {
    return myKeyDescriptor;
  }

  public InputFilter getInputFilter() {
    return myInputFilter;
  }

  public boolean dependsOnFileContent() {
    return true;
  }

  public int getVersion() {
    return 0;
  }

  public int getCacheSize() {
    return DEFAULT_CACHE_SIZE;
  }

  private static class MyInputFilter implements FileBasedIndex.InputFilter {
    public boolean acceptInput(VirtualFile file) {
      return (file.getFileType().equals(MPSFileTypeFactory.MODEL_FILE_TYPE));
    }
  }
}

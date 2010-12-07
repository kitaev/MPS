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
package jetbrains.mps.smodel.persistence.def.v6;

import jetbrains.mps.smodel.ModelLoadingState;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.persistence.def.IHashProvider;
import jetbrains.mps.smodel.persistence.def.IModelReader;
import jetbrains.mps.smodel.persistence.def.IModelWriter;
import jetbrains.mps.smodel.persistence.def.v3.HashProvider3;
import jetbrains.mps.smodel.persistence.lines.LineContent;
import jetbrains.mps.smodel.persistence.def.v5.ModelPersistence5;
import jetbrains.mps.xmlQuery.runtime.XMLSAXHandler;

import java.util.List;

public class ModelPersistence6 extends ModelPersistence5 {
  public IModelWriter getModelWriter() {
    return new ModelWriter6();
  }

  public IModelReader getModelReader() {
    return new ModelReader6();
  }

  public IHashProvider getHashProvider() {
    return new HashProvider3();
  }

  public XMLSAXHandler<SModel> getModelReaderHandler(ModelLoadingState state) {
    Handler6 handler = new Handler6();
    return handler.setPartialLoading(state) ? handler : null;
  }

  public XMLSAXHandler<List<LineContent>> getLineToContentMapReaderHandler() {
    return new LineToContentMapReader6Handler();
  }
}

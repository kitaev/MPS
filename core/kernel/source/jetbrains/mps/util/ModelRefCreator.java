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
package jetbrains.mps.util;

import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.IFileUtils;

import java.io.File;

public class ModelRefCreator {
  public static SModelReference createModelReference(IFile modelFile, IFile root, String namespacePrefix) {
    String rawLongName = getModelReferenceString(modelFile, root, namespacePrefix);
    return SModelReference.fromString(rawLongName);
  }

  private static String getModelReferenceString(IFile modelFile, IFile root, String namespacePrefix) {
    String longName = cropModelPath(modelFile, root);
    if (longName == null) return null;

    String namespace = NameUtil.namespaceFromLongName(longName);
    namespace = NameUtil.namespaceFromPath(namespace);

    if (namespacePrefix != null && namespacePrefix.length() > 0) {
      namespace = namespacePrefix + ((namespace.length() > 0) ? "." + namespace : "");
    }
    return namespace;
  }

  private static String cropModelPath(IFile modelFile, IFile root) {
    String modelPath = IFileUtils.getCanonicalPath(modelFile);
    String rootPath = IFileUtils.getCanonicalPath(root);
    if (!modelPath.startsWith(rootPath)) return null;

    int length = rootPath.length();
    if (rootPath.endsWith(File.separator) || rootPath.endsWith("!")) {
      length--;
    }
    return modelPath.substring(length + 1);
  }
}

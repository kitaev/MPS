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
package jetbrains.mps.make;

import com.intellij.openapi.fileTypes.FileTypeManager;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.MPSExtentions;
import jetbrains.mps.vfs.IFile;

import java.io.File;
import java.util.*;

public class ModuleSources {
  private Dependencies myDependencies;
  private IModule myModule;
  private Map<String, JavaFile> myJavaFiles = new HashMap<String, JavaFile>();
  private Map<String, ResourceFile> myResourceFiles = new HashMap<String, ResourceFile>();

  private List<File> myFilesToDelete = new ArrayList<File>();
  private List<JavaFile> myFilesToCompile = new LinkedList<JavaFile>();
  private List<ResourceFile> myResourcesToCopy = new LinkedList<ResourceFile>();

  ModuleSources(IModule module, Dependencies deps) {
    myModule = module;
    myDependencies = deps;

    collectInputFilesInfo();
    collectOutputFilesInfo();
  }

  public Collection<File> getFilesToDelete() {
    return myFilesToDelete;
  }

  public Collection<JavaFile> getFilesToCompile() {
    return myFilesToCompile;
  }

  public Collection<ResourceFile> getResourcesToCopy() {
    return myResourcesToCopy;
  }

  public boolean isUpToDate() {
    return myFilesToDelete.isEmpty() && myFilesToCompile.isEmpty() && myResourcesToCopy.isEmpty();
  }

  public boolean isJavaUpToDate() {
    return myFilesToCompile.isEmpty();
  }

  public boolean isResourcesUpToDate() {
    return myFilesToDelete.isEmpty() && myResourcesToCopy.isEmpty();
  }


  public JavaFile getJavaFile(String fqName) {
    return myJavaFiles.get(fqName);
  }

  private void collectInputFilesInfo() {
    for (String source : myModule.getSourcePaths()) {
      File dir = new File(source);
      collectInput(dir, dir.list(), new StringBuilder(), new StringBuilder());
    }
  }

  private void collectInput(File dir, String[] list, StringBuilder path, StringBuilder package_) {
    if (list == null) return;
    int initialLength = path.length();

    for (String childName : list) {
      if (isIgnoredFileName(childName)) continue;

      File child = new File(dir, childName);
      if (childName.endsWith(MPSExtentions.DOT_JAVAFILE)) {
        long lastModified = child.lastModified();
        if(lastModified > 0) {
          String className = childName.substring(0, childName.length() - MPSExtentions.DOT_JAVAFILE.length());
          package_.setLength(initialLength);
          if(initialLength > 0) {
            package_.append('.');
          }
          package_.append(className);
          String fqName = package_.toString();
          myJavaFiles.put(fqName, new JavaFile(child, fqName, lastModified));
          continue;
        }
      }

      String[] subList = child.list();

      if(subList != null) {
        path.setLength(initialLength);
        package_.setLength(initialLength);
        if(initialLength > 0) {
          path.append('/');
          package_.append('.');
        }
        path.append(childName);
        package_.append(childName);
        collectInput(child, subList, path, package_);

      } else if (isResourceFileName(childName)) {
        path.setLength(initialLength);
        if(initialLength > 0) {
          path.append('/');
        }
        path.append(childName);
        String childPath = path.toString();
        myResourceFiles.put(childPath, new ResourceFile(child, childPath));
      }
    }
  }

  private void collectOutputFilesInfo() {
    myFilesToCompile.addAll(myJavaFiles.values());
    myResourcesToCopy.addAll(myResourceFiles.values());

    IFile classesGen = myModule.getClassesGen();
    if (classesGen == null) return;
    File outputDir = new File(classesGen.getPath());
    collectOutput(outputDir, outputDir.list(), new StringBuilder(), new StringBuilder());
  }

  private boolean isFileUpToDate(JavaFile javaFile, long classFileLastModified) {
    if (javaFile.getLastModified() >= classFileLastModified) {
      return false;
    }

    for (String fqName : myDependencies.getAllDependencies(javaFile.getClassName())) {
      if (myDependencies.getModule(fqName) != null) {
        JavaFile file = myJavaFiles.get(fqName);
        long javaFileLastModified = file != null ? file.getLastModified() : myDependencies.getJavaFileLastModified(fqName);
        if (javaFileLastModified == 0 || javaFileLastModified > classFileLastModified) {
          return false;
        }
      }
    }
    return true;
  }

  private void collectOutput(File outputDir, String[] files, StringBuilder path, StringBuilder package_) {
    if (files == null) return;
    int initialLength = path.length();

    for (String childName : files) {
      if (isIgnoredFileName(childName)) continue;

      File file = new File(outputDir, childName);
      if (childName.endsWith(MPSExtentions.DOT_CLASSFILE)) {
        boolean isInnerClass = false;
        String containerName = childName.substring(0, childName.length() - MPSExtentions.DOT_CLASSFILE.length());
        int indexOfDollar = containerName.indexOf("$");
        if (indexOfDollar > 0) {
          containerName = containerName.substring(0, indexOfDollar);
          isInnerClass = true;
        }
        package_.setLength(initialLength);
        if(initialLength > 0) {
          package_.append('.');
        }
        package_.append(containerName);
        String fqName = package_.toString();
        JavaFile javaFile = myJavaFiles.get(fqName);
        if (javaFile == null) {
          myFilesToDelete.add(file);
        } else if (!isInnerClass && isFileUpToDate(javaFile, file.lastModified())) {
          myFilesToCompile.remove(javaFile);
        }
        continue;
      }

      String[] subList = file.list();

      if(subList != null) {
        path.setLength(initialLength);
        package_.setLength(initialLength);
        if(initialLength > 0) {
          path.append('/');
          package_.append('.');
        }
        path.append(childName);
        package_.append(childName);
        collectOutput(file, subList, path, package_);

      } else if (isResourceFileName(childName)) {
        path.setLength(initialLength);
        if(initialLength > 0) {
          path.append('/');
        }
        path.append(childName);
        String childPath = path.toString();
        ResourceFile resourceFile = myResourceFiles.get(childPath);
        if (resourceFile == null) {
          myFilesToDelete.add(file);
        } else if (resourceFile.getFile().lastModified() < file.lastModified()) {
          myResourcesToCopy.remove(resourceFile);
        }
      }
    }
  }

  private boolean isIgnoredFileName(String fileName) {
    return FileTypeManager.getInstance().isFileIgnored(fileName);
  }

  private boolean isResourceFileName(String fileName) {
    int extPos = fileName.lastIndexOf('.');
    return extPos > 0 && !fileName.endsWith(MPSExtentions.DOT_JAVAFILE) &&
      !fileName.endsWith(MPSExtentions.DOT_CLASSFILE);
  }
}

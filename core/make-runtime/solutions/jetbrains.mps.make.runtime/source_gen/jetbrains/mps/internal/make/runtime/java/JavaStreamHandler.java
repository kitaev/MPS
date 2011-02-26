package jetbrains.mps.internal.make.runtime.java;

/*Generated by MPS */

import jetbrains.mps.generator.generationTypes.StreamHandler;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.vfs.IFile;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.generator.fileGenerator.FileGenerationUtil;
import org.jdom.Element;
import java.util.List;
import java.util.ArrayList;

public class JavaStreamHandler implements StreamHandler {
  private final SModelDescriptor myModelDescriptor;
  private final IFile myOutputDir;
  private final IFile myCachesOutputDir;
  private final Set<IFile> mySavedFiles = new HashSet<IFile>();
  private FileProcessor myProcessor;

  public JavaStreamHandler(SModelDescriptor modelDescriptor, IFile outputDir, FileProcessor processor) {
    myModelDescriptor = modelDescriptor;
    myOutputDir = outputDir;
    myCachesOutputDir = FileGenerationUtil.getCachesDir(outputDir);
    myProcessor = processor;
  }

  public void saveStream(String name, String content, boolean isCache) {
    IFile outputRootDir = (isCache ?
      myCachesOutputDir :
      myOutputDir
    );
    IFile file = FileGenerationUtil.getDefaultOutputDir(myModelDescriptor, outputRootDir).child(name);
    myProcessor.saveContent(file, content);
    mySavedFiles.add(file);
  }

  public void saveStream(String name, Element content, boolean isCache) {
    IFile outputRootDir = (isCache ?
      myCachesOutputDir :
      myOutputDir
    );
    IFile file = FileGenerationUtil.getDefaultOutputDir(myModelDescriptor, outputRootDir).child(name);
    myProcessor.saveContent(file, content);
    mySavedFiles.add(file);
  }

  public void saveStream(String name, byte[] content, boolean isCache) {
    IFile outputRootDir = (isCache ?
      myCachesOutputDir :
      myOutputDir
    );
    IFile file = FileGenerationUtil.getDefaultOutputDir(myModelDescriptor, outputRootDir).child(name);
    myProcessor.saveContent(file, content);
    mySavedFiles.add(file);
  }

  public boolean touch(String name, boolean isCache) {
    IFile outputRootDir = (isCache ?
      myCachesOutputDir :
      myOutputDir
    );
    IFile file = FileGenerationUtil.getDefaultOutputDir(myModelDescriptor, outputRootDir).child(name);
    mySavedFiles.add(file);
    return file.exists();
  }

  public void dispose() {
    Set<IFile> directories = new HashSet<IFile>();
    directories.add(myOutputDir);
    directories.add(myCachesOutputDir);
    for (IFile f : mySavedFiles) {
      directories.add(f.getParent());
    }
    final List<IFile> filesToDelete = new ArrayList<IFile>();
    for (IFile dir : directories) {
      for (IFile outputDirectoryFile : dir.list()) {
        if (outputDirectoryFile.isDirectory()) {
          continue;
        }
        if (mySavedFiles.contains(outputDirectoryFile)) {
          continue;
        }
        filesToDelete.add(outputDirectoryFile);
      }
    }
    myProcessor.filesToDelete(filesToDelete);
    myProcessor.invalidateModel(myModelDescriptor);
  }
}

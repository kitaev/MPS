package jetbrains.mps.internal.make.runtime.java;

/*Generated by MPS */

import jetbrains.mps.logging.Logger;
import java.util.List;
import jetbrains.mps.smodel.SModelDescriptor;
import java.util.ArrayList;
import jetbrains.mps.vfs.IFile;
import org.jdom.Element;
import java.util.Collection;
import jetbrains.mps.generator.ModelGenerationStatusManager;
import java.io.OutputStreamWriter;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import jetbrains.mps.util.JDOMUtil;
import org.jdom.Document;

public class FileProcessor {
  private static final Logger LOG = Logger.getLogger(FileProcessor.class);

  private final List<SModelDescriptor> myModels = new ArrayList<SModelDescriptor>();
  private final List<FileProcessor.FileAndContent> myFilesAndContents = new ArrayList<FileProcessor.FileAndContent>();
  private final List<IFile> myFilesToDelete = new ArrayList<IFile>();
  private final Object LOCK = new Object();

  public FileProcessor() {
  }

  public void invalidateModel(SModelDescriptor modelDescriptor) {
    synchronized (LOCK) {
      myModels.add(modelDescriptor);
    }
  }

  public void saveContent(IFile file, String content) {
    saveContent(new FileProcessor.FileAndContent(file, new FileProcessor.StringFileContent(content)));
  }

  public void saveContent(IFile file, Element content) {
    saveContent(new FileProcessor.FileAndContent(file, new FileProcessor.XMLFileContent(content)));
  }

  public void saveContent(IFile file, byte[] content) {
    saveContent(new FileProcessor.FileAndContent(file, new FileProcessor.BinaryFileContent(content)));
  }

  private void saveContent(FileProcessor.FileAndContent fileAndContent) {
    myFilesAndContents.add(fileAndContent);
  }

  public void filesToDelete(Collection<IFile> files) {
    myFilesToDelete.addAll(files);
  }

  public void flushChanges() {
    for (FileProcessor.FileAndContent fileAndContent : myFilesAndContents) {
      fileAndContent.save();
    }
    for (IFile file : myFilesToDelete) {
      file.delete();
    }
    ModelGenerationStatusManager.getInstance().invalidateData(myModels);
  }

  private static class FileAndContent {
    private IFile myFile;
    private FileProcessor.FileContent myContent;

    private FileAndContent(IFile file, FileProcessor.FileContent content) {
      myFile = file;
      myContent = content;
    }

    private void save() {
      myContent.saveToFile(myFile);
    }

    @Override
    public String toString() {
      return myFile.toString();
    }
  }

  private static interface FileContent {
    public void saveToFile(IFile file);
  }

  private static class StringFileContent implements FileProcessor.FileContent {
    private String myContent;

    private StringFileContent(String content) {
      myContent = content;
    }

    public void saveToFile(IFile file) {
      OutputStreamWriter writer = null;
      try {
        writer = new OutputStreamWriter(new BufferedOutputStream(file.openOutputStream()));
        writer.write(myContent);
      } catch (IOException e) {
        FileProcessor.LOG.error(e);
      } finally {
        if (writer != null) {
          try {
            writer.close();
          } catch (IOException ignored) {
          }
        }
      }
    }
  }

  private static class BinaryFileContent implements FileProcessor.FileContent {
    private byte[] myContent;

    private BinaryFileContent(byte[] content) {
      myContent = content;
    }

    public void saveToFile(IFile file) {
      OutputStream stream = null;
      try {
        stream = file.openOutputStream();
        stream.write(myContent);
      } catch (IOException e) {
        FileProcessor.LOG.error(e);
      } finally {
        if (stream != null) {
          try {
            stream.close();
          } catch (IOException ignored) {
          }
        }
      }
    }
  }

  private static class XMLFileContent implements FileProcessor.FileContent {
    private Element myElement;

    private XMLFileContent(Element element) {
      myElement = element;
    }

    public void saveToFile(IFile file) {
      try {
        JDOMUtil.writeDocument(new Document(myElement), file);
      } catch (IOException e) {
        FileProcessor.LOG.error(e);
      }
    }
  }
}

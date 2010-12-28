package jetbrains.mps.watching;

/*Generated by MPS */

import com.intellij.openapi.vfs.newvfs.events.VFileEvent;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.vfs.FileSystem;

/*package*/ class BeforeModelEventProcessor extends EventProcessor {
  private static final BeforeModelEventProcessor INSTANCE = new BeforeModelEventProcessor();

  /*package*/ BeforeModelEventProcessor() {
  }

  @Override
  protected void processDelete(VFileEvent event, ReloadSession reloadSession) {
    final SModelDescriptor model = SModelRepository.getInstance().findModel(FileSystem.getInstance().getFileByPath(event.getPath()));
    if (model != null) {
      reloadSession.addDeletedModelFilePath(event.getPath());
    }
  }

  public static BeforeModelEventProcessor getInstance() {
    return INSTANCE;
  }
}

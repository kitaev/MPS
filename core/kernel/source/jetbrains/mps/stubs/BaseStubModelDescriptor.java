package jetbrains.mps.stubs;

import jetbrains.mps.project.AbstractModule.StubPath;
import jetbrains.mps.smodel.DefaultSModelDescriptor;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.persistence.IModelRootManager;
import jetbrains.mps.vfs.IFile;

import java.util.ArrayList;
import java.util.List;

public class BaseStubModelDescriptor extends DefaultSModelDescriptor {
  private List<StubPath> myStubPaths;
  private boolean myNeedsReloading = true;

  public BaseStubModelDescriptor(IModelRootManager manager, IFile modelFile, SModelReference modelReference) {
    super(manager, modelFile, modelReference);
  }

  public void addStubPath(StubPath sp) {
    if (myStubPaths == null) {
      myStubPaths = new ArrayList<StubPath>();
    }

    if (myStubPaths.contains(sp)) return;

    myStubPaths.add(sp);
  }

  public void refresh() {
    if (!myNeedsReloading) return;
    super.refresh();
  }

  public List<StubPath> getPaths() {
    return myStubPaths == null ? new ArrayList<StubPath>() : myStubPaths;
  }

  public boolean isNeedsReloading() {
    return myNeedsReloading;
  }

  public void markReload() {
    myNeedsReloading = true;
  }

  public void unmarkReload() {
    myNeedsReloading = false;
  }
}

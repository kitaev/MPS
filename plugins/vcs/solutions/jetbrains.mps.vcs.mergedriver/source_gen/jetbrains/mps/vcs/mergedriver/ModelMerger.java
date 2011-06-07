package jetbrains.mps.vcs.mergedriver;

/*Generated by MPS */

import java.io.File;
import jetbrains.mps.smodel.persistence.RoleIdsComponent;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.vcs.ModelUtils;
import jetbrains.mps.vcs.diff.merge.MergeContext;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.vcs.diff.changes.ModelChange;
import jetbrains.mps.smodel.ModelAccess;
import java.io.OutputStream;
import java.io.IOException;
import jetbrains.mps.util.FileUtil;

/*package*/ class ModelMerger extends SimpleMerger {
  /*package*/ ModelMerger() {
  }

  @Override
  protected int mergeFiles(File baseFile, File localFile, File latestFile) {
    try {
      MergerRoleIdsHandler roleIdsHandler = new MergerRoleIdsHandler();
      RoleIdsComponent.setHandler(roleIdsHandler);

      SModel baseModel = ModelUtils.readModel(baseFile);
      SModel localModel = ModelUtils.readModel(localFile);
      SModel latestModel = ModelUtils.readModel(latestFile);

      int baseP = baseModel.getPersistenceVersion();
      int localP = localModel.getPersistenceVersion();
      int latestP = latestModel.getPersistenceVersion();
      if (baseP >= 7 && localP >= 7 && latestP >= 7 || baseP < 7 && localP < 7 && latestP < 7) {
        // ok, can merge 
      } else {
        return CONFLICTS;
      }
      if (!(roleIdsHandler.isConsistent())) {
        return CONFLICTS;
      }

      final MergeContext mergeContext = new MergeContext(baseModel, localModel, latestModel);
      if (Sequence.fromIterable(mergeContext.getAllChanges()).all(new IWhereFilter<ModelChange>() {
        public boolean accept(ModelChange c) {
          return Sequence.fromIterable(mergeContext.getConflictedWith(c)).isEmpty();
        }
      })) {
        mergeContext.getResultModel().setLoading(true);
        Runnable applyAction = new Runnable() {
          public void run() {
            mergeContext.applyChanges(mergeContext.getAllChanges());
          }
        };
        ModelAccess.instance().runReadAction(applyAction);
        if (!(mergeContext.hasIdsToRestore())) {
          byte[] bytes = ModelUtils.modelToBytes(mergeContext.getResultModel());
          OutputStream out = null;
          try {
            out = getResultStream(baseFile);
            out.write(bytes);
            return MERGED;
          } catch (IOException e) {
            return FATAL_ERROR;
          } finally {
            FileUtil.closeFileSafe(out);
          }
        }
      }

      return super.mergeFiles(baseFile, localFile, latestFile);
    } catch (IOException e) {
      return FATAL_ERROR;
    }
  }
}

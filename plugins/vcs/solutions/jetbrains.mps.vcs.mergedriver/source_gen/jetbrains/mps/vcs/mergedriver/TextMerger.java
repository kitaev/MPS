package jetbrains.mps.vcs.mergedriver;

/*Generated by MPS */

import java.io.File;
import org.tmatesoft.svn.core.wc.SVNDiffOptions;
import org.tmatesoft.svn.core.internal.wc.FSMergerBySequence;
import java.io.RandomAccessFile;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import de.regnis.q.sequence.line.QSequenceLineRAData;
import de.regnis.q.sequence.line.QSequenceLineRAByteData;
import de.regnis.q.sequence.line.QSequenceLineRAFileData;
import jetbrains.mps.util.FileUtil;
import org.tmatesoft.svn.core.internal.wc.SVNDiffConflictChoiceStyle;
import java.io.IOException;

/*package*/ class TextMerger extends FileMerger {
  public TextMerger() {
  }

  protected int mergeFiles(File baseFile, File localFile, File latestFile) {
    // TODO 
    SVNDiffOptions diffOptions = null;

    FSMergerBySequence merger = new FSMergerBySequence(myConflictStart, mySeparator, myConflictEnd);
    int mergeResult = 0;
    RandomAccessFile local = null;
    RandomAccessFile latest = null;
    InputStream base = null;
    OutputStream result = null;
    try {
      local = new RandomAccessFile(localFile, "r");
      latest = new RandomAccessFile(latestFile, "r");
      base = new FileInputStream(baseFile);

      QSequenceLineRAData baseData = QSequenceLineRAByteData.create(base);
      QSequenceLineRAData localData = new QSequenceLineRAFileData(local);
      QSequenceLineRAData latestData = new QSequenceLineRAFileData(latest);

      FileUtil.closeFileSafe(base);
      result = getResultStream(baseFile);

      mergeResult = merger.merge(baseData, localData, latestData, diffOptions, result, SVNDiffConflictChoiceStyle.CHOOSE_MODIFIED_LATEST);
    } catch (IOException e) {
      return FATAL_ERROR;
    } finally {
      FileUtil.closeFileSafe(result);
      FileUtil.closeFileSafe(base);
      FileUtil.closeFileSafe(latest);
      FileUtil.closeFileSafe(local);
    }
    if (mergeResult == FSMergerBySequence.CONFLICTED) {
      return CONFLICTS;
    }
    return MERGED;
  }
}

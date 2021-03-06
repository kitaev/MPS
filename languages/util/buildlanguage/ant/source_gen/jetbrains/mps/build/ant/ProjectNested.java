package jetbrains.mps.build.ant;

/*Generated by MPS */

import org.apache.tools.ant.types.FileSet;
import java.io.File;
import org.apache.tools.ant.BuildException;

public class ProjectNested extends FileSet {
  private static final String[] EXCLUDES = new String[]{"**/*.msd, **/*.mpl, **/*.class, **/*.java, **/*.mps, **/.svn/"};

  private boolean myWholeProject = false;

  public ProjectNested() {
  }

  @Override
  public void setDir(File dir) throws BuildException {
    super.setDir(dir);
    appendExcludes(EXCLUDES);
  }

  public boolean getWholeProject() {
    return myWholeProject;
  }

  public void setWholeProject(boolean wholeProject) {
    myWholeProject = wholeProject;
  }
}

package jetbrains.mps.build.packaging.plugin;

/*Generated by MPS */

import jetbrains.mps.project.Solution;
import jetbrains.mps.smodel.SModelDescriptor;
import java.util.List;
import java.util.LinkedList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Collections;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelFqName;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.MPSModuleRepository;

public abstract class AbstractBuildGenerator implements BuildGenerator {

  private String myProjectName;
  private String mySolutionName;
  private Solution mySolution;
  private boolean myCreateSolution = true;
  private String myModelName;
  private SModelDescriptor myModelDescriptor;
  private boolean myCreateModel = true;
  private final List<NodeData> myModules = new LinkedList<NodeData>();

  public AbstractBuildGenerator() {
  }

  public void setProjectName(String projectName) {
    this.myProjectName = projectName;
  }

  public String getProjectName() {
    return this.myProjectName;
  }

  public void setNewModelName(String modelName) {
    this.myModelName = modelName;
  }

  public String getNewModelName() {
    if (this.myModelName == null && this.mySolutionName != null) {
      String modelNamePrefix = this.mySolutionName;
      int count = 0;
      {
        Pattern _pattern_0 = _PrecompiledPatterns.REGEXP0;
        Matcher _matcher_0 = _pattern_0.matcher(modelNamePrefix);
        if (_matcher_0.find()) {
          modelNamePrefix = _matcher_0.group(1) + _matcher_0.group(2);
        }
      }
      this.myModelName = modelNamePrefix;
      while (!(this.isValidModelName(this.myModelName))) {
        this.myModelName = modelNamePrefix + count;
        count++ ;
      }
    }
    return this.myModelName;
  }

  public void setModel(SModelDescriptor modelDescriptor) {
    this.myModelDescriptor = modelDescriptor;
  }

  public SModelDescriptor getModel() {
    return this.myModelDescriptor;
  }

  public void setSolution(Solution solution) {
    this.mySolution = solution;
  }

  public void setNewSolutionName(String solutionName) {
    this.mySolutionName = solutionName;
  }

  public String getNewSolutionName() {
    return this.mySolutionName;
  }

  public Solution getSolution() {
    return this.mySolution;
  }

  public List<NodeData> getModules() {
    return Collections.unmodifiableList(this.myModules);
  }

  public void setModules(List<NodeData> modules) {
    this.myModules.clear();
    this.myModules.addAll(modules);
  }

  public void setCreateModel(boolean createModel) {
    this.myCreateModel = createModel;
  }

  public boolean getCreateModel() {
    return this.myCreateModel;
  }

  public void setCreateSolution(boolean createSolution) {
    this.myCreateSolution = createSolution;
    if (createSolution) {
      this.myCreateModel = true;
    }
  }

  public boolean getCreateSolution() {
    return this.myCreateSolution;
  }

  public boolean isValidModelName(String text) {
    return SModelRepository.getInstance().getModelDescriptor(SModelFqName.fromString(text)) == null;
  }

  public boolean isValidSolutionName(String text) {
    if (text.equals("")) {
      return false;
    }
    IModule moduleWithSelectedName = MPSModuleRepository.getInstance().getModuleByUID(text);
    return moduleWithSelectedName == null;
  }

  public boolean isValid() {
    return (this.isValidModelName(this.myModelName) || !(this.myCreateModel)) && (this.isValidSolutionName(this.mySolutionName) || !(this.myCreateSolution));
  }

}

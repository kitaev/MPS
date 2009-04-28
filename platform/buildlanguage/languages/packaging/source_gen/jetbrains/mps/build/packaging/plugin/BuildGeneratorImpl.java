package jetbrains.mps.build.packaging.plugin;

/*Generated by MPS */

import com.intellij.openapi.project.Project;
import jetbrains.mps.vfs.MPSExtentions;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.smodel.SModelDescriptor;
import java.util.List;
import com.intellij.openapi.application.ApplicationManager;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.project.Solution;
import com.intellij.openapi.vfs.VirtualFile;
import java.io.File;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.MPSProjectHolder;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.util.Macros;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.workbench.editors.MPSEditorOpener;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.LinkedHashSet;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class BuildGeneratorImpl extends AbstractBuildGenerator {

  private final Project myProject;

  public BuildGeneratorImpl(Project project) {
    this.myProject = project;
    String projectName = this.myProject.getName();
    if (projectName.endsWith(MPSExtentions.DOT_MPS_PROJECT)) {
      projectName = projectName.substring(0, projectName.length() - MPSExtentions.DOT_MPS_PROJECT.length());
    }
    this.setProjectName(projectName);
    this.setValidDefaultSolutionName(projectName);
  }

  public void generate(ProgressIndicator indicator) {
    this.generateInternal(indicator);
  }

  private void generateInternal(ProgressIndicator indicator) {
    indicator.setText("Preparing...");
    final SModelDescriptor descriptor = this.getSModelDescriptor(indicator);
    final String projectName = this.getProjectName();
    final String projectBasedirPath = this.myProject.getBaseDir().getPath();
    final List<NodeData> modules = this.getModules();
    indicator.setText("Creating Script...");
    ApplicationManager.getApplication().invokeLater(new Runnable() {

      public void run() {
        ModelAccess.instance().runWriteActionInCommand(new Runnable() {

          public void run() {
            BuildGeneratorImpl.this.generate(descriptor, projectName, projectBasedirPath, modules);
          }
        });
      }
    });
  }

  public SModelDescriptor getSModelDescriptor(ProgressIndicator indicator) {
    if (this.getCreateModel()) {
      Solution solution;
      if (this.getCreateSolution()) {
        VirtualFile projectBaseDir = this.myProject.getBaseDir();
        //  get solution
        String solutionName = this.getNewSolutionName();
        String solutionBaseDir = projectBaseDir.getPath() + File.separator + "solutions" + File.separator + solutionName;
        MPSProject mpsProject = this.myProject.getComponent(MPSProjectHolder.class).getMPSProject();
        indicator.setText("Creating Solution...");
        solution = BuildGeneratorUtil.createSolution(mpsProject, solutionName, solutionBaseDir);
      } else
      {
        solution = this.getSolution();
      }
      indicator.setText("Creating Model...");
      return BuildGeneratorUtil.createModel(this.getNewModelName(), solution);
    } else
    {
      return this.getModel();
    }
  }

  private void setValidDefaultSolutionName(String projectName) {
    String solutionNamePrefix = projectName + ".build";
    String solutionName = solutionNamePrefix;
    int count = 0;
    while (!(this.isValidSolutionName(solutionName))) {
      solutionName = solutionNamePrefix + count;
      count++ ;
    }
    this.setNewSolutionName(solutionName);
  }

  public void generate(SModelDescriptor targetModelDescriptor, String name, String basedir, List<NodeData> selectedData) {
    // create mps layout
    SNode mpsLayout = SConceptOperations.createNewNode("jetbrains.mps.build.packaging.structure.MPSLayout", null);
    // add mps layout to the target model
    SModel targetSModel = targetModelDescriptor.getSModel();
    targetSModel.addRoot(mpsLayout);
    // set properties
    SPropertyOperations.set(mpsLayout, "name", name);
    String result = Macros.mpsHomeMacros().shrinkPath(basedir, new File("")).replace("\\", File.separator);
    int index = result.lastIndexOf("}");
    if (index > -1) {
      String macro = result.substring(result.indexOf("{") + 1, index);
      SLinkOperations.setTarget(mpsLayout, "baseDirectory", PackagingLanguageGenerator.createBasedirPath(macro, result.substring(index + 2)), true);
    } else
    {
      SLinkOperations.setTarget(mpsLayout, "baseDirectory", PackagingLanguageGenerator.createBasedirPath("", basedir), true);
    }
    SPropertyOperations.set(mpsLayout, "compile", "" + (true));
    SPropertyOperations.set(ListSequence.fromList(SLinkOperations.getTargets(mpsLayout, "configuration", true)).first(), "name", "default");
    // create zip
    SNode zip = SConceptOperations.createNewNode("jetbrains.mps.build.packaging.structure.Zip", null);
    SLinkOperations.setTarget(zip, "title", PackagingLanguageGenerator.createSimpleString(name + ".zip"), true);
    SLinkOperations.addChild(mpsLayout, "component", zip);
    // create folder inside zip
    SNode folder = PackagingLanguageGenerator.createFolder(name);
    SLinkOperations.addChild(zip, "entry", folder);
    // add modules to folder
    BuildGeneratorImpl.createContent(selectedData, folder, targetSModel);
    targetModelDescriptor.save();
    MPSEditorOpener editorOpener = this.myProject.getComponent(MPSEditorOpener.class);
    editorOpener.openNode(mpsLayout);
  }


  public static SNode createComponent(NodeData data, SModel targetSModel) {
    if (data instanceof ModuleData) {
      return PackagingLanguageGenerator.createModule(((ModuleData)data).getModule());
    } else if (data instanceof NamespaceData) {
      String namespace = ((NamespaceData)data).getText();
      return PackagingLanguageGenerator.createFolder(namespace);
    }
    return null;
  }

  private static void createContent(List<NodeData> selectedData, SNode folder, SModel targetSModel) {
    Map<NodeData, SNode> createdComponent = MapSequence.fromMap(new HashMap<NodeData, SNode>());
    Set<SNode> topLevel = SetSequence.fromSet(new LinkedHashSet<SNode>());
    for(NodeData data : ListSequence.fromList(selectedData)) {
      // creating component
      SNode component = createComponent(data, targetSModel);
      if (component == null) {
        continue;
      }
      MapSequence.fromMap(createdComponent).put(data, component);
      SetSequence.fromSet(topLevel).addElement(component);
      // dealing with children
      if (SNodeOperations.isInstanceOf(component, "jetbrains.mps.build.packaging.structure.ICompositeComponent")) {
        List<NodeData> children = data.getChildren();
        for(NodeData child : ListSequence.fromList(children)) {
          if (MapSequence.fromMap(createdComponent).containsKey(child)) {
            SNode childComponent = MapSequence.fromMap(createdComponent).get(child);
            SLinkOperations.addChild(SNodeOperations.cast(component, "jetbrains.mps.build.packaging.structure.ICompositeComponent"), "entry", childComponent);
            if (SetSequence.fromSet(topLevel).contains(childComponent)) {
              SetSequence.fromSet(topLevel).removeElement(childComponent);
            }
          }
        }
      }
      // dealing with parent
      NodeData parent = data.getParent();
      if (parent == null) {
        break;
      }
      if (MapSequence.fromMap(createdComponent).containsKey(parent)) {
        SLinkOperations.addChild(SNodeOperations.cast(MapSequence.fromMap(createdComponent).get(parent), "jetbrains.mps.build.packaging.structure.ICompositeComponent"), "entry", component);
        SetSequence.fromSet(topLevel).removeElement(component);
      }
    }
    // 
    for(SNode topLevelComponent : SetSequence.fromSet(topLevel)) {
      SLinkOperations.addChild(folder, "entry", topLevelComponent);
    }
  }

}

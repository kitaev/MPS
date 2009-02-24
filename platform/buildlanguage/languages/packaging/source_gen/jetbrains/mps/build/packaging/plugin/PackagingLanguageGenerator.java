package jetbrains.mps.build.packaging.plugin;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.project.IModule;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.io.File;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang.StringUtils;

public class PackagingLanguageGenerator {

  public PackagingLanguageGenerator() {
  }

  public static SNode createSimpleString(String text) {
    SNode simpleString = SConceptOperations.createNewNode("jetbrains.mps.build.packaging.structure.SimpleString", null);
    SPropertyOperations.set(simpleString, "name", text);
    return simpleString;
  }

  public static SNode createModule(IModule module) {
    SNode moduleComponent = SConceptOperations.createNewNode("jetbrains.mps.build.packaging.structure.Module", null);
    SPropertyOperations.set(moduleComponent, "id", module.getModuleId().toString());
    return moduleComponent;
  }

  public static SNode createFolder(String name) {
    SNode folderComponent = SConceptOperations.createNewNode("jetbrains.mps.build.packaging.structure.Folder", null);
    SLinkOperations.setTarget(folderComponent, "title", createSimpleString(name), true);
    SLinkOperations.setTarget(folderComponent, "sourcePath", null, true);
    return folderComponent;
  }

  public static SNode createBasedirPath(String macro, String path) {
    SNode basedirPath = SConceptOperations.createNewNode("jetbrains.mps.build.packaging.structure.BaseDirPath", null);
    SPropertyOperations.set(SLinkOperations.getTarget(basedirPath, "macro", true), "name", macro);
    String[] pathComponents = path.split(File.separator);
    if (pathComponents.length > 0) {
      List<SNode> pathComponentNodes = new ArrayList();
      for(String pathComponentName : pathComponents) {
        if (StringUtils.isEmpty(pathComponentName)) {
          continue;
        }
        pathComponentNodes.add(PackagingLanguageGenerator.createPathComponent(pathComponentName));
      }
      SNode compositePathComponent = createCompositePathComponent(pathComponentNodes);
      SLinkOperations.setTarget(basedirPath, "compositePathComponent", compositePathComponent, true);
    }
    return basedirPath;
  }

  public static SNode createCompositePathComponent(List<SNode> pathComponents) {
    SNode compositePathComponent = SConceptOperations.createNewNode("jetbrains.mps.build.packaging.structure.CompositePathComponent", null);
    SLinkOperations.addAll(compositePathComponent, "pathComponent", pathComponents);
    return compositePathComponent;
  }

  public static SNode createPathComponent(String text) {
    SNode pathComponent = SConceptOperations.createNewNode("jetbrains.mps.build.packaging.structure.PathComponent", null);
    SPropertyOperations.set(pathComponent, "path", text);
    return pathComponent;
  }

}

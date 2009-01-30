package jetbrains.mps.build.packaging.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import org.apache.commons.lang.StringUtils;
import java.io.File;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import com.intellij.openapi.application.PathMacros;
import jetbrains.mps.util.PathManager;
import jetbrains.mps.util.Macros;

public class MPSLayout_Behavior {

  public static void init(SNode thisNode) {
    Map<String, String> vars = MapSequence.fromMap(new HashMap<String, String>());
    MapSequence.fromMap(vars).put("basedir", "basedir");
    MapSequence.fromMap(vars).put("\\n", "line.separator");
    MapSequence.fromMap(vars).put("/", "file.separator");
    MapSequence.fromMap(vars).put(":", "path.separator");
    MapSequence.fromMap(vars).put("date", "DSTAMP");
    if (ListSequence.fromList(SLinkOperations.getTargets(thisNode, "configuration", true)).isEmpty()) {
      SLinkOperations.addChild(thisNode, "configuration", SConceptOperations.createNewNode("jetbrains.mps.build.packaging.structure.Configuration", null));
    }
    SPropertyOperations.set(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "configuration", true)).first(), "name", "default");
    for(String s : Sequence.fromIterable(MapSequence.fromMap(vars).keySet())) {
      SNode var = SConceptOperations.createNewNode("jetbrains.mps.build.packaging.structure.Variable", null);
      SPropertyOperations.set(var, "name", s);
      SPropertyOperations.set(var, "antName", MapSequence.fromMap(vars).get(s));
      SLinkOperations.addChild(thisNode, "builtInVariable", var);
    }
  }

  public static String call_getFolderToGenerate_1229522949966(SNode thisNode) {
    if (StringUtils.isEmpty(SPropertyOperations.getString(thisNode, "scriptsFolder"))) {
      return ILayoutComponent_Behavior.call_getPath_1213877230696(thisNode);
    }
    return ILayoutComponent_Behavior.call_getPath_1213877230696(thisNode) + File.separator + SPropertyOperations.getString(thisNode, "scriptsFolder");
  }

  public static String virtual_getPath_1213877230696(SNode thisNode) {
    String macro = MPSLayout_Behavior.call_evaluateMacro_1220980091008(thisNode, SPropertyOperations.getString(SLinkOperations.getTarget(SLinkOperations.getTarget(thisNode, "baseDirectory", true), "macro", true), "name"));
    String fullPathWithoutMacro = Path_Behavior.call_getFullPathWithoutMacro_1226511495568(SLinkOperations.getTarget(thisNode, "baseDirectory", true));
    return (StringUtils.isEmpty(macro) ?
      fullPathWithoutMacro :
      macro + File.separator + fullPathWithoutMacro
    );
  }

  public static List<SNode> call_getTopologicalSortedComponents_1213877228271(SNode thisNode) {
    List<SNode> result = ListSequence.<SNode>fromArray();
    for(SNode component : ListSequence.fromList(SLinkOperations.getTargets(thisNode, "component", true))) {
      MPSLayout_Behavior.proceesAbstractProjectComponent_1233317260545(component, result);
    }
    return result;
  }

  public static List<SNode> call_getTopologicalSortedComponents_1213877228296(SNode thisNode, SNode config) {
    List<SNode> result = ListSequence.<SNode>fromArray();
    List<SNode> all = MPSLayout_Behavior.call_getTopologicalSortedComponents_1213877228271(thisNode);
    for(SNode component : ListSequence.fromList(all)) {
      if (AbstractProjectComponent_Behavior.call_included_1213877333807(component, config)) {
        ListSequence.fromList(result).addElement(component);
        ListSequence.fromList(result).addSequence(ListSequence.fromList(AbstractProjectComponent_Behavior.call_getPostProcessingTasks_1213877333861(component)));
      }
    }
    return result;
  }

  public static List<SNode> call_getModules_1213877228340(SNode thisNode) {
    List<SNode> result = ListSequence.<SNode>fromArray();
    for(SNode component : ListSequence.fromList(SLinkOperations.getTargets(thisNode, "component", true))) {
      if (SNodeOperations.isInstanceOf(component, "jetbrains.mps.build.packaging.structure.ICompositeComponent")) {
        ListSequence.fromList(result).addSequence(ListSequence.fromList(MPSLayout_Behavior.call_getModules_1213877228389(thisNode, ((SNode)component))));
      } else
      if (SNodeOperations.isInstanceOf(component, "jetbrains.mps.build.packaging.structure.Module")) {
        ListSequence.fromList(result).addElement((SNode)component);
      }
    }
    return result;
  }

  public static List<SNode> call_getModules_1213877228389(SNode thisNode, SNode component) {
    List<SNode> result = ListSequence.<SNode>fromArray();
    for(SNode entry : ListSequence.fromList(SLinkOperations.getTargets(component, "entry", true))) {
      if (SNodeOperations.isInstanceOf(entry, "jetbrains.mps.build.packaging.structure.ICompositeComponent")) {
        ListSequence.fromList(result).addSequence(ListSequence.fromList(MPSLayout_Behavior.call_getModules_1213877228389(thisNode, ((SNode)entry))));
      } else
      if (SNodeOperations.isInstanceOf(entry, "jetbrains.mps.build.packaging.structure.Module")) {
        ListSequence.fromList(result).addElement((SNode)entry);
      }
    }
    return result;
  }

  public static List<String> call_getAllMacroNames_1220980057360(SNode thisNode, boolean addBasedir) {
    List<String> names = ListSequence.<String>fromArray(MPSLayout_Behavior.getMPSHomeName_1226508944077());
    if (addBasedir) {
      ListSequence.fromList(names).addElement(MPSLayout_Behavior.getBasedirName_1226509010730());
    }
    ListSequence.fromList(names).addSequence(SetSequence.fromSet(PathMacros.getInstance().getUserMacroNames()));
    return names;
  }

  public static String call_evaluateMacro_1220980091008(SNode thisNode, String macroName) {
    if (macroName.equals(MPSLayout_Behavior.getBasedirName_1226509010730())) {
      return ILayoutComponent_Behavior.call_getPath_1213877230696(thisNode);
    }
    if (macroName.equals(MPSLayout_Behavior.getMPSHomeName_1226508944077())) {
      return PathManager.getHomePath();
    }
    return PathMacros.getInstance().getValue(macroName);
  }

  public static String call_getDefaultTargetName_1230209625713(SNode thisNode) {
    return "main";
  }

  public static String getMPSHomeName_1226508944077() {
    return Macros.MPS_HOME.substring("${".length(), Macros.MPS_HOME.lastIndexOf("}"));
  }

  public static String getBasedirName_1226509010730() {
    return "basedir";
  }

  public static void proceesAbstractProjectComponent_1233317260545(SNode component, List<SNode> list) {
    if (SNodeOperations.isInstanceOf(component, "jetbrains.mps.build.packaging.structure.ICompositeComponent")) {
      for(SNode entry : ListSequence.fromList(SLinkOperations.getTargets(((SNode)component), "entry", true))) {
        MPSLayout_Behavior.proceesAbstractProjectComponent_1233317260545(entry, list);
      }
    } else if (SNodeOperations.isInstanceOf(component, "jetbrains.mps.build.packaging.structure.IfProjectComponent")) {
      SNode toDo;
      if (ICondition_Behavior.call_isTrueWhileGeneration_1233161599461(SLinkOperations.getTarget(component, "condition", true))) {
        toDo = SLinkOperations.getTarget(component, "ifTrue", true);
      } else
      {
        toDo = SLinkOperations.getTarget(component, "ifTrue", true);
      }
      MPSLayout_Behavior.proceesAbstractProjectComponent_1233317260545(toDo, list);
      return;
    }
    ListSequence.fromList(list).addElement(component);
  }

}

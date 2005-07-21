package jetbrains.mps.generator.template;

import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelUID;
import jetbrains.mps.transformation.TLBase.TemplateSwitch;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: Igoor
 * Date: Apr 14, 2005
 * Time: 1:38:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class TemplateSwitchGraph {
  private Map<TemplateSwitch, TemplateSwitchGraphNode> myTemplateSwitchToGraphNodeMap = new HashMap<TemplateSwitch, TemplateSwitchGraphNode>();

  public TemplateSwitchGraph(SModel templatesModel) {
    processTemplatesModel(templatesModel, new HashSet<SModelUID>());
  }

  private void processTemplatesModel(SModel templatesModel, HashSet<SModelUID> processedModes) {
    if (processedModes.contains(templatesModel.getModelUID())) {
      return;
    }
    processedModes.add(templatesModel.getModelUID());

    for (SNode root : templatesModel.getRoots()) {
      if (root instanceof TemplateSwitch) {
        if (myTemplateSwitchToGraphNodeMap.get((TemplateSwitch) root) == null) {
          addSwitch((TemplateSwitch) root);
        }
      }
    }

    Iterator<SModelDescriptor> iterator = templatesModel.importedModels();
    while (iterator.hasNext()) {
      SModel importedModel = iterator.next().getSModel();
      if (importedModel.importsLanguage("jetbrains.mps.transformation.TLBase")) {
        processTemplatesModel(importedModel, processedModes);
      }
    }
  }

  private TemplateSwitchGraphNode addSwitch(TemplateSwitch templateSwitch) {
    if (myTemplateSwitchToGraphNodeMap.get(templateSwitch) != null) {
      throw new RuntimeException("Couldn't add template switch more then once: " + templateSwitch.getDebugText());
    }
    //    System.out.println("add switch: " + templateSwitch.getDebugText());

    TemplateSwitchGraphNode switchNode = new TemplateSwitchGraphNode(templateSwitch);
    myTemplateSwitchToGraphNodeMap.put(templateSwitch, switchNode);
    TemplateSwitch modifiedSwitch = templateSwitch.getModifiedSwitch();
    if (modifiedSwitch != null) {
      TemplateSwitchGraphNode modifiedSwitchNode = myTemplateSwitchToGraphNodeMap.get(modifiedSwitch);
      if (modifiedSwitchNode == null) {
        modifiedSwitchNode = addSwitch(modifiedSwitch);
      }
      switchNode.modifiedSwitchNode = modifiedSwitchNode;
      modifiedSwitchNode.modifierSwitchNodes.add(switchNode);
    }

    return switchNode;
  }

  public List<TemplateSwitch> getSubgraphAsList(TemplateSwitch baseSwitch) {
    TemplateSwitchGraphNode bottomSwitchNode = myTemplateSwitchToGraphNodeMap.get(baseSwitch);
    while (bottomSwitchNode.modifiedSwitchNode != null) {
      bottomSwitchNode = bottomSwitchNode.modifiedSwitchNode;
    }
    List<TemplateSwitchGraphNode> graphNodes = new LinkedList<TemplateSwitchGraphNode>();
    modifierSwitchesToList(bottomSwitchNode, graphNodes);
    graphNodes.add(bottomSwitchNode);

    List<TemplateSwitch> switches = new LinkedList<TemplateSwitch>();
    for (TemplateSwitchGraphNode switchGraphNode : graphNodes) {
      switches.add(switchGraphNode.templateSwitch);
    }
    return switches;
  }

  private void modifierSwitchesToList(TemplateSwitchGraphNode switchNode, List<TemplateSwitchGraphNode> list) {
    if (!switchNode.modifierSwitchNodes.isEmpty()) {
      list.addAll(switchNode.modifierSwitchNodes);
      for (TemplateSwitchGraphNode modifierSwitchNode : switchNode.modifierSwitchNodes) {
        modifierSwitchesToList(modifierSwitchNode, list);
      }
    }
  }
}

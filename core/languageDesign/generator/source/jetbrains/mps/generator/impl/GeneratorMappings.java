package jetbrains.mps.generator.impl;

import jetbrains.mps.generator.IGeneratorLogger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.Pair;

import java.util.*;

/**
 * Evgeny Gryaznov, Feb 16, 2010
 */
public class GeneratorMappings {

  /* mapping,input -> output */
  private final Map<String, Map<SNode, Object>> myMappingNameAndInputNodeToOutputNodeMap = new HashMap<String, Map<SNode, Object>>();

  /* input -> output */
  private final Map<SNode, Object> myCopiedOutputNodeForInputNode;

  /* null value means multiple nodes for the template */
  private final Map<SNode, SNode> myTemplateNodeToOutputNodeMap = new HashMap<SNode, SNode>();

  /* template,input -> output */
  private final Map<Pair<SNode, SNode>, SNode> myTemplateNodeAndInputNodeToOutputNodeMap = new HashMap<Pair<SNode, SNode>, SNode>();

  public GeneratorMappings(int numberOfNodesInModel) {
    /* we use non-default load factor to reduce memory usage */ 
    myCopiedOutputNodeForInputNode = new HashMap<SNode, Object>(numberOfNodesInModel, 2);
  }

  synchronized void addOutputNodeByTemplateNode(SNode templateNode, SNode outputNode) {
    if (myTemplateNodeToOutputNodeMap.containsKey(templateNode)) {
      myTemplateNodeToOutputNodeMap.put(templateNode, null);
      return;
    }
    myTemplateNodeToOutputNodeMap.put(templateNode, outputNode);
  }

  synchronized void addOutputNodeByInputNodeAndMappingName(SNode inputNode, String mappingName, SNode outputNode) {
    if (mappingName == null) return;
    Map<SNode, Object> currentMapping = myMappingNameAndInputNodeToOutputNodeMap.get(mappingName);
    if (currentMapping == null) {
      currentMapping = new HashMap<SNode, Object>();
      myMappingNameAndInputNodeToOutputNodeMap.put(mappingName, currentMapping);
    }
    Object o = currentMapping.get(inputNode);
    if (o == null) {
      currentMapping.put(inputNode, outputNode);
    } else if (o instanceof List) {
      ((List<SNode>) o).add(outputNode);
    } else {
      List<SNode> list = new ArrayList<SNode>(4);
      list.add((SNode) o);
      list.add(outputNode);
      currentMapping.put(inputNode, list);
    }
  }

  synchronized void addCopiedOutputNodeForInputNode(SNode inputNode, SNode outputNode) {
    Object o = myCopiedOutputNodeForInputNode.get(inputNode);
    if(o == null) {
      myCopiedOutputNodeForInputNode.put(inputNode, outputNode);
    } else if (o instanceof List) {
      ((List<SNode>) o).add(outputNode);
    } else {
      List<SNode> list = new ArrayList<SNode>(2);
      list.add((SNode) o);
      list.add(outputNode);
      myCopiedOutputNodeForInputNode.put(inputNode, list);
    }
  }

  synchronized void addOutputNodeByInputAndTemplateNode(SNode inputNode, SNode templateNode, SNode outputNode) {
    // todo: combination of (templateN, inputN) -> outputN
    // todo: is not unique
    // todo: generator should report error on attempt to obtain not unique output-node
    if (templateNode == null) return;
    myTemplateNodeAndInputNodeToOutputNodeMap.put(new Pair(templateNode, inputNode), outputNode);
  }

  synchronized void addOutputNodeByIndirectInputAndTemplateNode(SNode inditectInputNode, SNode templateNode, SNode outputNode) {
    // todo: combination of (templateN, inputN) -> outputN
    // todo: is not unique
    // todo: generator should report error on attempt to obtain not unique output-node
    Pair key = new Pair(templateNode, inditectInputNode);
    if (!myTemplateNodeAndInputNodeToOutputNodeMap.containsKey(key)) {
      myTemplateNodeAndInputNodeToOutputNodeMap.put(key, outputNode);
    }
  }

  // find methods

  public SNode findOutputNodeByTemplateNodeUnique(SNode templateNode) {
    return myTemplateNodeToOutputNodeMap.get(templateNode);
  }

  public SNode findOutputNodeByInputNodeAndMappingName(SNode inputNode, String mappingName, IGeneratorLogger logger) {
    if (mappingName == null) return null;
    Map<SNode, Object> currentMapping = myMappingNameAndInputNodeToOutputNodeMap.get(mappingName);
    if (currentMapping == null) return null;
    Object o = currentMapping.get(inputNode);
    if (o instanceof List) {
      List<SNode> list = (List<SNode>) o;
      logger.warning(inputNode, "" + list.size() + " output nodes found for mapping label '" + mappingName + "' and input " + inputNode.getDebugText());
      for (int i = 0; i < list.size(); i++) {
        logger.describeWarning(list.get(i), "output [" + i + "] : " + list.get(i).getDebugText());
      }
      return list.get(0);
    }

    return (SNode) o;
  }

  public List<SNode> findAllOutputNodesByInputNodeAndMappingName(SNode inputNode, String mappingName) {
    if (mappingName == null) return null;
    Map<SNode, Object> currentMapping = myMappingNameAndInputNodeToOutputNodeMap.get(mappingName);
    if (currentMapping == null) return null;
    Object o = currentMapping.get(inputNode);
    if (o == null) return Collections.emptyList();
    if (o instanceof List) return ((List<SNode>) o);
    return Collections.singletonList((SNode) o);
  }

  public SNode findCopiedOutputNodeForInputNode(SNode inputNode) {
    Object o = myCopiedOutputNodeForInputNode.get(inputNode);
    if(o instanceof SNode) {
      return (SNode) o;
    }
    if(o instanceof List) {
      return (SNode) ((List)o).get(0);
    }
    return null;
  }

  public SNode findOutputNodeByInputAndTemplateNode(SNode inputNode, SNode templateNode) {
    return myTemplateNodeAndInputNodeToOutputNodeMap.get(new Pair(templateNode, inputNode));
  }

  public boolean isInputNodeHasUniqueCopiedOutputNode(SNode inputNode) {
    Object o = myCopiedOutputNodeForInputNode.get(inputNode);
    return !(o instanceof List);
  }
}

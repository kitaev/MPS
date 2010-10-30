package jetbrains.mps.graphLayout.util;

/*Generated by MPS */

import jetbrains.mps.graphLayout.graphLayout.LayoutInfo;
import jetbrains.mps.graphLayout.graph.Graph;
import jetbrains.mps.graphLayout.graph.Node;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.graphLayout.graph.Edge;

public class LayoutInfoCopier extends GraphCopier {
  private LayoutInfo myLayoutInfo;
  private LayoutInfo myInfoCopy;

  public LayoutInfoCopier(LayoutInfo layoutInfo) {
    super(layoutInfo.getGraph());
    myLayoutInfo = layoutInfo;
    myInfoCopy = new LayoutInfo(getCopy());
  }

  @Override
  public Graph copySubgraph(Filter<Node> nodeFilter) {
    Graph copy = super.copySubgraph(nodeFilter);
    for (Node node : SetSequence.fromSet(myLayoutInfo.getNodesWithSize())) {
      if (nodeFilter.accept(node)) {
        Node copyNode = getNodeCopy(node);
        myInfoCopy.setNodeSize(copyNode, myLayoutInfo.getSize(node));
      }
    }
    for (Edge edge : SetSequence.fromSet(myLayoutInfo.getLabeledEdges())) {
      if (acceptEdge(nodeFilter, edge)) {
        Edge copyEdge = getEdgeCopy(edge);
        myInfoCopy.setLabelSize(copyEdge, myLayoutInfo.getSize(edge));
      }
    }
    return copy;
  }

  public LayoutInfo getLayoutInfoCopy() {
    return myInfoCopy;
  }
}

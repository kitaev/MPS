package jetbrains.mps.generator.newGenerator;

import jetbrains.mps.generator.template.IReferenceResolver;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.generator.template.AbstractTemplateGenerator;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SReference;

import java.util.List;

/**
 * Created by: Sergey Dmitriev
 * Date: Jan 25, 2007
 */
public class ReferenceInfo_CopiedInputNode extends ReferenceInfo {
  private SReference myInputReference;
  private SNode myInputSourceNode;
  private SNode myInputTargetNode;


  public ReferenceInfo_CopiedInputNode(SNode outputNode, SReference inputReference) {
    super(outputNode, inputReference.getRole(), inputReference.getSourceNode());
    myInputReference = inputReference;
    myInputSourceNode = inputReference.getSourceNode();
    myInputTargetNode = inputReference.getTargetNode();
  }

  public SNode executeIndependentResolve(ITemplateGenerator generator) {
    return findInMaps(((TemplateModelGenerator_New) generator).getMappingData());
  }

  public SNode executeDependentResolve(ITemplateGenerator generator) {
    return executeCustomResolver();
  }

  public SNode resolveAnyhow(ITemplateGenerator generator) {
    // nothing
    return null;
  }

  /**
   * test postponed references
   */
  public SNode doResolve(GeneratorMappingData mappingData) {
    SNode node = findInMaps(mappingData);
    if(node != null) {
      return node;
    }
    return executeCustomResolver();
  }

  private SNode findInMaps(GeneratorMappingData generator) {
    {
      // output target node might has been copied (reduced) from the input target node
      SNode outputTargetNode = generator.findCopiedOutputNodeForInputNode(myInputTargetNode);
      if (outputTargetNode != null) {
        return outputTargetNode;
      }
    }

    {
      // todo: hack
      List<SNode> topOutputNodes = generator.getTopOutputNodesForInputNode(myInputTargetNode);
      if (!topOutputNodes.isEmpty()) {
        String wasConcept = myInputTargetNode.getConceptFqName();
        SNode outputTargetNode = null;
        for (SNode _outputNode : topOutputNodes) {
          // same concept?
          if (_outputNode.getConceptFqName().equals(wasConcept)) {
            if (outputTargetNode != null) {
              // no uniquess
              outputTargetNode = null;
              break;
            }
            outputTargetNode = _outputNode;
          }
        }

        if (outputTargetNode != null) {
          return outputTargetNode;
        }
      }
    }

    return null;
  }
  private SNode executeCustomResolver() {
    // try to resolve using custom referense resolver for source node concept
    // todo: some reference-resolvers can be executed on the 'executeIndependentResolve' step
    IReferenceResolver referenceResolver = loadReferenceResolver(myInputSourceNode);
    if (referenceResolver != null) {
      SNode outputTargetNode = referenceResolver.resolve(getOutputNode(), myInputReference);
      return outputTargetNode;
    }
    return null;
  }

  public boolean isRequired() {
    return true;
  }

  public void showErrorMessage(TemplateModelGenerator_New generator) {
    generator.showErrorMessage(getOutputNode(), "couldn't resolve reference '" + myInputReference.getRole() + "' in output node " + getOutputNode().getDebugText());
    generator.showErrorMessage(myInputSourceNode, "-- original reference was " + myInputSourceNode.getDebugText());
  }
}

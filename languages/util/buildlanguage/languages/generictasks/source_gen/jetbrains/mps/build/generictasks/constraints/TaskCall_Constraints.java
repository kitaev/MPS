package jetbrains.mps.build.generictasks.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseReferenceScopeProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Map;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import jetbrains.mps.build.generictasks.behavior.ITaskDeclaration_Behavior;
import jetbrains.mps.build.generictasks.behavior.AttributeDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;

public class TaskCall_Constraints extends BaseConstraintsDescriptor {
  private static SNodePointer breakingNode_sufet9_a0a1a0a0a1 = new SNodePointer("r:71eee63a-b16f-40f8-920d-8fd0fe7dc8a1(jetbrains.mps.build.generictasks.constraints)", "353793545802644535");
  private static SNodePointer breakingNode_sufet9_a0a1a0a0a4a0b0a1a3 = new SNodePointer("r:71eee63a-b16f-40f8-920d-8fd0fe7dc8a1(jetbrains.mps.build.generictasks.constraints)", "353793545802644482");

  public TaskCall_Constraints() {
    super("jetbrains.mps.build.generictasks.structure.TaskCall");
  }

  @Override
  public boolean hasOwnDefaultScopeProvider() {
    return true;
  }

  @Override
  public ReferenceScopeProvider getDefaultScopeProvider() {
    return new BaseReferenceScopeProvider() {
      @Override
      public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
        List<SNode> nodes = SModelOperations.getNodesIncludingImported(_context.getModel(), operationContext.getScope(), "jetbrains.mps.build.generictasks.structure.TaskCall");
        List<SNode> visible = new ArrayList<SNode>();
        for (SNode call : ListSequence.fromList(nodes)) {
          if ((SPropertyOperations.getString(call, "name") != null) && (SNodeOperations.getContainingRoot(call) == SNodeOperations.getContainingRoot(_context.getEnclosingNode()))) {
            ListSequence.fromList(visible).addElement(call);
          }
        }
        return visible;
      }

      @Override
      public SNodePointer getSearchScopeValidatorNode() {
        return breakingNode_sufet9_a0a1a0a0a1;
      }
    };
  }

  @Override
  protected Map<String, PropertyConstraintsDescriptor> getNotDefaultProperties() {
    Map<String, PropertyConstraintsDescriptor> properties = new HashMap();
    properties.put("name", new BasePropertyConstraintsDescriptor("name", this) {
      @Override
      public boolean hasOwnGetter() {
        return true;
      }

      @Override
      public Object getValue(SNode node, IScope scope) {
        String propertyName = "name";
        return SPropertyOperations.getString(node, "id");
      }
    });
    return properties;
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("declaration", new BaseReferenceConstraintsDescriptor("declaration", this) {
      @Override
      public boolean hasOwnOnReferenceSetHandler() {
        return true;
      }

      @Override
      public boolean validate(final SNode referenceNode, final SNode oldReferentNode, final SNode newReferentNode, final IScope scope) {
        return true;
      }

      @Override
      public void onReferenceSet(final SNode referenceNode, final SNode oldReferentNode, final SNode newReferentNode, final IScope scope) {
        for (SNode attrDecl : ITaskDeclaration_Behavior.call_getAttributesDeclarations_1190349257898147625(newReferentNode)) {
          if (AttributeDeclaration_Behavior.call_isRequired_353793545802643811(attrDecl)) {
            SNode attr = SConceptOperations.createNewNode("jetbrains.mps.build.generictasks.structure.Attribute", null);
            SLinkOperations.setTarget(attr, "attributeDeclaration", attrDecl, false);
            ListSequence.fromList(SLinkOperations.getTargets(referenceNode, "atributes", true)).addElement(attr);
          }
        }
      }

      @Override
      public boolean hasOwnScopeProvider() {
        return true;
      }

      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseReferenceScopeProvider() {
          @Override
          public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            List<SNode> declarations = SModelOperations.getNodesIncludingImported(_context.getModel(), operationContext.getScope(), "jetbrains.mps.build.generictasks.structure.ITaskDeclaration");
            if (!(SNodeOperations.isInstanceOf(_context.getEnclosingNode(), "jetbrains.mps.build.generictasks.structure.TaskCall"))) {
              return new SequenceSearchScope(ListSequence.fromList(declarations).where(new IWhereFilter<SNode>() {
                public boolean accept(SNode it) {
                  return ITaskDeclaration_Behavior.call_canBeRootTask_1449762848926780427(it);
                }
              })) {
                @Override
                public boolean isInScope(SNode node) {
                  return SNodeOperations.isInstanceOf(node, "jetbrains.mps.build.generictasks.structure.ITaskDeclaration") && ITaskDeclaration_Behavior.call_canBeRootTask_1449762848926780427(SNodeOperations.cast(node, "jetbrains.mps.build.generictasks.structure.ITaskDeclaration"));
                }
              };
            }
            final List<SNode> nesteds = ITaskDeclaration_Behavior.call_getNestedTasks_4241383766070831847(SLinkOperations.getTarget(SNodeOperations.cast(_context.getEnclosingNode(), "jetbrains.mps.build.generictasks.structure.TaskCall"), "declaration", false));
            return new SequenceSearchScope(ITaskDeclaration_Behavior.call_getPossibleNesteds_1449762848926780436(SLinkOperations.getTarget(SNodeOperations.cast(_context.getEnclosingNode(), "jetbrains.mps.build.generictasks.structure.TaskCall"), "declaration", false), declarations)) {
              @Override
              public boolean isInScope(SNode node) {
                return SNodeOperations.isInstanceOf(node, "jetbrains.mps.build.generictasks.structure.ITaskDeclaration") && ITaskDeclaration_Behavior.call_isPossibleNested_1648602681640249389(SLinkOperations.getTarget(SNodeOperations.cast(_context.getEnclosingNode(), "jetbrains.mps.build.generictasks.structure.TaskCall"), "declaration", false), SNodeOperations.cast(node, "jetbrains.mps.build.generictasks.structure.ITaskDeclaration"), nesteds);
              }
            };
          }

          @Override
          public SNodePointer getSearchScopeValidatorNode() {
            return breakingNode_sufet9_a0a1a0a0a4a0b0a1a3;
          }
        };
      }
    });
    return references;
  }
}

package jetbrains.mps.build.generictasks.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Map;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseReferenceScopeProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.search.SimpleSearchScope;

public class TaskReference_Constraints extends BaseConstraintsDescriptor {
  private static SNodePointer breakingNode_6artq6_a0a1a0a0a1a0b0a1a0 = new SNodePointer("r:71eee63a-b16f-40f8-920d-8fd0fe7dc8a1(jetbrains.mps.build.generictasks.constraints)", "3037831562615764092");

  public TaskReference_Constraints() {
    super("jetbrains.mps.build.generictasks.structure.TaskReference");
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("declaration", new BaseReferenceConstraintsDescriptor("declaration", this) {
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
            List<SNode> decls = SModelOperations.getNodesIncludingImported(_context.getModel(), operationContext.getScope(), "jetbrains.mps.buildlanguage.structure.IDeclaration");
            if (SNodeOperations.isInstanceOf(_context.getEnclosingNode(), "jetbrains.mps.build.generictasks.structure.BuiltInTaskDeclaration") && SNodeOperations.hasRole(_context.getReferenceNode(), "jetbrains.mps.build.generictasks.structure.BuiltInTaskDeclaration", "fakeDeclaration")) {
              List<SNode> newDecls = new ArrayList<SNode>();
              for (SNode decl : ListSequence.fromList(decls)) {
                if (SNodeOperations.isInstanceOf(decl, "jetbrains.mps.build.generictasks.structure.TaskInterfaceDeclaration")) {
                  ListSequence.fromList(newDecls).addElement(decl);
                }
              }
              return new SimpleSearchScope(newDecls);
            } else
            if (SNodeOperations.isInstanceOf(_context.getEnclosingNode(), "jetbrains.mps.build.generictasks.structure.BuiltInTaskDeclaration") && SNodeOperations.hasRole(_context.getReferenceNode(), "jetbrains.mps.build.generictasks.structure.BuiltInTaskDeclaration", "fakeDeclaration")) {
              List<SNode> newDecls = new ArrayList<SNode>();
              for (SNode decl : ListSequence.fromList(decls)) {
                if (!(SNodeOperations.isInstanceOf(decl, "jetbrains.mps.build.generictasks.structure.TaskInterfaceDeclaration"))) {
                  ListSequence.fromList(newDecls).addElement(decl);
                }
              }
              return new SimpleSearchScope(newDecls);
            }
            return decls;
          }

          @Override
          public SNodePointer getSearchScopeValidatorNode() {
            return breakingNode_6artq6_a0a1a0a0a1a0b0a1a0;
          }
        };
      }
    });
    return references;
  }
}

/*
 * Copyright 2003-2010 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.smodel.structure;

import com.intellij.openapi.util.Computable;
import com.intellij.openapi.util.Pair;
import com.intellij.util.Function;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.*;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.SModelOperations;
import jetbrains.mps.smodel.behaviour.BehaviorConstants;
import jetbrains.mps.smodel.constraints.*;
import jetbrains.mps.util.NameUtil;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static jetbrains.mps.smodel.constraints.ModelConstraintsManager.constraintsClassByConceptFqName;
import static jetbrains.mps.smodel.structure.DescriptorUtils.getClassByNameForConcept;

public class InterpretedConstraintsProvider extends DescriptorProvider<ConstraintsDescriptor> {
  @Override
  public ConstraintsDescriptor getDescriptor(String fqName) {
    return new InterpretedConstraints(fqName);
  }

  public static class InterpretedConstraints extends ConstraintsDescriptor {
    private static final Logger LOG = Logger.getLogger(InterpretedConstraints.class);

    private final Method canBeAChildMethod;
    private final Method canBeAParentMethod;
    private final Method canBeARootMethod;
    private final Method canBeAnAncestorMethod;

    private final Method alternativeIconMethod;
    private final Method defaultConcreteConceptFqNameMethod;

    private final String fqName;

    // caches for property getters/setters/validators
    private final Map<String, INodePropertyGetter> propertyGetter = new ConcurrentHashMap<String, INodePropertyGetter>();
    private final Map<String, INodePropertySetter> propertySetter = new ConcurrentHashMap<String, INodePropertySetter>();
    private final Map<String, INodePropertyValidator> propertyValidator = new ConcurrentHashMap<String, INodePropertyValidator>();

    public InterpretedConstraints(String fqName) {
      this.fqName = fqName;

      canBeAChildMethod = getMethodUsingInheritanceWithModelAccess(fqName, BehaviorConstants.CAN_BE_A_CHILD_METHOD_NAME, IOperationContext.class, CanBeAChildContext.class);
      canBeAnAncestorMethod = getMethodUsingInheritanceWithModelAccess(fqName, BehaviorConstants.CAN_BE_AN_ANCESTOR_METHOD_NAME, IOperationContext.class, CanBeAnAncestorContext.class);
      canBeAParentMethod = getMethodUsingInheritanceWithModelAccess(fqName, BehaviorConstants.CAN_BE_A_PARENT_METHOD_NAME, IOperationContext.class, CanBeAParentContext.class);
      canBeARootMethod = getMethodUsingInheritanceWithModelAccess(fqName, BehaviorConstants.CAN_BE_A_ROOT_METHOD_NAME, IOperationContext.class, CanBeARootContext.class);

      alternativeIconMethod = getMethodUsingInheritanceWithModelAccess(fqName, BehaviorConstants.GET_ALTERNATIVE_ICON_METHOD_NAME, SNode.class);
      defaultConcreteConceptFqNameMethod = getMethodUsingInheritanceWithModelAccess(fqName, BehaviorConstants.GET_DEFAULT_CONCRETE_CONCEPT_FQ_NAME);
    }

    private static class MethodInfo {
      public final String methodName;
      public final Class[] parameterTypes;

      MethodInfo(String methodName, Class... parameterTypes) {
        this.methodName = methodName;
        this.parameterTypes = parameterTypes;
      }
    }

    private static final Function<Pair<String, MethodInfo>, Method> COMPUTE_FUNCTION_FOR_METHOD_INHERITANCE = new Function<Pair<String, MethodInfo>, Method>() {
      @Override
      public Method fun(Pair<String, MethodInfo> conceptFqNameAndContext) {
        String conceptFqName = conceptFqNameAndContext.first;
        Class constraintsClass = getClassByNameForConcept(constraintsClassByConceptFqName(conceptFqName), conceptFqName);

        if (constraintsClass == null) {
          return null;
        }

        try {
          return constraintsClass.getMethod(conceptFqNameAndContext.second.methodName, conceptFqNameAndContext.second.parameterTypes);
        } catch (NoSuchMethodException e) {
          //it's ok
        }

        return null;
      }
    };

    private static Method getMethodUsingInheritance(String conceptFqName, String methodName, Class... parameterTypes) {
      return computeInConceptHierarchy(conceptFqName, new MethodInfo(methodName, parameterTypes), COMPUTE_FUNCTION_FOR_METHOD_INHERITANCE);
    }

    // compute in hierarchy while result is null. Returns first not null result. C - context. todo: javadoc
    private static <T, C> T computeInConceptHierarchy(String topConceptFqName, C context, Function<Pair<String, C>, T> computeFunction) {
      SNode topConcept = SModelUtil.findConceptDeclaration(topConceptFqName, GlobalScope.getInstance());

      if (topConcept != null) {
        // todo: using only concept descriptors!
        List<SNode> conceptAndSuperConcepts = SModelUtil_new.getConceptAndSuperConcepts(topConcept);

        for (SNode concept : conceptAndSuperConcepts) {
          String fqName = NameUtil.nodeFQName(concept);

          T result = computeFunction.fun(Pair.create(fqName, context));

          if (result != null) {
            return result;
          }
        }
      }

      return null;
    }

    private static Method getMethodUsingInheritanceWithModelAccess(final String conceptFqName, final String methodName, final Class... parameterTypes) {
      return ModelAccess.instance().runReadAction(new Computable<Method>() {
        @Override
        public Method compute() {
          return getMethodUsingInheritance(conceptFqName, methodName, parameterTypes);
        }
      });
    }

    private static boolean invokeCanBeASomethingMethod(Method method, IOperationContext operationContext, Object _context) {
      if (method != null) {
        try {
          return (Boolean) method.invoke(null, operationContext, _context);
        } catch (IllegalAccessException e) {
          LOG.error(e);
        } catch (InvocationTargetException e) {
          LOG.error(e);
        }
      }
      return true;
    }

    private static SNodePointer getConceptConstraint(final Method method, final IOperationContext context, final String role) {
      return ModelAccess.instance().runReadAction(new Computable<SNodePointer>() {
        @Override
        public SNodePointer compute() {
          return NodeReadAccessCasterInEditor.runReadTransparentAction(new Computable<SNodePointer>() {
            @Override
            public SNodePointer compute() {
              SNode constraints = getConceptConstraints(context, method);
              if (constraints == null) {
//          throw new RuntimeException("Empty concept constraints");
                return null;
              } else {
                return new SNodePointer(SLinkOperations.getTarget(constraints, role, true));
              }
            }
          });
        }
      });
    }

    @Override
    public boolean canBeAChild(IOperationContext operationContext, CanBeAChildContext _context, @Nullable CheckingNodeContext checkingNodeContext) {
      boolean result = invokeCanBeASomethingMethod(canBeAChildMethod, operationContext, _context);

      if (checkingNodeContext != null && !result) {
        checkingNodeContext.breakingNodePointer = getConceptConstraint(canBeAChildMethod, operationContext, "canBeChild");
      }

      return result;
    }

    @Override
    public boolean canBeAParent(final IOperationContext operationContext, CanBeAParentContext _context, @Nullable final CheckingNodeContext checkingNodeContext) {
      boolean result = invokeCanBeASomethingMethod(canBeAParentMethod, operationContext, _context);

      if (checkingNodeContext != null && !result) {
        checkingNodeContext.breakingNodePointer = getConceptConstraint(canBeAParentMethod, operationContext, "canBeParent");
      }

      return result;
    }

    @Override
    public boolean canBeARoot(final IOperationContext operationContext, CanBeARootContext _context, @Nullable final CheckingNodeContext checkingNodeContext) {
      if (!ModelAccess.instance().runReadAction(new Computable<Boolean>() {
        @Override
        public Boolean compute() {
          SNode concept = SModelUtil.findConceptDeclaration(fqName, operationContext.getScope());
          if (!(SNodeUtil.isInstanceOfConceptDeclaration(concept) && SNodeUtil.getConceptDeclaration_IsRootable(concept))) {
            if (checkingNodeContext != null) {
              checkingNodeContext.breakingNodePointer = new SNodePointer(concept);
            }

            return false;
          } else {
            return true;
          }
        }
      })) {
        return false;
      }

      boolean result = invokeCanBeASomethingMethod(canBeARootMethod, operationContext, _context);
      if (checkingNodeContext != null && !result) {
        checkingNodeContext.breakingNodePointer = getConceptConstraint(canBeARootMethod, operationContext, "canBeRoot");
      }

      return result;
    }

    @Override
    public boolean canBeAnAncestor(IOperationContext operationContext, CanBeAnAncestorContext _context, @Nullable CheckingNodeContext checkingNodeContext) {
      boolean result = invokeCanBeASomethingMethod(canBeAnAncestorMethod, operationContext, _context);

      if (checkingNodeContext != null && !result) {
        checkingNodeContext.breakingNodePointer = getConceptConstraint(canBeAnAncestorMethod, operationContext, "canBeAncestor");
      }

      return result;
    }

    @Override
    public boolean isAlternativeIcon() {
      return alternativeIconMethod != null;
    }

    @Override
    public String getAlternativeIcon(SNode node) {
      try {
        return (String) alternativeIconMethod.invoke(null, node);
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public String getDefaultConcreteConceptFqName() {
      if (defaultConcreteConceptFqNameMethod == null) {
        return fqName;
      }

      try {
        return (String) defaultConcreteConceptFqNameMethod.invoke(null);
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    private static SNode getConceptConstraints(IOperationContext context, Method method) {
      Class cls = method.getDeclaringClass();
      String fqName = cls.getName();
      String modelName = NameUtil.namespaceFromLongName(fqName);
      String rootName = NameUtil.shortNameFromLongName(fqName);
      Language language = context.getScope().getLanguage(NameUtil.namespaceFromLongName(modelName));
      if (language == null) {
        return null;
      }
      SModelDescriptor sm = language.getConstraintsModelDescriptor();
      if (sm == null) return null;
      SNode root = SModelOperations.getRootByName(sm.getSModel(), rootName);
      if (root == null) return null;
      if (SNodeOperations.isInstanceOf(root, SConstraintsUtil.concept_ConceptConstraints)) {
        return root;
      }
      return null;
    }
  }
}

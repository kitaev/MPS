package jetbrains.mps.constraints;

/*Generated by MPS */

import jetbrains.mps.datatransfer.AbstractManager;
import jetbrains.mps.logging.Logger;
import java.util.Map;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.reloading.ClassLoaderManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.CanBeAChildContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.behaviour.BehaviorConstants;
import jetbrains.mps.smodel.constraints.CanBeAParentContext;
import jetbrains.mps.smodel.constraints.CanBeARootContext;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.application.ApplicationManager;
import java.util.ArrayList;

public class ConceptConstraintExtensionsManager extends AbstractManager {
  private static final Logger LOG = Logger.getLogger(ConceptConstraintExtensionsManager.class);

  private Map<SNode, List<AbstractManager.Descriptor>> myCanBeChildExtensions;
  private Map<SNode, List<AbstractManager.Descriptor>> myCanBeParentExtensions;
  private Map<SNode, List<AbstractManager.Descriptor>> myCanBeRootExtensions;
  private boolean myInitialized = false;

  public ConceptConstraintExtensionsManager(ClassLoaderManager classLoaderManager) {
    super(classLoaderManager);
  }

  public boolean checkCanBeChild(SNode concept, IOperationContext operationContext, CanBeAChildContext context) {
    List<AbstractManager.Descriptor> extensions = getCanBeChildExtensions(concept);
    if (extensions != null) {
      for (AbstractManager.Descriptor extension : ListSequence.fromList(extensions)) {
        if (!(invokeConstraintMethod(extension.getInstance(), operationContext, context, BehaviorConstants.CAN_BE_A_CHILD_METHOD_NAME))) {
          return false;
        }
      }
    }
    return true;
  }

  public boolean checkCanBeParent(SNode concept, IOperationContext operationContext, CanBeAParentContext context) {
    List<AbstractManager.Descriptor> extensions = getCanBeParentExtensions(concept);
    if (extensions != null) {
      for (AbstractManager.Descriptor extension : ListSequence.fromList(extensions)) {
        if (!(invokeConstraintMethod(extension.getInstance(), operationContext, context, BehaviorConstants.CAN_BE_A_PARENT_METHOD_NAME))) {
          return false;
        }
      }
    }
    return true;
  }

  public boolean checkCanBeRoot(SNode concept, IOperationContext operationContext, CanBeARootContext context) {
    List<AbstractManager.Descriptor> extensions = getCanBeRootExtensions(concept);
    if (extensions != null) {
      for (AbstractManager.Descriptor extension : ListSequence.fromList(extensions)) {
        if (!(invokeConstraintMethod(extension.getInstance(), operationContext, context, BehaviorConstants.CAN_BE_A_ROOT_METHOD_NAME))) {
          return false;
        }
      }
    }
    return true;
  }

  private boolean invokeConstraintMethod(Object classInstance, IOperationContext operationConcext, Object canBeXContext, String methodName) {
    try {
      Method method = classInstance.getClass().getMethod(methodName, IOperationContext.class, canBeXContext.getClass());
      Object result = method.invoke(classInstance, operationConcext, canBeXContext);
      if (result instanceof Boolean) {
        return ((Boolean) result);
      } else {
        LOG.warning(methodName + " return type is incorrect - \"" + result + "\" was returned instead of boolean.");
      }
    } catch (NoSuchMethodException ex) {
      LOG.warning("Unable to find " + methodName + " method in generated class " + classInstance.getClass().getName() + " Regeneration required.", ex);
    } catch (InvocationTargetException ex) {
      LOG.warning("Unable to run " + methodName + " method in generated class " + classInstance.getClass().getName(), ex);
    } catch (IllegalAccessException ex) {
      LOG.warning("Unable to run " + methodName + " method in generated class " + classInstance.getClass().getName() + " Regeneration required.", ex);
    }
    return true;
  }

  private synchronized List<AbstractManager.Descriptor> getCanBeChildExtensions(SNode concept) {
    initialize();
    return MapSequence.fromMap(myCanBeChildExtensions).get(concept);
  }

  private synchronized List<AbstractManager.Descriptor> getCanBeParentExtensions(SNode concept) {
    initialize();
    return MapSequence.fromMap(myCanBeParentExtensions).get(concept);
  }

  private synchronized List<AbstractManager.Descriptor> getCanBeRootExtensions(SNode concept) {
    initialize();
    return MapSequence.fromMap(myCanBeRootExtensions).get(concept);
  }

  private void initialize() {
    if (myInitialized) {
      return;
    }

    myCanBeChildExtensions = MapSequence.fromMap(new HashMap<SNode, List<AbstractManager.Descriptor>>());
    myCanBeParentExtensions = MapSequence.fromMap(new HashMap<SNode, List<AbstractManager.Descriptor>>());
    myCanBeRootExtensions = MapSequence.fromMap(new HashMap<SNode, List<AbstractManager.Descriptor>>());

    for (Language language : MPSModuleRepository.getInstance().getAllLanguages()) {
      SModelDescriptor constraintsModelDescriptor = language.getConstraintsModelDescriptor();
      if (constraintsModelDescriptor != null) {
        List<SNode> roots = constraintsModelDescriptor.getSModel().getRoots();
        for (SNode constraintsExtension : ListSequence.fromList(roots).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return SNodeOperations.isInstanceOf(it, "jetbrains.mps.lang.constraints.structure.ConceptConstraintsExtension");
          }
        }).select(new ISelector<SNode, SNode>() {
          public SNode select(SNode it) {
            return SNodeOperations.cast(it, "jetbrains.mps.lang.constraints.structure.ConceptConstraintsExtension");
          }
        })) {
          SNode constraintExtensionConcept = SLinkOperations.getTarget(constraintsExtension, "concept", false);
          AbstractManager.Descriptor descriptor = new AbstractManager.Descriptor(INamedConcept_Behavior.call_getFqName_1213877404258(constraintsExtension), language, LOG);
          if (SLinkOperations.getTarget(constraintsExtension, "canBeChild", true) != null) {
            ListSequence.fromList(safeGet(myCanBeChildExtensions, constraintExtensionConcept)).addElement(descriptor);
          }
          if (SLinkOperations.getTarget(constraintsExtension, "canBeParent", true) != null) {
            ListSequence.fromList(safeGet(myCanBeParentExtensions, constraintExtensionConcept)).addElement(descriptor);
          }
          if (SLinkOperations.getTarget(constraintsExtension, "canBeRoot", true) != null) {
            ListSequence.fromList(safeGet(myCanBeRootExtensions, constraintExtensionConcept)).addElement(descriptor);
          }
        }
      }
    }
  }

  public final synchronized void clearCaches() {
    myCanBeChildExtensions = null;
    myCanBeParentExtensions = null;
    myCanBeRootExtensions = null;
    myInitialized = false;
  }

  @NonNls
  @NotNull
  public String getComponentName() {
    return "Concept Constraints Extension Manager";
  }

  public static ConceptConstraintExtensionsManager getInstance() {
    return ApplicationManager.getApplication().getComponent(ConceptConstraintExtensionsManager.class);
  }

  private static List<AbstractManager.Descriptor> safeGet(Map<SNode, List<AbstractManager.Descriptor>> map, SNode concept) {
    List<AbstractManager.Descriptor> result = MapSequence.fromMap(map).get(concept);
    if (result == null) {
      result = ListSequence.fromList(new ArrayList<AbstractManager.Descriptor>());
      MapSequence.fromMap(map).put(concept, result);
    }
    return result;
  }
}

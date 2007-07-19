package jetbrains.mps.util;

import jetbrains.mps.generator.JavaNameUtil;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.reloading.ClassLoaderManager;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUID;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class QueryMethodGenerated {
  private static final Logger LOG = Logger.getLogger(QueryMethodGenerated.class);

  private static Map<Pair<SModelUID, String>, Method> ourMethods = new HashMap<Pair<SModelUID, String>, Method>();

  public static void clearCaches() {
    ourMethods.clear();
  }

  private static Method getQueryMethod(SModel sourceModel, String methodName, boolean suppressErrorLogging) throws ClassNotFoundException, NoSuchMethodException {
    Pair<SModelUID, String> pair = new Pair<SModelUID, String>(sourceModel.getUID(), methodName);
    if (QueryMethodGenerated.ourMethods.containsKey(pair)) {
      return QueryMethodGenerated.ourMethods.get(pair);
    }

    String packageName = JavaNameUtil.packageNameForModelUID(sourceModel.getUID());
    String queriesClassName = packageName + ".QueriesGenerated";
    Class queriesClass;
    try {
      queriesClass = Class.forName(queriesClassName, true, ClassLoaderManager.getInstance().getClassLoader());
    } catch (ClassNotFoundException cfe) {
      if (!suppressErrorLogging) {
        LOG.error("couldn't find class 'QueriesGenerated' for model '" + sourceModel.getUID() + "' : TRY TO GENERATE");
      }
      throw cfe;
    }

    Method method = null;
//    outer:
//    while (queriesClass != null) {
    Method[] declaredMethods = queriesClass.getDeclaredMethods();
    for (Method declaredMethod : declaredMethods) {
      if (declaredMethod.getName().equals(methodName)) {
        method = declaredMethod;
//          break outer;
        break;
      }
    }
//      queriesClass = queriesClass.getSuperclass();
//    }

    if (method == null) {
//      throw new NoSuchMethodException("couldn't find method '" + methodName + "' in '" + queriesClassName + "' or in its supers");
      LOG.error("couldn't find method '" + methodName + "' in '" + queriesClassName + "' : TRY TO GENERATE model '" + sourceModel.getUID() + "'");
      throw new NoSuchMethodException("couldn't find method '" + methodName + "' in '" + queriesClassName + "'");
    }

    method.setAccessible(true);
    
    QueryMethodGenerated.ourMethods.put(pair, method);
    return method;
  }

  public static Object invoke(String methodName, Object[] arguments, SModel sourceModel) throws ClassNotFoundException, NoSuchMethodException {
    Method method = QueryMethodGenerated.getQueryMethod(sourceModel, methodName, false);
    try {
      return method.invoke(null, arguments);
    } catch (IllegalArgumentException e) {
      throw new RuntimeException("error invocation method: \"" + methodName + "\" in " + method.getDeclaringClass().getName(), e);
    } catch (IllegalAccessException e) {
      throw new RuntimeException("error invocation method: \"" + methodName + "\" in " + method.getDeclaringClass().getName(), e);
    } catch (InvocationTargetException e) {
      LOG.error(e.getCause());
      throw new RuntimeException("error invocation method: \"" + methodName + "\" in " + method.getDeclaringClass().getName(), e);
    }
  }

  /**
   * tmp patch (remove after buid next after 415)
   * old parameters
   * (SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext)
   * been replaced with
   * (SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator)
   * todo: replace in source?
   */
  public static Object invoke_GetReferent(String methodName, Object[] arguments_old, Object[] arguments_new, SModel sourceModel) throws ClassNotFoundException, NoSuchMethodException {
    Method method = QueryMethodGenerated.getQueryMethod(sourceModel, methodName, false);

    try {
      if (method.getParameterTypes().length == 7) {
        return method.invoke(null, arguments_old); // old
      }
      return method.invoke(null, arguments_new); // new
    } catch (IllegalArgumentException e) {
      throw new RuntimeException("error invocation method: \"" + methodName + "\" in " + method.getDeclaringClass().getName(), e);
    } catch (IllegalAccessException e) {
      throw new RuntimeException("error invocation method: \"" + methodName + "\" in " + method.getDeclaringClass().getName(), e);
    } catch (InvocationTargetException e) {
      LOG.error(e.getCause());
      throw new RuntimeException("error invocation method: \"" + methodName + "\" in " + method.getDeclaringClass().getName(), e);
    }
  }

  /**
   * tmp patch (remove after buid next after 415)
   * old parameters
   * (SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext)
   * been replaced with
   * (SNode node, SNode parentOutputNode, ITemplateGenerator generator)
   */
  public static Object invoke_MapperFunction(String methodName, Object[] arguments_old, Object[] arguments_new, SModel sourceModel) throws ClassNotFoundException, NoSuchMethodException {
    Method method = QueryMethodGenerated.getQueryMethod(sourceModel, methodName, false);

    try {
      if (method.getParameterTypes().length == 5) {
        return method.invoke(null, arguments_old); // old
      }
      return method.invoke(null, arguments_new); // new
    } catch (IllegalArgumentException e) {
      throw new RuntimeException("error invocation method: \"" + methodName + "\" in " + method.getDeclaringClass().getName(), e);
    } catch (IllegalAccessException e) {
      throw new RuntimeException("error invocation method: \"" + methodName + "\" in " + method.getDeclaringClass().getName(), e);
    } catch (InvocationTargetException e) {
      LOG.error(e.getCause());
      throw new RuntimeException("error invocation method: \"" + methodName + "\" in " + method.getDeclaringClass().getName(), e);
    }
  }
}

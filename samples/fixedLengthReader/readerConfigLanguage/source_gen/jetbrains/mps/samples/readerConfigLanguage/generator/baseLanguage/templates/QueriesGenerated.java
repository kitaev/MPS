package jetbrains.mps.samples.readerConfigLanguage.generator.baseLanguage.templates;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.baseLanguage.structure.ClassConcept;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class QueriesGenerated {

  public static Object propertyMacro_GetPropertyValue_1197680735636(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1197681064561(final IOperationContext operationContext, final PropertyMacroContext _context) {
    String suffix = SPropertyOperations.getString(_context.getNode(), "targetClass");
    int index = suffix.lastIndexOf(".");
    if (index > 0) {
      suffix = suffix.substring(index + 1);
    }
    return "Configure" + suffix;
  }

  public static Object propertyMacro_GetPropertyValue_1197681249881(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "code");
  }

  public static Object propertyMacro_GetPropertyValue_1197681829639(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(_context.getNode(), "start");
  }

  public static Object propertyMacro_GetPropertyValue_1197681847303(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(_context.getNode(), "end");
  }

  public static Object propertyMacro_GetPropertyValue_1197681859608(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object referenceMacro_GetReferent_1197681322565(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    String className = SPropertyOperations.getString(_context.getNode(), "targetClass");
    ClassConcept clazz = SModelUtil_new.findNodeByFQName(className, ClassConcept.class, _context.getScope());
    if (clazz == null) {
      _context.showErrorMessage(_context.getNode(), "couldn't find mapping target class fqName: " + className);
      return null;
    }
    return ((SNode)clazz.getNode());
  }

  public static Iterable sourceNodesQuery_1197681023761(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "mapping", true);
  }

  public static Iterable sourceNodesQuery_1197681041037(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "mapping", true);
  }

  public static Iterable sourceNodesQuery_1197681816362(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "field", true);
  }

}

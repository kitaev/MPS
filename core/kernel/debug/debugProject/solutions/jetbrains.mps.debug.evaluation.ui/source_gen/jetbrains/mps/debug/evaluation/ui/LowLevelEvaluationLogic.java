package jetbrains.mps.debug.evaluation.ui;

/*Generated by MPS */

import jetbrains.mps.logging.Logger;
import jetbrains.mps.baseLanguage.search.AbstractClassifiersScope;
import java.util.Map;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.debug.runtime.JavaUiState;
import jetbrains.mps.debug.runtime.DebugSession;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.AttributesRolesUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.project.IModule;
import jetbrains.mps.reloading.IClassPathItem;
import jetbrains.mps.project.AbstractModule;
import java.util.Collections;
import java.util.Set;
import jetbrains.mps.project.StubPath;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.reloading.EachClassPathItemVisitor;
import jetbrains.mps.reloading.JarFileClassPathItem;
import jetbrains.mps.reloading.FileClassPathItem;
import jetbrains.mps.stubs.StubReloadManager;
import org.jetbrains.annotations.Nullable;
import com.sun.jdi.Type;
import com.sun.jdi.ClassNotLoadedException;
import com.sun.jdi.PrimitiveType;
import com.sun.jdi.BooleanType;
import com.sun.jdi.ByteType;
import com.sun.jdi.ShortType;
import com.sun.jdi.LongType;
import com.sun.jdi.IntegerType;
import com.sun.jdi.DoubleType;
import com.sun.jdi.FloatType;
import com.sun.jdi.CharType;
import com.sun.jdi.ArrayType;
import jetbrains.mps.debug.runtime.java.programState.proxies.JavaStackFrame;
import com.sun.jdi.Location;
import jetbrains.mps.debug.api.info.StacktraceUtil;
import com.sun.jdi.AbsentInformationException;
import com.sun.jdi.ObjectReference;
import java.util.List;
import jetbrains.mps.util.Condition;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.debug.api.DebugInfoManager;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.stubs.javastub.classpath.StubHelper;
import jetbrains.mps.baseLanguage.search.ReachableClassifiersScope;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;
import com.sun.jdi.StackFrame;
import com.sun.jdi.LocalVariable;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import com.sun.jdi.InvalidStackFrameException;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class LowLevelEvaluationLogic extends AbstractEvaluationLogic {
  private static final Logger LOG = Logger.getLogger(LowLevelEvaluationLogic.class);

  private AbstractClassifiersScope myScope;
  private final Map<String, SNode> myUsedVars = MapSequence.fromMap(new HashMap<String, SNode>());

  public LowLevelEvaluationLogic(@NotNull IOperationContext context, @NotNull JavaUiState state, @NotNull DebugSession debugSession) {
    super(context, state, debugSession);

    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        SLinkOperations.setNewChild(myEvaluator, "evaluatedStatement", "jetbrains.mps.baseLanguage.structure.BlockStatement");
        SLinkOperations.setNewChild(SLinkOperations.getTarget(myEvaluator, "evaluatedStatement", true), AttributesRolesUtil.childRoleFromAttributeRole("toEvaluateAnnotation"), "jetbrains.mps.debug.evaluation.structure.ToEvaluateAnnotation");
        SPropertyOperations.set(myEvaluator, "isRuntime", "" + (true));
      }
    });
    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        IModule locationModule = getLocationModel().getModelDescriptor().getModule();
        IClassPathItem classPath = AbstractModule.getDependenciesClasspath(Collections.singleton(locationModule), true);
        final Set<StubPath> pathsToAdd = SetSequence.fromSet(new HashSet<StubPath>());
        classPath.accept(new EachClassPathItemVisitor() {
          @Override
          public void visit(JarFileClassPathItem item) {
            String path = item.getFile().getAbsolutePath();
            StubPath stubPath = myAuxModule.addStubPath(path);
            if (stubPath != null) {
              SetSequence.fromSet(pathsToAdd).addElement(stubPath);
            }
          }

          @Override
          public void visit(FileClassPathItem item) {
            String path = item.getClassPath();
            StubPath stubPath = myAuxModule.addStubPath(path);
            if (stubPath != null) {
              SetSequence.fromSet(pathsToAdd).addElement(stubPath);
            }
          }
        });
        StubReloadManager.getInstance().loadImmediately(myAuxModule, pathsToAdd);
      }
    });
  }

  @Nullable
  private SNode getMpsTypeFromJdiType(Type type) throws ClassNotLoadedException {
    // TODO generics 
    if (type instanceof PrimitiveType) {
      if (type instanceof BooleanType) {
        return new LowLevelEvaluationLogic.QuotationClass_qka7a1_a0a0a0b0a().createNode();
      }
      if (type instanceof ByteType) {
        return new LowLevelEvaluationLogic.QuotationClass_qka7a1_a0a0b0b0a().createNode();
      }
      if (type instanceof ShortType) {
        return new LowLevelEvaluationLogic.QuotationClass_qka7a1_a0a0c0b0a().createNode();
      }
      if (type instanceof LongType) {
        return new LowLevelEvaluationLogic.QuotationClass_qka7a1_a0a0d0b0a().createNode();
      }
      if (type instanceof IntegerType) {
        return new LowLevelEvaluationLogic.QuotationClass_qka7a1_a0a0e0b0a().createNode();
      }
      if (type instanceof DoubleType) {
        return new LowLevelEvaluationLogic.QuotationClass_qka7a1_a0a0f0b0a().createNode();
      }
      if (type instanceof FloatType) {
        return new LowLevelEvaluationLogic.QuotationClass_qka7a1_a0a0g0b0a().createNode();
      }
      if (type instanceof CharType) {
        return new LowLevelEvaluationLogic.QuotationClass_qka7a1_a0a0h0b0a().createNode();
      }
    } else if (type instanceof ArrayType) {
      return new LowLevelEvaluationLogic.QuotationClass_qka7a1_a0a0a1a0().createNode(getMpsTypeFromJdiType(((ArrayType) type).componentType()));
    }
    return createClassifierType(type.name());
  }

  public SNode createStaticContextType() {
    JavaStackFrame frame = myUiState.getStackFrame();
    if (frame != null) {
      Location location = frame.getLocation().getLocation();
      try {
        final String unitType = StacktraceUtil.getUnitName(location.declaringType().name(), location.sourceName(), location.lineNumber());
        if (unitType == null) {
          return null;
        }
        return this.createClassifierType(unitType);
      } catch (AbsentInformationException e) {
        LOG.error(e);
      }
    }
    return null;
  }

  @Nullable
  public SNode createThisClassifierType() {
    ObjectReference thisObject = myUiState.getThisObject();
    if (thisObject == null) {
      return null;
    }

    return createStaticContextType();
  }

  @Nullable
  private SNode createClassifierType(final String unitFqName) {
    int lastDot = unitFqName.lastIndexOf(".");
    if (lastDot > 0) {
      String unitPackage = unitFqName.substring(0, lastDot);
      importStubForFqName(unitPackage);
    }
    final String normalizedUnitFqName = unitFqName.replace('$', '.');
    List<SNode> classifiers = myScope.getNodes(new Condition<SNode>() {
      public boolean met(@NotNull SNode node) {
        if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.Classifier"))) {
          return false;
        }

        String nodesUnitName = DebugInfoManager.getInstance().getUnitName(node);
        if (StringUtils.isEmpty(nodesUnitName)) {
          return false;
        }
        return nodesUnitName.equals(normalizedUnitFqName);
      }
    });
    if (classifiers.isEmpty()) {
      return null;
    }
    SNode classifierType = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassifierType", null);
    SLinkOperations.setTarget(classifierType, "classifier", SNodeOperations.cast(classifiers.get(0), "jetbrains.mps.baseLanguage.structure.Classifier"), false);
    return classifierType;
  }

  @NotNull
  public SNode getNodeToShow() {
    return myEvaluator;
  }

  @NotNull
  public SNode getRootToShow() {
    return myEvaluator;
  }

  @Override
  public void updateState() {
    super.updateState();
    createVars();
  }

  @Override
  public void setModel(EditableSModelDescriptor model) {
    super.setModel(model);

    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        LowLevelEvaluationLogic.this.importStubForFqName(getLocationModel().getSModelFqName().toString());
      }
    });
    createVars();
  }

  private void importStubForFqName(String fqName) {
    SModelReference stubReference = StubHelper.uidForPackageInStubs(fqName, AllMembersJavaStubs.DEBUG_JAVA_ID);
    if (stubReference == null) {
      LOG.error("Stub for " + fqName + " was not found.");
      return;
    }
    myAuxModel.getSModel().addImportedModel(stubReference);
  }

  private void createVars() {
    if (myScope == null) {
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          // creating scope 
          myScope = new ReachableClassifiersScope(myAuxModel.getSModel(), IClassifiersSearchScope.CLASSIFFIER, getModule().getScope());
        }
      });
    }

    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        fillVariables();
      }
    });
  }

  private void fillVariables() {
    JavaStackFrame javaStackFrame = myUiState.getStackFrame();
    if (javaStackFrame != null) {
      StackFrame stackFrame = javaStackFrame.getStackFrame();
      if (stackFrame != null) {
        try {

          final Set<SNode> foundVars = SetSequence.fromSet(new HashSet<SNode>());
          // create vars 
          List<LocalVariable> variables = stackFrame.visibleVariables();
          for (LocalVariable variable : ListSequence.fromList(variables)) {
            String name = variable.name();
            try {
              SNode lowLevelVarNode;
              if (!(MapSequence.fromMap(myUsedVars).containsKey(name))) {
                lowLevelVarNode = SConceptOperations.createNewNode("jetbrains.mps.debug.evaluation.structure.LowLevelVariable", null);
                SPropertyOperations.set(lowLevelVarNode, "name", name);
                ListSequence.fromList(SLinkOperations.getTargets(myEvaluator, "variables", true)).addElement(lowLevelVarNode);
                MapSequence.fromMap(myUsedVars).put(name, lowLevelVarNode);
              } else {
                lowLevelVarNode = MapSequence.fromMap(myUsedVars).get(name);
              }
              SNode deducedType = getMpsTypeFromJdiType(((LocalVariable) variable).type());
              if (deducedType == null) {
                LOG.warning("Could not deduce type for variable " + name);
                continue;
              }
              SLinkOperations.setTarget(lowLevelVarNode, "type", deducedType, true);
              SetSequence.fromSet(foundVars).addElement(lowLevelVarNode);
            } catch (ClassNotLoadedException cne) {
              LOG.warning("Exception when creating variable " + name, cne);
            }

          }

          // now mark vars which are currently out of scope 
          Sequence.fromIterable(MapSequence.fromMap(myUsedVars).values()).visitAll(new IVisitor<SNode>() {
            public void visit(SNode it) {
              SPropertyOperations.set(it, "isOutOfScope", "" + (!(SetSequence.fromSet(foundVars).contains(it))));
            }
          });

          // create static context type 
          SLinkOperations.setTarget(myEvaluator, "staticContextType", createStaticContextType(), true);
          // create this 
          SLinkOperations.setTarget(myEvaluator, "thisType", createThisClassifierType(), true);
        } catch (InvalidStackFrameException e) {
          LOG.warning("InvalidStackFrameException", e);
        } catch (AbsentInformationException e) {
          LOG.error(e);
        }

      }
    }
  }

  public static class QuotationClass_qka7a1_a0a0a0b0a {
    public QuotationClass_qka7a1_a0a0a0b0a() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.BooleanType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_qka7a1_a0a0b0b0a {
    public QuotationClass_qka7a1_a0a0b0b0a() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ByteType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_qka7a1_a0a0c0b0a {
    public QuotationClass_qka7a1_a0a0c0b0a() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ShortType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_qka7a1_a0a0d0b0a {
    public QuotationClass_qka7a1_a0a0d0b0a() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.LongType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_qka7a1_a0a0e0b0a {
    public QuotationClass_qka7a1_a0a0e0b0a() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_qka7a1_a0a0f0b0a {
    public QuotationClass_qka7a1_a0a0f0b0a() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DoubleType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_qka7a1_a0a0g0b0a {
    public QuotationClass_qka7a1_a0a0g0b0a() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.FloatType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_qka7a1_a0a0h0b0a {
    public QuotationClass_qka7a1_a0a0h0b0a() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.CharType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_qka7a1_a0a0a1a0 {
    public QuotationClass_qka7a1_a0a0a1a0() {
    }

    public SNode createNode(Object parameter_5) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ArrayType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        {
          quotedNode_2 = (SNode) parameter_5;
          SNode quotedNode1_4;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_4 = CopyUtil.copy(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_4 = quotedNode_2;
          }
          if (quotedNode1_4 != null) {
            quotedNode_1.addChild("componentType", HUtil.copyIfNecessary(quotedNode1_4));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }
}

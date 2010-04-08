package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.smodel.SNode;
import java.util.Map;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.LinkedHashMap;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.baseLanguage.behavior.ClassifierMember_Behavior;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class ConvertAnonymousRefactoring {
  private static final Set<String> ROLES_NOT_TO_COPY = SetSequence.fromSetAndArray(new HashSet<String>(), "visibility");

  private SNode myClassToRefactor;
  private String myNameForInnerClass;
  private Map<SNode, SNode> myInnerFields;
  private Map<SNode, SNode> myInnerTypeVaryables;
  private Map<SNode, SNode> myInnerConstructorParameters;
  private List<SNode> mySuperConstructorParameters;

  public ConvertAnonymousRefactoring(SNode anonymousClass, String name) {
    this.myClassToRefactor = anonymousClass;
    this.myNameForInnerClass = name;
  }

  public void doRefactor() {
    this.collectInformation();
    SNode innerClass = this.makeInnerClass();
    ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(this.myClassToRefactor, "jetbrains.mps.baseLanguage.structure.Classifier", false, false), "staticInnerClassifiers", true)).addElement(innerClass);
    SNodeOperations.replaceWithAnother(this.myClassToRefactor, this.makeInnerConstructorInvocation(ListSequence.fromList(SLinkOperations.getTargets(innerClass, "constructor", true)).getElement(0)));
  }

  private void collectInformation() {
    this.collectFields();
    this.createParameterDeclarationsForFields();
    this.collectTypeVaryables();
    this.collectSuperConstructorParameters();
  }

  private void createParameterDeclarationsForFields() {
    this.myInnerConstructorParameters = MapSequence.fromMap(new LinkedHashMap<SNode, SNode>(16, (float) 0.75, false));
    for (SNode varDeclaration : SetSequence.fromSet(MapSequence.fromMap(this.myInnerFields).keySet())) {
      MapSequence.fromMap(this.myInnerConstructorParameters).put(MapSequence.fromMap(this.myInnerFields).get(varDeclaration), new ConvertAnonymousRefactoring.QuotationClass_qy1soj_a1a0a0b0c().createNode(SLinkOperations.getTarget(varDeclaration, "type", true), SPropertyOperations.getString(varDeclaration, "name")));
    }
  }

  private void collectFields() {
    this.myInnerFields = MapSequence.fromMap(new LinkedHashMap<SNode, SNode>(16, (float) 0.75, false));
    for (SNode varReference : ListSequence.fromList(SNodeOperations.getDescendants(this.myClassToRefactor, "jetbrains.mps.baseLanguage.structure.LocalVariableReference", false, new String[]{})).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return !(ListSequence.fromList(SNodeOperations.getAncestors(SLinkOperations.getTarget(it, "variableDeclaration", false), null, false)).contains(ConvertAnonymousRefactoring.this.myClassToRefactor));
      }
    })) {
      SNode varDeclaration = SLinkOperations.getTarget(varReference, "variableDeclaration", false);
      if (!(MapSequence.fromMap(this.myInnerFields).containsKey(varDeclaration))) {
        MapSequence.fromMap(this.myInnerFields).put(varDeclaration, this.makeField(varDeclaration));
      }
    }
  }

  private void collectTypeVaryables() {
    this.myInnerTypeVaryables = MapSequence.fromMap(new LinkedHashMap<SNode, SNode>(16, (float) 0.75, false));
    Iterable<SNode> typeVariableReferences = ListSequence.fromList(SLinkOperations.getTargets(this.myClassToRefactor, "typeParameter", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.TypeVariableReference");
      }
    });
    for (SNode typeReference : Sequence.fromIterable(typeVariableReferences)) {
      SNode typeDeclaration = SLinkOperations.getTarget(SNodeOperations.cast(typeReference, "jetbrains.mps.baseLanguage.structure.TypeVariableReference"), "typeVariableDeclaration", false);
      if (!(MapSequence.fromMap(this.myInnerTypeVaryables).containsKey(typeDeclaration))) {
        MapSequence.fromMap(this.myInnerTypeVaryables).put(typeDeclaration, SNodeOperations.copyNode(typeDeclaration));
      }
      SNodeOperations.replaceWithAnother(typeReference, new ConvertAnonymousRefactoring.QuotationClass_qy1soj_a0a0c0c0e().createNode(MapSequence.fromMap(this.myInnerTypeVaryables).get(typeDeclaration)));
    }
  }

  private void collectSuperConstructorParameters() {
    this.mySuperConstructorParameters = new ArrayList<SNode>();
    for (SNode param : ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(this.myClassToRefactor, "baseMethodDeclaration", false), "parameter", true))) {
      ListSequence.fromList(this.mySuperConstructorParameters).addElement(SNodeOperations.copyNode(param));
    }
  }

  private SNode makeField(SNode varDeclaration) {
    SNode newField = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.FieldDeclaration", null);
    SLinkOperations.setTarget(newField, "type", SNodeOperations.copyNode(SLinkOperations.getTarget(varDeclaration, "type", true)), true);
    SPropertyOperations.set(newField, "name", "my" + NameUtil.capitalize(SPropertyOperations.getString(varDeclaration, "name")));
    SPropertyOperations.set(newField, "isFinal", "" + true);
    return newField;
  }

  private SNode makeInnerClass() {
    SNode innerClass = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassConcept", null);
    SPropertyOperations.set(innerClass, "name", this.myNameForInnerClass);
    SLinkOperations.setTarget(innerClass, "visibility", SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.PrivateVisibility", null), true);
    this.chooseNonStaticForInnerClass(innerClass);
    this.copyChildren(this.myClassToRefactor, innerClass);
    this.addSuperToInnerClass(innerClass);
    this.makeInnerConstructor(innerClass);
    this.addTypeVaryablesToInnerClass(innerClass);
    this.addFieldsToInnerClass(innerClass);
    return innerClass;
  }

  private void makeInnerConstructor(SNode innerClass) {
    SNode innerConstructor = ListSequence.fromList(SLinkOperations.getTargets(innerClass, "constructor", true)).getElement(0);
    this.addParametersToConstructor(innerConstructor);
    this.makeConstructorBody(innerConstructor);
  }

  private void makeConstructorBody(SNode constructorDeclaration) {
    if (ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(this.myClassToRefactor, "baseMethodDeclaration", false), "parameter", true)).isNotEmpty()) {
      List<SNode> parameterReferences = ListSequence.fromList(this.mySuperConstructorParameters).select(new ISelector<SNode, SNode>() {
        public SNode select(SNode it) {
          return new ConvertAnonymousRefactoring.QuotationClass_qy1soj_a0a0a0a0a0a0a9().createNode(it);
        }
      }).toListSequence();
      SNode invocation = new ConvertAnonymousRefactoring.QuotationClass_qy1soj_a0a1a0a9().createNode(parameterReferences);
      SLinkOperations.setTarget(invocation, "baseMethodDeclaration", SLinkOperations.getTarget(this.myClassToRefactor, "baseMethodDeclaration", false), false);
      ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(constructorDeclaration, "body", true), "statement", true)).insertElement(0, invocation);
    }
    for (SNode fieldDeclaration : SetSequence.fromSet(MapSequence.fromMap(this.myInnerConstructorParameters).keySet())) {
      ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(constructorDeclaration, "body", true), "statement", true)).addElement(new ConvertAnonymousRefactoring.QuotationClass_qy1soj_a0a0a0b0j().createNode(MapSequence.fromMap(this.myInnerConstructorParameters).get(fieldDeclaration), fieldDeclaration));
    }
  }

  private void addParametersToConstructor(SNode constructorDeclaration) {
    ListSequence.fromList(SLinkOperations.getTargets(constructorDeclaration, "parameter", true)).addSequence(ListSequence.fromList(this.mySuperConstructorParameters));
    ListSequence.fromList(SLinkOperations.getTargets(constructorDeclaration, "parameter", true)).addSequence(Sequence.fromIterable(MapSequence.fromMap(this.myInnerConstructorParameters).values()));
  }

  private void copyChildren(SNode from, SNode to) {
    Set<String> toConceptRoles = SetSequence.fromSetWithValues(new HashSet(), ListSequence.fromList(AbstractConceptDeclaration_Behavior.call_getLinkDeclarations_1213877394480(SNodeOperations.getConceptDeclaration(to))).select(new ISelector<SNode, String>() {
      public String select(SNode it) {
        return SPropertyOperations.getString(it, "role");
      }
    }));
    for (String role : SetSequence.fromSet(from.getChildRoles())) {
      if (SetSequence.fromSet(toConceptRoles).contains(role) && !(SetSequence.fromSet(ROLES_NOT_TO_COPY).contains(role))) {
        for (SNode child : ListSequence.fromList(from.getChildren(role))) {
          to.addChild(role, SNodeOperations.detachNode(((SNode) child)));
        }
      }
    }
  }

  private void chooseNonStaticForInnerClass(SNode innerClass) {
    if (SNodeOperations.getAncestor(this.myClassToRefactor, "jetbrains.mps.baseLanguage.structure.ClassifierMember", false, false) != null && ClassifierMember_Behavior.call_isStatic_8986964027630462944(SNodeOperations.getAncestor(this.myClassToRefactor, "jetbrains.mps.baseLanguage.structure.ClassifierMember", false, false))) {
      SPropertyOperations.set(innerClass, "nonStatic", "" + false);
    } else {
      SPropertyOperations.set(innerClass, "nonStatic", "" + true);
    }
  }

  private void addFieldsToInnerClass(final SNode innerClass) {
    ListSequence.fromList(SLinkOperations.getTargets(innerClass, "field", true)).addSequence(Sequence.fromIterable(MapSequence.fromMap(this.myInnerFields).values()));
    for (SNode varReference : ListSequence.fromList(SNodeOperations.getDescendants(innerClass, "jetbrains.mps.baseLanguage.structure.LocalVariableReference", false, new String[]{})).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return !(ListSequence.fromList(SNodeOperations.getAncestors(SLinkOperations.getTarget(it, "variableDeclaration", false), null, false)).contains(innerClass));
      }
    })) {
      SNodeOperations.replaceWithAnother(varReference, new ConvertAnonymousRefactoring.QuotationClass_qy1soj_a0a0a0b0n().createNode(MapSequence.fromMap(this.myInnerFields).get(SLinkOperations.getTarget(varReference, "variableDeclaration", false))));
    }
  }

  private void addTypeVaryablesToInnerClass(SNode innerClass) {
    ListSequence.fromList(SLinkOperations.getTargets(innerClass, "typeVariableDeclaration", true)).addSequence(Sequence.fromIterable(MapSequence.fromMap(this.myInnerTypeVaryables).values()));
    for (SNode typeReference : ListSequence.fromList(SNodeOperations.getDescendants(innerClass, "jetbrains.mps.baseLanguage.structure.TypeVariableReference", false, new String[]{}))) {
      if (MapSequence.fromMap(this.myInnerTypeVaryables).containsKey(SLinkOperations.getTarget(typeReference, "typeVariableDeclaration", false))) {
        SNodeOperations.replaceWithAnother(typeReference, new ConvertAnonymousRefactoring.QuotationClass_qy1soj_a0a0a0a0b0o().createNode(MapSequence.fromMap(this.myInnerTypeVaryables).get(SLinkOperations.getTarget(typeReference, "typeVariableDeclaration", false))));
      }
    }
  }

  private void addSuperToInnerClass(SNode innerClass) {
    SNode superInnerClass = new ConvertAnonymousRefactoring.QuotationClass_qy1soj_a0a0a51().createNode(SLinkOperations.getTarget(this.myClassToRefactor, "classifier", false));
    this.addTypeVaryablesToSuperInnerClass(superInnerClass);
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(this.myClassToRefactor, "classifier", false), "jetbrains.mps.baseLanguage.structure.Interface")) {
      ListSequence.fromList(SLinkOperations.getTargets(innerClass, "implementedInterface", true)).addElement(superInnerClass);
    } else {
      SLinkOperations.setTarget(innerClass, "superclass", superInnerClass, true);
    }
  }

  private void addTypeVaryablesToSuperInnerClass(SNode superInnerClass) {
    ListSequence.fromList(SLinkOperations.getTargets(superInnerClass, "parameter", true)).addSequence(ListSequence.fromList(SLinkOperations.getTargets(this.myClassToRefactor, "typeParameter", true)));
  }

  private SNode makeInnerConstructorInvocation(SNode constructor) {
    SNode constructorInvocation = new ConvertAnonymousRefactoring.QuotationClass_qy1soj_a0a0a71().createNode(constructor, SLinkOperations.getTargets(this.myClassToRefactor, "actualArgument", true));
    ListSequence.fromList(SLinkOperations.getTargets(constructorInvocation, "actualArgument", true)).addSequence(SetSequence.fromSet(MapSequence.fromMap(this.myInnerFields).keySet()).select(new ISelector<SNode, SNode>() {
      public SNode select(SNode it) {
        return new ConvertAnonymousRefactoring.QuotationClass_qy1soj_a0a0a0a0a1a71().createNode(it);
      }
    }));
    for (SNode typeVaryable : SetSequence.fromSet(MapSequence.fromMap(this.myInnerTypeVaryables).keySet())) {
      ListSequence.fromList(SLinkOperations.getTargets(constructorInvocation, "typeParameter", true)).addElement(new ConvertAnonymousRefactoring.QuotationClass_qy1soj_a0a0a0c0r().createNode(typeVaryable));
    }
    return constructorInvocation;
  }

  public static class QuotationClass_qy1soj_a1a0a0b0c {
    public QuotationClass_qy1soj_a1a0a0b0c() {
    }

    public SNode createNode(Object parameter_5, Object parameter_6) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterDeclaration", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        quotedNode1_3.setProperty("name", (String) parameter_6);
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
            quotedNode_1.addChild("type", HUtil.copyIfNecessary(quotedNode1_4));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }

  public static class QuotationClass_qy1soj_a0a0c0c0e {
    public QuotationClass_qy1soj_a0a0c0c0e() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.TypeVariableReference", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("typeVariableDeclaration", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_qy1soj_a0a0a0a0a0a0a9 {
    public QuotationClass_qy1soj_a0a0a0a0a0a0a9() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterReference", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("variableDeclaration", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_qy1soj_a0a1a0a9 {
    public QuotationClass_qy1soj_a0a1a0a9() {
    }

    public SNode createNode(Object parameter_4) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        {
          List<SNode> nodes = (List<SNode>) parameter_4;
          for (SNode child : nodes) {
            quotedNode_1.addChild("actualArgument", HUtil.copyIfNecessary(child));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }

  public static class QuotationClass_qy1soj_a0a0a0b0j {
    public QuotationClass_qy1soj_a0a0a0b0j() {
    }

    public SNode createNode(Object parameter_13, Object parameter_14) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      SNode quotedNode_5 = null;
      SNode quotedNode_6 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_7 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AssignmentExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_8 = quotedNode_2;
          {
            quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterReference", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
            SNode quotedNode1_9 = quotedNode_3;
            quotedNode1_9.setReferent("variableDeclaration", (SNode) parameter_13);
            quotedNode_2.addChild("rValue", quotedNode1_9);
          }
          {
            quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
            SNode quotedNode1_10 = quotedNode_4;
            {
              quotedNode_5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ThisExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
              SNode quotedNode1_11 = quotedNode_5;
              quotedNode_4.addChild("operand", quotedNode1_11);
            }
            {
              quotedNode_6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.FieldReferenceOperation", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
              SNode quotedNode1_12 = quotedNode_6;
              quotedNode1_12.setReferent("fieldDeclaration", (SNode) parameter_14);
              quotedNode_4.addChild("operation", quotedNode1_12);
            }
            quotedNode_2.addChild("lValue", quotedNode1_10);
          }
          quotedNode_1.addChild("expression", quotedNode1_8);
        }
        result = quotedNode1_7;
      }
      return result;
    }
  }

  public static class QuotationClass_qy1soj_a0a0a0b0n {
    public QuotationClass_qy1soj_a0a0a0b0n() {
    }

    public SNode createNode(Object parameter_7) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_4 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ThisExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_5 = quotedNode_2;
          quotedNode_1.addChild("operand", quotedNode1_5);
        }
        {
          quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.FieldReferenceOperation", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_6 = quotedNode_3;
          quotedNode1_6.setReferent("fieldDeclaration", (SNode) parameter_7);
          quotedNode_1.addChild("operation", quotedNode1_6);
        }
        result = quotedNode1_4;
      }
      return result;
    }
  }

  public static class QuotationClass_qy1soj_a0a0a0a0b0o {
    public QuotationClass_qy1soj_a0a0a0a0b0o() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.TypeVariableReference", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("typeVariableDeclaration", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_qy1soj_a0a0a51 {
    public QuotationClass_qy1soj_a0a0a51() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("classifier", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_qy1soj_a0a0a71 {
    public QuotationClass_qy1soj_a0a0a71() {
    }

    public SNode createNode(Object parameter_6, Object parameter_7) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassCreator", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_5 = quotedNode_1;
        quotedNode1_5.setReferent("baseMethodDeclaration", (SNode) parameter_6);
        {
          List<SNode> nodes = (List<SNode>) parameter_7;
          for (SNode child : nodes) {
            quotedNode_1.addChild("actualArgument", HUtil.copyIfNecessary(child));
          }
        }
        result = quotedNode1_5;
      }
      return result;
    }
  }

  public static class QuotationClass_qy1soj_a0a0a0a0a1a71 {
    public QuotationClass_qy1soj_a0a0a0a0a1a71() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.LocalVariableReference", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("variableDeclaration", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_qy1soj_a0a0a0c0r {
    public QuotationClass_qy1soj_a0a0a0c0r() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.TypeVariableReference", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("typeVariableDeclaration", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}

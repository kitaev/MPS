package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.GenerateIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import com.intellij.openapi.project.Project;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.IntentionContext;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class GenerateGettersAndSetters_Intention extends GenerateIntention implements Intention {
  public GenerateGettersAndSetters_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ClassConcept";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return true;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Getters and Setters";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    List<SNode> fields = SLinkOperations.getTargets(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "field", true);
    if (ListSequence.fromList(fields).isEmpty()) {
      return false;
    }
    boolean allGettersImplemented = true;
    Project project = editorContext.getOperationContext().getProject();
    for (SNode fieldDeclaration : fields) {
      boolean hasCurrentFieldGetter = false;
      final String getterName = GenerateGettersAndSettersUtil.getFieldGetterName(fieldDeclaration, project);
      if (ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "method", true)).any(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return getterName.equals(SPropertyOperations.getString(it, "name")) && ListSequence.fromList(SLinkOperations.getTargets(it, "parameter", true)).isEmpty();
        }
      })) {
        hasCurrentFieldGetter = true;
      }
      if (!(hasCurrentFieldGetter)) {
        allGettersImplemented = false;
        break;
      }
    }
    if (!(allGettersImplemented)) {
      return true;
    } else {
      boolean hasAllSetters = true;
      for (SNode field : fields) {
        final String setterName = GenerateGettersAndSettersUtil.getFieldSetterName(field, project);
        boolean hasCurrentFieldSetter = false;
        if (ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "method", true)).any(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return setterName.equals(SPropertyOperations.getString(it, "name")) && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(it, "returnType", true), "jetbrains.mps.baseLanguage.structure.VoidType");
          }
        })) {
          hasCurrentFieldSetter = true;
        }
        if (!(hasCurrentFieldSetter)) {
          hasAllSetters = false;
          break;
        }
      }
      return !(hasAllSetters);
    }
  }

  public void execute(final SNode node, final EditorContext editorContext, IntentionContext intentionContext) {
    SNode classConcept = SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.ClassConcept");
    SNode lastAdded = null;
    Project ideaProject = editorContext.getOperationContext().getProject();
    for (final SNode field : ((List<SNode>) intentionContext.getContextParametersMap().get("selectedFields"))) {
      final String getterName = GenerateGettersAndSettersUtil.getFieldGetterName(field, ideaProject);
      final Wrappers._boolean getterIsAbsent = new Wrappers._boolean(true);
      ListSequence.fromList(SLinkOperations.getTargets(classConcept, "method", true)).visitAll(new IVisitor<SNode>() {
        public void visit(SNode it) {
          if (getterName.equals(SPropertyOperations.getString(it, "name")) && ListSequence.fromList(SLinkOperations.getTargets(it, "parameter", true)).isEmpty()) {
            getterIsAbsent.value = false;
          }
        }
      });
      if (!(getterIsAbsent.value)) {
        continue;
      }
      SNode fieldReference = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference", null);
      SLinkOperations.setTarget(fieldReference, "variableDeclaration", field, false);
      lastAdded = ListSequence.fromList(SLinkOperations.getTargets(classConcept, "method", true)).addElement(new GenerateGettersAndSetters_Intention.QuotationClass_43x4b2_a0a0a6a3a7().createNode(SLinkOperations.getTarget(field, "type", true), fieldReference, getterName));

      final String setterName = GenerateGettersAndSettersUtil.getFieldSetterName(field, ideaProject);
      final Wrappers._boolean setterIsAbsent = new Wrappers._boolean(true);
      ListSequence.fromList(SLinkOperations.getTargets(classConcept, "method", true)).visitAll(new IVisitor<SNode>() {
        public void visit(SNode method) {
          if (setterName.equals(SPropertyOperations.getString(method, "name")) && ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).count() == 1) {
            setterIsAbsent.value = false;
          }
        }
      });
      if (!(setterIsAbsent.value)) {
        continue;
      }
      String parameterName = GenerateGettersAndSettersUtil.getParameterNameForField(field, ideaProject);
      lastAdded = ListSequence.fromList(SLinkOperations.getTargets(classConcept, "method", true)).addElement(new GenerateGettersAndSetters_Intention.QuotationClass_43x4b2_a0a0a31a3a7().createNode(SNodeOperations.copyNode(fieldReference), SLinkOperations.getTarget(field, "type", true), parameterName, setterName));
    }
    if (lastAdded != null) {
      editorContext.select(lastAdded);
    }
  }

  public boolean executeUI(final SNode node, final EditorContext editorContext, IntentionContext intentionContext) {
    SelectFieldsDialog selectFieldsDialog = new SelectFieldsDialog(editorContext, editorContext.getMainFrame(), node);
    selectFieldsDialog.showDialog();
    intentionContext.getContextParametersMap().put("selectedFields", selectFieldsDialog.getSelectedFields());
    return selectFieldsDialog.getAnswer();
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

  public static class QuotationClass_43x4b2_a0a0a6a3a7 {
    public QuotationClass_43x4b2_a0a0a6a3a7() {
    }

    public SNode createNode(Object parameter_13, Object parameter_14, Object parameter_15) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      SNode quotedNode_5 = null;
      SNode quotedNode_6 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_7 = quotedNode_1;
        quotedNode1_7.setProperty("name", (String) parameter_15);
        {
          quotedNode_2 = (SNode) parameter_13;
          SNode quotedNode1_8;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_8 = HUtil.copyIfNecessary(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_8 = quotedNode_2;
          }
          if (quotedNode1_8 != null) {
            quotedNode_1.addChild("returnType", HUtil.copyIfNecessary(quotedNode1_8));
          }
        }
        {
          quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PublicVisibility", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_9 = quotedNode_3;
          quotedNode_1.addChild("visibility", quotedNode1_9);
        }
        {
          quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StatementList", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_10 = quotedNode_4;
          {
            quotedNode_5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_11 = quotedNode_5;
            {
              quotedNode_6 = (SNode) parameter_14;
              SNode quotedNode1_12;
              if (_parameterValues_129834374.contains(quotedNode_6)) {
                quotedNode1_12 = HUtil.copyIfNecessary(quotedNode_6);
              } else {
                _parameterValues_129834374.add(quotedNode_6);
                quotedNode1_12 = quotedNode_6;
              }
              if (quotedNode1_12 != null) {
                quotedNode_5.addChild("expression", HUtil.copyIfNecessary(quotedNode1_12));
              }
            }
            quotedNode_4.addChild("statement", quotedNode1_11);
          }
          quotedNode_1.addChild("body", quotedNode1_10);
        }
        result = quotedNode1_7;
      }
      return result;
    }
  }

  public static class QuotationClass_43x4b2_a0a0a31a3a7 {
    public QuotationClass_43x4b2_a0a0a31a3a7() {
    }

    public SNode createNode(Object parameter_21, Object parameter_22, Object parameter_23, Object parameter_24) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      SNode quotedNode_5 = null;
      SNode quotedNode_6 = null;
      SNode quotedNode_7 = null;
      SNode quotedNode_8 = null;
      SNode quotedNode_9 = null;
      SNode quotedNode_10 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_11 = quotedNode_1;
        quotedNode1_11.setProperty("name", (String) parameter_24);
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VoidType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_12 = quotedNode_2;
          quotedNode_1.addChild("returnType", quotedNode1_12);
        }
        {
          quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PublicVisibility", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_13 = quotedNode_3;
          quotedNode_1.addChild("visibility", quotedNode1_13);
        }
        {
          quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StatementList", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_14 = quotedNode_4;
          {
            quotedNode_6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ExpressionStatement", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_15 = quotedNode_6;
            {
              quotedNode_8 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AssignmentExpression", null, GlobalScope.getInstance(), false);
              SNode quotedNode1_16 = quotedNode_8;
              {
                quotedNode_9 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterReference", null, GlobalScope.getInstance(), false);
                SNode quotedNode1_17 = quotedNode_9;
                quotedNode_8.addChild("rValue", quotedNode1_17);
              }
              {
                quotedNode_10 = (SNode) parameter_21;
                SNode quotedNode1_18;
                if (_parameterValues_129834374.contains(quotedNode_10)) {
                  quotedNode1_18 = HUtil.copyIfNecessary(quotedNode_10);
                } else {
                  _parameterValues_129834374.add(quotedNode_10);
                  quotedNode1_18 = quotedNode_10;
                }
                if (quotedNode1_18 != null) {
                  quotedNode_8.addChild("lValue", HUtil.copyIfNecessary(quotedNode1_18));
                }
              }
              quotedNode_6.addChild("expression", quotedNode1_16);
            }
            quotedNode_4.addChild("statement", quotedNode1_15);
          }
          quotedNode_1.addChild("body", quotedNode1_14);
        }
        {
          quotedNode_5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterDeclaration", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_19 = quotedNode_5;
          quotedNode1_19.setProperty("name", (String) parameter_23);
          {
            quotedNode_7 = (SNode) parameter_22;
            SNode quotedNode1_20;
            if (_parameterValues_129834374.contains(quotedNode_7)) {
              quotedNode1_20 = HUtil.copyIfNecessary(quotedNode_7);
            } else {
              _parameterValues_129834374.add(quotedNode_7);
              quotedNode1_20 = quotedNode_7;
            }
            if (quotedNode1_20 != null) {
              quotedNode_5.addChild("type", HUtil.copyIfNecessary(quotedNode1_20));
            }
          }
          quotedNode_1.addChild("parameter", quotedNode1_19);
        }
        result = quotedNode1_11;
      }
      quotedNode_9.setReferent("variableDeclaration", quotedNode_5);
      return result;
    }
  }
}

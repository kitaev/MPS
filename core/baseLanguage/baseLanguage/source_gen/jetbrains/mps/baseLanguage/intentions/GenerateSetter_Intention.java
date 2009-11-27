package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.GenerateIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import com.intellij.openapi.util.Pair;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;

public class GenerateSetter_Intention extends GenerateIntention {
  public GenerateSetter_Intention() {
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Setters";
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
    boolean allSettersImplemented = true;
    for (SNode fieldDeclaration : fields) {
      final String setterName = "set" + NameUtil.capitalize(SPropertyOperations.getString(fieldDeclaration, "name"));
      boolean fieldHasSetter = false;
      if (ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "method", true)).any(new IWhereFilter<SNode>() {
        public boolean accept(SNode method) {
          return setterName.equals(SPropertyOperations.getString(method, "name"));
        }
      })) {
        fieldHasSetter = true;
      }
      if (!(fieldHasSetter)) {
        allSettersImplemented = false;
      }
    }
    return !(allSettersImplemented);
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode classConcept = SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.ClassConcept");
    List<SNode> fields = SLinkOperations.getTargets(classConcept, "field", true);
    if (ListSequence.fromList(fields).isEmpty()) {
      return;
    }
    for (final SNode field : fields) {
      final String setterName = "set" + NameUtil.capitalize(SPropertyOperations.getString(field, "name"));
      boolean setterIsAbsent = true;
      if (ListSequence.fromList(SLinkOperations.getTargets(classConcept, "method", true)).any(new IWhereFilter<SNode>() {
        public boolean accept(SNode method) {
          return setterName.equals(SPropertyOperations.getString(method, "name")) && ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).count() == 1;
        }
      })) {
        setterIsAbsent = false;
      }
      if (!(setterIsAbsent)) {
        continue;
      }
      Pair<String, String> p;
      final SNode thisExpression = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ThisExpression", null);
      // Method creation begins 
      SLinkOperations.addChild(classConcept, "method", new _Quotations.QuotationClass_20().createNode(thisExpression, field, SLinkOperations.getTarget(field, "type", true), SPropertyOperations.getString(field, "name"), setterName));
    }
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ClassConcept";
  }
}

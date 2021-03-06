package jetbrains.mps.lang.refactoring.plugin;

/*Generated by MPS */

import jetbrains.mps.ide.editorTabs.EditorTabDescriptor;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.plugin.ConceptEditorOpenHelper;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.annotations.Nullable;
import java.util.List;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.smodel.LanguageAspect;
import jetbrains.mps.lang.structure.plugin.ConceptEditorHelper;

public class Refactorings_TabDescriptor extends EditorTabDescriptor {
  private static final Icon ICON = new ImageIcon(Refactorings_TabDescriptor.class.getResource("refactoring.png"));

  public Refactorings_TabDescriptor() {
  }

  public String getTitle() {
    return "Refactorings";
  }

  public Character getShortcutChar() {
    return 'R';
  }

  public int compareTo(EditorTabDescriptor descriptor) {
    return new Refactorings_Order().compare(this, descriptor);
  }

  public void startListening() {
  }

  public SNode getBaseNode(SNode node) {
    return ConceptEditorOpenHelper.getBaseNode(node);
  }

  public boolean isApplicable(SNode node) {
    return SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration");
  }

  @Nullable
  public Icon getIcon() {
    return ICON;
  }

  public List<SNode> getNodes(SNode node) {
    return AbstractConceptDeclaration_Behavior.call_findConceptAspectCollection_1567570417158062208(node, LanguageAspect.REFACTORINGS);
  }

  public boolean isSingle() {
    return false;
  }

  public List<SNode> getConcepts(final SNode node) {
    return ConceptEditorHelper.getAvailableConceptAspects(LanguageAspect.REFACTORINGS, node);
  }

  public SNode createNode(final SNode node, final SNode concept) {
    return ConceptEditorHelper.createNewConceptAspectInstance(LanguageAspect.REFACTORINGS, node, concept);
  }
}

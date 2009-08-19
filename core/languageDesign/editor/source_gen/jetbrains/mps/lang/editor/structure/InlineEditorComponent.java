package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InlineEditorComponent extends BaseEditorComponent {
  public static final String concept = "jetbrains.mps.lang.editor.structure.InlineEditorComponent";

  public InlineEditorComponent(SNode node) {
    super(node);
  }

  public static InlineEditorComponent newInstance(SModel sm, boolean init) {
    return (InlineEditorComponent)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.InlineEditorComponent", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InlineEditorComponent newInstance(SModel sm) {
    return InlineEditorComponent.newInstance(sm, false);
  }
}

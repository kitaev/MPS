package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class EditorComponentDeclaration extends BaseEditorComponent implements INamedConcept {
  public static final String concept = "jetbrains.mps.lang.editor.structure.EditorComponentDeclaration";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";

  public EditorComponentDeclaration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(EditorComponentDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(EditorComponentDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(EditorComponentDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(EditorComponentDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(EditorComponentDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(EditorComponentDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(EditorComponentDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(EditorComponentDeclaration.VIRTUAL_PACKAGE, value);
  }

  public static EditorComponentDeclaration newInstance(SModel sm, boolean init) {
    return (EditorComponentDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.EditorComponentDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static EditorComponentDeclaration newInstance(SModel sm) {
    return EditorComponentDeclaration.newInstance(sm, false);
  }
}

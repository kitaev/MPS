package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellModel_Image extends EditorCellModel {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellModel_Image";
  public static final String IMAGE_FILE = "imageFile";
  public static final String DESCENT = "descent";
  public static final String IMAGE_PATH_PROVIDER = "imagePathProvider";

  public CellModel_Image(SNode node) {
    super(node);
  }

  public String getImageFile() {
    return this.getProperty(CellModel_Image.IMAGE_FILE);
  }

  public void setImageFile(String value) {
    this.setProperty(CellModel_Image.IMAGE_FILE, value);
  }

  public int getDescent() {
    return this.getIntegerProperty(CellModel_Image.DESCENT);
  }

  public void setDescent(int value) {
    this.setIntegerProperty(CellModel_Image.DESCENT, value);
  }

  public QueryFunction_ImagePath getImagePathProvider() {
    return (QueryFunction_ImagePath)this.getChild(QueryFunction_ImagePath.class, CellModel_Image.IMAGE_PATH_PROVIDER);
  }

  public void setImagePathProvider(QueryFunction_ImagePath node) {
    super.setChild(CellModel_Image.IMAGE_PATH_PROVIDER, node);
  }

  public static CellModel_Image newInstance(SModel sm, boolean init) {
    return (CellModel_Image)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellModel_Image", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellModel_Image newInstance(SModel sm) {
    return CellModel_Image.newInstance(sm, false);
  }
}

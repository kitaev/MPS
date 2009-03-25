package jetbrains.mps.lang.textGen.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConstantStringAppendPart extends jetbrains.mps.lang.textGen.structure.AbstractAppendPart {
  public static final String concept = "jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart";
  public static final String VALUE = "value";
  public static final String WITH_INDENT = "withIndent";

  public ConstantStringAppendPart(SNode node) {
    super(node);
  }

  public String getValue() {
    return this.getProperty(ConstantStringAppendPart.VALUE);
  }

  public void setValue(String value) {
    this.setProperty(ConstantStringAppendPart.VALUE, value);
  }

  public boolean getWithIndent() {
    return this.getBooleanProperty(ConstantStringAppendPart.WITH_INDENT);
  }

  public void setWithIndent(boolean value) {
    this.setBooleanProperty(ConstantStringAppendPart.WITH_INDENT, value);
  }


  public static ConstantStringAppendPart newInstance(SModel sm, boolean init) {
    return (ConstantStringAppendPart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConstantStringAppendPart newInstance(SModel sm) {
    return ConstantStringAppendPart.newInstance(sm, false);
  }

}

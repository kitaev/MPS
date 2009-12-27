package jetbrains.mps.stubs.javastub.asm;

/*Generated by MPS */


public class ASMEnumValue {
  private ASMType myType;
  private String myConstant;

  /*package*/ ASMEnumValue(String type, String name) {
    this.myType = TypeUtil.fromDescriptor(type);
    this.myConstant = name;
  }

  public ASMType getType() {
    return this.myType;
  }

  public String getConstant() {
    return this.myConstant;
  }
}

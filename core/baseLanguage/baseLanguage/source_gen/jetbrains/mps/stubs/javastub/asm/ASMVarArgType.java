package jetbrains.mps.stubs.javastub.asm;

/*Generated by MPS */


public class ASMVarArgType extends ASMType {
  private ASMType myElementType;

  /*package*/ ASMVarArgType(ASMType elementType) {
    this.myElementType = elementType;
  }

  public ASMType getElementType() {
    return this.myElementType;
  }
}

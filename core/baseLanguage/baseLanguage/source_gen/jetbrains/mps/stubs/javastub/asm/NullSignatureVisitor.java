package jetbrains.mps.stubs.javastub.asm;

/*Generated by MPS */

import org.objectweb.asm.signature.SignatureVisitor;

/*package*/ class NullSignatureVisitor implements SignatureVisitor {
  public static final SignatureVisitor INSTANCE = new NullSignatureVisitor();

  private NullSignatureVisitor() {
  }

  public void visitFormalTypeParameter(String name) {
  }

  public SignatureVisitor visitClassBound() {
    return this;
  }

  public SignatureVisitor visitInterfaceBound() {
    return this;
  }

  public SignatureVisitor visitSuperclass() {
    return this;
  }

  public SignatureVisitor visitInterface() {
    return this;
  }

  public SignatureVisitor visitParameterType() {
    return this;
  }

  public SignatureVisitor visitReturnType() {
    return this;
  }

  public SignatureVisitor visitExceptionType() {
    return this;
  }

  public void visitBaseType(char descriptor) {
  }

  public void visitTypeVariable(String name) {
  }

  public SignatureVisitor visitArrayType() {
    return this;
  }

  public void visitClassType(String name) {
  }

  public void visitInnerClassType(String name) {
  }

  public void visitTypeArgument() {
  }

  public SignatureVisitor visitTypeArgument(char wildcard) {
    return this;
  }

  public void visitEnd() {
  }
}

package jetbrains.mps.stubs.javastub;

/*Generated by MPS */

import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.stubs.javastub.asm.ASMClass;
import jetbrains.mps.stubs.javastub.asm.ASMField;
import jetbrains.mps.stubs.javastub.asm.ASMMethod;
import jetbrains.mps.stubs.javastub.asm.ASMType;
import jetbrains.mps.stubs.javastub.asm.ASMParameterizedType;
import jetbrains.mps.stubs.javastub.asm.ASMClassType;
import jetbrains.mps.stubs.javastub.asm.ASMArrayType;
import jetbrains.mps.stubs.javastub.asm.ASMVarArgType;
import jetbrains.mps.stubs.javastub.asm.ASMPrimitiveType;
import jetbrains.mps.stubs.javastub.asm.ASMTypeVariable;
import jetbrains.mps.stubs.javastub.asm.ASMExtendsType;
import jetbrains.mps.stubs.javastub.asm.ASMSuperType;
import jetbrains.mps.stubs.javastub.asm.ASMUnboundedType;
import java.util.List;
import java.util.Iterator;

public class ASMNodeId {
  public ASMNodeId() {
  }

  public static SNodeId createId(String fqClassName) {
    return new SNodeId.Foreign(SNodeId.Foreign.ID_PREFIX + NameUtil.shortNameFromLongName(fqClassName));
  }

  public static SNodeId createId(ASMClass cls, ASMField field) {
    return new SNodeId.Foreign(SNodeId.Foreign.ID_PREFIX + ASMNodeId.shortNameFromSlashedLongName(cls.getName()) + "." + field.getName());
  }

  public static SNodeId createFieldId(String fqClassName, String fieldName) {
    return new SNodeId.Foreign(SNodeId.Foreign.ID_PREFIX + NameUtil.shortNameFromLongName(fqClassName) + "." + fieldName);
  }

  public static SNodeId createId(ASMClass cls, ASMMethod method) {
    StringBuilder sb = new StringBuilder();
    sb.append(ASMNodeId.shortNameFromSlashedLongName(cls.getName()));
    sb.append('.');
    if (method.isConstructor()) {
      sb.append("<init>");
    } else {
      sb.append(method.getName());
    }
    sb.append('(');
    ASMNodeId.appendList(sb, method.getParameterTypes());
    sb.append(')');
    if (!(method.isConstructor())) {
      sb.append(':');
      sb.append(ASMNodeId.asString(method.getReturnType()));
    }
    return new SNodeId.Foreign(SNodeId.Foreign.ID_PREFIX + sb.toString());
  }

  public static SNodeId createAnnotationMethodId(String fqClassName, String methodName) {
    StringBuilder sb = new StringBuilder();
    sb.append(NameUtil.shortNameFromLongName(fqClassName));
    sb.append('.');
    sb.append(methodName);
    sb.append("()");
    return new SNodeId.Foreign(SNodeId.Foreign.ID_PREFIX + sb.toString());
  }

  private static String shortNameFromSlashedLongName(String slashedLongName) {
    int offset = slashedLongName.lastIndexOf('/');
    if (offset < 0) {
      return slashedLongName;
    }
    return slashedLongName.substring(offset + 1);
  }

  private static String asString(ASMType type) {
    if (type instanceof ASMParameterizedType) {
      StringBuilder sb = new StringBuilder();
      sb.append(ASMNodeId.asString(((ASMParameterizedType) type).getRawType()));
      sb.append('<');
      ASMNodeId.appendList(sb, ((ASMParameterizedType) type).getActualTypeArguments());
      sb.append('>');
      return sb.toString();
    }
    if (type instanceof ASMClassType) {
      return ((ASMClassType) type).getName();
    }
    if (type instanceof ASMArrayType) {
      return ASMNodeId.asString(((ASMArrayType) type).getElementType()) + "[]";
    }
    if (type instanceof ASMVarArgType) {
      return ASMNodeId.asString(((ASMVarArgType) type).getElementType()) + "...";
    }
    if (type instanceof ASMPrimitiveType) {
      return ((ASMPrimitiveType) type).getName();
    }
    if (type instanceof ASMTypeVariable) {
      return ((ASMTypeVariable) type).getName();
    }
    if (type instanceof ASMExtendsType) {
      return "? extends " + ASMNodeId.asString(((ASMExtendsType) type).getBase());
    }
    if (type instanceof ASMSuperType) {
      return "? super " + ASMNodeId.asString(((ASMSuperType) type).getBase());
    }
    if (type instanceof ASMUnboundedType) {
      return "?";
    }
    throw new RuntimeException("unexpected type: " + type);
  }

  private static void appendList(StringBuilder sb, List<ASMType> types) {
    Iterator<ASMType> iterator = types.iterator();
    while (iterator.hasNext()) {
      sb.append(ASMNodeId.asString(iterator.next()));
      if (iterator.hasNext()) {
        sb.append(',');
      }
    }
  }
}

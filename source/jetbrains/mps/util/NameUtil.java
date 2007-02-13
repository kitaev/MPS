package jetbrains.mps.util;

import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.SNode;


/**
 * User: Dmitriev.
 * Date: Dec 27, 2003
 */
public class NameUtil {
  public static String capitalize(String s) {
    if (s.length() == 0) {
      return s;
    }
    return "" + Character.toUpperCase(s.charAt(0)) + s.substring(1);
  }

  public static String decapitalize(String s) {
    if (s == null) {
      return s;
    }
    if (s.length() == 0) {
      return s;
    }
    return "" + Character.toLowerCase(s.charAt(0)) + s.substring(1);
  }

  public static String pluralize(String singular) {
    if (singular.endsWith("y")) {
      return singular.substring(0, singular.length() - 1) + "ies";
    }

    if (singular.endsWith("s") || singular.endsWith("x")) {
      return singular + "es";
    }

    return singular + "s";
  }

  /**
   * "aaaBBB" -> "AAA_BBB"
   */
  public static String toConstantName(String s) {
    if (s == null) {
      return s;
    }
    if (s.length() == 0) {
      return s;
    }
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (Character.isUpperCase(c) && i > 0) {
        sb.append('_');
      }
      sb.append(Character.toUpperCase(c));
    }
    return sb.toString();
  }

  public static String shortNameFromLongName(String fqName) {
    if (fqName == null) {
      return fqName;
    }
    int offset = fqName.lastIndexOf('.');
    if (offset < 0) {
      return fqName;
    }
    return fqName.substring(offset + 1);
  }

  public static String namespaceFromLongName(String fqName) {
    if (fqName == null) {
      return fqName;
    }
    int offset = fqName.lastIndexOf('.');
    if (offset < 0) {
      return "";
    }
    return fqName.substring(0, offset);
  }

  public static String conceptFqName(ConceptDeclaration cd) {
    return namespaceFromConcept(cd) + "." + cd.getName();
  }

  public static String namespaceFromConcept(ConceptDeclaration concept) {
    return namespaceFromConceptFQName(nodeFQName(concept));
  }

  public static String namespaceFromConceptFQName(String fqName) {
    if (fqName == null) {
      return fqName;
    }
    int offset = fqName.lastIndexOf('.');
    if (offset < 0) {
      return "";
    }
    String namespace = fqName.substring(0, offset);
    int i = namespace.lastIndexOf(".structure");
    if (i >= 0 && namespace.endsWith(".structure")) {
      namespace = namespace.substring(0, i);
    }
    return namespace;
  }

  public static String longNameFromNamespaceAndShortName(String namespace, String name) {
    if (namespace == null || namespace.length() == 0) {
      return name;
    }
    return namespace + '.' + name;
  }

  public static String nodeFQName(SNode node) {
    if (node == null) {
      return "null";
    }
    String name = node.getName();
    return node.getModel().getLongName() + "." + name;
  }

  public static String nodeFQName(BaseAdapter node) {
    return nodeFQName(BaseAdapter.fromAdapter(node));
  }


  public static String nodeConceptName(SNode node) {
    Class cls = node.getClass();
    return NameUtil.shortNameFromLongName(cls.getName());
  }

  public static String nodeConceptFQName(SNode node) {
    return node.getConceptFqName();
  }

  public static String conceptFQNameByClass(Class<? extends SNode> cls) {
    String className = cls.getName();
    return conceptFQNameByClassName(className);
  }

  public static String conceptFQNameByClassName(String className) {
    String conceptName = NameUtil.shortNameFromLongName(className);
    String languageNamespace = NameUtil.namespaceFromLongName(className);
    return languageNamespace + ".structure." + conceptName;
  }

  public static String nodeLanguageNamespace(SNode node) {
    String className = node.getClass().getName();
    return NameUtil.namespaceFromLongName(className);
  }

  public static String convertToMetaString(String s) {
    if (s == null) return null;
    return s.replace("\\", "\\\\").replace("\"", "\\\"");
  }

  public static String toValidIdentifier(String s) {
    if (s.matches("[a-zA-Z[_]][a-zA-Z0-9[_]]*")) return s;
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (i == 0 && Character.isDigit(c)) {
        sb.append('_');
      }
      if (c == '_' || Character.isLetterOrDigit(c)) {
        sb.append(c);
      } else {
        sb.append('_');
      }
    }
    return sb.toString();
  }
}

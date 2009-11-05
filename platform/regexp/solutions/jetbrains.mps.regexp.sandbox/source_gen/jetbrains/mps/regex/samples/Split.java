package jetbrains.mps.regex.samples;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.regexp.runtime.RegexpOperations;

/*package*/ class Split {
  /*package*/ void splitTest() {
    String s = "ab23cd23ef";
    for (String st : RegexpOperations.split(s, _PrecompiledPatterns.REGEXP8)) {
      System.out.println("s = " + st);
    }
  }

  /*package*/ void abc(String s) {
    for (String st : RegexpOperations.split(s, _PrecompiledPatterns.REGEXP11)) {
      System.out.println("s = " + st);
    }
  }
}

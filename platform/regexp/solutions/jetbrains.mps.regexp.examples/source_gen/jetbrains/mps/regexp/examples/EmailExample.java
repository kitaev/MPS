package jetbrains.mps.regexp.examples;

/*Generated by MPS */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/* package */class EmailExample {

  public static void main(String emailToAnalyse) {
    {
      Pattern _pattern_0 = _PrecompiledPatterns.REGEXP;
      Matcher _matcher_0 = _pattern_0.matcher(emailToAnalyse);
      if (_matcher_0.matches()) {
        System.out.println("User name = " + _matcher_0.group(1));
        System.out.println("Domain = " + _matcher_0.group(2));
      }
    }
  }

}

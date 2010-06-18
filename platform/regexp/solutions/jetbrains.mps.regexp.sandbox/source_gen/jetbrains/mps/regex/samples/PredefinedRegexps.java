package jetbrains.mps.regex.samples;

/*Generated by MPS */

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import jetbrains.mps.baseLanguage.regexp.runtime.RegexpOperations;

/*package*/ class PredefinedRegexps {
  private static Pattern REGEXP_90k4hu_a0a0b0a = Pattern.compile("(?:(\\w+)@(\\w+))", 0);
  private static Pattern REGEXP_90k4hu_b0a1a1 = Pattern.compile("(?:(\\w+)@(\\w+))", 0);

  /*package*/ void matchWithPredefined() {
    String s;
    {
      Pattern _pattern_0 = REGEXP_90k4hu_a0a0b0a;
      Matcher _matcher_0 = _pattern_0.matcher(s);
      if (_matcher_0.matches()) {
        System.out.println("user = " + _matcher_0.group(1));
        System.out.println("domain = " + _matcher_0.group(2));
      }
    }
  }

  /*package*/ void replaceWithPredefined() {
    String s;
    s = RegexpOperations.replace(s, REGEXP_90k4hu_b0a1a1, new _Replacer_a0a0b0b_0(PredefinedRegexps.this, null));
  }
}

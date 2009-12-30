package jetbrains.mps.baseLanguage.resolve.test;

/*Generated by MPS */

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Arrays;
import java.util.Comparator;

public class ExtractSample {
  private static Pattern PATTERN4379_0 = Pattern.compile("\\w+");
  private static Pattern PATTERN4379_1 = Pattern.compile("\\w+");

  public ExtractSample() {
  }

  public static int fromA() {
    int i = fromA4379_0(90);
    return i;
  }

  public static void usePattern() {
    Matcher m = PATTERN4379_0.matcher("   aaaa ");
    while (m.find()) {
    }
  }

  public static void usePattern2() {
    Matcher m = PATTERN4379_1.matcher("   aaaa ");
    while ((m.find())) {
    }
  }

  public static void extrClass() {
    int[] i = new int[]{1,7,4,8};
    Arrays.sort(i, new ExtractSample.MyComparator4379_0(1, 'c'));
  }

  public static int fromA4379_0(int i) {
    return 1 * 2 * 3 * 4 * 5 * 6 * i;
  }

  public static class QQQQ {
    public QQQQ() {
    }
  }

  public static class MyComparator4379_0 implements Comparator {
    public MyComparator4379_0(int i, char c) {
    }

    public int compare(Object p0, Object p1) {
      int i0 = (int) p0;
      int i1 = (int) p1;
      if (i0 < i1) {
        return 1;
      }
      if (i0 > i1) {
        return -1;
      }
      return 0;
    }
  }
}

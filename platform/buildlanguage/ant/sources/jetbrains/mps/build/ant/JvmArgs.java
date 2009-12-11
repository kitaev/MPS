package jetbrains.mps.build.ant;

import org.apache.tools.ant.types.DataType;

import java.util.*;

public class JvmArgs extends DataType {
  private final Set<String> myArgs = new HashSet<String>();
  private final List<String> myDefaultArgs = Arrays.asList("-Xss1024k", "-Xmx512m", "-XX:MaxPermSize=92m", "-XX:+HeapDumpOnOutOfMemoryError");
  private final List<String> myDefaultArgsPatterns = Arrays.asList("Xss", "Xmx", "MaxPermSize=", "HeapDumpOnOutOfMemoryError");


  public void addConfiguredArg(Arg arg) {
    myArgs.add(arg.getValue());
  }

  public void addConfiguredJvmArgs(JvmArgs jvmargs){
    myArgs.addAll(jvmargs.getArgs());
  }

  public List<String> getArgs() {
    return getMergedArgs();
  }

  private List<String> getMergedArgs() {
    if (isReference()) {
      return ((JvmArgs) getCheckedRef()).getMergedArgs();
    }

    List<String> args = new ArrayList<String>(myDefaultArgs);
    args.add("-client");
    for (String arg : myArgs) {
      for (int i = 0; i < myDefaultArgs.size(); i++) {
        if (arg.contains(myDefaultArgsPatterns.get(i))) {
          args.remove(myDefaultArgs.get(i));
          break;
        }
      }
      if (!arg.equals("-server")) { // we always use client
        args.add(arg);
      }
    }
    return args;
  }

}

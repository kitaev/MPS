package sandboxModel;

/*Generated by MPS */

import jetbrains.mps.samples.lambdaCalculus.runtime.Function;
import java.util.List;
import java.util.ArrayList;

public class sim {
  public sim() {
  }

  public static void main(String[] args) {
    System.out.println((eval()));
  }

  public static Object eval() {
    return (Integer) let_2167053794906818091(new sim.Function_2167053794906818092());
  }

  public static Object let_2167053794906818091(Function sq) {
    return ((Integer) ((Function) sq.copy()).apply((Integer) ((Function) sq.copy()).apply(2)));
  }

  public static class Function_2167053794906818092 extends Function {
    private List myOuterVars = new ArrayList();

    public Function_2167053794906818092() {
    }

    public Function_2167053794906818092(List outerVars) {
      this.myOuterVars.addAll(outerVars);
    }

    public Object eval() {
      int i = 0;
      int j = 0;
      Integer x = (Integer) this.myArgs.get(i++);
      return x * x;
    }

    public int getParamsCount() {
      return 1;
    }

    public Function copy() {
      return new sim.Function_2167053794906818092(this.myOuterVars);
    }
  }
}

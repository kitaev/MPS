package jetbrains.mps.make.generator;

/*Generated by MPS */

import jetbrains.mps.make.facet.IFacet;
import java.util.List;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.make.script.IJob;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.make.script.IJobMonitor;
import jetbrains.mps.make.script.IParametersPool;
import jetbrains.mps.make.script.IConfig;
import jetbrains.mps.internal.collections.runtime.Sequence;

public class Maker__Facet implements IFacet {
  private List<ITarget> targets = ListSequence.fromList(new ArrayList<ITarget>());
  private IFacet.Name name = new IFacet.Name("Maker_");

  public Maker__Facet() {
    ListSequence.fromList(targets).addElement(new Maker__Facet.Target_izvplp_a());
  }

  public Iterable<ITarget> targets() {
    return targets;
  }

  public Iterable<IFacet.Name> optional() {
    return null;
  }

  public Iterable<IFacet.Name> required() {
    return null;
  }

  public Iterable<IFacet.Name> extended() {
    return null;
  }

  public IFacet.Name getName() {
    return this.name;
  }

  public static class Target_izvplp_a implements ITarget {
    private static Class<? extends IResource>[] EXPECTED_INPUT = (Class<? extends IResource>[]) new Class[]{};
    private static Class<? extends IResource>[] EXPECTED_OUTPUT = (Class<? extends IResource>[]) new Class[]{};

    private ITarget.Name name = new ITarget.Name("Make");

    public Target_izvplp_a() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IParametersPool pool) {
          Iterable<IResource> _output_izvplp_a0a = null;
          switch (0) {
            case 0:
            default:
              return new IResult.SUCCESS(_output_izvplp_a0a);
          }
        }
      };
    }

    public IConfig createConfig() {
      return null;
    }

    public Iterable<ITarget.Name> notAfter() {
      return null;
    }

    public Iterable<ITarget.Name> after() {
      return null;
    }

    public Iterable<ITarget.Name> notBefore() {
      return null;
    }

    public Iterable<ITarget.Name> before() {
      return null;
    }

    public ITarget.Name getName() {
      return name;
    }

    public boolean requiresInput() {
      return false;
    }

    public boolean producesOutput() {
      return false;
    }

    public Iterable<Class<? extends IResource>> expectedInput() {
      return Sequence.fromArray(EXPECTED_INPUT);
    }

    public Iterable<Class<? extends IResource>> expectedOutput() {
      return null;
    }

    public <T> T createParameters(Class<T> cls) {
      return null;
    }

    public <T> T createParameters(Class<T> cls, T copyFrom) {
      T t = createParameters(cls);
      return t;
    }
  }
}

package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.make.facet.IFacet;
import java.util.List;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.smodel.resources.ITResource;
import jetbrains.mps.make.script.IJob;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.make.script.IJobMonitor;
import jetbrains.mps.make.script.IParametersPool;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.resources.TResource;
import jetbrains.mps.ide.ThreadUtils;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.reloading.ClassLoaderManager;
import com.intellij.openapi.progress.EmptyProgressIndicator;
import jetbrains.mps.make.script.IConfig;

public class ReloadClasses_Facet implements IFacet {
  private List<ITarget> targets = ListSequence.fromList(new ArrayList<ITarget>());
  private IFacet.Name name = new IFacet.Name("jetbrains.mps.baseLanguage.ReloadClasses");

  public ReloadClasses_Facet() {
    ListSequence.fromList(targets).addElement(new ReloadClasses_Facet.Target_reloadClasses());
  }

  public Iterable<ITarget> targets() {
    return targets;
  }

  public Iterable<IFacet.Name> optional() {
    return null;
  }

  public Iterable<IFacet.Name> required() {
    return Sequence.fromArray(new IFacet.Name[]{new IFacet.Name("jetbrains.mps.baseLanguage.JavaCompile"), new IFacet.Name("jetbrains.mps.lang.core.Make")});
  }

  public Iterable<IFacet.Name> extended() {
    return null;
  }

  public IFacet.Name getName() {
    return this.name;
  }

  public static class Target_reloadClasses implements ITarget {
    private static Class<? extends IResource>[] EXPECTED_INPUT = (Class<? extends IResource>[]) new Class[]{ITResource.class};
    private static Class<? extends IResource>[] EXPECTED_OUTPUT = (Class<? extends IResource>[]) new Class[]{};

    private ITarget.Name name = new ITarget.Name("reloadClasses");

    public Target_reloadClasses() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IParametersPool pool) {
          Iterable<IResource> _output_i849au_a0a = null;
          switch (0) {
            case 0:
              boolean nonEmptyCompilation = pool.parameters(new ITarget.Name("compile"), JavaCompile_Facet.Target_compile.Parameters.class).compiledAnything() != null && pool.parameters(new ITarget.Name("compile"), JavaCompile_Facet.Target_compile.Parameters.class).compiledAnything();

              if (nonEmptyCompilation && Sequence.fromIterable(input).any(new IWhereFilter<IResource>() {
                public boolean accept(IResource in) {
                  return ((TResource) in).module().reloadClassesAfterGeneration();
                }
              })) {
                monitor.currentProgress().beginWork("Reloading classes", 1, monitor.currentProgress().workLeft());
                ThreadUtils.runInUIThreadAndWait(new Runnable() {
                  public void run() {
                    ModelAccess.instance().requireWrite(new Runnable() {
                      public void run() {
                        ClassLoaderManager.getInstance().reloadAll(new EmptyProgressIndicator());
                      }
                    });
                  }
                });
                monitor.currentProgress().advanceWork("Reloading classes", 1);
                monitor.currentProgress().finishWork("Reloading classes");
              }
              _output_i849au_a0a = Sequence.fromIterable(_output_i849au_a0a).concat(Sequence.fromIterable(input));
            default:
              return new IResult.SUCCESS(_output_i849au_a0a);
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
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("compile"), new ITarget.Name("auxCompile")});
    }

    public Iterable<ITarget.Name> notBefore() {
      return null;
    }

    public Iterable<ITarget.Name> before() {
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("make")});
    }

    public ITarget.Name getName() {
      return name;
    }

    public boolean requiresInput() {
      return true;
    }

    public boolean producesOutput() {
      return true;
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

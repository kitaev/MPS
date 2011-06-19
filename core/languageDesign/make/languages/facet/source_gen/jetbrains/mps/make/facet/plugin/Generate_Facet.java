package jetbrains.mps.make.facet.plugin;

/*Generated by MPS */

import jetbrains.mps.make.facet.IFacet;
import java.util.List;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.make.script.IJob;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.make.script.IJobMonitor;
import jetbrains.mps.make.script.IParametersPool;
import jetbrains.mps.make.script.IFeedback;
import jetbrains.mps.make.script.IConfig;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import com.intellij.openapi.project.Project;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import com.intellij.openapi.project.DumbService;
import jetbrains.mps.ide.generator.GenerationSettings;
import jetbrains.mps.generator.GenerationOptions;
import jetbrains.mps.ide.generator.GeneratorCacheComponent;
import jetbrains.mps.generator.IGenerationTracer;
import jetbrains.mps.generator.NullGenerationTracer;
import jetbrains.mps.make.script.IConfigMonitor;
import jetbrains.mps.smodel.resources.IMResource;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.smodel.resources.MResource;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.DefaultSModelDescriptor;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.generator.GeneratorManager;
import java.util.Map;
import jetbrains.mps.project.IModule;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.internal.collections.runtime.ISequenceClosure;
import jetbrains.mps.generator.generationTypes.IGenerationHandler;
import jetbrains.mps.smodel.resources.GResource;
import jetbrains.mps.messages.IMessageHandler;
import jetbrains.mps.messages.IMessage;
import jetbrains.mps.internal.collections.runtime.ILeftCombinator;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.smodel.resources.DResource;
import jetbrains.mps.make.delta.IDelta;
import jetbrains.mps.make.delta.IInternalDelta;
import jetbrains.mps.generator.TransientModelsComponent;

public class Generate_Facet implements IFacet {
  private List<ITarget> targets = ListSequence.fromList(new ArrayList<ITarget>());
  private IFacet.Name name = new IFacet.Name("jetbrains.mps.make.facet.Generate");

  public Generate_Facet() {
    ListSequence.fromList(targets).addElement(new Generate_Facet.Target_fi61u2_a());
    ListSequence.fromList(targets).addElement(new Generate_Facet.Target_fi61u2_b());
    ListSequence.fromList(targets).addElement(new Generate_Facet.Target_fi61u2_c());
    ListSequence.fromList(targets).addElement(new Generate_Facet.Target_fi61u2_d());
    ListSequence.fromList(targets).addElement(new Generate_Facet.Target_fi61u2_e());
  }

  public Iterable<ITarget> targets() {
    return targets;
  }

  public Iterable<IFacet.Name> optional() {
    return null;
  }

  public Iterable<IFacet.Name> required() {
    return Sequence.fromArray(new IFacet.Name[]{new IFacet.Name("Make")});
  }

  public Iterable<IFacet.Name> extended() {
    return null;
  }

  public IFacet.Name getName() {
    return this.name;
  }

  public static class Target_fi61u2_a implements ITarget {
    private static Class<? extends IResource>[] EXPECTED_INPUT = (Class<? extends IResource>[]) new Class[]{};
    private static Class<? extends IResource>[] EXPECTED_OUTPUT = (Class<? extends IResource>[]) new Class[]{};

    private ITarget.Name name = new ITarget.Name("checkParameters");

    public Target_fi61u2_a() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IParametersPool pool) {
          Iterable<IResource> _output_fi61u2_a0a = null;
          switch (0) {
            case 0:
              if (pool.parameters(Target_fi61u2_a.this.getName(), Generate_Facet.Target_fi61u2_a.Variables.class).project() == null) {
                monitor.reportFeedback(new IFeedback.ERROR(String.valueOf("project is null")));
                return new IResult.FAILURE(_output_fi61u2_a0a);
              }
              if (pool.parameters(Target_fi61u2_a.this.getName(), Generate_Facet.Target_fi61u2_a.Variables.class).operationContext() == null) {
                monitor.reportFeedback(new IFeedback.ERROR(String.valueOf("operationContext is null")));
                return new IResult.FAILURE(_output_fi61u2_a0a);
              }
              if (pool.parameters(Target_fi61u2_a.this.getName(), Generate_Facet.Target_fi61u2_a.Variables.class).cleanMake() == null) {
                monitor.reportFeedback(new IFeedback.ERROR(String.valueOf("no cleanMake")));
                return new IResult.FAILURE(_output_fi61u2_a0a);
              }
            default:
              return new IResult.SUCCESS(_output_fi61u2_a0a);
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
      return cls.cast(new Variables());
    }

    public <T> T createParameters(Class<T> cls, T copyFrom) {
      T t = createParameters(cls);
      if (t != null) {
        ((Generate_Facet.Target_fi61u2_a.Variables) t).project(((Generate_Facet.Target_fi61u2_a.Variables) copyFrom).project());
        ((Generate_Facet.Target_fi61u2_a.Variables) t).operationContext(((Generate_Facet.Target_fi61u2_a.Variables) copyFrom).operationContext());
        ((Generate_Facet.Target_fi61u2_a.Variables) t).cleanMake(((Generate_Facet.Target_fi61u2_a.Variables) copyFrom).cleanMake());
        ((Generate_Facet.Target_fi61u2_a.Variables) t).pindGet(((Generate_Facet.Target_fi61u2_a.Variables) copyFrom).pindGet());
      }
      return t;
    }

    public static class Variables extends MultiTuple._4<Project, IOperationContext, Boolean, _FunctionTypes._return_P0_E0<? extends ProgressIndicator>> {
      public Variables() {
        super();
      }

      public Variables(Project project, IOperationContext operationContext, Boolean cleanMake, _FunctionTypes._return_P0_E0<? extends ProgressIndicator> pindGet) {
        super(project, operationContext, cleanMake, pindGet);
      }

      public Project project(Project value) {
        return super._0(value);
      }

      public IOperationContext operationContext(IOperationContext value) {
        return super._1(value);
      }

      public Boolean cleanMake(Boolean value) {
        return super._2(value);
      }

      public _FunctionTypes._return_P0_E0<? extends ProgressIndicator> pindGet(_FunctionTypes._return_P0_E0<? extends ProgressIndicator> value) {
        return super._3(value);
      }

      public Project project() {
        return super._0();
      }

      public IOperationContext operationContext() {
        return super._1();
      }

      public Boolean cleanMake() {
        return super._2();
      }

      public _FunctionTypes._return_P0_E0<? extends ProgressIndicator> pindGet() {
        return super._3();
      }

      @SuppressWarnings(value = "unchecked")
      public Generate_Facet.Target_fi61u2_a.Variables assignFrom(Tuples._4<Project, IOperationContext, Boolean, _FunctionTypes._return_P0_E0<? extends ProgressIndicator>> from) {
        return (Generate_Facet.Target_fi61u2_a.Variables) super.assign(from);
      }
    }
  }

  public static class Target_fi61u2_b implements ITarget {
    private static Class<? extends IResource>[] EXPECTED_INPUT = (Class<? extends IResource>[]) new Class[]{};
    private static Class<? extends IResource>[] EXPECTED_OUTPUT = (Class<? extends IResource>[]) new Class[]{};

    private ITarget.Name name = new ITarget.Name("checkDumbMode");

    public Target_fi61u2_b() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IParametersPool pool) {
          Iterable<IResource> _output_fi61u2_a0b = null;
          switch (0) {
            case 0:
              if (DumbService.getInstance(pool.parameters(new ITarget.Name("checkParameters"), Generate_Facet.Target_fi61u2_a.Variables.class).project()).isDumb()) {
                DumbService.getInstance(pool.parameters(new ITarget.Name("checkParameters"), Generate_Facet.Target_fi61u2_a.Variables.class).project()).showDumbModeNotification("Generation is not available until indices are built.");
                return new IResult.FAILURE(_output_fi61u2_a0b);
              }
            default:
              return new IResult.SUCCESS(_output_fi61u2_a0b);
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

  public static class Target_fi61u2_c implements ITarget {
    private static Class<? extends IResource>[] EXPECTED_INPUT = (Class<? extends IResource>[]) new Class[]{};
    private static Class<? extends IResource>[] EXPECTED_OUTPUT = (Class<? extends IResource>[]) new Class[]{};

    private ITarget.Name name = new ITarget.Name("configure");

    public Target_fi61u2_c() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IParametersPool pool) {
          Iterable<IResource> _output_fi61u2_a0c = null;
          switch (0) {
            case 0:
              GenerationSettings settings = GenerationSettings.getInstance();
              pool.parameters(Target_fi61u2_c.this.getName(), Generate_Facet.Target_fi61u2_c.Variables.class).generationOptions((pool.parameters(Target_fi61u2_c.this.getName(), Generate_Facet.Target_fi61u2_c.Variables.class).generationOptions() != null ?
                pool.parameters(Target_fi61u2_c.this.getName(), Generate_Facet.Target_fi61u2_c.Variables.class).generationOptions() :
                GenerationOptions.fromSettings(settings)
              ));
              pool.parameters(Target_fi61u2_c.this.getName(), Generate_Facet.Target_fi61u2_c.Variables.class).generationOptions().incremental(new MakeGenerationStrategy((settings.isIncremental() && settings.isIncrementalUseCache() ?
                GeneratorCacheComponent.getInstance().getCache() :
                null
              ), settings.isIncremental()));
              IGenerationTracer tracer = (pool.parameters(Target_fi61u2_c.this.getName(), Generate_Facet.Target_fi61u2_c.Variables.class).saveTransient() ?
                pool.parameters(new ITarget.Name("checkParameters"), Generate_Facet.Target_fi61u2_a.Variables.class).project().getComponent(IGenerationTracer.class) :
                new NullGenerationTracer()
              );
              pool.parameters(Target_fi61u2_c.this.getName(), Generate_Facet.Target_fi61u2_c.Variables.class).generationOptions(pool.parameters(Target_fi61u2_c.this.getName(), Generate_Facet.Target_fi61u2_c.Variables.class).generationOptions().saveTransientModels(pool.parameters(Target_fi61u2_c.this.getName(), Generate_Facet.Target_fi61u2_c.Variables.class).saveTransient()).tracing(settings.getPerformanceTracingLevel(), tracer).rebuildAll(pool.parameters(new ITarget.Name("checkParameters"), Generate_Facet.Target_fi61u2_a.Variables.class).cleanMake()).keepOutputModel(true));
              return new IResult.SUCCESS(_output_fi61u2_a0c);
            default:
              return new IResult.SUCCESS(_output_fi61u2_a0c);
          }
        }
      };
    }

    public IConfig createConfig() {
      return new IConfig() {
        public boolean configure(final IConfigMonitor cmonitor, final IParametersPool pool) {
          switch (0) {
            case 0:
              GenerationSettings settings = GenerationSettings.getInstance();
              if (pool.parameters(Target_fi61u2_c.this.getName(), Generate_Facet.Target_fi61u2_c.Variables.class).saveTransient() != null) {
                return true;
              }
              if (settings.isSaveTransientModels()) {
                switch (cmonitor.<SaveTransient_Option>relayQuery(new SaveTransientModels_Query())) {
                  case SAVE_fi61u2_a0a0c:
                    pool.parameters(Target_fi61u2_c.this.getName(), Generate_Facet.Target_fi61u2_c.Variables.class).saveTransient(true);
                    break;
                  case DONT_SAVE_fi61u2_b0a0c:
                    pool.parameters(Target_fi61u2_c.this.getName(), Generate_Facet.Target_fi61u2_c.Variables.class).saveTransient(false);
                    break;
                  case BUGGER_OFF_fi61u2_c0a0c:
                    pool.parameters(Target_fi61u2_c.this.getName(), Generate_Facet.Target_fi61u2_c.Variables.class).saveTransient(false);
                    settings.setSaveTransientModels(false);
                    break;
                  default:
                    return false;
                }
              } else {
                pool.parameters(Target_fi61u2_c.this.getName(), Generate_Facet.Target_fi61u2_c.Variables.class).saveTransient(false);
              }
            default:
              return true;
          }
        }
      };
    }

    public Iterable<ITarget.Name> notAfter() {
      return null;
    }

    public Iterable<ITarget.Name> after() {
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("checkParameters"), new ITarget.Name("checkDumbMode")});
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
      return cls.cast(new Variables());
    }

    public <T> T createParameters(Class<T> cls, T copyFrom) {
      T t = createParameters(cls);
      if (t != null) {
        ((Generate_Facet.Target_fi61u2_c.Variables) t).saveTransient(((Generate_Facet.Target_fi61u2_c.Variables) copyFrom).saveTransient());
        ((Generate_Facet.Target_fi61u2_c.Variables) t).generationOptions(((Generate_Facet.Target_fi61u2_c.Variables) copyFrom).generationOptions());
      }
      return t;
    }

    public static class Variables extends MultiTuple._2<Boolean, GenerationOptions.OptionsBuilder> {
      public Variables() {
        super();
      }

      public Variables(Boolean saveTransient, GenerationOptions.OptionsBuilder generationOptions) {
        super(saveTransient, generationOptions);
      }

      public Boolean saveTransient(Boolean value) {
        return super._0(value);
      }

      public GenerationOptions.OptionsBuilder generationOptions(GenerationOptions.OptionsBuilder value) {
        return super._1(value);
      }

      public Boolean saveTransient() {
        return super._0();
      }

      public GenerationOptions.OptionsBuilder generationOptions() {
        return super._1();
      }

      @SuppressWarnings(value = "unchecked")
      public Generate_Facet.Target_fi61u2_c.Variables assignFrom(Tuples._2<Boolean, GenerationOptions.OptionsBuilder> from) {
        return (Generate_Facet.Target_fi61u2_c.Variables) super.assign(from);
      }
    }
  }

  public static class Target_fi61u2_d implements ITarget {
    private static Class<? extends IResource>[] EXPECTED_INPUT = (Class<? extends IResource>[]) new Class[]{IMResource.class};
    private static Class<? extends IResource>[] EXPECTED_OUTPUT = (Class<? extends IResource>[]) new Class[]{};

    private ITarget.Name name = new ITarget.Name("preloadModels");

    public Target_fi61u2_d() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IParametersPool pool) {
          Iterable<IResource> _output_fi61u2_a0d = null;
          switch (0) {
            case 0:
              int work = Sequence.fromIterable(input).count() * 100;
              if (work == 0) {
                return new IResult.SUCCESS(_output_fi61u2_a0d);
              }
              monitor.currentProgress().beginWork("Pre-loading models", work, monitor.currentProgress().workLeft());
              Sequence.fromIterable(input).visitAll(new IVisitor<IResource>() {
                public void visit(IResource mod) {
                  MResource mres = ((MResource) mod);
                  monitor.currentProgress().advanceWork("Pre-loading models", 100);
                  Sequence.fromIterable(mres.models()).visitAll(new IVisitor<SModelDescriptor>() {
                    public void visit(final SModelDescriptor smd) {
                      if (smd instanceof DefaultSModelDescriptor) {
                        ModelAccess.instance().runReadAction(new Runnable() {
                          public void run() {
                            smd.getSModel();
                            ((DefaultSModelDescriptor) smd).enforceFullLoad();
                          }
                        });
                      }
                    }
                  });
                }
              });
              monitor.currentProgress().finishWork("Pre-loading models");
              _output_fi61u2_a0d = Sequence.fromIterable(_output_fi61u2_a0d).concat(Sequence.fromIterable(input));
            default:
              return new IResult.SUCCESS(_output_fi61u2_a0d);
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
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("configure")});
    }

    public Iterable<ITarget.Name> notBefore() {
      return null;
    }

    public Iterable<ITarget.Name> before() {
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("generate")});
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

  public static class Target_fi61u2_e implements ITarget {
    private static Class<? extends IResource>[] EXPECTED_INPUT = (Class<? extends IResource>[]) new Class[]{IMResource.class};
    private static Class<? extends IResource>[] EXPECTED_OUTPUT = (Class<? extends IResource>[]) new Class[]{};

    private ITarget.Name name = new ITarget.Name("generate");

    public Target_fi61u2_e() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IParametersPool pool) {
          final Wrappers._T<Iterable<IResource>> _output_fi61u2_a0e = new Wrappers._T<Iterable<IResource>>(null);
          switch (0) {
            case 0:
              boolean generationOk;
              GeneratorManager gm = pool.parameters(new ITarget.Name("checkParameters"), Generate_Facet.Target_fi61u2_a.Variables.class).project().getComponent(GeneratorManager.class);
              if (!(pool.parameters(new ITarget.Name("configure"), Generate_Facet.Target_fi61u2_c.Variables.class).saveTransient())) {
                IGenerationTracer tracer = pool.parameters(new ITarget.Name("checkParameters"), Generate_Facet.Target_fi61u2_a.Variables.class).project().getComponent(IGenerationTracer.class);
                if (tracer != null) {
                  tracer.discardTracing();
                }
              }
              final Map<IModule, Iterable<SModelDescriptor>> retainedModels = MapSequence.fromMap(new HashMap<IModule, Iterable<SModelDescriptor>>());
              final Iterable<SModelDescriptor> empty = ListSequence.fromList(new ArrayList<SModelDescriptor>());
              Sequence.fromIterable(input).visitAll(new IVisitor<IResource>() {
                public void visit(IResource it) {
                  MResource mres = ((MResource) it);
                  IModule module = mres.module();
                  MapSequence.fromMap(retainedModels).put(module, empty);
                  Iterable<SModelDescriptor> modelsToRetain = Sequence.fromIterable(((Iterable<SModelDescriptor>) module.getOwnModelDescriptors())).where(new IWhereFilter<SModelDescriptor>() {
                    public boolean accept(SModelDescriptor it2) {
                      return it2.isGeneratable();
                    }
                  });
                  if (module instanceof Language) {
                    for (final Generator gen : ((Language) module).getGenerators()) {
                      if (!(MapSequence.fromMap(retainedModels).containsKey(gen))) {
                        MapSequence.fromMap(retainedModels).put(gen, Sequence.fromIterable(((Iterable<SModelDescriptor>) gen.getOwnModelDescriptors())).where(new IWhereFilter<SModelDescriptor>() {
                          public boolean accept(SModelDescriptor it2) {
                            return it2.isGeneratable();
                          }
                        }));
                      }
                      modelsToRetain = Sequence.fromIterable(modelsToRetain).concat(Sequence.fromIterable(Sequence.fromClosure(new ISequenceClosure<SModelDescriptor>() {
                        public Iterable<SModelDescriptor> iterable() {
                          return MapSequence.fromMap(retainedModels).get(gen);
                        }
                      })));
                    }
                  } else if (module instanceof Generator) {
                    final Language slang = ((Generator) module).getSourceLanguage();
                    if (!(MapSequence.fromMap(retainedModels).containsKey(slang))) {
                      MapSequence.fromMap(retainedModels).put(slang, Sequence.fromIterable(((Iterable<SModelDescriptor>) slang.getOwnModelDescriptors())).subtract(ListSequence.fromList(module.getOwnModelDescriptors())).where(new IWhereFilter<SModelDescriptor>() {
                        public boolean accept(SModelDescriptor it3) {
                          return it3.isGeneratable();
                        }
                      }));
                    }
                    modelsToRetain = Sequence.fromIterable(modelsToRetain).concat(Sequence.fromIterable(Sequence.fromClosure(new ISequenceClosure<SModelDescriptor>() {
                      public Iterable<SModelDescriptor> iterable() {
                        return MapSequence.fromMap(retainedModels).get(slang);
                      }
                    })));
                  }
                  MapSequence.fromMap(retainedModels).put(mres.module(), Sequence.fromIterable(modelsToRetain).subtract(Sequence.fromIterable(mres.models())).toListSequence());
                }
              });

              IGenerationHandler gh = new MakeGenerationHandler(new _FunctionTypes._return_P1_E0<Boolean, GResource>() {
                public Boolean invoke(GResource data) {
                  monitor.currentProgress().advanceWork("Generating", 1000);
                  data.retainedModels(MapSequence.fromMap(retainedModels).get(data.module()));
                  _output_fi61u2_a0e.value = Sequence.fromIterable(_output_fi61u2_a0e.value).concat(Sequence.fromIterable(Sequence.<IResource>singleton(data)));
                  return true;
                }
              });
              IMessageHandler mh = new IMessageHandler() {
                public void handle(IMessage msg) {
                  monitor.reportFeedback(new IFeedback.MESSAGE(msg));
                }

                public void clear() {
                }
              };

              monitor.currentProgress().beginWork("Generating", Sequence.fromIterable(input).foldLeft(0, new ILeftCombinator<IResource, Integer>() {
                public Integer combine(Integer s, IResource it) {
                  return s + Sequence.fromIterable(((MResource) it).models()).count() * 1000;
                }
              }) + 1000, monitor.currentProgress().workLeft());
              monitor.currentProgress().advanceWork("Generating", 1000);
              List<SModelDescriptor> models = Sequence.fromIterable(input).<SModelDescriptor>translate(new ITranslator2<IResource, SModelDescriptor>() {
                public Iterable<SModelDescriptor> translate(IResource in) {
                  return ((MResource) in).models();
                }
              }).toListSequence();

              generationOk = gm.generateModels(models, pool.parameters(new ITarget.Name("checkParameters"), Generate_Facet.Target_fi61u2_a.Variables.class).operationContext(), gh, pool.parameters(new ITarget.Name("checkParameters"), Generate_Facet.Target_fi61u2_a.Variables.class).pindGet().invoke(), mh, pool.parameters(new ITarget.Name("configure"), Generate_Facet.Target_fi61u2_c.Variables.class).generationOptions().create());

              monitor.currentProgress().finishWork("Generating");
              if (!(generationOk)) {
                return new IResult.FAILURE(_output_fi61u2_a0e.value);
              }
              _output_fi61u2_a0e.value = Sequence.fromIterable(_output_fi61u2_a0e.value).concat(Sequence.fromIterable(Sequence.<IResource>singleton(new DResource(Sequence.<IDelta>singleton(new IInternalDelta() {
                public IDelta merge(IDelta toMerge) {
                  return this;
                }

                public boolean contains(IDelta other) {
                  return false;
                }

                public boolean reconcile() {
                  if (!(pool.parameters(new ITarget.Name("configure"), Generate_Facet.Target_fi61u2_c.Variables.class).saveTransient())) {
                    pool.parameters(new ITarget.Name("checkParameters"), Generate_Facet.Target_fi61u2_a.Variables.class).project().getComponent(TransientModelsComponent.class).removeAllTransient();
                  }
                  return true;
                }
              })))));
            default:
              return new IResult.SUCCESS(_output_fi61u2_a0e.value);
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
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("configure")});
    }

    public Iterable<ITarget.Name> notBefore() {
      return null;
    }

    public Iterable<ITarget.Name> before() {
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("reconcile"), new ITarget.Name("make")});
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

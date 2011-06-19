package jetbrains.mps.make.facet.plugin;

/*Generated by MPS */

import jetbrains.mps.make.facet.IFacet;
import java.util.List;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.smodel.resources.IGResource;
import jetbrains.mps.make.script.IJob;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.make.script.IJobMonitor;
import jetbrains.mps.make.script.IParametersPool;
import jetbrains.mps.smodel.resources.GResource;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.generator.fileGenerator.FileGenerationUtil;
import jetbrains.mps.internal.make.runtime.util.FilesDelta;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.generator.GeneratorManager;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.internal.make.runtime.java.JavaStreamHandler;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.generator.generationTypes.TextGenerator;
import jetbrains.mps.make.java.BLDependenciesCache;
import jetbrains.mps.generator.traceInfo.TraceInfoCache;
import jetbrains.mps.generator.impl.dependencies.GenerationDependenciesCache;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.generator.TransientModelsModule;
import jetbrains.mps.cleanup.CleanupManager;
import jetbrains.mps.make.script.IFeedback;
import jetbrains.mps.smodel.resources.TResource;
import jetbrains.mps.make.delta.IDelta;
import jetbrains.mps.make.script.IConfig;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.textGen.TextGenerationResult;
import jetbrains.mps.textGen.TextGenerationUtil;
import jetbrains.mps.textGen.TextGenManager;
import jetbrains.mps.smodel.resources.FResource;
import jetbrains.mps.util.JavaNameUtil;

public class TextGen_Facet implements IFacet {
  private List<ITarget> targets = ListSequence.fromList(new ArrayList<ITarget>());
  private IFacet.Name name = new IFacet.Name("jetbrains.mps.make.facet.TextGen");

  public TextGen_Facet() {
    ListSequence.fromList(targets).addElement(new TextGen_Facet.Target_21gswx_a());
    ListSequence.fromList(targets).addElement(new TextGen_Facet.Target_21gswx_b());
  }

  public Iterable<ITarget> targets() {
    return targets;
  }

  public Iterable<IFacet.Name> optional() {
    return null;
  }

  public Iterable<IFacet.Name> required() {
    return Sequence.fromArray(new IFacet.Name[]{new IFacet.Name("Generate"), new IFacet.Name("Make")});
  }

  public Iterable<IFacet.Name> extended() {
    return null;
  }

  public IFacet.Name getName() {
    return this.name;
  }

  public static class Target_21gswx_a implements ITarget {
    private static Class<? extends IResource>[] EXPECTED_INPUT = (Class<? extends IResource>[]) new Class[]{IGResource.class};
    private static Class<? extends IResource>[] EXPECTED_OUTPUT = (Class<? extends IResource>[]) new Class[]{};

    private ITarget.Name name = new ITarget.Name("textGen");

    public Target_21gswx_a() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IParametersPool pool) {
          Iterable<IResource> _output_21gswx_a0a = null;
          switch (0) {
            case 0:
              monitor.currentProgress().beginWork("Writing", Sequence.fromIterable(input).count() * 100, monitor.currentProgress().workLeft());
              for (IResource resource : Sequence.fromIterable(input)) {
                final GResource gres = (GResource) resource;
                monitor.currentProgress().advanceWork("Writing", 50, gres.status().getInputModel().getSModelReference().getSModelFqName().getLongName());
                if (!(gres.status().isOk())) {
                  Logger.getLogger("jetbrains.mps.make.TextGen").error("Generation was not OK");
                  return new IResult.FAILURE(_output_21gswx_a0a);
                }
                String output = gres.module().getOutputFor(gres.model());
                final IFile targetDir = (pool.parameters(Target_21gswx_a.this.getName(), TextGen_Facet.Target_21gswx_a.Parameters.class).pathToFile() != null ?
                  pool.parameters(Target_21gswx_a.this.getName(), TextGen_Facet.Target_21gswx_a.Parameters.class).pathToFile().invoke(output) :
                  FileSystem.getInstance().getFileByPath(output)
                );
                final IFile cachesDir = FileGenerationUtil.getCachesDir(targetDir);
                final FilesDelta targetDelta = new FilesDelta(targetDir);
                Sequence.fromIterable(gres.retainedModels()).where(new IWhereFilter<SModelDescriptor>() {
                  public boolean accept(SModelDescriptor smd) {
                    return !(GeneratorManager.isDoNotGenerate(smd));
                  }
                }).visitAll(new IVisitor<SModelDescriptor>() {
                  public void visit(SModelDescriptor smd) {
                    targetDelta.kept(FileGenerationUtil.getDefaultOutputDir(smd, targetDir));
                  }
                });
                final FilesDelta cachesDelta = new FilesDelta(cachesDir);
                Sequence.fromIterable(gres.retainedModels()).where(new IWhereFilter<SModelDescriptor>() {
                  public boolean accept(SModelDescriptor smd) {
                    return !(GeneratorManager.isDoNotGenerate(smd));
                  }
                }).visitAll(new IVisitor<SModelDescriptor>() {
                  public void visit(SModelDescriptor smd) {
                    cachesDelta.kept(FileGenerationUtil.getDefaultOutputDir(smd, cachesDir));
                  }
                });

                final JavaStreamHandler javaStreamHandler = new JavaStreamHandler(gres.model(), targetDir, cachesDir);
                final Wrappers._boolean ok = new Wrappers._boolean();
                boolean generateDI = pool.parameters(Target_21gswx_a.this.getName(), TextGen_Facet.Target_21gswx_a.Parameters.class).generateDebugInfo() == null || pool.parameters(Target_21gswx_a.this.getName(), TextGen_Facet.Target_21gswx_a.Parameters.class).generateDebugInfo();
                final TextGenerator textgen = new TextGenerator(javaStreamHandler, BLDependenciesCache.getInstance().getGenerator(), (generateDI ?
                  TraceInfoCache.getInstance().getGenerator() :
                  null
                ), GenerationDependenciesCache.getInstance().getGenerator());
                textgen.setFailIfNoTextgen(pool.parameters(Target_21gswx_a.this.getName(), TextGen_Facet.Target_21gswx_a.Parameters.class).failIfNoTextgen() != null && pool.parameters(Target_21gswx_a.this.getName(), TextGen_Facet.Target_21gswx_a.Parameters.class).failIfNoTextgen());
                textgen.setGenerateDebugInfo(generateDI);
                try {
                  ModelAccess.instance().runReadAction(new Runnable() {
                    public void run() {
                      ok.value = textgen.handleOutput(pool.parameters(new ITarget.Name("checkParameters"), Generate_Facet.Target_fi61u2_a.Variables.class).operationContext(), gres.status());
                    }
                  });
                } finally {
                  javaStreamHandler.dispose();
                }

                final SModelDescriptor outputMD = gres.status().getOutputModelDescriptor();
                if (outputMD instanceof TransientModelsModule.TransientSModelDescriptor) {
                  ModelAccess.instance().runWriteInEDTAndWait(new Runnable() {
                    public void run() {
                      TransientModelsModule.TransientSModelDescriptor tmd = (TransientModelsModule.TransientSModelDescriptor) outputMD;
                      ((TransientModelsModule) tmd.getModule()).removeModel(tmd);
                      CleanupManager.getInstance().cleanup();
                    }
                  });
                }

                if (!(ok.value)) {
                  for (String err : textgen.errors()) {
                    monitor.reportFeedback(new IFeedback.ERROR(String.valueOf(err)));
                  }
                  monitor.reportFeedback(new IFeedback.ERROR(String.valueOf("Failed to generate text")));
                  return new IResult.FAILURE(_output_21gswx_a0a);
                }
                ModelAccess.instance().runWriteInEDTAndWait(new Runnable() {
                  public void run() {
                    javaStreamHandler.flush();
                  }
                });
                monitor.currentProgress().advanceWork("Writing", 50);
                _output_21gswx_a0a = Sequence.fromIterable(_output_21gswx_a0a).concat(Sequence.fromIterable(Sequence.<IResource>singleton(new TResource(gres.module(), Sequence.fromIterable(javaStreamHandler.delta()).concat(Sequence.fromIterable(Sequence.fromArray(new IDelta[]{targetDelta, cachesDelta})))))));
              }
              monitor.currentProgress().finishWork("Writing");
            default:
              return new IResult.SUCCESS(_output_21gswx_a0a);
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
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("generate")});
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
      return cls.cast(new Parameters());
    }

    public <T> T createParameters(Class<T> cls, T copyFrom) {
      T t = createParameters(cls);
      if (t != null) {
        ((TextGen_Facet.Target_21gswx_a.Parameters) t).pathToFile(((TextGen_Facet.Target_21gswx_a.Parameters) copyFrom).pathToFile());
        ((TextGen_Facet.Target_21gswx_a.Parameters) t).failIfNoTextgen(((TextGen_Facet.Target_21gswx_a.Parameters) copyFrom).failIfNoTextgen());
        ((TextGen_Facet.Target_21gswx_a.Parameters) t).generateDebugInfo(((TextGen_Facet.Target_21gswx_a.Parameters) copyFrom).generateDebugInfo());
      }
      return t;
    }

    public static class Parameters extends MultiTuple._3<_FunctionTypes._return_P1_E0<? extends IFile, ? super String>, Boolean, Boolean> {
      public Parameters() {
        super();
      }

      public Parameters(_FunctionTypes._return_P1_E0<? extends IFile, ? super String> pathToFile, Boolean failIfNoTextgen, Boolean generateDebugInfo) {
        super(pathToFile, failIfNoTextgen, generateDebugInfo);
      }

      public _FunctionTypes._return_P1_E0<? extends IFile, ? super String> pathToFile(_FunctionTypes._return_P1_E0<? extends IFile, ? super String> value) {
        return super._0(value);
      }

      public Boolean failIfNoTextgen(Boolean value) {
        return super._1(value);
      }

      public Boolean generateDebugInfo(Boolean value) {
        return super._2(value);
      }

      public _FunctionTypes._return_P1_E0<? extends IFile, ? super String> pathToFile() {
        return super._0();
      }

      public Boolean failIfNoTextgen() {
        return super._1();
      }

      public Boolean generateDebugInfo() {
        return super._2();
      }

      @SuppressWarnings(value = "unchecked")
      public TextGen_Facet.Target_21gswx_a.Parameters assignFrom(Tuples._3<_FunctionTypes._return_P1_E0<? extends IFile, ? super String>, Boolean, Boolean> from) {
        return (TextGen_Facet.Target_21gswx_a.Parameters) super.assign(from);
      }
    }
  }

  public static class Target_21gswx_b implements ITarget {
    private static Class<? extends IResource>[] EXPECTED_INPUT = (Class<? extends IResource>[]) new Class[]{IGResource.class};
    private static Class<? extends IResource>[] EXPECTED_OUTPUT = (Class<? extends IResource>[]) new Class[]{};

    private ITarget.Name name = new ITarget.Name("textGenToMemory");

    public Target_21gswx_b() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IParametersPool pool) {
          Iterable<IResource> _output_21gswx_a0b = null;
          switch (0) {
            case 0:
              for (IResource resource : Sequence.fromIterable(input)) {
                final GResource gres = (GResource) resource;
                final Map<String, Object> texts = MapSequence.fromMap(new HashMap<String, Object>());
                final Wrappers._T<SModel> sModel = new Wrappers._T<SModel>();
                final Wrappers._boolean errors = new Wrappers._boolean(false);
                ModelAccess.instance().runReadAction(new Runnable() {
                  public void run() {
                    sModel.value = gres.status().getOutputModel();
                    for (SNode root : Sequence.fromIterable(sModel.value.roots()).where(new IWhereFilter<SNode>() {
                      public boolean accept(SNode rt) {
                        return rt.getName() != null;
                      }
                    })) {
                      TextGenerationResult tgr = TextGenerationUtil.generateText(pool.parameters(new ITarget.Name("checkParameters"), Generate_Facet.Target_fi61u2_a.Variables.class).operationContext(), root);
                      errors.value |= tgr.hasErrors();
                      if (errors.value) {
                        break;
                      }
                      String ext = TextGenManager.instance().getExtension(root);
                      String fname = ((ext != null ?
                        root.getName() + "." + ext :
                        root.getName()
                      ));
                      MapSequence.fromMap(texts).put(fname, tgr.getResult());
                    }
                  }
                });
                if (errors.value) {
                  return new IResult.FAILURE(_output_21gswx_a0b);
                }
                _output_21gswx_a0b = Sequence.fromIterable(_output_21gswx_a0b).concat(Sequence.fromIterable(Sequence.<IResource>singleton(new FResource(JavaNameUtil.packageName(sModel.value), texts, gres.module(), gres.model()))));
              }
            default:
              return new IResult.SUCCESS(_output_21gswx_a0b);
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
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("generate")});
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

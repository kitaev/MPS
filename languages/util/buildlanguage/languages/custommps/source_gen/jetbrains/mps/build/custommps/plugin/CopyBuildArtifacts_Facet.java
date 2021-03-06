package jetbrains.mps.build.custommps.plugin;

/*Generated by MPS */

import jetbrains.mps.make.facet.IFacet;
import java.util.List;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.make.resources.IPropertiesPersistence;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.smodel.resources.ITResource;
import jetbrains.mps.make.script.IJob;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.make.script.IJobMonitor;
import jetbrains.mps.make.resources.IPropertiesAccessor;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.smodel.resources.TResource;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.util.MacrosFactory;
import jetbrains.mps.internal.make.runtime.util.DeltaReconciler;
import jetbrains.mps.internal.make.runtime.util.FilesDelta;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import jetbrains.mps.make.script.IFeedback;
import jetbrains.mps.ide.ThreadUtils;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.vfs.IFileUtils;
import jetbrains.mps.make.script.IConfig;
import java.util.Map;
import jetbrains.mps.make.script.IPropertiesPool;
import jetbrains.mps.internal.collections.runtime.MapSequence;

public class CopyBuildArtifacts_Facet extends IFacet.Stub {
  private List<ITarget> targets = ListSequence.fromList(new ArrayList<ITarget>());
  private IFacet.Name name = new IFacet.Name("jetbrains.mps.build.custommps.CopyBuildArtifacts");

  public CopyBuildArtifacts_Facet() {
    ListSequence.fromList(targets).addElement(new CopyBuildArtifacts_Facet.Target_copyFiles());
  }

  public Iterable<ITarget> targets() {
    return targets;
  }

  public Iterable<IFacet.Name> optional() {
    return null;
  }

  public Iterable<IFacet.Name> required() {
    return Sequence.fromArray(new IFacet.Name[]{new IFacet.Name("jetbrains.mps.lang.core.Generate"), new IFacet.Name("jetbrains.mps.lang.core.TextGen")});
  }

  public Iterable<IFacet.Name> extended() {
    return null;
  }

  public IFacet.Name getName() {
    return this.name;
  }

  public IPropertiesPersistence propertiesPersistence() {
    return new CopyBuildArtifacts_Facet.TargetProperties();
  }

  public static class Target_copyFiles implements ITarget {
    private static Class<? extends IResource>[] EXPECTED_INPUT = (Class<? extends IResource>[]) new Class[]{ITResource.class};
    private static Class<? extends IResource>[] EXPECTED_OUTPUT = (Class<? extends IResource>[]) new Class[]{};

    private ITarget.Name name = new ITarget.Name("jetbrains.mps.build.custommps.CopyBuildArtifacts.copyFiles");

    public Target_copyFiles() {
    }

    public IJob createJob() {
      return new IJob.Stub() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IPropertiesAccessor pa) {
          Iterable<IResource> _output_srsvb8_a0a = null;
          switch (0) {
            case 0:
              final List<Tuples._2<IFile, IFile>> toCopy = ListSequence.fromList(new ArrayList<Tuples._2<IFile, IFile>>());
              for (IResource resource : input) {
                TResource tres = (TResource) resource;
                String dest = pa.forResource(tres).properties(Target_copyFiles.this.getName(), CopyBuildArtifacts_Facet.Target_copyFiles.Parameters.class).destination();
                if (dest != null) {
                  final IFile destDir = FileSystem.getInstance().getFileByPath(MacrosFactory.moduleDescriptor(tres.module()).expandPath(dest, tres.module().getDescriptorFile()));
                  if (destDir.exists() && destDir.isDirectory()) {
                    new DeltaReconciler(tres.delta()).visitAll(new FilesDelta.Visitor() {
                      @Override
                      public boolean acceptWritten(IFile file) {
                        if (!(Sequence.fromIterable(Sequence.fromArray(new String[]{"dependencies", "generated", "trace.info"})).contains(file.getName()))) {
                          String path = file.getPath();
                          IFile copy = destDir.getDescendant(file.getName());
                          ListSequence.fromList(toCopy).addElement(MultiTuple.<IFile,IFile>from(file, copy));
                          monitor.reportFeedback(new IFeedback.INFORMATION(String.valueOf("Copying " + ListSequence.fromList(toCopy).last())));
                        }
                        return true;
                      }
                    });
                  }
                }

                ThreadUtils.runInUIThreadAndWait(new Runnable() {
                  public void run() {
                    ModelAccess.instance().requireWrite(new Runnable() {
                      public void run() {
                        ListSequence.fromList(toCopy).visitAll(new IVisitor<Tuples._2<IFile, IFile>>() {
                          public void visit(Tuples._2<IFile, IFile> ftc) {
                            IFileUtils.copyFileContent(ftc._0(), ftc._1());
                          }
                        });
                      }
                    });
                  }
                });

                _output_srsvb8_a0a = Sequence.fromIterable(_output_srsvb8_a0a).concat(Sequence.fromIterable(Sequence.<IResource>singleton(resource)));
              }
            default:
              return new IResult.SUCCESS(_output_srsvb8_a0a);
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
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("jetbrains.mps.lang.core.TextGen.textGen")});
    }

    public Iterable<ITarget.Name> notBefore() {
      return null;
    }

    public Iterable<ITarget.Name> before() {
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("jetbrains.mps.lang.core.Make.reconcile")});
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
        ((Tuples._1) t).assign((Tuples._1) copyFrom);
      }
      return t;
    }

    public static class Parameters extends MultiTuple._1<String> {
      public Parameters() {
        super();
      }

      public Parameters(String destination) {
        super(destination);
      }

      public String destination(String value) {
        return super._0(value);
      }

      public String destination() {
        return super._0();
      }

      @SuppressWarnings(value = "unchecked")
      public CopyBuildArtifacts_Facet.Target_copyFiles.Parameters assignFrom(Tuples._1<String> from) {
        return (CopyBuildArtifacts_Facet.Target_copyFiles.Parameters) super.assign(from);
      }
    }
  }

  public static class TargetProperties implements IPropertiesPersistence {
    public TargetProperties() {
    }

    public void storeValues(Map<String, String> store, IPropertiesPool properties) {
      {
        ITarget.Name name = new ITarget.Name("jetbrains.mps.build.custommps.CopyBuildArtifacts.copyFiles");
        if (properties.hasProperties(name)) {
          CopyBuildArtifacts_Facet.Target_copyFiles.Parameters props = properties.properties(name, CopyBuildArtifacts_Facet.Target_copyFiles.Parameters.class);
          MapSequence.fromMap(store).put("jetbrains.mps.build.custommps.CopyBuildArtifacts.copyFiles.destination", String.valueOf(props.destination()));
        }
      }
    }

    public void loadValues(Map<String, String> store, IPropertiesPool properties) {
      try {
        {
          ITarget.Name name = new ITarget.Name("jetbrains.mps.build.custommps.CopyBuildArtifacts.copyFiles");
          CopyBuildArtifacts_Facet.Target_copyFiles.Parameters props = properties.properties(name, CopyBuildArtifacts_Facet.Target_copyFiles.Parameters.class);
          if (MapSequence.fromMap(store).containsKey("jetbrains.mps.build.custommps.CopyBuildArtifacts.copyFiles.destination")) {
            props.destination(String.valueOf(MapSequence.fromMap(store).get("jetbrains.mps.build.custommps.CopyBuildArtifacts.copyFiles.destination")));
          }
        }
      } catch (RuntimeException re) {
      }
    }
  }
}

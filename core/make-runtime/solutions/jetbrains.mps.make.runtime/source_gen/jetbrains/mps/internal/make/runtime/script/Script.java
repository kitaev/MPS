package jetbrains.mps.internal.make.runtime.script;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.internal.collections.runtime.*;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.make.script.*;

import java.util.*;

public class Script implements IScript {
  private static Logger LOG = Logger.getLogger(Script.class);

  private ITarget.Name startingTarget;
  private ITarget.Name finalTarget;
  private TargetRange targetRange;
  private List<ValidationError> errors = ListSequence.fromList(new ArrayList<ValidationError>());
  private boolean validated = false;

  public Script(TargetRange targetRange, ITarget.Name defaultTargetName) {
    this.targetRange = targetRange;
    this.finalTarget = defaultTargetName;
  }

  public Script(TargetRange targetRange, ITarget.Name finalTarget, ITarget.Name startingTarget) {
    this.targetRange = targetRange;
    this.finalTarget = finalTarget;
    this.startingTarget = startingTarget;
  }

  public void validate() {
    ListSequence.fromList(errors).clear();
    if (startingTarget != null && !(targetRange.hasTarget(startingTarget))) {
      LOG.error("unknown starting target: " + startingTarget);
      error(startingTarget, "unknown starting target: " + startingTarget);
    }
    if (!(targetRange.hasTarget(finalTarget))) {
      LOG.error("unknown final target: " + finalTarget);
      error(finalTarget, "unknown final target: " + finalTarget);
    }
    if (targetRange.hasCycles()) {
      LOG.error("cycle(s) detected: " + targetRange.cycles());
      error(this, "cycle(s) detected: " + targetRange.cycles());
    }
    if (startingTarget != null && !(Sequence.fromIterable(targetRange.targetAndSortedPrecursors(finalTarget)).<ITarget.Name>select(new ISelector<ITarget, ITarget.Name>() {
      public ITarget.Name select(ITarget t) {
        return t.getName();
      }
    }).contains(startingTarget))) {
      LOG.error("invalid starting target: " + startingTarget);
      error(this, "invalid starting target: " + startingTarget);
    }
    validated = true;
  }

  public void invalidate() {
    this.validated = false;
  }

  public boolean isValid() {
    return validated && ListSequence.fromList(errors).isEmpty();
  }

  public Iterable<ITarget> allTargets() {
    return targetRange.sortedTargets();
  }

  public ITarget finalTarget() {
    ITarget trg = targetRange.getTarget(finalTarget);
    if (trg == null) {
      LOG.error("no such target: " + finalTarget);
    }
    return trg;
  }

  public ITarget startingTarget() {
    if (startingTarget == null) {
      return null;
    }
    ITarget trg = targetRange.getTarget(startingTarget);
    if (trg == null) {
      LOG.error("no such target: " + startingTarget);
    }
    return trg;
  }

  private void error(Object o, String message) {
    ListSequence.fromList(this.errors).addElement(new ValidationError(o, message));
  }

  public IResult execute(IScriptController controller, Iterable<? extends IResource> scriptInput) {
    validate();
    if (!(isValid())) {
      LOG.error("attempt to execute invalid script");
      throw new IllegalStateException("invalid script");
    }

    LOG.debug("Beginning to execute script");
    CompositeResult results = new CompositeResult();
    Script.ParametersPool pool = new Script.ParametersPool();

    LOG.debug("Initializing");
    IScriptController ctl = (controller != null ?
      controller :
      new IScriptController.Stub()
    );
    ctl.setup(pool);

    final Wrappers._T<ITarget.Name> waitFor = new Wrappers._T<ITarget.Name>(startingTarget);
    Iterable<ITarget> toExecute = Sequence.fromIterable(targetRange.targetAndSortedPrecursors(finalTarget)).<ITarget>translate(new ITranslator2<ITarget, ITarget>() {
      public Iterable<ITarget> translate(final ITarget tn) {
        return new Iterable<ITarget>() {
          public Iterator<ITarget> iterator() {
            return new YieldingIterator<ITarget>() {
              private int __CP__ = 0;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 2:
                      if (waitFor.value != null) {
                        this.__CP__ = 3;
                        break;
                      }
                      this.__CP__ = 7;
                      break;
                    case 4:
                      if (waitFor.value.equals(tn.getName())) {
                        this.__CP__ = 5;
                        break;
                      }
                      this.__CP__ = 1;
                      break;
                    case 8:
                      this.__CP__ = 1;
                      this.yield(tn);
                      return true;
                    case 0:
                      this.__CP__ = 2;
                      break;
                    case 3:
                      this.__CP__ = 4;
                      break;
                    case 5:
                      waitFor.value = null;
                      this.__CP__ = 1;
                      break;
                    case 7:
                      this.__CP__ = 8;
                      break;
                    default:
                      break __loop__;
                  }
                } while (true);
                return false;
              }
            };
          }
        };
      }
    });

    this.configureTargets(ctl, toExecute, pool, results);
    if (!(results.isSucessful())) {
      return results;
    }

    this.executeTargets(ctl, toExecute, scriptInput, pool, results);
    if (!(results.isSucessful())) {
      return results;
    }

    LOG.debug("Finished executing script");
    return results;
  }

  private void executeTargets(IScriptController ctl, final Iterable<ITarget> toExecute, final Iterable<? extends IResource> scriptInput, final Script.ParametersPool pool, final CompositeResult results) {
    ctl.runJobWithMonitor(new _FunctionTypes._void_P1_E0<IJobMonitor>() {
      public void invoke(final IJobMonitor monit) {
        String scriptName = "Script";
        int work = Sequence.fromIterable(toExecute).foldLeft(0, new ILeftCombinator<ITarget, Integer>() {
          public Integer combine(Integer s, ITarget it) {
            return s + ((it.requiresInput() || it.producesOutput() ?
              1000 :
              10
            ));
          }
        });
        monit.currentProgress().beginWork(scriptName, work, monit.currentProgress().workLeft());

        for (final ITarget trg : Sequence.fromIterable(toExecute)) {
          LOG.debug("Executing " + trg.getName());
          try {
            Iterable<ITarget> impre = targetRange.immediatePrecursors(trg.getName());
            Iterable<IResource> preInput = Sequence.fromIterable(impre).<IResult>select(new ISelector<ITarget, IResult>() {
              public IResult select(ITarget t) {
                return results.getResult(t.getName());
              }
            }).<IResource>translate(new ITranslator2<IResult, IResource>() {
              public Iterable<IResource> translate(IResult r) {
                return r.output();
              }
            });
            Iterable<IResource> rawInput = (Iterable<IResource>) Sequence.fromIterable(((Sequence.fromIterable(impre).isEmpty() ?
              scriptInput :
              preInput
            ))).distinct().toListSequence();
            LOG.debug("Raw input: " + rawInput);
            Iterable<IResource> input = (Iterable<IResource>) Sequence.fromIterable(rawInput).where(new IWhereFilter<IResource>() {
              public boolean accept(final IResource res) {
                return Sequence.fromIterable(trg.expectedInput()).any(new IWhereFilter<Class<? extends IResource>>() {
                  public boolean accept(Class<? extends IResource> ifc) {
                    return ifc.isInstance(res);
                  }
                });
              }
            }).toListSequence();
            LOG.debug("Input: " + input);

            if (trg.requiresInput()) {
              if (Sequence.fromIterable(input).isEmpty()) {
                LOG.debug("No input. Stopping");
                monit.reportFeedback(new IFeedback.ERROR("Error executing target " + trg.getName() + " : no input. Stopping"));
                results.addResult(trg.getName(), new IResult.FAILURE(null));
                return;
              }
            }

            monit.currentProgress().beginWork(trg.getName().toString(), 1000, (trg.requiresInput() || trg.producesOutput() ?
              1000 :
              10
            ));

            IJob job = trg.createJob();
            IResult jr = job.execute(Sequence.fromIterable(input).where(new IWhereFilter<IResource>() {
              public boolean accept(IResource it) {
                return !(monit.stopRequested());
              }
            }), monit, pool);
            if (!(trg.producesOutput())) {
              // ignore the output 
              jr = new Script.SubsOutputResult(jr, (trg.requiresInput() ?
                Sequence.fromIterable(rawInput).subtract(Sequence.fromIterable(input)) :
                rawInput
              ));
            }
            results.addResult(trg.getName(), jr);

            if (!(jr.isSucessful()) || monit.stopRequested()) {
              monit.reportFeedback((jr.isSucessful() ?
                new IFeedback.INFORMATION("Cancelled by user") :
                new IFeedback.ERROR("Error executing target " + trg.getName())
              ));
              LOG.debug((jr.isSucessful() ?
                "Stop requested" :
                "Execution failed"
              ));
              return;
            }

            monit.currentProgress().finishWork(trg.getName().toString());
          } catch (RuntimeException rex) {
            LOG.error("Exception executing target " + trg.getName(), rex);
            monit.reportFeedback(new IFeedback.ERROR("Exception executing target " + trg.getName()));
            results.addResult(trg.getName(), new IResult.FAILURE(null));
            return;
          }
        }
        monit.currentProgress().finishWork(scriptName);
      }
    });
  }

  private void configureTargets(IScriptController ctl, final Iterable<ITarget> toExecute, final Script.ParametersPool pool, final CompositeResult results) {
    ctl.runConfigWithMonitor(new _FunctionTypes._void_P1_E0<IConfigMonitor>() {
      public void invoke(IConfigMonitor cmon) {
        for (ITarget trg : Sequence.fromIterable(toExecute)) {
          try {
            LOG.debug("Configuring " + trg.getName());
            IConfig cfg = trg.createConfig();
            if (cfg != null && !(cfg.configure(cmon, pool))) {
              LOG.debug("Configuration failed for target " + trg.getName());
              cmon.reportFeedback(new IFeedback.ERROR("Configuration failed for target " + trg.getName()));
              results.addResult(trg.getName(), new IResult.FAILURE(null));
              return;
            }
          } catch (RuntimeException rex) {
            LOG.error("Exception configuring target " + trg.getName(), rex);
            cmon.reportFeedback(new IFeedback.ERROR("Exception configuring target " + trg.getName()));
            results.addResult(trg.getName(), new IResult.FAILURE(null));
            return;
          }
        }
      }
    });
  }

  private class ParametersPool implements IParametersPool {
    private Map<ITarget.Name, Object> cache = MapSequence.fromMap(new HashMap<ITarget.Name, Object>());
    private Map<ITarget.Name, Object> copyFrom;

    public ParametersPool() {
    }

    public <T> T parameters(ITarget.Name target, Class<T> cls) {
      if (!(MapSequence.fromMap(cache).containsKey(target))) {
        if (targetRange.hasTarget(target)) {
          T vars = (MapSequence.fromMap(copyFrom).containsKey(target) ?
            targetRange.getTarget(target).createParameters(cls, (T) MapSequence.fromMap(copyFrom).get(target)) :
            targetRange.getTarget(target).createParameters(cls)
          );
          MapSequence.fromMap(cache).put(target, vars);
        } else {
          return null;
        }
      }
      return cls.cast(MapSequence.fromMap(cache).get(target));
    }

    public void setPredecessor(IParametersPool ppool) {
      if (ppool != null) {
        this.copyFrom = ((Script.ParametersPool) ppool).cache;
      }
    }
  }

  private static class SubsOutputResult implements IResult {
    private IResult result;
    private Iterable<? extends IResource> output;

    public SubsOutputResult(IResult result, Iterable<? extends IResource> output) {
      this.result = result;
      this.output = output;
    }

    @SuppressWarnings(value = {"unchecked"})
    public Iterable<IResource> output() {
      return (Iterable<IResource>) output;
    }

    public boolean isSucessful() {
      return result.isSucessful();
    }
  }
}

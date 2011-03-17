package jetbrains.mps.internal.make.runtime.script;

/*Generated by MPS */

import java.util.Map;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import java.util.List;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.IMapping;
import jetbrains.mps.make.script.IJob;
import jetbrains.mps.make.script.IConfig;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import jetbrains.mps.internal.make.runtime.util.GraphAnalyzer;

public class TargetRange {
  private Map<ITarget.Name, ITarget> targetsView = MapSequence.fromMap(new HashMap<ITarget.Name, ITarget>());
  private Set<ITarget> allTargets = SetSequence.fromSet(new HashSet<ITarget>());
  private Map<ITarget.Name, TargetRange.TargetRefs> allRefs = MapSequence.fromMap(new HashMap<ITarget.Name, TargetRange.TargetRefs>());

  public TargetRange() {
  }

  public void addTarget(ITarget trg) {
    if (!(SetSequence.fromSet(allTargets).contains(trg))) {
      trg = this.primAddTarget(trg);
      SetSequence.fromSet(allTargets).addElement(trg);
      this.updateRefs(trg);
    }
  }

  public void addRelated(Iterable<ITarget> availableTargets) {
    Set<ITarget.Name> valences = SetSequence.fromSetWithValues(new HashSet<ITarget.Name>(), Sequence.fromIterable(MapSequence.fromMap(targetsView).values()).<ITarget.Name>translate(new ITranslator2<ITarget, ITarget.Name>() {
      public Iterable<ITarget.Name> translate(ITarget trg) {
        return Sequence.fromIterable(trg.before()).concat(Sequence.fromIterable(trg.notBefore())).concat(Sequence.fromIterable(trg.after())).concat(Sequence.fromIterable(trg.notAfter()));
      }
    }));
    List<ITarget> available = Sequence.fromIterable(availableTargets).toListSequence();
    int atsize;
    do {
      atsize = SetSequence.fromSet(allTargets).count();
      for (Iterator<ITarget> it = ListSequence.fromList(available).iterator(); it.hasNext();) {
        ITarget trg = it.next();
        Iterable<ITarget.Name> trgval = Sequence.fromIterable(trg.before()).concat(Sequence.fromIterable(trg.notBefore())).concat(Sequence.fromIterable(trg.after())).concat(Sequence.fromIterable(trg.notAfter()));
        if (SetSequence.fromSet(valences).contains(trg.getName()) || Sequence.fromIterable(trgval).any(new IWhereFilter<ITarget.Name>() {
          public boolean accept(ITarget.Name tn) {
            return MapSequence.fromMap(targetsView).containsKey(tn);
          }
        })) {
          addTarget(trg);
          SetSequence.fromSet(valences).addSequence(Sequence.fromIterable(trgval));
          it.remove();
        }
      }
    } while (atsize < SetSequence.fromSet(allTargets).count());
  }

  public void addRelatedPrecursors(Iterable<ITarget> availableTargets) {
    Set<ITarget.Name> valences = SetSequence.fromSetWithValues(new HashSet<ITarget.Name>(), Sequence.fromIterable(MapSequence.fromMap(targetsView).values()).<ITarget.Name>translate(new ITranslator2<ITarget, ITarget.Name>() {
      public Iterable<ITarget.Name> translate(ITarget trg) {
        return Sequence.fromIterable(trg.after()).concat(Sequence.fromIterable(trg.notAfter()));
      }
    }));
    List<ITarget> available = Sequence.fromIterable(availableTargets).toListSequence();
    int atsize;
    do {
      atsize = SetSequence.fromSet(allTargets).count();
      for (Iterator<ITarget> it = ListSequence.fromList(available).iterator(); it.hasNext();) {
        ITarget trg = it.next();
        Iterable<ITarget.Name> trgvals = Sequence.fromIterable(trg.before()).concat(Sequence.fromIterable(trg.notBefore()));
        if (SetSequence.fromSet(valences).contains(trg.getName()) || Sequence.fromIterable(trgvals).any(new IWhereFilter<ITarget.Name>() {
          public boolean accept(ITarget.Name tn) {
            return MapSequence.fromMap(targetsView).containsKey(tn);
          }
        })) {
          addTarget(trg);
          SetSequence.fromSet(valences).addSequence(Sequence.fromIterable(trg.after()).concat(Sequence.fromIterable(trg.notAfter())));
          it.remove();
        }
      }
    } while (atsize < SetSequence.fromSet(allTargets).count());
  }

  public ITarget getTarget(ITarget.Name name) {
    return MapSequence.fromMap(targetsView).get(name);
  }

  public boolean hasTarget(ITarget.Name name) {
    return MapSequence.fromMap(targetsView).containsKey(name);
  }

  public Iterable<ITarget> sortedTargets() {
    return Sequence.fromIterable(new TargetRange.TargetsGraph().topologicalSort()).<ITarget>select(new ISelector<ITarget.Name, ITarget>() {
      public ITarget select(ITarget.Name tn) {
        return MapSequence.fromMap(targetsView).get(tn);
      }
    });
  }

  public Iterable<ITarget> targetAndSortedPrecursors(ITarget.Name target) {
    if (!(MapSequence.fromMap(targetsView).containsKey(target))) {
      throw new IllegalArgumentException("unknown target");
    }
    return Sequence.fromIterable(new TargetRange.TargetsGraph().precursors(target)).<ITarget>select(new ISelector<ITarget.Name, ITarget>() {
      public ITarget select(ITarget.Name tn) {
        return MapSequence.fromMap(targetsView).get(tn);
      }
    });
  }

  public Iterable<ITarget> immediatePrecursors(ITarget.Name target) {
    if (!(MapSequence.fromMap(targetsView).containsKey(target))) {
      throw new IllegalArgumentException("unknown target");
    }
    return ListSequence.fromList(MapSequence.fromMap(allRefs).get(target).after).where(new IWhereFilter<ITarget.Name>() {
      public boolean accept(ITarget.Name tn) {
        return MapSequence.fromMap(allRefs).containsKey(tn);
      }
    }).<ITarget>select(new ISelector<ITarget.Name, ITarget>() {
      public ITarget select(ITarget.Name tn) {
        return MapSequence.fromMap(targetsView).get(tn);
      }
    });
  }

  public boolean hasCycles() {
    return ListSequence.fromList(new TargetRange.TargetsGraph().findCycles()).isNotEmpty();
  }

  public List<List<ITarget.Name>> cycles() {
    return new TargetRange.TargetsGraph().findCycles();
  }

  private ITarget primAddTarget(ITarget trg) {
    ITarget prev = MapSequence.fromMap(targetsView).get(trg.getName());
    if (prev != null) {
      trg = new TargetRange.CompositeTarget(trg, prev);
    }
    MapSequence.fromMap(targetsView).put(trg.getName(), trg);
    return trg;
  }

  private void updateRefs(ITarget trg) {
    TargetRange.TargetRefs refs = MapSequence.fromMap(allRefs).get(trg.getName());
    if (refs == null) {
      refs = new TargetRange.TargetRefs();
      MapSequence.fromMap(allRefs).put(trg.getName(), refs);
    }
    ListSequence.fromList(refs.before).addSequence(Sequence.fromIterable(trg.before()).concat(Sequence.fromIterable(trg.notAfter())));
    ListSequence.fromList(refs.after).addSequence(Sequence.fromIterable(trg.after()).concat(Sequence.fromIterable(trg.notBefore())));
    for (ITarget.Name bf : ListSequence.fromList(refs.before)) {
      if (MapSequence.fromMap(allRefs).containsKey(bf)) {
        ListSequence.fromList(MapSequence.fromMap(allRefs).get(bf).after).addElement(trg.getName());
      }
    }
    for (ITarget.Name bf : ListSequence.fromList(refs.after)) {
      if (MapSequence.fromMap(allRefs).containsKey(bf)) {
        ListSequence.fromList(MapSequence.fromMap(allRefs).get(bf).before).addElement(trg.getName());
      }
    }
    for (IMapping<ITarget.Name, TargetRange.TargetRefs> m : MapSequence.fromMap(allRefs)) {
      if (ListSequence.fromList(m.value().before).contains(trg.getName()) && !(ListSequence.fromList(refs.after).contains(m.key()))) {
        ListSequence.fromList(refs.after).addElement(m.key());
      }
      if (ListSequence.fromList(m.value().after).contains(trg.getName()) && !(ListSequence.fromList(refs.before).contains(m.key()))) {
        ListSequence.fromList(refs.before).addElement(m.key());
      }
    }
  }

  public static class CompositeTarget implements ITarget {
    private ITarget first;
    private ITarget second;

    public CompositeTarget(ITarget first, ITarget second) {
      assert first.getName().equals(second.getName());
      this.first = first;
      this.second = second;
    }

    public Iterable<ITarget.Name> notAfter() {
      return Sequence.fromIterable(first.notAfter()).concat(Sequence.fromIterable(second.notAfter()));
    }

    public Iterable<ITarget.Name> after() {
      return Sequence.fromIterable(first.after()).concat(Sequence.fromIterable(second.after()));
    }

    public Iterable<ITarget.Name> notBefore() {
      return Sequence.fromIterable(first.notBefore()).concat(Sequence.fromIterable(second.notBefore()));
    }

    public Iterable<ITarget.Name> before() {
      return Sequence.fromIterable(first.before()).concat(Sequence.fromIterable(second.before()));
    }

    public ITarget.Name getName() {
      return first.getName();
    }

    public <T> T createParameters(Class<T> cls) {
      return null;
    }

    public IJob createJob() {
      return null;
    }

    public IConfig createConfig() {
      return null;
    }

    public boolean requiresInput() {
      return false;
    }

    public boolean producesOutput() {
      return false;
    }

    public Iterable<Class<? extends IResource>> expectedInput() {
      return null;
    }

    public Iterable<Class<? extends IResource>> expectedOutput() {
      return null;
    }
  }

  private static class TargetRefs {
    private List<ITarget.Name> before = ListSequence.fromList(new LinkedList<ITarget.Name>());
    private List<ITarget.Name> after = ListSequence.fromList(new LinkedList<ITarget.Name>());

    public TargetRefs() {
    }
  }

  private class TargetsGraph extends GraphAnalyzer<ITarget.Name> {
    public TargetsGraph() {
    }

    @Override
    public Iterable<ITarget.Name> backwardEdges(ITarget.Name v) {
      return ListSequence.fromList(MapSequence.fromMap(allRefs).get(v).after).where(new IWhereFilter<ITarget.Name>() {
        public boolean accept(ITarget.Name tn) {
          return MapSequence.fromMap(allRefs).containsKey(tn);
        }
      });
    }

    @Override
    public Iterable<ITarget.Name> forwardEdges(ITarget.Name v) {
      return ListSequence.fromList(MapSequence.fromMap(allRefs).get(v).before).where(new IWhereFilter<ITarget.Name>() {
        public boolean accept(ITarget.Name tn) {
          return MapSequence.fromMap(allRefs).containsKey(tn);
        }
      });
    }

    @Override
    public Iterable<ITarget.Name> vertices() {
      return MapSequence.fromMap(allRefs).keySet();
    }
  }
}

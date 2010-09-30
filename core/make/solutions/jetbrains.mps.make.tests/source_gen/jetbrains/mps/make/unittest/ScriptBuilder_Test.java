package jetbrains.mps.make.unittest;

/*Generated by MPS */

import junit.framework.TestCase;
import org.jmock.Mockery;
import jetbrains.mps.make.runtime.IFacet;
import jetbrains.mps.make.runtime.internal.ScriptBuilder;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.make.runtime.ITarget;
import jetbrains.mps.make.runtime.internal.Script;
import junit.framework.Assert;
import jetbrains.mps.make.runtime.internal.FacetRegistry;
import org.jmock.Expectations;
import java.util.Map;

public class ScriptBuilder_Test extends TestCase {
  private Mockery context;
  private IFacet[] facets;

  public void test_buildScript() throws Exception {
    ScriptBuilder scb = new ScriptBuilder();
    scb.withFacets(Sequence.fromIterable(Sequence.fromArray(facets)).select(new ISelector<IFacet, IFacet.Name>() {
      public IFacet.Name select(IFacet f) {
        return f.getName();
      }
    }));
    scb.withTarget(new ITarget.Name("make"));
    Script sc = scb.toScript();
    Assert.assertNotNull(sc);
  }

  @Override
  protected void tearDown() throws Exception {
    for (IFacet fn : Sequence.fromIterable(Sequence.fromArray(facets))) {
      FacetRegistry.getInstance().unregister(fn);
    }
    context.assertIsSatisfied();
    super.tearDown();
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    this.context = new Mockery();
    final IFacet fmake = Mocks.facet(context, "Make");
    final IFacet fgen = Mocks.facet(context, "Gen");
    final ITarget tgen = Mocks.target(context, "gen");
    final IFacet ftextgen = Mocks.facet(context, "Textgen");
    final ITarget ttextgen = Mocks.target(context, "textgen");
    context.checking(new Expectations() {
      {
        atLeast(1).of(fgen).required();
        will(returnValue(Sequence.fromArray(new IFacet.Name[]{fmake.getName()})));
        atLeast(1).of(fgen).targets(with(aNonNull(Map.class)));
        will(returnValue(Sequence.fromArray(new ITarget[]{tgen})));
        atLeast(1).of(ftextgen).required();
        will(returnValue(Sequence.fromArray(new IFacet.Name[]{fmake.getName(), fgen.getName()})));
        atLeast(1).of(ftextgen).targets(with(aNonNull(Map.class)));
        will(returnValue(Sequence.fromArray(new ITarget[]{ttextgen})));
      }
    });
    FacetRegistry.getInstance().register(fmake);
    FacetRegistry.getInstance().register(fgen);
    FacetRegistry.getInstance().register(ftextgen);
    Mocks.allowing(context, fmake);
    Mocks.allowing(context, fgen);
    Mocks.allowing(context, ftextgen);
    this.facets = new IFacet[]{fmake, fgen, ftextgen};
  }
}

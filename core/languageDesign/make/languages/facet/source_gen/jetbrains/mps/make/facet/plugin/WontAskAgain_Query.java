package jetbrains.mps.make.facet.plugin;

/*Generated by MPS */

import jetbrains.mps.make.script.IQuery;
import jetbrains.mps.internal.collections.runtime.Sequence;

public class WontAskAgain_Query implements IQuery<rrr_Option> {
  private IQuery.Name name = new IQuery.Name("WontAskAgain");
  private int defaultOption = 0;

  public WontAskAgain_Query() {
  }

  public IQuery.Name getName() {
    return name;
  }

  public String getText() {
    return "Oh, terribly sorry! Won't bother you again!";
  }

  public Iterable<rrr_Option> options() {
    return Sequence.fromIterable(Sequence.fromArray(rrr_Option.class.getEnumConstants())).cut(1);
  }

  public rrr_Option voidOption() {
    return Sequence.fromIterable(Sequence.fromArray(rrr_Option.class.getEnumConstants())).last();
  }

  public rrr_Option defaultOption() {
    return (defaultOption >= 0 ?
      rrr_Option.class.getEnumConstants()[defaultOption] :
      null
    );
  }
}

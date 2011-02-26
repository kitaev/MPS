package jetbrains.mps.baseLanguage.datesInternal.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SchedulePeriod extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.datesInternal.structure.SchedulePeriod";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String SECOND = "second";
  public static final String MINUTE = "minute";
  public static final String HOUR = "hour";
  public static final String DAY_OF_WEEK = "dayOfWeek";
  public static final String DAY_OF_MONTH = "dayOfMonth";
  public static final String MONTH = "month";
  public static final String _$ATTRIBUTE = "_$attribute";

  public SchedulePeriod(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(SchedulePeriod.NAME);
  }

  public void setName(String value) {
    this.setProperty(SchedulePeriod.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(SchedulePeriod.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(SchedulePeriod.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(SchedulePeriod.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(SchedulePeriod.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(SchedulePeriod.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(SchedulePeriod.VIRTUAL_PACKAGE, value);
  }

  public boolean getSecond() {
    return this.getBooleanProperty(SchedulePeriod.SECOND);
  }

  public void setSecond(boolean value) {
    this.setBooleanProperty(SchedulePeriod.SECOND, value);
  }

  public boolean getMinute() {
    return this.getBooleanProperty(SchedulePeriod.MINUTE);
  }

  public void setMinute(boolean value) {
    this.setBooleanProperty(SchedulePeriod.MINUTE, value);
  }

  public boolean getHour() {
    return this.getBooleanProperty(SchedulePeriod.HOUR);
  }

  public void setHour(boolean value) {
    this.setBooleanProperty(SchedulePeriod.HOUR, value);
  }

  public boolean getDayOfWeek() {
    return this.getBooleanProperty(SchedulePeriod.DAY_OF_WEEK);
  }

  public void setDayOfWeek(boolean value) {
    this.setBooleanProperty(SchedulePeriod.DAY_OF_WEEK, value);
  }

  public boolean getDayOfMonth() {
    return this.getBooleanProperty(SchedulePeriod.DAY_OF_MONTH);
  }

  public void setDayOfMonth(boolean value) {
    this.setBooleanProperty(SchedulePeriod.DAY_OF_MONTH, value);
  }

  public boolean getMonth() {
    return this.getBooleanProperty(SchedulePeriod.MONTH);
  }

  public void setMonth(boolean value) {
    this.setBooleanProperty(SchedulePeriod.MONTH, value);
  }

  public int get_$attributesCount() {
    return this.getChildCount(SchedulePeriod._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, SchedulePeriod._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, SchedulePeriod._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(SchedulePeriod._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, SchedulePeriod._$ATTRIBUTE, node);
  }

  public static SchedulePeriod newInstance(SModel sm, boolean init) {
    return (SchedulePeriod) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.datesInternal.structure.SchedulePeriod", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SchedulePeriod newInstance(SModel sm) {
    return SchedulePeriod.newInstance(sm, false);
  }
}

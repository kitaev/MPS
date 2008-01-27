package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import java.util.List;

public class AnonymousClass extends ClassConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.AnonymousClass";
  public static String PARAMETER = "parameter";
  public static String TYPE_PARAMETER = "typeParameter";
  public static String CLASSIFIER = "classifier";

  public  AnonymousClass(SNode node) {
    super(node);
  }

  public static AnonymousClass newInstance(SModel sm, boolean init) {
    return (AnonymousClass)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AnonymousClass", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AnonymousClass newInstance(SModel sm) {
    return AnonymousClass.newInstance(sm, false);
  }


  public int getParametersCount() {
    return this.getChildCount(AnonymousClass.PARAMETER);
  }

  public Iterator<Expression> parameters() {
    return this.children(AnonymousClass.PARAMETER);
  }

  public List<Expression> getParameters() {
    return this.getChildren(AnonymousClass.PARAMETER);
  }

  public void addParameter(Expression node) {
    this.addChild(AnonymousClass.PARAMETER, node);
  }

  public void insertParameter(Expression prev, Expression node) {
    this.insertChild(prev, AnonymousClass.PARAMETER, node);
  }

  public int getTypeParametersCount() {
    return this.getChildCount(AnonymousClass.TYPE_PARAMETER);
  }

  public Iterator<Type> typeParameters() {
    return this.children(AnonymousClass.TYPE_PARAMETER);
  }

  public List<Type> getTypeParameters() {
    return this.getChildren(AnonymousClass.TYPE_PARAMETER);
  }

  public void addTypeParameter(Type node) {
    this.addChild(AnonymousClass.TYPE_PARAMETER, node);
  }

  public void insertTypeParameter(Type prev, Type node) {
    this.insertChild(prev, AnonymousClass.TYPE_PARAMETER, node);
  }

  public Classifier getClassifier() {
    return (Classifier)this.getReferent(AnonymousClass.CLASSIFIER);
  }

  public void setClassifier(Classifier node) {
    super.setReferent(AnonymousClass.CLASSIFIER, node);
  }

}

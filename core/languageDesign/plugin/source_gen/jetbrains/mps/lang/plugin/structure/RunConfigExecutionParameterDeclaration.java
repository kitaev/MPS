package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RunConfigExecutionParameterDeclaration extends ActionDataParameterDeclaration {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.RunConfigExecutionParameterDeclaration";

  public RunConfigExecutionParameterDeclaration(SNode node) {
    super(node);
  }

  public static RunConfigExecutionParameterDeclaration newInstance(SModel sm, boolean init) {
    return (RunConfigExecutionParameterDeclaration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.RunConfigExecutionParameterDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RunConfigExecutionParameterDeclaration newInstance(SModel sm) {
    return RunConfigExecutionParameterDeclaration.newInstance(sm, false);
  }
}

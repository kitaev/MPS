package jetbrains.mps.lang.typesystem.runtime.performance;

import com.intellij.openapi.util.Computable;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import jetbrains.mps.lang.typesystem.runtime.RuntimeSupport;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 22.04.2010
 * Time: 20:25:34
 * To change this template use File | Settings | File Templates.
 */
public class RuntimeSupport_Tracer extends RuntimeSupport {
  public RuntimeSupport_Tracer(TypeChecker typeChecker) {
    super(typeChecker);
  }

  @Override
  public SNode coerce_(final SNode subtype, final IMatchingPattern pattern, final boolean isWeak) {
    return  myTypeChecker.computeWithTrace(new Computable<SNode>() {
      @Override
      public SNode compute() {
        return RuntimeSupport_Tracer.super.coerce_(subtype, pattern, isWeak);
      }
    }, "coerce");
  }

  @Override
  public SNode coerce_(final SNode subtype, final IMatchingPattern pattern) {
    return  myTypeChecker.computeWithTrace(new Computable<SNode>() {
      @Override
      public SNode compute() {
        return RuntimeSupport_Tracer.super.coerce_(subtype, pattern);
      }
    }, "coerce");
  }

  @Override
  public SNode coerce_(final SNode subtype, final IMatchingPattern pattern, final boolean isWeak, final TypeCheckingContext typeCheckingContext) {
    return  myTypeChecker.computeWithTrace(new Computable<SNode>() {
      @Override
      public SNode compute() {
        return RuntimeSupport_Tracer.super.coerce_(subtype, pattern, isWeak, typeCheckingContext);
      }
    }, "coerce");
  }

  @Override
  public SNode coerce_(final SNode subtype, final IMatchingPattern pattern, final TypeCheckingContext typeCheckingContext) {
    return  myTypeChecker.computeWithTrace(new Computable<SNode>() {
      @Override
      public SNode compute() {
        return RuntimeSupport_Tracer.super.coerce_(subtype, pattern, typeCheckingContext);
      }
    }, "coerce");
  }
}

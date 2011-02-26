package jetbrains.mps.lang.textGen.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodePropertyValidator;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.nio.charset.Charset;

public class EncodingLiteral_encoding_PropertyConstraint implements IModelConstraints, INodePropertyValidator {
  public EncodingLiteral_encoding_PropertyConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodePropertyValidator("jetbrains.mps.lang.textGen.structure.EncodingLiteral", "encoding", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodePropertyValidator("jetbrains.mps.lang.textGen.structure.EncodingLiteral", "encoding");
  }

  public boolean checkPropertyValue(final SNode node, final String propertyName, final String propertyValue, final IScope scope) {
    if (StringUtils.isEmpty(StringUtils.trim((SPropertyOperations.getString(propertyValue))))) {
      return false;
    }
    if ((SPropertyOperations.getString(propertyValue)).equals("binary")) {
      return true;
    }
    try {
      Charset.forName((SPropertyOperations.getString(propertyValue)));
      return true;
    } catch (IllegalArgumentException uc) {
      return false;
    }
  }
}

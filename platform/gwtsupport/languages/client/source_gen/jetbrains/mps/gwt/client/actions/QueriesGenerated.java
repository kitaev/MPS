package jetbrains.mps.gwt.client.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.NodeSetupContext;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;

public class QueriesGenerated {
  public static void nodeFactory_NodeSetup_GWTModule_1572321421813616683(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (_context.getSampleNode() == null) {
      SNodeFactoryOperations.addNewChild(_context.getNewNode(), "element", "jetbrains.mps.gwt.client.structure.Source");
    }
  }
}

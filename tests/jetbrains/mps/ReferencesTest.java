package jetbrains.mps;

import jetbrains.mps.ide.IdeMain;
import jetbrains.mps.smodel.*;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.project.IModule;
import jetbrains.mps.logging.*;
import jetbrains.mps.transformation.TLBase.structure.ReferenceMacro;
import jetbrains.mps.transformation.TLBase.structure.ReferenceMacro_AnnotationLink;
import jetbrains.mps.core.structure.BaseConcept;

import java.io.File;
import java.util.List;
import java.util.ArrayList;

public class ReferencesTest extends BaseMPSTest {
  private static Logger LOG = Logger.getLogger(ReferencesTest.class);

  public void testBrokenReferences() {
    IdeMain.setTestMode(true);
    TestMain.configureMPS();

    final List<String> errors = new ArrayList<String>();
    final List<String> fatals = new ArrayList<String>();

    ILoggingHandler handler = new ILoggingHandler() {
      public void info(LogEntry e) {
      }

      public void warning(LogEntry e) {
      }

      public void debug(LogEntry e) {
      }

      public void error(LogEntry e) {
        System.out.println("error: " + e.getMessage());
        errors.add(e.getMessage());
      }

      public void fatal(LogEntry e) {
        System.out.println("fatal: " + e.getMessage());
        fatals.add(e.getMessage());
      }
    };

    Logger.addLoggingHandler(handler);

    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        for (SModelDescriptor sm : SModelRepository.getInstance().getModelDescriptors()) {
          if (!SModelStereotype.isUserModel(sm)) continue;
          checkModel(sm);
        }

        for (IModule m : MPSModuleRepository.getInstance().getAllModules()) {
          checkModule(m);
        }
      }
    });

    Logger.removeLoggingHandler(handler);

    assertTrue(errors.isEmpty());
    assertTrue(fatals.isEmpty());
  }

  private void checkModel(SModelDescriptor sm) {
    IScope scope = sm.getModule().getScope();
    List<String> validationResult = sm.validate(scope);
    for (String item : validationResult) {
      LOG.error("Error in model " + sm.getSModelFqName() + " : " + item);
    }

    for (SNode node : sm.getSModel().allNodes()) {
      if (SModelUtil_new.findConceptDeclaration(node.getConceptFqName(), GlobalScope.getInstance()) == null) {
        LOG.error("Error in model " + sm.getSModelFqName() + " : Unknown concept " + node.getConceptFqName());
      }
    }

    for (SNode node : sm.getSModel().allNodes()) {

      for (SReference ref : node.getReferences()) {
        if (ReferenceMacro_AnnotationLink.getReferenceMacro((BaseConcept) node.getAdapter(), ref.getRole()) != null) {
          continue;
        }                      

        if (ref.getTargetNode() == null) {
          LOG.error("Error in model " + sm.getSModelFqName() + " : Broken reference in node " + node);
        }
      }
    }
  }

  private void checkModule(IModule m) {
    List<String> messages = m.validate();
    for (String msg : messages) {
      LOG.error("Error in module " + m + " : " + msg);
    }
  }
}

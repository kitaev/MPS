package jetbrains.mps.workbench.dialogs.project.components.parts.editors;

/*Generated by MPS */

import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import jetbrains.mps.workbench.dialogs.project.IBindedDialog;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.project.structure.model.ModelRootManager;
import javax.swing.DefaultListCellRenderer;
import java.awt.Component;
import javax.swing.JList;
import jetbrains.mps.util.NameUtil;
import java.util.List;
import jetbrains.mps.smodel.IOperationContext;
import java.util.ArrayList;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.lang.stubs.behavior.AbstractModelCreator_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.lang.structure.structure.ConceptDeclaration;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.LanguageAspect;
import jetbrains.mps.smodel.search.IsInstanceCondition;

public class ManagerTableCellEditor extends DefaultCellEditor {
  private JComboBox myCombo;

  public ManagerTableCellEditor(final IBindedDialog owner) {
    super(new JComboBox(ListSequence.fromList(getManagers(owner.getOperationContext())).toGenericArray(ModelRootManager.class)));
    myCombo = ((JComboBox) super.getComponent());

    myCombo.setRenderer(new DefaultListCellRenderer() {
      public Component getListCellRendererComponent(JList list, Object value, int index, boolean selected, boolean focus) {
        ModelRootManager manager = ((ModelRootManager) value);
        String managerName = NameUtil.shortNameFromLongName(manager.getClassName());
        return super.getListCellRendererComponent(list, managerName, index, selected, focus);
      }
    });
  }

  public static List<ModelRootManager> getManagers(final IOperationContext context) {
    final List<ModelRootManager> result = ListSequence.fromList(new ArrayList<ModelRootManager>());
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        for (SNode node : ListSequence.fromList(getManagerNodes(context))) {
          Language language = Language.getLanguageFor(node.getModel().getModelDescriptor());
          ModelRootManager manager = new ModelRootManager(language.getModuleId().toString(), AbstractModelCreator_Behavior.call_getGeneratedClassFQName_5553449326502826666(SNodeOperations.cast(node, "jetbrains.mps.lang.stubs.structure.AbstractModelCreator")));
          ListSequence.fromList(result).addElement(manager);
        }
      }
    });
    return result;
  }

  public static List<SNode> getManagerNodes(final IOperationContext context) {
    final List<SNode> result = new ArrayList<SNode>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        AbstractConceptDeclaration concept = ((ConceptDeclaration) SNodeOperations.getAdapter(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.stubs.structure.StubsCreatorDeclaration")));
        for (Language l : MPSModuleRepository.getInstance().getAllLanguages()) {
          SModelDescriptor stubsAspect = LanguageAspect.STUBS.get(l);
          if (stubsAspect == null) {
            continue;
          }
          result.addAll(stubsAspect.getSModel().getRoots(new IsInstanceCondition(concept)));
        }
      }
    });
    return result;
  }
}

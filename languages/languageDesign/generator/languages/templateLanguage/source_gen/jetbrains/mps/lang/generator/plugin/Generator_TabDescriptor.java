package jetbrains.mps.lang.generator.plugin;

/*Generated by MPS */

import jetbrains.mps.ide.editorTabs.EditorTabDescriptor;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.plugin.ConceptEditorOpenHelper;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.annotations.Nullable;
import java.util.List;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.lang.structure.plugin.ConceptEditorHelper;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import com.intellij.openapi.project.Project;
import jetbrains.mps.workbench.MPSDataKeys;
import com.intellij.ide.DataManager;
import javax.swing.JFrame;
import com.intellij.openapi.wm.WindowManager;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.ide.dialogs.project.creation.NewGeneratorDialog;
import java.util.ArrayList;
import jetbrains.mps.generator.GenerationFacade;
import javax.swing.JOptionPane;
import jetbrains.mps.ide.actions.MappingDialog;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.generator.behavior.MappingConfiguration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class Generator_TabDescriptor extends EditorTabDescriptor {
  private static final Icon ICON = new ImageIcon(Generator_TabDescriptor.class.getResource("reduction.png"));

  public Generator_TabDescriptor() {
  }

  public String getTitle() {
    return "Generator";
  }

  public Character getShortcutChar() {
    return 'G';
  }

  public int compareTo(EditorTabDescriptor descriptor) {
    return new Generator_Order().compare(this, descriptor);
  }

  public void startListening() {
  }

  public SNode getBaseNode(SNode node) {
    return ConceptEditorOpenHelper.getBaseNode(node);
  }

  public boolean isApplicable(SNode node) {
    return SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration");
  }

  @Nullable
  public Icon getIcon() {
    return ICON;
  }

  public List<SNode> getNodes(SNode node) {
    Set<SNode> nodes = SetSequence.fromSet(new HashSet<SNode>());
    SetSequence.fromSet(nodes).addSequence(ListSequence.fromList(AbstractConceptDeclaration_Behavior.call_findGeneratorFragments_6409339300305625383(node)));
    return SetSequence.fromSet(nodes).toListSequence();
  }

  public boolean isSingle() {
    return false;
  }

  public List<SNode> getConcepts(final SNode node) {
    List<SNode> result = ConceptEditorHelper.getAvailableConceptAspects(SNodeOperations.getModel(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.generator.structure.TemplateSwitch")), node);
    ListSequence.fromList(result).addElement(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.generator.structure.InlineTemplate_RuleConsequence"));
    ListSequence.fromList(result).addElement(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.generator.structure.InlineTemplateWithContext_RuleConsequence"));
    boolean rootable = SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.ConceptDeclaration") && SPropertyOperations.getBoolean((SNodeOperations.cast(node, "jetbrains.mps.lang.structure.structure.ConceptDeclaration")), "rootable");
    boolean isInterface = SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.InterfaceConceptDeclaration");
    if (rootable || isInterface) {
      boolean isNeedRootTemplate = true;
      for (SNode genFragment : AbstractConceptDeclaration_Behavior.call_findGeneratorFragments_6409339300305625383(node)) {
        if ((AttributeOperations.getAttribute(genFragment, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.generator.structure.RootTemplateAnnotation"))) != null)) {
          isNeedRootTemplate = false;
          break;
        }
      }
      if (isNeedRootTemplate) {
        for (ModuleReference moduleRef : SNodeOperations.getModel(node).importedLanguages()) {
          Language language = MPSModuleRepository.getInstance().getLanguage(moduleRef);
          if (language == null) {
            continue;
          }
          SModel structureModel = language.getStructureModelDescriptor().getSModel();
          for (SNode nodeToAdd : SModelOperations.getRoots(structureModel, "jetbrains.mps.lang.structure.structure.ConceptDeclaration")) {
            SNode conceptToAdd = (SNode) nodeToAdd;
            if (SPropertyOperations.getBoolean(nodeToAdd, "rootable")) {
              ListSequence.fromList(result).addElement(conceptToAdd);
            }
          }
        }
      }
    }
    return result;
  }

  public boolean commandOnCreate() {
    return false;
  }

  public SNode createNode(final SNode node, final SNode concept) {
    Project project = MPSDataKeys.PROJECT.getData(DataManager.getInstance().getDataContext());
    final JFrame frame = WindowManager.getInstance().getFrame(project);

    final Wrappers._T<Language> language = new Wrappers._T<Language>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        language.value = SModelUtil.getDeclaringLanguage(node);
        assert language.value != null : "Language shouldn't be null for " + node;
      }
    });

    final List<Generator> genList = language.value.getGenerators();
    if (ListSequence.fromList(genList).isEmpty()) {
      NewGeneratorDialog dialog = new NewGeneratorDialog(frame, language.value);
      dialog.showDialog();
      final Generator createdGenerator = dialog.getResult();
      if (createdGenerator == null) {
        return null;
      }
      ModelAccess.instance().runWriteActionInCommand(new Runnable() {
        public void run() {
          SModel createdModel = createdGenerator.getOwnTemplateModels().get(0).getSModel();
          SModelOperations.addRootNode(createdModel, SConceptOperations.createNewNode("jetbrains.mps.lang.generator.structure.MappingConfiguration", null));
        }
      });
    }

    final List<SNode> mappings = new ArrayList<SNode>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        for (Generator generator : genList) {
          for (SNode confAdapter : GenerationFacade.getOwnMappings(generator)) {
            ListSequence.fromList(mappings).addElement((SNode) confAdapter);
          }
        }
      }
    });

    if (ListSequence.fromList(mappings).isEmpty()) {
      // generator is present - this means we don't have template models or mappings 
      ModelAccess.instance().runWriteActionInCommand(new Runnable() {
        public void run() {
          SModel model = null;
          for (Generator generator : genList) {
            if (generator.getOwnTemplateModels().isEmpty()) {
              continue;
            }
            model = generator.getOwnTemplateModels().get(0).getSModel();
          }

          if (model == null) {
            JOptionPane.showMessageDialog(frame, "create template model first");
          }

          SNode node = SConceptOperations.createNewNode("jetbrains.mps.lang.generator.structure.MappingConfiguration", null);
          SModelOperations.addRootNode(model, node);
          ListSequence.fromList(mappings).addElement(node);
        }
      });
    }

    final Wrappers._T<SNode> mapping = new Wrappers._T<SNode>();
    if (ListSequence.fromList(mappings).count() > 1) {
      MappingDialog configurationDialog = new MappingDialog(project, language.value);
      configurationDialog.showDialog();
      mapping.value = configurationDialog.getResult();
    } else {
      mapping.value = ListSequence.fromList(mappings).first();
    }
    final Wrappers._T<SNode> result = new Wrappers._T<SNode>();
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        SModel model = SNodeOperations.getModel(mapping.value);
        result.value = SConceptOperations.createNewNode(NameUtil.nodeFQName(concept), null);
        if (SNodeOperations.isInstanceOf(result.value, "jetbrains.mps.lang.structure.structure.IConceptAspect")) {
          result.value = ConceptEditorHelper.createNewConceptAspectInstance(node, concept, model);
          MappingConfiguration_Behavior.call_addMember_3166264919334415805(mapping.value, result.value);
        } else if (SNodeOperations.isInstanceOf(result.value, "jetbrains.mps.lang.generator.structure.InlineTemplate_RuleConsequence") || SNodeOperations.isInstanceOf(result.value, "jetbrains.mps.lang.generator.structure.InlineTemplateWithContext_RuleConsequence")) {
          SNode mappingRule = SLinkOperations.addNewChild(mapping.value, "reductionMappingRule", "jetbrains.mps.lang.generator.structure.Reduction_MappingRule");
          SLinkOperations.setTarget(mappingRule, "applicableConcept", node, false);
          SLinkOperations.setTarget(mappingRule, "ruleConsequence", SNodeOperations.cast(result.value, "jetbrains.mps.lang.generator.structure.RuleConsequence"), true);
        } else {
          SNode rootTemplateNode = SModelOperations.createNewNode(model, "jetbrains.mps.lang.generator.structure.RootTemplateAnnotation", null);
          SLinkOperations.setTarget(rootTemplateNode, "applicableConcept", node, false);
          AttributeOperations.setAttribute(result.value, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.generator.structure.RootTemplateAnnotation")), rootTemplateNode);
          SPropertyOperations.set(SNodeOperations.cast(result.value, "jetbrains.mps.lang.core.structure.INamedConcept"), "name", SPropertyOperations.getString(node, "name"));
          SModelOperations.addRootNode(model, result.value);
          MappingConfiguration_Behavior.call_addMember_3166264919334415805(mapping.value, result.value);
        }
      }
    });
    return result.value;
  }
}

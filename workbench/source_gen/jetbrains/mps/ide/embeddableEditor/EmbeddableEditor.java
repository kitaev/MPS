package jetbrains.mps.ide.embeddableEditor;

/*Generated by MPS */

import javax.swing.JPanel;
import jetbrains.mps.nodeEditor.inspector.InspectorEditorComponent;
import jetbrains.mps.nodeEditor.UIEditorComponent;
import jetbrains.mps.smodel.IOperationContext;
import javax.swing.JSplitPane;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.ModelOwner;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.ProjectModels;
import jetbrains.mps.nodeEditor.inspector.InspectorEditorComponentFactory;
import javax.swing.JScrollPane;
import jetbrains.mps.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.generator.GeneratorManager;
import java.util.Arrays;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.reloading.ClassLoaderManager;
import jetbrains.mps.smodel.Language;

public class EmbeddableEditor extends JPanel {

  private InspectorEditorComponent myInspector;
  private UIEditorComponent myEditorComponent;
  private IOperationContext myContext;
  private JSplitPane mySplitter;
  private SModel myProjectModel;
  private ModelOwner myOwner;
  private SNode myNode;

  public EmbeddableEditor(IOperationContext context, ModelOwner owner) {
    super();
    this.myContext = context;
    this.myOwner = owner;
    SModelDescriptor modelDescriptor = ProjectModels.createDescriptorFor(this.myOwner);
    this.myProjectModel = modelDescriptor.getSModel();
    this.myInspector = InspectorEditorComponentFactory.getInspectorEditorComponent();
    this.myEditorComponent = new UIEditorComponent(this.myContext, this.myInspector);
    this.mySplitter = new JSplitPane(JSplitPane.VERTICAL_SPLIT, new JScrollPane(this.myEditorComponent), new JScrollPane(this.myInspector));
    this.mySplitter.setDividerLocation(150);
    this.add(this.mySplitter);
  }

  public void setNode(SNode node) {
    this.myNode = node;
    this.init();
  }

  public GenerateResult generate(final String langName, SNode node, final EditorGenerationType type) {
    if (this.myNode == null) {
      return null;
    }
    final Wrappers._T<ClassLoader> loader = new Wrappers._T<ClassLoader>();
    final Wrappers._T<SModelDescriptor> model = new Wrappers._T<SModelDescriptor>();
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {

      public void run() {
        model.value = ProjectModels.createDescriptorFor(EmbeddableEditor.this.myOwner);
        model.value.getSModel().addRoot(SNodeOperations.copyNode(EmbeddableEditor.this.myNode));
      }

    });
    GeneratorManager manager = this.myContext.getComponent(GeneratorManager.class);
    manager.generateModelsWithProgressWindow(Arrays.asList(model.value), this.myContext, type, false);
    ModelAccess.instance().runReadAction(new Runnable() {

      public void run() {
        IModule lang = GlobalScope.getInstance().getLanguage(langName);
        ClassLoader parentClassLoader = ClassLoaderManager.getInstance().getClassLoaderFor(lang);
        loader.value = type.getClassLoader(parentClassLoader);
      }

    });
    return new GenerateResult(loader.value, node, this.myContext);
  }

  public void addLanguage(final Language language) {
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {

      public void run() {
        EmbeddableEditor.this.myProjectModel.addImportedModel(language.getStructureModelDescriptor().getModelUID());
      }

    });
  }

  private void init() {
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {

      public void run() {
        EmbeddableEditor.this.myProjectModel.addRoot(EmbeddableEditor.this.myNode);
        EmbeddableEditor.this.myEditorComponent.editNode(EmbeddableEditor.this.myNode, EmbeddableEditor.this.myContext);
      }

    });
  }

}

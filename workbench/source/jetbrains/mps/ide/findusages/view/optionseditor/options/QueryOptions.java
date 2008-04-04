package jetbrains.mps.ide.findusages.view.optionseditor.options;

import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.ide.findusages.model.searchquery.SearchQuery;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.*;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class QueryOptions extends BaseOptions<SearchQuery> {
  private static final Logger LOG = Logger.getLogger(QueryOptions.class);

  public static final String SCOPE_TYPE = "scope_type";

  public static final String GLOBAL_SCOPE = "global_scope";
  public static final String PROJECT_SCOPE = "project_scope";
  public static final String MODULE_SCOPE = "module_scope";
  public static final String MODEL_SCOPE = "model_scope";

  private static final String MODEL = "model";
  private static final String MODULE = "module";

  @NotNull
  private String myScopeType;
  private String myModel;
  private String myModule;
  public static final String DEFAULT_VALUE = "<default>";

  public QueryOptions() {

  }

  public QueryOptions(Element element, MPSProject project) {
    read(element, project);
  }

  public QueryOptions(String scopeType, String model, String module) {
    myScopeType = scopeType;
    myModel = model;
    myModule = module;
  }

  public QueryOptions clone() {
    return new QueryOptions(myScopeType, myModel, myModule);
  }

  public void setScopeType(@NotNull String scopeType) {
    myScopeType = scopeType;
  }

  @NotNull
  public String getScopeType() {
    return myScopeType;
  }

  public String getModel() {
    return myModel;
  }

  public void setModel(String model) {
    myModel = model;
  }

  public String getModule() {
    return myModule;
  }

  public void setModule(String module) {
    myModule = module;
  }

  @NotNull
  public SearchQuery getResult(SNode node, ActionContext context) {
    IScope scope;
    IOperationContext operationContext = context.getOperationContext();

    if (myScopeType.equals(GLOBAL_SCOPE)) {
      scope = GlobalScope.getInstance();
    } else if (myScopeType.equals(PROJECT_SCOPE)) {
      scope = operationContext.getProject().getScope();
    } else if (myScopeType.equals(MODULE_SCOPE)) {
      if (myModule.equals(DEFAULT_VALUE)) {
        scope = operationContext.getModule().getScope();
      } else {
        IModule module = MPSModuleRepository.getInstance().getModuleByUID(myModule);
        if (module == null) {
          myModule = operationContext.getModule().getModuleUID();
          module = MPSModuleRepository.getInstance().getModuleByUID(myModule);
          LOG.error("Module is not found for " + myModule + ". Using current module.");
        }
        scope = module.getScope();
      }
    } else if (myScopeType.equals(MODEL_SCOPE)) {
      if (myModel.equals(DEFAULT_VALUE)) {
        scope = new ModelScope(operationContext.getModule().getScope(), context.getModel());
      } else {
        List<SModelDescriptor> models = SModelRepository.getInstance().getModelDescriptorsByModelName(myModel);
        if (models.isEmpty()) {
          myModel = context.getModel().getModelUID().toString();
          models = SModelRepository.getInstance().getModelDescriptorsByModelName(myModel);
          LOG.error("Model is not found for " + myModel + ". Using current model.");
        }
        SModelDescriptor modelDescriptor = models.get(0);
        scope = new ModelScope(modelDescriptor.getModule().getScope(), modelDescriptor);
      }
    } else {
      throw new IllegalArgumentException();
    }

    return new SearchQuery(new SNodePointer(node), scope);
  }

  public void write(Element element, MPSProject project) {
    Element scopeTypeXML = new Element(SCOPE_TYPE);
    scopeTypeXML.setAttribute(SCOPE_TYPE, myScopeType);
    scopeTypeXML.setAttribute(MODULE, myModule);
    scopeTypeXML.setAttribute(MODEL, myModel);
    element.addContent(scopeTypeXML);
  }

  public void read(Element element, MPSProject project) {
    Element scopeTypeXML = element.getChild(SCOPE_TYPE);
    myScopeType = scopeTypeXML.getAttributeValue(SCOPE_TYPE);
    myModule = scopeTypeXML.getAttributeValue(MODULE);
    myModel = scopeTypeXML.getAttributeValue(MODEL);
  }
}

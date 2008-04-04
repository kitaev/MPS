package jetbrains.mps.ide.findusages.view.optionseditor.options;

import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.ide.findusages.CantLoadSomethingException;
import jetbrains.mps.ide.findusages.IExternalizeable;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.SNode;
import org.jdom.Element;

public abstract class BaseOptions<Result> implements IExternalizeable {
  public BaseOptions() {

  }

  public BaseOptions(Element element, MPSProject project) throws CantLoadSomethingException {
    read(element, project);
  }

  public abstract BaseOptions clone();

  public abstract Result getResult(SNode node, ActionContext context);
}

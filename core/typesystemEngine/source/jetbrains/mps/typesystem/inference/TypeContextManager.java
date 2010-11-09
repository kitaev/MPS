package jetbrains.mps.typesystem.inference;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.ApplicationComponent;
import jetbrains.mps.lang.typesystem.runtime.performance.TypeCheckingContext_Tracer;
import jetbrains.mps.newTypesystem.TypeCheckingContextNew;
import jetbrains.mps.reloading.ClassLoaderManager;
import jetbrains.mps.reloading.ReloadAdapter;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.event.SModelListener;
import jetbrains.mps.smodel.event.SModelListener.SModelListenerPriority;
import jetbrains.mps.util.Pair;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.Map.Entry;

/**
 * Created by IntelliJ IDEA.
 * Date: 25.08.2010
 * Time: 14:25:19
 * To change this template use File | Settings | File Templates.
 */
public class TypeContextManager implements ApplicationComponent {
  private final Object myLock = new Object();
  private static final boolean useNewTypeSystem = false;
  public static final ITypeContextOwner DEFAULT_OWNER = new ITypeContextOwner() {};

  private Set<SModelDescriptor> myListeningForModels = new HashSet<SModelDescriptor>();
  private Map<SNode, Pair<TypeCheckingContext, List<ITypeContextOwner>>> myTypeCheckingContexts =
    new HashMap<SNode, Pair<TypeCheckingContext, List<ITypeContextOwner>>>(); //todo cleanup on reload (temp solution)

  Timer myTimer;

  private TypeChecker myTypeChecker;
  private ClassLoaderManager myClassLoaderManager;

  private SModelListener myModelListener = new SModelAdapter(SModelListenerPriority.PLATFORM) {
    public void beforeModelDisposed(SModel sm) {
      synchronized (myLock) {
        for (SNode node : new ArrayList<SNode>(myTypeCheckingContexts.keySet())) {
          if (sm == node.getModel()) {
            removeContextForNode(node);
          }
        }
      }
    }

    public void modelReplaced(SModelDescriptor md) {
      SModelReference modelRef = md.getSModelReference();
      synchronized (myLock) {
        for (SNode node : new ArrayList<SNode>(myTypeCheckingContexts.keySet())) {
          if (node.shouldHaveBeenDisposed() || modelRef == node.getModel().getSModelReference()) {
            removeContextForNode(node);
          }
        }
      }
    }
  };
  private static final long TIMEOUT = 60000;

  public TypeContextManager(TypeChecker typeChecker, ClassLoaderManager classLoaderManager) {
    myTypeChecker = typeChecker;
    myClassLoaderManager = classLoaderManager;
  }

  @NotNull
  @Override
  public String getComponentName() {
    return "Type Context Manager";
  }

  @Override
  public void initComponent() {
    myClassLoaderManager.addReloadHandler(new ReloadAdapter() {
      public void unload() {
        clearForClassesUnload();
      }
    });
    myTimer = new Timer(true);
    myTimer.schedule(new TimerTask() {
      @Override
      public void run() {
        clearDefaultOwners();
      }
    }, TIMEOUT, TIMEOUT);
  }

  @Override
  public void disposeComponent() {
  }

  public static TypeContextManager getInstance() {
    return ApplicationManager.getApplication().getComponent(TypeContextManager.class);
  }

  public TypeCheckingContext createTypeCheckingContext(SNode node) {
    if (useNewTypeSystem) {
      return new TypeCheckingContextNew(node, myTypeChecker);
    }
    return new TypeCheckingContext(node, myTypeChecker);
  }

  public TypeCheckingContext createTracingTypeCheckingContext(SNode node) {
    return new TypeCheckingContext_Tracer(node, myTypeChecker);
  }

  public TypeCheckingContext getContextForEditedRootNode(SNode node) {
    return getContextForEditedRootNode(node, DEFAULT_OWNER, false);
  }

  public TypeCheckingContext getContextForEditedRootNode(SNode node, ITypeContextOwner owner) {
    return getContextForEditedRootNode(node, owner, false);
  }

  public TypeCheckingContext getContextForEditedRootNode(SNode node, ITypeContextOwner owner, boolean alwaysRegisterOwner) {
    if (node == null) return null;
    synchronized (myLock) {
      Pair<TypeCheckingContext, List<ITypeContextOwner>> contextWithOwners = myTypeCheckingContexts.get(node);
      if (contextWithOwners == null) {
        TypeCheckingContext newTypeCheckingContext = createTypeCheckingContext(node);
        addModelListener(node);
        List<ITypeContextOwner> owners = new ArrayList<ITypeContextOwner>(1);
        contextWithOwners = new Pair<TypeCheckingContext, List<ITypeContextOwner>>(newTypeCheckingContext, owners);
        owners.add(owner);
        myTypeCheckingContexts.put(node, contextWithOwners);
        return newTypeCheckingContext;
      } else {
        TypeCheckingContext context = contextWithOwners.o1;
        if (alwaysRegisterOwner && !contextWithOwners.o2.contains(owner)) {
          contextWithOwners.o2.add(owner);
        }
        return context;
      }
    }
  }

  public void removeOwnerForRootNodeContext(SNode node, ITypeContextOwner owner) {
    synchronized (myLock) {
      Pair<TypeCheckingContext, List<ITypeContextOwner>> contextWithOwners = myTypeCheckingContexts.get(node);
      if (contextWithOwners != null) {
        List<ITypeContextOwner> owners = contextWithOwners.o2;
        owners.remove(owner);
        if (owners.isEmpty()) {
          contextWithOwners.o1.dispose();
          myTypeCheckingContexts.remove(node);
        }
      }
    }
  }

  public void removeContextForNode(SNode node) {
    synchronized (myLock) {
      Pair<TypeCheckingContext, List<ITypeContextOwner>> contextWithOwners = myTypeCheckingContexts.get(node);
      if (contextWithOwners != null) {
        contextWithOwners.o1.dispose();
        myTypeCheckingContexts.remove(node);
      }
    }
  }

  public void clearForClassesUnload() {
    synchronized (myLock) {
      for (Pair<TypeCheckingContext,List<ITypeContextOwner>> context : myTypeCheckingContexts.values()) {
        context.o1.clear();
      }
    }
  }

  private void addModelListener(SNode node) {
    SModel sModel = node.getModel();
    SModelDescriptor descriptor = sModel.getModelDescriptor();
    if (descriptor != null && !myListeningForModels.contains(descriptor)) {
      descriptor.addModelListener(myModelListener);
      myListeningForModels.add(descriptor);
    }
  }

  private void clearDefaultOwners() {
    synchronized (myLock) {
      Set<Entry<SNode, Pair<TypeCheckingContext, List<ITypeContextOwner>>>> entries =
        new HashSet<Entry<SNode, Pair<TypeCheckingContext, List<ITypeContextOwner>>>>(myTypeCheckingContexts.entrySet());
      for (Entry<SNode,Pair<TypeCheckingContext,List<ITypeContextOwner>>> entry : entries) {
        SNode node = entry.getKey();
        Pair<TypeCheckingContext, List<ITypeContextOwner>> value = entry.getValue();
        value.o2.remove(DEFAULT_OWNER);
        if (value.o2.isEmpty()) {
          value.o1.dispose();
          myTypeCheckingContexts.remove(node);
        }
      }
    }
  }
}

package jetbrains.mps.generator.impl;

import com.intellij.openapi.project.Project;
import jetbrains.mps.generator.dependencies.*;
import jetbrains.mps.generator.dependencies.DependenciesBuilder.NullDependenciesBuilder;
import jetbrains.mps.generator.index.ModelDigestUtil;
import jetbrains.mps.generator.plan.ConnectedComponentPartitioner;
import jetbrains.mps.smodel.*;
import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * Evgeny Gryaznov, Jun 3, 2010
 */
public class GenerationFilter {

  private static final String CONDITIONALS_ID = "";

  private SModelDescriptor myModel;
  private GenerationProcessContext myGenerationContext;
  private Project myProject;
  private Set<SNode> myUnchangedRoots;
  private Map<String, String> myGenerationHashes;
  private GenerationDependencies mySavedDependencies;

  public GenerationFilter(SModelDescriptor model, Project project, GenerationProcessContext generationContext) {
    myModel = model;
    myGenerationContext = generationContext;
    myProject = project;
    myUnchangedRoots = Collections.emptySet();
    init();
  }

  private void init() {
    if(!myGenerationContext.isGenerateDependencies()) {
      return;
    }

    myGenerationHashes = ModelDigestUtil.getGenerationHashes(myModel, myProject);
    GenerationDependencies dependencies = GenerationDependenciesCache.getInstance().get(myModel);
    if(dependencies != null && myGenerationHashes != null) {
      analyzeDependencies(dependencies);
      if(!myUnchangedRoots.isEmpty()) {
        mySavedDependencies = dependencies;
      }
    }
  }

  public Set<SNode> getUnchangedRoots() {
    return Collections.unmodifiableSet(myUnchangedRoots);
  }

  public boolean isDirty(SNode root) {
    return !myUnchangedRoots.contains(root);
  }

  private void analyzeDependencies(@NotNull GenerationDependencies dependencies) {
    final List<SNode> rootsList = myModel.getSModel().getRoots();
    Map<String, SNode> rootById = new HashMap<String, SNode>();

    myUnchangedRoots = new HashSet<SNode>();

    for(SNode root : rootsList) {
      String id = root.getId();
      GenerationRootDependencies rd = dependencies.getDependenciesFor(id);
      String oldHash;
      if(rd == null || (oldHash = rd.getHash()) == null) {
        continue;
      }
      String newHash = myGenerationHashes.get(id);
      if(newHash == null || !newHash.equals(oldHash)) {
        continue;
      }
      myUnchangedRoots.add(root);
    }

    if(myUnchangedRoots.isEmpty()) {
      return;
    }

    for(SNode root : rootsList) {
      rootById.put(root.getId(), root);
    }

    // closure using saved dependencies graph
    Map<String, Set<String>> dep = getDependenciesWithoutOrientation(dependencies, myUnchangedRoots);
    boolean changed = true;
    while(changed) {
      changed = false;
      Iterator<SNode> it = myUnchangedRoots.iterator();
      while(it.hasNext()) {
        SNode root = it.next();
        Set<String> rootDeps = dep.get(root.getId());
        boolean dirty = false;
        for(String localRootId : rootDeps) {
          if(!dep.containsKey(localRootId)) {
            dirty = true;
            break;
          }
        }
        if(dirty) {
          it.remove();
          dep.remove(root.getId());
          changed = true;
        }
      }
    }

    if(myUnchangedRoots.isEmpty()) {
      return;
    }

    // closure using current dependencies
    ConnectedComponentPartitioner partitioner = new ConnectedComponentPartitioner(rootsList);
    List<SNode[]> components = partitioner.partition();
    for(SNode[] component : components) {
      boolean hasUnchanged = false;
      boolean hasChanged = false;
      for(SNode n : component) {
        if(myUnchangedRoots.contains(n)) {
          hasUnchanged = true;
        } else {
          hasChanged = true;
        }
      }
      if(hasUnchanged && hasChanged) {
        for(SNode n : component) {
          myUnchangedRoots.remove(n);
        }
      }
    }
  }

  private static Map<String,Set<String>> getDependenciesWithoutOrientation(GenerationDependencies dependencies, Set<SNode> selectedRoots) {
    Map<String,Set<String>> graph = new HashMap<String, Set<String>>();
    for(SNode n : selectedRoots) {
      graph.put(n.getId(), new HashSet<String>());
    }
    for(GenerationRootDependencies rd : dependencies.getRootDependencies()) {
      String id = rd.getRootId();
      if(id == null) {
        id = CONDITIONALS_ID;
      }
      Set<String> currentDeps = graph.get(id);
      if(currentDeps != null) {
        currentDeps.addAll(rd.getLocal());
        if(rd.isDependsOnConditionals()) {
          currentDeps.add(CONDITIONALS_ID);
        }
      }
      for(String s : rd.getLocal()) {
        Set<String> r = graph.get(s);
        if(r != null) {
          r.add(id);
        }
      }
    }
    return graph;
  }

  public SModelDescriptor getModel() {
    return myModel;
  }

  public GenerationProcessContext getGenerationContext() {
    return myGenerationContext;
  }
  
  public DependenciesBuilder createDependenciesBuilder() {
    if(!myGenerationContext.isGenerateDependencies()) {
      return new NullDependenciesBuilder();
    }

    DefaultDependenciesBuilder result = new DefaultDependenciesBuilder(myModel.getSModel(), myGenerationHashes);
    if(myUnchangedRoots.isEmpty()) {
      return result;
    }

    Map<String,SNode> rootById = new HashMap<String, SNode>();
    for(SNode root : myModel.getSModel().getRoots()) {
      rootById.put(root.getId(), root);
    }

    for(SNode root : myUnchangedRoots) {
      RootDependenciesListener listener = result.getListener(root);
      GenerationRootDependencies deps = mySavedDependencies.getDependenciesFor(root.getId());
      assert deps.getHash().equals(listener.getHash());
      Set<SNode> roots = new HashSet<SNode>();
      Set<SModelDescriptor> models = new HashSet<SModelDescriptor>();
      for(String rootId : deps.getLocal()) {
        SNode localRoot = rootById.get(rootId);
        if(localRoot != null) {
          roots.add(localRoot);
        }
      }
      for(String modelId : deps.getExternal()) {
        SModelDescriptor externalModel = SModelRepository.getInstance().getModelDescriptor(SModelReference.fromString(modelId));
        if(externalModel != null) {
          models.add(externalModel);
        }
      }
      listener.updateDependencies(roots, models, deps.isDependsOnConditionals());
    }

    return result;
  }
}

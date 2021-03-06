/*
 * Copyright 2003-2011 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.make;

import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.compiler.CompilationResultAdapter;
import jetbrains.mps.compiler.JavaCompiler;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.make.dependencies.StronglyConnectedModules;
import jetbrains.mps.messages.IMessage;
import jetbrains.mps.messages.MessageKind;
import jetbrains.mps.project.*;
import jetbrains.mps.reloading.IClassPathItem;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.util.FileUtil;
import jetbrains.mps.util.NameUtil;
import org.eclipse.jdt.core.compiler.CategorizedProblem;
import org.eclipse.jdt.internal.compiler.ClassFile;
import org.eclipse.jdt.internal.compiler.CompilationResult;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class ModuleMaker {
  private static final Logger LOG = Logger.getLogger(ModuleMaker.class);

  private final static int MAX_ERRORS = 100;

  private Map<String, IModule> myContainingModules = new HashMap<String, IModule>();
  private Map<IModule, ModuleSources> myModuleSources = new HashMap<IModule, ModuleSources>();
  private Dependencies myDependencies;

  public ModuleMaker() {

  }

  public void clean(final Set<IModule> modules, @NotNull final ProgressIndicator indicator) {
    indicator.pushState();
    try {
      indicator.setIndeterminate(true);
      indicator.setText("Cleaning...");
      for (IModule m : modules) {
        if (isExcluded(m)) continue;
        if (indicator.isCanceled()) break;

        indicator.setText2("Cleaning " + m.getModuleFqName() + "...");
        FileUtil.delete(new File(m.getClassesGen().getPath()));
      }
      invalidateClasspath(modules);
    } finally {
      indicator.popState();
    }
  }

  public MPSCompilationResult make(Set<IModule> modules, @NotNull final ProgressIndicator indicator) {
    indicator.pushState();
    try {
      indicator.setText("Compiling...");
      indicator.setIndeterminate(true);

      Set<IModule> candidates = collectCandidates(modules);
      indicator.setText2("Loading dependencies..");
      myDependencies = new Dependencies(candidates);

      indicator.setText2("Calculating modules to compile...");
      Set<IModule> toCompile = getModulesToCompile(candidates);


      int errorCount = 0;
      int warnCount = 0;
      boolean compiled = false;
      List<IMessage> messages = new ArrayList<IMessage>();

      List<Set<IModule>> schedule = StronglyConnectedModules.getInstance().getStronglyConnectedComponents(toCompile);

      for (Set<IModule> cycle : schedule) {
        if (indicator.isCanceled()) break;

        indicator.setText2("Compiling modules " + cycle + "...");
        MPSCompilationResult result = compile(cycle);
        errorCount += result.getErrors();
        warnCount += result.getWarnings();
        compiled = compiled || result.isCompiledAnything();
        messages.addAll(result.getMessages());
      }

      return new MPSCompilationResult(errorCount, warnCount, false, compiled, messages);
    } finally {
      indicator.popState();
    }
  }

  private Set<IModule> collectCandidates(Set<IModule> startSet) {
    Set<IModule> modules = new LinkedHashSet<IModule>();
    Set<Language> usedLanguages = new LinkedHashSet<Language>();

    for (IModule m : startSet) {
      m.getDependenciesManager().collectAllCompileTimeDependencies(modules, usedLanguages);
    }
    modules.addAll(usedLanguages);
    return modules;
  }

  private MPSCompilationResult compile(Set<IModule> modules) {
    boolean hasAnythingToCompile = false;
    List<MyMessage> messages = new ArrayList<MyMessage>();

    for (IModule m : modules) {
      if (m.isCompileInMPS()) {
        hasAnythingToCompile = true;
      }
    }

    if (!hasAnythingToCompile) {
      return new MPSCompilationResult(0, 0, false, false);
    }

    JavaCompiler compiler = new JavaCompiler();
    boolean hasJavaToCompile = false;
    boolean hasFilesToCopyOrDelete = false;

    Set<IModule> modulesWithRemovals = new HashSet<IModule>();
    for (IModule m : modules) {
      if (areClassesUpToDate(m)) continue;

      if (!m.isCompileInMPS()) {
        String text = "Module which compiled in IDEA depend on module which has to be compiled in MPS:" + m.getModuleFqName();
        messages.add(new MyMessage(MessageKind.WARNING, text, m));
        LOG.debug(text, m);
        continue;
      }

      ModuleSources sources = getModuleSources(m);
      hasFilesToCopyOrDelete |= !sources.isResourcesUpToDate();
      hasJavaToCompile |= !sources.isJavaUpToDate();

      for (File f : sources.getFilesToDelete()) {
        f.delete();
        modulesWithRemovals.add(m);
      }

      for (JavaFile f : sources.getFilesToCompile()) {
        compiler.addSource(f.getClassName(), f.getContents());
        myContainingModules.put(f.getClassName(), m);
      }
    }

    if(!hasJavaToCompile && !hasFilesToCopyOrDelete) {
      return new MPSCompilationResult(0, 0, false, false, messages);
    }

    //todo:do we need this invalidation?
    invalidateClasspath(modulesWithRemovals);

    MyCompilationResultAdapter listener = null;
    if(hasJavaToCompile) {
      IClassPathItem classPathItems = computeDependenciesClassPath(modules);
      listener = new MyCompilationResultAdapter(modules, classPathItems, messages);
      compiler.addCompilationResultListener(listener);
      compiler.compile(classPathItems);
      compiler.removeCompilationResultListener(listener);

      invalidateClasspath(modules);
    }

    for (IModule module : modules) {
      ModuleSources sources = getModuleSources(module);
      for (ResourceFile toCopy : sources.getResourcesToCopy()) {
        String fqName = toCopy.getPath();

        fqName = fqName.substring(0, fqName.length() - toCopy.getFile().getName().length());
        String path = fqName.replace('/', File.separatorChar) + toCopy.getFile().getName();

        if (new File(toCopy.getFile().getAbsolutePath()).exists()) {
          FileUtil.copyFile(
            new File(toCopy.getFile().getAbsolutePath()),
            new File(module.getClassesGen().getDescendant(path).getPath())
          );
        }
      }
    }

    for (IModule module : modules) {
      module.updateClassPath();
    }

    return new MPSCompilationResult(listener == null ? 0 : listener.getErrorCount(), 0, false, hasJavaToCompile, messages);
  }

  private String getName(char[][] compoundName) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < compoundName.length; i++) {
      char[] part = compoundName[i];
      result.append(part);
      if (i != compoundName.length - 1) {
        result.append(".");
      }
    }

    return result.toString();
  }

  private IClassPathItem computeDependenciesClassPath(Set<IModule> modules) {
    return AbstractModule.getDependenciesClasspath(modules, true);
  }

  private Set<IModule> getModulesToCompile(Set<IModule> modules) {
    List<IModule> dirtyModules = new ArrayList<IModule>(modules.size());
    for (IModule m : modules) {
      if (isDirty(m)) {
        dirtyModules.add(m);
      }
    }

    Map<IModule, Set<IModule>> backDependencies = new HashMap<IModule, Set<IModule>>();

    for (IModule m : modules) {
      for (IModule dep : new ArrayList<IModule>(m.getDependenciesManager().getAllRequiredModules())) {
        if (!backDependencies.containsKey(dep)) {
          backDependencies.put(dep, new HashSet<IModule>());
        }
        backDependencies.get(dep).add(m);
      }
    }

    Set<IModule> toCompile = new LinkedHashSet<IModule>();

    for (IModule dirty : dirtyModules) {
      collectToCompile(dirty, toCompile, backDependencies);
    }

    return toCompile;
  }

  private void collectToCompile(IModule current, Set<IModule> result, Map<IModule, Set<IModule>> deps) {
    if (!result.add(current)) return;
    if (!deps.containsKey(current)) return;

    for (IModule dep : deps.get(current)) {
      collectToCompile(dep, result, deps);
    }
  }

  private boolean isDirty(IModule m) {
    if (isExcluded(m)) return false;
    if (areClassesUpToDate(m)) return false;
    return true;
  }

  private boolean areClassesUpToDate(IModule m) {
    if (isExcluded(m)) return true;
    if (!m.isCompileInMPS()) return true;

    return getModuleSources(m).isUpToDate();
  }

  private ModuleSources getModuleSources(IModule module) {
    ModuleSources moduleSources = myModuleSources.get(module);
    if (moduleSources == null) {
      moduleSources = new ModuleSources(module, myDependencies);
      myModuleSources.put(module, moduleSources);
    }
    return moduleSources;
  }

  private boolean isExcluded(IModule m) {
    if (!(m instanceof Solution) && !(m instanceof Language)) return true;
    if (m.isPackaged()) return true;
    if (!m.isCompileInMPS()) return true;

    return false;
  }

  private void invalidateClasspath(Set<IModule> modules) {
    for (IModule m : modules) {
      m.invalidateClassPath();
    }
    for (IModule m : MPSModuleRepository.getInstance().getAllModules()) {
      m.updateClassPath();
    }
  }

  private class MyCompilationResultAdapter extends CompilationResultAdapter {
    private int myErrorCount = 0;
    private int myOutputtedErrors = 0;
    private final Set<IModule> myModules;
    private IClassPathItem myClassPathItems;
    private List<MyMessage> myMessages;

    public MyCompilationResultAdapter(Set<IModule> modules, IClassPathItem classPathItems, List<MyMessage> messages) {
      myModules = modules;
      myClassPathItems = classPathItems;
      myMessages = messages;
    }

    @Override
    public void onFatalError(String error) {
      myMessages.add(new MyMessage(MessageKind.ERROR, "Fatal error. " + error, null));
      LOG.debug("Fatal error. " + error);
      LOG.debug("Modules: " + myModules.toString() + "\nClasspath: " + myClassPathItems + "\n");
      myErrorCount += 1;
    }

    public void onCompilationResult(CompilationResult cr) {
      Set<String> classesWithErrors = new HashSet<String>();
      if (cr.getErrors() != null) {
        for (final CategorizedProblem cp : cr.getErrors()) {
          String fileName = new String(cp.getOriginatingFileName());
          final String fqName = NameUtil.namespaceFromPath(fileName.substring(0, fileName.length() - MPSExtentions.DOT_JAVAFILE.length()));
          classesWithErrors.add(fqName);

          IModule containingModule = myContainingModules.get(fqName);
          assert containingModule != null;
          JavaFile javaFile = myModuleSources.get(containingModule).getJavaFile(fqName);

          String messageStirng = new String(cp.getOriginatingFileName()) + " : " + cp.getMessage();

          //final SNode nodeToShow = getNodeByLine(cp, fqName);

          Object hintObject = new FileWithPosition(javaFile.getFile(), cp.getSourceStart());

          String errMsg = messageStirng + " (line: " + cp.getSourceLineNumber() + ")";
          if (cp.isWarning()) {
            myMessages.add(new MyMessage(MessageKind.WARNING, errMsg, hintObject));
            LOG.debug(errMsg, hintObject);
          } else {
            if (myOutputtedErrors == 0) {
              myMessages.add(new MyMessage(MessageKind.ERROR, "Errors encountered", null));
              LOG.debug("Errors encountered");
              LOG.debug("Modules: " + myModules.toString() + "\nClasspath: " + myClassPathItems + "\n");
            }
            if (myOutputtedErrors < MAX_ERRORS) {
              myOutputtedErrors++;
              myMessages.add(new MyMessage(MessageKind.ERROR, errMsg, hintObject));
              LOG.debug(errMsg, hintObject);
            }
          }
        }

        myErrorCount += cr.getErrors().length;
      }

      for (ClassFile cf : cr.getClassFiles()) {
        String fqName = getName(cf.getCompoundName());
        String containerClassName = fqName;
        if (containerClassName.contains("$")) {
          int index = containerClassName.indexOf('$');
          containerClassName = containerClassName.substring(0, index);
        }
        if (myContainingModules.containsKey(containerClassName)) {
          IModule m = myContainingModules.get(containerClassName);
          File classesGen = new File(m.getClassesGen().getPath());
          String packageName = NameUtil.namespaceFromLongName(fqName);
          File outputDir = new File(classesGen + File.separator + NameUtil.pathFromNamespace(packageName));
          if (!outputDir.exists()) {
            if (!outputDir.mkdirs()) {
              throw new RuntimeException("Can't create " + outputDir.getPath() + " directory");
            }
          }
          String className = NameUtil.shortNameFromLongName(fqName);
          File output = new File(outputDir, className + ".class");
          if (!classesWithErrors.contains(containerClassName)) {
            FileOutputStream os = null;
            try {
              os = new FileOutputStream(output);
              os.write(cf.getBytes());
            } catch (IOException e) {
              String errMsg = "Can't write to " + output.getAbsolutePath();
              myMessages.add(new MyMessage(MessageKind.ERROR, errMsg, null));
              LOG.debug(errMsg);
            } finally {
              if (os != null) {
                try {
                  os.close();
                } catch (IOException e) {
                  LOG.error(e);
                }
              }
            }
          } else {
            if (output.exists() && !(output.delete())) {
              String errMsg = "Can't delete " + output.getPath();
              myMessages.add(new MyMessage(MessageKind.ERROR, errMsg, null));
              LOG.error(errMsg);
            }
          }
        } else {
          String errMsg = "I don't know in which module's output path I should place class file for " + fqName;
          myMessages.add(new MyMessage(MessageKind.ERROR, errMsg, null));
          LOG.error(errMsg);
        }
      }
    }

    public int getErrorCount() {
      return myErrorCount;
    }
  }

  private static class MyMessage implements IMessage {

    private MessageKind myKind;
    private String myText;
    private Object myHintObject;

    public MyMessage(MessageKind kind, String text, Object hintObject) {
      myKind = kind;
      myText = text;
      myHintObject = hintObject;
    }

    public MessageKind getKind() {
      return myKind;
    }

    public Throwable getException() {
      return null;
    }

    public String getText() {
      return myText;
    }

    public String getSender() {
      return null;
    }

    public long getCreationTime() {
      return 0;
    }

    public Object getHintObject() {
      return myHintObject;
    }

    public String getHelpUrl() {
      return null;
    }
  }
}

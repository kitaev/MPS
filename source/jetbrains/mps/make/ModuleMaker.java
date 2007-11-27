package jetbrains.mps.make;

import jetbrains.mps.compiler.JavaCompiler;
import jetbrains.mps.ide.BootstrapLanguages;
import jetbrains.mps.ide.progress.IAdaptiveProgressMonitor;
import jetbrains.mps.make.MakeScheduleBuilder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.IModule;
import jetbrains.mps.reloading.ClassLoaderManager;
import jetbrains.mps.reloading.CompositeClassPathItem;
import jetbrains.mps.reloading.IClassPathItem;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.util.FileUtil;
import jetbrains.mps.util.NameUtil;
import org.eclipse.jdt.internal.compiler.ClassFile;
import org.eclipse.jdt.internal.compiler.CompilationResult;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class ModuleMaker {
  private static Logger LOG = Logger.getLogger(ModuleMaker.class);

  private static final String JAVA_SUFFIX = ".java";

  private Map<String, IModule> myContainingModules = new HashMap<String, IModule>();
  private Map<IModule, Boolean> myClassesUpToDateStatus = new HashMap<IModule, Boolean>();

  public void clean(final Set<IModule> modules, final IAdaptiveProgressMonitor monitor) {
    try {
      monitor.start("Clean", 2000);
      for (IModule m : modules) {
        monitor.addText("Cleaning " + m.getModuleUID() + "...");
        FileUtil.delete(m.getClassesGen());
      }
      monitor.addText("Done");
    } finally {
      monitor.finish();
    }
  }

  public void make(Set<IModule> modules, final IAdaptiveProgressMonitor monitor) {
    try {
      monitor.start("Compiling...", 1000 * modules.size());

      Set<IModule> toCompile = new LinkedHashSet<IModule>();
      Set<IModule> candidates = new HashSet<IModule>();
      candidates.addAll(modules);

      for (IModule m : modules) {
        candidates.addAll(m.getAllDependOnModules(IModule.class));
      }

      for (IModule c : candidates) {
        if (!isUpToDate(c)) {
          toCompile.add(c);
        }
      }

      for (Set<IModule> cycle : new MakeScheduleBuilder().buildSchedule(toCompile)) {
        monitor.addText("Compiling module cycle: " + cycle + "...");
        compile(cycle);
      }
    } finally {    
      monitor.finish();
    }
  }

  private void compile(Set<IModule> modules) {
    if (modules.isEmpty()) {
      return;
    }

    IClassPathItem classPathItems = computeDependenciesClassPath(modules);
    JavaCompiler compiler = new JavaCompiler(classPathItems);

    for (IModule m : modules) {
      for (String sp : m.getSourcePaths()) {
        addSource(compiler, new File(sp), "", m);
      }
      
      FileUtil.delete(m.getClassesGen());
    }

    compiler.compile();
    for (CompilationResult cr : compiler.getCompilationResults()) {
      for (ClassFile cf : cr.getClassFiles()) {
        String name = getName(cf.getCompoundName());
        if (myContainingModules.containsKey(name)) {
          IModule m = myContainingModules.get(name);
          File classesGen = m.getClassesGen();
          String packageName = NameUtil.namespaceFromLongName(name);
          File outputDir = new File(classesGen + File.separator + packageName.replace('.', File.separatorChar));
          outputDir.mkdirs();                    
          String className = NameUtil.shortNameFromLongName(name);
          File output = new File(outputDir, className + ".class");
          try {
            FileOutputStream os = new FileOutputStream(output);
            os.write(cf.getBytes());
            os.close();
          } catch (IOException e) {
            throw new RuntimeException(e);
          }
        } else {
          LOG.error("I don't know in which module's output path I should place class file for " + name);
        }
      }
    }
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

  private void addSource(JavaCompiler compiler, File dir, String pack, IModule m) {
    for (File child : dir.listFiles()) {
      if (child.isFile() && child.getName().endsWith(JAVA_SUFFIX)) {
        String className = child.getName().substring(0, child.getName().length() - JAVA_SUFFIX.length());
        String contents = FileUtil.read(child);

        String classFqName = pack.equals("") ? className : pack + "." + className;
        myContainingModules.put(classFqName, m);

        compiler.addSource(contents, classFqName);
      }

      if (child.isDirectory()) {
        addSource(compiler, child, pack.equals("") ? child.getName() : pack + "." + child.getName(), m);
      }
    }
  }

  private IClassPathItem computeDependenciesClassPath(Set<IModule> modules) {
    Set<IModule> dependOnModules = new LinkedHashSet<IModule>();
    for (IModule m : modules) {
      dependOnModules.addAll(m.getAllDependOnModules(IModule.class));
    }
    dependOnModules.addAll(BootstrapLanguages.getInstance().getLanguagesUsedInCore());

    CompositeClassPathItem classPathItems = new CompositeClassPathItem();
    for (IModule m : dependOnModules) {
      classPathItems.add(m.getJavaStubsClassPathItem());
    }

    classPathItems.add(ClassLoaderManager.getInstance().getRTJar());
    classPathItems.add(ClassLoaderManager.getInstance().getMPSPath());
    classPathItems.add(ClassLoaderManager.getInstance().getMPSSupportPath());

    return classPathItems;
  }

  private boolean isUpToDate(IModule m) {
    if (!isClassesUpToDate(m)) {
      return false;
    }

    for (IModule dep : m.getAllDependOnModules(IModule.class)) {
      if (!isClassesUpToDate(dep)) {
        return false;
      }
    }

    return true;
  }

  private boolean isClassesUpToDate(IModule m) {
    if (myClassesUpToDateStatus.containsKey(m)) {
      return myClassesUpToDateStatus.get(m);
    }

    if (m instanceof Language && BootstrapLanguages.getInstance().getLanguagesUsedInCore().contains(m)) {
      myClassesUpToDateStatus.put(m, true);
      //bootstrap languages are compiled by IDE
      return true;
    }

    File classesGen = m.getClassesGen();

    long classesTimeStamp = FileUtil.getNewestFileTime(classesGen);
    long sourcesTimeStamp = 0;

    for (String s : m.getSourcePaths()) {
      sourcesTimeStamp = Math.max(sourcesTimeStamp, FileUtil.getNewestFileTime(new File(s)));
    }

    boolean result = classesTimeStamp >= sourcesTimeStamp;
    myClassesUpToDateStatus.put(m, result);
    return result;
  }
}

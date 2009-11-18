/*
 * Copyright 2003-2009 JetBrains s.r.o.
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
package jetbrains.mps.javaParser;

import org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration;
import org.eclipse.jdt.internal.compiler.env.ICompilationUnit;
import org.eclipse.jdt.internal.compiler.env.NameEnvironmentAnswer;
import org.eclipse.jdt.internal.compiler.*;
import org.eclipse.jdt.internal.compiler.Compiler;
import org.eclipse.jdt.internal.compiler.problem.DefaultProblemFactory;
import org.eclipse.jdt.internal.compiler.classfmt.ClassFileConstants;
import org.eclipse.jdt.internal.compiler.impl.CompilerOptions;
import org.eclipse.jdt.internal.compiler.batch.CompilationUnit;
import org.eclipse.jdt.core.compiler.CategorizedProblem;
import org.eclipse.jdt.core.compiler.IProblem;
import jetbrains.mps.smodel.*;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.reloading.IClassPathItem;
import jetbrains.mps.reloading.CompositeClassPathItem;
import jetbrains.mps.reloading.CommonPaths;
import jetbrains.mps.reloading.FileClassPathItem;
import jetbrains.mps.vfs.MPSExtentions;
import jetbrains.mps.util.FileUtil;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.compiler.MPSNameEnvironment;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.Solution;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import java.util.*;
import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 08.09.2009
 * Time: 15:19:32
 * To change this template use File | Settings | File Templates.
 */
public class JavaCompiler {

  private static final Logger LOG = Logger.getLogger(JavaCompiler.class);

  private Map<String, CompilationUnit> myCompilationUnits = new HashMap<String, CompilationUnit>();
  private Set<ICompilationUnit> myProcessedCompilationUnits = new HashSet<ICompilationUnit>();
  private List<CompilationUnitDeclaration> myCompilationUnitDeclarations = new ArrayList<CompilationUnitDeclaration>();
  private CompositeClassPathItem myClassPathItem;
  private Solution mySolution;
  private List<CompilationResult> myCompilationResults = new ArrayList<CompilationResult>();
  private File mySourceDir;
  private Map<String, SModel> myPackageFQNamesToModels = new HashMap<String, SModel>();
  private String myPrefix = null;

  public JavaCompiler(Solution solution, File sourceDir) {
    mySolution = solution;
    mySourceDir = sourceDir;
    initClassPathItem(solution);
    addSourceFromDirectory(mySourceDir, "");
    File generalSourceDirectory = getGeneralSourceDirectory();
    if (generalSourceDirectory != null) {
      mySolution.getSolutionDescriptor().setOutputPath(generalSourceDirectory.getPath());
    }
    mySolution.save();
  }

  private File getGeneralSourceDirectory() {
    if (myPrefix == null) {
      return null; //no source files detected
    }
    String prefixPath = myPrefix.replace('.', File.separatorChar);
    String sourcePath = mySourceDir.getPath();
    if (!(sourcePath.endsWith(prefixPath))) {
      LOG.warning("source directory path does not match package structure");
      return null;
    }
    int index = sourcePath.length() - prefixPath.length();
    String generalSourcePath = sourcePath.substring(0, index);
    return new File(generalSourcePath);
  }

  private void initClassPathItem(IModule module) {
    CompositeClassPathItem compositeClassPathItem = new CompositeClassPathItem();
    compositeClassPathItem.add(module.getClassPathItem());
    compositeClassPathItem.add(CommonPaths.getJDK());
    compositeClassPathItem.add(CommonPaths.getMPSPath());
    myClassPathItem = compositeClassPathItem;
  }

  public void addSourceFromFile(File file, String packageNameWithoutPrefix) {
    try {
      String fileContents = FileUtil.read(file);
      String str = "package ";
      int packageIndex = fileContents.indexOf(str) + str.length();
      int i = packageIndex;
      StringBuilder classFQName = new StringBuilder();
      while (i < fileContents.length()) {
        char c = fileContents.charAt(i);
        i++;
        if (Character.isWhitespace(c) || c == ';') {
          break;
        }
        classFQName.append(c);
      }
      String packageNameFromFile = classFQName.toString();
      if (myPrefix != null) {
        String postfix = packageNameWithoutPrefix.equals("") ? "" : '.' + packageNameWithoutPrefix;
        if (!((myPrefix + postfix).equals(packageNameFromFile))) {
          LOG.error("package name in a source file does not correpond to file path");
          return;
        }
      } else {
        if (packageNameFromFile.endsWith(packageNameWithoutPrefix)) {
          int index = packageNameFromFile.length() - packageNameWithoutPrefix.length();
          myPrefix = packageNameFromFile.substring(0, index-1);
        } else {
          LOG.error("package name in a source file does not correpond to file path");
          return;
        }
      }
      SModel model = getModel(packageNameFromFile);
      String fileName;
      String nameAndExtension = file.getName();
      int offset = nameAndExtension.lastIndexOf('.');
      if (offset < 0) {
        fileName = nameAndExtension;
      } else {
        fileName = nameAndExtension.substring(0, offset);
      }
      classFQName.append(".");
      classFQName.append(fileName);
      myPackageFQNamesToModels.put(packageNameFromFile, model);
      addSource(classFQName.toString(), fileContents, model);
    } catch (Throwable t) {
      LOG.error(t);
    }
  }

  public void addSourceFromDirectory(File dir, String packageNameWithoutPrefix) {
    assert dir.isDirectory();
    for (File file : dir.listFiles()) {
      if (file.isDirectory()) {
        //create model if necessary
        String dirName = file.getName();
        String nestedPackageName;
        if ("".equals(packageNameWithoutPrefix)) {
           nestedPackageName = dirName;
        } else {
           nestedPackageName = packageNameWithoutPrefix + '.' + dirName;
        }
        addSourceFromDirectory(file, nestedPackageName);
      } else {
        String extension;
        String nameAndExtension = file.getName();
        int offset = nameAndExtension.lastIndexOf('.');
        if (offset >= 0) {
          extension = nameAndExtension.substring(offset + 1);
          if ("java".equals(extension)) {
            addSourceFromFile(file, packageNameWithoutPrefix);
          }
        }
      }
    }
  }

  private SModel getModel(String fqName) {
    SModelFqName sModelFqName = SModelFqName.fromString(fqName);
    SModelDescriptor modelDescriptor = SModelRepository.getInstance().getModelDescriptor(sModelFqName);
    if (modelDescriptor != null) {
      if (!mySolution.getOwnModelDescriptors().contains(modelDescriptor)) {
        LOG.error("model descriptor with fq name " + fqName + " is not owned by module " + mySolution.getModuleFqName());
        return null;
      }
    } else {
      modelDescriptor =
        mySolution.createModel(sModelFqName, mySolution.getSModelRoots().get(0));//todo get model root from UI
    }
    return modelDescriptor.getSModel();
  }

  public void addSource(String classFqName, String text, SModel model) {
    CompilationUnit compilationUnit = new CompilationUnit(text.toCharArray(), classFqName.replace(".", File.separator) + MPSExtentions.DOT_JAVAFILE, "UTF-8");
    myCompilationUnits.put(classFqName, compilationUnit);
  }

  private CompilerOptions getCompilerOptions() {
    CompilerOptions options = new CompilerOptions();
    options.sourceLevel = ClassFileConstants.JDK1_5;
    options.targetJDK = ClassFileConstants.JDK1_5;
    options.produceDebugAttributes = /*ClassFileConstants.ATTR_SOURCE
      | ClassFileConstants.ATTR_LINES | ClassFileConstants.ATTR_VARS*/ 0;
    return options;
  }

  public void compile() {
    boolean needsRecompilation = true;
    while (needsRecompilation) {
      recompile();
      needsRecompilation = addClassPathsAndBuildAst();
    }
  }

  private void recompile() {
    myCompilationUnitDeclarations = new ArrayList<CompilationUnitDeclaration>();
    myProcessedCompilationUnits = new HashSet<ICompilationUnit>();
    Compiler c = new CompilerImpl();
    //c.options.verbose = true;
    c.compile(myCompilationUnits.values().toArray(new CompilationUnit[0]));
  }

  //returns true if classpathes were added and needs re-compilation
  private boolean addClassPathsAndBuildAst() {
    boolean hasErrors = false;
    List<String> fqNames = new ArrayList<String>();
    for (CompilationUnitDeclaration decl : myCompilationUnitDeclarations) {
      if (decl.hasErrors()) {
        hasErrors = true;
        for (CategorizedProblem problem : decl.compilationResult().getErrors()) {
          if (problem.getID() == IProblem.ImportNotFound) {
            fqNames.add(problem.getArguments()[0]);
          } else {
            String message = problem.getMessage();
            LOG.error(message + " (line: " + problem.getSourceLineNumber() + ")");
            //, new FileWithPosition(javaFile.getFile(), cp.getSourceStart()));
          }
        }
      }
    }
    boolean buildAstNow = true;
    if (!fqNames.isEmpty()) {
      int option = JOptionPane.showConfirmDialog(null, "Some imports in source code were not resolved.\nDo you want to specify classpaths for unresolved imports?");
      if (option == JOptionPane.YES_OPTION) {
        ArrayList<String> list = new ArrayList<String>();
        JDialog dialog = UIComponents.createClasspathsDialog(mySourceDir, list);
        dialog.setVisible(true);
        if (!list.isEmpty()) {
          for (String classpath : list) {
            myClassPathItem.add(new FileClassPathItem(classpath));
          }
          return true;
        }
      }
    }
    if (hasErrors) {
      int option = JOptionPane.showConfirmDialog(null, "Errors were found during compilation. Are you sure you want to build MPS model?");
      if (option != JOptionPane.YES_OPTION) {
        buildAstNow = false;
      }
    }
    if (buildAstNow) {
      buildAST();
      return false;
    }
    return false;
  }

  public void buildAST() {
    ReferentsCreator referentsCreator = new ReferentsCreator(new HashMap<String, SModel>(myPackageFQNamesToModels));
    referentsCreator.exec(myCompilationUnitDeclarations.toArray(new CompilationUnitDeclaration[myCompilationUnitDeclarations.size()]));
    new JavaConverterTreeBuilder().exec(referentsCreator, myPackageFQNamesToModels);
  }

  public List<CompilationResult> getCompilationResults() {
    return myCompilationResults;
  }

  public static String packageNameFromCompoundName(char[][] name) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < name.length - 1; i++) {
      char[] namePart = name[i];
      result.append(namePart);
      if (i < name.length - 2) {
        result.append('.');
      }
    }
    return result.toString();
  }

  private class MyNameEnvironment extends MPSNameEnvironment {
    protected IClassPathItem getClassPathItem() {
      return myClassPathItem;
    }

    protected NameEnvironmentAnswer findType(String fqName) {
      if (myCompilationUnits.containsKey(fqName)) {
        return new NameEnvironmentAnswer(myCompilationUnits.get(fqName), null);
      }

      return super.findType(fqName);
    }
  }

  private boolean askForClassLocation(String fqName) {
    final String name = NameUtil.shortNameFromLongName(fqName);
    JFileChooser fileChooser = new JFileChooser(mySourceDir);
    fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
      @Override
      public boolean accept(File f) {
        return f.isDirectory() || f.getName().endsWith(name + ".class");
      }

      @Override
      public String getDescription() {
        return "Java class " + name;
      }
    });
    fileChooser.setDialogTitle("Select class location for " + fqName);
    fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    int option = fileChooser.showOpenDialog(null);
    if (option != JFileChooser.APPROVE_OPTION) {
      return false;
    }
    File f = fileChooser.getSelectedFile();
    String postfix = fqName.replace('.', File.separatorChar);
    String fileAbsolutePath = f.getAbsolutePath();
    if (!fileAbsolutePath.endsWith(postfix)) {
      LOG.error("file path does not correspond class package");
      return false;
    }
    String classPath = fileAbsolutePath.substring(fileAbsolutePath.length() - postfix.length());
    File classFile = new File(classPath);
    if (!classFile.exists()) {
      LOG.error("classpath directory does not exist");
      return false;
    }
    myClassPathItem.add(new FileClassPathItem(classPath));
    return true;
  }

  private static class MyErrorHandlingPolicy implements IErrorHandlingPolicy {
    public boolean proceedOnErrors() {
      return true;
    }

    public boolean stopOnFirstError() {
      return false;
    }
  }

  private class MyCompilerRequestor implements ICompilerRequestor {
    public void acceptResult(CompilationResult result) {
      myCompilationResults.add(result);
    }
  }

  private class MyProblemFactory extends DefaultProblemFactory {
    public CategorizedProblem createProblem(char[] originatingFileName, int problemId, String[] problemArguments, String[] messageArguments, int severity, int startPosition, int endPosition, int lineNumber, int columnNumber) {
      CategorizedProblem problem = super.createProblem(originatingFileName, problemId, problemArguments, messageArguments, severity, startPosition, endPosition, lineNumber, columnNumber);

      return problem;
    }

    public CategorizedProblem createProblem(char[] originatingFileName, int problemId, String[] problemArguments, int elaborationId, String[] messageArguments, int severity, int startPosition, int endPosition, int lineNumber, int columnNumber) {
      CategorizedProblem problem = super.createProblem(originatingFileName, problemId, problemArguments, elaborationId, messageArguments, severity, startPosition, endPosition, lineNumber, columnNumber);
      String message = problem.getMessage();
      return problem;    //To change body of overridden methods use File | Settings | File Templates.
    }
  }

  private class CompilerImpl extends Compiler {

    public CompilerImpl() {
      super(new MyNameEnvironment(),
        new MyErrorHandlingPolicy(),
        getCompilerOptions(),
        new MyCompilerRequestor(),
        new MyProblemFactory(), null, null);
    }

    @Override
    public void process(CompilationUnitDeclaration cud, int i) {
      super.process(cud, i);
      ICompilationUnit icu = cud.compilationResult().compilationUnit;
      if (!myProcessedCompilationUnits.contains(icu)) {
        myCompilationUnitDeclarations.add(cud);
        myProcessedCompilationUnits.add(icu);
      }
    }
  }
}

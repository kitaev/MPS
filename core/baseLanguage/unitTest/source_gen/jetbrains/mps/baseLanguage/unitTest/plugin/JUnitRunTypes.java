package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISequenceClosure;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.unitTest.behavior.ITestCase_Behavior;
import java.util.Collections;
import jetbrains.mps.project.IModule;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.workbench.MPSDataKeys;
import com.intellij.ide.DataManager;

public enum JUnitRunTypes {
  METHOD() {

    public Iterable<SNode> collect(final DefaultJUnit_Configuration configuration, MPSProject project) {
      return Sequence.fromClosure(new ISequenceClosure<SNode>() {
        public Iterable<SNode> iterable() {
          return new Iterable<SNode>() {
            public Iterator<SNode> iterator() {
              return new YieldingIterator<SNode>() {
                private int __CP__ = 0;
                private String _4_methodName;
                private Iterator<String> _4_methodName_it;
                private int _8_separatorIndex;

                protected boolean moveToNext() {
__loop__:
                  do {
__switch__:
                    switch (this.__CP__) {
                      case -1:
                        assert false : "Internal error";
                        return false;
                      case 4:
                        this._4_methodName_it = ListSequence.fromList(configuration.getStateObject().fullMethodNames).iterator();
                      case 5:
                        if (!(this._4_methodName_it.hasNext())) {
                          this.__CP__ = 1;
                          break;
                        }
                        this._4_methodName = this._4_methodName_it.next();
                        this.__CP__ = 6;
                        break;
                      case 2:
                        if (configuration.getStateObject().fullMethodNames != null) {
                          this.__CP__ = 3;
                          break;
                        }
                        this.__CP__ = 1;
                        break;
                      case 9:
                        this.__CP__ = 5;
                        this.yield(TestRunUtil.getTestMethod(_4_methodName.substring(0, _8_separatorIndex), _4_methodName.substring(_8_separatorIndex + 1)));
                        return true;
                      case 0:
                        this.__CP__ = 2;
                        break;
                      case 3:
                        this.__CP__ = 4;
                        break;
                      case 6:
                        this._8_separatorIndex = _4_methodName.lastIndexOf(TestRunUtil.SEPARATOR);
                        this.__CP__ = 9;
                        break;
                      default:
                        break __loop__;
                    }
                  } while (true);
                  return false;
                }
              };
            }
          };
        }
      });
    }

    public String check(DefaultJUnit_Configuration configuration) {
      if (configuration.getStateObject().fullMethodNames != null) {
        if (TestRunUtil.validateMethods(configuration.getStateObject().fullMethodNames)) {
          return null;
        } else {
          return "methods are not valid";
        }
      }
      return null;
    }

  },
  NODE() {

    public Iterable<SNode> collect(final DefaultJUnit_Configuration configuration, MPSProject project) {
      return Sequence.fromClosure(new ISequenceClosure<SNode>() {
        public Iterable<SNode> iterable() {
          return new Iterable<SNode>() {
            public Iterator<SNode> iterator() {
              return new YieldingIterator<SNode>() {
                private int __CP__ = 0;
                private SNode _9_testNode;
                private int _4_i;

                protected boolean moveToNext() {
__loop__:
                  do {
__switch__:
                    switch (this.__CP__) {
                      case -1:
                        assert false : "Internal error";
                        return false;
                      case 4:
                        this._4_i = 0;
                      case 5:
                        if (!(_4_i < configuration.getStateObject().nodes.size())) {
                          this.__CP__ = 1;
                          break;
                        }
                        this.__CP__ = 6;
                        break;
                      case 7:
                        _4_i++;
                        this.__CP__ = 5;
                        break;
                      case 2:
                        if (configuration.getStateObject().nodes != null) {
                          this.__CP__ = 3;
                          break;
                        }
                        this.__CP__ = 1;
                        break;
                      case 10:
                        if (ListSequence.fromList(ITestCase_Behavior.call_getTestSet_1216130724401(_9_testNode)).isNotEmpty()) {
                          this.__CP__ = 11;
                          break;
                        }
                        this.__CP__ = 7;
                        break;
                      case 12:
                        this.__CP__ = 7;
                        this.yield(_9_testNode);
                        return true;
                      case 0:
                        this.__CP__ = 2;
                        break;
                      case 3:
                        this.__CP__ = 4;
                        break;
                      case 6:
                        this._9_testNode = TestRunUtil.getTestNode(configuration.getStateObject().nodes.get(_4_i));
                        this.__CP__ = 10;
                        break;
                      case 11:
                        this.__CP__ = 12;
                        break;
                      default:
                        break __loop__;
                    }
                  } while (true);
                  return false;
                }
              };
            }
          };
        }
      });
    }

    public String check(DefaultJUnit_Configuration configuration) {
      String errorReport = null;
      if (configuration.getStateObject().nodes.isEmpty()) {
        errorReport = "classes list is empty";
      } else if (!(TestRunUtil.validateNodes(configuration.getStateObject().nodes))) {
        errorReport = "nodes are not valid";
      }
      return errorReport;
    }

  },
  MODEL() {

    public Iterable<SNode> collect(DefaultJUnit_Configuration configuration, MPSProject project) {
      return TestRunUtil.getModelTests(TestRunUtil.getModel(configuration.getStateObject().model));
    }

    public String check(DefaultJUnit_Configuration configuration) {
      String errorReport = null;
      if (configuration.getStateObject().model == null) {
        errorReport = "model is not selected or does not exist";
      } else if (!(TestRunUtil.validateModel(configuration.getStateObject().model))) {
        errorReport = "model is not valid";
      }
      return errorReport;
    }

  },
  MODULE() {

    public Iterable<SNode> collect(DefaultJUnit_Configuration configuration, MPSProject project) {
      return TestRunUtil.getModuleTests(configuration.getStateObject().module);
    }

    public String check(DefaultJUnit_Configuration configuration) {
      String errorReport = null;
      if (configuration.getStateObject().module == null) {
        errorReport = "module is not selected or does not exist";
      } else if (!(TestRunUtil.validateModule(configuration.getStateObject().module))) {
        errorReport = "module is not valid";
      }
      return errorReport;
    }

  },
  PROJECT() {

    public Iterable<SNode> collect(DefaultJUnit_Configuration configuration, final MPSProject project) {
      if (project == null) {
        return Sequence.fromIterable(Collections.<SNode>emptyList());
      }

      return Sequence.fromIterable(Sequence.fromClosure(new ISequenceClosure<IModule>() {
        public Iterable<IModule> iterable() {
          return project.getModules();
        }
      })).translate(new ITranslator2<IModule, SNode>() {
        public Iterable<SNode> translate(IModule it) {
          return TestRunUtil.getModuleTests(it);
        }
      });
    }

    public String check(DefaultJUnit_Configuration configuration) {
      String errorReport = null;
      MPSProject mpsProject = MPSDataKeys.MPS_PROJECT.getData(DataManager.getInstance().getDataContext());
      if (mpsProject != null) {
        if (!(TestRunUtil.containsTest(mpsProject))) {
          errorReport = "project does not contain tests";
        }
      }
      return errorReport;
    }

  };

  JUnitRunTypes() {
  }

  public abstract Iterable<SNode> collect(DefaultJUnit_Configuration configuration, MPSProject project);

  public abstract String check(DefaultJUnit_Configuration cofiguration);
}

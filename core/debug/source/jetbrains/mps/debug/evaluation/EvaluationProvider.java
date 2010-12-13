/*
 * Copyright 2003-2010 JetBrains s.r.o.
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
package jetbrains.mps.debug.evaluation;

import com.intellij.openapi.project.Project;
import jetbrains.mps.debug.api.evaluation.IEvaluationProvider;
import jetbrains.mps.debug.evaluation.ui.*;
import jetbrains.mps.debug.runtime.DebugSession;
import jetbrains.mps.debug.runtime.JavaUiState;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.ModelAccess;
import org.jetbrains.annotations.NotNull;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.List;

public class EvaluationProvider implements IEvaluationProvider {
  private final DebugSession myDebugSession;
  private EvaluationAuxModule myAuxModule;
  private final List<AbstractEvaluationModel> myWatches = new ArrayList<AbstractEvaluationModel>();
  private final List<IWatchListener> myWatchListeners = new ArrayList<IWatchListener>();

  public EvaluationProvider(DebugSession debugSession) {
    myDebugSession = debugSession;
  }

  public void init() {
    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        myAuxModule = new EvaluationAuxModule(myDebugSession.getProject());
      }
    });
  }

  public void dispose(){
    myAuxModule.dispose();
    myAuxModule = null;
  }

  @Override
  public void showEvaluationDialog(IOperationContext context) {
    JavaUiState state = myDebugSession.getUiState();
    if (state.isPausedOnBreakpoint()) {
      EvaluationDialog evaluationDialog = new EvaluationDialog(context, this, createEvaluationLogic(context.getProject()));
      evaluationDialog.showDialog();
    }
  }

  @Override
  public JComponent createWatchesPanel() {
    return new JLabel("Here watches panel lies!");
  }

  public void watch(AbstractEvaluationModel evaluationModel) {
    myWatches.add(evaluationModel);
    fireUpdateWatches();
  }

  public DebugSession getDebugSession() {
    return myDebugSession;
  }

  public EvaluationAuxModule getAuxModule() {
    return myAuxModule;
  }

  public AbstractEvaluationModel createEvaluationLogic(Project project) {
    return createLowLevelEvaluationModel(project);
  }

  AbstractEvaluationModel createHighLevelEvaluationModel(Project project) {
    return new HighLevelEvaluationModel(project, myDebugSession, getAuxModule());
  }

  AbstractEvaluationModel createLowLevelEvaluationModel(Project project) {
    return new LowLevelEvaluationModel(project, myDebugSession, getAuxModule());
  }

  private void fireUpdateWatches() {
    for (IWatchListener listener : myWatchListeners) {
      listener.watchesUpdated();
    }
  }

  private void addWatchListener(@NotNull IWatchListener listener) {
    myWatchListeners.add(listener);
  }

  private void removeWatchListener(@NotNull IWatchListener listener) {
    myWatchListeners.remove(listener);
  }

  public interface IWatchListener {
    public void watchesUpdated();
  }
}

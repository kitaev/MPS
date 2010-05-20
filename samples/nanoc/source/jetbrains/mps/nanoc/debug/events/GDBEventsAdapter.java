package jetbrains.mps.nanoc.debug.events;

import jetbrains.mps.debug.executable.SimpleConsoleProcessHandler;
import jetbrains.mps.nanoc.debug.answer.AsyncAnswer;
import jetbrains.mps.nanoc.debug.answer.ResultAnswer;
import jetbrains.mps.nanoc.debug.answer.StreamAnswer;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 30.04.2010
 * Time: 21:03:26
 * To change this template use File | Settings | File Templates.
 */
public abstract class GDBEventsAdapter implements GDBEventsListener {
  @Override
  public void paused(AsyncAnswer answer, SimpleConsoleProcessHandler gdbProcess) {
  }

  @Override
  public void processTerminated(SimpleConsoleProcessHandler gdbProcess) {
  }

  @Override
  public void resultReceived(ResultAnswer result, List<StreamAnswer> receivedStreamAnswers, SimpleConsoleProcessHandler gdbProcess) {

  }

  @Override
  public void gdbProcessTerminated(SimpleConsoleProcessHandler processHandler) {
    
  }
}

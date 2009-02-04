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
package jetbrains.mps.nodeEditor;

import jetbrains.mps.intentions.IntentionProvider;
import jetbrains.mps.nodeEditor.MessageStatus;
import jetbrains.mps.typesystem.inference.IErrorTarget;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 18.03.2007
 * Time: 13:40:07
 * To change this template use File | Settings | File Templates.
 */
public interface IErrorReporter {
  public String reportError();
  public String getRuleId();
  public String getRuleModel();
  public MessageStatus getMessageStatus();
  public IntentionProvider getIntentionProvider();
  public void setIntentionProvider(IntentionProvider intentionProvider);
  public IErrorTarget getErrorTarget();
}

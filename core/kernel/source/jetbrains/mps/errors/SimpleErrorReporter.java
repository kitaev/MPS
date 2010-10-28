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
package jetbrains.mps.errors;

import jetbrains.mps.nodeEditor.MessageStatus;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;

public class SimpleErrorReporter extends AbstractErrorReporter implements IErrorReporter {
  private String myErrorString;
  private MessageStatus myMessageStatus = MessageStatus.ERROR;
  private IErrorTarget myErrorTarget = new NodeErrorTarget();
  private SNode mySNode;

  public SimpleErrorReporter(SNode node, String s, String ruleModel, String ruleId) {
    super(ruleModel, ruleId);
    myErrorString = s;
    mySNode = node;
  }

  public SimpleErrorReporter(SNode node, String s, String ruleModel, String ruleId, boolean isWarning) {
    this(node, s, ruleModel, ruleId);
    myMessageStatus = isWarning ? MessageStatus.WARNING : MessageStatus.ERROR;
  }

  public SimpleErrorReporter(SNode node, String s, String ruleModel, String ruleId, MessageStatus messageStatus, IErrorTarget errorTarget) {
    this(node, s, ruleModel, ruleId);
    myMessageStatus = messageStatus;
    myErrorTarget = errorTarget;
  }

  public String reportError() {
    return myErrorString;
  }

  public MessageStatus getMessageStatus() {
    return myMessageStatus;
  }

  public IErrorTarget getErrorTarget() {
    return myErrorTarget;
  }

  public SNode getSNode() {
    return mySNode;
  }
}

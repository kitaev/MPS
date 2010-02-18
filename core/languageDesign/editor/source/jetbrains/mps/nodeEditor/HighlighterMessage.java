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
package jetbrains.mps.nodeEditor;

import jetbrains.mps.nodeEditor.cells.*;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.ColorAndGraphicsUtil;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.nodeEditor.messageTargets.EditorMessageWithTarget;
import jetbrains.mps.nodeEditor.messageTargets.EditorMessageTarget;

import java.awt.Color;
import java.awt.Graphics;

public class HighlighterMessage extends EditorMessageWithTarget {
  private IErrorReporter myErrorReporter;

  public HighlighterMessage(SNode errorNode, MessageStatus status, EditorMessageTarget target, Color color, String string, EditorMessageOwner owner) {
    super(errorNode, status, target, color, string, owner);
  }

  public void setErrorReporter(IErrorReporter errorReporter) {
    myErrorReporter = errorReporter;
  }

  public IErrorReporter getErrorReporter() {
    return myErrorReporter;
  }

  @Override
  public boolean sameAs(EditorMessage message) {
    if (!(message instanceof HighlighterMessage)) {
      return false;
    }
    return super.sameAs(message);
  }

  public EditorCell getCellForParentNodeInMainEditor(EditorComponent editor) {
    if (getNode() == null) return null;
    if (!(editor instanceof NodeEditorComponent)) {
      return null;
    }
    SNode parent = getNode().getParent();
    EditorCell result = null;
    while (parent != null) {
      result = editor.getBigValidCellForNode(parent);
      if (result != null) {
        return result;
      }
      parent = parent.getParent();
    }
    return result;
  }

  public boolean isBackGround() {
    return isWarning();
  }

  private boolean isWarning() {
    return getStatus() == MessageStatus.WARNING;
  }

  public void paint(Graphics g, EditorComponent editorComponent, EditorCell cell) {
    paintDecorations(g, cell);
  }

  @Override
  public LocationOnCell getLocationOnCell() {
    if (isWarning()) {
      return LocationOnCell.CENTER;
    } else {
      return LocationOnCell.BOTTOM;
    }
  }

  private void paintDecorations(Graphics g, EditorCell cell) {
    if (cell == null) return;
    if (isWarning()) {
      cell.paintSelection(g, new Color(250, 247, 158), false);
    } else {
      ColorAndGraphicsUtil.drawWaveUnderCell(g, getColor(), cell);
    }
  }
}

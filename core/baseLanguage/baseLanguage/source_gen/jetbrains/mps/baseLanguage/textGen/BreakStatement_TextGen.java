package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class BreakStatement_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    this.appendNewLine();
    if (StringUtils.isNotEmpty(SPropertyOperations.getString(node, "label"))) {
      this.appendWithIndent("break ");
      this.append(SPropertyOperations.getString(node, "label"));
      this.append(";");
    } else {
      this.appendWithIndent("break;");
    }
  }
}

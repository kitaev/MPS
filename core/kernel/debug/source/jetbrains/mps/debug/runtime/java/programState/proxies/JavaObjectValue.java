package jetbrains.mps.debug.runtime.java.programState.proxies;

import com.sun.jdi.ArrayReference;
import com.sun.jdi.Field;
import com.sun.jdi.ObjectReference;
import com.sun.jdi.Value;
import jetbrains.mps.debug.api.programState.IWatchable;
import jetbrains.mps.debug.integration.Icons;
import jetbrains.mps.debug.runtime.java.programState.watchables.JavaArrayItem;
import jetbrains.mps.debug.runtime.java.programState.watchables.JavaField;

import javax.swing.Icon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 19.06.2010
 * Time: 16:51:12
 * To change this template use File | Settings | File Templates.
 */
public class JavaObjectValue extends JavaValue {
  public JavaObjectValue(Value value) {
    super(value);
  }

  @Override
  public List<IWatchable> getSubvalues() {
    List<IWatchable> watchables = new ArrayList<IWatchable>();
    ObjectReference ref = (ObjectReference) myValue;
    if(ref != null) {
      List<Field> fieldList = ref.referenceType().allFields();
      Collections.sort(fieldList, new Comparator<Field>() {
        @Override
        public int compare(Field o1, Field o2) {
          return o1.name().compareTo(o2.name());
        }
      });
      for (Field f : fieldList) {
        watchables.add(new JavaField(f, ref));
      }
    }
    return watchables;
  }

  @Override
  public Icon getPresentationIcon() {
    return Icons.VARIABLE_OBJECT;
  }

  @Override
  public boolean isStructure() {
    return true;
  }

  @Override
  public String getValuePresentation() {
    return ("{" + myValue.type().name() + "} ") + myValue.toString();
  }

  public JavaValue getFieldValue(String fieldName) {
    ObjectReference ref = (ObjectReference) myValue;
    Field field = ref.referenceType().fieldByName(fieldName);
    if (field == null) return null;
    return JavaValue.fromJDIValue(ref.getValue(field));
  }
}

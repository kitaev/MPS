package jetbrains.mps.intentions;

import jetbrains.mps.bootstrap.intentionsLanguage.constraints.IntentionDeclaration_Behavior;
import jetbrains.mps.bootstrap.intentionsLanguage.structure.IntentionDeclaration;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.ApplicationComponents;
import jetbrains.mps.smodel.*;
import jetbrains.mps.reloading.ClassLoaderManager;

import java.util.*;

public class IntentionsManager {
  public static final Logger LOG = Logger.getLogger(IntentionsManager.class);

  private Map<String, Set<Intention>> myIntentions = new HashMap<String, Set<Intention>>();

  public static IntentionsManager getInstance() {
    return ApplicationComponents.getInstance().getComponent(IntentionsManager.class);
  }

  public IntentionsManager() {
  }

  public Set<Intention> getAvailableIntentions(SNode node, IOperationContext context) {
    Set<Intention> result = new HashSet<Intention>();
    String conceptFqName = node.getConceptFqName();
    if (!myIntentions.containsKey(conceptFqName)){
      return Collections.unmodifiableSet(new HashSet<Intention>());
    }
    return Collections.unmodifiableSet(myIntentions.get(conceptFqName));
  }

  public void reload() {
    myIntentions.clear();
    for (Language l : MPSModuleRepository.getInstance().getAllLanguages()) {
      SModelDescriptor intentionsModelDescriptor = l.getIntentionsModelDescriptor();
      if (intentionsModelDescriptor != null ){
        SModel smodel = intentionsModelDescriptor.getSModel();
        for (IntentionDeclaration intentionDeclaration : smodel.getRootsAdapters(IntentionDeclaration.class)){
          String className = smodel.getUID().getLongName() + "." + IntentionDeclaration_Behavior.call_getGeneratedName_1193141280918(intentionDeclaration.getNode());
          String conceptName = IntentionDeclaration_Behavior.call_getConceptName_1193142194523(intentionDeclaration.getNode());
          try {
            Object intention = Class.forName(className, true, ClassLoaderManager.getInstance().getClassLoader()).newInstance();
            Set <Intention> intentions = myIntentions.get(conceptName);
            if (intentions == null){
              intentions = new HashSet<Intention>();
            }
            intentions.add((Intention)intention);
            myIntentions.put(conceptName,intentions);
          } catch (ClassNotFoundException e) {
            LOG.error("Intention is registered but isn't compiled",intentionDeclaration);
          } catch (Exception e){
            LOG.error(e, intentionDeclaration);
          }
        }
      }
    }
  }
}

package jetbrains.mps.ui.modeling.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.StructureDescriptor;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.smodel.structure.ConceptRegistry;

public class StructureAspectDescriptor extends DescriptorProvider<StructureDescriptor> {
  public StructureAspectDescriptor() {
  }

  public StructureDescriptor getDescriptor(String conceptFqName) {
    int hash = conceptFqName.hashCode();
    if (hash == -133672961) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.UIObject", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.ui.modeling.structure.HasTemplate");
    }
    if (hash == -694330731) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.UIProperty", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.ui.modeling.structure.HasTemplate");
    }
    if (hash == 1532659950) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.Event", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.ui.modeling.structure.HasTemplate");
    }
    if (hash == 1542975136) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.EventProducer", "jetbrains.mps.lang.core.structure.BaseConcept");
    }
    if (hash == -535065575) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.EditableUIProperty", "jetbrains.mps.ui.modeling.structure.UIProperty", "jetbrains.mps.ui.modeling.structure.HasTemplate");
    }
    if (hash == -209120871) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.UIObjectTemplate", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept");
    }
    if (hash == 956909030) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.UIPropertyAccessCode", "jetbrains.mps.lang.core.structure.BaseConcept");
    }
    if (hash == -82160780) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.UIPropertySetter", "jetbrains.mps.baseLanguage.structure.ConceptFunction");
    }
    if (hash == 412272592) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.ThisUIObjectParam", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter");
    }
    if (hash == -1343431811) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.PropertyValueParam", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter");
    }
    if (hash == -425710592) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.UIPropertyGetter", "jetbrains.mps.baseLanguage.structure.ConceptFunction");
    }
    if (hash == -1101720810) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.EventHandlerTemplate", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept");
    }
    if (hash == 565382013) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.ThisEventParam", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter");
    }
    if (hash == 1836627825) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.EventHandlerParam", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter");
    }
    if (hash == -1117168179) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.EventProducerParam", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter");
    }
    if (hash == 1839520097) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.EventHandlerSetup", "jetbrains.mps.baseLanguage.structure.ConceptFunction");
    }
    if (hash == 1553595619) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.EventProperty", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.ui.modeling.structure.HasTemplate");
    }
    if (hash == -817800242) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.EventPropertyGetter", "jetbrains.mps.baseLanguage.structure.ConceptFunction");
    }
    if (hash == -952375804) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.PropertyChangeHandlerSetup", "jetbrains.mps.baseLanguage.structure.ConceptFunction");
    }
    if (hash == -1993710998) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.EditableUIPropertyAccessCode", "jetbrains.mps.ui.modeling.structure.UIPropertyAccessCode");
    }
    if (hash == -955268076) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.PropertyChangeHandlerParam", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter");
    }
    if (hash == 1472630920) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.HasTemplate", "jetbrains.mps.lang.core.structure.INamedConcept");
    }
    if (hash == -1917183787) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.Container", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.ui.modeling.structure.HasTemplate");
    }
    if (hash == -1339579281) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.ContainerTemplate", "jetbrains.mps.lang.core.structure.BaseConcept");
    }
    if (hash == -2122563205) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.ItemUIObjectParam", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter");
    }
    if (hash == 1566609510) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.ContainerItemAdder", "jetbrains.mps.baseLanguage.structure.ConceptFunction", "jetbrains.mps.ui.modeling.structure.IAspectParameterHolder");
    }
    if (hash == -2025829365) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.UIObjectFactory", "jetbrains.mps.baseLanguage.structure.ConceptFunction");
    }
    if (hash == -1871420617) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.ContextUIObjectParam", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter");
    }
    if (hash == 2040465155) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.Context", "jetbrains.mps.lang.core.structure.BaseConcept");
    }
    if (hash == 803437841) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.AuxObjectTemplate", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept");
    }
    if (hash == 2024706451) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.AuxObjectFactory", "jetbrains.mps.baseLanguage.structure.ConceptFunction");
    }
    if (hash == -749897161) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.Auxillary", "jetbrains.mps.lang.core.structure.BaseConcept");
    }
    if (hash == -21453060) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.AuxObjectAccessOp", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.baseLanguage.structure.IOperation");
    }
    if (hash == 890725959) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.OverrideAnnotation", "jetbrains.mps.lang.core.structure.NodeAttribute");
    }
    if (hash == -1139407013) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.ChildAspectDefinition", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept");
    }
    if (hash == -132711914) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.ContainerItemIterator", "jetbrains.mps.baseLanguage.structure.ConceptFunction");
    }
    if (hash == 218124742) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.ContainerItemRemover", "jetbrains.mps.baseLanguage.structure.ConceptFunction");
    }
    if (hash == 775309199) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.BeforeUIObjectParam", "jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter");
    }
    if (hash == -773458226) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.ContainerItemInserter", "jetbrains.mps.baseLanguage.structure.ConceptFunction");
    }
    if (hash == -16933614) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.ContainerItemClearer", "jetbrains.mps.baseLanguage.structure.ConceptFunction");
    }
    if (hash == 1243242910) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.Geometry", "jetbrains.mps.lang.core.structure.BaseConcept");
    }
    if (hash == 620737238) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.ForceLayoutCode", "jetbrains.mps.baseLanguage.structure.ConceptFunction");
    }
    if (hash == 2125633613) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.HorizontalConstraint", "jetbrains.mps.lang.core.structure.BaseConcept");
    }
    if (hash == 647024671) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.VerticalConstraint", "jetbrains.mps.lang.core.structure.BaseConcept");
    }
    if (hash == -1173885485) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.LayoutConstraint", "jetbrains.mps.lang.core.structure.BaseConcept");
    }
    if (hash == 1980682157) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.LayoutConstraintType", "jetbrains.mps.baseLanguage.structure.Type");
    }
    if (hash == -1693421365) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.LayoutConstraintExpression", "jetbrains.mps.baseLanguage.structure.Expression");
    }
    if (hash == -1221672986) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.BoxLayoutConstraint", "jetbrains.mps.ui.modeling.structure.LayoutConstraint");
    }
    if (hash == -860234674) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.ExpressionWithUnit", "jetbrains.mps.baseLanguage.structure.Expression");
    }
    if (hash == -895429622) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.UnitType", "jetbrains.mps.baseLanguage.structure.Type");
    }
    if (hash == -2096595216) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.ApplyConstraintStatement", "jetbrains.mps.baseLanguage.structure.Statement");
    }
    if (hash == 557662549) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.CellLayoutConstraint", "jetbrains.mps.ui.modeling.structure.LayoutConstraint");
    }
    if (hash == 870451273) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.ColumnLayoutConstraint", "jetbrains.mps.lang.core.structure.BaseConcept");
    }
    if (hash == 1093336565) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.RowLayoutConstraint", "jetbrains.mps.lang.core.structure.BaseConcept");
    }
    if (hash == -533255434) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.UIAction", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.ui.modeling.structure.HasTemplate");
    }
    if (hash == 1245504003) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.UIActionCode", "jetbrains.mps.baseLanguage.structure.ConceptFunction");
    }
    if (hash == -925178626) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.AlignmentLayoutConstraint", "jetbrains.mps.ui.modeling.structure.LayoutConstraint");
    }
    if (hash == -837511327) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.VerticalAlignment", "jetbrains.mps.lang.core.structure.BaseConcept");
    }
    if (hash == -1482550925) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.HorizontalAlignment", "jetbrains.mps.lang.core.structure.BaseConcept");
    }
    if (hash == 251495887) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.AspectParameterDecl", "jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept");
    }
    if (hash == 2086336206) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.AspectParameterRef", "jetbrains.mps.baseLanguage.structure.Expression");
    }
    if (hash == 916875904) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.IAspectParameterHolder");
    }
    if (hash == 1967227654) {
      return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.ui.modeling.structure.IPartiallyDefinedStub");
    }
    return null;
  }

  public static class DataBasedStructureDescriptor extends StructureDescriptor {
    private ImmutableList<String> parents;
    private ImmutableSet<String> ancestors;

    public DataBasedStructureDescriptor(String fqName, String... parents) {
      this.parents = ImmutableList.copyOf(parents);
      this.ancestors = getAncestors(fqName, parents);
    }

    public Set<String> getAncestorsNames() {
      return ancestors;
    }

    public boolean isAssignableTo(String toConceptFqName) {
      return ancestors.contains(toConceptFqName);
    }

    public List<String> getParentsNames() {
      return parents;
    }

    private static ImmutableSet<String> getAncestors(String conceptFqName, String... parents) {
      List<String> result = new ArrayList();

      result.add(conceptFqName);
      ConceptRegistry registry = ConceptRegistry.getInstance();
      for (String parent : parents) {
        result.addAll(registry.getStructureDescriptor(parent).getAncestorsNames());
      }
      return ImmutableSet.copyOf(result);
    }
  }
}

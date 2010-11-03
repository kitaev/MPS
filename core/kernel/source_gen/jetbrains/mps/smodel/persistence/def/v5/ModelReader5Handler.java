package jetbrains.mps.smodel.persistence.def.v5;

/*Generated by MPS */

import org.xml.sax.helpers.DefaultHandler;
import java.util.Stack;
import org.xml.sax.Locator;
import jetbrains.mps.util.Pair;
import jetbrains.mps.smodel.SModel;
import java.util.List;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.smodel.SModelVersionsInfo;
import java.util.ArrayList;
import jetbrains.mps.smodel.persistence.def.IReferencePersister;
import jetbrains.mps.smodel.persistence.def.SAXVisibleModelElements;
import jetbrains.mps.internal.collections.runtime.backports.Deque;
import org.xml.sax.SAXException;
import org.xml.sax.Attributes;
import org.xml.sax.SAXParseException;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.DequeSequence;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.persistence.def.v4.VersionUtil;
import jetbrains.mps.smodel.persistence.def.v4.ReferencePersister4;

public class ModelReader5Handler extends DefaultHandler {
  private static String[] EMPTY_ARRAY = new String[0];

  private ModelReader5Handler.modelElementHandler modelhandler = new ModelReader5Handler.modelElementHandler();
  private ModelReader5Handler.persistenceElementHandler persistencehandler = new ModelReader5Handler.persistenceElementHandler();
  private ModelReader5Handler.maxImportIndexElementHandler maxImportIndexhandler = new ModelReader5Handler.maxImportIndexElementHandler();
  private ModelReader5Handler.languageAspectElementHandler languageAspecthandler = new ModelReader5Handler.languageAspectElementHandler();
  private ModelReader5Handler.tag_with_namespaceElementHandler tag_with_namespacehandler = new ModelReader5Handler.tag_with_namespaceElementHandler();
  private ModelReader5Handler.importElementHandler importhandler = new ModelReader5Handler.importElementHandler();
  private ModelReader5Handler.nodeElementHandler nodehandler = new ModelReader5Handler.nodeElementHandler();
  private ModelReader5Handler.propertyElementHandler propertyhandler = new ModelReader5Handler.propertyElementHandler();
  private ModelReader5Handler.linkElementHandler linkhandler = new ModelReader5Handler.linkElementHandler();
  private ModelReader5Handler.visibleElementHandler visiblehandler = new ModelReader5Handler.visibleElementHandler();
  private Stack<ModelReader5Handler.ElementHandler> myHandlersStack = new Stack<ModelReader5Handler.ElementHandler>();
  private Stack<Object> myValues = new Stack<Object>();
  private Locator myLocator;
  private Pair<SModel, List<SNodeId>> myResult;
  private SModelVersionsInfo fieldversionsInfo;
  private ArrayList<IReferencePersister> fieldreferenceDescriptors;
  private SAXVisibleModelElements fieldvisibleModelElements;
  private SModel fieldmodel;
  private Deque<SNodeId> fieldnodeIdStack;
  private List<SNodeId> fieldlineToIdMap;
  private boolean fieldnodeEnded;

  public ModelReader5Handler() {
  }

  public Pair<SModel, List<SNodeId>> getResult() {
    return myResult;
  }

  @Override
  public void setDocumentLocator(Locator locator) {
    myLocator = locator;
  }

  @Override
  public void characters(char[] array, int start, int len) throws SAXException {
    globalHandleText(myValues.firstElement(), new String(array, start, len));
    ModelReader5Handler.ElementHandler current = (myHandlersStack.empty() ?
      (ModelReader5Handler.ElementHandler) null :
      myHandlersStack.peek()
    );
    if (current != null) {
      current.handleText(myValues.peek(), new String(array, start, len));
    }
  }

  @Override
  public void endElement(String uri, String localName, String qName) throws SAXException {
    ModelReader5Handler.ElementHandler current = myHandlersStack.pop();
    Object childValue = myValues.pop();
    if (current != null) {
      current.validate(childValue);
      ModelReader5Handler.ElementHandler parent = (myHandlersStack.empty() ?
        (ModelReader5Handler.ElementHandler) null :
        myHandlersStack.peek()
      );
      if (parent != null) {
        parent.handleChild(myValues.peek(), qName, childValue);
      } else {
        myResult = (Pair<SModel, List<SNodeId>>) childValue;
      }
    }
  }

  @Override
  public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
    ModelReader5Handler.ElementHandler current = (myHandlersStack.empty() ?
      (ModelReader5Handler.ElementHandler) null :
      myHandlersStack.peek()
    );
    if (current == null) {
      // root 
      current = modelhandler;
    } else {
      current = current.createChild(qName);
    }

    // check required 
    for (String attr : current.requiredAttributes()) {
      if (attributes.getValue(attr) == null) {
        throw new SAXParseException("attribute " + attr + " is absent", null);
      }
    }

    Object result = current.createObject(attributes);

    // handle attributes 
    for (int i = 0; i < attributes.getLength(); i++) {
      String name = attributes.getQName(i);
      String value = attributes.getValue(i);
      current.handleAttribute(result, name, value);
    }
    myHandlersStack.push(current);
    myValues.push(result);
  }

  public void globalHandleText(Object resultObject, String value) {
    Pair<SModel, List<SNodeId>> result = (Pair<SModel, List<SNodeId>>) resultObject;
    for (int i = 0; i < StringUtils.countMatches(value, "\n"); i++) {
      int line = myLocator.getLineNumber() - 1;
      while (line > ListSequence.fromList(fieldlineToIdMap).count()) {
        ListSequence.fromList(fieldlineToIdMap).addElement(DequeSequence.fromDeque(fieldnodeIdStack).peekElement());
        if (fieldnodeEnded) {
          DequeSequence.fromDeque(fieldnodeIdStack).popElement();
          fieldnodeEnded = false;
        }
      }
    }
  }

  private class ElementHandler {
    private ElementHandler() {
    }

    protected Object createObject(Attributes attrs) {
      return null;
    }

    protected void handleAttribute(Object resultObject, String name, String value) throws SAXParseException {
    }

    protected ModelReader5Handler.ElementHandler createChild(String tagName) throws SAXParseException {
      throw new SAXParseException("unknown tag: " + tagName, null);
    }

    protected void handleChild(Object resultObject, String tagName, Object value) throws SAXParseException {
      throw new SAXParseException("unknown child: " + tagName, null);
    }

    protected void handleText(Object resultObject, String value) throws SAXParseException {
      if (value.trim().length() == 0) {
        return;
      }
      throw new SAXParseException("text is not accepted", null);
    }

    protected String[] requiredAttributes() {
      return ModelReader5Handler.EMPTY_ARRAY;
    }

    protected void validate(Object resultObject) throws SAXParseException {
    }
  }

  public class modelElementHandler extends ModelReader5Handler.ElementHandler {
    private String[] requiredAttributes = new String[]{"modelUID"};

    public modelElementHandler() {
    }

    @Override
    protected Pair<SModel, List<SNodeId>> createObject(Attributes attrs) {
      fieldversionsInfo = new SModelVersionsInfo();
      fieldreferenceDescriptors = new ArrayList<IReferencePersister>();
      fieldvisibleModelElements = new SAXVisibleModelElements();
      fieldmodel = new SModel(SModelReference.fromString(attrs.getValue("modelUID")));
      fieldnodeIdStack = DequeSequence.fromDeque(new LinkedList<SNodeId>());
      fieldlineToIdMap = ListSequence.fromList(new ArrayList<SNodeId>());
      fieldnodeEnded = false;
      fieldmodel.setPersistenceVersion(5);
      fieldmodel.setLoading(true);
      return new Pair<SModel, List<SNodeId>>(fieldmodel, fieldlineToIdMap);
    }

    @Override
    protected String[] requiredAttributes() {
      return requiredAttributes;
    }

    @Override
    protected void handleAttribute(Object resultObject, String name, String value) throws SAXParseException {
      Pair<SModel, List<SNodeId>> result = (Pair<SModel, List<SNodeId>>) resultObject;
      if ("modelUID".equals(name)) {
        return;
      }
      super.handleAttribute(resultObject, name, value);
    }

    @Override
    protected ModelReader5Handler.ElementHandler createChild(String tagName) throws SAXParseException {
      if ("persistence".equals(tagName)) {
        return persistencehandler;
      }
      if ("maxImportIndex".equals(tagName)) {
        return maxImportIndexhandler;
      }
      if ("languageAspect".equals(tagName)) {
        return languageAspecthandler;
      }
      if ("language".equals(tagName)) {
        return tag_with_namespacehandler;
      }
      if ("language-engaged-on-generation".equals(tagName)) {
        return tag_with_namespacehandler;
      }
      if ("devkit".equals(tagName)) {
        return tag_with_namespacehandler;
      }
      if ("import".equals(tagName)) {
        return importhandler;
      }
      if ("node".equals(tagName)) {
        return nodehandler;
      }
      if ("visible".equals(tagName)) {
        return visiblehandler;
      }
      return super.createChild(tagName);
    }

    @Override
    protected void handleChild(Object resultObject, String tagName, Object value) throws SAXParseException {
      Pair<SModel, List<SNodeId>> result = (Pair<SModel, List<SNodeId>>) resultObject;
      if ("persistence".equals(tagName)) {
        return;
      }
      if ("maxImportIndex".equals(tagName)) {
        Integer child = (Integer) value;
        if (child > result.o1.getMaxImportIndex()) {
          result.o1.setMaxImportIndex(child);
        }
        return;
      }
      if ("languageAspect".equals(tagName)) {
        String[] child = (String[]) value;
        int version = Integer.parseInt(child[1]);
        result.o1.addAdditionalModelVersion(ModelUtil.upgradeModelUID(SModelReference.fromString(child[0])), version);
        return;
      }
      if ("language".equals(tagName)) {
        String child = (String) value;
        result.o1.addLanguage(ModuleReference.fromString(child));
        return;
      }
      if ("language-engaged-on-generation".equals(tagName)) {
        String child = (String) value;
        result.o1.addEngagedOnGenerationLanguage(ModuleReference.fromString(child));
        return;
      }
      if ("devkit".equals(tagName)) {
        String child = (String) value;
        result.o1.addDevKit(ModuleReference.fromString(child));
        return;
      }
      if ("import".equals(tagName)) {
        SModel.ImportElement child = (SModel.ImportElement) value;
        if (child.getReferenceID() > result.o1.getMaxImportIndex()) {
          result.o1.setMaxImportIndex(child.getReferenceID());
        }
        result.o1.addModelImport(child);
        return;
      }
      if ("node".equals(tagName)) {
        SNode child = (SNode) value;
        if (child != null) {
          result.o1.addRoot(child);
        }
        return;
      }
      if ("visible".equals(tagName)) {
        return;
      }
      super.handleChild(resultObject, tagName, value);
    }

    @Override
    protected void validate(Object resultObject) throws SAXParseException {
      if (!(validateInternal((Pair<SModel, List<SNodeId>>) resultObject))) {
        throw new SAXParseException("missing tags", null);
      }
    }

    private boolean validateInternal(Pair<SModel, List<SNodeId>> result) throws SAXParseException {
      for (IReferencePersister referencePersister : fieldreferenceDescriptors) {
        referencePersister.createReferenceInModel(result.o1, fieldvisibleModelElements);
      }
      result.o1.setLoading(false);
      return true;
    }
  }

  public class persistenceElementHandler extends ModelReader5Handler.ElementHandler {
    private String[] requiredAttributes = new String[]{"version"};

    public persistenceElementHandler() {
    }

    @Override
    protected Integer createObject(Attributes attrs) {
      return Integer.parseInt(attrs.getValue("version"));
    }

    @Override
    protected String[] requiredAttributes() {
      return requiredAttributes;
    }

    @Override
    protected void handleAttribute(Object resultObject, String name, String value) throws SAXParseException {
      Integer result = (Integer) resultObject;
      if ("version".equals(name)) {
        return;
      }
      super.handleAttribute(resultObject, name, value);
    }
  }

  public class maxImportIndexElementHandler extends ModelReader5Handler.ElementHandler {
    private String[] requiredAttributes = new String[]{"value"};

    public maxImportIndexElementHandler() {
    }

    @Override
    protected Integer createObject(Attributes attrs) {
      return Integer.parseInt(attrs.getValue("value"));
    }

    @Override
    protected String[] requiredAttributes() {
      return requiredAttributes;
    }

    @Override
    protected void handleAttribute(Object resultObject, String name, String value) throws SAXParseException {
      Integer result = (Integer) resultObject;
      if ("value".equals(name)) {
        return;
      }
      super.handleAttribute(resultObject, name, value);
    }
  }

  public class languageAspectElementHandler extends ModelReader5Handler.ElementHandler {
    private String[] requiredAttributes = new String[]{"modelUID", "version"};

    public languageAspectElementHandler() {
    }

    @Override
    protected String[] createObject(Attributes attrs) {
      return new String[]{attrs.getValue("modelUID"), attrs.getValue("version")};
    }

    @Override
    protected String[] requiredAttributes() {
      return requiredAttributes;
    }

    @Override
    protected void handleAttribute(Object resultObject, String name, String value) throws SAXParseException {
      String[] result = (String[]) resultObject;
      if ("modelUID".equals(name)) {
        return;
      }
      if ("version".equals(name)) {
        return;
      }
      super.handleAttribute(resultObject, name, value);
    }
  }

  public class tag_with_namespaceElementHandler extends ModelReader5Handler.ElementHandler {
    private String[] requiredAttributes = new String[]{"namespace"};

    public tag_with_namespaceElementHandler() {
    }

    @Override
    protected String createObject(Attributes attrs) {
      return attrs.getValue("namespace");
    }

    @Override
    protected String[] requiredAttributes() {
      return requiredAttributes;
    }

    @Override
    protected void handleAttribute(Object resultObject, String name, String value) throws SAXParseException {
      String result = (String) resultObject;
      if ("namespace".equals(name)) {
        return;
      }
      super.handleAttribute(resultObject, name, value);
    }
  }

  public class importElementHandler extends ModelReader5Handler.ElementHandler {
    private String[] requiredAttributes = new String[]{"index", "version", "modelUID"};

    public importElementHandler() {
    }

    @Override
    protected SModel.ImportElement createObject(Attributes attrs) {
      int indexValue = Integer.parseInt(attrs.getValue("index"));
      int versionValue = Integer.parseInt(attrs.getValue("version"));
      return new SModel.ImportElement(ModelUtil.upgradeModelUID(SModelReference.fromString(attrs.getValue("modelUID"))), indexValue, versionValue);
    }

    @Override
    protected String[] requiredAttributes() {
      return requiredAttributes;
    }

    @Override
    protected void handleAttribute(Object resultObject, String name, String value) throws SAXParseException {
      SModel.ImportElement result = (SModel.ImportElement) resultObject;
      if ("index".equals(name)) {
        return;
      }
      if ("version".equals(name)) {
        return;
      }
      if ("modelUID".equals(name)) {
        return;
      }
      super.handleAttribute(resultObject, name, value);
    }
  }

  public class nodeElementHandler extends ModelReader5Handler.ElementHandler {
    private String[] requiredAttributes = new String[]{"type"};

    public nodeElementHandler() {
    }

    @Override
    protected SNode createObject(Attributes attrs) {
      String rawFqName = attrs.getValue("type");
      String conceptFQName = VersionUtil.getConceptFQName(rawFqName);
      SNode node = new SNode(fieldmodel, conceptFQName);
      VersionUtil.fetchConceptVersion(rawFqName, node, fieldversionsInfo);
      return node;
    }

    @Override
    protected String[] requiredAttributes() {
      return requiredAttributes;
    }

    @Override
    protected void handleAttribute(Object resultObject, String name, String value) throws SAXParseException {
      SNode result = (SNode) resultObject;
      if ("type".equals(name)) {
        return;
      }
      if ("role".equals(name)) {
        result.setRoleInParent(VersionUtil.getRole(value));
        VersionUtil.fetchChildNodeRoleVersion(value, result, fieldversionsInfo);
        return;
      }
      if ("id".equals(name)) {
        SNodeId id = SNodeId.fromString(value);
        if (id == null) {
          throw new SAXParseException("bad node ID", null);
        }
        DequeSequence.fromDeque(fieldnodeIdStack).pushElement(id);
        result.setId(id);
        return;
      }
      super.handleAttribute(resultObject, name, value);
    }

    @Override
    protected ModelReader5Handler.ElementHandler createChild(String tagName) throws SAXParseException {
      if ("property".equals(tagName)) {
        return propertyhandler;
      }
      if ("link".equals(tagName)) {
        return linkhandler;
      }
      if ("node".equals(tagName)) {
        return nodehandler;
      }
      return super.createChild(tagName);
    }

    @Override
    protected void handleChild(Object resultObject, String tagName, Object value) throws SAXParseException {
      SNode result = (SNode) resultObject;
      if ("property".equals(tagName)) {
        String[] child = (String[]) value;
        if (child[1] != null) {
          result.setProperty(VersionUtil.getPropertyName(child[0], result, fieldversionsInfo), child[1]);
        }
        return;
      }
      if ("link".equals(tagName)) {
        String[] child = (String[]) value;
        ReferencePersister4 rp = new ReferencePersister4();
        rp.fillFields(child[0], child[1], child[2], result, false, fieldversionsInfo);
        fieldreferenceDescriptors.add(rp);
        return;
      }
      if ("node".equals(tagName)) {
        SNode child = (SNode) value;
        result.addChild(child.getRole_(), child);
        fieldnodeEnded = true;
        return;
      }
      super.handleChild(resultObject, tagName, value);
    }
  }

  public class propertyElementHandler extends ModelReader5Handler.ElementHandler {
    private String[] requiredAttributes = new String[]{"name"};

    public propertyElementHandler() {
    }

    @Override
    protected String[] createObject(Attributes attrs) {
      return new String[]{attrs.getValue("name"), null};
    }

    @Override
    protected String[] requiredAttributes() {
      return requiredAttributes;
    }

    @Override
    protected void handleAttribute(Object resultObject, String name, String value) throws SAXParseException {
      String[] result = (String[]) resultObject;
      if ("name".equals(name)) {
        return;
      }
      if ("value".equals(name)) {
        result[1] = value;
        return;
      }
      super.handleAttribute(resultObject, name, value);
    }
  }

  public class linkElementHandler extends ModelReader5Handler.ElementHandler {
    private String[] requiredAttributes = new String[]{};

    public linkElementHandler() {
    }

    @Override
    protected String[] createObject(Attributes attrs) {
      return new String[]{null, null, null};
    }

    @Override
    protected void handleAttribute(Object resultObject, String name, String value) throws SAXParseException {
      String[] result = (String[]) resultObject;
      if ("role".equals(name)) {
        result[0] = value;
        return;
      }
      if ("resolveInfo".equals(name)) {
        result[1] = value;
        return;
      }
      if ("targetNodeId".equals(name)) {
        result[2] = value;
        return;
      }
      super.handleAttribute(resultObject, name, value);
    }
  }

  public class visibleElementHandler extends ModelReader5Handler.ElementHandler {
    private String[] requiredAttributes = new String[]{"index", "modelUID"};

    public visibleElementHandler() {
    }

    @Override
    protected Object createObject(Attributes attrs) {
      fieldvisibleModelElements.addVisible(Integer.parseInt(attrs.getValue("index")), attrs.getValue("modelUID"));
      return null;
    }

    @Override
    protected String[] requiredAttributes() {
      return requiredAttributes;
    }

    @Override
    protected void handleAttribute(Object resultObject, String name, String value) throws SAXParseException {
      Object result = (Object) resultObject;
      if ("index".equals(name)) {
        return;
      }
      if ("modelUID".equals(name)) {
        return;
      }
      super.handleAttribute(resultObject, name, value);
    }
  }
}

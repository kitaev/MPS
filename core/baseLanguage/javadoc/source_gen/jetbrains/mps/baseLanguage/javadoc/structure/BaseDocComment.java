package jetbrains.mps.baseLanguage.javadoc.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BaseDocComment extends BaseConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.javadoc.structure.BaseDocComment";
  public static final String DEPRECATED = "deprecated";
  public static final String BODY = "body";
  public static final String AUTHOR = "author";
  public static final String SINCE = "since";
  public static final String VERSION = "version";
  public static final String SEE = "see";

  public BaseDocComment(SNode node) {
    super(node);
  }

  public DeprecatedBlockDocTag getDeprecated() {
    return (DeprecatedBlockDocTag)this.getChild(DeprecatedBlockDocTag.class, BaseDocComment.DEPRECATED);
  }

  public void setDeprecated(DeprecatedBlockDocTag node) {
    super.setChild(BaseDocComment.DEPRECATED, node);
  }

  public int getBodiesCount() {
    return this.getChildCount(BaseDocComment.BODY);
  }

  public Iterator<CommentLine> bodies() {
    return this.children(CommentLine.class, BaseDocComment.BODY);
  }

  public List<CommentLine> getBodies() {
    return this.getChildren(CommentLine.class, BaseDocComment.BODY);
  }

  public void addBody(CommentLine node) {
    this.addChild(BaseDocComment.BODY, node);
  }

  public void insertBody(CommentLine prev, CommentLine node) {
    this.insertChild(prev, BaseDocComment.BODY, node);
  }

  public int getAuthorsCount() {
    return this.getChildCount(BaseDocComment.AUTHOR);
  }

  public Iterator<AuthorBlockDocTag> authors() {
    return this.children(AuthorBlockDocTag.class, BaseDocComment.AUTHOR);
  }

  public List<AuthorBlockDocTag> getAuthors() {
    return this.getChildren(AuthorBlockDocTag.class, BaseDocComment.AUTHOR);
  }

  public void addAuthor(AuthorBlockDocTag node) {
    this.addChild(BaseDocComment.AUTHOR, node);
  }

  public void insertAuthor(AuthorBlockDocTag prev, AuthorBlockDocTag node) {
    this.insertChild(prev, BaseDocComment.AUTHOR, node);
  }

  public int getSincesCount() {
    return this.getChildCount(BaseDocComment.SINCE);
  }

  public Iterator<SinceBlockDocTag> sinces() {
    return this.children(SinceBlockDocTag.class, BaseDocComment.SINCE);
  }

  public List<SinceBlockDocTag> getSinces() {
    return this.getChildren(SinceBlockDocTag.class, BaseDocComment.SINCE);
  }

  public void addSince(SinceBlockDocTag node) {
    this.addChild(BaseDocComment.SINCE, node);
  }

  public void insertSince(SinceBlockDocTag prev, SinceBlockDocTag node) {
    this.insertChild(prev, BaseDocComment.SINCE, node);
  }

  public int getVersionsCount() {
    return this.getChildCount(BaseDocComment.VERSION);
  }

  public Iterator<VersionBlockDocTag> versions() {
    return this.children(VersionBlockDocTag.class, BaseDocComment.VERSION);
  }

  public List<VersionBlockDocTag> getVersions() {
    return this.getChildren(VersionBlockDocTag.class, BaseDocComment.VERSION);
  }

  public void addVersion(VersionBlockDocTag node) {
    this.addChild(BaseDocComment.VERSION, node);
  }

  public void insertVersion(VersionBlockDocTag prev, VersionBlockDocTag node) {
    this.insertChild(prev, BaseDocComment.VERSION, node);
  }

  public int getSeesCount() {
    return this.getChildCount(BaseDocComment.SEE);
  }

  public Iterator<SeeBlockDocTag> sees() {
    return this.children(SeeBlockDocTag.class, BaseDocComment.SEE);
  }

  public List<SeeBlockDocTag> getSees() {
    return this.getChildren(SeeBlockDocTag.class, BaseDocComment.SEE);
  }

  public void addSee(SeeBlockDocTag node) {
    this.addChild(BaseDocComment.SEE, node);
  }

  public void insertSee(SeeBlockDocTag prev, SeeBlockDocTag node) {
    this.insertChild(prev, BaseDocComment.SEE, node);
  }

  public static BaseDocComment newInstance(SModel sm, boolean init) {
    return (BaseDocComment)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.javadoc.structure.BaseDocComment", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BaseDocComment newInstance(SModel sm) {
    return BaseDocComment.newInstance(sm, false);
  }
}

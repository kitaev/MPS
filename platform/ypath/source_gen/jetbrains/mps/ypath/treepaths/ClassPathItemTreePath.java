package jetbrains.mps.ypath.treepaths;

/*Generated by MPS */

import jetbrains.mps.ypath.runtime.TreePath;
import jetbrains.mps.reloading.IClassPathItem;
import jetbrains.mps.reloading.CompositeClassPathItem;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.ypath.runtime.IFilter;
import jetbrains.mps.reloading.FileClassPathItem;
import jetbrains.mps.reloading.JarFileClassPathItem;

public class ClassPathItemTreePath extends TreePath<IClassPathItem> {
  public ClassPathItemTreePath() {
  }

  public IClassPathItem parent(IClassPathItem node) {
    return ClassPathItemTreePath.Parent.parent(node);
  }

  public Iterable<IClassPathItem> children(IClassPathItem n) {
    return ClassPathItemTreePath.Children.children(n);
  }

  private static class Parent {
    public static IClassPathItem parent(IClassPathItem node) {
      throw new UnsupportedOperationException();
    }
  }

  private static class Children {
    public static Iterable<IClassPathItem> children(IClassPathItem node) {
      if (node instanceof CompositeClassPathItem) {
        return ((CompositeClassPathItem)node).getChildren();
      } else {
        return ListSequence.fromList(new ArrayList<IClassPathItem>());
      }
    }
  }

  public static class COMPOSITE_NodeKindTrigger implements IFilter<IClassPathItem> {
    private static ClassPathItemTreePath.COMPOSITE_NodeKindTrigger instance;

    private COMPOSITE_NodeKindTrigger() {
    }

    public boolean accept(IClassPathItem node) {
      return node instanceof CompositeClassPathItem;
    }

    public static IFilter<IClassPathItem> getInstance() {
      if (instance == null) {
        instance = new ClassPathItemTreePath.COMPOSITE_NodeKindTrigger();
      }
      return instance;
    }
  }

  public static class FILE_NodeKindTrigger implements IFilter<IClassPathItem> {
    private static ClassPathItemTreePath.FILE_NodeKindTrigger instance;

    private FILE_NodeKindTrigger() {
    }

    public boolean accept(IClassPathItem node) {
      return node instanceof FileClassPathItem;
    }

    public static IFilter<IClassPathItem> getInstance() {
      if (instance == null) {
        instance = new ClassPathItemTreePath.FILE_NodeKindTrigger();
      }
      return instance;
    }
  }

  public static class JAR_NodeKindTrigger implements IFilter<IClassPathItem> {
    private static ClassPathItemTreePath.JAR_NodeKindTrigger instance;

    private JAR_NodeKindTrigger() {
    }

    public boolean accept(IClassPathItem node) {
      return node instanceof JarFileClassPathItem;
    }

    public static IFilter<IClassPathItem> getInstance() {
      if (instance == null) {
        instance = new ClassPathItemTreePath.JAR_NodeKindTrigger();
      }
      return instance;
    }
  }
}

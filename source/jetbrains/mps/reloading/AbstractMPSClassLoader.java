package jetbrains.mps.reloading;

import jetbrains.mps.util.NodeNameUtil;

import java.util.*;

public abstract class AbstractMPSClassLoader extends ClassLoader {
  private Map<String, Class> myCache = new HashMap<String, Class>();

  public AbstractMPSClassLoader(ClassLoader classLoader) {
    super(classLoader);
  }

  protected abstract byte[] findClassBytes(String name);

  protected abstract boolean isExcluded(String name);

  protected synchronized Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
    Class c = myCache.get(name);
    if (c == null) {
      byte[] bytes = findClassBytes(name);

      if (bytes == null || isExcluded(name)) {
        c = getParent().loadClass(name);
        if (resolve) {
          resolveClass(c);
        }
      } else {
        definePackageIfNecessary(name);
        c = defineClass(name, bytes, 0, bytes.length);
      }
      myCache.put(name, c);
    }
    if (resolve) {
      resolveClass(c);
    }
    return c;
  }


  private void definePackageIfNecessary(String name) {
    String pack = NodeNameUtil.getNamespace(name);
    if (getPackage(pack) == null) {
      definePackage(pack, null, null, null, null, null, null, null);
    }
  }
                                

}

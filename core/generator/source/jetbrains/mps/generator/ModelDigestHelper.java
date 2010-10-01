package jetbrains.mps.generator;

import jetbrains.mps.generator.impl.dependencies.ModelDigestUtil;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.vfs.IFile;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Evgeny Gryaznov, Jun 2, 2010
 */
public class ModelDigestHelper {

  public static final String HEADER = "header";
  public static final String  FILE = "model";

  private static ModelDigestHelper ourInstance = new ModelDigestHelper();
  private List<DigestProvider> myProviders = new CopyOnWriteArrayList<DigestProvider>();

  public static ModelDigestHelper getInstance() {
    return ourInstance;
  }

  private ModelDigestHelper() {
  }

  public void addDigestProvider(DigestProvider provider) {
    myProviders.add(provider);
  }

  public Map<String, String> getGenerationHashes(SModelDescriptor sm, IOperationContext operationContext) {
    return getGenerationHashes(sm, operationContext, false);
  }

  public Map<String, String> getGenerationHashes(SModelDescriptor sm, IOperationContext operationContext, boolean useCacheOnly) {
    if (!(sm instanceof EditableSModelDescriptor)) return null;
    EditableSModelDescriptor esm = (EditableSModelDescriptor) sm;
    if (esm.isPackaged()) return null;
    if (SModelStereotype.isStubModelStereotype(sm.getStereotype())) return null;

    IFile modelFile = esm.getModelFile();
    if (modelFile == null) return null;

    for (DigestProvider p : myProviders) {
      Map<String, String> result = p.getGenerationHashes(operationContext, modelFile);
      if (result != null) {
        return result;
      }
    }

    if(useCacheOnly) {
      return null;
    }

    return ModelDigestUtil.calculateHashes(modelFile);
  }

  public static String hash(byte[] content) {
    return ModelDigestUtil.hash(content);
  }

  public static Map<String, String> getDigestMap(byte[] modelBytes) {
    return ModelDigestUtil.getDigestMap(modelBytes);
  }

  public interface DigestProvider {
    Map<String, String> getGenerationHashes(IOperationContext operationContext, @NotNull IFile f);
  }
}

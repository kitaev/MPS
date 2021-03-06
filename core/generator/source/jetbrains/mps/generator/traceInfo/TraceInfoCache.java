/*
 * Copyright 2003-2011 JetBrains s.r.o.
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
package jetbrains.mps.generator.traceInfo;

import com.intellij.ide.plugins.IdeaPluginDescriptor;
import com.intellij.ide.plugins.PluginManager;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.extensions.PluginId;
import jetbrains.mps.InternalFlag;
import jetbrains.mps.cleanup.CleanupListener;
import jetbrains.mps.cleanup.CleanupManager;
import jetbrains.mps.generator.GenerationStatus;
import jetbrains.mps.generator.cache.XmlBasedModelCache;
import jetbrains.mps.reloading.ClassLoaderManager;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.traceInfo.DebugInfo;
import org.jdom.Element;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.io.InputStream;

public class TraceInfoCache extends XmlBasedModelCache<DebugInfo> {
  public static final String TRACE_FILE_NAME = "trace.info";
  private final CleanupManager myCleanupManager;

  public TraceInfoCache(SModelRepository modelRepository, CleanupManager cleanupManager) {
    super(modelRepository);
    myCleanupManager = cleanupManager;
  }

  public static TraceInfoCache getInstance() {
    return ApplicationManager.getApplication().getComponent(TraceInfoCache.class);
  }

  @NonNls
  @NotNull
  public String getComponentName() {
    return "Debug Info Cache";
  }

  @Override
  public void initComponent() {
    super.initComponent();
    myCleanupManager.addCleanupListener(new CleanupListener() {
      public void performCleanup() {
        cleanup();
      }
    });
  }

  public String getCacheFileName() {
    return TRACE_FILE_NAME;
  }

  protected DebugInfo generateCache(GenerationStatus status) {
    return status.getDebugInfo();
  }

  @Override
  protected DebugInfo readCache(SModelDescriptor sm) {
    ClassLoader classLoader = ClassLoaderManager.getInstance().getClassLoaderFor(sm.getModule(), false);
    if (classLoader == null) {
      return null;
    }
    DebugInfo info = getCacheFromClassloader(sm, classLoader);
    if (info == null) {
      if (InternalFlag.isInternalMode() && !(sm.getModule().isCompileInMPS())) {
        for (IdeaPluginDescriptor plugin : PluginManager.getPlugins()) {
          info = TraceInfoCache.getInstance().getCacheFromClassloader(sm, plugin.getPluginClassLoader());
          if (info != null) {
            return info;
          }
        }
      }
    }
    return info;
  }

  public DebugInfo getCacheFromClassloader(@NotNull SModelDescriptor sm, @NotNull ClassLoader classLoader) {
    InputStream stream = classLoader.getResourceAsStream(sm.getLongName().replace(".", "/") + "/" + TRACE_FILE_NAME);
    if (stream == null) {
      return null;
    }
    try {
      return load(stream);
    } catch (IOException e) {
      return null;
    }
  }

  @Override
  protected boolean isCache() {
    return false;
  }

  @Override
  protected Element toXml(DebugInfo debugInfo) {
    return debugInfo.toXml();
  }

  @Override
  protected DebugInfo fromXml(Element e) {
    return DebugInfo.fromXml(e);
  }
}

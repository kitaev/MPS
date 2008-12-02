/*
 * Copyright 2003-2008 JetBrains s.r.o.
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
package jetbrains.mps.typesystem.inference;

/**
 * Created by IntelliJ IDEA.
 * User: User
 * Date: 19.11.2008
 * Time: 14:21:52
 * To change this template use File | Settings | File Templates.
 */
public class NodeErrorTarget implements IErrorTarget {
  public ErrorTargetEnum getTarget() {
    return ErrorTargetEnum.NODE;
  }

  public String getRole() {
    return null;
  }

  public boolean sameAs(IErrorTarget errorTarget) {
    return errorTarget instanceof NodeErrorTarget;
  }
}

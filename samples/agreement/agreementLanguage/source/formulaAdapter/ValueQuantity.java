/*
 * Copyright 2003-2009 JetBrains s.r.o.
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
package formulaAdapter;

import jetbrains.mps.samples.formulaLanguage.api.Function;
import mf.Quantity;
import postingrules.AccountingEvent;

/**
 * Created by IntelliJ IDEA.
 * User: Igoor
 * Date: Apr 5, 2005
 * Time: 12:39:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class ValueQuantity implements Function<Quantity> {
  private String myValueName;

  public ValueQuantity(String valueName) {
    myValueName = valueName;
  }

  public Quantity compute(Object parm) {
    AccountingEvent event = (AccountingEvent) parm;
    return (Quantity) event.getAgreement().getValue(myValueName, event.getWhenOccurred());
  }
}

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
package jetbrains.mps.ide.findusages.model;

public class SearchResult<T> {
  public static final String SUBCATEGORY_SEPARATOR = "/"; 

  protected T myObject;
  protected Object myPathObject;
  protected String myCategory;

  public SearchResult() {

  }

  public SearchResult(SearchResult<T> src) {
    this(src.getObject(), src.getPathObject(), src.getCategory());
  }

  public SearchResult(T object, String category) {
    this(object, object, category);
  }

  public SearchResult(T object, Object pathObject, String category) {
    myObject = object;
    myPathObject = pathObject;
    myCategory = category;
  }

  public T getObject() {
    return myObject;
  }

  public Object getPathObject() {
    return myPathObject;
  }

  public String getCategory() {
    return myCategory;
  }

  public String[] getCategoryPath() {
    return myCategory.split(SUBCATEGORY_SEPARATOR);
  }

  public int hashCode() {
    return myCategory.hashCode() * 37 + myObject.hashCode() * 17;
  }

  public boolean equals(Object o) {
    if (!(o instanceof SearchResult)) return false;
    SearchResult searchResult = (SearchResult) o;
    if (!myObject.equals(searchResult.myObject)) return false;
    if (!myCategory.equals(searchResult.myCategory)) return false;
    return true;
  }
}

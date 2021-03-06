/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2019 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.incubator.client.kanban.js;

import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.jquery.client.api.Functions;
import gwt.material.design.jscore.client.api.core.Element;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class KanbanItem {

    @JsProperty
    private String id;

    @JsProperty
    private String title;

    @JsProperty
    private Functions.Func1<Element> click;

    @JsProperty
    private Functions.Func2<Element, Object> drag;

    @JsProperty
    private Functions.Func1<Element> dragend;

    @JsProperty
    private Functions.Func1<Element> drop;

    @JsProperty
    public DataSet dataset;

    @JsProperty
    public String innerHTML;

    @JsOverlay
    public final String getId() {
        return id;
    }

    @JsOverlay
    public final void setId(String id) {
        this.id = id;
    }

    @JsOverlay
    public final String getTitle() {
        return title;
    }

    @JsOverlay
    public final void setTitle(String title) {
        this.title = title;
    }

    @JsOverlay
    public final Functions.Func1<Element> getClick() {
        return click;
    }

    @JsOverlay
    public final void setClick(Functions.Func1<Element> click) {
        this.click = click;
    }

    @JsOverlay
    public final Functions.Func2<Element, Object> getDrag() {
        return drag;
    }

    @JsOverlay
    public final void setDrag(Functions.Func2<Element, Object> drag) {
        this.drag = drag;
    }

    @JsOverlay
    public final Functions.Func1<Element> getDragend() {
        return dragend;
    }

    @JsOverlay
    public final void setDragend(Functions.Func1<Element> dragend) {
        this.dragend = dragend;
    }

    @JsOverlay
    public final Functions.Func1<Element> getDrop() {
        return drop;
    }

    @JsOverlay
    public final void setDrop(Functions.Func1<Element> drop) {
        this.drop = drop;
    }

    @JsOverlay
    public final void setWidget(Widget widget) {
        setTitle(widget.getElement().getInnerHTML());
    }

    @JsOverlay
    public final DataSet getDataset() {
        return dataset;
    }

    @JsOverlay
    public final String getInnerHTML() {
        return innerHTML;
    }
}

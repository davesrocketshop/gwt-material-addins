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
package gwt.material.design.addins.client.dnd.event.dispatch;

import com.google.gwt.event.shared.GwtEvent;
import gwt.material.design.addins.client.dnd.event.ResizeMoveEvent;
import gwt.material.design.client.base.MaterialWidget;

public class ResizeEventDispatcher {

    private final MaterialWidget target;

    public ResizeEventDispatcher(MaterialWidget target) {
        this.target = target;
    }

    public void fireResizeMoveEvent() {
        target.fireEvent(new GwtEvent<ResizeMoveEvent.ResizeMoveHandler>() {
            @Override
            public Type<ResizeMoveEvent.ResizeMoveHandler> getAssociatedType() {
                return ResizeMoveEvent.TYPE;
            }

            @Override
            public void dispatch(ResizeMoveEvent.ResizeMoveHandler handler) {
                handler.onResizeMove(new ResizeMoveEvent());
            }
        });
    }
}

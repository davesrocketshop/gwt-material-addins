/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2018 GwtMaterialDesign
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
package gwt.material.design.incubator.client.infinitescroll.events;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
//@formatter:off

/**
 * @author kevzlou7979
 */
public class ShiftEvent extends GwtEvent<ShiftEvent.ShiftHandler> {

    public static final Type<ShiftHandler> TYPE = new Type<>();

    public ShiftEvent() {}

    public static Type<ShiftHandler> getType() {
        return TYPE;
    }

    public static void fire(HasHandlers source) {
        source.fireEvent(new ShiftEvent());
    }

    @Override
    public Type<ShiftHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(ShiftHandler handler) {
        handler.onChartEnter(this);
    }

    public interface ShiftHandler extends EventHandler {
        void onChartEnter(ShiftEvent event);
    }
}
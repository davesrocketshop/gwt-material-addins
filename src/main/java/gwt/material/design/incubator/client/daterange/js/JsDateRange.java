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
package gwt.material.design.incubator.client.daterange.js;

import com.google.gwt.dom.client.Element;
import gwt.material.design.addins.client.moment.Moment;
import gwt.material.design.incubator.client.daterange.DateRangeOptions;
import gwt.material.design.jquery.client.api.Functions;
import gwt.material.design.jquery.client.api.JQueryElement;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

import java.util.Date;

/**
 * JSInterop utils for {@link gwt.material.design.incubator.client.daterange.DateRangePicker}
 *
 * @author kevzlou7979
 */
@JsType(isNative = true, name = "DateRangePicker")
public class JsDateRange extends DateRangeOptions {

    @JsMethod(name = "$", namespace = JsPackage.GLOBAL)
    public static native JsDateRange $(JQueryElement element);

    @JsMethod(name = "$", namespace = JsPackage.GLOBAL)
    public static native JsDateRange $(Element element);

    @JsMethod(name = "$", namespace = JsPackage.GLOBAL)
    public static native JsDateRange $(String selector);

    @JsMethod
    public native void daterangepicker(DateRangeOptions options);

    @JsMethod
    public native void daterangepicker(DateRangeOptions options, Functions.Func2<Moment, Moment> callback);

    @JsMethod
    public native void daterangepicker();

    @JsMethod
    public native JsDateRangeMethod data(String daterangepicker);

    public native JsDateRange on(String event, Functions.EventFunc1<JsDateRange> callback);

    public native JsDateRange off(String event);
}

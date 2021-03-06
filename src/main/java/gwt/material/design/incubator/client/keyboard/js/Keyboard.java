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
package gwt.material.design.incubator.client.keyboard.js;

import com.google.gwt.dom.client.Element;
import gwt.material.design.jquery.client.api.Functions;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * JSInterop class for Keyboard
 *
 * @author kevzlou7979
 * @see <a href="https://franciscohodge.com/projects/simple-keyboard/documentation/">Documentation</a>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class Keyboard {

    protected Keyboard() {
    }

    public Keyboard(KeyboardOptions options) {
    }

    @JsProperty
    public Element keyboardDOM;

    /**
     * Clear the keyboard’s input.
     */
    @JsMethod
    public native void clearInput();

    /**
     * Clear the keyboard’s specific input
     * Must have been previously set using the "inputName" prop.
     */
    @JsMethod
    public native void clearInput(String inputName);

    /**
     * Get the keyboard’s input (You can also get it from the onChange prop).
     */
    @JsMethod
    public native String getInput();

    /**
     * Get the keyboard’s input (You can also get it from the onChange prop).
     * Must have been previously set using the "inputName" prop.
     */
    @JsMethod
    public native String getInput(String inputName);

    /**
     * Set the keyboard’s input. Useful if you want to track input changes made outside simple-keyboard.
     */
    @JsMethod
    public native void setInput(String input);

    /**
     * Set the keyboard’s input. Useful if you want to track input changes made outside simple-keyboard.
     * Must have been previously set using the "inputName" prop.
     */
    @JsMethod
    public native void setInput(String input, String inputName);

    /**
     * Replaces the entire internal input object. The difference with “setInput” is that “setInput” only changes a
     * single key of the input object, while “replaceInput” replaces the full input object.
     */
    @JsMethod
    public native void replaceInput(Object object);

    /**
     * Set new option or modify existing ones after initialization. The changes are applied immediately.
     */
    @JsMethod
    public native void setOptions(KeyboardOptions options);

    /**
     * Removes keyboard listeners and DOM elements.
     */
    @JsMethod
    public native void destroy();

    /**
     * Send a command to all simple-keyboard instances at once (if you have multiple instances).
     */
    @JsMethod
    public native void dispatch(Functions.Func1<Object> func);

    /**
     * Get the DOM Element of a button. If there are several buttons with the same name, an array of the DOM Elements
     * is returned.
     */
    @JsMethod
    public native Object getButtonElement(String buttonName);

    /**
     * Adds an entry to the buttonTheme. Basically a way to add a class to a button.
     */
    @JsMethod
    public native void addButtonTheme(String buttons, String classNames);

    /**
     * Removes an entry to the buttonTheme. Basically a way to remove a class previously added to a button through
     * buttonTheme or addButtonTheme.
     */
    @JsMethod
    public native void removeButtonTheme(String buttons, String classNames);
}

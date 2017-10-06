/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2017 GwtMaterialDesign
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
package gwt.material.design.addins.client.ui;

import gwt.material.design.addins.client.MaterialWidgetTest;
import gwt.material.design.addins.client.avatar.MaterialAvatar;
import gwt.material.design.addins.client.avatar.js.JsAvatar;

/**
 * Test case for avatar component
 *
 * @author kevzlou7979
 */
public class MaterialAvatarTest extends MaterialWidgetTest<MaterialAvatar> {

    @Override
    protected MaterialAvatar createWidget() {
        return new MaterialAvatar();
    }

    public void testValue() {
        MaterialAvatar avatar = getWidget();
        final String NAME = "test1";
        avatar.setValue(NAME);
        final String HASH_CODE = JsAvatar.md5(NAME);
        assertEquals(NAME, avatar.getValue());
        assertTrue(avatar.getElement().hasAttribute("data-jdenticon-hash"));
        assertEquals(HASH_CODE, avatar.getElement().getAttribute("data-jdenticon-hash"));
    }

    // TODO Test Value Change Handler
    public void testValueChangeHandler() {}

    // TODO Test Dimension
    public void testDimension() {}

    public void testSVGWithHeight() {
        MaterialAvatar avatar = getWidget();

        final String WIDTH = "50";
        final String HEIGHT = "50";
        avatar.setWidth(WIDTH);
        avatar.setHeight(HEIGHT);

        assertTrue(avatar.getElement().hasAttribute("width"));
        assertEquals(WIDTH, avatar.getElement().getAttribute("width"));

        assertTrue(avatar.getElement().hasAttribute("height"));
        assertEquals(HEIGHT, avatar.getElement().getAttribute("height"));
    }
}

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
package gwt.material.design.addins.client.dark;

import com.google.gwt.resources.client.TextResource;
import gwt.material.design.client.theme.dark.DarkThemeLoader;
import gwt.material.design.client.theme.dark.DarkThemeManager;

public class AddinsWidgetDarkTheme extends DarkThemeLoader {

    private boolean suppressReload;

    public AddinsWidgetDarkTheme(TextResource resource) {
        super(resource, false);
    }

    public void suppressReload() {
        if (!suppressReload) {
            setInjectResource(true);
            reload();
            suppressReload = true;
        }
    }

    @Override
    public void load() {
        if (DarkThemeManager.get().isDarkMode()) {
            super.load();
        }
    }

    public boolean isSuppressReload() {
        return suppressReload;
    }
}

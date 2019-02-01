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
package gwt.material.design.incubator.client.google.recaptcha3.api;

import gwt.material.design.client.api.google.maps.GoogleApi;

public class RecaptchaApi3 extends GoogleApi {

    public RecaptchaApi3(String apiKey) {
        super(apiKey);
    }

    public String constructApiUrl() {
        return getApiUrl() + getApiKey();
    }

    @Override
    public String getApiUrl() {
        return "https://www.google.com/recaptcha/api.js?render=";
    }
}

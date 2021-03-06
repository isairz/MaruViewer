/*
 * Copyright 2016 Hippo Seven
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hippo.okhttp;

import java.net.MalformedURLException;
import java.net.URL;

import okhttp3.Request;

public class ChromeRequestBuilder extends Request.Builder {

    private static final String CHROME_USER_AGENT = "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) " +
            "AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Mobile Safari/537.36";

    public ChromeRequestBuilder(String url) throws MalformedURLException {
        url(new URL(url));
        addHeader("User-Agent", CHROME_USER_AGENT);
        addHeader("Cache-Control", "no-cache");
        addHeader("Upgrade-Insecure-Requests", "1");
        addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");
//        addHeader("Accept-Encoding", "gzip, deflate");
    }
}

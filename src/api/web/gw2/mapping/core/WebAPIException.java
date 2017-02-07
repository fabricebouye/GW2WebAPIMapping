/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.core;

import java.io.IOException;
import java.net.HttpURLConnection;

/**
 * Error generated when accessing the Web API.
 * @author Fabrice Bouyé
 */
public final class WebAPIException extends IOException {

    private final int code;

    public WebAPIException(final int code, final String content) {
        super(content);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static WebAPIException of404(final String html) {
        return new WebAPIException(HttpURLConnection.HTTP_NOT_FOUND, html);
    }

    public static WebAPIException of403(final WebAPIError error) {
        return new WebAPIException(HttpURLConnection.HTTP_FORBIDDEN, (error == null) ? null : error.getText());
    }
}

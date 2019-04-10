/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
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

    /**
     * Creates a new instance.
     * @param code The HTTP error code.
     * @param content The content of the error, may be {@code null}.
     */
    public WebAPIException(final int code, final String content) {
        super(content);
        this.code = code;
    }

    /**
     * Gets the HTTP error code.
     * @return An {@code int}.
     */
    public int getCode() {
        return code;
    }

    /**
     * Convenient factory method for HTTP 404 error.
     * @param html The HTML content of the page.
     * @return A {@code WebAPIException} instance, never {@code null}.
     */
    public static WebAPIException of404(final String html) {
        return new WebAPIException(HttpURLConnection.HTTP_NOT_FOUND, html);
    }

    /**
     * Convenient factory method for HTTP 403 error.
     * @param error The source error.
     * @return A {@code WebAPIException} instance, never {@code null}.
     */
    public static WebAPIException of403(final WebAPIError error) {
        return new WebAPIException(HttpURLConnection.HTTP_FORBIDDEN, (error == null) ? null : error.getText());
    }
}

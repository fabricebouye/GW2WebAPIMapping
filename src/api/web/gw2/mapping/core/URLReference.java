/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class holds a URL path.
 * <br>This class is intended to replace all instances of {@code Optional<URL>} which were used in earlier versions of the mapping.
 * @author Fabrice Bouyé
 * @see URLValue
 */
public final class URLReference {

    /**
     * The unique empty instance.
     */
    public static final URLReference EMPTY = new URLReference(null);

    /**
     * The underlying URL.
     */
    private final URL url;

    /**
     * Creates a new instance.
     * @param url The underlying URL.
     */
    private URLReference(final URL url) {
        this.url = url;
    }

    /**
     * Gets an URL reference for the given URL.
     * @param url The source URL
     * @return A {@code URLReference} instance, never {@code null}.
     * {@code URLReference.EMPTY} is returned if {@code url} is {@code null}.
     */
    public static URLReference of(final URL url) {
        return (url == null) ? empty() : new URLReference(url);
    }

    /**
     * Gets an URL reference for the given path.
     * @param path The source path
     * @return A {@code URLReference} instance, never {@code null}.
     * {@code URLReference.EMPTY} is returned if {@code path} is malformed.
     */
    public static URLReference of(final String path) {
        URLReference result = empty();
        try {
            final URL url = new URL(path);
            result = new URLReference(url);
        } catch (MalformedURLException ex) {
            Logger.getLogger(URLReference.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
        return result;
    }

    /**
     * Gets the empty instance.
     * @return Always {@code URLReference.EMPTY}.
     * @see #EMPTY
     */
    public static URLReference empty() {
        return EMPTY;
    }

    /**
     * If a value is present, invoke the specified consumer with the value, otherwise do nothing.
     * @param consumer The consumer to execute if the value is present.
     * @throws NullPointerException If {@code value} is present and {@code consummer} is {@code null}.
     */
    public void ifPresent(final Consumer<URL> consumer) throws NullPointerException {
        if (url != null) {
            consumer.accept(url);
        }
    }

    /**
     * Tests whether this URL is present.
     * @return {@code True} if the test succeeds, {@code false} otherwise.
     */
    public boolean isPresent() {
        return url != null;
    }

    /**
     * Gets the underlying URL.
     * @return An {@code URL} instance, never {@code null}.
     * @throws NoSuchElementException If the URL is not present.
     */
    public URL get() throws NoSuchElementException {
        if (url == null) {
            throw new NoSuchElementException("No value present"); // NOI18N.
        }
        return url;
    }
}

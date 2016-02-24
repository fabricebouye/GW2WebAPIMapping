/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class holds a URL. It can be used to store optional and non-optional URL values within the mapping. It will also consume any {@code MalformedURLException} raised when transforming a {@code String} path into a {@code java.net.URL}
 * <p>This class is intended to replace all instances of {@code java.util.Optional<URL>} which were used in earlier versions of the mapping. We cannot simply inherit from {@code java.util.Optional} is this class is {@code final}, so similar functionalities have been recoded here.
 * @author Fabrice Bouyé
 * @see URLValue
 */
public final class URLReference {

    /**
     * The unique empty instance.
     */
    private static final URLReference EMPTY = new URLReference(null);

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof URLReference)) {
            return false;
        }
        final URLReference other = (URLReference) obj;
        return Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(url);
    }

    /**
     * Gets an URL reference for the given URL.
     * @param url The source URL
     * @return A {@code URLReference} instance, never {@code null}.
     * <br>The empty instance is returned if {@code url} is {@code null}.
     * @see #empty() 
     */
    public static URLReference of(final URL url) {
        return (url == null) ? empty() : new URLReference(url);
    }

    /**
     * Gets an URL reference for the given path.
     * <br>This method will consume any {@code MalformedURLException} which may be raised when creating a new {@code URL} instance.
     * @param path The source path
     * @return A {@code URLReference} instance, never {@code null}.
     * <br>The empty instance is returned if {@code path} is malformed.
     * @see #empty() 
     */
    public static URLReference of(final String path) {
        URLReference result = empty();
        try {
            final URL url = new URL(path);
            result = new URLReference(url);
        } catch (MalformedURLException ex) {
            Logger.getLogger(URLReference.class.getName()).log(Level.WARNING, ex.getMessage(), ex);
        }
        return result;
    }

    /**
     * Gets the empty instance.
     * @return Always the same empty instance, never {@code null}.
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

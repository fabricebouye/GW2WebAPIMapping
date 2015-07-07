/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.core;

import java.util.Objects;

/**
 * Defines a point.
 * <br> Defined a point class so we do not rely on either AWT or JavaFX.
 * @author Fabrice Bouyé
 * @param <T> The type to use.
 */
public final class Point<T extends Number> {

    private final T x;
    private final T y;

    /**
     * Creates a new instance.
     * @param x The X (abscise or or longitude) coordinate.
     * @param y The Y (ordinate or latitude) coordinate. 
     * @throws NullPointerException If either {@code x} or {@code y} is {@code null}.
     */
    public Point(final T x, final T y) throws NullPointerException {
        Objects.requireNonNull(x);
        Objects.requireNonNull(y);
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the X (abscise or or longitude) component of this point.
     * @return A {@code T} instance, never {@code null}.
     */
    public T getX() {
        return x;
    }

    /**
     * Gets the Y (ordinate or latitude) component of this point.
     * @return A {@code T} instance, never {@code null}.
     */
    public T getY() {
        return y;
    }
}

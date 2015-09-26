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
 * Defines a 3D point.
 * <br>Defined a point class so we do not rely on either Java3D or JavaFX.
 * <br>Instance of this class are not mutable.
 * @author Fabrice Bouyé
 * @param <T> The type to use.
 */
public final class Point3D<T extends Number> {

    private final T x;
    private final T y;
    private final T z;

    /**
     * Creates a new instance.
     * @param x The X (abscise or or longitude) coordinate.
     * @param y The Y (ordinate or latitude) coordinate. 
     * @param z The Y (depth or altitude) coordinate. 
     * @throws NullPointerException If either {@code x}, {@code y} or {@code z} is {@code null}.
     */
    public Point3D(final T x, final T y, final T z) throws NullPointerException {
        Objects.requireNonNull(x);
        Objects.requireNonNull(y);
        Objects.requireNonNull(z);
        this.x = x;
        this.y = y;
        this.z = z;
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

    /**
     * Gets the Z (depth or altitude) component of this point.
     * @return A {@code T} instance, never {@code null}.
     */
    public T getZ() {
        return z;
    }
}

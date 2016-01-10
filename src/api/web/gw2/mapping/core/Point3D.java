/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.core;

/**
 * Defines a 3D point.
 * <br>Defined a point class so we do not rely on either Java3D or JavaFX.
 * <br>Instance of this class are not mutable.
 * @author Fabrice Bouyé
 */
public final class Point3D {

    /**
     * The origin singleton instance.
     */
    private static final Point3D ORIGIN = new Point3D();

    /**
     * The X (abscise or or longitude) coordinate.
     */
    private final double x;
    /**
     * The Y (ordinate or latitude) coordinate.
     */
    private final double y;
    /**
     * The Z (depth or altitude) coordinate.
     */
    private final double z;

    /**
     * Creates a new empty instance.
     */
    private Point3D() {
        this(0, 0, 0);
    }

    /**
     * Creates a new instance.
     * @param x The X (abscise or or longitude) coordinate.
     * @param y The Y (ordinate or latitude) coordinate.
     * @param z The Z (depth or altitude) coordinate.
     */
    private Point3D(final double x, final double y, final double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Gets the origin singleton instance.
     * @return A {@code Point3D} instance, never {@code null}.
     */
    public static Point3D origin() {
        return ORIGIN;
    }

    /**
     * Factory method.
     * @param x The X (abscise or or longitude) coordinate.
     * @param y The Y (ordinate or latitude) coordinate.
     * @param z The Z (depth or altitude) coordinate.
     * @return A {@code Point3D} instance, never {@code null}.
     * <br>If {@code x}, {@code y} and {@code z} = 0 the origin singleton is returned.
     */
    public static final Point3D of(final double x, final double y, final double z) {
        if (x == 0 && y == 0 && z == 0) {
            return origin();
        } else {
            return new Point3D(x, y, z);
        }
    }

    /**
     * Gets the X (abscise or or longitude) component of this point.
     * @return A {@code double}.
     */
    public double getX() {
        return x;
    }

    /**
     * Gets the Y (ordinate or latitude) component of this point.
     * @return A {@code double}.
     */
    public double getY() {
        return y;
    }

    /**
     * Gets the Z (depth or altitude) component of this point.
     * @return A {@code double}.
     */
    public double getZ() {
        return z;
    }
}

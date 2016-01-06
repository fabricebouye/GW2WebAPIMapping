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
 */
public final class Point3D {

    public static final Point3D ORIGIN = new Point3D(0, 0, 0);

    private final double x;
    private final double y;
    private final double z;

    /**
     * Creates a new instance.
     * @param x The X (abscise or or longitude) coordinate.
     * @param y The Y (ordinate or latitude) coordinate.
     * @param z The Y (depth or altitude) coordinate.
     */
    public Point3D(final double x, final double y, final double z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

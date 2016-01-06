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
 * Defines a 2D point.
 * <br>Defined a point class so we do not rely on either AWT, Java2D or JavaFX.
 * <br>Instance of this class are not mutable.
 * @author Fabrice Bouyé
 */
public final class Point2D {

    public static final Point2D ORIGIN = new Point2D(0, 0);

    private final double x;
    private final double y;

    /**
     * Creates a new instance.
     * @param x The X (abscise or or longitude) coordinate.
     * @param y The Y (ordinate or latitude) coordinate.
     */
    public Point2D(final double x, final double y) {
        this.x = x;
        this.y = y;
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
}

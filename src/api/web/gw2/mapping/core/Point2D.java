/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.core;

/**
 * Defines a 2D point.
 * <br>Defined a point class so we do not rely on either AWT, Java2D or JavaFX.
 * <br>Instance of this class are not mutable.
 * @author Fabrice Bouyé
 */
public final class Point2D {

    /**
     * The origin singleton instance.
     */
    private static final Point2D ORIGIN = new Point2D();
    /**
     * @param x The X (abscise or or longitude) coordinate.
     */
    private final double x;
    /**
     * The Y (ordinate or latitude) coordinate.
     */
    private final double y;

    /**
     * Creates a new empty instance.
     */
    private Point2D() {
        this(0, 0);
    }

    /**
     * Creates a new instance.
     * @param x The X (abscise or or longitude) coordinate.
     * @param y The Y (ordinate or latitude) coordinate.
     */
    private Point2D(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the origin singleton instance.
     * @return A {@code Point2D} instance, never {@code null}.
     */
    public static Point2D origin() {
        return ORIGIN;
    }

    /**
     * Factory method.
     * @param x The X (abscise or or longitude) coordinate.
     * @param y The Y (ordinate or latitude) coordinate.
     * @return A {@code Point2D} instance, never {@code null}.
     * If {@code x} and {@code y} = 0, the origin instance is returned.
     */
    public static Point2D of(final double x, final double y) {
        if (x == 0 && y == 0) {
            return origin();
        } else {
            return new Point2D(x, y);
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
}

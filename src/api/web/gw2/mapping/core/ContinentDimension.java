/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.core;

/**
 * Defines an area in the continent coordinate system.
 * @author Fabrice Bouyé
 */
public final class ContinentDimension {

    /**
     * A single empty instance.
     */
    public static final ContinentDimension EMPTY = new ContinentDimension();

    private final Point2D nwCorner;
    private final Point2D seCorner;

    /**
     * Creates a new empty instance.
     */
    private ContinentDimension() {
        nwCorner = Point2D.ORIGIN;
        seCorner = Point2D.ORIGIN;
    }

    /**
     * Creates a new instance.
     * @param nwX The X coordinate of the upper-left (NW) corner.
     * @param nwY The Y coordinate of the upper-left (NW) corner.
     * @param seX The X coordinate of the lower-right (SE) corner.
     * @param seY The Y coordinate of the lower-right (SE) corner.
     */
    public ContinentDimension(final double nwX, final double nwY, final double seX, final double seY) {
        nwCorner = new Point2D(nwX, nwY);
        seCorner = new Point2D(seX, seY);
    }

    /**
     * Gets the point that defines the upper-left (NW) corner.
     * @return A {@code Point2D} instance, never {@code null}.
     */
    public Point2D getNwCorner() {
        return nwCorner;
    }

    /**
     * Gets the point that defines the lower-right (SE) corner.
     * @return A {@code Point2D} instance, never {@code null}.
     */
    public Point2D getSeCorner() {
        return seCorner;
    }
}

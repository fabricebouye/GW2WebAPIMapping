/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.core;

/**
 * Defines an area in the map coordinate system.
 * @author Fabrice Bouyé
 */
public final class MapDimension {

    /**
     * A single empty instance.
     */
    public static final MapDimension EMPTY = new MapDimension();

    @Coord2DValue
    private final Point2D swCorner;
    @Coord2DValue
    private final Point2D neCorner;

    /**
     * Creates a new empty instance.
     */
    private MapDimension() {
        swCorner = Point2D.ORIGIN;
        neCorner = Point2D.ORIGIN;
    }

    /**
     * Creates a new instance.
     * @param swX The X coordinate of the lower-left (SW) corner.
     * @param swY The Y coordinate of the lower-left (SW) corner.
     * @param neX The X coordinate of the upper-right (NE) corner.
     * @param neY The Y coordinate of the upper-right (NE) corner.
     */
    public MapDimension(final double swX, final double swY, final double neX, final double neY) {
        swCorner = new Point2D(swX, swY);
        neCorner = new Point2D(neX, neY);
    }

    /**
     * Gets the point that defines the lower-left (SW) corner.
     * @return A {@code Point2D} instance, never {@code null}.
     */
    @Coord2DValue
    public Point2D getSwCorner() {
        return swCorner;
    }

    /**
     * Gets the point that defines the upper-right (NE) corner.
     * @return A {@code Point2D} instance, never {@code null}.
     */
    @Coord2DValue
    public Point2D getNeCorner() {
        return neCorner;
    }
}

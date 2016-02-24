/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.core;

/**
 * The dimensions of the map, given as the coordinates of the lower-left (SW) and upper-right (NE) corners.
 * @author Fabrice Bouyé
 * @see MapRect
 */
public final class MapBounds {

    /**
     * The empty singleton instance.
     */
    private static final MapBounds EMPTY = new MapBounds();

    @Coord2DValue
    private final Point2D swCorner;
    @Coord2DValue
    private final Point2D neCorner;

    /**
     * Creates a new empty instance.
     */
    private MapBounds() {
        this(0, 0, 0, 0);
    }

    /**
     * Creates a new instance.
     * @param swX The X coordinate of the lower-left (SW) corner.
     * @param swY The Y coordinate of the lower-left (SW) corner.
     * @param neX The X coordinate of the upper-right (NE) corner.
     * @param neY The Y coordinate of the upper-right (NE) corner.
     */
    private MapBounds(final double swX, final double swY, final double neX, final double neY) {
        this(Point2D.of(swX, swY), Point2D.of(neX, neY));
    }

    /**
     * Creates a new instance.
     * @param swCorner The lower-left (SW) corner.
     * @param neCorner The top-right (NE) corner.
     */
    private MapBounds(final Point2D swCorner, final Point2D neCorner) {
        this.swCorner = swCorner;
        this.neCorner = neCorner;
    }

    /**
     * Gets the empty instance singleton.
     * @return A {@code MapBounds} instance, never {@code null}.
     */
    public static MapBounds empty() {
        return EMPTY;
    }

    /**
     * Factory method.
     * @param swX The X coordinate of the lower-left (SW) corner.
     * @param swY The Y coordinate of the lower-left (SW) corner.
     * @param neX The X coordinate of the upper-right (NE) corner.
     * @param neY The Y coordinate of the upper-right (NE) corner.
     * @return A {@code MapBounds} instance, never {@code null}.
     * <br>If {@code swX}, {@code swY}, {@code neX} and {@code neY} = 0 the empty singleton instance is returned.
     */
    public static MapBounds of(final double swX, final double swY, final double neX, final double neY) {
        if (swX == 0 && swY == 0 && neX == 0 & neY == 0) {
            return empty();
        } else {
            return new MapBounds(swX, swY, neX, neY);
        }
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

    /**
     * Gets the width of this area.
     * @return A {@code double} &ge; 0.
     */
    public double getWidth() {
        return Math.abs(getSwCorner().getX() - getNeCorner().getX());
    }

    /**
     * Gets the height of this area.
     * @return A {@code double} &ge; 0.
     */
    public double getHeight() {
        return Math.abs(getSwCorner().getY() - getNeCorner().getY());
    }
}

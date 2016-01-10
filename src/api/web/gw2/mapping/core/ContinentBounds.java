/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.core;

/**
 * The dimensions of the map within the continent coordinate system, given as the coordinates of the upper-left (NW) and lower-right (SE) corners.
 * @author Fabrice Bouyé
 * @see ContinentRect
 */
public final class ContinentBounds {

    /**
     * The single empty instance.
     */
    public static final ContinentBounds EMPTY = new ContinentBounds();

    @Coord2DValue
    private final Point2D nwCorner;
    @Coord2DValue
    private final Point2D seCorner;

    /**
     * Creates a new empty instance.
     */
    private ContinentBounds() {
        this(0, 0, 0, 0);
    }

    /**
     * Creates a new instance.
     * @param nwX The X coordinate of the upper-left (NW) corner.
     * @param nwY The Y coordinate of the upper-left (NW) corner.
     * @param seX The X coordinate of the lower-right (SE) corner.
     * @param seY The Y coordinate of the lower-right (SE) corner.
     */
    private ContinentBounds(final double nwX, final double nwY, final double seX, final double seY) {
        this(Point2D.of(nwX, nwY), Point2D.of(seX, seY));
    }

    /**
     * Creates a new instance.
     * @param nwCorner The upper-left (NW) corner.
     * @param seCorner The lower-right (SE) corner.
     */
    private ContinentBounds(Point2D nwCorner, Point2D seCorner) {
        this.nwCorner = nwCorner;
        this.seCorner = seCorner;
    }

    /**
     * Gets the empty singleton instance.
     * @return A {@code ContinentDimension} instance, never {@code null}.
     */
    public static ContinentBounds empty() {
        return EMPTY;
    }

    /**
     * Factory method.
     * <br>Negatives values will be shifted back to 0.
     * @param nwX The X coordinate of the upper-left (NW) corner.
     * @param nwY The Y coordinate of the upper-left (NW) corner.
     * @param seX The X coordinate of the lower-right (SE) corner.
     * @param seY The Y coordinate of the lower-right (SE) corner.
     * @return A {@code ContinentDimension} instance, never {@code null}.
     * If {@code nwX}, {@code nwY}, {@code seX} and {@code seY} = 0 the empty instance is returned.
     */
    public static ContinentBounds of(final double nwX, final double nwY, final double seX, final double seY) {
        if (nwX == 0 && nwY == 0 && seX == 0 && seY == 0) {
            return empty();
        } else {
            return new ContinentBounds(nwX, nwY, seX, seY);
        }
    }

    /**
     * Gets the point that defines the upper-left (NW) corner.
     * @return A {@code Point2D} instance, never {@code null}.
     */
    @Coord2DValue
    public Point2D getNwCorner() {
        return nwCorner;
    }

    /**
     * Gets the point that defines the lower-right (SE) corner.
     * @return A {@code Point2D} instance, never {@code null}.
     */
    @Coord2DValue
    public Point2D getSeCorner() {
        return seCorner;
    }

    /**
     * Gets the width of this area.
     * @return A {@code double} &ge; 0.
     */
    public double getWidth() {
        return Math.abs(getNwCorner().getX() - getSeCorner().getX());
    }

    /**
     * Gets the height of this area.
     * @return A {@code double} &ge; 0.
     */
    public double getHeight() {
        return Math.abs(getNwCorner().getY() - getSeCorner().getY());
    }
}

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
 * @param <T> The type to use.
 */
public final class MapDimension<T extends Number> {

    private final Point<T> swCorner;
    private final Point<T> neCorner;

    /**
     * Creates a new instance.
     * @param swX The X coordinate of the lower-left (SW) corner.
     * @param swY The Y coordinate of the lower-left (SW) corner.
     * @param neX The X coordinate of the upper-right (NE) corner.
     * @param neY The Y coordinate of the upper-right (NE) corner.
     * @throws NullPointerException If either {@code swX}, {@code swY}, {@code neX} or {@code neY} is {@code null}.
     */
    public MapDimension(final T swX, final T swY, final T neX, final T neY) throws NullPointerException {
        swCorner = new Point(swX, swY);
        neCorner = new Point(neX, neY);
    }

    /**
     * Gets the point that defines the lower-left (SW) corner.
     * @return A {@code Point<T>} instance, never {@code null}.
     */
    public Point<T> getSwCorner() {
        return swCorner;
    }

    /**
     * Gets the point that defines the upper-right (NE) corner.
     * @return A {@code Point<T>} instance, never {@code null}.
     */
    public Point<T> getNeCorner() {
        return neCorner;
    }
}

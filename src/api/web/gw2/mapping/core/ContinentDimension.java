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
 * @param <T> The type to use.
 */
public final class ContinentDimension<T extends Number> {

    /**
     * A single empty instance.
     */
    public static final ContinentDimension<Integer> EMPTY = new ContinentDimension(0, 0, 0, 0);

    private final Point<T> nwCorner;
    private final Point<T> seCorner;

    /**
     * Creates a new instance.
     * @param nwX The X coordinate of the upper-left (NW) corner.
     * @param nwY The Y coordinate of the upper-left (NW) corner.
     * @param seX The X coordinate of the lower-right (SE) corner.
     * @param seY The Y coordinate of the lower-right (SE) corner.
     * @throws NullPointerException If either {@code nwX}, {@code nwY}, {@code seX} or {@code seY} is {@code null}.    
     */
    public ContinentDimension(final T nwX, final T nwY, final T seX, final T seY) throws NullPointerException {
        nwCorner = new Point(nwX, nwY);
        seCorner = new Point(seX, seY);
    }

    /**
     * Gets the point that defines the upper-left (NW) corner.
     * @return A {@code Point<T>} instance, never {@code null}.
     */
    public Point<T> getNwCorner() {
        return nwCorner;
    }

    /**
     * Gets the point that defines the lower-right (SE) corner.
     * @return A {@code Point<T>} instance, never {@code null}.
     */
    public Point<T> getSeCorner() {
        return seCorner;
    }
}

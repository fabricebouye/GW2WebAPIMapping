/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.core;

/**
 * Defines an altitude range.
 * <br>Defined to void reusing the {@code Point2D} class.
 * @author Fabrice Bouyé
 */
public final class AltitudeRange {

    public static final AltitudeRange EMPTY = new AltitudeRange(0, 0);

    private final double min;
    private final double max;

    /**
     * Creates a new instance.
     * @param min The min value.
     * @param max The max value.
     * @throws NullPointerException If either {@code min} or {@code max} is {@code null}.
     */
    public AltitudeRange(final double min, final double max) throws NullPointerException {
        this.min = Math.min(min, max);
        this.max = Math.max(min, max);
    }

    /**
     * Gets the minimum value of this numeric range.
     * @return A {@code double}.
     */
    public double getMin() {
        return min;
    }

    /**
     * Gets the maximum value of this numeric range.
     * @return A {@code double}.
     */
    public double getMax() {
        return max;
    }
}

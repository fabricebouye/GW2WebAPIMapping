/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.core;

/**
 * Dimensions of a continent. 
 * @author Fabrice Bouyé
 * @see ContinentDims
 */
public final class ContinentDimensions {

    /**
     * The empty instance singleton.
     */
    private static final ContinentDimensions EMPTY = new ContinentDimensions();

    /**
     * The width.
     */
    private final double width;
    /**
     * The height.
     */
    private final double height;

    /**
     * Creates a new empty instance.
     */
    private ContinentDimensions() {
        this(0, 0);
    }

    /**
     * Creates a new instance.
     * @param width The width.
     * @param height The height.
     */
    private ContinentDimensions(final double width, final double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Gets the empty singleton instance.
     * @return A {@code ContinentDimensions} instance, never {@code null}.
     */
    public static ContinentDimensions empty() {
        return EMPTY;
    }

    /**
     * Factory method.
     * <br>Negatives values will be shifted back to 0.
     * @param width The width.
     * @param height The height.
     * @return A {@code ContinentDimensions} instance, never {@code null}.
     * If {@code width} and {@code height} &le; 0 the empty instance is returned.
     */
    public static ContinentDimensions of(final double width, final double height) {
        final double w = Math.max(0, width);
        final double h = Math.max(0, height);
        if (w == 0 && h == 0) {
            return empty();
        } else {
            return new ContinentDimensions(width, height);
        }
    }

    /**
     * Gets the width of this continent dimension.
     * @return A {@code double} &ge; 0.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Gets the height of this continent dimension.
     * @return A {@code double} &ge; 0.
     */
    public double getHeight() {
        return height;
    }
}

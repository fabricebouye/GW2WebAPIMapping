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
 * Defines a numeric range
 * <br>Defined to void reusing the {@code Point2D} class.
 * @author Fabrice Bouyé
 * @param <T> The type to use.
 */
public final class NumericRange<T extends Number> {

    private final T min;
    private final T max;

    /**
     * Creates a new instance.
     * @param min The min value.
     * @param max The max value.
     * @throws NullPointerException If either {@code min} or {@code max} is {@code null}.
     */
    public NumericRange(final T min, final T max) throws NullPointerException {
        Objects.requireNonNull(min);
        Objects.requireNonNull(max);
        this.min = (min.doubleValue() < max.doubleValue()) ? min : max;
        this.max = (min.doubleValue() < max.doubleValue()) ? max : min;
    }

    /**
     * Gets the minimum value of this numeric range.
     * @return A {@code T} instance, never {@code null}.
     */
    public T getMin() {
        return min;
    }

    /**
     * Gets the maximum value of this numeric range.
     * @return A {@code T} instance, never {@code null}.
     */
    public T getMax() {
        return max;
    }
}

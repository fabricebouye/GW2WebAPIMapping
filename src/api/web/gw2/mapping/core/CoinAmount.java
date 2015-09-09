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
 * Contains a value in copper coins.
 * This class does not support negative values.
 * @author Fabrice Bouyé
 */
public final class CoinAmount implements Comparable<CoinAmount> {

    /**
     * Defines an amount of 0 copper coins.
     */
    public static final CoinAmount ZERO = new CoinAmount(0);
    /**
     * 1 silver coin is {@value} copper coins.
     */
    public static final byte SILVER_VALUE = 100;
    /**
     * 1 gold coin is {@value} copper coins.
     */
    public static final short GOLD_VALUE = 100 * 100;

    /**
     * The value in copper coins.
     */
    private final long value;

    /**
     * Creates a new instance.
     * @param amount The amount in copper coins.
     */
    private CoinAmount(final long amount) {
        value = amount;
    }

    @Override
    public String toString() {
        final long gold = value / GOLD_VALUE;
        final long silver = (value - gold * GOLD_VALUE) / SILVER_VALUE;
        final long copper = (value - gold * GOLD_VALUE - silver * SILVER_VALUE);
        return String.format("%dG%02dS%02dC", gold, silver, copper); // NOI18N.
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof CoinAmount) ? value == ((CoinAmount) obj).value : false;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(value);
    }

    @Override
    public int compareTo(CoinAmount o) {
        return Long.compare(value, o.value);
    }

    /**
     * Gets the value in copper coins.
     * @return A {@code long} &ge; 0.
     */
    public long toCopper() {
        return value;
    }

    /**
     * Gets the value in silver coins.
     * @return A {@code long} &ge; 0.
     */
    public long toSilver() {
        return value / SILVER_VALUE;
    }

    /**
     * Gets the value in gold coins.
     * @return A {@code long} &ge; 0.
     */
    public long toGold() {
        return value / GOLD_VALUE;
    }

    /**
     * Factory method that returns a {@code Coin} instance for a specified number of copper coins.
     * @param amount The value in copper coins.
     * @return A {@code Coin} instance, never {@code null}.
     */
    public static CoinAmount ofCopper(final long amount) {
        final long newValue = Math.max(0, amount);
        if (newValue == 0) {
            return ZERO;
        }
        return new CoinAmount(newValue);
    }

    /**
     * Factory method that returns a {@code Coin} instance for a specified number of silver coins.
     * @param amount The value in silver coins.
     * @return A {@code Coin} instance, never {@code null}.
     */
    public static CoinAmount ofSilver(final long amount) {
        if (amount == 0) {
            return ZERO;
        }
        return ofCopper(amount * SILVER_VALUE);
    }

    /**
     * Factory method that returns a {@code Coin} instance for a specified number of gold coins.
     * @param amount The value in gold coins.
     * @return A {@code Coin} instance, never {@code null}.
     */
    public static CoinAmount ofGold(final long amount) {
        if (amount == 0) {
            return ZERO;
        }
        return ofCopper(amount * GOLD_VALUE);
    }

    /**
     * Returns a copy of this {@code Coin} divided by the specified value.
     * @param divisor The value to divide by the duration by, positive.
     * @return A {@code Coin} instance, never {@code null}.
     * @throws ArithmeticException If {@code divisor} == 0.
     */
    public CoinAmount dividedBy(final long divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        } else if (divisor == 1) {
            return this;
        }
        return ofCopper(value / divisor);
    }

    /**
     * Returns a copy of this {@code Coin} multiply by the specified value.
     * @param multiplicand The value to multiply the duration by, positive or zero.
     * @return A {@code Coin} instance, never {@code null}.
     * @throws ArithmeticException If {@code divisor} == 0.
     */
    public CoinAmount multiplyBy(final long multiplicand) throws ArithmeticException {
        if (multiplicand == 0) {
            return ZERO;
        } else if (multiplicand == 1) {
            return this;
        }
        return ofCopper(value * multiplicand);
    }

    /**
     * Returns a copy of this {@code Coin} plus the specified amount.
     * @param amount The amount to add.
     * @return A {@code Coin} instance, never {@code null}.
     */
    public CoinAmount plus(final CoinAmount amount) {
        Objects.requireNonNull(amount);
        if (amount.value == 0) {
            return this;
        }
        return ofCopper(value + amount.value);
    }

    /**
     * Returns a copy of this {@code Coin} plus the specified amount of copper coins.
     * @param amount The amount to add.
     * @return A {@code Coin} instance, never {@code null}.
     */
    public CoinAmount plusCopper(final long amount) {
        if (amount == 0) {
            return this;
        }
        return ofCopper(value + amount);
    }

    /**
     * Returns a copy of this {@code Coin} plus the specified amount of silver coins.
     * @param amount The amount to add.
     * @return A {@code Coin} instance, never {@code null}.
     */
    public CoinAmount plusSilver(final long amount) {
        if (amount == 0) {
            return this;
        }
        return ofCopper(value + amount * SILVER_VALUE);
    }

    /**
     * Returns a copy of this {@code Coin} plus the specified amount of gold coins.
     * @param amount The amount to add.
     * @return A {@code Coin} instance, never {@code null}.
     */
    public CoinAmount plusGold(final long amount) {
        if (amount == 0) {
            return this;
        }
        return ofCopper(value + amount * GOLD_VALUE);
    }

    /**
     * Returns a copy of this {@code Coin} minus the specified amount.
     * @param amount The amount to subtract.
     * @return A {@code Coin} instance, never {@code null}.
     */
    public CoinAmount minus(final CoinAmount amount) {
        Objects.requireNonNull(amount);
        if (amount.value == 0) {
            return this;
        }
        return ofCopper(value - amount.value);
    }

    /**
     * Returns a copy of this {@code Coin} minus the specified amount of copper coins.
     * @param amount The amount to subtract.
     * @return A {@code Coin} instance, never {@code null}.
     */
    public CoinAmount minusCopper(final long amount) {
        if (amount == 0) {
            return this;
        }
        return ofCopper(value - amount);
    }

    /**
     * Returns a copy of this {@code Coin} minus the specified amount of silver coins.
     * @param amount The amount to subtract.
     * @return A {@code Coin} instance, never {@code null}.
     */
    public CoinAmount minusSilver(final long amount) {
        if (amount == 0) {
            return this;
        }
        return ofCopper(value - amount * SILVER_VALUE);
    }

    /**
     * Returns a copy of this {@code Coin} minus the specified amount of copper coins.
     * @param amount The amount to subtract.
     * @return A {@code Coin} instance, never {@code null}.
     */
    public CoinAmount minusGold(final long amount) {
        if (amount == 0) {
            return this;
        }
        return ofCopper(value - amount * GOLD_VALUE);
    }
}

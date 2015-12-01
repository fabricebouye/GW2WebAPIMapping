/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.achievements.daily;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.core.LevelValue;
import java.util.Objects;

/**
 * Defines a level range for daily achievements.
 * @author Fabrice Bouyé
 */
public interface DailyAchievementLevelRange {

    /**
     * Defines a level range for all valid character levels in the game.
     */
    @ImplementationSpecific
    public static final DailyAchievementLevelRange ALL_LEVELS = new DailyAchievementLevelRange() {
        @Override
        public boolean equals(Object obj) {
            boolean result = false;
            if (obj instanceof DailyAchievementLevelRange) {
                result = equals((DailyAchievementLevelRange) obj);
            }
            return result;
        }

        @Override
        public int hashCode() {
            return hashValues();
        }

        @Override
        public int getMin() {
            return LevelValue.MIN_LEVEL;
        }

        @Override
        public int getMax() {
            return LevelValue.MAX_LEVEL;
        }
    };

    /**
     * Provides a default implementation of the {@code equals()} method.
     * @param other Another object.
     * @throws NullPointerException If {@code other} is {@code null}.
     * @return {@code True} if the test is verified, {@code false} otherwise.
     */
    default boolean equals(DailyAchievementLevelRange other) throws NullPointerException {
        Objects.requireNonNull(other);
        final boolean result = (getMin() == other.getMin()) && (getMax() == other.getMax());
        return result;
    }

    default int hashValues() {
        int hash = 3;
        hash = 29 * hash + getMin();
        hash = 29 * hash + getMax();
        return hash;
    }

    /**
     * Gets the min level requirement.
     * @return An {@code int}.
     */
    @LevelValue
    int getMin();

    /**
     * Gets the max level requirement.
     * @return An {@code int}.
     */
    @LevelValue
    int getMax();
}

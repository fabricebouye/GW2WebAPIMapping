/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.achievements;

import java.util.Arrays;
import java.util.Optional;

/**
 * Utility class for achievements.
 * @author Fabrice Bouyé
 */
public enum AchievementsUtils {

    /**
     * Unique instance of this class.
     */
    INSTANCE;

    /**
     * Gets the achievement type for given value.
     * @param value The source value.
     * @return A {@code AchievementType} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code AchievementType.UNKNOWN} is returned.
     * @see AchievementType
     */
    public static AchievementType findAchievementType(final String value) {
        final Optional<AchievementType> resultOptional = Arrays.stream(AchievementType.values())
                .filter(toTest -> value != null && value.equalsIgnoreCase(toTest.value))
                .findFirst();
        final AchievementType result = resultOptional.isPresent() ? resultOptional.get() : AchievementType.UNKNOWN;
        return result;
    }

    /**
     * Gets the achievement flag for given value.
     * @param value The source value.
     * @return A {@code AchievementFlag} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code AchievementFlag.UNKNOWN} is returned.
     * @see AchievementFlag
     */
    public static AchievementFlag findAchievementFlag(final String value) {
        final Optional<AchievementFlag> resultOptional = Arrays.stream(AchievementFlag.values())
                .filter(toTest -> value != null && value.equalsIgnoreCase(toTest.value))
                .findFirst();
        final AchievementFlag result = resultOptional.isPresent() ? resultOptional.get() : AchievementFlag.UNKNOWN;
        return result;
    }
}

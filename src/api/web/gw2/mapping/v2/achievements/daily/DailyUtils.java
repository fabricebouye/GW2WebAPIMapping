/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.achievements.daily;

import api.web.gw2.mapping.v2.characters.*;
import java.util.Arrays;
import java.util.Optional;

/**
 * Utility class for daily achievements.
 * @author Fabrice Bouyé
 */
public enum DailyUtils {

    /**
     * Unique instance of this class.
     */
    INSTANCE;

    /**
     * Gets the daily achievement game type for given value.
     * @param value The source value.
     * @return A {@code DailyAchievementGameType} instance, never {@code null}.
     * <br>If no corresponding value is found, {@code DailyAchievementGameType.UNKNOWN} is returned.
     * @see DailyAchievementGameType
     */
    public static DailyAchievementGameType findDailyAchievementGameType(final String value) {
        final Optional<DailyAchievementGameType> resultOptional = Arrays.stream(DailyAchievementGameType.values())
                .filter(toTest -> value != null && value.equalsIgnoreCase(toTest.value))
                .findFirst();
        final DailyAchievementGameType result = resultOptional.isPresent() ? resultOptional.get() : DailyAchievementGameType.UNKNOWN;
        return result;
    }
}

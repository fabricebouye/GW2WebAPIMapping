/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.achievements.daily;

import api.web.gw2.mapping.core.IdValue;

/**
 * Defines a daily achievements.
 * @author Fabrice Bouyé
 */
public interface DailyAchievement {

    /**
     * Gets the id of this daily achievement.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the level requirements for this daily achievement.
     * @return A {@code DailyAchievementLevelRange} instance, never {@code null}.
     */
    DailyAchievementLevelRange getLevel();
}

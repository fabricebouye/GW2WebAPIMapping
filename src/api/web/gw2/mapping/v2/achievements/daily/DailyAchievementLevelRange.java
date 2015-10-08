/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.achievements.daily;

import api.web.gw2.mapping.core.LevelValue;

/**
 * Defines a level range for daily achievements.
 * @author Fabrice Bouyé
 */
public interface DailyAchievementLevelRange {

    /**
     * Gets the min level reqirement.
     * @return An {@code int}.
     */
    @LevelValue
    int getMin();

    /**
     * Gets the max level reqirement.
     * @return An {@code int}.
     */
    @LevelValue
    int getMax();
}

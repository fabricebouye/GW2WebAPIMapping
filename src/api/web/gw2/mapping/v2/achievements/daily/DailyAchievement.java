/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.achievements.daily;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Set;

/**
 * Defines a daily achievements.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/achievements/daily") // NOI18N.
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

    /**
     * Gets the campaigns required to have access to this achievement.
     * @return A non-modifiable {@code Set<DailyAchievementCampaign>}, never {@code null}.
     */
    @SetValue
    Set<DailyAchievementCampaign> getRequiredAccess();
}

/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.achievements;

import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines an achievement's mastery reward.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/achievements") // NOI18N.
public interface AchievementMasteryReward extends AchievementReward {

    /**
     * Gets the region in which the mastery point applies.
     * @return An {@code AchievementRewardRegion} instance, never {@code null}.
     */
    AchievementRewardRegion getRegion();
}

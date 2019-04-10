/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.achievements;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines an achievement's item reward.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/achievements") // NOI18N.
public interface AchievementItemReward extends AchievementReward {

    /**
     * Gets the id of the item rewarded by this achievement.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the quantity of the item rewarded by this achievement.
     * @return An {@code int} &ge; 0.
     */
    @QuantityValue
    int getCount();
}

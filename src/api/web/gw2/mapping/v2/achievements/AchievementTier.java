/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.achievements;

import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines an achievement's tier.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/achievements") // NOI18N.
public interface AchievementTier {

    /**
     * Gets the number of "things" that must be completed toi achieve this tier.
     * @return An {@code int} &ge; 0.
     */
    @QuantityValue
    int getCount();

    /**
     * Gets the number of achievement points rewarded for completing this tier.
     * @return An {@code int} &ge; 0.
     */
    @QuantityValue
    int getPoints();
}

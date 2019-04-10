/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.account.mastery.points;

import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;
import api.web.gw2.mapping.v2.masteries.MasteryRegion;

/**
 * Defines the summary of mastery points per ingame region.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/account/mastery/points", requiresAuthentication = true, scope = "progression") // NOI18N.
public interface AccountMasteryPointsTotal {

    /**
     * Gets the region for this summary.
     * @return A {@code MasteryRegion} instance, never {@code null}.
     * @see api.web.gw2.mapping.v2.masteries.MasteryRegion
     */
    MasteryRegion getRegion();

    /**
     * Gets the number of mastery points spent for this region.
     * @return An {@code int} &ge; 0.
     */
    @QuantityValue
    int getSpent();

    /**
     * Gets the number of mastery points earned for this region.
     * @return An {@code int} &ge; 0.
     */
    @QuantityValue
    int getEarned();
}

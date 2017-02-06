/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.seasons;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all scoring ordering values for ladder in leaderboards.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp/seasons") // NOI18N.
public enum SeasonLadderScoringOrdering {
    /**
     * Less points is better.
     */
    LESS_IS_BETTER("LessIsBetter"), // NOI18N.
    /**
     * More points is better.
     */
    MORE_IS_BETTER("MoreIsBetter"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private SeasonLadderScoringOrdering(String value) {
        this.value = value;
    }
}

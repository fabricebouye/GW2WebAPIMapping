/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.seasons;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all tier type values for ladder settings tiers in leaderboards.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp/seasons") // NOI18N.
public enum PvpSeasonLadderSettingsTierType {
    /**
     * points are integer.
     */
    RANK("Rank"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private PvpSeasonLadderSettingsTierType(String value) {
        this.value = value;
    }
}

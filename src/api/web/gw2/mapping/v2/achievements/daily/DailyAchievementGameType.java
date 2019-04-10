/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.achievements.daily;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines the game modes for daily achievements.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/achievements/daily") // NOI18N.
public enum DailyAchievementGameType {

    /**
     * Defines the PvE (Player vs. Environment) game mode.
     */
    PVE("pve"), // NOI18N.
    /**
     * Defines the PvP (Player vs. Player) game mode.
     */
    PVP("pvp"), // NOI18N.
    /**
     * Defines the WvW (World vs. World) game mode.
     */
    WVW("wvw"), // NOI18N.
    /**
     * Defines the special (festival) categories.
     */
    SPECIAL("special"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private DailyAchievementGameType(final String value) {
        this.value = value;
    }
}

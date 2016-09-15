/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.achievements.daily;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines the campaign requirements for daily achievements.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/achievements/daily") // NOI18N.
public enum DailyAchievementCampaign {

    /**
     * Defines the base game campaign requirement.
     */
    GUILD_WARS_2("GuildWars2"), // NOI18N.
    /**
     * Defines the Heart of Thorns campaign requirement.
     */
    HEART_OF_THORNS("HeartOfThorns"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private DailyAchievementCampaign(final String value) {
        this.value = value;
    }
}

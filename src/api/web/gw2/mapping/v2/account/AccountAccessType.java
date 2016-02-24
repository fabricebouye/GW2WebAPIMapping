/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.account;

import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all account access types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/account", requiresAuthentication = true, scope = "account") // NOI18N.
public enum AccountAccessType {
    /**
     * Should never happen.
     */
    NONE("None"),
    /**
     * Define the play for free access.
     */
    PLAY_FOR_FREE("PlayForFree"),
    /**
     * Player has access to the base game only.
     */
    GUILD_WARS_2("GuildWars2"),
    /**
     * Player has access to Heart of Thorns only.
     */
    HEART_OF_THORNS("HeartOfThorns"),
    /**
     * Fail safe value.
     */
    UNKNOWN(null);

    final String value;

    private AccountAccessType(final String value) {
        this.value = value;
    }
}

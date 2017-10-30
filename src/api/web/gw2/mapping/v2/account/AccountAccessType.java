/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.account;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all account access types.
 * <br>Initially the player's account would only have one of such value; but this was changed after Path of Fire was released so an account now as a combination or valid content the player can access to.
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
     * Player has access to the base game.
     */
    GUILD_WARS_2("GuildWars2"),
    /**
     * Player has access to Heart of Thorns.
     */
    HEART_OF_THORNS("HeartOfThorns"),
    /**
     * Player has access to Path of Fire.
     */
    PATH_OF_FIRE("PathOfFire"),
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private AccountAccessType(final String value) {
        this.value = value;
    }
}

/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.id.log;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all types of log events.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/guid/:id/log", requiresAuthentication = true, scope = "guilds") // NOI18N.
public enum GuildLogEventType {
    /**
     * Defines the treasury log event type.
     */
    STASH("stash"),
    /**
     * Defines the treasury log event type.
     */
    TREASURY("treasury"),
    /**
     * Defines the message of the day log event type.
     */
    MOTD("motd"),
    /**
     * Defines the influence log event type (pre-HoT).
     */
    INFLUENCE("influence"),
    /**
     * Defines the upgrade log event type.
     */
    UPGRADE("upgrade"),
    /**
     * Defines the invited declined log event type.
     */
    INVITED("invited"),
    /**
     * Defines the invite declined log event type.
     */
    INVITE_DECLINED("invite_declined"),
    /**
     * Defines the joined log event type.
     */
    JOINED("joined"),
    /**
     * Defines the kick log event type.
     */
    KICK("kick"),
    /**
     * Defines the rank changed event type.
     */
    RANK_CHANGE("rank_change"),
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private GuildLogEventType(final String value) {
        this.value = value;
    }
}

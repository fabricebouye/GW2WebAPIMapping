/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.id.teams;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a guild team state.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/guild/:id/teams", requiresAuthentication = true, scope = "guilds") // NOI18N.
public enum GuildTeamState {
    /**
     * The team is active.
     */
    ACTIVE("Active"),
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private GuildTeamState(final String value) {
        this.value = value;
    }
}

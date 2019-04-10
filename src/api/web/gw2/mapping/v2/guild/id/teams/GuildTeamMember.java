/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.id.teams;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a guild team member.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/guild/:id/teams", requiresAuthentication = true, scope = "guilds") // NOI18N.
public interface GuildTeamMember {

    /**
     * Gets the player id of the member.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getName();

    /**
     * Gets the role of the member
     * @return A {@code GuildTeamMemberRole} instance, never {@code null}.
     */
    GuildTeamMemberRole getRole();
}

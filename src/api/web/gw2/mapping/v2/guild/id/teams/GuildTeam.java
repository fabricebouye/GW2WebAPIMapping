/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.id.teams;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.MapValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import api.web.gw2.mapping.v2.pvp.PvpLadder;
import java.util.Map;
import java.util.Set;

/**
 * Defines a guild team.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/guild/:id/teams", requiresAuthentication = true, scope = "guilds") // NOI18N.
public interface GuildTeam {

    /**
     * Gets the id of the team.
     * @return An {@code int} &gt; 0.
     */
    @IdValue
    int getId();

    /**
     * Gets the set of members of this team.
     * @return A non-modifiable {@code Set<GuildTeamMember>} instance, never {@code null}.
     * <br>May be empty.
     */
    @SetValue
    Set<GuildTeamMember> getMembers();

    /**
     * Gets the name of the team.
     * @return A {@code String} instance, may be {@code null}.
     */
    String getName();

    /**
     * Gets the state of the team.
     * @return A {@code GuildTeamState} instance, never {@code null}.
     */
    GuildTeamState getState();

    /**
     * Gets the aggregate ladder result for this team.
     * @return A {@code GuildTeamLadderResult} instance, never {@code null}.
     */
    GuildTeamLadderResult getAggregate();

    /**
     * Gets the aggregate ladder results for each ladders for this team.
     * @return A non-nodifiable {@code Map<PvPLadder, GuildTeamLadderResult>} instance, never {@code null}.
     * <br>May be empty.
     */
    @MapValue
    Map<PvpLadder, GuildTeamLadderResult> getLadders();
}

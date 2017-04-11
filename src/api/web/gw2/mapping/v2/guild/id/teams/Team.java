/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
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
@APIv2(endpoint = "v2/guid/:id/teams", requiresAuthentication = true, scope = "guilds") // NOI18N.
public interface Team {

    /**
     * Gets the id of the team.
     * @return An {@code int} &gt; 0.
     */
    @IdValue
    int getId();

    /**
     * Gets the set of members of this team.
     * @return A non-modifiable {@code Set<TeamMember>} instance, never {@code null}.
     * <br>May be empty.
     */
    @SetValue
    Set<TeamMember> getMembers();

    /**
     * Gets the name of the team.
     * @return A {@code String} instance, may be {@code null}.
     */
    String getName();

    /**
     * Gets the state of the team.
     * @return A {@code TeamState} instance, never {@code null}.
     */
    TeamState getState();

    /**
     * Gets the aggregate ladder result for this team.
     * @return A {@code TeamLadderResult} instance, never {@code null}.
     */
    TeamLadderResult getAggregate();

    /**
     * Gets the aggregate ladder results for each ladders for this team.
     * @return A non-nodifiable {@code Map<PvPLadder, TeamLadderResult>} instance, never {@code null}.
     * <br>May be empty.
     */
    @MapValue
    Map<PvpLadder, TeamLadderResult> getLadders();
}

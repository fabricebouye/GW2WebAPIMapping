/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.seasons.leaderboards;

import api.web.gw2.mapping.core.DateValue;
import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LevelValue;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import java.time.ZonedDateTime;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;

/**
 * Defines a PvP leaderboard entry.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp/seasons/leaderboard") // NOI18N.
public interface PvpSeasonLeaderboardEntry {

    /**
     * Gets the id of the account.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getName();

    /**
     * Gets the rank of the player/guild.
     * @return An {@code int} &gt; 0.
     */
    @LevelValue
    int getRank();

    /**
     * Gets the id of the guild.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getId();

    /**
     * Gets the name of the team.
     * @return An {@code Optional<String>} instance, never {@code null}.
     */
    @OptionalValue
    @IdValue(flavor = IdValue.Flavor.STRING)
    Optional<String> getTeam();

    /**
     * Gets the id of the team.
     * @return An {@code OptionalInt} instance, never {@code null}.
     */
    @OptionalValue
    @IdValue
    OptionalInt getTeamId();

    /**
     * Gets the date at which the rank is reached.
     * @return A {@code ZonedDateTime} instance, never {@code null}.
     */
    @DateValue
    ZonedDateTime getDate();

    /**
     * Gets the values for scoring.
     * @return A non-modifiable {@code Set<PvpSeasonLeaderboardScore>} instance, never {@code null}; may be empty.
     */
    @SetValue
    Set<PvpSeasonLeaderboardScore> getScores();
}

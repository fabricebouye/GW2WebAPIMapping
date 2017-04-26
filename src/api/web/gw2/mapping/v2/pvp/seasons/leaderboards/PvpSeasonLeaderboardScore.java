/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.seasons.leaderboards;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a PvP leaderboard score.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp/seasons/leaderboard") // NOI18N.
public interface PvpSeasonLeaderboardScore {

    /**
     * Gets the id of the scoring.
     * @return A {@code String} instance, never {@code null}.
     * @see api.web.gw2.mapping.v2.pvp.seasons.PvpSeasonLadderScoring
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getId();

    /** Gets the value of the score.
     * @return An {@code int}.
     */
    @QuantityValue
    int getValue();
}

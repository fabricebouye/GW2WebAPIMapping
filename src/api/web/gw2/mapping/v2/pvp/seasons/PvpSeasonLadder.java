/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.seasons;

import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Set;

/**
 * Defines a PvP season leaderboard ladder.
 * As of 2017-02-06 there are 3 types of ladders:
 * <ul>
 * <li>legendary - in season 1-4.</li>
 * <li>guild - in season 1-4.</li>
 * <li>ladder - in season 5+.</li>
 * </ul>
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp/seasons") // NOI18N.
public interface PvpSeasonLadder {

    /**
     * Gets the settings in this ladder.
     * @return A {@code PvpSeasonLadderSettings} instance, never {@code null}.
     */
    PvpSeasonLadderSettings getSettings();

    /**
     * Gets the definitions of scoring in this ladder.
     * @return A non-modifiable {@code Set<PvpSeasonLadderScoring>} instance, never {@code null}; may be empty.
     */
    @SetValue
    Set<PvpSeasonLadderScoring> getScorings();
}

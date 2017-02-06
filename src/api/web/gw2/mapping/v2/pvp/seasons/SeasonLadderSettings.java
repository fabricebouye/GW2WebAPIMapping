/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.seasons;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Set;

/**
 * Defines the settings of a PvP season leaderboard's ladder.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp/seasons") // NOI18N.
public interface SeasonLadderSettings {
    // Not documented as of 2017-02-06.
    String getName();

    // Not documented as of 2017-02-06.
    int getDuration();

    /**
     * Gets the id of the scoring in use.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getScoring();

    /**
     * Gets the tiers uses in the scoring.
     * @return A {@code Set<SeasonLadderSettingsTiers>} instance, never {@code null}.
     */
    @SetValue
    Set<SeasonLadderSettingsTiers> getTiers();
}

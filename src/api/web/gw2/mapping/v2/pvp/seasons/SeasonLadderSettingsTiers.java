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
 * Defines tiers in the PvP season leaderboard ladder scoring system.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp/seasons") // NOI18N.
public interface SeasonLadderSettingsTiers {

    /**
     * Gets the range [min-max] of this tier.
     * @return A non-modifiable {@code Set<Integer>} instance, never {@code null}; may be empty.
     */
    @SetValue
    Set<Integer> getRange();
}

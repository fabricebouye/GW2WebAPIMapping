/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.seasons;

import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Optional;
import java.util.Set;

/**
 * Defines tiers in the PvP season leaderboard ladder scoring system.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp/seasons") // NOI18N.
public interface PvpSeasonLadderSettingsTier {

    /**
     * Gets the range [min-max] of this tier.
     * @return A non-modifiable {@code Set<Integer>} instance, never {@code null}; may be empty.
     */
    @SetValue
    Set<Integer> getRange();

    /**
     * Gets the HTML color of this tier (for season 1-4).
     * @return An {@code Optional<String>}, never {@code null}.
     */
    @OptionalValue
    Optional<String> getColor();

    /**
     * Gets the type of this tier (for season 1-4).
     * @return An {@code Optional<PvpSeasonLadderSettingsTierType>}, never {@code null}.
     */
    @OptionalValue
    Optional<PvpSeasonLadderSettingsTierType> getType();

    /**
     * Gets the i18n name of this tier (for season 1-4).
     * @return An {@code Optional<String>}, never {@code null}.
     */
    @OptionalValue
    @LocalizedResource
    Optional<String> getName();
}

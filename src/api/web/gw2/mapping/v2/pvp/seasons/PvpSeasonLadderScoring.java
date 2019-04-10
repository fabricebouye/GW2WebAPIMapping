/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.seasons;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a PvP season scoring method to be used in the ladder in the leaderboards.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp/seasons") // NOI18N.
public interface PvpSeasonLadderScoring {

    /**
     * Gets the id of this PvP season scoring.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getId();

    /**
     * Gets the type of scoring used.
     * @return A {@code PvpSeasonLadderScoringType} instance, never {@code null}.
     */
    PvpSeasonLadderScoringType getType();

    /**
     * Gets the i18n description of this scoring.
     * @return A {@code String} instance, maybe {@code null}.
     */
    @LocalizedResource
    String getDescription();

    /**
     * Gets the i18n name of this scoring.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the ordering method used in the scoring.
     * @return A {@code PvpSeasonLadderScoringOrdering} instance, never {@code null}.
     */
    PvpSeasonLadderScoringOrdering getOrdering();
}

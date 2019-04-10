/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.seasons;

import api.web.gw2.mapping.core.DateValue;
import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import java.time.ZonedDateTime;
import java.util.Map;
import java.util.Set;

/**
 * Defines a PvP league season.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp/seasons") // NOI18N.
public interface PvpSeason {

    /**
     * Gets the id of this season.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getId();

    /**
     * Gets the i18n name of this season.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the set of divisions in this season.
     * @return A {@code Set<PvpSeasonDivision>} instance, never {@code null}.
     */
    @SetValue
    Set<PvpSeasonDivision> getDivisions();

    /**
     * Gets the start date of this season.
     * @return A {@code ZonedDateTime} instance, never {@code null}.
     */
    @DateValue
    ZonedDateTime getStart();

    /**
     * Gets the end date of this season.
     * @return A {@code ZonedDateTime} instance, never {@code null}.
     */
    @DateValue
    ZonedDateTime getEnd();

    /**
     * Indicates whether this season is active.
     * @return A {@code boolean}.
     */
    boolean isActive();

    /**
     * Gets the leaderboards for this season.
     * @return A non-modifiable {@code Map<PvpSeasonLadderType, PvpSeasonLadder>} instance, never {@code null}; may be empty.
     */
    Map<PvpSeasonLadderType, PvpSeasonLadder> getLeaderboards();
}

/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.wvw.matches;

import api.web.gw2.mapping.core.EnumValue;
import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.ListValue;
import api.web.gw2.mapping.core.MapValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Defines a WvW match map.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/wvw/matches") // NOI18N.
public interface WvwMatchMap {

    /**
     * Gets the id of this WvW map.
     * @return An {@code int} &ge; 0.
     */
    @IdValue
    int getId();

    /**
     * Gets the type of this map.
     * @return A {@code WvwMatchMapType} instance, never {@code null}.
     */
    WvwMatchMapType getType();

    /**
     * Gets the scores for this WvW match.
     * @return A {@code Map<WvwMatchTeam, Integer>}, never {@code null}, may be empty.
     */
    @MapValue
    Map<WvwMatchTeam, Integer> getScores();

    /**
     * Gets the bonuses of this map.
     * @return A non-modifiable {@code List<MatchMapBonus>} instance, never {@code null}, may be empty.
     */
    @ListValue
    List<WvwMatchMapBonus> getBonuses();

    /**
     * Gets the objectives of this map.
     * @return A non-modifiable {@code Set<MatchMapObjective>} instance, never {@code null}, may be empty.
     */
    @SetValue
    Set<WvwMatchMapObjective> getObjectives();

    /**
     * Gets the deaths for this WvW match.
     * @return A {@code Map<WvwMatchTeam, Integer>}, never {@code null}, may be empty.
     */
    @MapValue
    Map<WvwMatchTeam, Integer> getDeaths();

    /**
     * Gets the kills for this WvW match.
     * @return A {@code Map<WvwMatchTeam, Integer>}, never {@code null}, may be empty.
     */
    @MapValue
    Map<WvwMatchTeam, Integer> getKills();
}

/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.wvw.matches;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Defines a WvW match map.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/wvw/matches") // NOI18N.
public interface MatchMap {

    /**
     * Gets the id of this WvW map.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getId();

    /**
     * Gets the type of this map.
     * @return A {@code MatchMapType} instance, never {@code null}.
     */
    MatchMapType getType();

    /**
     * Gets the scores for this WvW match.
     * @return A {@code Map<MatchTeam, Integer>}, never {@code null}, may be empty.
     */
    Map<MatchTeam, Integer> getScores();

    /**
     * Gets the bonuses of this map.
     * @return A non-modifiable {@code List<MatchMapBonus>} instance, never {@code null}, may be empty.
     */
    List<MatchMapBonus> getBonuses();

    /**
     * Gets the objectives of this map.
     * @return A non-modifiable {@code Set<>} instance, never {@code null}, may be empty.
     */
    Set getObjectives();

    /**
     * Gets the deaths for this WvW match.
     * @return A {@code Map<MatchTeam, Integer>}, never {@code null}, may be empty.
     */
    Map<MatchTeam, Integer> getDeaths();

    /**
     * Gets the kills for this WvW match.
     * @return A {@code Map<MatchTeam, Integer>}, never {@code null}, may be empty.
     */
    Map<MatchTeam, Integer> getKills();
}

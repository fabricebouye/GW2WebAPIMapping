/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.web.gw2.mapping.v1.wvw.matchdetails;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.v1.APIv1;
import java.util.Set;

/**
 * Define a WvW match details map.
 * @author Fabrice Bouyé
 */
@APIv1(endpoint = "v1/wvw/match_details.json") // NOI18N.
public interface MatchDetailsMap {

    /**
     * Gets the id of this map.
     * @return A {@code MatchDetailsMapType} instance, never {@code null}.
     */
    @IdValue
    MatchDetailsMapType getType();

    /**
     * Gets the scores of this map.
     * @return A {@code MatchDetailsScore} instance, never {@code null}.
     */
    MatchDetailsScore getScores();

    /**
     * Gets a set of objectives on this map.
     * @return A non-modifiable {@code Set<MatchDetailsObjective>} instance, never {@code null}.
     */
    Set<MatchDetailsObjective> getObjectives();

    /**
     * Gets a set of bonuses active on this map.
     * @return A non-modifiable {@code Set<MatchDetailsBonus>} instance, never {@code null}.
     * <br>The set is empty if no faction holds a bonus on this map.
     */
    Set<MatchDetailsBonus> getBonuses();
}

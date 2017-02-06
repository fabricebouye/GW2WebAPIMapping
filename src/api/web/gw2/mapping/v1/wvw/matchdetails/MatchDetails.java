/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.wvw.matchdetails;

import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v1.APIv1;
import java.util.Set;

/**
 * Define all WvW match details.
 * @author Fabrice Bouyé
 */
@APIv1(endpoint = "v1/wvw/match_details.json") // NOI18N.
public interface MatchDetails {

    /**
     * Gets the id of this match details.
     * @return A {@code String} instance, never {@code null}.
     */
    String getMatchId();

    /**
     * Gets the global score of this match details.
     * @return A {@code MatchDetailsScore} instance, never {@code null}.
     */
    MatchDetailsScore getScores();

    /**
     * Gets the set of maps in this match details.
     * @return A {@code Set<MatchDetailsMap>} instance, never {@code null}.
     */
    @SetValue
    Set<MatchDetailsMap> getMaps();
}

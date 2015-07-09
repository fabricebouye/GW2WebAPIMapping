/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.wvw.matchdetails;

import java.util.Collections;
import java.util.Set;

/**
 * Default implementation of a WvW match detail.
 * @author Fabrice Bouyé
 */
final class DefaultMatchDetails implements MatchDetails {

    String matchId = "";
    MatchDetailsScore scores = MatchDetailsScore.EMPTY;
    Set<MatchDetailsMap> maps = Collections.EMPTY_SET;

    /**
     * Creates a new empty instance.
     */
    DefaultMatchDetails() {
    }

    @Override
    public String getMatchId() {
        return matchId;
    }

    @Override
    public MatchDetailsScore getScores() {
        return scores;
    }

    @Override
    public Set<MatchDetailsMap> getMaps() {
        return maps;
    }
}

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
 * Default implementation of a WvW match map.
 * @author Fabrice Bouyé
 */
final class DefaultMatchDetailsMap implements MatchDetailsMap {

    MatchDetailsMapType type = MatchDetailsMapType.UNKNOWN;
    MatchDetailsScore scores = MatchDetailsScore.EMPTY;
    Set<MatchDetailsObjective> objectives = Collections.EMPTY_SET;
    Set<MatchDetailsBonus> bonuses = Collections.EMPTY_SET;

    /**
     * Creates a new empty instance.
     */
    DefaultMatchDetailsMap() {
    }

    @Override
    public MatchDetailsMapType getType() {
        return type;
    }

    @Override
    public MatchDetailsScore getScores() {
        return scores;
    }

    @Override
    public Set<MatchDetailsObjective> getObjectives() {
        return objectives;
    }

    @Override
    public Set<MatchDetailsBonus> getBonuses() {
        return bonuses;
    }
}

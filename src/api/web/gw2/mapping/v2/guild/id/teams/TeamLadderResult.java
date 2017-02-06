/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.id.teams;

import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a guild team's ladder results.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/guid/:id/teams", requiresAuthentication = true, scope = "guilds") // NOI18N.
public interface TeamLadderResult {

    /**
     * The singleton empty instance.
     */
    public static final TeamLadderResult EMPTY = new TeamLadderResult() {
        @Override
        public int getWins() {
            return 0;
        }

        @Override
        public int getLosses() {
            return 0;
        }

        @Override
        public int getDesertions() {
            return 0;
        }

        @Override
        public int getByes() {
            return 0;
        }

        @Override
        public int getForfeits() {
            return 0;
        }
    };

    /**
     * Gets the number of wins.
     * @return An {@code int} &ge; 0
     */
    @QuantityValue
    int getWins();

    /**
     * Gets the number of losses.
     * @return An {@code int} &ge; 0
     */
    @QuantityValue
    int getLosses();

    /**
     * Gets the number of desertions.
     * @return An {@code int} &ge; 0
     */
    @QuantityValue
    int getDesertions();

    /**
     * Gets the number of byes.
     * @return An {@code int} &ge; 0
     */
    @QuantityValue
    int getByes();

    /**
     * Gets the number of forfeits.
     * @return An {@code int} &ge; 0
     */
    @QuantityValue
    int getForfeits();
}

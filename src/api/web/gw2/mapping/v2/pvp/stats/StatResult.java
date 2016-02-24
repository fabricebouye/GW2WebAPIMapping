/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.stats;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a win/loss object.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp/stats", requiresAuthentication = true, scope = "pvp") // NOI18N.
public interface StatResult {

    /**
     * The empty stats result singleton.
     */
    @ImplementationSpecific
    public static final StatResult EMPTY = new StatResult() {

        /**
         * {@inheritDoc}
         * @return Always 0.
         */
        @Override
        public int getWins() {
            return 0;
        }

        /**
         * {@inheritDoc}
         * @return Always 0.
         */
        @Override
        public int getLosses() {
            return 0;
        }

        /**
         * {@inheritDoc}
         * @return Always 0.
         */
        @Override
        public int getDesertions() {
            return 0;
        }

        /**
         * {@inheritDoc}
         * @return Always 0.
         */
        @Override
        public int getByes() {
            return 0;
        }

        /**
         * {@inheritDoc}
         * @return Always 0.
         */
        @Override
        public int getForfeits() {
            return 0;
        }
    };

    /**
     * Gets the number of wins for the category.
     * @return An {@code int} &ge; 0.
     */
    @QuantityValue
    int getWins();

    /**
     * Gets the number of losses for the category.
     * @return An {@code int} &ge; 0.
     */
    @QuantityValue
    int getLosses();

    /**
     * Gets the number of desertions for the category.
     * @return An {@code int} &ge; 0.
     */
    @QuantityValue
    int getDesertions();

    /**
     * Gets the number of byes for the category.
     * @return An {@code int} &ge; 0.
     */
    @QuantityValue
    int getByes();

    /**
     * Gets the number of forfeits for the category.
     * @return An {@code int} &ge; 0.
     */
    @QuantityValue
    int getForfeits();
}

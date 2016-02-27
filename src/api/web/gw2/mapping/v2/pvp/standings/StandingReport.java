/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.standings;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a PvP standing report.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp/games", requiresAuthentication = true, scope = "pvp") // NOI18N.
public interface StandingReport {
    /**
     * @todo Document when wiki article is available.
     */
    @QuantityValue
    int getTotalPoints();

    /**
     * @todo Document when wiki article is available.
     */
    @IdValue
    int getDivision();

    /**
     * @todo Document when wiki article is available.
     */
    @IdValue
    int getTier();

    /**
     * @todo Document when wiki article is available.
     */
    @QuantityValue
    int getPoints();

    /**
     * @todo Document when wiki article is available.
     */
    @QuantityValue
    int getRepeats();
}

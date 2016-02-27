/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.seasons;

import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a PvP league season division tier.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp/seasons", requiresAuthentication = true, scope = "pvp") // NOI18N.
public interface SeasonTier {

    /**
     * Gets the number of points in this tier.
     * @return An {@code int} &ge; 0.
     */
    @QuantityValue
    int getPoints();
}

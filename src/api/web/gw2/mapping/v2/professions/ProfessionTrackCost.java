/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.professions;

import api.web.gw2.mapping.core.QuantityValue;

/**
 * Base interface for a track cost.
 * @author Fabrice Bouyé
 */
public interface ProfessionTrackCost {

    /**
     * Gets the cost.
     * @return An {@code int} &ge; 0.
     */
    @QuantityValue
    int getCost();

    /**
     * Gets the type of this cost.
     * @return A {@code ProfessionTrackCostType} instance, never {@code null}.
     */
    ProfessionTrackCostType getType();
}

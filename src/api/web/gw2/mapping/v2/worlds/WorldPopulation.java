/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.worlds;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines population of a world.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/worlds")
public enum WorldPopulation {
    /**
     * Defines the low world population.
     */
    LOW("Low"), // NOI18N.
    /**
     * Defines the medium world population.
     */
    MEDIUM("Medium"), // NOI18N.
    /**
     * Defines the high world population.
     */
    HIGH("High"), // NOI18N.
    /**
     * Defines the very high world population.
     */
    VERY_HIGH("VeryHigh"), // NOI18N.
    /**
     * Defines the full world population.
     */
    FULL("Full"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private WorldPopulation(String value) {
        this.value = value;
    }
}

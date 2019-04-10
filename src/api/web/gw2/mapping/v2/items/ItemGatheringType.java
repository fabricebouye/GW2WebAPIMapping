/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all gathering tool types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public enum ItemGatheringType {

    /**
     * Defines the foraging gathering type (ie: harvesting sickle).
     */
    FORAGING("Foraging"), // NOI18N.
    /**
     * Defines the logging gathering type (ie: logging axe).
     */
    LOGGING("Logging"), // NOI18N.
    /**
     * Defines the mining gathering type (ie: mining pick).
     */
    MINING("Mining"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private ItemGatheringType(final String value) {
        this.value = value;
    }
}

/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all trinket types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public enum ItemTrinketType {

    /**
     * Defines the accessory trinket type.
     */
    ACCESSORY("Accessory"), // NOI18N.
    /**
     * Defines the amulet trinket type.
     */
    AMULET("Amulet"), // NOI18N.
    /**
     * Defines the ring trinket type.
     */
    RING("Ring"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private ItemTrinketType(final String value) {
        this.value = value;
    }
}

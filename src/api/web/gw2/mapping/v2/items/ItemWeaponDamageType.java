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
 * Defines all damage types for items.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public enum ItemWeaponDamageType {

    /**
     * Defines the fire damage type.
     */
    FIRE("Fire"), // NOI18N.
    /**
     * Defines the ice damage type.
     */
    ICE("Ice"), // NOI18N.
    /**
     * Defines the lightning damage type.
     */
    LIGHTNING("Lightning"), // NOI18N.
    /**
     * Defines the physical damage type.
     */
    PHYSICAL("Physical"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private ItemWeaponDamageType(final String value) {
        this.value = value;
    }
}

/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all item armor weight classes.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public enum ItemArmorWeightClass {

    /**
     * Defines the heavy weight class.
     */
    HEAVY("Heavy"),
    /**
     * Defines the medium weight class.
     */
    MEDIUM("Medium"),
    /**
     * Defines the light weight class.
     */
    LIGHT("Light"),
    /**
     * Defines the clothing weight class.
     */
    CLOTHING("Clothing"),
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);
    final String value;

    private ItemArmorWeightClass(final String value) {
        this.value = value;
    }
}

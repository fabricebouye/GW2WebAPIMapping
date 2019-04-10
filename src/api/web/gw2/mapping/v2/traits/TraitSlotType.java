/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.traits;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines the type of slot of a trait.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/traits")
public enum TraitSlotType {

    /**
     * Defines the minor slot.
     */
    MINOR("Minor"), // NOI18N.
    /**
     * Defines the major slot
     */
    MAJOR("Major"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private TraitSlotType(String value) {
        this.value = value;
    }
}

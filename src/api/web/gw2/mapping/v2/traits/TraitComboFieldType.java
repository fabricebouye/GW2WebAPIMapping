/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.traits;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all combo field types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/traits")
public enum TraitComboFieldType {

    /**
     * Defines the air combo field type.
     */
    AIR("Air"), // NOI18N.
    /**
     * Defines the dark combo field type.
     */
    DARK("Dark"), // NOI18N.
    /**
     * Defines the ethereal combo field type.
     */
    ETHEREAL("Ethereal"), // NOI18N.
    /**
     * Defines the fire combo field type.
     */
    FIRE("Fire"), // NOI18N.
    /**
     * Defines the ice combo field type.
     */
    ICE("Ice"), // NOI18N.
    /**
     * Defines the light combo field type.
     */
    LIGHT("Light"), // NOI18N.
    /**
     * Defines the lightning combo field type.
     */
    LIGHTNING("Lightning"), // NOI18N.
    /**
     * Defines the poison combo field type.
     */
    POISON("Poison"), // NOI18N.
    /**
     * Defines the smoke combo field type.
     */
    SMOKE("Smoke"), // NOI18N.
    /**
     * Defines the water combo field type.
     */
    WATER("Water"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private TraitComboFieldType(String value) {
        this.value = value;
    }
}

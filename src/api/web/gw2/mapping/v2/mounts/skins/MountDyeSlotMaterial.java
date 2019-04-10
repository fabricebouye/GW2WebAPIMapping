/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.mounts.skins;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines mount dye slot material.
 *
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/mounts/skins") // NOI18N.
public enum MountDyeSlotMaterial {
    /**
     * Defines material: cloth.
     */
    CLOTH("cloth"), // NOI18N.
    /**
     * Defines material: fur.
     */
    FUR("fur"), // NOI18N.
    /**
     * Defines material: leather.
     */
    LEATHER("leather"), // NOI18N.
    /**
     * Defines material: metal.
     */
    METAL("metal"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    MountDyeSlotMaterial(final String value) {
        this.value = value;
    }
}

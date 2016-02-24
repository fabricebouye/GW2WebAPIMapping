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
 * Defines all item armor types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public enum ItemArmorType {

    /**
     * Defines the boots armor type.
     */
    BOOTS("Boots"), // NOI18N.
    /**
     * Defines the coat (breast plate) armor type.
     */
    COAT("Coat"), // NOI18N.
    /**
     * Defines the gloves armor type.
     */
    GLOVES("Gloves"), // NOI18N.
    /**
     * Defines the helm armor type.
     */
    HELM("Helm"), // NOI18N.
    /**
     * Defines the underwater breather armor type.
     */
    HELM_AQUATIC("HelmAquatic"), // NOI18N.
    /**
     * Defines the leggings armor type.
     */
    LEGGINGS("Leggings"), // NOI18N.
    /**
     * Defines the shoulders armor type.
     */
    SHOULDERS("Shoulders"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private ItemArmorType(final String value) {
        this.value = value;
    }
}

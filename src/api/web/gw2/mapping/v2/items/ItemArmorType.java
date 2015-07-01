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
 * Defines all item armor types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public enum ItemArmorType {

    /**
     * Defines the boots armor type.
     */
    BOOTS("Boots"),
    /**
     * Defines the coat (breast plate) armor type.
     */
    COAT("Coat"),
    /**
     * Defines the gloves armor type.
     */
    GLOVES("Gloves"),
    /**
     * Defines the helm armor type.
     */
    HELM("Helm"),
    /**
     * Defines the underwater breather armor type.
     */
    HELM_AQUATIC("HelmAquatic"),
    /**
     * Defines the leggings armor type.
     */
    LEGGINGS("Leggings"),
    /**
     * Defines the shoulders armor type.
     */
    SHOULDERS("Shoulders"),
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

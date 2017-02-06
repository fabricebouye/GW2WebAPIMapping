/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skins;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all armor types for skins.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/skins") // NOI18N.
public enum SkinArmorType {

    /**
     * Defines the underwater breather.
     */
    HELM_AQUATIC("HelmAquatic"), // NOI18N.
    /**
     * Defines the back item.
     */
    BACKPACK("Backpack"), // NOI18N.
    /**
     * Defines the coat (breast plate).
     */
    COAT("Coat"), // NOI18N.
    /**
     * Defines the boots.
     */
    BOOTS("Boots"), // NOI18N.
    /**
     * Defines the gloves.
     */
    GLOVES("Gloves"), // NOI18N.
    /**
     * Defines the helm.
     */
    HELM("Helm"), // NOI18N.
    /**
     * Defines the leggings.
     */
    LEGGINGS("Leggings"), // NOI18N.
    /**
     * Defines the shoulders.
     */
    SHOULDERS("Shoulders"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private SkinArmorType(final String value) {
        this.value = value;
    }
}

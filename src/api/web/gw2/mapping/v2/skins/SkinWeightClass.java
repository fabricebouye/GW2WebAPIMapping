/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skins;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all armor weights for skins.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/skins") // NOI18N.
public enum SkinWeightClass {

    /**
     * Defines the heavy armor weight.
     */
    HEAVY("Heavy"),
    /**
     * Defines the light armor weight.
     */
    LIGHT("Light"),
    /**
     * Defines the medium armor weight.
     */
    MEDIUM("Medium"),
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private SkinWeightClass(final String value) {
        this.value = value;
    }
}

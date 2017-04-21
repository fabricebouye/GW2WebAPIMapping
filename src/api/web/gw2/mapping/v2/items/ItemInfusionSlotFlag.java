/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all item infusion slot flags.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public enum ItemInfusionSlotFlag {

    /**
     * Defines the defense slot flag.
     * @deprecated 
     */
    @Deprecated
    DEFENSE("Defense"), // NOI18N.
    /**
     * Defines the offense slot flag.
     * @deprecated 
     */
    @Deprecated
    OFFENSE("Offense"), // NOI18N.
    /**
     * Defines the influsion slot flag.
     */
    INFUSION("Infusion"), // NOI18N.
    /**
     * Defines the utility slot flag.
     * @deprecated 
     */
    @Deprecated
    UTILITY("Utility"), // NOI18N.
    /**
     * Defines the agony resistance flag.
     * @deprecated 
     */
    @Deprecated
    AGONY("Agony"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private ItemInfusionSlotFlag(final String value) {
        this.value = value;
    }
}

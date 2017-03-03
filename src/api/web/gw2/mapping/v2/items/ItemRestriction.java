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
 * Defines restrictions set on an item.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public enum ItemRestriction {

    /**
     * Defines the asura restriction.
     */
    ASURA("Asura"), // NOI18N.
    /**
     * Defines the charr restriction.
     */
    CHARR("Charr"), // NOI18N.
    /**
     * Defines the human restriction.
     */
    HUMAN("Human"), // NOI18N.
    /**
     * Defines the norn restriction.
     */
    NORN("Norn"), // NOI18N.
    /**
     * Defines the sylvari restriction.
     */
    SYLVARI("Sylvari"), // NOI18N.
    /**
     * Defines the guardian restriction.
     */
    GUARDIAN("Guardian"), // NOI18N.
    /**
     * Defines the mesmer restriction.
     */
    MESMER("Mesmer"), // NOI18N.
    /**
     * Defines the ranger restriction.
     */
    RANGER("Ranger"), // NOI18N.
    /**
     * Defines the warrior restriction.
     */
    WARRIOR("Warrior"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private ItemRestriction(final String value) {
        this.value = value;
    }
}

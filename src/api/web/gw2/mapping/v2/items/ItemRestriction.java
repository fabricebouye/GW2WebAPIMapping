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
 * Defines restrictions set on an item.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public enum ItemRestriction {

    /**
     * Defines the asura restriction.
     */
    ASURA("Asura"),
    /**
     * Defines the charr restriction.
     */
    CHARR("Charr"),
    /**
     * Defines the human restriction.
     */
    HUMAN("Human"),
    /**
     * Defines the norn restriction.
     */
    NORN("Norn"),
    /**
     * Defines the sylvari restriction.
     */
    SYLVARI("Sylvari"),
    /**
     * Defines the guardian restriction.
     */
    GUARDIAN("Guardian"),
    /**
     * Defines the mesmer restriction.
     */
    MESMER("Mesmer"),
    /**
     * Defines the ranger restriction.
     */
    RANGER("Ranger"),
    /**
     * Defines the warrior restriction.
     */
    WARRIOR("Warrior"),
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

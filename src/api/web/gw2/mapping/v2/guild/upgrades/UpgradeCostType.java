/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.guild.upgrades;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines guild upgrade costs types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/guild/upgrades") // NOI18N.
public enum UpgradeCostType {
    /**
     * Defines the item upgrade cost type.
     */
    ITEM("Item"),
    /**
     * Defines the collectible upgrade cost type.
     */
    COLLECTIBLE("Collectible"),
    /**
     * Defines the currency upgrade cost type.
     */
    CURRENCY("Currency"),
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private UpgradeCostType(String value) {
        this.value = value;
    }
}

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
 * Defines the rarity of an item.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public enum ItemRarity {

    /**
     * Defines the junk rarity.
     */
    JUNK("Junk"),
    /**
     * Defines the basic rarity.
     */
    BASIC("Basic"),
    /**
     * Defines the fine rarity.
     */
    FINE("Fine"),
    /**
     * Defines the masterwork rarity.
     */
    MASTERWORK("Masterwork"),
    /**
     * Defines the rare rarity.
     */
    RARE("Rare"),
    /**
     * Defines the exotic rarity.
     */
    EXOTIC("Exotic"),
    /**
     * Defines the ascended rarity.
     */
    ASCENDED("Ascended"),
    /**
     * Defines the legendary rarity.
     */
    LEGENDARY("Legendary"),
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    final String value;

    private ItemRarity(final String value) {
        this.value = value;
    }
}

/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
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
    JUNK("Junk"), // NOI18N.
    /**
     * Defines the basic rarity.
     */
    BASIC("Basic"), // NOI18N.
    /**
     * Defines the fine rarity.
     */
    FINE("Fine"), // NOI18N.
    /**
     * Defines the masterwork rarity.
     */
    MASTERWORK("Masterwork"), // NOI18N.
    /**
     * Defines the rare rarity.
     */
    RARE("Rare"), // NOI18N.
    /**
     * Defines the exotic rarity.
     */
    EXOTIC("Exotic"), // NOI18N.
    /**
     * Defines the ascended rarity.
     */
    ASCENDED("Ascended"), // NOI18N.
    /**
     * Defines the legendary rarity.
     */
    LEGENDARY("Legendary"), // NOI18N.
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

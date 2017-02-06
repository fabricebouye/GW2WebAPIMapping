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
 * Defines all consumable unlock types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public enum ItemConsumableUnlockType {

    /**
     * Defines the bag slot consumable unlock type (ie: Bag Slot Expansion).
     */
    BAG_SLOT("BagSlot"), // NOI18N.
    /**
     * Defines the bank tab consumable unlock type (ie: Bank Tab Expansion).
     */
    BANK_TAB("BankTab"), // NOI18N.
    /**
     * Defines the collectible capacity consumable unlock type (ie: Storage Expander).
     */
    COLLECTIBLE_CAPACITY("CollectibleCapacity"), // NOI18N.
    /**
     * Defines the content consumable unlock type (ie: Finisher, Collection, Commander's Compendium).
     */
    CONTENT("Content"), // NOI18N.
    /**
     * Defines the crafting recipe consumable unlock type.
     */
    CRAFTING_RECIPE("CraftingRecipe"), // NOI18N.
    /**
     * Defines the dye consumable unlock type.
     */
    DYE("Dye"), // NOI18N.
    /**
     * Defines the outfit consumable unlock type.
     */
    @ImplementationSpecific
    OUTFIT("Unknown"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private ItemConsumableUnlockType(final String value) {
        this.value = value;
    }
}

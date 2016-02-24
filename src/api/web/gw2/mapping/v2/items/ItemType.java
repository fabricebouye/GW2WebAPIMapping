/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all item types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public enum ItemType {

    /**
     * Defines the armor type.
     */
    ARMOR("Armor"), // NOI18N.
    /**
     * Defines the backpiece type.
     */
    BACK("Back"), // NOI18N.
    /**
     * Defines the bag type.
     */
    BAG("Bag"), // NOI18N.
    /**
     * Defines the consumable type.
     */
    CONSUMABLE("Consumable"), // NOI18N.
    /**
     * Defines the container type.
     */
    CONTAINER("Container"), // NOI18N.
    /**
     * Defines the crafting material type.
     */
    CRAFTING_MATERIAL("CraftingMaterial"), // NOI18N.
    /**
     * Defines the gathering tool type.
     */
    GATHERING("Gathering"), // NOI18N.
    /**
     * Defines the gizmo type.
     */
    GIZMO("Gizmo"), // NOI18N.
    /**
     * Defines the mini pet type.
     */
    MINI_PET("MiniPet"), // NOI18N.
    /**
     * Defines the tool type.
     */
    TOOL("Tool"), // NOI18N.
    /**
     * Defines the trait type.
     */
    TRAIT("Trait"), // NOI18N.
    /**
     * Defines the trinket type.
     */
    TRINKET("Trinket"), // NOI18N.
    /**
     * Defines the trophy type.
     */
    TROPHY("Trophy"), // NOI18N.
    /**
     * Defines the upgrade component type.
     */
    UPGRADE_COMPONENT("UpgradeComponent"), // NOI18N.
    /**
     * Defines the weapon type.
     */
    WEAPON("Weapon"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private ItemType(final String value) {
        this.value = value;
    }
}

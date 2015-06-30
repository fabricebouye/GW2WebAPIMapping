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
 * Defines all item types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public enum ItemType {

    /**
     * Defines the armor type.
     */
    ARMOR("Armor"),
    /**
     * Defines the backpiece type.
     */
    BACK("Back"),
    /**
     * Defines the bag type.
     */
    BAG("Bag"),
    /**
     * Defines the consumable type.
     */
    CONSUMABLE("Consumable"),
    /**
     * Defines the container type.
     */
    CONTAINER("Container"),
    /**
     * Defines the crafting material type.
     */
    CRAFTING_MATERIAL("CraftingMaterial"),
    /**
     * Defines the gathering tool type.
     */
    GATHERING("Gathering"),
    /**
     * Defines the gizmo type.
     */
    GIZMO("Gizmo"),
    /**
     * Defines the mini pet type.
     */
    MINI_PET("MiniPet"),
    /**
     * Defines the tool type.
     */
    TOOL("Tool"),
    /**
     * Defines the trait type.
     */
    TRAIT("Trait"),
    /**
     * Defines the trinket type.
     */
    TRINKET("Trinket"),
    /**
     * Defines the trophy type.
     */
    TROPHY("Trophy"),
    /**
     * Defines the upgrade component type.
     */
    UPGRADE_COMPONENT("UpgradeComponent"),
    /**
     * Defines the weapon type.
     */
    WEAPON("Weapon"),
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

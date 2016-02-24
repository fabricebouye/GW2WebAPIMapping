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
 * Defines all consumable types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public enum ItemConsumableType {

    /**
     * Defines the appearance change consumable type (ie: Total Makeover Kits, Self-Style Hair Kits and Name Change Contracts).
     */
    APPEARANCE_CHANGE("AppearanceChange"), // NOI18N.
    /**
     * Defines the booze consumable type (ie: alcohol).
     */
    BOOZE("Booze"), // NOI18N.
    /**
     * Defines the contract NPC consumable type (ie: Golem Banker).
     */
    CONTRACT_NPC("ContractNpc"), // NOI18N.
    /**
     * Defines the food consumable type.
     */
    FOOD("Food"), // NOI18N.
    /**
     * Defines the generic consumable type.
     */
    GENERIC("Generic"), // NOI18N.
    /**
     * Defines the Halloween consumable type (ie: some boosters).
     */
    HALLOWEEN("Halloween"), // NOI18N.
    /**
     * Defines the immediate consumable type (ie: most boosters).
     */
    IMMEDIATE("Immediate"), // NOI18N.
    /**
     * Defines the consumable consumable type (ie: skins).
     */
    TRANSMUTATION("Transmutation"), // NOI18N.
    /**
     * Defines the unlock consumable type.
     */
    UNLOCK("Unlock"), // NOI18N.
    /**
     * Defines the upgrade removal consumable type (ie: Upgrade Extractor).
     */
    UPGRADE_REMOVAL("UpgradeRemoval"), // NOI18N.
    /**
     * Defines the utility consumable type (ie: potions).
     */
    UTILITY("Utility"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private ItemConsumableType(final String value) {
        this.value = value;
    }
}

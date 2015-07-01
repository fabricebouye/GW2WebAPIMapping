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
 * Defines all upgrade component flags.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public enum ItemUpgradeComponentFlag {

    /**
     * Defines the axe flag.
     */
    AXE("Axe"), // NOI18N.
    /**
     * Defines the long bow flag.
     */
    LONG_BOW("LongBow"), // NOI18N.
    /**
     * Defines the dagger flag.
     */
    DAGGER("Dagger"), // NOI18N.
    /**
     * Defines the focus flag.
     */
    FOCUS("Focus"), // NOI18N.
    /**
     * Defines the greatsword flag.
     */
    GREATSWORD("Greatsword"), // NOI18N.
    /**
     * Defines the hammer flag.
     */
    HAMMER("Hammer"), // NOI18N.
    /**
     * Defines the harpoon flag.
     */
    HARPOON("Harpoon"), // NOI18N.
    /**
     * Defines the mace flag.
     */
    MACE("Mace"), // NOI18N.
    /**
     * Defines the pistol flag.
     */
    PISTOL("Pistol"), // NOI18N.
    /**
     * Defines the rifle flag.
     */
    RIFLE("Rifle"), // NOI18N.
    /**
     * Defines the scepter flag.
     */
    SCEPTER("Scepter"), // NOI18N.
    /**
     * Defines the shield flag.
     */
    SHIELD("Shield"), // NOI18N.
    SHORT_BOW("ShortBow"), // NOI18N.
    /**
     * Defines the speargun flag.
     */
    SPEARGUN("Speargun"), // NOI18N.
    /**
     * Defines the staff flag.
     */
    STAFF("Staff"), // NOI18N.
    /**
     * Defines the sword flag.
     */
    SWORD("Sword"), // NOI18N.
    /**
     * Defines the torch flag.
     */
    TORCH("Torch"), // NOI18N.
    /**
     * Defines the trident flag.
     */
    TRIDENT("Trident"), // NOI18N.
    /**
     * Defines the warhorn flag.
     */
    WARHORN("Warhorn"), // NOI18N.
    /**
     * Defines the heavy armor flag.
     */
    HEAVY_ARMOR("HeavyArmor"), // NOI18N.
    /**
     * Defines the medium armor flag.
     */
    MEDIUM_ARMOR("MediumArmor"), // NOI18N.
    /**
     * Defines the light armor flag.
     */
    LIGHT_ARMOR("LightArmor"), // NOI18N.
    /**
     * Defines the trinket flag.
     */
    TRINKET("Trinket"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);
    final String value;

    private ItemUpgradeComponentFlag(final String value) {
        this.value = value;
    }
}

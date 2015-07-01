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

    AXE("Axe"), // NOI18N.
    LONG_BOW("LongBow"), // NOI18N.
    DAGGER("Dagger"), // NOI18N.
    FOCUS("Focus"), // NOI18N.
    GREATSWORD("Greatsword"), // NOI18N.
    HAMMER("Hammer"), // NOI18N.
    HARPOON("Harpoon"), // NOI18N.
    MACE("Mace"), // NOI18N.
    PISTOL("Pistol"), // NOI18N.
    RIFLE("Rifle"), // NOI18N.
    SCEPTER("Scepter"), // NOI18N.
    SHIELD("Shield"), // NOI18N.
    SHORT_BOW("ShortBox"), // NOI18N.
    SPEARGUN("Speargun"), // NOI18N.
    STAFF("Staff"), // NOI18N.
    SWORD("Sword"), // NOI18N.
    TORCH("Torch"), // NOI18N.
    TRIDENT("Trident"), // NOI18N.
    WARHORN("Warhorn"), // NOI18N.
    HEAVY_ARMOR("HeavyArmor"), // NOI18N.
    MEDIUM_ARMOR("MediumArmor"), // NOI18N.
    LIGHT_ARMOR("LightArmor"), // NOI18N.
    TRINKET("Trinket"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);
    final String value;

    ItemUpgradeComponentFlag(final String value) {
        this.value = value;
    }
}

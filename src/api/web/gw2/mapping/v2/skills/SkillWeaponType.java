/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skills;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all item weapon skill types.
 * @author Fabrice Bouyé
 * @see api.web.gw2.mapping.v2.professions.ProfessionWeaponType
 * @see api.web.gw2.mapping.v2.items.ItemWeaponType
 */
@APIv2(endpoint = "v2/skills") // NOI18N.
public enum SkillWeaponType {

    /**
     * Defines an axe weapon skill type.
     */
    AXE("Axe"), // NOI18N.
    /**
     * Defines an long bow weapon skill type.
     */
    LONG_BOW("LongBow"), // NOI18N.
    /**
     * Defines a dagger type.
     */
    DAGGER("Dagger"), // NOI18N.
    /**
     * Defines a focus weapon skill type.
     */
    FOCUS("Focus"), // NOI18N.
    /**
     * Defines a great sword weapon skill type.
     */
    GREATSWORD("Greatsword"), // NOI18N.
    /**
     * Defines a hammer weapon skill type.
     */
    HAMMER("Hammer"), // NOI18N.
    /**
     * Defines a harpoon weapon skill type.
     * @see api.web.gw2.mapping.v2.professions.ProfessionWeaponType#SPEAR
     */
    HARPOON("Harpoon"), // NOI18N.
    /**
     * Defines a mace weapon skill type.
     */
    MACE("Mace"), // NOI18N.
    /**
     * Defines a pistol weapon skill type.
     */
    PISTOL("Pistol"), // NOI18N.
    /**
     * Defines a rifle weapon skill type.
     */
    RIFLE("Rifle"), // NOI18N.
    /**
     * Defines a scepter weapon skill type.
     */
    SCEPTER("Scepter"), // NOI18N.
    /**
     * Defines a shield weapon skill type.
     */
    SHIELD("Shield"), // NOI18N.
    /**
     * Defines short bow weapon skill type.
     */
    SHORT_BOW("ShortBow"), // NOI18N.
    /**
     * Defines an speargun weapon skill type.
     */
    SPEARGUN("Speargun"), // NOI18N.
    /**
     * Defines a staff weapon skill type.
     */
    STAFF("Staff"), // NOI18N.
    /**
     * Defines an sword weapon skill type.
     */
    SWORD("Sword"), // NOI18N.
    /**
     * Defines a torch weapon skill type.
     */
    TORCH("Torch"), // NOI18N.
    /**
     * Defines a trident weapon skill type.
     */
    TRIDENT("Trident"), // NOI18N.
    /**
     * Defines a warhorn weapon skill type.
     */
    WARHORN("Warhorn"), // NOI18N.
    /**
     * Defines the none weapon skill type.
     */
    NONE("None"),
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private SkillWeaponType(final String value) {
        this.value = value;
    }
}

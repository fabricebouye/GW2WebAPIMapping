/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.web.gw2.mapping.v2.professions;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all weapon types used by profession weapons skills.
 * @author Fabrice Bouyé
 * @see api.web.gw2.mapping.v2.items.ItemWeaponType
 * @see api.web.gw2.mapping.v2.skills.SkillWeaponType
 */
@APIv2(endpoint = "v2/professions") // NOI18N.
public enum ProfessionWeaponType {

    /**
     * Defines an axe weapon type.
     */
    AXE("Axe"), // NOI18N.
    /**
     * Defines an long bow weapon type.
     */
    LONG_BOW("LongBow"), // NOI18N.
    /**
     * Defines a dagger type.
     */
    DAGGER("Dagger"), // NOI18N.
    /**
     * Defines a focus weapon type.
     */
    FOCUS("Focus"), // NOI18N.
    /**
     * Defines a great sword weapon type.
     */
    GREATSWORD("Greatsword"), // NOI18N.
    /**
     * Defines a hammer weapon type.
     */
    HAMMER("Hammer"), // NOI18N.
    /**
     * Defines a mace weapon type.
     */
    MACE("Mace"), // NOI18N.
    /**
     * Defines the nothing weapon type (used by thief skill #3 when no offhand weapon equipped).
     */
    NOTHING("Nothing"), // NOI18N.
    /**
     * Defines a pistol weapon type.
     */
    PISTOL("Pistol"), // NOI18N.
    /**
     * Defines a rifle weapon type.
     */
    RIFLE("Rifle"), // NOI18N.
    /**
     * Defines a scepter weapon type.
     */
    SCEPTER("Scepter"), // NOI18N.
    /**
     * Defines a shield weapon type.
     */
    SHIELD("Shield"), // NOI18N.
    /**
     * Defines short bow weapon type.
     */
    SHORT_BOW("ShortBow"), // NOI18N.
    /**
     * Defines a spear weapon type.
     * @see api.web.gw2.mapping.v2.items.ItemWeaponType#HARPOON
     */
    SPEAR("Spear"), // NOI18N.
    /**
     * Defines an speargun weapon type.
     */
    SPEARGUN("Speargun"), // NOI18N.
    /**
     * Defines a staff weapon type.
     */
    STAFF("Staff"), // NOI18N.
    /**
     * Defines an sword weapon type.
     */
    SWORD("Sword"), // NOI18N.
    /**
     * Defines a torch weapon type.
     */
    TORCH("Torch"), // NOI18N.
    /**
     * Defines a trident weapon type.
     */
    TRIDENT("Trident"), // NOI18N.
    /**
     * Defines a warhorn weapon type.
     */
    WARHORN("Warhorn"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private ProfessionWeaponType(final String value) {
        this.value = value;
    }
}

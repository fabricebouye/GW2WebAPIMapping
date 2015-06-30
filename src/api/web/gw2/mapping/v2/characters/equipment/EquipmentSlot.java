/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.equipment;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines the equipment slots of a character.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters/<name>/equipment", requiresAuthentication = true) // NOI18N.
public enum EquipmentSlot {

    /**
     * Defines the underwater breather.
     */
    HELM_AQUATIC("HelmAquatic"), // NOI18N.
    /**
     * Defines the back item.
     */
    BACKPACK("Backpack"), // NOI18N.
    /**
     * Defines the coat (breast plate).
     */
    COAT("Coat"), // NOI18N.
    /**
     * Defines the boots.
     */
    BOOTS("Boots"), // NOI18N.
    /**
     * Defines the gloves.
     */
    GLOVES("Gloves"), // NOI18N.
    /**
     * Defines the helm.
     */
    HELM("Helm"), // NOI18N.
    /**
     * Defines the leggings.
     */
    LEGGINGS("Leggings"), // NOI18N.
    /**
     * Defines the shoulders.
     */
    SHOULDERS("Shoulders"), // NOI18N.
    /**
     * Defines accessory #1.
     */
    ACCESSORY_1("Accessory1"), // NOI18N.
    /**
     * Defines accessory #2.
     */
    ACCESSORY_2("Accessory2"), // NOI18N.
    /**
     * Defines ring #1.
     */
    RING_1("Ring1"), // NOI18N.
    /**
     * Defines ring #2.
     */
    RING_2("Ring2"), // NOI18N.
    /**
     * Defines the amulet.
     */
    AMULET("Amulet"), // NOI18N.
    /**
     * Defines underwater weapon #1.
     */
    WEAPON_AQUATIC_A("WeaponAquaticA"), // NOI18N.
    /**
     * Defines underwater weapon #2.
     */
    WEAPON_AQUATIC_B("WeaponAquaticB"), // NOI18N.
    /**
     * Defines surface weapon #1 (right hand).
     */
    WEAPON_A1("WeaponA1"), // NOI18N.
    /**
     * Defines surface weapon #1 (left hand).
     */
    WEAPON_A2("WeaponA2"), // NOI18N.
    /**
     * Defines surface weapon #2 (right hand).
     */
    WEAPON_B1("WeaponB1"), // NOI18N.
    /**
     * Defines surface weapon #2 (left hand).
     */
    WEAPON_B2("WeaponB2"), // NOI18N.
    /**
     * Defines gathering sickle.
     */
    SICKLE("Sickle"), // NOI18N.
    /**
     * Defines gathering axe.
     */
    AXE("Axe"), // NOI18N.
    /**
     * Defines gathering pick.
     */
    PICK("Pick"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private EquipmentSlot(final String value) {
        this.value = value;
    }
}

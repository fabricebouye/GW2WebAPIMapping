/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.equipment;

import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines the equipment slots of a character.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters/<name>/equipment", requiresAuthentication = true) // NOI18N.
public enum EquipmentSlot {

    HELM_AQUATIC("HelmAquatic"), // NOI18N.
    BACKPACK("Backpack"), // NOI18N.
    COAT("Coat"), // NOI18N.
    BOOTS("Boots"), // NOI18N.
    GLOVES("Gloves"), // NOI18N.
    HELM("Helm"), // NOI18N.
    LEGGINS("Leggings"), // NOI18N.
    SHOULDERS("Shoulders"), // NOI18N.
    ACCESSORY_1("Accessory1"), // NOI18N.
    ACCESSORY_2("Accessory2"), // NOI18N.
    RING_1("Ring1"), // NOI18N.
    RING_2("Ring2"), // NOI18N.
    AMULET("Amulet"), // NOI18N.
    WEAPON_AQUATIC_A("WeaponAquaticA"), // NOI18N.
    WEAPON_AQUATIC_B("WeaponAquaticB"), // NOI18N.
    WEAPON_A1("WeaponA1"), // NOI18N.
    WEAPON_A2("WeaponA2"), // NOI18N.
    WEAPON_B1("WeaponB1"), // NOI18N.
    WEAPON_B2("WeaponB2"), // NOI18N.
    SICKLE("Sickle"), // NOI18N.
    AXE("Axe"), // NOI18N.
    PICK("Pick"), // NOI18N.
    UNKNOWN(null);

    final String value;

    private EquipmentSlot(final String value) {
        this.value = value;
    }
}

/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.id.equipment;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines the equipment slots of a character.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters/:id/equipment", requiresAuthentication = true, scope = {"inventories", "builds"}) // NOI18N.
public enum CharacterEquipmentSlot {

    /**
     * Defines the underwater breather equipment slot.
     */
    HELM_AQUATIC("HelmAquatic"), // NOI18N.
    /**
     * Defines the back item equipment slot.
     */
    BACKPACK("Backpack"), // NOI18N.
    /**
     * Defines the coat (breast plate) equipment slot.
     */
    COAT("Coat"), // NOI18N.
    /**
     * Defines the boots equipment slot.
     */
    BOOTS("Boots"), // NOI18N.
    /**
     * Defines the gloves equipment slot.
     */
    GLOVES("Gloves"), // NOI18N.
    /**
     * Defines the helm equipment slot.
     */
    HELM("Helm"), // NOI18N.
    /**
     * Defines the leggings equipment slot.
     */
    LEGGINGS("Leggings"), // NOI18N.
    /**
     * Defines the shoulders equipment slot.
     */
    SHOULDERS("Shoulders"), // NOI18N.
    /**
     * Defines accessory #1 equipment slot.
     */
    ACCESSORY_1("Accessory1"), // NOI18N.
    /**
     * Defines accessory #2 equipment slot.
     */
    ACCESSORY_2("Accessory2"), // NOI18N.
    /**
     * Defines ring #1 equipment slot.
     */
    RING_1("Ring1"), // NOI18N.
    /**
     * Defines ring #2 equipment slot.
     */
    RING_2("Ring2"), // NOI18N.
    /**
     * Defines the amulet equipment slot.
     */
    AMULET("Amulet"), // NOI18N.
    /**
     * Defines underwater weapon #1 equipment slot.
     */
    WEAPON_AQUATIC_A("WeaponAquaticA"), // NOI18N.
    /**
     * Defines underwater weapon #2 equipment slot.
     */
    WEAPON_AQUATIC_B("WeaponAquaticB"), // NOI18N.
    /**
     * Defines surface weapon #1 (right hand) equipment slot.
     */
    WEAPON_A1("WeaponA1"), // NOI18N.
    /**
     * Defines surface weapon #1 (left hand) equipment slot.
     */
    WEAPON_A2("WeaponA2"), // NOI18N.
    /**
     * Defines surface weapon #2 (right hand) equipment slot.
     */
    WEAPON_B1("WeaponB1"), // NOI18N.
    /**
     * Defines surface weapon #2 (left hand) equipment slot.
     */
    WEAPON_B2("WeaponB2"), // NOI18N.
    /**
     * Defines gathering sickle equipment slot.
     */
    SICKLE("Sickle"), // NOI18N.
    /**
     * Defines gathering axe equipment slot.
     */
    AXE("Axe"), // NOI18N.
    /**
     * Defines gathering pick equipment slot.
     */
    PICK("Pick"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private CharacterEquipmentSlot(final String value) {
        this.value = value;
    }
}

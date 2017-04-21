/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.id.equipment;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines the equipment attribute of a character.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters/:id/equipment", requiresAuthentication = true, scope = {"inventories", "builds"}) // NOI18N.
public enum CharacterEquipmentAttribute {

    /**
     */
    BOON_DURATION("BoonDuration"), // NOI18N.
    /**
     * Defines the condition damage attribute.
     */
    CONDITION_DAMAGE("ConditionDamage"), // NOI18N.
    /**
     * Defines the condition duration attribute.
     */
    CONDITION_DURATION("ConditionDuration"), // NOI18N.
    /**
     * Defines the ferocity (critical damage) attribute.
     */
    CRIT_DAMAGE("CritDamage"), // NOI18N.
    /**
     * Defines the healing attribute.
     */
    HEALING("Healing"), // NOI18N.
    /**
     * Defines the power attribute.
     */
    POWER("Power"), // NOI18N.
    /**
     * Defines the precision attribute.
     */
    PRECISION("Precision"), // NOI18N.
    /**
     * Defines the toughness attribute.
     */
    TOUGHNESS("Toughness"), // NOI18N.
    /**
     * Defines the vitality attribute.
     */
    VITALITTY("Vitality"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private CharacterEquipmentAttribute(final String value) {
        this.value = value;
    }
}

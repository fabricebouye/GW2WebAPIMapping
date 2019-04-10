/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skills;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all skill slots.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/skills") // NOI18N.
public enum SkillSlot {

    /**
     * Defines the downed #1 slot
     */
    DOWNED_1("Downed_1"), // NOI18N.
    /**
     * Defines the downed #2 slot
     */
    DOWNED_2("Downed_2"), // NOI18N.
    /**
     * Defines the downed #3 slot
     */
    DOWNED_3("Downed_3"), // NOI18N.
    /**
     * Defines the downed #4 slot
     */
    DOWNED_4("Downed_4"), // NOI18N.
    /**
     * Defines the profession #1 slot
     */
    PROFESSION_1("Profession_1"), // NOI18N.
    /**
     * Defines the profession #2 slot
     */
    PROFESSION_2("Profession_2"), // NOI18N.
    /**
     * Defines the profession #3 slot
     */
    PROFESSION_3("Profession_3"), // NOI18N.
    /**
     * Defines the profession #4 slot
     */
    PROFESSION_4("Profession_4"), // NOI18N.
    /**
     * Defines the profession #5 slot
     */
    PROFESSION_5("Profession_5"), // NOI18N.
    /**
     * Defines the utility slot
     */
    UTILITY("Utility"), // NOI18N.
    /**
     * Defines the weapon #1 slot
     */
    WEAPON_1("Weapon_1"), // NOI18N.
    /**
     * Defines the weapon #2 slot
     */
    WEAPON_2("Weapon_2"), // NOI18N.
    /**
     * Defines the weapon #3 slot
     */
    WEAPON_3("Weapon_3"), // NOI18N.
    /**
     * Defines the weapon #4 slot
     */
    WEAPON_4("Weapon_4"), // NOI18N.
    /**
     * Defines the weapon #5 slot
     */
    WEAPON_5("Weapon_5"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private SkillSlot(final String value) {
        this.value = value;
    }
}

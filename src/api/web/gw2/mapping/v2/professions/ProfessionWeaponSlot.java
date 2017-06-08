/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.professions;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all weapon slots.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/professions") // NOI18N.
public enum ProfessionWeaponSlot {
    /**
     * Defines weapon slot #1.
     */
    WEAPON_1("Weapon_1"), // NOI18N.
    /**
     * Defines weapon slot #2.
     */
    WEAPON_2("Weapon_2"), // NOI18N.
    /**
     * Defines weapon slot #3.
     */
    WEAPON_3("Weapon_3"), // NOI18N.
    /**
     * Defines weapon slot #4.
     */
    WEAPON_4("Weapon_4"), // NOI18N.
    /**
     * Defines weapon slot #5.
     */
    WEAPON_5("Weapon_5"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    private final String value;

    private ProfessionWeaponSlot(final String value) {
        this.value = value;
    }
}
